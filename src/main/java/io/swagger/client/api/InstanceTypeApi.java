package io.swagger.client.api;

import io.swagger.client.ApiClient;

import io.swagger.client.model.InlineResponse20013;
import io.swagger.client.model.InstanceType;
import java.util.UUID;

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
@Component("io.swagger.client.api.InstanceTypeApi")
public class InstanceTypeApi {
    private ApiClient apiClient;

    public InstanceTypeApi() {
        this(new ApiClient());
    }

    @Autowired
    public InstanceTypeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieve Instance Type details
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return InstanceType
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InstanceType getInstanceType(UUID id) throws RestClientException {
        return getInstanceTypeWithHttpInfo(id).getBody();
    }

    /**
     * Retrieve Instance Type details
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ResponseEntity&lt;InstanceType&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InstanceType> getInstanceTypeWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getInstanceType");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/instance-type/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<InstanceType> returnType = new ParameterizedTypeReference<InstanceType>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Compute instance Types
     * 
     * <p><b>200</b> - 200
     * @return InlineResponse20013
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20013 listInstanceTypes() throws RestClientException {
        return listInstanceTypesWithHttpInfo().getBody();
    }

    /**
     * List Compute instance Types
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;InlineResponse20013&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse20013> listInstanceTypesWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/instance-type").build().toUriString();
        
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

        ParameterizedTypeReference<InlineResponse20013> returnType = new ParameterizedTypeReference<InlineResponse20013>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
