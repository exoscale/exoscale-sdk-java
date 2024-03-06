package com.exoscale.api;

import com.exoscale.invoker.ApiClient;

import com.exoscale.model.ListQuotas200Response;
import com.exoscale.model.Quota;

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
public class QuotasApi {
    private ApiClient apiClient;

    public QuotasApi() {
        this(new ApiClient());
    }

    @Autowired
    public QuotasApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieve Resource Quota
     * 
     * <p><b>200</b> - 200
     * @param entity The entity parameter
     * @return Quota
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getQuotaRequestCreation(String entity) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'entity' is set
        if (entity == null) {
            throw new WebClientResponseException("Missing the required parameter 'entity' when calling getQuota", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("entity", entity);

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

        ParameterizedTypeReference<Quota> localVarReturnType = new ParameterizedTypeReference<Quota>() {};
        return apiClient.invokeAPI("/quota/{entity}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve Resource Quota
     * 
     * <p><b>200</b> - 200
     * @param entity The entity parameter
     * @return Quota
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Quota> getQuota(String entity) throws WebClientResponseException {
        ParameterizedTypeReference<Quota> localVarReturnType = new ParameterizedTypeReference<Quota>() {};
        return getQuotaRequestCreation(entity).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve Resource Quota
     * 
     * <p><b>200</b> - 200
     * @param entity The entity parameter
     * @return ResponseEntity&lt;Quota&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Quota>> getQuotaWithHttpInfo(String entity) throws WebClientResponseException {
        ParameterizedTypeReference<Quota> localVarReturnType = new ParameterizedTypeReference<Quota>() {};
        return getQuotaRequestCreation(entity).toEntity(localVarReturnType);
    }

    /**
     * Retrieve Resource Quota
     * 
     * <p><b>200</b> - 200
     * @param entity The entity parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getQuotaWithResponseSpec(String entity) throws WebClientResponseException {
        return getQuotaRequestCreation(entity);
    }
    /**
     * List Organization Quotas
     * 
     * <p><b>200</b> - 200
     * @return ListQuotas200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listQuotasRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<ListQuotas200Response> localVarReturnType = new ParameterizedTypeReference<ListQuotas200Response>() {};
        return apiClient.invokeAPI("/quota", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List Organization Quotas
     * 
     * <p><b>200</b> - 200
     * @return ListQuotas200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListQuotas200Response> listQuotas() throws WebClientResponseException {
        ParameterizedTypeReference<ListQuotas200Response> localVarReturnType = new ParameterizedTypeReference<ListQuotas200Response>() {};
        return listQuotasRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * List Organization Quotas
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;ListQuotas200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListQuotas200Response>> listQuotasWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<ListQuotas200Response> localVarReturnType = new ParameterizedTypeReference<ListQuotas200Response>() {};
        return listQuotasRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * List Organization Quotas
     * 
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listQuotasWithResponseSpec() throws WebClientResponseException {
        return listQuotasRequestCreation();
    }
}
