package io.swagger.client.api;

import io.swagger.client.ApiClient;

import io.swagger.client.model.InlineResponse20026;
import io.swagger.client.model.InlineResponse20036;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-08T17:23:40.261901+01:00[Europe/Vienna]")
@Component("io.swagger.client.api.SosApi")
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
     * @param bucket  (required)
     * @param key  (optional)
     * @return InlineResponse20036
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20036 getSosPresignedUrl(String bucket, String key) throws RestClientException {
        return getSosPresignedUrlWithHttpInfo(bucket, key).getBody();
    }

    /**
     * Retrieve Presigned Download URL for SOS object
     * Generates Presigned Download URL for SOS object
     * <p><b>200</b> - 200
     * @param bucket  (required)
     * @param key  (optional)
     * @return ResponseEntity&lt;InlineResponse20036&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse20036> getSosPresignedUrlWithHttpInfo(String bucket, String key) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'bucket' is set
        if (bucket == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bucket' when calling getSosPresignedUrl");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bucket", bucket);
        String path = UriComponentsBuilder.fromPath("/sos/{bucket}/presigned-url").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "key", key));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<InlineResponse20036> returnType = new ParameterizedTypeReference<InlineResponse20036>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List SOS Buckets Usage
     * 
     * <p><b>200</b> - 200
     * @return InlineResponse20026
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20026 listSosBucketsUsage() throws RestClientException {
        return listSosBucketsUsageWithHttpInfo().getBody();
    }

    /**
     * List SOS Buckets Usage
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;InlineResponse20026&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse20026> listSosBucketsUsageWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/sos-buckets-usage").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<InlineResponse20026> returnType = new ParameterizedTypeReference<InlineResponse20026>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
