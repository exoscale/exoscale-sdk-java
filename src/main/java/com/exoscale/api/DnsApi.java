package com.exoscale.api;

import com.exoscale.invoker.ApiClient;

import com.exoscale.model.CreateDnsDomainRecordRequest;
import com.exoscale.model.CreateDnsDomainRequest;
import com.exoscale.model.DnsDomain;
import com.exoscale.model.DnsDomainRecord;
import com.exoscale.model.GetDnsDomainZoneFile200Response;
import com.exoscale.model.ListDnsDomainRecords200Response;
import com.exoscale.model.ListDnsDomains200Response;
import com.exoscale.model.Operation;
import java.util.UUID;
import com.exoscale.model.UpdateDnsDomainRecordRequest;

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
public class DnsApi {
    private ApiClient apiClient;

    public DnsApi() {
        this(new ApiClient());
    }

    @Autowired
    public DnsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create DNS domain
     * 
     * <p><b>200</b> - 200
     * @param createDnsDomainRequest The createDnsDomainRequest parameter
     * @return DnsDomain
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createDnsDomainRequestCreation(CreateDnsDomainRequest createDnsDomainRequest) throws WebClientResponseException {
        Object postBody = createDnsDomainRequest;
        // verify the required parameter 'createDnsDomainRequest' is set
        if (createDnsDomainRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createDnsDomainRequest' when calling createDnsDomain", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DnsDomain> localVarReturnType = new ParameterizedTypeReference<DnsDomain>() {};
        return apiClient.invokeAPI("/dns-domain", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create DNS domain
     * 
     * <p><b>200</b> - 200
     * @param createDnsDomainRequest The createDnsDomainRequest parameter
     * @return DnsDomain
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DnsDomain> createDnsDomain(CreateDnsDomainRequest createDnsDomainRequest) throws WebClientResponseException {
        ParameterizedTypeReference<DnsDomain> localVarReturnType = new ParameterizedTypeReference<DnsDomain>() {};
        return createDnsDomainRequestCreation(createDnsDomainRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create DNS domain
     * 
     * <p><b>200</b> - 200
     * @param createDnsDomainRequest The createDnsDomainRequest parameter
     * @return ResponseEntity&lt;DnsDomain&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DnsDomain>> createDnsDomainWithHttpInfo(CreateDnsDomainRequest createDnsDomainRequest) throws WebClientResponseException {
        ParameterizedTypeReference<DnsDomain> localVarReturnType = new ParameterizedTypeReference<DnsDomain>() {};
        return createDnsDomainRequestCreation(createDnsDomainRequest).toEntity(localVarReturnType);
    }

    /**
     * Create DNS domain
     * 
     * <p><b>200</b> - 200
     * @param createDnsDomainRequest The createDnsDomainRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createDnsDomainWithResponseSpec(CreateDnsDomainRequest createDnsDomainRequest) throws WebClientResponseException {
        return createDnsDomainRequestCreation(createDnsDomainRequest);
    }
    /**
     * Create DNS domain record
     * 
     * <p><b>200</b> - 200
     * @param domainId The domainId parameter
     * @param createDnsDomainRecordRequest The createDnsDomainRecordRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createDnsDomainRecordRequestCreation(UUID domainId, CreateDnsDomainRecordRequest createDnsDomainRecordRequest) throws WebClientResponseException {
        Object postBody = createDnsDomainRecordRequest;
        // verify the required parameter 'domainId' is set
        if (domainId == null) {
            throw new WebClientResponseException("Missing the required parameter 'domainId' when calling createDnsDomainRecord", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'createDnsDomainRecordRequest' is set
        if (createDnsDomainRecordRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createDnsDomainRecordRequest' when calling createDnsDomainRecord", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("domain-id", domainId);

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
        return apiClient.invokeAPI("/dns-domain/{domain-id}/record", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create DNS domain record
     * 
     * <p><b>200</b> - 200
     * @param domainId The domainId parameter
     * @param createDnsDomainRecordRequest The createDnsDomainRecordRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createDnsDomainRecord(UUID domainId, CreateDnsDomainRecordRequest createDnsDomainRecordRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDnsDomainRecordRequestCreation(domainId, createDnsDomainRecordRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create DNS domain record
     * 
     * <p><b>200</b> - 200
     * @param domainId The domainId parameter
     * @param createDnsDomainRecordRequest The createDnsDomainRecordRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createDnsDomainRecordWithHttpInfo(UUID domainId, CreateDnsDomainRecordRequest createDnsDomainRecordRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDnsDomainRecordRequestCreation(domainId, createDnsDomainRecordRequest).toEntity(localVarReturnType);
    }

    /**
     * Create DNS domain record
     * 
     * <p><b>200</b> - 200
     * @param domainId The domainId parameter
     * @param createDnsDomainRecordRequest The createDnsDomainRecordRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createDnsDomainRecordWithResponseSpec(UUID domainId, CreateDnsDomainRecordRequest createDnsDomainRecordRequest) throws WebClientResponseException {
        return createDnsDomainRecordRequestCreation(domainId, createDnsDomainRecordRequest);
    }
    /**
     * Delete DNS Domain
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteDnsDomainRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteDnsDomain", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/dns-domain/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete DNS Domain
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteDnsDomain(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDnsDomainRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete DNS Domain
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteDnsDomainWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDnsDomainRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Delete DNS Domain
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteDnsDomainWithResponseSpec(UUID id) throws WebClientResponseException {
        return deleteDnsDomainRequestCreation(id);
    }
    /**
     * Delete DNS domain record
     * 
     * <p><b>200</b> - 200
     * @param domainId The domainId parameter
     * @param recordId The recordId parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteDnsDomainRecordRequestCreation(UUID domainId, UUID recordId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'domainId' is set
        if (domainId == null) {
            throw new WebClientResponseException("Missing the required parameter 'domainId' when calling deleteDnsDomainRecord", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'recordId' is set
        if (recordId == null) {
            throw new WebClientResponseException("Missing the required parameter 'recordId' when calling deleteDnsDomainRecord", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("domain-id", domainId);
        pathParams.put("record-id", recordId);

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
        return apiClient.invokeAPI("/dns-domain/{domain-id}/record/{record-id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete DNS domain record
     * 
     * <p><b>200</b> - 200
     * @param domainId The domainId parameter
     * @param recordId The recordId parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteDnsDomainRecord(UUID domainId, UUID recordId) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDnsDomainRecordRequestCreation(domainId, recordId).bodyToMono(localVarReturnType);
    }

    /**
     * Delete DNS domain record
     * 
     * <p><b>200</b> - 200
     * @param domainId The domainId parameter
     * @param recordId The recordId parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteDnsDomainRecordWithHttpInfo(UUID domainId, UUID recordId) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDnsDomainRecordRequestCreation(domainId, recordId).toEntity(localVarReturnType);
    }

    /**
     * Delete DNS domain record
     * 
     * <p><b>200</b> - 200
     * @param domainId The domainId parameter
     * @param recordId The recordId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteDnsDomainRecordWithResponseSpec(UUID domainId, UUID recordId) throws WebClientResponseException {
        return deleteDnsDomainRecordRequestCreation(domainId, recordId);
    }
    /**
     * Retrieve DNS domain details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return DnsDomain
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDnsDomainRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getDnsDomain", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DnsDomain> localVarReturnType = new ParameterizedTypeReference<DnsDomain>() {};
        return apiClient.invokeAPI("/dns-domain/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve DNS domain details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return DnsDomain
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DnsDomain> getDnsDomain(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<DnsDomain> localVarReturnType = new ParameterizedTypeReference<DnsDomain>() {};
        return getDnsDomainRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve DNS domain details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;DnsDomain&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DnsDomain>> getDnsDomainWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<DnsDomain> localVarReturnType = new ParameterizedTypeReference<DnsDomain>() {};
        return getDnsDomainRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Retrieve DNS domain details
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDnsDomainWithResponseSpec(UUID id) throws WebClientResponseException {
        return getDnsDomainRequestCreation(id);
    }
    /**
     * Retrieve DNS domain record details
     * 
     * <p><b>200</b> - 200
     * @param domainId The domainId parameter
     * @param recordId The recordId parameter
     * @return DnsDomainRecord
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDnsDomainRecordRequestCreation(UUID domainId, UUID recordId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'domainId' is set
        if (domainId == null) {
            throw new WebClientResponseException("Missing the required parameter 'domainId' when calling getDnsDomainRecord", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'recordId' is set
        if (recordId == null) {
            throw new WebClientResponseException("Missing the required parameter 'recordId' when calling getDnsDomainRecord", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("domain-id", domainId);
        pathParams.put("record-id", recordId);

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

        ParameterizedTypeReference<DnsDomainRecord> localVarReturnType = new ParameterizedTypeReference<DnsDomainRecord>() {};
        return apiClient.invokeAPI("/dns-domain/{domain-id}/record/{record-id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve DNS domain record details
     * 
     * <p><b>200</b> - 200
     * @param domainId The domainId parameter
     * @param recordId The recordId parameter
     * @return DnsDomainRecord
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DnsDomainRecord> getDnsDomainRecord(UUID domainId, UUID recordId) throws WebClientResponseException {
        ParameterizedTypeReference<DnsDomainRecord> localVarReturnType = new ParameterizedTypeReference<DnsDomainRecord>() {};
        return getDnsDomainRecordRequestCreation(domainId, recordId).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve DNS domain record details
     * 
     * <p><b>200</b> - 200
     * @param domainId The domainId parameter
     * @param recordId The recordId parameter
     * @return ResponseEntity&lt;DnsDomainRecord&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DnsDomainRecord>> getDnsDomainRecordWithHttpInfo(UUID domainId, UUID recordId) throws WebClientResponseException {
        ParameterizedTypeReference<DnsDomainRecord> localVarReturnType = new ParameterizedTypeReference<DnsDomainRecord>() {};
        return getDnsDomainRecordRequestCreation(domainId, recordId).toEntity(localVarReturnType);
    }

    /**
     * Retrieve DNS domain record details
     * 
     * <p><b>200</b> - 200
     * @param domainId The domainId parameter
     * @param recordId The recordId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDnsDomainRecordWithResponseSpec(UUID domainId, UUID recordId) throws WebClientResponseException {
        return getDnsDomainRecordRequestCreation(domainId, recordId);
    }
    /**
     * Retrieve DNS domain zone file
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return GetDnsDomainZoneFile200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDnsDomainZoneFileRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getDnsDomainZoneFile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetDnsDomainZoneFile200Response> localVarReturnType = new ParameterizedTypeReference<GetDnsDomainZoneFile200Response>() {};
        return apiClient.invokeAPI("/dns-domain/{id}/zone", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve DNS domain zone file
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return GetDnsDomainZoneFile200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetDnsDomainZoneFile200Response> getDnsDomainZoneFile(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<GetDnsDomainZoneFile200Response> localVarReturnType = new ParameterizedTypeReference<GetDnsDomainZoneFile200Response>() {};
        return getDnsDomainZoneFileRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve DNS domain zone file
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;GetDnsDomainZoneFile200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetDnsDomainZoneFile200Response>> getDnsDomainZoneFileWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<GetDnsDomainZoneFile200Response> localVarReturnType = new ParameterizedTypeReference<GetDnsDomainZoneFile200Response>() {};
        return getDnsDomainZoneFileRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Retrieve DNS domain zone file
     * 
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDnsDomainZoneFileWithResponseSpec(UUID id) throws WebClientResponseException {
        return getDnsDomainZoneFileRequestCreation(id);
    }
    /**
     * List DNS domain records
     * 
     * <p><b>200</b> - 200
     * @param domainId The domainId parameter
     * @return ListDnsDomainRecords200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listDnsDomainRecordsRequestCreation(UUID domainId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'domainId' is set
        if (domainId == null) {
            throw new WebClientResponseException("Missing the required parameter 'domainId' when calling listDnsDomainRecords", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("domain-id", domainId);

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

        ParameterizedTypeReference<ListDnsDomainRecords200Response> localVarReturnType = new ParameterizedTypeReference<ListDnsDomainRecords200Response>() {};
        return apiClient.invokeAPI("/dns-domain/{domain-id}/record", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List DNS domain records
     * 
     * <p><b>200</b> - 200
     * @param domainId The domainId parameter
     * @return ListDnsDomainRecords200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListDnsDomainRecords200Response> listDnsDomainRecords(UUID domainId) throws WebClientResponseException {
        ParameterizedTypeReference<ListDnsDomainRecords200Response> localVarReturnType = new ParameterizedTypeReference<ListDnsDomainRecords200Response>() {};
        return listDnsDomainRecordsRequestCreation(domainId).bodyToMono(localVarReturnType);
    }

    /**
     * List DNS domain records
     * 
     * <p><b>200</b> - 200
     * @param domainId The domainId parameter
     * @return ResponseEntity&lt;ListDnsDomainRecords200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListDnsDomainRecords200Response>> listDnsDomainRecordsWithHttpInfo(UUID domainId) throws WebClientResponseException {
        ParameterizedTypeReference<ListDnsDomainRecords200Response> localVarReturnType = new ParameterizedTypeReference<ListDnsDomainRecords200Response>() {};
        return listDnsDomainRecordsRequestCreation(domainId).toEntity(localVarReturnType);
    }

    /**
     * List DNS domain records
     * 
     * <p><b>200</b> - 200
     * @param domainId The domainId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listDnsDomainRecordsWithResponseSpec(UUID domainId) throws WebClientResponseException {
        return listDnsDomainRecordsRequestCreation(domainId);
    }
    /**
     * List DNS domains
     * 
     * <p><b>200</b> - 200
     * @return ListDnsDomains200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listDnsDomainsRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<ListDnsDomains200Response> localVarReturnType = new ParameterizedTypeReference<ListDnsDomains200Response>() {};
        return apiClient.invokeAPI("/dns-domain", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List DNS domains
     * 
     * <p><b>200</b> - 200
     * @return ListDnsDomains200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListDnsDomains200Response> listDnsDomains() throws WebClientResponseException {
        ParameterizedTypeReference<ListDnsDomains200Response> localVarReturnType = new ParameterizedTypeReference<ListDnsDomains200Response>() {};
        return listDnsDomainsRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * List DNS domains
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;ListDnsDomains200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListDnsDomains200Response>> listDnsDomainsWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<ListDnsDomains200Response> localVarReturnType = new ParameterizedTypeReference<ListDnsDomains200Response>() {};
        return listDnsDomainsRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * List DNS domains
     * 
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listDnsDomainsWithResponseSpec() throws WebClientResponseException {
        return listDnsDomainsRequestCreation();
    }
    /**
     * Update DNS domain record
     * 
     * <p><b>200</b> - 200
     * @param domainId The domainId parameter
     * @param recordId The recordId parameter
     * @param updateDnsDomainRecordRequest The updateDnsDomainRecordRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateDnsDomainRecordRequestCreation(UUID domainId, UUID recordId, UpdateDnsDomainRecordRequest updateDnsDomainRecordRequest) throws WebClientResponseException {
        Object postBody = updateDnsDomainRecordRequest;
        // verify the required parameter 'domainId' is set
        if (domainId == null) {
            throw new WebClientResponseException("Missing the required parameter 'domainId' when calling updateDnsDomainRecord", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'recordId' is set
        if (recordId == null) {
            throw new WebClientResponseException("Missing the required parameter 'recordId' when calling updateDnsDomainRecord", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updateDnsDomainRecordRequest' is set
        if (updateDnsDomainRecordRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateDnsDomainRecordRequest' when calling updateDnsDomainRecord", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("domain-id", domainId);
        pathParams.put("record-id", recordId);

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
        return apiClient.invokeAPI("/dns-domain/{domain-id}/record/{record-id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update DNS domain record
     * 
     * <p><b>200</b> - 200
     * @param domainId The domainId parameter
     * @param recordId The recordId parameter
     * @param updateDnsDomainRecordRequest The updateDnsDomainRecordRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updateDnsDomainRecord(UUID domainId, UUID recordId, UpdateDnsDomainRecordRequest updateDnsDomainRecordRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateDnsDomainRecordRequestCreation(domainId, recordId, updateDnsDomainRecordRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update DNS domain record
     * 
     * <p><b>200</b> - 200
     * @param domainId The domainId parameter
     * @param recordId The recordId parameter
     * @param updateDnsDomainRecordRequest The updateDnsDomainRecordRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updateDnsDomainRecordWithHttpInfo(UUID domainId, UUID recordId, UpdateDnsDomainRecordRequest updateDnsDomainRecordRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateDnsDomainRecordRequestCreation(domainId, recordId, updateDnsDomainRecordRequest).toEntity(localVarReturnType);
    }

    /**
     * Update DNS domain record
     * 
     * <p><b>200</b> - 200
     * @param domainId The domainId parameter
     * @param recordId The recordId parameter
     * @param updateDnsDomainRecordRequest The updateDnsDomainRecordRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateDnsDomainRecordWithResponseSpec(UUID domainId, UUID recordId, UpdateDnsDomainRecordRequest updateDnsDomainRecordRequest) throws WebClientResponseException {
        return updateDnsDomainRecordRequestCreation(domainId, recordId, updateDnsDomainRecordRequest);
    }
}
