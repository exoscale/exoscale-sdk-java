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
import com.exoscale.exoscale4j.model.JsonSchemaMysql;
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
 * CreateDbaasServiceMysqlRequest
 */
@JsonPropertyOrder({
  CreateDbaasServiceMysqlRequest.JSON_PROPERTY_BACKUP_SCHEDULE,
  CreateDbaasServiceMysqlRequest.JSON_PROPERTY_INTEGRATIONS,
  CreateDbaasServiceMysqlRequest.JSON_PROPERTY_IP_FILTER,
  CreateDbaasServiceMysqlRequest.JSON_PROPERTY_TERMINATION_PROTECTION,
  CreateDbaasServiceMysqlRequest.JSON_PROPERTY_FORK_FROM_SERVICE,
  CreateDbaasServiceMysqlRequest.JSON_PROPERTY_RECOVERY_BACKUP_TIME,
  CreateDbaasServiceMysqlRequest.JSON_PROPERTY_MYSQL_SETTINGS,
  CreateDbaasServiceMysqlRequest.JSON_PROPERTY_MAINTENANCE,
  CreateDbaasServiceMysqlRequest.JSON_PROPERTY_ADMIN_USERNAME,
  CreateDbaasServiceMysqlRequest.JSON_PROPERTY_VERSION,
  CreateDbaasServiceMysqlRequest.JSON_PROPERTY_PLAN,
  CreateDbaasServiceMysqlRequest.JSON_PROPERTY_ADMIN_PASSWORD,
  CreateDbaasServiceMysqlRequest.JSON_PROPERTY_MIGRATION,
  CreateDbaasServiceMysqlRequest.JSON_PROPERTY_BINLOG_RETENTION_PERIOD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-25T13:26:02.309598Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateDbaasServiceMysqlRequest {
  public static final String JSON_PROPERTY_BACKUP_SCHEDULE = "backup-schedule";
  private UpdateDbaasServiceMysqlRequestBackupSchedule backupSchedule;

  public static final String JSON_PROPERTY_INTEGRATIONS = "integrations";
  private List<CreateDbaasServiceMysqlRequestIntegrationsInner> integrations;

  public static final String JSON_PROPERTY_IP_FILTER = "ip-filter";
  private List<String> ipFilter;

  public static final String JSON_PROPERTY_TERMINATION_PROTECTION = "termination-protection";
  private Boolean terminationProtection;

  public static final String JSON_PROPERTY_FORK_FROM_SERVICE = "fork-from-service";
  private String forkFromService;

  public static final String JSON_PROPERTY_RECOVERY_BACKUP_TIME = "recovery-backup-time";
  private String recoveryBackupTime;

  public static final String JSON_PROPERTY_MYSQL_SETTINGS = "mysql-settings";
  private JsonSchemaMysql mysqlSettings;

  public static final String JSON_PROPERTY_MAINTENANCE = "maintenance";
  private UpdateDbaasServiceMysqlRequestMaintenance maintenance;

  public static final String JSON_PROPERTY_ADMIN_USERNAME = "admin-username";
  private String adminUsername;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_PLAN = "plan";
  private String plan;

  public static final String JSON_PROPERTY_ADMIN_PASSWORD = "admin-password";
  private String adminPassword;

  public static final String JSON_PROPERTY_MIGRATION = "migration";
  private UpdateDbaasServiceMysqlRequestMigration migration;

  public static final String JSON_PROPERTY_BINLOG_RETENTION_PERIOD = "binlog-retention-period";
  private Long binlogRetentionPeriod;

  public CreateDbaasServiceMysqlRequest() { 
  }

  public CreateDbaasServiceMysqlRequest backupSchedule(UpdateDbaasServiceMysqlRequestBackupSchedule backupSchedule) {
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


  public CreateDbaasServiceMysqlRequest integrations(List<CreateDbaasServiceMysqlRequestIntegrationsInner> integrations) {
    this.integrations = integrations;
    return this;
  }

  public CreateDbaasServiceMysqlRequest addIntegrationsItem(CreateDbaasServiceMysqlRequestIntegrationsInner integrationsItem) {
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


  public CreateDbaasServiceMysqlRequest ipFilter(List<String> ipFilter) {
    this.ipFilter = ipFilter;
    return this;
  }

  public CreateDbaasServiceMysqlRequest addIpFilterItem(String ipFilterItem) {
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


  public CreateDbaasServiceMysqlRequest terminationProtection(Boolean terminationProtection) {
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


  public CreateDbaasServiceMysqlRequest forkFromService(String forkFromService) {
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


  public CreateDbaasServiceMysqlRequest recoveryBackupTime(String recoveryBackupTime) {
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


  public CreateDbaasServiceMysqlRequest mysqlSettings(JsonSchemaMysql mysqlSettings) {
    this.mysqlSettings = mysqlSettings;
    return this;
  }

   /**
   * Get mysqlSettings
   * @return mysqlSettings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MYSQL_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonSchemaMysql getMysqlSettings() {
    return mysqlSettings;
  }


  @JsonProperty(JSON_PROPERTY_MYSQL_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMysqlSettings(JsonSchemaMysql mysqlSettings) {
    this.mysqlSettings = mysqlSettings;
  }


  public CreateDbaasServiceMysqlRequest maintenance(UpdateDbaasServiceMysqlRequestMaintenance maintenance) {
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


  public CreateDbaasServiceMysqlRequest adminUsername(String adminUsername) {
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


  public CreateDbaasServiceMysqlRequest version(String version) {
    this.version = version;
    return this;
  }

   /**
   * MySQL major version
   * @return version
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  public CreateDbaasServiceMysqlRequest plan(String plan) {
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


  public CreateDbaasServiceMysqlRequest adminPassword(String adminPassword) {
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


  public CreateDbaasServiceMysqlRequest migration(UpdateDbaasServiceMysqlRequestMigration migration) {
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


  public CreateDbaasServiceMysqlRequest binlogRetentionPeriod(Long binlogRetentionPeriod) {
    this.binlogRetentionPeriod = binlogRetentionPeriod;
    return this;
  }

   /**
   * The minimum amount of time in seconds to keep binlog entries before deletion. This may be extended for services that require binlog entries for longer than the default for example if using the MySQL Debezium Kafka connector.
   * minimum: 600
   * maximum: 86400
   * @return binlogRetentionPeriod
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BINLOG_RETENTION_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBinlogRetentionPeriod() {
    return binlogRetentionPeriod;
  }


  @JsonProperty(JSON_PROPERTY_BINLOG_RETENTION_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBinlogRetentionPeriod(Long binlogRetentionPeriod) {
    this.binlogRetentionPeriod = binlogRetentionPeriod;
  }


  /**
   * Return true if this create_dbaas_service_mysql_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDbaasServiceMysqlRequest createDbaasServiceMysqlRequest = (CreateDbaasServiceMysqlRequest) o;
    return Objects.equals(this.backupSchedule, createDbaasServiceMysqlRequest.backupSchedule) &&
        Objects.equals(this.integrations, createDbaasServiceMysqlRequest.integrations) &&
        Objects.equals(this.ipFilter, createDbaasServiceMysqlRequest.ipFilter) &&
        Objects.equals(this.terminationProtection, createDbaasServiceMysqlRequest.terminationProtection) &&
        Objects.equals(this.forkFromService, createDbaasServiceMysqlRequest.forkFromService) &&
        Objects.equals(this.recoveryBackupTime, createDbaasServiceMysqlRequest.recoveryBackupTime) &&
        Objects.equals(this.mysqlSettings, createDbaasServiceMysqlRequest.mysqlSettings) &&
        Objects.equals(this.maintenance, createDbaasServiceMysqlRequest.maintenance) &&
        Objects.equals(this.adminUsername, createDbaasServiceMysqlRequest.adminUsername) &&
        Objects.equals(this.version, createDbaasServiceMysqlRequest.version) &&
        Objects.equals(this.plan, createDbaasServiceMysqlRequest.plan) &&
        Objects.equals(this.adminPassword, createDbaasServiceMysqlRequest.adminPassword) &&
        Objects.equals(this.migration, createDbaasServiceMysqlRequest.migration) &&
        Objects.equals(this.binlogRetentionPeriod, createDbaasServiceMysqlRequest.binlogRetentionPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupSchedule, integrations, ipFilter, terminationProtection, forkFromService, recoveryBackupTime, mysqlSettings, maintenance, adminUsername, version, plan, adminPassword, migration, binlogRetentionPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDbaasServiceMysqlRequest {\n");
    sb.append("    backupSchedule: ").append(toIndentedString(backupSchedule)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    ipFilter: ").append(toIndentedString(ipFilter)).append("\n");
    sb.append("    terminationProtection: ").append(toIndentedString(terminationProtection)).append("\n");
    sb.append("    forkFromService: ").append(toIndentedString(forkFromService)).append("\n");
    sb.append("    recoveryBackupTime: ").append(toIndentedString(recoveryBackupTime)).append("\n");
    sb.append("    mysqlSettings: ").append(toIndentedString(mysqlSettings)).append("\n");
    sb.append("    maintenance: ").append(toIndentedString(maintenance)).append("\n");
    sb.append("    adminUsername: ").append(toIndentedString(adminUsername)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    adminPassword: ").append(toIndentedString(adminPassword)).append("\n");
    sb.append("    migration: ").append(toIndentedString(migration)).append("\n");
    sb.append("    binlogRetentionPeriod: ").append(toIndentedString(binlogRetentionPeriod)).append("\n");
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

    // add `backup-schedule` to the URL query string
    if (getBackupSchedule() != null) {
      joiner.add(getBackupSchedule().toUrlQueryString(prefix + "backup-schedule" + suffix));
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

    // add `recovery-backup-time` to the URL query string
    if (getRecoveryBackupTime() != null) {
      joiner.add(String.format("%srecovery-backup-time%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecoveryBackupTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `mysql-settings` to the URL query string
    if (getMysqlSettings() != null) {
      joiner.add(getMysqlSettings().toUrlQueryString(prefix + "mysql-settings" + suffix));
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

    // add `admin-password` to the URL query string
    if (getAdminPassword() != null) {
      joiner.add(String.format("%sadmin-password%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAdminPassword()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `migration` to the URL query string
    if (getMigration() != null) {
      joiner.add(getMigration().toUrlQueryString(prefix + "migration" + suffix));
    }

    // add `binlog-retention-period` to the URL query string
    if (getBinlogRetentionPeriod() != null) {
      joiner.add(String.format("%sbinlog-retention-period%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBinlogRetentionPeriod()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

