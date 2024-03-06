package com.exoscale.api;

import com.exoscale.invoker.ApiClient;

import com.exoscale.model.CreateInstanceRequest;
import com.exoscale.model.Instance;
import com.exoscale.model.InstancePassword;
import com.exoscale.model.ListInstances200Response;
import com.exoscale.model.Operation;
import com.exoscale.model.ResetInstanceRequest;
import com.exoscale.model.ResizeInstanceDiskRequest;
import com.exoscale.model.RevertInstanceToSnapshotRequest;
import com.exoscale.model.ScaleInstanceRequest;
import com.exoscale.model.StartInstanceRequest;
import java.util.UUID;
import com.exoscale.model.UpdateInstanceRequest;

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
public class InstanceApi {
    private ApiClient apiClient;

    public InstanceApi() {
        this(new ApiClient());
    }

    @Autowired
    public InstanceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Set instance destruction protection
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addInstanceProtectionRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling addInstanceProtection", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/instance/{id}:add-protection", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Set instance destruction protection
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> addInstanceProtection(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return addInstanceProtectionRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Set instance destruction protection
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Object>> addInstanceProtectionWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return addInstanceProtectionRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Set instance destruction protection
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec addInstanceProtectionWithResponseSpec(UUID id) throws WebClientResponseException {
        return addInstanceProtectionRequestCreation(id);
    }
    /**
     * Create a Compute instance
     * 
     * <p><b>200</b> - 200
     * @param createInstanceRequest The createInstanceRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createInstanceRequestCreation(CreateInstanceRequest createInstanceRequest) throws WebClientResponseException {
        Object postBody = createInstanceRequest;
        // verify the required parameter 'createInstanceRequest' is set
        if (createInstanceRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createInstanceRequest' when calling createInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/instance", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a Compute instance
     * 
     * <p><b>200</b> - 200
     * @param createInstanceRequest The createInstanceRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createInstance(CreateInstanceRequest createInstanceRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createInstanceRequestCreation(createInstanceRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create a Compute instance
     * 
     * <p><b>200</b> - 200
     * @param createInstanceRequest The createInstanceRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createInstanceWithHttpInfo(CreateInstanceRequest createInstanceRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createInstanceRequestCreation(createInstanceRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a Compute instance
     * 
     * <p><b>200</b> - 200
     * @param createInstanceRequest The createInstanceRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createInstanceWithResponseSpec(CreateInstanceRequest createInstanceRequest) throws WebClientResponseException {
        return createInstanceRequestCreation(createInstanceRequest);
    }
    /**
     * Create a Snapshot of a Compute instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createSnapshotRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling createSnapshot", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/instance/{id}:create-snapshot", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a Snapshot of a Compute instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createSnapshot(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createSnapshotRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Create a Snapshot of a Compute instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createSnapshotWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createSnapshotRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Create a Snapshot of a Compute instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createSnapshotWithResponseSpec(UUID id) throws WebClientResponseException {
        return createSnapshotRequestCreation(id);
    }
    /**
     * Delete a Compute instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteInstanceRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/instance/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a Compute instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteInstance(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteInstanceRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a Compute instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteInstanceWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteInstanceRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Delete a Compute instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteInstanceWithResponseSpec(UUID id) throws WebClientResponseException {
        return deleteInstanceRequestCreation(id);
    }
    /**
     * Retrieve Compute instance details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Instance
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getInstanceRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Instance> localVarReturnType = new ParameterizedTypeReference<Instance>() {};
        return apiClient.invokeAPI("/instance/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve Compute instance details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Instance
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Instance> getInstance(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Instance> localVarReturnType = new ParameterizedTypeReference<Instance>() {};
        return getInstanceRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve Compute instance details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Instance&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Instance>> getInstanceWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Instance> localVarReturnType = new ParameterizedTypeReference<Instance>() {};
        return getInstanceRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Retrieve Compute instance details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getInstanceWithResponseSpec(UUID id) throws WebClientResponseException {
        return getInstanceRequestCreation(id);
    }
    /**
     * List Compute instances
     * 
     * <p><b>200</b> - 200
     * @param managerId The managerId parameter
     * @param managerType The managerType parameter
     * @param ipAddress The ipAddress parameter
     * @return ListInstances200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listInstancesRequestCreation(UUID managerId, String managerType, String ipAddress) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "manager-id", managerId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "manager-type", managerType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ip-address", ipAddress));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ListInstances200Response> localVarReturnType = new ParameterizedTypeReference<ListInstances200Response>() {};
        return apiClient.invokeAPI("/instance", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List Compute instances
     * 
     * <p><b>200</b> - 200
     * @param managerId The managerId parameter
     * @param managerType The managerType parameter
     * @param ipAddress The ipAddress parameter
     * @return ListInstances200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListInstances200Response> listInstances(UUID managerId, String managerType, String ipAddress) throws WebClientResponseException {
        ParameterizedTypeReference<ListInstances200Response> localVarReturnType = new ParameterizedTypeReference<ListInstances200Response>() {};
        return listInstancesRequestCreation(managerId, managerType, ipAddress).bodyToMono(localVarReturnType);
    }

    /**
     * List Compute instances
     * 
     * <p><b>200</b> - 200
     * @param managerId The managerId parameter
     * @param managerType The managerType parameter
     * @param ipAddress The ipAddress parameter
     * @return ResponseEntity&lt;ListInstances200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListInstances200Response>> listInstancesWithHttpInfo(UUID managerId, String managerType, String ipAddress) throws WebClientResponseException {
        ParameterizedTypeReference<ListInstances200Response> localVarReturnType = new ParameterizedTypeReference<ListInstances200Response>() {};
        return listInstancesRequestCreation(managerId, managerType, ipAddress).toEntity(localVarReturnType);
    }

    /**
     * List Compute instances
     * 
     * <p><b>200</b> - 200
     * @param managerId The managerId parameter
     * @param managerType The managerType parameter
     * @param ipAddress The ipAddress parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listInstancesWithResponseSpec(UUID managerId, String managerType, String ipAddress) throws WebClientResponseException {
        return listInstancesRequestCreation(managerId, managerType, ipAddress);
    }
    /**
     * Reboot a Compute instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec rebootInstanceRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling rebootInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/instance/{id}:reboot", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Reboot a Compute instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> rebootInstance(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return rebootInstanceRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Reboot a Compute instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> rebootInstanceWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return rebootInstanceRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Reboot a Compute instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec rebootInstanceWithResponseSpec(UUID id) throws WebClientResponseException {
        return rebootInstanceRequestCreation(id);
    }
    /**
     * Remove instance destruction protection
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec removeInstanceProtectionRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling removeInstanceProtection", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/instance/{id}:remove-protection", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove instance destruction protection
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> removeInstanceProtection(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return removeInstanceProtectionRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Remove instance destruction protection
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Object>> removeInstanceProtectionWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return removeInstanceProtectionRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Remove instance destruction protection
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec removeInstanceProtectionWithResponseSpec(UUID id) throws WebClientResponseException {
        return removeInstanceProtectionRequestCreation(id);
    }
    /**
     * Reset a Compute instance to a base/target template
     * This operation re-installs a Compute instance to a base template. If target template is provided it will be used to recreated instance from. Warning: the operation wipes all data stored on the disk.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param resetInstanceRequest The resetInstanceRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec resetInstanceRequestCreation(UUID id, ResetInstanceRequest resetInstanceRequest) throws WebClientResponseException {
        Object postBody = resetInstanceRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling resetInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'resetInstanceRequest' is set
        if (resetInstanceRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'resetInstanceRequest' when calling resetInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/instance/{id}:reset", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Reset a Compute instance to a base/target template
     * This operation re-installs a Compute instance to a base template. If target template is provided it will be used to recreated instance from. Warning: the operation wipes all data stored on the disk.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param resetInstanceRequest The resetInstanceRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> resetInstance(UUID id, ResetInstanceRequest resetInstanceRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetInstanceRequestCreation(id, resetInstanceRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Reset a Compute instance to a base/target template
     * This operation re-installs a Compute instance to a base template. If target template is provided it will be used to recreated instance from. Warning: the operation wipes all data stored on the disk.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param resetInstanceRequest The resetInstanceRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> resetInstanceWithHttpInfo(UUID id, ResetInstanceRequest resetInstanceRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetInstanceRequestCreation(id, resetInstanceRequest).toEntity(localVarReturnType);
    }

    /**
     * Reset a Compute instance to a base/target template
     * This operation re-installs a Compute instance to a base template. If target template is provided it will be used to recreated instance from. Warning: the operation wipes all data stored on the disk.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param resetInstanceRequest The resetInstanceRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec resetInstanceWithResponseSpec(UUID id, ResetInstanceRequest resetInstanceRequest) throws WebClientResponseException {
        return resetInstanceRequestCreation(id, resetInstanceRequest);
    }
    /**
     * Reset Instance field
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param field The field parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec resetInstanceFieldRequestCreation(UUID id, String field) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling resetInstanceField", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'field' is set
        if (field == null) {
            throw new WebClientResponseException("Missing the required parameter 'field' when calling resetInstanceField", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/instance/{id}/{field}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Reset Instance field
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param field The field parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> resetInstanceField(UUID id, String field) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetInstanceFieldRequestCreation(id, field).bodyToMono(localVarReturnType);
    }

    /**
     * Reset Instance field
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param field The field parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> resetInstanceFieldWithHttpInfo(UUID id, String field) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetInstanceFieldRequestCreation(id, field).toEntity(localVarReturnType);
    }

    /**
     * Reset Instance field
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param field The field parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec resetInstanceFieldWithResponseSpec(UUID id, String field) throws WebClientResponseException {
        return resetInstanceFieldRequestCreation(id, field);
    }
    /**
     * Reset a compute instance password
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec resetInstancePasswordRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling resetInstancePassword", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/instance/{id}:reset-password", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Reset a compute instance password
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> resetInstancePassword(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetInstancePasswordRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Reset a compute instance password
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> resetInstancePasswordWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetInstancePasswordRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Reset a compute instance password
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec resetInstancePasswordWithResponseSpec(UUID id) throws WebClientResponseException {
        return resetInstancePasswordRequestCreation(id);
    }
    /**
     * Resize a Compute instance disk
     * This operation resizes a Compute instance&#39;s disk volume. Note: the disk can only grow, cannot be shrunk.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param resizeInstanceDiskRequest The resizeInstanceDiskRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec resizeInstanceDiskRequestCreation(UUID id, ResizeInstanceDiskRequest resizeInstanceDiskRequest) throws WebClientResponseException {
        Object postBody = resizeInstanceDiskRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling resizeInstanceDisk", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'resizeInstanceDiskRequest' is set
        if (resizeInstanceDiskRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'resizeInstanceDiskRequest' when calling resizeInstanceDisk", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/instance/{id}:resize-disk", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Resize a Compute instance disk
     * This operation resizes a Compute instance&#39;s disk volume. Note: the disk can only grow, cannot be shrunk.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param resizeInstanceDiskRequest The resizeInstanceDiskRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> resizeInstanceDisk(UUID id, ResizeInstanceDiskRequest resizeInstanceDiskRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resizeInstanceDiskRequestCreation(id, resizeInstanceDiskRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Resize a Compute instance disk
     * This operation resizes a Compute instance&#39;s disk volume. Note: the disk can only grow, cannot be shrunk.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param resizeInstanceDiskRequest The resizeInstanceDiskRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> resizeInstanceDiskWithHttpInfo(UUID id, ResizeInstanceDiskRequest resizeInstanceDiskRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resizeInstanceDiskRequestCreation(id, resizeInstanceDiskRequest).toEntity(localVarReturnType);
    }

    /**
     * Resize a Compute instance disk
     * This operation resizes a Compute instance&#39;s disk volume. Note: the disk can only grow, cannot be shrunk.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param resizeInstanceDiskRequest The resizeInstanceDiskRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec resizeInstanceDiskWithResponseSpec(UUID id, ResizeInstanceDiskRequest resizeInstanceDiskRequest) throws WebClientResponseException {
        return resizeInstanceDiskRequestCreation(id, resizeInstanceDiskRequest);
    }
    /**
     * Reveal the password used during instance creation or the latest password reset.
     * Reveal the password used during instance creation or the latest password reset.             This is only available for VMs created against templates having the &#x60;password-enabled&#x60;             property set to &#x60;true&#x60;.              Passwords are transiently stored for at most 24 hours and intended to be retrieved shortly after             creation or resets.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return InstancePassword
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec revealInstancePasswordRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling revealInstancePassword", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<InstancePassword> localVarReturnType = new ParameterizedTypeReference<InstancePassword>() {};
        return apiClient.invokeAPI("/instance/{id}:password", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Reveal the password used during instance creation or the latest password reset.
     * Reveal the password used during instance creation or the latest password reset.             This is only available for VMs created against templates having the &#x60;password-enabled&#x60;             property set to &#x60;true&#x60;.              Passwords are transiently stored for at most 24 hours and intended to be retrieved shortly after             creation or resets.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return InstancePassword
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<InstancePassword> revealInstancePassword(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<InstancePassword> localVarReturnType = new ParameterizedTypeReference<InstancePassword>() {};
        return revealInstancePasswordRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Reveal the password used during instance creation or the latest password reset.
     * Reveal the password used during instance creation or the latest password reset.             This is only available for VMs created against templates having the &#x60;password-enabled&#x60;             property set to &#x60;true&#x60;.              Passwords are transiently stored for at most 24 hours and intended to be retrieved shortly after             creation or resets.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;InstancePassword&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<InstancePassword>> revealInstancePasswordWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<InstancePassword> localVarReturnType = new ParameterizedTypeReference<InstancePassword>() {};
        return revealInstancePasswordRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Reveal the password used during instance creation or the latest password reset.
     * Reveal the password used during instance creation or the latest password reset.             This is only available for VMs created against templates having the &#x60;password-enabled&#x60;             property set to &#x60;true&#x60;.              Passwords are transiently stored for at most 24 hours and intended to be retrieved shortly after             creation or resets.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec revealInstancePasswordWithResponseSpec(UUID id) throws WebClientResponseException {
        return revealInstancePasswordRequestCreation(id);
    }
    /**
     * Revert a snapshot for an instance
     * This operation reverts the snapshot to the Compute instance volume, restoring stored data as it was at the time of the snapshot. The Compute instance must be previously stopped.
     * <p><b>200</b> - 200
     * @param instanceId The instanceId parameter
     * @param revertInstanceToSnapshotRequest The revertInstanceToSnapshotRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec revertInstanceToSnapshotRequestCreation(UUID instanceId, RevertInstanceToSnapshotRequest revertInstanceToSnapshotRequest) throws WebClientResponseException {
        Object postBody = revertInstanceToSnapshotRequest;
        // verify the required parameter 'instanceId' is set
        if (instanceId == null) {
            throw new WebClientResponseException("Missing the required parameter 'instanceId' when calling revertInstanceToSnapshot", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'revertInstanceToSnapshotRequest' is set
        if (revertInstanceToSnapshotRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'revertInstanceToSnapshotRequest' when calling revertInstanceToSnapshot", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("instance-id", instanceId);

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
        return apiClient.invokeAPI("/instance/{instance-id}:revert-snapshot", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Revert a snapshot for an instance
     * This operation reverts the snapshot to the Compute instance volume, restoring stored data as it was at the time of the snapshot. The Compute instance must be previously stopped.
     * <p><b>200</b> - 200
     * @param instanceId The instanceId parameter
     * @param revertInstanceToSnapshotRequest The revertInstanceToSnapshotRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> revertInstanceToSnapshot(UUID instanceId, RevertInstanceToSnapshotRequest revertInstanceToSnapshotRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return revertInstanceToSnapshotRequestCreation(instanceId, revertInstanceToSnapshotRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Revert a snapshot for an instance
     * This operation reverts the snapshot to the Compute instance volume, restoring stored data as it was at the time of the snapshot. The Compute instance must be previously stopped.
     * <p><b>200</b> - 200
     * @param instanceId The instanceId parameter
     * @param revertInstanceToSnapshotRequest The revertInstanceToSnapshotRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> revertInstanceToSnapshotWithHttpInfo(UUID instanceId, RevertInstanceToSnapshotRequest revertInstanceToSnapshotRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return revertInstanceToSnapshotRequestCreation(instanceId, revertInstanceToSnapshotRequest).toEntity(localVarReturnType);
    }

    /**
     * Revert a snapshot for an instance
     * This operation reverts the snapshot to the Compute instance volume, restoring stored data as it was at the time of the snapshot. The Compute instance must be previously stopped.
     * <p><b>200</b> - 200
     * @param instanceId The instanceId parameter
     * @param revertInstanceToSnapshotRequest The revertInstanceToSnapshotRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec revertInstanceToSnapshotWithResponseSpec(UUID instanceId, RevertInstanceToSnapshotRequest revertInstanceToSnapshotRequest) throws WebClientResponseException {
        return revertInstanceToSnapshotRequestCreation(instanceId, revertInstanceToSnapshotRequest);
    }
    /**
     * Scale a Compute instance to a new Instance Type
     * This operation changes the Compute instance&#39;s type. Note: the new Instance Type must be within the same family (e.g. a standard instance cannot be scaled to gpu2 or storage).
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param scaleInstanceRequest The scaleInstanceRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec scaleInstanceRequestCreation(UUID id, ScaleInstanceRequest scaleInstanceRequest) throws WebClientResponseException {
        Object postBody = scaleInstanceRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling scaleInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'scaleInstanceRequest' is set
        if (scaleInstanceRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'scaleInstanceRequest' when calling scaleInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/instance/{id}:scale", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Scale a Compute instance to a new Instance Type
     * This operation changes the Compute instance&#39;s type. Note: the new Instance Type must be within the same family (e.g. a standard instance cannot be scaled to gpu2 or storage).
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param scaleInstanceRequest The scaleInstanceRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> scaleInstance(UUID id, ScaleInstanceRequest scaleInstanceRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return scaleInstanceRequestCreation(id, scaleInstanceRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Scale a Compute instance to a new Instance Type
     * This operation changes the Compute instance&#39;s type. Note: the new Instance Type must be within the same family (e.g. a standard instance cannot be scaled to gpu2 or storage).
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param scaleInstanceRequest The scaleInstanceRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> scaleInstanceWithHttpInfo(UUID id, ScaleInstanceRequest scaleInstanceRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return scaleInstanceRequestCreation(id, scaleInstanceRequest).toEntity(localVarReturnType);
    }

    /**
     * Scale a Compute instance to a new Instance Type
     * This operation changes the Compute instance&#39;s type. Note: the new Instance Type must be within the same family (e.g. a standard instance cannot be scaled to gpu2 or storage).
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param scaleInstanceRequest The scaleInstanceRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec scaleInstanceWithResponseSpec(UUID id, ScaleInstanceRequest scaleInstanceRequest) throws WebClientResponseException {
        return scaleInstanceRequestCreation(id, scaleInstanceRequest);
    }
    /**
     * Start a Compute instance
     * This operation starts a virtual machine, potentially using a rescue profile if specified
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param startInstanceRequest The startInstanceRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec startInstanceRequestCreation(UUID id, StartInstanceRequest startInstanceRequest) throws WebClientResponseException {
        Object postBody = startInstanceRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling startInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'startInstanceRequest' is set
        if (startInstanceRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'startInstanceRequest' when calling startInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/instance/{id}:start", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Start a Compute instance
     * This operation starts a virtual machine, potentially using a rescue profile if specified
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param startInstanceRequest The startInstanceRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> startInstance(UUID id, StartInstanceRequest startInstanceRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return startInstanceRequestCreation(id, startInstanceRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Start a Compute instance
     * This operation starts a virtual machine, potentially using a rescue profile if specified
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param startInstanceRequest The startInstanceRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> startInstanceWithHttpInfo(UUID id, StartInstanceRequest startInstanceRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return startInstanceRequestCreation(id, startInstanceRequest).toEntity(localVarReturnType);
    }

    /**
     * Start a Compute instance
     * This operation starts a virtual machine, potentially using a rescue profile if specified
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param startInstanceRequest The startInstanceRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec startInstanceWithResponseSpec(UUID id, StartInstanceRequest startInstanceRequest) throws WebClientResponseException {
        return startInstanceRequestCreation(id, startInstanceRequest);
    }
    /**
     * Stop a Compute instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec stopInstanceRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling stopInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/instance/{id}:stop", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Stop a Compute instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> stopInstance(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return stopInstanceRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Stop a Compute instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> stopInstanceWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return stopInstanceRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Stop a Compute instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec stopInstanceWithResponseSpec(UUID id) throws WebClientResponseException {
        return stopInstanceRequestCreation(id);
    }
    /**
     * Update a Compute instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateInstanceRequest The updateInstanceRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateInstanceRequestCreation(UUID id, UpdateInstanceRequest updateInstanceRequest) throws WebClientResponseException {
        Object postBody = updateInstanceRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling updateInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updateInstanceRequest' is set
        if (updateInstanceRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateInstanceRequest' when calling updateInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/instance/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a Compute instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateInstanceRequest The updateInstanceRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updateInstance(UUID id, UpdateInstanceRequest updateInstanceRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateInstanceRequestCreation(id, updateInstanceRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update a Compute instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateInstanceRequest The updateInstanceRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updateInstanceWithHttpInfo(UUID id, UpdateInstanceRequest updateInstanceRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateInstanceRequestCreation(id, updateInstanceRequest).toEntity(localVarReturnType);
    }

    /**
     * Update a Compute instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateInstanceRequest The updateInstanceRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateInstanceWithResponseSpec(UUID id, UpdateInstanceRequest updateInstanceRequest) throws WebClientResponseException {
        return updateInstanceRequestCreation(id, updateInstanceRequest);
    }
}
