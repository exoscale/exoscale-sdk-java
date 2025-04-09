# ExoscaleApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addExternalSourceToSecurityGroup**](ExoscaleApi.md#addExternalSourceToSecurityGroup) | **PUT** /security-group/{id}:add-source | Add an external source as a member of a Security Group |
| [**addInstanceProtection**](ExoscaleApi.md#addInstanceProtection) | **PUT** /instance/{id}:add-protection | Set instance destruction protection |
| [**addRuleToSecurityGroup**](ExoscaleApi.md#addRuleToSecurityGroup) | **POST** /security-group/{id}/rules | Create a Security Group rule |
| [**addServiceToLoadBalancer**](ExoscaleApi.md#addServiceToLoadBalancer) | **POST** /load-balancer/{id}/service | Add a Load Balancer Service |
| [**attachBlockStorageVolumeToInstance**](ExoscaleApi.md#attachBlockStorageVolumeToInstance) | **PUT** /block-storage/{id}:attach | Attach block storage volume to an instance |
| [**attachDbaasServiceToEndpoint**](ExoscaleApi.md#attachDbaasServiceToEndpoint) | **PUT** /dbaas-external-endpoint/{source-service-name}/attach |  |
| [**attachInstanceToElasticIp**](ExoscaleApi.md#attachInstanceToElasticIp) | **PUT** /elastic-ip/{id}:attach | Attach a Compute instance to an Elastic IP |
| [**attachInstanceToPrivateNetwork**](ExoscaleApi.md#attachInstanceToPrivateNetwork) | **PUT** /private-network/{id}:attach | Attach a Compute instance to a Private Network |
| [**attachInstanceToSecurityGroup**](ExoscaleApi.md#attachInstanceToSecurityGroup) | **PUT** /security-group/{id}:attach | Attach a Compute instance to a Security Group |
| [**copyTemplate**](ExoscaleApi.md#copyTemplate) | **POST** /template/{id} | Copy a Template from a zone to another |
| [**createAntiAffinityGroup**](ExoscaleApi.md#createAntiAffinityGroup) | **POST** /anti-affinity-group | Create an Anti-affinity Group |
| [**createApiKey**](ExoscaleApi.md#createApiKey) | **POST** /api-key | Create a new API key |
| [**createBlockStorageSnapshot**](ExoscaleApi.md#createBlockStorageSnapshot) | **POST** /block-storage/{id}:create-snapshot | Create a block storage snapshot |
| [**createBlockStorageVolume**](ExoscaleApi.md#createBlockStorageVolume) | **POST** /block-storage | Create a block storage volume |
| [**createDbaasExternalEndpointDatadog**](ExoscaleApi.md#createDbaasExternalEndpointDatadog) | **POST** /dbaas-external-endpoint-datadog/{name} |  |
| [**createDbaasExternalEndpointElasticsearch**](ExoscaleApi.md#createDbaasExternalEndpointElasticsearch) | **POST** /dbaas-external-endpoint-elasticsearch/{name} |  |
| [**createDbaasExternalEndpointOpensearch**](ExoscaleApi.md#createDbaasExternalEndpointOpensearch) | **POST** /dbaas-external-endpoint-opensearch/{name} |  |
| [**createDbaasExternalEndpointPrometheus**](ExoscaleApi.md#createDbaasExternalEndpointPrometheus) | **POST** /dbaas-external-endpoint-prometheus/{name} |  |
| [**createDbaasExternalEndpointRsyslog**](ExoscaleApi.md#createDbaasExternalEndpointRsyslog) | **POST** /dbaas-external-endpoint-rsyslog/{name} |  |
| [**createDbaasIntegration**](ExoscaleApi.md#createDbaasIntegration) | **POST** /dbaas-integration |  |
| [**createDbaasKafkaSchemaRegistryAclConfig**](ExoscaleApi.md#createDbaasKafkaSchemaRegistryAclConfig) | **POST** /dbaas-kafka/{name}/schema-registry/acl-config | Add a Kafka Schema Registry ACL entry |
| [**createDbaasKafkaTopicAclConfig**](ExoscaleApi.md#createDbaasKafkaTopicAclConfig) | **POST** /dbaas-kafka/{name}/topic/acl-config | Add a Kafka topic ACL entry |
| [**createDbaasKafkaUser**](ExoscaleApi.md#createDbaasKafkaUser) | **POST** /dbaas-kafka/{service-name}/user | Create a DBaaS Kafka user |
| [**createDbaasMysqlDatabase**](ExoscaleApi.md#createDbaasMysqlDatabase) | **POST** /dbaas-mysql/{service-name}/database | Create a DBaaS MySQL database |
| [**createDbaasMysqlUser**](ExoscaleApi.md#createDbaasMysqlUser) | **POST** /dbaas-mysql/{service-name}/user | Create a DBaaS MySQL user |
| [**createDbaasOpensearchUser**](ExoscaleApi.md#createDbaasOpensearchUser) | **POST** /dbaas-opensearch/{service-name}/user | Create a DBaaS OpenSearch user |
| [**createDbaasPgConnectionPool**](ExoscaleApi.md#createDbaasPgConnectionPool) | **POST** /dbaas-postgres/{service-name}/connection-pool | Create a DBaaS PostgreSQL connection pool |
| [**createDbaasPgDatabase**](ExoscaleApi.md#createDbaasPgDatabase) | **POST** /dbaas-postgres/{service-name}/database | Create a DBaaS Postgres database |
| [**createDbaasPgUpgradeCheck**](ExoscaleApi.md#createDbaasPgUpgradeCheck) | **POST** /dbaas-postgres/{service}/upgrade-check |  |
| [**createDbaasPostgresUser**](ExoscaleApi.md#createDbaasPostgresUser) | **POST** /dbaas-postgres/{service-name}/user | Create a DBaaS Postgres user |
| [**createDbaasRedisUser**](ExoscaleApi.md#createDbaasRedisUser) | **POST** /dbaas-redis/{service-name}/user | Create a DBaaS Redis user |
| [**createDbaasServiceGrafana**](ExoscaleApi.md#createDbaasServiceGrafana) | **POST** /dbaas-grafana/{name} |  |
| [**createDbaasServiceKafka**](ExoscaleApi.md#createDbaasServiceKafka) | **POST** /dbaas-kafka/{name} | Create a DBaaS Kafka service |
| [**createDbaasServiceMysql**](ExoscaleApi.md#createDbaasServiceMysql) | **POST** /dbaas-mysql/{name} | Create a DBaaS MySQL service |
| [**createDbaasServiceOpensearch**](ExoscaleApi.md#createDbaasServiceOpensearch) | **POST** /dbaas-opensearch/{name} | Create a DBaaS OpenSearch service |
| [**createDbaasServicePg**](ExoscaleApi.md#createDbaasServicePg) | **POST** /dbaas-postgres/{name} | Create a DBaaS PostgreSQL service |
| [**createDbaasServiceRedis**](ExoscaleApi.md#createDbaasServiceRedis) | **POST** /dbaas-redis/{name} | Create a DBaaS Redis service |
| [**createDbaasServiceValkey**](ExoscaleApi.md#createDbaasServiceValkey) | **POST** /dbaas-valkey/{name} | Create a DBaaS Valkey service |
| [**createDbaasTaskMigrationCheck**](ExoscaleApi.md#createDbaasTaskMigrationCheck) | **POST** /dbaas-task-migration-check/{service} |  |
| [**createDbaasValkeyUser**](ExoscaleApi.md#createDbaasValkeyUser) | **POST** /dbaas-valkey/{service-name}/user | Create a DBaaS Valkey user |
| [**createDnsDomain**](ExoscaleApi.md#createDnsDomain) | **POST** /dns-domain | Create DNS domain |
| [**createDnsDomainRecord**](ExoscaleApi.md#createDnsDomainRecord) | **POST** /dns-domain/{domain-id}/record | Create DNS domain record |
| [**createElasticIp**](ExoscaleApi.md#createElasticIp) | **POST** /elastic-ip | Create an Elastic IP |
| [**createIamRole**](ExoscaleApi.md#createIamRole) | **POST** /iam-role | Create IAM Role |
| [**createInstance**](ExoscaleApi.md#createInstance) | **POST** /instance | Create a Compute instance |
| [**createInstancePool**](ExoscaleApi.md#createInstancePool) | **POST** /instance-pool | Create an Instance Pool |
| [**createLoadBalancer**](ExoscaleApi.md#createLoadBalancer) | **POST** /load-balancer | Create a Load Balancer |
| [**createPrivateNetwork**](ExoscaleApi.md#createPrivateNetwork) | **POST** /private-network | Create a Private Network |
| [**createSecurityGroup**](ExoscaleApi.md#createSecurityGroup) | **POST** /security-group | Create a Security Group |
| [**createSksCluster**](ExoscaleApi.md#createSksCluster) | **POST** /sks-cluster | Create an SKS cluster |
| [**createSksNodepool**](ExoscaleApi.md#createSksNodepool) | **POST** /sks-cluster/{id}/nodepool | Create a new SKS Nodepool |
| [**createSnapshot**](ExoscaleApi.md#createSnapshot) | **POST** /instance/{id}:create-snapshot | Create a Snapshot of a Compute instance |
| [**createUser**](ExoscaleApi.md#createUser) | **POST** /user | Create a User |
| [**deleteAntiAffinityGroup**](ExoscaleApi.md#deleteAntiAffinityGroup) | **DELETE** /anti-affinity-group/{id} | Delete an Anti-affinity Group |
| [**deleteApiKey**](ExoscaleApi.md#deleteApiKey) | **DELETE** /api-key/{id} | Delete an API key |
| [**deleteBlockStorageSnapshot**](ExoscaleApi.md#deleteBlockStorageSnapshot) | **DELETE** /block-storage-snapshot/{id} | Delete a block storage snapshot, data will be unrecoverable |
| [**deleteBlockStorageVolume**](ExoscaleApi.md#deleteBlockStorageVolume) | **DELETE** /block-storage/{id} | Delete a block storage volume, data will be unrecoverable |
| [**deleteDbaasExternalEndpointDatadog**](ExoscaleApi.md#deleteDbaasExternalEndpointDatadog) | **DELETE** /dbaas-external-endpoint-datadog/{endpoint-id} |  |
| [**deleteDbaasExternalEndpointElasticsearch**](ExoscaleApi.md#deleteDbaasExternalEndpointElasticsearch) | **DELETE** /dbaas-external-endpoint-elasticsearch/{endpoint-id} |  |
| [**deleteDbaasExternalEndpointOpensearch**](ExoscaleApi.md#deleteDbaasExternalEndpointOpensearch) | **DELETE** /dbaas-external-endpoint-opensearch/{endpoint-id} |  |
| [**deleteDbaasExternalEndpointPrometheus**](ExoscaleApi.md#deleteDbaasExternalEndpointPrometheus) | **DELETE** /dbaas-external-endpoint-prometheus/{endpoint-id} |  |
| [**deleteDbaasExternalEndpointRsyslog**](ExoscaleApi.md#deleteDbaasExternalEndpointRsyslog) | **DELETE** /dbaas-external-endpoint-rsyslog/{endpoint-id} |  |
| [**deleteDbaasIntegration**](ExoscaleApi.md#deleteDbaasIntegration) | **DELETE** /dbaas-integration/{id} |  |
| [**deleteDbaasKafkaSchemaRegistryAclConfig**](ExoscaleApi.md#deleteDbaasKafkaSchemaRegistryAclConfig) | **DELETE** /dbaas-kafka/{name}/schema-registry/acl-config/{acl-id} | Delete a Kafka ACL entry |
| [**deleteDbaasKafkaTopicAclConfig**](ExoscaleApi.md#deleteDbaasKafkaTopicAclConfig) | **DELETE** /dbaas-kafka/{name}/topic/acl-config/{acl-id} | Delete a Kafka ACL entry |
| [**deleteDbaasKafkaUser**](ExoscaleApi.md#deleteDbaasKafkaUser) | **DELETE** /dbaas-kafka/{service-name}/user/{username} | Delete a DBaaS kafka user |
| [**deleteDbaasMysqlDatabase**](ExoscaleApi.md#deleteDbaasMysqlDatabase) | **DELETE** /dbaas-mysql/{service-name}/database/{database-name} | Delete a DBaaS MySQL database |
| [**deleteDbaasMysqlUser**](ExoscaleApi.md#deleteDbaasMysqlUser) | **DELETE** /dbaas-mysql/{service-name}/user/{username} | Delete a DBaaS MySQL user |
| [**deleteDbaasOpensearchUser**](ExoscaleApi.md#deleteDbaasOpensearchUser) | **DELETE** /dbaas-opensearch/{service-name}/user/{username} | Delete a DBaaS OpenSearch user |
| [**deleteDbaasPgConnectionPool**](ExoscaleApi.md#deleteDbaasPgConnectionPool) | **DELETE** /dbaas-postgres/{service-name}/connection-pool/{connection-pool-name} | Delete a DBaaS PostgreSQL connection pool |
| [**deleteDbaasPgDatabase**](ExoscaleApi.md#deleteDbaasPgDatabase) | **DELETE** /dbaas-postgres/{service-name}/database/{database-name} | Delete a DBaaS Postgres database |
| [**deleteDbaasPostgresUser**](ExoscaleApi.md#deleteDbaasPostgresUser) | **DELETE** /dbaas-postgres/{service-name}/user/{username} | Delete a DBaaS Postgres user |
| [**deleteDbaasRedisUser**](ExoscaleApi.md#deleteDbaasRedisUser) | **DELETE** /dbaas-redis/{service-name}/user/{username} | Delete a DBaaS Redis user |
| [**deleteDbaasService**](ExoscaleApi.md#deleteDbaasService) | **DELETE** /dbaas-service/{name} | Delete a DBaaS service |
| [**deleteDbaasServiceGrafana**](ExoscaleApi.md#deleteDbaasServiceGrafana) | **DELETE** /dbaas-grafana/{name} | Delete a Grafana service |
| [**deleteDbaasServiceKafka**](ExoscaleApi.md#deleteDbaasServiceKafka) | **DELETE** /dbaas-kafka/{name} | Delete a Kafka service |
| [**deleteDbaasServiceMysql**](ExoscaleApi.md#deleteDbaasServiceMysql) | **DELETE** /dbaas-mysql/{name} | Delete a MySQL service |
| [**deleteDbaasServiceOpensearch**](ExoscaleApi.md#deleteDbaasServiceOpensearch) | **DELETE** /dbaas-opensearch/{name} | Delete a OpenSearch service |
| [**deleteDbaasServicePg**](ExoscaleApi.md#deleteDbaasServicePg) | **DELETE** /dbaas-postgres/{name} | Delete a Postgres service |
| [**deleteDbaasServiceRedis**](ExoscaleApi.md#deleteDbaasServiceRedis) | **DELETE** /dbaas-redis/{name} | Delete a Redis service |
| [**deleteDbaasServiceValkey**](ExoscaleApi.md#deleteDbaasServiceValkey) | **DELETE** /dbaas-valkey/{name} | Delete a Valkey service |
| [**deleteDbaasValkeyUser**](ExoscaleApi.md#deleteDbaasValkeyUser) | **DELETE** /dbaas-valkey/{service-name}/user/{username} | Delete a DBaaS Valkey user |
| [**deleteDnsDomain**](ExoscaleApi.md#deleteDnsDomain) | **DELETE** /dns-domain/{id} | Delete DNS Domain |
| [**deleteDnsDomainRecord**](ExoscaleApi.md#deleteDnsDomainRecord) | **DELETE** /dns-domain/{domain-id}/record/{record-id} | Delete DNS domain record |
| [**deleteElasticIp**](ExoscaleApi.md#deleteElasticIp) | **DELETE** /elastic-ip/{id} | Delete an Elastic IP |
| [**deleteIamRole**](ExoscaleApi.md#deleteIamRole) | **DELETE** /iam-role/{id} | Delete IAM Role |
| [**deleteInstance**](ExoscaleApi.md#deleteInstance) | **DELETE** /instance/{id} | Delete a Compute instance |
| [**deleteInstancePool**](ExoscaleApi.md#deleteInstancePool) | **DELETE** /instance-pool/{id} | Delete an Instance Pool |
| [**deleteLoadBalancer**](ExoscaleApi.md#deleteLoadBalancer) | **DELETE** /load-balancer/{id} | Delete a Load Balancer |
| [**deleteLoadBalancerService**](ExoscaleApi.md#deleteLoadBalancerService) | **DELETE** /load-balancer/{id}/service/{service-id} | Delete a Load Balancer Service |
| [**deletePrivateNetwork**](ExoscaleApi.md#deletePrivateNetwork) | **DELETE** /private-network/{id} | Delete a Private Network |
| [**deleteReverseDnsElasticIp**](ExoscaleApi.md#deleteReverseDnsElasticIp) | **DELETE** /reverse-dns/elastic-ip/{id} | Delete the PTR DNS record for an elastic IP |
| [**deleteReverseDnsInstance**](ExoscaleApi.md#deleteReverseDnsInstance) | **DELETE** /reverse-dns/instance/{id} | Delete the PTR DNS record for an instance |
| [**deleteRuleFromSecurityGroup**](ExoscaleApi.md#deleteRuleFromSecurityGroup) | **DELETE** /security-group/{id}/rules/{rule-id} | Delete a Security Group rule |
| [**deleteSecurityGroup**](ExoscaleApi.md#deleteSecurityGroup) | **DELETE** /security-group/{id} | Delete a Security Group |
| [**deleteSksCluster**](ExoscaleApi.md#deleteSksCluster) | **DELETE** /sks-cluster/{id} | Delete an SKS cluster |
| [**deleteSksNodepool**](ExoscaleApi.md#deleteSksNodepool) | **DELETE** /sks-cluster/{id}/nodepool/{sks-nodepool-id} | Delete an SKS Nodepool |
| [**deleteSnapshot**](ExoscaleApi.md#deleteSnapshot) | **DELETE** /snapshot/{id} | Delete a Snapshot |
| [**deleteSshKey**](ExoscaleApi.md#deleteSshKey) | **DELETE** /ssh-key/{name} | Delete a SSH key |
| [**deleteTemplate**](ExoscaleApi.md#deleteTemplate) | **DELETE** /template/{id} | Delete a Template |
| [**deleteUser**](ExoscaleApi.md#deleteUser) | **DELETE** /user/{id} | Delete User |
| [**detachBlockStorageVolume**](ExoscaleApi.md#detachBlockStorageVolume) | **PUT** /block-storage/{id}:detach | Detach block storage volume |
| [**detachDbaasServiceFromEndpoint**](ExoscaleApi.md#detachDbaasServiceFromEndpoint) | **PUT** /dbaas-external-endpoint/{source-service-name}/detach |  |
| [**detachInstanceFromElasticIp**](ExoscaleApi.md#detachInstanceFromElasticIp) | **PUT** /elastic-ip/{id}:detach | Detach a Compute instance from an Elastic IP |
| [**detachInstanceFromPrivateNetwork**](ExoscaleApi.md#detachInstanceFromPrivateNetwork) | **PUT** /private-network/{id}:detach | Detach a Compute instance from a Private Network |
| [**detachInstanceFromSecurityGroup**](ExoscaleApi.md#detachInstanceFromSecurityGroup) | **PUT** /security-group/{id}:detach | Detach a Compute instance from a Security Group |
| [**enableDbaasMysqlWrites**](ExoscaleApi.md#enableDbaasMysqlWrites) | **PUT** /dbaas-mysql/{name}/enable/writes | Temporarily enable writes for MySQL services in read-only mode due to filled up storage |
| [**enableTpm**](ExoscaleApi.md#enableTpm) | **POST** /instance/{id}:enable-tpm | [Beta] Enable tpm for the instance. |
| [**evictInstancePoolMembers**](ExoscaleApi.md#evictInstancePoolMembers) | **PUT** /instance-pool/{id}:evict | Evict Instance Pool members |
| [**evictSksNodepoolMembers**](ExoscaleApi.md#evictSksNodepoolMembers) | **PUT** /sks-cluster/{id}/nodepool/{sks-nodepool-id}:evict | Evict Nodepool members |
| [**exportSnapshot**](ExoscaleApi.md#exportSnapshot) | **POST** /snapshot/{id}:export | Export a Snapshot |
| [**generateSksClusterKubeconfig**](ExoscaleApi.md#generateSksClusterKubeconfig) | **POST** /sks-cluster-kubeconfig/{id} | Generate a new Kubeconfig file for a SKS cluster |
| [**getAntiAffinityGroup**](ExoscaleApi.md#getAntiAffinityGroup) | **GET** /anti-affinity-group/{id} | Retrieve Anti-affinity Group details |
| [**getApiKey**](ExoscaleApi.md#getApiKey) | **GET** /api-key/{id} | Get API key |
| [**getBlockStorageSnapshot**](ExoscaleApi.md#getBlockStorageSnapshot) | **GET** /block-storage-snapshot/{id} | Retrieve block storage snapshot details |
| [**getBlockStorageVolume**](ExoscaleApi.md#getBlockStorageVolume) | **GET** /block-storage/{id} | Retrieve block storage volume details |
| [**getConsoleProxyUrl**](ExoscaleApi.md#getConsoleProxyUrl) | **GET** /console/{id} | Retrieve signed url valid for 60 seconds to connect via console-proxy websocket to VM VNC console. |
| [**getDbaasCaCertificate**](ExoscaleApi.md#getDbaasCaCertificate) | **GET** /dbaas-ca-certificate | Get DBaaS CA Certificate |
| [**getDbaasExternalEndpointDatadog**](ExoscaleApi.md#getDbaasExternalEndpointDatadog) | **GET** /dbaas-external-endpoint-datadog/{endpoint-id} |  |
| [**getDbaasExternalEndpointElasticsearch**](ExoscaleApi.md#getDbaasExternalEndpointElasticsearch) | **GET** /dbaas-external-endpoint-elasticsearch/{endpoint-id} |  |
| [**getDbaasExternalEndpointOpensearch**](ExoscaleApi.md#getDbaasExternalEndpointOpensearch) | **GET** /dbaas-external-endpoint-opensearch/{endpoint-id} |  |
| [**getDbaasExternalEndpointPrometheus**](ExoscaleApi.md#getDbaasExternalEndpointPrometheus) | **GET** /dbaas-external-endpoint-prometheus/{endpoint-id} |  |
| [**getDbaasExternalEndpointRsyslog**](ExoscaleApi.md#getDbaasExternalEndpointRsyslog) | **GET** /dbaas-external-endpoint-rsyslog/{endpoint-id} |  |
| [**getDbaasExternalIntegration**](ExoscaleApi.md#getDbaasExternalIntegration) | **GET** /dbaas-external-integration/{integration-id} |  |
| [**getDbaasExternalIntegrationSettingsDatadog**](ExoscaleApi.md#getDbaasExternalIntegrationSettingsDatadog) | **GET** /dbaas-external-integration-settings-datadog/{integration-id} |  |
| [**getDbaasIntegration**](ExoscaleApi.md#getDbaasIntegration) | **GET** /dbaas-integration/{id} |  |
| [**getDbaasKafkaAclConfig**](ExoscaleApi.md#getDbaasKafkaAclConfig) | **GET** /dbaas-kafka/{name}/acl-config | Get DBaaS kafka ACL configuration |
| [**getDbaasMigrationStatus**](ExoscaleApi.md#getDbaasMigrationStatus) | **GET** /dbaas-migration-status/{name} | Get a DBaaS migration status |
| [**getDbaasOpensearchAclConfig**](ExoscaleApi.md#getDbaasOpensearchAclConfig) | **GET** /dbaas-opensearch/{name}/acl-config | Get DBaaS OpenSearch ACL configuration |
| [**getDbaasServiceGrafana**](ExoscaleApi.md#getDbaasServiceGrafana) | **GET** /dbaas-grafana/{name} | Get a DBaaS Grafana service |
| [**getDbaasServiceKafka**](ExoscaleApi.md#getDbaasServiceKafka) | **GET** /dbaas-kafka/{name} | Get a DBaaS Kafka service |
| [**getDbaasServiceLogs**](ExoscaleApi.md#getDbaasServiceLogs) | **POST** /dbaas-service-logs/{service-name} | Get logs of DBaaS service |
| [**getDbaasServiceMetrics**](ExoscaleApi.md#getDbaasServiceMetrics) | **POST** /dbaas-service-metrics/{service-name} | Get metrics of DBaaS service |
| [**getDbaasServiceMysql**](ExoscaleApi.md#getDbaasServiceMysql) | **GET** /dbaas-mysql/{name} | Get a DBaaS MySQL service |
| [**getDbaasServiceOpensearch**](ExoscaleApi.md#getDbaasServiceOpensearch) | **GET** /dbaas-opensearch/{name} | Get a DBaaS OpenSearch service |
| [**getDbaasServicePg**](ExoscaleApi.md#getDbaasServicePg) | **GET** /dbaas-postgres/{name} | Get a DBaaS PostgreSQL service |
| [**getDbaasServiceRedis**](ExoscaleApi.md#getDbaasServiceRedis) | **GET** /dbaas-redis/{name} | Get a DBaaS Redis service |
| [**getDbaasServiceType**](ExoscaleApi.md#getDbaasServiceType) | **GET** /dbaas-service-type/{service-type-name} | Get a DBaaS service type |
| [**getDbaasServiceValkey**](ExoscaleApi.md#getDbaasServiceValkey) | **GET** /dbaas-valkey/{name} |  |
| [**getDbaasSettingsGrafana**](ExoscaleApi.md#getDbaasSettingsGrafana) | **GET** /dbaas-settings-grafana | Get DBaaS Grafana settings |
| [**getDbaasSettingsKafka**](ExoscaleApi.md#getDbaasSettingsKafka) | **GET** /dbaas-settings-kafka | Get DBaaS Kafka settings |
| [**getDbaasSettingsMysql**](ExoscaleApi.md#getDbaasSettingsMysql) | **GET** /dbaas-settings-mysql | Get DBaaS MySQL settings |
| [**getDbaasSettingsOpensearch**](ExoscaleApi.md#getDbaasSettingsOpensearch) | **GET** /dbaas-settings-opensearch | Get DBaaS OpenSearch settings |
| [**getDbaasSettingsPg**](ExoscaleApi.md#getDbaasSettingsPg) | **GET** /dbaas-settings-pg | Get DBaaS PostgreSQL settings |
| [**getDbaasSettingsRedis**](ExoscaleApi.md#getDbaasSettingsRedis) | **GET** /dbaas-settings-redis | Get DBaaS Redis settings |
| [**getDbaasSettingsValkey**](ExoscaleApi.md#getDbaasSettingsValkey) | **GET** /dbaas-settings-valkey | Get DBaaS Valkey settings |
| [**getDbaasTask**](ExoscaleApi.md#getDbaasTask) | **GET** /dbaas-task/{service}/{id} | Get a DBaaS task |
| [**getDeployTarget**](ExoscaleApi.md#getDeployTarget) | **GET** /deploy-target/{id} | Retrieve Deploy Target details |
| [**getDnsDomain**](ExoscaleApi.md#getDnsDomain) | **GET** /dns-domain/{id} | Retrieve DNS domain details |
| [**getDnsDomainRecord**](ExoscaleApi.md#getDnsDomainRecord) | **GET** /dns-domain/{domain-id}/record/{record-id} | Retrieve DNS domain record details |
| [**getDnsDomainZoneFile**](ExoscaleApi.md#getDnsDomainZoneFile) | **GET** /dns-domain/{id}/zone | Retrieve DNS domain zone file |
| [**getElasticIp**](ExoscaleApi.md#getElasticIp) | **GET** /elastic-ip/{id} | Retrieve Elastic IP details |
| [**getIamOrganizationPolicy**](ExoscaleApi.md#getIamOrganizationPolicy) | **GET** /iam-organization-policy | Retrieve IAM Organization Policy |
| [**getIamRole**](ExoscaleApi.md#getIamRole) | **GET** /iam-role/{id} | Retrieve IAM Role |
| [**getInstance**](ExoscaleApi.md#getInstance) | **GET** /instance/{id} | Retrieve Compute instance details |
| [**getInstancePool**](ExoscaleApi.md#getInstancePool) | **GET** /instance-pool/{id} | Retrieve Instance Pool details |
| [**getInstanceType**](ExoscaleApi.md#getInstanceType) | **GET** /instance-type/{id} | Retrieve Instance Type details |
| [**getLoadBalancer**](ExoscaleApi.md#getLoadBalancer) | **GET** /load-balancer/{id} | Retrieve Load Balancer details |
| [**getLoadBalancerService**](ExoscaleApi.md#getLoadBalancerService) | **GET** /load-balancer/{id}/service/{service-id} | Retrieve Load Balancer Service details |
| [**getOperation**](ExoscaleApi.md#getOperation) | **GET** /operation/{id} | Retrieve Operation details |
| [**getOrganization**](ExoscaleApi.md#getOrganization) | **GET** /organization | Retrieve an organization |
| [**getPrivateNetwork**](ExoscaleApi.md#getPrivateNetwork) | **GET** /private-network/{id} | Retrieve Private Network details |
| [**getQuota**](ExoscaleApi.md#getQuota) | **GET** /quota/{entity} | Retrieve Resource Quota |
| [**getReverseDnsElasticIp**](ExoscaleApi.md#getReverseDnsElasticIp) | **GET** /reverse-dns/elastic-ip/{id} | Query the PTR DNS records for an elastic IP |
| [**getReverseDnsInstance**](ExoscaleApi.md#getReverseDnsInstance) | **GET** /reverse-dns/instance/{id} | Query the PTR DNS records for an instance |
| [**getSecurityGroup**](ExoscaleApi.md#getSecurityGroup) | **GET** /security-group/{id} | Retrieve Security Group details |
| [**getSksCluster**](ExoscaleApi.md#getSksCluster) | **GET** /sks-cluster/{id} | Retrieve SKS cluster details |
| [**getSksClusterAuthorityCert**](ExoscaleApi.md#getSksClusterAuthorityCert) | **GET** /sks-cluster/{id}/authority/{authority}/cert | Get the certificate for a SKS cluster authority |
| [**getSksClusterInspection**](ExoscaleApi.md#getSksClusterInspection) | **GET** /sks-cluster/{id}/inspection | Get the latest inspection result |
| [**getSksNodepool**](ExoscaleApi.md#getSksNodepool) | **GET** /sks-cluster/{id}/nodepool/{sks-nodepool-id} | Retrieve SKS Nodepool details |
| [**getSnapshot**](ExoscaleApi.md#getSnapshot) | **GET** /snapshot/{id} | Retrieve Snapshot details |
| [**getSosPresignedUrl**](ExoscaleApi.md#getSosPresignedUrl) | **GET** /sos/{bucket}/presigned-url | Retrieve Presigned Download URL for SOS object |
| [**getSshKey**](ExoscaleApi.md#getSshKey) | **GET** /ssh-key/{name} | Retrieve SSH key details |
| [**getTemplate**](ExoscaleApi.md#getTemplate) | **GET** /template/{id} | Retrieve Template details |
| [**listAntiAffinityGroups**](ExoscaleApi.md#listAntiAffinityGroups) | **GET** /anti-affinity-group | List Anti-affinity Groups |
| [**listApiKeys**](ExoscaleApi.md#listApiKeys) | **GET** /api-key | List API keys |
| [**listBlockStorageSnapshots**](ExoscaleApi.md#listBlockStorageSnapshots) | **GET** /block-storage-snapshot | List block storage snapshots |
| [**listBlockStorageVolumes**](ExoscaleApi.md#listBlockStorageVolumes) | **GET** /block-storage | List block storage volumes |
| [**listDbaasExternalEndpointTypes**](ExoscaleApi.md#listDbaasExternalEndpointTypes) | **GET** /dbaas-external-endpoint-types |  |
| [**listDbaasExternalEndpoints**](ExoscaleApi.md#listDbaasExternalEndpoints) | **GET** /dbaas-external-endpoints |  |
| [**listDbaasExternalIntegrations**](ExoscaleApi.md#listDbaasExternalIntegrations) | **GET** /dbaas-external-integrations/{service-name} |  |
| [**listDbaasIntegrationSettings**](ExoscaleApi.md#listDbaasIntegrationSettings) | **GET** /dbaas-integration-settings/{integration-type}/{source-type}/{dest-type} |  |
| [**listDbaasIntegrationTypes**](ExoscaleApi.md#listDbaasIntegrationTypes) | **GET** /dbaas-integration-types |  |
| [**listDbaasServiceTypes**](ExoscaleApi.md#listDbaasServiceTypes) | **GET** /dbaas-service-type | DBaaS Service Types |
| [**listDbaasServices**](ExoscaleApi.md#listDbaasServices) | **GET** /dbaas-service | List DBaaS services |
| [**listDeployTargets**](ExoscaleApi.md#listDeployTargets) | **GET** /deploy-target | List Deploy Targets |
| [**listDnsDomainRecords**](ExoscaleApi.md#listDnsDomainRecords) | **GET** /dns-domain/{domain-id}/record | List DNS domain records |
| [**listDnsDomains**](ExoscaleApi.md#listDnsDomains) | **GET** /dns-domain | List DNS domains |
| [**listElasticIps**](ExoscaleApi.md#listElasticIps) | **GET** /elastic-ip | List Elastic IPs |
| [**listEvents**](ExoscaleApi.md#listEvents) | **GET** /event | List Events |
| [**listIamRoles**](ExoscaleApi.md#listIamRoles) | **GET** /iam-role | List IAM Roles |
| [**listInstancePools**](ExoscaleApi.md#listInstancePools) | **GET** /instance-pool | List Instance Pools |
| [**listInstanceTypes**](ExoscaleApi.md#listInstanceTypes) | **GET** /instance-type | List Compute instance Types |
| [**listInstances**](ExoscaleApi.md#listInstances) | **GET** /instance | List Compute instances |
| [**listLoadBalancers**](ExoscaleApi.md#listLoadBalancers) | **GET** /load-balancer | List Load Balancers |
| [**listPrivateNetworks**](ExoscaleApi.md#listPrivateNetworks) | **GET** /private-network | List Private Networks |
| [**listQuotas**](ExoscaleApi.md#listQuotas) | **GET** /quota | List Organization Quotas |
| [**listSecurityGroups**](ExoscaleApi.md#listSecurityGroups) | **GET** /security-group | List Security Groups. |
| [**listSksClusterDeprecatedResources**](ExoscaleApi.md#listSksClusterDeprecatedResources) | **GET** /sks-cluster-deprecated-resources/{id} | Resources that are scheduled to be removed in future kubernetes releases |
| [**listSksClusterVersions**](ExoscaleApi.md#listSksClusterVersions) | **GET** /sks-cluster-version | List available versions for SKS clusters |
| [**listSksClusters**](ExoscaleApi.md#listSksClusters) | **GET** /sks-cluster | List SKS clusters |
| [**listSnapshots**](ExoscaleApi.md#listSnapshots) | **GET** /snapshot | List Snapshots |
| [**listSosBucketsUsage**](ExoscaleApi.md#listSosBucketsUsage) | **GET** /sos-buckets-usage | List SOS Buckets Usage |
| [**listSshKeys**](ExoscaleApi.md#listSshKeys) | **GET** /ssh-key | List SSH keys |
| [**listTemplates**](ExoscaleApi.md#listTemplates) | **GET** /template | List Templates |
| [**listUsers**](ExoscaleApi.md#listUsers) | **GET** /user | List Users |
| [**listZones**](ExoscaleApi.md#listZones) | **GET** /zone | List Zones |
| [**promoteSnapshotToTemplate**](ExoscaleApi.md#promoteSnapshotToTemplate) | **POST** /snapshot/{id}:promote | Promote a Snapshot to a Template |
| [**rebootInstance**](ExoscaleApi.md#rebootInstance) | **PUT** /instance/{id}:reboot | Reboot a Compute instance |
| [**registerSshKey**](ExoscaleApi.md#registerSshKey) | **POST** /ssh-key | Import SSH key |
| [**registerTemplate**](ExoscaleApi.md#registerTemplate) | **POST** /template | Register a Template |
| [**removeExternalSourceFromSecurityGroup**](ExoscaleApi.md#removeExternalSourceFromSecurityGroup) | **PUT** /security-group/{id}:remove-source | Remove an external source from a Security Group |
| [**removeInstanceProtection**](ExoscaleApi.md#removeInstanceProtection) | **PUT** /instance/{id}:remove-protection | Remove instance destruction protection |
| [**resetDbaasGrafanaUserPassword**](ExoscaleApi.md#resetDbaasGrafanaUserPassword) | **PUT** /dbaas-grafana/{service-name}/user/{username}/password/reset | Reset the credentials of a DBaaS Grafana user |
| [**resetDbaasKafkaUserPassword**](ExoscaleApi.md#resetDbaasKafkaUserPassword) | **PUT** /dbaas-kafka/{service-name}/user/{username}/password/reset | Reset the credentials of a DBaaS Kafka user |
| [**resetDbaasMysqlUserPassword**](ExoscaleApi.md#resetDbaasMysqlUserPassword) | **PUT** /dbaas-mysql/{service-name}/user/{username}/password/reset | Reset the credentials of a DBaaS mysql user |
| [**resetDbaasOpensearchUserPassword**](ExoscaleApi.md#resetDbaasOpensearchUserPassword) | **PUT** /dbaas-opensearch/{service-name}/user/{username}/password/reset | Reset the credentials of a DBaaS OpenSearch user |
| [**resetDbaasPostgresUserPassword**](ExoscaleApi.md#resetDbaasPostgresUserPassword) | **PUT** /dbaas-postgres/{service-name}/user/{username}/password/reset | Reset the credentials of a DBaaS Postgres user |
| [**resetDbaasRedisUserPassword**](ExoscaleApi.md#resetDbaasRedisUserPassword) | **PUT** /dbaas-redis/{service-name}/user/{username}/password/reset | Reset the credentials of a DBaaS Redis user |
| [**resetDbaasValkeyUserPassword**](ExoscaleApi.md#resetDbaasValkeyUserPassword) | **PUT** /dbaas-valkey/{service-name}/user/{username}/password/reset | Reset the credentials of a DBaaS Valkey user |
| [**resetElasticIpField**](ExoscaleApi.md#resetElasticIpField) | **DELETE** /elastic-ip/{id}/{field} | Reset an Elastic IP field to its default value |
| [**resetIamOrganizationPolicy**](ExoscaleApi.md#resetIamOrganizationPolicy) | **POST** /iam-organization-policy:reset | Reset IAM Organization Policy |
| [**resetInstance**](ExoscaleApi.md#resetInstance) | **PUT** /instance/{id}:reset | Reset a Compute instance to a base/target template |
| [**resetInstanceField**](ExoscaleApi.md#resetInstanceField) | **DELETE** /instance/{id}/{field} | Reset Instance field |
| [**resetInstancePassword**](ExoscaleApi.md#resetInstancePassword) | **PUT** /instance/{id}:reset-password | Reset a compute instance password |
| [**resetInstancePoolField**](ExoscaleApi.md#resetInstancePoolField) | **DELETE** /instance-pool/{id}/{field} | Reset an Instance Pool field to its default value |
| [**resetLoadBalancerField**](ExoscaleApi.md#resetLoadBalancerField) | **DELETE** /load-balancer/{id}/{field} | Reset a Load Balancer field to its default value |
| [**resetLoadBalancerServiceField**](ExoscaleApi.md#resetLoadBalancerServiceField) | **DELETE** /load-balancer/{id}/service/{service-id}/{field} | Reset a Load Balancer Service field to its default value |
| [**resetPrivateNetworkField**](ExoscaleApi.md#resetPrivateNetworkField) | **DELETE** /private-network/{id}/{field} | Reset Private Network field |
| [**resetSksClusterField**](ExoscaleApi.md#resetSksClusterField) | **DELETE** /sks-cluster/{id}/{field} | Reset an SKS cluster field to its default value |
| [**resetSksNodepoolField**](ExoscaleApi.md#resetSksNodepoolField) | **DELETE** /sks-cluster/{id}/nodepool/{sks-nodepool-id}/{field} | Reset an SKS Nodepool field to its default value |
| [**resizeBlockStorageVolume**](ExoscaleApi.md#resizeBlockStorageVolume) | **PUT** /block-storage/{id}:resize-volume | Resize a block storage volume |
| [**resizeInstanceDisk**](ExoscaleApi.md#resizeInstanceDisk) | **PUT** /instance/{id}:resize-disk | Resize a Compute instance disk |
| [**revealDbaasGrafanaUserPassword**](ExoscaleApi.md#revealDbaasGrafanaUserPassword) | **GET** /dbaas-grafana/{service-name}/user/{username}/password/reveal | Reveal the secrets of a DBaaS Grafana user |
| [**revealDbaasKafkaConnectPassword**](ExoscaleApi.md#revealDbaasKafkaConnectPassword) | **GET** /dbaas-kafka/{service-name}/connect/password/reveal | Reveal the secrets for DBaaS Kafka Connect |
| [**revealDbaasKafkaUserPassword**](ExoscaleApi.md#revealDbaasKafkaUserPassword) | **GET** /dbaas-kafka/{service-name}/user/{username}/password/reveal | Reveal the secrets of a DBaaS Kafka user |
| [**revealDbaasMysqlUserPassword**](ExoscaleApi.md#revealDbaasMysqlUserPassword) | **GET** /dbaas-mysql/{service-name}/user/{username}/password/reveal | Reveal the secrets of a DBaaS MySQL user |
| [**revealDbaasOpensearchUserPassword**](ExoscaleApi.md#revealDbaasOpensearchUserPassword) | **GET** /dbaas-opensearch/{service-name}/user/{username}/password/reveal | Reveal the secrets of a DBaaS OpenSearch user |
| [**revealDbaasPostgresUserPassword**](ExoscaleApi.md#revealDbaasPostgresUserPassword) | **GET** /dbaas-postgres/{service-name}/user/{username}/password/reveal | Reveal the secrets of a DBaaS Postgres user |
| [**revealDbaasRedisUserPassword**](ExoscaleApi.md#revealDbaasRedisUserPassword) | **GET** /dbaas-redis/{service-name}/user/{username}/password/reveal | Reveal the secrets of a DBaaS Redis user |
| [**revealDbaasValkeyUserPassword**](ExoscaleApi.md#revealDbaasValkeyUserPassword) | **GET** /dbaas-valkey/{service-name}/user/{username}/password/reveal | Reveal the secrets of a DBaaS Valkey user |
| [**revealInstancePassword**](ExoscaleApi.md#revealInstancePassword) | **GET** /instance/{id}:password | Reveal the password used during instance creation or the latest password reset. |
| [**revertInstanceToSnapshot**](ExoscaleApi.md#revertInstanceToSnapshot) | **POST** /instance/{instance-id}:revert-snapshot | Revert a snapshot for an instance |
| [**rotateSksCcmCredentials**](ExoscaleApi.md#rotateSksCcmCredentials) | **PUT** /sks-cluster/{id}/rotate-ccm-credentials | Rotate Exoscale CCM credentials |
| [**rotateSksOperatorsCa**](ExoscaleApi.md#rotateSksOperatorsCa) | **PUT** /sks-cluster/{id}/rotate-operators-ca | Rotate operators certificate authority |
| [**scaleInstance**](ExoscaleApi.md#scaleInstance) | **PUT** /instance/{id}:scale | Scale a Compute instance to a new Instance Type |
| [**scaleInstancePool**](ExoscaleApi.md#scaleInstancePool) | **PUT** /instance-pool/{id}:scale | Scale an Instance Pool |
| [**scaleSksNodepool**](ExoscaleApi.md#scaleSksNodepool) | **PUT** /sks-cluster/{id}/nodepool/{sks-nodepool-id}:scale | Scale a SKS Nodepool |
| [**startDbaasGrafanaMaintenance**](ExoscaleApi.md#startDbaasGrafanaMaintenance) | **PUT** /dbaas-grafana/{name}/maintenance/start | Initiate Grafana maintenance update |
| [**startDbaasKafkaMaintenance**](ExoscaleApi.md#startDbaasKafkaMaintenance) | **PUT** /dbaas-kafka/{name}/maintenance/start | Initiate Kafka maintenance update |
| [**startDbaasMysqlMaintenance**](ExoscaleApi.md#startDbaasMysqlMaintenance) | **PUT** /dbaas-mysql/{name}/maintenance/start | Initiate MySQL maintenance update |
| [**startDbaasOpensearchMaintenance**](ExoscaleApi.md#startDbaasOpensearchMaintenance) | **PUT** /dbaas-opensearch/{name}/maintenance/start | Initiate OpenSearch maintenance update |
| [**startDbaasPgMaintenance**](ExoscaleApi.md#startDbaasPgMaintenance) | **PUT** /dbaas-postgres/{name}/maintenance/start | Initiate PostgreSQL maintenance update |
| [**startDbaasRedisMaintenance**](ExoscaleApi.md#startDbaasRedisMaintenance) | **PUT** /dbaas-redis/{name}/maintenance/start | Initiate Redis maintenance update |
| [**startDbaasRedisToValkeyUpgrade**](ExoscaleApi.md#startDbaasRedisToValkeyUpgrade) | **PUT** /dbaas-redis/{name}/upgrade-type | Initiate Redis upgrade to Valkey |
| [**startDbaasValkeyMaintenance**](ExoscaleApi.md#startDbaasValkeyMaintenance) | **PUT** /dbaas-valkey/{name}/maintenance/start | Initiate Valkey maintenance update |
| [**startInstance**](ExoscaleApi.md#startInstance) | **PUT** /instance/{id}:start | Start a Compute instance |
| [**stopDbaasMysqlMigration**](ExoscaleApi.md#stopDbaasMysqlMigration) | **POST** /dbaas-mysql/{name}/migration/stop | Stop a DBaaS MySQL migration |
| [**stopDbaasPgMigration**](ExoscaleApi.md#stopDbaasPgMigration) | **POST** /dbaas-postgres/{name}/migration/stop | Stop a DBaaS PostgreSQL migration |
| [**stopDbaasRedisMigration**](ExoscaleApi.md#stopDbaasRedisMigration) | **POST** /dbaas-redis/{name}/migration/stop | Stop a DBaaS Redis migration |
| [**stopDbaasValkeyMigration**](ExoscaleApi.md#stopDbaasValkeyMigration) | **POST** /dbaas-valkey/{name}/migration/stop | Stop a DBaaS Valkey migration |
| [**stopInstance**](ExoscaleApi.md#stopInstance) | **PUT** /instance/{id}:stop | Stop a Compute instance |
| [**updateBlockStorageSnapshot**](ExoscaleApi.md#updateBlockStorageSnapshot) | **PUT** /block-storage-snapshot/{id} | Update block storage volume snapshot |
| [**updateBlockStorageVolume**](ExoscaleApi.md#updateBlockStorageVolume) | **PUT** /block-storage/{id} | Update block storage volume |
| [**updateDbaasExternalEndpointDatadog**](ExoscaleApi.md#updateDbaasExternalEndpointDatadog) | **PUT** /dbaas-external-endpoint-datadog/{endpoint-id} |  |
| [**updateDbaasExternalEndpointElasticsearch**](ExoscaleApi.md#updateDbaasExternalEndpointElasticsearch) | **PUT** /dbaas-external-endpoint-elasticsearch/{endpoint-id} |  |
| [**updateDbaasExternalEndpointOpensearch**](ExoscaleApi.md#updateDbaasExternalEndpointOpensearch) | **PUT** /dbaas-external-endpoint-opensearch/{endpoint-id} |  |
| [**updateDbaasExternalEndpointPrometheus**](ExoscaleApi.md#updateDbaasExternalEndpointPrometheus) | **PUT** /dbaas-external-endpoint-prometheus/{endpoint-id} |  |
| [**updateDbaasExternalEndpointRsyslog**](ExoscaleApi.md#updateDbaasExternalEndpointRsyslog) | **PUT** /dbaas-external-endpoint-rsyslog/{endpoint-id} |  |
| [**updateDbaasExternalIntegrationSettingsDatadog**](ExoscaleApi.md#updateDbaasExternalIntegrationSettingsDatadog) | **POST** /dbaas-external-integration-settings-datadog/{integration-id} |  |
| [**updateDbaasIntegration**](ExoscaleApi.md#updateDbaasIntegration) | **PUT** /dbaas-integration/{id} |  |
| [**updateDbaasOpensearchAclConfig**](ExoscaleApi.md#updateDbaasOpensearchAclConfig) | **PUT** /dbaas-opensearch/{name}/acl-config | Create a DBaaS OpenSearch ACL configuration |
| [**updateDbaasPgConnectionPool**](ExoscaleApi.md#updateDbaasPgConnectionPool) | **PUT** /dbaas-postgres/{service-name}/connection-pool/{connection-pool-name} | Update a DBaaS PostgreSQL connection pool |
| [**updateDbaasPostgresAllowReplication**](ExoscaleApi.md#updateDbaasPostgresAllowReplication) | **PUT** /dbaas-postgres/{service-name}/user/{username}/allow-replication | Update access control for one service user |
| [**updateDbaasServiceGrafana**](ExoscaleApi.md#updateDbaasServiceGrafana) | **PUT** /dbaas-grafana/{name} | Update a DBaaS Grafana service |
| [**updateDbaasServiceKafka**](ExoscaleApi.md#updateDbaasServiceKafka) | **PUT** /dbaas-kafka/{name} | Update a DBaaS Kafka service |
| [**updateDbaasServiceMysql**](ExoscaleApi.md#updateDbaasServiceMysql) | **PUT** /dbaas-mysql/{name} | Update a DBaaS MySQL service |
| [**updateDbaasServiceOpensearch**](ExoscaleApi.md#updateDbaasServiceOpensearch) | **PUT** /dbaas-opensearch/{name} | Update a DBaaS OpenSearch service |
| [**updateDbaasServicePg**](ExoscaleApi.md#updateDbaasServicePg) | **PUT** /dbaas-postgres/{name} | Update a DBaaS PostgreSQL service |
| [**updateDbaasServiceRedis**](ExoscaleApi.md#updateDbaasServiceRedis) | **PUT** /dbaas-redis/{name} | Update a DBaaS Redis service |
| [**updateDbaasServiceValkey**](ExoscaleApi.md#updateDbaasServiceValkey) | **PUT** /dbaas-valkey/{name} |  |
| [**updateDnsDomainRecord**](ExoscaleApi.md#updateDnsDomainRecord) | **PUT** /dns-domain/{domain-id}/record/{record-id} | Update DNS domain record |
| [**updateElasticIp**](ExoscaleApi.md#updateElasticIp) | **PUT** /elastic-ip/{id} | Update an Elastic IP |
| [**updateIamOrganizationPolicy**](ExoscaleApi.md#updateIamOrganizationPolicy) | **PUT** /iam-organization-policy | Update IAM Organization Policy |
| [**updateIamRole**](ExoscaleApi.md#updateIamRole) | **PUT** /iam-role/{id} | Update IAM Role |
| [**updateIamRolePolicy**](ExoscaleApi.md#updateIamRolePolicy) | **PUT** /iam-role/{id}:policy | Update IAM Role Policy |
| [**updateInstance**](ExoscaleApi.md#updateInstance) | **PUT** /instance/{id} | Update a Compute instance |
| [**updateInstancePool**](ExoscaleApi.md#updateInstancePool) | **PUT** /instance-pool/{id} | Update an Instance Pool |
| [**updateLoadBalancer**](ExoscaleApi.md#updateLoadBalancer) | **PUT** /load-balancer/{id} | Update a Load Balancer |
| [**updateLoadBalancerService**](ExoscaleApi.md#updateLoadBalancerService) | **PUT** /load-balancer/{id}/service/{service-id} | Update a Load Balancer Service |
| [**updatePrivateNetwork**](ExoscaleApi.md#updatePrivateNetwork) | **PUT** /private-network/{id} | Update a Private Network |
| [**updatePrivateNetworkInstanceIp**](ExoscaleApi.md#updatePrivateNetworkInstanceIp) | **PUT** /private-network/{id}:update-ip | Update the IP address of an instance attached to a managed private network |
| [**updateReverseDnsElasticIp**](ExoscaleApi.md#updateReverseDnsElasticIp) | **POST** /reverse-dns/elastic-ip/{id} | Update/Create the PTR DNS record for an elastic IP |
| [**updateReverseDnsInstance**](ExoscaleApi.md#updateReverseDnsInstance) | **POST** /reverse-dns/instance/{id} | Update/Create the PTR DNS record for an instance |
| [**updateSksCluster**](ExoscaleApi.md#updateSksCluster) | **PUT** /sks-cluster/{id} | Update an SKS cluster |
| [**updateSksNodepool**](ExoscaleApi.md#updateSksNodepool) | **PUT** /sks-cluster/{id}/nodepool/{sks-nodepool-id} | Update an SKS Nodepool |
| [**updateTemplate**](ExoscaleApi.md#updateTemplate) | **PUT** /template/{id} | Update template attributes |
| [**updateUserRole**](ExoscaleApi.md#updateUserRole) | **PUT** /user/{id} | Update a User&#39;s IAM role |
| [**upgradeSksCluster**](ExoscaleApi.md#upgradeSksCluster) | **PUT** /sks-cluster/{id}/upgrade | Upgrade an SKS cluster |
| [**upgradeSksClusterServiceLevel**](ExoscaleApi.md#upgradeSksClusterServiceLevel) | **PUT** /sks-cluster/{id}/upgrade-service-level | Upgrade a SKS cluster to pro |



## addExternalSourceToSecurityGroup

> Operation addExternalSourceToSecurityGroup(id, addExternalSourceToSecurityGroupRequest)

Add an external source as a member of a Security Group



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        AddExternalSourceToSecurityGroupRequest addExternalSourceToSecurityGroupRequest = new AddExternalSourceToSecurityGroupRequest(); // AddExternalSourceToSecurityGroupRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.addExternalSourceToSecurityGroup(id, addExternalSourceToSecurityGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#addExternalSourceToSecurityGroup");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **addExternalSourceToSecurityGroupRequest** | [**AddExternalSourceToSecurityGroupRequest**](AddExternalSourceToSecurityGroupRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **addExternalSourceToSecurityGroupRequest** | [**AddExternalSourceToSecurityGroupRequest**](AddExternalSourceToSecurityGroupRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## addInstanceProtection

> Operation addInstanceProtection(id)

Set instance destruction protection



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.addInstanceProtection(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#addInstanceProtection");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## addRuleToSecurityGroup

> Operation addRuleToSecurityGroup(id, addRuleToSecurityGroupRequest)

Create a Security Group rule



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        AddRuleToSecurityGroupRequest addRuleToSecurityGroupRequest = new AddRuleToSecurityGroupRequest(); // AddRuleToSecurityGroupRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.addRuleToSecurityGroup(id, addRuleToSecurityGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#addRuleToSecurityGroup");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **addRuleToSecurityGroupRequest** | [**AddRuleToSecurityGroupRequest**](AddRuleToSecurityGroupRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **addRuleToSecurityGroupRequest** | [**AddRuleToSecurityGroupRequest**](AddRuleToSecurityGroupRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## addServiceToLoadBalancer

> Operation addServiceToLoadBalancer(id, addServiceToLoadBalancerRequest)

Add a Load Balancer Service



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        AddServiceToLoadBalancerRequest addServiceToLoadBalancerRequest = new AddServiceToLoadBalancerRequest(); // AddServiceToLoadBalancerRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.addServiceToLoadBalancer(id, addServiceToLoadBalancerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#addServiceToLoadBalancer");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **addServiceToLoadBalancerRequest** | [**AddServiceToLoadBalancerRequest**](AddServiceToLoadBalancerRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **addServiceToLoadBalancerRequest** | [**AddServiceToLoadBalancerRequest**](AddServiceToLoadBalancerRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## attachBlockStorageVolumeToInstance

> Operation attachBlockStorageVolumeToInstance(id, attachBlockStorageVolumeToInstanceRequest)

Attach block storage volume to an instance



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        AttachBlockStorageVolumeToInstanceRequest attachBlockStorageVolumeToInstanceRequest = new AttachBlockStorageVolumeToInstanceRequest(); // AttachBlockStorageVolumeToInstanceRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.attachBlockStorageVolumeToInstance(id, attachBlockStorageVolumeToInstanceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#attachBlockStorageVolumeToInstance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **attachBlockStorageVolumeToInstanceRequest** | [**AttachBlockStorageVolumeToInstanceRequest**](AttachBlockStorageVolumeToInstanceRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **attachBlockStorageVolumeToInstanceRequest** | [**AttachBlockStorageVolumeToInstanceRequest**](AttachBlockStorageVolumeToInstanceRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## attachDbaasServiceToEndpoint

> Operation attachDbaasServiceToEndpoint(sourceServiceName, attachDbaasServiceToEndpointRequest)



[BETA] Create a new DBaaS connection between a DBaaS service and an external service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String sourceServiceName = "sourceServiceName_example"; // String | 
        AttachDbaasServiceToEndpointRequest attachDbaasServiceToEndpointRequest = new AttachDbaasServiceToEndpointRequest(); // AttachDbaasServiceToEndpointRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.attachDbaasServiceToEndpoint(sourceServiceName, attachDbaasServiceToEndpointRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#attachDbaasServiceToEndpoint");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceServiceName** | **String**|  | |
| **attachDbaasServiceToEndpointRequest** | [**AttachDbaasServiceToEndpointRequest**](AttachDbaasServiceToEndpointRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceServiceName** | **String**|  | |
| **attachDbaasServiceToEndpointRequest** | [**AttachDbaasServiceToEndpointRequest**](AttachDbaasServiceToEndpointRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## attachInstanceToElasticIp

> Operation attachInstanceToElasticIp(id, attachBlockStorageVolumeToInstanceRequest)

Attach a Compute instance to an Elastic IP



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        AttachBlockStorageVolumeToInstanceRequest attachBlockStorageVolumeToInstanceRequest = new AttachBlockStorageVolumeToInstanceRequest(); // AttachBlockStorageVolumeToInstanceRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.attachInstanceToElasticIp(id, attachBlockStorageVolumeToInstanceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#attachInstanceToElasticIp");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **attachBlockStorageVolumeToInstanceRequest** | [**AttachBlockStorageVolumeToInstanceRequest**](AttachBlockStorageVolumeToInstanceRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **attachBlockStorageVolumeToInstanceRequest** | [**AttachBlockStorageVolumeToInstanceRequest**](AttachBlockStorageVolumeToInstanceRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## attachInstanceToPrivateNetwork

> Operation attachInstanceToPrivateNetwork(id, attachInstanceToPrivateNetworkRequest)

Attach a Compute instance to a Private Network



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        AttachInstanceToPrivateNetworkRequest attachInstanceToPrivateNetworkRequest = new AttachInstanceToPrivateNetworkRequest(); // AttachInstanceToPrivateNetworkRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.attachInstanceToPrivateNetwork(id, attachInstanceToPrivateNetworkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#attachInstanceToPrivateNetwork");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **attachInstanceToPrivateNetworkRequest** | [**AttachInstanceToPrivateNetworkRequest**](AttachInstanceToPrivateNetworkRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **attachInstanceToPrivateNetworkRequest** | [**AttachInstanceToPrivateNetworkRequest**](AttachInstanceToPrivateNetworkRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## attachInstanceToSecurityGroup

> Operation attachInstanceToSecurityGroup(id, detachInstanceFromPrivateNetworkRequest)

Attach a Compute instance to a Security Group



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest = new DetachInstanceFromPrivateNetworkRequest(); // DetachInstanceFromPrivateNetworkRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.attachInstanceToSecurityGroup(id, detachInstanceFromPrivateNetworkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#attachInstanceToSecurityGroup");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **detachInstanceFromPrivateNetworkRequest** | [**DetachInstanceFromPrivateNetworkRequest**](DetachInstanceFromPrivateNetworkRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **detachInstanceFromPrivateNetworkRequest** | [**DetachInstanceFromPrivateNetworkRequest**](DetachInstanceFromPrivateNetworkRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## copyTemplate

> Operation copyTemplate(id, copyTemplateRequest)

Copy a Template from a zone to another



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        CopyTemplateRequest copyTemplateRequest = new CopyTemplateRequest(); // CopyTemplateRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.copyTemplate(id, copyTemplateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#copyTemplate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **copyTemplateRequest** | [**CopyTemplateRequest**](CopyTemplateRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **copyTemplateRequest** | [**CopyTemplateRequest**](CopyTemplateRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createAntiAffinityGroup

> Operation createAntiAffinityGroup(createAntiAffinityGroupRequest)

Create an Anti-affinity Group



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        CreateAntiAffinityGroupRequest createAntiAffinityGroupRequest = new CreateAntiAffinityGroupRequest(); // CreateAntiAffinityGroupRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createAntiAffinityGroup(createAntiAffinityGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createAntiAffinityGroup");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createAntiAffinityGroupRequest** | [**CreateAntiAffinityGroupRequest**](CreateAntiAffinityGroupRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createAntiAffinityGroupRequest** | [**CreateAntiAffinityGroupRequest**](CreateAntiAffinityGroupRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createApiKey

> IamApiKeyCreated createApiKey(createApiKeyRequest)

Create a new API key

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        CreateApiKeyRequest createApiKeyRequest = new CreateApiKeyRequest(); // CreateApiKeyRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            IamApiKeyCreated result = client.createApiKey(createApiKeyRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createApiKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createApiKeyRequest** | [**CreateApiKeyRequest**](CreateApiKeyRequest.md)|  | |

### Return type

[**IamApiKeyCreated**](IamApiKeyCreated.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createApiKeyRequest** | [**CreateApiKeyRequest**](CreateApiKeyRequest.md)|  | |

### Return type

ApiResponse<[**IamApiKeyCreated**](IamApiKeyCreated.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createBlockStorageSnapshot

> Operation createBlockStorageSnapshot(id, createBlockStorageSnapshotRequest)

Create a block storage snapshot



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        CreateBlockStorageSnapshotRequest createBlockStorageSnapshotRequest = new CreateBlockStorageSnapshotRequest(); // CreateBlockStorageSnapshotRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createBlockStorageSnapshot(id, createBlockStorageSnapshotRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createBlockStorageSnapshot");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **createBlockStorageSnapshotRequest** | [**CreateBlockStorageSnapshotRequest**](CreateBlockStorageSnapshotRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **createBlockStorageSnapshotRequest** | [**CreateBlockStorageSnapshotRequest**](CreateBlockStorageSnapshotRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createBlockStorageVolume

> Operation createBlockStorageVolume(createBlockStorageVolumeRequest)

Create a block storage volume



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        CreateBlockStorageVolumeRequest createBlockStorageVolumeRequest = new CreateBlockStorageVolumeRequest(); // CreateBlockStorageVolumeRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createBlockStorageVolume(createBlockStorageVolumeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createBlockStorageVolume");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createBlockStorageVolumeRequest** | [**CreateBlockStorageVolumeRequest**](CreateBlockStorageVolumeRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createBlockStorageVolumeRequest** | [**CreateBlockStorageVolumeRequest**](CreateBlockStorageVolumeRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasExternalEndpointDatadog

> Operation createDbaasExternalEndpointDatadog(name, dbaasEndpointDatadogInputCreate)



[BETA] Create DataDog external integration endpoint

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 
        DbaasEndpointDatadogInputCreate dbaasEndpointDatadogInputCreate = new DbaasEndpointDatadogInputCreate(); // DbaasEndpointDatadogInputCreate |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDbaasExternalEndpointDatadog(name, dbaasEndpointDatadogInputCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasExternalEndpointDatadog");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **dbaasEndpointDatadogInputCreate** | [**DbaasEndpointDatadogInputCreate**](DbaasEndpointDatadogInputCreate.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **dbaasEndpointDatadogInputCreate** | [**DbaasEndpointDatadogInputCreate**](DbaasEndpointDatadogInputCreate.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasExternalEndpointElasticsearch

> Operation createDbaasExternalEndpointElasticsearch(name, dbaasEndpointElasticsearchInputCreate)



[BETA] Create ElasticSearch Logs external integration endpoint

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 
        DbaasEndpointElasticsearchInputCreate dbaasEndpointElasticsearchInputCreate = new DbaasEndpointElasticsearchInputCreate(); // DbaasEndpointElasticsearchInputCreate |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDbaasExternalEndpointElasticsearch(name, dbaasEndpointElasticsearchInputCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasExternalEndpointElasticsearch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **dbaasEndpointElasticsearchInputCreate** | [**DbaasEndpointElasticsearchInputCreate**](DbaasEndpointElasticsearchInputCreate.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **dbaasEndpointElasticsearchInputCreate** | [**DbaasEndpointElasticsearchInputCreate**](DbaasEndpointElasticsearchInputCreate.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasExternalEndpointOpensearch

> Operation createDbaasExternalEndpointOpensearch(name, dbaasEndpointOpensearchInputCreate)



[BETA] Create OpenSearch Logs external integration endpoint

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 
        DbaasEndpointOpensearchInputCreate dbaasEndpointOpensearchInputCreate = new DbaasEndpointOpensearchInputCreate(); // DbaasEndpointOpensearchInputCreate |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDbaasExternalEndpointOpensearch(name, dbaasEndpointOpensearchInputCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasExternalEndpointOpensearch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **dbaasEndpointOpensearchInputCreate** | [**DbaasEndpointOpensearchInputCreate**](DbaasEndpointOpensearchInputCreate.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **dbaasEndpointOpensearchInputCreate** | [**DbaasEndpointOpensearchInputCreate**](DbaasEndpointOpensearchInputCreate.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasExternalEndpointPrometheus

> Operation createDbaasExternalEndpointPrometheus(name, dbaasEndpointPrometheusPayload)



[BETA] Create Prometheus external integration endpoint

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 
        DbaasEndpointPrometheusPayload dbaasEndpointPrometheusPayload = new DbaasEndpointPrometheusPayload(); // DbaasEndpointPrometheusPayload |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDbaasExternalEndpointPrometheus(name, dbaasEndpointPrometheusPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasExternalEndpointPrometheus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **dbaasEndpointPrometheusPayload** | [**DbaasEndpointPrometheusPayload**](DbaasEndpointPrometheusPayload.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **dbaasEndpointPrometheusPayload** | [**DbaasEndpointPrometheusPayload**](DbaasEndpointPrometheusPayload.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasExternalEndpointRsyslog

> Operation createDbaasExternalEndpointRsyslog(name, dbaasEndpointRsyslogInputCreate)



[BETA] Create RSyslog external integration endpoint

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 
        DbaasEndpointRsyslogInputCreate dbaasEndpointRsyslogInputCreate = new DbaasEndpointRsyslogInputCreate(); // DbaasEndpointRsyslogInputCreate |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDbaasExternalEndpointRsyslog(name, dbaasEndpointRsyslogInputCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasExternalEndpointRsyslog");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **dbaasEndpointRsyslogInputCreate** | [**DbaasEndpointRsyslogInputCreate**](DbaasEndpointRsyslogInputCreate.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **dbaasEndpointRsyslogInputCreate** | [**DbaasEndpointRsyslogInputCreate**](DbaasEndpointRsyslogInputCreate.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasIntegration

> Operation createDbaasIntegration(createDbaasIntegrationRequest)



[BETA] Create a new DBaaS integration between two services

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        CreateDbaasIntegrationRequest createDbaasIntegrationRequest = new CreateDbaasIntegrationRequest(); // CreateDbaasIntegrationRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDbaasIntegration(createDbaasIntegrationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasIntegration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createDbaasIntegrationRequest** | [**CreateDbaasIntegrationRequest**](CreateDbaasIntegrationRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createDbaasIntegrationRequest** | [**CreateDbaasIntegrationRequest**](CreateDbaasIntegrationRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasKafkaSchemaRegistryAclConfig

> Operation createDbaasKafkaSchemaRegistryAclConfig(name, dbaasKafkaSchemaRegistryAclEntry)

Add a Kafka Schema Registry ACL entry

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 
        DbaasKafkaSchemaRegistryAclEntry dbaasKafkaSchemaRegistryAclEntry = new DbaasKafkaSchemaRegistryAclEntry(); // DbaasKafkaSchemaRegistryAclEntry |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDbaasKafkaSchemaRegistryAclConfig(name, dbaasKafkaSchemaRegistryAclEntry);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasKafkaSchemaRegistryAclConfig");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **dbaasKafkaSchemaRegistryAclEntry** | [**DbaasKafkaSchemaRegistryAclEntry**](DbaasKafkaSchemaRegistryAclEntry.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **dbaasKafkaSchemaRegistryAclEntry** | [**DbaasKafkaSchemaRegistryAclEntry**](DbaasKafkaSchemaRegistryAclEntry.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasKafkaTopicAclConfig

> Operation createDbaasKafkaTopicAclConfig(name, dbaasKafkaTopicAclEntry)

Add a Kafka topic ACL entry

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 
        DbaasKafkaTopicAclEntry dbaasKafkaTopicAclEntry = new DbaasKafkaTopicAclEntry(); // DbaasKafkaTopicAclEntry |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDbaasKafkaTopicAclConfig(name, dbaasKafkaTopicAclEntry);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasKafkaTopicAclConfig");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **dbaasKafkaTopicAclEntry** | [**DbaasKafkaTopicAclEntry**](DbaasKafkaTopicAclEntry.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **dbaasKafkaTopicAclEntry** | [**DbaasKafkaTopicAclEntry**](DbaasKafkaTopicAclEntry.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasKafkaUser

> Operation createDbaasKafkaUser(serviceName, createDbaasKafkaUserRequest)

Create a DBaaS Kafka user

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        CreateDbaasKafkaUserRequest createDbaasKafkaUserRequest = new CreateDbaasKafkaUserRequest(); // CreateDbaasKafkaUserRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDbaasKafkaUser(serviceName, createDbaasKafkaUserRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasKafkaUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **createDbaasKafkaUserRequest** | [**CreateDbaasKafkaUserRequest**](CreateDbaasKafkaUserRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **createDbaasKafkaUserRequest** | [**CreateDbaasKafkaUserRequest**](CreateDbaasKafkaUserRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasMysqlDatabase

> Operation createDbaasMysqlDatabase(serviceName, createDbaasMysqlDatabaseRequest)

Create a DBaaS MySQL database

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        CreateDbaasMysqlDatabaseRequest createDbaasMysqlDatabaseRequest = new CreateDbaasMysqlDatabaseRequest(); // CreateDbaasMysqlDatabaseRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDbaasMysqlDatabase(serviceName, createDbaasMysqlDatabaseRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasMysqlDatabase");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **createDbaasMysqlDatabaseRequest** | [**CreateDbaasMysqlDatabaseRequest**](CreateDbaasMysqlDatabaseRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **createDbaasMysqlDatabaseRequest** | [**CreateDbaasMysqlDatabaseRequest**](CreateDbaasMysqlDatabaseRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasMysqlUser

> Operation createDbaasMysqlUser(serviceName, createDbaasMysqlUserRequest)

Create a DBaaS MySQL user

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        CreateDbaasMysqlUserRequest createDbaasMysqlUserRequest = new CreateDbaasMysqlUserRequest(); // CreateDbaasMysqlUserRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDbaasMysqlUser(serviceName, createDbaasMysqlUserRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasMysqlUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **createDbaasMysqlUserRequest** | [**CreateDbaasMysqlUserRequest**](CreateDbaasMysqlUserRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **createDbaasMysqlUserRequest** | [**CreateDbaasMysqlUserRequest**](CreateDbaasMysqlUserRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasOpensearchUser

> Operation createDbaasOpensearchUser(serviceName, createDbaasKafkaUserRequest)

Create a DBaaS OpenSearch user

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        CreateDbaasKafkaUserRequest createDbaasKafkaUserRequest = new CreateDbaasKafkaUserRequest(); // CreateDbaasKafkaUserRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDbaasOpensearchUser(serviceName, createDbaasKafkaUserRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasOpensearchUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **createDbaasKafkaUserRequest** | [**CreateDbaasKafkaUserRequest**](CreateDbaasKafkaUserRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **createDbaasKafkaUserRequest** | [**CreateDbaasKafkaUserRequest**](CreateDbaasKafkaUserRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasPgConnectionPool

> Operation createDbaasPgConnectionPool(serviceName, createDbaasPgConnectionPoolRequest)

Create a DBaaS PostgreSQL connection pool



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        CreateDbaasPgConnectionPoolRequest createDbaasPgConnectionPoolRequest = new CreateDbaasPgConnectionPoolRequest(); // CreateDbaasPgConnectionPoolRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDbaasPgConnectionPool(serviceName, createDbaasPgConnectionPoolRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasPgConnectionPool");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **createDbaasPgConnectionPoolRequest** | [**CreateDbaasPgConnectionPoolRequest**](CreateDbaasPgConnectionPoolRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **createDbaasPgConnectionPoolRequest** | [**CreateDbaasPgConnectionPoolRequest**](CreateDbaasPgConnectionPoolRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasPgDatabase

> Operation createDbaasPgDatabase(serviceName, createDbaasPgDatabaseRequest)

Create a DBaaS Postgres database

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        CreateDbaasPgDatabaseRequest createDbaasPgDatabaseRequest = new CreateDbaasPgDatabaseRequest(); // CreateDbaasPgDatabaseRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDbaasPgDatabase(serviceName, createDbaasPgDatabaseRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasPgDatabase");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **createDbaasPgDatabaseRequest** | [**CreateDbaasPgDatabaseRequest**](CreateDbaasPgDatabaseRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **createDbaasPgDatabaseRequest** | [**CreateDbaasPgDatabaseRequest**](CreateDbaasPgDatabaseRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasPgUpgradeCheck

> DbaasTask createDbaasPgUpgradeCheck(service, createDbaasPgUpgradeCheckRequest)



Check whether you can upgrade Postgres service to a newer version

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String service = "service_example"; // String | 
        CreateDbaasPgUpgradeCheckRequest createDbaasPgUpgradeCheckRequest = new CreateDbaasPgUpgradeCheckRequest(); // CreateDbaasPgUpgradeCheckRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            DbaasTask result = client.createDbaasPgUpgradeCheck(service, createDbaasPgUpgradeCheckRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasPgUpgradeCheck");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **createDbaasPgUpgradeCheckRequest** | [**CreateDbaasPgUpgradeCheckRequest**](CreateDbaasPgUpgradeCheckRequest.md)|  | |

### Return type

[**DbaasTask**](DbaasTask.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **createDbaasPgUpgradeCheckRequest** | [**CreateDbaasPgUpgradeCheckRequest**](CreateDbaasPgUpgradeCheckRequest.md)|  | |

### Return type

ApiResponse<[**DbaasTask**](DbaasTask.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasPostgresUser

> Operation createDbaasPostgresUser(serviceName, createDbaasPostgresUserRequest)

Create a DBaaS Postgres user

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        CreateDbaasPostgresUserRequest createDbaasPostgresUserRequest = new CreateDbaasPostgresUserRequest(); // CreateDbaasPostgresUserRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDbaasPostgresUser(serviceName, createDbaasPostgresUserRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasPostgresUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **createDbaasPostgresUserRequest** | [**CreateDbaasPostgresUserRequest**](CreateDbaasPostgresUserRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **createDbaasPostgresUserRequest** | [**CreateDbaasPostgresUserRequest**](CreateDbaasPostgresUserRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasRedisUser

> Operation createDbaasRedisUser(serviceName, createDbaasKafkaUserRequest)

Create a DBaaS Redis user

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        CreateDbaasKafkaUserRequest createDbaasKafkaUserRequest = new CreateDbaasKafkaUserRequest(); // CreateDbaasKafkaUserRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDbaasRedisUser(serviceName, createDbaasKafkaUserRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasRedisUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **createDbaasKafkaUserRequest** | [**CreateDbaasKafkaUserRequest**](CreateDbaasKafkaUserRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **createDbaasKafkaUserRequest** | [**CreateDbaasKafkaUserRequest**](CreateDbaasKafkaUserRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasServiceGrafana

> Operation createDbaasServiceGrafana(name, createDbaasServiceGrafanaRequest)



Create a DBaaS Grafana service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 
        CreateDbaasServiceGrafanaRequest createDbaasServiceGrafanaRequest = new CreateDbaasServiceGrafanaRequest(); // CreateDbaasServiceGrafanaRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDbaasServiceGrafana(name, createDbaasServiceGrafanaRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasServiceGrafana");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **createDbaasServiceGrafanaRequest** | [**CreateDbaasServiceGrafanaRequest**](CreateDbaasServiceGrafanaRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **createDbaasServiceGrafanaRequest** | [**CreateDbaasServiceGrafanaRequest**](CreateDbaasServiceGrafanaRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasServiceKafka

> Operation createDbaasServiceKafka(name, createDbaasServiceKafkaRequest)

Create a DBaaS Kafka service

Create a DBaaS Kafka service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 
        CreateDbaasServiceKafkaRequest createDbaasServiceKafkaRequest = new CreateDbaasServiceKafkaRequest(); // CreateDbaasServiceKafkaRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDbaasServiceKafka(name, createDbaasServiceKafkaRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasServiceKafka");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **createDbaasServiceKafkaRequest** | [**CreateDbaasServiceKafkaRequest**](CreateDbaasServiceKafkaRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **createDbaasServiceKafkaRequest** | [**CreateDbaasServiceKafkaRequest**](CreateDbaasServiceKafkaRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasServiceMysql

> Operation createDbaasServiceMysql(name, createDbaasServiceMysqlRequest)

Create a DBaaS MySQL service

Create a DBaaS MySQL service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 
        CreateDbaasServiceMysqlRequest createDbaasServiceMysqlRequest = new CreateDbaasServiceMysqlRequest(); // CreateDbaasServiceMysqlRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDbaasServiceMysql(name, createDbaasServiceMysqlRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasServiceMysql");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **createDbaasServiceMysqlRequest** | [**CreateDbaasServiceMysqlRequest**](CreateDbaasServiceMysqlRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **createDbaasServiceMysqlRequest** | [**CreateDbaasServiceMysqlRequest**](CreateDbaasServiceMysqlRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasServiceOpensearch

> Operation createDbaasServiceOpensearch(name, createDbaasServiceOpensearchRequest)

Create a DBaaS OpenSearch service

Create a DBaaS OpenSearch service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 
        CreateDbaasServiceOpensearchRequest createDbaasServiceOpensearchRequest = new CreateDbaasServiceOpensearchRequest(); // CreateDbaasServiceOpensearchRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDbaasServiceOpensearch(name, createDbaasServiceOpensearchRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasServiceOpensearch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **createDbaasServiceOpensearchRequest** | [**CreateDbaasServiceOpensearchRequest**](CreateDbaasServiceOpensearchRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **createDbaasServiceOpensearchRequest** | [**CreateDbaasServiceOpensearchRequest**](CreateDbaasServiceOpensearchRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasServicePg

> Operation createDbaasServicePg(name, createDbaasServicePgRequest)

Create a DBaaS PostgreSQL service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 
        CreateDbaasServicePgRequest createDbaasServicePgRequest = new CreateDbaasServicePgRequest(); // CreateDbaasServicePgRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDbaasServicePg(name, createDbaasServicePgRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasServicePg");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **createDbaasServicePgRequest** | [**CreateDbaasServicePgRequest**](CreateDbaasServicePgRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **createDbaasServicePgRequest** | [**CreateDbaasServicePgRequest**](CreateDbaasServicePgRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasServiceRedis

> Operation createDbaasServiceRedis(name, createDbaasServiceRedisRequest)

Create a DBaaS Redis service

Create a DBaaS Redis service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 
        CreateDbaasServiceRedisRequest createDbaasServiceRedisRequest = new CreateDbaasServiceRedisRequest(); // CreateDbaasServiceRedisRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDbaasServiceRedis(name, createDbaasServiceRedisRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasServiceRedis");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **createDbaasServiceRedisRequest** | [**CreateDbaasServiceRedisRequest**](CreateDbaasServiceRedisRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **createDbaasServiceRedisRequest** | [**CreateDbaasServiceRedisRequest**](CreateDbaasServiceRedisRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasServiceValkey

> Operation createDbaasServiceValkey(name, createDbaasServiceValkeyRequest)

Create a DBaaS Valkey service

Create a DBaaS Valkey service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 
        CreateDbaasServiceValkeyRequest createDbaasServiceValkeyRequest = new CreateDbaasServiceValkeyRequest(); // CreateDbaasServiceValkeyRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDbaasServiceValkey(name, createDbaasServiceValkeyRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasServiceValkey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **createDbaasServiceValkeyRequest** | [**CreateDbaasServiceValkeyRequest**](CreateDbaasServiceValkeyRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **createDbaasServiceValkeyRequest** | [**CreateDbaasServiceValkeyRequest**](CreateDbaasServiceValkeyRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasTaskMigrationCheck

> Operation createDbaasTaskMigrationCheck(service, createDbaasTaskMigrationCheckRequest)



Create a DBaaS task to check migration

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String service = "service_example"; // String | 
        CreateDbaasTaskMigrationCheckRequest createDbaasTaskMigrationCheckRequest = new CreateDbaasTaskMigrationCheckRequest(); // CreateDbaasTaskMigrationCheckRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDbaasTaskMigrationCheck(service, createDbaasTaskMigrationCheckRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasTaskMigrationCheck");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **createDbaasTaskMigrationCheckRequest** | [**CreateDbaasTaskMigrationCheckRequest**](CreateDbaasTaskMigrationCheckRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **createDbaasTaskMigrationCheckRequest** | [**CreateDbaasTaskMigrationCheckRequest**](CreateDbaasTaskMigrationCheckRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDbaasValkeyUser

> Operation createDbaasValkeyUser(serviceName, createDbaasKafkaUserRequest)

Create a DBaaS Valkey user

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        CreateDbaasKafkaUserRequest createDbaasKafkaUserRequest = new CreateDbaasKafkaUserRequest(); // CreateDbaasKafkaUserRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDbaasValkeyUser(serviceName, createDbaasKafkaUserRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDbaasValkeyUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **createDbaasKafkaUserRequest** | [**CreateDbaasKafkaUserRequest**](CreateDbaasKafkaUserRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **createDbaasKafkaUserRequest** | [**CreateDbaasKafkaUserRequest**](CreateDbaasKafkaUserRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDnsDomain

> DnsDomain createDnsDomain(createDnsDomainRequest)

Create DNS domain



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        CreateDnsDomainRequest createDnsDomainRequest = new CreateDnsDomainRequest(); // CreateDnsDomainRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            DnsDomain result = client.createDnsDomain(createDnsDomainRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDnsDomain");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createDnsDomainRequest** | [**CreateDnsDomainRequest**](CreateDnsDomainRequest.md)|  | |

### Return type

[**DnsDomain**](DnsDomain.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createDnsDomainRequest** | [**CreateDnsDomainRequest**](CreateDnsDomainRequest.md)|  | |

### Return type

ApiResponse<[**DnsDomain**](DnsDomain.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createDnsDomainRecord

> Operation createDnsDomainRecord(domainId, createDnsDomainRecordRequest)

Create DNS domain record



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID domainId = UUID.randomUUID(); // UUID | 
        CreateDnsDomainRecordRequest createDnsDomainRecordRequest = new CreateDnsDomainRecordRequest(); // CreateDnsDomainRecordRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createDnsDomainRecord(domainId, createDnsDomainRecordRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createDnsDomainRecord");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domainId** | **UUID**|  | |
| **createDnsDomainRecordRequest** | [**CreateDnsDomainRecordRequest**](CreateDnsDomainRecordRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domainId** | **UUID**|  | |
| **createDnsDomainRecordRequest** | [**CreateDnsDomainRecordRequest**](CreateDnsDomainRecordRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createElasticIp

> Operation createElasticIp(createElasticIpRequest)

Create an Elastic IP



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        CreateElasticIpRequest createElasticIpRequest = new CreateElasticIpRequest(); // CreateElasticIpRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createElasticIp(createElasticIpRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createElasticIp");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createElasticIpRequest** | [**CreateElasticIpRequest**](CreateElasticIpRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createElasticIpRequest** | [**CreateElasticIpRequest**](CreateElasticIpRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createIamRole

> Operation createIamRole(createIamRoleRequest)

Create IAM Role



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        CreateIamRoleRequest createIamRoleRequest = new CreateIamRoleRequest(); // CreateIamRoleRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createIamRole(createIamRoleRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createIamRole");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createIamRoleRequest** | [**CreateIamRoleRequest**](CreateIamRoleRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createIamRoleRequest** | [**CreateIamRoleRequest**](CreateIamRoleRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createInstance

> Operation createInstance(createInstanceRequest)

Create a Compute instance



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        CreateInstanceRequest createInstanceRequest = new CreateInstanceRequest(); // CreateInstanceRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createInstance(createInstanceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createInstance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createInstanceRequest** | [**CreateInstanceRequest**](CreateInstanceRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createInstanceRequest** | [**CreateInstanceRequest**](CreateInstanceRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createInstancePool

> Operation createInstancePool(createInstancePoolRequest)

Create an Instance Pool



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        CreateInstancePoolRequest createInstancePoolRequest = new CreateInstancePoolRequest(); // CreateInstancePoolRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createInstancePool(createInstancePoolRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createInstancePool");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createInstancePoolRequest** | [**CreateInstancePoolRequest**](CreateInstancePoolRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createInstancePoolRequest** | [**CreateInstancePoolRequest**](CreateInstancePoolRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createLoadBalancer

> Operation createLoadBalancer(createLoadBalancerRequest)

Create a Load Balancer



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        CreateLoadBalancerRequest createLoadBalancerRequest = new CreateLoadBalancerRequest(); // CreateLoadBalancerRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createLoadBalancer(createLoadBalancerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createLoadBalancer");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createLoadBalancerRequest** | [**CreateLoadBalancerRequest**](CreateLoadBalancerRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createLoadBalancerRequest** | [**CreateLoadBalancerRequest**](CreateLoadBalancerRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createPrivateNetwork

> Operation createPrivateNetwork(createPrivateNetworkRequest)

Create a Private Network



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        CreatePrivateNetworkRequest createPrivateNetworkRequest = new CreatePrivateNetworkRequest(); // CreatePrivateNetworkRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createPrivateNetwork(createPrivateNetworkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createPrivateNetwork");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createPrivateNetworkRequest** | [**CreatePrivateNetworkRequest**](CreatePrivateNetworkRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createPrivateNetworkRequest** | [**CreatePrivateNetworkRequest**](CreatePrivateNetworkRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createSecurityGroup

> Operation createSecurityGroup(createSecurityGroupRequest)

Create a Security Group



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        CreateSecurityGroupRequest createSecurityGroupRequest = new CreateSecurityGroupRequest(); // CreateSecurityGroupRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createSecurityGroup(createSecurityGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createSecurityGroup");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createSecurityGroupRequest** | [**CreateSecurityGroupRequest**](CreateSecurityGroupRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createSecurityGroupRequest** | [**CreateSecurityGroupRequest**](CreateSecurityGroupRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createSksCluster

> Operation createSksCluster(createSksClusterRequest)

Create an SKS cluster



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        CreateSksClusterRequest createSksClusterRequest = new CreateSksClusterRequest(); // CreateSksClusterRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createSksCluster(createSksClusterRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createSksCluster");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createSksClusterRequest** | [**CreateSksClusterRequest**](CreateSksClusterRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createSksClusterRequest** | [**CreateSksClusterRequest**](CreateSksClusterRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createSksNodepool

> Operation createSksNodepool(id, createSksNodepoolRequest)

Create a new SKS Nodepool



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        CreateSksNodepoolRequest createSksNodepoolRequest = new CreateSksNodepoolRequest(); // CreateSksNodepoolRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createSksNodepool(id, createSksNodepoolRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createSksNodepool");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **createSksNodepoolRequest** | [**CreateSksNodepoolRequest**](CreateSksNodepoolRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **createSksNodepoolRequest** | [**CreateSksNodepoolRequest**](CreateSksNodepoolRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createSnapshot

> Operation createSnapshot(id)

Create a Snapshot of a Compute instance



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.createSnapshot(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createSnapshot");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createUser

> Operation createUser(createUserRequest)

Create a User

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        CreateUserRequest createUserRequest = new CreateUserRequest(); // CreateUserRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.createUser(createUserRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#createUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createUserRequest** | [**CreateUserRequest**](CreateUserRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createUserRequest** | [**CreateUserRequest**](CreateUserRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteAntiAffinityGroup

> Operation deleteAntiAffinityGroup(id)

Delete an Anti-affinity Group



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteAntiAffinityGroup(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteAntiAffinityGroup");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteApiKey

> Operation deleteApiKey(id)

Delete an API key

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String id = "id_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.deleteApiKey(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteApiKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteBlockStorageSnapshot

> Operation deleteBlockStorageSnapshot(id)

Delete a block storage snapshot, data will be unrecoverable



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteBlockStorageSnapshot(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteBlockStorageSnapshot");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteBlockStorageVolume

> Operation deleteBlockStorageVolume(id)

Delete a block storage volume, data will be unrecoverable



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteBlockStorageVolume(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteBlockStorageVolume");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDbaasExternalEndpointDatadog

> Operation deleteDbaasExternalEndpointDatadog(endpointId)



[BETA] Delete DataDog external integration endpoint

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID endpointId = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteDbaasExternalEndpointDatadog(endpointId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDbaasExternalEndpointDatadog");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDbaasExternalEndpointElasticsearch

> Operation deleteDbaasExternalEndpointElasticsearch(endpointId)



[BETA] Delete ElasticSearch logs external integration endpoint

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID endpointId = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteDbaasExternalEndpointElasticsearch(endpointId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDbaasExternalEndpointElasticsearch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDbaasExternalEndpointOpensearch

> Operation deleteDbaasExternalEndpointOpensearch(endpointId)



[BETA] Delete OpenSearch logs external integration endpoint

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID endpointId = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteDbaasExternalEndpointOpensearch(endpointId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDbaasExternalEndpointOpensearch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDbaasExternalEndpointPrometheus

> Operation deleteDbaasExternalEndpointPrometheus(endpointId)



[BETA] Delete Prometheus external integration endpoint

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID endpointId = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteDbaasExternalEndpointPrometheus(endpointId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDbaasExternalEndpointPrometheus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDbaasExternalEndpointRsyslog

> Operation deleteDbaasExternalEndpointRsyslog(endpointId)



[BETA] Delete RSyslog external integration endpoint

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID endpointId = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteDbaasExternalEndpointRsyslog(endpointId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDbaasExternalEndpointRsyslog");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDbaasIntegration

> Operation deleteDbaasIntegration(id)



[BETA] Delete a DBaaS Integration

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteDbaasIntegration(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDbaasIntegration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDbaasKafkaSchemaRegistryAclConfig

> Operation deleteDbaasKafkaSchemaRegistryAclConfig(name, aclId)

Delete a Kafka ACL entry

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 
        String aclId = "aclId_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.deleteDbaasKafkaSchemaRegistryAclConfig(name, aclId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDbaasKafkaSchemaRegistryAclConfig");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **aclId** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **aclId** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDbaasKafkaTopicAclConfig

> Operation deleteDbaasKafkaTopicAclConfig(name, aclId)

Delete a Kafka ACL entry

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 
        String aclId = "aclId_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.deleteDbaasKafkaTopicAclConfig(name, aclId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDbaasKafkaTopicAclConfig");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **aclId** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **aclId** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDbaasKafkaUser

> Operation deleteDbaasKafkaUser(serviceName, username)

Delete a DBaaS kafka user

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        String username = "username_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.deleteDbaasKafkaUser(serviceName, username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDbaasKafkaUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDbaasMysqlDatabase

> Operation deleteDbaasMysqlDatabase(serviceName, databaseName)

Delete a DBaaS MySQL database

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        String databaseName = "databaseName_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.deleteDbaasMysqlDatabase(serviceName, databaseName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDbaasMysqlDatabase");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **databaseName** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **databaseName** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDbaasMysqlUser

> Operation deleteDbaasMysqlUser(serviceName, username)

Delete a DBaaS MySQL user

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        String username = "username_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.deleteDbaasMysqlUser(serviceName, username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDbaasMysqlUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDbaasOpensearchUser

> Operation deleteDbaasOpensearchUser(serviceName, username)

Delete a DBaaS OpenSearch user

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        String username = "username_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.deleteDbaasOpensearchUser(serviceName, username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDbaasOpensearchUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDbaasPgConnectionPool

> Operation deleteDbaasPgConnectionPool(serviceName, connectionPoolName)

Delete a DBaaS PostgreSQL connection pool



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        String connectionPoolName = "connectionPoolName_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.deleteDbaasPgConnectionPool(serviceName, connectionPoolName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDbaasPgConnectionPool");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **connectionPoolName** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **connectionPoolName** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDbaasPgDatabase

> Operation deleteDbaasPgDatabase(serviceName, databaseName)

Delete a DBaaS Postgres database

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        String databaseName = "databaseName_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.deleteDbaasPgDatabase(serviceName, databaseName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDbaasPgDatabase");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **databaseName** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **databaseName** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDbaasPostgresUser

> Operation deleteDbaasPostgresUser(serviceName, username)

Delete a DBaaS Postgres user

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        String username = "username_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.deleteDbaasPostgresUser(serviceName, username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDbaasPostgresUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDbaasRedisUser

> Operation deleteDbaasRedisUser(serviceName, username)

Delete a DBaaS Redis user

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        String username = "username_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.deleteDbaasRedisUser(serviceName, username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDbaasRedisUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDbaasService

> Operation deleteDbaasService(name)

Delete a DBaaS service

Delete a DBaaS service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.deleteDbaasService(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDbaasService");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDbaasServiceGrafana

> Operation deleteDbaasServiceGrafana(name)

Delete a Grafana service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.deleteDbaasServiceGrafana(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDbaasServiceGrafana");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDbaasServiceKafka

> Operation deleteDbaasServiceKafka(name)

Delete a Kafka service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.deleteDbaasServiceKafka(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDbaasServiceKafka");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDbaasServiceMysql

> Operation deleteDbaasServiceMysql(name)

Delete a MySQL service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.deleteDbaasServiceMysql(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDbaasServiceMysql");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDbaasServiceOpensearch

> Operation deleteDbaasServiceOpensearch(name)

Delete a OpenSearch service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.deleteDbaasServiceOpensearch(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDbaasServiceOpensearch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDbaasServicePg

> Operation deleteDbaasServicePg(name)

Delete a Postgres service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.deleteDbaasServicePg(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDbaasServicePg");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDbaasServiceRedis

> Operation deleteDbaasServiceRedis(name)

Delete a Redis service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.deleteDbaasServiceRedis(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDbaasServiceRedis");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDbaasServiceValkey

> Operation deleteDbaasServiceValkey(name)

Delete a Valkey service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.deleteDbaasServiceValkey(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDbaasServiceValkey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDbaasValkeyUser

> Operation deleteDbaasValkeyUser(serviceName, username)

Delete a DBaaS Valkey user

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        String username = "username_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.deleteDbaasValkeyUser(serviceName, username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDbaasValkeyUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDnsDomain

> Operation deleteDnsDomain(id)

Delete DNS Domain



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteDnsDomain(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDnsDomain");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteDnsDomainRecord

> Operation deleteDnsDomainRecord(domainId, recordId)

Delete DNS domain record



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID domainId = UUID.randomUUID(); // UUID | 
        UUID recordId = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteDnsDomainRecord(domainId, recordId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteDnsDomainRecord");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domainId** | **UUID**|  | |
| **recordId** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domainId** | **UUID**|  | |
| **recordId** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteElasticIp

> Operation deleteElasticIp(id)

Delete an Elastic IP



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteElasticIp(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteElasticIp");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteIamRole

> Operation deleteIamRole(id)

Delete IAM Role



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteIamRole(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteIamRole");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteInstance

> Operation deleteInstance(id)

Delete a Compute instance



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteInstance(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteInstance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteInstancePool

> Operation deleteInstancePool(id)

Delete an Instance Pool



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteInstancePool(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteInstancePool");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteLoadBalancer

> Operation deleteLoadBalancer(id)

Delete a Load Balancer



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteLoadBalancer(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteLoadBalancer");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteLoadBalancerService

> Operation deleteLoadBalancerService(id, serviceId)

Delete a Load Balancer Service



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UUID serviceId = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteLoadBalancerService(id, serviceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteLoadBalancerService");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **serviceId** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **serviceId** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deletePrivateNetwork

> Operation deletePrivateNetwork(id)

Delete a Private Network



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deletePrivateNetwork(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deletePrivateNetwork");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteReverseDnsElasticIp

> Operation deleteReverseDnsElasticIp(id)

Delete the PTR DNS record for an elastic IP



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteReverseDnsElasticIp(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteReverseDnsElasticIp");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteReverseDnsInstance

> Operation deleteReverseDnsInstance(id)

Delete the PTR DNS record for an instance



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteReverseDnsInstance(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteReverseDnsInstance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteRuleFromSecurityGroup

> Operation deleteRuleFromSecurityGroup(id, ruleId)

Delete a Security Group rule



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UUID ruleId = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteRuleFromSecurityGroup(id, ruleId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteRuleFromSecurityGroup");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **ruleId** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **ruleId** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteSecurityGroup

> Operation deleteSecurityGroup(id)

Delete a Security Group



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteSecurityGroup(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteSecurityGroup");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteSksCluster

> Operation deleteSksCluster(id)

Delete an SKS cluster



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteSksCluster(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteSksCluster");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteSksNodepool

> Operation deleteSksNodepool(id, sksNodepoolId)

Delete an SKS Nodepool



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UUID sksNodepoolId = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteSksNodepool(id, sksNodepoolId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteSksNodepool");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **sksNodepoolId** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **sksNodepoolId** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteSnapshot

> Operation deleteSnapshot(id)

Delete a Snapshot



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteSnapshot(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteSnapshot");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteSshKey

> Operation deleteSshKey(name)

Delete a SSH key



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.deleteSshKey(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteSshKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteTemplate

> Operation deleteTemplate(id)

Delete a Template



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteTemplate(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteTemplate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## deleteUser

> Operation deleteUser(id)

Delete User

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.deleteUser(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#deleteUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## detachBlockStorageVolume

> Operation detachBlockStorageVolume(id)

Detach block storage volume



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.detachBlockStorageVolume(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#detachBlockStorageVolume");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## detachDbaasServiceFromEndpoint

> Operation detachDbaasServiceFromEndpoint(sourceServiceName, detachDbaasServiceFromEndpointRequest)



[BETA] Detach a DBaaS external integration from a service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String sourceServiceName = "sourceServiceName_example"; // String | 
        DetachDbaasServiceFromEndpointRequest detachDbaasServiceFromEndpointRequest = new DetachDbaasServiceFromEndpointRequest(); // DetachDbaasServiceFromEndpointRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.detachDbaasServiceFromEndpoint(sourceServiceName, detachDbaasServiceFromEndpointRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#detachDbaasServiceFromEndpoint");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceServiceName** | **String**|  | |
| **detachDbaasServiceFromEndpointRequest** | [**DetachDbaasServiceFromEndpointRequest**](DetachDbaasServiceFromEndpointRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceServiceName** | **String**|  | |
| **detachDbaasServiceFromEndpointRequest** | [**DetachDbaasServiceFromEndpointRequest**](DetachDbaasServiceFromEndpointRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## detachInstanceFromElasticIp

> Operation detachInstanceFromElasticIp(id, attachBlockStorageVolumeToInstanceRequest)

Detach a Compute instance from an Elastic IP



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        AttachBlockStorageVolumeToInstanceRequest attachBlockStorageVolumeToInstanceRequest = new AttachBlockStorageVolumeToInstanceRequest(); // AttachBlockStorageVolumeToInstanceRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.detachInstanceFromElasticIp(id, attachBlockStorageVolumeToInstanceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#detachInstanceFromElasticIp");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **attachBlockStorageVolumeToInstanceRequest** | [**AttachBlockStorageVolumeToInstanceRequest**](AttachBlockStorageVolumeToInstanceRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **attachBlockStorageVolumeToInstanceRequest** | [**AttachBlockStorageVolumeToInstanceRequest**](AttachBlockStorageVolumeToInstanceRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## detachInstanceFromPrivateNetwork

> Operation detachInstanceFromPrivateNetwork(id, detachInstanceFromPrivateNetworkRequest)

Detach a Compute instance from a Private Network



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest = new DetachInstanceFromPrivateNetworkRequest(); // DetachInstanceFromPrivateNetworkRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.detachInstanceFromPrivateNetwork(id, detachInstanceFromPrivateNetworkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#detachInstanceFromPrivateNetwork");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **detachInstanceFromPrivateNetworkRequest** | [**DetachInstanceFromPrivateNetworkRequest**](DetachInstanceFromPrivateNetworkRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **detachInstanceFromPrivateNetworkRequest** | [**DetachInstanceFromPrivateNetworkRequest**](DetachInstanceFromPrivateNetworkRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## detachInstanceFromSecurityGroup

> Operation detachInstanceFromSecurityGroup(id, detachInstanceFromPrivateNetworkRequest)

Detach a Compute instance from a Security Group



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest = new DetachInstanceFromPrivateNetworkRequest(); // DetachInstanceFromPrivateNetworkRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.detachInstanceFromSecurityGroup(id, detachInstanceFromPrivateNetworkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#detachInstanceFromSecurityGroup");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **detachInstanceFromPrivateNetworkRequest** | [**DetachInstanceFromPrivateNetworkRequest**](DetachInstanceFromPrivateNetworkRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **detachInstanceFromPrivateNetworkRequest** | [**DetachInstanceFromPrivateNetworkRequest**](DetachInstanceFromPrivateNetworkRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## enableDbaasMysqlWrites

> Operation enableDbaasMysqlWrites(name)

Temporarily enable writes for MySQL services in read-only mode due to filled up storage

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.enableDbaasMysqlWrites(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#enableDbaasMysqlWrites");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## enableTpm

> Operation enableTpm(id)

[Beta] Enable tpm for the instance.



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.enableTpm(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#enableTpm");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## evictInstancePoolMembers

> Operation evictInstancePoolMembers(id, evictInstancePoolMembersRequest)

Evict Instance Pool members

This operation evicts the specified Compute instances member from the Instance Pool, shrinking it to &#x60;&amp;lt;current pool size&amp;gt; - &amp;lt;# evicted members&amp;gt;&#x60;.

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        EvictInstancePoolMembersRequest evictInstancePoolMembersRequest = new EvictInstancePoolMembersRequest(); // EvictInstancePoolMembersRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.evictInstancePoolMembers(id, evictInstancePoolMembersRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#evictInstancePoolMembers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **evictInstancePoolMembersRequest** | [**EvictInstancePoolMembersRequest**](EvictInstancePoolMembersRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **evictInstancePoolMembersRequest** | [**EvictInstancePoolMembersRequest**](EvictInstancePoolMembersRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## evictSksNodepoolMembers

> Operation evictSksNodepoolMembers(id, sksNodepoolId, evictSksNodepoolMembersRequest)

Evict Nodepool members

This operation evicts the specified Compute instances member from the Nodepool, shrinking it to &#x60;&amp;lt;current nodepool size&amp;gt; - &amp;lt;# evicted members&amp;gt;&#x60;.

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UUID sksNodepoolId = UUID.randomUUID(); // UUID | 
        EvictSksNodepoolMembersRequest evictSksNodepoolMembersRequest = new EvictSksNodepoolMembersRequest(); // EvictSksNodepoolMembersRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.evictSksNodepoolMembers(id, sksNodepoolId, evictSksNodepoolMembersRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#evictSksNodepoolMembers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **sksNodepoolId** | **UUID**|  | |
| **evictSksNodepoolMembersRequest** | [**EvictSksNodepoolMembersRequest**](EvictSksNodepoolMembersRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **sksNodepoolId** | **UUID**|  | |
| **evictSksNodepoolMembersRequest** | [**EvictSksNodepoolMembersRequest**](EvictSksNodepoolMembersRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## exportSnapshot

> Operation exportSnapshot(id)

Export a Snapshot



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.exportSnapshot(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#exportSnapshot");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## generateSksClusterKubeconfig

> GenerateSksClusterKubeconfig200Response generateSksClusterKubeconfig(id, sksKubeconfigRequest)

Generate a new Kubeconfig file for a SKS cluster

This operation returns a Kubeconfig file encoded in base64.

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        SksKubeconfigRequest sksKubeconfigRequest = new SksKubeconfigRequest(); // SksKubeconfigRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            GenerateSksClusterKubeconfig200Response result = client.generateSksClusterKubeconfig(id, sksKubeconfigRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#generateSksClusterKubeconfig");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **sksKubeconfigRequest** | [**SksKubeconfigRequest**](SksKubeconfigRequest.md)|  | |

### Return type

[**GenerateSksClusterKubeconfig200Response**](GenerateSksClusterKubeconfig200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **sksKubeconfigRequest** | [**SksKubeconfigRequest**](SksKubeconfigRequest.md)|  | |

### Return type

ApiResponse<[**GenerateSksClusterKubeconfig200Response**](GenerateSksClusterKubeconfig200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getAntiAffinityGroup

> AntiAffinityGroup getAntiAffinityGroup(id)

Retrieve Anti-affinity Group details



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            AntiAffinityGroup result = client.getAntiAffinityGroup(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getAntiAffinityGroup");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**AntiAffinityGroup**](AntiAffinityGroup.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**AntiAffinityGroup**](AntiAffinityGroup.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getApiKey

> IamApiKey getApiKey(id)

Get API key

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String id = "id_example"; // String | 

        try {
            // Invoke the API method
            IamApiKey result = client.getApiKey(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getApiKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**IamApiKey**](IamApiKey.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

ApiResponse<[**IamApiKey**](IamApiKey.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getBlockStorageSnapshot

> BlockStorageSnapshot getBlockStorageSnapshot(id)

Retrieve block storage snapshot details



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            BlockStorageSnapshot result = client.getBlockStorageSnapshot(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getBlockStorageSnapshot");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**BlockStorageSnapshot**](BlockStorageSnapshot.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**BlockStorageSnapshot**](BlockStorageSnapshot.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getBlockStorageVolume

> BlockStorageVolume getBlockStorageVolume(id)

Retrieve block storage volume details



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            BlockStorageVolume result = client.getBlockStorageVolume(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getBlockStorageVolume");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**BlockStorageVolume**](BlockStorageVolume.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**BlockStorageVolume**](BlockStorageVolume.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getConsoleProxyUrl

> GetConsoleProxyUrl200Response getConsoleProxyUrl(id)

Retrieve signed url valid for 60 seconds to connect via console-proxy websocket to VM VNC console.



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            GetConsoleProxyUrl200Response result = client.getConsoleProxyUrl(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getConsoleProxyUrl");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**GetConsoleProxyUrl200Response**](GetConsoleProxyUrl200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**GetConsoleProxyUrl200Response**](GetConsoleProxyUrl200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasCaCertificate

> GetDbaasCaCertificate200Response getDbaasCaCertificate()

Get DBaaS CA Certificate

Returns a CA Certificate required to reach a DBaaS service through a TLS-protected connection.

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            GetDbaasCaCertificate200Response result = client.getDbaasCaCertificate();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasCaCertificate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetDbaasCaCertificate200Response**](GetDbaasCaCertificate200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**GetDbaasCaCertificate200Response**](GetDbaasCaCertificate200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasExternalEndpointDatadog

> DbaasExternalEndpointDatadogOutput getDbaasExternalEndpointDatadog(endpointId)



[BETA] Get DataDog external endpoint settings

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID endpointId = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            DbaasExternalEndpointDatadogOutput result = client.getDbaasExternalEndpointDatadog(endpointId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasExternalEndpointDatadog");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |

### Return type

[**DbaasExternalEndpointDatadogOutput**](DbaasExternalEndpointDatadogOutput.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |

### Return type

ApiResponse<[**DbaasExternalEndpointDatadogOutput**](DbaasExternalEndpointDatadogOutput.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasExternalEndpointElasticsearch

> DbaasEndpointElasticsearchOutput getDbaasExternalEndpointElasticsearch(endpointId)



[BETA] Get ElasticSearch Logs external integration endpoint settings

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID endpointId = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            DbaasEndpointElasticsearchOutput result = client.getDbaasExternalEndpointElasticsearch(endpointId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasExternalEndpointElasticsearch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |

### Return type

[**DbaasEndpointElasticsearchOutput**](DbaasEndpointElasticsearchOutput.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |

### Return type

ApiResponse<[**DbaasEndpointElasticsearchOutput**](DbaasEndpointElasticsearchOutput.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasExternalEndpointOpensearch

> DbaasEndpointOpensearchOutput getDbaasExternalEndpointOpensearch(endpointId)



[BETA] Get OpenSearch Logs external integration endpoint settings

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID endpointId = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            DbaasEndpointOpensearchOutput result = client.getDbaasExternalEndpointOpensearch(endpointId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasExternalEndpointOpensearch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |

### Return type

[**DbaasEndpointOpensearchOutput**](DbaasEndpointOpensearchOutput.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |

### Return type

ApiResponse<[**DbaasEndpointOpensearchOutput**](DbaasEndpointOpensearchOutput.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasExternalEndpointPrometheus

> DbaasEndpointExternalPrometheusOutput getDbaasExternalEndpointPrometheus(endpointId)



[BETA] Get Prometheus external integration endpoint settings

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID endpointId = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            DbaasEndpointExternalPrometheusOutput result = client.getDbaasExternalEndpointPrometheus(endpointId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasExternalEndpointPrometheus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |

### Return type

[**DbaasEndpointExternalPrometheusOutput**](DbaasEndpointExternalPrometheusOutput.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |

### Return type

ApiResponse<[**DbaasEndpointExternalPrometheusOutput**](DbaasEndpointExternalPrometheusOutput.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasExternalEndpointRsyslog

> DbaasExternalEndpointRsyslogOutput getDbaasExternalEndpointRsyslog(endpointId)



[BETA] Get RSyslog external integration endpoint settings

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID endpointId = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            DbaasExternalEndpointRsyslogOutput result = client.getDbaasExternalEndpointRsyslog(endpointId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasExternalEndpointRsyslog");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |

### Return type

[**DbaasExternalEndpointRsyslogOutput**](DbaasExternalEndpointRsyslogOutput.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |

### Return type

ApiResponse<[**DbaasExternalEndpointRsyslogOutput**](DbaasExternalEndpointRsyslogOutput.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasExternalIntegration

> DbaasExternalIntegration getDbaasExternalIntegration(integrationId)



[BETA] Get a DBaaS external integration

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID integrationId = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            DbaasExternalIntegration result = client.getDbaasExternalIntegration(integrationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasExternalIntegration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationId** | **UUID**|  | |

### Return type

[**DbaasExternalIntegration**](DbaasExternalIntegration.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationId** | **UUID**|  | |

### Return type

ApiResponse<[**DbaasExternalIntegration**](DbaasExternalIntegration.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasExternalIntegrationSettingsDatadog

> GetDbaasExternalIntegrationSettingsDatadog200Response getDbaasExternalIntegrationSettingsDatadog(integrationId)



[BETA] Get Datadog integration settings

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID integrationId = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            GetDbaasExternalIntegrationSettingsDatadog200Response result = client.getDbaasExternalIntegrationSettingsDatadog(integrationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasExternalIntegrationSettingsDatadog");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationId** | **UUID**|  | |

### Return type

[**GetDbaasExternalIntegrationSettingsDatadog200Response**](GetDbaasExternalIntegrationSettingsDatadog200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationId** | **UUID**|  | |

### Return type

ApiResponse<[**GetDbaasExternalIntegrationSettingsDatadog200Response**](GetDbaasExternalIntegrationSettingsDatadog200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasIntegration

> DbaasIntegration getDbaasIntegration(id)



[BETA] Get a DBaaS Integration

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            DbaasIntegration result = client.getDbaasIntegration(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasIntegration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**DbaasIntegration**](DbaasIntegration.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**DbaasIntegration**](DbaasIntegration.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasKafkaAclConfig

> DbaasKafkaAcls getDbaasKafkaAclConfig(name)

Get DBaaS kafka ACL configuration

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            DbaasKafkaAcls result = client.getDbaasKafkaAclConfig(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasKafkaAclConfig");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**DbaasKafkaAcls**](DbaasKafkaAcls.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**DbaasKafkaAcls**](DbaasKafkaAcls.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasMigrationStatus

> DbaasMigrationStatus getDbaasMigrationStatus(name)

Get a DBaaS migration status

Get a DBaaS migration status

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            DbaasMigrationStatus result = client.getDbaasMigrationStatus(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasMigrationStatus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**DbaasMigrationStatus**](DbaasMigrationStatus.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**DbaasMigrationStatus**](DbaasMigrationStatus.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasOpensearchAclConfig

> DbaasOpensearchAclConfig getDbaasOpensearchAclConfig(name)

Get DBaaS OpenSearch ACL configuration

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            DbaasOpensearchAclConfig result = client.getDbaasOpensearchAclConfig(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasOpensearchAclConfig");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**DbaasOpensearchAclConfig**](DbaasOpensearchAclConfig.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**DbaasOpensearchAclConfig**](DbaasOpensearchAclConfig.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasServiceGrafana

> DbaasServiceGrafana getDbaasServiceGrafana(name)

Get a DBaaS Grafana service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            DbaasServiceGrafana result = client.getDbaasServiceGrafana(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasServiceGrafana");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**DbaasServiceGrafana**](DbaasServiceGrafana.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**DbaasServiceGrafana**](DbaasServiceGrafana.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasServiceKafka

> DbaasServiceKafka getDbaasServiceKafka(name)

Get a DBaaS Kafka service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            DbaasServiceKafka result = client.getDbaasServiceKafka(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasServiceKafka");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**DbaasServiceKafka**](DbaasServiceKafka.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**DbaasServiceKafka**](DbaasServiceKafka.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasServiceLogs

> DbaasServiceLogs getDbaasServiceLogs(serviceName, getDbaasServiceLogsRequest)

Get logs of DBaaS service

Get logs of DBaaS service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        GetDbaasServiceLogsRequest getDbaasServiceLogsRequest = new GetDbaasServiceLogsRequest(); // GetDbaasServiceLogsRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            DbaasServiceLogs result = client.getDbaasServiceLogs(serviceName, getDbaasServiceLogsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasServiceLogs");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **getDbaasServiceLogsRequest** | [**GetDbaasServiceLogsRequest**](GetDbaasServiceLogsRequest.md)|  | |

### Return type

[**DbaasServiceLogs**](DbaasServiceLogs.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **getDbaasServiceLogsRequest** | [**GetDbaasServiceLogsRequest**](GetDbaasServiceLogsRequest.md)|  | |

### Return type

ApiResponse<[**DbaasServiceLogs**](DbaasServiceLogs.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasServiceMetrics

> GetDbaasServiceMetrics200Response getDbaasServiceMetrics(serviceName, getDbaasServiceMetricsRequest)

Get metrics of DBaaS service

Get metrics of DBaaS service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        GetDbaasServiceMetricsRequest getDbaasServiceMetricsRequest = new GetDbaasServiceMetricsRequest(); // GetDbaasServiceMetricsRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            GetDbaasServiceMetrics200Response result = client.getDbaasServiceMetrics(serviceName, getDbaasServiceMetricsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasServiceMetrics");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **getDbaasServiceMetricsRequest** | [**GetDbaasServiceMetricsRequest**](GetDbaasServiceMetricsRequest.md)|  | |

### Return type

[**GetDbaasServiceMetrics200Response**](GetDbaasServiceMetrics200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **getDbaasServiceMetricsRequest** | [**GetDbaasServiceMetricsRequest**](GetDbaasServiceMetricsRequest.md)|  | |

### Return type

ApiResponse<[**GetDbaasServiceMetrics200Response**](GetDbaasServiceMetrics200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasServiceMysql

> DbaasServiceMysql getDbaasServiceMysql(name)

Get a DBaaS MySQL service

Get a DBaaS MySQL service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            DbaasServiceMysql result = client.getDbaasServiceMysql(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasServiceMysql");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**DbaasServiceMysql**](DbaasServiceMysql.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**DbaasServiceMysql**](DbaasServiceMysql.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasServiceOpensearch

> DbaasServiceOpensearch getDbaasServiceOpensearch(name)

Get a DBaaS OpenSearch service

Get a DBaaS OpenSearch service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            DbaasServiceOpensearch result = client.getDbaasServiceOpensearch(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasServiceOpensearch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**DbaasServiceOpensearch**](DbaasServiceOpensearch.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**DbaasServiceOpensearch**](DbaasServiceOpensearch.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasServicePg

> DbaasServicePg getDbaasServicePg(name)

Get a DBaaS PostgreSQL service

Get a DBaaS PostgreSQL service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            DbaasServicePg result = client.getDbaasServicePg(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasServicePg");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**DbaasServicePg**](DbaasServicePg.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**DbaasServicePg**](DbaasServicePg.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasServiceRedis

> DbaasServiceRedis getDbaasServiceRedis(name)

Get a DBaaS Redis service

Get a DBaaS Redis service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            DbaasServiceRedis result = client.getDbaasServiceRedis(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasServiceRedis");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**DbaasServiceRedis**](DbaasServiceRedis.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**DbaasServiceRedis**](DbaasServiceRedis.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasServiceType

> DbaasServiceType getDbaasServiceType(serviceTypeName)

Get a DBaaS service type

Get a DBaaS service type

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceTypeName = "serviceTypeName_example"; // String | 

        try {
            // Invoke the API method
            DbaasServiceType result = client.getDbaasServiceType(serviceTypeName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasServiceType");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceTypeName** | **String**|  | |

### Return type

[**DbaasServiceType**](DbaasServiceType.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceTypeName** | **String**|  | |

### Return type

ApiResponse<[**DbaasServiceType**](DbaasServiceType.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasServiceValkey

> DbaasServiceValkey getDbaasServiceValkey(name)



Get a DBaaS Valkey service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            DbaasServiceValkey result = client.getDbaasServiceValkey(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasServiceValkey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**DbaasServiceValkey**](DbaasServiceValkey.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**DbaasServiceValkey**](DbaasServiceValkey.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasSettingsGrafana

> GetDbaasSettingsGrafana200Response getDbaasSettingsGrafana()

Get DBaaS Grafana settings

Get DBaaS Grafana settings

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            GetDbaasSettingsGrafana200Response result = client.getDbaasSettingsGrafana();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasSettingsGrafana");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetDbaasSettingsGrafana200Response**](GetDbaasSettingsGrafana200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**GetDbaasSettingsGrafana200Response**](GetDbaasSettingsGrafana200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasSettingsKafka

> GetDbaasSettingsKafka200Response getDbaasSettingsKafka()

Get DBaaS Kafka settings

Get DBaaS Kafka settings

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            GetDbaasSettingsKafka200Response result = client.getDbaasSettingsKafka();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasSettingsKafka");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetDbaasSettingsKafka200Response**](GetDbaasSettingsKafka200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**GetDbaasSettingsKafka200Response**](GetDbaasSettingsKafka200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasSettingsMysql

> GetDbaasSettingsMysql200Response getDbaasSettingsMysql()

Get DBaaS MySQL settings

Get DBaaS MySQL settings

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            GetDbaasSettingsMysql200Response result = client.getDbaasSettingsMysql();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasSettingsMysql");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetDbaasSettingsMysql200Response**](GetDbaasSettingsMysql200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**GetDbaasSettingsMysql200Response**](GetDbaasSettingsMysql200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasSettingsOpensearch

> GetDbaasSettingsOpensearch200Response getDbaasSettingsOpensearch()

Get DBaaS OpenSearch settings

Get DBaaS OpenSearch settings

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            GetDbaasSettingsOpensearch200Response result = client.getDbaasSettingsOpensearch();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasSettingsOpensearch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetDbaasSettingsOpensearch200Response**](GetDbaasSettingsOpensearch200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**GetDbaasSettingsOpensearch200Response**](GetDbaasSettingsOpensearch200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasSettingsPg

> GetDbaasSettingsPg200Response getDbaasSettingsPg()

Get DBaaS PostgreSQL settings

Get DBaaS PostgreSQL settings

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            GetDbaasSettingsPg200Response result = client.getDbaasSettingsPg();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasSettingsPg");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetDbaasSettingsPg200Response**](GetDbaasSettingsPg200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**GetDbaasSettingsPg200Response**](GetDbaasSettingsPg200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasSettingsRedis

> GetDbaasSettingsRedis200Response getDbaasSettingsRedis()

Get DBaaS Redis settings

Returns the default settings for Redis.

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            GetDbaasSettingsRedis200Response result = client.getDbaasSettingsRedis();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasSettingsRedis");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetDbaasSettingsRedis200Response**](GetDbaasSettingsRedis200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**GetDbaasSettingsRedis200Response**](GetDbaasSettingsRedis200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasSettingsValkey

> GetDbaasSettingsValkey200Response getDbaasSettingsValkey()

Get DBaaS Valkey settings

Returns the default settings for Valkey.

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            GetDbaasSettingsValkey200Response result = client.getDbaasSettingsValkey();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasSettingsValkey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetDbaasSettingsValkey200Response**](GetDbaasSettingsValkey200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**GetDbaasSettingsValkey200Response**](GetDbaasSettingsValkey200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDbaasTask

> DbaasTask getDbaasTask(service, id)

Get a DBaaS task

Get a DBaaS task

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String service = "service_example"; // String | 
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            DbaasTask result = client.getDbaasTask(service, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDbaasTask");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **id** | **UUID**|  | |

### Return type

[**DbaasTask**](DbaasTask.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **service** | **String**|  | |
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**DbaasTask**](DbaasTask.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDeployTarget

> DeployTarget getDeployTarget(id)

Retrieve Deploy Target details



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            DeployTarget result = client.getDeployTarget(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDeployTarget");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**DeployTarget**](DeployTarget.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**DeployTarget**](DeployTarget.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDnsDomain

> DnsDomain getDnsDomain(id)

Retrieve DNS domain details



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            DnsDomain result = client.getDnsDomain(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDnsDomain");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**DnsDomain**](DnsDomain.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**DnsDomain**](DnsDomain.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDnsDomainRecord

> DnsDomainRecord getDnsDomainRecord(domainId, recordId)

Retrieve DNS domain record details



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID domainId = UUID.randomUUID(); // UUID | 
        UUID recordId = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            DnsDomainRecord result = client.getDnsDomainRecord(domainId, recordId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDnsDomainRecord");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domainId** | **UUID**|  | |
| **recordId** | **UUID**|  | |

### Return type

[**DnsDomainRecord**](DnsDomainRecord.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domainId** | **UUID**|  | |
| **recordId** | **UUID**|  | |

### Return type

ApiResponse<[**DnsDomainRecord**](DnsDomainRecord.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getDnsDomainZoneFile

> GetDnsDomainZoneFile200Response getDnsDomainZoneFile(id)

Retrieve DNS domain zone file



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            GetDnsDomainZoneFile200Response result = client.getDnsDomainZoneFile(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getDnsDomainZoneFile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**GetDnsDomainZoneFile200Response**](GetDnsDomainZoneFile200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**GetDnsDomainZoneFile200Response**](GetDnsDomainZoneFile200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getElasticIp

> ElasticIp getElasticIp(id)

Retrieve Elastic IP details



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            ElasticIp result = client.getElasticIp(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getElasticIp");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**ElasticIp**](ElasticIp.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**ElasticIp**](ElasticIp.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getIamOrganizationPolicy

> IamPolicy getIamOrganizationPolicy()

Retrieve IAM Organization Policy



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            IamPolicy result = client.getIamOrganizationPolicy();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getIamOrganizationPolicy");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**IamPolicy**](IamPolicy.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**IamPolicy**](IamPolicy.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getIamRole

> IamRole getIamRole(id)

Retrieve IAM Role



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            IamRole result = client.getIamRole(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getIamRole");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**IamRole**](IamRole.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**IamRole**](IamRole.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getInstance

> Instance getInstance(id)

Retrieve Compute instance details



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Instance result = client.getInstance(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getInstance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Instance**](Instance.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Instance**](Instance.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getInstancePool

> InstancePool getInstancePool(id)

Retrieve Instance Pool details



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            InstancePool result = client.getInstancePool(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getInstancePool");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**InstancePool**](InstancePool.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**InstancePool**](InstancePool.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getInstanceType

> InstanceType getInstanceType(id)

Retrieve Instance Type details



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            InstanceType result = client.getInstanceType(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getInstanceType");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**InstanceType**](InstanceType.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**InstanceType**](InstanceType.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getLoadBalancer

> LoadBalancer getLoadBalancer(id)

Retrieve Load Balancer details



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            LoadBalancer result = client.getLoadBalancer(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getLoadBalancer");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**LoadBalancer**](LoadBalancer.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**LoadBalancer**](LoadBalancer.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getLoadBalancerService

> LoadBalancerService getLoadBalancerService(id, serviceId)

Retrieve Load Balancer Service details



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UUID serviceId = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            LoadBalancerService result = client.getLoadBalancerService(id, serviceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getLoadBalancerService");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **serviceId** | **UUID**|  | |

### Return type

[**LoadBalancerService**](LoadBalancerService.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **serviceId** | **UUID**|  | |

### Return type

ApiResponse<[**LoadBalancerService**](LoadBalancerService.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getOperation

> Operation getOperation(id)

Retrieve Operation details



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.getOperation(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getOperation");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getOrganization

> Organization getOrganization()

Retrieve an organization



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            Organization result = client.getOrganization();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getOrganization");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Organization**](Organization.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**Organization**](Organization.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getPrivateNetwork

> PrivateNetwork getPrivateNetwork(id)

Retrieve Private Network details



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            PrivateNetwork result = client.getPrivateNetwork(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getPrivateNetwork");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**PrivateNetwork**](PrivateNetwork.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**PrivateNetwork**](PrivateNetwork.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getQuota

> Quota getQuota(entity)

Retrieve Resource Quota



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String entity = "entity_example"; // String | 

        try {
            // Invoke the API method
            Quota result = client.getQuota(entity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getQuota");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entity** | **String**|  | |

### Return type

[**Quota**](Quota.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **entity** | **String**|  | |

### Return type

ApiResponse<[**Quota**](Quota.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getReverseDnsElasticIp

> ReverseDnsRecord getReverseDnsElasticIp(id)

Query the PTR DNS records for an elastic IP



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            ReverseDnsRecord result = client.getReverseDnsElasticIp(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getReverseDnsElasticIp");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**ReverseDnsRecord**](ReverseDnsRecord.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**ReverseDnsRecord**](ReverseDnsRecord.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getReverseDnsInstance

> ReverseDnsRecord getReverseDnsInstance(id)

Query the PTR DNS records for an instance



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            ReverseDnsRecord result = client.getReverseDnsInstance(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getReverseDnsInstance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**ReverseDnsRecord**](ReverseDnsRecord.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**ReverseDnsRecord**](ReverseDnsRecord.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getSecurityGroup

> SecurityGroup getSecurityGroup(id)

Retrieve Security Group details



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            SecurityGroup result = client.getSecurityGroup(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getSecurityGroup");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**SecurityGroup**](SecurityGroup.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**SecurityGroup**](SecurityGroup.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getSksCluster

> SksCluster getSksCluster(id)

Retrieve SKS cluster details



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            SksCluster result = client.getSksCluster(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getSksCluster");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**SksCluster**](SksCluster.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**SksCluster**](SksCluster.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getSksClusterAuthorityCert

> GetSksClusterAuthorityCert200Response getSksClusterAuthorityCert(id, authority)

Get the certificate for a SKS cluster authority

This operation returns the certificate for the given SKS cluster authority encoded in base64.

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        String authority = "control-plane"; // String | 

        try {
            // Invoke the API method
            GetSksClusterAuthorityCert200Response result = client.getSksClusterAuthorityCert(id, authority);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getSksClusterAuthorityCert");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **authority** | **String**|  | [enum: control-plane, aggregation, kubelet] |

### Return type

[**GetSksClusterAuthorityCert200Response**](GetSksClusterAuthorityCert200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **authority** | **String**|  | [enum: control-plane, aggregation, kubelet] |

### Return type

ApiResponse<[**GetSksClusterAuthorityCert200Response**](GetSksClusterAuthorityCert200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getSksClusterInspection

> Map<String, Object> getSksClusterInspection(id)

Get the latest inspection result

Helps troubleshoot common problems when deploying a kubernetes cluster. Inspections run every couple of minutes.

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Map<String, Object> result = client.getSksClusterInspection(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getSksClusterInspection");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

**Map&lt;String, Object&gt;**


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<**Map&lt;String, Object&gt;**>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getSksNodepool

> SksNodepool getSksNodepool(id, sksNodepoolId)

Retrieve SKS Nodepool details



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UUID sksNodepoolId = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            SksNodepool result = client.getSksNodepool(id, sksNodepoolId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getSksNodepool");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **sksNodepoolId** | **UUID**|  | |

### Return type

[**SksNodepool**](SksNodepool.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **sksNodepoolId** | **UUID**|  | |

### Return type

ApiResponse<[**SksNodepool**](SksNodepool.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getSnapshot

> Snapshot getSnapshot(id)

Retrieve Snapshot details



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Snapshot result = client.getSnapshot(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getSnapshot");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Snapshot**](Snapshot.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Snapshot**](Snapshot.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getSosPresignedUrl

> GetSosPresignedUrl200Response getSosPresignedUrl(bucket, key)

Retrieve Presigned Download URL for SOS object

Generates Presigned Download URL for SOS object

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String bucket = "bucket_example"; // String | 
        String key = "key_example"; // String | 

        try {
            // Invoke the API method
            GetSosPresignedUrl200Response result = client.getSosPresignedUrl(bucket, key);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getSosPresignedUrl");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bucket** | **String**|  | |
| **key** | **String**|  | [optional] |

### Return type

[**GetSosPresignedUrl200Response**](GetSosPresignedUrl200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bucket** | **String**|  | |
| **key** | **String**|  | [optional] |

### Return type

ApiResponse<[**GetSosPresignedUrl200Response**](GetSosPresignedUrl200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getSshKey

> SshKey getSshKey(name)

Retrieve SSH key details



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            SshKey result = client.getSshKey(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getSshKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**SshKey**](SshKey.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**SshKey**](SshKey.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getTemplate

> Template getTemplate(id)

Retrieve Template details



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Template result = client.getTemplate(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#getTemplate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Template**](Template.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Template**](Template.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listAntiAffinityGroups

> ListAntiAffinityGroups200Response listAntiAffinityGroups()

List Anti-affinity Groups



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            ListAntiAffinityGroups200Response result = client.listAntiAffinityGroups();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listAntiAffinityGroups");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListAntiAffinityGroups200Response**](ListAntiAffinityGroups200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListAntiAffinityGroups200Response**](ListAntiAffinityGroups200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listApiKeys

> ListApiKeys200Response listApiKeys()

List API keys

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            ListApiKeys200Response result = client.listApiKeys();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listApiKeys");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListApiKeys200Response**](ListApiKeys200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListApiKeys200Response**](ListApiKeys200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listBlockStorageSnapshots

> ListBlockStorageSnapshots200Response listBlockStorageSnapshots()

List block storage snapshots



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            ListBlockStorageSnapshots200Response result = client.listBlockStorageSnapshots();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listBlockStorageSnapshots");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListBlockStorageSnapshots200Response**](ListBlockStorageSnapshots200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListBlockStorageSnapshots200Response**](ListBlockStorageSnapshots200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listBlockStorageVolumes

> ListBlockStorageVolumes200Response listBlockStorageVolumes(instanceId)

List block storage volumes



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID instanceId = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            ListBlockStorageVolumes200Response result = client.listBlockStorageVolumes(instanceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listBlockStorageVolumes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceId** | **UUID**|  | [optional] |

### Return type

[**ListBlockStorageVolumes200Response**](ListBlockStorageVolumes200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceId** | **UUID**|  | [optional] |

### Return type

ApiResponse<[**ListBlockStorageVolumes200Response**](ListBlockStorageVolumes200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listDbaasExternalEndpointTypes

> ListDbaasExternalEndpointTypes200Response listDbaasExternalEndpointTypes()



[BETA] List available external endpoint types and their schemas for DBaaS external integrations

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            ListDbaasExternalEndpointTypes200Response result = client.listDbaasExternalEndpointTypes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listDbaasExternalEndpointTypes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListDbaasExternalEndpointTypes200Response**](ListDbaasExternalEndpointTypes200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListDbaasExternalEndpointTypes200Response**](ListDbaasExternalEndpointTypes200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listDbaasExternalEndpoints

> ListDbaasExternalEndpoints200Response listDbaasExternalEndpoints()



[BETA] List available external endpoints for integrations

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            ListDbaasExternalEndpoints200Response result = client.listDbaasExternalEndpoints();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listDbaasExternalEndpoints");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListDbaasExternalEndpoints200Response**](ListDbaasExternalEndpoints200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListDbaasExternalEndpoints200Response**](ListDbaasExternalEndpoints200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listDbaasExternalIntegrations

> ListDbaasExternalIntegrations200Response listDbaasExternalIntegrations(serviceName)



[BETA] List all DBaaS connections between services and external endpoints

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 

        try {
            // Invoke the API method
            ListDbaasExternalIntegrations200Response result = client.listDbaasExternalIntegrations(serviceName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listDbaasExternalIntegrations");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |

### Return type

[**ListDbaasExternalIntegrations200Response**](ListDbaasExternalIntegrations200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |

### Return type

ApiResponse<[**ListDbaasExternalIntegrations200Response**](ListDbaasExternalIntegrations200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listDbaasIntegrationSettings

> ListDbaasIntegrationSettings200Response listDbaasIntegrationSettings(integrationType, sourceType, destType)



[BETA] Get DBaaS integration settings

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String integrationType = "integrationType_example"; // String | 
        String sourceType = "sourceType_example"; // String | 
        String destType = "destType_example"; // String | 

        try {
            // Invoke the API method
            ListDbaasIntegrationSettings200Response result = client.listDbaasIntegrationSettings(integrationType, sourceType, destType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listDbaasIntegrationSettings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | **String**|  | |
| **sourceType** | **String**|  | |
| **destType** | **String**|  | |

### Return type

[**ListDbaasIntegrationSettings200Response**](ListDbaasIntegrationSettings200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationType** | **String**|  | |
| **sourceType** | **String**|  | |
| **destType** | **String**|  | |

### Return type

ApiResponse<[**ListDbaasIntegrationSettings200Response**](ListDbaasIntegrationSettings200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listDbaasIntegrationTypes

> ListDbaasIntegrationTypes200Response listDbaasIntegrationTypes()



[BETA] Get DBaaS integration types

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            ListDbaasIntegrationTypes200Response result = client.listDbaasIntegrationTypes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listDbaasIntegrationTypes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListDbaasIntegrationTypes200Response**](ListDbaasIntegrationTypes200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListDbaasIntegrationTypes200Response**](ListDbaasIntegrationTypes200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listDbaasServiceTypes

> ListDbaasServiceTypes200Response listDbaasServiceTypes()

DBaaS Service Types

List available service types for DBaaS

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            ListDbaasServiceTypes200Response result = client.listDbaasServiceTypes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listDbaasServiceTypes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListDbaasServiceTypes200Response**](ListDbaasServiceTypes200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListDbaasServiceTypes200Response**](ListDbaasServiceTypes200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listDbaasServices

> ListDbaasServices200Response listDbaasServices()

List DBaaS services

List DBaaS services

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            ListDbaasServices200Response result = client.listDbaasServices();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listDbaasServices");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListDbaasServices200Response**](ListDbaasServices200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListDbaasServices200Response**](ListDbaasServices200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listDeployTargets

> ListDeployTargets200Response listDeployTargets()

List Deploy Targets



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            ListDeployTargets200Response result = client.listDeployTargets();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listDeployTargets");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListDeployTargets200Response**](ListDeployTargets200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListDeployTargets200Response**](ListDeployTargets200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listDnsDomainRecords

> ListDnsDomainRecords200Response listDnsDomainRecords(domainId)

List DNS domain records



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID domainId = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            ListDnsDomainRecords200Response result = client.listDnsDomainRecords(domainId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listDnsDomainRecords");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domainId** | **UUID**|  | |

### Return type

[**ListDnsDomainRecords200Response**](ListDnsDomainRecords200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domainId** | **UUID**|  | |

### Return type

ApiResponse<[**ListDnsDomainRecords200Response**](ListDnsDomainRecords200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listDnsDomains

> ListDnsDomains200Response listDnsDomains()

List DNS domains



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            ListDnsDomains200Response result = client.listDnsDomains();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listDnsDomains");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListDnsDomains200Response**](ListDnsDomains200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListDnsDomains200Response**](ListDnsDomains200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listElasticIps

> ListElasticIps200Response listElasticIps()

List Elastic IPs



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            ListElasticIps200Response result = client.listElasticIps();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listElasticIps");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListElasticIps200Response**](ListElasticIps200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListElasticIps200Response**](ListElasticIps200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listEvents

> List<Event> listEvents(from, to)

List Events

Retrieve Mutation Events for a given date range. Defaults to retrieving Events for the past 24 hours.          Both a &#x60;from&#x60; and &#x60;to&#x60; arguments can be specified to filter Events over a specific period.          Events will be the the most descriptive possible but not all fields are mandatory

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        OffsetDateTime from = OffsetDateTime.now(); // OffsetDateTime |  please add at least all the required fields
        OffsetDateTime to = OffsetDateTime.now(); // OffsetDateTime |  please add at least all the required fields

        try {
            // Invoke the API method
            List<Event> result = client.listEvents(from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listEvents");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **from** | **OffsetDateTime**|  | [optional] |
| **to** | **OffsetDateTime**|  | [optional] |

### Return type

[**List&lt;Event&gt;**](Event.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **from** | **OffsetDateTime**|  | [optional] |
| **to** | **OffsetDateTime**|  | [optional] |

### Return type

ApiResponse<[**List&lt;Event&gt;**](Event.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listIamRoles

> ListIamRoles200Response listIamRoles()

List IAM Roles



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            ListIamRoles200Response result = client.listIamRoles();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listIamRoles");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListIamRoles200Response**](ListIamRoles200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListIamRoles200Response**](ListIamRoles200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listInstancePools

> ListInstancePools200Response listInstancePools()

List Instance Pools



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            ListInstancePools200Response result = client.listInstancePools();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listInstancePools");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListInstancePools200Response**](ListInstancePools200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListInstancePools200Response**](ListInstancePools200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listInstanceTypes

> ListInstanceTypes200Response listInstanceTypes()

List Compute instance Types



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            ListInstanceTypes200Response result = client.listInstanceTypes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listInstanceTypes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListInstanceTypes200Response**](ListInstanceTypes200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListInstanceTypes200Response**](ListInstanceTypes200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listInstances

> ListInstances200Response listInstances(managerId, managerType, ipAddress)

List Compute instances



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID managerId = UUID.randomUUID(); // UUID | 
        String managerType = "instance-pool"; // String | 
        String ipAddress = "ipAddress_example"; // String | 

        try {
            // Invoke the API method
            ListInstances200Response result = client.listInstances(managerId, managerType, ipAddress);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listInstances");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **managerId** | **UUID**|  | [optional] |
| **managerType** | **String**|  | [optional] [enum: instance-pool] |
| **ipAddress** | **String**|  | [optional] |

### Return type

[**ListInstances200Response**](ListInstances200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **managerId** | **UUID**|  | [optional] |
| **managerType** | **String**|  | [optional] [enum: instance-pool] |
| **ipAddress** | **String**|  | [optional] |

### Return type

ApiResponse<[**ListInstances200Response**](ListInstances200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listLoadBalancers

> ListLoadBalancers200Response listLoadBalancers()

List Load Balancers



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            ListLoadBalancers200Response result = client.listLoadBalancers();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listLoadBalancers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListLoadBalancers200Response**](ListLoadBalancers200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListLoadBalancers200Response**](ListLoadBalancers200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listPrivateNetworks

> ListPrivateNetworks200Response listPrivateNetworks()

List Private Networks



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            ListPrivateNetworks200Response result = client.listPrivateNetworks();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listPrivateNetworks");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListPrivateNetworks200Response**](ListPrivateNetworks200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListPrivateNetworks200Response**](ListPrivateNetworks200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listQuotas

> ListQuotas200Response listQuotas()

List Organization Quotas



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            ListQuotas200Response result = client.listQuotas();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listQuotas");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListQuotas200Response**](ListQuotas200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListQuotas200Response**](ListQuotas200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listSecurityGroups

> ListSecurityGroups200Response listSecurityGroups(visibility)

List Security Groups.

Lists security groups. When visibility is set to public, lists public security groups. Public security groups are objects maintained by Exoscale which contain source addresses for relevant services hosted by Exoscale. They can be used a source in ingress rules and as a destination in egress rules.

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String visibility = "private"; // String | 

        try {
            // Invoke the API method
            ListSecurityGroups200Response result = client.listSecurityGroups(visibility);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listSecurityGroups");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **visibility** | **String**|  | [optional] [enum: private, public] |

### Return type

[**ListSecurityGroups200Response**](ListSecurityGroups200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **visibility** | **String**|  | [optional] [enum: private, public] |

### Return type

ApiResponse<[**ListSecurityGroups200Response**](ListSecurityGroups200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listSksClusterDeprecatedResources

> List<Map<String, String>> listSksClusterDeprecatedResources(id)

Resources that are scheduled to be removed in future kubernetes releases

This operation returns the deprecated resources for a given cluster

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            List<Map<String, String>> result = client.listSksClusterDeprecatedResources(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listSksClusterDeprecatedResources");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**List&lt;Map&lt;String, String&gt;&gt;**](Map.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**List&lt;Map&lt;String, String&gt;&gt;**](Map.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listSksClusterVersions

> ListSksClusterVersions200Response listSksClusterVersions(includeDeprecated)

List available versions for SKS clusters



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String includeDeprecated = "includeDeprecated_example"; // String | 

        try {
            // Invoke the API method
            ListSksClusterVersions200Response result = client.listSksClusterVersions(includeDeprecated);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listSksClusterVersions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **includeDeprecated** | **String**|  | [optional] |

### Return type

[**ListSksClusterVersions200Response**](ListSksClusterVersions200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **includeDeprecated** | **String**|  | [optional] |

### Return type

ApiResponse<[**ListSksClusterVersions200Response**](ListSksClusterVersions200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listSksClusters

> ListSksClusters200Response listSksClusters()

List SKS clusters



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            ListSksClusters200Response result = client.listSksClusters();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listSksClusters");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListSksClusters200Response**](ListSksClusters200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListSksClusters200Response**](ListSksClusters200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listSnapshots

> ListSnapshots200Response listSnapshots()

List Snapshots



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            ListSnapshots200Response result = client.listSnapshots();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listSnapshots");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListSnapshots200Response**](ListSnapshots200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListSnapshots200Response**](ListSnapshots200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listSosBucketsUsage

> ListSosBucketsUsage200Response listSosBucketsUsage()

List SOS Buckets Usage



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            ListSosBucketsUsage200Response result = client.listSosBucketsUsage();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listSosBucketsUsage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListSosBucketsUsage200Response**](ListSosBucketsUsage200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListSosBucketsUsage200Response**](ListSosBucketsUsage200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listSshKeys

> ListSshKeys200Response listSshKeys()

List SSH keys



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            ListSshKeys200Response result = client.listSshKeys();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listSshKeys");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListSshKeys200Response**](ListSshKeys200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListSshKeys200Response**](ListSshKeys200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listTemplates

> ListTemplates200Response listTemplates(visibility, family)

List Templates



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String visibility = "private"; // String | 
        String family = "family_example"; // String | 

        try {
            // Invoke the API method
            ListTemplates200Response result = client.listTemplates(visibility, family);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listTemplates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **visibility** | **String**|  | [optional] [enum: private, public] |
| **family** | **String**|  | [optional] |

### Return type

[**ListTemplates200Response**](ListTemplates200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **visibility** | **String**|  | [optional] [enum: private, public] |
| **family** | **String**|  | [optional] |

### Return type

ApiResponse<[**ListTemplates200Response**](ListTemplates200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listUsers

> ListUsers200Response listUsers()

List Users

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            ListUsers200Response result = client.listUsers();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listUsers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListUsers200Response**](ListUsers200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListUsers200Response**](ListUsers200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listZones

> ListZones200Response listZones()

List Zones



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            ListZones200Response result = client.listZones();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#listZones");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListZones200Response**](ListZones200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListZones200Response**](ListZones200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## promoteSnapshotToTemplate

> Operation promoteSnapshotToTemplate(id, promoteSnapshotToTemplateRequest)

Promote a Snapshot to a Template



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        PromoteSnapshotToTemplateRequest promoteSnapshotToTemplateRequest = new PromoteSnapshotToTemplateRequest(); // PromoteSnapshotToTemplateRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.promoteSnapshotToTemplate(id, promoteSnapshotToTemplateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#promoteSnapshotToTemplate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **promoteSnapshotToTemplateRequest** | [**PromoteSnapshotToTemplateRequest**](PromoteSnapshotToTemplateRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **promoteSnapshotToTemplateRequest** | [**PromoteSnapshotToTemplateRequest**](PromoteSnapshotToTemplateRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## rebootInstance

> Operation rebootInstance(id)

Reboot a Compute instance



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.rebootInstance(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#rebootInstance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## registerSshKey

> Operation registerSshKey(registerSshKeyRequest)

Import SSH key



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        RegisterSshKeyRequest registerSshKeyRequest = new RegisterSshKeyRequest(); // RegisterSshKeyRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.registerSshKey(registerSshKeyRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#registerSshKey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **registerSshKeyRequest** | [**RegisterSshKeyRequest**](RegisterSshKeyRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **registerSshKeyRequest** | [**RegisterSshKeyRequest**](RegisterSshKeyRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## registerTemplate

> Operation registerTemplate(registerTemplateRequest)

Register a Template



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        RegisterTemplateRequest registerTemplateRequest = new RegisterTemplateRequest(); // RegisterTemplateRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.registerTemplate(registerTemplateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#registerTemplate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **registerTemplateRequest** | [**RegisterTemplateRequest**](RegisterTemplateRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **registerTemplateRequest** | [**RegisterTemplateRequest**](RegisterTemplateRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## removeExternalSourceFromSecurityGroup

> Operation removeExternalSourceFromSecurityGroup(id, removeExternalSourceFromSecurityGroupRequest)

Remove an external source from a Security Group



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        RemoveExternalSourceFromSecurityGroupRequest removeExternalSourceFromSecurityGroupRequest = new RemoveExternalSourceFromSecurityGroupRequest(); // RemoveExternalSourceFromSecurityGroupRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.removeExternalSourceFromSecurityGroup(id, removeExternalSourceFromSecurityGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#removeExternalSourceFromSecurityGroup");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **removeExternalSourceFromSecurityGroupRequest** | [**RemoveExternalSourceFromSecurityGroupRequest**](RemoveExternalSourceFromSecurityGroupRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **removeExternalSourceFromSecurityGroupRequest** | [**RemoveExternalSourceFromSecurityGroupRequest**](RemoveExternalSourceFromSecurityGroupRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## removeInstanceProtection

> Operation removeInstanceProtection(id)

Remove instance destruction protection



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.removeInstanceProtection(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#removeInstanceProtection");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## resetDbaasGrafanaUserPassword

> Operation resetDbaasGrafanaUserPassword(serviceName, username, resetDbaasValkeyUserPasswordRequest)

Reset the credentials of a DBaaS Grafana user

If no password is provided one will be generated automatically.

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        String username = "username_example"; // String | 
        ResetDbaasValkeyUserPasswordRequest resetDbaasValkeyUserPasswordRequest = new ResetDbaasValkeyUserPasswordRequest(); // ResetDbaasValkeyUserPasswordRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.resetDbaasGrafanaUserPassword(serviceName, username, resetDbaasValkeyUserPasswordRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#resetDbaasGrafanaUserPassword");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |
| **resetDbaasValkeyUserPasswordRequest** | [**ResetDbaasValkeyUserPasswordRequest**](ResetDbaasValkeyUserPasswordRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |
| **resetDbaasValkeyUserPasswordRequest** | [**ResetDbaasValkeyUserPasswordRequest**](ResetDbaasValkeyUserPasswordRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## resetDbaasKafkaUserPassword

> Operation resetDbaasKafkaUserPassword(serviceName, username, resetDbaasValkeyUserPasswordRequest)

Reset the credentials of a DBaaS Kafka user

If no password is provided one will be generated automatically.

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        String username = "username_example"; // String | 
        ResetDbaasValkeyUserPasswordRequest resetDbaasValkeyUserPasswordRequest = new ResetDbaasValkeyUserPasswordRequest(); // ResetDbaasValkeyUserPasswordRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.resetDbaasKafkaUserPassword(serviceName, username, resetDbaasValkeyUserPasswordRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#resetDbaasKafkaUserPassword");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |
| **resetDbaasValkeyUserPasswordRequest** | [**ResetDbaasValkeyUserPasswordRequest**](ResetDbaasValkeyUserPasswordRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |
| **resetDbaasValkeyUserPasswordRequest** | [**ResetDbaasValkeyUserPasswordRequest**](ResetDbaasValkeyUserPasswordRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## resetDbaasMysqlUserPassword

> Operation resetDbaasMysqlUserPassword(serviceName, username, resetDbaasMysqlUserPasswordRequest)

Reset the credentials of a DBaaS mysql user

If no password is provided one will be generated automatically.

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        String username = "username_example"; // String | 
        ResetDbaasMysqlUserPasswordRequest resetDbaasMysqlUserPasswordRequest = new ResetDbaasMysqlUserPasswordRequest(); // ResetDbaasMysqlUserPasswordRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.resetDbaasMysqlUserPassword(serviceName, username, resetDbaasMysqlUserPasswordRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#resetDbaasMysqlUserPassword");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |
| **resetDbaasMysqlUserPasswordRequest** | [**ResetDbaasMysqlUserPasswordRequest**](ResetDbaasMysqlUserPasswordRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |
| **resetDbaasMysqlUserPasswordRequest** | [**ResetDbaasMysqlUserPasswordRequest**](ResetDbaasMysqlUserPasswordRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## resetDbaasOpensearchUserPassword

> Operation resetDbaasOpensearchUserPassword(serviceName, username, resetDbaasValkeyUserPasswordRequest)

Reset the credentials of a DBaaS OpenSearch user

If no password is provided one will be generated automatically.

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        String username = "username_example"; // String | 
        ResetDbaasValkeyUserPasswordRequest resetDbaasValkeyUserPasswordRequest = new ResetDbaasValkeyUserPasswordRequest(); // ResetDbaasValkeyUserPasswordRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.resetDbaasOpensearchUserPassword(serviceName, username, resetDbaasValkeyUserPasswordRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#resetDbaasOpensearchUserPassword");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |
| **resetDbaasValkeyUserPasswordRequest** | [**ResetDbaasValkeyUserPasswordRequest**](ResetDbaasValkeyUserPasswordRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |
| **resetDbaasValkeyUserPasswordRequest** | [**ResetDbaasValkeyUserPasswordRequest**](ResetDbaasValkeyUserPasswordRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## resetDbaasPostgresUserPassword

> Operation resetDbaasPostgresUserPassword(serviceName, username, resetDbaasValkeyUserPasswordRequest)

Reset the credentials of a DBaaS Postgres user

If no password is provided one will be generated automatically.

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        String username = "username_example"; // String | 
        ResetDbaasValkeyUserPasswordRequest resetDbaasValkeyUserPasswordRequest = new ResetDbaasValkeyUserPasswordRequest(); // ResetDbaasValkeyUserPasswordRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.resetDbaasPostgresUserPassword(serviceName, username, resetDbaasValkeyUserPasswordRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#resetDbaasPostgresUserPassword");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |
| **resetDbaasValkeyUserPasswordRequest** | [**ResetDbaasValkeyUserPasswordRequest**](ResetDbaasValkeyUserPasswordRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |
| **resetDbaasValkeyUserPasswordRequest** | [**ResetDbaasValkeyUserPasswordRequest**](ResetDbaasValkeyUserPasswordRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## resetDbaasRedisUserPassword

> Operation resetDbaasRedisUserPassword(serviceName, username, resetDbaasValkeyUserPasswordRequest)

Reset the credentials of a DBaaS Redis user

If no password is provided one will be generated automatically.

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        String username = "username_example"; // String | 
        ResetDbaasValkeyUserPasswordRequest resetDbaasValkeyUserPasswordRequest = new ResetDbaasValkeyUserPasswordRequest(); // ResetDbaasValkeyUserPasswordRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.resetDbaasRedisUserPassword(serviceName, username, resetDbaasValkeyUserPasswordRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#resetDbaasRedisUserPassword");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |
| **resetDbaasValkeyUserPasswordRequest** | [**ResetDbaasValkeyUserPasswordRequest**](ResetDbaasValkeyUserPasswordRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |
| **resetDbaasValkeyUserPasswordRequest** | [**ResetDbaasValkeyUserPasswordRequest**](ResetDbaasValkeyUserPasswordRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## resetDbaasValkeyUserPassword

> Operation resetDbaasValkeyUserPassword(serviceName, username, resetDbaasValkeyUserPasswordRequest)

Reset the credentials of a DBaaS Valkey user

If no password is provided one will be generated automatically.

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        String username = "username_example"; // String | 
        ResetDbaasValkeyUserPasswordRequest resetDbaasValkeyUserPasswordRequest = new ResetDbaasValkeyUserPasswordRequest(); // ResetDbaasValkeyUserPasswordRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.resetDbaasValkeyUserPassword(serviceName, username, resetDbaasValkeyUserPasswordRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#resetDbaasValkeyUserPassword");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |
| **resetDbaasValkeyUserPasswordRequest** | [**ResetDbaasValkeyUserPasswordRequest**](ResetDbaasValkeyUserPasswordRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |
| **resetDbaasValkeyUserPasswordRequest** | [**ResetDbaasValkeyUserPasswordRequest**](ResetDbaasValkeyUserPasswordRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## resetElasticIpField

> Operation resetElasticIpField(id, field)

Reset an Elastic IP field to its default value



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        String field = "description"; // String | 

        try {
            // Invoke the API method
            Operation result = client.resetElasticIpField(id, field);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#resetElasticIpField");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **field** | **String**|  | [enum: description] |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **field** | **String**|  | [enum: description] |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## resetIamOrganizationPolicy

> Operation resetIamOrganizationPolicy()

Reset IAM Organization Policy



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));

        try {
            // Invoke the API method
            Operation result = client.resetIamOrganizationPolicy();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#resetIamOrganizationPolicy");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## resetInstance

> Operation resetInstance(id, resetInstanceRequest)

Reset a Compute instance to a base/target template

This operation re-installs a Compute instance to a base template. If target template is provided it will be used to recreated instance from. Warning: the operation wipes all data stored on the disk.

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        ResetInstanceRequest resetInstanceRequest = new ResetInstanceRequest(); // ResetInstanceRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.resetInstance(id, resetInstanceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#resetInstance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **resetInstanceRequest** | [**ResetInstanceRequest**](ResetInstanceRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **resetInstanceRequest** | [**ResetInstanceRequest**](ResetInstanceRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## resetInstanceField

> Operation resetInstanceField(id, field)

Reset Instance field



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        String field = "labels"; // String | 

        try {
            // Invoke the API method
            Operation result = client.resetInstanceField(id, field);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#resetInstanceField");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **field** | **String**|  | [enum: labels] |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **field** | **String**|  | [enum: labels] |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## resetInstancePassword

> Operation resetInstancePassword(id)

Reset a compute instance password



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.resetInstancePassword(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#resetInstancePassword");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## resetInstancePoolField

> Operation resetInstancePoolField(id, field)

Reset an Instance Pool field to its default value



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        String field = "anti-affinity-groups"; // String | 

        try {
            // Invoke the API method
            Operation result = client.resetInstancePoolField(id, field);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#resetInstancePoolField");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **field** | **String**|  | [enum: anti-affinity-groups, description, labels, security-groups, elastic-ips, private-networks, ssh-key, user-data, deploy-target, ipv6-enabled] |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **field** | **String**|  | [enum: anti-affinity-groups, description, labels, security-groups, elastic-ips, private-networks, ssh-key, user-data, deploy-target, ipv6-enabled] |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## resetLoadBalancerField

> Operation resetLoadBalancerField(id, field)

Reset a Load Balancer field to its default value



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        String field = "description"; // String | 

        try {
            // Invoke the API method
            Operation result = client.resetLoadBalancerField(id, field);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#resetLoadBalancerField");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **field** | **String**|  | [enum: description, labels] |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **field** | **String**|  | [enum: description, labels] |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## resetLoadBalancerServiceField

> Operation resetLoadBalancerServiceField(id, serviceId, field)

Reset a Load Balancer Service field to its default value



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UUID serviceId = UUID.randomUUID(); // UUID | 
        String field = "description"; // String | 

        try {
            // Invoke the API method
            Operation result = client.resetLoadBalancerServiceField(id, serviceId, field);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#resetLoadBalancerServiceField");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **serviceId** | **UUID**|  | |
| **field** | **String**|  | [enum: description] |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **serviceId** | **UUID**|  | |
| **field** | **String**|  | [enum: description] |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## resetPrivateNetworkField

> Operation resetPrivateNetworkField(id, field)

Reset Private Network field



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        String field = "labels"; // String | 

        try {
            // Invoke the API method
            Operation result = client.resetPrivateNetworkField(id, field);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#resetPrivateNetworkField");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **field** | **String**|  | [enum: labels] |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **field** | **String**|  | [enum: labels] |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## resetSksClusterField

> Operation resetSksClusterField(id, field)

Reset an SKS cluster field to its default value



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        String field = "description"; // String | 

        try {
            // Invoke the API method
            Operation result = client.resetSksClusterField(id, field);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#resetSksClusterField");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **field** | **String**|  | [enum: description, labels] |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **field** | **String**|  | [enum: description, labels] |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## resetSksNodepoolField

> Operation resetSksNodepoolField(id, sksNodepoolId, field)

Reset an SKS Nodepool field to its default value



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UUID sksNodepoolId = UUID.randomUUID(); // UUID | 
        String field = "anti-affinity-groups"; // String | 

        try {
            // Invoke the API method
            Operation result = client.resetSksNodepoolField(id, sksNodepoolId, field);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#resetSksNodepoolField");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **sksNodepoolId** | **UUID**|  | |
| **field** | **String**|  | [enum: anti-affinity-groups, description, labels, security-groups, private-networks, deploy-target] |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **sksNodepoolId** | **UUID**|  | |
| **field** | **String**|  | [enum: anti-affinity-groups, description, labels, security-groups, private-networks, deploy-target] |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## resizeBlockStorageVolume

> BlockStorageVolume resizeBlockStorageVolume(id, resizeBlockStorageVolumeRequest)

Resize a block storage volume

This operation resizes a Block storage volume. Note: the volume can only grow, cannot be shrunk.

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        ResizeBlockStorageVolumeRequest resizeBlockStorageVolumeRequest = new ResizeBlockStorageVolumeRequest(); // ResizeBlockStorageVolumeRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            BlockStorageVolume result = client.resizeBlockStorageVolume(id, resizeBlockStorageVolumeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#resizeBlockStorageVolume");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **resizeBlockStorageVolumeRequest** | [**ResizeBlockStorageVolumeRequest**](ResizeBlockStorageVolumeRequest.md)|  | |

### Return type

[**BlockStorageVolume**](BlockStorageVolume.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **resizeBlockStorageVolumeRequest** | [**ResizeBlockStorageVolumeRequest**](ResizeBlockStorageVolumeRequest.md)|  | |

### Return type

ApiResponse<[**BlockStorageVolume**](BlockStorageVolume.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## resizeInstanceDisk

> Operation resizeInstanceDisk(id, resizeInstanceDiskRequest)

Resize a Compute instance disk

This operation resizes a Compute instance&#39;s disk volume. Note: the disk can only grow, cannot be shrunk.

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        ResizeInstanceDiskRequest resizeInstanceDiskRequest = new ResizeInstanceDiskRequest(); // ResizeInstanceDiskRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.resizeInstanceDisk(id, resizeInstanceDiskRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#resizeInstanceDisk");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **resizeInstanceDiskRequest** | [**ResizeInstanceDiskRequest**](ResizeInstanceDiskRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **resizeInstanceDiskRequest** | [**ResizeInstanceDiskRequest**](ResizeInstanceDiskRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## revealDbaasGrafanaUserPassword

> DbaasUserGrafanaSecrets revealDbaasGrafanaUserPassword(serviceName, username)

Reveal the secrets of a DBaaS Grafana user

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        String username = "username_example"; // String | 

        try {
            // Invoke the API method
            DbaasUserGrafanaSecrets result = client.revealDbaasGrafanaUserPassword(serviceName, username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#revealDbaasGrafanaUserPassword");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

[**DbaasUserGrafanaSecrets**](DbaasUserGrafanaSecrets.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

ApiResponse<[**DbaasUserGrafanaSecrets**](DbaasUserGrafanaSecrets.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## revealDbaasKafkaConnectPassword

> DbaasUserKafkaConnectSecrets revealDbaasKafkaConnectPassword(serviceName)

Reveal the secrets for DBaaS Kafka Connect

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 

        try {
            // Invoke the API method
            DbaasUserKafkaConnectSecrets result = client.revealDbaasKafkaConnectPassword(serviceName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#revealDbaasKafkaConnectPassword");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |

### Return type

[**DbaasUserKafkaConnectSecrets**](DbaasUserKafkaConnectSecrets.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |

### Return type

ApiResponse<[**DbaasUserKafkaConnectSecrets**](DbaasUserKafkaConnectSecrets.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## revealDbaasKafkaUserPassword

> DbaasUserKafkaSecrets revealDbaasKafkaUserPassword(serviceName, username)

Reveal the secrets of a DBaaS Kafka user

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        String username = "username_example"; // String | 

        try {
            // Invoke the API method
            DbaasUserKafkaSecrets result = client.revealDbaasKafkaUserPassword(serviceName, username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#revealDbaasKafkaUserPassword");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

[**DbaasUserKafkaSecrets**](DbaasUserKafkaSecrets.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

ApiResponse<[**DbaasUserKafkaSecrets**](DbaasUserKafkaSecrets.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## revealDbaasMysqlUserPassword

> DbaasUserMysqlSecrets revealDbaasMysqlUserPassword(serviceName, username)

Reveal the secrets of a DBaaS MySQL user

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        String username = "username_example"; // String | 

        try {
            // Invoke the API method
            DbaasUserMysqlSecrets result = client.revealDbaasMysqlUserPassword(serviceName, username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#revealDbaasMysqlUserPassword");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

[**DbaasUserMysqlSecrets**](DbaasUserMysqlSecrets.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

ApiResponse<[**DbaasUserMysqlSecrets**](DbaasUserMysqlSecrets.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## revealDbaasOpensearchUserPassword

> DbaasUserOpensearchSecrets revealDbaasOpensearchUserPassword(serviceName, username)

Reveal the secrets of a DBaaS OpenSearch user

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        String username = "username_example"; // String | 

        try {
            // Invoke the API method
            DbaasUserOpensearchSecrets result = client.revealDbaasOpensearchUserPassword(serviceName, username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#revealDbaasOpensearchUserPassword");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

[**DbaasUserOpensearchSecrets**](DbaasUserOpensearchSecrets.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

ApiResponse<[**DbaasUserOpensearchSecrets**](DbaasUserOpensearchSecrets.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## revealDbaasPostgresUserPassword

> DbaasUserPostgresSecrets revealDbaasPostgresUserPassword(serviceName, username)

Reveal the secrets of a DBaaS Postgres user

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        String username = "username_example"; // String | 

        try {
            // Invoke the API method
            DbaasUserPostgresSecrets result = client.revealDbaasPostgresUserPassword(serviceName, username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#revealDbaasPostgresUserPassword");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

[**DbaasUserPostgresSecrets**](DbaasUserPostgresSecrets.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

ApiResponse<[**DbaasUserPostgresSecrets**](DbaasUserPostgresSecrets.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## revealDbaasRedisUserPassword

> DbaasUserRedisSecrets revealDbaasRedisUserPassword(serviceName, username)

Reveal the secrets of a DBaaS Redis user

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        String username = "username_example"; // String | 

        try {
            // Invoke the API method
            DbaasUserRedisSecrets result = client.revealDbaasRedisUserPassword(serviceName, username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#revealDbaasRedisUserPassword");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

[**DbaasUserRedisSecrets**](DbaasUserRedisSecrets.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

ApiResponse<[**DbaasUserRedisSecrets**](DbaasUserRedisSecrets.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## revealDbaasValkeyUserPassword

> DbaasUserValkeySecrets revealDbaasValkeyUserPassword(serviceName, username)

Reveal the secrets of a DBaaS Valkey user

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        String username = "username_example"; // String | 

        try {
            // Invoke the API method
            DbaasUserValkeySecrets result = client.revealDbaasValkeyUserPassword(serviceName, username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#revealDbaasValkeyUserPassword");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

[**DbaasUserValkeySecrets**](DbaasUserValkeySecrets.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |

### Return type

ApiResponse<[**DbaasUserValkeySecrets**](DbaasUserValkeySecrets.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## revealInstancePassword

> InstancePassword revealInstancePassword(id)

Reveal the password used during instance creation or the latest password reset.

Reveal the password used during instance creation or the latest password reset.             This is only available for VMs created against templates having the &#x60;password-enabled&#x60;             property set to &#x60;true&#x60;.              Passwords are transiently stored for at most 24 hours and intended to be retrieved shortly after             creation or resets.

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            InstancePassword result = client.revealInstancePassword(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#revealInstancePassword");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**InstancePassword**](InstancePassword.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**InstancePassword**](InstancePassword.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## revertInstanceToSnapshot

> Operation revertInstanceToSnapshot(instanceId, revertInstanceToSnapshotRequest)

Revert a snapshot for an instance

This operation reverts the snapshot to the Compute instance volume, restoring stored data as it was at the time of the snapshot. The Compute instance must be previously stopped.

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID instanceId = UUID.randomUUID(); // UUID | 
        RevertInstanceToSnapshotRequest revertInstanceToSnapshotRequest = new RevertInstanceToSnapshotRequest(); // RevertInstanceToSnapshotRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.revertInstanceToSnapshot(instanceId, revertInstanceToSnapshotRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#revertInstanceToSnapshot");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceId** | **UUID**|  | |
| **revertInstanceToSnapshotRequest** | [**RevertInstanceToSnapshotRequest**](RevertInstanceToSnapshotRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceId** | **UUID**|  | |
| **revertInstanceToSnapshotRequest** | [**RevertInstanceToSnapshotRequest**](RevertInstanceToSnapshotRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## rotateSksCcmCredentials

> Operation rotateSksCcmCredentials(id)

Rotate Exoscale CCM credentials



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.rotateSksCcmCredentials(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#rotateSksCcmCredentials");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## rotateSksOperatorsCa

> Operation rotateSksOperatorsCa(id)

Rotate operators certificate authority



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.rotateSksOperatorsCa(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#rotateSksOperatorsCa");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## scaleInstance

> Operation scaleInstance(id, scaleInstanceRequest)

Scale a Compute instance to a new Instance Type

This operation changes the Compute instance&#39;s type. Note: the new Instance Type must be within the same family (e.g. a standard instance cannot be scaled to gpu2 or storage).

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        ScaleInstanceRequest scaleInstanceRequest = new ScaleInstanceRequest(); // ScaleInstanceRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.scaleInstance(id, scaleInstanceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#scaleInstance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **scaleInstanceRequest** | [**ScaleInstanceRequest**](ScaleInstanceRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **scaleInstanceRequest** | [**ScaleInstanceRequest**](ScaleInstanceRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## scaleInstancePool

> Operation scaleInstancePool(id, scaleInstancePoolRequest)

Scale an Instance Pool



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        ScaleInstancePoolRequest scaleInstancePoolRequest = new ScaleInstancePoolRequest(); // ScaleInstancePoolRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.scaleInstancePool(id, scaleInstancePoolRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#scaleInstancePool");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **scaleInstancePoolRequest** | [**ScaleInstancePoolRequest**](ScaleInstancePoolRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **scaleInstancePoolRequest** | [**ScaleInstancePoolRequest**](ScaleInstancePoolRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## scaleSksNodepool

> Operation scaleSksNodepool(id, sksNodepoolId, scaleSksNodepoolRequest)

Scale a SKS Nodepool



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UUID sksNodepoolId = UUID.randomUUID(); // UUID | 
        ScaleSksNodepoolRequest scaleSksNodepoolRequest = new ScaleSksNodepoolRequest(); // ScaleSksNodepoolRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.scaleSksNodepool(id, sksNodepoolId, scaleSksNodepoolRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#scaleSksNodepool");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **sksNodepoolId** | **UUID**|  | |
| **scaleSksNodepoolRequest** | [**ScaleSksNodepoolRequest**](ScaleSksNodepoolRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **sksNodepoolId** | **UUID**|  | |
| **scaleSksNodepoolRequest** | [**ScaleSksNodepoolRequest**](ScaleSksNodepoolRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## startDbaasGrafanaMaintenance

> Operation startDbaasGrafanaMaintenance(name)

Initiate Grafana maintenance update

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.startDbaasGrafanaMaintenance(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#startDbaasGrafanaMaintenance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## startDbaasKafkaMaintenance

> Operation startDbaasKafkaMaintenance(name)

Initiate Kafka maintenance update

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.startDbaasKafkaMaintenance(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#startDbaasKafkaMaintenance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## startDbaasMysqlMaintenance

> Operation startDbaasMysqlMaintenance(name)

Initiate MySQL maintenance update

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.startDbaasMysqlMaintenance(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#startDbaasMysqlMaintenance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## startDbaasOpensearchMaintenance

> Operation startDbaasOpensearchMaintenance(name)

Initiate OpenSearch maintenance update

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.startDbaasOpensearchMaintenance(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#startDbaasOpensearchMaintenance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## startDbaasPgMaintenance

> Operation startDbaasPgMaintenance(name)

Initiate PostgreSQL maintenance update

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.startDbaasPgMaintenance(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#startDbaasPgMaintenance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## startDbaasRedisMaintenance

> Operation startDbaasRedisMaintenance(name)

Initiate Redis maintenance update

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.startDbaasRedisMaintenance(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#startDbaasRedisMaintenance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## startDbaasRedisToValkeyUpgrade

> Operation startDbaasRedisToValkeyUpgrade(name)

Initiate Redis upgrade to Valkey

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.startDbaasRedisToValkeyUpgrade(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#startDbaasRedisToValkeyUpgrade");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## startDbaasValkeyMaintenance

> Operation startDbaasValkeyMaintenance(name)

Initiate Valkey maintenance update

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.startDbaasValkeyMaintenance(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#startDbaasValkeyMaintenance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## startInstance

> Operation startInstance(id, startInstanceRequest)

Start a Compute instance

This operation starts a virtual machine, potentially using a rescue profile if specified

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        StartInstanceRequest startInstanceRequest = new StartInstanceRequest(); // StartInstanceRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.startInstance(id, startInstanceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#startInstance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **startInstanceRequest** | [**StartInstanceRequest**](StartInstanceRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **startInstanceRequest** | [**StartInstanceRequest**](StartInstanceRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## stopDbaasMysqlMigration

> Operation stopDbaasMysqlMigration(name)

Stop a DBaaS MySQL migration

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.stopDbaasMysqlMigration(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#stopDbaasMysqlMigration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## stopDbaasPgMigration

> Operation stopDbaasPgMigration(name)

Stop a DBaaS PostgreSQL migration

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.stopDbaasPgMigration(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#stopDbaasPgMigration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## stopDbaasRedisMigration

> Operation stopDbaasRedisMigration(name)

Stop a DBaaS Redis migration

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.stopDbaasRedisMigration(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#stopDbaasRedisMigration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## stopDbaasValkeyMigration

> Operation stopDbaasValkeyMigration(name)

Stop a DBaaS Valkey migration

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 

        try {
            // Invoke the API method
            Operation result = client.stopDbaasValkeyMigration(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#stopDbaasValkeyMigration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## stopInstance

> Operation stopInstance(id)

Stop a Compute instance



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.stopInstance(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#stopInstance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateBlockStorageSnapshot

> Operation updateBlockStorageSnapshot(id, updateBlockStorageSnapshotRequest)

Update block storage volume snapshot



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateBlockStorageSnapshotRequest updateBlockStorageSnapshotRequest = new UpdateBlockStorageSnapshotRequest(); // UpdateBlockStorageSnapshotRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateBlockStorageSnapshot(id, updateBlockStorageSnapshotRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateBlockStorageSnapshot");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateBlockStorageSnapshotRequest** | [**UpdateBlockStorageSnapshotRequest**](UpdateBlockStorageSnapshotRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateBlockStorageSnapshotRequest** | [**UpdateBlockStorageSnapshotRequest**](UpdateBlockStorageSnapshotRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateBlockStorageVolume

> Operation updateBlockStorageVolume(id, updateBlockStorageVolumeRequest)

Update block storage volume



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateBlockStorageVolumeRequest updateBlockStorageVolumeRequest = new UpdateBlockStorageVolumeRequest(); // UpdateBlockStorageVolumeRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateBlockStorageVolume(id, updateBlockStorageVolumeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateBlockStorageVolume");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateBlockStorageVolumeRequest** | [**UpdateBlockStorageVolumeRequest**](UpdateBlockStorageVolumeRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateBlockStorageVolumeRequest** | [**UpdateBlockStorageVolumeRequest**](UpdateBlockStorageVolumeRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateDbaasExternalEndpointDatadog

> Operation updateDbaasExternalEndpointDatadog(endpointId, dbaasEndpointDatadogInputUpdate)



[BETA] Update DataDog external integration endpoint

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID endpointId = UUID.randomUUID(); // UUID | 
        DbaasEndpointDatadogInputUpdate dbaasEndpointDatadogInputUpdate = new DbaasEndpointDatadogInputUpdate(); // DbaasEndpointDatadogInputUpdate |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateDbaasExternalEndpointDatadog(endpointId, dbaasEndpointDatadogInputUpdate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateDbaasExternalEndpointDatadog");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |
| **dbaasEndpointDatadogInputUpdate** | [**DbaasEndpointDatadogInputUpdate**](DbaasEndpointDatadogInputUpdate.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |
| **dbaasEndpointDatadogInputUpdate** | [**DbaasEndpointDatadogInputUpdate**](DbaasEndpointDatadogInputUpdate.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateDbaasExternalEndpointElasticsearch

> Operation updateDbaasExternalEndpointElasticsearch(endpointId, dbaasEndpointElasticsearchInputUpdate)



[BETA] Update ElasticSearch Logs external integration endpoint

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID endpointId = UUID.randomUUID(); // UUID | 
        DbaasEndpointElasticsearchInputUpdate dbaasEndpointElasticsearchInputUpdate = new DbaasEndpointElasticsearchInputUpdate(); // DbaasEndpointElasticsearchInputUpdate |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateDbaasExternalEndpointElasticsearch(endpointId, dbaasEndpointElasticsearchInputUpdate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateDbaasExternalEndpointElasticsearch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |
| **dbaasEndpointElasticsearchInputUpdate** | [**DbaasEndpointElasticsearchInputUpdate**](DbaasEndpointElasticsearchInputUpdate.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |
| **dbaasEndpointElasticsearchInputUpdate** | [**DbaasEndpointElasticsearchInputUpdate**](DbaasEndpointElasticsearchInputUpdate.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateDbaasExternalEndpointOpensearch

> Operation updateDbaasExternalEndpointOpensearch(endpointId, dbaasEndpointOpensearchInputUpdate)



[BETA] Update OpenSearch Logs external integration endpoint

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID endpointId = UUID.randomUUID(); // UUID | 
        DbaasEndpointOpensearchInputUpdate dbaasEndpointOpensearchInputUpdate = new DbaasEndpointOpensearchInputUpdate(); // DbaasEndpointOpensearchInputUpdate |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateDbaasExternalEndpointOpensearch(endpointId, dbaasEndpointOpensearchInputUpdate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateDbaasExternalEndpointOpensearch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |
| **dbaasEndpointOpensearchInputUpdate** | [**DbaasEndpointOpensearchInputUpdate**](DbaasEndpointOpensearchInputUpdate.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |
| **dbaasEndpointOpensearchInputUpdate** | [**DbaasEndpointOpensearchInputUpdate**](DbaasEndpointOpensearchInputUpdate.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateDbaasExternalEndpointPrometheus

> Operation updateDbaasExternalEndpointPrometheus(endpointId, dbaasEndpointPrometheusPayload)



[BETA] Update Prometheus external integration endpoint

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID endpointId = UUID.randomUUID(); // UUID | 
        DbaasEndpointPrometheusPayload dbaasEndpointPrometheusPayload = new DbaasEndpointPrometheusPayload(); // DbaasEndpointPrometheusPayload |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateDbaasExternalEndpointPrometheus(endpointId, dbaasEndpointPrometheusPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateDbaasExternalEndpointPrometheus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |
| **dbaasEndpointPrometheusPayload** | [**DbaasEndpointPrometheusPayload**](DbaasEndpointPrometheusPayload.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |
| **dbaasEndpointPrometheusPayload** | [**DbaasEndpointPrometheusPayload**](DbaasEndpointPrometheusPayload.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateDbaasExternalEndpointRsyslog

> Operation updateDbaasExternalEndpointRsyslog(endpointId, dbaasEndpointRsyslogInputUpdate)



[BETA] Update RSyslog external integration endpoint

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID endpointId = UUID.randomUUID(); // UUID | 
        DbaasEndpointRsyslogInputUpdate dbaasEndpointRsyslogInputUpdate = new DbaasEndpointRsyslogInputUpdate(); // DbaasEndpointRsyslogInputUpdate |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateDbaasExternalEndpointRsyslog(endpointId, dbaasEndpointRsyslogInputUpdate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateDbaasExternalEndpointRsyslog");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |
| **dbaasEndpointRsyslogInputUpdate** | [**DbaasEndpointRsyslogInputUpdate**](DbaasEndpointRsyslogInputUpdate.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointId** | **UUID**|  | |
| **dbaasEndpointRsyslogInputUpdate** | [**DbaasEndpointRsyslogInputUpdate**](DbaasEndpointRsyslogInputUpdate.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateDbaasExternalIntegrationSettingsDatadog

> Operation updateDbaasExternalIntegrationSettingsDatadog(integrationId, getDbaasExternalIntegrationSettingsDatadog200Response)



[BETA] Manage Datadog integration settings

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID integrationId = UUID.randomUUID(); // UUID | 
        GetDbaasExternalIntegrationSettingsDatadog200Response getDbaasExternalIntegrationSettingsDatadog200Response = new GetDbaasExternalIntegrationSettingsDatadog200Response(); // GetDbaasExternalIntegrationSettingsDatadog200Response |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateDbaasExternalIntegrationSettingsDatadog(integrationId, getDbaasExternalIntegrationSettingsDatadog200Response);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateDbaasExternalIntegrationSettingsDatadog");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationId** | **UUID**|  | |
| **getDbaasExternalIntegrationSettingsDatadog200Response** | [**GetDbaasExternalIntegrationSettingsDatadog200Response**](GetDbaasExternalIntegrationSettingsDatadog200Response.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationId** | **UUID**|  | |
| **getDbaasExternalIntegrationSettingsDatadog200Response** | [**GetDbaasExternalIntegrationSettingsDatadog200Response**](GetDbaasExternalIntegrationSettingsDatadog200Response.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateDbaasIntegration

> Operation updateDbaasIntegration(id, updateDbaasIntegrationRequest)



[BETA] Update a existing DBaaS integration

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateDbaasIntegrationRequest updateDbaasIntegrationRequest = new UpdateDbaasIntegrationRequest(); // UpdateDbaasIntegrationRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateDbaasIntegration(id, updateDbaasIntegrationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateDbaasIntegration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateDbaasIntegrationRequest** | [**UpdateDbaasIntegrationRequest**](UpdateDbaasIntegrationRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateDbaasIntegrationRequest** | [**UpdateDbaasIntegrationRequest**](UpdateDbaasIntegrationRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateDbaasOpensearchAclConfig

> Operation updateDbaasOpensearchAclConfig(name, dbaasOpensearchAclConfig)

Create a DBaaS OpenSearch ACL configuration

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 
        DbaasOpensearchAclConfig dbaasOpensearchAclConfig = new DbaasOpensearchAclConfig(); // DbaasOpensearchAclConfig |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateDbaasOpensearchAclConfig(name, dbaasOpensearchAclConfig);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateDbaasOpensearchAclConfig");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **dbaasOpensearchAclConfig** | [**DbaasOpensearchAclConfig**](DbaasOpensearchAclConfig.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **dbaasOpensearchAclConfig** | [**DbaasOpensearchAclConfig**](DbaasOpensearchAclConfig.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateDbaasPgConnectionPool

> Operation updateDbaasPgConnectionPool(serviceName, connectionPoolName, updateDbaasPgConnectionPoolRequest)

Update a DBaaS PostgreSQL connection pool



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        String connectionPoolName = "connectionPoolName_example"; // String | 
        UpdateDbaasPgConnectionPoolRequest updateDbaasPgConnectionPoolRequest = new UpdateDbaasPgConnectionPoolRequest(); // UpdateDbaasPgConnectionPoolRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateDbaasPgConnectionPool(serviceName, connectionPoolName, updateDbaasPgConnectionPoolRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateDbaasPgConnectionPool");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **connectionPoolName** | **String**|  | |
| **updateDbaasPgConnectionPoolRequest** | [**UpdateDbaasPgConnectionPoolRequest**](UpdateDbaasPgConnectionPoolRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **connectionPoolName** | **String**|  | |
| **updateDbaasPgConnectionPoolRequest** | [**UpdateDbaasPgConnectionPoolRequest**](UpdateDbaasPgConnectionPoolRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateDbaasPostgresAllowReplication

> DbaasPostgresUsers updateDbaasPostgresAllowReplication(serviceName, username, updateDbaasPostgresAllowReplicationRequest)

Update access control for one service user

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String serviceName = "serviceName_example"; // String | 
        String username = "username_example"; // String | 
        UpdateDbaasPostgresAllowReplicationRequest updateDbaasPostgresAllowReplicationRequest = new UpdateDbaasPostgresAllowReplicationRequest(); // UpdateDbaasPostgresAllowReplicationRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            DbaasPostgresUsers result = client.updateDbaasPostgresAllowReplication(serviceName, username, updateDbaasPostgresAllowReplicationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateDbaasPostgresAllowReplication");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |
| **updateDbaasPostgresAllowReplicationRequest** | [**UpdateDbaasPostgresAllowReplicationRequest**](UpdateDbaasPostgresAllowReplicationRequest.md)|  | |

### Return type

[**DbaasPostgresUsers**](DbaasPostgresUsers.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **serviceName** | **String**|  | |
| **username** | **String**|  | |
| **updateDbaasPostgresAllowReplicationRequest** | [**UpdateDbaasPostgresAllowReplicationRequest**](UpdateDbaasPostgresAllowReplicationRequest.md)|  | |

### Return type

ApiResponse<[**DbaasPostgresUsers**](DbaasPostgresUsers.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateDbaasServiceGrafana

> Operation updateDbaasServiceGrafana(name, updateDbaasServiceGrafanaRequest)

Update a DBaaS Grafana service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 
        UpdateDbaasServiceGrafanaRequest updateDbaasServiceGrafanaRequest = new UpdateDbaasServiceGrafanaRequest(); // UpdateDbaasServiceGrafanaRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateDbaasServiceGrafana(name, updateDbaasServiceGrafanaRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateDbaasServiceGrafana");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **updateDbaasServiceGrafanaRequest** | [**UpdateDbaasServiceGrafanaRequest**](UpdateDbaasServiceGrafanaRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **updateDbaasServiceGrafanaRequest** | [**UpdateDbaasServiceGrafanaRequest**](UpdateDbaasServiceGrafanaRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateDbaasServiceKafka

> Operation updateDbaasServiceKafka(name, updateDbaasServiceKafkaRequest)

Update a DBaaS Kafka service

Update a DBaaS Kafka service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 
        UpdateDbaasServiceKafkaRequest updateDbaasServiceKafkaRequest = new UpdateDbaasServiceKafkaRequest(); // UpdateDbaasServiceKafkaRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateDbaasServiceKafka(name, updateDbaasServiceKafkaRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateDbaasServiceKafka");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **updateDbaasServiceKafkaRequest** | [**UpdateDbaasServiceKafkaRequest**](UpdateDbaasServiceKafkaRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **updateDbaasServiceKafkaRequest** | [**UpdateDbaasServiceKafkaRequest**](UpdateDbaasServiceKafkaRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateDbaasServiceMysql

> Operation updateDbaasServiceMysql(name, updateDbaasServiceMysqlRequest)

Update a DBaaS MySQL service

Update a DBaaS MySQL service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 
        UpdateDbaasServiceMysqlRequest updateDbaasServiceMysqlRequest = new UpdateDbaasServiceMysqlRequest(); // UpdateDbaasServiceMysqlRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateDbaasServiceMysql(name, updateDbaasServiceMysqlRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateDbaasServiceMysql");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **updateDbaasServiceMysqlRequest** | [**UpdateDbaasServiceMysqlRequest**](UpdateDbaasServiceMysqlRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **updateDbaasServiceMysqlRequest** | [**UpdateDbaasServiceMysqlRequest**](UpdateDbaasServiceMysqlRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateDbaasServiceOpensearch

> Operation updateDbaasServiceOpensearch(name, updateDbaasServiceOpensearchRequest)

Update a DBaaS OpenSearch service

Update a DBaaS OpenSearch service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 
        UpdateDbaasServiceOpensearchRequest updateDbaasServiceOpensearchRequest = new UpdateDbaasServiceOpensearchRequest(); // UpdateDbaasServiceOpensearchRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateDbaasServiceOpensearch(name, updateDbaasServiceOpensearchRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateDbaasServiceOpensearch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **updateDbaasServiceOpensearchRequest** | [**UpdateDbaasServiceOpensearchRequest**](UpdateDbaasServiceOpensearchRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **updateDbaasServiceOpensearchRequest** | [**UpdateDbaasServiceOpensearchRequest**](UpdateDbaasServiceOpensearchRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateDbaasServicePg

> Operation updateDbaasServicePg(name, updateDbaasServicePgRequest)

Update a DBaaS PostgreSQL service

Update a DBaaS PostgreSQL service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 
        UpdateDbaasServicePgRequest updateDbaasServicePgRequest = new UpdateDbaasServicePgRequest(); // UpdateDbaasServicePgRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateDbaasServicePg(name, updateDbaasServicePgRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateDbaasServicePg");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **updateDbaasServicePgRequest** | [**UpdateDbaasServicePgRequest**](UpdateDbaasServicePgRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **updateDbaasServicePgRequest** | [**UpdateDbaasServicePgRequest**](UpdateDbaasServicePgRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateDbaasServiceRedis

> Operation updateDbaasServiceRedis(name, updateDbaasServiceRedisRequest)

Update a DBaaS Redis service

Update a DBaaS Redis service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 
        UpdateDbaasServiceRedisRequest updateDbaasServiceRedisRequest = new UpdateDbaasServiceRedisRequest(); // UpdateDbaasServiceRedisRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateDbaasServiceRedis(name, updateDbaasServiceRedisRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateDbaasServiceRedis");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **updateDbaasServiceRedisRequest** | [**UpdateDbaasServiceRedisRequest**](UpdateDbaasServiceRedisRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **updateDbaasServiceRedisRequest** | [**UpdateDbaasServiceRedisRequest**](UpdateDbaasServiceRedisRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateDbaasServiceValkey

> Operation updateDbaasServiceValkey(name, updateDbaasServiceValkeyRequest)



Update a DBaaS Valkey service

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        String name = "name_example"; // String | 
        UpdateDbaasServiceValkeyRequest updateDbaasServiceValkeyRequest = new UpdateDbaasServiceValkeyRequest(); // UpdateDbaasServiceValkeyRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateDbaasServiceValkey(name, updateDbaasServiceValkeyRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateDbaasServiceValkey");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **updateDbaasServiceValkeyRequest** | [**UpdateDbaasServiceValkeyRequest**](UpdateDbaasServiceValkeyRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **updateDbaasServiceValkeyRequest** | [**UpdateDbaasServiceValkeyRequest**](UpdateDbaasServiceValkeyRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateDnsDomainRecord

> Operation updateDnsDomainRecord(domainId, recordId, updateDnsDomainRecordRequest)

Update DNS domain record



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID domainId = UUID.randomUUID(); // UUID | 
        UUID recordId = UUID.randomUUID(); // UUID | 
        UpdateDnsDomainRecordRequest updateDnsDomainRecordRequest = new UpdateDnsDomainRecordRequest(); // UpdateDnsDomainRecordRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateDnsDomainRecord(domainId, recordId, updateDnsDomainRecordRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateDnsDomainRecord");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domainId** | **UUID**|  | |
| **recordId** | **UUID**|  | |
| **updateDnsDomainRecordRequest** | [**UpdateDnsDomainRecordRequest**](UpdateDnsDomainRecordRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domainId** | **UUID**|  | |
| **recordId** | **UUID**|  | |
| **updateDnsDomainRecordRequest** | [**UpdateDnsDomainRecordRequest**](UpdateDnsDomainRecordRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateElasticIp

> Operation updateElasticIp(id, updateElasticIpRequest)

Update an Elastic IP



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateElasticIpRequest updateElasticIpRequest = new UpdateElasticIpRequest(); // UpdateElasticIpRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateElasticIp(id, updateElasticIpRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateElasticIp");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateElasticIpRequest** | [**UpdateElasticIpRequest**](UpdateElasticIpRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateElasticIpRequest** | [**UpdateElasticIpRequest**](UpdateElasticIpRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateIamOrganizationPolicy

> Operation updateIamOrganizationPolicy(iamPolicy)

Update IAM Organization Policy



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        IamPolicy iamPolicy = new IamPolicy(); // IamPolicy |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateIamOrganizationPolicy(iamPolicy);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateIamOrganizationPolicy");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **iamPolicy** | [**IamPolicy**](IamPolicy.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **iamPolicy** | [**IamPolicy**](IamPolicy.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateIamRole

> Operation updateIamRole(id, updateIamRoleRequest)

Update IAM Role



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateIamRoleRequest updateIamRoleRequest = new UpdateIamRoleRequest(); // UpdateIamRoleRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateIamRole(id, updateIamRoleRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateIamRole");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateIamRoleRequest** | [**UpdateIamRoleRequest**](UpdateIamRoleRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateIamRoleRequest** | [**UpdateIamRoleRequest**](UpdateIamRoleRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateIamRolePolicy

> Operation updateIamRolePolicy(id, iamPolicy)

Update IAM Role Policy



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        IamPolicy iamPolicy = new IamPolicy(); // IamPolicy |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateIamRolePolicy(id, iamPolicy);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateIamRolePolicy");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **iamPolicy** | [**IamPolicy**](IamPolicy.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **iamPolicy** | [**IamPolicy**](IamPolicy.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateInstance

> Operation updateInstance(id, updateInstanceRequest)

Update a Compute instance



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateInstanceRequest updateInstanceRequest = new UpdateInstanceRequest(); // UpdateInstanceRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateInstance(id, updateInstanceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateInstance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateInstanceRequest** | [**UpdateInstanceRequest**](UpdateInstanceRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateInstanceRequest** | [**UpdateInstanceRequest**](UpdateInstanceRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateInstancePool

> Operation updateInstancePool(id, updateInstancePoolRequest)

Update an Instance Pool



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateInstancePoolRequest updateInstancePoolRequest = new UpdateInstancePoolRequest(); // UpdateInstancePoolRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateInstancePool(id, updateInstancePoolRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateInstancePool");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateInstancePoolRequest** | [**UpdateInstancePoolRequest**](UpdateInstancePoolRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateInstancePoolRequest** | [**UpdateInstancePoolRequest**](UpdateInstancePoolRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateLoadBalancer

> Operation updateLoadBalancer(id, updateLoadBalancerRequest)

Update a Load Balancer



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateLoadBalancerRequest updateLoadBalancerRequest = new UpdateLoadBalancerRequest(); // UpdateLoadBalancerRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateLoadBalancer(id, updateLoadBalancerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateLoadBalancer");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateLoadBalancerRequest** | [**UpdateLoadBalancerRequest**](UpdateLoadBalancerRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateLoadBalancerRequest** | [**UpdateLoadBalancerRequest**](UpdateLoadBalancerRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateLoadBalancerService

> Operation updateLoadBalancerService(id, serviceId, updateLoadBalancerServiceRequest)

Update a Load Balancer Service



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UUID serviceId = UUID.randomUUID(); // UUID | 
        UpdateLoadBalancerServiceRequest updateLoadBalancerServiceRequest = new UpdateLoadBalancerServiceRequest(); // UpdateLoadBalancerServiceRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateLoadBalancerService(id, serviceId, updateLoadBalancerServiceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateLoadBalancerService");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **serviceId** | **UUID**|  | |
| **updateLoadBalancerServiceRequest** | [**UpdateLoadBalancerServiceRequest**](UpdateLoadBalancerServiceRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **serviceId** | **UUID**|  | |
| **updateLoadBalancerServiceRequest** | [**UpdateLoadBalancerServiceRequest**](UpdateLoadBalancerServiceRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updatePrivateNetwork

> Operation updatePrivateNetwork(id, updatePrivateNetworkRequest)

Update a Private Network



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UpdatePrivateNetworkRequest updatePrivateNetworkRequest = new UpdatePrivateNetworkRequest(); // UpdatePrivateNetworkRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updatePrivateNetwork(id, updatePrivateNetworkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updatePrivateNetwork");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updatePrivateNetworkRequest** | [**UpdatePrivateNetworkRequest**](UpdatePrivateNetworkRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updatePrivateNetworkRequest** | [**UpdatePrivateNetworkRequest**](UpdatePrivateNetworkRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updatePrivateNetworkInstanceIp

> Operation updatePrivateNetworkInstanceIp(id, updatePrivateNetworkInstanceIpRequest)

Update the IP address of an instance attached to a managed private network



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UpdatePrivateNetworkInstanceIpRequest updatePrivateNetworkInstanceIpRequest = new UpdatePrivateNetworkInstanceIpRequest(); // UpdatePrivateNetworkInstanceIpRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updatePrivateNetworkInstanceIp(id, updatePrivateNetworkInstanceIpRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updatePrivateNetworkInstanceIp");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updatePrivateNetworkInstanceIpRequest** | [**UpdatePrivateNetworkInstanceIpRequest**](UpdatePrivateNetworkInstanceIpRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updatePrivateNetworkInstanceIpRequest** | [**UpdatePrivateNetworkInstanceIpRequest**](UpdatePrivateNetworkInstanceIpRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateReverseDnsElasticIp

> Operation updateReverseDnsElasticIp(id, updateReverseDnsElasticIpRequest)

Update/Create the PTR DNS record for an elastic IP



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateReverseDnsElasticIpRequest updateReverseDnsElasticIpRequest = new UpdateReverseDnsElasticIpRequest(); // UpdateReverseDnsElasticIpRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateReverseDnsElasticIp(id, updateReverseDnsElasticIpRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateReverseDnsElasticIp");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateReverseDnsElasticIpRequest** | [**UpdateReverseDnsElasticIpRequest**](UpdateReverseDnsElasticIpRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateReverseDnsElasticIpRequest** | [**UpdateReverseDnsElasticIpRequest**](UpdateReverseDnsElasticIpRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateReverseDnsInstance

> Operation updateReverseDnsInstance(id, updateReverseDnsElasticIpRequest)

Update/Create the PTR DNS record for an instance



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateReverseDnsElasticIpRequest updateReverseDnsElasticIpRequest = new UpdateReverseDnsElasticIpRequest(); // UpdateReverseDnsElasticIpRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateReverseDnsInstance(id, updateReverseDnsElasticIpRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateReverseDnsInstance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateReverseDnsElasticIpRequest** | [**UpdateReverseDnsElasticIpRequest**](UpdateReverseDnsElasticIpRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateReverseDnsElasticIpRequest** | [**UpdateReverseDnsElasticIpRequest**](UpdateReverseDnsElasticIpRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateSksCluster

> Operation updateSksCluster(id, updateSksClusterRequest)

Update an SKS cluster



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateSksClusterRequest updateSksClusterRequest = new UpdateSksClusterRequest(); // UpdateSksClusterRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateSksCluster(id, updateSksClusterRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateSksCluster");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateSksClusterRequest** | [**UpdateSksClusterRequest**](UpdateSksClusterRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateSksClusterRequest** | [**UpdateSksClusterRequest**](UpdateSksClusterRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateSksNodepool

> Operation updateSksNodepool(id, sksNodepoolId, updateSksNodepoolRequest)

Update an SKS Nodepool



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UUID sksNodepoolId = UUID.randomUUID(); // UUID | 
        UpdateSksNodepoolRequest updateSksNodepoolRequest = new UpdateSksNodepoolRequest(); // UpdateSksNodepoolRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateSksNodepool(id, sksNodepoolId, updateSksNodepoolRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateSksNodepool");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **sksNodepoolId** | **UUID**|  | |
| **updateSksNodepoolRequest** | [**UpdateSksNodepoolRequest**](UpdateSksNodepoolRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **sksNodepoolId** | **UUID**|  | |
| **updateSksNodepoolRequest** | [**UpdateSksNodepoolRequest**](UpdateSksNodepoolRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateTemplate

> Operation updateTemplate(id, updateTemplateRequest)

Update template attributes



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateTemplateRequest updateTemplateRequest = new UpdateTemplateRequest(); // UpdateTemplateRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateTemplate(id, updateTemplateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateTemplate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateTemplateRequest** | [**UpdateTemplateRequest**](UpdateTemplateRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateTemplateRequest** | [**UpdateTemplateRequest**](UpdateTemplateRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateUserRole

> Operation updateUserRole(id, updateUserRoleRequest)

Update a User&#39;s IAM role

### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateUserRoleRequest updateUserRoleRequest = new UpdateUserRoleRequest(); // UpdateUserRoleRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.updateUserRole(id, updateUserRoleRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#updateUserRole");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateUserRoleRequest** | [**UpdateUserRoleRequest**](UpdateUserRoleRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **updateUserRoleRequest** | [**UpdateUserRoleRequest**](UpdateUserRoleRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## upgradeSksCluster

> Operation upgradeSksCluster(id, upgradeSksClusterRequest)

Upgrade an SKS cluster



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 
        UpgradeSksClusterRequest upgradeSksClusterRequest = new UpgradeSksClusterRequest(); // UpgradeSksClusterRequest |  please add at least all the required fields

        try {
            // Invoke the API method
            Operation result = client.upgradeSksCluster(id, upgradeSksClusterRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#upgradeSksCluster");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **upgradeSksClusterRequest** | [**UpgradeSksClusterRequest**](UpgradeSksClusterRequest.md)|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **upgradeSksClusterRequest** | [**UpgradeSksClusterRequest**](UpgradeSksClusterRequest.md)|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## upgradeSksClusterServiceLevel

> Operation upgradeSksClusterServiceLevel(id)

Upgrade a SKS cluster to pro



### Example

```java
// Import classes:
import com.exoscale.sdk.client.ApiException;
import com.exoscale.sdk.client.*;
import com.exoscale.sdk.client.models.*;
import com.exoscale.sdk.api.ExoscaleApi;

public class Example {
    public static void main(String[] args) throws ApiException, InterruptedException{
        // Initialize the client with credentials
        Client client = new Client(new Credentials(System.getenv("EXOSCALE_API_KEY"), System.getenv("EXOSCALE_API_SECRET")));
        UUID id = UUID.randomUUID(); // UUID | 

        try {
            // Invoke the API method
            Operation result = client.upgradeSksClusterServiceLevel(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExoscaleApi#upgradeSksClusterServiceLevel");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**Operation**](Operation.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

