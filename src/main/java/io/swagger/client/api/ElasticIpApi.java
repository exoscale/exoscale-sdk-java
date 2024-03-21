package io.swagger.client.api;

import io.swagger.client.ApiClient;

import io.swagger.client.model.ElasticIp;
import io.swagger.client.model.ElasticipBody;
import io.swagger.client.model.ElasticipIdBody1;
import io.swagger.client.model.ElasticipIdattachBody;
import io.swagger.client.model.ElasticipIddetachBody;
import io.swagger.client.model.InlineResponse2005;
import io.swagger.client.model.Operation;
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
@Component("io.swagger.client.api.ElasticIpApi")
public class ElasticIpApi {
    private ApiClient apiClient;

    public ElasticIpApi() {
        this(new ApiClient());
    }

    @Autowired
    public ElasticIpApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Attach a Compute instance to an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation attachInstanceToElasticIp(ElasticipIdattachBody body, UUID id) throws RestClientException {
        return attachInstanceToElasticIpWithHttpInfo(body, id).getBody();
    }

    /**
     * Attach a Compute instance to an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> attachInstanceToElasticIpWithHttpInfo(ElasticipIdattachBody body, UUID id) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling attachInstanceToElasticIp");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling attachInstanceToElasticIp");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/elastic-ip/{id}:attach").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Operation> returnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation createElasticIp(ElasticipBody body) throws RestClientException {
        return createElasticIpWithHttpInfo(body).getBody();
    }

    /**
     * Create an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> createElasticIpWithHttpInfo(ElasticipBody body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createElasticIp");
        }
        String path = UriComponentsBuilder.fromPath("/elastic-ip").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Operation> returnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteElasticIp(UUID id) throws RestClientException {
        return deleteElasticIpWithHttpInfo(id).getBody();
    }

    /**
     * Delete an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteElasticIpWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteElasticIp");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/elastic-ip/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Operation> returnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Detach a Compute instance from an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation detachInstanceFromElasticIp(ElasticipIddetachBody body, UUID id) throws RestClientException {
        return detachInstanceFromElasticIpWithHttpInfo(body, id).getBody();
    }

    /**
     * Detach a Compute instance from an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> detachInstanceFromElasticIpWithHttpInfo(ElasticipIddetachBody body, UUID id) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling detachInstanceFromElasticIp");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling detachInstanceFromElasticIp");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/elastic-ip/{id}:detach").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Operation> returnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieve Elastic IP details
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ElasticIp
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ElasticIp getElasticIp(UUID id) throws RestClientException {
        return getElasticIpWithHttpInfo(id).getBody();
    }

    /**
     * Retrieve Elastic IP details
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ResponseEntity&lt;ElasticIp&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ElasticIp> getElasticIpWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getElasticIp");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/elastic-ip/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ElasticIp> returnType = new ParameterizedTypeReference<ElasticIp>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Elastic IPs
     * 
     * <p><b>200</b> - 200
     * @return InlineResponse2005
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse2005 listElasticIps() throws RestClientException {
        return listElasticIpsWithHttpInfo().getBody();
    }

    /**
     * List Elastic IPs
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;InlineResponse2005&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse2005> listElasticIpsWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/elastic-ip").build().toUriString();
        
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

        ParameterizedTypeReference<InlineResponse2005> returnType = new ParameterizedTypeReference<InlineResponse2005>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Reset an Elastic IP field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @param field  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation resetElasticIpField(UUID id, String field) throws RestClientException {
        return resetElasticIpFieldWithHttpInfo(id, field).getBody();
    }

    /**
     * Reset an Elastic IP field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @param field  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> resetElasticIpFieldWithHttpInfo(UUID id, String field) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling resetElasticIpField");
        }
        // verify the required parameter 'field' is set
        if (field == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'field' when calling resetElasticIpField");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("field", field);
        String path = UriComponentsBuilder.fromPath("/elastic-ip/{id}/{field}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Operation> returnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation updateElasticIp(ElasticipIdBody1 body, UUID id) throws RestClientException {
        return updateElasticIpWithHttpInfo(body, id).getBody();
    }

    /**
     * Update an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> updateElasticIpWithHttpInfo(ElasticipIdBody1 body, UUID id) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateElasticIp");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateElasticIp");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/elastic-ip/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Operation> returnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
