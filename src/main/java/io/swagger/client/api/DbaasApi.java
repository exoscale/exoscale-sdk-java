package io.swagger.client.api;

import io.swagger.client.ApiClient;

import io.swagger.client.model.ConnectionpoolConnectionpoolnameBody;
import io.swagger.client.model.DbaasIntegration;
import io.swagger.client.model.DbaasKafkaAcls;
import io.swagger.client.model.DbaasKafkaSchemaRegistryAclEntry;
import io.swagger.client.model.DbaasKafkaTopicAclEntry;
import io.swagger.client.model.DbaasMigrationStatus;
import io.swagger.client.model.DbaasOpensearchAclConfig;
import io.swagger.client.model.DbaasPostgresUsers;
import io.swagger.client.model.DbaasServiceGrafana;
import io.swagger.client.model.DbaasServiceKafka;
import io.swagger.client.model.DbaasServiceLogs;
import io.swagger.client.model.DbaasServiceMysql;
import io.swagger.client.model.DbaasServiceOpensearch;
import io.swagger.client.model.DbaasServicePg;
import io.swagger.client.model.DbaasServiceRedis;
import io.swagger.client.model.DbaasServiceType;
import io.swagger.client.model.DbaasTask;
import io.swagger.client.model.DbaasgrafanaNameBody;
import io.swagger.client.model.DbaasgrafanaNameBody1;
import io.swagger.client.model.DbaasintegrationBody;
import io.swagger.client.model.DbaasintegrationIdBody;
import io.swagger.client.model.DbaaskafkaNameBody;
import io.swagger.client.model.DbaaskafkaNameBody1;
import io.swagger.client.model.DbaasmysqlNameBody;
import io.swagger.client.model.DbaasmysqlNameBody1;
import io.swagger.client.model.DbaasopensearchNameBody;
import io.swagger.client.model.DbaasopensearchNameBody1;
import io.swagger.client.model.DbaaspostgresNameBody;
import io.swagger.client.model.DbaaspostgresNameBody1;
import io.swagger.client.model.DbaasredisNameBody;
import io.swagger.client.model.DbaasredisNameBody1;
import io.swagger.client.model.DbaasservicelogsServicenameBody;
import io.swagger.client.model.DbaasservicemetricsServicenameBody;
import io.swagger.client.model.DbaastaskmigrationcheckServiceBody;
import io.swagger.client.model.InlineResponse20010;
import io.swagger.client.model.InlineResponse20011;
import io.swagger.client.model.InlineResponse20014;
import io.swagger.client.model.InlineResponse20021;
import io.swagger.client.model.InlineResponse20022;
import io.swagger.client.model.InlineResponse20027;
import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.InlineResponse20031;
import io.swagger.client.model.InlineResponse20032;
import io.swagger.client.model.InlineResponse20034;
import io.swagger.client.model.InlineResponse20035;
import io.swagger.client.model.InlineResponse2004;
import io.swagger.client.model.Operation;
import io.swagger.client.model.PasswordResetBody;
import io.swagger.client.model.PasswordResetBody1;
import io.swagger.client.model.PasswordResetBody2;
import io.swagger.client.model.PasswordResetBody3;
import io.swagger.client.model.ServiceUpgradecheckBody;
import io.swagger.client.model.ServicenameConnectionpoolBody;
import io.swagger.client.model.ServicenameDatabaseBody;
import io.swagger.client.model.ServicenameDatabaseBody1;
import io.swagger.client.model.ServicenameUserBody;
import io.swagger.client.model.ServicenameUserBody1;
import io.swagger.client.model.ServicenameUserBody2;
import io.swagger.client.model.ServicenameUserBody3;
import java.util.UUID;
import io.swagger.client.model.UsernameAllowreplicationBody;

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
@Component("io.swagger.client.api.DbaasApi")
public class DbaasApi {
    private ApiClient apiClient;

    public DbaasApi() {
        this(new ApiClient());
    }

    @Autowired
    public DbaasApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new DBaaS integration between two services
     * Create a new DBaaS integration between two services
     * <p><b>200</b> - 200
     * @param body  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation createDbaasIntegration(DbaasintegrationBody body) throws RestClientException {
        return createDbaasIntegrationWithHttpInfo(body).getBody();
    }

