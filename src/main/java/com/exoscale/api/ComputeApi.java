package com.exoscale.api;

import com.exoscale.invoker.ApiClient;

import com.exoscale.model.Operation;
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
public class ComputeApi {
    private ApiClient apiClient;

    public ComputeApi() {
        this(new ApiClient());
    }

    @Autowired
    public ComputeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Reset a Load Balancer Service field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param serviceId The serviceId parameter
     * @param field The field parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec resetLoadBalancerServiceFieldRequestCreation(UUID id, UUID serviceId, String field) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling resetLoadBalancerServiceField", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceId' when calling resetLoadBalancerServiceField", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'field' is set
        if (field == null) {
            throw new WebClientResponseException("Missing the required parameter 'field' when calling resetLoadBalancerServiceField", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);
        pathParams.put("service-id", serviceId);
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
        return apiClient.invokeAPI("/load-balancer/{id}/service/{service-id}/{field}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Reset a Load Balancer Service field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param serviceId The serviceId parameter
     * @param field The field parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> resetLoadBalancerServiceField(UUID id, UUID serviceId, String field) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetLoadBalancerServiceFieldRequestCreation(id, serviceId, field).bodyToMono(localVarReturnType);
    }

    /**
     * Reset a Load Balancer Service field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param serviceId The serviceId parameter
     * @param field The field parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> resetLoadBalancerServiceFieldWithHttpInfo(UUID id, UUID serviceId, String field) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetLoadBalancerServiceFieldRequestCreation(id, serviceId, field).toEntity(localVarReturnType);
    }

    /**
     * Reset a Load Balancer Service field to its default value
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param serviceId The serviceId parameter
     * @param field The field parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec resetLoadBalancerServiceFieldWithResponseSpec(UUID id, UUID serviceId, String field) throws WebClientResponseException {
        return resetLoadBalancerServiceFieldRequestCreation(id, serviceId, field);
    }
}
