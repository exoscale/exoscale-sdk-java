package com.exoscale.api;

import com.exoscale.invoker.ApiClient;

import com.exoscale.model.CreateDbaasIntegrationRequest;
import com.exoscale.model.CreateDbaasKafkaUserRequest;
import com.exoscale.model.CreateDbaasMysqlDatabaseRequest;
import com.exoscale.model.CreateDbaasMysqlUserRequest;
import com.exoscale.model.CreateDbaasPgConnectionPoolRequest;
import com.exoscale.model.CreateDbaasPgDatabaseRequest;
import com.exoscale.model.CreateDbaasPgUpgradeCheckRequest;
import com.exoscale.model.CreateDbaasPostgresUserRequest;
import com.exoscale.model.CreateDbaasServiceGrafanaRequest;
import com.exoscale.model.CreateDbaasServiceKafkaRequest;
import com.exoscale.model.CreateDbaasServiceMysqlRequest;
import com.exoscale.model.CreateDbaasServiceOpensearchRequest;
import com.exoscale.model.CreateDbaasServicePgRequest;
import com.exoscale.model.CreateDbaasServiceRedisRequest;
import com.exoscale.model.CreateDbaasTaskMigrationCheckRequest;
import com.exoscale.model.DbaasIntegration;
import com.exoscale.model.DbaasKafkaAcls;
import com.exoscale.model.DbaasKafkaSchemaRegistryAclEntry;
import com.exoscale.model.DbaasKafkaTopicAclEntry;
import com.exoscale.model.DbaasMigrationStatus;
import com.exoscale.model.DbaasOpensearchAclConfig;
import com.exoscale.model.DbaasPostgresUsers;
import com.exoscale.model.DbaasServiceGrafana;
import com.exoscale.model.DbaasServiceKafka;
import com.exoscale.model.DbaasServiceLogs;
import com.exoscale.model.DbaasServiceMysql;
import com.exoscale.model.DbaasServiceOpensearch;
import com.exoscale.model.DbaasServicePg;
import com.exoscale.model.DbaasServiceRedis;
import com.exoscale.model.DbaasServiceType;
import com.exoscale.model.DbaasTask;
import com.exoscale.model.GetDbaasCaCertificate200Response;
import com.exoscale.model.GetDbaasServiceLogsRequest;
import com.exoscale.model.GetDbaasServiceMetrics200Response;
import com.exoscale.model.GetDbaasServiceMetricsRequest;
import com.exoscale.model.GetDbaasSettingsGrafana200Response;
import com.exoscale.model.GetDbaasSettingsKafka200Response;
import com.exoscale.model.GetDbaasSettingsMysql200Response;
import com.exoscale.model.GetDbaasSettingsOpensearch200Response;
import com.exoscale.model.GetDbaasSettingsPg200Response;
import com.exoscale.model.GetDbaasSettingsRedis200Response;
import com.exoscale.model.ListDbaasIntegrationSettings200Response;
import com.exoscale.model.ListDbaasIntegrationTypes200Response;
import com.exoscale.model.ListDbaasServiceTypes200Response;
import com.exoscale.model.ListDbaasServices200Response;
import com.exoscale.model.Operation;
import com.exoscale.model.ResetDbaasMysqlUserPasswordRequest;
import com.exoscale.model.ResetDbaasOpensearchUserPasswordRequest;
import java.util.UUID;
import com.exoscale.model.UpdateDbaasIntegrationRequest;
import com.exoscale.model.UpdateDbaasPgConnectionPoolRequest;
import com.exoscale.model.UpdateDbaasPostgresAllowReplicationRequest;
import com.exoscale.model.UpdateDbaasServiceGrafanaRequest;
import com.exoscale.model.UpdateDbaasServiceKafkaRequest;
import com.exoscale.model.UpdateDbaasServiceMysqlRequest;
import com.exoscale.model.UpdateDbaasServiceOpensearchRequest;
import com.exoscale.model.UpdateDbaasServicePgRequest;
import com.exoscale.model.UpdateDbaasServiceRedisRequest;

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
     * @param createDbaasIntegrationRequest The createDbaasIntegrationRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createDbaasIntegrationRequestCreation(CreateDbaasIntegrationRequest createDbaasIntegrationRequest) throws WebClientResponseException {
        Object postBody = createDbaasIntegrationRequest;
        // verify the required parameter 'createDbaasIntegrationRequest' is set
        if (createDbaasIntegrationRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createDbaasIntegrationRequest' when calling createDbaasIntegration", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/dbaas-integration", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a new DBaaS integration between two services
     * Create a new DBaaS integration between two services
     * <p><b>200</b> - 200
     * @param createDbaasIntegrationRequest The createDbaasIntegrationRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createDbaasIntegration(CreateDbaasIntegrationRequest createDbaasIntegrationRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasIntegrationRequestCreation(createDbaasIntegrationRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create a new DBaaS integration between two services
     * Create a new DBaaS integration between two services
     * <p><b>200</b> - 200
     * @param createDbaasIntegrationRequest The createDbaasIntegrationRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createDbaasIntegrationWithHttpInfo(CreateDbaasIntegrationRequest createDbaasIntegrationRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasIntegrationRequestCreation(createDbaasIntegrationRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a new DBaaS integration between two services
     * Create a new DBaaS integration between two services
     * <p><b>200</b> - 200
     * @param createDbaasIntegrationRequest The createDbaasIntegrationRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createDbaasIntegrationWithResponseSpec(CreateDbaasIntegrationRequest createDbaasIntegrationRequest) throws WebClientResponseException {
        return createDbaasIntegrationRequestCreation(createDbaasIntegrationRequest);
    }
    /**
     * Add a Kafka Schema Registry ACL entry
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param dbaasKafkaSchemaRegistryAclEntry The dbaasKafkaSchemaRegistryAclEntry parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createDbaasKafkaSchemaRegistryAclConfigRequestCreation(String name, DbaasKafkaSchemaRegistryAclEntry dbaasKafkaSchemaRegistryAclEntry) throws WebClientResponseException {
        Object postBody = dbaasKafkaSchemaRegistryAclEntry;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling createDbaasKafkaSchemaRegistryAclConfig", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'dbaasKafkaSchemaRegistryAclEntry' is set
        if (dbaasKafkaSchemaRegistryAclEntry == null) {
            throw new WebClientResponseException("Missing the required parameter 'dbaasKafkaSchemaRegistryAclEntry' when calling createDbaasKafkaSchemaRegistryAclConfig", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI("/dbaas-kafka/{name}/schema-registry/acl-config", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add a Kafka Schema Registry ACL entry
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param dbaasKafkaSchemaRegistryAclEntry The dbaasKafkaSchemaRegistryAclEntry parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createDbaasKafkaSchemaRegistryAclConfig(String name, DbaasKafkaSchemaRegistryAclEntry dbaasKafkaSchemaRegistryAclEntry) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasKafkaSchemaRegistryAclConfigRequestCreation(name, dbaasKafkaSchemaRegistryAclEntry).bodyToMono(localVarReturnType);
    }

    /**
     * Add a Kafka Schema Registry ACL entry
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param dbaasKafkaSchemaRegistryAclEntry The dbaasKafkaSchemaRegistryAclEntry parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createDbaasKafkaSchemaRegistryAclConfigWithHttpInfo(String name, DbaasKafkaSchemaRegistryAclEntry dbaasKafkaSchemaRegistryAclEntry) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasKafkaSchemaRegistryAclConfigRequestCreation(name, dbaasKafkaSchemaRegistryAclEntry).toEntity(localVarReturnType);
    }

    /**
     * Add a Kafka Schema Registry ACL entry
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param dbaasKafkaSchemaRegistryAclEntry The dbaasKafkaSchemaRegistryAclEntry parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createDbaasKafkaSchemaRegistryAclConfigWithResponseSpec(String name, DbaasKafkaSchemaRegistryAclEntry dbaasKafkaSchemaRegistryAclEntry) throws WebClientResponseException {
        return createDbaasKafkaSchemaRegistryAclConfigRequestCreation(name, dbaasKafkaSchemaRegistryAclEntry);
    }
    /**
     * Add a Kafka topic ACL entry
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param dbaasKafkaTopicAclEntry The dbaasKafkaTopicAclEntry parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createDbaasKafkaTopicAclConfigRequestCreation(String name, DbaasKafkaTopicAclEntry dbaasKafkaTopicAclEntry) throws WebClientResponseException {
        Object postBody = dbaasKafkaTopicAclEntry;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling createDbaasKafkaTopicAclConfig", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'dbaasKafkaTopicAclEntry' is set
        if (dbaasKafkaTopicAclEntry == null) {
            throw new WebClientResponseException("Missing the required parameter 'dbaasKafkaTopicAclEntry' when calling createDbaasKafkaTopicAclConfig", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI("/dbaas-kafka/{name}/topic/acl-config", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add a Kafka topic ACL entry
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param dbaasKafkaTopicAclEntry The dbaasKafkaTopicAclEntry parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createDbaasKafkaTopicAclConfig(String name, DbaasKafkaTopicAclEntry dbaasKafkaTopicAclEntry) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasKafkaTopicAclConfigRequestCreation(name, dbaasKafkaTopicAclEntry).bodyToMono(localVarReturnType);
    }

    /**
     * Add a Kafka topic ACL entry
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param dbaasKafkaTopicAclEntry The dbaasKafkaTopicAclEntry parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createDbaasKafkaTopicAclConfigWithHttpInfo(String name, DbaasKafkaTopicAclEntry dbaasKafkaTopicAclEntry) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasKafkaTopicAclConfigRequestCreation(name, dbaasKafkaTopicAclEntry).toEntity(localVarReturnType);
    }

    /**
     * Add a Kafka topic ACL entry
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param dbaasKafkaTopicAclEntry The dbaasKafkaTopicAclEntry parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createDbaasKafkaTopicAclConfigWithResponseSpec(String name, DbaasKafkaTopicAclEntry dbaasKafkaTopicAclEntry) throws WebClientResponseException {
        return createDbaasKafkaTopicAclConfigRequestCreation(name, dbaasKafkaTopicAclEntry);
    }
    /**
     * Create a DBaaS Kafka user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasKafkaUserRequest The createDbaasKafkaUserRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createDbaasKafkaUserRequestCreation(String serviceName, CreateDbaasKafkaUserRequest createDbaasKafkaUserRequest) throws WebClientResponseException {
        Object postBody = createDbaasKafkaUserRequest;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceName' when calling createDbaasKafkaUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'createDbaasKafkaUserRequest' is set
        if (createDbaasKafkaUserRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createDbaasKafkaUserRequest' when calling createDbaasKafkaUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service-name", serviceName);

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
        return apiClient.invokeAPI("/dbaas-kafka/{service-name}/user", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a DBaaS Kafka user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasKafkaUserRequest The createDbaasKafkaUserRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createDbaasKafkaUser(String serviceName, CreateDbaasKafkaUserRequest createDbaasKafkaUserRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasKafkaUserRequestCreation(serviceName, createDbaasKafkaUserRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create a DBaaS Kafka user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasKafkaUserRequest The createDbaasKafkaUserRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createDbaasKafkaUserWithHttpInfo(String serviceName, CreateDbaasKafkaUserRequest createDbaasKafkaUserRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasKafkaUserRequestCreation(serviceName, createDbaasKafkaUserRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a DBaaS Kafka user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasKafkaUserRequest The createDbaasKafkaUserRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createDbaasKafkaUserWithResponseSpec(String serviceName, CreateDbaasKafkaUserRequest createDbaasKafkaUserRequest) throws WebClientResponseException {
        return createDbaasKafkaUserRequestCreation(serviceName, createDbaasKafkaUserRequest);
    }
    /**
     * Create a DBaaS MySQL database
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasMysqlDatabaseRequest The createDbaasMysqlDatabaseRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createDbaasMysqlDatabaseRequestCreation(String serviceName, CreateDbaasMysqlDatabaseRequest createDbaasMysqlDatabaseRequest) throws WebClientResponseException {
        Object postBody = createDbaasMysqlDatabaseRequest;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceName' when calling createDbaasMysqlDatabase", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'createDbaasMysqlDatabaseRequest' is set
        if (createDbaasMysqlDatabaseRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createDbaasMysqlDatabaseRequest' when calling createDbaasMysqlDatabase", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service-name", serviceName);

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
        return apiClient.invokeAPI("/dbaas-mysql/{service-name}/database", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a DBaaS MySQL database
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasMysqlDatabaseRequest The createDbaasMysqlDatabaseRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createDbaasMysqlDatabase(String serviceName, CreateDbaasMysqlDatabaseRequest createDbaasMysqlDatabaseRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasMysqlDatabaseRequestCreation(serviceName, createDbaasMysqlDatabaseRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create a DBaaS MySQL database
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasMysqlDatabaseRequest The createDbaasMysqlDatabaseRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createDbaasMysqlDatabaseWithHttpInfo(String serviceName, CreateDbaasMysqlDatabaseRequest createDbaasMysqlDatabaseRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasMysqlDatabaseRequestCreation(serviceName, createDbaasMysqlDatabaseRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a DBaaS MySQL database
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasMysqlDatabaseRequest The createDbaasMysqlDatabaseRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createDbaasMysqlDatabaseWithResponseSpec(String serviceName, CreateDbaasMysqlDatabaseRequest createDbaasMysqlDatabaseRequest) throws WebClientResponseException {
        return createDbaasMysqlDatabaseRequestCreation(serviceName, createDbaasMysqlDatabaseRequest);
    }
    /**
     * Create a DBaaS MySQL user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasMysqlUserRequest The createDbaasMysqlUserRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createDbaasMysqlUserRequestCreation(String serviceName, CreateDbaasMysqlUserRequest createDbaasMysqlUserRequest) throws WebClientResponseException {
        Object postBody = createDbaasMysqlUserRequest;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceName' when calling createDbaasMysqlUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'createDbaasMysqlUserRequest' is set
        if (createDbaasMysqlUserRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createDbaasMysqlUserRequest' when calling createDbaasMysqlUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service-name", serviceName);

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
        return apiClient.invokeAPI("/dbaas-mysql/{service-name}/user", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a DBaaS MySQL user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasMysqlUserRequest The createDbaasMysqlUserRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createDbaasMysqlUser(String serviceName, CreateDbaasMysqlUserRequest createDbaasMysqlUserRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasMysqlUserRequestCreation(serviceName, createDbaasMysqlUserRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create a DBaaS MySQL user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasMysqlUserRequest The createDbaasMysqlUserRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createDbaasMysqlUserWithHttpInfo(String serviceName, CreateDbaasMysqlUserRequest createDbaasMysqlUserRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasMysqlUserRequestCreation(serviceName, createDbaasMysqlUserRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a DBaaS MySQL user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasMysqlUserRequest The createDbaasMysqlUserRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createDbaasMysqlUserWithResponseSpec(String serviceName, CreateDbaasMysqlUserRequest createDbaasMysqlUserRequest) throws WebClientResponseException {
        return createDbaasMysqlUserRequestCreation(serviceName, createDbaasMysqlUserRequest);
    }
    /**
     * Create a DBaaS OpenSearch user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasKafkaUserRequest The createDbaasKafkaUserRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createDbaasOpensearchUserRequestCreation(String serviceName, CreateDbaasKafkaUserRequest createDbaasKafkaUserRequest) throws WebClientResponseException {
        Object postBody = createDbaasKafkaUserRequest;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceName' when calling createDbaasOpensearchUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'createDbaasKafkaUserRequest' is set
        if (createDbaasKafkaUserRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createDbaasKafkaUserRequest' when calling createDbaasOpensearchUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service-name", serviceName);

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
        return apiClient.invokeAPI("/dbaas-opensearch/{service-name}/user", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a DBaaS OpenSearch user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasKafkaUserRequest The createDbaasKafkaUserRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createDbaasOpensearchUser(String serviceName, CreateDbaasKafkaUserRequest createDbaasKafkaUserRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasOpensearchUserRequestCreation(serviceName, createDbaasKafkaUserRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create a DBaaS OpenSearch user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasKafkaUserRequest The createDbaasKafkaUserRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createDbaasOpensearchUserWithHttpInfo(String serviceName, CreateDbaasKafkaUserRequest createDbaasKafkaUserRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasOpensearchUserRequestCreation(serviceName, createDbaasKafkaUserRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a DBaaS OpenSearch user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasKafkaUserRequest The createDbaasKafkaUserRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createDbaasOpensearchUserWithResponseSpec(String serviceName, CreateDbaasKafkaUserRequest createDbaasKafkaUserRequest) throws WebClientResponseException {
        return createDbaasOpensearchUserRequestCreation(serviceName, createDbaasKafkaUserRequest);
    }
    /**
     * Create a DBaaS PostgreSQL connection pool
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasPgConnectionPoolRequest The createDbaasPgConnectionPoolRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createDbaasPgConnectionPoolRequestCreation(String serviceName, CreateDbaasPgConnectionPoolRequest createDbaasPgConnectionPoolRequest) throws WebClientResponseException {
        Object postBody = createDbaasPgConnectionPoolRequest;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceName' when calling createDbaasPgConnectionPool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'createDbaasPgConnectionPoolRequest' is set
        if (createDbaasPgConnectionPoolRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createDbaasPgConnectionPoolRequest' when calling createDbaasPgConnectionPool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service-name", serviceName);

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
        return apiClient.invokeAPI("/dbaas-postgres/{service-name}/connection-pool", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a DBaaS PostgreSQL connection pool
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasPgConnectionPoolRequest The createDbaasPgConnectionPoolRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createDbaasPgConnectionPool(String serviceName, CreateDbaasPgConnectionPoolRequest createDbaasPgConnectionPoolRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasPgConnectionPoolRequestCreation(serviceName, createDbaasPgConnectionPoolRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create a DBaaS PostgreSQL connection pool
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasPgConnectionPoolRequest The createDbaasPgConnectionPoolRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createDbaasPgConnectionPoolWithHttpInfo(String serviceName, CreateDbaasPgConnectionPoolRequest createDbaasPgConnectionPoolRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasPgConnectionPoolRequestCreation(serviceName, createDbaasPgConnectionPoolRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a DBaaS PostgreSQL connection pool
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasPgConnectionPoolRequest The createDbaasPgConnectionPoolRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createDbaasPgConnectionPoolWithResponseSpec(String serviceName, CreateDbaasPgConnectionPoolRequest createDbaasPgConnectionPoolRequest) throws WebClientResponseException {
        return createDbaasPgConnectionPoolRequestCreation(serviceName, createDbaasPgConnectionPoolRequest);
    }
    /**
     * Create a DBaaS Postgres database
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasPgDatabaseRequest The createDbaasPgDatabaseRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createDbaasPgDatabaseRequestCreation(String serviceName, CreateDbaasPgDatabaseRequest createDbaasPgDatabaseRequest) throws WebClientResponseException {
        Object postBody = createDbaasPgDatabaseRequest;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceName' when calling createDbaasPgDatabase", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'createDbaasPgDatabaseRequest' is set
        if (createDbaasPgDatabaseRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createDbaasPgDatabaseRequest' when calling createDbaasPgDatabase", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service-name", serviceName);

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
        return apiClient.invokeAPI("/dbaas-postgres/{service-name}/database", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a DBaaS Postgres database
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasPgDatabaseRequest The createDbaasPgDatabaseRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createDbaasPgDatabase(String serviceName, CreateDbaasPgDatabaseRequest createDbaasPgDatabaseRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasPgDatabaseRequestCreation(serviceName, createDbaasPgDatabaseRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create a DBaaS Postgres database
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasPgDatabaseRequest The createDbaasPgDatabaseRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createDbaasPgDatabaseWithHttpInfo(String serviceName, CreateDbaasPgDatabaseRequest createDbaasPgDatabaseRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasPgDatabaseRequestCreation(serviceName, createDbaasPgDatabaseRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a DBaaS Postgres database
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasPgDatabaseRequest The createDbaasPgDatabaseRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createDbaasPgDatabaseWithResponseSpec(String serviceName, CreateDbaasPgDatabaseRequest createDbaasPgDatabaseRequest) throws WebClientResponseException {
        return createDbaasPgDatabaseRequestCreation(serviceName, createDbaasPgDatabaseRequest);
    }
    /**
     * 
     * Check whether you can upgrade Postgres service to a newer version
     * <p><b>200</b> - 200
     * @param service The service parameter
     * @param createDbaasPgUpgradeCheckRequest The createDbaasPgUpgradeCheckRequest parameter
     * @return DbaasTask
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createDbaasPgUpgradeCheckRequestCreation(String service, CreateDbaasPgUpgradeCheckRequest createDbaasPgUpgradeCheckRequest) throws WebClientResponseException {
        Object postBody = createDbaasPgUpgradeCheckRequest;
        // verify the required parameter 'service' is set
        if (service == null) {
            throw new WebClientResponseException("Missing the required parameter 'service' when calling createDbaasPgUpgradeCheck", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'createDbaasPgUpgradeCheckRequest' is set
        if (createDbaasPgUpgradeCheckRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createDbaasPgUpgradeCheckRequest' when calling createDbaasPgUpgradeCheck", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service", service);

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

        ParameterizedTypeReference<DbaasTask> localVarReturnType = new ParameterizedTypeReference<DbaasTask>() {};
        return apiClient.invokeAPI("/dbaas-postgres/{service}/upgrade-check", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Check whether you can upgrade Postgres service to a newer version
     * <p><b>200</b> - 200
     * @param service The service parameter
     * @param createDbaasPgUpgradeCheckRequest The createDbaasPgUpgradeCheckRequest parameter
     * @return DbaasTask
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DbaasTask> createDbaasPgUpgradeCheck(String service, CreateDbaasPgUpgradeCheckRequest createDbaasPgUpgradeCheckRequest) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasTask> localVarReturnType = new ParameterizedTypeReference<DbaasTask>() {};
        return createDbaasPgUpgradeCheckRequestCreation(service, createDbaasPgUpgradeCheckRequest).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Check whether you can upgrade Postgres service to a newer version
     * <p><b>200</b> - 200
     * @param service The service parameter
     * @param createDbaasPgUpgradeCheckRequest The createDbaasPgUpgradeCheckRequest parameter
     * @return ResponseEntity&lt;DbaasTask&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DbaasTask>> createDbaasPgUpgradeCheckWithHttpInfo(String service, CreateDbaasPgUpgradeCheckRequest createDbaasPgUpgradeCheckRequest) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasTask> localVarReturnType = new ParameterizedTypeReference<DbaasTask>() {};
        return createDbaasPgUpgradeCheckRequestCreation(service, createDbaasPgUpgradeCheckRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * Check whether you can upgrade Postgres service to a newer version
     * <p><b>200</b> - 200
     * @param service The service parameter
     * @param createDbaasPgUpgradeCheckRequest The createDbaasPgUpgradeCheckRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createDbaasPgUpgradeCheckWithResponseSpec(String service, CreateDbaasPgUpgradeCheckRequest createDbaasPgUpgradeCheckRequest) throws WebClientResponseException {
        return createDbaasPgUpgradeCheckRequestCreation(service, createDbaasPgUpgradeCheckRequest);
    }
    /**
     * Create a DBaaS Postgres user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasPostgresUserRequest The createDbaasPostgresUserRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createDbaasPostgresUserRequestCreation(String serviceName, CreateDbaasPostgresUserRequest createDbaasPostgresUserRequest) throws WebClientResponseException {
        Object postBody = createDbaasPostgresUserRequest;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceName' when calling createDbaasPostgresUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'createDbaasPostgresUserRequest' is set
        if (createDbaasPostgresUserRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createDbaasPostgresUserRequest' when calling createDbaasPostgresUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service-name", serviceName);

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
        return apiClient.invokeAPI("/dbaas-postgres/{service-name}/user", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a DBaaS Postgres user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasPostgresUserRequest The createDbaasPostgresUserRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createDbaasPostgresUser(String serviceName, CreateDbaasPostgresUserRequest createDbaasPostgresUserRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasPostgresUserRequestCreation(serviceName, createDbaasPostgresUserRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create a DBaaS Postgres user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasPostgresUserRequest The createDbaasPostgresUserRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createDbaasPostgresUserWithHttpInfo(String serviceName, CreateDbaasPostgresUserRequest createDbaasPostgresUserRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasPostgresUserRequestCreation(serviceName, createDbaasPostgresUserRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a DBaaS Postgres user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param createDbaasPostgresUserRequest The createDbaasPostgresUserRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createDbaasPostgresUserWithResponseSpec(String serviceName, CreateDbaasPostgresUserRequest createDbaasPostgresUserRequest) throws WebClientResponseException {
        return createDbaasPostgresUserRequestCreation(serviceName, createDbaasPostgresUserRequest);
    }
    /**
     * 
     * Create a DBaaS Grafana service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param createDbaasServiceGrafanaRequest The createDbaasServiceGrafanaRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createDbaasServiceGrafanaRequestCreation(String name, CreateDbaasServiceGrafanaRequest createDbaasServiceGrafanaRequest) throws WebClientResponseException {
        Object postBody = createDbaasServiceGrafanaRequest;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling createDbaasServiceGrafana", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'createDbaasServiceGrafanaRequest' is set
        if (createDbaasServiceGrafanaRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createDbaasServiceGrafanaRequest' when calling createDbaasServiceGrafana", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI("/dbaas-grafana/{name}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Create a DBaaS Grafana service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param createDbaasServiceGrafanaRequest The createDbaasServiceGrafanaRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createDbaasServiceGrafana(String name, CreateDbaasServiceGrafanaRequest createDbaasServiceGrafanaRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasServiceGrafanaRequestCreation(name, createDbaasServiceGrafanaRequest).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Create a DBaaS Grafana service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param createDbaasServiceGrafanaRequest The createDbaasServiceGrafanaRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createDbaasServiceGrafanaWithHttpInfo(String name, CreateDbaasServiceGrafanaRequest createDbaasServiceGrafanaRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasServiceGrafanaRequestCreation(name, createDbaasServiceGrafanaRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * Create a DBaaS Grafana service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param createDbaasServiceGrafanaRequest The createDbaasServiceGrafanaRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createDbaasServiceGrafanaWithResponseSpec(String name, CreateDbaasServiceGrafanaRequest createDbaasServiceGrafanaRequest) throws WebClientResponseException {
        return createDbaasServiceGrafanaRequestCreation(name, createDbaasServiceGrafanaRequest);
    }
    /**
     * Create a DBaaS Kafka service
     * Create a DBaaS Kafka service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param createDbaasServiceKafkaRequest The createDbaasServiceKafkaRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createDbaasServiceKafkaRequestCreation(String name, CreateDbaasServiceKafkaRequest createDbaasServiceKafkaRequest) throws WebClientResponseException {
        Object postBody = createDbaasServiceKafkaRequest;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling createDbaasServiceKafka", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'createDbaasServiceKafkaRequest' is set
        if (createDbaasServiceKafkaRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createDbaasServiceKafkaRequest' when calling createDbaasServiceKafka", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI("/dbaas-kafka/{name}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a DBaaS Kafka service
     * Create a DBaaS Kafka service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param createDbaasServiceKafkaRequest The createDbaasServiceKafkaRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createDbaasServiceKafka(String name, CreateDbaasServiceKafkaRequest createDbaasServiceKafkaRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasServiceKafkaRequestCreation(name, createDbaasServiceKafkaRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create a DBaaS Kafka service
     * Create a DBaaS Kafka service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param createDbaasServiceKafkaRequest The createDbaasServiceKafkaRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createDbaasServiceKafkaWithHttpInfo(String name, CreateDbaasServiceKafkaRequest createDbaasServiceKafkaRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasServiceKafkaRequestCreation(name, createDbaasServiceKafkaRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a DBaaS Kafka service
     * Create a DBaaS Kafka service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param createDbaasServiceKafkaRequest The createDbaasServiceKafkaRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createDbaasServiceKafkaWithResponseSpec(String name, CreateDbaasServiceKafkaRequest createDbaasServiceKafkaRequest) throws WebClientResponseException {
        return createDbaasServiceKafkaRequestCreation(name, createDbaasServiceKafkaRequest);
    }
    /**
     * Create a DBaaS MySQL service
     * Create a DBaaS MySQL service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param createDbaasServiceMysqlRequest The createDbaasServiceMysqlRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createDbaasServiceMysqlRequestCreation(String name, CreateDbaasServiceMysqlRequest createDbaasServiceMysqlRequest) throws WebClientResponseException {
        Object postBody = createDbaasServiceMysqlRequest;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling createDbaasServiceMysql", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'createDbaasServiceMysqlRequest' is set
        if (createDbaasServiceMysqlRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createDbaasServiceMysqlRequest' when calling createDbaasServiceMysql", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI("/dbaas-mysql/{name}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a DBaaS MySQL service
     * Create a DBaaS MySQL service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param createDbaasServiceMysqlRequest The createDbaasServiceMysqlRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createDbaasServiceMysql(String name, CreateDbaasServiceMysqlRequest createDbaasServiceMysqlRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasServiceMysqlRequestCreation(name, createDbaasServiceMysqlRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create a DBaaS MySQL service
     * Create a DBaaS MySQL service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param createDbaasServiceMysqlRequest The createDbaasServiceMysqlRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createDbaasServiceMysqlWithHttpInfo(String name, CreateDbaasServiceMysqlRequest createDbaasServiceMysqlRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasServiceMysqlRequestCreation(name, createDbaasServiceMysqlRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a DBaaS MySQL service
     * Create a DBaaS MySQL service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param createDbaasServiceMysqlRequest The createDbaasServiceMysqlRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createDbaasServiceMysqlWithResponseSpec(String name, CreateDbaasServiceMysqlRequest createDbaasServiceMysqlRequest) throws WebClientResponseException {
        return createDbaasServiceMysqlRequestCreation(name, createDbaasServiceMysqlRequest);
    }
    /**
     * Create a DBaaS OpenSearch service
     * Create a DBaaS OpenSearch service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param createDbaasServiceOpensearchRequest The createDbaasServiceOpensearchRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createDbaasServiceOpensearchRequestCreation(String name, CreateDbaasServiceOpensearchRequest createDbaasServiceOpensearchRequest) throws WebClientResponseException {
        Object postBody = createDbaasServiceOpensearchRequest;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling createDbaasServiceOpensearch", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'createDbaasServiceOpensearchRequest' is set
        if (createDbaasServiceOpensearchRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createDbaasServiceOpensearchRequest' when calling createDbaasServiceOpensearch", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI("/dbaas-opensearch/{name}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a DBaaS OpenSearch service
     * Create a DBaaS OpenSearch service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param createDbaasServiceOpensearchRequest The createDbaasServiceOpensearchRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createDbaasServiceOpensearch(String name, CreateDbaasServiceOpensearchRequest createDbaasServiceOpensearchRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasServiceOpensearchRequestCreation(name, createDbaasServiceOpensearchRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create a DBaaS OpenSearch service
     * Create a DBaaS OpenSearch service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param createDbaasServiceOpensearchRequest The createDbaasServiceOpensearchRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createDbaasServiceOpensearchWithHttpInfo(String name, CreateDbaasServiceOpensearchRequest createDbaasServiceOpensearchRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasServiceOpensearchRequestCreation(name, createDbaasServiceOpensearchRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a DBaaS OpenSearch service
     * Create a DBaaS OpenSearch service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param createDbaasServiceOpensearchRequest The createDbaasServiceOpensearchRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createDbaasServiceOpensearchWithResponseSpec(String name, CreateDbaasServiceOpensearchRequest createDbaasServiceOpensearchRequest) throws WebClientResponseException {
        return createDbaasServiceOpensearchRequestCreation(name, createDbaasServiceOpensearchRequest);
    }
    /**
     * Create a DBaaS PostgreSQL service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param createDbaasServicePgRequest The createDbaasServicePgRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createDbaasServicePgRequestCreation(String name, CreateDbaasServicePgRequest createDbaasServicePgRequest) throws WebClientResponseException {
        Object postBody = createDbaasServicePgRequest;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling createDbaasServicePg", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'createDbaasServicePgRequest' is set
        if (createDbaasServicePgRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createDbaasServicePgRequest' when calling createDbaasServicePg", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI("/dbaas-postgres/{name}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a DBaaS PostgreSQL service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param createDbaasServicePgRequest The createDbaasServicePgRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createDbaasServicePg(String name, CreateDbaasServicePgRequest createDbaasServicePgRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasServicePgRequestCreation(name, createDbaasServicePgRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create a DBaaS PostgreSQL service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param createDbaasServicePgRequest The createDbaasServicePgRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createDbaasServicePgWithHttpInfo(String name, CreateDbaasServicePgRequest createDbaasServicePgRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasServicePgRequestCreation(name, createDbaasServicePgRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a DBaaS PostgreSQL service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param createDbaasServicePgRequest The createDbaasServicePgRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createDbaasServicePgWithResponseSpec(String name, CreateDbaasServicePgRequest createDbaasServicePgRequest) throws WebClientResponseException {
        return createDbaasServicePgRequestCreation(name, createDbaasServicePgRequest);
    }
    /**
     * Create a DBaaS Redis service
     * Create a DBaaS Redis service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param createDbaasServiceRedisRequest The createDbaasServiceRedisRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createDbaasServiceRedisRequestCreation(String name, CreateDbaasServiceRedisRequest createDbaasServiceRedisRequest) throws WebClientResponseException {
        Object postBody = createDbaasServiceRedisRequest;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling createDbaasServiceRedis", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'createDbaasServiceRedisRequest' is set
        if (createDbaasServiceRedisRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createDbaasServiceRedisRequest' when calling createDbaasServiceRedis", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI("/dbaas-redis/{name}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a DBaaS Redis service
     * Create a DBaaS Redis service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param createDbaasServiceRedisRequest The createDbaasServiceRedisRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createDbaasServiceRedis(String name, CreateDbaasServiceRedisRequest createDbaasServiceRedisRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasServiceRedisRequestCreation(name, createDbaasServiceRedisRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create a DBaaS Redis service
     * Create a DBaaS Redis service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param createDbaasServiceRedisRequest The createDbaasServiceRedisRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createDbaasServiceRedisWithHttpInfo(String name, CreateDbaasServiceRedisRequest createDbaasServiceRedisRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasServiceRedisRequestCreation(name, createDbaasServiceRedisRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a DBaaS Redis service
     * Create a DBaaS Redis service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param createDbaasServiceRedisRequest The createDbaasServiceRedisRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createDbaasServiceRedisWithResponseSpec(String name, CreateDbaasServiceRedisRequest createDbaasServiceRedisRequest) throws WebClientResponseException {
        return createDbaasServiceRedisRequestCreation(name, createDbaasServiceRedisRequest);
    }
    /**
     * 
     * Create a DBaaS task to check migration
     * <p><b>200</b> - 200
     * @param service The service parameter
     * @param createDbaasTaskMigrationCheckRequest The createDbaasTaskMigrationCheckRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createDbaasTaskMigrationCheckRequestCreation(String service, CreateDbaasTaskMigrationCheckRequest createDbaasTaskMigrationCheckRequest) throws WebClientResponseException {
        Object postBody = createDbaasTaskMigrationCheckRequest;
        // verify the required parameter 'service' is set
        if (service == null) {
            throw new WebClientResponseException("Missing the required parameter 'service' when calling createDbaasTaskMigrationCheck", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'createDbaasTaskMigrationCheckRequest' is set
        if (createDbaasTaskMigrationCheckRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'createDbaasTaskMigrationCheckRequest' when calling createDbaasTaskMigrationCheck", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service", service);

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
        return apiClient.invokeAPI("/dbaas-task-migration-check/{service}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Create a DBaaS task to check migration
     * <p><b>200</b> - 200
     * @param service The service parameter
     * @param createDbaasTaskMigrationCheckRequest The createDbaasTaskMigrationCheckRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> createDbaasTaskMigrationCheck(String service, CreateDbaasTaskMigrationCheckRequest createDbaasTaskMigrationCheckRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasTaskMigrationCheckRequestCreation(service, createDbaasTaskMigrationCheckRequest).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Create a DBaaS task to check migration
     * <p><b>200</b> - 200
     * @param service The service parameter
     * @param createDbaasTaskMigrationCheckRequest The createDbaasTaskMigrationCheckRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> createDbaasTaskMigrationCheckWithHttpInfo(String service, CreateDbaasTaskMigrationCheckRequest createDbaasTaskMigrationCheckRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return createDbaasTaskMigrationCheckRequestCreation(service, createDbaasTaskMigrationCheckRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * Create a DBaaS task to check migration
     * <p><b>200</b> - 200
     * @param service The service parameter
     * @param createDbaasTaskMigrationCheckRequest The createDbaasTaskMigrationCheckRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createDbaasTaskMigrationCheckWithResponseSpec(String service, CreateDbaasTaskMigrationCheckRequest createDbaasTaskMigrationCheckRequest) throws WebClientResponseException {
        return createDbaasTaskMigrationCheckRequestCreation(service, createDbaasTaskMigrationCheckRequest);
    }
    /**
     * Delete a DBaaS Integration
     * Delete a DBaaS Integration
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteDbaasIntegrationRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteDbaasIntegration", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/dbaas-integration/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a DBaaS Integration
     * Delete a DBaaS Integration
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteDbaasIntegration(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasIntegrationRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a DBaaS Integration
     * Delete a DBaaS Integration
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteDbaasIntegrationWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasIntegrationRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Delete a DBaaS Integration
     * Delete a DBaaS Integration
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteDbaasIntegrationWithResponseSpec(UUID id) throws WebClientResponseException {
        return deleteDbaasIntegrationRequestCreation(id);
    }
    /**
     * Delete a Kafka ACL entry
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param aclId The aclId parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteDbaasKafkaSchemaRegistryAclConfigRequestCreation(String name, String aclId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling deleteDbaasKafkaSchemaRegistryAclConfig", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'aclId' is set
        if (aclId == null) {
            throw new WebClientResponseException("Missing the required parameter 'aclId' when calling deleteDbaasKafkaSchemaRegistryAclConfig", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("name", name);
        pathParams.put("acl-id", aclId);

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
        return apiClient.invokeAPI("/dbaas-kafka/{name}/schema-registry/acl-config/{acl-id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a Kafka ACL entry
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param aclId The aclId parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteDbaasKafkaSchemaRegistryAclConfig(String name, String aclId) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasKafkaSchemaRegistryAclConfigRequestCreation(name, aclId).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a Kafka ACL entry
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param aclId The aclId parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteDbaasKafkaSchemaRegistryAclConfigWithHttpInfo(String name, String aclId) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasKafkaSchemaRegistryAclConfigRequestCreation(name, aclId).toEntity(localVarReturnType);
    }

    /**
     * Delete a Kafka ACL entry
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param aclId The aclId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteDbaasKafkaSchemaRegistryAclConfigWithResponseSpec(String name, String aclId) throws WebClientResponseException {
        return deleteDbaasKafkaSchemaRegistryAclConfigRequestCreation(name, aclId);
    }
    /**
     * Delete a Kafka ACL entry
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param aclId The aclId parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteDbaasKafkaTopicAclConfigRequestCreation(String name, String aclId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling deleteDbaasKafkaTopicAclConfig", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'aclId' is set
        if (aclId == null) {
            throw new WebClientResponseException("Missing the required parameter 'aclId' when calling deleteDbaasKafkaTopicAclConfig", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("name", name);
        pathParams.put("acl-id", aclId);

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
        return apiClient.invokeAPI("/dbaas-kafka/{name}/topic/acl-config/{acl-id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a Kafka ACL entry
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param aclId The aclId parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteDbaasKafkaTopicAclConfig(String name, String aclId) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasKafkaTopicAclConfigRequestCreation(name, aclId).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a Kafka ACL entry
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param aclId The aclId parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteDbaasKafkaTopicAclConfigWithHttpInfo(String name, String aclId) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasKafkaTopicAclConfigRequestCreation(name, aclId).toEntity(localVarReturnType);
    }

    /**
     * Delete a Kafka ACL entry
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param aclId The aclId parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteDbaasKafkaTopicAclConfigWithResponseSpec(String name, String aclId) throws WebClientResponseException {
        return deleteDbaasKafkaTopicAclConfigRequestCreation(name, aclId);
    }
    /**
     * Delete a DBaaS kafka user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteDbaasKafkaUserRequestCreation(String serviceName, String username) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceName' when calling deleteDbaasKafkaUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new WebClientResponseException("Missing the required parameter 'username' when calling deleteDbaasKafkaUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service-name", serviceName);
        pathParams.put("username", username);

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
        return apiClient.invokeAPI("/dbaas-kafka/{service-name}/user/{username}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a DBaaS kafka user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteDbaasKafkaUser(String serviceName, String username) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasKafkaUserRequestCreation(serviceName, username).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a DBaaS kafka user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteDbaasKafkaUserWithHttpInfo(String serviceName, String username) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasKafkaUserRequestCreation(serviceName, username).toEntity(localVarReturnType);
    }

    /**
     * Delete a DBaaS kafka user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteDbaasKafkaUserWithResponseSpec(String serviceName, String username) throws WebClientResponseException {
        return deleteDbaasKafkaUserRequestCreation(serviceName, username);
    }
    /**
     * Delete a DBaaS MySQL database
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param databaseName The databaseName parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteDbaasMysqlDatabaseRequestCreation(String serviceName, String databaseName) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceName' when calling deleteDbaasMysqlDatabase", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'databaseName' is set
        if (databaseName == null) {
            throw new WebClientResponseException("Missing the required parameter 'databaseName' when calling deleteDbaasMysqlDatabase", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service-name", serviceName);
        pathParams.put("database-name", databaseName);

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
        return apiClient.invokeAPI("/dbaas-mysql/{service-name}/database/{database-name}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a DBaaS MySQL database
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param databaseName The databaseName parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteDbaasMysqlDatabase(String serviceName, String databaseName) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasMysqlDatabaseRequestCreation(serviceName, databaseName).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a DBaaS MySQL database
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param databaseName The databaseName parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteDbaasMysqlDatabaseWithHttpInfo(String serviceName, String databaseName) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasMysqlDatabaseRequestCreation(serviceName, databaseName).toEntity(localVarReturnType);
    }

    /**
     * Delete a DBaaS MySQL database
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param databaseName The databaseName parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteDbaasMysqlDatabaseWithResponseSpec(String serviceName, String databaseName) throws WebClientResponseException {
        return deleteDbaasMysqlDatabaseRequestCreation(serviceName, databaseName);
    }
    /**
     * Delete a DBaaS MySQL user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteDbaasMysqlUserRequestCreation(String serviceName, String username) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceName' when calling deleteDbaasMysqlUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new WebClientResponseException("Missing the required parameter 'username' when calling deleteDbaasMysqlUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service-name", serviceName);
        pathParams.put("username", username);

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
        return apiClient.invokeAPI("/dbaas-mysql/{service-name}/user/{username}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a DBaaS MySQL user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteDbaasMysqlUser(String serviceName, String username) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasMysqlUserRequestCreation(serviceName, username).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a DBaaS MySQL user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteDbaasMysqlUserWithHttpInfo(String serviceName, String username) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasMysqlUserRequestCreation(serviceName, username).toEntity(localVarReturnType);
    }

    /**
     * Delete a DBaaS MySQL user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteDbaasMysqlUserWithResponseSpec(String serviceName, String username) throws WebClientResponseException {
        return deleteDbaasMysqlUserRequestCreation(serviceName, username);
    }
    /**
     * Delete a DBaaS OpenSearch user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteDbaasOpensearchUserRequestCreation(String serviceName, String username) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceName' when calling deleteDbaasOpensearchUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new WebClientResponseException("Missing the required parameter 'username' when calling deleteDbaasOpensearchUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service-name", serviceName);
        pathParams.put("username", username);

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
        return apiClient.invokeAPI("/dbaas-opensearch/{service-name}/user/{username}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a DBaaS OpenSearch user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteDbaasOpensearchUser(String serviceName, String username) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasOpensearchUserRequestCreation(serviceName, username).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a DBaaS OpenSearch user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteDbaasOpensearchUserWithHttpInfo(String serviceName, String username) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasOpensearchUserRequestCreation(serviceName, username).toEntity(localVarReturnType);
    }

    /**
     * Delete a DBaaS OpenSearch user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteDbaasOpensearchUserWithResponseSpec(String serviceName, String username) throws WebClientResponseException {
        return deleteDbaasOpensearchUserRequestCreation(serviceName, username);
    }
    /**
     * Delete a DBaaS PostgreSQL connection pool
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param connectionPoolName The connectionPoolName parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteDbaasPgConnectionPoolRequestCreation(String serviceName, String connectionPoolName) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceName' when calling deleteDbaasPgConnectionPool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'connectionPoolName' is set
        if (connectionPoolName == null) {
            throw new WebClientResponseException("Missing the required parameter 'connectionPoolName' when calling deleteDbaasPgConnectionPool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service-name", serviceName);
        pathParams.put("connection-pool-name", connectionPoolName);

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
        return apiClient.invokeAPI("/dbaas-postgres/{service-name}/connection-pool/{connection-pool-name}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a DBaaS PostgreSQL connection pool
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param connectionPoolName The connectionPoolName parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteDbaasPgConnectionPool(String serviceName, String connectionPoolName) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasPgConnectionPoolRequestCreation(serviceName, connectionPoolName).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a DBaaS PostgreSQL connection pool
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param connectionPoolName The connectionPoolName parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteDbaasPgConnectionPoolWithHttpInfo(String serviceName, String connectionPoolName) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasPgConnectionPoolRequestCreation(serviceName, connectionPoolName).toEntity(localVarReturnType);
    }

    /**
     * Delete a DBaaS PostgreSQL connection pool
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param connectionPoolName The connectionPoolName parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteDbaasPgConnectionPoolWithResponseSpec(String serviceName, String connectionPoolName) throws WebClientResponseException {
        return deleteDbaasPgConnectionPoolRequestCreation(serviceName, connectionPoolName);
    }
    /**
     * Delete a DBaaS Postgres database
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param databaseName The databaseName parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteDbaasPgDatabaseRequestCreation(String serviceName, String databaseName) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceName' when calling deleteDbaasPgDatabase", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'databaseName' is set
        if (databaseName == null) {
            throw new WebClientResponseException("Missing the required parameter 'databaseName' when calling deleteDbaasPgDatabase", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service-name", serviceName);
        pathParams.put("database-name", databaseName);

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
        return apiClient.invokeAPI("/dbaas-postgres/{service-name}/database/{database-name}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a DBaaS Postgres database
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param databaseName The databaseName parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteDbaasPgDatabase(String serviceName, String databaseName) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasPgDatabaseRequestCreation(serviceName, databaseName).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a DBaaS Postgres database
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param databaseName The databaseName parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteDbaasPgDatabaseWithHttpInfo(String serviceName, String databaseName) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasPgDatabaseRequestCreation(serviceName, databaseName).toEntity(localVarReturnType);
    }

    /**
     * Delete a DBaaS Postgres database
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param databaseName The databaseName parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteDbaasPgDatabaseWithResponseSpec(String serviceName, String databaseName) throws WebClientResponseException {
        return deleteDbaasPgDatabaseRequestCreation(serviceName, databaseName);
    }
    /**
     * Delete a DBaaS Postgres user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteDbaasPostgresUserRequestCreation(String serviceName, String username) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceName' when calling deleteDbaasPostgresUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new WebClientResponseException("Missing the required parameter 'username' when calling deleteDbaasPostgresUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service-name", serviceName);
        pathParams.put("username", username);

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
        return apiClient.invokeAPI("/dbaas-postgres/{service-name}/user/{username}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a DBaaS Postgres user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteDbaasPostgresUser(String serviceName, String username) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasPostgresUserRequestCreation(serviceName, username).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a DBaaS Postgres user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteDbaasPostgresUserWithHttpInfo(String serviceName, String username) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasPostgresUserRequestCreation(serviceName, username).toEntity(localVarReturnType);
    }

    /**
     * Delete a DBaaS Postgres user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteDbaasPostgresUserWithResponseSpec(String serviceName, String username) throws WebClientResponseException {
        return deleteDbaasPostgresUserRequestCreation(serviceName, username);
    }
    /**
     * Delete a DBaaS service
     * Delete a DBaaS service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteDbaasServiceRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling deleteDbaasService", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/dbaas-service/{name}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a DBaaS service
     * Delete a DBaaS service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteDbaasService(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasServiceRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a DBaaS service
     * Delete a DBaaS service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteDbaasServiceWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasServiceRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Delete a DBaaS service
     * Delete a DBaaS service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteDbaasServiceWithResponseSpec(String name) throws WebClientResponseException {
        return deleteDbaasServiceRequestCreation(name);
    }
    /**
     * Delete a Grafana service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteDbaasServiceGrafanaRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling deleteDbaasServiceGrafana", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/dbaas-grafana/{name}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a Grafana service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteDbaasServiceGrafana(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasServiceGrafanaRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a Grafana service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteDbaasServiceGrafanaWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasServiceGrafanaRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Delete a Grafana service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteDbaasServiceGrafanaWithResponseSpec(String name) throws WebClientResponseException {
        return deleteDbaasServiceGrafanaRequestCreation(name);
    }
    /**
     * Delete a Kafka service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteDbaasServiceKafkaRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling deleteDbaasServiceKafka", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/dbaas-kafka/{name}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a Kafka service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteDbaasServiceKafka(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasServiceKafkaRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a Kafka service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteDbaasServiceKafkaWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasServiceKafkaRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Delete a Kafka service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteDbaasServiceKafkaWithResponseSpec(String name) throws WebClientResponseException {
        return deleteDbaasServiceKafkaRequestCreation(name);
    }
    /**
     * Delete a MySQL service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteDbaasServiceMysqlRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling deleteDbaasServiceMysql", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/dbaas-mysql/{name}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a MySQL service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteDbaasServiceMysql(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasServiceMysqlRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a MySQL service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteDbaasServiceMysqlWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasServiceMysqlRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Delete a MySQL service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteDbaasServiceMysqlWithResponseSpec(String name) throws WebClientResponseException {
        return deleteDbaasServiceMysqlRequestCreation(name);
    }
    /**
     * Delete a OpenSearch service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteDbaasServiceOpensearchRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling deleteDbaasServiceOpensearch", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/dbaas-opensearch/{name}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a OpenSearch service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteDbaasServiceOpensearch(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasServiceOpensearchRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a OpenSearch service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteDbaasServiceOpensearchWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasServiceOpensearchRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Delete a OpenSearch service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteDbaasServiceOpensearchWithResponseSpec(String name) throws WebClientResponseException {
        return deleteDbaasServiceOpensearchRequestCreation(name);
    }
    /**
     * Delete a Postgres service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteDbaasServicePgRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling deleteDbaasServicePg", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/dbaas-postgres/{name}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a Postgres service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteDbaasServicePg(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasServicePgRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a Postgres service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteDbaasServicePgWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasServicePgRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Delete a Postgres service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteDbaasServicePgWithResponseSpec(String name) throws WebClientResponseException {
        return deleteDbaasServicePgRequestCreation(name);
    }
    /**
     * Delete a Redis service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteDbaasServiceRedisRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling deleteDbaasServiceRedis", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/dbaas-redis/{name}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a Redis service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> deleteDbaasServiceRedis(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasServiceRedisRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a Redis service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> deleteDbaasServiceRedisWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return deleteDbaasServiceRedisRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Delete a Redis service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteDbaasServiceRedisWithResponseSpec(String name) throws WebClientResponseException {
        return deleteDbaasServiceRedisRequestCreation(name);
    }
    /**
     * Get DBaaS CA Certificate
     * Returns a CA Certificate required to reach a DBaaS service through a TLS-protected connection.
     * <p><b>200</b> - 200
     * @return GetDbaasCaCertificate200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDbaasCaCertificateRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<GetDbaasCaCertificate200Response> localVarReturnType = new ParameterizedTypeReference<GetDbaasCaCertificate200Response>() {};
        return apiClient.invokeAPI("/dbaas-ca-certificate", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get DBaaS CA Certificate
     * Returns a CA Certificate required to reach a DBaaS service through a TLS-protected connection.
     * <p><b>200</b> - 200
     * @return GetDbaasCaCertificate200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetDbaasCaCertificate200Response> getDbaasCaCertificate() throws WebClientResponseException {
        ParameterizedTypeReference<GetDbaasCaCertificate200Response> localVarReturnType = new ParameterizedTypeReference<GetDbaasCaCertificate200Response>() {};
        return getDbaasCaCertificateRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Get DBaaS CA Certificate
     * Returns a CA Certificate required to reach a DBaaS service through a TLS-protected connection.
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;GetDbaasCaCertificate200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetDbaasCaCertificate200Response>> getDbaasCaCertificateWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<GetDbaasCaCertificate200Response> localVarReturnType = new ParameterizedTypeReference<GetDbaasCaCertificate200Response>() {};
        return getDbaasCaCertificateRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Get DBaaS CA Certificate
     * Returns a CA Certificate required to reach a DBaaS service through a TLS-protected connection.
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDbaasCaCertificateWithResponseSpec() throws WebClientResponseException {
        return getDbaasCaCertificateRequestCreation();
    }
    /**
     * Get a DBaaS Integration
     * Get a DBaaS Integration
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return DbaasIntegration
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDbaasIntegrationRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getDbaasIntegration", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DbaasIntegration> localVarReturnType = new ParameterizedTypeReference<DbaasIntegration>() {};
        return apiClient.invokeAPI("/dbaas-integration/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a DBaaS Integration
     * Get a DBaaS Integration
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return DbaasIntegration
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DbaasIntegration> getDbaasIntegration(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasIntegration> localVarReturnType = new ParameterizedTypeReference<DbaasIntegration>() {};
        return getDbaasIntegrationRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Get a DBaaS Integration
     * Get a DBaaS Integration
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseEntity&lt;DbaasIntegration&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DbaasIntegration>> getDbaasIntegrationWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasIntegration> localVarReturnType = new ParameterizedTypeReference<DbaasIntegration>() {};
        return getDbaasIntegrationRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Get a DBaaS Integration
     * Get a DBaaS Integration
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDbaasIntegrationWithResponseSpec(UUID id) throws WebClientResponseException {
        return getDbaasIntegrationRequestCreation(id);
    }
    /**
     * Get DBaaS kafka ACL configuration
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return DbaasKafkaAcls
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDbaasKafkaAclConfigRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling getDbaasKafkaAclConfig", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DbaasKafkaAcls> localVarReturnType = new ParameterizedTypeReference<DbaasKafkaAcls>() {};
        return apiClient.invokeAPI("/dbaas-kafka/{name}/acl-config", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get DBaaS kafka ACL configuration
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return DbaasKafkaAcls
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DbaasKafkaAcls> getDbaasKafkaAclConfig(String name) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasKafkaAcls> localVarReturnType = new ParameterizedTypeReference<DbaasKafkaAcls>() {};
        return getDbaasKafkaAclConfigRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Get DBaaS kafka ACL configuration
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;DbaasKafkaAcls&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DbaasKafkaAcls>> getDbaasKafkaAclConfigWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasKafkaAcls> localVarReturnType = new ParameterizedTypeReference<DbaasKafkaAcls>() {};
        return getDbaasKafkaAclConfigRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Get DBaaS kafka ACL configuration
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDbaasKafkaAclConfigWithResponseSpec(String name) throws WebClientResponseException {
        return getDbaasKafkaAclConfigRequestCreation(name);
    }
    /**
     * Get a DBaaS migration status
     * Get a DBaaS migration status
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return DbaasMigrationStatus
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDbaasMigrationStatusRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling getDbaasMigrationStatus", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DbaasMigrationStatus> localVarReturnType = new ParameterizedTypeReference<DbaasMigrationStatus>() {};
        return apiClient.invokeAPI("/dbaas-migration-status/{name}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a DBaaS migration status
     * Get a DBaaS migration status
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return DbaasMigrationStatus
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DbaasMigrationStatus> getDbaasMigrationStatus(String name) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasMigrationStatus> localVarReturnType = new ParameterizedTypeReference<DbaasMigrationStatus>() {};
        return getDbaasMigrationStatusRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Get a DBaaS migration status
     * Get a DBaaS migration status
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;DbaasMigrationStatus&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DbaasMigrationStatus>> getDbaasMigrationStatusWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasMigrationStatus> localVarReturnType = new ParameterizedTypeReference<DbaasMigrationStatus>() {};
        return getDbaasMigrationStatusRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Get a DBaaS migration status
     * Get a DBaaS migration status
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDbaasMigrationStatusWithResponseSpec(String name) throws WebClientResponseException {
        return getDbaasMigrationStatusRequestCreation(name);
    }
    /**
     * Get DBaaS OpenSearch ACL configuration
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return DbaasOpensearchAclConfig
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDbaasOpensearchAclConfigRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling getDbaasOpensearchAclConfig", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DbaasOpensearchAclConfig> localVarReturnType = new ParameterizedTypeReference<DbaasOpensearchAclConfig>() {};
        return apiClient.invokeAPI("/dbaas-opensearch/{name}/acl-config", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get DBaaS OpenSearch ACL configuration
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return DbaasOpensearchAclConfig
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DbaasOpensearchAclConfig> getDbaasOpensearchAclConfig(String name) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasOpensearchAclConfig> localVarReturnType = new ParameterizedTypeReference<DbaasOpensearchAclConfig>() {};
        return getDbaasOpensearchAclConfigRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Get DBaaS OpenSearch ACL configuration
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;DbaasOpensearchAclConfig&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DbaasOpensearchAclConfig>> getDbaasOpensearchAclConfigWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasOpensearchAclConfig> localVarReturnType = new ParameterizedTypeReference<DbaasOpensearchAclConfig>() {};
        return getDbaasOpensearchAclConfigRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Get DBaaS OpenSearch ACL configuration
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDbaasOpensearchAclConfigWithResponseSpec(String name) throws WebClientResponseException {
        return getDbaasOpensearchAclConfigRequestCreation(name);
    }
    /**
     * Get a DBaaS Grafana service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return DbaasServiceGrafana
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDbaasServiceGrafanaRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling getDbaasServiceGrafana", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DbaasServiceGrafana> localVarReturnType = new ParameterizedTypeReference<DbaasServiceGrafana>() {};
        return apiClient.invokeAPI("/dbaas-grafana/{name}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a DBaaS Grafana service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return DbaasServiceGrafana
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DbaasServiceGrafana> getDbaasServiceGrafana(String name) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasServiceGrafana> localVarReturnType = new ParameterizedTypeReference<DbaasServiceGrafana>() {};
        return getDbaasServiceGrafanaRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Get a DBaaS Grafana service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;DbaasServiceGrafana&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DbaasServiceGrafana>> getDbaasServiceGrafanaWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasServiceGrafana> localVarReturnType = new ParameterizedTypeReference<DbaasServiceGrafana>() {};
        return getDbaasServiceGrafanaRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Get a DBaaS Grafana service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDbaasServiceGrafanaWithResponseSpec(String name) throws WebClientResponseException {
        return getDbaasServiceGrafanaRequestCreation(name);
    }
    /**
     * Get a DBaaS Kafka service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return DbaasServiceKafka
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDbaasServiceKafkaRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling getDbaasServiceKafka", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DbaasServiceKafka> localVarReturnType = new ParameterizedTypeReference<DbaasServiceKafka>() {};
        return apiClient.invokeAPI("/dbaas-kafka/{name}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a DBaaS Kafka service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return DbaasServiceKafka
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DbaasServiceKafka> getDbaasServiceKafka(String name) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasServiceKafka> localVarReturnType = new ParameterizedTypeReference<DbaasServiceKafka>() {};
        return getDbaasServiceKafkaRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Get a DBaaS Kafka service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;DbaasServiceKafka&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DbaasServiceKafka>> getDbaasServiceKafkaWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasServiceKafka> localVarReturnType = new ParameterizedTypeReference<DbaasServiceKafka>() {};
        return getDbaasServiceKafkaRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Get a DBaaS Kafka service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDbaasServiceKafkaWithResponseSpec(String name) throws WebClientResponseException {
        return getDbaasServiceKafkaRequestCreation(name);
    }
    /**
     * Get logs of DBaaS service
     * Get logs of DBaaS service
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param getDbaasServiceLogsRequest The getDbaasServiceLogsRequest parameter
     * @return DbaasServiceLogs
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDbaasServiceLogsRequestCreation(String serviceName, GetDbaasServiceLogsRequest getDbaasServiceLogsRequest) throws WebClientResponseException {
        Object postBody = getDbaasServiceLogsRequest;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceName' when calling getDbaasServiceLogs", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'getDbaasServiceLogsRequest' is set
        if (getDbaasServiceLogsRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'getDbaasServiceLogsRequest' when calling getDbaasServiceLogs", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service-name", serviceName);

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

        ParameterizedTypeReference<DbaasServiceLogs> localVarReturnType = new ParameterizedTypeReference<DbaasServiceLogs>() {};
        return apiClient.invokeAPI("/dbaas-service-logs/{service-name}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get logs of DBaaS service
     * Get logs of DBaaS service
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param getDbaasServiceLogsRequest The getDbaasServiceLogsRequest parameter
     * @return DbaasServiceLogs
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DbaasServiceLogs> getDbaasServiceLogs(String serviceName, GetDbaasServiceLogsRequest getDbaasServiceLogsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasServiceLogs> localVarReturnType = new ParameterizedTypeReference<DbaasServiceLogs>() {};
        return getDbaasServiceLogsRequestCreation(serviceName, getDbaasServiceLogsRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Get logs of DBaaS service
     * Get logs of DBaaS service
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param getDbaasServiceLogsRequest The getDbaasServiceLogsRequest parameter
     * @return ResponseEntity&lt;DbaasServiceLogs&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DbaasServiceLogs>> getDbaasServiceLogsWithHttpInfo(String serviceName, GetDbaasServiceLogsRequest getDbaasServiceLogsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasServiceLogs> localVarReturnType = new ParameterizedTypeReference<DbaasServiceLogs>() {};
        return getDbaasServiceLogsRequestCreation(serviceName, getDbaasServiceLogsRequest).toEntity(localVarReturnType);
    }

    /**
     * Get logs of DBaaS service
     * Get logs of DBaaS service
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param getDbaasServiceLogsRequest The getDbaasServiceLogsRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDbaasServiceLogsWithResponseSpec(String serviceName, GetDbaasServiceLogsRequest getDbaasServiceLogsRequest) throws WebClientResponseException {
        return getDbaasServiceLogsRequestCreation(serviceName, getDbaasServiceLogsRequest);
    }
    /**
     * Get metrics of DBaaS service
     * Get metrics of DBaaS service
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param getDbaasServiceMetricsRequest The getDbaasServiceMetricsRequest parameter
     * @return GetDbaasServiceMetrics200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDbaasServiceMetricsRequestCreation(String serviceName, GetDbaasServiceMetricsRequest getDbaasServiceMetricsRequest) throws WebClientResponseException {
        Object postBody = getDbaasServiceMetricsRequest;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceName' when calling getDbaasServiceMetrics", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'getDbaasServiceMetricsRequest' is set
        if (getDbaasServiceMetricsRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'getDbaasServiceMetricsRequest' when calling getDbaasServiceMetrics", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service-name", serviceName);

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

        ParameterizedTypeReference<GetDbaasServiceMetrics200Response> localVarReturnType = new ParameterizedTypeReference<GetDbaasServiceMetrics200Response>() {};
        return apiClient.invokeAPI("/dbaas-service-metrics/{service-name}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get metrics of DBaaS service
     * Get metrics of DBaaS service
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param getDbaasServiceMetricsRequest The getDbaasServiceMetricsRequest parameter
     * @return GetDbaasServiceMetrics200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetDbaasServiceMetrics200Response> getDbaasServiceMetrics(String serviceName, GetDbaasServiceMetricsRequest getDbaasServiceMetricsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<GetDbaasServiceMetrics200Response> localVarReturnType = new ParameterizedTypeReference<GetDbaasServiceMetrics200Response>() {};
        return getDbaasServiceMetricsRequestCreation(serviceName, getDbaasServiceMetricsRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Get metrics of DBaaS service
     * Get metrics of DBaaS service
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param getDbaasServiceMetricsRequest The getDbaasServiceMetricsRequest parameter
     * @return ResponseEntity&lt;GetDbaasServiceMetrics200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetDbaasServiceMetrics200Response>> getDbaasServiceMetricsWithHttpInfo(String serviceName, GetDbaasServiceMetricsRequest getDbaasServiceMetricsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<GetDbaasServiceMetrics200Response> localVarReturnType = new ParameterizedTypeReference<GetDbaasServiceMetrics200Response>() {};
        return getDbaasServiceMetricsRequestCreation(serviceName, getDbaasServiceMetricsRequest).toEntity(localVarReturnType);
    }

    /**
     * Get metrics of DBaaS service
     * Get metrics of DBaaS service
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param getDbaasServiceMetricsRequest The getDbaasServiceMetricsRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDbaasServiceMetricsWithResponseSpec(String serviceName, GetDbaasServiceMetricsRequest getDbaasServiceMetricsRequest) throws WebClientResponseException {
        return getDbaasServiceMetricsRequestCreation(serviceName, getDbaasServiceMetricsRequest);
    }
    /**
     * Get a DBaaS MySQL service
     * Get a DBaaS MySQL service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return DbaasServiceMysql
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDbaasServiceMysqlRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling getDbaasServiceMysql", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DbaasServiceMysql> localVarReturnType = new ParameterizedTypeReference<DbaasServiceMysql>() {};
        return apiClient.invokeAPI("/dbaas-mysql/{name}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a DBaaS MySQL service
     * Get a DBaaS MySQL service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return DbaasServiceMysql
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DbaasServiceMysql> getDbaasServiceMysql(String name) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasServiceMysql> localVarReturnType = new ParameterizedTypeReference<DbaasServiceMysql>() {};
        return getDbaasServiceMysqlRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Get a DBaaS MySQL service
     * Get a DBaaS MySQL service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;DbaasServiceMysql&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DbaasServiceMysql>> getDbaasServiceMysqlWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasServiceMysql> localVarReturnType = new ParameterizedTypeReference<DbaasServiceMysql>() {};
        return getDbaasServiceMysqlRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Get a DBaaS MySQL service
     * Get a DBaaS MySQL service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDbaasServiceMysqlWithResponseSpec(String name) throws WebClientResponseException {
        return getDbaasServiceMysqlRequestCreation(name);
    }
    /**
     * Get a DBaaS OpenSearch service
     * Get a DBaaS OpenSearch service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return DbaasServiceOpensearch
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDbaasServiceOpensearchRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling getDbaasServiceOpensearch", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DbaasServiceOpensearch> localVarReturnType = new ParameterizedTypeReference<DbaasServiceOpensearch>() {};
        return apiClient.invokeAPI("/dbaas-opensearch/{name}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a DBaaS OpenSearch service
     * Get a DBaaS OpenSearch service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return DbaasServiceOpensearch
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DbaasServiceOpensearch> getDbaasServiceOpensearch(String name) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasServiceOpensearch> localVarReturnType = new ParameterizedTypeReference<DbaasServiceOpensearch>() {};
        return getDbaasServiceOpensearchRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Get a DBaaS OpenSearch service
     * Get a DBaaS OpenSearch service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;DbaasServiceOpensearch&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DbaasServiceOpensearch>> getDbaasServiceOpensearchWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasServiceOpensearch> localVarReturnType = new ParameterizedTypeReference<DbaasServiceOpensearch>() {};
        return getDbaasServiceOpensearchRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Get a DBaaS OpenSearch service
     * Get a DBaaS OpenSearch service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDbaasServiceOpensearchWithResponseSpec(String name) throws WebClientResponseException {
        return getDbaasServiceOpensearchRequestCreation(name);
    }
    /**
     * Get a DBaaS PostgreSQL service
     * Get a DBaaS PostgreSQL service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return DbaasServicePg
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDbaasServicePgRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling getDbaasServicePg", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DbaasServicePg> localVarReturnType = new ParameterizedTypeReference<DbaasServicePg>() {};
        return apiClient.invokeAPI("/dbaas-postgres/{name}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a DBaaS PostgreSQL service
     * Get a DBaaS PostgreSQL service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return DbaasServicePg
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DbaasServicePg> getDbaasServicePg(String name) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasServicePg> localVarReturnType = new ParameterizedTypeReference<DbaasServicePg>() {};
        return getDbaasServicePgRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Get a DBaaS PostgreSQL service
     * Get a DBaaS PostgreSQL service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;DbaasServicePg&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DbaasServicePg>> getDbaasServicePgWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasServicePg> localVarReturnType = new ParameterizedTypeReference<DbaasServicePg>() {};
        return getDbaasServicePgRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Get a DBaaS PostgreSQL service
     * Get a DBaaS PostgreSQL service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDbaasServicePgWithResponseSpec(String name) throws WebClientResponseException {
        return getDbaasServicePgRequestCreation(name);
    }
    /**
     * Get a DBaaS Redis service
     * Get a DBaaS Redis service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return DbaasServiceRedis
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDbaasServiceRedisRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling getDbaasServiceRedis", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DbaasServiceRedis> localVarReturnType = new ParameterizedTypeReference<DbaasServiceRedis>() {};
        return apiClient.invokeAPI("/dbaas-redis/{name}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a DBaaS Redis service
     * Get a DBaaS Redis service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return DbaasServiceRedis
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DbaasServiceRedis> getDbaasServiceRedis(String name) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasServiceRedis> localVarReturnType = new ParameterizedTypeReference<DbaasServiceRedis>() {};
        return getDbaasServiceRedisRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Get a DBaaS Redis service
     * Get a DBaaS Redis service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;DbaasServiceRedis&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DbaasServiceRedis>> getDbaasServiceRedisWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasServiceRedis> localVarReturnType = new ParameterizedTypeReference<DbaasServiceRedis>() {};
        return getDbaasServiceRedisRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Get a DBaaS Redis service
     * Get a DBaaS Redis service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDbaasServiceRedisWithResponseSpec(String name) throws WebClientResponseException {
        return getDbaasServiceRedisRequestCreation(name);
    }
    /**
     * Get a DBaaS service type
     * Get a DBaaS service type
     * <p><b>200</b> - 200
     * @param serviceTypeName The serviceTypeName parameter
     * @return DbaasServiceType
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDbaasServiceTypeRequestCreation(String serviceTypeName) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'serviceTypeName' is set
        if (serviceTypeName == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceTypeName' when calling getDbaasServiceType", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service-type-name", serviceTypeName);

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

        ParameterizedTypeReference<DbaasServiceType> localVarReturnType = new ParameterizedTypeReference<DbaasServiceType>() {};
        return apiClient.invokeAPI("/dbaas-service-type/{service-type-name}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a DBaaS service type
     * Get a DBaaS service type
     * <p><b>200</b> - 200
     * @param serviceTypeName The serviceTypeName parameter
     * @return DbaasServiceType
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DbaasServiceType> getDbaasServiceType(String serviceTypeName) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasServiceType> localVarReturnType = new ParameterizedTypeReference<DbaasServiceType>() {};
        return getDbaasServiceTypeRequestCreation(serviceTypeName).bodyToMono(localVarReturnType);
    }

    /**
     * Get a DBaaS service type
     * Get a DBaaS service type
     * <p><b>200</b> - 200
     * @param serviceTypeName The serviceTypeName parameter
     * @return ResponseEntity&lt;DbaasServiceType&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DbaasServiceType>> getDbaasServiceTypeWithHttpInfo(String serviceTypeName) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasServiceType> localVarReturnType = new ParameterizedTypeReference<DbaasServiceType>() {};
        return getDbaasServiceTypeRequestCreation(serviceTypeName).toEntity(localVarReturnType);
    }

    /**
     * Get a DBaaS service type
     * Get a DBaaS service type
     * <p><b>200</b> - 200
     * @param serviceTypeName The serviceTypeName parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDbaasServiceTypeWithResponseSpec(String serviceTypeName) throws WebClientResponseException {
        return getDbaasServiceTypeRequestCreation(serviceTypeName);
    }
    /**
     * Get DBaaS Grafana settings
     * Get DBaaS Grafana settings
     * <p><b>200</b> - 200
     * @return GetDbaasSettingsGrafana200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDbaasSettingsGrafanaRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<GetDbaasSettingsGrafana200Response> localVarReturnType = new ParameterizedTypeReference<GetDbaasSettingsGrafana200Response>() {};
        return apiClient.invokeAPI("/dbaas-settings-grafana", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get DBaaS Grafana settings
     * Get DBaaS Grafana settings
     * <p><b>200</b> - 200
     * @return GetDbaasSettingsGrafana200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetDbaasSettingsGrafana200Response> getDbaasSettingsGrafana() throws WebClientResponseException {
        ParameterizedTypeReference<GetDbaasSettingsGrafana200Response> localVarReturnType = new ParameterizedTypeReference<GetDbaasSettingsGrafana200Response>() {};
        return getDbaasSettingsGrafanaRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Get DBaaS Grafana settings
     * Get DBaaS Grafana settings
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;GetDbaasSettingsGrafana200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetDbaasSettingsGrafana200Response>> getDbaasSettingsGrafanaWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<GetDbaasSettingsGrafana200Response> localVarReturnType = new ParameterizedTypeReference<GetDbaasSettingsGrafana200Response>() {};
        return getDbaasSettingsGrafanaRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Get DBaaS Grafana settings
     * Get DBaaS Grafana settings
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDbaasSettingsGrafanaWithResponseSpec() throws WebClientResponseException {
        return getDbaasSettingsGrafanaRequestCreation();
    }
    /**
     * Get DBaaS Kafka settings
     * Get DBaaS Kafka settings
     * <p><b>200</b> - 200
     * @return GetDbaasSettingsKafka200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDbaasSettingsKafkaRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<GetDbaasSettingsKafka200Response> localVarReturnType = new ParameterizedTypeReference<GetDbaasSettingsKafka200Response>() {};
        return apiClient.invokeAPI("/dbaas-settings-kafka", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get DBaaS Kafka settings
     * Get DBaaS Kafka settings
     * <p><b>200</b> - 200
     * @return GetDbaasSettingsKafka200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetDbaasSettingsKafka200Response> getDbaasSettingsKafka() throws WebClientResponseException {
        ParameterizedTypeReference<GetDbaasSettingsKafka200Response> localVarReturnType = new ParameterizedTypeReference<GetDbaasSettingsKafka200Response>() {};
        return getDbaasSettingsKafkaRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Get DBaaS Kafka settings
     * Get DBaaS Kafka settings
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;GetDbaasSettingsKafka200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetDbaasSettingsKafka200Response>> getDbaasSettingsKafkaWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<GetDbaasSettingsKafka200Response> localVarReturnType = new ParameterizedTypeReference<GetDbaasSettingsKafka200Response>() {};
        return getDbaasSettingsKafkaRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Get DBaaS Kafka settings
     * Get DBaaS Kafka settings
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDbaasSettingsKafkaWithResponseSpec() throws WebClientResponseException {
        return getDbaasSettingsKafkaRequestCreation();
    }
    /**
     * Get DBaaS MySQL settings
     * Get DBaaS MySQL settings
     * <p><b>200</b> - 200
     * @return GetDbaasSettingsMysql200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDbaasSettingsMysqlRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<GetDbaasSettingsMysql200Response> localVarReturnType = new ParameterizedTypeReference<GetDbaasSettingsMysql200Response>() {};
        return apiClient.invokeAPI("/dbaas-settings-mysql", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get DBaaS MySQL settings
     * Get DBaaS MySQL settings
     * <p><b>200</b> - 200
     * @return GetDbaasSettingsMysql200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetDbaasSettingsMysql200Response> getDbaasSettingsMysql() throws WebClientResponseException {
        ParameterizedTypeReference<GetDbaasSettingsMysql200Response> localVarReturnType = new ParameterizedTypeReference<GetDbaasSettingsMysql200Response>() {};
        return getDbaasSettingsMysqlRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Get DBaaS MySQL settings
     * Get DBaaS MySQL settings
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;GetDbaasSettingsMysql200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetDbaasSettingsMysql200Response>> getDbaasSettingsMysqlWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<GetDbaasSettingsMysql200Response> localVarReturnType = new ParameterizedTypeReference<GetDbaasSettingsMysql200Response>() {};
        return getDbaasSettingsMysqlRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Get DBaaS MySQL settings
     * Get DBaaS MySQL settings
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDbaasSettingsMysqlWithResponseSpec() throws WebClientResponseException {
        return getDbaasSettingsMysqlRequestCreation();
    }
    /**
     * Get DBaaS OpenSearch settings
     * Get DBaaS OpenSearch settings
     * <p><b>200</b> - 200
     * @return GetDbaasSettingsOpensearch200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDbaasSettingsOpensearchRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<GetDbaasSettingsOpensearch200Response> localVarReturnType = new ParameterizedTypeReference<GetDbaasSettingsOpensearch200Response>() {};
        return apiClient.invokeAPI("/dbaas-settings-opensearch", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get DBaaS OpenSearch settings
     * Get DBaaS OpenSearch settings
     * <p><b>200</b> - 200
     * @return GetDbaasSettingsOpensearch200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetDbaasSettingsOpensearch200Response> getDbaasSettingsOpensearch() throws WebClientResponseException {
        ParameterizedTypeReference<GetDbaasSettingsOpensearch200Response> localVarReturnType = new ParameterizedTypeReference<GetDbaasSettingsOpensearch200Response>() {};
        return getDbaasSettingsOpensearchRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Get DBaaS OpenSearch settings
     * Get DBaaS OpenSearch settings
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;GetDbaasSettingsOpensearch200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetDbaasSettingsOpensearch200Response>> getDbaasSettingsOpensearchWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<GetDbaasSettingsOpensearch200Response> localVarReturnType = new ParameterizedTypeReference<GetDbaasSettingsOpensearch200Response>() {};
        return getDbaasSettingsOpensearchRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Get DBaaS OpenSearch settings
     * Get DBaaS OpenSearch settings
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDbaasSettingsOpensearchWithResponseSpec() throws WebClientResponseException {
        return getDbaasSettingsOpensearchRequestCreation();
    }
    /**
     * Get DBaaS PostgreSQL settings
     * Get DBaaS PostgreSQL settings
     * <p><b>200</b> - 200
     * @return GetDbaasSettingsPg200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDbaasSettingsPgRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<GetDbaasSettingsPg200Response> localVarReturnType = new ParameterizedTypeReference<GetDbaasSettingsPg200Response>() {};
        return apiClient.invokeAPI("/dbaas-settings-pg", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get DBaaS PostgreSQL settings
     * Get DBaaS PostgreSQL settings
     * <p><b>200</b> - 200
     * @return GetDbaasSettingsPg200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetDbaasSettingsPg200Response> getDbaasSettingsPg() throws WebClientResponseException {
        ParameterizedTypeReference<GetDbaasSettingsPg200Response> localVarReturnType = new ParameterizedTypeReference<GetDbaasSettingsPg200Response>() {};
        return getDbaasSettingsPgRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Get DBaaS PostgreSQL settings
     * Get DBaaS PostgreSQL settings
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;GetDbaasSettingsPg200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetDbaasSettingsPg200Response>> getDbaasSettingsPgWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<GetDbaasSettingsPg200Response> localVarReturnType = new ParameterizedTypeReference<GetDbaasSettingsPg200Response>() {};
        return getDbaasSettingsPgRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Get DBaaS PostgreSQL settings
     * Get DBaaS PostgreSQL settings
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDbaasSettingsPgWithResponseSpec() throws WebClientResponseException {
        return getDbaasSettingsPgRequestCreation();
    }
    /**
     * Get DBaaS Redis settings
     * Returns the default settings for Redis.
     * <p><b>200</b> - 200
     * @return GetDbaasSettingsRedis200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDbaasSettingsRedisRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<GetDbaasSettingsRedis200Response> localVarReturnType = new ParameterizedTypeReference<GetDbaasSettingsRedis200Response>() {};
        return apiClient.invokeAPI("/dbaas-settings-redis", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get DBaaS Redis settings
     * Returns the default settings for Redis.
     * <p><b>200</b> - 200
     * @return GetDbaasSettingsRedis200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetDbaasSettingsRedis200Response> getDbaasSettingsRedis() throws WebClientResponseException {
        ParameterizedTypeReference<GetDbaasSettingsRedis200Response> localVarReturnType = new ParameterizedTypeReference<GetDbaasSettingsRedis200Response>() {};
        return getDbaasSettingsRedisRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Get DBaaS Redis settings
     * Returns the default settings for Redis.
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;GetDbaasSettingsRedis200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetDbaasSettingsRedis200Response>> getDbaasSettingsRedisWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<GetDbaasSettingsRedis200Response> localVarReturnType = new ParameterizedTypeReference<GetDbaasSettingsRedis200Response>() {};
        return getDbaasSettingsRedisRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Get DBaaS Redis settings
     * Returns the default settings for Redis.
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDbaasSettingsRedisWithResponseSpec() throws WebClientResponseException {
        return getDbaasSettingsRedisRequestCreation();
    }
    /**
     * Get a DBaaS task
     * Get a DBaaS task
     * <p><b>200</b> - 200
     * @param service The service parameter
     * @param id The id parameter
     * @return DbaasTask
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDbaasTaskRequestCreation(String service, UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'service' is set
        if (service == null) {
            throw new WebClientResponseException("Missing the required parameter 'service' when calling getDbaasTask", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getDbaasTask", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service", service);
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

        ParameterizedTypeReference<DbaasTask> localVarReturnType = new ParameterizedTypeReference<DbaasTask>() {};
        return apiClient.invokeAPI("/dbaas-task/{service}/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a DBaaS task
     * Get a DBaaS task
     * <p><b>200</b> - 200
     * @param service The service parameter
     * @param id The id parameter
     * @return DbaasTask
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DbaasTask> getDbaasTask(String service, UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasTask> localVarReturnType = new ParameterizedTypeReference<DbaasTask>() {};
        return getDbaasTaskRequestCreation(service, id).bodyToMono(localVarReturnType);
    }

    /**
     * Get a DBaaS task
     * Get a DBaaS task
     * <p><b>200</b> - 200
     * @param service The service parameter
     * @param id The id parameter
     * @return ResponseEntity&lt;DbaasTask&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DbaasTask>> getDbaasTaskWithHttpInfo(String service, UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasTask> localVarReturnType = new ParameterizedTypeReference<DbaasTask>() {};
        return getDbaasTaskRequestCreation(service, id).toEntity(localVarReturnType);
    }

    /**
     * Get a DBaaS task
     * Get a DBaaS task
     * <p><b>200</b> - 200
     * @param service The service parameter
     * @param id The id parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDbaasTaskWithResponseSpec(String service, UUID id) throws WebClientResponseException {
        return getDbaasTaskRequestCreation(service, id);
    }
    /**
     * Get DBaaS integration settings
     * Get DBaaS integration settings
     * <p><b>200</b> - 200
     * @param integrationType The integrationType parameter
     * @param sourceType The sourceType parameter
     * @param destType The destType parameter
     * @return ListDbaasIntegrationSettings200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listDbaasIntegrationSettingsRequestCreation(String integrationType, String sourceType, String destType) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'integrationType' is set
        if (integrationType == null) {
            throw new WebClientResponseException("Missing the required parameter 'integrationType' when calling listDbaasIntegrationSettings", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'sourceType' is set
        if (sourceType == null) {
            throw new WebClientResponseException("Missing the required parameter 'sourceType' when calling listDbaasIntegrationSettings", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'destType' is set
        if (destType == null) {
            throw new WebClientResponseException("Missing the required parameter 'destType' when calling listDbaasIntegrationSettings", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("integration-type", integrationType);
        pathParams.put("source-type", sourceType);
        pathParams.put("dest-type", destType);

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

        ParameterizedTypeReference<ListDbaasIntegrationSettings200Response> localVarReturnType = new ParameterizedTypeReference<ListDbaasIntegrationSettings200Response>() {};
        return apiClient.invokeAPI("/dbaas-integration-settings/{integration-type}/{source-type}/{dest-type}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get DBaaS integration settings
     * Get DBaaS integration settings
     * <p><b>200</b> - 200
     * @param integrationType The integrationType parameter
     * @param sourceType The sourceType parameter
     * @param destType The destType parameter
     * @return ListDbaasIntegrationSettings200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListDbaasIntegrationSettings200Response> listDbaasIntegrationSettings(String integrationType, String sourceType, String destType) throws WebClientResponseException {
        ParameterizedTypeReference<ListDbaasIntegrationSettings200Response> localVarReturnType = new ParameterizedTypeReference<ListDbaasIntegrationSettings200Response>() {};
        return listDbaasIntegrationSettingsRequestCreation(integrationType, sourceType, destType).bodyToMono(localVarReturnType);
    }

    /**
     * Get DBaaS integration settings
     * Get DBaaS integration settings
     * <p><b>200</b> - 200
     * @param integrationType The integrationType parameter
     * @param sourceType The sourceType parameter
     * @param destType The destType parameter
     * @return ResponseEntity&lt;ListDbaasIntegrationSettings200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListDbaasIntegrationSettings200Response>> listDbaasIntegrationSettingsWithHttpInfo(String integrationType, String sourceType, String destType) throws WebClientResponseException {
        ParameterizedTypeReference<ListDbaasIntegrationSettings200Response> localVarReturnType = new ParameterizedTypeReference<ListDbaasIntegrationSettings200Response>() {};
        return listDbaasIntegrationSettingsRequestCreation(integrationType, sourceType, destType).toEntity(localVarReturnType);
    }

    /**
     * Get DBaaS integration settings
     * Get DBaaS integration settings
     * <p><b>200</b> - 200
     * @param integrationType The integrationType parameter
     * @param sourceType The sourceType parameter
     * @param destType The destType parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listDbaasIntegrationSettingsWithResponseSpec(String integrationType, String sourceType, String destType) throws WebClientResponseException {
        return listDbaasIntegrationSettingsRequestCreation(integrationType, sourceType, destType);
    }
    /**
     * Get DBaaS integration types
     * Get DBaaS integration types
     * <p><b>200</b> - 200
     * @return ListDbaasIntegrationTypes200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listDbaasIntegrationTypesRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<ListDbaasIntegrationTypes200Response> localVarReturnType = new ParameterizedTypeReference<ListDbaasIntegrationTypes200Response>() {};
        return apiClient.invokeAPI("/dbaas-integration-types", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get DBaaS integration types
     * Get DBaaS integration types
     * <p><b>200</b> - 200
     * @return ListDbaasIntegrationTypes200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListDbaasIntegrationTypes200Response> listDbaasIntegrationTypes() throws WebClientResponseException {
        ParameterizedTypeReference<ListDbaasIntegrationTypes200Response> localVarReturnType = new ParameterizedTypeReference<ListDbaasIntegrationTypes200Response>() {};
        return listDbaasIntegrationTypesRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Get DBaaS integration types
     * Get DBaaS integration types
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;ListDbaasIntegrationTypes200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListDbaasIntegrationTypes200Response>> listDbaasIntegrationTypesWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<ListDbaasIntegrationTypes200Response> localVarReturnType = new ParameterizedTypeReference<ListDbaasIntegrationTypes200Response>() {};
        return listDbaasIntegrationTypesRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Get DBaaS integration types
     * Get DBaaS integration types
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listDbaasIntegrationTypesWithResponseSpec() throws WebClientResponseException {
        return listDbaasIntegrationTypesRequestCreation();
    }
    /**
     * DBaaS Service Types
     * List available service types for DBaaS
     * <p><b>200</b> - 200
     * @return ListDbaasServiceTypes200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listDbaasServiceTypesRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<ListDbaasServiceTypes200Response> localVarReturnType = new ParameterizedTypeReference<ListDbaasServiceTypes200Response>() {};
        return apiClient.invokeAPI("/dbaas-service-type", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * DBaaS Service Types
     * List available service types for DBaaS
     * <p><b>200</b> - 200
     * @return ListDbaasServiceTypes200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListDbaasServiceTypes200Response> listDbaasServiceTypes() throws WebClientResponseException {
        ParameterizedTypeReference<ListDbaasServiceTypes200Response> localVarReturnType = new ParameterizedTypeReference<ListDbaasServiceTypes200Response>() {};
        return listDbaasServiceTypesRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * DBaaS Service Types
     * List available service types for DBaaS
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;ListDbaasServiceTypes200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListDbaasServiceTypes200Response>> listDbaasServiceTypesWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<ListDbaasServiceTypes200Response> localVarReturnType = new ParameterizedTypeReference<ListDbaasServiceTypes200Response>() {};
        return listDbaasServiceTypesRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * DBaaS Service Types
     * List available service types for DBaaS
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listDbaasServiceTypesWithResponseSpec() throws WebClientResponseException {
        return listDbaasServiceTypesRequestCreation();
    }
    /**
     * List DBaaS services
     * List DBaaS services
     * <p><b>200</b> - 200
     * @return ListDbaasServices200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listDbaasServicesRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<ListDbaasServices200Response> localVarReturnType = new ParameterizedTypeReference<ListDbaasServices200Response>() {};
        return apiClient.invokeAPI("/dbaas-service", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List DBaaS services
     * List DBaaS services
     * <p><b>200</b> - 200
     * @return ListDbaasServices200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListDbaasServices200Response> listDbaasServices() throws WebClientResponseException {
        ParameterizedTypeReference<ListDbaasServices200Response> localVarReturnType = new ParameterizedTypeReference<ListDbaasServices200Response>() {};
        return listDbaasServicesRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * List DBaaS services
     * List DBaaS services
     * <p><b>200</b> - 200
     * @return ResponseEntity&lt;ListDbaasServices200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ListDbaasServices200Response>> listDbaasServicesWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<ListDbaasServices200Response> localVarReturnType = new ParameterizedTypeReference<ListDbaasServices200Response>() {};
        return listDbaasServicesRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * List DBaaS services
     * List DBaaS services
     * <p><b>200</b> - 200
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec listDbaasServicesWithResponseSpec() throws WebClientResponseException {
        return listDbaasServicesRequestCreation();
    }
    /**
     * Reset the credentials of a DBaaS Kafka user
     * If no password is provided one will be generated automatically.
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @param resetDbaasOpensearchUserPasswordRequest The resetDbaasOpensearchUserPasswordRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec resetDbaasKafkaUserPasswordRequestCreation(String serviceName, String username, ResetDbaasOpensearchUserPasswordRequest resetDbaasOpensearchUserPasswordRequest) throws WebClientResponseException {
        Object postBody = resetDbaasOpensearchUserPasswordRequest;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceName' when calling resetDbaasKafkaUserPassword", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new WebClientResponseException("Missing the required parameter 'username' when calling resetDbaasKafkaUserPassword", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'resetDbaasOpensearchUserPasswordRequest' is set
        if (resetDbaasOpensearchUserPasswordRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'resetDbaasOpensearchUserPasswordRequest' when calling resetDbaasKafkaUserPassword", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service-name", serviceName);
        pathParams.put("username", username);

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
        return apiClient.invokeAPI("/dbaas-kafka/{service-name}/user/{username}/password/reset", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Reset the credentials of a DBaaS Kafka user
     * If no password is provided one will be generated automatically.
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @param resetDbaasOpensearchUserPasswordRequest The resetDbaasOpensearchUserPasswordRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> resetDbaasKafkaUserPassword(String serviceName, String username, ResetDbaasOpensearchUserPasswordRequest resetDbaasOpensearchUserPasswordRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetDbaasKafkaUserPasswordRequestCreation(serviceName, username, resetDbaasOpensearchUserPasswordRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Reset the credentials of a DBaaS Kafka user
     * If no password is provided one will be generated automatically.
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @param resetDbaasOpensearchUserPasswordRequest The resetDbaasOpensearchUserPasswordRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> resetDbaasKafkaUserPasswordWithHttpInfo(String serviceName, String username, ResetDbaasOpensearchUserPasswordRequest resetDbaasOpensearchUserPasswordRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetDbaasKafkaUserPasswordRequestCreation(serviceName, username, resetDbaasOpensearchUserPasswordRequest).toEntity(localVarReturnType);
    }

    /**
     * Reset the credentials of a DBaaS Kafka user
     * If no password is provided one will be generated automatically.
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @param resetDbaasOpensearchUserPasswordRequest The resetDbaasOpensearchUserPasswordRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec resetDbaasKafkaUserPasswordWithResponseSpec(String serviceName, String username, ResetDbaasOpensearchUserPasswordRequest resetDbaasOpensearchUserPasswordRequest) throws WebClientResponseException {
        return resetDbaasKafkaUserPasswordRequestCreation(serviceName, username, resetDbaasOpensearchUserPasswordRequest);
    }
    /**
     * Reset the credentials of a DBaaS mysql user
     * If no password is provided one will be generated automatically.
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @param resetDbaasMysqlUserPasswordRequest The resetDbaasMysqlUserPasswordRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec resetDbaasMysqlUserPasswordRequestCreation(String serviceName, String username, ResetDbaasMysqlUserPasswordRequest resetDbaasMysqlUserPasswordRequest) throws WebClientResponseException {
        Object postBody = resetDbaasMysqlUserPasswordRequest;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceName' when calling resetDbaasMysqlUserPassword", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new WebClientResponseException("Missing the required parameter 'username' when calling resetDbaasMysqlUserPassword", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'resetDbaasMysqlUserPasswordRequest' is set
        if (resetDbaasMysqlUserPasswordRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'resetDbaasMysqlUserPasswordRequest' when calling resetDbaasMysqlUserPassword", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service-name", serviceName);
        pathParams.put("username", username);

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
        return apiClient.invokeAPI("/dbaas-mysql/{service-name}/user/{username}/password/reset", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Reset the credentials of a DBaaS mysql user
     * If no password is provided one will be generated automatically.
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @param resetDbaasMysqlUserPasswordRequest The resetDbaasMysqlUserPasswordRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> resetDbaasMysqlUserPassword(String serviceName, String username, ResetDbaasMysqlUserPasswordRequest resetDbaasMysqlUserPasswordRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetDbaasMysqlUserPasswordRequestCreation(serviceName, username, resetDbaasMysqlUserPasswordRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Reset the credentials of a DBaaS mysql user
     * If no password is provided one will be generated automatically.
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @param resetDbaasMysqlUserPasswordRequest The resetDbaasMysqlUserPasswordRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> resetDbaasMysqlUserPasswordWithHttpInfo(String serviceName, String username, ResetDbaasMysqlUserPasswordRequest resetDbaasMysqlUserPasswordRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetDbaasMysqlUserPasswordRequestCreation(serviceName, username, resetDbaasMysqlUserPasswordRequest).toEntity(localVarReturnType);
    }

    /**
     * Reset the credentials of a DBaaS mysql user
     * If no password is provided one will be generated automatically.
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @param resetDbaasMysqlUserPasswordRequest The resetDbaasMysqlUserPasswordRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec resetDbaasMysqlUserPasswordWithResponseSpec(String serviceName, String username, ResetDbaasMysqlUserPasswordRequest resetDbaasMysqlUserPasswordRequest) throws WebClientResponseException {
        return resetDbaasMysqlUserPasswordRequestCreation(serviceName, username, resetDbaasMysqlUserPasswordRequest);
    }
    /**
     * Reset the credentials of a DBaaS OpenSearch user
     * If no password is provided one will be generated automatically.
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @param resetDbaasOpensearchUserPasswordRequest The resetDbaasOpensearchUserPasswordRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec resetDbaasOpensearchUserPasswordRequestCreation(String serviceName, String username, ResetDbaasOpensearchUserPasswordRequest resetDbaasOpensearchUserPasswordRequest) throws WebClientResponseException {
        Object postBody = resetDbaasOpensearchUserPasswordRequest;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceName' when calling resetDbaasOpensearchUserPassword", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new WebClientResponseException("Missing the required parameter 'username' when calling resetDbaasOpensearchUserPassword", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'resetDbaasOpensearchUserPasswordRequest' is set
        if (resetDbaasOpensearchUserPasswordRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'resetDbaasOpensearchUserPasswordRequest' when calling resetDbaasOpensearchUserPassword", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service-name", serviceName);
        pathParams.put("username", username);

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
        return apiClient.invokeAPI("/dbaas-opensearch/{service-name}/user/{username}/password/reset", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Reset the credentials of a DBaaS OpenSearch user
     * If no password is provided one will be generated automatically.
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @param resetDbaasOpensearchUserPasswordRequest The resetDbaasOpensearchUserPasswordRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> resetDbaasOpensearchUserPassword(String serviceName, String username, ResetDbaasOpensearchUserPasswordRequest resetDbaasOpensearchUserPasswordRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetDbaasOpensearchUserPasswordRequestCreation(serviceName, username, resetDbaasOpensearchUserPasswordRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Reset the credentials of a DBaaS OpenSearch user
     * If no password is provided one will be generated automatically.
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @param resetDbaasOpensearchUserPasswordRequest The resetDbaasOpensearchUserPasswordRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> resetDbaasOpensearchUserPasswordWithHttpInfo(String serviceName, String username, ResetDbaasOpensearchUserPasswordRequest resetDbaasOpensearchUserPasswordRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetDbaasOpensearchUserPasswordRequestCreation(serviceName, username, resetDbaasOpensearchUserPasswordRequest).toEntity(localVarReturnType);
    }

    /**
     * Reset the credentials of a DBaaS OpenSearch user
     * If no password is provided one will be generated automatically.
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @param resetDbaasOpensearchUserPasswordRequest The resetDbaasOpensearchUserPasswordRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec resetDbaasOpensearchUserPasswordWithResponseSpec(String serviceName, String username, ResetDbaasOpensearchUserPasswordRequest resetDbaasOpensearchUserPasswordRequest) throws WebClientResponseException {
        return resetDbaasOpensearchUserPasswordRequestCreation(serviceName, username, resetDbaasOpensearchUserPasswordRequest);
    }
    /**
     * Reset the credentials of a DBaaS Postgres user
     * If no password is provided one will be generated automatically.
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @param resetDbaasOpensearchUserPasswordRequest The resetDbaasOpensearchUserPasswordRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec resetDbaasPostgresUserPasswordRequestCreation(String serviceName, String username, ResetDbaasOpensearchUserPasswordRequest resetDbaasOpensearchUserPasswordRequest) throws WebClientResponseException {
        Object postBody = resetDbaasOpensearchUserPasswordRequest;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceName' when calling resetDbaasPostgresUserPassword", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new WebClientResponseException("Missing the required parameter 'username' when calling resetDbaasPostgresUserPassword", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'resetDbaasOpensearchUserPasswordRequest' is set
        if (resetDbaasOpensearchUserPasswordRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'resetDbaasOpensearchUserPasswordRequest' when calling resetDbaasPostgresUserPassword", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service-name", serviceName);
        pathParams.put("username", username);

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
        return apiClient.invokeAPI("/dbaas-postgres/{service-name}/user/{username}/password/reset", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Reset the credentials of a DBaaS Postgres user
     * If no password is provided one will be generated automatically.
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @param resetDbaasOpensearchUserPasswordRequest The resetDbaasOpensearchUserPasswordRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> resetDbaasPostgresUserPassword(String serviceName, String username, ResetDbaasOpensearchUserPasswordRequest resetDbaasOpensearchUserPasswordRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetDbaasPostgresUserPasswordRequestCreation(serviceName, username, resetDbaasOpensearchUserPasswordRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Reset the credentials of a DBaaS Postgres user
     * If no password is provided one will be generated automatically.
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @param resetDbaasOpensearchUserPasswordRequest The resetDbaasOpensearchUserPasswordRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> resetDbaasPostgresUserPasswordWithHttpInfo(String serviceName, String username, ResetDbaasOpensearchUserPasswordRequest resetDbaasOpensearchUserPasswordRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return resetDbaasPostgresUserPasswordRequestCreation(serviceName, username, resetDbaasOpensearchUserPasswordRequest).toEntity(localVarReturnType);
    }

    /**
     * Reset the credentials of a DBaaS Postgres user
     * If no password is provided one will be generated automatically.
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @param resetDbaasOpensearchUserPasswordRequest The resetDbaasOpensearchUserPasswordRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec resetDbaasPostgresUserPasswordWithResponseSpec(String serviceName, String username, ResetDbaasOpensearchUserPasswordRequest resetDbaasOpensearchUserPasswordRequest) throws WebClientResponseException {
        return resetDbaasPostgresUserPasswordRequestCreation(serviceName, username, resetDbaasOpensearchUserPasswordRequest);
    }
    /**
     * Initiate Grafana maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec startDbaasGrafanaMaintenanceRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling startDbaasGrafanaMaintenance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/dbaas-grafana/{name}/maintenance/start", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Initiate Grafana maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> startDbaasGrafanaMaintenance(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return startDbaasGrafanaMaintenanceRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Initiate Grafana maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> startDbaasGrafanaMaintenanceWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return startDbaasGrafanaMaintenanceRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Initiate Grafana maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec startDbaasGrafanaMaintenanceWithResponseSpec(String name) throws WebClientResponseException {
        return startDbaasGrafanaMaintenanceRequestCreation(name);
    }
    /**
     * Initiate Kafka maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec startDbaasKafkaMaintenanceRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling startDbaasKafkaMaintenance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/dbaas-kafka/{name}/maintenance/start", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Initiate Kafka maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> startDbaasKafkaMaintenance(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return startDbaasKafkaMaintenanceRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Initiate Kafka maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> startDbaasKafkaMaintenanceWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return startDbaasKafkaMaintenanceRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Initiate Kafka maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec startDbaasKafkaMaintenanceWithResponseSpec(String name) throws WebClientResponseException {
        return startDbaasKafkaMaintenanceRequestCreation(name);
    }
    /**
     * Initiate MySQL maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec startDbaasMysqlMaintenanceRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling startDbaasMysqlMaintenance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/dbaas-mysql/{name}/maintenance/start", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Initiate MySQL maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> startDbaasMysqlMaintenance(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return startDbaasMysqlMaintenanceRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Initiate MySQL maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> startDbaasMysqlMaintenanceWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return startDbaasMysqlMaintenanceRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Initiate MySQL maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec startDbaasMysqlMaintenanceWithResponseSpec(String name) throws WebClientResponseException {
        return startDbaasMysqlMaintenanceRequestCreation(name);
    }
    /**
     * Initiate OpenSearch maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec startDbaasOpensearchMaintenanceRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling startDbaasOpensearchMaintenance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/dbaas-opensearch/{name}/maintenance/start", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Initiate OpenSearch maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> startDbaasOpensearchMaintenance(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return startDbaasOpensearchMaintenanceRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Initiate OpenSearch maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> startDbaasOpensearchMaintenanceWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return startDbaasOpensearchMaintenanceRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Initiate OpenSearch maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec startDbaasOpensearchMaintenanceWithResponseSpec(String name) throws WebClientResponseException {
        return startDbaasOpensearchMaintenanceRequestCreation(name);
    }
    /**
     * Initiate PostgreSQL maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec startDbaasPgMaintenanceRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling startDbaasPgMaintenance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/dbaas-postgres/{name}/maintenance/start", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Initiate PostgreSQL maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> startDbaasPgMaintenance(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return startDbaasPgMaintenanceRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Initiate PostgreSQL maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> startDbaasPgMaintenanceWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return startDbaasPgMaintenanceRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Initiate PostgreSQL maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec startDbaasPgMaintenanceWithResponseSpec(String name) throws WebClientResponseException {
        return startDbaasPgMaintenanceRequestCreation(name);
    }
    /**
     * Initiate Redis maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec startDbaasRedisMaintenanceRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling startDbaasRedisMaintenance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/dbaas-redis/{name}/maintenance/start", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Initiate Redis maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> startDbaasRedisMaintenance(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return startDbaasRedisMaintenanceRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Initiate Redis maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> startDbaasRedisMaintenanceWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return startDbaasRedisMaintenanceRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Initiate Redis maintenance update
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec startDbaasRedisMaintenanceWithResponseSpec(String name) throws WebClientResponseException {
        return startDbaasRedisMaintenanceRequestCreation(name);
    }
    /**
     * Stop a DBaaS MySQL migration
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec stopDbaasMysqlMigrationRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling stopDbaasMysqlMigration", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/dbaas-mysql/{name}/migration/stop", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Stop a DBaaS MySQL migration
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> stopDbaasMysqlMigration(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return stopDbaasMysqlMigrationRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Stop a DBaaS MySQL migration
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> stopDbaasMysqlMigrationWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return stopDbaasMysqlMigrationRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Stop a DBaaS MySQL migration
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec stopDbaasMysqlMigrationWithResponseSpec(String name) throws WebClientResponseException {
        return stopDbaasMysqlMigrationRequestCreation(name);
    }
    /**
     * Stop a DBaaS PostgreSQL migration
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec stopDbaasPgMigrationRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling stopDbaasPgMigration", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/dbaas-postgres/{name}/migration/stop", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Stop a DBaaS PostgreSQL migration
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> stopDbaasPgMigration(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return stopDbaasPgMigrationRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Stop a DBaaS PostgreSQL migration
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> stopDbaasPgMigrationWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return stopDbaasPgMigrationRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Stop a DBaaS PostgreSQL migration
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec stopDbaasPgMigrationWithResponseSpec(String name) throws WebClientResponseException {
        return stopDbaasPgMigrationRequestCreation(name);
    }
    /**
     * Stop a DBaaS Redis migration
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec stopDbaasRedisMigrationRequestCreation(String name) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling stopDbaasRedisMigration", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/dbaas-redis/{name}/migration/stop", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Stop a DBaaS Redis migration
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> stopDbaasRedisMigration(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return stopDbaasRedisMigrationRequestCreation(name).bodyToMono(localVarReturnType);
    }

    /**
     * Stop a DBaaS Redis migration
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> stopDbaasRedisMigrationWithHttpInfo(String name) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return stopDbaasRedisMigrationRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Stop a DBaaS Redis migration
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec stopDbaasRedisMigrationWithResponseSpec(String name) throws WebClientResponseException {
        return stopDbaasRedisMigrationRequestCreation(name);
    }
    /**
     * Update a existing DBaaS integration
     * Update a existing DBaaS integration
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateDbaasIntegrationRequest The updateDbaasIntegrationRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateDbaasIntegrationRequestCreation(UUID id, UpdateDbaasIntegrationRequest updateDbaasIntegrationRequest) throws WebClientResponseException {
        Object postBody = updateDbaasIntegrationRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling updateDbaasIntegration", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updateDbaasIntegrationRequest' is set
        if (updateDbaasIntegrationRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateDbaasIntegrationRequest' when calling updateDbaasIntegration", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/dbaas-integration/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a existing DBaaS integration
     * Update a existing DBaaS integration
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateDbaasIntegrationRequest The updateDbaasIntegrationRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updateDbaasIntegration(UUID id, UpdateDbaasIntegrationRequest updateDbaasIntegrationRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateDbaasIntegrationRequestCreation(id, updateDbaasIntegrationRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update a existing DBaaS integration
     * Update a existing DBaaS integration
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateDbaasIntegrationRequest The updateDbaasIntegrationRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updateDbaasIntegrationWithHttpInfo(UUID id, UpdateDbaasIntegrationRequest updateDbaasIntegrationRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateDbaasIntegrationRequestCreation(id, updateDbaasIntegrationRequest).toEntity(localVarReturnType);
    }

    /**
     * Update a existing DBaaS integration
     * Update a existing DBaaS integration
     * <p><b>200</b> - 200
     * @param id The id parameter
     * @param updateDbaasIntegrationRequest The updateDbaasIntegrationRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateDbaasIntegrationWithResponseSpec(UUID id, UpdateDbaasIntegrationRequest updateDbaasIntegrationRequest) throws WebClientResponseException {
        return updateDbaasIntegrationRequestCreation(id, updateDbaasIntegrationRequest);
    }
    /**
     * Create a DBaaS OpenSearch ACL configuration
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param dbaasOpensearchAclConfig The dbaasOpensearchAclConfig parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateDbaasOpensearchAclConfigRequestCreation(String name, DbaasOpensearchAclConfig dbaasOpensearchAclConfig) throws WebClientResponseException {
        Object postBody = dbaasOpensearchAclConfig;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling updateDbaasOpensearchAclConfig", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'dbaasOpensearchAclConfig' is set
        if (dbaasOpensearchAclConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'dbaasOpensearchAclConfig' when calling updateDbaasOpensearchAclConfig", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI("/dbaas-opensearch/{name}/acl-config", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a DBaaS OpenSearch ACL configuration
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param dbaasOpensearchAclConfig The dbaasOpensearchAclConfig parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updateDbaasOpensearchAclConfig(String name, DbaasOpensearchAclConfig dbaasOpensearchAclConfig) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateDbaasOpensearchAclConfigRequestCreation(name, dbaasOpensearchAclConfig).bodyToMono(localVarReturnType);
    }

    /**
     * Create a DBaaS OpenSearch ACL configuration
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param dbaasOpensearchAclConfig The dbaasOpensearchAclConfig parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updateDbaasOpensearchAclConfigWithHttpInfo(String name, DbaasOpensearchAclConfig dbaasOpensearchAclConfig) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateDbaasOpensearchAclConfigRequestCreation(name, dbaasOpensearchAclConfig).toEntity(localVarReturnType);
    }

    /**
     * Create a DBaaS OpenSearch ACL configuration
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param dbaasOpensearchAclConfig The dbaasOpensearchAclConfig parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateDbaasOpensearchAclConfigWithResponseSpec(String name, DbaasOpensearchAclConfig dbaasOpensearchAclConfig) throws WebClientResponseException {
        return updateDbaasOpensearchAclConfigRequestCreation(name, dbaasOpensearchAclConfig);
    }
    /**
     * Update a DBaaS PostgreSQL connection pool
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param connectionPoolName The connectionPoolName parameter
     * @param updateDbaasPgConnectionPoolRequest The updateDbaasPgConnectionPoolRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateDbaasPgConnectionPoolRequestCreation(String serviceName, String connectionPoolName, UpdateDbaasPgConnectionPoolRequest updateDbaasPgConnectionPoolRequest) throws WebClientResponseException {
        Object postBody = updateDbaasPgConnectionPoolRequest;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceName' when calling updateDbaasPgConnectionPool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'connectionPoolName' is set
        if (connectionPoolName == null) {
            throw new WebClientResponseException("Missing the required parameter 'connectionPoolName' when calling updateDbaasPgConnectionPool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updateDbaasPgConnectionPoolRequest' is set
        if (updateDbaasPgConnectionPoolRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateDbaasPgConnectionPoolRequest' when calling updateDbaasPgConnectionPool", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service-name", serviceName);
        pathParams.put("connection-pool-name", connectionPoolName);

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
        return apiClient.invokeAPI("/dbaas-postgres/{service-name}/connection-pool/{connection-pool-name}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a DBaaS PostgreSQL connection pool
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param connectionPoolName The connectionPoolName parameter
     * @param updateDbaasPgConnectionPoolRequest The updateDbaasPgConnectionPoolRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updateDbaasPgConnectionPool(String serviceName, String connectionPoolName, UpdateDbaasPgConnectionPoolRequest updateDbaasPgConnectionPoolRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateDbaasPgConnectionPoolRequestCreation(serviceName, connectionPoolName, updateDbaasPgConnectionPoolRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update a DBaaS PostgreSQL connection pool
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param connectionPoolName The connectionPoolName parameter
     * @param updateDbaasPgConnectionPoolRequest The updateDbaasPgConnectionPoolRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updateDbaasPgConnectionPoolWithHttpInfo(String serviceName, String connectionPoolName, UpdateDbaasPgConnectionPoolRequest updateDbaasPgConnectionPoolRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateDbaasPgConnectionPoolRequestCreation(serviceName, connectionPoolName, updateDbaasPgConnectionPoolRequest).toEntity(localVarReturnType);
    }

    /**
     * Update a DBaaS PostgreSQL connection pool
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param connectionPoolName The connectionPoolName parameter
     * @param updateDbaasPgConnectionPoolRequest The updateDbaasPgConnectionPoolRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateDbaasPgConnectionPoolWithResponseSpec(String serviceName, String connectionPoolName, UpdateDbaasPgConnectionPoolRequest updateDbaasPgConnectionPoolRequest) throws WebClientResponseException {
        return updateDbaasPgConnectionPoolRequestCreation(serviceName, connectionPoolName, updateDbaasPgConnectionPoolRequest);
    }
    /**
     * Update access control for one service user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @param updateDbaasPostgresAllowReplicationRequest The updateDbaasPostgresAllowReplicationRequest parameter
     * @return DbaasPostgresUsers
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateDbaasPostgresAllowReplicationRequestCreation(String serviceName, String username, UpdateDbaasPostgresAllowReplicationRequest updateDbaasPostgresAllowReplicationRequest) throws WebClientResponseException {
        Object postBody = updateDbaasPostgresAllowReplicationRequest;
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new WebClientResponseException("Missing the required parameter 'serviceName' when calling updateDbaasPostgresAllowReplication", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new WebClientResponseException("Missing the required parameter 'username' when calling updateDbaasPostgresAllowReplication", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updateDbaasPostgresAllowReplicationRequest' is set
        if (updateDbaasPostgresAllowReplicationRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateDbaasPostgresAllowReplicationRequest' when calling updateDbaasPostgresAllowReplication", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("service-name", serviceName);
        pathParams.put("username", username);

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

        ParameterizedTypeReference<DbaasPostgresUsers> localVarReturnType = new ParameterizedTypeReference<DbaasPostgresUsers>() {};
        return apiClient.invokeAPI("/dbaas-postgres/{service-name}/user/{username}/allow-replication", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update access control for one service user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @param updateDbaasPostgresAllowReplicationRequest The updateDbaasPostgresAllowReplicationRequest parameter
     * @return DbaasPostgresUsers
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DbaasPostgresUsers> updateDbaasPostgresAllowReplication(String serviceName, String username, UpdateDbaasPostgresAllowReplicationRequest updateDbaasPostgresAllowReplicationRequest) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasPostgresUsers> localVarReturnType = new ParameterizedTypeReference<DbaasPostgresUsers>() {};
        return updateDbaasPostgresAllowReplicationRequestCreation(serviceName, username, updateDbaasPostgresAllowReplicationRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update access control for one service user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @param updateDbaasPostgresAllowReplicationRequest The updateDbaasPostgresAllowReplicationRequest parameter
     * @return ResponseEntity&lt;DbaasPostgresUsers&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DbaasPostgresUsers>> updateDbaasPostgresAllowReplicationWithHttpInfo(String serviceName, String username, UpdateDbaasPostgresAllowReplicationRequest updateDbaasPostgresAllowReplicationRequest) throws WebClientResponseException {
        ParameterizedTypeReference<DbaasPostgresUsers> localVarReturnType = new ParameterizedTypeReference<DbaasPostgresUsers>() {};
        return updateDbaasPostgresAllowReplicationRequestCreation(serviceName, username, updateDbaasPostgresAllowReplicationRequest).toEntity(localVarReturnType);
    }

    /**
     * Update access control for one service user
     * 
     * <p><b>200</b> - 200
     * @param serviceName The serviceName parameter
     * @param username The username parameter
     * @param updateDbaasPostgresAllowReplicationRequest The updateDbaasPostgresAllowReplicationRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateDbaasPostgresAllowReplicationWithResponseSpec(String serviceName, String username, UpdateDbaasPostgresAllowReplicationRequest updateDbaasPostgresAllowReplicationRequest) throws WebClientResponseException {
        return updateDbaasPostgresAllowReplicationRequestCreation(serviceName, username, updateDbaasPostgresAllowReplicationRequest);
    }
    /**
     * Update a DBaaS Grafana service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param updateDbaasServiceGrafanaRequest The updateDbaasServiceGrafanaRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateDbaasServiceGrafanaRequestCreation(String name, UpdateDbaasServiceGrafanaRequest updateDbaasServiceGrafanaRequest) throws WebClientResponseException {
        Object postBody = updateDbaasServiceGrafanaRequest;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling updateDbaasServiceGrafana", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updateDbaasServiceGrafanaRequest' is set
        if (updateDbaasServiceGrafanaRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateDbaasServiceGrafanaRequest' when calling updateDbaasServiceGrafana", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI("/dbaas-grafana/{name}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a DBaaS Grafana service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param updateDbaasServiceGrafanaRequest The updateDbaasServiceGrafanaRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updateDbaasServiceGrafana(String name, UpdateDbaasServiceGrafanaRequest updateDbaasServiceGrafanaRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateDbaasServiceGrafanaRequestCreation(name, updateDbaasServiceGrafanaRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update a DBaaS Grafana service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param updateDbaasServiceGrafanaRequest The updateDbaasServiceGrafanaRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updateDbaasServiceGrafanaWithHttpInfo(String name, UpdateDbaasServiceGrafanaRequest updateDbaasServiceGrafanaRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateDbaasServiceGrafanaRequestCreation(name, updateDbaasServiceGrafanaRequest).toEntity(localVarReturnType);
    }

    /**
     * Update a DBaaS Grafana service
     * 
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param updateDbaasServiceGrafanaRequest The updateDbaasServiceGrafanaRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateDbaasServiceGrafanaWithResponseSpec(String name, UpdateDbaasServiceGrafanaRequest updateDbaasServiceGrafanaRequest) throws WebClientResponseException {
        return updateDbaasServiceGrafanaRequestCreation(name, updateDbaasServiceGrafanaRequest);
    }
    /**
     * Update a DBaaS Kafka service
     * Update a DBaaS Kafka service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param updateDbaasServiceKafkaRequest The updateDbaasServiceKafkaRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateDbaasServiceKafkaRequestCreation(String name, UpdateDbaasServiceKafkaRequest updateDbaasServiceKafkaRequest) throws WebClientResponseException {
        Object postBody = updateDbaasServiceKafkaRequest;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling updateDbaasServiceKafka", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updateDbaasServiceKafkaRequest' is set
        if (updateDbaasServiceKafkaRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateDbaasServiceKafkaRequest' when calling updateDbaasServiceKafka", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI("/dbaas-kafka/{name}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a DBaaS Kafka service
     * Update a DBaaS Kafka service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param updateDbaasServiceKafkaRequest The updateDbaasServiceKafkaRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updateDbaasServiceKafka(String name, UpdateDbaasServiceKafkaRequest updateDbaasServiceKafkaRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateDbaasServiceKafkaRequestCreation(name, updateDbaasServiceKafkaRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update a DBaaS Kafka service
     * Update a DBaaS Kafka service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param updateDbaasServiceKafkaRequest The updateDbaasServiceKafkaRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updateDbaasServiceKafkaWithHttpInfo(String name, UpdateDbaasServiceKafkaRequest updateDbaasServiceKafkaRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateDbaasServiceKafkaRequestCreation(name, updateDbaasServiceKafkaRequest).toEntity(localVarReturnType);
    }

    /**
     * Update a DBaaS Kafka service
     * Update a DBaaS Kafka service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param updateDbaasServiceKafkaRequest The updateDbaasServiceKafkaRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateDbaasServiceKafkaWithResponseSpec(String name, UpdateDbaasServiceKafkaRequest updateDbaasServiceKafkaRequest) throws WebClientResponseException {
        return updateDbaasServiceKafkaRequestCreation(name, updateDbaasServiceKafkaRequest);
    }
    /**
     * Update a DBaaS MySQL service
     * Update a DBaaS MySQL service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param updateDbaasServiceMysqlRequest The updateDbaasServiceMysqlRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateDbaasServiceMysqlRequestCreation(String name, UpdateDbaasServiceMysqlRequest updateDbaasServiceMysqlRequest) throws WebClientResponseException {
        Object postBody = updateDbaasServiceMysqlRequest;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling updateDbaasServiceMysql", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updateDbaasServiceMysqlRequest' is set
        if (updateDbaasServiceMysqlRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateDbaasServiceMysqlRequest' when calling updateDbaasServiceMysql", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI("/dbaas-mysql/{name}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a DBaaS MySQL service
     * Update a DBaaS MySQL service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param updateDbaasServiceMysqlRequest The updateDbaasServiceMysqlRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updateDbaasServiceMysql(String name, UpdateDbaasServiceMysqlRequest updateDbaasServiceMysqlRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateDbaasServiceMysqlRequestCreation(name, updateDbaasServiceMysqlRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update a DBaaS MySQL service
     * Update a DBaaS MySQL service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param updateDbaasServiceMysqlRequest The updateDbaasServiceMysqlRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updateDbaasServiceMysqlWithHttpInfo(String name, UpdateDbaasServiceMysqlRequest updateDbaasServiceMysqlRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateDbaasServiceMysqlRequestCreation(name, updateDbaasServiceMysqlRequest).toEntity(localVarReturnType);
    }

    /**
     * Update a DBaaS MySQL service
     * Update a DBaaS MySQL service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param updateDbaasServiceMysqlRequest The updateDbaasServiceMysqlRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateDbaasServiceMysqlWithResponseSpec(String name, UpdateDbaasServiceMysqlRequest updateDbaasServiceMysqlRequest) throws WebClientResponseException {
        return updateDbaasServiceMysqlRequestCreation(name, updateDbaasServiceMysqlRequest);
    }
    /**
     * Update a DBaaS OpenSearch service
     * Update a DBaaS OpenSearch service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param updateDbaasServiceOpensearchRequest The updateDbaasServiceOpensearchRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateDbaasServiceOpensearchRequestCreation(String name, UpdateDbaasServiceOpensearchRequest updateDbaasServiceOpensearchRequest) throws WebClientResponseException {
        Object postBody = updateDbaasServiceOpensearchRequest;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling updateDbaasServiceOpensearch", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updateDbaasServiceOpensearchRequest' is set
        if (updateDbaasServiceOpensearchRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateDbaasServiceOpensearchRequest' when calling updateDbaasServiceOpensearch", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI("/dbaas-opensearch/{name}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a DBaaS OpenSearch service
     * Update a DBaaS OpenSearch service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param updateDbaasServiceOpensearchRequest The updateDbaasServiceOpensearchRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updateDbaasServiceOpensearch(String name, UpdateDbaasServiceOpensearchRequest updateDbaasServiceOpensearchRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateDbaasServiceOpensearchRequestCreation(name, updateDbaasServiceOpensearchRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update a DBaaS OpenSearch service
     * Update a DBaaS OpenSearch service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param updateDbaasServiceOpensearchRequest The updateDbaasServiceOpensearchRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updateDbaasServiceOpensearchWithHttpInfo(String name, UpdateDbaasServiceOpensearchRequest updateDbaasServiceOpensearchRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateDbaasServiceOpensearchRequestCreation(name, updateDbaasServiceOpensearchRequest).toEntity(localVarReturnType);
    }

    /**
     * Update a DBaaS OpenSearch service
     * Update a DBaaS OpenSearch service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param updateDbaasServiceOpensearchRequest The updateDbaasServiceOpensearchRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateDbaasServiceOpensearchWithResponseSpec(String name, UpdateDbaasServiceOpensearchRequest updateDbaasServiceOpensearchRequest) throws WebClientResponseException {
        return updateDbaasServiceOpensearchRequestCreation(name, updateDbaasServiceOpensearchRequest);
    }
    /**
     * Update a DBaaS PostgreSQL service
     * Update a DBaaS PostgreSQL service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param updateDbaasServicePgRequest The updateDbaasServicePgRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateDbaasServicePgRequestCreation(String name, UpdateDbaasServicePgRequest updateDbaasServicePgRequest) throws WebClientResponseException {
        Object postBody = updateDbaasServicePgRequest;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling updateDbaasServicePg", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updateDbaasServicePgRequest' is set
        if (updateDbaasServicePgRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateDbaasServicePgRequest' when calling updateDbaasServicePg", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI("/dbaas-postgres/{name}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a DBaaS PostgreSQL service
     * Update a DBaaS PostgreSQL service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param updateDbaasServicePgRequest The updateDbaasServicePgRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updateDbaasServicePg(String name, UpdateDbaasServicePgRequest updateDbaasServicePgRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateDbaasServicePgRequestCreation(name, updateDbaasServicePgRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update a DBaaS PostgreSQL service
     * Update a DBaaS PostgreSQL service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param updateDbaasServicePgRequest The updateDbaasServicePgRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updateDbaasServicePgWithHttpInfo(String name, UpdateDbaasServicePgRequest updateDbaasServicePgRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateDbaasServicePgRequestCreation(name, updateDbaasServicePgRequest).toEntity(localVarReturnType);
    }

    /**
     * Update a DBaaS PostgreSQL service
     * Update a DBaaS PostgreSQL service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param updateDbaasServicePgRequest The updateDbaasServicePgRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateDbaasServicePgWithResponseSpec(String name, UpdateDbaasServicePgRequest updateDbaasServicePgRequest) throws WebClientResponseException {
        return updateDbaasServicePgRequestCreation(name, updateDbaasServicePgRequest);
    }
    /**
     * Update a DBaaS Redis service
     * Update a DBaaS Redis service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param updateDbaasServiceRedisRequest The updateDbaasServiceRedisRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateDbaasServiceRedisRequestCreation(String name, UpdateDbaasServiceRedisRequest updateDbaasServiceRedisRequest) throws WebClientResponseException {
        Object postBody = updateDbaasServiceRedisRequest;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new WebClientResponseException("Missing the required parameter 'name' when calling updateDbaasServiceRedis", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updateDbaasServiceRedisRequest' is set
        if (updateDbaasServiceRedisRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateDbaasServiceRedisRequest' when calling updateDbaasServiceRedis", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return apiClient.invokeAPI("/dbaas-redis/{name}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a DBaaS Redis service
     * Update a DBaaS Redis service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param updateDbaasServiceRedisRequest The updateDbaasServiceRedisRequest parameter
     * @return Operation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Operation> updateDbaasServiceRedis(String name, UpdateDbaasServiceRedisRequest updateDbaasServiceRedisRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateDbaasServiceRedisRequestCreation(name, updateDbaasServiceRedisRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update a DBaaS Redis service
     * Update a DBaaS Redis service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param updateDbaasServiceRedisRequest The updateDbaasServiceRedisRequest parameter
     * @return ResponseEntity&lt;Operation&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Operation>> updateDbaasServiceRedisWithHttpInfo(String name, UpdateDbaasServiceRedisRequest updateDbaasServiceRedisRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Operation> localVarReturnType = new ParameterizedTypeReference<Operation>() {};
        return updateDbaasServiceRedisRequestCreation(name, updateDbaasServiceRedisRequest).toEntity(localVarReturnType);
    }

    /**
     * Update a DBaaS Redis service
     * Update a DBaaS Redis service
     * <p><b>200</b> - 200
     * @param name The name parameter
     * @param updateDbaasServiceRedisRequest The updateDbaasServiceRedisRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateDbaasServiceRedisWithResponseSpec(String name, UpdateDbaasServiceRedisRequest updateDbaasServiceRedisRequest) throws WebClientResponseException {
        return updateDbaasServiceRedisRequestCreation(name, updateDbaasServiceRedisRequest);
    }
}
