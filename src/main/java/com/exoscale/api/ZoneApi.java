package com.exoscale.api;

import com.exoscale.invoker.ApiClient;

import com.exoscale.model.ListZones200Response;

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
public class ZoneApi {
    private ApiClient apiClient;

    public ZoneApi() {
        this(new ApiClient());
    }

    @Autowired
    public ZoneApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List Zones
     * 
     * <p><b>200</b> - 200
     * @return ListZones200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listZonesRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<ListZones200Response> localVarReturnType = new ParameterizedTypeReference<ListZones200Response>() {};
        return apiClient.invokeAPI("/zone", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List Zones
     * 
     * <p><b>200</b> - 200
     * @return ListZones200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListZones200Response> listZones() throws WebClientResponseException {
        ParameterizedTypeReference<ListZones200Response> localVarReturnType = new ParameterizedTypeReference<ListZones200Response>() {};
        return listZonesRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * List Zones
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;ListZones200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListZones200Response>> listZonesWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<ListZones200Response> localVarReturnType = new ParameterizedTypeReference<ListZones200Response>() {};
        return listZonesRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * List Zones
     * 
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listZonesWithResponseSpec() throws WebClientResponseException {
        return listZonesRequestCreation();
    }
}
