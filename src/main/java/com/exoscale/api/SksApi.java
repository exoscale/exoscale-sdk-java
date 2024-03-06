package com.exoscale.api;

import com.exoscale.invoker.ApiClient;

import com.exoscale.model.CreateSksClusterRequest;
import com.exoscale.model.CreateSksNodepoolRequest;
import com.exoscale.model.EvictSksNodepoolMembersRequest;
import com.exoscale.model.GenerateSksClusterKubeconfig200Response;
import com.exoscale.model.GetSksClusterAuthorityCert200Response;
import com.exoscale.model.ListSksClusterVersions200Response;
import com.exoscale.model.ListSksClusters200Response;
import com.exoscale.model.Operation;
import com.exoscale.model.ScaleSksNodepoolRequest;
import com.exoscale.model.SksCluster;
import com.exoscale.model.SksKubeconfigRequest;
import com.exoscale.model.SksNodepool;
import java.util.UUID;
import com.exoscale.model.UpdateSksClusterRequest;
import com.exoscale.model.UpdateSksNodepoolRequest;
import com.exoscale.model.UpgradeSksClusterRequest;

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
public class SksApi {
    private ApiClient apiClient;

    public SksApi() {
        this(new ApiClient());
    }

    @Autowired
    public SksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create an SKS cluster
     * 
     * <p><b>200</b> - 200
     * @param createSksClusterRequest The createSksClusterRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createSksClusterRequestCreation(CreateSksClusterRequest createSksClusterRequest) throws WebClientResponseException {
        Object postBody = createSksClusterRequest;
        // verify the required parameter 'createSksClusterRequest' is set
        if (createSksClusterRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createSksClusterRequest' when calling createSksCluster", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/sks-cluster", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create an SKS cluster
     * 
     * <p><b>200</b> - 200
     * @param createSksClusterRequest The createSksClusterRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createSksCluster(CreateSksClusterRequest createSksClusterRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createSksClusterRequestCreation(createSksClusterRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create an SKS cluster
     * 
     * <p><b>200</b> - 200
     * @param createSksClusterRequest The createSksClusterRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createSksClusterWithHttpInfo(CreateSksClusterRequest createSksClusterRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createSksClusterRequestCreation(createSksClusterRequest).toEntity(localVarReturnType);
    }

    /**
     * Create an SKS cluster
     * 
     * <p><b>200</b> - 200
     * @param createSksClusterRequest The createSksClusterRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createSksClusterWithResponseSpec(CreateSksClusterRequest createSksClusterRequest) throws WebClientResponseException {
        return createSksClusterRequestCreation(createSksClusterRequest);
    }
    /**
     * Create a new SKS Nodepool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param createSksNodepoolRequest The createSksNodepoolRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createSksNodepoolRequestCreation(UUID id, CreateSksNodepoolRequest createSksNodepoolRequest) throws WebClientResponseException {
        Object postBody = createSksNodepoolRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling createSksNodepool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'createSksNodepoolRequest' is set
        if (createSksNodepoolRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createSksNodepoolRequest' when calling createSksNodepool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/sks-cluster/{id}/nodepool", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a new SKS Nodepool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param createSksNodepoolRequest The createSksNodepoolRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createSksNodepool(UUID id, CreateSksNodepoolRequest createSksNodepoolRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createSksNodepoolRequestCreation(id, createSksNodepoolRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create a new SKS Nodepool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param createSksNodepoolRequest The createSksNodepoolRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createSksNodepoolWithHttpInfo(UUID id, CreateSksNodepoolRequest createSksNodepoolRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createSksNodepoolRequestCreation(id, createSksNodepoolRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a new SKS Nodepool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param createSksNodepoolRequest The createSksNodepoolRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createSksNodepoolWithResponseSpec(UUID id, CreateSksNodepoolRequest createSksNodepoolRequest) throws WebClientResponseException {
        return createSksNodepoolRequestCreation(id, createSksNodepoolRequest);
    }
    /**
     * Delete an SKS cluster
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteSksClusterRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteSksCluster", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/sks-cluster/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete an SKS cluster
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteSksCluster(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteSksClusterRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete an SKS cluster
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteSksClusterWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteSksClusterRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Delete an SKS cluster
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteSksClusterWithResponseSpec(UUID id) throws WebClientResponseException {
        return deleteSksClusterRequestCreation(id);
    }
    /**
     * Delete an SKS Nodepool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksNodepoolId The sksNodepoolId parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteSksNodepoolRequestCreation(UUID id, UUID sksNodepoolId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteSksNodepool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'sksNodepoolId' is set
        if (sksNodepoolId == null) {
            throw new WebClientResponseException("Missing the required parameter 'sksNodepoolId' when calling deleteSksNodepool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);
        pathParams.put("sks-nodepool-id", sksNodepoolId);

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
        return apiClient.invokeAPI("/sks-cluster/{id}/nodepool/{sks-nodepool-id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete an SKS Nodepool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksNodepoolId The sksNodepoolId parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteSksNodepool(UUID id, UUID sksNodepoolId) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteSksNodepoolRequestCreation(id, sksNodepoolId).bodyToMono(localVarReturnType);
    }

    /**
     * Delete an SKS Nodepool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksNodepoolId The sksNodepoolId parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteSksNodepoolWithHttpInfo(UUID id, UUID sksNodepoolId) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteSksNodepoolRequestCreation(id, sksNodepoolId).toEntity(localVarReturnType);
    }

    /**
     * Delete an SKS Nodepool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksNodepoolId The sksNodepoolId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteSksNodepoolWithResponseSpec(UUID id, UUID sksNodepoolId) throws WebClientResponseException {
        return deleteSksNodepoolRequestCreation(id, sksNodepoolId);
    }
    /**
     * Evict Nodepool members
     * This operation evicts the specified Compute instances member from the Nodepool, shrinking it to &#x60;&amp;lt;current nodepool size&amp;gt; - &amp;lt;# evicted members&amp;gt;&#x60;.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksNodepoolId The sksNodepoolId parameter
     * @param evictSksNodepoolMembersRequest The evictSksNodepoolMembersRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec evictSksNodepoolMembersRequestCreation(UUID id, UUID sksNodepoolId, EvictSksNodepoolMembersRequest evictSksNodepoolMembersRequest) throws WebClientResponseException {
        Object postBody = evictSksNodepoolMembersRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling evictSksNodepoolMembers", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'sksNodepoolId' is set
        if (sksNodepoolId == null) {
            throw new WebClientResponseException("Missing the required parameter 'sksNodepoolId' when calling evictSksNodepoolMembers", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'evictSksNodepoolMembersRequest' is set
        if (evictSksNodepoolMembersRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'evictSksNodepoolMembersRequest' when calling evictSksNodepoolMembers", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);
        pathParams.put("sks-nodepool-id", sksNodepoolId);

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
        return apiClient.invokeAPI("/sks-cluster/{id}/nodepool/{sks-nodepool-id}:evict", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Evict Nodepool members
     * This operation evicts the specified Compute instances member from the Nodepool, shrinking it to &#x60;&amp;lt;current nodepool size&amp;gt; - &amp;lt;# evicted members&amp;gt;&#x60;.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksNodepoolId The sksNodepoolId parameter
     * @param evictSksNodepoolMembersRequest The evictSksNodepoolMembersRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> evictSksNodepoolMembers(UUID id, UUID sksNodepoolId, EvictSksNodepoolMembersRequest evictSksNodepoolMembersRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return evictSksNodepoolMembersRequestCreation(id, sksNodepoolId, evictSksNodepoolMembersRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Evict Nodepool members
     * This operation evicts the specified Compute instances member from the Nodepool, shrinking it to &#x60;&amp;lt;current nodepool size&amp;gt; - &amp;lt;# evicted members&amp;gt;&#x60;.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksNodepoolId The sksNodepoolId parameter
     * @param evictSksNodepoolMembersRequest The evictSksNodepoolMembersRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> evictSksNodepoolMembersWithHttpInfo(UUID id, UUID sksNodepoolId, EvictSksNodepoolMembersRequest evictSksNodepoolMembersRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return evictSksNodepoolMembersRequestCreation(id, sksNodepoolId, evictSksNodepoolMembersRequest).toEntity(localVarReturnType);
    }

    /**
     * Evict Nodepool members
     * This operation evicts the specified Compute instances member from the Nodepool, shrinking it to &#x60;&amp;lt;current nodepool size&amp;gt; - &amp;lt;# evicted members&amp;gt;&#x60;.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksNodepoolId The sksNodepoolId parameter
     * @param evictSksNodepoolMembersRequest The evictSksNodepoolMembersRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec evictSksNodepoolMembersWithResponseSpec(UUID id, UUID sksNodepoolId, EvictSksNodepoolMembersRequest evictSksNodepoolMembersRequest) throws WebClientResponseException {
        return evictSksNodepoolMembersRequestCreation(id, sksNodepoolId, evictSksNodepoolMembersRequest);
    }
    /**
     * Generate a new Kubeconfig file for a SKS cluster
     * This operation returns a Kubeconfig file encoded in base64.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksKubeconfigRequest The sksKubeconfigRequest parameter
     * @return GenerateSksClusterKubeconfig200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec generateSksClusterKubeconfigRequestCreation(UUID id, SksKubeconfigRequest sksKubeconfigRequest) throws WebClientResponseException {
        Object postBody = sksKubeconfigRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling generateSksClusterKubeconfig", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'sksKubeconfigRequest' is set
        if (sksKubeconfigRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'sksKubeconfigRequest' when calling generateSksClusterKubeconfig", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GenerateSksClusterKubeconfig200Response> localVarReturnType = new ParameterizedTypeReference<GenerateSksClusterKubeconfig200Response>() {};
        return apiClient.invokeAPI("/sks-cluster-kubeconfig/{id}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Generate a new Kubeconfig file for a SKS cluster
     * This operation returns a Kubeconfig file encoded in base64.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksKubeconfigRequest The sksKubeconfigRequest parameter
     * @return GenerateSksClusterKubeconfig200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GenerateSksClusterKubeconfig200Response> generateSksClusterKubeconfig(UUID id, SksKubeconfigRequest sksKubeconfigRequest) throws WebClientResponseException {
        ParameterizedTypeReference<GenerateSksClusterKubeconfig200Response> localVarReturnType = new ParameterizedTypeReference<GenerateSksClusterKubeconfig200Response>() {};
        return generateSksClusterKubeconfigRequestCreation(id, sksKubeconfigRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Generate a new Kubeconfig file for a SKS cluster
     * This operation returns a Kubeconfig file encoded in base64.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksKubeconfigRequest The sksKubeconfigRequest parameter
     * @return ResponseEntity&lt;GenerateSksClusterKubeconfig200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GenerateSksClusterKubeconfig200Response>> generateSksClusterKubeconfigWithHttpInfo(UUID id, SksKubeconfigRequest sksKubeconfigRequest) throws WebClientResponseException {
        ParameterizedTypeReference<GenerateSksClusterKubeconfig200Response> localVarReturnType = new ParameterizedTypeReference<GenerateSksClusterKubeconfig200Response>() {};
        return generateSksClusterKubeconfigRequestCreation(id, sksKubeconfigRequest).toEntity(localVarReturnType);
    }

    /**
     * Generate a new Kubeconfig file for a SKS cluster
     * This operation returns a Kubeconfig file encoded in base64.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksKubeconfigRequest The sksKubeconfigRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec generateSksClusterKubeconfigWithResponseSpec(UUID id, SksKubeconfigRequest sksKubeconfigRequest) throws WebClientResponseException {
        return generateSksClusterKubeconfigRequestCreation(id, sksKubeconfigRequest);
    }
    /**
     * Retrieve SKS cluster details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return SksCluster
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getSksClusterRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getSksCluster", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<SksCluster> localVarReturnType = new ParameterizedTypeReference<SksCluster>() {};
        return apiClient.invokeAPI("/sks-cluster/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve SKS cluster details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return SksCluster
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SksCluster> getSksCluster(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<SksCluster> localVarReturnType = new ParameterizedTypeReference<SksCluster>() {};
        return getSksClusterRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve SKS cluster details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;SksCluster&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SksCluster>> getSksClusterWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<SksCluster> localVarReturnType = new ParameterizedTypeReference<SksCluster>() {};
        return getSksClusterRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Retrieve SKS cluster details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getSksClusterWithResponseSpec(UUID id) throws WebClientResponseException {
        return getSksClusterRequestCreation(id);
    }
    /**
     * Get the certificate for a SKS cluster authority
     * This operation returns the certificate for the given SKS cluster authority encoded in base64.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param authority The authority parameter
     * @return GetSksClusterAuthorityCert200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getSksClusterAuthorityCertRequestCreation(UUID id, String authority) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getSksClusterAuthorityCert", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'authority' is set
        if (authority == null) {
            throw new WebClientResponseException("Missing the required parameter 'authority' when calling getSksClusterAuthorityCert", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);
        pathParams.put("authority", authority);

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

        ParameterizedTypeReference<GetSksClusterAuthorityCert200Response> localVarReturnType = new ParameterizedTypeReference<GetSksClusterAuthorityCert200Response>() {};
        return apiClient.invokeAPI("/sks-cluster/{id}/authority/{authority}/cert", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the certificate for a SKS cluster authority
     * This operation returns the certificate for the given SKS cluster authority encoded in base64.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param authority The authority parameter
     * @return GetSksClusterAuthorityCert200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetSksClusterAuthorityCert200Response> getSksClusterAuthorityCert(UUID id, String authority) throws WebClientResponseException {
        ParameterizedTypeReference<GetSksClusterAuthorityCert200Response> localVarReturnType = new ParameterizedTypeReference<GetSksClusterAuthorityCert200Response>() {};
        return getSksClusterAuthorityCertRequestCreation(id, authority).bodyToMono(localVarReturnType);
    }

    /**
     * Get the certificate for a SKS cluster authority
     * This operation returns the certificate for the given SKS cluster authority encoded in base64.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param authority The authority parameter
     * @return ResponseEntity&lt;GetSksClusterAuthorityCert200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetSksClusterAuthorityCert200Response>> getSksClusterAuthorityCertWithHttpInfo(UUID id, String authority) throws WebClientResponseException {
        ParameterizedTypeReference<GetSksClusterAuthorityCert200Response> localVarReturnType = new ParameterizedTypeReference<GetSksClusterAuthorityCert200Response>() {};
        return getSksClusterAuthorityCertRequestCreation(id, authority).toEntity(localVarReturnType);
    }

    /**
     * Get the certificate for a SKS cluster authority
     * This operation returns the certificate for the given SKS cluster authority encoded in base64.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param authority The authority parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getSksClusterAuthorityCertWithResponseSpec(UUID id, String authority) throws WebClientResponseException {
        return getSksClusterAuthorityCertRequestCreation(id, authority);
    }
    /**
     * Get the latest inspection result
     * Helps troubleshoot common problems when deploying a kubernetes cluster. Inspections run every couple of minutes.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Map&lt;String, Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getSksClusterInspectionRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getSksClusterInspection", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return apiClient.invokeAPI("/sks-cluster/{id}/inspection", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the latest inspection result
     * Helps troubleshoot common problems when deploying a kubernetes cluster. Inspections run every couple of minutes.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Map&lt;String, Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Map<String, Object>> getSksClusterInspection(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return getSksClusterInspectionRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Get the latest inspection result
     * Helps troubleshoot common problems when deploying a kubernetes cluster. Inspections run every couple of minutes.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Map&lt;String, Object&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Map<String, Object>>> getSksClusterInspectionWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Map<String, Object>> localVarReturnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return getSksClusterInspectionRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Get the latest inspection result
     * Helps troubleshoot common problems when deploying a kubernetes cluster. Inspections run every couple of minutes.
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getSksClusterInspectionWithResponseSpec(UUID id) throws WebClientResponseException {
        return getSksClusterInspectionRequestCreation(id);
    }
    /**
     * Retrieve SKS Nodepool details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksNodepoolId The sksNodepoolId parameter
     * @return SksNodepool
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getSksNodepoolRequestCreation(UUID id, UUID sksNodepoolId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getSksNodepool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'sksNodepoolId' is set
        if (sksNodepoolId == null) {
            throw new WebClientResponseException("Missing the required parameter 'sksNodepoolId' when calling getSksNodepool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);
        pathParams.put("sks-nodepool-id", sksNodepoolId);

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

        ParameterizedTypeReference<SksNodepool> localVarReturnType = new ParameterizedTypeReference<SksNodepool>() {};
        return apiClient.invokeAPI("/sks-cluster/{id}/nodepool/{sks-nodepool-id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve SKS Nodepool details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksNodepoolId The sksNodepoolId parameter
     * @return SksNodepool
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SksNodepool> getSksNodepool(UUID id, UUID sksNodepoolId) throws WebClientResponseException {
        ParameterizedTypeReference<SksNodepool> localVarReturnType = new ParameterizedTypeReference<SksNodepool>() {};
        return getSksNodepoolRequestCreation(id, sksNodepoolId).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve SKS Nodepool details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksNodepoolId The sksNodepoolId parameter
     * @return ResponseEntity&lt;SksNodepool&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SksNodepool>> getSksNodepoolWithHttpInfo(UUID id, UUID sksNodepoolId) throws WebClientResponseException {
        ParameterizedTypeReference<SksNodepool> localVarReturnType = new ParameterizedTypeReference<SksNodepool>() {};
        return getSksNodepoolRequestCreation(id, sksNodepoolId).toEntity(localVarReturnType);
    }

    /**
     * Retrieve SKS Nodepool details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksNodepoolId The sksNodepoolId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getSksNodepoolWithResponseSpec(UUID id, UUID sksNodepoolId) throws WebClientResponseException {
        return getSksNodepoolRequestCreation(id, sksNodepoolId);
    }
    /**
     * Resources that are scheduled to be removed in future kubernetes releases
     * This operation returns the deprecated resources for a given cluster
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return List&lt;Map&lt;String, String&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listSksClusterDeprecatedResourcesRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling listSksClusterDeprecatedResources", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return apiClient.invokeAPI("/sks-cluster-deprecated-resources/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Resources that are scheduled to be removed in future kubernetes releases
     * This operation returns the deprecated resources for a given cluster
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return List&lt;Map&lt;String, String&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Map> listSksClusterDeprecatedResources(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return listSksClusterDeprecatedResourcesRequestCreation(id).bodyToFlux(localVarReturnType);
    }

    /**
     * Resources that are scheduled to be removed in future kubernetes releases
     * This operation returns the deprecated resources for a given cluster
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;List&lt;Map&lt;String, String&gt;&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Map>>> listSksClusterDeprecatedResourcesWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Map> localVarReturnType = new ParameterizedTypeReference<Map>() {};
        return listSksClusterDeprecatedResourcesRequestCreation(id).toEntityList(localVarReturnType);
    }

    /**
     * Resources that are scheduled to be removed in future kubernetes releases
     * This operation returns the deprecated resources for a given cluster
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listSksClusterDeprecatedResourcesWithResponseSpec(UUID id) throws WebClientResponseException {
        return listSksClusterDeprecatedResourcesRequestCreation(id);
    }
    /**
     * List available versions for SKS clusters
     * 
     * <p><b>200</b> - 200
     * @param includeDeprecated The includeDeprecated parameter
     * @return ListSksClusterVersions200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listSksClusterVersionsRequestCreation(String includeDeprecated) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include-deprecated", includeDeprecated));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ListSksClusterVersions200Response> localVarReturnType = new ParameterizedTypeReference<ListSksClusterVersions200Response>() {};
        return apiClient.invokeAPI("/sks-cluster-version", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List available versions for SKS clusters
     * 
     * <p><b>200</b> - 200
     * @param includeDeprecated The includeDeprecated parameter
     * @return ListSksClusterVersions200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListSksClusterVersions200Response> listSksClusterVersions(String includeDeprecated) throws WebClientResponseException {
        ParameterizedTypeReference<ListSksClusterVersions200Response> localVarReturnType = new ParameterizedTypeReference<ListSksClusterVersions200Response>() {};
        return listSksClusterVersionsRequestCreation(includeDeprecated).bodyToMono(localVarReturnType);
    }

    /**
     * List available versions for SKS clusters
     * 
     * <p><b>200</b> - 200
     * @param includeDeprecated The includeDeprecated parameter
     * @return ResponseEntity&lt;ListSksClusterVersions200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListSksClusterVersions200Response>> listSksClusterVersionsWithHttpInfo(String includeDeprecated) throws WebClientResponseException {
        ParameterizedTypeReference<ListSksClusterVersions200Response> localVarReturnType = new ParameterizedTypeReference<ListSksClusterVersions200Response>() {};
        return listSksClusterVersionsRequestCreation(includeDeprecated).toEntity(localVarReturnType);
    }

    /**
     * List available versions for SKS clusters
     * 
     * <p><b>200</b> - 200
     * @param includeDeprecated The includeDeprecated parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listSksClusterVersionsWithResponseSpec(String includeDeprecated) throws WebClientResponseException {
        return listSksClusterVersionsRequestCreation(includeDeprecated);
    }
    /**
     * List SKS clusters
     * 
     * <p><b>200</b> - 200
     * @return ListSksClusters200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listSksClustersRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<ListSksClusters200Response> localVarReturnType = new ParameterizedTypeReference<ListSksClusters200Response>() {};
        return apiClient.invokeAPI("/sks-cluster", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List SKS clusters
     * 
     * <p><b>200</b> - 200
     * @return ListSksClusters200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListSksClusters200Response> listSksClusters() throws WebClientResponseException {
        ParameterizedTypeReference<ListSksClusters200Response> localVarReturnType = new ParameterizedTypeReference<ListSksClusters200Response>() {};
        return listSksClustersRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * List SKS clusters
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;ListSksClusters200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListSksClusters200Response>> listSksClustersWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<ListSksClusters200Response> localVarReturnType = new ParameterizedTypeReference<ListSksClusters200Response>() {};
        return listSksClustersRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * List SKS clusters
     * 
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listSksClustersWithResponseSpec() throws WebClientResponseException {
        return listSksClustersRequestCreation();
    }
    /**
     * Reset an SKS cluster field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param field The field parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec resetSksClusterFieldRequestCreation(UUID id, String field) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling resetSksClusterField", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'field' is set
        if (field == null) {
            throw new WebClientResponseException("Missing the required parameter 'field' when calling resetSksClusterField", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/sks-cluster/{id}/{field}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Reset an SKS cluster field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param field The field parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> resetSksClusterField(UUID id, String field) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetSksClusterFieldRequestCreation(id, field).bodyToMono(localVarReturnType);
    }

    /**
     * Reset an SKS cluster field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param field The field parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> resetSksClusterFieldWithHttpInfo(UUID id, String field) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetSksClusterFieldRequestCreation(id, field).toEntity(localVarReturnType);
    }

    /**
     * Reset an SKS cluster field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param field The field parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec resetSksClusterFieldWithResponseSpec(UUID id, String field) throws WebClientResponseException {
        return resetSksClusterFieldRequestCreation(id, field);
    }
    /**
     * Reset an SKS Nodepool field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksNodepoolId The sksNodepoolId parameter
     * @param field The field parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec resetSksNodepoolFieldRequestCreation(UUID id, UUID sksNodepoolId, String field) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling resetSksNodepoolField", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'sksNodepoolId' is set
        if (sksNodepoolId == null) {
            throw new WebClientResponseException("Missing the required parameter 'sksNodepoolId' when calling resetSksNodepoolField", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'field' is set
        if (field == null) {
            throw new WebClientResponseException("Missing the required parameter 'field' when calling resetSksNodepoolField", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);
        pathParams.put("sks-nodepool-id", sksNodepoolId);
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
        return apiClient.invokeAPI("/sks-cluster/{id}/nodepool/{sks-nodepool-id}/{field}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Reset an SKS Nodepool field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksNodepoolId The sksNodepoolId parameter
     * @param field The field parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> resetSksNodepoolField(UUID id, UUID sksNodepoolId, String field) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetSksNodepoolFieldRequestCreation(id, sksNodepoolId, field).bodyToMono(localVarReturnType);
    }

    /**
     * Reset an SKS Nodepool field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksNodepoolId The sksNodepoolId parameter
     * @param field The field parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> resetSksNodepoolFieldWithHttpInfo(UUID id, UUID sksNodepoolId, String field) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetSksNodepoolFieldRequestCreation(id, sksNodepoolId, field).toEntity(localVarReturnType);
    }

    /**
     * Reset an SKS Nodepool field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksNodepoolId The sksNodepoolId parameter
     * @param field The field parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec resetSksNodepoolFieldWithResponseSpec(UUID id, UUID sksNodepoolId, String field) throws WebClientResponseException {
        return resetSksNodepoolFieldRequestCreation(id, sksNodepoolId, field);
    }
    /**
     * Rotate Exoscale CCM credentials
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec rotateSksCcmCredentialsRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling rotateSksCcmCredentials", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/sks-cluster/{id}/rotate-ccm-credentials", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Rotate Exoscale CCM credentials
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> rotateSksCcmCredentials(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return rotateSksCcmCredentialsRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Rotate Exoscale CCM credentials
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> rotateSksCcmCredentialsWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return rotateSksCcmCredentialsRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Rotate Exoscale CCM credentials
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec rotateSksCcmCredentialsWithResponseSpec(UUID id) throws WebClientResponseException {
        return rotateSksCcmCredentialsRequestCreation(id);
    }
    /**
     * Rotate operators certificate authority
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec rotateSksOperatorsCaRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling rotateSksOperatorsCa", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/sks-cluster/{id}/rotate-operators-ca", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Rotate operators certificate authority
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> rotateSksOperatorsCa(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return rotateSksOperatorsCaRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Rotate operators certificate authority
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> rotateSksOperatorsCaWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return rotateSksOperatorsCaRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Rotate operators certificate authority
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec rotateSksOperatorsCaWithResponseSpec(UUID id) throws WebClientResponseException {
        return rotateSksOperatorsCaRequestCreation(id);
    }
    /**
     * Scale a SKS Nodepool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksNodepoolId The sksNodepoolId parameter
     * @param scaleSksNodepoolRequest The scaleSksNodepoolRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec scaleSksNodepoolRequestCreation(UUID id, UUID sksNodepoolId, ScaleSksNodepoolRequest scaleSksNodepoolRequest) throws WebClientResponseException {
        Object postBody = scaleSksNodepoolRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling scaleSksNodepool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'sksNodepoolId' is set
        if (sksNodepoolId == null) {
            throw new WebClientResponseException("Missing the required parameter 'sksNodepoolId' when calling scaleSksNodepool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'scaleSksNodepoolRequest' is set
        if (scaleSksNodepoolRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'scaleSksNodepoolRequest' when calling scaleSksNodepool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);
        pathParams.put("sks-nodepool-id", sksNodepoolId);

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
        return apiClient.invokeAPI("/sks-cluster/{id}/nodepool/{sks-nodepool-id}:scale", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Scale a SKS Nodepool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksNodepoolId The sksNodepoolId parameter
     * @param scaleSksNodepoolRequest The scaleSksNodepoolRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> scaleSksNodepool(UUID id, UUID sksNodepoolId, ScaleSksNodepoolRequest scaleSksNodepoolRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return scaleSksNodepoolRequestCreation(id, sksNodepoolId, scaleSksNodepoolRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Scale a SKS Nodepool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksNodepoolId The sksNodepoolId parameter
     * @param scaleSksNodepoolRequest The scaleSksNodepoolRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> scaleSksNodepoolWithHttpInfo(UUID id, UUID sksNodepoolId, ScaleSksNodepoolRequest scaleSksNodepoolRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return scaleSksNodepoolRequestCreation(id, sksNodepoolId, scaleSksNodepoolRequest).toEntity(localVarReturnType);
    }

    /**
     * Scale a SKS Nodepool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksNodepoolId The sksNodepoolId parameter
     * @param scaleSksNodepoolRequest The scaleSksNodepoolRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec scaleSksNodepoolWithResponseSpec(UUID id, UUID sksNodepoolId, ScaleSksNodepoolRequest scaleSksNodepoolRequest) throws WebClientResponseException {
        return scaleSksNodepoolRequestCreation(id, sksNodepoolId, scaleSksNodepoolRequest);
    }
    /**
     * Update an SKS cluster
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateSksClusterRequest The updateSksClusterRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateSksClusterRequestCreation(UUID id, UpdateSksClusterRequest updateSksClusterRequest) throws WebClientResponseException {
        Object postBody = updateSksClusterRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling updateSksCluster", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updateSksClusterRequest' is set
        if (updateSksClusterRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateSksClusterRequest' when calling updateSksCluster", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/sks-cluster/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update an SKS cluster
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateSksClusterRequest The updateSksClusterRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updateSksCluster(UUID id, UpdateSksClusterRequest updateSksClusterRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateSksClusterRequestCreation(id, updateSksClusterRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update an SKS cluster
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateSksClusterRequest The updateSksClusterRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updateSksClusterWithHttpInfo(UUID id, UpdateSksClusterRequest updateSksClusterRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateSksClusterRequestCreation(id, updateSksClusterRequest).toEntity(localVarReturnType);
    }

    /**
     * Update an SKS cluster
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateSksClusterRequest The updateSksClusterRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateSksClusterWithResponseSpec(UUID id, UpdateSksClusterRequest updateSksClusterRequest) throws WebClientResponseException {
        return updateSksClusterRequestCreation(id, updateSksClusterRequest);
    }
    /**
     * Update an SKS Nodepool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksNodepoolId The sksNodepoolId parameter
     * @param updateSksNodepoolRequest The updateSksNodepoolRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateSksNodepoolRequestCreation(UUID id, UUID sksNodepoolId, UpdateSksNodepoolRequest updateSksNodepoolRequest) throws WebClientResponseException {
        Object postBody = updateSksNodepoolRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling updateSksNodepool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'sksNodepoolId' is set
        if (sksNodepoolId == null) {
            throw new WebClientResponseException("Missing the required parameter 'sksNodepoolId' when calling updateSksNodepool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updateSksNodepoolRequest' is set
        if (updateSksNodepoolRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateSksNodepoolRequest' when calling updateSksNodepool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);
        pathParams.put("sks-nodepool-id", sksNodepoolId);

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
        return apiClient.invokeAPI("/sks-cluster/{id}/nodepool/{sks-nodepool-id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update an SKS Nodepool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksNodepoolId The sksNodepoolId parameter
     * @param updateSksNodepoolRequest The updateSksNodepoolRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updateSksNodepool(UUID id, UUID sksNodepoolId, UpdateSksNodepoolRequest updateSksNodepoolRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateSksNodepoolRequestCreation(id, sksNodepoolId, updateSksNodepoolRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update an SKS Nodepool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksNodepoolId The sksNodepoolId parameter
     * @param updateSksNodepoolRequest The updateSksNodepoolRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updateSksNodepoolWithHttpInfo(UUID id, UUID sksNodepoolId, UpdateSksNodepoolRequest updateSksNodepoolRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateSksNodepoolRequestCreation(id, sksNodepoolId, updateSksNodepoolRequest).toEntity(localVarReturnType);
    }

    /**
     * Update an SKS Nodepool
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param sksNodepoolId The sksNodepoolId parameter
     * @param updateSksNodepoolRequest The updateSksNodepoolRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateSksNodepoolWithResponseSpec(UUID id, UUID sksNodepoolId, UpdateSksNodepoolRequest updateSksNodepoolRequest) throws WebClientResponseException {
        return updateSksNodepoolRequestCreation(id, sksNodepoolId, updateSksNodepoolRequest);
    }
    /**
     * Upgrade an SKS cluster
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param upgradeSksClusterRequest The upgradeSksClusterRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec upgradeSksClusterRequestCreation(UUID id, UpgradeSksClusterRequest upgradeSksClusterRequest) throws WebClientResponseException {
        Object postBody = upgradeSksClusterRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling upgradeSksCluster", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'upgradeSksClusterRequest' is set
        if (upgradeSksClusterRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'upgradeSksClusterRequest' when calling upgradeSksCluster", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/sks-cluster/{id}/upgrade", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Upgrade an SKS cluster
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param upgradeSksClusterRequest The upgradeSksClusterRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> upgradeSksCluster(UUID id, UpgradeSksClusterRequest upgradeSksClusterRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return upgradeSksClusterRequestCreation(id, upgradeSksClusterRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Upgrade an SKS cluster
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param upgradeSksClusterRequest The upgradeSksClusterRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> upgradeSksClusterWithHttpInfo(UUID id, UpgradeSksClusterRequest upgradeSksClusterRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return upgradeSksClusterRequestCreation(id, upgradeSksClusterRequest).toEntity(localVarReturnType);
    }

    /**
     * Upgrade an SKS cluster
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param upgradeSksClusterRequest The upgradeSksClusterRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec upgradeSksClusterWithResponseSpec(UUID id, UpgradeSksClusterRequest upgradeSksClusterRequest) throws WebClientResponseException {
        return upgradeSksClusterRequestCreation(id, upgradeSksClusterRequest);
    }
    /**
     * Upgrade a SKS cluster to pro
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec upgradeSksClusterServiceLevelRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling upgradeSksClusterServiceLevel", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/sks-cluster/{id}/upgrade-service-level", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Upgrade a SKS cluster to pro
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> upgradeSksClusterServiceLevel(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return upgradeSksClusterServiceLevelRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Upgrade a SKS cluster to pro
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> upgradeSksClusterServiceLevelWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return upgradeSksClusterServiceLevelRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Upgrade a SKS cluster to pro
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec upgradeSksClusterServiceLevelWithResponseSpec(UUID id) throws WebClientResponseException {
        return upgradeSksClusterServiceLevelRequestCreation(id);
    }
}
