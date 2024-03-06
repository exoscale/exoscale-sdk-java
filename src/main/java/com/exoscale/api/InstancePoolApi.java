package com.exoscale.api;

import com.exoscale.invoker.ApiClient;

import com.exoscale.model.CreateInstancePoolRequest;
import com.exoscale.model.EvictInstancePoolMembersRequest;
import com.exoscale.model.InstancePool;
import com.exoscale.model.ListInstancePools200Response;
import com.exoscale.model.Operation;
import com.exoscale.model.ScaleInstancePoolRequest;
import java.util.UUID;
import com.exoscale.model.UpdateInstancePoolRequest;

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
public class InstancePoolApi {
    private ApiClient apiClient;

    public InstancePoolApi() {
        this(new ApiClient());
    }

    @Autowired
    public InstancePoolApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create an Instance Pool
     * 
     * <p><b>200</b> - 200
     * @param createInstancePoolRequest The createInstancePoolRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createInstancePoolRequestCreation(CreateInstancePoolRequest createInstancePoolRequest) throws WebClientResponseException {
        Object postBody = createInstancePoolRequest;
        // verify the required parameter 'createInstancePoolRequest' is set
        if (createInstancePoolRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createInstancePoolRequest' when calling createInstancePool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/instance-pool", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create an Instance Pool
     * 
     * <p><b>200</b> - 200
     * @param createInstancePoolRequest The createInstancePoolRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createInstancePool(CreateInstancePoolRequest createInstancePoolRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createInstancePoolRequestCreation(createInstancePoolRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create an Instance Pool
     * 
     * <p><b>200</b> - 200
     * @param createInstancePoolRequest The createInstancePoolRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createInstancePoolWithHttpInfo(CreateInstancePoolRequest createInstancePoolRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createInstancePoolRequestCreation(createInstancePoolRequest).toEntity(localVarReturnType);
    }

    /**
     * Create an Instance Pool
     * 
     * <p><b>200</b> - 200
     * @param createInstancePoolRequest The createInstancePoolRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createInstancePoolWithResponseSpec(CreateInstancePoolRequest createInstancePoolRequest) throws WebClientResponseException {
        return createInstancePoolRequestCreation(createInstancePoolRequest);
    }
    /**
     * Delete an Instance Pool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteInstancePoolRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteInstancePool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/instance-pool/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete an Instance Pool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteInstancePool(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteInstancePoolRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete an Instance Pool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteInstancePoolWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteInstancePoolRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Delete an Instance Pool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteInstancePoolWithResponseSpec(UUID id) throws WebClientResponseException {
        return deleteInstancePoolRequestCreation(id);
    }
    /**
     * Evict Instance Pool members
     * This operation evicts the specified Compute instances member from the Instance Pool, shrinking it to &#x60;&amp;lt;current pool size&amp;gt; - &amp;lt;# evicted members&amp;gt;&#x60;.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param evictInstancePoolMembersRequest The evictInstancePoolMembersRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec evictInstancePoolMembersRequestCreation(UUID id, EvictInstancePoolMembersRequest evictInstancePoolMembersRequest) throws WebClientResponseException {
        Object postBody = evictInstancePoolMembersRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling evictInstancePoolMembers", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'evictInstancePoolMembersRequest' is set
        if (evictInstancePoolMembersRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'evictInstancePoolMembersRequest' when calling evictInstancePoolMembers", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/instance-pool/{id}:evict", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Evict Instance Pool members
     * This operation evicts the specified Compute instances member from the Instance Pool, shrinking it to &#x60;&amp;lt;current pool size&amp;gt; - &amp;lt;# evicted members&amp;gt;&#x60;.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param evictInstancePoolMembersRequest The evictInstancePoolMembersRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> evictInstancePoolMembers(UUID id, EvictInstancePoolMembersRequest evictInstancePoolMembersRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return evictInstancePoolMembersRequestCreation(id, evictInstancePoolMembersRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Evict Instance Pool members
     * This operation evicts the specified Compute instances member from the Instance Pool, shrinking it to &#x60;&amp;lt;current pool size&amp;gt; - &amp;lt;# evicted members&amp;gt;&#x60;.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param evictInstancePoolMembersRequest The evictInstancePoolMembersRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> evictInstancePoolMembersWithHttpInfo(UUID id, EvictInstancePoolMembersRequest evictInstancePoolMembersRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return evictInstancePoolMembersRequestCreation(id, evictInstancePoolMembersRequest).toEntity(localVarReturnType);
    }

    /**
     * Evict Instance Pool members
     * This operation evicts the specified Compute instances member from the Instance Pool, shrinking it to &#x60;&amp;lt;current pool size&amp;gt; - &amp;lt;# evicted members&amp;gt;&#x60;.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param evictInstancePoolMembersRequest The evictInstancePoolMembersRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec evictInstancePoolMembersWithResponseSpec(UUID id, EvictInstancePoolMembersRequest evictInstancePoolMembersRequest) throws WebClientResponseException {
        return evictInstancePoolMembersRequestCreation(id, evictInstancePoolMembersRequest);
    }
    /**
     * Retrieve Instance Pool details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return InstancePool
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getInstancePoolRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getInstancePool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<InstancePool> localVarReturnType = new ParameterizedTypeReference<InstancePool>() {};
        return apiClient.invokeAPI("/instance-pool/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve Instance Pool details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return InstancePool
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<InstancePool> getInstancePool(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<InstancePool> localVarReturnType = new ParameterizedTypeReference<InstancePool>() {};
        return getInstancePoolRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve Instance Pool details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;InstancePool&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<InstancePool>> getInstancePoolWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<InstancePool> localVarReturnType = new ParameterizedTypeReference<InstancePool>() {};
        return getInstancePoolRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Retrieve Instance Pool details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getInstancePoolWithResponseSpec(UUID id) throws WebClientResponseException {
        return getInstancePoolRequestCreation(id);
    }
    /**
     * List Instance Pools
     * 
     * <p><b>200</b> - 200
     * @return ListInstancePools200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listInstancePoolsRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<ListInstancePools200Response> localVarReturnType = new ParameterizedTypeReference<ListInstancePools200Response>() {};
        return apiClient.invokeAPI("/instance-pool", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List Instance Pools
     * 
     * <p><b>200</b> - 200
     * @return ListInstancePools200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListInstancePools200Response> listInstancePools() throws WebClientResponseException {
        ParameterizedTypeReference<ListInstancePools200Response> localVarReturnType = new ParameterizedTypeReference<ListInstancePools200Response>() {};
        return listInstancePoolsRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * List Instance Pools
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;ListInstancePools200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListInstancePools200Response>> listInstancePoolsWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<ListInstancePools200Response> localVarReturnType = new ParameterizedTypeReference<ListInstancePools200Response>() {};
        return listInstancePoolsRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * List Instance Pools
     * 
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listInstancePoolsWithResponseSpec() throws WebClientResponseException {
        return listInstancePoolsRequestCreation();
    }
    /**
     * Reset an Instance Pool field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param field The field parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec resetInstancePoolFieldRequestCreation(UUID id, String field) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling resetInstancePoolField", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'field' is set
        if (field == null) {
            throw new WebClientResponseException("Missing the required parameter 'field' when calling resetInstancePoolField", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/instance-pool/{id}/{field}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Reset an Instance Pool field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param field The field parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> resetInstancePoolField(UUID id, String field) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetInstancePoolFieldRequestCreation(id, field).bodyToMono(localVarReturnType);
    }

    /**
     * Reset an Instance Pool field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param field The field parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> resetInstancePoolFieldWithHttpInfo(UUID id, String field) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetInstancePoolFieldRequestCreation(id, field).toEntity(localVarReturnType);
    }

    /**
     * Reset an Instance Pool field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param field The field parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec resetInstancePoolFieldWithResponseSpec(UUID id, String field) throws WebClientResponseException {
        return resetInstancePoolFieldRequestCreation(id, field);
    }
    /**
     * Scale an Instance Pool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param scaleInstancePoolRequest The scaleInstancePoolRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec scaleInstancePoolRequestCreation(UUID id, ScaleInstancePoolRequest scaleInstancePoolRequest) throws WebClientResponseException {
        Object postBody = scaleInstancePoolRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling scaleInstancePool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'scaleInstancePoolRequest' is set
        if (scaleInstancePoolRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'scaleInstancePoolRequest' when calling scaleInstancePool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/instance-pool/{id}:scale", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Scale an Instance Pool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param scaleInstancePoolRequest The scaleInstancePoolRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> scaleInstancePool(UUID id, ScaleInstancePoolRequest scaleInstancePoolRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return scaleInstancePoolRequestCreation(id, scaleInstancePoolRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Scale an Instance Pool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param scaleInstancePoolRequest The scaleInstancePoolRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> scaleInstancePoolWithHttpInfo(UUID id, ScaleInstancePoolRequest scaleInstancePoolRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return scaleInstancePoolRequestCreation(id, scaleInstancePoolRequest).toEntity(localVarReturnType);
    }

    /**
     * Scale an Instance Pool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param scaleInstancePoolRequest The scaleInstancePoolRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec scaleInstancePoolWithResponseSpec(UUID id, ScaleInstancePoolRequest scaleInstancePoolRequest) throws WebClientResponseException {
        return scaleInstancePoolRequestCreation(id, scaleInstancePoolRequest);
    }
    /**
     * Update an Instance Pool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateInstancePoolRequest The updateInstancePoolRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateInstancePoolRequestCreation(UUID id, UpdateInstancePoolRequest updateInstancePoolRequest) throws WebClientResponseException {
        Object postBody = updateInstancePoolRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling updateInstancePool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updateInstancePoolRequest' is set
        if (updateInstancePoolRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateInstancePoolRequest' when calling updateInstancePool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/instance-pool/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update an Instance Pool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateInstancePoolRequest The updateInstancePoolRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updateInstancePool(UUID id, UpdateInstancePoolRequest updateInstancePoolRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateInstancePoolRequestCreation(id, updateInstancePoolRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update an Instance Pool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateInstancePoolRequest The updateInstancePoolRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updateInstancePoolWithHttpInfo(UUID id, UpdateInstancePoolRequest updateInstancePoolRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateInstancePoolRequestCreation(id, updateInstancePoolRequest).toEntity(localVarReturnType);
    }

    /**
     * Update an Instance Pool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateInstancePoolRequest The updateInstancePoolRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateInstancePoolWithResponseSpec(UUID id, UpdateInstancePoolRequest updateInstancePoolRequest) throws WebClientResponseException {
        return updateInstancePoolRequestCreation(id, updateInstancePoolRequest);
    }
}
