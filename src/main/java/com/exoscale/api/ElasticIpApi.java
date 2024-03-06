package com.exoscale.api;

import com.exoscale.invoker.ApiClient;

import com.exoscale.model.AttachBlockStorageVolumeToInstanceRequest;
import com.exoscale.model.CreateElasticIpRequest;
import com.exoscale.model.ElasticIp;
import com.exoscale.model.ListElasticIps200Response;
import com.exoscale.model.Operation;
import java.util.UUID;
import com.exoscale.model.UpdateElasticIpRequest;

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
public class ElasticIpApi {
    private ApiClient apiClient;

    public ElasticIpApi() {
        this(new ApiClient());
    }

    @Autowired
    public ElasticIpApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Attach a Compute instance to an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param attachBlockStorageVolumeToInstanceRequest The attachBlockStorageVolumeToInstanceRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec attachInstanceToElasticIpRequestCreation(UUID id, AttachBlockStorageVolumeToInstanceRequest attachBlockStorageVolumeToInstanceRequest) throws WebClientResponseException {
        Object postBody = attachBlockStorageVolumeToInstanceRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling attachInstanceToElasticIp", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'attachBlockStorageVolumeToInstanceRequest' is set
        if (attachBlockStorageVolumeToInstanceRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'attachBlockStorageVolumeToInstanceRequest' when calling attachInstanceToElasticIp", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/elastic-ip/{id}:attach", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Attach a Compute instance to an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param attachBlockStorageVolumeToInstanceRequest The attachBlockStorageVolumeToInstanceRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> attachInstanceToElasticIp(UUID id, AttachBlockStorageVolumeToInstanceRequest attachBlockStorageVolumeToInstanceRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return attachInstanceToElasticIpRequestCreation(id, attachBlockStorageVolumeToInstanceRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Attach a Compute instance to an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param attachBlockStorageVolumeToInstanceRequest The attachBlockStorageVolumeToInstanceRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> attachInstanceToElasticIpWithHttpInfo(UUID id, AttachBlockStorageVolumeToInstanceRequest attachBlockStorageVolumeToInstanceRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return attachInstanceToElasticIpRequestCreation(id, attachBlockStorageVolumeToInstanceRequest).toEntity(localVarReturnType);
    }

    /**
     * Attach a Compute instance to an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param attachBlockStorageVolumeToInstanceRequest The attachBlockStorageVolumeToInstanceRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec attachInstanceToElasticIpWithResponseSpec(UUID id, AttachBlockStorageVolumeToInstanceRequest attachBlockStorageVolumeToInstanceRequest) throws WebClientResponseException {
        return attachInstanceToElasticIpRequestCreation(id, attachBlockStorageVolumeToInstanceRequest);
    }
    /**
     * Create an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param createElasticIpRequest The createElasticIpRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createElasticIpRequestCreation(CreateElasticIpRequest createElasticIpRequest) throws WebClientResponseException {
        Object postBody = createElasticIpRequest;
        // verify the required parameter 'createElasticIpRequest' is set
        if (createElasticIpRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createElasticIpRequest' when calling createElasticIp", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/elastic-ip", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param createElasticIpRequest The createElasticIpRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createElasticIp(CreateElasticIpRequest createElasticIpRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createElasticIpRequestCreation(createElasticIpRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param createElasticIpRequest The createElasticIpRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createElasticIpWithHttpInfo(CreateElasticIpRequest createElasticIpRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createElasticIpRequestCreation(createElasticIpRequest).toEntity(localVarReturnType);
    }

    /**
     * Create an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param createElasticIpRequest The createElasticIpRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createElasticIpWithResponseSpec(CreateElasticIpRequest createElasticIpRequest) throws WebClientResponseException {
        return createElasticIpRequestCreation(createElasticIpRequest);
    }
    /**
     * Delete an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteElasticIpRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteElasticIp", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/elastic-ip/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteElasticIp(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteElasticIpRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteElasticIpWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteElasticIpRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Delete an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteElasticIpWithResponseSpec(UUID id) throws WebClientResponseException {
        return deleteElasticIpRequestCreation(id);
    }
    /**
     * Detach a Compute instance from an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param attachBlockStorageVolumeToInstanceRequest The attachBlockStorageVolumeToInstanceRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec detachInstanceFromElasticIpRequestCreation(UUID id, AttachBlockStorageVolumeToInstanceRequest attachBlockStorageVolumeToInstanceRequest) throws WebClientResponseException {
        Object postBody = attachBlockStorageVolumeToInstanceRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling detachInstanceFromElasticIp", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'attachBlockStorageVolumeToInstanceRequest' is set
        if (attachBlockStorageVolumeToInstanceRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'attachBlockStorageVolumeToInstanceRequest' when calling detachInstanceFromElasticIp", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/elastic-ip/{id}:detach", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Detach a Compute instance from an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param attachBlockStorageVolumeToInstanceRequest The attachBlockStorageVolumeToInstanceRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> detachInstanceFromElasticIp(UUID id, AttachBlockStorageVolumeToInstanceRequest attachBlockStorageVolumeToInstanceRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return detachInstanceFromElasticIpRequestCreation(id, attachBlockStorageVolumeToInstanceRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Detach a Compute instance from an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param attachBlockStorageVolumeToInstanceRequest The attachBlockStorageVolumeToInstanceRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> detachInstanceFromElasticIpWithHttpInfo(UUID id, AttachBlockStorageVolumeToInstanceRequest attachBlockStorageVolumeToInstanceRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return detachInstanceFromElasticIpRequestCreation(id, attachBlockStorageVolumeToInstanceRequest).toEntity(localVarReturnType);
    }

    /**
     * Detach a Compute instance from an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param attachBlockStorageVolumeToInstanceRequest The attachBlockStorageVolumeToInstanceRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec detachInstanceFromElasticIpWithResponseSpec(UUID id, AttachBlockStorageVolumeToInstanceRequest attachBlockStorageVolumeToInstanceRequest) throws WebClientResponseException {
        return detachInstanceFromElasticIpRequestCreation(id, attachBlockStorageVolumeToInstanceRequest);
    }
    /**
     * Retrieve Elastic IP details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ElasticIp
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getElasticIpRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getElasticIp", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ElasticIp> localVarReturnType = new ParameterizedTypeReference<ElasticIp>() {};
        return apiClient.invokeAPI("/elastic-ip/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve Elastic IP details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ElasticIp
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ElasticIp> getElasticIp(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<ElasticIp> localVarReturnType = new ParameterizedTypeReference<ElasticIp>() {};
        return getElasticIpRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve Elastic IP details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;ElasticIp&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ElasticIp>> getElasticIpWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<ElasticIp> localVarReturnType = new ParameterizedTypeReference<ElasticIp>() {};
        return getElasticIpRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Retrieve Elastic IP details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getElasticIpWithResponseSpec(UUID id) throws WebClientResponseException {
        return getElasticIpRequestCreation(id);
    }
    /**
     * List Elastic IPs
     * 
     * <p><b>200</b> - 200
     * @return ListElasticIps200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listElasticIpsRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<ListElasticIps200Response> localVarReturnType = new ParameterizedTypeReference<ListElasticIps200Response>() {};
        return apiClient.invokeAPI("/elastic-ip", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List Elastic IPs
     * 
     * <p><b>200</b> - 200
     * @return ListElasticIps200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListElasticIps200Response> listElasticIps() throws WebClientResponseException {
        ParameterizedTypeReference<ListElasticIps200Response> localVarReturnType = new ParameterizedTypeReference<ListElasticIps200Response>() {};
        return listElasticIpsRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * List Elastic IPs
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;ListElasticIps200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListElasticIps200Response>> listElasticIpsWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<ListElasticIps200Response> localVarReturnType = new ParameterizedTypeReference<ListElasticIps200Response>() {};
        return listElasticIpsRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * List Elastic IPs
     * 
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listElasticIpsWithResponseSpec() throws WebClientResponseException {
        return listElasticIpsRequestCreation();
    }
    /**
     * Reset an Elastic IP field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param field The field parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec resetElasticIpFieldRequestCreation(UUID id, String field) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling resetElasticIpField", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'field' is set
        if (field == null) {
            throw new WebClientResponseException("Missing the required parameter 'field' when calling resetElasticIpField", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/elastic-ip/{id}/{field}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Reset an Elastic IP field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param field The field parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> resetElasticIpField(UUID id, String field) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetElasticIpFieldRequestCreation(id, field).bodyToMono(localVarReturnType);
    }

    /**
     * Reset an Elastic IP field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param field The field parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> resetElasticIpFieldWithHttpInfo(UUID id, String field) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetElasticIpFieldRequestCreation(id, field).toEntity(localVarReturnType);
    }

    /**
     * Reset an Elastic IP field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param field The field parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec resetElasticIpFieldWithResponseSpec(UUID id, String field) throws WebClientResponseException {
        return resetElasticIpFieldRequestCreation(id, field);
    }
    /**
     * Update an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateElasticIpRequest The updateElasticIpRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateElasticIpRequestCreation(UUID id, UpdateElasticIpRequest updateElasticIpRequest) throws WebClientResponseException {
        Object postBody = updateElasticIpRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling updateElasticIp", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updateElasticIpRequest' is set
        if (updateElasticIpRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateElasticIpRequest' when calling updateElasticIp", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/elastic-ip/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateElasticIpRequest The updateElasticIpRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updateElasticIp(UUID id, UpdateElasticIpRequest updateElasticIpRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateElasticIpRequestCreation(id, updateElasticIpRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateElasticIpRequest The updateElasticIpRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updateElasticIpWithHttpInfo(UUID id, UpdateElasticIpRequest updateElasticIpRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateElasticIpRequestCreation(id, updateElasticIpRequest).toEntity(localVarReturnType);
    }

    /**
     * Update an Elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateElasticIpRequest The updateElasticIpRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateElasticIpWithResponseSpec(UUID id, UpdateElasticIpRequest updateElasticIpRequest) throws WebClientResponseException {
        return updateElasticIpRequestCreation(id, updateElasticIpRequest);
    }
}
