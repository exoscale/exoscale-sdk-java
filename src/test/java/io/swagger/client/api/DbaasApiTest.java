/*
 * Exoscale Public API
 *  Infrastructure automation API, allowing programmatic access to all Exoscale products and services.  The [OpenAPI Specification](http://spec.openapis.org/oas/v3.0.3.html) source of this documentation can be obtained here:  * [JSON format](https://openapi-v2.exoscale.com/source.json) * [YAML format](https://openapi-v2.exoscale.com/source.yaml)
 *
 * OpenAPI spec version: 2.0.0
 * Contact: api@exoscale.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

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
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DbaasApi
 */
@Ignore
public class DbaasApiTest {

    private final DbaasApi api = new DbaasApi();

    /**
     * Create a new DBaaS integration between two services
     *
     * Create a new DBaaS integration between two services
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDbaasIntegrationTest() {
        DbaasintegrationBody body = null;
        Operation response = api.createDbaasIntegration(body);

        // TODO: test validations
    }
    /**
     * Add a Kafka Schema Registry ACL entry
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDbaasKafkaSchemaRegistryAclConfigTest() {
        DbaasKafkaSchemaRegistryAclEntry body = null;
        String name = null;
        Operation response = api.createDbaasKafkaSchemaRegistryAclConfig(body, name);

        // TODO: test validations
    }
    /**
     * Add a Kafka topic ACL entry
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDbaasKafkaTopicAclConfigTest() {
        DbaasKafkaTopicAclEntry body = null;
        String name = null;
        Operation response = api.createDbaasKafkaTopicAclConfig(body, name);

        // TODO: test validations
    }
    /**
     * Create a DBaaS Kafka user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDbaasKafkaUserTest() {
        ServicenameUserBody2 body = null;
        String serviceName = null;
        Operation response = api.createDbaasKafkaUser(body, serviceName);

        // TODO: test validations
    }
    /**
     * Create a DBaaS MySQL database
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDbaasMysqlDatabaseTest() {
        ServicenameDatabaseBody1 body = null;
        String serviceName = null;
        Operation response = api.createDbaasMysqlDatabase(body, serviceName);

        // TODO: test validations
    }
    /**
     * Create a DBaaS MySQL user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDbaasMysqlUserTest() {
        ServicenameUserBody body = null;
        String serviceName = null;
        Operation response = api.createDbaasMysqlUser(body, serviceName);

        // TODO: test validations
    }
    /**
     * Create a DBaaS OpenSearch user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDbaasOpensearchUserTest() {
        ServicenameUserBody3 body = null;
        String serviceName = null;
        Operation response = api.createDbaasOpensearchUser(body, serviceName);

        // TODO: test validations
    }
    /**
     * Create a DBaaS PostgreSQL connection pool
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDbaasPgConnectionPoolTest() {
        ServicenameConnectionpoolBody body = null;
        String serviceName = null;
        Operation response = api.createDbaasPgConnectionPool(body, serviceName);

        // TODO: test validations
    }
    /**
     * Create a DBaaS Postgres database
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDbaasPgDatabaseTest() {
        ServicenameDatabaseBody body = null;
        String serviceName = null;
        Operation response = api.createDbaasPgDatabase(body, serviceName);

        // TODO: test validations
    }
    /**
     * 
     *
     * Check whether you can upgrade Postgres service to a newer version
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDbaasPgUpgradeCheckTest() {
        ServiceUpgradecheckBody body = null;
        String service = null;
        DbaasTask response = api.createDbaasPgUpgradeCheck(body, service);

        // TODO: test validations
    }
    /**
     * Create a DBaaS Postgres user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDbaasPostgresUserTest() {
        ServicenameUserBody1 body = null;
        String serviceName = null;
        Operation response = api.createDbaasPostgresUser(body, serviceName);

        // TODO: test validations
    }
    /**
     * 
     *
     * Create a DBaaS Grafana service
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDbaasServiceGrafanaTest() {
        DbaasgrafanaNameBody1 body = null;
        String name = null;
        Operation response = api.createDbaasServiceGrafana(body, name);

        // TODO: test validations
    }
    /**
     * Create a DBaaS Kafka service
     *
     * Create a DBaaS Kafka service
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDbaasServiceKafkaTest() {
        DbaaskafkaNameBody1 body = null;
        String name = null;
        Operation response = api.createDbaasServiceKafka(body, name);

        // TODO: test validations
    }
    /**
     * Create a DBaaS MySQL service
     *
     * Create a DBaaS MySQL service
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDbaasServiceMysqlTest() {
        DbaasmysqlNameBody1 body = null;
        String name = null;
        Operation response = api.createDbaasServiceMysql(body, name);

        // TODO: test validations
    }
    /**
     * Create a DBaaS OpenSearch service
     *
     * Create a DBaaS OpenSearch service
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDbaasServiceOpensearchTest() {
        DbaasopensearchNameBody1 body = null;
        String name = null;
        Operation response = api.createDbaasServiceOpensearch(body, name);

        // TODO: test validations
    }
    /**
     * Create a DBaaS PostgreSQL service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDbaasServicePgTest() {
        DbaaspostgresNameBody1 body = null;
        String name = null;
        Operation response = api.createDbaasServicePg(body, name);

        // TODO: test validations
    }
    /**
     * Create a DBaaS Redis service
     *
     * Create a DBaaS Redis service
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDbaasServiceRedisTest() {
        DbaasredisNameBody1 body = null;
        String name = null;
        Operation response = api.createDbaasServiceRedis(body, name);

        // TODO: test validations
    }
    /**
     * 
     *
     * Create a DBaaS task to check migration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDbaasTaskMigrationCheckTest() {
        DbaastaskmigrationcheckServiceBody body = null;
        String service = null;
        Operation response = api.createDbaasTaskMigrationCheck(body, service);

        // TODO: test validations
    }
    /**
     * Delete a DBaaS Integration
     *
     * Delete a DBaaS Integration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDbaasIntegrationTest() {
        UUID id = null;
        Operation response = api.deleteDbaasIntegration(id);

        // TODO: test validations
    }
    /**
     * Delete a Kafka ACL entry
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDbaasKafkaSchemaRegistryAclConfigTest() {
        String name = null;
        String aclId = null;
        Operation response = api.deleteDbaasKafkaSchemaRegistryAclConfig(name, aclId);

        // TODO: test validations
    }
    /**
     * Delete a Kafka ACL entry
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDbaasKafkaTopicAclConfigTest() {
        String name = null;
        String aclId = null;
        Operation response = api.deleteDbaasKafkaTopicAclConfig(name, aclId);

        // TODO: test validations
    }
    /**
     * Delete a DBaaS kafka user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDbaasKafkaUserTest() {
        String serviceName = null;
        String username = null;
        Operation response = api.deleteDbaasKafkaUser(serviceName, username);

        // TODO: test validations
    }
    /**
     * Delete a DBaaS MySQL database
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDbaasMysqlDatabaseTest() {
        String serviceName = null;
        String databaseName = null;
        Operation response = api.deleteDbaasMysqlDatabase(serviceName, databaseName);

        // TODO: test validations
    }
    /**
     * Delete a DBaaS MySQL user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDbaasMysqlUserTest() {
        String serviceName = null;
        String username = null;
        Operation response = api.deleteDbaasMysqlUser(serviceName, username);

        // TODO: test validations
    }
    /**
     * Delete a DBaaS OpenSearch user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDbaasOpensearchUserTest() {
        String serviceName = null;
        String username = null;
        Operation response = api.deleteDbaasOpensearchUser(serviceName, username);

        // TODO: test validations
    }
    /**
     * Delete a DBaaS PostgreSQL connection pool
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDbaasPgConnectionPoolTest() {
        String serviceName = null;
        String connectionPoolName = null;
        Operation response = api.deleteDbaasPgConnectionPool(serviceName, connectionPoolName);

        // TODO: test validations
    }
    /**
     * Delete a DBaaS Postgres database
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDbaasPgDatabaseTest() {
        String serviceName = null;
        String databaseName = null;
        Operation response = api.deleteDbaasPgDatabase(serviceName, databaseName);

        // TODO: test validations
    }
    /**
     * Delete a DBaaS Postgres user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDbaasPostgresUserTest() {
        String serviceName = null;
        String username = null;
        Operation response = api.deleteDbaasPostgresUser(serviceName, username);

        // TODO: test validations
    }
    /**
     * Delete a DBaaS service
     *
     * Delete a DBaaS service
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDbaasServiceTest() {
        String name = null;
        Operation response = api.deleteDbaasService(name);

        // TODO: test validations
    }
    /**
     * Delete a Grafana service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDbaasServiceGrafanaTest() {
        String name = null;
        Operation response = api.deleteDbaasServiceGrafana(name);

        // TODO: test validations
    }
    /**
     * Delete a Kafka service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDbaasServiceKafkaTest() {
        String name = null;
        Operation response = api.deleteDbaasServiceKafka(name);

        // TODO: test validations
    }
    /**
     * Delete a MySQL service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDbaasServiceMysqlTest() {
        String name = null;
        Operation response = api.deleteDbaasServiceMysql(name);

        // TODO: test validations
    }
    /**
     * Delete a OpenSearch service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDbaasServiceOpensearchTest() {
        String name = null;
        Operation response = api.deleteDbaasServiceOpensearch(name);

        // TODO: test validations
    }
    /**
     * Delete a Postgres service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDbaasServicePgTest() {
        String name = null;
        Operation response = api.deleteDbaasServicePg(name);

        // TODO: test validations
    }
    /**
     * Delete a Redis service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDbaasServiceRedisTest() {
        String name = null;
        Operation response = api.deleteDbaasServiceRedis(name);

        // TODO: test validations
    }
    /**
     * Get DBaaS CA Certificate
     *
     * Returns a CA Certificate required to reach a DBaaS service through a TLS-protected connection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDbaasCaCertificateTest() {
        InlineResponse20010 response = api.getDbaasCaCertificate();

        // TODO: test validations
    }
    /**
     * Get a DBaaS Integration
     *
     * Get a DBaaS Integration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDbaasIntegrationTest() {
        UUID id = null;
        DbaasIntegration response = api.getDbaasIntegration(id);

        // TODO: test validations
    }
    /**
     * Get DBaaS kafka ACL configuration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDbaasKafkaAclConfigTest() {
        String name = null;
        DbaasKafkaAcls response = api.getDbaasKafkaAclConfig(name);

        // TODO: test validations
    }
    /**
     * Get a DBaaS migration status
     *
     * Get a DBaaS migration status
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDbaasMigrationStatusTest() {
        String name = null;
        DbaasMigrationStatus response = api.getDbaasMigrationStatus(name);

        // TODO: test validations
    }
    /**
     * Get DBaaS OpenSearch ACL configuration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDbaasOpensearchAclConfigTest() {
        String name = null;
        DbaasOpensearchAclConfig response = api.getDbaasOpensearchAclConfig(name);

        // TODO: test validations
    }
    /**
     * Get a DBaaS Grafana service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDbaasServiceGrafanaTest() {
        String name = null;
        DbaasServiceGrafana response = api.getDbaasServiceGrafana(name);

        // TODO: test validations
    }
    /**
     * Get a DBaaS Kafka service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDbaasServiceKafkaTest() {
        String name = null;
        DbaasServiceKafka response = api.getDbaasServiceKafka(name);

        // TODO: test validations
    }
    /**
     * Get logs of DBaaS service
     *
     * Get logs of DBaaS service
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDbaasServiceLogsTest() {
        DbaasservicelogsServicenameBody body = null;
        String serviceName = null;
        DbaasServiceLogs response = api.getDbaasServiceLogs(body, serviceName);

        // TODO: test validations
    }
    /**
     * Get metrics of DBaaS service
     *
     * Get metrics of DBaaS service
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDbaasServiceMetricsTest() {
        DbaasservicemetricsServicenameBody body = null;
        String serviceName = null;
        InlineResponse20027 response = api.getDbaasServiceMetrics(body, serviceName);

        // TODO: test validations
    }
    /**
     * Get a DBaaS MySQL service
     *
     * Get a DBaaS MySQL service
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDbaasServiceMysqlTest() {
        String name = null;
        DbaasServiceMysql response = api.getDbaasServiceMysql(name);

        // TODO: test validations
    }
    /**
     * Get a DBaaS OpenSearch service
     *
     * Get a DBaaS OpenSearch service
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDbaasServiceOpensearchTest() {
        String name = null;
        DbaasServiceOpensearch response = api.getDbaasServiceOpensearch(name);

        // TODO: test validations
    }
    /**
     * Get a DBaaS PostgreSQL service
     *
     * Get a DBaaS PostgreSQL service
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDbaasServicePgTest() {
        String name = null;
        DbaasServicePg response = api.getDbaasServicePg(name);

        // TODO: test validations
    }
    /**
     * Get a DBaaS Redis service
     *
     * Get a DBaaS Redis service
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDbaasServiceRedisTest() {
        String name = null;
        DbaasServiceRedis response = api.getDbaasServiceRedis(name);

        // TODO: test validations
    }
    /**
     * Get a DBaaS service type
     *
     * Get a DBaaS service type
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDbaasServiceTypeTest() {
        String serviceTypeName = null;
        DbaasServiceType response = api.getDbaasServiceType(serviceTypeName);

        // TODO: test validations
    }
    /**
     * Get DBaaS Grafana settings
     *
     * Get DBaaS Grafana settings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDbaasSettingsGrafanaTest() {
        InlineResponse20011 response = api.getDbaasSettingsGrafana();

        // TODO: test validations
    }
    /**
     * Get DBaaS Kafka settings
     *
     * Get DBaaS Kafka settings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDbaasSettingsKafkaTest() {
        InlineResponse20034 response = api.getDbaasSettingsKafka();

        // TODO: test validations
    }
    /**
     * Get DBaaS MySQL settings
     *
     * Get DBaaS MySQL settings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDbaasSettingsMysqlTest() {
        InlineResponse20021 response = api.getDbaasSettingsMysql();

        // TODO: test validations
    }
    /**
     * Get DBaaS OpenSearch settings
     *
     * Get DBaaS OpenSearch settings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDbaasSettingsOpensearchTest() {
        InlineResponse20035 response = api.getDbaasSettingsOpensearch();

        // TODO: test validations
    }
    /**
     * Get DBaaS PostgreSQL settings
     *
     * Get DBaaS PostgreSQL settings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDbaasSettingsPgTest() {
        InlineResponse20032 response = api.getDbaasSettingsPg();

        // TODO: test validations
    }
    /**
     * Get DBaaS Redis settings
     *
     * Returns the default settings for Redis.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDbaasSettingsRedisTest() {
        InlineResponse20014 response = api.getDbaasSettingsRedis();

        // TODO: test validations
    }
    /**
     * Get a DBaaS task
     *
     * Get a DBaaS task
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDbaasTaskTest() {
        String service = null;
        UUID id = null;
        DbaasTask response = api.getDbaasTask(service, id);

        // TODO: test validations
    }
    /**
     * Get DBaaS integration settings
     *
     * Get DBaaS integration settings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listDbaasIntegrationSettingsTest() {
        String integrationType = null;
        String sourceType = null;
        String destType = null;
        InlineResponse20031 response = api.listDbaasIntegrationSettings(integrationType, sourceType, destType);

        // TODO: test validations
    }
    /**
     * Get DBaaS integration types
     *
     * Get DBaaS integration types
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listDbaasIntegrationTypesTest() {
        InlineResponse20022 response = api.listDbaasIntegrationTypes();

        // TODO: test validations
    }
    /**
     * DBaaS Service Types
     *
     * List available service types for DBaaS
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listDbaasServiceTypesTest() {
        InlineResponse2003 response = api.listDbaasServiceTypes();

        // TODO: test validations
    }
    /**
     * List DBaaS services
     *
     * List DBaaS services
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listDbaasServicesTest() {
        InlineResponse2004 response = api.listDbaasServices();

        // TODO: test validations
    }
    /**
     * Reset the credentials of a DBaaS Kafka user
     *
     * If no password is provided one will be generated automatically.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resetDbaasKafkaUserPasswordTest() {
        PasswordResetBody2 body = null;
        String serviceName = null;
        String username = null;
        Operation response = api.resetDbaasKafkaUserPassword(body, serviceName, username);

        // TODO: test validations
    }
    /**
     * Reset the credentials of a DBaaS mysql user
     *
     * If no password is provided one will be generated automatically.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resetDbaasMysqlUserPasswordTest() {
        PasswordResetBody body = null;
        String serviceName = null;
        String username = null;
        Operation response = api.resetDbaasMysqlUserPassword(body, serviceName, username);

        // TODO: test validations
    }
    /**
     * Reset the credentials of a DBaaS OpenSearch user
     *
     * If no password is provided one will be generated automatically.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resetDbaasOpensearchUserPasswordTest() {
        PasswordResetBody1 body = null;
        String serviceName = null;
        String username = null;
        Operation response = api.resetDbaasOpensearchUserPassword(body, serviceName, username);

        // TODO: test validations
    }
    /**
     * Reset the credentials of a DBaaS Postgres user
     *
     * If no password is provided one will be generated automatically.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resetDbaasPostgresUserPasswordTest() {
        PasswordResetBody3 body = null;
        String serviceName = null;
        String username = null;
        Operation response = api.resetDbaasPostgresUserPassword(body, serviceName, username);

        // TODO: test validations
    }
    /**
     * Initiate Grafana maintenance update
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startDbaasGrafanaMaintenanceTest() {
        String name = null;
        Operation response = api.startDbaasGrafanaMaintenance(name);

        // TODO: test validations
    }
    /**
     * Initiate Kafka maintenance update
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startDbaasKafkaMaintenanceTest() {
        String name = null;
        Operation response = api.startDbaasKafkaMaintenance(name);

        // TODO: test validations
    }
    /**
     * Initiate MySQL maintenance update
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startDbaasMysqlMaintenanceTest() {
        String name = null;
        Operation response = api.startDbaasMysqlMaintenance(name);

        // TODO: test validations
    }
    /**
     * Initiate OpenSearch maintenance update
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startDbaasOpensearchMaintenanceTest() {
        String name = null;
        Operation response = api.startDbaasOpensearchMaintenance(name);

        // TODO: test validations
    }
    /**
     * Initiate PostgreSQL maintenance update
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startDbaasPgMaintenanceTest() {
        String name = null;
        Operation response = api.startDbaasPgMaintenance(name);

        // TODO: test validations
    }
    /**
     * Initiate Redis maintenance update
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startDbaasRedisMaintenanceTest() {
        String name = null;
        Operation response = api.startDbaasRedisMaintenance(name);

        // TODO: test validations
    }
    /**
     * Stop a DBaaS MySQL migration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stopDbaasMysqlMigrationTest() {
        String name = null;
        Operation response = api.stopDbaasMysqlMigration(name);

        // TODO: test validations
    }
    /**
     * Stop a DBaaS PostgreSQL migration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stopDbaasPgMigrationTest() {
        String name = null;
        Operation response = api.stopDbaasPgMigration(name);

        // TODO: test validations
    }
    /**
     * Stop a DBaaS Redis migration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stopDbaasRedisMigrationTest() {
        String name = null;
        Operation response = api.stopDbaasRedisMigration(name);

        // TODO: test validations
    }
    /**
     * Update a existing DBaaS integration
     *
     * Update a existing DBaaS integration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDbaasIntegrationTest() {
        DbaasintegrationIdBody body = null;
        UUID id = null;
        Operation response = api.updateDbaasIntegration(body, id);

        // TODO: test validations
    }
    /**
     * Create a DBaaS OpenSearch ACL configuration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDbaasOpensearchAclConfigTest() {
        DbaasOpensearchAclConfig body = null;
        String name = null;
        Operation response = api.updateDbaasOpensearchAclConfig(body, name);

        // TODO: test validations
    }
    /**
     * Update a DBaaS PostgreSQL connection pool
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDbaasPgConnectionPoolTest() {
        ConnectionpoolConnectionpoolnameBody body = null;
        String serviceName = null;
        String connectionPoolName = null;
        Operation response = api.updateDbaasPgConnectionPool(body, serviceName, connectionPoolName);

        // TODO: test validations
    }
    /**
     * Update access control for one service user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDbaasPostgresAllowReplicationTest() {
        UsernameAllowreplicationBody body = null;
        String serviceName = null;
        String username = null;
        DbaasPostgresUsers response = api.updateDbaasPostgresAllowReplication(body, serviceName, username);

        // TODO: test validations
    }
    /**
     * Update a DBaaS Grafana service
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDbaasServiceGrafanaTest() {
        DbaasgrafanaNameBody body = null;
        String name = null;
        Operation response = api.updateDbaasServiceGrafana(body, name);

        // TODO: test validations
    }
    /**
     * Update a DBaaS Kafka service
     *
     * Update a DBaaS Kafka service
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDbaasServiceKafkaTest() {
        DbaaskafkaNameBody body = null;
        String name = null;
        Operation response = api.updateDbaasServiceKafka(body, name);

        // TODO: test validations
    }
    /**
     * Update a DBaaS MySQL service
     *
     * Update a DBaaS MySQL service
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDbaasServiceMysqlTest() {
        DbaasmysqlNameBody body = null;
        String name = null;
        Operation response = api.updateDbaasServiceMysql(body, name);

        // TODO: test validations
    }
    /**
     * Update a DBaaS OpenSearch service
     *
     * Update a DBaaS OpenSearch service
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDbaasServiceOpensearchTest() {
        DbaasopensearchNameBody body = null;
        String name = null;
        Operation response = api.updateDbaasServiceOpensearch(body, name);

        // TODO: test validations
    }
    /**
     * Update a DBaaS PostgreSQL service
     *
     * Update a DBaaS PostgreSQL service
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDbaasServicePgTest() {
        DbaaspostgresNameBody body = null;
        String name = null;
        Operation response = api.updateDbaasServicePg(body, name);

        // TODO: test validations
    }
    /**
     * Update a DBaaS Redis service
     *
     * Update a DBaaS Redis service
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDbaasServiceRedisTest() {
        DbaasredisNameBody body = null;
        String name = null;
        Operation response = api.updateDbaasServiceRedis(body, name);

        // TODO: test validations
    }
}
