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
 * Backup schedule
 */
@JsonPropertyOrder({
  DbaasServiceMysqlBackupSchedule.JSON_PROPERTY_BACKUP_HOUR,
  DbaasServiceMysqlBackupSchedule.JSON_PROPERTY_BACKUP_MINUTE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-05T21:27:44.654335085+02:00[Europe/Zurich]", comments = "Generator version: 7.4.0")
public class DbaasServiceMysqlBackupSchedule {
  public static final String JSON_PROPERTY_BACKUP_HOUR = "backup-hour";
  private Long backupHour;

  public static final String JSON_PROPERTY_BACKUP_MINUTE = "backup-minute";
  private Long backupMinute;

  public DbaasServiceMysqlBackupSchedule() { 
  }

  public DbaasServiceMysqlBackupSchedule backupHour(Long backupHour) {
    this.backupHour = backupHour;
    return this;
  }

   /**
   * The hour of day (in UTC) when backup for the service is started. New backup is only started if previous backup has already completed.
   * minimum: 0
   * maximum: 23
   * @return backupHour
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BACKUP_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBackupHour() {
    return backupHour;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackupHour(Long backupHour) {
    this.backupHour = backupHour;
  }


  public DbaasServiceMysqlBackupSchedule backupMinute(Long backupMinute) {
    this.backupMinute = backupMinute;
    return this;
  }

   /**
   * The minute of an hour when backup for the service is started. New backup is only started if previous backup has already completed.
   * minimum: 0
   * maximum: 59
   * @return backupMinute
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BACKUP_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBackupMinute() {
    return backupMinute;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackupMinute(Long backupMinute) {
    this.backupMinute = backupMinute;
  }


  /**
   * Return true if this dbaas_service_mysql_backup_schedule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasServiceMysqlBackupSchedule dbaasServiceMysqlBackupSchedule = (DbaasServiceMysqlBackupSchedule) o;
    return Objects.equals(this.backupHour, dbaasServiceMysqlBackupSchedule.backupHour) &&
        Objects.equals(this.backupMinute, dbaasServiceMysqlBackupSchedule.backupMinute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupHour, backupMinute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasServiceMysqlBackupSchedule {\n");
    sb.append("    backupHour: ").append(toIndentedString(backupHour)).append("\n");
    sb.append("    backupMinute: ").append(toIndentedString(backupMinute)).append("\n");
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

    // add `backup-hour` to the URL query string
    if (getBackupHour() != null) {
      joiner.add(String.format("%sbackup-hour%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBackupHour()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `backup-minute` to the URL query string
    if (getBackupMinute() != null) {
      joiner.add(String.format("%sbackup-minute%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBackupMinute()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

