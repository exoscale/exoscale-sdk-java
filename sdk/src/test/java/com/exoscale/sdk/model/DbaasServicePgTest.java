/*
 * Exoscale Public API
 *  Infrastructure automation API, allowing programmatic access to all Exoscale products and services.  The [OpenAPI Specification](http://spec.openapis.org/oas/v3.0.3.html) source of this documentation can be obtained here:  * [JSON format](https://openapi-v2.exoscale.com/source.json) * [YAML format](https://openapi-v2.exoscale.com/source.yaml)
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@exoscale.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.exoscale.sdk.model;

import com.exoscale.sdk.model.DbaasIntegration;
import com.exoscale.sdk.model.DbaasNodeState;
import com.exoscale.sdk.model.DbaasServiceBackup;
import com.exoscale.sdk.model.DbaasServiceMaintenance;
import com.exoscale.sdk.model.DbaasServiceMysqlBackupSchedule;
import com.exoscale.sdk.model.DbaasServiceMysqlComponentsInner;
import com.exoscale.sdk.model.DbaasServiceMysqlPrometheusUri;
import com.exoscale.sdk.model.DbaasServiceNotification;
import com.exoscale.sdk.model.DbaasServicePgConnectionInfo;
import com.exoscale.sdk.model.DbaasServicePgConnectionPoolsInner;
import com.exoscale.sdk.model.DbaasServicePgUsersInner;
import com.exoscale.sdk.model.EnumPgSynchronousReplication;
import com.exoscale.sdk.model.EnumServiceState;
import com.exoscale.sdk.model.JsonSchemaPg;
import com.exoscale.sdk.model.JsonSchemaPgbouncer;
import com.exoscale.sdk.model.JsonSchemaPglookout;
import com.exoscale.sdk.model.JsonSchemaTimescaledb;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Model tests for DbaasServicePg
 */
public class DbaasServicePgTest {
    private final DbaasServicePg model = new DbaasServicePg();

    /**
     * Model tests for DbaasServicePg
     */
    @Test
    public void testDbaasServicePg() {
        // TODO: test DbaasServicePg
    }

    /**
     * Test the property 'pgbouncerSettings'
     */
    @Test
    public void pgbouncerSettingsTest() {
        // TODO: test pgbouncerSettings
    }

    /**
     * Test the property 'updatedAt'
     */
    @Test
    public void updatedAtTest() {
        // TODO: test updatedAt
    }

    /**
     * Test the property 'nodeCount'
     */
    @Test
    public void nodeCountTest() {
        // TODO: test nodeCount
    }

    /**
     * Test the property 'connectionInfo'
     */
    @Test
    public void connectionInfoTest() {
        // TODO: test connectionInfo
    }

    /**
     * Test the property 'backupSchedule'
     */
    @Test
    public void backupScheduleTest() {
        // TODO: test backupSchedule
    }

    /**
     * Test the property 'nodeCpuCount'
     */
    @Test
    public void nodeCpuCountTest() {
        // TODO: test nodeCpuCount
    }

    /**
     * Test the property 'prometheusUri'
     */
    @Test
    public void prometheusUriTest() {
        // TODO: test prometheusUri
    }

    /**
     * Test the property 'integrations'
     */
    @Test
    public void integrationsTest() {
        // TODO: test integrations
    }

    /**
     * Test the property 'zone'
     */
    @Test
    public void zoneTest() {
        // TODO: test zone
    }

    /**
     * Test the property 'nodeStates'
     */
    @Test
    public void nodeStatesTest() {
        // TODO: test nodeStates
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'connectionPools'
     */
    @Test
    public void connectionPoolsTest() {
        // TODO: test connectionPools
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'state'
     */
    @Test
    public void stateTest() {
        // TODO: test state
    }

    /**
     * Test the property 'timescaledbSettings'
     */
    @Test
    public void timescaledbSettingsTest() {
        // TODO: test timescaledbSettings
    }

    /**
     * Test the property 'databases'
     */
    @Test
    public void databasesTest() {
        // TODO: test databases
    }

    /**
     * Test the property 'ipFilter'
     */
    @Test
    public void ipFilterTest() {
        // TODO: test ipFilter
    }

    /**
     * Test the property 'backups'
     */
    @Test
    public void backupsTest() {
        // TODO: test backups
    }

    /**
     * Test the property 'terminationProtection'
     */
    @Test
    public void terminationProtectionTest() {
        // TODO: test terminationProtection
    }

    /**
     * Test the property 'notifications'
     */
    @Test
    public void notificationsTest() {
        // TODO: test notifications
    }

    /**
     * Test the property 'components'
     */
    @Test
    public void componentsTest() {
        // TODO: test components
    }

    /**
     * Test the property 'synchronousReplication'
     */
    @Test
    public void synchronousReplicationTest() {
        // TODO: test synchronousReplication
    }

    /**
     * Test the property 'pglookoutSettings'
     */
    @Test
    public void pglookoutSettingsTest() {
        // TODO: test pglookoutSettings
    }

    /**
     * Test the property 'maintenance'
     */
    @Test
    public void maintenanceTest() {
        // TODO: test maintenance
    }

    /**
     * Test the property 'diskSize'
     */
    @Test
    public void diskSizeTest() {
        // TODO: test diskSize
    }

    /**
     * Test the property 'nodeMemory'
     */
    @Test
    public void nodeMemoryTest() {
        // TODO: test nodeMemory
    }

    /**
     * Test the property 'uri'
     */
    @Test
    public void uriTest() {
        // TODO: test uri
    }

    /**
     * Test the property 'uriParams'
     */
    @Test
    public void uriParamsTest() {
        // TODO: test uriParams
    }

    /**
     * Test the property 'version'
     */
    @Test
    public void versionTest() {
        // TODO: test version
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'plan'
     */
    @Test
    public void planTest() {
        // TODO: test plan
    }

    /**
     * Test the property 'workMem'
     */
    @Test
    public void workMemTest() {
        // TODO: test workMem
    }

    /**
     * Test the property 'sharedBuffersPercentage'
     */
    @Test
    public void sharedBuffersPercentageTest() {
        // TODO: test sharedBuffersPercentage
    }

    /**
     * Test the property 'pgSettings'
     */
    @Test
    public void pgSettingsTest() {
        // TODO: test pgSettings
    }

    /**
     * Test the property 'maxConnections'
     */
    @Test
    public void maxConnectionsTest() {
        // TODO: test maxConnections
    }

    /**
     * Test the property 'users'
     */
    @Test
    public void usersTest() {
        // TODO: test users
    }

}
