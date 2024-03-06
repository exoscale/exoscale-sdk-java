package com.exoscale.api;

import com.exoscale.invoker.ApiClient;

import com.exoscale.model.ListSshKeys200Response;
import com.exoscale.model.Operation;
import com.exoscale.model.RegisterSshKeyRequest;
import com.exoscale.model.SshKey;

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
public class SshKeyApi {
    private ApiClient apiClient;

    public SshKeyApi() {
        this(new ApiClient());
    }

    @Autowired
    public SshKeyApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete a SSH key
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteSshKeyRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling deleteSshKey", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("name", name);

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
        return apiClient.invokeAPI("/ssh-key/{name}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a SSH key
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteSshKey(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteSshKeyRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a SSH key
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteSshKeyWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteSshKeyRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Delete a SSH key
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteSshKeyWithResponseSpec(String name) throws WebClientResponseException {
        return deleteSshKeyRequestCreation(name);
    }
    /**
     * Retrieve SSH key details
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return SshKey
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getSshKeyRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling getSshKey", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("name", name);

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

        ParameterizedTypeReference<SshKey> localVarReturnType = new ParameterizedTypeReference<SshKey>() {};
        return apiClient.invokeAPI("/ssh-key/{name}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve SSH key details
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return SshKey
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SshKey> getSshKey(String name) throws WebClientResponseException {
        ParameterizedTypeReference<SshKey> localVarReturnType = new ParameterizedTypeReference<SshKey>() {};
        return getSshKeyRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve SSH key details
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;SshKey&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SshKey>> getSshKeyWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<SshKey> localVarReturnType = new ParameterizedTypeReference<SshKey>() {};
        return getSshKeyRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Retrieve SSH key details
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getSshKeyWithResponseSpec(String name) throws WebClientResponseException {
        return getSshKeyRequestCreation(name);
    }
    /**
     * List SSH keys
     * 
     * <p><b>200</b> - 200
     * @return ListSshKeys200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listSshKeysRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<ListSshKeys200Response> localVarReturnType = new ParameterizedTypeReference<ListSshKeys200Response>() {};
        return apiClient.invokeAPI("/ssh-key", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List SSH keys
     * 
     * <p><b>200</b> - 200
     * @return ListSshKeys200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListSshKeys200Response> listSshKeys() throws WebClientResponseException {
        ParameterizedTypeReference<ListSshKeys200Response> localVarReturnType = new ParameterizedTypeReference<ListSshKeys200Response>() {};
        return listSshKeysRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * List SSH keys
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;ListSshKeys200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListSshKeys200Response>> listSshKeysWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<ListSshKeys200Response> localVarReturnType = new ParameterizedTypeReference<ListSshKeys200Response>() {};
        return listSshKeysRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * List SSH keys
     * 
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listSshKeysWithResponseSpec() throws WebClientResponseException {
        return listSshKeysRequestCreation();
    }
    /**
     * Import SSH key
     * 
     * <p><b>200</b> - 200
     * @param registerSshKeyRequest The registerSshKeyRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec registerSshKeyRequestCreation(RegisterSshKeyRequest registerSshKeyRequest) throws WebClientResponseException {
        Object postBody = registerSshKeyRequest;
        // verify the required parameter 'registerSshKeyRequest' is set
        if (registerSshKeyRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'registerSshKeyRequest' when calling registerSshKey", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/ssh-key", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Import SSH key
     * 
     * <p><b>200</b> - 200
     * @param registerSshKeyRequest The registerSshKeyRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> registerSshKey(RegisterSshKeyRequest registerSshKeyRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return registerSshKeyRequestCreation(registerSshKeyRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Import SSH key
     * 
     * <p><b>200</b> - 200
     * @param registerSshKeyRequest The registerSshKeyRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> registerSshKeyWithHttpInfo(RegisterSshKeyRequest registerSshKeyRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return registerSshKeyRequestCreation(registerSshKeyRequest).toEntity(localVarReturnType);
    }

    /**
     * Import SSH key
     * 
     * <p><b>200</b> - 200
     * @param registerSshKeyRequest The registerSshKeyRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec registerSshKeyWithResponseSpec(RegisterSshKeyRequest registerSshKeyRequest) throws WebClientResponseException {
        return registerSshKeyRequestCreation(registerSshKeyRequest);
    }
}
