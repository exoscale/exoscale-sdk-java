package com.exoscale.api;

import com.exoscale.invoker.ApiClient;

import com.exoscale.model.AttachInstanceToPrivateNetworkRequest;
import com.exoscale.model.CreatePrivateNetworkRequest;
import com.exoscale.model.DetachInstanceFromPrivateNetworkRequest;
import com.exoscale.model.ListPrivateNetworks200Response;
import com.exoscale.model.Operation;
import com.exoscale.model.PrivateNetwork;
import java.util.UUID;
import com.exoscale.model.UpdatePrivateNetworkInstanceIpRequest;
import com.exoscale.model.UpdatePrivateNetworkRequest;

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
public class PrivateNetworkApi {
    private ApiClient apiClient;

    public PrivateNetworkApi() {
        this(new ApiClient());
    }

    @Autowired
    public PrivateNetworkApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Attach a Compute instance to a Private Network
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param attachInstanceToPrivateNetworkRequest The attachInstanceToPrivateNetworkRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec attachInstanceToPrivateNetworkRequestCreation(UUID id, AttachInstanceToPrivateNetworkRequest attachInstanceToPrivateNetworkRequest) throws WebClientResponseException {
        Object postBody = attachInstanceToPrivateNetworkRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling attachInstanceToPrivateNetwork", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'attachInstanceToPrivateNetworkRequest' is set
        if (attachInstanceToPrivateNetworkRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'attachInstanceToPrivateNetworkRequest' when calling attachInstanceToPrivateNetwork", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/private-network/{id}:attach", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Attach a Compute instance to a Private Network
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param attachInstanceToPrivateNetworkRequest The attachInstanceToPrivateNetworkRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> attachInstanceToPrivateNetwork(UUID id, AttachInstanceToPrivateNetworkRequest attachInstanceToPrivateNetworkRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return attachInstanceToPrivateNetworkRequestCreation(id, attachInstanceToPrivateNetworkRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Attach a Compute instance to a Private Network
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param attachInstanceToPrivateNetworkRequest The attachInstanceToPrivateNetworkRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> attachInstanceToPrivateNetworkWithHttpInfo(UUID id, AttachInstanceToPrivateNetworkRequest attachInstanceToPrivateNetworkRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return attachInstanceToPrivateNetworkRequestCreation(id, attachInstanceToPrivateNetworkRequest).toEntity(localVarReturnType);
    }

    /**
     * Attach a Compute instance to a Private Network
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param attachInstanceToPrivateNetworkRequest The attachInstanceToPrivateNetworkRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec attachInstanceToPrivateNetworkWithResponseSpec(UUID id, AttachInstanceToPrivateNetworkRequest attachInstanceToPrivateNetworkRequest) throws WebClientResponseException {
        return attachInstanceToPrivateNetworkRequestCreation(id, attachInstanceToPrivateNetworkRequest);
    }
    /**
     * Create a Private Network
     * 
     * <p><b>200</b> - 200
     * @param createPrivateNetworkRequest The createPrivateNetworkRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createPrivateNetworkRequestCreation(CreatePrivateNetworkRequest createPrivateNetworkRequest) throws WebClientResponseException {
        Object postBody = createPrivateNetworkRequest;
        // verify the required parameter 'createPrivateNetworkRequest' is set
        if (createPrivateNetworkRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createPrivateNetworkRequest' when calling createPrivateNetwork", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/private-network", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a Private Network
     * 
     * <p><b>200</b> - 200
     * @param createPrivateNetworkRequest The createPrivateNetworkRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createPrivateNetwork(CreatePrivateNetworkRequest createPrivateNetworkRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createPrivateNetworkRequestCreation(createPrivateNetworkRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create a Private Network
     * 
     * <p><b>200</b> - 200
     * @param createPrivateNetworkRequest The createPrivateNetworkRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createPrivateNetworkWithHttpInfo(CreatePrivateNetworkRequest createPrivateNetworkRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createPrivateNetworkRequestCreation(createPrivateNetworkRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a Private Network
     * 
     * <p><b>200</b> - 200
     * @param createPrivateNetworkRequest The createPrivateNetworkRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createPrivateNetworkWithResponseSpec(CreatePrivateNetworkRequest createPrivateNetworkRequest) throws WebClientResponseException {
        return createPrivateNetworkRequestCreation(createPrivateNetworkRequest);
    }
    /**
     * Delete a Private Network
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deletePrivateNetworkRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deletePrivateNetwork", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/private-network/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a Private Network
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deletePrivateNetwork(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deletePrivateNetworkRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a Private Network
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deletePrivateNetworkWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deletePrivateNetworkRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Delete a Private Network
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deletePrivateNetworkWithResponseSpec(UUID id) throws WebClientResponseException {
        return deletePrivateNetworkRequestCreation(id);
    }
    /**
     * Detach a Compute instance from a Private Network
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param detachInstanceFromPrivateNetworkRequest The detachInstanceFromPrivateNetworkRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec detachInstanceFromPrivateNetworkRequestCreation(UUID id, DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest) throws WebClientResponseException {
        Object postBody = detachInstanceFromPrivateNetworkRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling detachInstanceFromPrivateNetwork", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'detachInstanceFromPrivateNetworkRequest' is set
        if (detachInstanceFromPrivateNetworkRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'detachInstanceFromPrivateNetworkRequest' when calling detachInstanceFromPrivateNetwork", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/private-network/{id}:detach", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Detach a Compute instance from a Private Network
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param detachInstanceFromPrivateNetworkRequest The detachInstanceFromPrivateNetworkRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> detachInstanceFromPrivateNetwork(UUID id, DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return detachInstanceFromPrivateNetworkRequestCreation(id, detachInstanceFromPrivateNetworkRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Detach a Compute instance from a Private Network
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param detachInstanceFromPrivateNetworkRequest The detachInstanceFromPrivateNetworkRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> detachInstanceFromPrivateNetworkWithHttpInfo(UUID id, DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return detachInstanceFromPrivateNetworkRequestCreation(id, detachInstanceFromPrivateNetworkRequest).toEntity(localVarReturnType);
    }

    /**
     * Detach a Compute instance from a Private Network
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param detachInstanceFromPrivateNetworkRequest The detachInstanceFromPrivateNetworkRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec detachInstanceFromPrivateNetworkWithResponseSpec(UUID id, DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest) throws WebClientResponseException {
        return detachInstanceFromPrivateNetworkRequestCreation(id, detachInstanceFromPrivateNetworkRequest);
    }
    /**
     * Retrieve Private Network details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return PrivateNetwork
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPrivateNetworkRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getPrivateNetwork", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<PrivateNetwork> localVarReturnType = new ParameterizedTypeReference<PrivateNetwork>() {};
        return apiClient.invokeAPI("/private-network/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve Private Network details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return PrivateNetwork
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PrivateNetwork> getPrivateNetwork(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<PrivateNetwork> localVarReturnType = new ParameterizedTypeReference<PrivateNetwork>() {};
        return getPrivateNetworkRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve Private Network details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;PrivateNetwork&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PrivateNetwork>> getPrivateNetworkWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<PrivateNetwork> localVarReturnType = new ParameterizedTypeReference<PrivateNetwork>() {};
        return getPrivateNetworkRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Retrieve Private Network details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPrivateNetworkWithResponseSpec(UUID id) throws WebClientResponseException {
        return getPrivateNetworkRequestCreation(id);
    }
    /**
     * List Private Networks
     * 
     * <p><b>200</b> - 200
     * @return ListPrivateNetworks200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listPrivateNetworksRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<ListPrivateNetworks200Response> localVarReturnType = new ParameterizedTypeReference<ListPrivateNetworks200Response>() {};
        return apiClient.invokeAPI("/private-network", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List Private Networks
     * 
     * <p><b>200</b> - 200
     * @return ListPrivateNetworks200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListPrivateNetworks200Response> listPrivateNetworks() throws WebClientResponseException {
        ParameterizedTypeReference<ListPrivateNetworks200Response> localVarReturnType = new ParameterizedTypeReference<ListPrivateNetworks200Response>() {};
        return listPrivateNetworksRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * List Private Networks
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;ListPrivateNetworks200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListPrivateNetworks200Response>> listPrivateNetworksWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<ListPrivateNetworks200Response> localVarReturnType = new ParameterizedTypeReference<ListPrivateNetworks200Response>() {};
        return listPrivateNetworksRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * List Private Networks
     * 
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listPrivateNetworksWithResponseSpec() throws WebClientResponseException {
        return listPrivateNetworksRequestCreation();
    }
    /**
     * Reset Private Network field
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param field The field parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec resetPrivateNetworkFieldRequestCreation(UUID id, String field) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling resetPrivateNetworkField", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'field' is set
        if (field == null) {
            throw new WebClientResponseException("Missing the required parameter 'field' when calling resetPrivateNetworkField", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/private-network/{id}/{field}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Reset Private Network field
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param field The field parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> resetPrivateNetworkField(UUID id, String field) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetPrivateNetworkFieldRequestCreation(id, field).bodyToMono(localVarReturnType);
    }

    /**
     * Reset Private Network field
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param field The field parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> resetPrivateNetworkFieldWithHttpInfo(UUID id, String field) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetPrivateNetworkFieldRequestCreation(id, field).toEntity(localVarReturnType);
    }

    /**
     * Reset Private Network field
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param field The field parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec resetPrivateNetworkFieldWithResponseSpec(UUID id, String field) throws WebClientResponseException {
        return resetPrivateNetworkFieldRequestCreation(id, field);
    }
    /**
     * Update a Private Network
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updatePrivateNetworkRequest The updatePrivateNetworkRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updatePrivateNetworkRequestCreation(UUID id, UpdatePrivateNetworkRequest updatePrivateNetworkRequest) throws WebClientResponseException {
        Object postBody = updatePrivateNetworkRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling updatePrivateNetwork", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updatePrivateNetworkRequest' is set
        if (updatePrivateNetworkRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updatePrivateNetworkRequest' when calling updatePrivateNetwork", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/private-network/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a Private Network
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updatePrivateNetworkRequest The updatePrivateNetworkRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updatePrivateNetwork(UUID id, UpdatePrivateNetworkRequest updatePrivateNetworkRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updatePrivateNetworkRequestCreation(id, updatePrivateNetworkRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update a Private Network
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updatePrivateNetworkRequest The updatePrivateNetworkRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updatePrivateNetworkWithHttpInfo(UUID id, UpdatePrivateNetworkRequest updatePrivateNetworkRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updatePrivateNetworkRequestCreation(id, updatePrivateNetworkRequest).toEntity(localVarReturnType);
    }

    /**
     * Update a Private Network
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updatePrivateNetworkRequest The updatePrivateNetworkRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updatePrivateNetworkWithResponseSpec(UUID id, UpdatePrivateNetworkRequest updatePrivateNetworkRequest) throws WebClientResponseException {
        return updatePrivateNetworkRequestCreation(id, updatePrivateNetworkRequest);
    }
    /**
     * Update the IP address of an instance attached to a managed private network
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updatePrivateNetworkInstanceIpRequest The updatePrivateNetworkInstanceIpRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updatePrivateNetworkInstanceIpRequestCreation(UUID id, UpdatePrivateNetworkInstanceIpRequest updatePrivateNetworkInstanceIpRequest) throws WebClientResponseException {
        Object postBody = updatePrivateNetworkInstanceIpRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling updatePrivateNetworkInstanceIp", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updatePrivateNetworkInstanceIpRequest' is set
        if (updatePrivateNetworkInstanceIpRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updatePrivateNetworkInstanceIpRequest' when calling updatePrivateNetworkInstanceIp", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/private-network/{id}:update-ip", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update the IP address of an instance attached to a managed private network
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updatePrivateNetworkInstanceIpRequest The updatePrivateNetworkInstanceIpRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updatePrivateNetworkInstanceIp(UUID id, UpdatePrivateNetworkInstanceIpRequest updatePrivateNetworkInstanceIpRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updatePrivateNetworkInstanceIpRequestCreation(id, updatePrivateNetworkInstanceIpRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update the IP address of an instance attached to a managed private network
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updatePrivateNetworkInstanceIpRequest The updatePrivateNetworkInstanceIpRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updatePrivateNetworkInstanceIpWithHttpInfo(UUID id, UpdatePrivateNetworkInstanceIpRequest updatePrivateNetworkInstanceIpRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updatePrivateNetworkInstanceIpRequestCreation(id, updatePrivateNetworkInstanceIpRequest).toEntity(localVarReturnType);
    }

    /**
     * Update the IP address of an instance attached to a managed private network
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updatePrivateNetworkInstanceIpRequest The updatePrivateNetworkInstanceIpRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updatePrivateNetworkInstanceIpWithResponseSpec(UUID id, UpdatePrivateNetworkInstanceIpRequest updatePrivateNetworkInstanceIpRequest) throws WebClientResponseException {
        return updatePrivateNetworkInstanceIpRequestCreation(id, updatePrivateNetworkInstanceIpRequest);
    }
}
