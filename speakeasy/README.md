# Exoscale Java SDK

<div align="left">
    <a href="https://speakeasyapi.dev/"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://opensource.org/licenses/MIT">
        <img src="https://img.shields.io/badge/License-MIT-blue.svg" style="width: 100px; height: 28px;" />
    </a>
</div>


## 🏗 **Welcome to your new SDK!** 🏗

It has been generated successfully based on your OpenAPI spec. However, it is not yet ready for production use. Here are some next steps:
- [ ] 🛠 Make your SDK feel handcrafted by [customizing it](https://www.speakeasyapi.dev/docs/customize-sdks)
- [ ] ♻️ Refine your SDK quickly by iterating locally with the [Speakeasy CLI](https://github.com/speakeasy-api/speakeasy)
- [ ] 🎁 Publish your SDK to package managers by [configuring automatic publishing](https://www.speakeasyapi.dev/docs/productionize-sdks/publish-sdks)
- [ ] ✨ When ready to productionize, delete this section from the README

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Gradle

```groovy
implementation 'com.exoscale.api:openapi:0.0.2'
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteLoadBalancerServiceRequest;
import com.exoscale.api.models.operations.DeleteLoadBalancerServiceResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Exoscale sdk = Exoscale.builder()
                .build();

            DeleteLoadBalancerServiceResponse res = sdk.networkLoadBalancer().deleteLoadBalancerService()
                .id("266197f0-c85e-4981-85ec-e73d8dc6e6bf")
                .serviceId("03cf7ba0-13f2-4305-9769-06e0ffb8d5fc")
                .call();

            if (res.operation().isPresent()) {
                // handle response
            }
        } catch (com.exoscale.api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

### [networkLoadBalancer()](docs/sdks/networkloadbalancer/README.md)

* [deleteLoadBalancerService](docs/sdks/networkloadbalancer/README.md#deleteloadbalancerservice) - Delete a Load Balancer Service
* [updateLoadBalancerService](docs/sdks/networkloadbalancer/README.md#updateloadbalancerservice) - Update a Load Balancer Service
* [getLoadBalancerService](docs/sdks/networkloadbalancer/README.md#getloadbalancerservice) - Retrieve Load Balancer Service details
* [createLoadBalancer](docs/sdks/networkloadbalancer/README.md#createloadbalancer) - Create a Load Balancer
* [listLoadBalancers](docs/sdks/networkloadbalancer/README.md#listloadbalancers) - List Load Balancers
* [resetLoadBalancerField](docs/sdks/networkloadbalancer/README.md#resetloadbalancerfield) - Reset a Load Balancer field to its default value
* [resetLoadBalancerServiceField](docs/sdks/networkloadbalancer/README.md#resetloadbalancerservicefield) - Reset a Load Balancer Service field to its default value
* [addServiceToLoadBalancer](docs/sdks/networkloadbalancer/README.md#addservicetoloadbalancer) - Add a Load Balancer Service
* [updateLoadBalancer](docs/sdks/networkloadbalancer/README.md#updateloadbalancer) - Update a Load Balancer
* [deleteLoadBalancer](docs/sdks/networkloadbalancer/README.md#deleteloadbalancer) - Delete a Load Balancer
* [getLoadBalancer](docs/sdks/networkloadbalancer/README.md#getloadbalancer) - Retrieve Load Balancer details

### [dbaas()](docs/sdks/dbaas/README.md)

* [getDbaasOpensearchAclConfig](docs/sdks/dbaas/README.md#getdbaasopensearchaclconfig) - Get DBaaS OpenSearch ACL configuration
* [updateDbaasOpensearchAclConfig](docs/sdks/dbaas/README.md#updatedbaasopensearchaclconfig) - Create a DBaaS OpenSearch ACL configuration
* [startDbaasGrafanaMaintenance](docs/sdks/dbaas/README.md#startdbaasgrafanamaintenance) - Initiate Grafana maintenance update
* [createDbaasPgUpgradeCheck](docs/sdks/dbaas/README.md#createdbaaspgupgradecheck) - Check whether you can upgrade Postgres service to a newer version
* [resetDbaasMysqlUserPassword](docs/sdks/dbaas/README.md#resetdbaasmysqluserpassword) - Reset the credentials of a DBaaS mysql user
* [createDbaasPgConnectionPool](docs/sdks/dbaas/README.md#createdbaaspgconnectionpool) - Create a DBaaS PostgreSQL connection pool
* [updateDbaasServiceMysql](docs/sdks/dbaas/README.md#updatedbaasservicemysql) - Update a DBaaS MySQL service
* [getDbaasServiceMysql](docs/sdks/dbaas/README.md#getdbaasservicemysql) - Get a DBaaS MySQL service
* [createDbaasServiceMysql](docs/sdks/dbaas/README.md#createdbaasservicemysql) - Create a DBaaS MySQL service
* [deleteDbaasServiceMysql](docs/sdks/dbaas/README.md#deletedbaasservicemysql) - Delete a MySQL service
* [createDbaasMysqlUser](docs/sdks/dbaas/README.md#createdbaasmysqluser) - Create a DBaaS MySQL user
* [listDbaasServiceTypes](docs/sdks/dbaas/README.md#listdbaasservicetypes) - DBaaS Service Types
* [listDbaasServices](docs/sdks/dbaas/README.md#listdbaasservices) - List DBaaS services
* [getDbaasCaCertificate](docs/sdks/dbaas/README.md#getdbaascacertificate) - Get DBaaS CA Certificate
* [getDbaasSettingsGrafana](docs/sdks/dbaas/README.md#getdbaassettingsgrafana) - Get DBaaS Grafana settings
* [deleteDbaasPgDatabase](docs/sdks/dbaas/README.md#deletedbaaspgdatabase) - Delete a DBaaS Postgres database
* [stopDbaasPgMigration](docs/sdks/dbaas/README.md#stopdbaaspgmigration) - Stop a DBaaS PostgreSQL migration
* [getDbaasServiceKafka](docs/sdks/dbaas/README.md#getdbaasservicekafka) - Get a DBaaS Kafka service
* [createDbaasServiceKafka](docs/sdks/dbaas/README.md#createdbaasservicekafka) - Create a DBaaS Kafka service
* [updateDbaasServiceKafka](docs/sdks/dbaas/README.md#updatedbaasservicekafka) - Update a DBaaS Kafka service
* [deleteDbaasServiceKafka](docs/sdks/dbaas/README.md#deletedbaasservicekafka) - Delete a Kafka service
* [getDbaasSettingsRedis](docs/sdks/dbaas/README.md#getdbaassettingsredis) - Get DBaaS Redis settings
* [createDbaasKafkaSchemaRegistryAclConfig](docs/sdks/dbaas/README.md#createdbaaskafkaschemaregistryaclconfig) - Add a Kafka Schema Registry ACL entry
* [createDbaasPostgresUser](docs/sdks/dbaas/README.md#createdbaaspostgresuser) - Create a DBaaS Postgres user
* [deleteDbaasOpensearchUser](docs/sdks/dbaas/README.md#deletedbaasopensearchuser) - Delete a DBaaS OpenSearch user
* [createDbaasKafkaUser](docs/sdks/dbaas/README.md#createdbaaskafkauser) - Create a DBaaS Kafka user
* [getDbaasSettingsMysql](docs/sdks/dbaas/README.md#getdbaassettingsmysql) - Get DBaaS MySQL settings
* [createDbaasPgDatabase](docs/sdks/dbaas/README.md#createdbaaspgdatabase) - Create a DBaaS Postgres database
* [createDbaasOpensearchUser](docs/sdks/dbaas/README.md#createdbaasopensearchuser) - Create a DBaaS OpenSearch user
* [listDbaasIntegrationTypes](docs/sdks/dbaas/README.md#listdbaasintegrationtypes) - Get DBaaS integration types
* [deleteDbaasPostgresUser](docs/sdks/dbaas/README.md#deletedbaaspostgresuser) - Delete a DBaaS Postgres user
* [updateDbaasPostgresAllowReplication](docs/sdks/dbaas/README.md#updatedbaaspostgresallowreplication) - Update access control for one service user
* [createDbaasKafkaTopicAclConfig](docs/sdks/dbaas/README.md#createdbaaskafkatopicaclconfig) - Add a Kafka topic ACL entry
* [deleteDbaasMysqlDatabase](docs/sdks/dbaas/README.md#deletedbaasmysqldatabase) - Delete a DBaaS MySQL database
* [getDbaasServiceLogs](docs/sdks/dbaas/README.md#getdbaasservicelogs) - Get logs of DBaaS service
* [startDbaasPgMaintenance](docs/sdks/dbaas/README.md#startdbaaspgmaintenance) - Initiate PostgreSQL maintenance update
* [deleteDbaasKafkaSchemaRegistryAclConfig](docs/sdks/dbaas/README.md#deletedbaaskafkaschemaregistryaclconfig) - Delete a Kafka ACL entry
* [deleteDbaasKafkaUser](docs/sdks/dbaas/README.md#deletedbaaskafkauser) - Delete a DBaaS kafka user
* [getDbaasServiceType](docs/sdks/dbaas/README.md#getdbaasservicetype) - Get a DBaaS service type
* [startDbaasMysqlMaintenance](docs/sdks/dbaas/README.md#startdbaasmysqlmaintenance) - Initiate MySQL maintenance update
* [resetDbaasOpensearchUserPassword](docs/sdks/dbaas/README.md#resetdbaasopensearchuserpassword) - Reset the credentials of a DBaaS OpenSearch user
* [getDbaasServiceMetrics](docs/sdks/dbaas/README.md#getdbaasservicemetrics) - Get metrics of DBaaS service
* [createDbaasTaskMigrationCheck](docs/sdks/dbaas/README.md#createdbaastaskmigrationcheck) - Create a DBaaS task to check migration
* [deleteDbaasIntegration](docs/sdks/dbaas/README.md#deletedbaasintegration) - Delete a DBaaS Integration
* [updateDbaasIntegration](docs/sdks/dbaas/README.md#updatedbaasintegration) - Update a existing DBaaS integration
* [getDbaasIntegration](docs/sdks/dbaas/README.md#getdbaasintegration) - Get a DBaaS Integration
* [listDbaasIntegrationSettings](docs/sdks/dbaas/README.md#listdbaasintegrationsettings) - Get DBaaS integration settings
* [getDbaasSettingsPg](docs/sdks/dbaas/README.md#getdbaassettingspg) - Get DBaaS PostgreSQL settings
* [stopDbaasRedisMigration](docs/sdks/dbaas/README.md#stopdbaasredismigration) - Stop a DBaaS Redis migration
* [stopDbaasMysqlMigration](docs/sdks/dbaas/README.md#stopdbaasmysqlmigration) - Stop a DBaaS MySQL migration
* [startDbaasKafkaMaintenance](docs/sdks/dbaas/README.md#startdbaaskafkamaintenance) - Initiate Kafka maintenance update
* [updateDbaasPgConnectionPool](docs/sdks/dbaas/README.md#updatedbaaspgconnectionpool) - Update a DBaaS PostgreSQL connection pool
* [deleteDbaasPgConnectionPool](docs/sdks/dbaas/README.md#deletedbaaspgconnectionpool) - Delete a DBaaS PostgreSQL connection pool
* [getDbaasMigrationStatus](docs/sdks/dbaas/README.md#getdbaasmigrationstatus) - Get a DBaaS migration status
* [deleteDbaasMysqlUser](docs/sdks/dbaas/README.md#deletedbaasmysqluser) - Delete a DBaaS MySQL user
* [deleteDbaasService](docs/sdks/dbaas/README.md#deletedbaasservice) - Delete a DBaaS service
* [createDbaasMysqlDatabase](docs/sdks/dbaas/README.md#createdbaasmysqldatabase) - Create a DBaaS MySQL database
* [getDbaasSettingsKafka](docs/sdks/dbaas/README.md#getdbaassettingskafka) - Get DBaaS Kafka settings
* [getDbaasSettingsOpensearch](docs/sdks/dbaas/README.md#getdbaassettingsopensearch) - Get DBaaS OpenSearch settings
* [deleteDbaasServiceGrafana](docs/sdks/dbaas/README.md#deletedbaasservicegrafana) - Delete a Grafana service
* [getDbaasServiceGrafana](docs/sdks/dbaas/README.md#getdbaasservicegrafana) - Get a DBaaS Grafana service
* [updateDbaasServiceGrafana](docs/sdks/dbaas/README.md#updatedbaasservicegrafana) - Update a DBaaS Grafana service
* [createDbaasServiceGrafana](docs/sdks/dbaas/README.md#createdbaasservicegrafana) - Create a DBaaS Grafana service
* [startDbaasOpensearchMaintenance](docs/sdks/dbaas/README.md#startdbaasopensearchmaintenance) - Initiate OpenSearch maintenance update
* [getDbaasKafkaAclConfig](docs/sdks/dbaas/README.md#getdbaaskafkaaclconfig) - Get DBaaS kafka ACL configuration
* [resetDbaasKafkaUserPassword](docs/sdks/dbaas/README.md#resetdbaaskafkauserpassword) - Reset the credentials of a DBaaS Kafka user
* [createDbaasServiceOpensearch](docs/sdks/dbaas/README.md#createdbaasserviceopensearch) - Create a DBaaS OpenSearch service
* [getDbaasServiceOpensearch](docs/sdks/dbaas/README.md#getdbaasserviceopensearch) - Get a DBaaS OpenSearch service
* [deleteDbaasServiceOpensearch](docs/sdks/dbaas/README.md#deletedbaasserviceopensearch) - Delete a OpenSearch service
* [updateDbaasServiceOpensearch](docs/sdks/dbaas/README.md#updatedbaasserviceopensearch) - Update a DBaaS OpenSearch service
* [deleteDbaasServiceRedis](docs/sdks/dbaas/README.md#deletedbaasserviceredis) - Delete a Redis service
* [updateDbaasServiceRedis](docs/sdks/dbaas/README.md#updatedbaasserviceredis) - Update a DBaaS Redis service
* [getDbaasServiceRedis](docs/sdks/dbaas/README.md#getdbaasserviceredis) - Get a DBaaS Redis service
* [createDbaasServiceRedis](docs/sdks/dbaas/README.md#createdbaasserviceredis) - Create a DBaaS Redis service
* [updateDbaasServicePg](docs/sdks/dbaas/README.md#updatedbaasservicepg) - Update a DBaaS PostgreSQL service
* [getDbaasServicePg](docs/sdks/dbaas/README.md#getdbaasservicepg) - Get a DBaaS PostgreSQL service
* [createDbaasServicePg](docs/sdks/dbaas/README.md#createdbaasservicepg) - Create a DBaaS PostgreSQL service
* [deleteDbaasServicePg](docs/sdks/dbaas/README.md#deletedbaasservicepg) - Delete a Postgres service
* [createDbaasIntegration](docs/sdks/dbaas/README.md#createdbaasintegration) - Create a new DBaaS integration between two services
* [getDbaasTask](docs/sdks/dbaas/README.md#getdbaastask) - Get a DBaaS task
* [startDbaasRedisMaintenance](docs/sdks/dbaas/README.md#startdbaasredismaintenance) - Initiate Redis maintenance update
* [deleteDbaasKafkaTopicAclConfig](docs/sdks/dbaas/README.md#deletedbaaskafkatopicaclconfig) - Delete a Kafka ACL entry
* [resetDbaasPostgresUserPassword](docs/sdks/dbaas/README.md#resetdbaaspostgresuserpassword) - Reset the credentials of a DBaaS Postgres user

### [instancePool()](docs/sdks/instancepool/README.md)

* [scaleInstancePool](docs/sdks/instancepool/README.md#scaleinstancepool) - Scale an Instance Pool
* [listInstancePools](docs/sdks/instancepool/README.md#listinstancepools) - List Instance Pools
* [createInstancePool](docs/sdks/instancepool/README.md#createinstancepool) - Create an Instance Pool
* [deleteInstancePool](docs/sdks/instancepool/README.md#deleteinstancepool) - Delete an Instance Pool
* [getInstancePool](docs/sdks/instancepool/README.md#getinstancepool) - Retrieve Instance Pool details
* [updateInstancePool](docs/sdks/instancepool/README.md#updateinstancepool) - Update an Instance Pool
* [resetInstancePoolField](docs/sdks/instancepool/README.md#resetinstancepoolfield) - Reset an Instance Pool field to its default value
* [evictInstancePoolMembers](docs/sdks/instancepool/README.md#evictinstancepoolmembers) - Evict Instance Pool members

### [instance()](docs/sdks/instance/README.md)

* [createSnapshot](docs/sdks/instance/README.md#createsnapshot) - Create a Snapshot of a Compute instance
* [revealInstancePassword](docs/sdks/instance/README.md#revealinstancepassword) - Reveal the password used during instance creation or the latest password reset.
* [resizeInstanceDisk](docs/sdks/instance/README.md#resizeinstancedisk) - Resize a Compute instance disk
* [resetInstancePassword](docs/sdks/instance/README.md#resetinstancepassword) - Reset a compute instance password
* [startInstance](docs/sdks/instance/README.md#startinstance) - Start a Compute instance
* [scaleInstance](docs/sdks/instance/README.md#scaleinstance) - Scale a Compute instance to a new Instance Type
* [stopInstance](docs/sdks/instance/README.md#stopinstance) - Stop a Compute instance
* [addInstanceProtection](docs/sdks/instance/README.md#addinstanceprotection) - Set instance destruction protection
* [resetInstanceField](docs/sdks/instance/README.md#resetinstancefield) - Reset Instance field
* [removeInstanceProtection](docs/sdks/instance/README.md#removeinstanceprotection) - Remove instance destruction protection
* [resetInstance](docs/sdks/instance/README.md#resetinstance) - Reset a Compute instance to a base/target template
* [deleteInstance](docs/sdks/instance/README.md#deleteinstance) - Delete a Compute instance
* [updateInstance](docs/sdks/instance/README.md#updateinstance) - Update a Compute instance
* [getInstance](docs/sdks/instance/README.md#getinstance) - Retrieve Compute instance details
* [rebootInstance](docs/sdks/instance/README.md#rebootinstance) - Reboot a Compute instance
* [createInstance](docs/sdks/instance/README.md#createinstance) - Create a Compute instance
* [listInstances](docs/sdks/instance/README.md#listinstances) - List Compute instances
* [revertInstanceToSnapshot](docs/sdks/instance/README.md#revertinstancetosnapshot) - Revert a snapshot for an instance

### [snapshot()](docs/sdks/snapshot/README.md)

* [createSnapshot](docs/sdks/snapshot/README.md#createsnapshot) - Create a Snapshot of a Compute instance
* [exportSnapshot](docs/sdks/snapshot/README.md#exportsnapshot) - Export a Snapshot
* [deleteSnapshot](docs/sdks/snapshot/README.md#deletesnapshot) - Delete a Snapshot
* [getSnapshot](docs/sdks/snapshot/README.md#getsnapshot) - Retrieve Snapshot details
* [listSnapshots](docs/sdks/snapshot/README.md#listsnapshots) - List Snapshots
* [promoteSnapshotToTemplate](docs/sdks/snapshot/README.md#promotesnapshottotemplate) - Promote a Snapshot to a Template

### [reverseDns()](docs/sdks/reversedns/README.md)

* [getReverseDnsElasticIp](docs/sdks/reversedns/README.md#getreversednselasticip) - Query the PTR DNS records for an elastic IP
* [updateReverseDnsElasticIp](docs/sdks/reversedns/README.md#updatereversednselasticip) - Update/Create the PTR DNS record for an elastic IP
* [deleteReverseDnsElasticIp](docs/sdks/reversedns/README.md#deletereversednselasticip) - Delete the PTR DNS record for an elastic IP
* [updateReverseDnsInstance](docs/sdks/reversedns/README.md#updatereversednsinstance) - Update/Create the PTR DNS record for an instance
* [getReverseDnsInstance](docs/sdks/reversedns/README.md#getreversednsinstance) - Query the PTR DNS records for an instance
* [deleteReverseDnsInstance](docs/sdks/reversedns/README.md#deletereversednsinstance) - Delete the PTR DNS record for an instance

### [antiAffinityGroup()](docs/sdks/antiaffinitygroup/README.md)

* [listAntiAffinityGroups](docs/sdks/antiaffinitygroup/README.md#listantiaffinitygroups) - List Anti-affinity Groups
* [createAntiAffinityGroup](docs/sdks/antiaffinitygroup/README.md#createantiaffinitygroup) - Create an Anti-affinity Group
* [getAntiAffinityGroup](docs/sdks/antiaffinitygroup/README.md#getantiaffinitygroup) - Retrieve Anti-affinity Group details
* [deleteAntiAffinityGroup](docs/sdks/antiaffinitygroup/README.md#deleteantiaffinitygroup) - Delete an Anti-affinity Group

### [event()](docs/sdks/event/README.md)

* [listEvents](docs/sdks/event/README.md#listevents) - List Events

### [securityGroup()](docs/sdks/securitygroup/README.md)

* [deleteRuleFromSecurityGroup](docs/sdks/securitygroup/README.md#deleterulefromsecuritygroup) - Delete a Security Group rule
* [createSecurityGroup](docs/sdks/securitygroup/README.md#createsecuritygroup) - Create a Security Group
* [listSecurityGroups](docs/sdks/securitygroup/README.md#listsecuritygroups) - List Security Groups.
* [getSecurityGroup](docs/sdks/securitygroup/README.md#getsecuritygroup) - Retrieve Security Group details
* [deleteSecurityGroup](docs/sdks/securitygroup/README.md#deletesecuritygroup) - Delete a Security Group
* [attachInstanceToSecurityGroup](docs/sdks/securitygroup/README.md#attachinstancetosecuritygroup) - Attach a Compute instance to a Security Group
* [addRuleToSecurityGroup](docs/sdks/securitygroup/README.md#addruletosecuritygroup) - Create a Security Group rule
* [removeExternalSourceFromSecurityGroup](docs/sdks/securitygroup/README.md#removeexternalsourcefromsecuritygroup) - Remove an external source from a Security Group
* [detachInstanceFromSecurityGroup](docs/sdks/securitygroup/README.md#detachinstancefromsecuritygroup) - Detach a Compute instance from a Security Group
* [addExternalSourceToSecurityGroup](docs/sdks/securitygroup/README.md#addexternalsourcetosecuritygroup) - Add an external source as a member of a Security Group

### [iam()](docs/sdks/iam/README.md)

* [revokeAccessKey](docs/sdks/iam/README.md#revokeaccesskey) - Revoke an IAM Access Key
* [getAccessKey](docs/sdks/iam/README.md#getaccesskey) - Retrieve IAM Access Key details
* [listAccessKeys](docs/sdks/iam/README.md#listaccesskeys) - List IAM Access Keys
* [createAccessKey](docs/sdks/iam/README.md#createaccesskey) - Create a legacy IAM Access Key
* [createApiKey](docs/sdks/iam/README.md#createapikey) - Create a new API key
* [listApiKeys](docs/sdks/iam/README.md#listapikeys) - List API keys
* [deleteApiKey](docs/sdks/iam/README.md#deleteapikey) - Delete an API key
* [getApiKey](docs/sdks/iam/README.md#getapikey) - Get API key
* [listAccessKeyKnownOperations](docs/sdks/iam/README.md#listaccesskeyknownoperations) - Retrieve all known available IAM Access Key operations and associated tags
* [updateIamRole](docs/sdks/iam/README.md#updateiamrole) - Update IAM Role
* [getIamRole](docs/sdks/iam/README.md#getiamrole) - Retrieve IAM Role
* [deleteIamRole](docs/sdks/iam/README.md#deleteiamrole) - Delete IAM Role
* [getIamOrganizationPolicy](docs/sdks/iam/README.md#getiamorganizationpolicy) - Retrieve IAM Organization Policy
* [updateIamOrganizationPolicy](docs/sdks/iam/README.md#updateiamorganizationpolicy) - Update IAM Organization Policy
* [listAccessKeyOperations](docs/sdks/iam/README.md#listaccesskeyoperations) - Retrieve IAM Access Key operations and associated tags for the signing key
* [updateIamRolePolicy](docs/sdks/iam/README.md#updateiamrolepolicy) - Update IAM Role Policy
* [listIamRoles](docs/sdks/iam/README.md#listiamroles) - List IAM Roles
* [createIamRole](docs/sdks/iam/README.md#createiamrole) - Create IAM Role

### [privateNetwork()](docs/sdks/privatenetwork/README.md)

* [attachInstanceToPrivateNetwork](docs/sdks/privatenetwork/README.md#attachinstancetoprivatenetwork) - Attach a Compute instance to a Private Network
* [updatePrivateNetworkInstanceIp](docs/sdks/privatenetwork/README.md#updateprivatenetworkinstanceip) - Update the IP address of an instance attached to a managed private network
* [listPrivateNetworks](docs/sdks/privatenetwork/README.md#listprivatenetworks) - List Private Networks
* [createPrivateNetwork](docs/sdks/privatenetwork/README.md#createprivatenetwork) - Create a Private Network
* [detachInstanceFromPrivateNetwork](docs/sdks/privatenetwork/README.md#detachinstancefromprivatenetwork) - Detach a Compute instance from a Private Network
* [updatePrivateNetwork](docs/sdks/privatenetwork/README.md#updateprivatenetwork) - Update a Private Network
* [getPrivateNetwork](docs/sdks/privatenetwork/README.md#getprivatenetwork) - Retrieve Private Network details
* [deletePrivateNetwork](docs/sdks/privatenetwork/README.md#deleteprivatenetwork) - Delete a Private Network
* [resetPrivateNetworkField](docs/sdks/privatenetwork/README.md#resetprivatenetworkfield) - Reset Private Network field

### [instanceType()](docs/sdks/instancetype/README.md)

* [getInstanceType](docs/sdks/instancetype/README.md#getinstancetype) - Retrieve Instance Type details
* [listInstanceTypes](docs/sdks/instancetype/README.md#listinstancetypes) - List Compute instance Types

### [elasticIp()](docs/sdks/elasticip/README.md)

* [createElasticIp](docs/sdks/elasticip/README.md#createelasticip) - Create an Elastic IP
* [listElasticIps](docs/sdks/elasticip/README.md#listelasticips) - List Elastic IPs
* [resetElasticIpField](docs/sdks/elasticip/README.md#resetelasticipfield) - Reset an Elastic IP field to its default value
* [detachInstanceFromElasticIp](docs/sdks/elasticip/README.md#detachinstancefromelasticip) - Detach a Compute instance from an Elastic IP
* [attachInstanceToElasticIp](docs/sdks/elasticip/README.md#attachinstancetoelasticip) - Attach a Compute instance to an Elastic IP
* [updateElasticIp](docs/sdks/elasticip/README.md#updateelasticip) - Update an Elastic IP
* [getElasticIp](docs/sdks/elasticip/README.md#getelasticip) - Retrieve Elastic IP details
* [deleteElasticIp](docs/sdks/elasticip/README.md#deleteelasticip) - Delete an Elastic IP

### [zone()](docs/sdks/zone/README.md)

* [listZones](docs/sdks/zone/README.md#listzones) - List Zones

### [sks()](docs/sdks/sks/README.md)

* [generateSksClusterKubeconfig](docs/sdks/sks/README.md#generatesksclusterkubeconfig) - Generate a new Kubeconfig file for a SKS cluster
* [updateSksNodepool](docs/sdks/sks/README.md#updatesksnodepool) - Update an SKS Nodepool
* [getSksNodepool](docs/sdks/sks/README.md#getsksnodepool) - Retrieve SKS Nodepool details
* [deleteSksNodepool](docs/sdks/sks/README.md#deletesksnodepool) - Delete an SKS Nodepool
* [getSksClusterAuthorityCert](docs/sdks/sks/README.md#getsksclusterauthoritycert) - Get the certificate for a SKS cluster authority
* [listSksClusterDeprecatedResources](docs/sdks/sks/README.md#listsksclusterdeprecatedresources) - Resources that are scheduled to be removed in future kubernetes releases
* [scaleSksNodepool](docs/sdks/sks/README.md#scalesksnodepool) - Scale a SKS Nodepool
* [upgradeSksClusterServiceLevel](docs/sdks/sks/README.md#upgradesksclusterservicelevel) - Upgrade a SKS cluster to pro
* [evictSksNodepoolMembers](docs/sdks/sks/README.md#evictsksnodepoolmembers) - Evict Nodepool members
* [createSksCluster](docs/sdks/sks/README.md#createskscluster) - Create an SKS cluster
* [listSksClusters](docs/sdks/sks/README.md#listsksclusters) - List SKS clusters
* [deleteSksCluster](docs/sdks/sks/README.md#deleteskscluster) - Delete an SKS cluster
* [getSksCluster](docs/sdks/sks/README.md#getskscluster) - Retrieve SKS cluster details
* [updateSksCluster](docs/sdks/sks/README.md#updateskscluster) - Update an SKS cluster
* [getSksClusterInspection](docs/sdks/sks/README.md#getsksclusterinspection) - Get the latest inspection result
* [rotateSksCcmCredentials](docs/sdks/sks/README.md#rotatesksccmcredentials) - Rotate Exoscale CCM credentials
* [resetSksClusterField](docs/sdks/sks/README.md#resetsksclusterfield) - Reset an SKS cluster field to its default value
* [createSksNodepool](docs/sdks/sks/README.md#createsksnodepool) - Create a new SKS Nodepool
* [resetSksNodepoolField](docs/sdks/sks/README.md#resetsksnodepoolfield) - Reset an SKS Nodepool field to its default value
* [rotateSksOperatorsCa](docs/sdks/sks/README.md#rotatesksoperatorsca) - Rotate operators certificate authority
* [listSksClusterVersions](docs/sdks/sks/README.md#listsksclusterversions) - List available versions for SKS clusters
* [upgradeSksCluster](docs/sdks/sks/README.md#upgradeskscluster) - Upgrade an SKS cluster

### [dns()](docs/sdks/dns/README.md)

* [listDnsDomainRecords](docs/sdks/dns/README.md#listdnsdomainrecords) - List DNS domain records
* [createDnsDomainRecord](docs/sdks/dns/README.md#creatednsdomainrecord) - Create DNS domain record
* [listDnsDomains](docs/sdks/dns/README.md#listdnsdomains) - List DNS domains
* [createDnsDomain](docs/sdks/dns/README.md#creatednsdomain) - Create DNS domain
* [getDnsDomainRecord](docs/sdks/dns/README.md#getdnsdomainrecord) - Retrieve DNS domain record details
* [updateDnsDomainRecord](docs/sdks/dns/README.md#updatednsdomainrecord) - Update DNS domain record
* [deleteDnsDomainRecord](docs/sdks/dns/README.md#deletednsdomainrecord) - Delete DNS domain record
* [getDnsDomainZoneFile](docs/sdks/dns/README.md#getdnsdomainzonefile) - Retrieve DNS domain zone file
* [deleteDnsDomain](docs/sdks/dns/README.md#deletednsdomain) - Delete DNS Domain
* [getDnsDomain](docs/sdks/dns/README.md#getdnsdomain) - Retrieve DNS domain details

### [deployTarget()](docs/sdks/deploytarget/README.md)

* [listDeployTargets](docs/sdks/deploytarget/README.md#listdeploytargets) - List Deploy Targets
* [getDeployTarget](docs/sdks/deploytarget/README.md#getdeploytarget) - Retrieve Deploy Target details

### [blockStorage()](docs/sdks/blockstorage/README.md)

* [attachBlockStorageVolumeToInstance](docs/sdks/blockstorage/README.md#attachblockstoragevolumetoinstance) - Attach block storage volume to an instance
* [deleteBlockStorageSnapshot](docs/sdks/blockstorage/README.md#deleteblockstoragesnapshot) - Delete a block storage snapshot, data will be unrecoverable
* [getBlockStorageSnapshot](docs/sdks/blockstorage/README.md#getblockstoragesnapshot) - Retrieve block storage snapshot details
* [getBlockStorageVolume](docs/sdks/blockstorage/README.md#getblockstoragevolume) - Retrieve block storage volume details
* [updateBlockStorageVolumeLabels](docs/sdks/blockstorage/README.md#updateblockstoragevolumelabels) - Set block storage volume labels
* [deleteBlockStorageVolume](docs/sdks/blockstorage/README.md#deleteblockstoragevolume) - Delete a block storage volume, data will be unrecoverable
* [createBlockStorageSnapshot](docs/sdks/blockstorage/README.md#createblockstoragesnapshot) - Create a block storage snapshot
* [listBlockStorageSnapshots](docs/sdks/blockstorage/README.md#listblockstoragesnapshots) - List block storage snapshots
* [resizeBlockStorageVolume](docs/sdks/blockstorage/README.md#resizeblockstoragevolume) - Resize a block storage volume
* [detachBlockStorageVolume](docs/sdks/blockstorage/README.md#detachblockstoragevolume) - Detach block storage volume
* [listBlockStorageVolumes](docs/sdks/blockstorage/README.md#listblockstoragevolumes) - List block storage volumes
* [createBlockStorageVolume](docs/sdks/blockstorage/README.md#createblockstoragevolume) - Create a block storage volume

### [quotas()](docs/sdks/quotas/README.md)

* [getQuota](docs/sdks/quotas/README.md#getquota) - Retrieve Resource Quota
* [listQuotas](docs/sdks/quotas/README.md#listquotas) - List Organization Quotas

### [compute()](docs/sdks/compute/README.md)

* [resetLoadBalancerServiceField](docs/sdks/compute/README.md#resetloadbalancerservicefield) - Reset a Load Balancer Service field to its default value

### [operation()](docs/sdks/operation/README.md)

* [getOperation](docs/sdks/operation/README.md#getoperation) - Retrieve Operation details

### [template()](docs/sdks/template/README.md)

* [deleteTemplate](docs/sdks/template/README.md#deletetemplate) - Delete a Template
* [copyTemplate](docs/sdks/template/README.md#copytemplate) - Copy a Template from a zone to another
* [updateTemplate](docs/sdks/template/README.md#updatetemplate) - Update template attributes
* [getTemplate](docs/sdks/template/README.md#gettemplate) - Retrieve Template details
* [promoteSnapshotToTemplate](docs/sdks/template/README.md#promotesnapshottotemplate) - Promote a Snapshot to a Template
* [listTemplates](docs/sdks/template/README.md#listtemplates) - List Templates
* [registerTemplate](docs/sdks/template/README.md#registertemplate) - Register a Template

### [sos()](docs/sdks/sos/README.md)

* [listSosBucketsUsage](docs/sdks/sos/README.md#listsosbucketsusage) - List SOS Buckets Usage
* [getSosPresignedUrl](docs/sdks/sos/README.md#getsospresignedurl) - Retrieve Presigned Download URL for SOS object

### [sshKey()](docs/sdks/sshkey/README.md)

* [deleteSshKey](docs/sdks/sshkey/README.md#deletesshkey) - Delete a SSH key
* [getSshKey](docs/sdks/sshkey/README.md#getsshkey) - Retrieve SSH key details
* [listSshKeys](docs/sdks/sshkey/README.md#listsshkeys) - List SSH keys
* [registerSshKey](docs/sdks/sshkey/README.md#registersshkey) - Import SSH key
<!-- End Available Resources and Operations [operations] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations.  All operations return a response object or raise an error.  If Error objects are specified in your OpenAPI Spec, the SDK will throw the appropriate Exception type.

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

### Example

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteLoadBalancerServiceRequest;
import com.exoscale.api.models.operations.DeleteLoadBalancerServiceResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Exoscale sdk = Exoscale.builder()
                .build();

            DeleteLoadBalancerServiceResponse res = sdk.networkLoadBalancer().deleteLoadBalancerService()
                .id("266197f0-c85e-4981-85ec-e73d8dc6e6bf")
                .serviceId("03cf7ba0-13f2-4305-9769-06e0ffb8d5fc")
                .call();

            if (res.operation().isPresent()) {
                // handle response
            }
        } catch (com.exoscale.api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `serverIndex` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `https://api-{zone}.exoscale.com/v2` | `zone` (default is `ch-gva-2`) |

#### Example

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteLoadBalancerServiceRequest;
import com.exoscale.api.models.operations.DeleteLoadBalancerServiceResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Exoscale sdk = Exoscale.builder()
                .serverIndex(0)
                .build();

            DeleteLoadBalancerServiceResponse res = sdk.networkLoadBalancer().deleteLoadBalancerService()
                .id("266197f0-c85e-4981-85ec-e73d8dc6e6bf")
                .serviceId("03cf7ba0-13f2-4305-9769-06e0ffb8d5fc")
                .call();

            if (res.operation().isPresent()) {
                // handle response
            }
        } catch (com.exoscale.api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

#### Variables

Some of the server options above contain variables. If you want to set the values of those variables, the following optional parameters are available when initializing the SDK client instance:
 * `ServerZone zone`

### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `serverURL` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteLoadBalancerServiceRequest;
import com.exoscale.api.models.operations.DeleteLoadBalancerServiceResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Exoscale sdk = Exoscale.builder()
                .serverURL("https://api-{zone}.exoscale.com/v2")
                .build();

            DeleteLoadBalancerServiceResponse res = sdk.networkLoadBalancer().deleteLoadBalancerService()
                .id("266197f0-c85e-4981-85ec-e73d8dc6e6bf")
                .serviceId("03cf7ba0-13f2-4305-9769-06e0ffb8d5fc")
                .call();

            if (res.operation().isPresent()) {
                // handle response
            }
        } catch (com.exoscale.api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End Server Selection [server] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
