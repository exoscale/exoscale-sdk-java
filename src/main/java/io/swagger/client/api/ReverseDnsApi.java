package io.swagger.client.api;

import io.swagger.client.ApiClient;

import io.swagger.client.model.ElasticipIdBody;
import io.swagger.client.model.InstanceIdBody;
import io.swagger.client.model.Operation;
import io.swagger.client.model.ReverseDnsRecord;
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
@Component("io.swagger.client.api.ReverseDnsApi")
public class ReverseDnsApi {
    private ApiClient apiClient;

    public ReverseDnsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ReverseDnsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete the PTR DNS record for an elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteReverseDnsElasticIp(UUID id) throws RestClientException {
        return deleteReverseDnsElasticIpWithHttpInfo(id).getBody();
    }

    /**
     * Delete the PTR DNS record for an elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteReverseDnsElasticIpWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteReverseDnsElasticIp");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/reverse-dns/elastic-ip/{id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete the PTR DNS record for an instance
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteReverseDnsInstance(UUID id) throws RestClientException {
        return deleteReverseDnsInstanceWithHttpInfo(id).getBody();
    }

    /**
     * Delete the PTR DNS record for an instance
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteReverseDnsInstanceWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteReverseDnsInstance");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/reverse-dns/instance/{id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Query the PTR DNS records for an elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ReverseDnsRecord
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReverseDnsRecord getReverseDnsElasticIp(UUID id) throws RestClientException {
        return getReverseDnsElasticIpWithHttpInfo(id).getBody();
    }

    /**
     * Query the PTR DNS records for an elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ResponseEntity&lt;ReverseDnsRecord&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReverseDnsRecord> getReverseDnsElasticIpWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getReverseDnsElasticIp");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/reverse-dns/elastic-ip/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ReverseDnsRecord> returnType = new ParameterizedTypeReference<ReverseDnsRecord>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Query the PTR DNS records for an instance
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ReverseDnsRecord
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReverseDnsRecord getReverseDnsInstance(UUID id) throws RestClientException {
        return getReverseDnsInstanceWithHttpInfo(id).getBody();
    }

    /**
     * Query the PTR DNS records for an instance
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ResponseEntity&lt;ReverseDnsRecord&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReverseDnsRecord> getReverseDnsInstanceWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getReverseDnsInstance");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/reverse-dns/instance/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ReverseDnsRecord> returnType = new ParameterizedTypeReference<ReverseDnsRecord>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update/Create the PTR DNS record for an elastic IP
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation updateReverseDnsElasticIp(ElasticipIdBody body, UUID id) throws RestClientException {
        return updateReverseDnsElasticIpWithHttpInfo(body, id).getBody();
    }

    /**
     * Update/Create the PTR DNS record for an elastic IP
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> updateReverseDnsElasticIpWithHttpInfo(ElasticipIdBody body, UUID id) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateReverseDnsElasticIp");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateReverseDnsElasticIp");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/reverse-dns/elastic-ip/{id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Update/Create the PTR DNS record for an instance
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation updateReverseDnsInstance(InstanceIdBody body, UUID id) throws RestClientException {
        return updateReverseDnsInstanceWithHttpInfo(body, id).getBody();
    }

    /**
     * Update/Create the PTR DNS record for an instance
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> updateReverseDnsInstanceWithHttpInfo(InstanceIdBody body, UUID id) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateReverseDnsInstance");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateReverseDnsInstance");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/reverse-dns/instance/{id}").buildAndExpand(uriVariables).toUriString();
        
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
}
