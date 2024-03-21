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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.client.model.DbaasmysqlnameMaintenance;
import io.swagger.client.model.DbaasmysqlnameMigration;
import io.swagger.client.model.JsonSchemaRedis;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * DbaasredisNameBody1
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-08T17:23:40.261901+01:00[Europe/Vienna]")

public class DbaasredisNameBody1 {
  @JsonProperty("maintenance")
  private DbaasmysqlnameMaintenance maintenance = null;

  @JsonProperty("plan")
  private String plan = null;

  @JsonProperty("termination-protection")
  private Boolean terminationProtection = null;

  @JsonProperty("ip-filter")
  private List<String> ipFilter = null;

  @JsonProperty("migration")
  private DbaasmysqlnameMigration migration = null;

  @JsonProperty("redis-settings")
  private JsonSchemaRedis redisSettings = null;

  @JsonProperty("fork-from-service")
  private String forkFromService = null;

  @JsonProperty("recovery-backup-name")
  private String recoveryBackupName = null;

  public DbaasredisNameBody1 maintenance(DbaasmysqlnameMaintenance maintenance) {
    this.maintenance = maintenance;
    return this;
  }

   /**
   * Get maintenance
   * @return maintenance
  **/
  @Schema(description = "")
  public DbaasmysqlnameMaintenance getMaintenance() {
    return maintenance;
  }

  public void setMaintenance(DbaasmysqlnameMaintenance maintenance) {
    this.maintenance = maintenance;
  }

  public DbaasredisNameBody1 plan(String plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Subscription plan
   * @return plan
  **/
  @Schema(required = true, description = "Subscription plan")
  public String getPlan() {
    return plan;
  }

  public void setPlan(String plan) {
    this.plan = plan;
  }

  public DbaasredisNameBody1 terminationProtection(Boolean terminationProtection) {
    this.terminationProtection = terminationProtection;
    return this;
  }

   /**
   * Service is protected against termination and powering off
   * @return terminationProtection
  **/
  @Schema(description = "Service is protected against termination and powering off")
  public Boolean isTerminationProtection() {
    return terminationProtection;
  }

  public void setTerminationProtection(Boolean terminationProtection) {
    this.terminationProtection = terminationProtection;
  }

  public DbaasredisNameBody1 ipFilter(List<String> ipFilter) {
    this.ipFilter = ipFilter;
    return this;
  }

  public DbaasredisNameBody1 addIpFilterItem(String ipFilterItem) {
    if (this.ipFilter == null) {
      this.ipFilter = new ArrayList<>();
    }
    this.ipFilter.add(ipFilterItem);
    return this;
  }

   /**
   * Allow incoming connections from CIDR address block, e.g. &#x27;10.20.0.0/16&#x27;
   * @return ipFilter
  **/
  @Schema(description = "Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'")
  public List<String> getIpFilter() {
    return ipFilter;
  }

  public void setIpFilter(List<String> ipFilter) {
    this.ipFilter = ipFilter;
  }

  public DbaasredisNameBody1 migration(DbaasmysqlnameMigration migration) {
    this.migration = migration;
    return this;
  }

   /**
   * Get migration
   * @return migration
  **/
  @Schema(description = "")
  public DbaasmysqlnameMigration getMigration() {
    return migration;
  }

  public void setMigration(DbaasmysqlnameMigration migration) {
    this.migration = migration;
  }

  public DbaasredisNameBody1 redisSettings(JsonSchemaRedis redisSettings) {
    this.redisSettings = redisSettings;
    return this;
  }

   /**
   * Get redisSettings
   * @return redisSettings
  **/
  @Schema(description = "")
  public JsonSchemaRedis getRedisSettings() {
    return redisSettings;
  }

  public void setRedisSettings(JsonSchemaRedis redisSettings) {
    this.redisSettings = redisSettings;
  }

  public DbaasredisNameBody1 forkFromService(String forkFromService) {
    this.forkFromService = forkFromService;
    return this;
  }

   /**
   * Get forkFromService
   * @return forkFromService
  **/
  @Schema(description = "")
  public String getForkFromService() {
    return forkFromService;
  }

  public void setForkFromService(String forkFromService) {
    this.forkFromService = forkFromService;
  }

  public DbaasredisNameBody1 recoveryBackupName(String recoveryBackupName) {
    this.recoveryBackupName = recoveryBackupName;
    return this;
  }

   /**
   * Name of a backup to recover from for services that support backup names
   * @return recoveryBackupName
  **/
  @Schema(description = "Name of a backup to recover from for services that support backup names")
  public String getRecoveryBackupName() {
    return recoveryBackupName;
  }

  public void setRecoveryBackupName(String recoveryBackupName) {
    this.recoveryBackupName = recoveryBackupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasredisNameBody1 dbaasredisNameBody1 = (DbaasredisNameBody1) o;
    return Objects.equals(this.maintenance, dbaasredisNameBody1.maintenance) &&
        Objects.equals(this.plan, dbaasredisNameBody1.plan) &&
        Objects.equals(this.terminationProtection, dbaasredisNameBody1.terminationProtection) &&
        Objects.equals(this.ipFilter, dbaasredisNameBody1.ipFilter) &&
        Objects.equals(this.migration, dbaasredisNameBody1.migration) &&
        Objects.equals(this.redisSettings, dbaasredisNameBody1.redisSettings) &&
        Objects.equals(this.forkFromService, dbaasredisNameBody1.forkFromService) &&
        Objects.equals(this.recoveryBackupName, dbaasredisNameBody1.recoveryBackupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maintenance, plan, terminationProtection, ipFilter, migration, redisSettings, forkFromService, recoveryBackupName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasredisNameBody1 {\n");
    
    sb.append("    maintenance: ").append(toIndentedString(maintenance)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    terminationProtection: ").append(toIndentedString(terminationProtection)).append("\n");
    sb.append("    ipFilter: ").append(toIndentedString(ipFilter)).append("\n");
    sb.append("    migration: ").append(toIndentedString(migration)).append("\n");
    sb.append("    redisSettings: ").append(toIndentedString(redisSettings)).append("\n");
    sb.append("    forkFromService: ").append(toIndentedString(forkFromService)).append("\n");
    sb.append("    recoveryBackupName: ").append(toIndentedString(recoveryBackupName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
