# Dbaas
(*dbaas()*)

### Available Operations

* [getDbaasOpensearchAclConfig](#getdbaasopensearchaclconfig) - Get DBaaS OpenSearch ACL configuration
* [updateDbaasOpensearchAclConfig](#updatedbaasopensearchaclconfig) - Create a DBaaS OpenSearch ACL configuration
* [startDbaasGrafanaMaintenance](#startdbaasgrafanamaintenance) - Initiate Grafana maintenance update
* [createDbaasPgUpgradeCheck](#createdbaaspgupgradecheck) - Check whether you can upgrade Postgres service to a newer version
* [resetDbaasMysqlUserPassword](#resetdbaasmysqluserpassword) - Reset the credentials of a DBaaS mysql user
* [createDbaasPgConnectionPool](#createdbaaspgconnectionpool) - Create a DBaaS PostgreSQL connection pool
* [updateDbaasServiceMysql](#updatedbaasservicemysql) - Update a DBaaS MySQL service
* [getDbaasServiceMysql](#getdbaasservicemysql) - Get a DBaaS MySQL service
* [createDbaasServiceMysql](#createdbaasservicemysql) - Create a DBaaS MySQL service
* [deleteDbaasServiceMysql](#deletedbaasservicemysql) - Delete a MySQL service
* [createDbaasMysqlUser](#createdbaasmysqluser) - Create a DBaaS MySQL user
* [listDbaasServiceTypes](#listdbaasservicetypes) - DBaaS Service Types
* [listDbaasServices](#listdbaasservices) - List DBaaS services
* [getDbaasCaCertificate](#getdbaascacertificate) - Get DBaaS CA Certificate
* [getDbaasSettingsGrafana](#getdbaassettingsgrafana) - Get DBaaS Grafana settings
* [deleteDbaasPgDatabase](#deletedbaaspgdatabase) - Delete a DBaaS Postgres database
* [stopDbaasPgMigration](#stopdbaaspgmigration) - Stop a DBaaS PostgreSQL migration
* [getDbaasServiceKafka](#getdbaasservicekafka) - Get a DBaaS Kafka service
* [createDbaasServiceKafka](#createdbaasservicekafka) - Create a DBaaS Kafka service
* [updateDbaasServiceKafka](#updatedbaasservicekafka) - Update a DBaaS Kafka service
* [deleteDbaasServiceKafka](#deletedbaasservicekafka) - Delete a Kafka service
* [getDbaasSettingsRedis](#getdbaassettingsredis) - Get DBaaS Redis settings
* [createDbaasKafkaSchemaRegistryAclConfig](#createdbaaskafkaschemaregistryaclconfig) - Add a Kafka Schema Registry ACL entry
* [createDbaasPostgresUser](#createdbaaspostgresuser) - Create a DBaaS Postgres user
* [deleteDbaasOpensearchUser](#deletedbaasopensearchuser) - Delete a DBaaS OpenSearch user
* [createDbaasKafkaUser](#createdbaaskafkauser) - Create a DBaaS Kafka user
* [getDbaasSettingsMysql](#getdbaassettingsmysql) - Get DBaaS MySQL settings
* [createDbaasPgDatabase](#createdbaaspgdatabase) - Create a DBaaS Postgres database
* [createDbaasOpensearchUser](#createdbaasopensearchuser) - Create a DBaaS OpenSearch user
* [listDbaasIntegrationTypes](#listdbaasintegrationtypes) - Get DBaaS integration types
* [deleteDbaasPostgresUser](#deletedbaaspostgresuser) - Delete a DBaaS Postgres user
* [updateDbaasPostgresAllowReplication](#updatedbaaspostgresallowreplication) - Update access control for one service user
* [createDbaasKafkaTopicAclConfig](#createdbaaskafkatopicaclconfig) - Add a Kafka topic ACL entry
* [deleteDbaasMysqlDatabase](#deletedbaasmysqldatabase) - Delete a DBaaS MySQL database
* [getDbaasServiceLogs](#getdbaasservicelogs) - Get logs of DBaaS service
* [startDbaasPgMaintenance](#startdbaaspgmaintenance) - Initiate PostgreSQL maintenance update
* [deleteDbaasKafkaSchemaRegistryAclConfig](#deletedbaaskafkaschemaregistryaclconfig) - Delete a Kafka ACL entry
* [deleteDbaasKafkaUser](#deletedbaaskafkauser) - Delete a DBaaS kafka user
* [getDbaasServiceType](#getdbaasservicetype) - Get a DBaaS service type
* [startDbaasMysqlMaintenance](#startdbaasmysqlmaintenance) - Initiate MySQL maintenance update
* [resetDbaasOpensearchUserPassword](#resetdbaasopensearchuserpassword) - Reset the credentials of a DBaaS OpenSearch user
* [getDbaasServiceMetrics](#getdbaasservicemetrics) - Get metrics of DBaaS service
* [createDbaasTaskMigrationCheck](#createdbaastaskmigrationcheck) - Create a DBaaS task to check migration
* [deleteDbaasIntegration](#deletedbaasintegration) - Delete a DBaaS Integration
* [updateDbaasIntegration](#updatedbaasintegration) - Update a existing DBaaS integration
* [getDbaasIntegration](#getdbaasintegration) - Get a DBaaS Integration
* [listDbaasIntegrationSettings](#listdbaasintegrationsettings) - Get DBaaS integration settings
* [getDbaasSettingsPg](#getdbaassettingspg) - Get DBaaS PostgreSQL settings
* [stopDbaasRedisMigration](#stopdbaasredismigration) - Stop a DBaaS Redis migration
* [stopDbaasMysqlMigration](#stopdbaasmysqlmigration) - Stop a DBaaS MySQL migration
* [startDbaasKafkaMaintenance](#startdbaaskafkamaintenance) - Initiate Kafka maintenance update
* [updateDbaasPgConnectionPool](#updatedbaaspgconnectionpool) - Update a DBaaS PostgreSQL connection pool
* [deleteDbaasPgConnectionPool](#deletedbaaspgconnectionpool) - Delete a DBaaS PostgreSQL connection pool
* [getDbaasMigrationStatus](#getdbaasmigrationstatus) - Get a DBaaS migration status
* [deleteDbaasMysqlUser](#deletedbaasmysqluser) - Delete a DBaaS MySQL user
* [deleteDbaasService](#deletedbaasservice) - Delete a DBaaS service
* [createDbaasMysqlDatabase](#createdbaasmysqldatabase) - Create a DBaaS MySQL database
* [getDbaasSettingsKafka](#getdbaassettingskafka) - Get DBaaS Kafka settings
* [getDbaasSettingsOpensearch](#getdbaassettingsopensearch) - Get DBaaS OpenSearch settings
* [deleteDbaasServiceGrafana](#deletedbaasservicegrafana) - Delete a Grafana service
* [getDbaasServiceGrafana](#getdbaasservicegrafana) - Get a DBaaS Grafana service
* [updateDbaasServiceGrafana](#updatedbaasservicegrafana) - Update a DBaaS Grafana service
* [createDbaasServiceGrafana](#createdbaasservicegrafana) - Create a DBaaS Grafana service
* [startDbaasOpensearchMaintenance](#startdbaasopensearchmaintenance) - Initiate OpenSearch maintenance update
* [getDbaasKafkaAclConfig](#getdbaaskafkaaclconfig) - Get DBaaS kafka ACL configuration
* [resetDbaasKafkaUserPassword](#resetdbaaskafkauserpassword) - Reset the credentials of a DBaaS Kafka user
* [createDbaasServiceOpensearch](#createdbaasserviceopensearch) - Create a DBaaS OpenSearch service
* [getDbaasServiceOpensearch](#getdbaasserviceopensearch) - Get a DBaaS OpenSearch service
* [deleteDbaasServiceOpensearch](#deletedbaasserviceopensearch) - Delete a OpenSearch service
* [updateDbaasServiceOpensearch](#updatedbaasserviceopensearch) - Update a DBaaS OpenSearch service
* [deleteDbaasServiceRedis](#deletedbaasserviceredis) - Delete a Redis service
* [updateDbaasServiceRedis](#updatedbaasserviceredis) - Update a DBaaS Redis service
* [getDbaasServiceRedis](#getdbaasserviceredis) - Get a DBaaS Redis service
* [createDbaasServiceRedis](#createdbaasserviceredis) - Create a DBaaS Redis service
* [updateDbaasServicePg](#updatedbaasservicepg) - Update a DBaaS PostgreSQL service
* [getDbaasServicePg](#getdbaasservicepg) - Get a DBaaS PostgreSQL service
* [createDbaasServicePg](#createdbaasservicepg) - Create a DBaaS PostgreSQL service
* [deleteDbaasServicePg](#deletedbaasservicepg) - Delete a Postgres service
* [createDbaasIntegration](#createdbaasintegration) - Create a new DBaaS integration between two services
* [getDbaasTask](#getdbaastask) - Get a DBaaS task
* [startDbaasRedisMaintenance](#startdbaasredismaintenance) - Initiate Redis maintenance update
* [deleteDbaasKafkaTopicAclConfig](#deletedbaaskafkatopicaclconfig) - Delete a Kafka ACL entry
* [resetDbaasPostgresUserPassword](#resetdbaaspostgresuserpassword) - Reset the credentials of a DBaaS Postgres user

## getDbaasOpensearchAclConfig

Get DBaaS OpenSearch ACL configuration

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetDbaasOpensearchAclConfigRequest;
import com.exoscale.api.models.operations.GetDbaasOpensearchAclConfigResponse;
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

            GetDbaasOpensearchAclConfigResponse res = sdk.dbaas().getDbaasOpensearchAclConfig()
                .name("<value>")
                .call();

            if (res.dbaasOpensearchAclConfig().isPresent()) {
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetDbaasOpensearchAclConfigResponse>](../../models/operations/GetDbaasOpensearchAclConfigResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateDbaasOpensearchAclConfig

Create a DBaaS OpenSearch ACL configuration

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.Acls;
import com.exoscale.api.models.components.DbaasOpensearchAclConfig;
import com.exoscale.api.models.components.EnumOpensearchRulePermission;
import com.exoscale.api.models.components.Rules;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.UpdateDbaasOpensearchAclConfigRequest;
import com.exoscale.api.models.operations.UpdateDbaasOpensearchAclConfigResponse;
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

            UpdateDbaasOpensearchAclConfigResponse res = sdk.dbaas().updateDbaasOpensearchAclConfig()
                .name("<value>")
                .dbaasOpensearchAclConfig(DbaasOpensearchAclConfig.builder()
                    .build())
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

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `name`                                                                                                             | *String*                                                                                                           | :heavy_check_mark:                                                                                                 | N/A                                                                                                                |
| `dbaasOpensearchAclConfig`                                                                                         | [com.exoscale.api.models.components.DbaasOpensearchAclConfig](../../models/components/DbaasOpensearchAclConfig.md) | :heavy_check_mark:                                                                                                 | N/A                                                                                                                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpdateDbaasOpensearchAclConfigResponse>](../../models/operations/UpdateDbaasOpensearchAclConfigResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## startDbaasGrafanaMaintenance

Initiate Grafana maintenance update

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.StartDbaasGrafanaMaintenanceRequest;
import com.exoscale.api.models.operations.StartDbaasGrafanaMaintenanceResponse;
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

            StartDbaasGrafanaMaintenanceResponse res = sdk.dbaas().startDbaasGrafanaMaintenance()
                .name("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.StartDbaasGrafanaMaintenanceResponse>](../../models/operations/StartDbaasGrafanaMaintenanceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createDbaasPgUpgradeCheck

Check whether you can upgrade Postgres service to a newer version

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.DbaasPgTargetVersions;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateDbaasPgUpgradeCheckRequest;
import com.exoscale.api.models.operations.CreateDbaasPgUpgradeCheckRequestBody;
import com.exoscale.api.models.operations.CreateDbaasPgUpgradeCheckResponse;
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

            CreateDbaasPgUpgradeCheckResponse res = sdk.dbaas().createDbaasPgUpgradeCheck()
                .service("<value>")
                .requestBody(CreateDbaasPgUpgradeCheckRequestBody.builder()
                    .targetVersion(DbaasPgTargetVersions.TWELVE)
                    .build())
                .call();

            if (res.dbaasTask().isPresent()) {
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

### Parameters

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `service`                                                                                                                                  | *String*                                                                                                                                   | :heavy_check_mark:                                                                                                                         | N/A                                                                                                                                        |
| `requestBody`                                                                                                                              | [com.exoscale.api.models.operations.CreateDbaasPgUpgradeCheckRequestBody](../../models/operations/CreateDbaasPgUpgradeCheckRequestBody.md) | :heavy_check_mark:                                                                                                                         | N/A                                                                                                                                        |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateDbaasPgUpgradeCheckResponse>](../../models/operations/CreateDbaasPgUpgradeCheckResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## resetDbaasMysqlUserPassword

If no password is provided one will be generated automatically.

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.EnumMysqlAuthenticationPlugin;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ResetDbaasMysqlUserPasswordRequest;
import com.exoscale.api.models.operations.ResetDbaasMysqlUserPasswordRequestBody;
import com.exoscale.api.models.operations.ResetDbaasMysqlUserPasswordResponse;
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

            ResetDbaasMysqlUserPasswordResponse res = sdk.dbaas().resetDbaasMysqlUserPassword()
                .serviceName("<value>")
                .username("<value>")
                .requestBody(ResetDbaasMysqlUserPasswordRequestBody.builder()
                    .build())
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

### Parameters

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `serviceName`                                                                                                                                  | *String*                                                                                                                                       | :heavy_check_mark:                                                                                                                             | N/A                                                                                                                                            |
| `username`                                                                                                                                     | *String*                                                                                                                                       | :heavy_check_mark:                                                                                                                             | N/A                                                                                                                                            |
| `requestBody`                                                                                                                                  | [com.exoscale.api.models.operations.ResetDbaasMysqlUserPasswordRequestBody](../../models/operations/ResetDbaasMysqlUserPasswordRequestBody.md) | :heavy_check_mark:                                                                                                                             | N/A                                                                                                                                            |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ResetDbaasMysqlUserPasswordResponse>](../../models/operations/ResetDbaasMysqlUserPasswordResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createDbaasPgConnectionPool

Create a DBaaS PostgreSQL connection pool

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.EnumPgPoolMode;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateDbaasPgConnectionPoolRequest;
import com.exoscale.api.models.operations.CreateDbaasPgConnectionPoolRequestBody;
import com.exoscale.api.models.operations.CreateDbaasPgConnectionPoolResponse;
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

            CreateDbaasPgConnectionPoolResponse res = sdk.dbaas().createDbaasPgConnectionPool()
                .serviceName("<value>")
                .requestBody(CreateDbaasPgConnectionPoolRequestBody.builder()
                    .name("<value>")
                    .databaseName("<value>")
                    .build())
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

### Parameters

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `serviceName`                                                                                                                                  | *String*                                                                                                                                       | :heavy_check_mark:                                                                                                                             | N/A                                                                                                                                            |
| `requestBody`                                                                                                                                  | [com.exoscale.api.models.operations.CreateDbaasPgConnectionPoolRequestBody](../../models/operations/CreateDbaasPgConnectionPoolRequestBody.md) | :heavy_check_mark:                                                                                                                             | N/A                                                                                                                                            |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateDbaasPgConnectionPoolResponse>](../../models/operations/CreateDbaasPgConnectionPoolResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateDbaasServiceMysql

Update a DBaaS MySQL service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.EnumMigrationMethod;
import com.exoscale.api.models.components.InternalTmpMemStorageEngine;
import com.exoscale.api.models.components.JsonSchemaMysql;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.BackupSchedule;
import com.exoscale.api.models.operations.Dow;
import com.exoscale.api.models.operations.Maintenance;
import com.exoscale.api.models.operations.Migration;
import com.exoscale.api.models.operations.UpdateDbaasServiceMysqlRequest;
import com.exoscale.api.models.operations.UpdateDbaasServiceMysqlRequestBody;
import com.exoscale.api.models.operations.UpdateDbaasServiceMysqlResponse;
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

            UpdateDbaasServiceMysqlResponse res = sdk.dbaas().updateDbaasServiceMysql()
                .name("<value>")
                .requestBody(UpdateDbaasServiceMysqlRequestBody.builder()
                    .build())
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

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `name`                                                                                                                                 | *String*                                                                                                                               | :heavy_check_mark:                                                                                                                     | N/A                                                                                                                                    |
| `requestBody`                                                                                                                          | [com.exoscale.api.models.operations.UpdateDbaasServiceMysqlRequestBody](../../models/operations/UpdateDbaasServiceMysqlRequestBody.md) | :heavy_check_mark:                                                                                                                     | N/A                                                                                                                                    |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpdateDbaasServiceMysqlResponse>](../../models/operations/UpdateDbaasServiceMysqlResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDbaasServiceMysql

Get a DBaaS MySQL service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetDbaasServiceMysqlRequest;
import com.exoscale.api.models.operations.GetDbaasServiceMysqlResponse;
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

            GetDbaasServiceMysqlResponse res = sdk.dbaas().getDbaasServiceMysql()
                .name("<value>")
                .call();

            if (res.dbaasServiceMysql().isPresent()) {
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetDbaasServiceMysqlResponse>](../../models/operations/GetDbaasServiceMysqlResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createDbaasServiceMysql

Create a DBaaS MySQL service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.EnumMigrationMethod;
import com.exoscale.api.models.components.InternalTmpMemStorageEngine;
import com.exoscale.api.models.components.JsonSchemaMysql;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateDbaasServiceMysqlBackupSchedule;
import com.exoscale.api.models.operations.CreateDbaasServiceMysqlDow;
import com.exoscale.api.models.operations.CreateDbaasServiceMysqlMaintenance;
import com.exoscale.api.models.operations.CreateDbaasServiceMysqlMigration;
import com.exoscale.api.models.operations.CreateDbaasServiceMysqlRequest;
import com.exoscale.api.models.operations.CreateDbaasServiceMysqlRequestBody;
import com.exoscale.api.models.operations.CreateDbaasServiceMysqlResponse;
import com.exoscale.api.models.operations.Integrations;
import com.exoscale.api.models.operations.Settings;
import com.exoscale.api.models.operations.Type;
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

            CreateDbaasServiceMysqlResponse res = sdk.dbaas().createDbaasServiceMysql()
                .name("<value>")
                .requestBody(CreateDbaasServiceMysqlRequestBody.builder()
                    .plan("<value>")
                    .build())
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

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `name`                                                                                                                                 | *String*                                                                                                                               | :heavy_check_mark:                                                                                                                     | N/A                                                                                                                                    |
| `requestBody`                                                                                                                          | [com.exoscale.api.models.operations.CreateDbaasServiceMysqlRequestBody](../../models/operations/CreateDbaasServiceMysqlRequestBody.md) | :heavy_check_mark:                                                                                                                     | N/A                                                                                                                                    |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateDbaasServiceMysqlResponse>](../../models/operations/CreateDbaasServiceMysqlResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteDbaasServiceMysql

Delete a MySQL service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteDbaasServiceMysqlRequest;
import com.exoscale.api.models.operations.DeleteDbaasServiceMysqlResponse;
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

            DeleteDbaasServiceMysqlResponse res = sdk.dbaas().deleteDbaasServiceMysql()
                .name("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DeleteDbaasServiceMysqlResponse>](../../models/operations/DeleteDbaasServiceMysqlResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createDbaasMysqlUser

Create a DBaaS MySQL user

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.EnumMysqlAuthenticationPlugin;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateDbaasMysqlUserRequest;
import com.exoscale.api.models.operations.CreateDbaasMysqlUserRequestBody;
import com.exoscale.api.models.operations.CreateDbaasMysqlUserResponse;
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

            CreateDbaasMysqlUserResponse res = sdk.dbaas().createDbaasMysqlUser()
                .serviceName("<value>")
                .requestBody(CreateDbaasMysqlUserRequestBody.builder()
                    .username("<value>")
                    .build())
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

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `serviceName`                                                                                                                    | *String*                                                                                                                         | :heavy_check_mark:                                                                                                               | N/A                                                                                                                              |
| `requestBody`                                                                                                                    | [com.exoscale.api.models.operations.CreateDbaasMysqlUserRequestBody](../../models/operations/CreateDbaasMysqlUserRequestBody.md) | :heavy_check_mark:                                                                                                               | N/A                                                                                                                              |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateDbaasMysqlUserResponse>](../../models/operations/CreateDbaasMysqlUserResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listDbaasServiceTypes

List available service types for DBaaS

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListDbaasServiceTypesResponse;
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

            ListDbaasServiceTypesResponse res = sdk.dbaas().listDbaasServiceTypes()
                .call();

            if (res.object().isPresent()) {
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


### Response

**[Optional<? extends com.exoscale.api.models.operations.ListDbaasServiceTypesResponse>](../../models/operations/ListDbaasServiceTypesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listDbaasServices

List DBaaS services

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListDbaasServicesResponse;
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

            ListDbaasServicesResponse res = sdk.dbaas().listDbaasServices()
                .call();

            if (res.object().isPresent()) {
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


### Response

**[Optional<? extends com.exoscale.api.models.operations.ListDbaasServicesResponse>](../../models/operations/ListDbaasServicesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDbaasCaCertificate

Returns a CA Certificate required to reach a DBaaS service through a TLS-protected connection.

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetDbaasCaCertificateResponse;
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

            GetDbaasCaCertificateResponse res = sdk.dbaas().getDbaasCaCertificate()
                .call();

            if (res.object().isPresent()) {
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


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetDbaasCaCertificateResponse>](../../models/operations/GetDbaasCaCertificateResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDbaasSettingsGrafana

Get DBaaS Grafana settings

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetDbaasSettingsGrafanaResponse;
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

            GetDbaasSettingsGrafanaResponse res = sdk.dbaas().getDbaasSettingsGrafana()
                .call();

            if (res.object().isPresent()) {
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


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetDbaasSettingsGrafanaResponse>](../../models/operations/GetDbaasSettingsGrafanaResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteDbaasPgDatabase

Delete a DBaaS Postgres database

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteDbaasPgDatabaseRequest;
import com.exoscale.api.models.operations.DeleteDbaasPgDatabaseResponse;
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

            DeleteDbaasPgDatabaseResponse res = sdk.dbaas().deleteDbaasPgDatabase()
                .serviceName("<value>")
                .databaseName("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `serviceName`      | *String*           | :heavy_check_mark: | N/A                |
| `databaseName`     | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DeleteDbaasPgDatabaseResponse>](../../models/operations/DeleteDbaasPgDatabaseResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## stopDbaasPgMigration

Stop a DBaaS PostgreSQL migration

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.StopDbaasPgMigrationRequest;
import com.exoscale.api.models.operations.StopDbaasPgMigrationResponse;
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

            StopDbaasPgMigrationResponse res = sdk.dbaas().stopDbaasPgMigration()
                .name("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.StopDbaasPgMigrationResponse>](../../models/operations/StopDbaasPgMigrationResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDbaasServiceKafka

Get a DBaaS Kafka service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetDbaasServiceKafkaRequest;
import com.exoscale.api.models.operations.GetDbaasServiceKafkaResponse;
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

            GetDbaasServiceKafkaResponse res = sdk.dbaas().getDbaasServiceKafka()
                .name("<value>")
                .call();

            if (res.dbaasServiceKafka().isPresent()) {
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetDbaasServiceKafkaResponse>](../../models/operations/GetDbaasServiceKafkaResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createDbaasServiceKafka

Create a DBaaS Kafka service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.ClientConfigOverridePolicy;
import com.exoscale.api.models.components.CompressionType;
import com.exoscale.api.models.components.ConfigureLogCleanerForTopicCompaction;
import com.exoscale.api.models.components.ConsumerAutoOffsetReset;
import com.exoscale.api.models.components.ConsumerIsolationLevel;
import com.exoscale.api.models.components.ConsumerRequestTimeoutMs;
import com.exoscale.api.models.components.JsonSchemaKafka;
import com.exoscale.api.models.components.JsonSchemaKafkaConnect;
import com.exoscale.api.models.components.JsonSchemaKafkaRest;
import com.exoscale.api.models.components.JsonSchemaSchemaRegistry;
import com.exoscale.api.models.components.LogCleanupPolicy;
import com.exoscale.api.models.components.LogMessageTimestampType;
import com.exoscale.api.models.components.ProducerAcks;
import com.exoscale.api.models.components.ProducerCompressionType;
import com.exoscale.api.models.components.TheDefaultCompressionTypeForProducers;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.AuthenticationMethods;
import com.exoscale.api.models.operations.CreateDbaasServiceKafkaDow;
import com.exoscale.api.models.operations.CreateDbaasServiceKafkaMaintenance;
import com.exoscale.api.models.operations.CreateDbaasServiceKafkaRequest;
import com.exoscale.api.models.operations.CreateDbaasServiceKafkaRequestBody;
import com.exoscale.api.models.operations.CreateDbaasServiceKafkaResponse;
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

            CreateDbaasServiceKafkaResponse res = sdk.dbaas().createDbaasServiceKafka()
                .name("<value>")
                .requestBody(CreateDbaasServiceKafkaRequestBody.builder()
                    .plan("<value>")
                    .build())
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

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `name`                                                                                                                                 | *String*                                                                                                                               | :heavy_check_mark:                                                                                                                     | N/A                                                                                                                                    |
| `requestBody`                                                                                                                          | [com.exoscale.api.models.operations.CreateDbaasServiceKafkaRequestBody](../../models/operations/CreateDbaasServiceKafkaRequestBody.md) | :heavy_check_mark:                                                                                                                     | N/A                                                                                                                                    |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateDbaasServiceKafkaResponse>](../../models/operations/CreateDbaasServiceKafkaResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateDbaasServiceKafka

Update a DBaaS Kafka service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.ClientConfigOverridePolicy;
import com.exoscale.api.models.components.CompressionType;
import com.exoscale.api.models.components.ConfigureLogCleanerForTopicCompaction;
import com.exoscale.api.models.components.ConsumerAutoOffsetReset;
import com.exoscale.api.models.components.ConsumerIsolationLevel;
import com.exoscale.api.models.components.ConsumerRequestTimeoutMs;
import com.exoscale.api.models.components.JsonSchemaKafka;
import com.exoscale.api.models.components.JsonSchemaKafkaConnect;
import com.exoscale.api.models.components.JsonSchemaKafkaRest;
import com.exoscale.api.models.components.JsonSchemaSchemaRegistry;
import com.exoscale.api.models.components.LogCleanupPolicy;
import com.exoscale.api.models.components.LogMessageTimestampType;
import com.exoscale.api.models.components.ProducerAcks;
import com.exoscale.api.models.components.ProducerCompressionType;
import com.exoscale.api.models.components.TheDefaultCompressionTypeForProducers;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.UpdateDbaasServiceKafkaAuthenticationMethods;
import com.exoscale.api.models.operations.UpdateDbaasServiceKafkaDow;
import com.exoscale.api.models.operations.UpdateDbaasServiceKafkaMaintenance;
import com.exoscale.api.models.operations.UpdateDbaasServiceKafkaRequest;
import com.exoscale.api.models.operations.UpdateDbaasServiceKafkaRequestBody;
import com.exoscale.api.models.operations.UpdateDbaasServiceKafkaResponse;
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

            UpdateDbaasServiceKafkaResponse res = sdk.dbaas().updateDbaasServiceKafka()
                .name("<value>")
                .requestBody(UpdateDbaasServiceKafkaRequestBody.builder()
                    .build())
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

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `name`                                                                                                                                 | *String*                                                                                                                               | :heavy_check_mark:                                                                                                                     | N/A                                                                                                                                    |
| `requestBody`                                                                                                                          | [com.exoscale.api.models.operations.UpdateDbaasServiceKafkaRequestBody](../../models/operations/UpdateDbaasServiceKafkaRequestBody.md) | :heavy_check_mark:                                                                                                                     | N/A                                                                                                                                    |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpdateDbaasServiceKafkaResponse>](../../models/operations/UpdateDbaasServiceKafkaResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteDbaasServiceKafka

Delete a Kafka service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteDbaasServiceKafkaRequest;
import com.exoscale.api.models.operations.DeleteDbaasServiceKafkaResponse;
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

            DeleteDbaasServiceKafkaResponse res = sdk.dbaas().deleteDbaasServiceKafka()
                .name("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DeleteDbaasServiceKafkaResponse>](../../models/operations/DeleteDbaasServiceKafkaResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDbaasSettingsRedis

Returns the default settings for Redis.

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetDbaasSettingsRedisResponse;
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

            GetDbaasSettingsRedisResponse res = sdk.dbaas().getDbaasSettingsRedis()
                .call();

            if (res.object().isPresent()) {
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


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetDbaasSettingsRedisResponse>](../../models/operations/GetDbaasSettingsRedisResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createDbaasKafkaSchemaRegistryAclConfig

Add a Kafka Schema Registry ACL entry

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.DbaasKafkaSchemaRegistryAclEntry;
import com.exoscale.api.models.components.Permission;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateDbaasKafkaSchemaRegistryAclConfigRequest;
import com.exoscale.api.models.operations.CreateDbaasKafkaSchemaRegistryAclConfigResponse;
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

            CreateDbaasKafkaSchemaRegistryAclConfigResponse res = sdk.dbaas().createDbaasKafkaSchemaRegistryAclConfig()
                .name("<value>")
                .dbaasKafkaSchemaRegistryAclEntry(DbaasKafkaSchemaRegistryAclEntry.builder()
                    .username("<value>")
                    .resource("<value>")
                    .permission(Permission.SCHEMA_REGISTRY_WRITE)
                    .build())
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

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `name`                                                                                                                             | *String*                                                                                                                           | :heavy_check_mark:                                                                                                                 | N/A                                                                                                                                |
| `dbaasKafkaSchemaRegistryAclEntry`                                                                                                 | [com.exoscale.api.models.components.DbaasKafkaSchemaRegistryAclEntry](../../models/components/DbaasKafkaSchemaRegistryAclEntry.md) | :heavy_check_mark:                                                                                                                 | N/A                                                                                                                                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateDbaasKafkaSchemaRegistryAclConfigResponse>](../../models/operations/CreateDbaasKafkaSchemaRegistryAclConfigResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createDbaasPostgresUser

Create a DBaaS Postgres user

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateDbaasPostgresUserRequest;
import com.exoscale.api.models.operations.CreateDbaasPostgresUserRequestBody;
import com.exoscale.api.models.operations.CreateDbaasPostgresUserResponse;
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

            CreateDbaasPostgresUserResponse res = sdk.dbaas().createDbaasPostgresUser()
                .serviceName("<value>")
                .requestBody(CreateDbaasPostgresUserRequestBody.builder()
                    .username("<value>")
                    .build())
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

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `serviceName`                                                                                                                          | *String*                                                                                                                               | :heavy_check_mark:                                                                                                                     | N/A                                                                                                                                    |
| `requestBody`                                                                                                                          | [com.exoscale.api.models.operations.CreateDbaasPostgresUserRequestBody](../../models/operations/CreateDbaasPostgresUserRequestBody.md) | :heavy_check_mark:                                                                                                                     | N/A                                                                                                                                    |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateDbaasPostgresUserResponse>](../../models/operations/CreateDbaasPostgresUserResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteDbaasOpensearchUser

Delete a DBaaS OpenSearch user

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteDbaasOpensearchUserRequest;
import com.exoscale.api.models.operations.DeleteDbaasOpensearchUserResponse;
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

            DeleteDbaasOpensearchUserResponse res = sdk.dbaas().deleteDbaasOpensearchUser()
                .serviceName("<value>")
                .username("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `serviceName`      | *String*           | :heavy_check_mark: | N/A                |
| `username`         | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DeleteDbaasOpensearchUserResponse>](../../models/operations/DeleteDbaasOpensearchUserResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createDbaasKafkaUser

Create a DBaaS Kafka user

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateDbaasKafkaUserRequest;
import com.exoscale.api.models.operations.CreateDbaasKafkaUserRequestBody;
import com.exoscale.api.models.operations.CreateDbaasKafkaUserResponse;
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

            CreateDbaasKafkaUserResponse res = sdk.dbaas().createDbaasKafkaUser()
                .serviceName("<value>")
                .requestBody(CreateDbaasKafkaUserRequestBody.builder()
                    .username("<value>")
                    .build())
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

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `serviceName`                                                                                                                    | *String*                                                                                                                         | :heavy_check_mark:                                                                                                               | N/A                                                                                                                              |
| `requestBody`                                                                                                                    | [com.exoscale.api.models.operations.CreateDbaasKafkaUserRequestBody](../../models/operations/CreateDbaasKafkaUserRequestBody.md) | :heavy_check_mark:                                                                                                               | N/A                                                                                                                              |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateDbaasKafkaUserResponse>](../../models/operations/CreateDbaasKafkaUserResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDbaasSettingsMysql

Get DBaaS MySQL settings

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetDbaasSettingsMysqlResponse;
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

            GetDbaasSettingsMysqlResponse res = sdk.dbaas().getDbaasSettingsMysql()
                .call();

            if (res.object().isPresent()) {
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


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetDbaasSettingsMysqlResponse>](../../models/operations/GetDbaasSettingsMysqlResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createDbaasPgDatabase

Create a DBaaS Postgres database

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateDbaasPgDatabaseRequest;
import com.exoscale.api.models.operations.CreateDbaasPgDatabaseRequestBody;
import com.exoscale.api.models.operations.CreateDbaasPgDatabaseResponse;
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

            CreateDbaasPgDatabaseResponse res = sdk.dbaas().createDbaasPgDatabase()
                .serviceName("<value>")
                .requestBody(CreateDbaasPgDatabaseRequestBody.builder()
                    .databaseName("<value>")
                    .build())
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

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `serviceName`                                                                                                                      | *String*                                                                                                                           | :heavy_check_mark:                                                                                                                 | N/A                                                                                                                                |
| `requestBody`                                                                                                                      | [com.exoscale.api.models.operations.CreateDbaasPgDatabaseRequestBody](../../models/operations/CreateDbaasPgDatabaseRequestBody.md) | :heavy_check_mark:                                                                                                                 | N/A                                                                                                                                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateDbaasPgDatabaseResponse>](../../models/operations/CreateDbaasPgDatabaseResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createDbaasOpensearchUser

Create a DBaaS OpenSearch user

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateDbaasOpensearchUserRequest;
import com.exoscale.api.models.operations.CreateDbaasOpensearchUserRequestBody;
import com.exoscale.api.models.operations.CreateDbaasOpensearchUserResponse;
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

            CreateDbaasOpensearchUserResponse res = sdk.dbaas().createDbaasOpensearchUser()
                .serviceName("<value>")
                .requestBody(CreateDbaasOpensearchUserRequestBody.builder()
                    .username("<value>")
                    .build())
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

### Parameters

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `serviceName`                                                                                                                              | *String*                                                                                                                                   | :heavy_check_mark:                                                                                                                         | N/A                                                                                                                                        |
| `requestBody`                                                                                                                              | [com.exoscale.api.models.operations.CreateDbaasOpensearchUserRequestBody](../../models/operations/CreateDbaasOpensearchUserRequestBody.md) | :heavy_check_mark:                                                                                                                         | N/A                                                                                                                                        |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateDbaasOpensearchUserResponse>](../../models/operations/CreateDbaasOpensearchUserResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listDbaasIntegrationTypes

Get DBaaS integration types

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListDbaasIntegrationTypesResponse;
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

            ListDbaasIntegrationTypesResponse res = sdk.dbaas().listDbaasIntegrationTypes()
                .call();

            if (res.object().isPresent()) {
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


### Response

**[Optional<? extends com.exoscale.api.models.operations.ListDbaasIntegrationTypesResponse>](../../models/operations/ListDbaasIntegrationTypesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteDbaasPostgresUser

Delete a DBaaS Postgres user

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteDbaasPostgresUserRequest;
import com.exoscale.api.models.operations.DeleteDbaasPostgresUserResponse;
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

            DeleteDbaasPostgresUserResponse res = sdk.dbaas().deleteDbaasPostgresUser()
                .serviceName("<value>")
                .username("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `serviceName`      | *String*           | :heavy_check_mark: | N/A                |
| `username`         | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DeleteDbaasPostgresUserResponse>](../../models/operations/DeleteDbaasPostgresUserResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateDbaasPostgresAllowReplication

Update access control for one service user

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.UpdateDbaasPostgresAllowReplicationRequest;
import com.exoscale.api.models.operations.UpdateDbaasPostgresAllowReplicationRequestBody;
import com.exoscale.api.models.operations.UpdateDbaasPostgresAllowReplicationResponse;
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

            UpdateDbaasPostgresAllowReplicationResponse res = sdk.dbaas().updateDbaasPostgresAllowReplication()
                .serviceName("<value>")
                .username("<value>")
                .requestBody(UpdateDbaasPostgresAllowReplicationRequestBody.builder()
                    .build())
                .call();

            if (res.dbaasPostgresUsers().isPresent()) {
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

### Parameters

| Parameter                                                                                                                                                      | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `serviceName`                                                                                                                                                  | *String*                                                                                                                                                       | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            |
| `username`                                                                                                                                                     | *String*                                                                                                                                                       | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            |
| `requestBody`                                                                                                                                                  | [com.exoscale.api.models.operations.UpdateDbaasPostgresAllowReplicationRequestBody](../../models/operations/UpdateDbaasPostgresAllowReplicationRequestBody.md) | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpdateDbaasPostgresAllowReplicationResponse>](../../models/operations/UpdateDbaasPostgresAllowReplicationResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createDbaasKafkaTopicAclConfig

Add a Kafka topic ACL entry

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.DbaasKafkaTopicAclEntry;
import com.exoscale.api.models.components.DbaasKafkaTopicAclEntryPermission;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateDbaasKafkaTopicAclConfigRequest;
import com.exoscale.api.models.operations.CreateDbaasKafkaTopicAclConfigResponse;
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

            CreateDbaasKafkaTopicAclConfigResponse res = sdk.dbaas().createDbaasKafkaTopicAclConfig()
                .name("<value>")
                .dbaasKafkaTopicAclEntry(DbaasKafkaTopicAclEntry.builder()
                    .username("<value>")
                    .topic("<value>")
                    .permission(DbaasKafkaTopicAclEntryPermission.READ)
                    .build())
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

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `name`                                                                                                           | *String*                                                                                                         | :heavy_check_mark:                                                                                               | N/A                                                                                                              |
| `dbaasKafkaTopicAclEntry`                                                                                        | [com.exoscale.api.models.components.DbaasKafkaTopicAclEntry](../../models/components/DbaasKafkaTopicAclEntry.md) | :heavy_check_mark:                                                                                               | N/A                                                                                                              |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateDbaasKafkaTopicAclConfigResponse>](../../models/operations/CreateDbaasKafkaTopicAclConfigResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteDbaasMysqlDatabase

Delete a DBaaS MySQL database

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteDbaasMysqlDatabaseRequest;
import com.exoscale.api.models.operations.DeleteDbaasMysqlDatabaseResponse;
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

            DeleteDbaasMysqlDatabaseResponse res = sdk.dbaas().deleteDbaasMysqlDatabase()
                .serviceName("<value>")
                .databaseName("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `serviceName`      | *String*           | :heavy_check_mark: | N/A                |
| `databaseName`     | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DeleteDbaasMysqlDatabaseResponse>](../../models/operations/DeleteDbaasMysqlDatabaseResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDbaasServiceLogs

Get logs of DBaaS service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.EnumSortOrder;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetDbaasServiceLogsRequest;
import com.exoscale.api.models.operations.GetDbaasServiceLogsRequestBody;
import com.exoscale.api.models.operations.GetDbaasServiceLogsResponse;
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

            GetDbaasServiceLogsResponse res = sdk.dbaas().getDbaasServiceLogs()
                .serviceName("<value>")
                .requestBody(GetDbaasServiceLogsRequestBody.builder()
                    .build())
                .call();

            if (res.dbaasServiceLogs().isPresent()) {
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

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `serviceName`                                                                                                                  | *String*                                                                                                                       | :heavy_check_mark:                                                                                                             | N/A                                                                                                                            |
| `requestBody`                                                                                                                  | [com.exoscale.api.models.operations.GetDbaasServiceLogsRequestBody](../../models/operations/GetDbaasServiceLogsRequestBody.md) | :heavy_check_mark:                                                                                                             | N/A                                                                                                                            |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetDbaasServiceLogsResponse>](../../models/operations/GetDbaasServiceLogsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## startDbaasPgMaintenance

Initiate PostgreSQL maintenance update

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.StartDbaasPgMaintenanceRequest;
import com.exoscale.api.models.operations.StartDbaasPgMaintenanceResponse;
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

            StartDbaasPgMaintenanceResponse res = sdk.dbaas().startDbaasPgMaintenance()
                .name("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.StartDbaasPgMaintenanceResponse>](../../models/operations/StartDbaasPgMaintenanceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteDbaasKafkaSchemaRegistryAclConfig

Delete a Kafka ACL entry

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteDbaasKafkaSchemaRegistryAclConfigRequest;
import com.exoscale.api.models.operations.DeleteDbaasKafkaSchemaRegistryAclConfigResponse;
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

            DeleteDbaasKafkaSchemaRegistryAclConfigResponse res = sdk.dbaas().deleteDbaasKafkaSchemaRegistryAclConfig()
                .name("<value>")
                .aclId("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |
| `aclId`            | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DeleteDbaasKafkaSchemaRegistryAclConfigResponse>](../../models/operations/DeleteDbaasKafkaSchemaRegistryAclConfigResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteDbaasKafkaUser

Delete a DBaaS kafka user

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteDbaasKafkaUserRequest;
import com.exoscale.api.models.operations.DeleteDbaasKafkaUserResponse;
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

            DeleteDbaasKafkaUserResponse res = sdk.dbaas().deleteDbaasKafkaUser()
                .serviceName("<value>")
                .username("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `serviceName`      | *String*           | :heavy_check_mark: | N/A                |
| `username`         | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DeleteDbaasKafkaUserResponse>](../../models/operations/DeleteDbaasKafkaUserResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDbaasServiceType

Get a DBaaS service type

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetDbaasServiceTypeRequest;
import com.exoscale.api.models.operations.GetDbaasServiceTypeResponse;
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

            GetDbaasServiceTypeResponse res = sdk.dbaas().getDbaasServiceType()
                .serviceTypeName("<value>")
                .call();

            if (res.dbaasServiceType().isPresent()) {
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `serviceTypeName`  | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetDbaasServiceTypeResponse>](../../models/operations/GetDbaasServiceTypeResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## startDbaasMysqlMaintenance

Initiate MySQL maintenance update

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.StartDbaasMysqlMaintenanceRequest;
import com.exoscale.api.models.operations.StartDbaasMysqlMaintenanceResponse;
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

            StartDbaasMysqlMaintenanceResponse res = sdk.dbaas().startDbaasMysqlMaintenance()
                .name("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.StartDbaasMysqlMaintenanceResponse>](../../models/operations/StartDbaasMysqlMaintenanceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## resetDbaasOpensearchUserPassword

If no password is provided one will be generated automatically.

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ResetDbaasOpensearchUserPasswordRequest;
import com.exoscale.api.models.operations.ResetDbaasOpensearchUserPasswordRequestBody;
import com.exoscale.api.models.operations.ResetDbaasOpensearchUserPasswordResponse;
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

            ResetDbaasOpensearchUserPasswordResponse res = sdk.dbaas().resetDbaasOpensearchUserPassword()
                .serviceName("<value>")
                .username("<value>")
                .requestBody(ResetDbaasOpensearchUserPasswordRequestBody.builder()
                    .build())
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

### Parameters

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `serviceName`                                                                                                                                            | *String*                                                                                                                                                 | :heavy_check_mark:                                                                                                                                       | N/A                                                                                                                                                      |
| `username`                                                                                                                                               | *String*                                                                                                                                                 | :heavy_check_mark:                                                                                                                                       | N/A                                                                                                                                                      |
| `requestBody`                                                                                                                                            | [com.exoscale.api.models.operations.ResetDbaasOpensearchUserPasswordRequestBody](../../models/operations/ResetDbaasOpensearchUserPasswordRequestBody.md) | :heavy_check_mark:                                                                                                                                       | N/A                                                                                                                                                      |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ResetDbaasOpensearchUserPasswordResponse>](../../models/operations/ResetDbaasOpensearchUserPasswordResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDbaasServiceMetrics

Get metrics of DBaaS service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetDbaasServiceMetricsRequest;
import com.exoscale.api.models.operations.GetDbaasServiceMetricsRequestBody;
import com.exoscale.api.models.operations.GetDbaasServiceMetricsResponse;
import com.exoscale.api.models.operations.Period;
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

            GetDbaasServiceMetricsResponse res = sdk.dbaas().getDbaasServiceMetrics()
                .serviceName("<value>")
                .requestBody(GetDbaasServiceMetricsRequestBody.builder()
                    .build())
                .call();

            if (res.object().isPresent()) {
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

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `serviceName`                                                                                                                        | *String*                                                                                                                             | :heavy_check_mark:                                                                                                                   | N/A                                                                                                                                  |
| `requestBody`                                                                                                                        | [com.exoscale.api.models.operations.GetDbaasServiceMetricsRequestBody](../../models/operations/GetDbaasServiceMetricsRequestBody.md) | :heavy_check_mark:                                                                                                                   | N/A                                                                                                                                  |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetDbaasServiceMetricsResponse>](../../models/operations/GetDbaasServiceMetricsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createDbaasTaskMigrationCheck

Create a DBaaS task to check migration

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.EnumMigrationMethod;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateDbaasTaskMigrationCheckRequest;
import com.exoscale.api.models.operations.CreateDbaasTaskMigrationCheckRequestBody;
import com.exoscale.api.models.operations.CreateDbaasTaskMigrationCheckResponse;
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

            CreateDbaasTaskMigrationCheckResponse res = sdk.dbaas().createDbaasTaskMigrationCheck()
                .service("<value>")
                .requestBody(CreateDbaasTaskMigrationCheckRequestBody.builder()
                    .sourceServiceUri("<value>")
                    .build())
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

### Parameters

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `service`                                                                                                                                          | *String*                                                                                                                                           | :heavy_check_mark:                                                                                                                                 | N/A                                                                                                                                                |
| `requestBody`                                                                                                                                      | [com.exoscale.api.models.operations.CreateDbaasTaskMigrationCheckRequestBody](../../models/operations/CreateDbaasTaskMigrationCheckRequestBody.md) | :heavy_check_mark:                                                                                                                                 | N/A                                                                                                                                                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateDbaasTaskMigrationCheckResponse>](../../models/operations/CreateDbaasTaskMigrationCheckResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteDbaasIntegration

Delete a DBaaS Integration

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteDbaasIntegrationRequest;
import com.exoscale.api.models.operations.DeleteDbaasIntegrationResponse;
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

            DeleteDbaasIntegrationResponse res = sdk.dbaas().deleteDbaasIntegration()
                .id("c4611d7b-4dc2-408d-819b-9fa1021bb8ff")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `id`               | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DeleteDbaasIntegrationResponse>](../../models/operations/DeleteDbaasIntegrationResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateDbaasIntegration

Update a existing DBaaS integration

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.UpdateDbaasIntegrationRequest;
import com.exoscale.api.models.operations.UpdateDbaasIntegrationRequestBody;
import com.exoscale.api.models.operations.UpdateDbaasIntegrationResponse;
import com.exoscale.api.models.operations.UpdateDbaasIntegrationSettings;
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

            UpdateDbaasIntegrationResponse res = sdk.dbaas().updateDbaasIntegration()
                .id("f6047037-9843-404e-8651-93009f98fdde")
                .requestBody(UpdateDbaasIntegrationRequestBody.builder()
                    .settings(UpdateDbaasIntegrationSettings.builder()
                            .build())
                    .build())
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

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                                                 | *String*                                                                                                                             | :heavy_check_mark:                                                                                                                   | N/A                                                                                                                                  |
| `requestBody`                                                                                                                        | [com.exoscale.api.models.operations.UpdateDbaasIntegrationRequestBody](../../models/operations/UpdateDbaasIntegrationRequestBody.md) | :heavy_check_mark:                                                                                                                   | N/A                                                                                                                                  |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpdateDbaasIntegrationResponse>](../../models/operations/UpdateDbaasIntegrationResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDbaasIntegration

Get a DBaaS Integration

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetDbaasIntegrationRequest;
import com.exoscale.api.models.operations.GetDbaasIntegrationResponse;
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

            GetDbaasIntegrationResponse res = sdk.dbaas().getDbaasIntegration()
                .id("8183519a-2b40-403e-acf9-38b2d4fa1d31")
                .call();

            if (res.dbaasIntegration().isPresent()) {
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `id`               | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetDbaasIntegrationResponse>](../../models/operations/GetDbaasIntegrationResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listDbaasIntegrationSettings

Get DBaaS integration settings

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListDbaasIntegrationSettingsRequest;
import com.exoscale.api.models.operations.ListDbaasIntegrationSettingsResponse;
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

            ListDbaasIntegrationSettingsResponse res = sdk.dbaas().listDbaasIntegrationSettings()
                .integrationType("<value>")
                .sourceType("<value>")
                .destType("<value>")
                .call();

            if (res.object().isPresent()) {
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `integrationType`  | *String*           | :heavy_check_mark: | N/A                |
| `sourceType`       | *String*           | :heavy_check_mark: | N/A                |
| `destType`         | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ListDbaasIntegrationSettingsResponse>](../../models/operations/ListDbaasIntegrationSettingsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDbaasSettingsPg

Get DBaaS PostgreSQL settings

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetDbaasSettingsPgResponse;
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

            GetDbaasSettingsPgResponse res = sdk.dbaas().getDbaasSettingsPg()
                .call();

            if (res.object().isPresent()) {
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


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetDbaasSettingsPgResponse>](../../models/operations/GetDbaasSettingsPgResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## stopDbaasRedisMigration

Stop a DBaaS Redis migration

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.StopDbaasRedisMigrationRequest;
import com.exoscale.api.models.operations.StopDbaasRedisMigrationResponse;
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

            StopDbaasRedisMigrationResponse res = sdk.dbaas().stopDbaasRedisMigration()
                .name("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.StopDbaasRedisMigrationResponse>](../../models/operations/StopDbaasRedisMigrationResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## stopDbaasMysqlMigration

Stop a DBaaS MySQL migration

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.StopDbaasMysqlMigrationRequest;
import com.exoscale.api.models.operations.StopDbaasMysqlMigrationResponse;
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

            StopDbaasMysqlMigrationResponse res = sdk.dbaas().stopDbaasMysqlMigration()
                .name("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.StopDbaasMysqlMigrationResponse>](../../models/operations/StopDbaasMysqlMigrationResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## startDbaasKafkaMaintenance

Initiate Kafka maintenance update

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.StartDbaasKafkaMaintenanceRequest;
import com.exoscale.api.models.operations.StartDbaasKafkaMaintenanceResponse;
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

            StartDbaasKafkaMaintenanceResponse res = sdk.dbaas().startDbaasKafkaMaintenance()
                .name("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.StartDbaasKafkaMaintenanceResponse>](../../models/operations/StartDbaasKafkaMaintenanceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateDbaasPgConnectionPool

Update a DBaaS PostgreSQL connection pool

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.EnumPgPoolMode;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.UpdateDbaasPgConnectionPoolRequest;
import com.exoscale.api.models.operations.UpdateDbaasPgConnectionPoolRequestBody;
import com.exoscale.api.models.operations.UpdateDbaasPgConnectionPoolResponse;
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

            UpdateDbaasPgConnectionPoolResponse res = sdk.dbaas().updateDbaasPgConnectionPool()
                .serviceName("<value>")
                .connectionPoolName("<value>")
                .requestBody(UpdateDbaasPgConnectionPoolRequestBody.builder()
                    .build())
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

### Parameters

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `serviceName`                                                                                                                                  | *String*                                                                                                                                       | :heavy_check_mark:                                                                                                                             | N/A                                                                                                                                            |
| `connectionPoolName`                                                                                                                           | *String*                                                                                                                                       | :heavy_check_mark:                                                                                                                             | N/A                                                                                                                                            |
| `requestBody`                                                                                                                                  | [com.exoscale.api.models.operations.UpdateDbaasPgConnectionPoolRequestBody](../../models/operations/UpdateDbaasPgConnectionPoolRequestBody.md) | :heavy_check_mark:                                                                                                                             | N/A                                                                                                                                            |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpdateDbaasPgConnectionPoolResponse>](../../models/operations/UpdateDbaasPgConnectionPoolResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteDbaasPgConnectionPool

Delete a DBaaS PostgreSQL connection pool

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteDbaasPgConnectionPoolRequest;
import com.exoscale.api.models.operations.DeleteDbaasPgConnectionPoolResponse;
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

            DeleteDbaasPgConnectionPoolResponse res = sdk.dbaas().deleteDbaasPgConnectionPool()
                .serviceName("<value>")
                .connectionPoolName("<value>")
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

### Parameters

| Parameter            | Type                 | Required             | Description          |
| -------------------- | -------------------- | -------------------- | -------------------- |
| `serviceName`        | *String*             | :heavy_check_mark:   | N/A                  |
| `connectionPoolName` | *String*             | :heavy_check_mark:   | N/A                  |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DeleteDbaasPgConnectionPoolResponse>](../../models/operations/DeleteDbaasPgConnectionPoolResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDbaasMigrationStatus

Get a DBaaS migration status

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetDbaasMigrationStatusRequest;
import com.exoscale.api.models.operations.GetDbaasMigrationStatusResponse;
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

            GetDbaasMigrationStatusResponse res = sdk.dbaas().getDbaasMigrationStatus()
                .name("<value>")
                .call();

            if (res.dbaasMigrationStatus().isPresent()) {
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetDbaasMigrationStatusResponse>](../../models/operations/GetDbaasMigrationStatusResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteDbaasMysqlUser

Delete a DBaaS MySQL user

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteDbaasMysqlUserRequest;
import com.exoscale.api.models.operations.DeleteDbaasMysqlUserResponse;
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

            DeleteDbaasMysqlUserResponse res = sdk.dbaas().deleteDbaasMysqlUser()
                .serviceName("<value>")
                .username("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `serviceName`      | *String*           | :heavy_check_mark: | N/A                |
| `username`         | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DeleteDbaasMysqlUserResponse>](../../models/operations/DeleteDbaasMysqlUserResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteDbaasService

Delete a DBaaS service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteDbaasServiceRequest;
import com.exoscale.api.models.operations.DeleteDbaasServiceResponse;
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

            DeleteDbaasServiceResponse res = sdk.dbaas().deleteDbaasService()
                .name("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DeleteDbaasServiceResponse>](../../models/operations/DeleteDbaasServiceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createDbaasMysqlDatabase

Create a DBaaS MySQL database

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateDbaasMysqlDatabaseRequest;
import com.exoscale.api.models.operations.CreateDbaasMysqlDatabaseRequestBody;
import com.exoscale.api.models.operations.CreateDbaasMysqlDatabaseResponse;
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

            CreateDbaasMysqlDatabaseResponse res = sdk.dbaas().createDbaasMysqlDatabase()
                .serviceName("<value>")
                .requestBody(CreateDbaasMysqlDatabaseRequestBody.builder()
                    .databaseName("<value>")
                    .build())
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

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `serviceName`                                                                                                                            | *String*                                                                                                                                 | :heavy_check_mark:                                                                                                                       | N/A                                                                                                                                      |
| `requestBody`                                                                                                                            | [com.exoscale.api.models.operations.CreateDbaasMysqlDatabaseRequestBody](../../models/operations/CreateDbaasMysqlDatabaseRequestBody.md) | :heavy_check_mark:                                                                                                                       | N/A                                                                                                                                      |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateDbaasMysqlDatabaseResponse>](../../models/operations/CreateDbaasMysqlDatabaseResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDbaasSettingsKafka

Get DBaaS Kafka settings

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetDbaasSettingsKafkaResponse;
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

            GetDbaasSettingsKafkaResponse res = sdk.dbaas().getDbaasSettingsKafka()
                .call();

            if (res.object().isPresent()) {
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


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetDbaasSettingsKafkaResponse>](../../models/operations/GetDbaasSettingsKafkaResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDbaasSettingsOpensearch

Get DBaaS OpenSearch settings

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetDbaasSettingsOpensearchResponse;
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

            GetDbaasSettingsOpensearchResponse res = sdk.dbaas().getDbaasSettingsOpensearch()
                .call();

            if (res.object().isPresent()) {
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


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetDbaasSettingsOpensearchResponse>](../../models/operations/GetDbaasSettingsOpensearchResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteDbaasServiceGrafana

Delete a Grafana service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteDbaasServiceGrafanaRequest;
import com.exoscale.api.models.operations.DeleteDbaasServiceGrafanaResponse;
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

            DeleteDbaasServiceGrafanaResponse res = sdk.dbaas().deleteDbaasServiceGrafana()
                .name("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DeleteDbaasServiceGrafanaResponse>](../../models/operations/DeleteDbaasServiceGrafanaResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDbaasServiceGrafana

Get a DBaaS Grafana service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetDbaasServiceGrafanaRequest;
import com.exoscale.api.models.operations.GetDbaasServiceGrafanaResponse;
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

            GetDbaasServiceGrafanaResponse res = sdk.dbaas().getDbaasServiceGrafana()
                .name("<value>")
                .call();

            if (res.dbaasServiceGrafana().isPresent()) {
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetDbaasServiceGrafanaResponse>](../../models/operations/GetDbaasServiceGrafanaResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateDbaasServiceGrafana

Update a DBaaS Grafana service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.AllowAccessToSelectedServiceComponentsThroughPrivatelink;
import com.exoscale.api.models.components.AzureADOAuthIntegration;
import com.exoscale.api.models.components.CookieSameSiteAttributeStrictPreventsSendingCookieForCrossSiteRequestsEffectivelyDisablingDirectLinkingFromOtherSitesToGrafanaLaxIsTheDefaultValue;
import com.exoscale.api.models.components.DefaultErrorOrTimeoutSettingForNewAlertingRules;
import com.exoscale.api.models.components.DefaultValueForNoDataOrNullValuesForNewAlertingRules;
import com.exoscale.api.models.components.EitherOpportunisticStartTLSMandatoryStartTLSOrNoStartTLSDefaultIsOpportunisticStartTLS;
import com.exoscale.api.models.components.GenericOAuthIntegration;
import com.exoscale.api.models.components.GitLabAuthIntegration;
import com.exoscale.api.models.components.GithubAuthIntegration;
import com.exoscale.api.models.components.GoogleAuthIntegration;
import com.exoscale.api.models.components.GrafanaDateFormatSpecifications;
import com.exoscale.api.models.components.JsonSchemaGrafana;
import com.exoscale.api.models.components.SMTPServerSettings;
import com.exoscale.api.models.components.SetRoleForNewSignupsDefaultsToViewer;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.UpdateDbaasServiceGrafanaDow;
import com.exoscale.api.models.operations.UpdateDbaasServiceGrafanaMaintenance;
import com.exoscale.api.models.operations.UpdateDbaasServiceGrafanaRequest;
import com.exoscale.api.models.operations.UpdateDbaasServiceGrafanaRequestBody;
import com.exoscale.api.models.operations.UpdateDbaasServiceGrafanaResponse;
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

            UpdateDbaasServiceGrafanaResponse res = sdk.dbaas().updateDbaasServiceGrafana()
                .name("<value>")
                .requestBody(UpdateDbaasServiceGrafanaRequestBody.builder()
                    .build())
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

### Parameters

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `name`                                                                                                                                     | *String*                                                                                                                                   | :heavy_check_mark:                                                                                                                         | N/A                                                                                                                                        |
| `requestBody`                                                                                                                              | [com.exoscale.api.models.operations.UpdateDbaasServiceGrafanaRequestBody](../../models/operations/UpdateDbaasServiceGrafanaRequestBody.md) | :heavy_check_mark:                                                                                                                         | N/A                                                                                                                                        |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpdateDbaasServiceGrafanaResponse>](../../models/operations/UpdateDbaasServiceGrafanaResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createDbaasServiceGrafana

Create a DBaaS Grafana service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.AllowAccessToSelectedServiceComponentsThroughPrivatelink;
import com.exoscale.api.models.components.AzureADOAuthIntegration;
import com.exoscale.api.models.components.CookieSameSiteAttributeStrictPreventsSendingCookieForCrossSiteRequestsEffectivelyDisablingDirectLinkingFromOtherSitesToGrafanaLaxIsTheDefaultValue;
import com.exoscale.api.models.components.DefaultErrorOrTimeoutSettingForNewAlertingRules;
import com.exoscale.api.models.components.DefaultValueForNoDataOrNullValuesForNewAlertingRules;
import com.exoscale.api.models.components.EitherOpportunisticStartTLSMandatoryStartTLSOrNoStartTLSDefaultIsOpportunisticStartTLS;
import com.exoscale.api.models.components.GenericOAuthIntegration;
import com.exoscale.api.models.components.GitLabAuthIntegration;
import com.exoscale.api.models.components.GithubAuthIntegration;
import com.exoscale.api.models.components.GoogleAuthIntegration;
import com.exoscale.api.models.components.GrafanaDateFormatSpecifications;
import com.exoscale.api.models.components.JsonSchemaGrafana;
import com.exoscale.api.models.components.SMTPServerSettings;
import com.exoscale.api.models.components.SetRoleForNewSignupsDefaultsToViewer;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateDbaasServiceGrafanaDow;
import com.exoscale.api.models.operations.CreateDbaasServiceGrafanaMaintenance;
import com.exoscale.api.models.operations.CreateDbaasServiceGrafanaRequest;
import com.exoscale.api.models.operations.CreateDbaasServiceGrafanaRequestBody;
import com.exoscale.api.models.operations.CreateDbaasServiceGrafanaResponse;
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

            CreateDbaasServiceGrafanaResponse res = sdk.dbaas().createDbaasServiceGrafana()
                .name("<value>")
                .requestBody(CreateDbaasServiceGrafanaRequestBody.builder()
                    .plan("<value>")
                    .build())
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

### Parameters

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `name`                                                                                                                                     | *String*                                                                                                                                   | :heavy_check_mark:                                                                                                                         | N/A                                                                                                                                        |
| `requestBody`                                                                                                                              | [com.exoscale.api.models.operations.CreateDbaasServiceGrafanaRequestBody](../../models/operations/CreateDbaasServiceGrafanaRequestBody.md) | :heavy_check_mark:                                                                                                                         | N/A                                                                                                                                        |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateDbaasServiceGrafanaResponse>](../../models/operations/CreateDbaasServiceGrafanaResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## startDbaasOpensearchMaintenance

Initiate OpenSearch maintenance update

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.StartDbaasOpensearchMaintenanceRequest;
import com.exoscale.api.models.operations.StartDbaasOpensearchMaintenanceResponse;
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

            StartDbaasOpensearchMaintenanceResponse res = sdk.dbaas().startDbaasOpensearchMaintenance()
                .name("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.StartDbaasOpensearchMaintenanceResponse>](../../models/operations/StartDbaasOpensearchMaintenanceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDbaasKafkaAclConfig

Get DBaaS kafka ACL configuration

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetDbaasKafkaAclConfigRequest;
import com.exoscale.api.models.operations.GetDbaasKafkaAclConfigResponse;
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

            GetDbaasKafkaAclConfigResponse res = sdk.dbaas().getDbaasKafkaAclConfig()
                .name("<value>")
                .call();

            if (res.dbaasKafkaAcls().isPresent()) {
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetDbaasKafkaAclConfigResponse>](../../models/operations/GetDbaasKafkaAclConfigResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## resetDbaasKafkaUserPassword

If no password is provided one will be generated automatically.

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ResetDbaasKafkaUserPasswordRequest;
import com.exoscale.api.models.operations.ResetDbaasKafkaUserPasswordRequestBody;
import com.exoscale.api.models.operations.ResetDbaasKafkaUserPasswordResponse;
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

            ResetDbaasKafkaUserPasswordResponse res = sdk.dbaas().resetDbaasKafkaUserPassword()
                .serviceName("<value>")
                .username("<value>")
                .requestBody(ResetDbaasKafkaUserPasswordRequestBody.builder()
                    .build())
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

### Parameters

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `serviceName`                                                                                                                                  | *String*                                                                                                                                       | :heavy_check_mark:                                                                                                                             | N/A                                                                                                                                            |
| `username`                                                                                                                                     | *String*                                                                                                                                       | :heavy_check_mark:                                                                                                                             | N/A                                                                                                                                            |
| `requestBody`                                                                                                                                  | [com.exoscale.api.models.operations.ResetDbaasKafkaUserPasswordRequestBody](../../models/operations/ResetDbaasKafkaUserPasswordRequestBody.md) | :heavy_check_mark:                                                                                                                             | N/A                                                                                                                                            |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ResetDbaasKafkaUserPasswordResponse>](../../models/operations/ResetDbaasKafkaUserPasswordResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createDbaasServiceOpensearch

Create a DBaaS OpenSearch service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.IPAddressRateLimitingSettings;
import com.exoscale.api.models.components.InternalAuthenticationBackendLimiting;
import com.exoscale.api.models.components.InternalAuthenticationBackendLimitingAuthenticationBackend;
import com.exoscale.api.models.components.InternalAuthenticationBackendLimitingType;
import com.exoscale.api.models.components.IpRateLimitingType;
import com.exoscale.api.models.components.JsonSchemaOpensearch;
import com.exoscale.api.models.components.OpensearchEmailSenderSettings;
import com.exoscale.api.models.components.OpensearchISMHistorySettings;
import com.exoscale.api.models.components.OpensearchSecurityPluginSettings;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateDbaasServiceOpensearchDow;
import com.exoscale.api.models.operations.CreateDbaasServiceOpensearchMaintenance;
import com.exoscale.api.models.operations.CreateDbaasServiceOpensearchRequest;
import com.exoscale.api.models.operations.CreateDbaasServiceOpensearchRequestBody;
import com.exoscale.api.models.operations.CreateDbaasServiceOpensearchResponse;
import com.exoscale.api.models.operations.IndexPatterns;
import com.exoscale.api.models.operations.IndexTemplate;
import com.exoscale.api.models.operations.OpensearchDashboards;
import com.exoscale.api.models.operations.SortingAlgorithm;
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

            CreateDbaasServiceOpensearchResponse res = sdk.dbaas().createDbaasServiceOpensearch()
                .name("<value>")
                .requestBody(CreateDbaasServiceOpensearchRequestBody.builder()
                    .plan("<value>")
                    .build())
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

### Parameters

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `name`                                                                                                                                           | *String*                                                                                                                                         | :heavy_check_mark:                                                                                                                               | N/A                                                                                                                                              |
| `requestBody`                                                                                                                                    | [com.exoscale.api.models.operations.CreateDbaasServiceOpensearchRequestBody](../../models/operations/CreateDbaasServiceOpensearchRequestBody.md) | :heavy_check_mark:                                                                                                                               | N/A                                                                                                                                              |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateDbaasServiceOpensearchResponse>](../../models/operations/CreateDbaasServiceOpensearchResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDbaasServiceOpensearch

Get a DBaaS OpenSearch service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetDbaasServiceOpensearchRequest;
import com.exoscale.api.models.operations.GetDbaasServiceOpensearchResponse;
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

            GetDbaasServiceOpensearchResponse res = sdk.dbaas().getDbaasServiceOpensearch()
                .name("<value>")
                .call();

            if (res.dbaasServiceOpensearch().isPresent()) {
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetDbaasServiceOpensearchResponse>](../../models/operations/GetDbaasServiceOpensearchResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteDbaasServiceOpensearch

Delete a OpenSearch service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteDbaasServiceOpensearchRequest;
import com.exoscale.api.models.operations.DeleteDbaasServiceOpensearchResponse;
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

            DeleteDbaasServiceOpensearchResponse res = sdk.dbaas().deleteDbaasServiceOpensearch()
                .name("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DeleteDbaasServiceOpensearchResponse>](../../models/operations/DeleteDbaasServiceOpensearchResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateDbaasServiceOpensearch

Update a DBaaS OpenSearch service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.IPAddressRateLimitingSettings;
import com.exoscale.api.models.components.InternalAuthenticationBackendLimiting;
import com.exoscale.api.models.components.InternalAuthenticationBackendLimitingAuthenticationBackend;
import com.exoscale.api.models.components.InternalAuthenticationBackendLimitingType;
import com.exoscale.api.models.components.IpRateLimitingType;
import com.exoscale.api.models.components.JsonSchemaOpensearch;
import com.exoscale.api.models.components.OpensearchEmailSenderSettings;
import com.exoscale.api.models.components.OpensearchISMHistorySettings;
import com.exoscale.api.models.components.OpensearchSecurityPluginSettings;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.UpdateDbaasServiceOpensearchDow;
import com.exoscale.api.models.operations.UpdateDbaasServiceOpensearchIndexPatterns;
import com.exoscale.api.models.operations.UpdateDbaasServiceOpensearchIndexTemplate;
import com.exoscale.api.models.operations.UpdateDbaasServiceOpensearchMaintenance;
import com.exoscale.api.models.operations.UpdateDbaasServiceOpensearchOpensearchDashboards;
import com.exoscale.api.models.operations.UpdateDbaasServiceOpensearchRequest;
import com.exoscale.api.models.operations.UpdateDbaasServiceOpensearchRequestBody;
import com.exoscale.api.models.operations.UpdateDbaasServiceOpensearchResponse;
import com.exoscale.api.models.operations.UpdateDbaasServiceOpensearchSortingAlgorithm;
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

            UpdateDbaasServiceOpensearchResponse res = sdk.dbaas().updateDbaasServiceOpensearch()
                .name("<value>")
                .requestBody(UpdateDbaasServiceOpensearchRequestBody.builder()
                    .build())
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

### Parameters

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `name`                                                                                                                                           | *String*                                                                                                                                         | :heavy_check_mark:                                                                                                                               | N/A                                                                                                                                              |
| `requestBody`                                                                                                                                    | [com.exoscale.api.models.operations.UpdateDbaasServiceOpensearchRequestBody](../../models/operations/UpdateDbaasServiceOpensearchRequestBody.md) | :heavy_check_mark:                                                                                                                               | N/A                                                                                                                                              |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpdateDbaasServiceOpensearchResponse>](../../models/operations/UpdateDbaasServiceOpensearchResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteDbaasServiceRedis

Delete a Redis service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteDbaasServiceRedisRequest;
import com.exoscale.api.models.operations.DeleteDbaasServiceRedisResponse;
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

            DeleteDbaasServiceRedisResponse res = sdk.dbaas().deleteDbaasServiceRedis()
                .name("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DeleteDbaasServiceRedisResponse>](../../models/operations/DeleteDbaasServiceRedisResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateDbaasServiceRedis

Update a DBaaS Redis service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.DefaultACLForPubSubChannelsUsedWhenRedisUserIsCreated;
import com.exoscale.api.models.components.EnumMigrationMethod;
import com.exoscale.api.models.components.JsonSchemaRedis;
import com.exoscale.api.models.components.RedisMaxmemoryPolicy;
import com.exoscale.api.models.components.RedisPersistence;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.UpdateDbaasServiceRedisDow;
import com.exoscale.api.models.operations.UpdateDbaasServiceRedisMaintenance;
import com.exoscale.api.models.operations.UpdateDbaasServiceRedisMigration;
import com.exoscale.api.models.operations.UpdateDbaasServiceRedisRequest;
import com.exoscale.api.models.operations.UpdateDbaasServiceRedisRequestBody;
import com.exoscale.api.models.operations.UpdateDbaasServiceRedisResponse;
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

            UpdateDbaasServiceRedisResponse res = sdk.dbaas().updateDbaasServiceRedis()
                .name("<value>")
                .requestBody(UpdateDbaasServiceRedisRequestBody.builder()
                    .build())
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

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `name`                                                                                                                                 | *String*                                                                                                                               | :heavy_check_mark:                                                                                                                     | N/A                                                                                                                                    |
| `requestBody`                                                                                                                          | [com.exoscale.api.models.operations.UpdateDbaasServiceRedisRequestBody](../../models/operations/UpdateDbaasServiceRedisRequestBody.md) | :heavy_check_mark:                                                                                                                     | N/A                                                                                                                                    |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpdateDbaasServiceRedisResponse>](../../models/operations/UpdateDbaasServiceRedisResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDbaasServiceRedis

Get a DBaaS Redis service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetDbaasServiceRedisRequest;
import com.exoscale.api.models.operations.GetDbaasServiceRedisResponse;
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

            GetDbaasServiceRedisResponse res = sdk.dbaas().getDbaasServiceRedis()
                .name("<value>")
                .call();

            if (res.dbaasServiceRedis().isPresent()) {
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetDbaasServiceRedisResponse>](../../models/operations/GetDbaasServiceRedisResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createDbaasServiceRedis

Create a DBaaS Redis service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.DefaultACLForPubSubChannelsUsedWhenRedisUserIsCreated;
import com.exoscale.api.models.components.EnumMigrationMethod;
import com.exoscale.api.models.components.JsonSchemaRedis;
import com.exoscale.api.models.components.RedisMaxmemoryPolicy;
import com.exoscale.api.models.components.RedisPersistence;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateDbaasServiceRedisDow;
import com.exoscale.api.models.operations.CreateDbaasServiceRedisMaintenance;
import com.exoscale.api.models.operations.CreateDbaasServiceRedisMigration;
import com.exoscale.api.models.operations.CreateDbaasServiceRedisRequest;
import com.exoscale.api.models.operations.CreateDbaasServiceRedisRequestBody;
import com.exoscale.api.models.operations.CreateDbaasServiceRedisResponse;
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

            CreateDbaasServiceRedisResponse res = sdk.dbaas().createDbaasServiceRedis()
                .name("<value>")
                .requestBody(CreateDbaasServiceRedisRequestBody.builder()
                    .plan("<value>")
                    .build())
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

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `name`                                                                                                                                 | *String*                                                                                                                               | :heavy_check_mark:                                                                                                                     | N/A                                                                                                                                    |
| `requestBody`                                                                                                                          | [com.exoscale.api.models.operations.CreateDbaasServiceRedisRequestBody](../../models/operations/CreateDbaasServiceRedisRequestBody.md) | :heavy_check_mark:                                                                                                                     | N/A                                                                                                                                    |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateDbaasServiceRedisResponse>](../../models/operations/CreateDbaasServiceRedisResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateDbaasServicePg

Update a DBaaS PostgreSQL service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.AutovacuumSettings;
import com.exoscale.api.models.components.BackgroundBGWriterSettings;
import com.exoscale.api.models.components.DefaultToastCompression;
import com.exoscale.api.models.components.EnumMigrationMethod;
import com.exoscale.api.models.components.EnumOfParametersToIgnoreWhenGivenInStartupPacket;
import com.exoscale.api.models.components.EnumPgSynchronousReplication;
import com.exoscale.api.models.components.EnumPgVariant;
import com.exoscale.api.models.components.JsonSchemaPg;
import com.exoscale.api.models.components.JsonSchemaPgbouncer;
import com.exoscale.api.models.components.JsonSchemaPglookout;
import com.exoscale.api.models.components.JsonSchemaTimescaledb;
import com.exoscale.api.models.components.LogErrorVerbosity;
import com.exoscale.api.models.components.LogLinePrefix;
import com.exoscale.api.models.components.PGBouncerPoolMode;
import com.exoscale.api.models.components.PgStatStatementsTrack;
import com.exoscale.api.models.components.TrackCommitTimestamp;
import com.exoscale.api.models.components.TrackFunctions;
import com.exoscale.api.models.components.TrackIoTiming;
import com.exoscale.api.models.components.WriteAheadLogWALSettings;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.UpdateDbaasServicePgBackupSchedule;
import com.exoscale.api.models.operations.UpdateDbaasServicePgDow;
import com.exoscale.api.models.operations.UpdateDbaasServicePgMaintenance;
import com.exoscale.api.models.operations.UpdateDbaasServicePgMigration;
import com.exoscale.api.models.operations.UpdateDbaasServicePgRequest;
import com.exoscale.api.models.operations.UpdateDbaasServicePgRequestBody;
import com.exoscale.api.models.operations.UpdateDbaasServicePgResponse;
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

            UpdateDbaasServicePgResponse res = sdk.dbaas().updateDbaasServicePg()
                .name("<value>")
                .requestBody(UpdateDbaasServicePgRequestBody.builder()
                    .build())
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

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `name`                                                                                                                           | *String*                                                                                                                         | :heavy_check_mark:                                                                                                               | N/A                                                                                                                              |
| `requestBody`                                                                                                                    | [com.exoscale.api.models.operations.UpdateDbaasServicePgRequestBody](../../models/operations/UpdateDbaasServicePgRequestBody.md) | :heavy_check_mark:                                                                                                               | N/A                                                                                                                              |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpdateDbaasServicePgResponse>](../../models/operations/UpdateDbaasServicePgResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDbaasServicePg

Get a DBaaS PostgreSQL service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetDbaasServicePgRequest;
import com.exoscale.api.models.operations.GetDbaasServicePgResponse;
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

            GetDbaasServicePgResponse res = sdk.dbaas().getDbaasServicePg()
                .name("<value>")
                .call();

            if (res.dbaasServicePg().isPresent()) {
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetDbaasServicePgResponse>](../../models/operations/GetDbaasServicePgResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createDbaasServicePg

Create a DBaaS PostgreSQL service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.AutovacuumSettings;
import com.exoscale.api.models.components.BackgroundBGWriterSettings;
import com.exoscale.api.models.components.DbaasPgTargetVersions;
import com.exoscale.api.models.components.DefaultToastCompression;
import com.exoscale.api.models.components.EnumMigrationMethod;
import com.exoscale.api.models.components.EnumOfParametersToIgnoreWhenGivenInStartupPacket;
import com.exoscale.api.models.components.EnumPgSynchronousReplication;
import com.exoscale.api.models.components.EnumPgVariant;
import com.exoscale.api.models.components.JsonSchemaPg;
import com.exoscale.api.models.components.JsonSchemaPgbouncer;
import com.exoscale.api.models.components.JsonSchemaPglookout;
import com.exoscale.api.models.components.JsonSchemaTimescaledb;
import com.exoscale.api.models.components.LogErrorVerbosity;
import com.exoscale.api.models.components.LogLinePrefix;
import com.exoscale.api.models.components.PGBouncerPoolMode;
import com.exoscale.api.models.components.PgStatStatementsTrack;
import com.exoscale.api.models.components.TrackCommitTimestamp;
import com.exoscale.api.models.components.TrackFunctions;
import com.exoscale.api.models.components.TrackIoTiming;
import com.exoscale.api.models.components.WriteAheadLogWALSettings;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateDbaasServicePgBackupSchedule;
import com.exoscale.api.models.operations.CreateDbaasServicePgDow;
import com.exoscale.api.models.operations.CreateDbaasServicePgIntegrations;
import com.exoscale.api.models.operations.CreateDbaasServicePgMaintenance;
import com.exoscale.api.models.operations.CreateDbaasServicePgMigration;
import com.exoscale.api.models.operations.CreateDbaasServicePgRequest;
import com.exoscale.api.models.operations.CreateDbaasServicePgRequestBody;
import com.exoscale.api.models.operations.CreateDbaasServicePgResponse;
import com.exoscale.api.models.operations.CreateDbaasServicePgSettings;
import com.exoscale.api.models.operations.CreateDbaasServicePgType;
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

            CreateDbaasServicePgResponse res = sdk.dbaas().createDbaasServicePg()
                .name("<value>")
                .requestBody(CreateDbaasServicePgRequestBody.builder()
                    .plan("<value>")
                    .build())
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

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `name`                                                                                                                           | *String*                                                                                                                         | :heavy_check_mark:                                                                                                               | N/A                                                                                                                              |
| `requestBody`                                                                                                                    | [com.exoscale.api.models.operations.CreateDbaasServicePgRequestBody](../../models/operations/CreateDbaasServicePgRequestBody.md) | :heavy_check_mark:                                                                                                               | N/A                                                                                                                              |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateDbaasServicePgResponse>](../../models/operations/CreateDbaasServicePgResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteDbaasServicePg

Delete a Postgres service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteDbaasServicePgRequest;
import com.exoscale.api.models.operations.DeleteDbaasServicePgResponse;
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

            DeleteDbaasServicePgResponse res = sdk.dbaas().deleteDbaasServicePg()
                .name("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DeleteDbaasServicePgResponse>](../../models/operations/DeleteDbaasServicePgResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createDbaasIntegration

Create a new DBaaS integration between two services

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.EnumIntegrationTypes;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateDbaasIntegrationRequestBody;
import com.exoscale.api.models.operations.CreateDbaasIntegrationResponse;
import com.exoscale.api.models.operations.CreateDbaasIntegrationSettings;
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

            CreateDbaasIntegrationRequestBody req = CreateDbaasIntegrationRequestBody.builder()
                .integrationType(EnumIntegrationTypes.METRICS)
                .sourceService("<value>")
                .destService("<value>")
                .settings(CreateDbaasIntegrationSettings.builder()
                    .build())
                .build();

            CreateDbaasIntegrationResponse res = sdk.dbaas().createDbaasIntegration()
                .request(req)
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

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.exoscale.api.models.operations.CreateDbaasIntegrationRequestBody](../../models/operations/CreateDbaasIntegrationRequestBody.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateDbaasIntegrationResponse>](../../models/operations/CreateDbaasIntegrationResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDbaasTask

Get a DBaaS task

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetDbaasTaskRequest;
import com.exoscale.api.models.operations.GetDbaasTaskResponse;
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

            GetDbaasTaskResponse res = sdk.dbaas().getDbaasTask()
                .service("<value>")
                .id("f7c404ad-1cff-45f5-a4bb-7b6912a81429")
                .call();

            if (res.dbaasTask().isPresent()) {
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `service`          | *String*           | :heavy_check_mark: | N/A                |
| `id`               | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetDbaasTaskResponse>](../../models/operations/GetDbaasTaskResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## startDbaasRedisMaintenance

Initiate Redis maintenance update

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.StartDbaasRedisMaintenanceRequest;
import com.exoscale.api.models.operations.StartDbaasRedisMaintenanceResponse;
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

            StartDbaasRedisMaintenanceResponse res = sdk.dbaas().startDbaasRedisMaintenance()
                .name("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.StartDbaasRedisMaintenanceResponse>](../../models/operations/StartDbaasRedisMaintenanceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteDbaasKafkaTopicAclConfig

Delete a Kafka ACL entry

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteDbaasKafkaTopicAclConfigRequest;
import com.exoscale.api.models.operations.DeleteDbaasKafkaTopicAclConfigResponse;
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

            DeleteDbaasKafkaTopicAclConfigResponse res = sdk.dbaas().deleteDbaasKafkaTopicAclConfig()
                .name("<value>")
                .aclId("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |
| `aclId`            | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DeleteDbaasKafkaTopicAclConfigResponse>](../../models/operations/DeleteDbaasKafkaTopicAclConfigResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## resetDbaasPostgresUserPassword

If no password is provided one will be generated automatically.

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ResetDbaasPostgresUserPasswordRequest;
import com.exoscale.api.models.operations.ResetDbaasPostgresUserPasswordRequestBody;
import com.exoscale.api.models.operations.ResetDbaasPostgresUserPasswordResponse;
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

            ResetDbaasPostgresUserPasswordResponse res = sdk.dbaas().resetDbaasPostgresUserPassword()
                .serviceName("<value>")
                .username("<value>")
                .requestBody(ResetDbaasPostgresUserPasswordRequestBody.builder()
                    .build())
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

### Parameters

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `serviceName`                                                                                                                                        | *String*                                                                                                                                             | :heavy_check_mark:                                                                                                                                   | N/A                                                                                                                                                  |
| `username`                                                                                                                                           | *String*                                                                                                                                             | :heavy_check_mark:                                                                                                                                   | N/A                                                                                                                                                  |
| `requestBody`                                                                                                                                        | [com.exoscale.api.models.operations.ResetDbaasPostgresUserPasswordRequestBody](../../models/operations/ResetDbaasPostgresUserPasswordRequestBody.md) | :heavy_check_mark:                                                                                                                                   | N/A                                                                                                                                                  |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ResetDbaasPostgresUserPasswordResponse>](../../models/operations/ResetDbaasPostgresUserPasswordResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
