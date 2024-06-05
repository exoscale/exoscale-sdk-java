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


package com.exoscale.exoscale4j.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.exoscale.exoscale4j.model.CreateDbaasServiceMysqlRequestIntegrationsInner;
import com.exoscale.exoscale4j.model.DbaasPgTargetVersions;
import com.exoscale.exoscale4j.model.EnumPgSynchronousReplication;
import com.exoscale.exoscale4j.model.EnumPgVariant;
import com.exoscale.exoscale4j.model.JsonSchemaPg;
import com.exoscale.exoscale4j.model.JsonSchemaPgbouncer;
import com.exoscale.exoscale4j.model.JsonSchemaPglookout;
import com.exoscale.exoscale4j.model.JsonSchemaTimescaledb;
import com.exoscale.exoscale4j.model.UpdateDbaasServiceMysqlRequestBackupSchedule;
import com.exoscale.exoscale4j.model.UpdateDbaasServiceMysqlRequestMaintenance;
import com.exoscale.exoscale4j.model.UpdateDbaasServiceMysqlRequestMigration;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateDbaasServicePgRequest
 */
@JsonPropertyOrder({
  CreateDbaasServicePgRequest.JSON_PROPERTY_PGBOUNCER_SETTINGS,
  CreateDbaasServicePgRequest.JSON_PROPERTY_BACKUP_SCHEDULE,
  CreateDbaasServicePgRequest.JSON_PROPERTY_VARIANT,
  CreateDbaasServicePgRequest.JSON_PROPERTY_INTEGRATIONS,
  CreateDbaasServicePgRequest.JSON_PROPERTY_TIMESCALEDB_SETTINGS,
  CreateDbaasServicePgRequest.JSON_PROPERTY_IP_FILTER,
  CreateDbaasServicePgRequest.JSON_PROPERTY_TERMINATION_PROTECTION,
  CreateDbaasServicePgRequest.JSON_PROPERTY_FORK_FROM_SERVICE,
  CreateDbaasServicePgRequest.JSON_PROPERTY_SYNCHRONOUS_REPLICATION,
  CreateDbaasServicePgRequest.JSON_PROPERTY_RECOVERY_BACKUP_TIME,
  CreateDbaasServicePgRequest.JSON_PROPERTY_PGLOOKOUT_SETTINGS,
  CreateDbaasServicePgRequest.JSON_PROPERTY_MAINTENANCE,
  CreateDbaasServicePgRequest.JSON_PROPERTY_ADMIN_USERNAME,
  CreateDbaasServicePgRequest.JSON_PROPERTY_VERSION,
  CreateDbaasServicePgRequest.JSON_PROPERTY_PLAN,
  CreateDbaasServicePgRequest.JSON_PROPERTY_WORK_MEM,
  CreateDbaasServicePgRequest.JSON_PROPERTY_SHARED_BUFFERS_PERCENTAGE,
  CreateDbaasServicePgRequest.JSON_PROPERTY_PG_SETTINGS,
  CreateDbaasServicePgRequest.JSON_PROPERTY_ADMIN_PASSWORD,
  CreateDbaasServicePgRequest.JSON_PROPERTY_MIGRATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-05T21:27:44.654335085+02:00[Europe/Zurich]", comments = "Generator version: 7.4.0")
public class CreateDbaasServicePgRequest {
  public static final String JSON_PROPERTY_PGBOUNCER_SETTINGS = "pgbouncer-settings";
  private JsonSchemaPgbouncer pgbouncerSettings;

  public static final String JSON_PROPERTY_BACKUP_SCHEDULE = "backup-schedule";
  private UpdateDbaasServiceMysqlRequestBackupSchedule backupSchedule;

  public static final String JSON_PROPERTY_VARIANT = "variant";
  private EnumPgVariant variant;

  public static final String JSON_PROPERTY_INTEGRATIONS = "integrations";
  private List<CreateDbaasServiceMysqlRequestIntegrationsInner> integrations;

  public static final String JSON_PROPERTY_TIMESCALEDB_SETTINGS = "timescaledb-settings";
  private JsonSchemaTimescaledb timescaledbSettings;

  public static final String JSON_PROPERTY_IP_FILTER = "ip-filter";
  private List<String> ipFilter;

  public static final String JSON_PROPERTY_TERMINATION_PROTECTION = "termination-protection";
  private Boolean terminationProtection;

  public static final String JSON_PROPERTY_FORK_FROM_SERVICE = "fork-from-service";
  private String forkFromService;

  public static final String JSON_PROPERTY_SYNCHRONOUS_REPLICATION = "synchronous-replication";
  private EnumPgSynchronousReplication synchronousReplication;

  public static final String JSON_PROPERTY_RECOVERY_BACKUP_TIME = "recovery-backup-time";
  private String recoveryBackupTime;

  public static final String JSON_PROPERTY_PGLOOKOUT_SETTINGS = "pglookout-settings";
  private JsonSchemaPglookout pglookoutSettings;

  public static final String JSON_PROPERTY_MAINTENANCE = "maintenance";
  private UpdateDbaasServiceMysqlRequestMaintenance maintenance;

  public static final String JSON_PROPERTY_ADMIN_USERNAME = "admin-username";
  private String adminUsername;

  public static final String JSON_PROPERTY_VERSION = "version";
  private DbaasPgTargetVersions version;

  public static final String JSON_PROPERTY_PLAN = "plan";
  private String plan;

  public static final String JSON_PROPERTY_WORK_MEM = "work-mem";
  private Long workMem;

  public static final String JSON_PROPERTY_SHARED_BUFFERS_PERCENTAGE = "shared-buffers-percentage";
  private Long sharedBuffersPercentage;

  public static final String JSON_PROPERTY_PG_SETTINGS = "pg-settings";
  private JsonSchemaPg pgSettings;

  public static final String JSON_PROPERTY_ADMIN_PASSWORD = "admin-password";
  private String adminPassword;

  public static final String JSON_PROPERTY_MIGRATION = "migration";
  private UpdateDbaasServiceMysqlRequestMigration migration;

  public CreateDbaasServicePgRequest() { 
  }

  public CreateDbaasServicePgRequest pgbouncerSettings(JsonSchemaPgbouncer pgbouncerSettings) {
    this.pgbouncerSettings = pgbouncerSettings;
    return this;
  }

   /**
   * Get pgbouncerSettings
   * @return pgbouncerSettings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PGBOUNCER_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonSchemaPgbouncer getPgbouncerSettings() {
    return pgbouncerSettings;
  }


  @JsonProperty(JSON_PROPERTY_PGBOUNCER_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPgbouncerSettings(JsonSchemaPgbouncer pgbouncerSettings) {
    this.pgbouncerSettings = pgbouncerSettings;
  }


  public CreateDbaasServicePgRequest backupSchedule(UpdateDbaasServiceMysqlRequestBackupSchedule backupSchedule) {
    this.backupSchedule = backupSchedule;
    return this;
  }

   /**
   * Get backupSchedule
   * @return backupSchedule
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BACKUP_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdateDbaasServiceMysqlRequestBackupSchedule getBackupSchedule() {
    return backupSchedule;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackupSchedule(UpdateDbaasServiceMysqlRequestBackupSchedule backupSchedule) {
    this.backupSchedule = backupSchedule;
  }


  public CreateDbaasServicePgRequest variant(EnumPgVariant variant) {
    this.variant = variant;
    return this;
  }

   /**
   * Get variant
   * @return variant
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EnumPgVariant getVariant() {
    return variant;
  }


  @JsonProperty(JSON_PROPERTY_VARIANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVariant(EnumPgVariant variant) {
    this.variant = variant;
  }


  public CreateDbaasServicePgRequest integrations(List<CreateDbaasServiceMysqlRequestIntegrationsInner> integrations) {
    this.integrations = integrations;
    return this;
  }

  public CreateDbaasServicePgRequest addIntegrationsItem(CreateDbaasServiceMysqlRequestIntegrationsInner integrationsItem) {
    if (this.integrations == null) {
      this.integrations = new ArrayList<>();
    }
    this.integrations.add(integrationsItem);
    return this;
  }

   /**
   * Service integrations to be enabled when creating the service.
   * @return integrations
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CreateDbaasServiceMysqlRequestIntegrationsInner> getIntegrations() {
    return integrations;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrations(List<CreateDbaasServiceMysqlRequestIntegrationsInner> integrations) {
    this.integrations = integrations;
  }


  public CreateDbaasServicePgRequest timescaledbSettings(JsonSchemaTimescaledb timescaledbSettings) {
    this.timescaledbSettings = timescaledbSettings;
    return this;
  }

   /**
   * Get timescaledbSettings
   * @return timescaledbSettings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESCALEDB_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonSchemaTimescaledb getTimescaledbSettings() {
    return timescaledbSettings;
  }


  @JsonProperty(JSON_PROPERTY_TIMESCALEDB_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimescaledbSettings(JsonSchemaTimescaledb timescaledbSettings) {
    this.timescaledbSettings = timescaledbSettings;
  }


  public CreateDbaasServicePgRequest ipFilter(List<String> ipFilter) {
    this.ipFilter = ipFilter;
    return this;
  }

  public CreateDbaasServicePgRequest addIpFilterItem(String ipFilterItem) {
    if (this.ipFilter == null) {
      this.ipFilter = new ArrayList<>();
    }
    this.ipFilter.add(ipFilterItem);
    return this;
  }

   /**
   * Allow incoming connections from CIDR address block, e.g. &#39;10.20.0.0/16&#39;
   * @return ipFilter
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIpFilter() {
    return ipFilter;
  }


  @JsonProperty(JSON_PROPERTY_IP_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpFilter(List<String> ipFilter) {
    this.ipFilter = ipFilter;
  }


  public CreateDbaasServicePgRequest terminationProtection(Boolean terminationProtection) {
    this.terminationProtection = terminationProtection;
    return this;
  }

   /**
   * Service is protected against termination and powering off
   * @return terminationProtection
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERMINATION_PROTECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTerminationProtection() {
    return terminationProtection;
  }


  @JsonProperty(JSON_PROPERTY_TERMINATION_PROTECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTerminationProtection(Boolean terminationProtection) {
    this.terminationProtection = terminationProtection;
  }


  public CreateDbaasServicePgRequest forkFromService(String forkFromService) {
    this.forkFromService = forkFromService;
    return this;
  }

   /**
   * Get forkFromService
   * @return forkFromService
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORK_FROM_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getForkFromService() {
    return forkFromService;
  }


  @JsonProperty(JSON_PROPERTY_FORK_FROM_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForkFromService(String forkFromService) {
    this.forkFromService = forkFromService;
  }


  public CreateDbaasServicePgRequest synchronousReplication(EnumPgSynchronousReplication synchronousReplication) {
    this.synchronousReplication = synchronousReplication;
    return this;
  }

   /**
   * Get synchronousReplication
   * @return synchronousReplication
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYNCHRONOUS_REPLICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EnumPgSynchronousReplication getSynchronousReplication() {
    return synchronousReplication;
  }


  @JsonProperty(JSON_PROPERTY_SYNCHRONOUS_REPLICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSynchronousReplication(EnumPgSynchronousReplication synchronousReplication) {
    this.synchronousReplication = synchronousReplication;
  }


  public CreateDbaasServicePgRequest recoveryBackupTime(String recoveryBackupTime) {
    this.recoveryBackupTime = recoveryBackupTime;
    return this;
  }

   /**
   * ISO time of a backup to recover from for services that support arbitrary times
   * @return recoveryBackupTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECOVERY_BACKUP_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecoveryBackupTime() {
    return recoveryBackupTime;
  }


  @JsonProperty(JSON_PROPERTY_RECOVERY_BACKUP_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecoveryBackupTime(String recoveryBackupTime) {
    this.recoveryBackupTime = recoveryBackupTime;
  }


  public CreateDbaasServicePgRequest pglookoutSettings(JsonSchemaPglookout pglookoutSettings) {
    this.pglookoutSettings = pglookoutSettings;
    return this;
  }

   /**
   * Get pglookoutSettings
   * @return pglookoutSettings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PGLOOKOUT_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonSchemaPglookout getPglookoutSettings() {
    return pglookoutSettings;
  }


  @JsonProperty(JSON_PROPERTY_PGLOOKOUT_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPglookoutSettings(JsonSchemaPglookout pglookoutSettings) {
    this.pglookoutSettings = pglookoutSettings;
  }


  public CreateDbaasServicePgRequest maintenance(UpdateDbaasServiceMysqlRequestMaintenance maintenance) {
    this.maintenance = maintenance;
    return this;
  }

   /**
   * Get maintenance
   * @return maintenance
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAINTENANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdateDbaasServiceMysqlRequestMaintenance getMaintenance() {
    return maintenance;
  }


  @JsonProperty(JSON_PROPERTY_MAINTENANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaintenance(UpdateDbaasServiceMysqlRequestMaintenance maintenance) {
    this.maintenance = maintenance;
  }


  public CreateDbaasServicePgRequest adminUsername(String adminUsername) {
    this.adminUsername = adminUsername;
    return this;
  }

   /**
   * Custom username for admin user. This must be set only when a new service is being created.
   * @return adminUsername
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADMIN_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdminUsername() {
    return adminUsername;
  }


  @JsonProperty(JSON_PROPERTY_ADMIN_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdminUsername(String adminUsername) {
    this.adminUsername = adminUsername;
  }


  public CreateDbaasServicePgRequest version(DbaasPgTargetVersions version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DbaasPgTargetVersions getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(DbaasPgTargetVersions version) {
    this.version = version;
  }


  public CreateDbaasServicePgRequest plan(String plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Subscription plan
   * @return plan
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PLAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPlan() {
    return plan;
  }


  @JsonProperty(JSON_PROPERTY_PLAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlan(String plan) {
    this.plan = plan;
  }


  public CreateDbaasServicePgRequest workMem(Long workMem) {
    this.workMem = workMem;
    return this;
  }

   /**
   * Sets the maximum amount of memory to be used by a query operation (such as a sort or hash table) before writing to temporary disk files, in MB. Default is 1MB + 0.075% of total RAM (up to 32MB).
   * minimum: 1
   * maximum: 1024
   * @return workMem
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WORK_MEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getWorkMem() {
    return workMem;
  }


  @JsonProperty(JSON_PROPERTY_WORK_MEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorkMem(Long workMem) {
    this.workMem = workMem;
  }


  public CreateDbaasServicePgRequest sharedBuffersPercentage(Long sharedBuffersPercentage) {
    this.sharedBuffersPercentage = sharedBuffersPercentage;
    return this;
  }

   /**
   * Percentage of total RAM that the database server uses for shared memory buffers. Valid range is 20-60 (float), which corresponds to 20% - 60%. This setting adjusts the shared_buffers configuration value.
   * minimum: 20
   * maximum: 60
   * @return sharedBuffersPercentage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARED_BUFFERS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSharedBuffersPercentage() {
    return sharedBuffersPercentage;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_BUFFERS_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedBuffersPercentage(Long sharedBuffersPercentage) {
    this.sharedBuffersPercentage = sharedBuffersPercentage;
  }


  public CreateDbaasServicePgRequest pgSettings(JsonSchemaPg pgSettings) {
    this.pgSettings = pgSettings;
    return this;
  }

   /**
   * Get pgSettings
   * @return pgSettings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PG_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonSchemaPg getPgSettings() {
    return pgSettings;
  }


  @JsonProperty(JSON_PROPERTY_PG_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPgSettings(JsonSchemaPg pgSettings) {
    this.pgSettings = pgSettings;
  }


  public CreateDbaasServicePgRequest adminPassword(String adminPassword) {
    this.adminPassword = adminPassword;
    return this;
  }

   /**
   * Custom password for admin user. Defaults to random string. This must be set only when a new service is being created.
   * @return adminPassword
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADMIN_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdminPassword() {
    return adminPassword;
  }


  @JsonProperty(JSON_PROPERTY_ADMIN_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdminPassword(String adminPassword) {
    this.adminPassword = adminPassword;
  }


  public CreateDbaasServicePgRequest migration(UpdateDbaasServiceMysqlRequestMigration migration) {
    this.migration = migration;
    return this;
  }

   /**
   * Get migration
   * @return migration
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIGRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdateDbaasServiceMysqlRequestMigration getMigration() {
    return migration;
  }


  @JsonProperty(JSON_PROPERTY_MIGRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMigration(UpdateDbaasServiceMysqlRequestMigration migration) {
    this.migration = migration;
  }


  /**
   * Return true if this create_dbaas_service_pg_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDbaasServicePgRequest createDbaasServicePgRequest = (CreateDbaasServicePgRequest) o;
    return Objects.equals(this.pgbouncerSettings, createDbaasServicePgRequest.pgbouncerSettings) &&
        Objects.equals(this.backupSchedule, createDbaasServicePgRequest.backupSchedule) &&
        Objects.equals(this.variant, createDbaasServicePgRequest.variant) &&
        Objects.equals(this.integrations, createDbaasServicePgRequest.integrations) &&
        Objects.equals(this.timescaledbSettings, createDbaasServicePgRequest.timescaledbSettings) &&
        Objects.equals(this.ipFilter, createDbaasServicePgRequest.ipFilter) &&
        Objects.equals(this.terminationProtection, createDbaasServicePgRequest.terminationProtection) &&
        Objects.equals(this.forkFromService, createDbaasServicePgRequest.forkFromService) &&
        Objects.equals(this.synchronousReplication, createDbaasServicePgRequest.synchronousReplication) &&
        Objects.equals(this.recoveryBackupTime, createDbaasServicePgRequest.recoveryBackupTime) &&
        Objects.equals(this.pglookoutSettings, createDbaasServicePgRequest.pglookoutSettings) &&
        Objects.equals(this.maintenance, createDbaasServicePgRequest.maintenance) &&
        Objects.equals(this.adminUsername, createDbaasServicePgRequest.adminUsername) &&
        Objects.equals(this.version, createDbaasServicePgRequest.version) &&
        Objects.equals(this.plan, createDbaasServicePgRequest.plan) &&
        Objects.equals(this.workMem, createDbaasServicePgRequest.workMem) &&
        Objects.equals(this.sharedBuffersPercentage, createDbaasServicePgRequest.sharedBuffersPercentage) &&
        Objects.equals(this.pgSettings, createDbaasServicePgRequest.pgSettings) &&
        Objects.equals(this.adminPassword, createDbaasServicePgRequest.adminPassword) &&
        Objects.equals(this.migration, createDbaasServicePgRequest.migration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pgbouncerSettings, backupSchedule, variant, integrations, timescaledbSettings, ipFilter, terminationProtection, forkFromService, synchronousReplication, recoveryBackupTime, pglookoutSettings, maintenance, adminUsername, version, plan, workMem, sharedBuffersPercentage, pgSettings, adminPassword, migration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDbaasServicePgRequest {\n");
    sb.append("    pgbouncerSettings: ").append(toIndentedString(pgbouncerSettings)).append("\n");
    sb.append("    backupSchedule: ").append(toIndentedString(backupSchedule)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    timescaledbSettings: ").append(toIndentedString(timescaledbSettings)).append("\n");
    sb.append("    ipFilter: ").append(toIndentedString(ipFilter)).append("\n");
    sb.append("    terminationProtection: ").append(toIndentedString(terminationProtection)).append("\n");
    sb.append("    forkFromService: ").append(toIndentedString(forkFromService)).append("\n");
    sb.append("    synchronousReplication: ").append(toIndentedString(synchronousReplication)).append("\n");
    sb.append("    recoveryBackupTime: ").append(toIndentedString(recoveryBackupTime)).append("\n");
    sb.append("    pglookoutSettings: ").append(toIndentedString(pglookoutSettings)).append("\n");
    sb.append("    maintenance: ").append(toIndentedString(maintenance)).append("\n");
    sb.append("    adminUsername: ").append(toIndentedString(adminUsername)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    workMem: ").append(toIndentedString(workMem)).append("\n");
    sb.append("    sharedBuffersPercentage: ").append(toIndentedString(sharedBuffersPercentage)).append("\n");
    sb.append("    pgSettings: ").append(toIndentedString(pgSettings)).append("\n");
    sb.append("    adminPassword: ").append(toIndentedString(adminPassword)).append("\n");
    sb.append("    migration: ").append(toIndentedString(migration)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `pgbouncer-settings` to the URL query string
    if (getPgbouncerSettings() != null) {
      joiner.add(getPgbouncerSettings().toUrlQueryString(prefix + "pgbouncer-settings" + suffix));
    }

    // add `backup-schedule` to the URL query string
    if (getBackupSchedule() != null) {
      joiner.add(getBackupSchedule().toUrlQueryString(prefix + "backup-schedule" + suffix));
    }

    // add `variant` to the URL query string
    if (getVariant() != null) {
      joiner.add(String.format("%svariant%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVariant()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `integrations` to the URL query string
    if (getIntegrations() != null) {
      for (int i = 0; i < getIntegrations().size(); i++) {
        if (getIntegrations().get(i) != null) {
          joiner.add(getIntegrations().get(i).toUrlQueryString(String.format("%sintegrations%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `timescaledb-settings` to the URL query string
    if (getTimescaledbSettings() != null) {
      joiner.add(getTimescaledbSettings().toUrlQueryString(prefix + "timescaledb-settings" + suffix));
    }

    // add `ip-filter` to the URL query string
    if (getIpFilter() != null) {
      for (int i = 0; i < getIpFilter().size(); i++) {
        joiner.add(String.format("%sip-filter%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getIpFilter().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `termination-protection` to the URL query string
    if (getTerminationProtection() != null) {
      joiner.add(String.format("%stermination-protection%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTerminationProtection()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `fork-from-service` to the URL query string
    if (getForkFromService() != null) {
      joiner.add(String.format("%sfork-from-service%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getForkFromService()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `synchronous-replication` to the URL query string
    if (getSynchronousReplication() != null) {
      joiner.add(String.format("%ssynchronous-replication%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSynchronousReplication()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `recovery-backup-time` to the URL query string
    if (getRecoveryBackupTime() != null) {
      joiner.add(String.format("%srecovery-backup-time%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecoveryBackupTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `pglookout-settings` to the URL query string
    if (getPglookoutSettings() != null) {
      joiner.add(getPglookoutSettings().toUrlQueryString(prefix + "pglookout-settings" + suffix));
    }

    // add `maintenance` to the URL query string
    if (getMaintenance() != null) {
      joiner.add(getMaintenance().toUrlQueryString(prefix + "maintenance" + suffix));
    }

    // add `admin-username` to the URL query string
    if (getAdminUsername() != null) {
      joiner.add(String.format("%sadmin-username%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAdminUsername()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `plan` to the URL query string
    if (getPlan() != null) {
      joiner.add(String.format("%splan%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlan()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `work-mem` to the URL query string
    if (getWorkMem() != null) {
      joiner.add(String.format("%swork-mem%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWorkMem()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `shared-buffers-percentage` to the URL query string
    if (getSharedBuffersPercentage() != null) {
      joiner.add(String.format("%sshared-buffers-percentage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSharedBuffersPercentage()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `pg-settings` to the URL query string
    if (getPgSettings() != null) {
      joiner.add(getPgSettings().toUrlQueryString(prefix + "pg-settings" + suffix));
    }

    // add `admin-password` to the URL query string
    if (getAdminPassword() != null) {
      joiner.add(String.format("%sadmin-password%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAdminPassword()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `migration` to the URL query string
    if (getMigration() != null) {
      joiner.add(getMigration().toUrlQueryString(prefix + "migration" + suffix));
    }

    return joiner.toString();
  }
}

