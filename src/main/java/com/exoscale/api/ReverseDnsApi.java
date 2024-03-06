package com.exoscale.api;

import com.exoscale.invoker.ApiClient;

import com.exoscale.model.Operation;
import com.exoscale.model.ReverseDnsRecord;
import java.util.UUID;
import com.exoscale.model.UpdateReverseDnsElasticIpRequest;

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
public class ReverseDnsApi {
    private ApiClient apiClient;

    public ReverseDnsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ReverseDnsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete the PTR DNS record for an elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteReverseDnsElasticIpRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteReverseDnsElasticIp", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/reverse-dns/elastic-ip/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete the PTR DNS record for an elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteReverseDnsElasticIp(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteReverseDnsElasticIpRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete the PTR DNS record for an elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteReverseDnsElasticIpWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteReverseDnsElasticIpRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Delete the PTR DNS record for an elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteReverseDnsElasticIpWithResponseSpec(UUID id) throws WebClientResponseException {
        return deleteReverseDnsElasticIpRequestCreation(id);
    }
    /**
     * Delete the PTR DNS record for an instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteReverseDnsInstanceRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteReverseDnsInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/reverse-dns/instance/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete the PTR DNS record for an instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteReverseDnsInstance(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteReverseDnsInstanceRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete the PTR DNS record for an instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteReverseDnsInstanceWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteReverseDnsInstanceRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Delete the PTR DNS record for an instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteReverseDnsInstanceWithResponseSpec(UUID id) throws WebClientResponseException {
        return deleteReverseDnsInstanceRequestCreation(id);
    }
    /**
     * Query the PTR DNS records for an elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ReverseDnsRecord
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getReverseDnsElasticIpRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getReverseDnsElasticIp", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ReverseDnsRecord> localVarReturnType = new ParameterizedTypeReference<ReverseDnsRecord>() {};
        return apiClient.invokeAPI("/reverse-dns/elastic-ip/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Query the PTR DNS records for an elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ReverseDnsRecord
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ReverseDnsRecord> getReverseDnsElasticIp(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<ReverseDnsRecord> localVarReturnType = new ParameterizedTypeReference<ReverseDnsRecord>() {};
        return getReverseDnsElasticIpRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Query the PTR DNS records for an elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;ReverseDnsRecord&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ReverseDnsRecord>> getReverseDnsElasticIpWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<ReverseDnsRecord> localVarReturnType = new ParameterizedTypeReference<ReverseDnsRecord>() {};
        return getReverseDnsElasticIpRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Query the PTR DNS records for an elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getReverseDnsElasticIpWithResponseSpec(UUID id) throws WebClientResponseException {
        return getReverseDnsElasticIpRequestCreation(id);
    }
    /**
     * Query the PTR DNS records for an instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ReverseDnsRecord
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getReverseDnsInstanceRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getReverseDnsInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ReverseDnsRecord> localVarReturnType = new ParameterizedTypeReference<ReverseDnsRecord>() {};
        return apiClient.invokeAPI("/reverse-dns/instance/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Query the PTR DNS records for an instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ReverseDnsRecord
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ReverseDnsRecord> getReverseDnsInstance(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<ReverseDnsRecord> localVarReturnType = new ParameterizedTypeReference<ReverseDnsRecord>() {};
        return getReverseDnsInstanceRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Query the PTR DNS records for an instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;ReverseDnsRecord&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ReverseDnsRecord>> getReverseDnsInstanceWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<ReverseDnsRecord> localVarReturnType = new ParameterizedTypeReference<ReverseDnsRecord>() {};
        return getReverseDnsInstanceRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Query the PTR DNS records for an instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getReverseDnsInstanceWithResponseSpec(UUID id) throws WebClientResponseException {
        return getReverseDnsInstanceRequestCreation(id);
    }
    /**
     * Update/Create the PTR DNS record for an elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateReverseDnsElasticIpRequest The updateReverseDnsElasticIpRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateReverseDnsElasticIpRequestCreation(UUID id, UpdateReverseDnsElasticIpRequest updateReverseDnsElasticIpRequest) throws WebClientResponseException {
        Object postBody = updateReverseDnsElasticIpRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling updateReverseDnsElasticIp", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updateReverseDnsElasticIpRequest' is set
        if (updateReverseDnsElasticIpRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateReverseDnsElasticIpRequest' when calling updateReverseDnsElasticIp", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/reverse-dns/elastic-ip/{id}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update/Create the PTR DNS record for an elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateReverseDnsElasticIpRequest The updateReverseDnsElasticIpRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updateReverseDnsElasticIp(UUID id, UpdateReverseDnsElasticIpRequest updateReverseDnsElasticIpRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateReverseDnsElasticIpRequestCreation(id, updateReverseDnsElasticIpRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update/Create the PTR DNS record for an elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateReverseDnsElasticIpRequest The updateReverseDnsElasticIpRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updateReverseDnsElasticIpWithHttpInfo(UUID id, UpdateReverseDnsElasticIpRequest updateReverseDnsElasticIpRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateReverseDnsElasticIpRequestCreation(id, updateReverseDnsElasticIpRequest).toEntity(localVarReturnType);
    }

    /**
     * Update/Create the PTR DNS record for an elastic IP
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateReverseDnsElasticIpRequest The updateReverseDnsElasticIpRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateReverseDnsElasticIpWithResponseSpec(UUID id, UpdateReverseDnsElasticIpRequest updateReverseDnsElasticIpRequest) throws WebClientResponseException {
        return updateReverseDnsElasticIpRequestCreation(id, updateReverseDnsElasticIpRequest);
    }
    /**
     * Update/Create the PTR DNS record for an instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateReverseDnsElasticIpRequest The updateReverseDnsElasticIpRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateReverseDnsInstanceRequestCreation(UUID id, UpdateReverseDnsElasticIpRequest updateReverseDnsElasticIpRequest) throws WebClientResponseException {
        Object postBody = updateReverseDnsElasticIpRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling updateReverseDnsInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updateReverseDnsElasticIpRequest' is set
        if (updateReverseDnsElasticIpRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateReverseDnsElasticIpRequest' when calling updateReverseDnsInstance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/reverse-dns/instance/{id}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update/Create the PTR DNS record for an instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateReverseDnsElasticIpRequest The updateReverseDnsElasticIpRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updateReverseDnsInstance(UUID id, UpdateReverseDnsElasticIpRequest updateReverseDnsElasticIpRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateReverseDnsInstanceRequestCreation(id, updateReverseDnsElasticIpRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update/Create the PTR DNS record for an instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateReverseDnsElasticIpRequest The updateReverseDnsElasticIpRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updateReverseDnsInstanceWithHttpInfo(UUID id, UpdateReverseDnsElasticIpRequest updateReverseDnsElasticIpRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateReverseDnsInstanceRequestCreation(id, updateReverseDnsElasticIpRequest).toEntity(localVarReturnType);
    }

    /**
     * Update/Create the PTR DNS record for an instance
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateReverseDnsElasticIpRequest The updateReverseDnsElasticIpRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateReverseDnsInstanceWithResponseSpec(UUID id, UpdateReverseDnsElasticIpRequest updateReverseDnsElasticIpRequest) throws WebClientResponseException {
        return updateReverseDnsInstanceRequestCreation(id, updateReverseDnsElasticIpRequest);
    }
}
