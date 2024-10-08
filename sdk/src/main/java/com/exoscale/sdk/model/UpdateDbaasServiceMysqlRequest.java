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

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.exoscale.sdk.model.JsonSchemaMysql;
import com.exoscale.sdk.model.UpdateDbaasServiceMysqlRequestBackupSchedule;
import com.exoscale.sdk.model.UpdateDbaasServiceMysqlRequestMaintenance;
import com.exoscale.sdk.model.UpdateDbaasServiceMysqlRequestMigration;
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
 * UpdateDbaasServiceMysqlRequest
 */
@JsonPropertyOrder({
  UpdateDbaasServiceMysqlRequest.JSON_PROPERTY_MAINTENANCE,
  UpdateDbaasServiceMysqlRequest.JSON_PROPERTY_PLAN,
  UpdateDbaasServiceMysqlRequest.JSON_PROPERTY_TERMINATION_PROTECTION,
  UpdateDbaasServiceMysqlRequest.JSON_PROPERTY_IP_FILTER,
  UpdateDbaasServiceMysqlRequest.JSON_PROPERTY_MYSQL_SETTINGS,
  UpdateDbaasServiceMysqlRequest.JSON_PROPERTY_MIGRATION,
  UpdateDbaasServiceMysqlRequest.JSON_PROPERTY_BINLOG_RETENTION_PERIOD,
  UpdateDbaasServiceMysqlRequest.JSON_PROPERTY_BACKUP_SCHEDULE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class UpdateDbaasServiceMysqlRequest {
  public static final String JSON_PROPERTY_MAINTENANCE = "maintenance";
  private UpdateDbaasServiceMysqlRequestMaintenance maintenance;

  public static final String JSON_PROPERTY_PLAN = "plan";
  private String plan;

  public static final String JSON_PROPERTY_TERMINATION_PROTECTION = "termination-protection";
  private Boolean terminationProtection;

  public static final String JSON_PROPERTY_IP_FILTER = "ip-filter";
  private List<String> ipFilter;

  public static final String JSON_PROPERTY_MYSQL_SETTINGS = "mysql-settings";
  private JsonSchemaMysql mysqlSettings;

  public static final String JSON_PROPERTY_MIGRATION = "migration";
  private UpdateDbaasServiceMysqlRequestMigration migration;

  public static final String JSON_PROPERTY_BINLOG_RETENTION_PERIOD = "binlog-retention-period";
  private Long binlogRetentionPeriod;

  public static final String JSON_PROPERTY_BACKUP_SCHEDULE = "backup-schedule";
  private UpdateDbaasServiceMysqlRequestBackupSchedule backupSchedule;

  public UpdateDbaasServiceMysqlRequest() { 
  }

  public UpdateDbaasServiceMysqlRequest maintenance(UpdateDbaasServiceMysqlRequestMaintenance maintenance) {
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


  public UpdateDbaasServiceMysqlRequest plan(String plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Subscription plan
   * @return plan
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlan() {
    return plan;
  }


  @JsonProperty(JSON_PROPERTY_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlan(String plan) {
    this.plan = plan;
  }


  public UpdateDbaasServiceMysqlRequest terminationProtection(Boolean terminationProtection) {
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


  public UpdateDbaasServiceMysqlRequest ipFilter(List<String> ipFilter) {
    this.ipFilter = ipFilter;
    return this;
  }

  public UpdateDbaasServiceMysqlRequest addIpFilterItem(String ipFilterItem) {
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


  public UpdateDbaasServiceMysqlRequest mysqlSettings(JsonSchemaMysql mysqlSettings) {
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


  public UpdateDbaasServiceMysqlRequest migration(UpdateDbaasServiceMysqlRequestMigration migration) {
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


  public UpdateDbaasServiceMysqlRequest binlogRetentionPeriod(Long binlogRetentionPeriod) {
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


  public UpdateDbaasServiceMysqlRequest backupSchedule(UpdateDbaasServiceMysqlRequestBackupSchedule backupSchedule) {
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


  /**
   * Return true if this update_dbaas_service_mysql_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDbaasServiceMysqlRequest updateDbaasServiceMysqlRequest = (UpdateDbaasServiceMysqlRequest) o;
    return Objects.equals(this.maintenance, updateDbaasServiceMysqlRequest.maintenance) &&
        Objects.equals(this.plan, updateDbaasServiceMysqlRequest.plan) &&
        Objects.equals(this.terminationProtection, updateDbaasServiceMysqlRequest.terminationProtection) &&
        Objects.equals(this.ipFilter, updateDbaasServiceMysqlRequest.ipFilter) &&
        Objects.equals(this.mysqlSettings, updateDbaasServiceMysqlRequest.mysqlSettings) &&
        Objects.equals(this.migration, updateDbaasServiceMysqlRequest.migration) &&
        Objects.equals(this.binlogRetentionPeriod, updateDbaasServiceMysqlRequest.binlogRetentionPeriod) &&
        Objects.equals(this.backupSchedule, updateDbaasServiceMysqlRequest.backupSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maintenance, plan, terminationProtection, ipFilter, mysqlSettings, migration, binlogRetentionPeriod, backupSchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDbaasServiceMysqlRequest {\n");
    sb.append("    maintenance: ").append(toIndentedString(maintenance)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    terminationProtection: ").append(toIndentedString(terminationProtection)).append("\n");
    sb.append("    ipFilter: ").append(toIndentedString(ipFilter)).append("\n");
    sb.append("    mysqlSettings: ").append(toIndentedString(mysqlSettings)).append("\n");
    sb.append("    migration: ").append(toIndentedString(migration)).append("\n");
    sb.append("    binlogRetentionPeriod: ").append(toIndentedString(binlogRetentionPeriod)).append("\n");
    sb.append("    backupSchedule: ").append(toIndentedString(backupSchedule)).append("\n");
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

    // add `maintenance` to the URL query string
    if (getMaintenance() != null) {
      joiner.add(getMaintenance().toUrlQueryString(prefix + "maintenance" + suffix));
    }

    // add `plan` to the URL query string
    if (getPlan() != null) {
      joiner.add(String.format("%splan%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlan()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `termination-protection` to the URL query string
    if (getTerminationProtection() != null) {
      joiner.add(String.format("%stermination-protection%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTerminationProtection()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ip-filter` to the URL query string
    if (getIpFilter() != null) {
      for (int i = 0; i < getIpFilter().size(); i++) {
        joiner.add(String.format("%sip-filter%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getIpFilter().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `mysql-settings` to the URL query string
    if (getMysqlSettings() != null) {
      joiner.add(getMysqlSettings().toUrlQueryString(prefix + "mysql-settings" + suffix));
    }

    // add `migration` to the URL query string
    if (getMigration() != null) {
      joiner.add(getMigration().toUrlQueryString(prefix + "migration" + suffix));
    }

    // add `binlog-retention-period` to the URL query string
    if (getBinlogRetentionPeriod() != null) {
      joiner.add(String.format("%sbinlog-retention-period%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBinlogRetentionPeriod()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `backup-schedule` to the URL query string
    if (getBackupSchedule() != null) {
      joiner.add(getBackupSchedule().toUrlQueryString(prefix + "backup-schedule" + suffix));
    }

    return joiner.toString();
  }
}

