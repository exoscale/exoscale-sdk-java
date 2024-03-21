package io.swagger.client.api;

import io.swagger.client.ApiClient;

import io.swagger.client.model.Event;
import java.time.OffsetDateTime;

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
@Component("io.swagger.client.api.EventApi")
public class EventApi {
    private ApiClient apiClient;

    public EventApi() {
        this(new ApiClient());
    }

    @Autowired
    public EventApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List Events
     * Retrieve Mutation Events for a given date range. Defaults to retrieving Events for the past 24 hours.          Both a &#x60;from&#x60; and &#x60;to&#x60; arguments can be specified to filter Events over a specific period.          Events will be the the most descriptive possible but not all fields are mandatory
     * <p><b>200</b> - 200
     * @param from  (optional)
     * @param to  (optional)
     * @return List&lt;Event&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Event> listEvents(OffsetDateTime from, OffsetDateTime to) throws RestClientException {
        return listEventsWithHttpInfo(from, to).getBody();
    }

    /**
     * List Events
     * Retrieve Mutation Events for a given date range. Defaults to retrieving Events for the past 24 hours.          Both a &#x60;from&#x60; and &#x60;to&#x60; arguments can be specified to filter Events over a specific period.          Events will be the the most descriptive possible but not all fields are mandatory
     * <p><b>200</b> - 200
     * @param from  (optional)
     * @param to  (optional)
     * @return ResponseEntity&lt;List&lt;Event&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Event>> listEventsWithHttpInfo(OffsetDateTime from, OffsetDateTime to) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/event").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<Event>> returnType = new ParameterizedTypeReference<List<Event>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
