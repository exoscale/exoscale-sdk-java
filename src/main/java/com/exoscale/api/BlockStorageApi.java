package com.exoscale.api;

import com.exoscale.invoker.ApiClient;

import com.exoscale.model.AttachBlockStorageVolumeToInstanceRequest;
import com.exoscale.model.BlockStorageSnapshot;
import com.exoscale.model.BlockStorageVolume;
import com.exoscale.model.CreateBlockStorageSnapshotRequest;
import com.exoscale.model.CreateBlockStorageVolumeRequest;
import com.exoscale.model.ListBlockStorageSnapshots200Response;
import com.exoscale.model.ListBlockStorageVolumes200Response;
import com.exoscale.model.Operation;
import com.exoscale.model.ResizeBlockStorageVolumeRequest;
import java.util.UUID;
import com.exoscale.model.UpdateBlockStorageVolumeLabelsRequest;

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
public class BlockStorageApi {
    private ApiClient apiClient;

    public BlockStorageApi() {
        this(new ApiClient());
    }

    @Autowired
    public BlockStorageApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Attach block storage volume to an instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param attachBlockStorageVolumeToInstanceRequest The attachBlockStorageVolumeToInstanceRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec attachBlockStorageVolumeToInstanceRequestCreation(UUID id, AttachBlockStorageVolumeToInstanceRequest attachBlockStorageVolumeToInstanceRequest) throws WebClientResponseException {
        Object postBody = attachBlockStorageVolumeToInstanceRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling attachBlockStorageVolumeToInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'attachBlockStorageVolumeToInstanceRequest' is set
        if (attachBlockStorageVolumeToInstanceRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'attachBlockStorageVolumeToInstanceRequest' when calling attachBlockStorageVolumeToInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/block-storage/{id}:attach", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Attach block storage volume to an instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param attachBlockStorageVolumeToInstanceRequest The attachBlockStorageVolumeToInstanceRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> attachBlockStorageVolumeToInstance(UUID id, AttachBlockStorageVolumeToInstanceRequest attachBlockStorageVolumeToInstanceRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return attachBlockStorageVolumeToInstanceRequestCreation(id, attachBlockStorageVolumeToInstanceRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Attach block storage volume to an instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param attachBlockStorageVolumeToInstanceRequest The attachBlockStorageVolumeToInstanceRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> attachBlockStorageVolumeToInstanceWithHttpInfo(UUID id, AttachBlockStorageVolumeToInstanceRequest attachBlockStorageVolumeToInstanceRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return attachBlockStorageVolumeToInstanceRequestCreation(id, attachBlockStorageVolumeToInstanceRequest).toEntity(localVarReturnType);
    }

    /**
     * Attach block storage volume to an instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param attachBlockStorageVolumeToInstanceRequest The attachBlockStorageVolumeToInstanceRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec attachBlockStorageVolumeToInstanceWithResponseSpec(UUID id, AttachBlockStorageVolumeToInstanceRequest attachBlockStorageVolumeToInstanceRequest) throws WebClientResponseException {
        return attachBlockStorageVolumeToInstanceRequestCreation(id, attachBlockStorageVolumeToInstanceRequest);
    }
    /**
     * Create a block storage snapshot
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param createBlockStorageSnapshotRequest The createBlockStorageSnapshotRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createBlockStorageSnapshotRequestCreation(UUID id, CreateBlockStorageSnapshotRequest createBlockStorageSnapshotRequest) throws WebClientResponseException {
        Object postBody = createBlockStorageSnapshotRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling createBlockStorageSnapshot", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'createBlockStorageSnapshotRequest' is set
        if (createBlockStorageSnapshotRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createBlockStorageSnapshotRequest' when calling createBlockStorageSnapshot", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/block-storage/{id}:create-snapshot", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a block storage snapshot
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param createBlockStorageSnapshotRequest The createBlockStorageSnapshotRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createBlockStorageSnapshot(UUID id, CreateBlockStorageSnapshotRequest createBlockStorageSnapshotRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createBlockStorageSnapshotRequestCreation(id, createBlockStorageSnapshotRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create a block storage snapshot
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param createBlockStorageSnapshotRequest The createBlockStorageSnapshotRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createBlockStorageSnapshotWithHttpInfo(UUID id, CreateBlockStorageSnapshotRequest createBlockStorageSnapshotRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createBlockStorageSnapshotRequestCreation(id, createBlockStorageSnapshotRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a block storage snapshot
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param createBlockStorageSnapshotRequest The createBlockStorageSnapshotRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createBlockStorageSnapshotWithResponseSpec(UUID id, CreateBlockStorageSnapshotRequest createBlockStorageSnapshotRequest) throws WebClientResponseException {
        return createBlockStorageSnapshotRequestCreation(id, createBlockStorageSnapshotRequest);
    }
    /**
     * Create a block storage volume
     * 
     * <p><b>200</b> - 200
     * @param createBlockStorageVolumeRequest The createBlockStorageVolumeRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createBlockStorageVolumeRequestCreation(CreateBlockStorageVolumeRequest createBlockStorageVolumeRequest) throws WebClientResponseException {
        Object postBody = createBlockStorageVolumeRequest;
        // verify the required parameter 'createBlockStorageVolumeRequest' is set
        if (createBlockStorageVolumeRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createBlockStorageVolumeRequest' when calling createBlockStorageVolume", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/block-storage", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a block storage volume
     * 
     * <p><b>200</b> - 200
     * @param createBlockStorageVolumeRequest The createBlockStorageVolumeRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createBlockStorageVolume(CreateBlockStorageVolumeRequest createBlockStorageVolumeRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createBlockStorageVolumeRequestCreation(createBlockStorageVolumeRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create a block storage volume
     * 
     * <p><b>200</b> - 200
     * @param createBlockStorageVolumeRequest The createBlockStorageVolumeRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createBlockStorageVolumeWithHttpInfo(CreateBlockStorageVolumeRequest createBlockStorageVolumeRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createBlockStorageVolumeRequestCreation(createBlockStorageVolumeRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a block storage volume
     * 
     * <p><b>200</b> - 200
     * @param createBlockStorageVolumeRequest The createBlockStorageVolumeRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createBlockStorageVolumeWithResponseSpec(CreateBlockStorageVolumeRequest createBlockStorageVolumeRequest) throws WebClientResponseException {
        return createBlockStorageVolumeRequestCreation(createBlockStorageVolumeRequest);
    }
    /**
     * Delete a block storage snapshot, data will be unrecoverable
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteBlockStorageSnapshotRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteBlockStorageSnapshot", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/block-storage-snapshot/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a block storage snapshot, data will be unrecoverable
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteBlockStorageSnapshot(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteBlockStorageSnapshotRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a block storage snapshot, data will be unrecoverable
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteBlockStorageSnapshotWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteBlockStorageSnapshotRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Delete a block storage snapshot, data will be unrecoverable
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteBlockStorageSnapshotWithResponseSpec(UUID id) throws WebClientResponseException {
        return deleteBlockStorageSnapshotRequestCreation(id);
    }
    /**
     * Delete a block storage volume, data will be unrecoverable
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteBlockStorageVolumeRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteBlockStorageVolume", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/block-storage/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a block storage volume, data will be unrecoverable
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteBlockStorageVolume(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteBlockStorageVolumeRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a block storage volume, data will be unrecoverable
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteBlockStorageVolumeWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteBlockStorageVolumeRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Delete a block storage volume, data will be unrecoverable
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteBlockStorageVolumeWithResponseSpec(UUID id) throws WebClientResponseException {
        return deleteBlockStorageVolumeRequestCreation(id);
    }
    /**
     * Detach block storage volume
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec detachBlockStorageVolumeRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling detachBlockStorageVolume", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/block-storage/{id}:detach", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Detach block storage volume
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> detachBlockStorageVolume(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return detachBlockStorageVolumeRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Detach block storage volume
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> detachBlockStorageVolumeWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return detachBlockStorageVolumeRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Detach block storage volume
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec detachBlockStorageVolumeWithResponseSpec(UUID id) throws WebClientResponseException {
        return detachBlockStorageVolumeRequestCreation(id);
    }
    /**
     * Retrieve block storage snapshot details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return BlockStorageSnapshot
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getBlockStorageSnapshotRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getBlockStorageSnapshot", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<BlockStorageSnapshot> localVarReturnType = new ParameterizedTypeReference<BlockStorageSnapshot>() {};
        return apiClient.invokeAPI("/block-storage-snapshot/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve block storage snapshot details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return BlockStorageSnapshot
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<BlockStorageSnapshot> getBlockStorageSnapshot(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<BlockStorageSnapshot> localVarReturnType = new ParameterizedTypeReference<BlockStorageSnapshot>() {};
        return getBlockStorageSnapshotRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve block storage snapshot details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;BlockStorageSnapshot&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<BlockStorageSnapshot>> getBlockStorageSnapshotWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<BlockStorageSnapshot> localVarReturnType = new ParameterizedTypeReference<BlockStorageSnapshot>() {};
        return getBlockStorageSnapshotRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Retrieve block storage snapshot details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getBlockStorageSnapshotWithResponseSpec(UUID id) throws WebClientResponseException {
        return getBlockStorageSnapshotRequestCreation(id);
    }
    /**
     * Retrieve block storage volume details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return BlockStorageVolume
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getBlockStorageVolumeRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getBlockStorageVolume", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<BlockStorageVolume> localVarReturnType = new ParameterizedTypeReference<BlockStorageVolume>() {};
        return apiClient.invokeAPI("/block-storage/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve block storage volume details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return BlockStorageVolume
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<BlockStorageVolume> getBlockStorageVolume(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<BlockStorageVolume> localVarReturnType = new ParameterizedTypeReference<BlockStorageVolume>() {};
        return getBlockStorageVolumeRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve block storage volume details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;BlockStorageVolume&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<BlockStorageVolume>> getBlockStorageVolumeWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<BlockStorageVolume> localVarReturnType = new ParameterizedTypeReference<BlockStorageVolume>() {};
        return getBlockStorageVolumeRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Retrieve block storage volume details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getBlockStorageVolumeWithResponseSpec(UUID id) throws WebClientResponseException {
        return getBlockStorageVolumeRequestCreation(id);
    }
    /**
     * List block storage snapshots
     * 
     * <p><b>200</b> - 200
     * @return ListBlockStorageSnapshots200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listBlockStorageSnapshotsRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<ListBlockStorageSnapshots200Response> localVarReturnType = new ParameterizedTypeReference<ListBlockStorageSnapshots200Response>() {};
        return apiClient.invokeAPI("/block-storage-snapshot", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List block storage snapshots
     * 
     * <p><b>200</b> - 200
     * @return ListBlockStorageSnapshots200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListBlockStorageSnapshots200Response> listBlockStorageSnapshots() throws WebClientResponseException {
        ParameterizedTypeReference<ListBlockStorageSnapshots200Response> localVarReturnType = new ParameterizedTypeReference<ListBlockStorageSnapshots200Response>() {};
        return listBlockStorageSnapshotsRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * List block storage snapshots
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;ListBlockStorageSnapshots200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListBlockStorageSnapshots200Response>> listBlockStorageSnapshotsWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<ListBlockStorageSnapshots200Response> localVarReturnType = new ParameterizedTypeReference<ListBlockStorageSnapshots200Response>() {};
        return listBlockStorageSnapshotsRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * List block storage snapshots
     * 
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listBlockStorageSnapshotsWithResponseSpec() throws WebClientResponseException {
        return listBlockStorageSnapshotsRequestCreation();
    }
    /**
     * List block storage volumes
     * 
     * <p><b>200</b> - 200
     * @param instanceId The instanceId parameter
     * @return ListBlockStorageVolumes200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listBlockStorageVolumesRequestCreation(UUID instanceId) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "instance-id", instanceId));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ListBlockStorageVolumes200Response> localVarReturnType = new ParameterizedTypeReference<ListBlockStorageVolumes200Response>() {};
        return apiClient.invokeAPI("/block-storage", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List block storage volumes
     * 
     * <p><b>200</b> - 200
     * @param instanceId The instanceId parameter
     * @return ListBlockStorageVolumes200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListBlockStorageVolumes200Response> listBlockStorageVolumes(UUID instanceId) throws WebClientResponseException {
        ParameterizedTypeReference<ListBlockStorageVolumes200Response> localVarReturnType = new ParameterizedTypeReference<ListBlockStorageVolumes200Response>() {};
        return listBlockStorageVolumesRequestCreation(instanceId).bodyToMono(localVarReturnType);
    }

    /**
     * List block storage volumes
     * 
     * <p><b>200</b> - 200
     * @param instanceId The instanceId parameter
     * @return ResponseEntity&lt;ListBlockStorageVolumes200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListBlockStorageVolumes200Response>> listBlockStorageVolumesWithHttpInfo(UUID instanceId) throws WebClientResponseException {
        ParameterizedTypeReference<ListBlockStorageVolumes200Response> localVarReturnType = new ParameterizedTypeReference<ListBlockStorageVolumes200Response>() {};
        return listBlockStorageVolumesRequestCreation(instanceId).toEntity(localVarReturnType);
    }

    /**
     * List block storage volumes
     * 
     * <p><b>200</b> - 200
     * @param instanceId The instanceId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listBlockStorageVolumesWithResponseSpec(UUID instanceId) throws WebClientResponseException {
        return listBlockStorageVolumesRequestCreation(instanceId);
    }
    /**
     * Resize a block storage volume
     * This operation resizes a Block storage volume. Note: the volume can only grow, cannot be shrunk.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param resizeBlockStorageVolumeRequest The resizeBlockStorageVolumeRequest parameter
     * @return BlockStorageVolume
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec resizeBlockStorageVolumeRequestCreation(UUID id, ResizeBlockStorageVolumeRequest resizeBlockStorageVolumeRequest) throws WebClientResponseException {
        Object postBody = resizeBlockStorageVolumeRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling resizeBlockStorageVolume", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'resizeBlockStorageVolumeRequest' is set
        if (resizeBlockStorageVolumeRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'resizeBlockStorageVolumeRequest' when calling resizeBlockStorageVolume", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<BlockStorageVolume> localVarReturnType = new ParameterizedTypeReference<BlockStorageVolume>() {};
        return apiClient.invokeAPI("/block-storage/{id}:resize-volume", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Resize a block storage volume
     * This operation resizes a Block storage volume. Note: the volume can only grow, cannot be shrunk.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param resizeBlockStorageVolumeRequest The resizeBlockStorageVolumeRequest parameter
     * @return BlockStorageVolume
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<BlockStorageVolume> resizeBlockStorageVolume(UUID id, ResizeBlockStorageVolumeRequest resizeBlockStorageVolumeRequest) throws WebClientResponseException {
        ParameterizedTypeReference<BlockStorageVolume> localVarReturnType = new ParameterizedTypeReference<BlockStorageVolume>() {};
        return resizeBlockStorageVolumeRequestCreation(id, resizeBlockStorageVolumeRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Resize a block storage volume
     * This operation resizes a Block storage volume. Note: the volume can only grow, cannot be shrunk.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param resizeBlockStorageVolumeRequest The resizeBlockStorageVolumeRequest parameter
     * @return ResponseEntity&lt;BlockStorageVolume&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<BlockStorageVolume>> resizeBlockStorageVolumeWithHttpInfo(UUID id, ResizeBlockStorageVolumeRequest resizeBlockStorageVolumeRequest) throws WebClientResponseException {
        ParameterizedTypeReference<BlockStorageVolume> localVarReturnType = new ParameterizedTypeReference<BlockStorageVolume>() {};
        return resizeBlockStorageVolumeRequestCreation(id, resizeBlockStorageVolumeRequest).toEntity(localVarReturnType);
    }

    /**
     * Resize a block storage volume
     * This operation resizes a Block storage volume. Note: the volume can only grow, cannot be shrunk.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param resizeBlockStorageVolumeRequest The resizeBlockStorageVolumeRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec resizeBlockStorageVolumeWithResponseSpec(UUID id, ResizeBlockStorageVolumeRequest resizeBlockStorageVolumeRequest) throws WebClientResponseException {
        return resizeBlockStorageVolumeRequestCreation(id, resizeBlockStorageVolumeRequest);
    }
    /**
     * Set block storage volume labels
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateBlockStorageVolumeLabelsRequest The updateBlockStorageVolumeLabelsRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateBlockStorageVolumeLabelsRequestCreation(UUID id, UpdateBlockStorageVolumeLabelsRequest updateBlockStorageVolumeLabelsRequest) throws WebClientResponseException {
        Object postBody = updateBlockStorageVolumeLabelsRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling updateBlockStorageVolumeLabels", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updateBlockStorageVolumeLabelsRequest' is set
        if (updateBlockStorageVolumeLabelsRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateBlockStorageVolumeLabelsRequest' when calling updateBlockStorageVolumeLabels", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/block-storage/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Set block storage volume labels
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateBlockStorageVolumeLabelsRequest The updateBlockStorageVolumeLabelsRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updateBlockStorageVolumeLabels(UUID id, UpdateBlockStorageVolumeLabelsRequest updateBlockStorageVolumeLabelsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateBlockStorageVolumeLabelsRequestCreation(id, updateBlockStorageVolumeLabelsRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Set block storage volume labels
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateBlockStorageVolumeLabelsRequest The updateBlockStorageVolumeLabelsRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updateBlockStorageVolumeLabelsWithHttpInfo(UUID id, UpdateBlockStorageVolumeLabelsRequest updateBlockStorageVolumeLabelsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateBlockStorageVolumeLabelsRequestCreation(id, updateBlockStorageVolumeLabelsRequest).toEntity(localVarReturnType);
    }

    /**
     * Set block storage volume labels
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateBlockStorageVolumeLabelsRequest The updateBlockStorageVolumeLabelsRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateBlockStorageVolumeLabelsWithResponseSpec(UUID id, UpdateBlockStorageVolumeLabelsRequest updateBlockStorageVolumeLabelsRequest) throws WebClientResponseException {
        return updateBlockStorageVolumeLabelsRequestCreation(id, updateBlockStorageVolumeLabelsRequest);
    }
}
