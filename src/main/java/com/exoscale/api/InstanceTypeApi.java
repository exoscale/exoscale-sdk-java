package com.exoscale.api;

import com.exoscale.invoker.ApiClient;

import com.exoscale.model.InstanceType;
import com.exoscale.model.ListInstanceTypes200Response;
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
public class InstanceTypeApi {
    private ApiClient apiClient;

    public InstanceTypeApi() {
        this(new ApiClient());
    }

    @Autowired
    public InstanceTypeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieve Instance Type details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return InstanceType
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getInstanceTypeRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getInstanceType", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<InstanceType> localVarReturnType = new ParameterizedTypeReference<InstanceType>() {};
        return apiClient.invokeAPI("/instance-type/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve Instance Type details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return InstanceType
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<InstanceType> getInstanceType(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<InstanceType> localVarReturnType = new ParameterizedTypeReference<InstanceType>() {};
        return getInstanceTypeRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve Instance Type details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;InstanceType&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<InstanceType>> getInstanceTypeWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<InstanceType> localVarReturnType = new ParameterizedTypeReference<InstanceType>() {};
        return getInstanceTypeRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Retrieve Instance Type details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getInstanceTypeWithResponseSpec(UUID id) throws WebClientResponseException {
        return getInstanceTypeRequestCreation(id);
    }
    /**
     * List Compute instance Types
     * 
     * <p><b>200</b> - 200
     * @return ListInstanceTypes200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listInstanceTypesRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<ListInstanceTypes200Response> localVarReturnType = new ParameterizedTypeReference<ListInstanceTypes200Response>() {};
        return apiClient.invokeAPI("/instance-type", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List Compute instance Types
     * 
     * <p><b>200</b> - 200
     * @return ListInstanceTypes200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListInstanceTypes200Response> listInstanceTypes() throws WebClientResponseException {
        ParameterizedTypeReference<ListInstanceTypes200Response> localVarReturnType = new ParameterizedTypeReference<ListInstanceTypes200Response>() {};
        return listInstanceTypesRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * List Compute instance Types
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;ListInstanceTypes200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListInstanceTypes200Response>> listInstanceTypesWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<ListInstanceTypes200Response> localVarReturnType = new ParameterizedTypeReference<ListInstanceTypes200Response>() {};
        return listInstanceTypesRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * List Compute instance Types
     * 
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listInstanceTypesWithResponseSpec() throws WebClientResponseException {
        return listInstanceTypesRequestCreation();
    }
}
