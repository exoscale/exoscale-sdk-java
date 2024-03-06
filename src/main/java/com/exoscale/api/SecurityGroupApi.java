package com.exoscale.api;

import com.exoscale.invoker.ApiClient;

import com.exoscale.model.AddExternalSourceToSecurityGroupRequest;
import com.exoscale.model.AddRuleToSecurityGroupRequest;
import com.exoscale.model.CreateSecurityGroupRequest;
import com.exoscale.model.DetachInstanceFromPrivateNetworkRequest;
import com.exoscale.model.ListSecurityGroups200Response;
import com.exoscale.model.Operation;
import com.exoscale.model.RemoveExternalSourceFromSecurityGroupRequest;
import com.exoscale.model.SecurityGroup;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T21:01:33.231699+01:00[Europe/Vienna]")
public class SecurityGroupApi {
    private ApiClient apiClient;

    public SecurityGroupApi() {
        this(new ApiClient());
    }

    @Autowired
    public SecurityGroupApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add an external source as a member of a Security Group
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param addExternalSourceToSecurityGroupRequest The addExternalSourceToSecurityGroupRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addExternalSourceToSecurityGroupRequestCreation(UUID id, AddExternalSourceToSecurityGroupRequest addExternalSourceToSecurityGroupRequest) throws WebClientResponseException {
        Object postBody = addExternalSourceToSecurityGroupRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling addExternalSourceToSecurityGroup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'addExternalSourceToSecurityGroupRequest' is set
        if (addExternalSourceToSecurityGroupRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'addExternalSourceToSecurityGroupRequest' when calling addExternalSourceToSecurityGroup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/security-group/{id}:add-source", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add an external source as a member of a Security Group
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param addExternalSourceToSecurityGroupRequest The addExternalSourceToSecurityGroupRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> addExternalSourceToSecurityGroup(UUID id, AddExternalSourceToSecurityGroupRequest addExternalSourceToSecurityGroupRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return addExternalSourceToSecurityGroupRequestCreation(id, addExternalSourceToSecurityGroupRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Add an external source as a member of a Security Group
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param addExternalSourceToSecurityGroupRequest The addExternalSourceToSecurityGroupRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> addExternalSourceToSecurityGroupWithHttpInfo(UUID id, AddExternalSourceToSecurityGroupRequest addExternalSourceToSecurityGroupRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return addExternalSourceToSecurityGroupRequestCreation(id, addExternalSourceToSecurityGroupRequest).toEntity(localVarReturnType);
    }

    /**
     * Add an external source as a member of a Security Group
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param addExternalSourceToSecurityGroupRequest The addExternalSourceToSecurityGroupRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec addExternalSourceToSecurityGroupWithResponseSpec(UUID id, AddExternalSourceToSecurityGroupRequest addExternalSourceToSecurityGroupRequest) throws WebClientResponseException {
        return addExternalSourceToSecurityGroupRequestCreation(id, addExternalSourceToSecurityGroupRequest);
    }
    /**
     * Create a Security Group rule
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param addRuleToSecurityGroupRequest The addRuleToSecurityGroupRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addRuleToSecurityGroupRequestCreation(UUID id, AddRuleToSecurityGroupRequest addRuleToSecurityGroupRequest) throws WebClientResponseException {
        Object postBody = addRuleToSecurityGroupRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling addRuleToSecurityGroup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'addRuleToSecurityGroupRequest' is set
        if (addRuleToSecurityGroupRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'addRuleToSecurityGroupRequest' when calling addRuleToSecurityGroup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/security-group/{id}/rules", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a Security Group rule
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param addRuleToSecurityGroupRequest The addRuleToSecurityGroupRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> addRuleToSecurityGroup(UUID id, AddRuleToSecurityGroupRequest addRuleToSecurityGroupRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return addRuleToSecurityGroupRequestCreation(id, addRuleToSecurityGroupRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create a Security Group rule
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param addRuleToSecurityGroupRequest The addRuleToSecurityGroupRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> addRuleToSecurityGroupWithHttpInfo(UUID id, AddRuleToSecurityGroupRequest addRuleToSecurityGroupRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return addRuleToSecurityGroupRequestCreation(id, addRuleToSecurityGroupRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a Security Group rule
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param addRuleToSecurityGroupRequest The addRuleToSecurityGroupRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec addRuleToSecurityGroupWithResponseSpec(UUID id, AddRuleToSecurityGroupRequest addRuleToSecurityGroupRequest) throws WebClientResponseException {
        return addRuleToSecurityGroupRequestCreation(id, addRuleToSecurityGroupRequest);
    }
    /**
     * Attach a Compute instance to a Security Group
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param detachInstanceFromPrivateNetworkRequest The detachInstanceFromPrivateNetworkRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec attachInstanceToSecurityGroupRequestCreation(UUID id, DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest) throws WebClientResponseException {
        Object postBody = detachInstanceFromPrivateNetworkRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling attachInstanceToSecurityGroup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'detachInstanceFromPrivateNetworkRequest' is set
        if (detachInstanceFromPrivateNetworkRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'detachInstanceFromPrivateNetworkRequest' when calling attachInstanceToSecurityGroup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/security-group/{id}:attach", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Attach a Compute instance to a Security Group
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param detachInstanceFromPrivateNetworkRequest The detachInstanceFromPrivateNetworkRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> attachInstanceToSecurityGroup(UUID id, DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return attachInstanceToSecurityGroupRequestCreation(id, detachInstanceFromPrivateNetworkRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Attach a Compute instance to a Security Group
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param detachInstanceFromPrivateNetworkRequest The detachInstanceFromPrivateNetworkRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> attachInstanceToSecurityGroupWithHttpInfo(UUID id, DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return attachInstanceToSecurityGroupRequestCreation(id, detachInstanceFromPrivateNetworkRequest).toEntity(localVarReturnType);
    }

    /**
     * Attach a Compute instance to a Security Group
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param detachInstanceFromPrivateNetworkRequest The detachInstanceFromPrivateNetworkRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec attachInstanceToSecurityGroupWithResponseSpec(UUID id, DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest) throws WebClientResponseException {
        return attachInstanceToSecurityGroupRequestCreation(id, detachInstanceFromPrivateNetworkRequest);
    }
    /**
     * Create a Security Group
     * 
     * <p><b>200</b> - 200
     * @param createSecurityGroupRequest The createSecurityGroupRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createSecurityGroupRequestCreation(CreateSecurityGroupRequest createSecurityGroupRequest) throws WebClientResponseException {
        Object postBody = createSecurityGroupRequest;
        // verify the required parameter 'createSecurityGroupRequest' is set
        if (createSecurityGroupRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createSecurityGroupRequest' when calling createSecurityGroup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/security-group", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a Security Group
     * 
     * <p><b>200</b> - 200
     * @param createSecurityGroupRequest The createSecurityGroupRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createSecurityGroup(CreateSecurityGroupRequest createSecurityGroupRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createSecurityGroupRequestCreation(createSecurityGroupRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create a Security Group
     * 
     * <p><b>200</b> - 200
     * @param createSecurityGroupRequest The createSecurityGroupRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createSecurityGroupWithHttpInfo(CreateSecurityGroupRequest createSecurityGroupRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createSecurityGroupRequestCreation(createSecurityGroupRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a Security Group
     * 
     * <p><b>200</b> - 200
     * @param createSecurityGroupRequest The createSecurityGroupRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createSecurityGroupWithResponseSpec(CreateSecurityGroupRequest createSecurityGroupRequest) throws WebClientResponseException {
        return createSecurityGroupRequestCreation(createSecurityGroupRequest);
    }
    /**
     * Delete a Security Group rule
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param ruleId The ruleId parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteRuleFromSecurityGroupRequestCreation(UUID id, UUID ruleId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteRuleFromSecurityGroup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'ruleId' is set
        if (ruleId == null) {
            throw new WebClientResponseException("Missing the required parameter 'ruleId' when calling deleteRuleFromSecurityGroup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);
        pathParams.put("rule-id", ruleId);

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
        return apiClient.invokeAPI("/security-group/{id}/rules/{rule-id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a Security Group rule
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param ruleId The ruleId parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteRuleFromSecurityGroup(UUID id, UUID ruleId) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteRuleFromSecurityGroupRequestCreation(id, ruleId).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a Security Group rule
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param ruleId The ruleId parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteRuleFromSecurityGroupWithHttpInfo(UUID id, UUID ruleId) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteRuleFromSecurityGroupRequestCreation(id, ruleId).toEntity(localVarReturnType);
    }

    /**
     * Delete a Security Group rule
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param ruleId The ruleId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteRuleFromSecurityGroupWithResponseSpec(UUID id, UUID ruleId) throws WebClientResponseException {
        return deleteRuleFromSecurityGroupRequestCreation(id, ruleId);
    }
    /**
     * Delete a Security Group
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteSecurityGroupRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteSecurityGroup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/security-group/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a Security Group
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteSecurityGroup(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteSecurityGroupRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a Security Group
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteSecurityGroupWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteSecurityGroupRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Delete a Security Group
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteSecurityGroupWithResponseSpec(UUID id) throws WebClientResponseException {
        return deleteSecurityGroupRequestCreation(id);
    }
    /**
     * Detach a Compute instance from a Security Group
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param detachInstanceFromPrivateNetworkRequest The detachInstanceFromPrivateNetworkRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec detachInstanceFromSecurityGroupRequestCreation(UUID id, DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest) throws WebClientResponseException {
        Object postBody = detachInstanceFromPrivateNetworkRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling detachInstanceFromSecurityGroup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'detachInstanceFromPrivateNetworkRequest' is set
        if (detachInstanceFromPrivateNetworkRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'detachInstanceFromPrivateNetworkRequest' when calling detachInstanceFromSecurityGroup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/security-group/{id}:detach", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Detach a Compute instance from a Security Group
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param detachInstanceFromPrivateNetworkRequest The detachInstanceFromPrivateNetworkRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> detachInstanceFromSecurityGroup(UUID id, DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return detachInstanceFromSecurityGroupRequestCreation(id, detachInstanceFromPrivateNetworkRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Detach a Compute instance from a Security Group
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param detachInstanceFromPrivateNetworkRequest The detachInstanceFromPrivateNetworkRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> detachInstanceFromSecurityGroupWithHttpInfo(UUID id, DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return detachInstanceFromSecurityGroupRequestCreation(id, detachInstanceFromPrivateNetworkRequest).toEntity(localVarReturnType);
    }

    /**
     * Detach a Compute instance from a Security Group
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param detachInstanceFromPrivateNetworkRequest The detachInstanceFromPrivateNetworkRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec detachInstanceFromSecurityGroupWithResponseSpec(UUID id, DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest) throws WebClientResponseException {
        return detachInstanceFromSecurityGroupRequestCreation(id, detachInstanceFromPrivateNetworkRequest);
    }
    /**
     * Retrieve Security Group details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return SecurityGroup
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getSecurityGroupRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getSecurityGroup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<SecurityGroup> localVarReturnType = new ParameterizedTypeReference<SecurityGroup>() {};
        return apiClient.invokeAPI("/security-group/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve Security Group details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return SecurityGroup
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SecurityGroup> getSecurityGroup(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<SecurityGroup> localVarReturnType = new ParameterizedTypeReference<SecurityGroup>() {};
        return getSecurityGroupRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve Security Group details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;SecurityGroup&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SecurityGroup>> getSecurityGroupWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<SecurityGroup> localVarReturnType = new ParameterizedTypeReference<SecurityGroup>() {};
        return getSecurityGroupRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Retrieve Security Group details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getSecurityGroupWithResponseSpec(UUID id) throws WebClientResponseException {
        return getSecurityGroupRequestCreation(id);
    }
    /**
     * List Security Groups.
     * Lists security groups. When visibility is set to public, lists public security groups. Public security groups are objects maintained by Exoscale which contain source addresses for relevant services hosted by Exoscale. They can be used a source in ingress rules and as a destination in egress rules.
     * <p><b>200</b> - 200
     * @param visibility The visibility parameter
     * @return ListSecurityGroups200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listSecurityGroupsRequestCreation(String visibility) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "visibility", visibility));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ListSecurityGroups200Response> localVarReturnType = new ParameterizedTypeReference<ListSecurityGroups200Response>() {};
        return apiClient.invokeAPI("/security-group", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List Security Groups.
     * Lists security groups. When visibility is set to public, lists public security groups. Public security groups are objects maintained by Exoscale which contain source addresses for relevant services hosted by Exoscale. They can be used a source in ingress rules and as a destination in egress rules.
     * <p><b>200</b> - 200
     * @param visibility The visibility parameter
     * @return ListSecurityGroups200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListSecurityGroups200Response> listSecurityGroups(String visibility) throws WebClientResponseException {
        ParameterizedTypeReference<ListSecurityGroups200Response> localVarReturnType = new ParameterizedTypeReference<ListSecurityGroups200Response>() {};
        return listSecurityGroupsRequestCreation(visibility).bodyToMono(localVarReturnType);
    }

    /**
     * List Security Groups.
     * Lists security groups. When visibility is set to public, lists public security groups. Public security groups are objects maintained by Exoscale which contain source addresses for relevant services hosted by Exoscale. They can be used a source in ingress rules and as a destination in egress rules.
     * <p><b>200</b> - 200
     * @param visibility The visibility parameter
     * @return ResponseEntity&lt;ListSecurityGroups200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListSecurityGroups200Response>> listSecurityGroupsWithHttpInfo(String visibility) throws WebClientResponseException {
        ParameterizedTypeReference<ListSecurityGroups200Response> localVarReturnType = new ParameterizedTypeReference<ListSecurityGroups200Response>() {};
        return listSecurityGroupsRequestCreation(visibility).toEntity(localVarReturnType);
    }

    /**
     * List Security Groups.
     * Lists security groups. When visibility is set to public, lists public security groups. Public security groups are objects maintained by Exoscale which contain source addresses for relevant services hosted by Exoscale. They can be used a source in ingress rules and as a destination in egress rules.
     * <p><b>200</b> - 200
     * @param visibility The visibility parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listSecurityGroupsWithResponseSpec(String visibility) throws WebClientResponseException {
        return listSecurityGroupsRequestCreation(visibility);
    }
    /**
     * Remove an external source from a Security Group
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param removeExternalSourceFromSecurityGroupRequest The removeExternalSourceFromSecurityGroupRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec removeExternalSourceFromSecurityGroupRequestCreation(UUID id, RemoveExternalSourceFromSecurityGroupRequest removeExternalSourceFromSecurityGroupRequest) throws WebClientResponseException {
        Object postBody = removeExternalSourceFromSecurityGroupRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling removeExternalSourceFromSecurityGroup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'removeExternalSourceFromSecurityGroupRequest' is set
        if (removeExternalSourceFromSecurityGroupRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'removeExternalSourceFromSecurityGroupRequest' when calling removeExternalSourceFromSecurityGroup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/security-group/{id}:remove-source", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove an external source from a Security Group
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param removeExternalSourceFromSecurityGroupRequest The removeExternalSourceFromSecurityGroupRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> removeExternalSourceFromSecurityGroup(UUID id, RemoveExternalSourceFromSecurityGroupRequest removeExternalSourceFromSecurityGroupRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return removeExternalSourceFromSecurityGroupRequestCreation(id, removeExternalSourceFromSecurityGroupRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Remove an external source from a Security Group
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param removeExternalSourceFromSecurityGroupRequest The removeExternalSourceFromSecurityGroupRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> removeExternalSourceFromSecurityGroupWithHttpInfo(UUID id, RemoveExternalSourceFromSecurityGroupRequest removeExternalSourceFromSecurityGroupRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return removeExternalSourceFromSecurityGroupRequestCreation(id, removeExternalSourceFromSecurityGroupRequest).toEntity(localVarReturnType);
    }

    /**
     * Remove an external source from a Security Group
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param removeExternalSourceFromSecurityGroupRequest The removeExternalSourceFromSecurityGroupRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec removeExternalSourceFromSecurityGroupWithResponseSpec(UUID id, RemoveExternalSourceFromSecurityGroupRequest removeExternalSourceFromSecurityGroupRequest) throws WebClientResponseException {
        return removeExternalSourceFromSecurityGroupRequestCreation(id, removeExternalSourceFromSecurityGroupRequest);
    }
}