    /**
     * Create a new DBaaS integration between two services
     * Create a new DBaaS integration between two services
     * <p><b>200</b> - 200
     * @param body  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> createDbaasIntegrationWithHttpInfo(DbaasintegrationBody body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createDbaasIntegration");
        }
        String path = UriComponentsBuilder.fromPath("/dbaas-integration").build().toUriString();
        
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
     * Add a Kafka Schema Registry ACL entry
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation createDbaasKafkaSchemaRegistryAclConfig(DbaasKafkaSchemaRegistryAclEntry body, String name) throws RestClientException {
        return createDbaasKafkaSchemaRegistryAclConfigWithHttpInfo(body, name).getBody();
    }

    /**
     * Add a Kafka Schema Registry ACL entry
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> createDbaasKafkaSchemaRegistryAclConfigWithHttpInfo(DbaasKafkaSchemaRegistryAclEntry body, String name) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createDbaasKafkaSchemaRegistryAclConfig");
        }
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling createDbaasKafkaSchemaRegistryAclConfig");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-kafka/{name}/schema-registry/acl-config").buildAndExpand(uriVariables).toUriString();
        
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
     * Add a Kafka topic ACL entry
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation createDbaasKafkaTopicAclConfig(DbaasKafkaTopicAclEntry body, String name) throws RestClientException {
        return createDbaasKafkaTopicAclConfigWithHttpInfo(body, name).getBody();
    }

    /**
     * Add a Kafka topic ACL entry
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> createDbaasKafkaTopicAclConfigWithHttpInfo(DbaasKafkaTopicAclEntry body, String name) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createDbaasKafkaTopicAclConfig");
        }
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling createDbaasKafkaTopicAclConfig");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-kafka/{name}/topic/acl-config").buildAndExpand(uriVariables).toUriString();
        
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
     * Create a DBaaS Kafka user
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation createDbaasKafkaUser(ServicenameUserBody2 body, String serviceName) throws RestClientException {
        return createDbaasKafkaUserWithHttpInfo(body, serviceName).getBody();
    }

    /**
     * Create a DBaaS Kafka user
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> createDbaasKafkaUserWithHttpInfo(ServicenameUserBody2 body, String serviceName) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createDbaasKafkaUser");
        }
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceName' when calling createDbaasKafkaUser");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-name", serviceName);
        String path = UriComponentsBuilder.fromPath("/dbaas-kafka/{service-name}/user").buildAndExpand(uriVariables).toUriString();
        
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
     * Create a DBaaS MySQL database
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation createDbaasMysqlDatabase(ServicenameDatabaseBody1 body, String serviceName) throws RestClientException {
        return createDbaasMysqlDatabaseWithHttpInfo(body, serviceName).getBody();
    }

    /**
     * Create a DBaaS MySQL database
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> createDbaasMysqlDatabaseWithHttpInfo(ServicenameDatabaseBody1 body, String serviceName) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createDbaasMysqlDatabase");
        }
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceName' when calling createDbaasMysqlDatabase");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-name", serviceName);
        String path = UriComponentsBuilder.fromPath("/dbaas-mysql/{service-name}/database").buildAndExpand(uriVariables).toUriString();
        
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
     * Create a DBaaS MySQL user
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation createDbaasMysqlUser(ServicenameUserBody body, String serviceName) throws RestClientException {
        return createDbaasMysqlUserWithHttpInfo(body, serviceName).getBody();
    }

    /**
     * Create a DBaaS MySQL user
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> createDbaasMysqlUserWithHttpInfo(ServicenameUserBody body, String serviceName) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createDbaasMysqlUser");
        }
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceName' when calling createDbaasMysqlUser");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-name", serviceName);
        String path = UriComponentsBuilder.fromPath("/dbaas-mysql/{service-name}/user").buildAndExpand(uriVariables).toUriString();
        
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
     * Create a DBaaS OpenSearch user
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation createDbaasOpensearchUser(ServicenameUserBody3 body, String serviceName) throws RestClientException {
        return createDbaasOpensearchUserWithHttpInfo(body, serviceName).getBody();
    }

    /**
     * Create a DBaaS OpenSearch user
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> createDbaasOpensearchUserWithHttpInfo(ServicenameUserBody3 body, String serviceName) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createDbaasOpensearchUser");
        }
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceName' when calling createDbaasOpensearchUser");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-name", serviceName);
        String path = UriComponentsBuilder.fromPath("/dbaas-opensearch/{service-name}/user").buildAndExpand(uriVariables).toUriString();
        
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
     * Create a DBaaS PostgreSQL connection pool
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation createDbaasPgConnectionPool(ServicenameConnectionpoolBody body, String serviceName) throws RestClientException {
        return createDbaasPgConnectionPoolWithHttpInfo(body, serviceName).getBody();
    }

    /**
     * Create a DBaaS PostgreSQL connection pool
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> createDbaasPgConnectionPoolWithHttpInfo(ServicenameConnectionpoolBody body, String serviceName) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createDbaasPgConnectionPool");
        }
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceName' when calling createDbaasPgConnectionPool");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-name", serviceName);
        String path = UriComponentsBuilder.fromPath("/dbaas-postgres/{service-name}/connection-pool").buildAndExpand(uriVariables).toUriString();
        
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
     * Create a DBaaS Postgres database
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation createDbaasPgDatabase(ServicenameDatabaseBody body, String serviceName) throws RestClientException {
        return createDbaasPgDatabaseWithHttpInfo(body, serviceName).getBody();
    }

    /**
     * Create a DBaaS Postgres database
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> createDbaasPgDatabaseWithHttpInfo(ServicenameDatabaseBody body, String serviceName) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createDbaasPgDatabase");
        }
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceName' when calling createDbaasPgDatabase");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-name", serviceName);
        String path = UriComponentsBuilder.fromPath("/dbaas-postgres/{service-name}/database").buildAndExpand(uriVariables).toUriString();
        
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
     * 
     * Check whether you can upgrade Postgres service to a newer version
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param service  (required)
     * @return DbaasTask
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbaasTask createDbaasPgUpgradeCheck(ServiceUpgradecheckBody body, String service) throws RestClientException {
        return createDbaasPgUpgradeCheckWithHttpInfo(body, service).getBody();
    }

    /**
     * 
     * Check whether you can upgrade Postgres service to a newer version
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param service  (required)
     * @return ResponseEntity&lt;DbaasTask&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbaasTask> createDbaasPgUpgradeCheckWithHttpInfo(ServiceUpgradecheckBody body, String service) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createDbaasPgUpgradeCheck");
        }
        // verify the required parameter 'service' is set
        if (service == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'service' when calling createDbaasPgUpgradeCheck");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service", service);
        String path = UriComponentsBuilder.fromPath("/dbaas-postgres/{service}/upgrade-check").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DbaasTask> returnType = new ParameterizedTypeReference<DbaasTask>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create a DBaaS Postgres user
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation createDbaasPostgresUser(ServicenameUserBody1 body, String serviceName) throws RestClientException {
        return createDbaasPostgresUserWithHttpInfo(body, serviceName).getBody();
    }

    /**
     * Create a DBaaS Postgres user
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> createDbaasPostgresUserWithHttpInfo(ServicenameUserBody1 body, String serviceName) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createDbaasPostgresUser");
        }
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceName' when calling createDbaasPostgresUser");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-name", serviceName);
        String path = UriComponentsBuilder.fromPath("/dbaas-postgres/{service-name}/user").buildAndExpand(uriVariables).toUriString();
        
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
     * 
     * Create a DBaaS Grafana service
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation createDbaasServiceGrafana(DbaasgrafanaNameBody1 body, String name) throws RestClientException {
        return createDbaasServiceGrafanaWithHttpInfo(body, name).getBody();
    }

    /**
     * 
     * Create a DBaaS Grafana service
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> createDbaasServiceGrafanaWithHttpInfo(DbaasgrafanaNameBody1 body, String name) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createDbaasServiceGrafana");
        }
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling createDbaasServiceGrafana");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-grafana/{name}").buildAndExpand(uriVariables).toUriString();
        
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
     * Create a DBaaS Kafka service
     * Create a DBaaS Kafka service
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation createDbaasServiceKafka(DbaaskafkaNameBody1 body, String name) throws RestClientException {
        return createDbaasServiceKafkaWithHttpInfo(body, name).getBody();
    }

    /**
     * Create a DBaaS Kafka service
     * Create a DBaaS Kafka service
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> createDbaasServiceKafkaWithHttpInfo(DbaaskafkaNameBody1 body, String name) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createDbaasServiceKafka");
        }
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling createDbaasServiceKafka");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-kafka/{name}").buildAndExpand(uriVariables).toUriString();
        
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
     * Create a DBaaS MySQL service
     * Create a DBaaS MySQL service
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation createDbaasServiceMysql(DbaasmysqlNameBody1 body, String name) throws RestClientException {
        return createDbaasServiceMysqlWithHttpInfo(body, name).getBody();
    }

    /**
     * Create a DBaaS MySQL service
     * Create a DBaaS MySQL service
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> createDbaasServiceMysqlWithHttpInfo(DbaasmysqlNameBody1 body, String name) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createDbaasServiceMysql");
        }
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling createDbaasServiceMysql");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-mysql/{name}").buildAndExpand(uriVariables).toUriString();
        
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
     * Create a DBaaS OpenSearch service
     * Create a DBaaS OpenSearch service
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation createDbaasServiceOpensearch(DbaasopensearchNameBody1 body, String name) throws RestClientException {
        return createDbaasServiceOpensearchWithHttpInfo(body, name).getBody();
    }

    /**
     * Create a DBaaS OpenSearch service
     * Create a DBaaS OpenSearch service
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> createDbaasServiceOpensearchWithHttpInfo(DbaasopensearchNameBody1 body, String name) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createDbaasServiceOpensearch");
        }
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling createDbaasServiceOpensearch");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-opensearch/{name}").buildAndExpand(uriVariables).toUriString();
        
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
     * Create a DBaaS PostgreSQL service
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation createDbaasServicePg(DbaaspostgresNameBody1 body, String name) throws RestClientException {
        return createDbaasServicePgWithHttpInfo(body, name).getBody();
    }

    /**
     * Create a DBaaS PostgreSQL service
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> createDbaasServicePgWithHttpInfo(DbaaspostgresNameBody1 body, String name) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createDbaasServicePg");
        }
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling createDbaasServicePg");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-postgres/{name}").buildAndExpand(uriVariables).toUriString();
        
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
     * Create a DBaaS Redis service
     * Create a DBaaS Redis service
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation createDbaasServiceRedis(DbaasredisNameBody1 body, String name) throws RestClientException {
        return createDbaasServiceRedisWithHttpInfo(body, name).getBody();
    }

    /**
     * Create a DBaaS Redis service
     * Create a DBaaS Redis service
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> createDbaasServiceRedisWithHttpInfo(DbaasredisNameBody1 body, String name) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createDbaasServiceRedis");
        }
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling createDbaasServiceRedis");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-redis/{name}").buildAndExpand(uriVariables).toUriString();
        
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
     * 
     * Create a DBaaS task to check migration
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param service  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation createDbaasTaskMigrationCheck(DbaastaskmigrationcheckServiceBody body, String service) throws RestClientException {
        return createDbaasTaskMigrationCheckWithHttpInfo(body, service).getBody();
    }

    /**
     * 
     * Create a DBaaS task to check migration
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param service  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> createDbaasTaskMigrationCheckWithHttpInfo(DbaastaskmigrationcheckServiceBody body, String service) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createDbaasTaskMigrationCheck");
        }
        // verify the required parameter 'service' is set
        if (service == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'service' when calling createDbaasTaskMigrationCheck");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service", service);
        String path = UriComponentsBuilder.fromPath("/dbaas-task-migration-check/{service}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a DBaaS Integration
     * Delete a DBaaS Integration
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteDbaasIntegration(UUID id) throws RestClientException {
        return deleteDbaasIntegrationWithHttpInfo(id).getBody();
    }

    /**
     * Delete a DBaaS Integration
     * Delete a DBaaS Integration
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteDbaasIntegrationWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteDbaasIntegration");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/dbaas-integration/{id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a Kafka ACL entry
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @param aclId  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteDbaasKafkaSchemaRegistryAclConfig(String name, String aclId) throws RestClientException {
        return deleteDbaasKafkaSchemaRegistryAclConfigWithHttpInfo(name, aclId).getBody();
    }

    /**
     * Delete a Kafka ACL entry
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @param aclId  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteDbaasKafkaSchemaRegistryAclConfigWithHttpInfo(String name, String aclId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling deleteDbaasKafkaSchemaRegistryAclConfig");
        }
        // verify the required parameter 'aclId' is set
        if (aclId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'aclId' when calling deleteDbaasKafkaSchemaRegistryAclConfig");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        uriVariables.put("acl-id", aclId);
        String path = UriComponentsBuilder.fromPath("/dbaas-kafka/{name}/schema-registry/acl-config/{acl-id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a Kafka ACL entry
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @param aclId  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteDbaasKafkaTopicAclConfig(String name, String aclId) throws RestClientException {
        return deleteDbaasKafkaTopicAclConfigWithHttpInfo(name, aclId).getBody();
    }

    /**
     * Delete a Kafka ACL entry
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @param aclId  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteDbaasKafkaTopicAclConfigWithHttpInfo(String name, String aclId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling deleteDbaasKafkaTopicAclConfig");
        }
        // verify the required parameter 'aclId' is set
        if (aclId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'aclId' when calling deleteDbaasKafkaTopicAclConfig");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        uriVariables.put("acl-id", aclId);
        String path = UriComponentsBuilder.fromPath("/dbaas-kafka/{name}/topic/acl-config/{acl-id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a DBaaS kafka user
     * 
     * <p><b>200</b> - 200
     * @param serviceName  (required)
     * @param username  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteDbaasKafkaUser(String serviceName, String username) throws RestClientException {
        return deleteDbaasKafkaUserWithHttpInfo(serviceName, username).getBody();
    }

    /**
     * Delete a DBaaS kafka user
     * 
     * <p><b>200</b> - 200
     * @param serviceName  (required)
     * @param username  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteDbaasKafkaUserWithHttpInfo(String serviceName, String username) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceName' when calling deleteDbaasKafkaUser");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling deleteDbaasKafkaUser");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-name", serviceName);
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/dbaas-kafka/{service-name}/user/{username}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a DBaaS MySQL database
     * 
     * <p><b>200</b> - 200
     * @param serviceName  (required)
     * @param databaseName  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteDbaasMysqlDatabase(String serviceName, String databaseName) throws RestClientException {
        return deleteDbaasMysqlDatabaseWithHttpInfo(serviceName, databaseName).getBody();
    }

    /**
     * Delete a DBaaS MySQL database
     * 
     * <p><b>200</b> - 200
     * @param serviceName  (required)
     * @param databaseName  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteDbaasMysqlDatabaseWithHttpInfo(String serviceName, String databaseName) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceName' when calling deleteDbaasMysqlDatabase");
        }
        // verify the required parameter 'databaseName' is set
        if (databaseName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseName' when calling deleteDbaasMysqlDatabase");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-name", serviceName);
        uriVariables.put("database-name", databaseName);
        String path = UriComponentsBuilder.fromPath("/dbaas-mysql/{service-name}/database/{database-name}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a DBaaS MySQL user
     * 
     * <p><b>200</b> - 200
     * @param serviceName  (required)
     * @param username  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteDbaasMysqlUser(String serviceName, String username) throws RestClientException {
        return deleteDbaasMysqlUserWithHttpInfo(serviceName, username).getBody();
    }

    /**
     * Delete a DBaaS MySQL user
     * 
     * <p><b>200</b> - 200
     * @param serviceName  (required)
     * @param username  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteDbaasMysqlUserWithHttpInfo(String serviceName, String username) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceName' when calling deleteDbaasMysqlUser");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling deleteDbaasMysqlUser");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-name", serviceName);
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/dbaas-mysql/{service-name}/user/{username}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a DBaaS OpenSearch user
     * 
     * <p><b>200</b> - 200
     * @param serviceName  (required)
     * @param username  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteDbaasOpensearchUser(String serviceName, String username) throws RestClientException {
        return deleteDbaasOpensearchUserWithHttpInfo(serviceName, username).getBody();
    }

    /**
     * Delete a DBaaS OpenSearch user
     * 
     * <p><b>200</b> - 200
     * @param serviceName  (required)
     * @param username  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteDbaasOpensearchUserWithHttpInfo(String serviceName, String username) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceName' when calling deleteDbaasOpensearchUser");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling deleteDbaasOpensearchUser");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-name", serviceName);
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/dbaas-opensearch/{service-name}/user/{username}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a DBaaS PostgreSQL connection pool
     * 
     * <p><b>200</b> - 200
     * @param serviceName  (required)
     * @param connectionPoolName  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteDbaasPgConnectionPool(String serviceName, String connectionPoolName) throws RestClientException {
        return deleteDbaasPgConnectionPoolWithHttpInfo(serviceName, connectionPoolName).getBody();
    }

    /**
     * Delete a DBaaS PostgreSQL connection pool
     * 
     * <p><b>200</b> - 200
     * @param serviceName  (required)
     * @param connectionPoolName  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteDbaasPgConnectionPoolWithHttpInfo(String serviceName, String connectionPoolName) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceName' when calling deleteDbaasPgConnectionPool");
        }
        // verify the required parameter 'connectionPoolName' is set
        if (connectionPoolName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'connectionPoolName' when calling deleteDbaasPgConnectionPool");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-name", serviceName);
        uriVariables.put("connection-pool-name", connectionPoolName);
        String path = UriComponentsBuilder.fromPath("/dbaas-postgres/{service-name}/connection-pool/{connection-pool-name}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a DBaaS Postgres database
     * 
     * <p><b>200</b> - 200
     * @param serviceName  (required)
     * @param databaseName  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteDbaasPgDatabase(String serviceName, String databaseName) throws RestClientException {
        return deleteDbaasPgDatabaseWithHttpInfo(serviceName, databaseName).getBody();
    }

    /**
     * Delete a DBaaS Postgres database
     * 
     * <p><b>200</b> - 200
     * @param serviceName  (required)
     * @param databaseName  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteDbaasPgDatabaseWithHttpInfo(String serviceName, String databaseName) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceName' when calling deleteDbaasPgDatabase");
        }
        // verify the required parameter 'databaseName' is set
        if (databaseName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseName' when calling deleteDbaasPgDatabase");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-name", serviceName);
        uriVariables.put("database-name", databaseName);
        String path = UriComponentsBuilder.fromPath("/dbaas-postgres/{service-name}/database/{database-name}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a DBaaS Postgres user
     * 
     * <p><b>200</b> - 200
     * @param serviceName  (required)
     * @param username  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteDbaasPostgresUser(String serviceName, String username) throws RestClientException {
        return deleteDbaasPostgresUserWithHttpInfo(serviceName, username).getBody();
    }

    /**
     * Delete a DBaaS Postgres user
     * 
     * <p><b>200</b> - 200
     * @param serviceName  (required)
     * @param username  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteDbaasPostgresUserWithHttpInfo(String serviceName, String username) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceName' when calling deleteDbaasPostgresUser");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling deleteDbaasPostgresUser");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-name", serviceName);
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/dbaas-postgres/{service-name}/user/{username}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a DBaaS service
     * Delete a DBaaS service
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteDbaasService(String name) throws RestClientException {
        return deleteDbaasServiceWithHttpInfo(name).getBody();
    }

    /**
     * Delete a DBaaS service
     * Delete a DBaaS service
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteDbaasServiceWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling deleteDbaasService");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-service/{name}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a Grafana service
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteDbaasServiceGrafana(String name) throws RestClientException {
        return deleteDbaasServiceGrafanaWithHttpInfo(name).getBody();
    }

    /**
     * Delete a Grafana service
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteDbaasServiceGrafanaWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling deleteDbaasServiceGrafana");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-grafana/{name}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a Kafka service
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteDbaasServiceKafka(String name) throws RestClientException {
        return deleteDbaasServiceKafkaWithHttpInfo(name).getBody();
    }

    /**
     * Delete a Kafka service
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteDbaasServiceKafkaWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling deleteDbaasServiceKafka");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-kafka/{name}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a MySQL service
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteDbaasServiceMysql(String name) throws RestClientException {
        return deleteDbaasServiceMysqlWithHttpInfo(name).getBody();
    }

    /**
     * Delete a MySQL service
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteDbaasServiceMysqlWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling deleteDbaasServiceMysql");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-mysql/{name}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a OpenSearch service
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteDbaasServiceOpensearch(String name) throws RestClientException {
        return deleteDbaasServiceOpensearchWithHttpInfo(name).getBody();
    }

    /**
     * Delete a OpenSearch service
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteDbaasServiceOpensearchWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling deleteDbaasServiceOpensearch");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-opensearch/{name}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a Postgres service
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteDbaasServicePg(String name) throws RestClientException {
        return deleteDbaasServicePgWithHttpInfo(name).getBody();
    }

    /**
     * Delete a Postgres service
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteDbaasServicePgWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling deleteDbaasServicePg");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-postgres/{name}").buildAndExpand(uriVariables).toUriString();
        
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
     * Delete a Redis service
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation deleteDbaasServiceRedis(String name) throws RestClientException {
        return deleteDbaasServiceRedisWithHttpInfo(name).getBody();
    }

    /**
     * Delete a Redis service
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> deleteDbaasServiceRedisWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling deleteDbaasServiceRedis");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-redis/{name}").buildAndExpand(uriVariables).toUriString();
        
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
     * Get DBaaS CA Certificate
     * Returns a CA Certificate required to reach a DBaaS service through a TLS-protected connection.
     * <p><b>200</b> - 200
     * @return InlineResponse20010
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20010 getDbaasCaCertificate() throws RestClientException {
        return getDbaasCaCertificateWithHttpInfo().getBody();
    }

    /**
     * Get DBaaS CA Certificate
     * Returns a CA Certificate required to reach a DBaaS service through a TLS-protected connection.
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;InlineResponse20010&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse20010> getDbaasCaCertificateWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/dbaas-ca-certificate").build().toUriString();
        
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

        ParameterizedTypeReference<InlineResponse20010> returnType = new ParameterizedTypeReference<InlineResponse20010>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a DBaaS Integration
     * Get a DBaaS Integration
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return DbaasIntegration
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbaasIntegration getDbaasIntegration(UUID id) throws RestClientException {
        return getDbaasIntegrationWithHttpInfo(id).getBody();
    }

    /**
     * Get a DBaaS Integration
     * Get a DBaaS Integration
     * <p><b>200</b> - 200
     * @param id  (required)
     * @return ResponseEntity&lt;DbaasIntegration&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbaasIntegration> getDbaasIntegrationWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDbaasIntegration");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/dbaas-integration/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DbaasIntegration> returnType = new ParameterizedTypeReference<DbaasIntegration>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get DBaaS kafka ACL configuration
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return DbaasKafkaAcls
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbaasKafkaAcls getDbaasKafkaAclConfig(String name) throws RestClientException {
        return getDbaasKafkaAclConfigWithHttpInfo(name).getBody();
    }

    /**
     * Get DBaaS kafka ACL configuration
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;DbaasKafkaAcls&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbaasKafkaAcls> getDbaasKafkaAclConfigWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getDbaasKafkaAclConfig");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-kafka/{name}/acl-config").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DbaasKafkaAcls> returnType = new ParameterizedTypeReference<DbaasKafkaAcls>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a DBaaS migration status
     * Get a DBaaS migration status
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return DbaasMigrationStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbaasMigrationStatus getDbaasMigrationStatus(String name) throws RestClientException {
        return getDbaasMigrationStatusWithHttpInfo(name).getBody();
    }

    /**
     * Get a DBaaS migration status
     * Get a DBaaS migration status
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;DbaasMigrationStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbaasMigrationStatus> getDbaasMigrationStatusWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getDbaasMigrationStatus");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-migration-status/{name}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DbaasMigrationStatus> returnType = new ParameterizedTypeReference<DbaasMigrationStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get DBaaS OpenSearch ACL configuration
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return DbaasOpensearchAclConfig
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbaasOpensearchAclConfig getDbaasOpensearchAclConfig(String name) throws RestClientException {
        return getDbaasOpensearchAclConfigWithHttpInfo(name).getBody();
    }

    /**
     * Get DBaaS OpenSearch ACL configuration
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;DbaasOpensearchAclConfig&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbaasOpensearchAclConfig> getDbaasOpensearchAclConfigWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getDbaasOpensearchAclConfig");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-opensearch/{name}/acl-config").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DbaasOpensearchAclConfig> returnType = new ParameterizedTypeReference<DbaasOpensearchAclConfig>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a DBaaS Grafana service
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return DbaasServiceGrafana
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbaasServiceGrafana getDbaasServiceGrafana(String name) throws RestClientException {
        return getDbaasServiceGrafanaWithHttpInfo(name).getBody();
    }

    /**
     * Get a DBaaS Grafana service
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;DbaasServiceGrafana&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbaasServiceGrafana> getDbaasServiceGrafanaWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getDbaasServiceGrafana");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-grafana/{name}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DbaasServiceGrafana> returnType = new ParameterizedTypeReference<DbaasServiceGrafana>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a DBaaS Kafka service
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return DbaasServiceKafka
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbaasServiceKafka getDbaasServiceKafka(String name) throws RestClientException {
        return getDbaasServiceKafkaWithHttpInfo(name).getBody();
    }

    /**
     * Get a DBaaS Kafka service
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;DbaasServiceKafka&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbaasServiceKafka> getDbaasServiceKafkaWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getDbaasServiceKafka");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-kafka/{name}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DbaasServiceKafka> returnType = new ParameterizedTypeReference<DbaasServiceKafka>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get logs of DBaaS service
     * Get logs of DBaaS service
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @return DbaasServiceLogs
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbaasServiceLogs getDbaasServiceLogs(DbaasservicelogsServicenameBody body, String serviceName) throws RestClientException {
        return getDbaasServiceLogsWithHttpInfo(body, serviceName).getBody();
    }

    /**
     * Get logs of DBaaS service
     * Get logs of DBaaS service
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @return ResponseEntity&lt;DbaasServiceLogs&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbaasServiceLogs> getDbaasServiceLogsWithHttpInfo(DbaasservicelogsServicenameBody body, String serviceName) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling getDbaasServiceLogs");
        }
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceName' when calling getDbaasServiceLogs");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-name", serviceName);
        String path = UriComponentsBuilder.fromPath("/dbaas-service-logs/{service-name}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DbaasServiceLogs> returnType = new ParameterizedTypeReference<DbaasServiceLogs>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get metrics of DBaaS service
     * Get metrics of DBaaS service
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @return InlineResponse20027
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20027 getDbaasServiceMetrics(DbaasservicemetricsServicenameBody body, String serviceName) throws RestClientException {
        return getDbaasServiceMetricsWithHttpInfo(body, serviceName).getBody();
    }

    /**
     * Get metrics of DBaaS service
     * Get metrics of DBaaS service
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @return ResponseEntity&lt;InlineResponse20027&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse20027> getDbaasServiceMetricsWithHttpInfo(DbaasservicemetricsServicenameBody body, String serviceName) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling getDbaasServiceMetrics");
        }
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceName' when calling getDbaasServiceMetrics");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-name", serviceName);
        String path = UriComponentsBuilder.fromPath("/dbaas-service-metrics/{service-name}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<InlineResponse20027> returnType = new ParameterizedTypeReference<InlineResponse20027>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a DBaaS MySQL service
     * Get a DBaaS MySQL service
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return DbaasServiceMysql
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbaasServiceMysql getDbaasServiceMysql(String name) throws RestClientException {
        return getDbaasServiceMysqlWithHttpInfo(name).getBody();
    }

    /**
     * Get a DBaaS MySQL service
     * Get a DBaaS MySQL service
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;DbaasServiceMysql&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbaasServiceMysql> getDbaasServiceMysqlWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getDbaasServiceMysql");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-mysql/{name}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DbaasServiceMysql> returnType = new ParameterizedTypeReference<DbaasServiceMysql>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a DBaaS OpenSearch service
     * Get a DBaaS OpenSearch service
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return DbaasServiceOpensearch
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbaasServiceOpensearch getDbaasServiceOpensearch(String name) throws RestClientException {
        return getDbaasServiceOpensearchWithHttpInfo(name).getBody();
    }

    /**
     * Get a DBaaS OpenSearch service
     * Get a DBaaS OpenSearch service
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;DbaasServiceOpensearch&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbaasServiceOpensearch> getDbaasServiceOpensearchWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getDbaasServiceOpensearch");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-opensearch/{name}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DbaasServiceOpensearch> returnType = new ParameterizedTypeReference<DbaasServiceOpensearch>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a DBaaS PostgreSQL service
     * Get a DBaaS PostgreSQL service
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return DbaasServicePg
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbaasServicePg getDbaasServicePg(String name) throws RestClientException {
        return getDbaasServicePgWithHttpInfo(name).getBody();
    }

    /**
     * Get a DBaaS PostgreSQL service
     * Get a DBaaS PostgreSQL service
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;DbaasServicePg&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbaasServicePg> getDbaasServicePgWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getDbaasServicePg");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-postgres/{name}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DbaasServicePg> returnType = new ParameterizedTypeReference<DbaasServicePg>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a DBaaS Redis service
     * Get a DBaaS Redis service
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return DbaasServiceRedis
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbaasServiceRedis getDbaasServiceRedis(String name) throws RestClientException {
        return getDbaasServiceRedisWithHttpInfo(name).getBody();
    }

    /**
     * Get a DBaaS Redis service
     * Get a DBaaS Redis service
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;DbaasServiceRedis&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbaasServiceRedis> getDbaasServiceRedisWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getDbaasServiceRedis");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-redis/{name}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DbaasServiceRedis> returnType = new ParameterizedTypeReference<DbaasServiceRedis>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a DBaaS service type
     * Get a DBaaS service type
     * <p><b>200</b> - 200
     * @param serviceTypeName  (required)
     * @return DbaasServiceType
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbaasServiceType getDbaasServiceType(String serviceTypeName) throws RestClientException {
        return getDbaasServiceTypeWithHttpInfo(serviceTypeName).getBody();
    }

    /**
     * Get a DBaaS service type
     * Get a DBaaS service type
     * <p><b>200</b> - 200
     * @param serviceTypeName  (required)
     * @return ResponseEntity&lt;DbaasServiceType&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbaasServiceType> getDbaasServiceTypeWithHttpInfo(String serviceTypeName) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'serviceTypeName' is set
        if (serviceTypeName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceTypeName' when calling getDbaasServiceType");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-type-name", serviceTypeName);
        String path = UriComponentsBuilder.fromPath("/dbaas-service-type/{service-type-name}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DbaasServiceType> returnType = new ParameterizedTypeReference<DbaasServiceType>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get DBaaS Grafana settings
     * Get DBaaS Grafana settings
     * <p><b>200</b> - 200
     * @return InlineResponse20011
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20011 getDbaasSettingsGrafana() throws RestClientException {
        return getDbaasSettingsGrafanaWithHttpInfo().getBody();
    }

    /**
     * Get DBaaS Grafana settings
     * Get DBaaS Grafana settings
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;InlineResponse20011&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse20011> getDbaasSettingsGrafanaWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/dbaas-settings-grafana").build().toUriString();
        
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

        ParameterizedTypeReference<InlineResponse20011> returnType = new ParameterizedTypeReference<InlineResponse20011>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get DBaaS Kafka settings
     * Get DBaaS Kafka settings
     * <p><b>200</b> - 200
     * @return InlineResponse20034
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20034 getDbaasSettingsKafka() throws RestClientException {
        return getDbaasSettingsKafkaWithHttpInfo().getBody();
    }

    /**
     * Get DBaaS Kafka settings
     * Get DBaaS Kafka settings
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;InlineResponse20034&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse20034> getDbaasSettingsKafkaWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/dbaas-settings-kafka").build().toUriString();
        
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

        ParameterizedTypeReference<InlineResponse20034> returnType = new ParameterizedTypeReference<InlineResponse20034>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get DBaaS MySQL settings
     * Get DBaaS MySQL settings
     * <p><b>200</b> - 200
     * @return InlineResponse20021
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20021 getDbaasSettingsMysql() throws RestClientException {
        return getDbaasSettingsMysqlWithHttpInfo().getBody();
    }

    /**
     * Get DBaaS MySQL settings
     * Get DBaaS MySQL settings
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;InlineResponse20021&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse20021> getDbaasSettingsMysqlWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/dbaas-settings-mysql").build().toUriString();
        
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

        ParameterizedTypeReference<InlineResponse20021> returnType = new ParameterizedTypeReference<InlineResponse20021>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get DBaaS OpenSearch settings
     * Get DBaaS OpenSearch settings
     * <p><b>200</b> - 200
     * @return InlineResponse20035
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20035 getDbaasSettingsOpensearch() throws RestClientException {
        return getDbaasSettingsOpensearchWithHttpInfo().getBody();
    }

    /**
     * Get DBaaS OpenSearch settings
     * Get DBaaS OpenSearch settings
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;InlineResponse20035&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse20035> getDbaasSettingsOpensearchWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/dbaas-settings-opensearch").build().toUriString();
        
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

        ParameterizedTypeReference<InlineResponse20035> returnType = new ParameterizedTypeReference<InlineResponse20035>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get DBaaS PostgreSQL settings
     * Get DBaaS PostgreSQL settings
     * <p><b>200</b> - 200
     * @return InlineResponse20032
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20032 getDbaasSettingsPg() throws RestClientException {
        return getDbaasSettingsPgWithHttpInfo().getBody();
    }

    /**
     * Get DBaaS PostgreSQL settings
     * Get DBaaS PostgreSQL settings
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;InlineResponse20032&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse20032> getDbaasSettingsPgWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/dbaas-settings-pg").build().toUriString();
        
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

        ParameterizedTypeReference<InlineResponse20032> returnType = new ParameterizedTypeReference<InlineResponse20032>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get DBaaS Redis settings
     * Returns the default settings for Redis.
     * <p><b>200</b> - 200
     * @return InlineResponse20014
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20014 getDbaasSettingsRedis() throws RestClientException {
        return getDbaasSettingsRedisWithHttpInfo().getBody();
    }

    /**
     * Get DBaaS Redis settings
     * Returns the default settings for Redis.
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;InlineResponse20014&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse20014> getDbaasSettingsRedisWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/dbaas-settings-redis").build().toUriString();
        
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

        ParameterizedTypeReference<InlineResponse20014> returnType = new ParameterizedTypeReference<InlineResponse20014>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a DBaaS task
     * Get a DBaaS task
     * <p><b>200</b> - 200
     * @param service  (required)
     * @param id  (required)
     * @return DbaasTask
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbaasTask getDbaasTask(String service, UUID id) throws RestClientException {
        return getDbaasTaskWithHttpInfo(service, id).getBody();
    }

    /**
     * Get a DBaaS task
     * Get a DBaaS task
     * <p><b>200</b> - 200
     * @param service  (required)
     * @param id  (required)
     * @return ResponseEntity&lt;DbaasTask&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbaasTask> getDbaasTaskWithHttpInfo(String service, UUID id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'service' is set
        if (service == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'service' when calling getDbaasTask");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDbaasTask");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service", service);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/dbaas-task/{service}/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DbaasTask> returnType = new ParameterizedTypeReference<DbaasTask>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get DBaaS integration settings
     * Get DBaaS integration settings
     * <p><b>200</b> - 200
     * @param integrationType  (required)
     * @param sourceType  (required)
     * @param destType  (required)
     * @return InlineResponse20031
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20031 listDbaasIntegrationSettings(String integrationType, String sourceType, String destType) throws RestClientException {
        return listDbaasIntegrationSettingsWithHttpInfo(integrationType, sourceType, destType).getBody();
    }

    /**
     * Get DBaaS integration settings
     * Get DBaaS integration settings
     * <p><b>200</b> - 200
     * @param integrationType  (required)
     * @param sourceType  (required)
     * @param destType  (required)
     * @return ResponseEntity&lt;InlineResponse20031&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse20031> listDbaasIntegrationSettingsWithHttpInfo(String integrationType, String sourceType, String destType) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'integrationType' is set
        if (integrationType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'integrationType' when calling listDbaasIntegrationSettings");
        }
        // verify the required parameter 'sourceType' is set
        if (sourceType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sourceType' when calling listDbaasIntegrationSettings");
        }
        // verify the required parameter 'destType' is set
        if (destType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'destType' when calling listDbaasIntegrationSettings");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("integration-type", integrationType);
        uriVariables.put("source-type", sourceType);
        uriVariables.put("dest-type", destType);
        String path = UriComponentsBuilder.fromPath("/dbaas-integration-settings/{integration-type}/{source-type}/{dest-type}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<InlineResponse20031> returnType = new ParameterizedTypeReference<InlineResponse20031>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get DBaaS integration types
     * Get DBaaS integration types
     * <p><b>200</b> - 200
     * @return InlineResponse20022
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse20022 listDbaasIntegrationTypes() throws RestClientException {
        return listDbaasIntegrationTypesWithHttpInfo().getBody();
    }

    /**
     * Get DBaaS integration types
     * Get DBaaS integration types
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;InlineResponse20022&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse20022> listDbaasIntegrationTypesWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/dbaas-integration-types").build().toUriString();
        
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

        ParameterizedTypeReference<InlineResponse20022> returnType = new ParameterizedTypeReference<InlineResponse20022>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * DBaaS Service Types
     * List available service types for DBaaS
     * <p><b>200</b> - 200
     * @return InlineResponse2003
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse2003 listDbaasServiceTypes() throws RestClientException {
        return listDbaasServiceTypesWithHttpInfo().getBody();
    }

    /**
     * DBaaS Service Types
     * List available service types for DBaaS
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;InlineResponse2003&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse2003> listDbaasServiceTypesWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/dbaas-service-type").build().toUriString();
        
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

        ParameterizedTypeReference<InlineResponse2003> returnType = new ParameterizedTypeReference<InlineResponse2003>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List DBaaS services
     * List DBaaS services
     * <p><b>200</b> - 200
     * @return InlineResponse2004
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InlineResponse2004 listDbaasServices() throws RestClientException {
        return listDbaasServicesWithHttpInfo().getBody();
    }

    /**
     * List DBaaS services
     * List DBaaS services
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;InlineResponse2004&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InlineResponse2004> listDbaasServicesWithHttpInfo() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/dbaas-service").build().toUriString();
        
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

        ParameterizedTypeReference<InlineResponse2004> returnType = new ParameterizedTypeReference<InlineResponse2004>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Reset the credentials of a DBaaS Kafka user
     * If no password is provided one will be generated automatically.
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @param username  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation resetDbaasKafkaUserPassword(PasswordResetBody2 body, String serviceName, String username) throws RestClientException {
        return resetDbaasKafkaUserPasswordWithHttpInfo(body, serviceName, username).getBody();
    }

    /**
     * Reset the credentials of a DBaaS Kafka user
     * If no password is provided one will be generated automatically.
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @param username  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> resetDbaasKafkaUserPasswordWithHttpInfo(PasswordResetBody2 body, String serviceName, String username) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling resetDbaasKafkaUserPassword");
        }
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceName' when calling resetDbaasKafkaUserPassword");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling resetDbaasKafkaUserPassword");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-name", serviceName);
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/dbaas-kafka/{service-name}/user/{username}/password/reset").buildAndExpand(uriVariables).toUriString();
        
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
    /**
     * Reset the credentials of a DBaaS mysql user
     * If no password is provided one will be generated automatically.
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @param username  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation resetDbaasMysqlUserPassword(PasswordResetBody body, String serviceName, String username) throws RestClientException {
        return resetDbaasMysqlUserPasswordWithHttpInfo(body, serviceName, username).getBody();
    }

    /**
     * Reset the credentials of a DBaaS mysql user
     * If no password is provided one will be generated automatically.
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @param username  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> resetDbaasMysqlUserPasswordWithHttpInfo(PasswordResetBody body, String serviceName, String username) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling resetDbaasMysqlUserPassword");
        }
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceName' when calling resetDbaasMysqlUserPassword");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling resetDbaasMysqlUserPassword");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-name", serviceName);
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/dbaas-mysql/{service-name}/user/{username}/password/reset").buildAndExpand(uriVariables).toUriString();
        
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
    /**
     * Reset the credentials of a DBaaS OpenSearch user
     * If no password is provided one will be generated automatically.
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @param username  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation resetDbaasOpensearchUserPassword(PasswordResetBody1 body, String serviceName, String username) throws RestClientException {
        return resetDbaasOpensearchUserPasswordWithHttpInfo(body, serviceName, username).getBody();
    }

    /**
     * Reset the credentials of a DBaaS OpenSearch user
     * If no password is provided one will be generated automatically.
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @param username  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> resetDbaasOpensearchUserPasswordWithHttpInfo(PasswordResetBody1 body, String serviceName, String username) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling resetDbaasOpensearchUserPassword");
        }
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceName' when calling resetDbaasOpensearchUserPassword");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling resetDbaasOpensearchUserPassword");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-name", serviceName);
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/dbaas-opensearch/{service-name}/user/{username}/password/reset").buildAndExpand(uriVariables).toUriString();
        
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
    /**
     * Reset the credentials of a DBaaS Postgres user
     * If no password is provided one will be generated automatically.
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @param username  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation resetDbaasPostgresUserPassword(PasswordResetBody3 body, String serviceName, String username) throws RestClientException {
        return resetDbaasPostgresUserPasswordWithHttpInfo(body, serviceName, username).getBody();
    }

    /**
     * Reset the credentials of a DBaaS Postgres user
     * If no password is provided one will be generated automatically.
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @param username  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> resetDbaasPostgresUserPasswordWithHttpInfo(PasswordResetBody3 body, String serviceName, String username) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling resetDbaasPostgresUserPassword");
        }
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceName' when calling resetDbaasPostgresUserPassword");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling resetDbaasPostgresUserPassword");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-name", serviceName);
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/dbaas-postgres/{service-name}/user/{username}/password/reset").buildAndExpand(uriVariables).toUriString();
        
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
    /**
     * Initiate Grafana maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation startDbaasGrafanaMaintenance(String name) throws RestClientException {
        return startDbaasGrafanaMaintenanceWithHttpInfo(name).getBody();
    }

    /**
     * Initiate Grafana maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> startDbaasGrafanaMaintenanceWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling startDbaasGrafanaMaintenance");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-grafana/{name}/maintenance/start").buildAndExpand(uriVariables).toUriString();
        
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
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Initiate Kafka maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation startDbaasKafkaMaintenance(String name) throws RestClientException {
        return startDbaasKafkaMaintenanceWithHttpInfo(name).getBody();
    }

    /**
     * Initiate Kafka maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> startDbaasKafkaMaintenanceWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling startDbaasKafkaMaintenance");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-kafka/{name}/maintenance/start").buildAndExpand(uriVariables).toUriString();
        
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
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Initiate MySQL maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation startDbaasMysqlMaintenance(String name) throws RestClientException {
        return startDbaasMysqlMaintenanceWithHttpInfo(name).getBody();
    }

    /**
     * Initiate MySQL maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> startDbaasMysqlMaintenanceWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling startDbaasMysqlMaintenance");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-mysql/{name}/maintenance/start").buildAndExpand(uriVariables).toUriString();
        
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
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Initiate OpenSearch maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation startDbaasOpensearchMaintenance(String name) throws RestClientException {
        return startDbaasOpensearchMaintenanceWithHttpInfo(name).getBody();
    }

    /**
     * Initiate OpenSearch maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> startDbaasOpensearchMaintenanceWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling startDbaasOpensearchMaintenance");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-opensearch/{name}/maintenance/start").buildAndExpand(uriVariables).toUriString();
        
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
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Initiate PostgreSQL maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation startDbaasPgMaintenance(String name) throws RestClientException {
        return startDbaasPgMaintenanceWithHttpInfo(name).getBody();
    }

    /**
     * Initiate PostgreSQL maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> startDbaasPgMaintenanceWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling startDbaasPgMaintenance");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-postgres/{name}/maintenance/start").buildAndExpand(uriVariables).toUriString();
        
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
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Initiate Redis maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation startDbaasRedisMaintenance(String name) throws RestClientException {
        return startDbaasRedisMaintenanceWithHttpInfo(name).getBody();
    }

    /**
     * Initiate Redis maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> startDbaasRedisMaintenanceWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling startDbaasRedisMaintenance");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-redis/{name}/maintenance/start").buildAndExpand(uriVariables).toUriString();
        
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
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Stop a DBaaS MySQL migration
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation stopDbaasMysqlMigration(String name) throws RestClientException {
        return stopDbaasMysqlMigrationWithHttpInfo(name).getBody();
    }

    /**
     * Stop a DBaaS MySQL migration
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> stopDbaasMysqlMigrationWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling stopDbaasMysqlMigration");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-mysql/{name}/migration/stop").buildAndExpand(uriVariables).toUriString();
        
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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Stop a DBaaS PostgreSQL migration
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation stopDbaasPgMigration(String name) throws RestClientException {
        return stopDbaasPgMigrationWithHttpInfo(name).getBody();
    }

    /**
     * Stop a DBaaS PostgreSQL migration
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> stopDbaasPgMigrationWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling stopDbaasPgMigration");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-postgres/{name}/migration/stop").buildAndExpand(uriVariables).toUriString();
        
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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Stop a DBaaS Redis migration
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation stopDbaasRedisMigration(String name) throws RestClientException {
        return stopDbaasRedisMigrationWithHttpInfo(name).getBody();
    }

    /**
     * Stop a DBaaS Redis migration
     * 
     * <p><b>200</b> - 200
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> stopDbaasRedisMigrationWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling stopDbaasRedisMigration");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-redis/{name}/migration/stop").buildAndExpand(uriVariables).toUriString();
        
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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update a existing DBaaS integration
     * Update a existing DBaaS integration
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation updateDbaasIntegration(DbaasintegrationIdBody body, UUID id) throws RestClientException {
        return updateDbaasIntegrationWithHttpInfo(body, id).getBody();
    }

    /**
     * Update a existing DBaaS integration
     * Update a existing DBaaS integration
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param id  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> updateDbaasIntegrationWithHttpInfo(DbaasintegrationIdBody body, UUID id) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateDbaasIntegration");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateDbaasIntegration");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/dbaas-integration/{id}").buildAndExpand(uriVariables).toUriString();
        
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
    /**
     * Create a DBaaS OpenSearch ACL configuration
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation updateDbaasOpensearchAclConfig(DbaasOpensearchAclConfig body, String name) throws RestClientException {
        return updateDbaasOpensearchAclConfigWithHttpInfo(body, name).getBody();
    }

    /**
     * Create a DBaaS OpenSearch ACL configuration
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> updateDbaasOpensearchAclConfigWithHttpInfo(DbaasOpensearchAclConfig body, String name) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateDbaasOpensearchAclConfig");
        }
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling updateDbaasOpensearchAclConfig");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-opensearch/{name}/acl-config").buildAndExpand(uriVariables).toUriString();
        
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
    /**
     * Update a DBaaS PostgreSQL connection pool
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @param connectionPoolName  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation updateDbaasPgConnectionPool(ConnectionpoolConnectionpoolnameBody body, String serviceName, String connectionPoolName) throws RestClientException {
        return updateDbaasPgConnectionPoolWithHttpInfo(body, serviceName, connectionPoolName).getBody();
    }

    /**
     * Update a DBaaS PostgreSQL connection pool
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @param connectionPoolName  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> updateDbaasPgConnectionPoolWithHttpInfo(ConnectionpoolConnectionpoolnameBody body, String serviceName, String connectionPoolName) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateDbaasPgConnectionPool");
        }
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceName' when calling updateDbaasPgConnectionPool");
        }
        // verify the required parameter 'connectionPoolName' is set
        if (connectionPoolName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'connectionPoolName' when calling updateDbaasPgConnectionPool");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-name", serviceName);
        uriVariables.put("connection-pool-name", connectionPoolName);
        String path = UriComponentsBuilder.fromPath("/dbaas-postgres/{service-name}/connection-pool/{connection-pool-name}").buildAndExpand(uriVariables).toUriString();
        
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
    /**
     * Update access control for one service user
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @param username  (required)
     * @return DbaasPostgresUsers
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbaasPostgresUsers updateDbaasPostgresAllowReplication(UsernameAllowreplicationBody body, String serviceName, String username) throws RestClientException {
        return updateDbaasPostgresAllowReplicationWithHttpInfo(body, serviceName, username).getBody();
    }

    /**
     * Update access control for one service user
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param serviceName  (required)
     * @param username  (required)
     * @return ResponseEntity&lt;DbaasPostgresUsers&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbaasPostgresUsers> updateDbaasPostgresAllowReplicationWithHttpInfo(UsernameAllowreplicationBody body, String serviceName, String username) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateDbaasPostgresAllowReplication");
        }
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceName' when calling updateDbaasPostgresAllowReplication");
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling updateDbaasPostgresAllowReplication");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-name", serviceName);
        uriVariables.put("username", username);
        String path = UriComponentsBuilder.fromPath("/dbaas-postgres/{service-name}/user/{username}/allow-replication").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<DbaasPostgresUsers> returnType = new ParameterizedTypeReference<DbaasPostgresUsers>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update a DBaaS Grafana service
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation updateDbaasServiceGrafana(DbaasgrafanaNameBody body, String name) throws RestClientException {
        return updateDbaasServiceGrafanaWithHttpInfo(body, name).getBody();
    }

    /**
     * Update a DBaaS Grafana service
     * 
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> updateDbaasServiceGrafanaWithHttpInfo(DbaasgrafanaNameBody body, String name) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateDbaasServiceGrafana");
        }
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling updateDbaasServiceGrafana");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-grafana/{name}").buildAndExpand(uriVariables).toUriString();
        
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
    /**
     * Update a DBaaS Kafka service
     * Update a DBaaS Kafka service
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation updateDbaasServiceKafka(DbaaskafkaNameBody body, String name) throws RestClientException {
        return updateDbaasServiceKafkaWithHttpInfo(body, name).getBody();
    }

    /**
     * Update a DBaaS Kafka service
     * Update a DBaaS Kafka service
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> updateDbaasServiceKafkaWithHttpInfo(DbaaskafkaNameBody body, String name) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateDbaasServiceKafka");
        }
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling updateDbaasServiceKafka");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-kafka/{name}").buildAndExpand(uriVariables).toUriString();
        
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
    /**
     * Update a DBaaS MySQL service
     * Update a DBaaS MySQL service
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation updateDbaasServiceMysql(DbaasmysqlNameBody body, String name) throws RestClientException {
        return updateDbaasServiceMysqlWithHttpInfo(body, name).getBody();
    }

    /**
     * Update a DBaaS MySQL service
     * Update a DBaaS MySQL service
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> updateDbaasServiceMysqlWithHttpInfo(DbaasmysqlNameBody body, String name) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateDbaasServiceMysql");
        }
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling updateDbaasServiceMysql");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-mysql/{name}").buildAndExpand(uriVariables).toUriString();
        
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
    /**
     * Update a DBaaS OpenSearch service
     * Update a DBaaS OpenSearch service
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation updateDbaasServiceOpensearch(DbaasopensearchNameBody body, String name) throws RestClientException {
        return updateDbaasServiceOpensearchWithHttpInfo(body, name).getBody();
    }

    /**
     * Update a DBaaS OpenSearch service
     * Update a DBaaS OpenSearch service
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> updateDbaasServiceOpensearchWithHttpInfo(DbaasopensearchNameBody body, String name) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateDbaasServiceOpensearch");
        }
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling updateDbaasServiceOpensearch");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-opensearch/{name}").buildAndExpand(uriVariables).toUriString();
        
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
    /**
     * Update a DBaaS PostgreSQL service
     * Update a DBaaS PostgreSQL service
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation updateDbaasServicePg(DbaaspostgresNameBody body, String name) throws RestClientException {
        return updateDbaasServicePgWithHttpInfo(body, name).getBody();
    }

    /**
     * Update a DBaaS PostgreSQL service
     * Update a DBaaS PostgreSQL service
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> updateDbaasServicePgWithHttpInfo(DbaaspostgresNameBody body, String name) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateDbaasServicePg");
        }
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling updateDbaasServicePg");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-postgres/{name}").buildAndExpand(uriVariables).toUriString();
        
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
    /**
     * Update a DBaaS Redis service
     * Update a DBaaS Redis service
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return Operation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Operation updateDbaasServiceRedis(DbaasredisNameBody body, String name) throws RestClientException {
        return updateDbaasServiceRedisWithHttpInfo(body, name).getBody();
    }

    /**
     * Update a DBaaS Redis service
     * Update a DBaaS Redis service
     * <p><b>200</b> - 200
     * @param body  (required)
     * @param name  (required)
     * @return ResponseEntity&lt;Operation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Operation> updateDbaasServiceRedisWithHttpInfo(DbaasredisNameBody body, String name) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateDbaasServiceRedis");
        }
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling updateDbaasServiceRedis");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = UriComponentsBuilder.fromPath("/dbaas-redis/{name}").buildAndExpand(uriVariables).toUriString();
        
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
