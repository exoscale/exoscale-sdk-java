package com.exoscale.api;

import com.exoscale.invoker.ApiClient;

import com.exoscale.model.Event;
import java.time.OffsetDateTime;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T21:01:33.231699+01:00[Europe/Vienna]")
public class EventApi {
    private ApiClient apiClient;

    public EventApi() {
        this(new ApiClient());
    }

    @Autowired
    public EventApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List Events
     * Retrieve Mutation Events for a given date range. Defaults to retrieving Events for the past 24 hours.          Both a &#x60;from&#x60; and &#x60;to&#x60; arguments can be specified to filter Events over a specific period.          Events will be the the most descriptive possible but not all fields are mandatory
     * <p><b>200</b> - 200
     * @param from The from parameter
     * @param to The to parameter
     * @return List&lt;Event&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listEventsRequestCreation(OffsetDateTime from, OffsetDateTime to) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Event> localVarReturnType = new ParameterizedTypeReference<Event>() {};
        return apiClient.invokeAPI("/event", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List Events
     * Retrieve Mutation Events for a given date range. Defaults to retrieving Events for the past 24 hours.          Both a &#x60;from&#x60; and &#x60;to&#x60; arguments can be specified to filter Events over a specific period.          Events will be the the most descriptive possible but not all fields are mandatory
     * <p><b>200</b> - 200
     * @param from The from parameter
     * @param to The to parameter
     * @return List&lt;Event&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Event> listEvents(OffsetDateTime from, OffsetDateTime to) throws WebClientResponseException {
        ParameterizedTypeReference<Event> localVarReturnType = new ParameterizedTypeReference<Event>() {};
        return listEventsRequestCreation(from, to).bodyToFlux(localVarReturnType);
    }

    /**
     * List Events
     * Retrieve Mutation Events for a given date range. Defaults to retrieving Events for the past 24 hours.          Both a &#x60;from&#x60; and &#x60;to&#x60; arguments can be specified to filter Events over a specific period.          Events will be the the most descriptive possible but not all fields are mandatory
     * <p><b>200</b> - 200
     * @param from The from parameter
     * @param to The to parameter
     * @return ResponseEntity&lt;List&lt;Event&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Event>>> listEventsWithHttpInfo(OffsetDateTime from, OffsetDateTime to) throws WebClientResponseException {
        ParameterizedTypeReference<Event> localVarReturnType = new ParameterizedTypeReference<Event>() {};
        return listEventsRequestCreation(from, to).toEntityList(localVarReturnType);
    }

    /**
     * List Events
     * Retrieve Mutation Events for a given date range. Defaults to retrieving Events for the past 24 hours.          Both a &#x60;from&#x60; and &#x60;to&#x60; arguments can be specified to filter Events over a specific period.          Events will be the the most descriptive possible but not all fields are mandatory
     * <p><b>200</b> - 200
     * @param from The from parameter
     * @param to The to parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listEventsWithResponseSpec(OffsetDateTime from, OffsetDateTime to) throws WebClientResponseException {
        return listEventsRequestCreation(from, to);
    }
}
