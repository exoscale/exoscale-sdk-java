package com.exoscale.experiment;

import com.exoscale.experiment.exception.ExoscaleNetworkCommunicationException;
import com.exoscale.invoker.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Optional;


/**
 * Service class for communicating with Exoscale API.
 * This class handles network operations such as creating new Exoscale instances.
 */
@Service
public class ExoscaleNetworkCommunication {
    private static final Logger logger = LoggerFactory.getLogger(ExoscaleNetworkCommunication.class);
    public static final String POST = "POST";
    public static final String VERSION_2 = "v2";
    public static final String INSTANCE = "instance";
    public static final String ANTI_AFFINITY_GROUP  = "anti-affinity-group";
    public static final String AUTHORIZATION = "EXO2-HMAC-SHA256 credential=";

    public static final String EXPIRES = "expires";
    public static final String SIGNATURE = "signature";
    public static final String THREE_NEW_LINES = "\n\n\n";
    public static final String FORWARD_SLASH = "/";
    public static final String NEW_LINE = "\n";
    public static final String EQUAL = "=";
    public static final String COMMA = ",";
    public static final String SPACE = " ";
    private final String apiKey;
    private final String secretKey;

    @Autowired
    private final SignatureService signatureService;
    private final ApiClient apiClient;
    //@Autowired
    public ExoscaleNetworkCommunication(SignatureService signatureService,
                                        @Value("${exoscale.api.secretKey}") Optional<String> secretKeyOpt,
                                        @Value("${exoscale.api.ApiKey}") Optional<String> apiKeyOpt,
                                        @Value("${exoscale.api.baseUrl}") String baseUrl) {
        this.signatureService = signatureService;
        this.secretKey = secretKeyOpt.orElseThrow(() -> new IllegalArgumentException("Secret key not configured in application.properties"));
        this.apiKey = apiKeyOpt.orElseThrow(() -> new IllegalArgumentException("API key not configured in application.properties"));

        // added instead of using WebClient directly now we can use the ApiClient class
        WebClient customWebClient = ApiClient.buildWebClientBuilder()
                .baseUrl(baseUrl)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .build();

        // Uses the custom WebClient to create an ApiClient instance
        this.apiClient = new ApiClient(customWebClient);
    }
    /**
     * Creates a new Exoscale instance with the specified request body.
     *
     * @param requestBody The request body containing instance creation parameters.
     * @return The response object containing details of the created instance.
     * @throws ExoscaleNetworkCommunicationException if there is an error during the API call.
     */
    public InstanceResponse createNewInstance(String requestBody) {
        long unixTimestamp = System.currentTimeMillis() / 1000L;
        String concatenatedMessage = POST + SPACE + FORWARD_SLASH + VERSION_2 + FORWARD_SLASH + INSTANCE + NEW_LINE + requestBody + THREE_NEW_LINES + unixTimestamp;
        try {
            String signature = signatureService.generateSignature(secretKey, concatenatedMessage);
            Mono<InstanceResponse> response = this.apiClient.getWebClient().post()//baseWebClient.post()
                    .uri(FORWARD_SLASH + VERSION_2 + FORWARD_SLASH + INSTANCE)
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .header(HttpHeaders.AUTHORIZATION, AUTHORIZATION+apiKey + COMMA + EXPIRES + EQUAL + unixTimestamp + COMMA + SIGNATURE + EQUAL + signature)
                    .body(BodyInserters.fromValue(requestBody))
                    .retrieve()
                    .bodyToMono(InstanceResponse.class);
            return response.block();
        } catch (Exception e) {
            logger.error("Error creating new compute " + INSTANCE + ": ", e);
            throw new ExoscaleNetworkCommunicationException("Error creating new compute " + INSTANCE);
        }
    }

    public InstanceResponse createNewAntiAffinityGroup(String requestBody) {
        long unixTimestamp = System.currentTimeMillis() / 1000L;
        String concatenatedMessage = POST + SPACE + FORWARD_SLASH + VERSION_2 + FORWARD_SLASH + ANTI_AFFINITY_GROUP + NEW_LINE + requestBody + THREE_NEW_LINES + unixTimestamp;
        try {
            String signature = signatureService.generateSignature(secretKey, concatenatedMessage);
            Mono<InstanceResponse> response = this.apiClient.getWebClient().post() //this.baseWebClient.post()
                    .uri(FORWARD_SLASH + VERSION_2 + FORWARD_SLASH + ANTI_AFFINITY_GROUP)
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .header(HttpHeaders.AUTHORIZATION, AUTHORIZATION+apiKey + COMMA + EXPIRES + EQUAL + unixTimestamp + COMMA + SIGNATURE + EQUAL + signature)
                    .body(BodyInserters.fromValue(requestBody))
                    .retrieve()
                    .bodyToMono(InstanceResponse.class);
            return response.block();
        } catch (Exception e) {
            logger.error("Error creating new compute " + ANTI_AFFINITY_GROUP + ": ", e);
            throw new ExoscaleNetworkCommunicationException("Error creating new compute " + ANTI_AFFINITY_GROUP);
        }
    }
}
