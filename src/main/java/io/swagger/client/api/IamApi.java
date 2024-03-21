package io.swagger.client.api;

import io.swagger.client.ApiClient;

import io.swagger.client.model.AccessKey;
import io.swagger.client.model.AccesskeyBody;
import io.swagger.client.model.ApikeyBody;
import io.swagger.client.model.IamApiKey;
import io.swagger.client.model.IamApiKeyCreated;
import io.swagger.client.model.IamPolicy;
import io.swagger.client.model.IamRole;
import io.swagger.client.model.IamroleBody;
import io.swagger.client.model.IamroleIdBody;
import io.swagger.client.model.InlineResponse20015;
import io.swagger.client.model.InlineResponse20018;
import io.swagger.client.model.InlineResponse20023;
import io.swagger.client.model.InlineResponse20039;
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
@Component("io.swagger.client.api.IamApi")
public class IamApi {
    private ApiClient apiClient;

    public IamApi() {
        this(new ApiClient());
    }

    @Autowired
    public IamApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a legacy IAM Access Key
     * This operation creates a legacy IAM Access Key, to create a key for use with IAM roles use the api-key endpoint.The corresponding secret is only available in the response returned by this operation, the caller must take care of storing it safely as there is no other way to retrieve it.
     * <p><b>200</b> - 200
     * @param body  (required)
     * @return AccessKey
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccessKey createAccessKey(AccesskeyBody body) throws RestClientException {
        return createAccessKeyWithHttpInfo(body).getBody();
    }

