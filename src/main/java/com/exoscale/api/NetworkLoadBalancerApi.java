package com.exoscale.api;

import com.exoscale.invoker.ApiClient;

import com.exoscale.model.AddServiceToLoadBalancerRequest;
import com.exoscale.model.CreateLoadBalancerRequest;
import com.exoscale.model.ListLoadBalancers200Response;
import com.exoscale.model.LoadBalancer;
import com.exoscale.model.LoadBalancerService;
import com.exoscale.model.Operation;
import java.util.UUID;
import com.exoscale.model.UpdateLoadBalancerRequest;
import com.exoscale.model.UpdateLoadBalancerServiceRequest;

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
     * @param id The id parameter
     * @param addServiceToLoadBalancerRequest The addServiceToLoadBalancerRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addServiceToLoadBalancerRequestCreation(UUID id, AddServiceToLoadBalancerRequest addServiceToLoadBalancerRequest) throws WebClientResponseException {
        Object postBody = addServiceToLoadBalancerRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling addServiceToLoadBalancer", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'addServiceToLoadBalancerRequest' is set
        if (addServiceToLoadBalancerRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'addServiceToLoadBalancerRequest' when calling addServiceToLoadBalancer", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI("/load-balancer/{id}/service", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add a Load Balancer Service
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param addServiceToLoadBalancerRequest The addServiceToLoadBalancerRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> addServiceToLoadBalancer(UUID id, AddServiceToLoadBalancerRequest addServiceToLoadBalancerRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return addServiceToLoadBalancerRequestCreation(id, addServiceToLoadBalancerRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Add a Load Balancer Service
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param addServiceToLoadBalancerRequest The addServiceToLoadBalancerRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> addServiceToLoadBalancerWithHttpInfo(UUID id, AddServiceToLoadBalancerRequest addServiceToLoadBalancerRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return addServiceToLoadBalancerRequestCreation(id, addServiceToLoadBalancerRequest).toEntity(localVarReturnType);
    }

    /**
     * Add a Load Balancer Service
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param addServiceToLoadBalancerRequest The addServiceToLoadBalancerRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec addServiceToLoadBalancerWithResponseSpec(UUID id, AddServiceToLoadBalancerRequest addServiceToLoadBalancerRequest) throws WebClientResponseException {
        return addServiceToLoadBalancerRequestCreation(id, addServiceToLoadBalancerRequest);
    }
    /**
     * Create a Load Balancer
     * 
     * <p><b>200</b> - 200
     * @param createLoadBalancerRequest The createLoadBalancerRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createLoadBalancerRequestCreation(CreateLoadBalancerRequest createLoadBalancerRequest) throws WebClientResponseException {
        Object postBody = createLoadBalancerRequest;
        // verify the required parameter 'createLoadBalancerRequest' is set
        if (createLoadBalancerRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createLoadBalancerRequest' when calling createLoadBalancer", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI("/load-balancer", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a Load Balancer
     * 
     * <p><b>200</b> - 200
     * @param createLoadBalancerRequest The createLoadBalancerRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createLoadBalancer(CreateLoadBalancerRequest createLoadBalancerRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createLoadBalancerRequestCreation(createLoadBalancerRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create a Load Balancer
     * 
     * <p><b>200</b> - 200
     * @param createLoadBalancerRequest The createLoadBalancerRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createLoadBalancerWithHttpInfo(CreateLoadBalancerRequest createLoadBalancerRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createLoadBalancerRequestCreation(createLoadBalancerRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a Load Balancer
     * 
     * <p><b>200</b> - 200
     * @param createLoadBalancerRequest The createLoadBalancerRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createLoadBalancerWithResponseSpec(CreateLoadBalancerRequest createLoadBalancerRequest) throws WebClientResponseException {
        return createLoadBalancerRequestCreation(createLoadBalancerRequest);
    }
    /**
     * Delete a Load Balancer
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteLoadBalancerRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteLoadBalancer", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

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

        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI("/load-balancer/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a Load Balancer
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteLoadBalancer(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteLoadBalancerRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a Load Balancer
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteLoadBalancerWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteLoadBalancerRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Delete a Load Balancer
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteLoadBalancerWithResponseSpec(UUID id) throws WebClientResponseException {
        return deleteLoadBalancerRequestCreation(id);
    }
    /**
     * Delete a Load Balancer Service
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param serviceId The serviceId parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteLoadBalancerServiceRequestCreation(UUID id, UUID serviceId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteLoadBalancerService", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceId' when calling deleteLoadBalancerService", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);
        pathParams.put("service-id", serviceId);

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

        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI("/load-balancer/{id}/service/{service-id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a Load Balancer Service
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param serviceId The serviceId parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteLoadBalancerService(UUID id, UUID serviceId) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteLoadBalancerServiceRequestCreation(id, serviceId).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a Load Balancer Service
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param serviceId The serviceId parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteLoadBalancerServiceWithHttpInfo(UUID id, UUID serviceId) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteLoadBalancerServiceRequestCreation(id, serviceId).toEntity(localVarReturnType);
    }

    /**
     * Delete a Load Balancer Service
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param serviceId The serviceId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteLoadBalancerServiceWithResponseSpec(UUID id, UUID serviceId) throws WebClientResponseException {
        return deleteLoadBalancerServiceRequestCreation(id, serviceId);
    }
    /**
     * Retrieve Load Balancer details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return LoadBalancer
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getLoadBalancerRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getLoadBalancer", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

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

        ParameterizedTypeReference<LoadBalancer> localVarReturnType = new ParameterizedTypeReference<LoadBalancer>() {};
        return apiClient.invokeAPI("/load-balancer/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve Load Balancer details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return LoadBalancer
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<LoadBalancer> getLoadBalancer(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<LoadBalancer> localVarReturnType = new ParameterizedTypeReference<LoadBalancer>() {};
        return getLoadBalancerRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve Load Balancer details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;LoadBalancer&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<LoadBalancer>> getLoadBalancerWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<LoadBalancer> localVarReturnType = new ParameterizedTypeReference<LoadBalancer>() {};
        return getLoadBalancerRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Retrieve Load Balancer details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getLoadBalancerWithResponseSpec(UUID id) throws WebClientResponseException {
        return getLoadBalancerRequestCreation(id);
    }
    /**
     * Retrieve Load Balancer Service details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param serviceId The serviceId parameter
     * @return LoadBalancerService
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getLoadBalancerServiceRequestCreation(UUID id, UUID serviceId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getLoadBalancerService", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceId' when calling getLoadBalancerService", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);
        pathParams.put("service-id", serviceId);

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

        ParameterizedTypeReference<LoadBalancerService> localVarReturnType = new ParameterizedTypeReference<LoadBalancerService>() {};
        return apiClient.invokeAPI("/load-balancer/{id}/service/{service-id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve Load Balancer Service details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param serviceId The serviceId parameter
     * @return LoadBalancerService
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<LoadBalancerService> getLoadBalancerService(UUID id, UUID serviceId) throws WebClientResponseException {
        ParameterizedTypeReference<LoadBalancerService> localVarReturnType = new ParameterizedTypeReference<LoadBalancerService>() {};
        return getLoadBalancerServiceRequestCreation(id, serviceId).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve Load Balancer Service details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param serviceId The serviceId parameter
     * @return ResponseEntity&lt;LoadBalancerService&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<LoadBalancerService>> getLoadBalancerServiceWithHttpInfo(UUID id, UUID serviceId) throws WebClientResponseException {
        ParameterizedTypeReference<LoadBalancerService> localVarReturnType = new ParameterizedTypeReference<LoadBalancerService>() {};
        return getLoadBalancerServiceRequestCreation(id, serviceId).toEntity(localVarReturnType);
    }

    /**
     * Retrieve Load Balancer Service details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param serviceId The serviceId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getLoadBalancerServiceWithResponseSpec(UUID id, UUID serviceId) throws WebClientResponseException {
        return getLoadBalancerServiceRequestCreation(id, serviceId);
    }
    /**
     * List Load Balancers
     * 
     * <p><b>200</b> - 200
     * @return ListLoadBalancers200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listLoadBalancersRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<ListLoadBalancers200Response> localVarReturnType = new ParameterizedTypeReference<ListLoadBalancers200Response>() {};
        return apiClient.invokeAPI("/load-balancer", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List Load Balancers
     * 
     * <p><b>200</b> - 200
     * @return ListLoadBalancers200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListLoadBalancers200Response> listLoadBalancers() throws WebClientResponseException {
        ParameterizedTypeReference<ListLoadBalancers200Response> localVarReturnType = new ParameterizedTypeReference<ListLoadBalancers200Response>() {};
        return listLoadBalancersRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * List Load Balancers
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;ListLoadBalancers200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListLoadBalancers200Response>> listLoadBalancersWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<ListLoadBalancers200Response> localVarReturnType = new ParameterizedTypeReference<ListLoadBalancers200Response>() {};
        return listLoadBalancersRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * List Load Balancers
     * 
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listLoadBalancersWithResponseSpec() throws WebClientResponseException {
        return listLoadBalancersRequestCreation();
    }
    /**
     * Reset a Load Balancer field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param field The field parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec resetLoadBalancerFieldRequestCreation(UUID id, String field) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling resetLoadBalancerField", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'field' is set
        if (field == null) {
            throw new WebClientResponseException("Missing the required parameter 'field' when calling resetLoadBalancerField", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);
        pathParams.put("field", field);

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

        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI("/load-balancer/{id}/{field}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Reset a Load Balancer field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param field The field parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> resetLoadBalancerField(UUID id, String field) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetLoadBalancerFieldRequestCreation(id, field).bodyToMono(localVarReturnType);
    }

    /**
     * Reset a Load Balancer field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param field The field parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> resetLoadBalancerFieldWithHttpInfo(UUID id, String field) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetLoadBalancerFieldRequestCreation(id, field).toEntity(localVarReturnType);
    }

    /**
     * Reset a Load Balancer field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param field The field parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec resetLoadBalancerFieldWithResponseSpec(UUID id, String field) throws WebClientResponseException {
        return resetLoadBalancerFieldRequestCreation(id, field);
    }
    /**
     * Reset a Load Balancer Service field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param serviceId The serviceId parameter
     * @param field The field parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec resetLoadBalancerServiceFieldRequestCreation(UUID id, UUID serviceId, String field) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling resetLoadBalancerServiceField", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceId' when calling resetLoadBalancerServiceField", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'field' is set
        if (field == null) {
            throw new WebClientResponseException("Missing the required parameter 'field' when calling resetLoadBalancerServiceField", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);
        pathParams.put("service-id", serviceId);
        pathParams.put("field", field);

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

        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI("/load-balancer/{id}/service/{service-id}/{field}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Reset a Load Balancer Service field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param serviceId The serviceId parameter
     * @param field The field parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> resetLoadBalancerServiceField(UUID id, UUID serviceId, String field) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetLoadBalancerServiceFieldRequestCreation(id, serviceId, field).bodyToMono(localVarReturnType);
    }

    /**
     * Reset a Load Balancer Service field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param serviceId The serviceId parameter
     * @param field The field parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> resetLoadBalancerServiceFieldWithHttpInfo(UUID id, UUID serviceId, String field) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetLoadBalancerServiceFieldRequestCreation(id, serviceId, field).toEntity(localVarReturnType);
    }

    /**
     * Reset a Load Balancer Service field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param serviceId The serviceId parameter
     * @param field The field parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec resetLoadBalancerServiceFieldWithResponseSpec(UUID id, UUID serviceId, String field) throws WebClientResponseException {
        return resetLoadBalancerServiceFieldRequestCreation(id, serviceId, field);
    }
    /**
     * Update a Load Balancer
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateLoadBalancerRequest The updateLoadBalancerRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateLoadBalancerRequestCreation(UUID id, UpdateLoadBalancerRequest updateLoadBalancerRequest) throws WebClientResponseException {
        Object postBody = updateLoadBalancerRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling updateLoadBalancer", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updateLoadBalancerRequest' is set
        if (updateLoadBalancerRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateLoadBalancerRequest' when calling updateLoadBalancer", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI("/load-balancer/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a Load Balancer
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateLoadBalancerRequest The updateLoadBalancerRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updateLoadBalancer(UUID id, UpdateLoadBalancerRequest updateLoadBalancerRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateLoadBalancerRequestCreation(id, updateLoadBalancerRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update a Load Balancer
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateLoadBalancerRequest The updateLoadBalancerRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updateLoadBalancerWithHttpInfo(UUID id, UpdateLoadBalancerRequest updateLoadBalancerRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateLoadBalancerRequestCreation(id, updateLoadBalancerRequest).toEntity(localVarReturnType);
    }

    /**
     * Update a Load Balancer
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateLoadBalancerRequest The updateLoadBalancerRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateLoadBalancerWithResponseSpec(UUID id, UpdateLoadBalancerRequest updateLoadBalancerRequest) throws WebClientResponseException {
        return updateLoadBalancerRequestCreation(id, updateLoadBalancerRequest);
    }
    /**
     * Update a Load Balancer Service
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param serviceId The serviceId parameter
     * @param updateLoadBalancerServiceRequest The updateLoadBalancerServiceRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateLoadBalancerServiceRequestCreation(UUID id, UUID serviceId, UpdateLoadBalancerServiceRequest updateLoadBalancerServiceRequest) throws WebClientResponseException {
        Object postBody = updateLoadBalancerServiceRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling updateLoadBalancerService", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceId' when calling updateLoadBalancerService", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updateLoadBalancerServiceRequest' is set
        if (updateLoadBalancerServiceRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateLoadBalancerServiceRequest' when calling updateLoadBalancerService", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);
        pathParams.put("service-id", serviceId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI("/load-balancer/{id}/service/{service-id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a Load Balancer Service
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param serviceId The serviceId parameter
     * @param updateLoadBalancerServiceRequest The updateLoadBalancerServiceRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updateLoadBalancerService(UUID id, UUID serviceId, UpdateLoadBalancerServiceRequest updateLoadBalancerServiceRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateLoadBalancerServiceRequestCreation(id, serviceId, updateLoadBalancerServiceRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update a Load Balancer Service
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param serviceId The serviceId parameter
     * @param updateLoadBalancerServiceRequest The updateLoadBalancerServiceRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updateLoadBalancerServiceWithHttpInfo(UUID id, UUID serviceId, UpdateLoadBalancerServiceRequest updateLoadBalancerServiceRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateLoadBalancerServiceRequestCreation(id, serviceId, updateLoadBalancerServiceRequest).toEntity(localVarReturnType);
    }

    /**
     * Update a Load Balancer Service
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param serviceId The serviceId parameter
     * @param updateLoadBalancerServiceRequest The updateLoadBalancerServiceRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateLoadBalancerServiceWithResponseSpec(UUID id, UUID serviceId, UpdateLoadBalancerServiceRequest updateLoadBalancerServiceRequest) throws WebClientResponseException {
        return updateLoadBalancerServiceRequestCreation(id, serviceId, updateLoadBalancerServiceRequest);
    }
}
