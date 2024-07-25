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
import com.exoscale.exoscale4j.model.DbaasServiceLogsLogsInner;
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
 * DbaasServiceLogs
 */
@JsonPropertyOrder({
  DbaasServiceLogs.JSON_PROPERTY_OFFSET,
  DbaasServiceLogs.JSON_PROPERTY_FIRST_LOG_OFFSET,
  DbaasServiceLogs.JSON_PROPERTY_LOGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-25T12:43:01.822793Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DbaasServiceLogs {
  public static final String JSON_PROPERTY_OFFSET = "offset";
  private String offset;

  public static final String JSON_PROPERTY_FIRST_LOG_OFFSET = "first-log-offset";
  private String firstLogOffset;

  public static final String JSON_PROPERTY_LOGS = "logs";
  private List<DbaasServiceLogsLogsInner> logs;

  public DbaasServiceLogs() { 
  }

  public DbaasServiceLogs offset(String offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOffset() {
    return offset;
  }


  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOffset(String offset) {
    this.offset = offset;
  }


  public DbaasServiceLogs firstLogOffset(String firstLogOffset) {
    this.firstLogOffset = firstLogOffset;
    return this;
  }

   /**
   * Get firstLogOffset
   * @return firstLogOffset
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_LOG_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstLogOffset() {
    return firstLogOffset;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_LOG_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstLogOffset(String firstLogOffset) {
    this.firstLogOffset = firstLogOffset;
  }


  public DbaasServiceLogs logs(List<DbaasServiceLogsLogsInner> logs) {
    this.logs = logs;
    return this;
  }

  public DbaasServiceLogs addLogsItem(DbaasServiceLogsLogsInner logsItem) {
    if (this.logs == null) {
      this.logs = new ArrayList<>();
    }
    this.logs.add(logsItem);
    return this;
  }

   /**
   * Get logs
   * @return logs
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DbaasServiceLogsLogsInner> getLogs() {
    return logs;
  }


  @JsonProperty(JSON_PROPERTY_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogs(List<DbaasServiceLogsLogsInner> logs) {
    this.logs = logs;
  }


  /**
   * Return true if this dbaas-service-logs object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasServiceLogs dbaasServiceLogs = (DbaasServiceLogs) o;
    return Objects.equals(this.offset, dbaasServiceLogs.offset) &&
        Objects.equals(this.firstLogOffset, dbaasServiceLogs.firstLogOffset) &&
        Objects.equals(this.logs, dbaasServiceLogs.logs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, firstLogOffset, logs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasServiceLogs {\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    firstLogOffset: ").append(toIndentedString(firstLogOffset)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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

    // add `offset` to the URL query string
    if (getOffset() != null) {
      joiner.add(String.format("%soffset%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOffset()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `first-log-offset` to the URL query string
    if (getFirstLogOffset() != null) {
      joiner.add(String.format("%sfirst-log-offset%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFirstLogOffset()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `logs` to the URL query string
    if (getLogs() != null) {
      for (int i = 0; i < getLogs().size(); i++) {
        if (getLogs().get(i) != null) {
          joiner.add(getLogs().get(i).toUrlQueryString(String.format("%slogs%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