    /**
     * Create a legacy IAM Access Key
     * This operation creates a legacy IAM Access Key, to create a key for use with IAM roles use the api-key endpoint.The corresponding secret is only available in the response returned by this operation, the caller must take care of storing it safely as there is no other way to retrieve it.
     * <p><b>200</b> - 200
     * @param body  (required)
     * @return ResponseEntity&lt;AccessKey&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccessKey> createAccessKeyWithHttpInfo(AccesskeyBody body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createAccessKey");
        }
        String path = UriComponentsBuilder.fromPath("/access-key").build().toUriString();
        
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

        ParameterizedTypeReference<AccessKey> returnType = new ParameterizedTypeReference<AccessKey>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create a new API key
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @return IamApiKeyCreated
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IamApiKeyCreated createApiKey(ApikeyBody body) throws RestClientException {
        return createApiKeyWithHttpInfo(body).getBody();
    }

    /**
     * Create a new API key
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @return ResponseEntity&lt;IamApiKeyCreated&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IamApiKeyCreated> createApiKeyWithHttpInfo(ApikeyBody body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createApiKey");
        }
        String path = UriComponentsBuilder.fromPath("/api-key").build().toUriString();
        
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

        ParameterizedTypeReference<IamApiKeyCreated> returnType = new ParameterizedTypeReference<IamApiKeyCreated>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create IAM Role
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation createIamRole(IamroleBody body) throws RestClientException {
        return createIamRoleWithHttpInfo(body).getBody();
    }

    /**
     * Create IAM Role
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> createIamRoleWithHttpInfo(IamroleBody body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createIamRole");
        }
        String path = UriComponentsBuilder.fromPath("/iam-role").build().toUriString();
        
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
     * Delete an API key
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteApiKey(String id) throws RestClientException {
        return deleteApiKeyWithHttpInfo(id).getBody();
    }

    /**
     * Delete an API key
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteApiKeyWithHttpInfo(String id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteApiKey");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api-key/{id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete IAM Role
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteIamRole(UUID id) throws RestClientException {
        return deleteIamRoleWithHttpInfo(id).getBody();
    }

    /**
     * Delete IAM Role
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteIamRoleWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteIamRole");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/iam-role/{id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Retrieve IAM Access Key details
     * 
     * <p><b>200</b> - 200
     * @param key  (required)
     * @return AccessKey
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccessKey getAccessKey(String key) throws RestClientException {
        return getAccessKeyWithHttpInfo(key).getBody();
    }

    /**
     * Retrieve IAM Access Key details
     * 
     * <p><b>200</b> - 200
     * @param key  (required)
     * @return ResponseEntity&lt;AccessKey&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccessKey> getAccessKeyWithHttpInfo(String key) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'key' when calling getAccessKey");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("key", key);
        String path = UriComponentsBuilder.fromPath("/access-key/{key}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<AccessKey> returnType = new ParameterizedTypeReference<AccessKey>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get API key
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return IamApiKey
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IamApiKey getApiKey(String id) throws RestClientException {
        return getApiKeyWithHttpInfo(id).getBody();
    }

    /**
     * Get API key
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ResponseEntity&lt;IamApiKey&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IamApiKey> getApiKeyWithHttpInfo(String id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getApiKey");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api-key/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<IamApiKey> returnType = new ParameterizedTypeReference<IamApiKey>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieve IAM Organization Policy
     * 
     * <p><b>200</b> - 200
     * @return IamPolicy
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IamPolicy getIamOrganizationPolicy() throws RestClientException {
        return getIamOrganizationPolicyWithHttpInfo().getBody();
    }

    /**
     * Retrieve IAM Organization Policy
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;IamPolicy&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IamPolicy> getIamOrganizationPolicyWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/iam-organization-policy").build().toUriString();
        
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

        ParameterizedTypeReference<IamPolicy> returnType = new ParameterizedTypeReference<IamPolicy>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieve IAM Role
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return IamRole
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IamRole getIamRole(UUID id) throws RestClientException {
        return getIamRoleWithHttpInfo(id).getBody();
    }

    /**
     * Retrieve IAM Role
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ResponseEntity&lt;IamRole&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IamRole> getIamRoleWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getIamRole");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/iam-role/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<IamRole> returnType = new ParameterizedTypeReference<IamRole>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieve all known available IAM Access Key operations and associated tags
     * 
     * <p><b>200</b> - 200
     * @return InlineResponse20023
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20023 listAccessKeyKnownOperations() throws RestClientException {
        return listAccessKeyKnownOperationsWithHttpInfo().getBody();
    }

    /**
     * Retrieve all known available IAM Access Key operations and associated tags
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;InlineResponse20023&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse20023> listAccessKeyKnownOperationsWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/access-key-known-operations").build().toUriString();
        
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

        ParameterizedTypeReference<InlineResponse20023> returnType = new ParameterizedTypeReference<InlineResponse20023>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieve IAM Access Key operations and associated tags for the signing key
     * 
     * <p><b>200</b> - 200
     * @return InlineResponse20023
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20023 listAccessKeyOperations() throws RestClientException {
        return listAccessKeyOperationsWithHttpInfo().getBody();
    }

    /**
     * Retrieve IAM Access Key operations and associated tags for the signing key
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;InlineResponse20023&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse20023> listAccessKeyOperationsWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/access-key-operations").build().toUriString();
        
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

        ParameterizedTypeReference<InlineResponse20023> returnType = new ParameterizedTypeReference<InlineResponse20023>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List IAM Access Keys
     * 
     * <p><b>200</b> - 200
     * @return InlineResponse20015
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20015 listAccessKeys() throws RestClientException {
        return listAccessKeysWithHttpInfo().getBody();
    }

    /**
     * List IAM Access Keys
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;InlineResponse20015&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse20015> listAccessKeysWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/access-key").build().toUriString();
        
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

        ParameterizedTypeReference<InlineResponse20015> returnType = new ParameterizedTypeReference<InlineResponse20015>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List API keys
     * 
     * <p><b>200</b> - 200
     * @return InlineResponse20018
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20018 listApiKeys() throws RestClientException {
        return listApiKeysWithHttpInfo().getBody();
    }

    /**
     * List API keys
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;InlineResponse20018&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse20018> listApiKeysWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/api-key").build().toUriString();
        
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

        ParameterizedTypeReference<InlineResponse20018> returnType = new ParameterizedTypeReference<InlineResponse20018>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List IAM Roles
     * 
     * <p><b>200</b> - 200
     * @return InlineResponse20039
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20039 listIamRoles() throws RestClientException {
        return listIamRolesWithHttpInfo().getBody();
    }

    /**
     * List IAM Roles
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;InlineResponse20039&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse20039> listIamRolesWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/iam-role").build().toUriString();
        
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

        ParameterizedTypeReference<InlineResponse20039> returnType = new ParameterizedTypeReference<InlineResponse20039>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Revoke an IAM Access Key
     * This operation revokes the specified IAM Access Key. Access Keys created by the revoked Access Key will not be revoked.
     * <p><b>200</b> - 200
     * @param key  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation revokeAccessKey(String key) throws RestClientException {
        return revokeAccessKeyWithHttpInfo(key).getBody();
    }

    /**
     * Revoke an IAM Access Key
     * This operation revokes the specified IAM Access Key. Access Keys created by the revoked Access Key will not be revoked.
     * <p><b>200</b> - 200
     * @param key  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> revokeAccessKeyWithHttpInfo(String key) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'key' when calling revokeAccessKey");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("key", key);
        String path = UriComponentsBuilder.fromPath("/access-key/{key}").buildAndExpand(uriVariables).toUriString();
        
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
     * Update IAM Organization Policy
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation updateIamOrganizationPolicy(IamPolicy body) throws RestClientException {
        return updateIamOrganizationPolicyWithHttpInfo(body).getBody();
    }

    /**
     * Update IAM Organization Policy
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> updateIamOrganizationPolicyWithHttpInfo(IamPolicy body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateIamOrganizationPolicy");
        }
        String path = UriComponentsBuilder.fromPath("/iam-organization-policy").build().toUriString();
        
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
     * Update IAM Role
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation updateIamRole(IamroleIdBody body, UUID id) throws RestClientException {
        return updateIamRoleWithHttpInfo(body, id).getBody();
    }

    /**
     * Update IAM Role
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> updateIamRoleWithHttpInfo(IamroleIdBody body, UUID id) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateIamRole");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateIamRole");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/iam-role/{id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Update IAM Role Policy
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation updateIamRolePolicy(IamPolicy body, UUID id) throws RestClientException {
        return updateIamRolePolicyWithHttpInfo(body, id).getBody();
    }

    /**
     * Update IAM Role Policy
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> updateIamRolePolicyWithHttpInfo(IamPolicy body, UUID id) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateIamRolePolicy");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateIamRolePolicy");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/iam-role/{id}:policy").buildAndExpand(uriVariables).toUriString();
        
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
