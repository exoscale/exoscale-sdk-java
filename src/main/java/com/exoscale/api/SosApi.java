package com.exoscale.api;

import com.exoscale.invoker.ApiClient;

import com.exoscale.model.GetSosPresignedUrl200Response;
import com.exoscale.model.ListSosBucketsUsage200Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T16:37:05.548288+01:00[Europe/Vienna]")
public class SosApi {
    private ApiClient apiClient;

    public SosApi() {
        this(new ApiClient());
    }

    @Autowired
    public SosApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieve Presigned Download URL for SOS object
     * Generates Presigned Download URL for SOS object
     * <p><b>200</b> - 200
     * @param bucket The bucket parameter
     * @param key The key parameter
     * @return GetSosPresignedUrl200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getSosPresignedUrlRequestCreation(String bucket, String key) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'bucket' is set
        if (bucket == null) {
            throw new WebClientResponseException("Missing the required parameter 'bucket' when calling getSosPresignedUrl", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("bucket", bucket);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "key", key));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetSosPresignedUrl200Response> localVarReturnType = new ParameterizedTypeReference<GetSosPresignedUrl200Response>() {};
        return apiClient.invokeAPI("/sos/{bucket}/presigned-url", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve Presigned Download URL for SOS object
     * Generates Presigned Download URL for SOS object
     * <p><b>200</b> - 200
     * @param bucket The bucket parameter
     * @param key The key parameter
     * @return GetSosPresignedUrl200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetSosPresignedUrl200Response> getSosPresignedUrl(String bucket, String key) throws WebClientResponseException {
        ParameterizedTypeReference<GetSosPresignedUrl200Response> localVarReturnType = new ParameterizedTypeReference<GetSosPresignedUrl200Response>() {};
        return getSosPresignedUrlRequestCreation(bucket, key).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve Presigned Download URL for SOS object
     * Generates Presigned Download URL for SOS object
     * <p><b>200</b> - 200
     * @param bucket The bucket parameter
     * @param key The key parameter
     * @return ResponseEntity&lt;GetSosPresignedUrl200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetSosPresignedUrl200Response>> getSosPresignedUrlWithHttpInfo(String bucket, String key) throws WebClientResponseException {
        ParameterizedTypeReference<GetSosPresignedUrl200Response> localVarReturnType = new ParameterizedTypeReference<GetSosPresignedUrl200Response>() {};
        return getSosPresignedUrlRequestCreation(bucket, key).toEntity(localVarReturnType);
    }

    /**
     * Retrieve Presigned Download URL for SOS object
     * Generates Presigned Download URL for SOS object
     * <p><b>200</b> - 200
     * @param bucket The bucket parameter
     * @param key The key parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getSosPresignedUrlWithResponseSpec(String bucket, String key) throws WebClientResponseException {
        return getSosPresignedUrlRequestCreation(bucket, key);
    }
    /**
     * List SOS Buckets Usage
     * 
     * <p><b>200</b> - 200
     * @return ListSosBucketsUsage200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listSosBucketsUsageRequestCreation() throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ListSosBucketsUsage200Response> localVarReturnType = new ParameterizedTypeReference<ListSosBucketsUsage200Response>() {};
        return apiClient.invokeAPI("/sos-buckets-usage", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List SOS Buckets Usage
     * 
     * <p><b>200</b> - 200
     * @return ListSosBucketsUsage200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListSosBucketsUsage200Response> listSosBucketsUsage() throws WebClientResponseException {
        ParameterizedTypeReference<ListSosBucketsUsage200Response> localVarReturnType = new ParameterizedTypeReference<ListSosBucketsUsage200Response>() {};
        return listSosBucketsUsageRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * List SOS Buckets Usage
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;ListSosBucketsUsage200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListSosBucketsUsage200Response>> listSosBucketsUsageWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<ListSosBucketsUsage200Response> localVarReturnType = new ParameterizedTypeReference<ListSosBucketsUsage200Response>() {};
        return listSosBucketsUsageRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * List SOS Buckets Usage
     * 
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listSosBucketsUsageWithResponseSpec() throws WebClientResponseException {
        return listSosBucketsUsageRequestCreation();
    }
}
