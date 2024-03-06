package com.exoscale.api;

import com.exoscale.invoker.ApiClient;

import com.exoscale.model.AntiAffinityGroup;
import com.exoscale.model.CreateAntiAffinityGroupRequest;
import com.exoscale.model.ListAntiAffinityGroups200Response;
import com.exoscale.model.Operation;
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
public class AntiAffinityGroupApi {
    private ApiClient apiClient;

    public AntiAffinityGroupApi() {
        this(new ApiClient());
    }

    @Autowired
    public AntiAffinityGroupApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create an Anti-affinity Group
     * 
     * <p><b>200</b> - 200
     * @param createAntiAffinityGroupRequest The createAntiAffinityGroupRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createAntiAffinityGroupRequestCreation(CreateAntiAffinityGroupRequest createAntiAffinityGroupRequest) throws WebClientResponseException {
        Object postBody = createAntiAffinityGroupRequest;
        // verify the required parameter 'createAntiAffinityGroupRequest' is set
        if (createAntiAffinityGroupRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createAntiAffinityGroupRequest' when calling createAntiAffinityGroup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/anti-affinity-group", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create an Anti-affinity Group
     * 
     * <p><b>200</b> - 200
     * @param createAntiAffinityGroupRequest The createAntiAffinityGroupRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createAntiAffinityGroup(CreateAntiAffinityGroupRequest createAntiAffinityGroupRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createAntiAffinityGroupRequestCreation(createAntiAffinityGroupRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create an Anti-affinity Group
     * 
     * <p><b>200</b> - 200
     * @param createAntiAffinityGroupRequest The createAntiAffinityGroupRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createAntiAffinityGroupWithHttpInfo(CreateAntiAffinityGroupRequest createAntiAffinityGroupRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createAntiAffinityGroupRequestCreation(createAntiAffinityGroupRequest).toEntity(localVarReturnType);
    }

    /**
     * Create an Anti-affinity Group
     * 
     * <p><b>200</b> - 200
     * @param createAntiAffinityGroupRequest The createAntiAffinityGroupRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createAntiAffinityGroupWithResponseSpec(CreateAntiAffinityGroupRequest createAntiAffinityGroupRequest) throws WebClientResponseException {
        return createAntiAffinityGroupRequestCreation(createAntiAffinityGroupRequest);
    }
    /**
     * Delete an Anti-affinity Group
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteAntiAffinityGroupRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteAntiAffinityGroup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/anti-affinity-group/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete an Anti-affinity Group
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteAntiAffinityGroup(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteAntiAffinityGroupRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete an Anti-affinity Group
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteAntiAffinityGroupWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteAntiAffinityGroupRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Delete an Anti-affinity Group
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteAntiAffinityGroupWithResponseSpec(UUID id) throws WebClientResponseException {
        return deleteAntiAffinityGroupRequestCreation(id);
    }
    /**
     * Retrieve Anti-affinity Group details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return AntiAffinityGroup
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getAntiAffinityGroupRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getAntiAffinityGroup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<AntiAffinityGroup> localVarReturnType = new ParameterizedTypeReference<AntiAffinityGroup>() {};
        return apiClient.invokeAPI("/anti-affinity-group/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve Anti-affinity Group details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return AntiAffinityGroup
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AntiAffinityGroup> getAntiAffinityGroup(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<AntiAffinityGroup> localVarReturnType = new ParameterizedTypeReference<AntiAffinityGroup>() {};
        return getAntiAffinityGroupRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve Anti-affinity Group details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;AntiAffinityGroup&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<AntiAffinityGroup>> getAntiAffinityGroupWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<AntiAffinityGroup> localVarReturnType = new ParameterizedTypeReference<AntiAffinityGroup>() {};
        return getAntiAffinityGroupRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Retrieve Anti-affinity Group details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getAntiAffinityGroupWithResponseSpec(UUID id) throws WebClientResponseException {
        return getAntiAffinityGroupRequestCreation(id);
    }
    /**
     * List Anti-affinity Groups
     * 
     * <p><b>200</b> - 200
     * @return ListAntiAffinityGroups200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listAntiAffinityGroupsRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<ListAntiAffinityGroups200Response> localVarReturnType = new ParameterizedTypeReference<ListAntiAffinityGroups200Response>() {};
        return apiClient.invokeAPI("/anti-affinity-group", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List Anti-affinity Groups
     * 
     * <p><b>200</b> - 200
     * @return ListAntiAffinityGroups200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListAntiAffinityGroups200Response> listAntiAffinityGroups() throws WebClientResponseException {
        ParameterizedTypeReference<ListAntiAffinityGroups200Response> localVarReturnType = new ParameterizedTypeReference<ListAntiAffinityGroups200Response>() {};
        return listAntiAffinityGroupsRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * List Anti-affinity Groups
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;ListAntiAffinityGroups200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListAntiAffinityGroups200Response>> listAntiAffinityGroupsWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<ListAntiAffinityGroups200Response> localVarReturnType = new ParameterizedTypeReference<ListAntiAffinityGroups200Response>() {};
        return listAntiAffinityGroupsRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * List Anti-affinity Groups
     * 
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listAntiAffinityGroupsWithResponseSpec() throws WebClientResponseException {
        return listAntiAffinityGroupsRequestCreation();
    }
}
