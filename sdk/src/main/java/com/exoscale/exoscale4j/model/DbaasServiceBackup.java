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
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * List of backups for the service
 */
@JsonPropertyOrder({
  DbaasServiceBackup.JSON_PROPERTY_BACKUP_NAME,
  DbaasServiceBackup.JSON_PROPERTY_BACKUP_TIME,
  DbaasServiceBackup.JSON_PROPERTY_DATA_SIZE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-25T13:08:43.238996Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DbaasServiceBackup {
  public static final String JSON_PROPERTY_BACKUP_NAME = "backup-name";
  private String backupName;

  public static final String JSON_PROPERTY_BACKUP_TIME = "backup-time";
  private OffsetDateTime backupTime;

  public static final String JSON_PROPERTY_DATA_SIZE = "data-size";
  private Long dataSize;

  public DbaasServiceBackup() { 
  }

  public DbaasServiceBackup backupName(String backupName) {
    this.backupName = backupName;
    return this;
  }

   /**
   * Internal name of this backup
   * @return backupName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BACKUP_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBackupName() {
    return backupName;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBackupName(String backupName) {
    this.backupName = backupName;
  }


  public DbaasServiceBackup backupTime(OffsetDateTime backupTime) {
    this.backupTime = backupTime;
    return this;
  }

   /**
   * Backup timestamp (ISO 8601)
   * @return backupTime
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BACKUP_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getBackupTime() {
    return backupTime;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBackupTime(OffsetDateTime backupTime) {
    this.backupTime = backupTime;
  }


  public DbaasServiceBackup dataSize(Long dataSize) {
    this.dataSize = dataSize;
    return this;
  }

   /**
   * Backup&#39;s original size before compression
   * minimum: 0
   * @return dataSize
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATA_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getDataSize() {
    return dataSize;
  }


  @JsonProperty(JSON_PROPERTY_DATA_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDataSize(Long dataSize) {
    this.dataSize = dataSize;
  }


  /**
   * Return true if this dbaas-service-backup object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasServiceBackup dbaasServiceBackup = (DbaasServiceBackup) o;
    return Objects.equals(this.backupName, dbaasServiceBackup.backupName) &&
        Objects.equals(this.backupTime, dbaasServiceBackup.backupTime) &&
        Objects.equals(this.dataSize, dbaasServiceBackup.dataSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupName, backupTime, dataSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasServiceBackup {\n");
    sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
    sb.append("    backupTime: ").append(toIndentedString(backupTime)).append("\n");
    sb.append("    dataSize: ").append(toIndentedString(dataSize)).append("\n");
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

    // add `backup-name` to the URL query string
    if (getBackupName() != null) {
      joiner.add(String.format("%sbackup-name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBackupName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `backup-time` to the URL query string
    if (getBackupTime() != null) {
      joiner.add(String.format("%sbackup-time%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBackupTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `data-size` to the URL query string
    if (getDataSize() != null) {
      joiner.add(String.format("%sdata-size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDataSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

