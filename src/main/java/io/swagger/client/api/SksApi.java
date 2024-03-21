package io.swagger.client.api;

import io.swagger.client.ApiClient;

import io.swagger.client.model.IdNodepoolBody;
import io.swagger.client.model.IdUpgradeBody;
import io.swagger.client.model.InlineResponse20017;
import io.swagger.client.model.InlineResponse20029;
import io.swagger.client.model.InlineResponse20037;
import io.swagger.client.model.InlineResponse2008;
import io.swagger.client.model.NodepoolSksnodepoolidBody;
import io.swagger.client.model.NodepoolSksnodepoolidevictBody;
import io.swagger.client.model.NodepoolSksnodepoolidscaleBody;
import io.swagger.client.model.Operation;
import io.swagger.client.model.SksCluster;
import io.swagger.client.model.SksClusterDeprecatedResource;
import io.swagger.client.model.SksKubeconfigRequest;
import io.swagger.client.model.SksNodepool;
import io.swagger.client.model.SksclusterBody;
import io.swagger.client.model.SksclusterIdBody;
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
@Component("io.swagger.client.api.SksApi")
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
     * @param body  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation createSksCluster(SksclusterBody body) throws RestClientException {
        return createSksClusterWithHttpInfo(body).getBody();
    }

    /**
     * Create an SKS cluster
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> createSksClusterWithHttpInfo(SksclusterBody body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createSksCluster");
        }
        String path = UriComponentsBuilder.fromPath("/sks-cluster").build().toUriString();
        
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
     * Create a new SKS Nodepool
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation createSksNodepool(IdNodepoolBody body, UUID id) throws RestClientException {
        return createSksNodepoolWithHttpInfo(body, id).getBody();
    }

    /**
     * Create a new SKS Nodepool
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> createSksNodepoolWithHttpInfo(IdNodepoolBody body, UUID id) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createSksNodepool");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling createSksNodepool");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/sks-cluster/{id}/nodepool").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete an SKS cluster
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteSksCluster(UUID id) throws RestClientException {
        return deleteSksClusterWithHttpInfo(id).getBody();
    }

    /**
     * Delete an SKS cluster
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteSksClusterWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteSksCluster");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/sks-cluster/{id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete an SKS Nodepool
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @param sksNodepoolId  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteSksNodepool(UUID id, UUID sksNodepoolId) throws RestClientException {
        return deleteSksNodepoolWithHttpInfo(id, sksNodepoolId).getBody();
    }

    /**
     * Delete an SKS Nodepool
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @param sksNodepoolId  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteSksNodepoolWithHttpInfo(UUID id, UUID sksNodepoolId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteSksNodepool");
        }
        // verify the required parameter 'sksNodepoolId' is set
        if (sksNodepoolId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sksNodepoolId' when calling deleteSksNodepool");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("sks-nodepool-id", sksNodepoolId);
        String path = UriComponentsBuilder.fromPath("/sks-cluster/{id}/nodepool/{sks-nodepool-id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Evict Nodepool members
     * This operation evicts the specified Compute instances member from the Nodepool, shrinking it to &#x60;&amp;lt;current nodepool size&amp;gt; - &amp;lt;# evicted members&amp;gt;&#x60;.
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @param sksNodepoolId  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation evictSksNodepoolMembers(NodepoolSksnodepoolidevictBody body, UUID id, UUID sksNodepoolId) throws RestClientException {
        return evictSksNodepoolMembersWithHttpInfo(body, id, sksNodepoolId).getBody();
    }

    /**
     * Evict Nodepool members
     * This operation evicts the specified Compute instances member from the Nodepool, shrinking it to &#x60;&amp;lt;current nodepool size&amp;gt; - &amp;lt;# evicted members&amp;gt;&#x60;.
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @param sksNodepoolId  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> evictSksNodepoolMembersWithHttpInfo(NodepoolSksnodepoolidevictBody body, UUID id, UUID sksNodepoolId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling evictSksNodepoolMembers");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling evictSksNodepoolMembers");
        }
        // verify the required parameter 'sksNodepoolId' is set
        if (sksNodepoolId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sksNodepoolId' when calling evictSksNodepoolMembers");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("sks-nodepool-id", sksNodepoolId);
        String path = UriComponentsBuilder.fromPath("/sks-cluster/{id}/nodepool/{sks-nodepool-id}:evict").buildAndExpand(uriVariables).toUriString();
        
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
     * Generate a new Kubeconfig file for a SKS cluster
     * This operation returns a Kubeconfig file encoded in base64.
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return InlineResponse2008
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse2008 generateSksClusterKubeconfig(SksKubeconfigRequest body, UUID id) throws RestClientException {
        return generateSksClusterKubeconfigWithHttpInfo(body, id).getBody();
    }

    /**
     * Generate a new Kubeconfig file for a SKS cluster
     * This operation returns a Kubeconfig file encoded in base64.
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return ResponseEntity&lt;InlineResponse2008&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse2008> generateSksClusterKubeconfigWithHttpInfo(SksKubeconfigRequest body, UUID id) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling generateSksClusterKubeconfig");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling generateSksClusterKubeconfig");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/sks-cluster-kubeconfig/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<InlineResponse2008> returnType = new ParameterizedTypeReference<InlineResponse2008>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieve SKS cluster details
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return SksCluster
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SksCluster getSksCluster(UUID id) throws RestClientException {
        return getSksClusterWithHttpInfo(id).getBody();
    }

    /**
     * Retrieve SKS cluster details
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ResponseEntity&lt;SksCluster&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SksCluster> getSksClusterWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getSksCluster");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/sks-cluster/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<SksCluster> returnType = new ParameterizedTypeReference<SksCluster>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get the certificate for a SKS cluster authority
     * This operation returns the certificate for the given SKS cluster authority encoded in base64.
     * <p><b>200</b> - 200
     * @param id  (required)
     * @param authority  (required)
     * @return InlineResponse20017
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20017 getSksClusterAuthorityCert(UUID id, String authority) throws RestClientException {
        return getSksClusterAuthorityCertWithHttpInfo(id, authority).getBody();
    }

    /**
     * Get the certificate for a SKS cluster authority
     * This operation returns the certificate for the given SKS cluster authority encoded in base64.
     * <p><b>200</b> - 200
     * @param id  (required)
     * @param authority  (required)
     * @return ResponseEntity&lt;InlineResponse20017&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse20017> getSksClusterAuthorityCertWithHttpInfo(UUID id, String authority) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getSksClusterAuthorityCert");
        }
        // verify the required parameter 'authority' is set
        if (authority == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authority' when calling getSksClusterAuthorityCert");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("authority", authority);
        String path = UriComponentsBuilder.fromPath("/sks-cluster/{id}/authority/{authority}/cert").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<InlineResponse20017> returnType = new ParameterizedTypeReference<InlineResponse20017>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get the latest inspection result
     * Helps troubleshoot common problems when deploying a kubernetes cluster. Inspections run every couple of minutes.
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return Map&lt;String, Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Map<String, Object> getSksClusterInspection(UUID id) throws RestClientException {
        return getSksClusterInspectionWithHttpInfo(id).getBody();
    }

    /**
     * Get the latest inspection result
     * Helps troubleshoot common problems when deploying a kubernetes cluster. Inspections run every couple of minutes.
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ResponseEntity&lt;Map&lt;String, Object&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Map<String, Object>> getSksClusterInspectionWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getSksClusterInspection");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/sks-cluster/{id}/inspection").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Map<String, Object>> returnType = new ParameterizedTypeReference<Map<String, Object>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieve SKS Nodepool details
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @param sksNodepoolId  (required)
     * @return SksNodepool
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SksNodepool getSksNodepool(UUID id, UUID sksNodepoolId) throws RestClientException {
        return getSksNodepoolWithHttpInfo(id, sksNodepoolId).getBody();
    }

    /**
     * Retrieve SKS Nodepool details
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @param sksNodepoolId  (required)
     * @return ResponseEntity&lt;SksNodepool&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SksNodepool> getSksNodepoolWithHttpInfo(UUID id, UUID sksNodepoolId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getSksNodepool");
        }
        // verify the required parameter 'sksNodepoolId' is set
        if (sksNodepoolId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sksNodepoolId' when calling getSksNodepool");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("sks-nodepool-id", sksNodepoolId);
        String path = UriComponentsBuilder.fromPath("/sks-cluster/{id}/nodepool/{sks-nodepool-id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<SksNodepool> returnType = new ParameterizedTypeReference<SksNodepool>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Resources that are scheduled to be removed in future kubernetes releases
     * This operation returns the deprecated resources for a given cluster
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return List&lt;SksClusterDeprecatedResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SksClusterDeprecatedResource> listSksClusterDeprecatedResources(UUID id) throws RestClientException {
        return listSksClusterDeprecatedResourcesWithHttpInfo(id).getBody();
    }

    /**
     * Resources that are scheduled to be removed in future kubernetes releases
     * This operation returns the deprecated resources for a given cluster
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ResponseEntity&lt;List&lt;SksClusterDeprecatedResource&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SksClusterDeprecatedResource>> listSksClusterDeprecatedResourcesWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling listSksClusterDeprecatedResources");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/sks-cluster-deprecated-resources/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<List<SksClusterDeprecatedResource>> returnType = new ParameterizedTypeReference<List<SksClusterDeprecatedResource>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List available versions for SKS clusters
     * 
     * <p><b>200</b> - 200
     * @param includeDeprecated  (optional)
     * @return InlineResponse20037
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20037 listSksClusterVersions(String includeDeprecated) throws RestClientException {
        return listSksClusterVersionsWithHttpInfo(includeDeprecated).getBody();
    }

    /**
     * List available versions for SKS clusters
     * 
     * <p><b>200</b> - 200
     * @param includeDeprecated  (optional)
     * @return ResponseEntity&lt;InlineResponse20037&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse20037> listSksClusterVersionsWithHttpInfo(String includeDeprecated) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/sks-cluster-version").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include-deprecated", includeDeprecated));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<InlineResponse20037> returnType = new ParameterizedTypeReference<InlineResponse20037>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List SKS clusters
     * 
     * <p><b>200</b> - 200
     * @return InlineResponse20029
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20029 listSksClusters() throws RestClientException {
        return listSksClustersWithHttpInfo().getBody();
    }

    /**
     * List SKS clusters
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;InlineResponse20029&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse20029> listSksClustersWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/sks-cluster").build().toUriString();
        
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

        ParameterizedTypeReference<InlineResponse20029> returnType = new ParameterizedTypeReference<InlineResponse20029>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Reset an SKS cluster field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @param field  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation resetSksClusterField(UUID id, String field) throws RestClientException {
        return resetSksClusterFieldWithHttpInfo(id, field).getBody();
    }

    /**
     * Reset an SKS cluster field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @param field  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> resetSksClusterFieldWithHttpInfo(UUID id, String field) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling resetSksClusterField");
        }
        // verify the required parameter 'field' is set
        if (field == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'field' when calling resetSksClusterField");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("field", field);
        String path = UriComponentsBuilder.fromPath("/sks-cluster/{id}/{field}").buildAndExpand(uriVariables).toUriString();
        
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
     * Reset an SKS Nodepool field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @param sksNodepoolId  (required)
     * @param field  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation resetSksNodepoolField(UUID id, UUID sksNodepoolId, String field) throws RestClientException {
        return resetSksNodepoolFieldWithHttpInfo(id, sksNodepoolId, field).getBody();
    }

    /**
     * Reset an SKS Nodepool field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @param sksNodepoolId  (required)
     * @param field  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> resetSksNodepoolFieldWithHttpInfo(UUID id, UUID sksNodepoolId, String field) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling resetSksNodepoolField");
        }
        // verify the required parameter 'sksNodepoolId' is set
        if (sksNodepoolId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sksNodepoolId' when calling resetSksNodepoolField");
        }
        // verify the required parameter 'field' is set
        if (field == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'field' when calling resetSksNodepoolField");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("sks-nodepool-id", sksNodepoolId);
        uriVariables.put("field", field);
        String path = UriComponentsBuilder.fromPath("/sks-cluster/{id}/nodepool/{sks-nodepool-id}/{field}").buildAndExpand(uriVariables).toUriString();
        
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
     * Rotate Exoscale CCM credentials
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation rotateSksCcmCredentials(UUID id) throws RestClientException {
        return rotateSksCcmCredentialsWithHttpInfo(id).getBody();
    }

    /**
     * Rotate Exoscale CCM credentials
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> rotateSksCcmCredentialsWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling rotateSksCcmCredentials");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/sks-cluster/{id}/rotate-ccm-credentials").buildAndExpand(uriVariables).toUriString();
        
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
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Rotate operators certificate authority
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation rotateSksOperatorsCa(UUID id) throws RestClientException {
        return rotateSksOperatorsCaWithHttpInfo(id).getBody();
    }

    /**
     * Rotate operators certificate authority
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> rotateSksOperatorsCaWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling rotateSksOperatorsCa");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/sks-cluster/{id}/rotate-operators-ca").buildAndExpand(uriVariables).toUriString();
        
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
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Scale a SKS Nodepool
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @param sksNodepoolId  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation scaleSksNodepool(NodepoolSksnodepoolidscaleBody body, UUID id, UUID sksNodepoolId) throws RestClientException {
        return scaleSksNodepoolWithHttpInfo(body, id, sksNodepoolId).getBody();
    }

    /**
     * Scale a SKS Nodepool
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @param sksNodepoolId  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> scaleSksNodepoolWithHttpInfo(NodepoolSksnodepoolidscaleBody body, UUID id, UUID sksNodepoolId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling scaleSksNodepool");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling scaleSksNodepool");
        }
        // verify the required parameter 'sksNodepoolId' is set
        if (sksNodepoolId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sksNodepoolId' when calling scaleSksNodepool");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("sks-nodepool-id", sksNodepoolId);
        String path = UriComponentsBuilder.fromPath("/sks-cluster/{id}/nodepool/{sks-nodepool-id}:scale").buildAndExpand(uriVariables).toUriString();
        
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
     * Update an SKS cluster
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation updateSksCluster(SksclusterIdBody body, UUID id) throws RestClientException {
        return updateSksClusterWithHttpInfo(body, id).getBody();
    }

    /**
     * Update an SKS cluster
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> updateSksClusterWithHttpInfo(SksclusterIdBody body, UUID id) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateSksCluster");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateSksCluster");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/sks-cluster/{id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Update an SKS Nodepool
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @param sksNodepoolId  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation updateSksNodepool(NodepoolSksnodepoolidBody body, UUID id, UUID sksNodepoolId) throws RestClientException {
        return updateSksNodepoolWithHttpInfo(body, id, sksNodepoolId).getBody();
    }

    /**
     * Update an SKS Nodepool
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @param sksNodepoolId  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> updateSksNodepoolWithHttpInfo(NodepoolSksnodepoolidBody body, UUID id, UUID sksNodepoolId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateSksNodepool");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateSksNodepool");
        }
        // verify the required parameter 'sksNodepoolId' is set
        if (sksNodepoolId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sksNodepoolId' when calling updateSksNodepool");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("sks-nodepool-id", sksNodepoolId);
        String path = UriComponentsBuilder.fromPath("/sks-cluster/{id}/nodepool/{sks-nodepool-id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Upgrade an SKS cluster
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation upgradeSksCluster(IdUpgradeBody body, UUID id) throws RestClientException {
        return upgradeSksClusterWithHttpInfo(body, id).getBody();
    }

    /**
     * Upgrade an SKS cluster
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> upgradeSksClusterWithHttpInfo(IdUpgradeBody body, UUID id) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling upgradeSksCluster");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling upgradeSksCluster");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/sks-cluster/{id}/upgrade").buildAndExpand(uriVariables).toUriString();
        
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
     * Upgrade a SKS cluster to pro
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation upgradeSksClusterServiceLevel(UUID id) throws RestClientException {
        return upgradeSksClusterServiceLevelWithHttpInfo(id).getBody();
    }

    /**
     * Upgrade a SKS cluster to pro
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> upgradeSksClusterServiceLevelWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling upgradeSksClusterServiceLevel");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/sks-cluster/{id}/upgrade-service-level").buildAndExpand(uriVariables).toUriString();
        
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
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
