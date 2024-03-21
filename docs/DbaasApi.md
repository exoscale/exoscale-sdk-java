# DbaasApi

All URIs are relative to *https://api-{zone}.exoscale.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDbaasIntegration**](DbaasApi.md#createDbaasIntegration) | **POST** /dbaas-integration | Create a new DBaaS integration between two services
[**createDbaasKafkaSchemaRegistryAclConfig**](DbaasApi.md#createDbaasKafkaSchemaRegistryAclConfig) | **POST** /dbaas-kafka/{name}/schema-registry/acl-config | Add a Kafka Schema Registry ACL entry
[**createDbaasKafkaTopicAclConfig**](DbaasApi.md#createDbaasKafkaTopicAclConfig) | **POST** /dbaas-kafka/{name}/topic/acl-config | Add a Kafka topic ACL entry
[**createDbaasKafkaUser**](DbaasApi.md#createDbaasKafkaUser) | **POST** /dbaas-kafka/{service-name}/user | Create a DBaaS Kafka user
[**createDbaasMysqlDatabase**](DbaasApi.md#createDbaasMysqlDatabase) | **POST** /dbaas-mysql/{service-name}/database | Create a DBaaS MySQL database
[**createDbaasMysqlUser**](DbaasApi.md#createDbaasMysqlUser) | **POST** /dbaas-mysql/{service-name}/user | Create a DBaaS MySQL user
[**createDbaasOpensearchUser**](DbaasApi.md#createDbaasOpensearchUser) | **POST** /dbaas-opensearch/{service-name}/user | Create a DBaaS OpenSearch user
[**createDbaasPgConnectionPool**](DbaasApi.md#createDbaasPgConnectionPool) | **POST** /dbaas-postgres/{service-name}/connection-pool | Create a DBaaS PostgreSQL connection pool
[**createDbaasPgDatabase**](DbaasApi.md#createDbaasPgDatabase) | **POST** /dbaas-postgres/{service-name}/database | Create a DBaaS Postgres database
[**createDbaasPgUpgradeCheck**](DbaasApi.md#createDbaasPgUpgradeCheck) | **POST** /dbaas-postgres/{service}/upgrade-check | 
[**createDbaasPostgresUser**](DbaasApi.md#createDbaasPostgresUser) | **POST** /dbaas-postgres/{service-name}/user | Create a DBaaS Postgres user
[**createDbaasServiceGrafana**](DbaasApi.md#createDbaasServiceGrafana) | **POST** /dbaas-grafana/{name} | 
[**createDbaasServiceKafka**](DbaasApi.md#createDbaasServiceKafka) | **POST** /dbaas-kafka/{name} | Create a DBaaS Kafka service
[**createDbaasServiceMysql**](DbaasApi.md#createDbaasServiceMysql) | **POST** /dbaas-mysql/{name} | Create a DBaaS MySQL service
[**createDbaasServiceOpensearch**](DbaasApi.md#createDbaasServiceOpensearch) | **POST** /dbaas-opensearch/{name} | Create a DBaaS OpenSearch service
[**createDbaasServicePg**](DbaasApi.md#createDbaasServicePg) | **POST** /dbaas-postgres/{name} | Create a DBaaS PostgreSQL service
[**createDbaasServiceRedis**](DbaasApi.md#createDbaasServiceRedis) | **POST** /dbaas-redis/{name} | Create a DBaaS Redis service
[**createDbaasTaskMigrationCheck**](DbaasApi.md#createDbaasTaskMigrationCheck) | **POST** /dbaas-task-migration-check/{service} | 
[**deleteDbaasIntegration**](DbaasApi.md#deleteDbaasIntegration) | **DELETE** /dbaas-integration/{id} | Delete a DBaaS Integration
[**deleteDbaasKafkaSchemaRegistryAclConfig**](DbaasApi.md#deleteDbaasKafkaSchemaRegistryAclConfig) | **DELETE** /dbaas-kafka/{name}/schema-registry/acl-config/{acl-id} | Delete a Kafka ACL entry
[**deleteDbaasKafkaTopicAclConfig**](DbaasApi.md#deleteDbaasKafkaTopicAclConfig) | **DELETE** /dbaas-kafka/{name}/topic/acl-config/{acl-id} | Delete a Kafka ACL entry
[**deleteDbaasKafkaUser**](DbaasApi.md#deleteDbaasKafkaUser) | **DELETE** /dbaas-kafka/{service-name}/user/{username} | Delete a DBaaS kafka user
[**deleteDbaasMysqlDatabase**](DbaasApi.md#deleteDbaasMysqlDatabase) | **DELETE** /dbaas-mysql/{service-name}/database/{database-name} | Delete a DBaaS MySQL database
[**deleteDbaasMysqlUser**](DbaasApi.md#deleteDbaasMysqlUser) | **DELETE** /dbaas-mysql/{service-name}/user/{username} | Delete a DBaaS MySQL user
[**deleteDbaasOpensearchUser**](DbaasApi.md#deleteDbaasOpensearchUser) | **DELETE** /dbaas-opensearch/{service-name}/user/{username} | Delete a DBaaS OpenSearch user
[**deleteDbaasPgConnectionPool**](DbaasApi.md#deleteDbaasPgConnectionPool) | **DELETE** /dbaas-postgres/{service-name}/connection-pool/{connection-pool-name} | Delete a DBaaS PostgreSQL connection pool
[**deleteDbaasPgDatabase**](DbaasApi.md#deleteDbaasPgDatabase) | **DELETE** /dbaas-postgres/{service-name}/database/{database-name} | Delete a DBaaS Postgres database
[**deleteDbaasPostgresUser**](DbaasApi.md#deleteDbaasPostgresUser) | **DELETE** /dbaas-postgres/{service-name}/user/{username} | Delete a DBaaS Postgres user
[**deleteDbaasService**](DbaasApi.md#deleteDbaasService) | **DELETE** /dbaas-service/{name} | Delete a DBaaS service
[**deleteDbaasServiceGrafana**](DbaasApi.md#deleteDbaasServiceGrafana) | **DELETE** /dbaas-grafana/{name} | Delete a Grafana service
[**deleteDbaasServiceKafka**](DbaasApi.md#deleteDbaasServiceKafka) | **DELETE** /dbaas-kafka/{name} | Delete a Kafka service
[**deleteDbaasServiceMysql**](DbaasApi.md#deleteDbaasServiceMysql) | **DELETE** /dbaas-mysql/{name} | Delete a MySQL service
[**deleteDbaasServiceOpensearch**](DbaasApi.md#deleteDbaasServiceOpensearch) | **DELETE** /dbaas-opensearch/{name} | Delete a OpenSearch service
[**deleteDbaasServicePg**](DbaasApi.md#deleteDbaasServicePg) | **DELETE** /dbaas-postgres/{name} | Delete a Postgres service
[**deleteDbaasServiceRedis**](DbaasApi.md#deleteDbaasServiceRedis) | **DELETE** /dbaas-redis/{name} | Delete a Redis service
[**getDbaasCaCertificate**](DbaasApi.md#getDbaasCaCertificate) | **GET** /dbaas-ca-certificate | Get DBaaS CA Certificate
[**getDbaasIntegration**](DbaasApi.md#getDbaasIntegration) | **GET** /dbaas-integration/{id} | Get a DBaaS Integration
[**getDbaasKafkaAclConfig**](DbaasApi.md#getDbaasKafkaAclConfig) | **GET** /dbaas-kafka/{name}/acl-config | Get DBaaS kafka ACL configuration
[**getDbaasMigrationStatus**](DbaasApi.md#getDbaasMigrationStatus) | **GET** /dbaas-migration-status/{name} | Get a DBaaS migration status
[**getDbaasOpensearchAclConfig**](DbaasApi.md#getDbaasOpensearchAclConfig) | **GET** /dbaas-opensearch/{name}/acl-config | Get DBaaS OpenSearch ACL configuration
[**getDbaasServiceGrafana**](DbaasApi.md#getDbaasServiceGrafana) | **GET** /dbaas-grafana/{name} | Get a DBaaS Grafana service
[**getDbaasServiceKafka**](DbaasApi.md#getDbaasServiceKafka) | **GET** /dbaas-kafka/{name} | Get a DBaaS Kafka service
[**getDbaasServiceLogs**](DbaasApi.md#getDbaasServiceLogs) | **POST** /dbaas-service-logs/{service-name} | Get logs of DBaaS service
[**getDbaasServiceMetrics**](DbaasApi.md#getDbaasServiceMetrics) | **POST** /dbaas-service-metrics/{service-name} | Get metrics of DBaaS service
[**getDbaasServiceMysql**](DbaasApi.md#getDbaasServiceMysql) | **GET** /dbaas-mysql/{name} | Get a DBaaS MySQL service
[**getDbaasServiceOpensearch**](DbaasApi.md#getDbaasServiceOpensearch) | **GET** /dbaas-opensearch/{name} | Get a DBaaS OpenSearch service
[**getDbaasServicePg**](DbaasApi.md#getDbaasServicePg) | **GET** /dbaas-postgres/{name} | Get a DBaaS PostgreSQL service
[**getDbaasServiceRedis**](DbaasApi.md#getDbaasServiceRedis) | **GET** /dbaas-redis/{name} | Get a DBaaS Redis service
[**getDbaasServiceType**](DbaasApi.md#getDbaasServiceType) | **GET** /dbaas-service-type/{service-type-name} | Get a DBaaS service type
[**getDbaasSettingsGrafana**](DbaasApi.md#getDbaasSettingsGrafana) | **GET** /dbaas-settings-grafana | Get DBaaS Grafana settings
[**getDbaasSettingsKafka**](DbaasApi.md#getDbaasSettingsKafka) | **GET** /dbaas-settings-kafka | Get DBaaS Kafka settings
[**getDbaasSettingsMysql**](DbaasApi.md#getDbaasSettingsMysql) | **GET** /dbaas-settings-mysql | Get DBaaS MySQL settings
[**getDbaasSettingsOpensearch**](DbaasApi.md#getDbaasSettingsOpensearch) | **GET** /dbaas-settings-opensearch | Get DBaaS OpenSearch settings
[**getDbaasSettingsPg**](DbaasApi.md#getDbaasSettingsPg) | **GET** /dbaas-settings-pg | Get DBaaS PostgreSQL settings
[**getDbaasSettingsRedis**](DbaasApi.md#getDbaasSettingsRedis) | **GET** /dbaas-settings-redis | Get DBaaS Redis settings
[**getDbaasTask**](DbaasApi.md#getDbaasTask) | **GET** /dbaas-task/{service}/{id} | Get a DBaaS task
[**listDbaasIntegrationSettings**](DbaasApi.md#listDbaasIntegrationSettings) | **GET** /dbaas-integration-settings/{integration-type}/{source-type}/{dest-type} | Get DBaaS integration settings
[**listDbaasIntegrationTypes**](DbaasApi.md#listDbaasIntegrationTypes) | **GET** /dbaas-integration-types | Get DBaaS integration types
[**listDbaasServiceTypes**](DbaasApi.md#listDbaasServiceTypes) | **GET** /dbaas-service-type | DBaaS Service Types
[**listDbaasServices**](DbaasApi.md#listDbaasServices) | **GET** /dbaas-service | List DBaaS services
[**resetDbaasKafkaUserPassword**](DbaasApi.md#resetDbaasKafkaUserPassword) | **PUT** /dbaas-kafka/{service-name}/user/{username}/password/reset | Reset the credentials of a DBaaS Kafka user
[**resetDbaasMysqlUserPassword**](DbaasApi.md#resetDbaasMysqlUserPassword) | **PUT** /dbaas-mysql/{service-name}/user/{username}/password/reset | Reset the credentials of a DBaaS mysql user
[**resetDbaasOpensearchUserPassword**](DbaasApi.md#resetDbaasOpensearchUserPassword) | **PUT** /dbaas-opensearch/{service-name}/user/{username}/password/reset | Reset the credentials of a DBaaS OpenSearch user
[**resetDbaasPostgresUserPassword**](DbaasApi.md#resetDbaasPostgresUserPassword) | **PUT** /dbaas-postgres/{service-name}/user/{username}/password/reset | Reset the credentials of a DBaaS Postgres user
[**startDbaasGrafanaMaintenance**](DbaasApi.md#startDbaasGrafanaMaintenance) | **PUT** /dbaas-grafana/{name}/maintenance/start | Initiate Grafana maintenance update
[**startDbaasKafkaMaintenance**](DbaasApi.md#startDbaasKafkaMaintenance) | **PUT** /dbaas-kafka/{name}/maintenance/start | Initiate Kafka maintenance update
[**startDbaasMysqlMaintenance**](DbaasApi.md#startDbaasMysqlMaintenance) | **PUT** /dbaas-mysql/{name}/maintenance/start | Initiate MySQL maintenance update
[**startDbaasOpensearchMaintenance**](DbaasApi.md#startDbaasOpensearchMaintenance) | **PUT** /dbaas-opensearch/{name}/maintenance/start | Initiate OpenSearch maintenance update
[**startDbaasPgMaintenance**](DbaasApi.md#startDbaasPgMaintenance) | **PUT** /dbaas-postgres/{name}/maintenance/start | Initiate PostgreSQL maintenance update
[**startDbaasRedisMaintenance**](DbaasApi.md#startDbaasRedisMaintenance) | **PUT** /dbaas-redis/{name}/maintenance/start | Initiate Redis maintenance update
[**stopDbaasMysqlMigration**](DbaasApi.md#stopDbaasMysqlMigration) | **POST** /dbaas-mysql/{name}/migration/stop | Stop a DBaaS MySQL migration
[**stopDbaasPgMigration**](DbaasApi.md#stopDbaasPgMigration) | **POST** /dbaas-postgres/{name}/migration/stop | Stop a DBaaS PostgreSQL migration
[**stopDbaasRedisMigration**](DbaasApi.md#stopDbaasRedisMigration) | **POST** /dbaas-redis/{name}/migration/stop | Stop a DBaaS Redis migration
[**updateDbaasIntegration**](DbaasApi.md#updateDbaasIntegration) | **PUT** /dbaas-integration/{id} | Update a existing DBaaS integration
[**updateDbaasOpensearchAclConfig**](DbaasApi.md#updateDbaasOpensearchAclConfig) | **PUT** /dbaas-opensearch/{name}/acl-config | Create a DBaaS OpenSearch ACL configuration
[**updateDbaasPgConnectionPool**](DbaasApi.md#updateDbaasPgConnectionPool) | **PUT** /dbaas-postgres/{service-name}/connection-pool/{connection-pool-name} | Update a DBaaS PostgreSQL connection pool
[**updateDbaasPostgresAllowReplication**](DbaasApi.md#updateDbaasPostgresAllowReplication) | **PUT** /dbaas-postgres/{service-name}/user/{username}/allow-replication | Update access control for one service user
[**updateDbaasServiceGrafana**](DbaasApi.md#updateDbaasServiceGrafana) | **PUT** /dbaas-grafana/{name} | Update a DBaaS Grafana service
[**updateDbaasServiceKafka**](DbaasApi.md#updateDbaasServiceKafka) | **PUT** /dbaas-kafka/{name} | Update a DBaaS Kafka service
[**updateDbaasServiceMysql**](DbaasApi.md#updateDbaasServiceMysql) | **PUT** /dbaas-mysql/{name} | Update a DBaaS MySQL service
[**updateDbaasServiceOpensearch**](DbaasApi.md#updateDbaasServiceOpensearch) | **PUT** /dbaas-opensearch/{name} | Update a DBaaS OpenSearch service
[**updateDbaasServicePg**](DbaasApi.md#updateDbaasServicePg) | **PUT** /dbaas-postgres/{name} | Update a DBaaS PostgreSQL service
[**updateDbaasServiceRedis**](DbaasApi.md#updateDbaasServiceRedis) | **PUT** /dbaas-redis/{name} | Update a DBaaS Redis service

<a name="createDbaasIntegration"></a>
# **createDbaasIntegration**
> Operation createDbaasIntegration(body)

Create a new DBaaS integration between two services

Create a new DBaaS integration between two services

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
DbaasintegrationBody body = new DbaasintegrationBody(); // DbaasintegrationBody | 
try {
    Operation result = apiInstance.createDbaasIntegration(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#createDbaasIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DbaasintegrationBody**](DbaasintegrationBody.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDbaasKafkaSchemaRegistryAclConfig"></a>
# **createDbaasKafkaSchemaRegistryAclConfig**
> Operation createDbaasKafkaSchemaRegistryAclConfig(body, name)

Add a Kafka Schema Registry ACL entry

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
DbaasKafkaSchemaRegistryAclEntry body = new DbaasKafkaSchemaRegistryAclEntry(); // DbaasKafkaSchemaRegistryAclEntry | 
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.createDbaasKafkaSchemaRegistryAclConfig(body, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#createDbaasKafkaSchemaRegistryAclConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DbaasKafkaSchemaRegistryAclEntry**](DbaasKafkaSchemaRegistryAclEntry.md)|  |
 **name** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDbaasKafkaTopicAclConfig"></a>
# **createDbaasKafkaTopicAclConfig**
> Operation createDbaasKafkaTopicAclConfig(body, name)

Add a Kafka topic ACL entry

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
DbaasKafkaTopicAclEntry body = new DbaasKafkaTopicAclEntry(); // DbaasKafkaTopicAclEntry | 
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.createDbaasKafkaTopicAclConfig(body, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#createDbaasKafkaTopicAclConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DbaasKafkaTopicAclEntry**](DbaasKafkaTopicAclEntry.md)|  |
 **name** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDbaasKafkaUser"></a>
# **createDbaasKafkaUser**
> Operation createDbaasKafkaUser(body, serviceName)

Create a DBaaS Kafka user

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
ServicenameUserBody2 body = new ServicenameUserBody2(); // ServicenameUserBody2 | 
String serviceName = "serviceName_example"; // String | 
try {
    Operation result = apiInstance.createDbaasKafkaUser(body, serviceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#createDbaasKafkaUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServicenameUserBody2**](ServicenameUserBody2.md)|  |
 **serviceName** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDbaasMysqlDatabase"></a>
# **createDbaasMysqlDatabase**
> Operation createDbaasMysqlDatabase(body, serviceName)

Create a DBaaS MySQL database

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
ServicenameDatabaseBody1 body = new ServicenameDatabaseBody1(); // ServicenameDatabaseBody1 | 
String serviceName = "serviceName_example"; // String | 
try {
    Operation result = apiInstance.createDbaasMysqlDatabase(body, serviceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#createDbaasMysqlDatabase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServicenameDatabaseBody1**](ServicenameDatabaseBody1.md)|  |
 **serviceName** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDbaasMysqlUser"></a>
# **createDbaasMysqlUser**
> Operation createDbaasMysqlUser(body, serviceName)

Create a DBaaS MySQL user

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
ServicenameUserBody body = new ServicenameUserBody(); // ServicenameUserBody | 
String serviceName = "serviceName_example"; // String | 
try {
    Operation result = apiInstance.createDbaasMysqlUser(body, serviceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#createDbaasMysqlUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServicenameUserBody**](ServicenameUserBody.md)|  |
 **serviceName** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDbaasOpensearchUser"></a>
# **createDbaasOpensearchUser**
> Operation createDbaasOpensearchUser(body, serviceName)

Create a DBaaS OpenSearch user

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
ServicenameUserBody3 body = new ServicenameUserBody3(); // ServicenameUserBody3 | 
String serviceName = "serviceName_example"; // String | 
try {
    Operation result = apiInstance.createDbaasOpensearchUser(body, serviceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#createDbaasOpensearchUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServicenameUserBody3**](ServicenameUserBody3.md)|  |
 **serviceName** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDbaasPgConnectionPool"></a>
# **createDbaasPgConnectionPool**
> Operation createDbaasPgConnectionPool(body, serviceName)

Create a DBaaS PostgreSQL connection pool

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
ServicenameConnectionpoolBody body = new ServicenameConnectionpoolBody(); // ServicenameConnectionpoolBody | 
String serviceName = "serviceName_example"; // String | 
try {
    Operation result = apiInstance.createDbaasPgConnectionPool(body, serviceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#createDbaasPgConnectionPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServicenameConnectionpoolBody**](ServicenameConnectionpoolBody.md)|  |
 **serviceName** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDbaasPgDatabase"></a>
# **createDbaasPgDatabase**
> Operation createDbaasPgDatabase(body, serviceName)

Create a DBaaS Postgres database

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
ServicenameDatabaseBody body = new ServicenameDatabaseBody(); // ServicenameDatabaseBody | 
String serviceName = "serviceName_example"; // String | 
try {
    Operation result = apiInstance.createDbaasPgDatabase(body, serviceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#createDbaasPgDatabase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServicenameDatabaseBody**](ServicenameDatabaseBody.md)|  |
 **serviceName** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDbaasPgUpgradeCheck"></a>
# **createDbaasPgUpgradeCheck**
> DbaasTask createDbaasPgUpgradeCheck(body, service)



Check whether you can upgrade Postgres service to a newer version

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
ServiceUpgradecheckBody body = new ServiceUpgradecheckBody(); // ServiceUpgradecheckBody | 
String service = "service_example"; // String | 
try {
    DbaasTask result = apiInstance.createDbaasPgUpgradeCheck(body, service);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#createDbaasPgUpgradeCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceUpgradecheckBody**](ServiceUpgradecheckBody.md)|  |
 **service** | [**String**](.md)|  |

### Return type

[**DbaasTask**](DbaasTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDbaasPostgresUser"></a>
# **createDbaasPostgresUser**
> Operation createDbaasPostgresUser(body, serviceName)

Create a DBaaS Postgres user

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
ServicenameUserBody1 body = new ServicenameUserBody1(); // ServicenameUserBody1 | 
String serviceName = "serviceName_example"; // String | 
try {
    Operation result = apiInstance.createDbaasPostgresUser(body, serviceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#createDbaasPostgresUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServicenameUserBody1**](ServicenameUserBody1.md)|  |
 **serviceName** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDbaasServiceGrafana"></a>
# **createDbaasServiceGrafana**
> Operation createDbaasServiceGrafana(body, name)



Create a DBaaS Grafana service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
DbaasgrafanaNameBody1 body = new DbaasgrafanaNameBody1(); // DbaasgrafanaNameBody1 | 
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.createDbaasServiceGrafana(body, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#createDbaasServiceGrafana");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DbaasgrafanaNameBody1**](DbaasgrafanaNameBody1.md)|  |
 **name** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDbaasServiceKafka"></a>
# **createDbaasServiceKafka**
> Operation createDbaasServiceKafka(body, name)

Create a DBaaS Kafka service

Create a DBaaS Kafka service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
DbaaskafkaNameBody1 body = new DbaaskafkaNameBody1(); // DbaaskafkaNameBody1 | 
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.createDbaasServiceKafka(body, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#createDbaasServiceKafka");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DbaaskafkaNameBody1**](DbaaskafkaNameBody1.md)|  |
 **name** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDbaasServiceMysql"></a>
# **createDbaasServiceMysql**
> Operation createDbaasServiceMysql(body, name)

Create a DBaaS MySQL service

Create a DBaaS MySQL service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
DbaasmysqlNameBody1 body = new DbaasmysqlNameBody1(); // DbaasmysqlNameBody1 | 
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.createDbaasServiceMysql(body, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#createDbaasServiceMysql");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DbaasmysqlNameBody1**](DbaasmysqlNameBody1.md)|  |
 **name** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDbaasServiceOpensearch"></a>
# **createDbaasServiceOpensearch**
> Operation createDbaasServiceOpensearch(body, name)

Create a DBaaS OpenSearch service

Create a DBaaS OpenSearch service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
DbaasopensearchNameBody1 body = new DbaasopensearchNameBody1(); // DbaasopensearchNameBody1 | 
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.createDbaasServiceOpensearch(body, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#createDbaasServiceOpensearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DbaasopensearchNameBody1**](DbaasopensearchNameBody1.md)|  |
 **name** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDbaasServicePg"></a>
# **createDbaasServicePg**
> Operation createDbaasServicePg(body, name)

Create a DBaaS PostgreSQL service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
DbaaspostgresNameBody1 body = new DbaaspostgresNameBody1(); // DbaaspostgresNameBody1 | 
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.createDbaasServicePg(body, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#createDbaasServicePg");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DbaaspostgresNameBody1**](DbaaspostgresNameBody1.md)|  |
 **name** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDbaasServiceRedis"></a>
# **createDbaasServiceRedis**
> Operation createDbaasServiceRedis(body, name)

Create a DBaaS Redis service

Create a DBaaS Redis service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
DbaasredisNameBody1 body = new DbaasredisNameBody1(); // DbaasredisNameBody1 | 
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.createDbaasServiceRedis(body, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#createDbaasServiceRedis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DbaasredisNameBody1**](DbaasredisNameBody1.md)|  |
 **name** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDbaasTaskMigrationCheck"></a>
# **createDbaasTaskMigrationCheck**
> Operation createDbaasTaskMigrationCheck(body, service)



Create a DBaaS task to check migration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
DbaastaskmigrationcheckServiceBody body = new DbaastaskmigrationcheckServiceBody(); // DbaastaskmigrationcheckServiceBody | 
String service = "service_example"; // String | 
try {
    Operation result = apiInstance.createDbaasTaskMigrationCheck(body, service);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#createDbaasTaskMigrationCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DbaastaskmigrationcheckServiceBody**](DbaastaskmigrationcheckServiceBody.md)|  |
 **service** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDbaasIntegration"></a>
# **deleteDbaasIntegration**
> Operation deleteDbaasIntegration(id)

Delete a DBaaS Integration

Delete a DBaaS Integration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.deleteDbaasIntegration(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#deleteDbaasIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDbaasKafkaSchemaRegistryAclConfig"></a>
# **deleteDbaasKafkaSchemaRegistryAclConfig**
> Operation deleteDbaasKafkaSchemaRegistryAclConfig(name, aclId)

Delete a Kafka ACL entry

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
String aclId = "aclId_example"; // String | 
try {
    Operation result = apiInstance.deleteDbaasKafkaSchemaRegistryAclConfig(name, aclId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#deleteDbaasKafkaSchemaRegistryAclConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)|  |
 **aclId** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDbaasKafkaTopicAclConfig"></a>
# **deleteDbaasKafkaTopicAclConfig**
> Operation deleteDbaasKafkaTopicAclConfig(name, aclId)

Delete a Kafka ACL entry

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
String aclId = "aclId_example"; // String | 
try {
    Operation result = apiInstance.deleteDbaasKafkaTopicAclConfig(name, aclId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#deleteDbaasKafkaTopicAclConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)|  |
 **aclId** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDbaasKafkaUser"></a>
# **deleteDbaasKafkaUser**
> Operation deleteDbaasKafkaUser(serviceName, username)

Delete a DBaaS kafka user

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String serviceName = "serviceName_example"; // String | 
String username = "username_example"; // String | 
try {
    Operation result = apiInstance.deleteDbaasKafkaUser(serviceName, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#deleteDbaasKafkaUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceName** | [**String**](.md)|  |
 **username** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDbaasMysqlDatabase"></a>
# **deleteDbaasMysqlDatabase**
> Operation deleteDbaasMysqlDatabase(serviceName, databaseName)

Delete a DBaaS MySQL database

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String serviceName = "serviceName_example"; // String | 
String databaseName = "databaseName_example"; // String | 
try {
    Operation result = apiInstance.deleteDbaasMysqlDatabase(serviceName, databaseName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#deleteDbaasMysqlDatabase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceName** | [**String**](.md)|  |
 **databaseName** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDbaasMysqlUser"></a>
# **deleteDbaasMysqlUser**
> Operation deleteDbaasMysqlUser(serviceName, username)

Delete a DBaaS MySQL user

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String serviceName = "serviceName_example"; // String | 
String username = "username_example"; // String | 
try {
    Operation result = apiInstance.deleteDbaasMysqlUser(serviceName, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#deleteDbaasMysqlUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceName** | [**String**](.md)|  |
 **username** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDbaasOpensearchUser"></a>
# **deleteDbaasOpensearchUser**
> Operation deleteDbaasOpensearchUser(serviceName, username)

Delete a DBaaS OpenSearch user

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String serviceName = "serviceName_example"; // String | 
String username = "username_example"; // String | 
try {
    Operation result = apiInstance.deleteDbaasOpensearchUser(serviceName, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#deleteDbaasOpensearchUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceName** | [**String**](.md)|  |
 **username** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDbaasPgConnectionPool"></a>
# **deleteDbaasPgConnectionPool**
> Operation deleteDbaasPgConnectionPool(serviceName, connectionPoolName)

Delete a DBaaS PostgreSQL connection pool

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String serviceName = "serviceName_example"; // String | 
String connectionPoolName = "connectionPoolName_example"; // String | 
try {
    Operation result = apiInstance.deleteDbaasPgConnectionPool(serviceName, connectionPoolName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#deleteDbaasPgConnectionPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceName** | [**String**](.md)|  |
 **connectionPoolName** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDbaasPgDatabase"></a>
# **deleteDbaasPgDatabase**
> Operation deleteDbaasPgDatabase(serviceName, databaseName)

Delete a DBaaS Postgres database

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String serviceName = "serviceName_example"; // String | 
String databaseName = "databaseName_example"; // String | 
try {
    Operation result = apiInstance.deleteDbaasPgDatabase(serviceName, databaseName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#deleteDbaasPgDatabase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceName** | [**String**](.md)|  |
 **databaseName** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDbaasPostgresUser"></a>
# **deleteDbaasPostgresUser**
> Operation deleteDbaasPostgresUser(serviceName, username)

Delete a DBaaS Postgres user

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String serviceName = "serviceName_example"; // String | 
String username = "username_example"; // String | 
try {
    Operation result = apiInstance.deleteDbaasPostgresUser(serviceName, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#deleteDbaasPostgresUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceName** | [**String**](.md)|  |
 **username** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDbaasService"></a>
# **deleteDbaasService**
> Operation deleteDbaasService(name)

Delete a DBaaS service

Delete a DBaaS service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.deleteDbaasService(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#deleteDbaasService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDbaasServiceGrafana"></a>
# **deleteDbaasServiceGrafana**
> Operation deleteDbaasServiceGrafana(name)

Delete a Grafana service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.deleteDbaasServiceGrafana(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#deleteDbaasServiceGrafana");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDbaasServiceKafka"></a>
# **deleteDbaasServiceKafka**
> Operation deleteDbaasServiceKafka(name)

Delete a Kafka service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.deleteDbaasServiceKafka(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#deleteDbaasServiceKafka");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDbaasServiceMysql"></a>
# **deleteDbaasServiceMysql**
> Operation deleteDbaasServiceMysql(name)

Delete a MySQL service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.deleteDbaasServiceMysql(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#deleteDbaasServiceMysql");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDbaasServiceOpensearch"></a>
# **deleteDbaasServiceOpensearch**
> Operation deleteDbaasServiceOpensearch(name)

Delete a OpenSearch service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.deleteDbaasServiceOpensearch(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#deleteDbaasServiceOpensearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDbaasServicePg"></a>
# **deleteDbaasServicePg**
> Operation deleteDbaasServicePg(name)

Delete a Postgres service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.deleteDbaasServicePg(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#deleteDbaasServicePg");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDbaasServiceRedis"></a>
# **deleteDbaasServiceRedis**
> Operation deleteDbaasServiceRedis(name)

Delete a Redis service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.deleteDbaasServiceRedis(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#deleteDbaasServiceRedis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDbaasCaCertificate"></a>
# **getDbaasCaCertificate**
> InlineResponse20010 getDbaasCaCertificate()

Get DBaaS CA Certificate

Returns a CA Certificate required to reach a DBaaS service through a TLS-protected connection.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
try {
    InlineResponse20010 result = apiInstance.getDbaasCaCertificate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#getDbaasCaCertificate");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDbaasIntegration"></a>
# **getDbaasIntegration**
> DbaasIntegration getDbaasIntegration(id)

Get a DBaaS Integration

Get a DBaaS Integration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
UUID id = new UUID(); // UUID | 
try {
    DbaasIntegration result = apiInstance.getDbaasIntegration(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#getDbaasIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**DbaasIntegration**](DbaasIntegration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDbaasKafkaAclConfig"></a>
# **getDbaasKafkaAclConfig**
> DbaasKafkaAcls getDbaasKafkaAclConfig(name)

Get DBaaS kafka ACL configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
try {
    DbaasKafkaAcls result = apiInstance.getDbaasKafkaAclConfig(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#getDbaasKafkaAclConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)|  |

### Return type

[**DbaasKafkaAcls**](DbaasKafkaAcls.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDbaasMigrationStatus"></a>
# **getDbaasMigrationStatus**
> DbaasMigrationStatus getDbaasMigrationStatus(name)

Get a DBaaS migration status

Get a DBaaS migration status

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
try {
    DbaasMigrationStatus result = apiInstance.getDbaasMigrationStatus(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#getDbaasMigrationStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)|  |

### Return type

[**DbaasMigrationStatus**](DbaasMigrationStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDbaasOpensearchAclConfig"></a>
# **getDbaasOpensearchAclConfig**
> DbaasOpensearchAclConfig getDbaasOpensearchAclConfig(name)

Get DBaaS OpenSearch ACL configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
try {
    DbaasOpensearchAclConfig result = apiInstance.getDbaasOpensearchAclConfig(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#getDbaasOpensearchAclConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)|  |

### Return type

[**DbaasOpensearchAclConfig**](DbaasOpensearchAclConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDbaasServiceGrafana"></a>
# **getDbaasServiceGrafana**
> DbaasServiceGrafana getDbaasServiceGrafana(name)

Get a DBaaS Grafana service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
try {
    DbaasServiceGrafana result = apiInstance.getDbaasServiceGrafana(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#getDbaasServiceGrafana");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)|  |

### Return type

[**DbaasServiceGrafana**](DbaasServiceGrafana.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDbaasServiceKafka"></a>
# **getDbaasServiceKafka**
> DbaasServiceKafka getDbaasServiceKafka(name)

Get a DBaaS Kafka service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
try {
    DbaasServiceKafka result = apiInstance.getDbaasServiceKafka(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#getDbaasServiceKafka");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)|  |

### Return type

[**DbaasServiceKafka**](DbaasServiceKafka.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDbaasServiceLogs"></a>
# **getDbaasServiceLogs**
> DbaasServiceLogs getDbaasServiceLogs(body, serviceName)

Get logs of DBaaS service

Get logs of DBaaS service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
DbaasservicelogsServicenameBody body = new DbaasservicelogsServicenameBody(); // DbaasservicelogsServicenameBody | 
String serviceName = "serviceName_example"; // String | 
try {
    DbaasServiceLogs result = apiInstance.getDbaasServiceLogs(body, serviceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#getDbaasServiceLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DbaasservicelogsServicenameBody**](DbaasservicelogsServicenameBody.md)|  |
 **serviceName** | **String**|  |

### Return type

[**DbaasServiceLogs**](DbaasServiceLogs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDbaasServiceMetrics"></a>
# **getDbaasServiceMetrics**
> InlineResponse20027 getDbaasServiceMetrics(body, serviceName)

Get metrics of DBaaS service

Get metrics of DBaaS service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
DbaasservicemetricsServicenameBody body = new DbaasservicemetricsServicenameBody(); // DbaasservicemetricsServicenameBody | 
String serviceName = "serviceName_example"; // String | 
try {
    InlineResponse20027 result = apiInstance.getDbaasServiceMetrics(body, serviceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#getDbaasServiceMetrics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DbaasservicemetricsServicenameBody**](DbaasservicemetricsServicenameBody.md)|  |
 **serviceName** | **String**|  |

### Return type

[**InlineResponse20027**](InlineResponse20027.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDbaasServiceMysql"></a>
# **getDbaasServiceMysql**
> DbaasServiceMysql getDbaasServiceMysql(name)

Get a DBaaS MySQL service

Get a DBaaS MySQL service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
try {
    DbaasServiceMysql result = apiInstance.getDbaasServiceMysql(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#getDbaasServiceMysql");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)|  |

### Return type

[**DbaasServiceMysql**](DbaasServiceMysql.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDbaasServiceOpensearch"></a>
# **getDbaasServiceOpensearch**
> DbaasServiceOpensearch getDbaasServiceOpensearch(name)

Get a DBaaS OpenSearch service

Get a DBaaS OpenSearch service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
try {
    DbaasServiceOpensearch result = apiInstance.getDbaasServiceOpensearch(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#getDbaasServiceOpensearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)|  |

### Return type

[**DbaasServiceOpensearch**](DbaasServiceOpensearch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDbaasServicePg"></a>
# **getDbaasServicePg**
> DbaasServicePg getDbaasServicePg(name)

Get a DBaaS PostgreSQL service

Get a DBaaS PostgreSQL service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
try {
    DbaasServicePg result = apiInstance.getDbaasServicePg(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#getDbaasServicePg");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)|  |

### Return type

[**DbaasServicePg**](DbaasServicePg.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDbaasServiceRedis"></a>
# **getDbaasServiceRedis**
> DbaasServiceRedis getDbaasServiceRedis(name)

Get a DBaaS Redis service

Get a DBaaS Redis service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
try {
    DbaasServiceRedis result = apiInstance.getDbaasServiceRedis(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#getDbaasServiceRedis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)|  |

### Return type

[**DbaasServiceRedis**](DbaasServiceRedis.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDbaasServiceType"></a>
# **getDbaasServiceType**
> DbaasServiceType getDbaasServiceType(serviceTypeName)

Get a DBaaS service type

Get a DBaaS service type

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String serviceTypeName = "serviceTypeName_example"; // String | 
try {
    DbaasServiceType result = apiInstance.getDbaasServiceType(serviceTypeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#getDbaasServiceType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceTypeName** | **String**|  |

### Return type

[**DbaasServiceType**](DbaasServiceType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDbaasSettingsGrafana"></a>
# **getDbaasSettingsGrafana**
> InlineResponse20011 getDbaasSettingsGrafana()

Get DBaaS Grafana settings

Get DBaaS Grafana settings

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
try {
    InlineResponse20011 result = apiInstance.getDbaasSettingsGrafana();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#getDbaasSettingsGrafana");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDbaasSettingsKafka"></a>
# **getDbaasSettingsKafka**
> InlineResponse20034 getDbaasSettingsKafka()

Get DBaaS Kafka settings

Get DBaaS Kafka settings

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
try {
    InlineResponse20034 result = apiInstance.getDbaasSettingsKafka();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#getDbaasSettingsKafka");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20034**](InlineResponse20034.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDbaasSettingsMysql"></a>
# **getDbaasSettingsMysql**
> InlineResponse20021 getDbaasSettingsMysql()

Get DBaaS MySQL settings

Get DBaaS MySQL settings

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
try {
    InlineResponse20021 result = apiInstance.getDbaasSettingsMysql();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#getDbaasSettingsMysql");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20021**](InlineResponse20021.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDbaasSettingsOpensearch"></a>
# **getDbaasSettingsOpensearch**
> InlineResponse20035 getDbaasSettingsOpensearch()

Get DBaaS OpenSearch settings

Get DBaaS OpenSearch settings

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
try {
    InlineResponse20035 result = apiInstance.getDbaasSettingsOpensearch();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#getDbaasSettingsOpensearch");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20035**](InlineResponse20035.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDbaasSettingsPg"></a>
# **getDbaasSettingsPg**
> InlineResponse20032 getDbaasSettingsPg()

Get DBaaS PostgreSQL settings

Get DBaaS PostgreSQL settings

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
try {
    InlineResponse20032 result = apiInstance.getDbaasSettingsPg();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#getDbaasSettingsPg");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20032**](InlineResponse20032.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDbaasSettingsRedis"></a>
# **getDbaasSettingsRedis**
> InlineResponse20014 getDbaasSettingsRedis()

Get DBaaS Redis settings

Returns the default settings for Redis.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
try {
    InlineResponse20014 result = apiInstance.getDbaasSettingsRedis();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#getDbaasSettingsRedis");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDbaasTask"></a>
# **getDbaasTask**
> DbaasTask getDbaasTask(service, id)

Get a DBaaS task

Get a DBaaS task

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String service = "service_example"; // String | 
UUID id = new UUID(); // UUID | 
try {
    DbaasTask result = apiInstance.getDbaasTask(service, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#getDbaasTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **service** | [**String**](.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**DbaasTask**](DbaasTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDbaasIntegrationSettings"></a>
# **listDbaasIntegrationSettings**
> InlineResponse20031 listDbaasIntegrationSettings(integrationType, sourceType, destType)

Get DBaaS integration settings

Get DBaaS integration settings

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String integrationType = "integrationType_example"; // String | 
String sourceType = "sourceType_example"; // String | 
String destType = "destType_example"; // String | 
try {
    InlineResponse20031 result = apiInstance.listDbaasIntegrationSettings(integrationType, sourceType, destType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#listDbaasIntegrationSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationType** | **String**|  |
 **sourceType** | **String**|  |
 **destType** | **String**|  |

### Return type

[**InlineResponse20031**](InlineResponse20031.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDbaasIntegrationTypes"></a>
# **listDbaasIntegrationTypes**
> InlineResponse20022 listDbaasIntegrationTypes()

Get DBaaS integration types

Get DBaaS integration types

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
try {
    InlineResponse20022 result = apiInstance.listDbaasIntegrationTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#listDbaasIntegrationTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDbaasServiceTypes"></a>
# **listDbaasServiceTypes**
> InlineResponse2003 listDbaasServiceTypes()

DBaaS Service Types

List available service types for DBaaS

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
try {
    InlineResponse2003 result = apiInstance.listDbaasServiceTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#listDbaasServiceTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDbaasServices"></a>
# **listDbaasServices**
> InlineResponse2004 listDbaasServices()

List DBaaS services

List DBaaS services

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
try {
    InlineResponse2004 result = apiInstance.listDbaasServices();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#listDbaasServices");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resetDbaasKafkaUserPassword"></a>
# **resetDbaasKafkaUserPassword**
> Operation resetDbaasKafkaUserPassword(body, serviceName, username)

Reset the credentials of a DBaaS Kafka user

If no password is provided one will be generated automatically.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
PasswordResetBody2 body = new PasswordResetBody2(); // PasswordResetBody2 | 
String serviceName = "serviceName_example"; // String | 
String username = "username_example"; // String | 
try {
    Operation result = apiInstance.resetDbaasKafkaUserPassword(body, serviceName, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#resetDbaasKafkaUserPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PasswordResetBody2**](PasswordResetBody2.md)|  |
 **serviceName** | [**String**](.md)|  |
 **username** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resetDbaasMysqlUserPassword"></a>
# **resetDbaasMysqlUserPassword**
> Operation resetDbaasMysqlUserPassword(body, serviceName, username)

Reset the credentials of a DBaaS mysql user

If no password is provided one will be generated automatically.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
PasswordResetBody body = new PasswordResetBody(); // PasswordResetBody | 
String serviceName = "serviceName_example"; // String | 
String username = "username_example"; // String | 
try {
    Operation result = apiInstance.resetDbaasMysqlUserPassword(body, serviceName, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#resetDbaasMysqlUserPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PasswordResetBody**](PasswordResetBody.md)|  |
 **serviceName** | [**String**](.md)|  |
 **username** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resetDbaasOpensearchUserPassword"></a>
# **resetDbaasOpensearchUserPassword**
> Operation resetDbaasOpensearchUserPassword(body, serviceName, username)

Reset the credentials of a DBaaS OpenSearch user

If no password is provided one will be generated automatically.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
PasswordResetBody1 body = new PasswordResetBody1(); // PasswordResetBody1 | 
String serviceName = "serviceName_example"; // String | 
String username = "username_example"; // String | 
try {
    Operation result = apiInstance.resetDbaasOpensearchUserPassword(body, serviceName, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#resetDbaasOpensearchUserPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PasswordResetBody1**](PasswordResetBody1.md)|  |
 **serviceName** | [**String**](.md)|  |
 **username** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resetDbaasPostgresUserPassword"></a>
# **resetDbaasPostgresUserPassword**
> Operation resetDbaasPostgresUserPassword(body, serviceName, username)

Reset the credentials of a DBaaS Postgres user

If no password is provided one will be generated automatically.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
PasswordResetBody3 body = new PasswordResetBody3(); // PasswordResetBody3 | 
String serviceName = "serviceName_example"; // String | 
String username = "username_example"; // String | 
try {
    Operation result = apiInstance.resetDbaasPostgresUserPassword(body, serviceName, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#resetDbaasPostgresUserPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PasswordResetBody3**](PasswordResetBody3.md)|  |
 **serviceName** | [**String**](.md)|  |
 **username** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="startDbaasGrafanaMaintenance"></a>
# **startDbaasGrafanaMaintenance**
> Operation startDbaasGrafanaMaintenance(name)

Initiate Grafana maintenance update

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.startDbaasGrafanaMaintenance(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#startDbaasGrafanaMaintenance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="startDbaasKafkaMaintenance"></a>
# **startDbaasKafkaMaintenance**
> Operation startDbaasKafkaMaintenance(name)

Initiate Kafka maintenance update

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.startDbaasKafkaMaintenance(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#startDbaasKafkaMaintenance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="startDbaasMysqlMaintenance"></a>
# **startDbaasMysqlMaintenance**
> Operation startDbaasMysqlMaintenance(name)

Initiate MySQL maintenance update

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.startDbaasMysqlMaintenance(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#startDbaasMysqlMaintenance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="startDbaasOpensearchMaintenance"></a>
# **startDbaasOpensearchMaintenance**
> Operation startDbaasOpensearchMaintenance(name)

Initiate OpenSearch maintenance update

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.startDbaasOpensearchMaintenance(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#startDbaasOpensearchMaintenance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="startDbaasPgMaintenance"></a>
# **startDbaasPgMaintenance**
> Operation startDbaasPgMaintenance(name)

Initiate PostgreSQL maintenance update

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.startDbaasPgMaintenance(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#startDbaasPgMaintenance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="startDbaasRedisMaintenance"></a>
# **startDbaasRedisMaintenance**
> Operation startDbaasRedisMaintenance(name)

Initiate Redis maintenance update

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.startDbaasRedisMaintenance(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#startDbaasRedisMaintenance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stopDbaasMysqlMigration"></a>
# **stopDbaasMysqlMigration**
> Operation stopDbaasMysqlMigration(name)

Stop a DBaaS MySQL migration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.stopDbaasMysqlMigration(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#stopDbaasMysqlMigration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stopDbaasPgMigration"></a>
# **stopDbaasPgMigration**
> Operation stopDbaasPgMigration(name)

Stop a DBaaS PostgreSQL migration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.stopDbaasPgMigration(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#stopDbaasPgMigration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stopDbaasRedisMigration"></a>
# **stopDbaasRedisMigration**
> Operation stopDbaasRedisMigration(name)

Stop a DBaaS Redis migration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.stopDbaasRedisMigration(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#stopDbaasRedisMigration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDbaasIntegration"></a>
# **updateDbaasIntegration**
> Operation updateDbaasIntegration(body, id)

Update a existing DBaaS integration

Update a existing DBaaS integration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
DbaasintegrationIdBody body = new DbaasintegrationIdBody(); // DbaasintegrationIdBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.updateDbaasIntegration(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#updateDbaasIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DbaasintegrationIdBody**](DbaasintegrationIdBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDbaasOpensearchAclConfig"></a>
# **updateDbaasOpensearchAclConfig**
> Operation updateDbaasOpensearchAclConfig(body, name)

Create a DBaaS OpenSearch ACL configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
DbaasOpensearchAclConfig body = new DbaasOpensearchAclConfig(); // DbaasOpensearchAclConfig | 
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.updateDbaasOpensearchAclConfig(body, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#updateDbaasOpensearchAclConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DbaasOpensearchAclConfig**](DbaasOpensearchAclConfig.md)|  |
 **name** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDbaasPgConnectionPool"></a>
# **updateDbaasPgConnectionPool**
> Operation updateDbaasPgConnectionPool(body, serviceName, connectionPoolName)

Update a DBaaS PostgreSQL connection pool

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
ConnectionpoolConnectionpoolnameBody body = new ConnectionpoolConnectionpoolnameBody(); // ConnectionpoolConnectionpoolnameBody | 
String serviceName = "serviceName_example"; // String | 
String connectionPoolName = "connectionPoolName_example"; // String | 
try {
    Operation result = apiInstance.updateDbaasPgConnectionPool(body, serviceName, connectionPoolName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#updateDbaasPgConnectionPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConnectionpoolConnectionpoolnameBody**](ConnectionpoolConnectionpoolnameBody.md)|  |
 **serviceName** | [**String**](.md)|  |
 **connectionPoolName** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDbaasPostgresAllowReplication"></a>
# **updateDbaasPostgresAllowReplication**
> DbaasPostgresUsers updateDbaasPostgresAllowReplication(body, serviceName, username)

Update access control for one service user

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
UsernameAllowreplicationBody body = new UsernameAllowreplicationBody(); // UsernameAllowreplicationBody | 
String serviceName = "serviceName_example"; // String | 
String username = "username_example"; // String | 
try {
    DbaasPostgresUsers result = apiInstance.updateDbaasPostgresAllowReplication(body, serviceName, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#updateDbaasPostgresAllowReplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UsernameAllowreplicationBody**](UsernameAllowreplicationBody.md)|  |
 **serviceName** | [**String**](.md)|  |
 **username** | [**String**](.md)|  |

### Return type

[**DbaasPostgresUsers**](DbaasPostgresUsers.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDbaasServiceGrafana"></a>
# **updateDbaasServiceGrafana**
> Operation updateDbaasServiceGrafana(body, name)

Update a DBaaS Grafana service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
DbaasgrafanaNameBody body = new DbaasgrafanaNameBody(); // DbaasgrafanaNameBody | 
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.updateDbaasServiceGrafana(body, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#updateDbaasServiceGrafana");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DbaasgrafanaNameBody**](DbaasgrafanaNameBody.md)|  |
 **name** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDbaasServiceKafka"></a>
# **updateDbaasServiceKafka**
> Operation updateDbaasServiceKafka(body, name)

Update a DBaaS Kafka service

Update a DBaaS Kafka service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
DbaaskafkaNameBody body = new DbaaskafkaNameBody(); // DbaaskafkaNameBody | 
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.updateDbaasServiceKafka(body, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#updateDbaasServiceKafka");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DbaaskafkaNameBody**](DbaaskafkaNameBody.md)|  |
 **name** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDbaasServiceMysql"></a>
# **updateDbaasServiceMysql**
> Operation updateDbaasServiceMysql(body, name)

Update a DBaaS MySQL service

Update a DBaaS MySQL service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
DbaasmysqlNameBody body = new DbaasmysqlNameBody(); // DbaasmysqlNameBody | 
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.updateDbaasServiceMysql(body, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#updateDbaasServiceMysql");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DbaasmysqlNameBody**](DbaasmysqlNameBody.md)|  |
 **name** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDbaasServiceOpensearch"></a>
# **updateDbaasServiceOpensearch**
> Operation updateDbaasServiceOpensearch(body, name)

Update a DBaaS OpenSearch service

Update a DBaaS OpenSearch service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
DbaasopensearchNameBody body = new DbaasopensearchNameBody(); // DbaasopensearchNameBody | 
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.updateDbaasServiceOpensearch(body, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#updateDbaasServiceOpensearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DbaasopensearchNameBody**](DbaasopensearchNameBody.md)|  |
 **name** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDbaasServicePg"></a>
# **updateDbaasServicePg**
> Operation updateDbaasServicePg(body, name)

Update a DBaaS PostgreSQL service

Update a DBaaS PostgreSQL service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
DbaaspostgresNameBody body = new DbaaspostgresNameBody(); // DbaaspostgresNameBody | 
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.updateDbaasServicePg(body, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#updateDbaasServicePg");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DbaaspostgresNameBody**](DbaaspostgresNameBody.md)|  |
 **name** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDbaasServiceRedis"></a>
# **updateDbaasServiceRedis**
> Operation updateDbaasServiceRedis(body, name)

Update a DBaaS Redis service

Update a DBaaS Redis service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DbaasApi;


DbaasApi apiInstance = new DbaasApi();
DbaasredisNameBody body = new DbaasredisNameBody(); // DbaasredisNameBody | 
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.updateDbaasServiceRedis(body, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DbaasApi#updateDbaasServiceRedis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DbaasredisNameBody**](DbaasredisNameBody.md)|  |
 **name** | [**String**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

