package com.exoscale.api;

import com.exoscale.invoker.ApiClient;

import com.exoscale.model.DeployTarget;
import com.exoscale.model.ListDeployTargets200Response;
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
public class DeployTargetApi {
    private ApiClient apiClient;

    public DeployTargetApi() {
        this(new ApiClient());
    }

    @Autowired
    public DeployTargetApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieve Deploy Target details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return DeployTarget
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDeployTargetRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getDeployTarget", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DeployTarget> localVarReturnType = new ParameterizedTypeReference<DeployTarget>() {};
        return apiClient.invokeAPI("/deploy-target/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve Deploy Target details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return DeployTarget
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DeployTarget> getDeployTarget(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<DeployTarget> localVarReturnType = new ParameterizedTypeReference<DeployTarget>() {};
        return getDeployTargetRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve Deploy Target details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;DeployTarget&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DeployTarget>> getDeployTargetWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<DeployTarget> localVarReturnType = new ParameterizedTypeReference<DeployTarget>() {};
        return getDeployTargetRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Retrieve Deploy Target details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDeployTargetWithResponseSpec(UUID id) throws WebClientResponseException {
        return getDeployTargetRequestCreation(id);
    }
    /**
     * List Deploy Targets
     * 
     * <p><b>200</b> - 200
     * @return ListDeployTargets200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listDeployTargetsRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<ListDeployTargets200Response> localVarReturnType = new ParameterizedTypeReference<ListDeployTargets200Response>() {};
        return apiClient.invokeAPI("/deploy-target", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List Deploy Targets
     * 
     * <p><b>200</b> - 200
     * @return ListDeployTargets200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListDeployTargets200Response> listDeployTargets() throws WebClientResponseException {
        ParameterizedTypeReference<ListDeployTargets200Response> localVarReturnType = new ParameterizedTypeReference<ListDeployTargets200Response>() {};
        return listDeployTargetsRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * List Deploy Targets
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;ListDeployTargets200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListDeployTargets200Response>> listDeployTargetsWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<ListDeployTargets200Response> localVarReturnType = new ParameterizedTypeReference<ListDeployTargets200Response>() {};
        return listDeployTargetsRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * List Deploy Targets
     * 
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listDeployTargetsWithResponseSpec() throws WebClientResponseException {
        return listDeployTargetsRequestCreation();
    }
}
