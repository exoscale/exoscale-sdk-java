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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DBaaS plan backup config
 */
@JsonPropertyOrder({
  DbaasBackupConfig.JSON_PROPERTY_MAX_COUNT,
  DbaasBackupConfig.JSON_PROPERTY_INTERVAL,
  DbaasBackupConfig.JSON_PROPERTY_RECOVERY_MODE,
  DbaasBackupConfig.JSON_PROPERTY_FREQUENT_INTERVAL_MINUTES,
  DbaasBackupConfig.JSON_PROPERTY_FREQUENT_OLDEST_AGE_MINUTES,
  DbaasBackupConfig.JSON_PROPERTY_INFREQUENT_INTERVAL_MINUTES,
  DbaasBackupConfig.JSON_PROPERTY_INFREQUENT_OLDEST_AGE_MINUTES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-03T20:04:17.479783+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class DbaasBackupConfig {
  public static final String JSON_PROPERTY_MAX_COUNT = "max-count";
  private Long maxCount;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private Long interval;

  public static final String JSON_PROPERTY_RECOVERY_MODE = "recovery-mode";
  private String recoveryMode;

  public static final String JSON_PROPERTY_FREQUENT_INTERVAL_MINUTES = "frequent-interval-minutes";
  private Long frequentIntervalMinutes;

  public static final String JSON_PROPERTY_FREQUENT_OLDEST_AGE_MINUTES = "frequent-oldest-age-minutes";
  private Long frequentOldestAgeMinutes;

  public static final String JSON_PROPERTY_INFREQUENT_INTERVAL_MINUTES = "infrequent-interval-minutes";
  private Long infrequentIntervalMinutes;

  public static final String JSON_PROPERTY_INFREQUENT_OLDEST_AGE_MINUTES = "infrequent-oldest-age-minutes";
  private Long infrequentOldestAgeMinutes;

  public DbaasBackupConfig() { 
  }

  @JsonCreator
  public DbaasBackupConfig(
    @JsonProperty(JSON_PROPERTY_MAX_COUNT) Long maxCount, 
    @JsonProperty(JSON_PROPERTY_INTERVAL) Long interval, 
    @JsonProperty(JSON_PROPERTY_RECOVERY_MODE) String recoveryMode, 
    @JsonProperty(JSON_PROPERTY_FREQUENT_INTERVAL_MINUTES) Long frequentIntervalMinutes, 
    @JsonProperty(JSON_PROPERTY_FREQUENT_OLDEST_AGE_MINUTES) Long frequentOldestAgeMinutes, 
    @JsonProperty(JSON_PROPERTY_INFREQUENT_INTERVAL_MINUTES) Long infrequentIntervalMinutes, 
    @JsonProperty(JSON_PROPERTY_INFREQUENT_OLDEST_AGE_MINUTES) Long infrequentOldestAgeMinutes
  ) {
  this();
    this.maxCount = maxCount;
    this.interval = interval;
    this.recoveryMode = recoveryMode;
    this.frequentIntervalMinutes = frequentIntervalMinutes;
    this.frequentOldestAgeMinutes = frequentOldestAgeMinutes;
    this.infrequentIntervalMinutes = infrequentIntervalMinutes;
    this.infrequentOldestAgeMinutes = infrequentOldestAgeMinutes;
  }

   /**
   * Maximum number of backups to keep. Zero when no backups are created.
   * minimum: 0
   * @return maxCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaxCount() {
    return maxCount;
  }




   /**
   * The interval, in hours, at which backups are generated.                                             For some services, like PostgreSQL, this is the interval                                             at which full snapshots are taken and continuous incremental                                             backup stream is maintained in addition to that.
   * minimum: 0
   * @return interval
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getInterval() {
    return interval;
  }




   /**
   * Mechanism how backups can be restored. &#39;regular&#39;                                             means a backup is restored as is so that the system                                             is restored to the state it was when the backup was generated.                                             &#39;pitr&#39; means point-in-time-recovery, which allows restoring the system to any state since the first available full snapshot.
   * @return recoveryMode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECOVERY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecoveryMode() {
    return recoveryMode;
  }




   /**
   * Interval of taking a frequent backup in service types supporting different backup schedules
   * minimum: 0
   * @return frequentIntervalMinutes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FREQUENT_INTERVAL_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFrequentIntervalMinutes() {
    return frequentIntervalMinutes;
  }




   /**
   * Maximum age of the oldest frequent backup in service types supporting different backup schedules
   * minimum: 0
   * @return frequentOldestAgeMinutes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FREQUENT_OLDEST_AGE_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFrequentOldestAgeMinutes() {
    return frequentOldestAgeMinutes;
  }




   /**
   * Interval of taking a frequent backup in service types supporting different backup schedules
   * minimum: 0
   * @return infrequentIntervalMinutes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFREQUENT_INTERVAL_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getInfrequentIntervalMinutes() {
    return infrequentIntervalMinutes;
  }




   /**
   * Maximum age of the oldest infrequent backup in service types supporting different backup schedules
   * minimum: 0
   * @return infrequentOldestAgeMinutes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INFREQUENT_OLDEST_AGE_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getInfrequentOldestAgeMinutes() {
    return infrequentOldestAgeMinutes;
  }




  /**
   * Return true if this dbaas-backup-config object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasBackupConfig dbaasBackupConfig = (DbaasBackupConfig) o;
    return Objects.equals(this.maxCount, dbaasBackupConfig.maxCount) &&
        Objects.equals(this.interval, dbaasBackupConfig.interval) &&
        Objects.equals(this.recoveryMode, dbaasBackupConfig.recoveryMode) &&
        Objects.equals(this.frequentIntervalMinutes, dbaasBackupConfig.frequentIntervalMinutes) &&
        Objects.equals(this.frequentOldestAgeMinutes, dbaasBackupConfig.frequentOldestAgeMinutes) &&
        Objects.equals(this.infrequentIntervalMinutes, dbaasBackupConfig.infrequentIntervalMinutes) &&
        Objects.equals(this.infrequentOldestAgeMinutes, dbaasBackupConfig.infrequentOldestAgeMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCount, interval, recoveryMode, frequentIntervalMinutes, frequentOldestAgeMinutes, infrequentIntervalMinutes, infrequentOldestAgeMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasBackupConfig {\n");
    sb.append("    maxCount: ").append(toIndentedString(maxCount)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    recoveryMode: ").append(toIndentedString(recoveryMode)).append("\n");
    sb.append("    frequentIntervalMinutes: ").append(toIndentedString(frequentIntervalMinutes)).append("\n");
    sb.append("    frequentOldestAgeMinutes: ").append(toIndentedString(frequentOldestAgeMinutes)).append("\n");
    sb.append("    infrequentIntervalMinutes: ").append(toIndentedString(infrequentIntervalMinutes)).append("\n");
    sb.append("    infrequentOldestAgeMinutes: ").append(toIndentedString(infrequentOldestAgeMinutes)).append("\n");
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

    // add `max-count` to the URL query string
    if (getMaxCount() != null) {
      joiner.add(String.format("%smax-count%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxCount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `interval` to the URL query string
    if (getInterval() != null) {
      joiner.add(String.format("%sinterval%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInterval()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `recovery-mode` to the URL query string
    if (getRecoveryMode() != null) {
      joiner.add(String.format("%srecovery-mode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecoveryMode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `frequent-interval-minutes` to the URL query string
    if (getFrequentIntervalMinutes() != null) {
      joiner.add(String.format("%sfrequent-interval-minutes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFrequentIntervalMinutes()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `frequent-oldest-age-minutes` to the URL query string
    if (getFrequentOldestAgeMinutes() != null) {
      joiner.add(String.format("%sfrequent-oldest-age-minutes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFrequentOldestAgeMinutes()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `infrequent-interval-minutes` to the URL query string
    if (getInfrequentIntervalMinutes() != null) {
      joiner.add(String.format("%sinfrequent-interval-minutes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInfrequentIntervalMinutes()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `infrequent-oldest-age-minutes` to the URL query string
    if (getInfrequentOldestAgeMinutes() != null) {
      joiner.add(String.format("%sinfrequent-oldest-age-minutes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInfrequentOldestAgeMinutes()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

