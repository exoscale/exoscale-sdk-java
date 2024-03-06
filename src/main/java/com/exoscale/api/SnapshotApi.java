package com.exoscale.api;

import com.exoscale.invoker.ApiClient;

import com.exoscale.model.ListSnapshots200Response;
import com.exoscale.model.Operation;
import com.exoscale.model.PromoteSnapshotToTemplateRequest;
import com.exoscale.model.Snapshot;
import java.util.UUID;

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
public class SnapshotApi {
    private ApiClient apiClient;

    public SnapshotApi() {
        this(new ApiClient());
    }

    @Autowired
    public SnapshotApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
     * Delete a Snapshot
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteSnapshotRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteSnapshot", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/snapshot/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a Snapshot
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteSnapshot(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteSnapshotRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a Snapshot
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteSnapshotWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteSnapshotRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Delete a Snapshot
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteSnapshotWithResponseSpec(UUID id) throws WebClientResponseException {
        return deleteSnapshotRequestCreation(id);
    }
    /**
     * Export a Snapshot
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec exportSnapshotRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling exportSnapshot", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/snapshot/{id}:export", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Export a Snapshot
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> exportSnapshot(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return exportSnapshotRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Export a Snapshot
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> exportSnapshotWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return exportSnapshotRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Export a Snapshot
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec exportSnapshotWithResponseSpec(UUID id) throws WebClientResponseException {
        return exportSnapshotRequestCreation(id);
    }
    /**
     * Retrieve Snapshot details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Snapshot
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getSnapshotRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getSnapshot", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Snapshot> localVarReturnType = new ParameterizedTypeReference<Snapshot>() {};
        return apiClient.invokeAPI("/snapshot/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve Snapshot details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Snapshot
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Snapshot> getSnapshot(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Snapshot> localVarReturnType = new ParameterizedTypeReference<Snapshot>() {};
        return getSnapshotRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve Snapshot details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Snapshot&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Snapshot>> getSnapshotWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Snapshot> localVarReturnType = new ParameterizedTypeReference<Snapshot>() {};
        return getSnapshotRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Retrieve Snapshot details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getSnapshotWithResponseSpec(UUID id) throws WebClientResponseException {
        return getSnapshotRequestCreation(id);
    }
    /**
     * List Snapshots
     * 
     * <p><b>200</b> - 200
     * @return ListSnapshots200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listSnapshotsRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<ListSnapshots200Response> localVarReturnType = new ParameterizedTypeReference<ListSnapshots200Response>() {};
        return apiClient.invokeAPI("/snapshot", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List Snapshots
     * 
     * <p><b>200</b> - 200
     * @return ListSnapshots200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListSnapshots200Response> listSnapshots() throws WebClientResponseException {
        ParameterizedTypeReference<ListSnapshots200Response> localVarReturnType = new ParameterizedTypeReference<ListSnapshots200Response>() {};
        return listSnapshotsRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * List Snapshots
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;ListSnapshots200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListSnapshots200Response>> listSnapshotsWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<ListSnapshots200Response> localVarReturnType = new ParameterizedTypeReference<ListSnapshots200Response>() {};
        return listSnapshotsRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * List Snapshots
     * 
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listSnapshotsWithResponseSpec() throws WebClientResponseException {
        return listSnapshotsRequestCreation();
    }
    /**
     * Promote a Snapshot to a Template
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param promoteSnapshotToTemplateRequest The promoteSnapshotToTemplateRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec promoteSnapshotToTemplateRequestCreation(UUID id, PromoteSnapshotToTemplateRequest promoteSnapshotToTemplateRequest) throws WebClientResponseException {
        Object postBody = promoteSnapshotToTemplateRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling promoteSnapshotToTemplate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'promoteSnapshotToTemplateRequest' is set
        if (promoteSnapshotToTemplateRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'promoteSnapshotToTemplateRequest' when calling promoteSnapshotToTemplate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/snapshot/{id}:promote", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Promote a Snapshot to a Template
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param promoteSnapshotToTemplateRequest The promoteSnapshotToTemplateRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> promoteSnapshotToTemplate(UUID id, PromoteSnapshotToTemplateRequest promoteSnapshotToTemplateRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return promoteSnapshotToTemplateRequestCreation(id, promoteSnapshotToTemplateRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Promote a Snapshot to a Template
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param promoteSnapshotToTemplateRequest The promoteSnapshotToTemplateRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> promoteSnapshotToTemplateWithHttpInfo(UUID id, PromoteSnapshotToTemplateRequest promoteSnapshotToTemplateRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return promoteSnapshotToTemplateRequestCreation(id, promoteSnapshotToTemplateRequest).toEntity(localVarReturnType);
    }

    /**
     * Promote a Snapshot to a Template
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param promoteSnapshotToTemplateRequest The promoteSnapshotToTemplateRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec promoteSnapshotToTemplateWithResponseSpec(UUID id, PromoteSnapshotToTemplateRequest promoteSnapshotToTemplateRequest) throws WebClientResponseException {
        return promoteSnapshotToTemplateRequestCreation(id, promoteSnapshotToTemplateRequest);
    }
}
