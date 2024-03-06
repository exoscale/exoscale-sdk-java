package com.exoscale.api;

import com.exoscale.invoker.ApiClient;

import com.exoscale.model.CopyTemplateRequest;
import com.exoscale.model.ListTemplates200Response;
import com.exoscale.model.Operation;
import com.exoscale.model.PromoteSnapshotToTemplateRequest;
import com.exoscale.model.RegisterTemplateRequest;
import com.exoscale.model.Template;
import java.util.UUID;
import com.exoscale.model.UpdateTemplateRequest;

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
public class TemplateApi {
    private ApiClient apiClient;

    public TemplateApi() {
        this(new ApiClient());
    }

    @Autowired
    public TemplateApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Copy a Template from a zone to another
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param copyTemplateRequest The copyTemplateRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec copyTemplateRequestCreation(UUID id, CopyTemplateRequest copyTemplateRequest) throws WebClientResponseException {
        Object postBody = copyTemplateRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling copyTemplate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'copyTemplateRequest' is set
        if (copyTemplateRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'copyTemplateRequest' when calling copyTemplate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/template/{id}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Copy a Template from a zone to another
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param copyTemplateRequest The copyTemplateRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> copyTemplate(UUID id, CopyTemplateRequest copyTemplateRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return copyTemplateRequestCreation(id, copyTemplateRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Copy a Template from a zone to another
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param copyTemplateRequest The copyTemplateRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> copyTemplateWithHttpInfo(UUID id, CopyTemplateRequest copyTemplateRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return copyTemplateRequestCreation(id, copyTemplateRequest).toEntity(localVarReturnType);
    }

    /**
     * Copy a Template from a zone to another
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param copyTemplateRequest The copyTemplateRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec copyTemplateWithResponseSpec(UUID id, CopyTemplateRequest copyTemplateRequest) throws WebClientResponseException {
        return copyTemplateRequestCreation(id, copyTemplateRequest);
    }
    /**
     * Delete a Template
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteTemplateRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteTemplate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/template/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a Template
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteTemplate(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteTemplateRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a Template
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteTemplateWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteTemplateRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Delete a Template
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteTemplateWithResponseSpec(UUID id) throws WebClientResponseException {
        return deleteTemplateRequestCreation(id);
    }
    /**
     * Retrieve Template details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Template
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getTemplateRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getTemplate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Template> localVarReturnType = new ParameterizedTypeReference<Template>() {};
        return apiClient.invokeAPI("/template/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve Template details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Template
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Template> getTemplate(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Template> localVarReturnType = new ParameterizedTypeReference<Template>() {};
        return getTemplateRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve Template details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Template&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Template>> getTemplateWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Template> localVarReturnType = new ParameterizedTypeReference<Template>() {};
        return getTemplateRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Retrieve Template details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getTemplateWithResponseSpec(UUID id) throws WebClientResponseException {
        return getTemplateRequestCreation(id);
    }
    /**
     * List Templates
     * 
     * <p><b>200</b> - 200
     * @param visibility The visibility parameter
     * @param family The family parameter
     * @return ListTemplates200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listTemplatesRequestCreation(String visibility, String family) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "visibility", visibility));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "family", family));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ListTemplates200Response> localVarReturnType = new ParameterizedTypeReference<ListTemplates200Response>() {};
        return apiClient.invokeAPI("/template", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List Templates
     * 
     * <p><b>200</b> - 200
     * @param visibility The visibility parameter
     * @param family The family parameter
     * @return ListTemplates200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListTemplates200Response> listTemplates(String visibility, String family) throws WebClientResponseException {
        ParameterizedTypeReference<ListTemplates200Response> localVarReturnType = new ParameterizedTypeReference<ListTemplates200Response>() {};
        return listTemplatesRequestCreation(visibility, family).bodyToMono(localVarReturnType);
    }

    /**
     * List Templates
     * 
     * <p><b>200</b> - 200
     * @param visibility The visibility parameter
     * @param family The family parameter
     * @return ResponseEntity&lt;ListTemplates200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListTemplates200Response>> listTemplatesWithHttpInfo(String visibility, String family) throws WebClientResponseException {
        ParameterizedTypeReference<ListTemplates200Response> localVarReturnType = new ParameterizedTypeReference<ListTemplates200Response>() {};
        return listTemplatesRequestCreation(visibility, family).toEntity(localVarReturnType);
    }

    /**
     * List Templates
     * 
     * <p><b>200</b> - 200
     * @param visibility The visibility parameter
     * @param family The family parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listTemplatesWithResponseSpec(String visibility, String family) throws WebClientResponseException {
        return listTemplatesRequestCreation(visibility, family);
    }
    /**
     * Promote a Snapshot to a Template
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param promoteSnapshotToTemplateRequest The promoteSnapshotToTemplateRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec promoteSnapshotToTemplateRequestCreation(UUID id, PromoteSnapshotToTemplateRequest promoteSnapshotToTemplateRequest) throws WebClientResponseException {
        Object postBody = promoteSnapshotToTemplateRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling promoteSnapshotToTemplate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'promoteSnapshotToTemplateRequest' is set
        if (promoteSnapshotToTemplateRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'promoteSnapshotToTemplateRequest' when calling promoteSnapshotToTemplate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/snapshot/{id}:promote", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Promote a Snapshot to a Template
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param promoteSnapshotToTemplateRequest The promoteSnapshotToTemplateRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> promoteSnapshotToTemplate(UUID id, PromoteSnapshotToTemplateRequest promoteSnapshotToTemplateRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return promoteSnapshotToTemplateRequestCreation(id, promoteSnapshotToTemplateRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Promote a Snapshot to a Template
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param promoteSnapshotToTemplateRequest The promoteSnapshotToTemplateRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> promoteSnapshotToTemplateWithHttpInfo(UUID id, PromoteSnapshotToTemplateRequest promoteSnapshotToTemplateRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return promoteSnapshotToTemplateRequestCreation(id, promoteSnapshotToTemplateRequest).toEntity(localVarReturnType);
    }

    /**
     * Promote a Snapshot to a Template
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param promoteSnapshotToTemplateRequest The promoteSnapshotToTemplateRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec promoteSnapshotToTemplateWithResponseSpec(UUID id, PromoteSnapshotToTemplateRequest promoteSnapshotToTemplateRequest) throws WebClientResponseException {
        return promoteSnapshotToTemplateRequestCreation(id, promoteSnapshotToTemplateRequest);
    }
    /**
     * Register a Template
     * 
     * <p><b>200</b> - 200
     * @param registerTemplateRequest The registerTemplateRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec registerTemplateRequestCreation(RegisterTemplateRequest registerTemplateRequest) throws WebClientResponseException {
        Object postBody = registerTemplateRequest;
        // verify the required parameter 'registerTemplateRequest' is set
        if (registerTemplateRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'registerTemplateRequest' when calling registerTemplate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/template", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Register a Template
     * 
     * <p><b>200</b> - 200
     * @param registerTemplateRequest The registerTemplateRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> registerTemplate(RegisterTemplateRequest registerTemplateRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return registerTemplateRequestCreation(registerTemplateRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Register a Template
     * 
     * <p><b>200</b> - 200
     * @param registerTemplateRequest The registerTemplateRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> registerTemplateWithHttpInfo(RegisterTemplateRequest registerTemplateRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return registerTemplateRequestCreation(registerTemplateRequest).toEntity(localVarReturnType);
    }

    /**
     * Register a Template
     * 
     * <p><b>200</b> - 200
     * @param registerTemplateRequest The registerTemplateRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec registerTemplateWithResponseSpec(RegisterTemplateRequest registerTemplateRequest) throws WebClientResponseException {
        return registerTemplateRequestCreation(registerTemplateRequest);
    }
    /**
     * Update template attributes
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateTemplateRequest The updateTemplateRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateTemplateRequestCreation(UUID id, UpdateTemplateRequest updateTemplateRequest) throws WebClientResponseException {
        Object postBody = updateTemplateRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling updateTemplate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updateTemplateRequest' is set
        if (updateTemplateRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateTemplateRequest' when calling updateTemplate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/template/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update template attributes
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateTemplateRequest The updateTemplateRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updateTemplate(UUID id, UpdateTemplateRequest updateTemplateRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateTemplateRequestCreation(id, updateTemplateRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update template attributes
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateTemplateRequest The updateTemplateRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updateTemplateWithHttpInfo(UUID id, UpdateTemplateRequest updateTemplateRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateTemplateRequestCreation(id, updateTemplateRequest).toEntity(localVarReturnType);
    }

    /**
     * Update template attributes
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateTemplateRequest The updateTemplateRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateTemplateWithResponseSpec(UUID id, UpdateTemplateRequest updateTemplateRequest) throws WebClientResponseException {
        return updateTemplateRequestCreation(id, updateTemplateRequest);
    }
}
