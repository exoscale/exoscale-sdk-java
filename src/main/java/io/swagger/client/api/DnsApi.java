package io.swagger.client.api;

import io.swagger.client.ApiClient;

import io.swagger.client.model.DnsDomain;
import io.swagger.client.model.DnsDomainRecord;
import io.swagger.client.model.DnsdomainBody;
import io.swagger.client.model.DomainidRecordBody;
import io.swagger.client.model.InlineResponse20020;
import io.swagger.client.model.InlineResponse20025;
import io.swagger.client.model.InlineResponse2009;
import io.swagger.client.model.Operation;
import io.swagger.client.model.RecordRecordidBody;
import java.util.UUID;

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
@Component("io.swagger.client.api.DnsApi")
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
     * @param body  (required)
     * @return DnsDomain
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DnsDomain createDnsDomain(DnsdomainBody body) throws RestClientException {
        return createDnsDomainWithHttpInfo(body).getBody();
    }

    /**
     * Create DNS domain
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @return ResponseEntity&lt;DnsDomain&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DnsDomain> createDnsDomainWithHttpInfo(DnsdomainBody body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createDnsDomain");
        }
        String path = UriComponentsBuilder.fromPath("/dns-domain").build().toUriString();
        
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

        ParameterizedTypeReference<DnsDomain> returnType = new ParameterizedTypeReference<DnsDomain>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create DNS domain record
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param domainId  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation createDnsDomainRecord(DomainidRecordBody body, UUID domainId) throws RestClientException {
        return createDnsDomainRecordWithHttpInfo(body, domainId).getBody();
    }

    /**
     * Create DNS domain record
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param domainId  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> createDnsDomainRecordWithHttpInfo(DomainidRecordBody body, UUID domainId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createDnsDomainRecord");
        }
        // verify the required parameter 'domainId' is set
        if (domainId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'domainId' when calling createDnsDomainRecord");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("domain-id", domainId);
        String path = UriComponentsBuilder.fromPath("/dns-domain/{domain-id}/record").buildAndExpand(uriVariables).toUriString();
        
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
    /**
     * Delete DNS Domain
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteDnsDomain(UUID id) throws RestClientException {
        return deleteDnsDomainWithHttpInfo(id).getBody();
    }

    /**
     * Delete DNS Domain
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteDnsDomainWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteDnsDomain");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/dns-domain/{id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete DNS domain record
     * 
     * <p><b>200</b> - 200
     * @param domainId  (required)
     * @param recordId  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteDnsDomainRecord(UUID domainId, UUID recordId) throws RestClientException {
        return deleteDnsDomainRecordWithHttpInfo(domainId, recordId).getBody();
    }

    /**
     * Delete DNS domain record
     * 
     * <p><b>200</b> - 200
     * @param domainId  (required)
     * @param recordId  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteDnsDomainRecordWithHttpInfo(UUID domainId, UUID recordId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'domainId' is set
        if (domainId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'domainId' when calling deleteDnsDomainRecord");
        }
        // verify the required parameter 'recordId' is set
        if (recordId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recordId' when calling deleteDnsDomainRecord");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("domain-id", domainId);
        uriVariables.put("record-id", recordId);
        String path = UriComponentsBuilder.fromPath("/dns-domain/{domain-id}/record/{record-id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Retrieve DNS domain details
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return DnsDomain
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DnsDomain getDnsDomain(UUID id) throws RestClientException {
        return getDnsDomainWithHttpInfo(id).getBody();
    }

    /**
     * Retrieve DNS domain details
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ResponseEntity&lt;DnsDomain&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DnsDomain> getDnsDomainWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDnsDomain");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/dns-domain/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DnsDomain> returnType = new ParameterizedTypeReference<DnsDomain>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieve DNS domain record details
     * 
     * <p><b>200</b> - 200
     * @param domainId  (required)
     * @param recordId  (required)
     * @return DnsDomainRecord
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DnsDomainRecord getDnsDomainRecord(UUID domainId, UUID recordId) throws RestClientException {
        return getDnsDomainRecordWithHttpInfo(domainId, recordId).getBody();
    }

    /**
     * Retrieve DNS domain record details
     * 
     * <p><b>200</b> - 200
     * @param domainId  (required)
     * @param recordId  (required)
     * @return ResponseEntity&lt;DnsDomainRecord&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DnsDomainRecord> getDnsDomainRecordWithHttpInfo(UUID domainId, UUID recordId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'domainId' is set
        if (domainId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'domainId' when calling getDnsDomainRecord");
        }
        // verify the required parameter 'recordId' is set
        if (recordId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recordId' when calling getDnsDomainRecord");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("domain-id", domainId);
        uriVariables.put("record-id", recordId);
        String path = UriComponentsBuilder.fromPath("/dns-domain/{domain-id}/record/{record-id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DnsDomainRecord> returnType = new ParameterizedTypeReference<DnsDomainRecord>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Retrieve DNS domain zone file
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return InlineResponse20025
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20025 getDnsDomainZoneFile(UUID id) throws RestClientException {
        return getDnsDomainZoneFileWithHttpInfo(id).getBody();
    }

    /**
     * Retrieve DNS domain zone file
     * 
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ResponseEntity&lt;InlineResponse20025&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse20025> getDnsDomainZoneFileWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDnsDomainZoneFile");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/dns-domain/{id}/zone").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<InlineResponse20025> returnType = new ParameterizedTypeReference<InlineResponse20025>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List DNS domain records
     * 
     * <p><b>200</b> - 200
     * @param domainId  (required)
     * @return InlineResponse2009
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse2009 listDnsDomainRecords(UUID domainId) throws RestClientException {
        return listDnsDomainRecordsWithHttpInfo(domainId).getBody();
    }

    /**
     * List DNS domain records
     * 
     * <p><b>200</b> - 200
     * @param domainId  (required)
     * @return ResponseEntity&lt;InlineResponse2009&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse2009> listDnsDomainRecordsWithHttpInfo(UUID domainId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'domainId' is set
        if (domainId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'domainId' when calling listDnsDomainRecords");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("domain-id", domainId);
        String path = UriComponentsBuilder.fromPath("/dns-domain/{domain-id}/record").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<InlineResponse2009> returnType = new ParameterizedTypeReference<InlineResponse2009>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List DNS domains
     * 
     * <p><b>200</b> - 200
     * @return InlineResponse20020
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20020 listDnsDomains() throws RestClientException {
        return listDnsDomainsWithHttpInfo().getBody();
    }

    /**
     * List DNS domains
     * 
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;InlineResponse20020&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse20020> listDnsDomainsWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/dns-domain").build().toUriString();
        
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

        ParameterizedTypeReference<InlineResponse20020> returnType = new ParameterizedTypeReference<InlineResponse20020>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update DNS domain record
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param domainId  (required)
     * @param recordId  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation updateDnsDomainRecord(RecordRecordidBody body, UUID domainId, UUID recordId) throws RestClientException {
        return updateDnsDomainRecordWithHttpInfo(body, domainId, recordId).getBody();
    }

    /**
     * Update DNS domain record
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param domainId  (required)
     * @param recordId  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> updateDnsDomainRecordWithHttpInfo(RecordRecordidBody body, UUID domainId, UUID recordId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateDnsDomainRecord");
        }
        // verify the required parameter 'domainId' is set
        if (domainId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'domainId' when calling updateDnsDomainRecord");
        }
        // verify the required parameter 'recordId' is set
        if (recordId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recordId' when calling updateDnsDomainRecord");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("domain-id", domainId);
        uriVariables.put("record-id", recordId);
        String path = UriComponentsBuilder.fromPath("/dns-domain/{domain-id}/record/{record-id}").buildAndExpand(uriVariables).toUriString();
        
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
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
