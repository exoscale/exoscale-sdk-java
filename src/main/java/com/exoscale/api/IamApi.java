package com.exoscale.api;

import com.exoscale.invoker.ApiClient;

import com.exoscale.model.AccessKey;
import com.exoscale.model.CreateAccessKeyRequest;
import com.exoscale.model.CreateApiKeyRequest;
import com.exoscale.model.CreateIamRoleRequest;
import com.exoscale.model.IamApiKey;
import com.exoscale.model.IamApiKeyCreated;
import com.exoscale.model.IamPolicy;
import com.exoscale.model.IamRole;
import com.exoscale.model.ListAccessKeyKnownOperations200Response;
import com.exoscale.model.ListAccessKeys200Response;
import com.exoscale.model.ListApiKeys200Response;
import com.exoscale.model.ListIamRoles200Response;
import com.exoscale.model.Operation;
import java.util.UUID;
import com.exoscale.model.UpdateIamRoleRequest;

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
     * @param createAccessKeyRequest The createAccessKeyRequest parameter
     * @return AccessKey
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createAccessKeyRequestCreation(CreateAccessKeyRequest createAccessKeyRequest) throws WebClientResponseException {
        Object postBody = createAccessKeyRequest;
        // verify the required parameter 'createAccessKeyRequest' is set
        if (createAccessKeyRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createAccessKeyRequest' when calling createAccessKey", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<AccessKey> localVarReturnType = new ParameterizedTypeReference<AccessKey>() {};
        return apiClient.invokeAPI("/access-key", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a legacy IAM Access Key
     * This operation creates a legacy IAM Access Key, to create a key for use with IAM roles use the api-key endpoint.The corresponding secret is only available in the response returned by this operation, the caller must take care of storing it safely as there is no other way to retrieve it.
     * <p><b>200</b> - 200
     * @param createAccessKeyRequest The createAccessKeyRequest parameter
     * @return AccessKey
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AccessKey> createAccessKey(CreateAccessKeyRequest createAccessKeyRequest) throws WebClientResponseException {
        ParameterizedTypeReference<AccessKey> localVarReturnType = new ParameterizedTypeReference<AccessKey>() {};
        return createAccessKeyRequestCreation(createAccessKeyRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create a legacy IAM Access Key
     * This operation creates a legacy IAM Access Key, to create a key for use with IAM roles use the api-key endpoint.The corresponding secret is only available in the response returned by this operation, the caller must take care of storing it safely as there is no other way to retrieve it.
     * <p><b>200</b> - 200
     * @param createAccessKeyRequest The createAccessKeyRequest parameter
     * @return ResponseEntity&lt;AccessKey&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<AccessKey>> createAccessKeyWithHttpInfo(CreateAccessKeyRequest createAccessKeyRequest) throws WebClientResponseException {
        ParameterizedTypeReference<AccessKey> localVarReturnType = new ParameterizedTypeReference<AccessKey>() {};
        return createAccessKeyRequestCreation(createAccessKeyRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a legacy IAM Access Key
     * This operation creates a legacy IAM Access Key, to create a key for use with IAM roles use the api-key endpoint.The corresponding secret is only available in the response returned by this operation, the caller must take care of storing it safely as there is no other way to retrieve it.
     * <p><b>200</b> - 200
     * @param createAccessKeyRequest The createAccessKeyRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createAccessKeyWithResponseSpec(CreateAccessKeyRequest createAccessKeyRequest) throws WebClientResponseException {
        return createAccessKeyRequestCreation(createAccessKeyRequest);
    }
    /**
     * Create a new API key
     * 
     * <p><b>200</b> - 200
     * @param createApiKeyRequest The createApiKeyRequest parameter
     * @return IamApiKeyCreated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createApiKeyRequestCreation(CreateApiKeyRequest createApiKeyRequest) throws WebClientResponseException {
        Object postBody = createApiKeyRequest;
        // verify the required parameter 'createApiKeyRequest' is set
        if (createApiKeyRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createApiKeyRequest' when calling createApiKey", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<IamApiKeyCreated> localVarReturnType = new ParameterizedTypeReference<IamApiKeyCreated>() {};
        return apiClient.invokeAPI("/api-key", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a new API key
     * 
     * <p><b>200</b> - 200
     * @param createApiKeyRequest The createApiKeyRequest parameter
     * @return IamApiKeyCreated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<IamApiKeyCreated> createApiKey(CreateApiKeyRequest createApiKeyRequest) throws WebClientResponseException {
        ParameterizedTypeReference<IamApiKeyCreated> localVarReturnType = new ParameterizedTypeReference<IamApiKeyCreated>() {};
        return createApiKeyRequestCreation(createApiKeyRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create a new API key
     * 
     * <p><b>200</b> - 200
     * @param createApiKeyRequest The createApiKeyRequest parameter
     * @return ResponseEntity&lt;IamApiKeyCreated&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<IamApiKeyCreated>> createApiKeyWithHttpInfo(CreateApiKeyRequest createApiKeyRequest) throws WebClientResponseException {
        ParameterizedTypeReference<IamApiKeyCreated> localVarReturnType = new ParameterizedTypeReference<IamApiKeyCreated>() {};
        return createApiKeyRequestCreation(createApiKeyRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a new API key
     * 
     * <p><b>200</b> - 200
     * @param createApiKeyRequest The createApiKeyRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createApiKeyWithResponseSpec(CreateApiKeyRequest createApiKeyRequest) throws WebClientResponseException {
        return createApiKeyRequestCreation(createApiKeyRequest);
    }
    /**
     * Create IAM Role
     * 
     * <p><b>200</b> - 200
     * @param createIamRoleRequest The createIamRoleRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createIamRoleRequestCreation(CreateIamRoleRequest createIamRoleRequest) throws WebClientResponseException {
        Object postBody = createIamRoleRequest;
        // verify the required parameter 'createIamRoleRequest' is set
        if (createIamRoleRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createIamRoleRequest' when calling createIamRole", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/iam-role", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create IAM Role
     * 
     * <p><b>200</b> - 200
     * @param createIamRoleRequest The createIamRoleRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createIamRole(CreateIamRoleRequest createIamRoleRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createIamRoleRequestCreation(createIamRoleRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create IAM Role
     * 
     * <p><b>200</b> - 200
     * @param createIamRoleRequest The createIamRoleRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createIamRoleWithHttpInfo(CreateIamRoleRequest createIamRoleRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createIamRoleRequestCreation(createIamRoleRequest).toEntity(localVarReturnType);
    }

    /**
     * Create IAM Role
     * 
     * <p><b>200</b> - 200
     * @param createIamRoleRequest The createIamRoleRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createIamRoleWithResponseSpec(CreateIamRoleRequest createIamRoleRequest) throws WebClientResponseException {
        return createIamRoleRequestCreation(createIamRoleRequest);
    }
    /**
     * Delete an API key
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteApiKeyRequestCreation(String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteApiKey", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/api-key/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete an API key
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteApiKey(String id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteApiKeyRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete an API key
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteApiKeyWithHttpInfo(String id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteApiKeyRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Delete an API key
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteApiKeyWithResponseSpec(String id) throws WebClientResponseException {
        return deleteApiKeyRequestCreation(id);
    }
    /**
     * Delete IAM Role
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteIamRoleRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteIamRole", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/iam-role/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete IAM Role
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteIamRole(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteIamRoleRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete IAM Role
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteIamRoleWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteIamRoleRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Delete IAM Role
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteIamRoleWithResponseSpec(UUID id) throws WebClientResponseException {
        return deleteIamRoleRequestCreation(id);
    }
    /**
     * Retrieve IAM Access Key details
     * 
     * <p><b>200</b> - 200
     * @param key The key parameter
     * @return AccessKey
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getAccessKeyRequestCreation(String key) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new WebClientResponseException("Missing the required parameter 'key' when calling getAccessKey", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("key", key);

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

        ParameterizedTypeReference<AccessKey> localVarReturnType = new ParameterizedTypeReference<AccessKey>() {};
        return apiClient.invokeAPI("/access-key/{key}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve IAM Access Key details
     * 
     * <p><b>200</b> - 200
     * @param key The key parameter
     * @return AccessKey
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AccessKey> getAccessKey(String key) throws WebClientResponseException {
        ParameterizedTypeReference<AccessKey> localVarReturnType = new ParameterizedTypeReference<AccessKey>() {};
        return getAccessKeyRequestCreation(key).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve IAM Access Key details
     * 
     * <p><b>200</b> - 200
     * @param key The key parameter
     * @return ResponseEntity&lt;AccessKey&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<AccessKey>> getAccessKeyWithHttpInfo(String key) throws WebClientResponseException {
        ParameterizedTypeReference<AccessKey> localVarReturnType = new ParameterizedTypeReference<AccessKey>() {};
        return getAccessKeyRequestCreation(key).toEntity(localVarReturnType);
    }

    /**
     * Retrieve IAM Access Key details
     * 
     * <p><b>200</b> - 200
     * @param key The key parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getAccessKeyWithResponseSpec(String key) throws WebClientResponseException {
        return getAccessKeyRequestCreation(key);
    }
    /**
     * Get API key
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return IamApiKey
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getApiKeyRequestCreation(String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getApiKey", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<IamApiKey> localVarReturnType = new ParameterizedTypeReference<IamApiKey>() {};
        return apiClient.invokeAPI("/api-key/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get API key
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return IamApiKey
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<IamApiKey> getApiKey(String id) throws WebClientResponseException {
        ParameterizedTypeReference<IamApiKey> localVarReturnType = new ParameterizedTypeReference<IamApiKey>() {};
        return getApiKeyRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Get API key
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;IamApiKey&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<IamApiKey>> getApiKeyWithHttpInfo(String id) throws WebClientResponseException {
        ParameterizedTypeReference<IamApiKey> localVarReturnType = new ParameterizedTypeReference<IamApiKey>() {};
        return getApiKeyRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Get API key
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getApiKeyWithResponseSpec(String id) throws WebClientResponseException {
        return getApiKeyRequestCreation(id);
    }
    /**
     * Retrieve IAM Organization Policy
     * 
     * <p><b>200</b> - 200
     * @return IamPolicy
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getIamOrganizationPolicyRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<IamPolicy> localVarReturnType = new ParameterizedTypeReference<IamPolicy>() {};
        return apiClient.invokeAPI("/iam-organization-policy", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve IAM Organization Policy
     * 
     * <p><b>200</b> - 200
     * @return IamPolicy
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<IamPolicy> getIamOrganizationPolicy() throws WebClientResponseException {
        ParameterizedTypeReference<IamPolicy> localVarReturnType = new ParameterizedTypeReference<IamPolicy>() {};
        return getIamOrganizationPolicyRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve IAM Organization Policy
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;IamPolicy&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<IamPolicy>> getIamOrganizationPolicyWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<IamPolicy> localVarReturnType = new ParameterizedTypeReference<IamPolicy>() {};
        return getIamOrganizationPolicyRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Retrieve IAM Organization Policy
     * 
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getIamOrganizationPolicyWithResponseSpec() throws WebClientResponseException {
        return getIamOrganizationPolicyRequestCreation();
    }
    /**
     * Retrieve IAM Role
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return IamRole
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getIamRoleRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getIamRole", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<IamRole> localVarReturnType = new ParameterizedTypeReference<IamRole>() {};
        return apiClient.invokeAPI("/iam-role/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve IAM Role
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return IamRole
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<IamRole> getIamRole(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<IamRole> localVarReturnType = new ParameterizedTypeReference<IamRole>() {};
        return getIamRoleRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve IAM Role
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;IamRole&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<IamRole>> getIamRoleWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<IamRole> localVarReturnType = new ParameterizedTypeReference<IamRole>() {};
        return getIamRoleRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Retrieve IAM Role
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getIamRoleWithResponseSpec(UUID id) throws WebClientResponseException {
        return getIamRoleRequestCreation(id);
    }
    /**
     * Retrieve all known available IAM Access Key operations and associated tags
     * 
     * <p><b>200</b> - 200
     * @return ListAccessKeyKnownOperations200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listAccessKeyKnownOperationsRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<ListAccessKeyKnownOperations200Response> localVarReturnType = new ParameterizedTypeReference<ListAccessKeyKnownOperations200Response>() {};
        return apiClient.invokeAPI("/access-key-known-operations", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve all known available IAM Access Key operations and associated tags
     * 
     * <p><b>200</b> - 200
     * @return ListAccessKeyKnownOperations200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListAccessKeyKnownOperations200Response> listAccessKeyKnownOperations() throws WebClientResponseException {
        ParameterizedTypeReference<ListAccessKeyKnownOperations200Response> localVarReturnType = new ParameterizedTypeReference<ListAccessKeyKnownOperations200Response>() {};
        return listAccessKeyKnownOperationsRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve all known available IAM Access Key operations and associated tags
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;ListAccessKeyKnownOperations200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListAccessKeyKnownOperations200Response>> listAccessKeyKnownOperationsWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<ListAccessKeyKnownOperations200Response> localVarReturnType = new ParameterizedTypeReference<ListAccessKeyKnownOperations200Response>() {};
        return listAccessKeyKnownOperationsRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Retrieve all known available IAM Access Key operations and associated tags
     * 
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listAccessKeyKnownOperationsWithResponseSpec() throws WebClientResponseException {
        return listAccessKeyKnownOperationsRequestCreation();
    }
    /**
     * Retrieve IAM Access Key operations and associated tags for the signing key
     * 
     * <p><b>200</b> - 200
     * @return ListAccessKeyKnownOperations200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listAccessKeyOperationsRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<ListAccessKeyKnownOperations200Response> localVarReturnType = new ParameterizedTypeReference<ListAccessKeyKnownOperations200Response>() {};
        return apiClient.invokeAPI("/access-key-operations", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve IAM Access Key operations and associated tags for the signing key
     * 
     * <p><b>200</b> - 200
     * @return ListAccessKeyKnownOperations200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListAccessKeyKnownOperations200Response> listAccessKeyOperations() throws WebClientResponseException {
        ParameterizedTypeReference<ListAccessKeyKnownOperations200Response> localVarReturnType = new ParameterizedTypeReference<ListAccessKeyKnownOperations200Response>() {};
        return listAccessKeyOperationsRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve IAM Access Key operations and associated tags for the signing key
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;ListAccessKeyKnownOperations200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListAccessKeyKnownOperations200Response>> listAccessKeyOperationsWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<ListAccessKeyKnownOperations200Response> localVarReturnType = new ParameterizedTypeReference<ListAccessKeyKnownOperations200Response>() {};
        return listAccessKeyOperationsRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Retrieve IAM Access Key operations and associated tags for the signing key
     * 
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listAccessKeyOperationsWithResponseSpec() throws WebClientResponseException {
        return listAccessKeyOperationsRequestCreation();
    }
    /**
     * List IAM Access Keys
     * 
     * <p><b>200</b> - 200
     * @return ListAccessKeys200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listAccessKeysRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<ListAccessKeys200Response> localVarReturnType = new ParameterizedTypeReference<ListAccessKeys200Response>() {};
        return apiClient.invokeAPI("/access-key", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List IAM Access Keys
     * 
     * <p><b>200</b> - 200
     * @return ListAccessKeys200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListAccessKeys200Response> listAccessKeys() throws WebClientResponseException {
        ParameterizedTypeReference<ListAccessKeys200Response> localVarReturnType = new ParameterizedTypeReference<ListAccessKeys200Response>() {};
        return listAccessKeysRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * List IAM Access Keys
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;ListAccessKeys200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListAccessKeys200Response>> listAccessKeysWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<ListAccessKeys200Response> localVarReturnType = new ParameterizedTypeReference<ListAccessKeys200Response>() {};
        return listAccessKeysRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * List IAM Access Keys
     * 
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listAccessKeysWithResponseSpec() throws WebClientResponseException {
        return listAccessKeysRequestCreation();
    }
    /**
     * List API keys
     * 
     * <p><b>200</b> - 200
     * @return ListApiKeys200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listApiKeysRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<ListApiKeys200Response> localVarReturnType = new ParameterizedTypeReference<ListApiKeys200Response>() {};
        return apiClient.invokeAPI("/api-key", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List API keys
     * 
     * <p><b>200</b> - 200
     * @return ListApiKeys200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListApiKeys200Response> listApiKeys() throws WebClientResponseException {
        ParameterizedTypeReference<ListApiKeys200Response> localVarReturnType = new ParameterizedTypeReference<ListApiKeys200Response>() {};
        return listApiKeysRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * List API keys
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;ListApiKeys200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListApiKeys200Response>> listApiKeysWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<ListApiKeys200Response> localVarReturnType = new ParameterizedTypeReference<ListApiKeys200Response>() {};
        return listApiKeysRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * List API keys
     * 
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listApiKeysWithResponseSpec() throws WebClientResponseException {
        return listApiKeysRequestCreation();
    }
    /**
     * List IAM Roles
     * 
     * <p><b>200</b> - 200
     * @return ListIamRoles200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listIamRolesRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<ListIamRoles200Response> localVarReturnType = new ParameterizedTypeReference<ListIamRoles200Response>() {};
        return apiClient.invokeAPI("/iam-role", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List IAM Roles
     * 
     * <p><b>200</b> - 200
     * @return ListIamRoles200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListIamRoles200Response> listIamRoles() throws WebClientResponseException {
        ParameterizedTypeReference<ListIamRoles200Response> localVarReturnType = new ParameterizedTypeReference<ListIamRoles200Response>() {};
        return listIamRolesRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * List IAM Roles
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;ListIamRoles200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListIamRoles200Response>> listIamRolesWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<ListIamRoles200Response> localVarReturnType = new ParameterizedTypeReference<ListIamRoles200Response>() {};
        return listIamRolesRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * List IAM Roles
     * 
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listIamRolesWithResponseSpec() throws WebClientResponseException {
        return listIamRolesRequestCreation();
    }
    /**
     * Revoke an IAM Access Key
     * This operation revokes the specified IAM Access Key. Access Keys created by the revoked Access Key will not be revoked.
     * <p><b>200</b> - 200
     * @param key The key parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec revokeAccessKeyRequestCreation(String key) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new WebClientResponseException("Missing the required parameter 'key' when calling revokeAccessKey", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("key", key);

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
        return apiClient.invokeAPI("/access-key/{key}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Revoke an IAM Access Key
     * This operation revokes the specified IAM Access Key. Access Keys created by the revoked Access Key will not be revoked.
     * <p><b>200</b> - 200
     * @param key The key parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> revokeAccessKey(String key) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return revokeAccessKeyRequestCreation(key).bodyToMono(localVarReturnType);
    }

    /**
     * Revoke an IAM Access Key
     * This operation revokes the specified IAM Access Key. Access Keys created by the revoked Access Key will not be revoked.
     * <p><b>200</b> - 200
     * @param key The key parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> revokeAccessKeyWithHttpInfo(String key) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return revokeAccessKeyRequestCreation(key).toEntity(localVarReturnType);
    }

    /**
     * Revoke an IAM Access Key
     * This operation revokes the specified IAM Access Key. Access Keys created by the revoked Access Key will not be revoked.
     * <p><b>200</b> - 200
     * @param key The key parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec revokeAccessKeyWithResponseSpec(String key) throws WebClientResponseException {
        return revokeAccessKeyRequestCreation(key);
    }
    /**
     * Update IAM Organization Policy
     * 
     * <p><b>200</b> - 200
     * @param iamPolicy The iamPolicy parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateIamOrganizationPolicyRequestCreation(IamPolicy iamPolicy) throws WebClientResponseException {
        Object postBody = iamPolicy;
        // verify the required parameter 'iamPolicy' is set
        if (iamPolicy == null) {
            throw new WebClientResponseException("Missing the required parameter 'iamPolicy' when calling updateIamOrganizationPolicy", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/iam-organization-policy", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update IAM Organization Policy
     * 
     * <p><b>200</b> - 200
     * @param iamPolicy The iamPolicy parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updateIamOrganizationPolicy(IamPolicy iamPolicy) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateIamOrganizationPolicyRequestCreation(iamPolicy).bodyToMono(localVarReturnType);
    }

    /**
     * Update IAM Organization Policy
     * 
     * <p><b>200</b> - 200
     * @param iamPolicy The iamPolicy parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updateIamOrganizationPolicyWithHttpInfo(IamPolicy iamPolicy) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateIamOrganizationPolicyRequestCreation(iamPolicy).toEntity(localVarReturnType);
    }

    /**
     * Update IAM Organization Policy
     * 
     * <p><b>200</b> - 200
     * @param iamPolicy The iamPolicy parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateIamOrganizationPolicyWithResponseSpec(IamPolicy iamPolicy) throws WebClientResponseException {
        return updateIamOrganizationPolicyRequestCreation(iamPolicy);
    }
    /**
     * Update IAM Role
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateIamRoleRequest The updateIamRoleRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateIamRoleRequestCreation(UUID id, UpdateIamRoleRequest updateIamRoleRequest) throws WebClientResponseException {
        Object postBody = updateIamRoleRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling updateIamRole", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updateIamRoleRequest' is set
        if (updateIamRoleRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateIamRoleRequest' when calling updateIamRole", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/iam-role/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update IAM Role
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateIamRoleRequest The updateIamRoleRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updateIamRole(UUID id, UpdateIamRoleRequest updateIamRoleRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateIamRoleRequestCreation(id, updateIamRoleRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update IAM Role
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateIamRoleRequest The updateIamRoleRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updateIamRoleWithHttpInfo(UUID id, UpdateIamRoleRequest updateIamRoleRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateIamRoleRequestCreation(id, updateIamRoleRequest).toEntity(localVarReturnType);
    }

    /**
     * Update IAM Role
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateIamRoleRequest The updateIamRoleRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateIamRoleWithResponseSpec(UUID id, UpdateIamRoleRequest updateIamRoleRequest) throws WebClientResponseException {
        return updateIamRoleRequestCreation(id, updateIamRoleRequest);
    }
    /**
     * Update IAM Role Policy
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param iamPolicy The iamPolicy parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateIamRolePolicyRequestCreation(UUID id, IamPolicy iamPolicy) throws WebClientResponseException {
        Object postBody = iamPolicy;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling updateIamRolePolicy", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'iamPolicy' is set
        if (iamPolicy == null) {
            throw new WebClientResponseException("Missing the required parameter 'iamPolicy' when calling updateIamRolePolicy", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/iam-role/{id}:policy", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update IAM Role Policy
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param iamPolicy The iamPolicy parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updateIamRolePolicy(UUID id, IamPolicy iamPolicy) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateIamRolePolicyRequestCreation(id, iamPolicy).bodyToMono(localVarReturnType);
    }

    /**
     * Update IAM Role Policy
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param iamPolicy The iamPolicy parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updateIamRolePolicyWithHttpInfo(UUID id, IamPolicy iamPolicy) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateIamRolePolicyRequestCreation(id, iamPolicy).toEntity(localVarReturnType);
    }

    /**
     * Update IAM Role Policy
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param iamPolicy The iamPolicy parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateIamRolePolicyWithResponseSpec(UUID id, IamPolicy iamPolicy) throws WebClientResponseException {
        return updateIamRolePolicyRequestCreation(id, iamPolicy);
    }
}
