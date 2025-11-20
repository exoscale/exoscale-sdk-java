# Exoscale SDK for Java

Java SDK for interacting with Exoscale Cloud Services.




- API version: 2.0.0

- Build date: 2025-11-20T07:07:19.570227517Z[Etc/UTC]



Infrastructure automation API, allowing programmatic access to all Exoscale products and services.

The [OpenAPI Specification](http://spec.openapis.org/oas/v3.0.3.html) source of this documentation can be obtained here:

* [JSON format](https://openapi-v2.exoscale.com/source.json)
* [YAML format](https://openapi-v2.exoscale.com/source.yaml)


## Requirements

1. Java 11+


## Installation

### Maven Users:
Maven users can simply add the below dependency to their `pom.xml` :

```xml
<dependency>
    <groupId>com.exoscale.sdk</groupId>
    <artifactId>sdk</artifactId>
    <version>0.0.5-SNAPSHOT-92c3c82</version>
</dependency>
```

### Gradle Users:
Gradle users can add to their `build.gradle` file, and then specify the dependency as below:

```groovy

dependencies {
  implementation 'com.exoscale.sdk:sdk:0.0.5-SNAPSHOT-92c3c82'
}
```


## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.exoscale.sdk.client.*;
import com.exoscale.sdk.model.*;
import java.util.UUID;

public class NewInstanceExample {
    public static void main(String[] args) throws ApiException, InterruptedException {
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        InstanceType instanceType = client.getInstanceType(UUID.fromString("b6e9d1e8-89fc-4db3-aaa4-9b4c5b1d0844"));
        Template template = client.getTemplate(UUID.fromString("cbd89eb1-c66c-4637-9483-904d7e36c318"));
        CreateInstanceRequest request = new CreateInstanceRequest().instanceType(instanceType).template(template).diskSize(10L);
        Operation operation = client.createInstance(request);
        client.wait(operation);
    }
}


```

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreading environment to avoid any potential issues.
However, the instances of the api clients created from the `ApiClient` are thread-safe and can be re-used.

## Documentation for API Endpoints

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ExoscaleApi* | [**addExternalSourceToSecurityGroup**](sdk/docs/ExoscaleApi.md#addExternalSourceToSecurityGroup) | **PUT** /security-group/{id}:add-source | Add an external source as a member of a Security Group
*ExoscaleApi* | [**addInstanceProtection**](sdk/docs/ExoscaleApi.md#addInstanceProtection) | **PUT** /instance/{id}:add-protection | Set instance destruction protection
*ExoscaleApi* | [**addRuleToSecurityGroup**](sdk/docs/ExoscaleApi.md#addRuleToSecurityGroup) | **POST** /security-group/{id}/rules | Create a Security Group rule
*ExoscaleApi* | [**addServiceToLoadBalancer**](sdk/docs/ExoscaleApi.md#addServiceToLoadBalancer) | **POST** /load-balancer/{id}/service | Add a Load Balancer Service
*ExoscaleApi* | [**attachBlockStorageVolumeToInstance**](sdk/docs/ExoscaleApi.md#attachBlockStorageVolumeToInstance) | **PUT** /block-storage/{id}:attach | Attach block storage volume to an instance
*ExoscaleApi* | [**attachDbaasServiceToEndpoint**](sdk/docs/ExoscaleApi.md#attachDbaasServiceToEndpoint) | **PUT** /dbaas-external-endpoint/{source-service-name}/attach | 
*ExoscaleApi* | [**attachInstanceToElasticIp**](sdk/docs/ExoscaleApi.md#attachInstanceToElasticIp) | **PUT** /elastic-ip/{id}:attach | Attach a Compute instance to an Elastic IP
*ExoscaleApi* | [**attachInstanceToPrivateNetwork**](sdk/docs/ExoscaleApi.md#attachInstanceToPrivateNetwork) | **PUT** /private-network/{id}:attach | Attach a Compute instance to a Private Network
*ExoscaleApi* | [**attachInstanceToSecurityGroup**](sdk/docs/ExoscaleApi.md#attachInstanceToSecurityGroup) | **PUT** /security-group/{id}:attach | Attach a Compute instance to a Security Group
*ExoscaleApi* | [**copyTemplate**](sdk/docs/ExoscaleApi.md#copyTemplate) | **POST** /template/{id} | Copy a Template from a zone to another
*ExoscaleApi* | [**createAntiAffinityGroup**](sdk/docs/ExoscaleApi.md#createAntiAffinityGroup) | **POST** /anti-affinity-group | Create an Anti-affinity Group
*ExoscaleApi* | [**createApiKey**](sdk/docs/ExoscaleApi.md#createApiKey) | **POST** /api-key | Create a new API key
*ExoscaleApi* | [**createBlockStorageSnapshot**](sdk/docs/ExoscaleApi.md#createBlockStorageSnapshot) | **POST** /block-storage/{id}:create-snapshot | Create a block storage snapshot
*ExoscaleApi* | [**createBlockStorageVolume**](sdk/docs/ExoscaleApi.md#createBlockStorageVolume) | **POST** /block-storage | Create a block storage volume
*ExoscaleApi* | [**createDbaasExternalEndpointDatadog**](sdk/docs/ExoscaleApi.md#createDbaasExternalEndpointDatadog) | **POST** /dbaas-external-endpoint-datadog/{name} | 
*ExoscaleApi* | [**createDbaasExternalEndpointElasticsearch**](sdk/docs/ExoscaleApi.md#createDbaasExternalEndpointElasticsearch) | **POST** /dbaas-external-endpoint-elasticsearch/{name} | 
*ExoscaleApi* | [**createDbaasExternalEndpointOpensearch**](sdk/docs/ExoscaleApi.md#createDbaasExternalEndpointOpensearch) | **POST** /dbaas-external-endpoint-opensearch/{name} | 
*ExoscaleApi* | [**createDbaasExternalEndpointPrometheus**](sdk/docs/ExoscaleApi.md#createDbaasExternalEndpointPrometheus) | **POST** /dbaas-external-endpoint-prometheus/{name} | 
*ExoscaleApi* | [**createDbaasExternalEndpointRsyslog**](sdk/docs/ExoscaleApi.md#createDbaasExternalEndpointRsyslog) | **POST** /dbaas-external-endpoint-rsyslog/{name} | 
*ExoscaleApi* | [**createDbaasIntegration**](sdk/docs/ExoscaleApi.md#createDbaasIntegration) | **POST** /dbaas-integration | 
*ExoscaleApi* | [**createDbaasKafkaSchemaRegistryAclConfig**](sdk/docs/ExoscaleApi.md#createDbaasKafkaSchemaRegistryAclConfig) | **POST** /dbaas-kafka/{name}/schema-registry/acl-config | Add a Kafka Schema Registry ACL entry
*ExoscaleApi* | [**createDbaasKafkaTopicAclConfig**](sdk/docs/ExoscaleApi.md#createDbaasKafkaTopicAclConfig) | **POST** /dbaas-kafka/{name}/topic/acl-config | Add a Kafka topic ACL entry
*ExoscaleApi* | [**createDbaasKafkaUser**](sdk/docs/ExoscaleApi.md#createDbaasKafkaUser) | **POST** /dbaas-kafka/{service-name}/user | Create a DBaaS Kafka user
*ExoscaleApi* | [**createDbaasMysqlDatabase**](sdk/docs/ExoscaleApi.md#createDbaasMysqlDatabase) | **POST** /dbaas-mysql/{service-name}/database | Create a DBaaS MySQL database
*ExoscaleApi* | [**createDbaasMysqlUser**](sdk/docs/ExoscaleApi.md#createDbaasMysqlUser) | **POST** /dbaas-mysql/{service-name}/user | Create a DBaaS MySQL user
*ExoscaleApi* | [**createDbaasOpensearchUser**](sdk/docs/ExoscaleApi.md#createDbaasOpensearchUser) | **POST** /dbaas-opensearch/{service-name}/user | Create a DBaaS OpenSearch user
*ExoscaleApi* | [**createDbaasPgConnectionPool**](sdk/docs/ExoscaleApi.md#createDbaasPgConnectionPool) | **POST** /dbaas-postgres/{service-name}/connection-pool | Create a DBaaS PostgreSQL connection pool
*ExoscaleApi* | [**createDbaasPgDatabase**](sdk/docs/ExoscaleApi.md#createDbaasPgDatabase) | **POST** /dbaas-postgres/{service-name}/database | Create a DBaaS Postgres database
*ExoscaleApi* | [**createDbaasPgUpgradeCheck**](sdk/docs/ExoscaleApi.md#createDbaasPgUpgradeCheck) | **POST** /dbaas-postgres/{service}/upgrade-check | 
*ExoscaleApi* | [**createDbaasPostgresUser**](sdk/docs/ExoscaleApi.md#createDbaasPostgresUser) | **POST** /dbaas-postgres/{service-name}/user | Create a DBaaS Postgres user
*ExoscaleApi* | [**createDbaasServiceGrafana**](sdk/docs/ExoscaleApi.md#createDbaasServiceGrafana) | **POST** /dbaas-grafana/{name} | 
*ExoscaleApi* | [**createDbaasServiceKafka**](sdk/docs/ExoscaleApi.md#createDbaasServiceKafka) | **POST** /dbaas-kafka/{name} | Create a DBaaS Kafka service
*ExoscaleApi* | [**createDbaasServiceMysql**](sdk/docs/ExoscaleApi.md#createDbaasServiceMysql) | **POST** /dbaas-mysql/{name} | Create a DBaaS MySQL service
*ExoscaleApi* | [**createDbaasServiceOpensearch**](sdk/docs/ExoscaleApi.md#createDbaasServiceOpensearch) | **POST** /dbaas-opensearch/{name} | Create a DBaaS OpenSearch service
*ExoscaleApi* | [**createDbaasServicePg**](sdk/docs/ExoscaleApi.md#createDbaasServicePg) | **POST** /dbaas-postgres/{name} | Create a DBaaS PostgreSQL service
*ExoscaleApi* | [**createDbaasServiceValkey**](sdk/docs/ExoscaleApi.md#createDbaasServiceValkey) | **POST** /dbaas-valkey/{name} | Create a DBaaS Valkey service
*ExoscaleApi* | [**createDbaasTaskMigrationCheck**](sdk/docs/ExoscaleApi.md#createDbaasTaskMigrationCheck) | **POST** /dbaas-task-migration-check/{service} | 
*ExoscaleApi* | [**createDbaasValkeyUser**](sdk/docs/ExoscaleApi.md#createDbaasValkeyUser) | **POST** /dbaas-valkey/{service-name}/user | Create a DBaaS Valkey user
*ExoscaleApi* | [**createDeployment**](sdk/docs/ExoscaleApi.md#createDeployment) | **POST** /ai/deployment | [BETA] Create Deployment
*ExoscaleApi* | [**createDnsDomain**](sdk/docs/ExoscaleApi.md#createDnsDomain) | **POST** /dns-domain | Create DNS domain
*ExoscaleApi* | [**createDnsDomainRecord**](sdk/docs/ExoscaleApi.md#createDnsDomainRecord) | **POST** /dns-domain/{domain-id}/record | Create DNS domain record
*ExoscaleApi* | [**createElasticIp**](sdk/docs/ExoscaleApi.md#createElasticIp) | **POST** /elastic-ip | Create an Elastic IP
*ExoscaleApi* | [**createIamRole**](sdk/docs/ExoscaleApi.md#createIamRole) | **POST** /iam-role | Create IAM Role
*ExoscaleApi* | [**createInstance**](sdk/docs/ExoscaleApi.md#createInstance) | **POST** /instance | Create a Compute instance
*ExoscaleApi* | [**createInstancePool**](sdk/docs/ExoscaleApi.md#createInstancePool) | **POST** /instance-pool | Create an Instance Pool
*ExoscaleApi* | [**createLoadBalancer**](sdk/docs/ExoscaleApi.md#createLoadBalancer) | **POST** /load-balancer | Create a Load Balancer
*ExoscaleApi* | [**createModel**](sdk/docs/ExoscaleApi.md#createModel) | **POST** /ai/model | [BETA] Create Model
*ExoscaleApi* | [**createPrivateNetwork**](sdk/docs/ExoscaleApi.md#createPrivateNetwork) | **POST** /private-network | Create a Private Network
*ExoscaleApi* | [**createSecurityGroup**](sdk/docs/ExoscaleApi.md#createSecurityGroup) | **POST** /security-group | Create a Security Group
*ExoscaleApi* | [**createSksCluster**](sdk/docs/ExoscaleApi.md#createSksCluster) | **POST** /sks-cluster | Create an SKS cluster
*ExoscaleApi* | [**createSksNodepool**](sdk/docs/ExoscaleApi.md#createSksNodepool) | **POST** /sks-cluster/{id}/nodepool | Create a new SKS Nodepool
*ExoscaleApi* | [**createSnapshot**](sdk/docs/ExoscaleApi.md#createSnapshot) | **POST** /instance/{id}:create-snapshot | Create a Snapshot of a Compute instance
*ExoscaleApi* | [**createUser**](sdk/docs/ExoscaleApi.md#createUser) | **POST** /user | Create a User
*ExoscaleApi* | [**deleteAntiAffinityGroup**](sdk/docs/ExoscaleApi.md#deleteAntiAffinityGroup) | **DELETE** /anti-affinity-group/{id} | Delete an Anti-affinity Group
*ExoscaleApi* | [**deleteApiKey**](sdk/docs/ExoscaleApi.md#deleteApiKey) | **DELETE** /api-key/{id} | Delete an API key
*ExoscaleApi* | [**deleteBlockStorageSnapshot**](sdk/docs/ExoscaleApi.md#deleteBlockStorageSnapshot) | **DELETE** /block-storage-snapshot/{id} | Delete a block storage snapshot, data will be unrecoverable
*ExoscaleApi* | [**deleteBlockStorageVolume**](sdk/docs/ExoscaleApi.md#deleteBlockStorageVolume) | **DELETE** /block-storage/{id} | Delete a block storage volume, data will be unrecoverable
*ExoscaleApi* | [**deleteDbaasExternalEndpointDatadog**](sdk/docs/ExoscaleApi.md#deleteDbaasExternalEndpointDatadog) | **DELETE** /dbaas-external-endpoint-datadog/{endpoint-id} | 
*ExoscaleApi* | [**deleteDbaasExternalEndpointElasticsearch**](sdk/docs/ExoscaleApi.md#deleteDbaasExternalEndpointElasticsearch) | **DELETE** /dbaas-external-endpoint-elasticsearch/{endpoint-id} | 
*ExoscaleApi* | [**deleteDbaasExternalEndpointOpensearch**](sdk/docs/ExoscaleApi.md#deleteDbaasExternalEndpointOpensearch) | **DELETE** /dbaas-external-endpoint-opensearch/{endpoint-id} | 
*ExoscaleApi* | [**deleteDbaasExternalEndpointPrometheus**](sdk/docs/ExoscaleApi.md#deleteDbaasExternalEndpointPrometheus) | **DELETE** /dbaas-external-endpoint-prometheus/{endpoint-id} | 
*ExoscaleApi* | [**deleteDbaasExternalEndpointRsyslog**](sdk/docs/ExoscaleApi.md#deleteDbaasExternalEndpointRsyslog) | **DELETE** /dbaas-external-endpoint-rsyslog/{endpoint-id} | 
*ExoscaleApi* | [**deleteDbaasIntegration**](sdk/docs/ExoscaleApi.md#deleteDbaasIntegration) | **DELETE** /dbaas-integration/{id} | 
*ExoscaleApi* | [**deleteDbaasKafkaSchemaRegistryAclConfig**](sdk/docs/ExoscaleApi.md#deleteDbaasKafkaSchemaRegistryAclConfig) | **DELETE** /dbaas-kafka/{name}/schema-registry/acl-config/{acl-id} | Delete a Kafka ACL entry
*ExoscaleApi* | [**deleteDbaasKafkaTopicAclConfig**](sdk/docs/ExoscaleApi.md#deleteDbaasKafkaTopicAclConfig) | **DELETE** /dbaas-kafka/{name}/topic/acl-config/{acl-id} | Delete a Kafka ACL entry
*ExoscaleApi* | [**deleteDbaasKafkaUser**](sdk/docs/ExoscaleApi.md#deleteDbaasKafkaUser) | **DELETE** /dbaas-kafka/{service-name}/user/{username} | Delete a DBaaS kafka user
*ExoscaleApi* | [**deleteDbaasMysqlDatabase**](sdk/docs/ExoscaleApi.md#deleteDbaasMysqlDatabase) | **DELETE** /dbaas-mysql/{service-name}/database/{database-name} | Delete a DBaaS MySQL database
*ExoscaleApi* | [**deleteDbaasMysqlUser**](sdk/docs/ExoscaleApi.md#deleteDbaasMysqlUser) | **DELETE** /dbaas-mysql/{service-name}/user/{username} | Delete a DBaaS MySQL user
*ExoscaleApi* | [**deleteDbaasOpensearchUser**](sdk/docs/ExoscaleApi.md#deleteDbaasOpensearchUser) | **DELETE** /dbaas-opensearch/{service-name}/user/{username} | Delete a DBaaS OpenSearch user
*ExoscaleApi* | [**deleteDbaasPgConnectionPool**](sdk/docs/ExoscaleApi.md#deleteDbaasPgConnectionPool) | **DELETE** /dbaas-postgres/{service-name}/connection-pool/{connection-pool-name} | Delete a DBaaS PostgreSQL connection pool
*ExoscaleApi* | [**deleteDbaasPgDatabase**](sdk/docs/ExoscaleApi.md#deleteDbaasPgDatabase) | **DELETE** /dbaas-postgres/{service-name}/database/{database-name} | Delete a DBaaS Postgres database
*ExoscaleApi* | [**deleteDbaasPostgresUser**](sdk/docs/ExoscaleApi.md#deleteDbaasPostgresUser) | **DELETE** /dbaas-postgres/{service-name}/user/{username} | Delete a DBaaS Postgres user
*ExoscaleApi* | [**deleteDbaasService**](sdk/docs/ExoscaleApi.md#deleteDbaasService) | **DELETE** /dbaas-service/{name} | Delete a DBaaS service
*ExoscaleApi* | [**deleteDbaasServiceGrafana**](sdk/docs/ExoscaleApi.md#deleteDbaasServiceGrafana) | **DELETE** /dbaas-grafana/{name} | Delete a Grafana service
*ExoscaleApi* | [**deleteDbaasServiceKafka**](sdk/docs/ExoscaleApi.md#deleteDbaasServiceKafka) | **DELETE** /dbaas-kafka/{name} | Delete a Kafka service
*ExoscaleApi* | [**deleteDbaasServiceMysql**](sdk/docs/ExoscaleApi.md#deleteDbaasServiceMysql) | **DELETE** /dbaas-mysql/{name} | Delete a MySQL service
*ExoscaleApi* | [**deleteDbaasServiceOpensearch**](sdk/docs/ExoscaleApi.md#deleteDbaasServiceOpensearch) | **DELETE** /dbaas-opensearch/{name} | Delete a OpenSearch service
*ExoscaleApi* | [**deleteDbaasServicePg**](sdk/docs/ExoscaleApi.md#deleteDbaasServicePg) | **DELETE** /dbaas-postgres/{name} | Delete a Postgres service
*ExoscaleApi* | [**deleteDbaasServiceValkey**](sdk/docs/ExoscaleApi.md#deleteDbaasServiceValkey) | **DELETE** /dbaas-valkey/{name} | Delete a Valkey service
*ExoscaleApi* | [**deleteDbaasValkeyUser**](sdk/docs/ExoscaleApi.md#deleteDbaasValkeyUser) | **DELETE** /dbaas-valkey/{service-name}/user/{username} | Delete a DBaaS Valkey user
*ExoscaleApi* | [**deleteDeployment**](sdk/docs/ExoscaleApi.md#deleteDeployment) | **DELETE** /ai/deployment/{id} | [BETA] Delete Deployment
*ExoscaleApi* | [**deleteDnsDomain**](sdk/docs/ExoscaleApi.md#deleteDnsDomain) | **DELETE** /dns-domain/{id} | Delete DNS Domain
*ExoscaleApi* | [**deleteDnsDomainRecord**](sdk/docs/ExoscaleApi.md#deleteDnsDomainRecord) | **DELETE** /dns-domain/{domain-id}/record/{record-id} | Delete DNS domain record
*ExoscaleApi* | [**deleteElasticIp**](sdk/docs/ExoscaleApi.md#deleteElasticIp) | **DELETE** /elastic-ip/{id} | Delete an Elastic IP
*ExoscaleApi* | [**deleteIamRole**](sdk/docs/ExoscaleApi.md#deleteIamRole) | **DELETE** /iam-role/{id} | Delete IAM Role
*ExoscaleApi* | [**deleteInstance**](sdk/docs/ExoscaleApi.md#deleteInstance) | **DELETE** /instance/{id} | Delete a Compute instance
*ExoscaleApi* | [**deleteInstancePool**](sdk/docs/ExoscaleApi.md#deleteInstancePool) | **DELETE** /instance-pool/{id} | Delete an Instance Pool
*ExoscaleApi* | [**deleteLoadBalancer**](sdk/docs/ExoscaleApi.md#deleteLoadBalancer) | **DELETE** /load-balancer/{id} | Delete a Load Balancer
*ExoscaleApi* | [**deleteLoadBalancerService**](sdk/docs/ExoscaleApi.md#deleteLoadBalancerService) | **DELETE** /load-balancer/{id}/service/{service-id} | Delete a Load Balancer Service
*ExoscaleApi* | [**deleteModel**](sdk/docs/ExoscaleApi.md#deleteModel) | **DELETE** /ai/model/{id} | [BETA] Delete Model
*ExoscaleApi* | [**deletePrivateNetwork**](sdk/docs/ExoscaleApi.md#deletePrivateNetwork) | **DELETE** /private-network/{id} | Delete a Private Network
*ExoscaleApi* | [**deleteReverseDnsElasticIp**](sdk/docs/ExoscaleApi.md#deleteReverseDnsElasticIp) | **DELETE** /reverse-dns/elastic-ip/{id} | Delete the PTR DNS record for an elastic IP
*ExoscaleApi* | [**deleteReverseDnsInstance**](sdk/docs/ExoscaleApi.md#deleteReverseDnsInstance) | **DELETE** /reverse-dns/instance/{id} | Delete the PTR DNS record for an instance
*ExoscaleApi* | [**deleteRuleFromSecurityGroup**](sdk/docs/ExoscaleApi.md#deleteRuleFromSecurityGroup) | **DELETE** /security-group/{id}/rules/{rule-id} | Delete a Security Group rule
*ExoscaleApi* | [**deleteSecurityGroup**](sdk/docs/ExoscaleApi.md#deleteSecurityGroup) | **DELETE** /security-group/{id} | Delete a Security Group
*ExoscaleApi* | [**deleteSksCluster**](sdk/docs/ExoscaleApi.md#deleteSksCluster) | **DELETE** /sks-cluster/{id} | Delete an SKS cluster
*ExoscaleApi* | [**deleteSksNodepool**](sdk/docs/ExoscaleApi.md#deleteSksNodepool) | **DELETE** /sks-cluster/{id}/nodepool/{sks-nodepool-id} | Delete an SKS Nodepool
*ExoscaleApi* | [**deleteSnapshot**](sdk/docs/ExoscaleApi.md#deleteSnapshot) | **DELETE** /snapshot/{id} | Delete a Snapshot
*ExoscaleApi* | [**deleteSshKey**](sdk/docs/ExoscaleApi.md#deleteSshKey) | **DELETE** /ssh-key/{name} | Delete a SSH key
*ExoscaleApi* | [**deleteTemplate**](sdk/docs/ExoscaleApi.md#deleteTemplate) | **DELETE** /template/{id} | Delete a Template
*ExoscaleApi* | [**deleteUser**](sdk/docs/ExoscaleApi.md#deleteUser) | **DELETE** /user/{id} | Delete User
*ExoscaleApi* | [**detachBlockStorageVolume**](sdk/docs/ExoscaleApi.md#detachBlockStorageVolume) | **PUT** /block-storage/{id}:detach | Detach block storage volume
*ExoscaleApi* | [**detachDbaasServiceFromEndpoint**](sdk/docs/ExoscaleApi.md#detachDbaasServiceFromEndpoint) | **PUT** /dbaas-external-endpoint/{source-service-name}/detach | 
*ExoscaleApi* | [**detachInstanceFromElasticIp**](sdk/docs/ExoscaleApi.md#detachInstanceFromElasticIp) | **PUT** /elastic-ip/{id}:detach | Detach a Compute instance from an Elastic IP
*ExoscaleApi* | [**detachInstanceFromPrivateNetwork**](sdk/docs/ExoscaleApi.md#detachInstanceFromPrivateNetwork) | **PUT** /private-network/{id}:detach | Detach a Compute instance from a Private Network
*ExoscaleApi* | [**detachInstanceFromSecurityGroup**](sdk/docs/ExoscaleApi.md#detachInstanceFromSecurityGroup) | **PUT** /security-group/{id}:detach | Detach a Compute instance from a Security Group
*ExoscaleApi* | [**enableDbaasMysqlWrites**](sdk/docs/ExoscaleApi.md#enableDbaasMysqlWrites) | **PUT** /dbaas-mysql/{name}/enable/writes | Temporarily enable writes for MySQL services in read-only mode due to filled up storage
*ExoscaleApi* | [**enableTpm**](sdk/docs/ExoscaleApi.md#enableTpm) | **POST** /instance/{id}:enable-tpm | Enable tpm for the instance.
*ExoscaleApi* | [**evictInstancePoolMembers**](sdk/docs/ExoscaleApi.md#evictInstancePoolMembers) | **PUT** /instance-pool/{id}:evict | Evict Instance Pool members
*ExoscaleApi* | [**evictSksNodepoolMembers**](sdk/docs/ExoscaleApi.md#evictSksNodepoolMembers) | **PUT** /sks-cluster/{id}/nodepool/{sks-nodepool-id}:evict | Evict Nodepool members
*ExoscaleApi* | [**exportSnapshot**](sdk/docs/ExoscaleApi.md#exportSnapshot) | **POST** /snapshot/{id}:export | Export a Snapshot
*ExoscaleApi* | [**generateSksClusterKubeconfig**](sdk/docs/ExoscaleApi.md#generateSksClusterKubeconfig) | **POST** /sks-cluster-kubeconfig/{id} | Generate a new Kubeconfig file for a SKS cluster
*ExoscaleApi* | [**getActiveNodepoolTemplate**](sdk/docs/ExoscaleApi.md#getActiveNodepoolTemplate) | **GET** /sks-template/{kube-version}/{variant} | 
*ExoscaleApi* | [**getAntiAffinityGroup**](sdk/docs/ExoscaleApi.md#getAntiAffinityGroup) | **GET** /anti-affinity-group/{id} | Retrieve Anti-affinity Group details
*ExoscaleApi* | [**getApiKey**](sdk/docs/ExoscaleApi.md#getApiKey) | **GET** /api-key/{id} | Get API key
*ExoscaleApi* | [**getBlockStorageSnapshot**](sdk/docs/ExoscaleApi.md#getBlockStorageSnapshot) | **GET** /block-storage-snapshot/{id} | Retrieve block storage snapshot details
*ExoscaleApi* | [**getBlockStorageVolume**](sdk/docs/ExoscaleApi.md#getBlockStorageVolume) | **GET** /block-storage/{id} | Retrieve block storage volume details
*ExoscaleApi* | [**getConsoleProxyUrl**](sdk/docs/ExoscaleApi.md#getConsoleProxyUrl) | **GET** /console/{id} | Retrieve signed url valid for 60 seconds to connect via console-proxy websocket to VM VNC console.
*ExoscaleApi* | [**getDbaasCaCertificate**](sdk/docs/ExoscaleApi.md#getDbaasCaCertificate) | **GET** /dbaas-ca-certificate | Get DBaaS CA Certificate
*ExoscaleApi* | [**getDbaasExternalEndpointDatadog**](sdk/docs/ExoscaleApi.md#getDbaasExternalEndpointDatadog) | **GET** /dbaas-external-endpoint-datadog/{endpoint-id} | 
*ExoscaleApi* | [**getDbaasExternalEndpointElasticsearch**](sdk/docs/ExoscaleApi.md#getDbaasExternalEndpointElasticsearch) | **GET** /dbaas-external-endpoint-elasticsearch/{endpoint-id} | 
*ExoscaleApi* | [**getDbaasExternalEndpointOpensearch**](sdk/docs/ExoscaleApi.md#getDbaasExternalEndpointOpensearch) | **GET** /dbaas-external-endpoint-opensearch/{endpoint-id} | 
*ExoscaleApi* | [**getDbaasExternalEndpointPrometheus**](sdk/docs/ExoscaleApi.md#getDbaasExternalEndpointPrometheus) | **GET** /dbaas-external-endpoint-prometheus/{endpoint-id} | 
*ExoscaleApi* | [**getDbaasExternalEndpointRsyslog**](sdk/docs/ExoscaleApi.md#getDbaasExternalEndpointRsyslog) | **GET** /dbaas-external-endpoint-rsyslog/{endpoint-id} | 
*ExoscaleApi* | [**getDbaasExternalIntegration**](sdk/docs/ExoscaleApi.md#getDbaasExternalIntegration) | **GET** /dbaas-external-integration/{integration-id} | 
*ExoscaleApi* | [**getDbaasExternalIntegrationSettingsDatadog**](sdk/docs/ExoscaleApi.md#getDbaasExternalIntegrationSettingsDatadog) | **GET** /dbaas-external-integration-settings-datadog/{integration-id} | 
*ExoscaleApi* | [**getDbaasIntegration**](sdk/docs/ExoscaleApi.md#getDbaasIntegration) | **GET** /dbaas-integration/{id} | 
*ExoscaleApi* | [**getDbaasKafkaAclConfig**](sdk/docs/ExoscaleApi.md#getDbaasKafkaAclConfig) | **GET** /dbaas-kafka/{name}/acl-config | Get DBaaS kafka ACL configuration
*ExoscaleApi* | [**getDbaasMigrationStatus**](sdk/docs/ExoscaleApi.md#getDbaasMigrationStatus) | **GET** /dbaas-migration-status/{name} | Get a DBaaS migration status
*ExoscaleApi* | [**getDbaasOpensearchAclConfig**](sdk/docs/ExoscaleApi.md#getDbaasOpensearchAclConfig) | **GET** /dbaas-opensearch/{name}/acl-config | Get DBaaS OpenSearch ACL configuration
*ExoscaleApi* | [**getDbaasServiceGrafana**](sdk/docs/ExoscaleApi.md#getDbaasServiceGrafana) | **GET** /dbaas-grafana/{name} | Get a DBaaS Grafana service
*ExoscaleApi* | [**getDbaasServiceKafka**](sdk/docs/ExoscaleApi.md#getDbaasServiceKafka) | **GET** /dbaas-kafka/{name} | Get a DBaaS Kafka service
*ExoscaleApi* | [**getDbaasServiceLogs**](sdk/docs/ExoscaleApi.md#getDbaasServiceLogs) | **POST** /dbaas-service-logs/{service-name} | Get logs of DBaaS service
*ExoscaleApi* | [**getDbaasServiceMetrics**](sdk/docs/ExoscaleApi.md#getDbaasServiceMetrics) | **POST** /dbaas-service-metrics/{service-name} | Get metrics of DBaaS service
*ExoscaleApi* | [**getDbaasServiceMysql**](sdk/docs/ExoscaleApi.md#getDbaasServiceMysql) | **GET** /dbaas-mysql/{name} | Get a DBaaS MySQL service
*ExoscaleApi* | [**getDbaasServiceOpensearch**](sdk/docs/ExoscaleApi.md#getDbaasServiceOpensearch) | **GET** /dbaas-opensearch/{name} | Get a DBaaS OpenSearch service
*ExoscaleApi* | [**getDbaasServicePg**](sdk/docs/ExoscaleApi.md#getDbaasServicePg) | **GET** /dbaas-postgres/{name} | Get a DBaaS PostgreSQL service
*ExoscaleApi* | [**getDbaasServiceType**](sdk/docs/ExoscaleApi.md#getDbaasServiceType) | **GET** /dbaas-service-type/{service-type-name} | Get a DBaaS service type
*ExoscaleApi* | [**getDbaasServiceValkey**](sdk/docs/ExoscaleApi.md#getDbaasServiceValkey) | **GET** /dbaas-valkey/{name} | 
*ExoscaleApi* | [**getDbaasSettingsGrafana**](sdk/docs/ExoscaleApi.md#getDbaasSettingsGrafana) | **GET** /dbaas-settings-grafana | Get DBaaS Grafana settings
*ExoscaleApi* | [**getDbaasSettingsKafka**](sdk/docs/ExoscaleApi.md#getDbaasSettingsKafka) | **GET** /dbaas-settings-kafka | Get DBaaS Kafka settings
*ExoscaleApi* | [**getDbaasSettingsMysql**](sdk/docs/ExoscaleApi.md#getDbaasSettingsMysql) | **GET** /dbaas-settings-mysql | Get DBaaS MySQL settings
*ExoscaleApi* | [**getDbaasSettingsOpensearch**](sdk/docs/ExoscaleApi.md#getDbaasSettingsOpensearch) | **GET** /dbaas-settings-opensearch | Get DBaaS OpenSearch settings
*ExoscaleApi* | [**getDbaasSettingsPg**](sdk/docs/ExoscaleApi.md#getDbaasSettingsPg) | **GET** /dbaas-settings-pg | Get DBaaS PostgreSQL settings
*ExoscaleApi* | [**getDbaasSettingsValkey**](sdk/docs/ExoscaleApi.md#getDbaasSettingsValkey) | **GET** /dbaas-settings-valkey | Get DBaaS Valkey settings
*ExoscaleApi* | [**getDbaasTask**](sdk/docs/ExoscaleApi.md#getDbaasTask) | **GET** /dbaas-task/{service}/{id} | Get a DBaaS task
*ExoscaleApi* | [**getDeployTarget**](sdk/docs/ExoscaleApi.md#getDeployTarget) | **GET** /deploy-target/{id} | Retrieve Deploy Target details
*ExoscaleApi* | [**getDeployment**](sdk/docs/ExoscaleApi.md#getDeployment) | **GET** /ai/deployment/{id} | [BETA] Get Deployment
*ExoscaleApi* | [**getDeploymentLogs**](sdk/docs/ExoscaleApi.md#getDeploymentLogs) | **GET** /ai/deployment/{id}/logs | [BETA] Get Deployment Logs
*ExoscaleApi* | [**getDnsDomain**](sdk/docs/ExoscaleApi.md#getDnsDomain) | **GET** /dns-domain/{id} | Retrieve DNS domain details
*ExoscaleApi* | [**getDnsDomainRecord**](sdk/docs/ExoscaleApi.md#getDnsDomainRecord) | **GET** /dns-domain/{domain-id}/record/{record-id} | Retrieve DNS domain record details
*ExoscaleApi* | [**getDnsDomainZoneFile**](sdk/docs/ExoscaleApi.md#getDnsDomainZoneFile) | **GET** /dns-domain/{id}/zone | Retrieve DNS domain zone file
*ExoscaleApi* | [**getElasticIp**](sdk/docs/ExoscaleApi.md#getElasticIp) | **GET** /elastic-ip/{id} | Retrieve Elastic IP details
*ExoscaleApi* | [**getEnvImpact**](sdk/docs/ExoscaleApi.md#getEnvImpact) | **GET** /env-impact/{period} | [BETA] Retrieve organization environmental impact reports
*ExoscaleApi* | [**getIamOrganizationPolicy**](sdk/docs/ExoscaleApi.md#getIamOrganizationPolicy) | **GET** /iam-organization-policy | Retrieve IAM Organization Policy
*ExoscaleApi* | [**getIamRole**](sdk/docs/ExoscaleApi.md#getIamRole) | **GET** /iam-role/{id} | Retrieve IAM Role
*ExoscaleApi* | [**getInstance**](sdk/docs/ExoscaleApi.md#getInstance) | **GET** /instance/{id} | Retrieve Compute instance details
*ExoscaleApi* | [**getInstancePool**](sdk/docs/ExoscaleApi.md#getInstancePool) | **GET** /instance-pool/{id} | Retrieve Instance Pool details
*ExoscaleApi* | [**getInstanceType**](sdk/docs/ExoscaleApi.md#getInstanceType) | **GET** /instance-type/{id} | Retrieve Instance Type details
*ExoscaleApi* | [**getLoadBalancer**](sdk/docs/ExoscaleApi.md#getLoadBalancer) | **GET** /load-balancer/{id} | Retrieve Load Balancer details
*ExoscaleApi* | [**getLoadBalancerService**](sdk/docs/ExoscaleApi.md#getLoadBalancerService) | **GET** /load-balancer/{id}/service/{service-id} | Retrieve Load Balancer Service details
*ExoscaleApi* | [**getModel**](sdk/docs/ExoscaleApi.md#getModel) | **GET** /ai/model/{id} | [BETA] Get Model
*ExoscaleApi* | [**getOperation**](sdk/docs/ExoscaleApi.md#getOperation) | **GET** /operation/{id} | Retrieve Operation details
*ExoscaleApi* | [**getOrganization**](sdk/docs/ExoscaleApi.md#getOrganization) | **GET** /organization | Retrieve an organization
*ExoscaleApi* | [**getPrivateNetwork**](sdk/docs/ExoscaleApi.md#getPrivateNetwork) | **GET** /private-network/{id} | Retrieve Private Network details
*ExoscaleApi* | [**getQuota**](sdk/docs/ExoscaleApi.md#getQuota) | **GET** /quota/{entity} | Retrieve Resource Quota
*ExoscaleApi* | [**getReverseDnsElasticIp**](sdk/docs/ExoscaleApi.md#getReverseDnsElasticIp) | **GET** /reverse-dns/elastic-ip/{id} | Query the PTR DNS records for an elastic IP
*ExoscaleApi* | [**getReverseDnsInstance**](sdk/docs/ExoscaleApi.md#getReverseDnsInstance) | **GET** /reverse-dns/instance/{id} | Query the PTR DNS records for an instance
*ExoscaleApi* | [**getSecurityGroup**](sdk/docs/ExoscaleApi.md#getSecurityGroup) | **GET** /security-group/{id} | Retrieve Security Group details
*ExoscaleApi* | [**getSksCluster**](sdk/docs/ExoscaleApi.md#getSksCluster) | **GET** /sks-cluster/{id} | Retrieve SKS cluster details
*ExoscaleApi* | [**getSksClusterAuthorityCert**](sdk/docs/ExoscaleApi.md#getSksClusterAuthorityCert) | **GET** /sks-cluster/{id}/authority/{authority}/cert | Get the certificate for a SKS cluster authority
*ExoscaleApi* | [**getSksClusterInspection**](sdk/docs/ExoscaleApi.md#getSksClusterInspection) | **GET** /sks-cluster/{id}/inspection | Get the latest inspection result
*ExoscaleApi* | [**getSksNodepool**](sdk/docs/ExoscaleApi.md#getSksNodepool) | **GET** /sks-cluster/{id}/nodepool/{sks-nodepool-id} | Retrieve SKS Nodepool details
*ExoscaleApi* | [**getSnapshot**](sdk/docs/ExoscaleApi.md#getSnapshot) | **GET** /snapshot/{id} | Retrieve Snapshot details
*ExoscaleApi* | [**getSosPresignedUrl**](sdk/docs/ExoscaleApi.md#getSosPresignedUrl) | **GET** /sos/{bucket}/presigned-url | Retrieve Presigned Download URL for SOS object
*ExoscaleApi* | [**getSshKey**](sdk/docs/ExoscaleApi.md#getSshKey) | **GET** /ssh-key/{name} | Retrieve SSH key details
*ExoscaleApi* | [**getTemplate**](sdk/docs/ExoscaleApi.md#getTemplate) | **GET** /template/{id} | Retrieve Template details
*ExoscaleApi* | [**getUsageReport**](sdk/docs/ExoscaleApi.md#getUsageReport) | **GET** /usage-report | Retrieve organization usage reports
*ExoscaleApi* | [**listAntiAffinityGroups**](sdk/docs/ExoscaleApi.md#listAntiAffinityGroups) | **GET** /anti-affinity-group | List Anti-affinity Groups
*ExoscaleApi* | [**listApiKeys**](sdk/docs/ExoscaleApi.md#listApiKeys) | **GET** /api-key | List API keys
*ExoscaleApi* | [**listBlockStorageSnapshots**](sdk/docs/ExoscaleApi.md#listBlockStorageSnapshots) | **GET** /block-storage-snapshot | List block storage snapshots
*ExoscaleApi* | [**listBlockStorageVolumes**](sdk/docs/ExoscaleApi.md#listBlockStorageVolumes) | **GET** /block-storage | List block storage volumes
*ExoscaleApi* | [**listDbaasExternalEndpointTypes**](sdk/docs/ExoscaleApi.md#listDbaasExternalEndpointTypes) | **GET** /dbaas-external-endpoint-types | 
*ExoscaleApi* | [**listDbaasExternalEndpoints**](sdk/docs/ExoscaleApi.md#listDbaasExternalEndpoints) | **GET** /dbaas-external-endpoints | 
*ExoscaleApi* | [**listDbaasExternalIntegrations**](sdk/docs/ExoscaleApi.md#listDbaasExternalIntegrations) | **GET** /dbaas-external-integrations/{service-name} | 
*ExoscaleApi* | [**listDbaasIntegrationSettings**](sdk/docs/ExoscaleApi.md#listDbaasIntegrationSettings) | **GET** /dbaas-integration-settings/{integration-type}/{source-type}/{dest-type} | 
*ExoscaleApi* | [**listDbaasIntegrationTypes**](sdk/docs/ExoscaleApi.md#listDbaasIntegrationTypes) | **GET** /dbaas-integration-types | 
*ExoscaleApi* | [**listDbaasServiceTypes**](sdk/docs/ExoscaleApi.md#listDbaasServiceTypes) | **GET** /dbaas-service-type | DBaaS Service Types
*ExoscaleApi* | [**listDbaasServices**](sdk/docs/ExoscaleApi.md#listDbaasServices) | **GET** /dbaas-service | List DBaaS services
*ExoscaleApi* | [**listDeployTargets**](sdk/docs/ExoscaleApi.md#listDeployTargets) | **GET** /deploy-target | List Deploy Targets
*ExoscaleApi* | [**listDeployments**](sdk/docs/ExoscaleApi.md#listDeployments) | **GET** /ai/deployment | [BETA] List Deployments
*ExoscaleApi* | [**listDnsDomainRecords**](sdk/docs/ExoscaleApi.md#listDnsDomainRecords) | **GET** /dns-domain/{domain-id}/record | List DNS domain records
*ExoscaleApi* | [**listDnsDomains**](sdk/docs/ExoscaleApi.md#listDnsDomains) | **GET** /dns-domain | List DNS domains
*ExoscaleApi* | [**listElasticIps**](sdk/docs/ExoscaleApi.md#listElasticIps) | **GET** /elastic-ip | List Elastic IPs
*ExoscaleApi* | [**listEvents**](sdk/docs/ExoscaleApi.md#listEvents) | **GET** /event | List Events
*ExoscaleApi* | [**listIamRoles**](sdk/docs/ExoscaleApi.md#listIamRoles) | **GET** /iam-role | List IAM Roles
*ExoscaleApi* | [**listInstancePools**](sdk/docs/ExoscaleApi.md#listInstancePools) | **GET** /instance-pool | List Instance Pools
*ExoscaleApi* | [**listInstanceTypes**](sdk/docs/ExoscaleApi.md#listInstanceTypes) | **GET** /instance-type | List Compute instance Types
*ExoscaleApi* | [**listInstances**](sdk/docs/ExoscaleApi.md#listInstances) | **GET** /instance | List Compute instances
*ExoscaleApi* | [**listLoadBalancers**](sdk/docs/ExoscaleApi.md#listLoadBalancers) | **GET** /load-balancer | List Load Balancers
*ExoscaleApi* | [**listModels**](sdk/docs/ExoscaleApi.md#listModels) | **GET** /ai/model | [BETA] List Models
*ExoscaleApi* | [**listPrivateNetworks**](sdk/docs/ExoscaleApi.md#listPrivateNetworks) | **GET** /private-network | List Private Networks
*ExoscaleApi* | [**listQuotas**](sdk/docs/ExoscaleApi.md#listQuotas) | **GET** /quota | List Organization Quotas
*ExoscaleApi* | [**listSecurityGroups**](sdk/docs/ExoscaleApi.md#listSecurityGroups) | **GET** /security-group | List Security Groups.
*ExoscaleApi* | [**listSksClusterDeprecatedResources**](sdk/docs/ExoscaleApi.md#listSksClusterDeprecatedResources) | **GET** /sks-cluster-deprecated-resources/{id} | Resources that are scheduled to be removed in future kubernetes releases
*ExoscaleApi* | [**listSksClusterVersions**](sdk/docs/ExoscaleApi.md#listSksClusterVersions) | **GET** /sks-cluster-version | List available versions for SKS clusters
*ExoscaleApi* | [**listSksClusters**](sdk/docs/ExoscaleApi.md#listSksClusters) | **GET** /sks-cluster | List SKS clusters
*ExoscaleApi* | [**listSnapshots**](sdk/docs/ExoscaleApi.md#listSnapshots) | **GET** /snapshot | List Snapshots
*ExoscaleApi* | [**listSosBucketsUsage**](sdk/docs/ExoscaleApi.md#listSosBucketsUsage) | **GET** /sos-buckets-usage | List SOS Buckets Usage
*ExoscaleApi* | [**listSshKeys**](sdk/docs/ExoscaleApi.md#listSshKeys) | **GET** /ssh-key | List SSH keys
*ExoscaleApi* | [**listTemplates**](sdk/docs/ExoscaleApi.md#listTemplates) | **GET** /template | List Templates
*ExoscaleApi* | [**listUsers**](sdk/docs/ExoscaleApi.md#listUsers) | **GET** /user | List Users
*ExoscaleApi* | [**listZones**](sdk/docs/ExoscaleApi.md#listZones) | **GET** /zone | List Zones
*ExoscaleApi* | [**promoteSnapshotToTemplate**](sdk/docs/ExoscaleApi.md#promoteSnapshotToTemplate) | **POST** /snapshot/{id}:promote | Promote a Snapshot to a Template
*ExoscaleApi* | [**rebootInstance**](sdk/docs/ExoscaleApi.md#rebootInstance) | **PUT** /instance/{id}:reboot | Reboot a Compute instance
*ExoscaleApi* | [**registerSshKey**](sdk/docs/ExoscaleApi.md#registerSshKey) | **POST** /ssh-key | Import SSH key
*ExoscaleApi* | [**registerTemplate**](sdk/docs/ExoscaleApi.md#registerTemplate) | **POST** /template | Register a Template
*ExoscaleApi* | [**removeExternalSourceFromSecurityGroup**](sdk/docs/ExoscaleApi.md#removeExternalSourceFromSecurityGroup) | **PUT** /security-group/{id}:remove-source | Remove an external source from a Security Group
*ExoscaleApi* | [**removeInstanceProtection**](sdk/docs/ExoscaleApi.md#removeInstanceProtection) | **PUT** /instance/{id}:remove-protection | Remove instance destruction protection
*ExoscaleApi* | [**resetDbaasGrafanaUserPassword**](sdk/docs/ExoscaleApi.md#resetDbaasGrafanaUserPassword) | **PUT** /dbaas-grafana/{service-name}/user/{username}/password/reset | Reset the credentials of a DBaaS Grafana user
*ExoscaleApi* | [**resetDbaasKafkaUserPassword**](sdk/docs/ExoscaleApi.md#resetDbaasKafkaUserPassword) | **PUT** /dbaas-kafka/{service-name}/user/{username}/password/reset | Reset the credentials of a DBaaS Kafka user
*ExoscaleApi* | [**resetDbaasMysqlUserPassword**](sdk/docs/ExoscaleApi.md#resetDbaasMysqlUserPassword) | **PUT** /dbaas-mysql/{service-name}/user/{username}/password/reset | Reset the credentials of a DBaaS mysql user
*ExoscaleApi* | [**resetDbaasOpensearchUserPassword**](sdk/docs/ExoscaleApi.md#resetDbaasOpensearchUserPassword) | **PUT** /dbaas-opensearch/{service-name}/user/{username}/password/reset | Reset the credentials of a DBaaS OpenSearch user
*ExoscaleApi* | [**resetDbaasPostgresUserPassword**](sdk/docs/ExoscaleApi.md#resetDbaasPostgresUserPassword) | **PUT** /dbaas-postgres/{service-name}/user/{username}/password/reset | Reset the credentials of a DBaaS Postgres user
*ExoscaleApi* | [**resetDbaasValkeyUserPassword**](sdk/docs/ExoscaleApi.md#resetDbaasValkeyUserPassword) | **PUT** /dbaas-valkey/{service-name}/user/{username}/password/reset | Reset the credentials of a DBaaS Valkey user
*ExoscaleApi* | [**resetElasticIpField**](sdk/docs/ExoscaleApi.md#resetElasticIpField) | **DELETE** /elastic-ip/{id}/{field} | Reset an Elastic IP field to its default value
*ExoscaleApi* | [**resetIamOrganizationPolicy**](sdk/docs/ExoscaleApi.md#resetIamOrganizationPolicy) | **POST** /iam-organization-policy:reset | Reset IAM Organization Policy
*ExoscaleApi* | [**resetInstance**](sdk/docs/ExoscaleApi.md#resetInstance) | **PUT** /instance/{id}:reset | Reset a Compute instance to a base/target template
*ExoscaleApi* | [**resetInstanceField**](sdk/docs/ExoscaleApi.md#resetInstanceField) | **DELETE** /instance/{id}/{field} | Reset Instance field
*ExoscaleApi* | [**resetInstancePassword**](sdk/docs/ExoscaleApi.md#resetInstancePassword) | **PUT** /instance/{id}:reset-password | Reset a compute instance password
*ExoscaleApi* | [**resetInstancePoolField**](sdk/docs/ExoscaleApi.md#resetInstancePoolField) | **DELETE** /instance-pool/{id}/{field} | Reset an Instance Pool field to its default value
*ExoscaleApi* | [**resetLoadBalancerField**](sdk/docs/ExoscaleApi.md#resetLoadBalancerField) | **DELETE** /load-balancer/{id}/{field} | Reset a Load Balancer field to its default value
*ExoscaleApi* | [**resetLoadBalancerServiceField**](sdk/docs/ExoscaleApi.md#resetLoadBalancerServiceField) | **DELETE** /load-balancer/{id}/service/{service-id}/{field} | Reset a Load Balancer Service field to its default value
*ExoscaleApi* | [**resetPrivateNetworkField**](sdk/docs/ExoscaleApi.md#resetPrivateNetworkField) | **DELETE** /private-network/{id}/{field} | Reset Private Network field
*ExoscaleApi* | [**resizeBlockStorageVolume**](sdk/docs/ExoscaleApi.md#resizeBlockStorageVolume) | **PUT** /block-storage/{id}:resize-volume | Resize a block storage volume
*ExoscaleApi* | [**resizeInstanceDisk**](sdk/docs/ExoscaleApi.md#resizeInstanceDisk) | **PUT** /instance/{id}:resize-disk | Resize a Compute instance disk
*ExoscaleApi* | [**revealDbaasGrafanaUserPassword**](sdk/docs/ExoscaleApi.md#revealDbaasGrafanaUserPassword) | **GET** /dbaas-grafana/{service-name}/user/{username}/password/reveal | Reveal the secrets of a DBaaS Grafana user
*ExoscaleApi* | [**revealDbaasKafkaConnectPassword**](sdk/docs/ExoscaleApi.md#revealDbaasKafkaConnectPassword) | **GET** /dbaas-kafka/{service-name}/connect/password/reveal | Reveal the secrets for DBaaS Kafka Connect
*ExoscaleApi* | [**revealDbaasKafkaUserPassword**](sdk/docs/ExoscaleApi.md#revealDbaasKafkaUserPassword) | **GET** /dbaas-kafka/{service-name}/user/{username}/password/reveal | Reveal the secrets of a DBaaS Kafka user
*ExoscaleApi* | [**revealDbaasMysqlUserPassword**](sdk/docs/ExoscaleApi.md#revealDbaasMysqlUserPassword) | **GET** /dbaas-mysql/{service-name}/user/{username}/password/reveal | Reveal the secrets of a DBaaS MySQL user
*ExoscaleApi* | [**revealDbaasOpensearchUserPassword**](sdk/docs/ExoscaleApi.md#revealDbaasOpensearchUserPassword) | **GET** /dbaas-opensearch/{service-name}/user/{username}/password/reveal | Reveal the secrets of a DBaaS OpenSearch user
*ExoscaleApi* | [**revealDbaasPostgresUserPassword**](sdk/docs/ExoscaleApi.md#revealDbaasPostgresUserPassword) | **GET** /dbaas-postgres/{service-name}/user/{username}/password/reveal | Reveal the secrets of a DBaaS Postgres user
*ExoscaleApi* | [**revealDbaasValkeyUserPassword**](sdk/docs/ExoscaleApi.md#revealDbaasValkeyUserPassword) | **GET** /dbaas-valkey/{service-name}/user/{username}/password/reveal | Reveal the secrets of a DBaaS Valkey user
*ExoscaleApi* | [**revealDeploymentApiKey**](sdk/docs/ExoscaleApi.md#revealDeploymentApiKey) | **GET** /ai/deployment/{id}/api-key | [BETA] Reveal Deployment API Key
*ExoscaleApi* | [**revealInstancePassword**](sdk/docs/ExoscaleApi.md#revealInstancePassword) | **GET** /instance/{id}:password | Reveal the password used during instance creation or the latest password reset.
*ExoscaleApi* | [**revertInstanceToSnapshot**](sdk/docs/ExoscaleApi.md#revertInstanceToSnapshot) | **POST** /instance/{instance-id}:revert-snapshot | Revert a snapshot for an instance
*ExoscaleApi* | [**rotateSksCcmCredentials**](sdk/docs/ExoscaleApi.md#rotateSksCcmCredentials) | **PUT** /sks-cluster/{id}/rotate-ccm-credentials | Rotate Exoscale CCM credentials
*ExoscaleApi* | [**rotateSksCsiCredentials**](sdk/docs/ExoscaleApi.md#rotateSksCsiCredentials) | **PUT** /sks-cluster/{id}/rotate-csi-credentials | Rotate Exoscale CSI credentials
*ExoscaleApi* | [**rotateSksKarpenterCredentials**](sdk/docs/ExoscaleApi.md#rotateSksKarpenterCredentials) | **PUT** /sks-cluster/{id}/rotate-karpenter-credentials | Rotate Exoscale Karpenter credentials
*ExoscaleApi* | [**rotateSksOperatorsCa**](sdk/docs/ExoscaleApi.md#rotateSksOperatorsCa) | **PUT** /sks-cluster/{id}/rotate-operators-ca | Rotate operators certificate authority
*ExoscaleApi* | [**scaleDeployment**](sdk/docs/ExoscaleApi.md#scaleDeployment) | **POST** /ai/deployment/{id}/scale | [BETA] Scale Deployment
*ExoscaleApi* | [**scaleInstance**](sdk/docs/ExoscaleApi.md#scaleInstance) | **PUT** /instance/{id}:scale | Scale a Compute instance to a new Instance Type
*ExoscaleApi* | [**scaleInstancePool**](sdk/docs/ExoscaleApi.md#scaleInstancePool) | **PUT** /instance-pool/{id}:scale | Scale an Instance Pool
*ExoscaleApi* | [**scaleSksNodepool**](sdk/docs/ExoscaleApi.md#scaleSksNodepool) | **PUT** /sks-cluster/{id}/nodepool/{sks-nodepool-id}:scale | Scale a SKS Nodepool
*ExoscaleApi* | [**startDbaasGrafanaMaintenance**](sdk/docs/ExoscaleApi.md#startDbaasGrafanaMaintenance) | **PUT** /dbaas-grafana/{name}/maintenance/start | Initiate Grafana maintenance update
*ExoscaleApi* | [**startDbaasKafkaMaintenance**](sdk/docs/ExoscaleApi.md#startDbaasKafkaMaintenance) | **PUT** /dbaas-kafka/{name}/maintenance/start | Initiate Kafka maintenance update
*ExoscaleApi* | [**startDbaasMysqlMaintenance**](sdk/docs/ExoscaleApi.md#startDbaasMysqlMaintenance) | **PUT** /dbaas-mysql/{name}/maintenance/start | Initiate MySQL maintenance update
*ExoscaleApi* | [**startDbaasOpensearchMaintenance**](sdk/docs/ExoscaleApi.md#startDbaasOpensearchMaintenance) | **PUT** /dbaas-opensearch/{name}/maintenance/start | Initiate OpenSearch maintenance update
*ExoscaleApi* | [**startDbaasPgMaintenance**](sdk/docs/ExoscaleApi.md#startDbaasPgMaintenance) | **PUT** /dbaas-postgres/{name}/maintenance/start | Initiate PostgreSQL maintenance update
*ExoscaleApi* | [**startDbaasValkeyMaintenance**](sdk/docs/ExoscaleApi.md#startDbaasValkeyMaintenance) | **PUT** /dbaas-valkey/{name}/maintenance/start | Initiate Valkey maintenance update
*ExoscaleApi* | [**startInstance**](sdk/docs/ExoscaleApi.md#startInstance) | **PUT** /instance/{id}:start | Start a Compute instance
*ExoscaleApi* | [**stopDbaasMysqlMigration**](sdk/docs/ExoscaleApi.md#stopDbaasMysqlMigration) | **POST** /dbaas-mysql/{name}/migration/stop | Stop a DBaaS MySQL migration
*ExoscaleApi* | [**stopDbaasPgMigration**](sdk/docs/ExoscaleApi.md#stopDbaasPgMigration) | **POST** /dbaas-postgres/{name}/migration/stop | Stop a DBaaS PostgreSQL migration
*ExoscaleApi* | [**stopDbaasValkeyMigration**](sdk/docs/ExoscaleApi.md#stopDbaasValkeyMigration) | **POST** /dbaas-valkey/{name}/migration/stop | Stop a DBaaS Valkey migration
*ExoscaleApi* | [**stopInstance**](sdk/docs/ExoscaleApi.md#stopInstance) | **PUT** /instance/{id}:stop | Stop a Compute instance
*ExoscaleApi* | [**updateBlockStorageSnapshot**](sdk/docs/ExoscaleApi.md#updateBlockStorageSnapshot) | **PUT** /block-storage-snapshot/{id} | Update block storage volume snapshot
*ExoscaleApi* | [**updateBlockStorageVolume**](sdk/docs/ExoscaleApi.md#updateBlockStorageVolume) | **PUT** /block-storage/{id} | Update block storage volume
*ExoscaleApi* | [**updateDbaasExternalEndpointDatadog**](sdk/docs/ExoscaleApi.md#updateDbaasExternalEndpointDatadog) | **PUT** /dbaas-external-endpoint-datadog/{endpoint-id} | 
*ExoscaleApi* | [**updateDbaasExternalEndpointElasticsearch**](sdk/docs/ExoscaleApi.md#updateDbaasExternalEndpointElasticsearch) | **PUT** /dbaas-external-endpoint-elasticsearch/{endpoint-id} | 
*ExoscaleApi* | [**updateDbaasExternalEndpointOpensearch**](sdk/docs/ExoscaleApi.md#updateDbaasExternalEndpointOpensearch) | **PUT** /dbaas-external-endpoint-opensearch/{endpoint-id} | 
*ExoscaleApi* | [**updateDbaasExternalEndpointPrometheus**](sdk/docs/ExoscaleApi.md#updateDbaasExternalEndpointPrometheus) | **PUT** /dbaas-external-endpoint-prometheus/{endpoint-id} | 
*ExoscaleApi* | [**updateDbaasExternalEndpointRsyslog**](sdk/docs/ExoscaleApi.md#updateDbaasExternalEndpointRsyslog) | **PUT** /dbaas-external-endpoint-rsyslog/{endpoint-id} | 
*ExoscaleApi* | [**updateDbaasExternalIntegrationSettingsDatadog**](sdk/docs/ExoscaleApi.md#updateDbaasExternalIntegrationSettingsDatadog) | **POST** /dbaas-external-integration-settings-datadog/{integration-id} | 
*ExoscaleApi* | [**updateDbaasIntegration**](sdk/docs/ExoscaleApi.md#updateDbaasIntegration) | **PUT** /dbaas-integration/{id} | 
*ExoscaleApi* | [**updateDbaasOpensearchAclConfig**](sdk/docs/ExoscaleApi.md#updateDbaasOpensearchAclConfig) | **PUT** /dbaas-opensearch/{name}/acl-config | Create a DBaaS OpenSearch ACL configuration
*ExoscaleApi* | [**updateDbaasPgConnectionPool**](sdk/docs/ExoscaleApi.md#updateDbaasPgConnectionPool) | **PUT** /dbaas-postgres/{service-name}/connection-pool/{connection-pool-name} | Update a DBaaS PostgreSQL connection pool
*ExoscaleApi* | [**updateDbaasPostgresAllowReplication**](sdk/docs/ExoscaleApi.md#updateDbaasPostgresAllowReplication) | **PUT** /dbaas-postgres/{service-name}/user/{username}/allow-replication | Update access control for one service user
*ExoscaleApi* | [**updateDbaasServiceGrafana**](sdk/docs/ExoscaleApi.md#updateDbaasServiceGrafana) | **PUT** /dbaas-grafana/{name} | Update a DBaaS Grafana service
*ExoscaleApi* | [**updateDbaasServiceKafka**](sdk/docs/ExoscaleApi.md#updateDbaasServiceKafka) | **PUT** /dbaas-kafka/{name} | Update a DBaaS Kafka service
*ExoscaleApi* | [**updateDbaasServiceMysql**](sdk/docs/ExoscaleApi.md#updateDbaasServiceMysql) | **PUT** /dbaas-mysql/{name} | Update a DBaaS MySQL service
*ExoscaleApi* | [**updateDbaasServiceOpensearch**](sdk/docs/ExoscaleApi.md#updateDbaasServiceOpensearch) | **PUT** /dbaas-opensearch/{name} | Update a DBaaS OpenSearch service
*ExoscaleApi* | [**updateDbaasServicePg**](sdk/docs/ExoscaleApi.md#updateDbaasServicePg) | **PUT** /dbaas-postgres/{name} | Update a DBaaS PostgreSQL service
*ExoscaleApi* | [**updateDbaasServiceValkey**](sdk/docs/ExoscaleApi.md#updateDbaasServiceValkey) | **PUT** /dbaas-valkey/{name} | 
*ExoscaleApi* | [**updateDnsDomainRecord**](sdk/docs/ExoscaleApi.md#updateDnsDomainRecord) | **PUT** /dns-domain/{domain-id}/record/{record-id} | Update DNS domain record
*ExoscaleApi* | [**updateElasticIp**](sdk/docs/ExoscaleApi.md#updateElasticIp) | **PUT** /elastic-ip/{id} | Update an Elastic IP
*ExoscaleApi* | [**updateIamOrganizationPolicy**](sdk/docs/ExoscaleApi.md#updateIamOrganizationPolicy) | **PUT** /iam-organization-policy | Update IAM Organization Policy
*ExoscaleApi* | [**updateIamRole**](sdk/docs/ExoscaleApi.md#updateIamRole) | **PUT** /iam-role/{id} | Update IAM Role
*ExoscaleApi* | [**updateIamRolePolicy**](sdk/docs/ExoscaleApi.md#updateIamRolePolicy) | **PUT** /iam-role/{id}:policy | Update IAM Role Policy
*ExoscaleApi* | [**updateInstance**](sdk/docs/ExoscaleApi.md#updateInstance) | **PUT** /instance/{id} | Update a Compute instance
*ExoscaleApi* | [**updateInstancePool**](sdk/docs/ExoscaleApi.md#updateInstancePool) | **PUT** /instance-pool/{id} | Update an Instance Pool
*ExoscaleApi* | [**updateLoadBalancer**](sdk/docs/ExoscaleApi.md#updateLoadBalancer) | **PUT** /load-balancer/{id} | Update a Load Balancer
*ExoscaleApi* | [**updateLoadBalancerService**](sdk/docs/ExoscaleApi.md#updateLoadBalancerService) | **PUT** /load-balancer/{id}/service/{service-id} | Update a Load Balancer Service
*ExoscaleApi* | [**updatePrivateNetwork**](sdk/docs/ExoscaleApi.md#updatePrivateNetwork) | **PUT** /private-network/{id} | Update a Private Network
*ExoscaleApi* | [**updatePrivateNetworkInstanceIp**](sdk/docs/ExoscaleApi.md#updatePrivateNetworkInstanceIp) | **PUT** /private-network/{id}:update-ip | Update the IP address of an instance attached to a managed private network
*ExoscaleApi* | [**updateReverseDnsElasticIp**](sdk/docs/ExoscaleApi.md#updateReverseDnsElasticIp) | **POST** /reverse-dns/elastic-ip/{id} | Update/Create the PTR DNS record for an elastic IP
*ExoscaleApi* | [**updateReverseDnsInstance**](sdk/docs/ExoscaleApi.md#updateReverseDnsInstance) | **POST** /reverse-dns/instance/{id} | Update/Create the PTR DNS record for an instance
*ExoscaleApi* | [**updateSksCluster**](sdk/docs/ExoscaleApi.md#updateSksCluster) | **PUT** /sks-cluster/{id} | Update an SKS cluster
*ExoscaleApi* | [**updateSksNodepool**](sdk/docs/ExoscaleApi.md#updateSksNodepool) | **PUT** /sks-cluster/{id}/nodepool/{sks-nodepool-id} | Update an SKS Nodepool
*ExoscaleApi* | [**updateTemplate**](sdk/docs/ExoscaleApi.md#updateTemplate) | **PUT** /template/{id} | Update template attributes
*ExoscaleApi* | [**updateUserRole**](sdk/docs/ExoscaleApi.md#updateUserRole) | **PUT** /user/{id} | Update a User&#39;s IAM role
*ExoscaleApi* | [**upgradeSksCluster**](sdk/docs/ExoscaleApi.md#upgradeSksCluster) | **PUT** /sks-cluster/{id}/upgrade | Upgrade an SKS cluster
*ExoscaleApi* | [**upgradeSksClusterServiceLevel**](sdk/docs/ExoscaleApi.md#upgradeSksClusterServiceLevel) | **PUT** /sks-cluster/{id}/upgrade-service-level | Upgrade a SKS cluster to pro


## Documentation for Models

 - [AccessKey](sdk/docs/AccessKey.md)
 - [AccessKeyOperation](sdk/docs/AccessKeyOperation.md)
 - [AccessKeyResource](sdk/docs/AccessKeyResource.md)
 - [AddExternalSourceToSecurityGroupRequest](sdk/docs/AddExternalSourceToSecurityGroupRequest.md)
 - [AddRuleToSecurityGroupRequest](sdk/docs/AddRuleToSecurityGroupRequest.md)
 - [AddRuleToSecurityGroupRequestIcmp](sdk/docs/AddRuleToSecurityGroupRequestIcmp.md)
 - [AddServiceToLoadBalancerRequest](sdk/docs/AddServiceToLoadBalancerRequest.md)
 - [AntiAffinityGroup](sdk/docs/AntiAffinityGroup.md)
 - [AttachBlockStorageVolumeToInstanceRequest](sdk/docs/AttachBlockStorageVolumeToInstanceRequest.md)
 - [AttachDbaasServiceToEndpointRequest](sdk/docs/AttachDbaasServiceToEndpointRequest.md)
 - [AttachInstanceToPrivateNetworkRequest](sdk/docs/AttachInstanceToPrivateNetworkRequest.md)
 - [AttachInstanceToPrivateNetworkRequestInstance](sdk/docs/AttachInstanceToPrivateNetworkRequestInstance.md)
 - [AutovacuumSettings](sdk/docs/AutovacuumSettings.md)
 - [AzureADOAuthIntegration](sdk/docs/AzureADOAuthIntegration.md)
 - [BackgroundBGWriterSettings](sdk/docs/BackgroundBGWriterSettings.md)
 - [BlockStorageSnapshot](sdk/docs/BlockStorageSnapshot.md)
 - [BlockStorageSnapshotTarget](sdk/docs/BlockStorageSnapshotTarget.md)
 - [BlockStorageVolume](sdk/docs/BlockStorageVolume.md)
 - [BlockStorageVolumeTarget](sdk/docs/BlockStorageVolumeTarget.md)
 - [ConfigureLogCleanerForTopicCompaction](sdk/docs/ConfigureLogCleanerForTopicCompaction.md)
 - [CopyTemplateRequest](sdk/docs/CopyTemplateRequest.md)
 - [CreateAntiAffinityGroupRequest](sdk/docs/CreateAntiAffinityGroupRequest.md)
 - [CreateApiKeyRequest](sdk/docs/CreateApiKeyRequest.md)
 - [CreateBlockStorageSnapshotRequest](sdk/docs/CreateBlockStorageSnapshotRequest.md)
 - [CreateBlockStorageVolumeRequest](sdk/docs/CreateBlockStorageVolumeRequest.md)
 - [CreateDbaasIntegrationRequest](sdk/docs/CreateDbaasIntegrationRequest.md)
 - [CreateDbaasKafkaUserRequest](sdk/docs/CreateDbaasKafkaUserRequest.md)
 - [CreateDbaasMysqlDatabaseRequest](sdk/docs/CreateDbaasMysqlDatabaseRequest.md)
 - [CreateDbaasMysqlUserRequest](sdk/docs/CreateDbaasMysqlUserRequest.md)
 - [CreateDbaasPgConnectionPoolRequest](sdk/docs/CreateDbaasPgConnectionPoolRequest.md)
 - [CreateDbaasPgDatabaseRequest](sdk/docs/CreateDbaasPgDatabaseRequest.md)
 - [CreateDbaasPgUpgradeCheckRequest](sdk/docs/CreateDbaasPgUpgradeCheckRequest.md)
 - [CreateDbaasPostgresUserRequest](sdk/docs/CreateDbaasPostgresUserRequest.md)
 - [CreateDbaasServiceGrafanaRequest](sdk/docs/CreateDbaasServiceGrafanaRequest.md)
 - [CreateDbaasServiceKafkaRequest](sdk/docs/CreateDbaasServiceKafkaRequest.md)
 - [CreateDbaasServiceMysqlRequest](sdk/docs/CreateDbaasServiceMysqlRequest.md)
 - [CreateDbaasServiceMysqlRequestIntegrationsInner](sdk/docs/CreateDbaasServiceMysqlRequestIntegrationsInner.md)
 - [CreateDbaasServiceOpensearchRequest](sdk/docs/CreateDbaasServiceOpensearchRequest.md)
 - [CreateDbaasServicePgRequest](sdk/docs/CreateDbaasServicePgRequest.md)
 - [CreateDbaasServiceValkeyRequest](sdk/docs/CreateDbaasServiceValkeyRequest.md)
 - [CreateDbaasTaskMigrationCheckRequest](sdk/docs/CreateDbaasTaskMigrationCheckRequest.md)
 - [CreateDeploymentRequest](sdk/docs/CreateDeploymentRequest.md)
 - [CreateDnsDomainRecordRequest](sdk/docs/CreateDnsDomainRecordRequest.md)
 - [CreateDnsDomainRequest](sdk/docs/CreateDnsDomainRequest.md)
 - [CreateElasticIpRequest](sdk/docs/CreateElasticIpRequest.md)
 - [CreateIamRoleRequest](sdk/docs/CreateIamRoleRequest.md)
 - [CreateInstancePoolRequest](sdk/docs/CreateInstancePoolRequest.md)
 - [CreateInstanceRequest](sdk/docs/CreateInstanceRequest.md)
 - [CreateLoadBalancerRequest](sdk/docs/CreateLoadBalancerRequest.md)
 - [CreateModelRequest](sdk/docs/CreateModelRequest.md)
 - [CreatePrivateNetworkRequest](sdk/docs/CreatePrivateNetworkRequest.md)
 - [CreateSecurityGroupRequest](sdk/docs/CreateSecurityGroupRequest.md)
 - [CreateSksClusterRequest](sdk/docs/CreateSksClusterRequest.md)
 - [CreateSksNodepoolRequest](sdk/docs/CreateSksNodepoolRequest.md)
 - [CreateUserRequest](sdk/docs/CreateUserRequest.md)
 - [DbaasBackupConfig](sdk/docs/DbaasBackupConfig.md)
 - [DbaasDatadogTag](sdk/docs/DbaasDatadogTag.md)
 - [DbaasEndpointDatadogCommon](sdk/docs/DbaasEndpointDatadogCommon.md)
 - [DbaasEndpointDatadogInputCreate](sdk/docs/DbaasEndpointDatadogInputCreate.md)
 - [DbaasEndpointDatadogInputCreateSettings](sdk/docs/DbaasEndpointDatadogInputCreateSettings.md)
 - [DbaasEndpointDatadogInputUpdate](sdk/docs/DbaasEndpointDatadogInputUpdate.md)
 - [DbaasEndpointDatadogInputUpdateSettings](sdk/docs/DbaasEndpointDatadogInputUpdateSettings.md)
 - [DbaasEndpointDatadogSettings](sdk/docs/DbaasEndpointDatadogSettings.md)
 - [DbaasEndpointElasticsearch](sdk/docs/DbaasEndpointElasticsearch.md)
 - [DbaasEndpointElasticsearchInputCreate](sdk/docs/DbaasEndpointElasticsearchInputCreate.md)
 - [DbaasEndpointElasticsearchInputCreateSettings](sdk/docs/DbaasEndpointElasticsearchInputCreateSettings.md)
 - [DbaasEndpointElasticsearchInputUpdate](sdk/docs/DbaasEndpointElasticsearchInputUpdate.md)
 - [DbaasEndpointElasticsearchInputUpdateSettings](sdk/docs/DbaasEndpointElasticsearchInputUpdateSettings.md)
 - [DbaasEndpointElasticsearchOptionalFields](sdk/docs/DbaasEndpointElasticsearchOptionalFields.md)
 - [DbaasEndpointElasticsearchOutput](sdk/docs/DbaasEndpointElasticsearchOutput.md)
 - [DbaasEndpointElasticsearchSecrets](sdk/docs/DbaasEndpointElasticsearchSecrets.md)
 - [DbaasEndpointExternalPrometheusOutput](sdk/docs/DbaasEndpointExternalPrometheusOutput.md)
 - [DbaasEndpointExternalPrometheusOutputSettings](sdk/docs/DbaasEndpointExternalPrometheusOutputSettings.md)
 - [DbaasEndpointOpensearch](sdk/docs/DbaasEndpointOpensearch.md)
 - [DbaasEndpointOpensearchInputCreate](sdk/docs/DbaasEndpointOpensearchInputCreate.md)
 - [DbaasEndpointOpensearchInputCreateSettings](sdk/docs/DbaasEndpointOpensearchInputCreateSettings.md)
 - [DbaasEndpointOpensearchInputUpdate](sdk/docs/DbaasEndpointOpensearchInputUpdate.md)
 - [DbaasEndpointOpensearchInputUpdateSettings](sdk/docs/DbaasEndpointOpensearchInputUpdateSettings.md)
 - [DbaasEndpointOpensearchOptionalFields](sdk/docs/DbaasEndpointOpensearchOptionalFields.md)
 - [DbaasEndpointOpensearchOutput](sdk/docs/DbaasEndpointOpensearchOutput.md)
 - [DbaasEndpointOpensearchSecrets](sdk/docs/DbaasEndpointOpensearchSecrets.md)
 - [DbaasEndpointPrometheus](sdk/docs/DbaasEndpointPrometheus.md)
 - [DbaasEndpointPrometheusPayload](sdk/docs/DbaasEndpointPrometheusPayload.md)
 - [DbaasEndpointPrometheusPayloadSettings](sdk/docs/DbaasEndpointPrometheusPayloadSettings.md)
 - [DbaasEndpointPrometheusSecrets](sdk/docs/DbaasEndpointPrometheusSecrets.md)
 - [DbaasEndpointRsyslog](sdk/docs/DbaasEndpointRsyslog.md)
 - [DbaasEndpointRsyslogInputCreate](sdk/docs/DbaasEndpointRsyslogInputCreate.md)
 - [DbaasEndpointRsyslogInputCreateSettings](sdk/docs/DbaasEndpointRsyslogInputCreateSettings.md)
 - [DbaasEndpointRsyslogInputUpdate](sdk/docs/DbaasEndpointRsyslogInputUpdate.md)
 - [DbaasEndpointRsyslogInputUpdateSettings](sdk/docs/DbaasEndpointRsyslogInputUpdateSettings.md)
 - [DbaasEndpointRsyslogOptionalFields](sdk/docs/DbaasEndpointRsyslogOptionalFields.md)
 - [DbaasEndpointRsyslogSecrets](sdk/docs/DbaasEndpointRsyslogSecrets.md)
 - [DbaasExternalEndpoint](sdk/docs/DbaasExternalEndpoint.md)
 - [DbaasExternalEndpointDatadogOutput](sdk/docs/DbaasExternalEndpointDatadogOutput.md)
 - [DbaasExternalEndpointDatadogOutputSettings](sdk/docs/DbaasExternalEndpointDatadogOutputSettings.md)
 - [DbaasExternalEndpointRsyslogOutput](sdk/docs/DbaasExternalEndpointRsyslogOutput.md)
 - [DbaasExternalIntegration](sdk/docs/DbaasExternalIntegration.md)
 - [DbaasIntegration](sdk/docs/DbaasIntegration.md)
 - [DbaasIntegrationSettingsDatadog](sdk/docs/DbaasIntegrationSettingsDatadog.md)
 - [DbaasIntegrationType](sdk/docs/DbaasIntegrationType.md)
 - [DbaasIntegrationTypeSettings](sdk/docs/DbaasIntegrationTypeSettings.md)
 - [DbaasKafkaAcls](sdk/docs/DbaasKafkaAcls.md)
 - [DbaasKafkaSchemaRegistryAclEntry](sdk/docs/DbaasKafkaSchemaRegistryAclEntry.md)
 - [DbaasKafkaTopicAclEntry](sdk/docs/DbaasKafkaTopicAclEntry.md)
 - [DbaasMigrationStatus](sdk/docs/DbaasMigrationStatus.md)
 - [DbaasMigrationStatusDetailsInner](sdk/docs/DbaasMigrationStatusDetailsInner.md)
 - [DbaasNodeState](sdk/docs/DbaasNodeState.md)
 - [DbaasNodeStateProgressUpdate](sdk/docs/DbaasNodeStateProgressUpdate.md)
 - [DbaasOpensearchAclConfig](sdk/docs/DbaasOpensearchAclConfig.md)
 - [DbaasOpensearchAclConfigAclsInner](sdk/docs/DbaasOpensearchAclConfigAclsInner.md)
 - [DbaasOpensearchAclConfigAclsInnerRulesInner](sdk/docs/DbaasOpensearchAclConfigAclsInnerRulesInner.md)
 - [DbaasPgTargetVersions](sdk/docs/DbaasPgTargetVersions.md)
 - [DbaasPlan](sdk/docs/DbaasPlan.md)
 - [DbaasPostgresUsers](sdk/docs/DbaasPostgresUsers.md)
 - [DbaasServiceBackup](sdk/docs/DbaasServiceBackup.md)
 - [DbaasServiceCommon](sdk/docs/DbaasServiceCommon.md)
 - [DbaasServiceComponents](sdk/docs/DbaasServiceComponents.md)
 - [DbaasServiceGrafana](sdk/docs/DbaasServiceGrafana.md)
 - [DbaasServiceGrafanaConnectionInfo](sdk/docs/DbaasServiceGrafanaConnectionInfo.md)
 - [DbaasServiceGrafanaUsersInner](sdk/docs/DbaasServiceGrafanaUsersInner.md)
 - [DbaasServiceKafka](sdk/docs/DbaasServiceKafka.md)
 - [DbaasServiceKafkaAuthenticationMethods](sdk/docs/DbaasServiceKafkaAuthenticationMethods.md)
 - [DbaasServiceKafkaComponentsInner](sdk/docs/DbaasServiceKafkaComponentsInner.md)
 - [DbaasServiceKafkaConnectionInfo](sdk/docs/DbaasServiceKafkaConnectionInfo.md)
 - [DbaasServiceKafkaUsersInner](sdk/docs/DbaasServiceKafkaUsersInner.md)
 - [DbaasServiceLogs](sdk/docs/DbaasServiceLogs.md)
 - [DbaasServiceLogsLogsInner](sdk/docs/DbaasServiceLogsLogsInner.md)
 - [DbaasServiceMaintenance](sdk/docs/DbaasServiceMaintenance.md)
 - [DbaasServiceMysql](sdk/docs/DbaasServiceMysql.md)
 - [DbaasServiceMysqlBackupSchedule](sdk/docs/DbaasServiceMysqlBackupSchedule.md)
 - [DbaasServiceMysqlComponentsInner](sdk/docs/DbaasServiceMysqlComponentsInner.md)
 - [DbaasServiceMysqlConnectionInfo](sdk/docs/DbaasServiceMysqlConnectionInfo.md)
 - [DbaasServiceMysqlPrometheusUri](sdk/docs/DbaasServiceMysqlPrometheusUri.md)
 - [DbaasServiceMysqlUsersInner](sdk/docs/DbaasServiceMysqlUsersInner.md)
 - [DbaasServiceNotification](sdk/docs/DbaasServiceNotification.md)
 - [DbaasServiceOpensearch](sdk/docs/DbaasServiceOpensearch.md)
 - [DbaasServiceOpensearchConnectionInfo](sdk/docs/DbaasServiceOpensearchConnectionInfo.md)
 - [DbaasServiceOpensearchIndexTemplate](sdk/docs/DbaasServiceOpensearchIndexTemplate.md)
 - [DbaasServicePg](sdk/docs/DbaasServicePg.md)
 - [DbaasServicePgConnectionInfo](sdk/docs/DbaasServicePgConnectionInfo.md)
 - [DbaasServicePgConnectionPoolsInner](sdk/docs/DbaasServicePgConnectionPoolsInner.md)
 - [DbaasServicePgUsersInner](sdk/docs/DbaasServicePgUsersInner.md)
 - [DbaasServiceThanos](sdk/docs/DbaasServiceThanos.md)
 - [DbaasServiceThanosComponentsInner](sdk/docs/DbaasServiceThanosComponentsInner.md)
 - [DbaasServiceThanosConnectionInfo](sdk/docs/DbaasServiceThanosConnectionInfo.md)
 - [DbaasServiceType](sdk/docs/DbaasServiceType.md)
 - [DbaasServiceUpdate](sdk/docs/DbaasServiceUpdate.md)
 - [DbaasServiceValkey](sdk/docs/DbaasServiceValkey.md)
 - [DbaasServiceValkeyConnectionInfo](sdk/docs/DbaasServiceValkeyConnectionInfo.md)
 - [DbaasServiceValkeyUsersInner](sdk/docs/DbaasServiceValkeyUsersInner.md)
 - [DbaasServiceValkeyUsersInnerAccessControl](sdk/docs/DbaasServiceValkeyUsersInnerAccessControl.md)
 - [DbaasTask](sdk/docs/DbaasTask.md)
 - [DbaasTaskResultCodesInner](sdk/docs/DbaasTaskResultCodesInner.md)
 - [DbaasUserGrafanaSecrets](sdk/docs/DbaasUserGrafanaSecrets.md)
 - [DbaasUserKafkaConnectSecrets](sdk/docs/DbaasUserKafkaConnectSecrets.md)
 - [DbaasUserKafkaSecrets](sdk/docs/DbaasUserKafkaSecrets.md)
 - [DbaasUserMysqlSecrets](sdk/docs/DbaasUserMysqlSecrets.md)
 - [DbaasUserOpensearchSecrets](sdk/docs/DbaasUserOpensearchSecrets.md)
 - [DbaasUserPostgresSecrets](sdk/docs/DbaasUserPostgresSecrets.md)
 - [DbaasUserValkeySecrets](sdk/docs/DbaasUserValkeySecrets.md)
 - [DeleteModelConflictResponse](sdk/docs/DeleteModelConflictResponse.md)
 - [DeployTarget](sdk/docs/DeployTarget.md)
 - [DetachDbaasServiceFromEndpointRequest](sdk/docs/DetachDbaasServiceFromEndpointRequest.md)
 - [DetachInstanceFromPrivateNetworkRequest](sdk/docs/DetachInstanceFromPrivateNetworkRequest.md)
 - [DnsDomain](sdk/docs/DnsDomain.md)
 - [DnsDomainRecord](sdk/docs/DnsDomainRecord.md)
 - [ElasticIp](sdk/docs/ElasticIp.md)
 - [ElasticIpHealthcheck](sdk/docs/ElasticIpHealthcheck.md)
 - [EnumComponentRoute](sdk/docs/EnumComponentRoute.md)
 - [EnumComponentUsage](sdk/docs/EnumComponentUsage.md)
 - [EnumDatadogSite](sdk/docs/EnumDatadogSite.md)
 - [EnumExternalEndpointTypes](sdk/docs/EnumExternalEndpointTypes.md)
 - [EnumIntegrationTypes](sdk/docs/EnumIntegrationTypes.md)
 - [EnumKafkaAuthMethod](sdk/docs/EnumKafkaAuthMethod.md)
 - [EnumMasterLinkStatus](sdk/docs/EnumMasterLinkStatus.md)
 - [EnumMigrationMethod](sdk/docs/EnumMigrationMethod.md)
 - [EnumMigrationStatus](sdk/docs/EnumMigrationStatus.md)
 - [EnumMysqlAuthenticationPlugin](sdk/docs/EnumMysqlAuthenticationPlugin.md)
 - [EnumOpensearchRulePermission](sdk/docs/EnumOpensearchRulePermission.md)
 - [EnumPgPoolMode](sdk/docs/EnumPgPoolMode.md)
 - [EnumPgSynchronousReplication](sdk/docs/EnumPgSynchronousReplication.md)
 - [EnumPgVariant](sdk/docs/EnumPgVariant.md)
 - [EnumRsyslogFormat](sdk/docs/EnumRsyslogFormat.md)
 - [EnumServiceState](sdk/docs/EnumServiceState.md)
 - [EnumSortOrder](sdk/docs/EnumSortOrder.md)
 - [EnvImpactDetail](sdk/docs/EnvImpactDetail.md)
 - [EnvImpactIndicator](sdk/docs/EnvImpactIndicator.md)
 - [EnvImpactReport](sdk/docs/EnvImpactReport.md)
 - [EnvMetadataEntry](sdk/docs/EnvMetadataEntry.md)
 - [EnvProduct](sdk/docs/EnvProduct.md)
 - [ErrorResponse](sdk/docs/ErrorResponse.md)
 - [Event](sdk/docs/Event.md)
 - [EvictInstancePoolMembersRequest](sdk/docs/EvictInstancePoolMembersRequest.md)
 - [EvictSksNodepoolMembersRequest](sdk/docs/EvictSksNodepoolMembersRequest.md)
 - [GenerateSksClusterKubeconfig200Response](sdk/docs/GenerateSksClusterKubeconfig200Response.md)
 - [GenericOAuthIntegration](sdk/docs/GenericOAuthIntegration.md)
 - [GetActiveNodepoolTemplate200Response](sdk/docs/GetActiveNodepoolTemplate200Response.md)
 - [GetConsoleProxyUrl200Response](sdk/docs/GetConsoleProxyUrl200Response.md)
 - [GetDbaasCaCertificate200Response](sdk/docs/GetDbaasCaCertificate200Response.md)
 - [GetDbaasExternalIntegrationSettingsDatadog200Response](sdk/docs/GetDbaasExternalIntegrationSettingsDatadog200Response.md)
 - [GetDbaasServiceLogsRequest](sdk/docs/GetDbaasServiceLogsRequest.md)
 - [GetDbaasServiceMetrics200Response](sdk/docs/GetDbaasServiceMetrics200Response.md)
 - [GetDbaasServiceMetricsRequest](sdk/docs/GetDbaasServiceMetricsRequest.md)
 - [GetDbaasSettingsGrafana200Response](sdk/docs/GetDbaasSettingsGrafana200Response.md)
 - [GetDbaasSettingsGrafana200ResponseSettings](sdk/docs/GetDbaasSettingsGrafana200ResponseSettings.md)
 - [GetDbaasSettingsGrafana200ResponseSettingsGrafana](sdk/docs/GetDbaasSettingsGrafana200ResponseSettingsGrafana.md)
 - [GetDbaasSettingsKafka200Response](sdk/docs/GetDbaasSettingsKafka200Response.md)
 - [GetDbaasSettingsKafka200ResponseSettings](sdk/docs/GetDbaasSettingsKafka200ResponseSettings.md)
 - [GetDbaasSettingsKafka200ResponseSettingsKafka](sdk/docs/GetDbaasSettingsKafka200ResponseSettingsKafka.md)
 - [GetDbaasSettingsKafka200ResponseSettingsKafkaConnect](sdk/docs/GetDbaasSettingsKafka200ResponseSettingsKafkaConnect.md)
 - [GetDbaasSettingsKafka200ResponseSettingsKafkaRest](sdk/docs/GetDbaasSettingsKafka200ResponseSettingsKafkaRest.md)
 - [GetDbaasSettingsKafka200ResponseSettingsSchemaRegistry](sdk/docs/GetDbaasSettingsKafka200ResponseSettingsSchemaRegistry.md)
 - [GetDbaasSettingsMysql200Response](sdk/docs/GetDbaasSettingsMysql200Response.md)
 - [GetDbaasSettingsMysql200ResponseSettings](sdk/docs/GetDbaasSettingsMysql200ResponseSettings.md)
 - [GetDbaasSettingsMysql200ResponseSettingsMysql](sdk/docs/GetDbaasSettingsMysql200ResponseSettingsMysql.md)
 - [GetDbaasSettingsOpensearch200Response](sdk/docs/GetDbaasSettingsOpensearch200Response.md)
 - [GetDbaasSettingsOpensearch200ResponseSettings](sdk/docs/GetDbaasSettingsOpensearch200ResponseSettings.md)
 - [GetDbaasSettingsOpensearch200ResponseSettingsOpensearch](sdk/docs/GetDbaasSettingsOpensearch200ResponseSettingsOpensearch.md)
 - [GetDbaasSettingsPg200Response](sdk/docs/GetDbaasSettingsPg200Response.md)
 - [GetDbaasSettingsPg200ResponseSettings](sdk/docs/GetDbaasSettingsPg200ResponseSettings.md)
 - [GetDbaasSettingsPg200ResponseSettingsPg](sdk/docs/GetDbaasSettingsPg200ResponseSettingsPg.md)
 - [GetDbaasSettingsPg200ResponseSettingsPgbouncer](sdk/docs/GetDbaasSettingsPg200ResponseSettingsPgbouncer.md)
 - [GetDbaasSettingsPg200ResponseSettingsPglookout](sdk/docs/GetDbaasSettingsPg200ResponseSettingsPglookout.md)
 - [GetDbaasSettingsPg200ResponseSettingsTimescaledb](sdk/docs/GetDbaasSettingsPg200ResponseSettingsTimescaledb.md)
 - [GetDbaasSettingsValkey200Response](sdk/docs/GetDbaasSettingsValkey200Response.md)
 - [GetDbaasSettingsValkey200ResponseSettings](sdk/docs/GetDbaasSettingsValkey200ResponseSettings.md)
 - [GetDbaasSettingsValkey200ResponseSettingsValkey](sdk/docs/GetDbaasSettingsValkey200ResponseSettingsValkey.md)
 - [GetDeploymentResponse](sdk/docs/GetDeploymentResponse.md)
 - [GetDnsDomainZoneFile200Response](sdk/docs/GetDnsDomainZoneFile200Response.md)
 - [GetModelResponse](sdk/docs/GetModelResponse.md)
 - [GetSksClusterAuthorityCert200Response](sdk/docs/GetSksClusterAuthorityCert200Response.md)
 - [GetSosPresignedUrl200Response](sdk/docs/GetSosPresignedUrl200Response.md)
 - [GetUsageReport200Response](sdk/docs/GetUsageReport200Response.md)
 - [GetUsageReport200ResponseUsageInner](sdk/docs/GetUsageReport200ResponseUsageInner.md)
 - [GitLabAuthIntegration](sdk/docs/GitLabAuthIntegration.md)
 - [GithubAuthIntegration](sdk/docs/GithubAuthIntegration.md)
 - [GoogleAuthIntegration](sdk/docs/GoogleAuthIntegration.md)
 - [GrafanaDateFormatSpecifications](sdk/docs/GrafanaDateFormatSpecifications.md)
 - [IPAddressRateLimitingSettings](sdk/docs/IPAddressRateLimitingSettings.md)
 - [IamApiKey](sdk/docs/IamApiKey.md)
 - [IamApiKeyCreated](sdk/docs/IamApiKeyCreated.md)
 - [IamPolicy](sdk/docs/IamPolicy.md)
 - [IamRole](sdk/docs/IamRole.md)
 - [IamServicePolicy](sdk/docs/IamServicePolicy.md)
 - [IamServicePolicyRule](sdk/docs/IamServicePolicyRule.md)
 - [Instance](sdk/docs/Instance.md)
 - [InstancePassword](sdk/docs/InstancePassword.md)
 - [InstancePool](sdk/docs/InstancePool.md)
 - [InstanceState](sdk/docs/InstanceState.md)
 - [InstanceTarget](sdk/docs/InstanceTarget.md)
 - [InstanceType](sdk/docs/InstanceType.md)
 - [InternalAuthenticationBackendLimiting](sdk/docs/InternalAuthenticationBackendLimiting.md)
 - [JsonSchemaGrafana](sdk/docs/JsonSchemaGrafana.md)
 - [JsonSchemaKafka](sdk/docs/JsonSchemaKafka.md)
 - [JsonSchemaKafkaConnect](sdk/docs/JsonSchemaKafkaConnect.md)
 - [JsonSchemaKafkaRest](sdk/docs/JsonSchemaKafkaRest.md)
 - [JsonSchemaMysql](sdk/docs/JsonSchemaMysql.md)
 - [JsonSchemaOpensearch](sdk/docs/JsonSchemaOpensearch.md)
 - [JsonSchemaPg](sdk/docs/JsonSchemaPg.md)
 - [JsonSchemaPgbouncer](sdk/docs/JsonSchemaPgbouncer.md)
 - [JsonSchemaPglookout](sdk/docs/JsonSchemaPglookout.md)
 - [JsonSchemaSchemaRegistry](sdk/docs/JsonSchemaSchemaRegistry.md)
 - [JsonSchemaThanos](sdk/docs/JsonSchemaThanos.md)
 - [JsonSchemaTimescaledb](sdk/docs/JsonSchemaTimescaledb.md)
 - [JsonSchemaValkey](sdk/docs/JsonSchemaValkey.md)
 - [KubeletImageGc](sdk/docs/KubeletImageGc.md)
 - [ListAntiAffinityGroups200Response](sdk/docs/ListAntiAffinityGroups200Response.md)
 - [ListApiKeys200Response](sdk/docs/ListApiKeys200Response.md)
 - [ListBlockStorageSnapshots200Response](sdk/docs/ListBlockStorageSnapshots200Response.md)
 - [ListBlockStorageVolumes200Response](sdk/docs/ListBlockStorageVolumes200Response.md)
 - [ListDbaasExternalEndpointTypes200Response](sdk/docs/ListDbaasExternalEndpointTypes200Response.md)
 - [ListDbaasExternalEndpointTypes200ResponseEndpointTypesInner](sdk/docs/ListDbaasExternalEndpointTypes200ResponseEndpointTypesInner.md)
 - [ListDbaasExternalEndpoints200Response](sdk/docs/ListDbaasExternalEndpoints200Response.md)
 - [ListDbaasExternalIntegrations200Response](sdk/docs/ListDbaasExternalIntegrations200Response.md)
 - [ListDbaasIntegrationSettings200Response](sdk/docs/ListDbaasIntegrationSettings200Response.md)
 - [ListDbaasIntegrationSettings200ResponseSettings](sdk/docs/ListDbaasIntegrationSettings200ResponseSettings.md)
 - [ListDbaasIntegrationTypes200Response](sdk/docs/ListDbaasIntegrationTypes200Response.md)
 - [ListDbaasServiceTypes200Response](sdk/docs/ListDbaasServiceTypes200Response.md)
 - [ListDbaasServices200Response](sdk/docs/ListDbaasServices200Response.md)
 - [ListDeployTargets200Response](sdk/docs/ListDeployTargets200Response.md)
 - [ListDeploymentsResponse](sdk/docs/ListDeploymentsResponse.md)
 - [ListDeploymentsResponseEntry](sdk/docs/ListDeploymentsResponseEntry.md)
 - [ListDnsDomainRecords200Response](sdk/docs/ListDnsDomainRecords200Response.md)
 - [ListDnsDomains200Response](sdk/docs/ListDnsDomains200Response.md)
 - [ListElasticIps200Response](sdk/docs/ListElasticIps200Response.md)
 - [ListIamRoles200Response](sdk/docs/ListIamRoles200Response.md)
 - [ListInstancePools200Response](sdk/docs/ListInstancePools200Response.md)
 - [ListInstanceTypes200Response](sdk/docs/ListInstanceTypes200Response.md)
 - [ListInstances200Response](sdk/docs/ListInstances200Response.md)
 - [ListInstances200ResponseInstancesInner](sdk/docs/ListInstances200ResponseInstancesInner.md)
 - [ListInstances200ResponseInstancesInnerPrivateNetworksInner](sdk/docs/ListInstances200ResponseInstancesInnerPrivateNetworksInner.md)
 - [ListLoadBalancers200Response](sdk/docs/ListLoadBalancers200Response.md)
 - [ListModelsResponse](sdk/docs/ListModelsResponse.md)
 - [ListModelsResponseEntry](sdk/docs/ListModelsResponseEntry.md)
 - [ListPrivateNetworks200Response](sdk/docs/ListPrivateNetworks200Response.md)
 - [ListQuotas200Response](sdk/docs/ListQuotas200Response.md)
 - [ListSecurityGroups200Response](sdk/docs/ListSecurityGroups200Response.md)
 - [ListSksClusterVersions200Response](sdk/docs/ListSksClusterVersions200Response.md)
 - [ListSksClusters200Response](sdk/docs/ListSksClusters200Response.md)
 - [ListSnapshots200Response](sdk/docs/ListSnapshots200Response.md)
 - [ListSosBucketsUsage200Response](sdk/docs/ListSosBucketsUsage200Response.md)
 - [ListSshKeys200Response](sdk/docs/ListSshKeys200Response.md)
 - [ListTemplates200Response](sdk/docs/ListTemplates200Response.md)
 - [ListUsers200Response](sdk/docs/ListUsers200Response.md)
 - [ListZones200Response](sdk/docs/ListZones200Response.md)
 - [LoadBalancer](sdk/docs/LoadBalancer.md)
 - [LoadBalancerServerStatus](sdk/docs/LoadBalancerServerStatus.md)
 - [LoadBalancerService](sdk/docs/LoadBalancerService.md)
 - [LoadBalancerServiceHealthcheck](sdk/docs/LoadBalancerServiceHealthcheck.md)
 - [Manager](sdk/docs/Manager.md)
 - [ModelRef](sdk/docs/ModelRef.md)
 - [Networking](sdk/docs/Networking.md)
 - [NodeDuressSettings](sdk/docs/NodeDuressSettings.md)
 - [OpensearchEmailSenderSettings](sdk/docs/OpensearchEmailSenderSettings.md)
 - [OpensearchISMHistorySettings](sdk/docs/OpensearchISMHistorySettings.md)
 - [OpensearchSecurityPluginSettings](sdk/docs/OpensearchSecurityPluginSettings.md)
 - [OperatingFactor](sdk/docs/OperatingFactor.md)
 - [Operation](sdk/docs/Operation.md)
 - [OperationReference](sdk/docs/OperationReference.md)
 - [Organization](sdk/docs/Organization.md)
 - [PrimaryParameter](sdk/docs/PrimaryParameter.md)
 - [PrimaryParameterNode](sdk/docs/PrimaryParameterNode.md)
 - [PrimaryParameterShard](sdk/docs/PrimaryParameterShard.md)
 - [PrivateNetwork](sdk/docs/PrivateNetwork.md)
 - [PrivateNetworkLease](sdk/docs/PrivateNetworkLease.md)
 - [PrivateNetworkOptions](sdk/docs/PrivateNetworkOptions.md)
 - [PromoteSnapshotToTemplateRequest](sdk/docs/PromoteSnapshotToTemplateRequest.md)
 - [PublicIpAssignment](sdk/docs/PublicIpAssignment.md)
 - [Quota](sdk/docs/Quota.md)
 - [RegisterSshKeyRequest](sdk/docs/RegisterSshKeyRequest.md)
 - [RegisterTemplateRequest](sdk/docs/RegisterTemplateRequest.md)
 - [RemoveExternalSourceFromSecurityGroupRequest](sdk/docs/RemoveExternalSourceFromSecurityGroupRequest.md)
 - [ResetDbaasMysqlUserPasswordRequest](sdk/docs/ResetDbaasMysqlUserPasswordRequest.md)
 - [ResetDbaasValkeyUserPasswordRequest](sdk/docs/ResetDbaasValkeyUserPasswordRequest.md)
 - [ResetInstanceRequest](sdk/docs/ResetInstanceRequest.md)
 - [ResizeBlockStorageVolumeRequest](sdk/docs/ResizeBlockStorageVolumeRequest.md)
 - [ResizeInstanceDiskRequest](sdk/docs/ResizeInstanceDiskRequest.md)
 - [Resource](sdk/docs/Resource.md)
 - [RevealDeploymentApiKeyResponse](sdk/docs/RevealDeploymentApiKeyResponse.md)
 - [ReverseDnsRecord](sdk/docs/ReverseDnsRecord.md)
 - [RevertInstanceToSnapshotRequest](sdk/docs/RevertInstanceToSnapshotRequest.md)
 - [SMTPServerSettings](sdk/docs/SMTPServerSettings.md)
 - [ScaleDeploymentRequest](sdk/docs/ScaleDeploymentRequest.md)
 - [ScaleInstancePoolRequest](sdk/docs/ScaleInstancePoolRequest.md)
 - [ScaleInstanceRequest](sdk/docs/ScaleInstanceRequest.md)
 - [ScaleSksNodepoolRequest](sdk/docs/ScaleSksNodepoolRequest.md)
 - [SearchBackpressureSettings](sdk/docs/SearchBackpressureSettings.md)
 - [SearchShardSettings](sdk/docs/SearchShardSettings.md)
 - [SearchTaskSettings](sdk/docs/SearchTaskSettings.md)
 - [SecurityGroup](sdk/docs/SecurityGroup.md)
 - [SecurityGroupResource](sdk/docs/SecurityGroupResource.md)
 - [SecurityGroupRule](sdk/docs/SecurityGroupRule.md)
 - [SecurityGroupRuleIcmp](sdk/docs/SecurityGroupRuleIcmp.md)
 - [ShardIndexingBackPressureSettings](sdk/docs/ShardIndexingBackPressureSettings.md)
 - [SksAudit](sdk/docs/SksAudit.md)
 - [SksAuditCreate](sdk/docs/SksAuditCreate.md)
 - [SksAuditUpdate](sdk/docs/SksAuditUpdate.md)
 - [SksCluster](sdk/docs/SksCluster.md)
 - [SksClusterDeprecatedResource](sdk/docs/SksClusterDeprecatedResource.md)
 - [SksKubeconfigRequest](sdk/docs/SksKubeconfigRequest.md)
 - [SksNodepool](sdk/docs/SksNodepool.md)
 - [SksNodepoolTaint](sdk/docs/SksNodepoolTaint.md)
 - [SksOidc](sdk/docs/SksOidc.md)
 - [Snapshot](sdk/docs/Snapshot.md)
 - [SnapshotExport](sdk/docs/SnapshotExport.md)
 - [SosBucketUsage](sdk/docs/SosBucketUsage.md)
 - [SshKey](sdk/docs/SshKey.md)
 - [StartInstanceRequest](sdk/docs/StartInstanceRequest.md)
 - [Template](sdk/docs/Template.md)
 - [ThanosCompactorUserConfig](sdk/docs/ThanosCompactorUserConfig.md)
 - [ThanosQueryFrontendUserConfig](sdk/docs/ThanosQueryFrontendUserConfig.md)
 - [ThanosQueryUserConfig](sdk/docs/ThanosQueryUserConfig.md)
 - [UpdateBlockStorageSnapshotRequest](sdk/docs/UpdateBlockStorageSnapshotRequest.md)
 - [UpdateBlockStorageVolumeRequest](sdk/docs/UpdateBlockStorageVolumeRequest.md)
 - [UpdateDbaasIntegrationRequest](sdk/docs/UpdateDbaasIntegrationRequest.md)
 - [UpdateDbaasPgConnectionPoolRequest](sdk/docs/UpdateDbaasPgConnectionPoolRequest.md)
 - [UpdateDbaasPostgresAllowReplicationRequest](sdk/docs/UpdateDbaasPostgresAllowReplicationRequest.md)
 - [UpdateDbaasServiceGrafanaRequest](sdk/docs/UpdateDbaasServiceGrafanaRequest.md)
 - [UpdateDbaasServiceKafkaRequest](sdk/docs/UpdateDbaasServiceKafkaRequest.md)
 - [UpdateDbaasServiceKafkaRequestAuthenticationMethods](sdk/docs/UpdateDbaasServiceKafkaRequestAuthenticationMethods.md)
 - [UpdateDbaasServiceMysqlRequest](sdk/docs/UpdateDbaasServiceMysqlRequest.md)
 - [UpdateDbaasServiceMysqlRequestBackupSchedule](sdk/docs/UpdateDbaasServiceMysqlRequestBackupSchedule.md)
 - [UpdateDbaasServiceMysqlRequestMaintenance](sdk/docs/UpdateDbaasServiceMysqlRequestMaintenance.md)
 - [UpdateDbaasServiceMysqlRequestMigration](sdk/docs/UpdateDbaasServiceMysqlRequestMigration.md)
 - [UpdateDbaasServiceOpensearchRequest](sdk/docs/UpdateDbaasServiceOpensearchRequest.md)
 - [UpdateDbaasServiceOpensearchRequestIndexPatternsInner](sdk/docs/UpdateDbaasServiceOpensearchRequestIndexPatternsInner.md)
 - [UpdateDbaasServiceOpensearchRequestIndexTemplate](sdk/docs/UpdateDbaasServiceOpensearchRequestIndexTemplate.md)
 - [UpdateDbaasServiceOpensearchRequestOpensearchDashboards](sdk/docs/UpdateDbaasServiceOpensearchRequestOpensearchDashboards.md)
 - [UpdateDbaasServicePgRequest](sdk/docs/UpdateDbaasServicePgRequest.md)
 - [UpdateDbaasServiceValkeyRequest](sdk/docs/UpdateDbaasServiceValkeyRequest.md)
 - [UpdateDnsDomainRecordRequest](sdk/docs/UpdateDnsDomainRecordRequest.md)
 - [UpdateElasticIpRequest](sdk/docs/UpdateElasticIpRequest.md)
 - [UpdateIamRoleRequest](sdk/docs/UpdateIamRoleRequest.md)
 - [UpdateInstancePoolRequest](sdk/docs/UpdateInstancePoolRequest.md)
 - [UpdateInstanceRequest](sdk/docs/UpdateInstanceRequest.md)
 - [UpdateLoadBalancerRequest](sdk/docs/UpdateLoadBalancerRequest.md)
 - [UpdateLoadBalancerServiceRequest](sdk/docs/UpdateLoadBalancerServiceRequest.md)
 - [UpdatePrivateNetworkInstanceIpRequest](sdk/docs/UpdatePrivateNetworkInstanceIpRequest.md)
 - [UpdatePrivateNetworkInstanceIpRequestInstance](sdk/docs/UpdatePrivateNetworkInstanceIpRequestInstance.md)
 - [UpdatePrivateNetworkRequest](sdk/docs/UpdatePrivateNetworkRequest.md)
 - [UpdateReverseDnsElasticIpRequest](sdk/docs/UpdateReverseDnsElasticIpRequest.md)
 - [UpdateSksClusterRequest](sdk/docs/UpdateSksClusterRequest.md)
 - [UpdateSksNodepoolRequest](sdk/docs/UpdateSksNodepoolRequest.md)
 - [UpdateTemplateRequest](sdk/docs/UpdateTemplateRequest.md)
 - [UpdateUserRoleRequest](sdk/docs/UpdateUserRoleRequest.md)
 - [UpgradeSksClusterRequest](sdk/docs/UpgradeSksClusterRequest.md)
 - [User](sdk/docs/User.md)
 - [WriteAheadLogWALSettings](sdk/docs/WriteAheadLogWALSettings.md)
 - [Zone](sdk/docs/Zone.md)
 - [ZoneName](sdk/docs/ZoneName.md)





## Author

support@exoscale.ch
