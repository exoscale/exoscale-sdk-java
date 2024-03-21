package io.swagger.client.api;

import io.swagger.client.ApiClient;

import io.swagger.client.model.InlineResponse20028;
import io.swagger.client.model.Operation;
import io.swagger.client.model.SshKey;
import io.swagger.client.model.SshkeyBody;

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
@Component("io.swagger.client.api.SshKeyApi")
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
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteSshKey(String name) throws RestClientException {
        return deleteSshKeyWithHttpInfo(name).getBody();
    }

    /**
     * Delete a SSH key
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteSshKeyWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling deleteSshKey");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/ssh-key/{name}").buildAndExpand(uriVariables).toUriString();
        
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
     * Retrieve SSH key details
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return SshKey
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SshKey getSshKey(String name) throws RestClientException {
        return getSshKeyWithHttpInfo(name).getBody();
    }

    /**
     * Retrieve SSH key details
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;SshKey&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SshKey> getSshKeyWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getSshKey");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/ssh-key/{name}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<SshKey> returnType = new ParameterizedTypeReference<SshKey>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List SSH keys
     * 
     * <p><b>200</b> - 200
     * @return InlineResponse20028
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20028 listSshKeys() throws RestClientException {
        return listSshKeysWithHttpInfo().getBody();
    }

    /**
     * List SSH keys
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;InlineResponse20028&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse20028> listSshKeysWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/ssh-key").build().toUriString();
        
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

        ParameterizedTypeReference<InlineResponse20028> returnType = new ParameterizedTypeReference<InlineResponse20028>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Import SSH key
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation registerSshKey(SshkeyBody body) throws RestClientException {
        return registerSshKeyWithHttpInfo(body).getBody();
    }

    /**
     * Import SSH key
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> registerSshKeyWithHttpInfo(SshkeyBody body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling registerSshKey");
        }
        String path = UriComponentsBuilder.fromPath("/ssh-key").build().toUriString();
        
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
}
