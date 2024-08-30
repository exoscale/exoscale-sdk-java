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
import com.exoscale.sdk.model.DbaasBackupConfig;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DBaaS plan
 */
@JsonPropertyOrder({
  DbaasPlan.JSON_PROPERTY_NAME,
  DbaasPlan.JSON_PROPERTY_NODE_COUNT,
  DbaasPlan.JSON_PROPERTY_NODE_CPU_COUNT,
  DbaasPlan.JSON_PROPERTY_DISK_SPACE,
  DbaasPlan.JSON_PROPERTY_NODE_MEMORY,
  DbaasPlan.JSON_PROPERTY_MAX_MEMORY_PERCENT,
  DbaasPlan.JSON_PROPERTY_BACKUP_CONFIG,
  DbaasPlan.JSON_PROPERTY_AUTHORIZED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class DbaasPlan {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NODE_COUNT = "node-count";
  private Long nodeCount;

  public static final String JSON_PROPERTY_NODE_CPU_COUNT = "node-cpu-count";
  private Long nodeCpuCount;

  public static final String JSON_PROPERTY_DISK_SPACE = "disk-space";
  private Long diskSpace;

  public static final String JSON_PROPERTY_NODE_MEMORY = "node-memory";
  private Long nodeMemory;

  public static final String JSON_PROPERTY_MAX_MEMORY_PERCENT = "max-memory-percent";
  private Long maxMemoryPercent;

  public static final String JSON_PROPERTY_BACKUP_CONFIG = "backup-config";
  private DbaasBackupConfig backupConfig;

  public static final String JSON_PROPERTY_AUTHORIZED = "authorized";
  private Boolean authorized;

  public DbaasPlan() { 
  }

  @JsonCreator
  public DbaasPlan(
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_NODE_COUNT) Long nodeCount, 
    @JsonProperty(JSON_PROPERTY_NODE_CPU_COUNT) Long nodeCpuCount, 
    @JsonProperty(JSON_PROPERTY_DISK_SPACE) Long diskSpace, 
    @JsonProperty(JSON_PROPERTY_NODE_MEMORY) Long nodeMemory, 
    @JsonProperty(JSON_PROPERTY_MAX_MEMORY_PERCENT) Long maxMemoryPercent, 
    @JsonProperty(JSON_PROPERTY_AUTHORIZED) Boolean authorized
  ) {
  this();
    this.name = name;
    this.nodeCount = nodeCount;
    this.nodeCpuCount = nodeCpuCount;
    this.diskSpace = diskSpace;
    this.nodeMemory = nodeMemory;
    this.maxMemoryPercent = maxMemoryPercent;
    this.authorized = authorized;
  }

   /**
   * DBaaS plan name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }




   /**
   * DBaaS plan node count
   * minimum: 0
   * @return nodeCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NODE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNodeCount() {
    return nodeCount;
  }




   /**
   * DBaaS plan CPU count per node
   * minimum: 0
   * @return nodeCpuCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NODE_CPU_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNodeCpuCount() {
    return nodeCpuCount;
  }




   /**
   * DBaaS plan disk space
   * @return diskSpace
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISK_SPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDiskSpace() {
    return diskSpace;
  }




   /**
   * DBaaS plan memory count per node
   * minimum: 0
   * @return nodeMemory
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NODE_MEMORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNodeMemory() {
    return nodeMemory;
  }




   /**
   * DBaaS plan max memory allocated percentage
   * minimum: 0
   * @return maxMemoryPercent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_MEMORY_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaxMemoryPercent() {
    return maxMemoryPercent;
  }




  public DbaasPlan backupConfig(DbaasBackupConfig backupConfig) {
    this.backupConfig = backupConfig;
    return this;
  }

   /**
   * Get backupConfig
   * @return backupConfig
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BACKUP_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DbaasBackupConfig getBackupConfig() {
    return backupConfig;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackupConfig(DbaasBackupConfig backupConfig) {
    this.backupConfig = backupConfig;
  }


   /**
   * Requires authorization or publicly available
   * @return authorized
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAuthorized() {
    return authorized;
  }




  /**
   * Return true if this dbaas-plan object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasPlan dbaasPlan = (DbaasPlan) o;
    return Objects.equals(this.name, dbaasPlan.name) &&
        Objects.equals(this.nodeCount, dbaasPlan.nodeCount) &&
        Objects.equals(this.nodeCpuCount, dbaasPlan.nodeCpuCount) &&
        Objects.equals(this.diskSpace, dbaasPlan.diskSpace) &&
        Objects.equals(this.nodeMemory, dbaasPlan.nodeMemory) &&
        Objects.equals(this.maxMemoryPercent, dbaasPlan.maxMemoryPercent) &&
        Objects.equals(this.backupConfig, dbaasPlan.backupConfig) &&
        Objects.equals(this.authorized, dbaasPlan.authorized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nodeCount, nodeCpuCount, diskSpace, nodeMemory, maxMemoryPercent, backupConfig, authorized);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasPlan {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
    sb.append("    nodeCpuCount: ").append(toIndentedString(nodeCpuCount)).append("\n");
    sb.append("    diskSpace: ").append(toIndentedString(diskSpace)).append("\n");
    sb.append("    nodeMemory: ").append(toIndentedString(nodeMemory)).append("\n");
    sb.append("    maxMemoryPercent: ").append(toIndentedString(maxMemoryPercent)).append("\n");
    sb.append("    backupConfig: ").append(toIndentedString(backupConfig)).append("\n");
    sb.append("    authorized: ").append(toIndentedString(authorized)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `node-count` to the URL query string
    if (getNodeCount() != null) {
      joiner.add(String.format("%snode-count%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNodeCount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `node-cpu-count` to the URL query string
    if (getNodeCpuCount() != null) {
      joiner.add(String.format("%snode-cpu-count%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNodeCpuCount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `disk-space` to the URL query string
    if (getDiskSpace() != null) {
      joiner.add(String.format("%sdisk-space%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDiskSpace()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `node-memory` to the URL query string
    if (getNodeMemory() != null) {
      joiner.add(String.format("%snode-memory%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNodeMemory()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `max-memory-percent` to the URL query string
    if (getMaxMemoryPercent() != null) {
      joiner.add(String.format("%smax-memory-percent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxMemoryPercent()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `backup-config` to the URL query string
    if (getBackupConfig() != null) {
      joiner.add(getBackupConfig().toUrlQueryString(prefix + "backup-config" + suffix));
    }

    // add `authorized` to the URL query string
    if (getAuthorized() != null) {
      joiner.add(String.format("%sauthorized%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthorized()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
