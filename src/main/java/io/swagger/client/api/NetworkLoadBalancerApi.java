package io.swagger.client.api;

import io.swagger.client.ApiClient;

import io.swagger.client.model.IdServiceBody;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.LoadBalancer;
import io.swagger.client.model.LoadBalancerService;
import io.swagger.client.model.LoadbalancerBody;
import io.swagger.client.model.LoadbalancerIdBody;
import io.swagger.client.model.Operation;
import io.swagger.client.model.ServiceServiceidBody;
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
@Component("io.swagger.client.api.NetworkLoadBalancerApi")
public class NetworkLoadBalancerApi {
    private ApiClient apiClient;

    public NetworkLoadBalancerApi() {
        this(new ApiClient());
    }

    @Autowired
    public NetworkLoadBalancerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a Load Balancer Service
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation addServiceToLoadBalancer(IdServiceBody body, UUID id) throws RestClientException {
        return addServiceToLoadBalancerWithHttpInfo(body, id).getBody();
    }

    /**
     * Add a Load Balancer Service
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> addServiceToLoadBalancerWithHttpInfo(IdServiceBody body, UUID id) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling addServiceToLoadBalancer");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling addServiceToLoadBalancer");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/load-balancer/{id}/service").buildAndExpand(uriVariables).toUriString();
        
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
     * Create a Load Balancer
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation createLoadBalancer(LoadbalancerBody body) throws RestClientException {
        return createLoadBalancerWithHttpInfo(body).getBody();
    }

    /**
     * Create a Load Balancer
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> createLoadBalancerWithHttpInfo(LoadbalancerBody body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createLoadBalancer");
        }
        String path = UriComponentsBuilder.fromPath("/load-balancer").build().toUriString();
        
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
     * Delete a Load Balancer
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteLoadBalancer(UUID id) throws RestClientException {
        return deleteLoadBalancerWithHttpInfo(id).getBody();
    }

    /**
     * Delete a Load Balancer
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteLoadBalancerWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteLoadBalancer");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/load-balancer/{id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a Load Balancer Service
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @param serviceId  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteLoadBalancerService(UUID id, UUID serviceId) throws RestClientException {
        return deleteLoadBalancerServiceWithHttpInfo(id, serviceId).getBody();
    }

    /**
     * Delete a Load Balancer Service
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @param serviceId  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteLoadBalancerServiceWithHttpInfo(UUID id, UUID serviceId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteLoadBalancerService");
        }
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling deleteLoadBalancerService");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("service-id", serviceId);
        String path = UriComponentsBuilder.fromPath("/load-balancer/{id}/service/{service-id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Retrieve Load Balancer details
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return LoadBalancer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LoadBalancer getLoadBalancer(UUID id) throws RestClientException {
        return getLoadBalancerWithHttpInfo(id).getBody();
    }

    /**
     * Retrieve Load Balancer details
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ResponseEntity&lt;LoadBalancer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LoadBalancer> getLoadBalancerWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getLoadBalancer");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/load-balancer/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<LoadBalancer> returnType = new ParameterizedTypeReference<LoadBalancer>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieve Load Balancer Service details
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @param serviceId  (required)
     * @return LoadBalancerService
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LoadBalancerService getLoadBalancerService(UUID id, UUID serviceId) throws RestClientException {
        return getLoadBalancerServiceWithHttpInfo(id, serviceId).getBody();
    }

    /**
     * Retrieve Load Balancer Service details
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @param serviceId  (required)
     * @return ResponseEntity&lt;LoadBalancerService&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LoadBalancerService> getLoadBalancerServiceWithHttpInfo(UUID id, UUID serviceId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getLoadBalancerService");
        }
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getLoadBalancerService");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("service-id", serviceId);
        String path = UriComponentsBuilder.fromPath("/load-balancer/{id}/service/{service-id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<LoadBalancerService> returnType = new ParameterizedTypeReference<LoadBalancerService>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Load Balancers
     * 
     * <p><b>200</b> - 200
     * @return InlineResponse2001
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse2001 listLoadBalancers() throws RestClientException {
        return listLoadBalancersWithHttpInfo().getBody();
    }

    /**
     * List Load Balancers
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;InlineResponse2001&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse2001> listLoadBalancersWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/load-balancer").build().toUriString();
        
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

        ParameterizedTypeReference<InlineResponse2001> returnType = new ParameterizedTypeReference<InlineResponse2001>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Reset a Load Balancer field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @param field  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation resetLoadBalancerField(UUID id, String field) throws RestClientException {
        return resetLoadBalancerFieldWithHttpInfo(id, field).getBody();
    }

    /**
     * Reset a Load Balancer field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @param field  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> resetLoadBalancerFieldWithHttpInfo(UUID id, String field) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling resetLoadBalancerField");
        }
        // verify the required parameter 'field' is set
        if (field == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'field' when calling resetLoadBalancerField");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("field", field);
        String path = UriComponentsBuilder.fromPath("/load-balancer/{id}/{field}").buildAndExpand(uriVariables).toUriString();
        
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
     * Reset a Load Balancer Service field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @param serviceId  (required)
     * @param field  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation resetLoadBalancerServiceField(UUID id, UUID serviceId, String field) throws RestClientException {
        return resetLoadBalancerServiceFieldWithHttpInfo(id, serviceId, field).getBody();
    }

    /**
     * Reset a Load Balancer Service field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @param serviceId  (required)
     * @param field  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> resetLoadBalancerServiceFieldWithHttpInfo(UUID id, UUID serviceId, String field) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling resetLoadBalancerServiceField");
        }
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling resetLoadBalancerServiceField");
        }
        // verify the required parameter 'field' is set
        if (field == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'field' when calling resetLoadBalancerServiceField");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("service-id", serviceId);
        uriVariables.put("field", field);
        String path = UriComponentsBuilder.fromPath("/load-balancer/{id}/service/{service-id}/{field}").buildAndExpand(uriVariables).toUriString();
        
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
     * Update a Load Balancer
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation updateLoadBalancer(LoadbalancerIdBody body, UUID id) throws RestClientException {
        return updateLoadBalancerWithHttpInfo(body, id).getBody();
    }

    /**
     * Update a Load Balancer
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> updateLoadBalancerWithHttpInfo(LoadbalancerIdBody body, UUID id) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateLoadBalancer");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateLoadBalancer");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/load-balancer/{id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Update a Load Balancer Service
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @param serviceId  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation updateLoadBalancerService(ServiceServiceidBody body, UUID id, UUID serviceId) throws RestClientException {
        return updateLoadBalancerServiceWithHttpInfo(body, id, serviceId).getBody();
    }

    /**
     * Update a Load Balancer Service
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @param serviceId  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> updateLoadBalancerServiceWithHttpInfo(ServiceServiceidBody body, UUID id, UUID serviceId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateLoadBalancerService");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateLoadBalancerService");
        }
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling updateLoadBalancerService");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("service-id", serviceId);
        String path = UriComponentsBuilder.fromPath("/load-balancer/{id}/service/{service-id}").buildAndExpand(uriVariables).toUriString();
        
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
