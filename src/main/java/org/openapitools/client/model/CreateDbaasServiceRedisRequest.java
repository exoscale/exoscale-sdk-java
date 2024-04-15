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


package org.openapitools.client.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.JsonSchemaRedis;
import org.openapitools.client.model.UpdateDbaasServiceMysqlRequestMaintenance;
import org.openapitools.client.model.UpdateDbaasServiceMysqlRequestMigration;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateDbaasServiceRedisRequest
 */
@JsonPropertyOrder({
  CreateDbaasServiceRedisRequest.JSON_PROPERTY_MAINTENANCE,
  CreateDbaasServiceRedisRequest.JSON_PROPERTY_PLAN,
  CreateDbaasServiceRedisRequest.JSON_PROPERTY_TERMINATION_PROTECTION,
  CreateDbaasServiceRedisRequest.JSON_PROPERTY_IP_FILTER,
  CreateDbaasServiceRedisRequest.JSON_PROPERTY_MIGRATION,
  CreateDbaasServiceRedisRequest.JSON_PROPERTY_REDIS_SETTINGS,
  CreateDbaasServiceRedisRequest.JSON_PROPERTY_FORK_FROM_SERVICE,
  CreateDbaasServiceRedisRequest.JSON_PROPERTY_RECOVERY_BACKUP_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-10T11:00:33.694281+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class CreateDbaasServiceRedisRequest {
  public static final String JSON_PROPERTY_MAINTENANCE = "maintenance";
  private UpdateDbaasServiceMysqlRequestMaintenance maintenance;

  public static final String JSON_PROPERTY_PLAN = "plan";
  private String plan;

  public static final String JSON_PROPERTY_TERMINATION_PROTECTION = "termination-protection";
  private Boolean terminationProtection;

  public static final String JSON_PROPERTY_IP_FILTER = "ip-filter";
  private List<String> ipFilter;

  public static final String JSON_PROPERTY_MIGRATION = "migration";
  private UpdateDbaasServiceMysqlRequestMigration migration;

  public static final String JSON_PROPERTY_REDIS_SETTINGS = "redis-settings";
  private JsonSchemaRedis redisSettings;

  public static final String JSON_PROPERTY_FORK_FROM_SERVICE = "fork-from-service";
  private String forkFromService;

  public static final String JSON_PROPERTY_RECOVERY_BACKUP_NAME = "recovery-backup-name";
  private String recoveryBackupName;

  public CreateDbaasServiceRedisRequest() { 
  }

  public CreateDbaasServiceRedisRequest maintenance(UpdateDbaasServiceMysqlRequestMaintenance maintenance) {
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


  public CreateDbaasServiceRedisRequest plan(String plan) {
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


  public CreateDbaasServiceRedisRequest terminationProtection(Boolean terminationProtection) {
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


  public CreateDbaasServiceRedisRequest ipFilter(List<String> ipFilter) {
    this.ipFilter = ipFilter;
    return this;
  }

  public CreateDbaasServiceRedisRequest addIpFilterItem(String ipFilterItem) {
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


  public CreateDbaasServiceRedisRequest migration(UpdateDbaasServiceMysqlRequestMigration migration) {
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


  public CreateDbaasServiceRedisRequest redisSettings(JsonSchemaRedis redisSettings) {
    this.redisSettings = redisSettings;
    return this;
  }

   /**
   * Get redisSettings
   * @return redisSettings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDIS_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonSchemaRedis getRedisSettings() {
    return redisSettings;
  }


  @JsonProperty(JSON_PROPERTY_REDIS_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedisSettings(JsonSchemaRedis redisSettings) {
    this.redisSettings = redisSettings;
  }


  public CreateDbaasServiceRedisRequest forkFromService(String forkFromService) {
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


  public CreateDbaasServiceRedisRequest recoveryBackupName(String recoveryBackupName) {
    this.recoveryBackupName = recoveryBackupName;
    return this;
  }

   /**
   * Name of a backup to recover from for services that support backup names
   * @return recoveryBackupName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECOVERY_BACKUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecoveryBackupName() {
    return recoveryBackupName;
  }


  @JsonProperty(JSON_PROPERTY_RECOVERY_BACKUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecoveryBackupName(String recoveryBackupName) {
    this.recoveryBackupName = recoveryBackupName;
  }


  /**
   * Return true if this create_dbaas_service_redis_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDbaasServiceRedisRequest createDbaasServiceRedisRequest = (CreateDbaasServiceRedisRequest) o;
    return Objects.equals(this.maintenance, createDbaasServiceRedisRequest.maintenance) &&
        Objects.equals(this.plan, createDbaasServiceRedisRequest.plan) &&
        Objects.equals(this.terminationProtection, createDbaasServiceRedisRequest.terminationProtection) &&
        Objects.equals(this.ipFilter, createDbaasServiceRedisRequest.ipFilter) &&
        Objects.equals(this.migration, createDbaasServiceRedisRequest.migration) &&
        Objects.equals(this.redisSettings, createDbaasServiceRedisRequest.redisSettings) &&
        Objects.equals(this.forkFromService, createDbaasServiceRedisRequest.forkFromService) &&
        Objects.equals(this.recoveryBackupName, createDbaasServiceRedisRequest.recoveryBackupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maintenance, plan, terminationProtection, ipFilter, migration, redisSettings, forkFromService, recoveryBackupName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDbaasServiceRedisRequest {\n");
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

    // add `migration` to the URL query string
    if (getMigration() != null) {
      joiner.add(getMigration().toUrlQueryString(prefix + "migration" + suffix));
    }

    // add `redis-settings` to the URL query string
    if (getRedisSettings() != null) {
      joiner.add(getRedisSettings().toUrlQueryString(prefix + "redis-settings" + suffix));
    }

    // add `fork-from-service` to the URL query string
    if (getForkFromService() != null) {
      joiner.add(String.format("%sfork-from-service%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getForkFromService()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `recovery-backup-name` to the URL query string
    if (getRecoveryBackupName() != null) {
      joiner.add(String.format("%srecovery-backup-name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecoveryBackupName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
