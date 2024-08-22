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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DbaasServiceLogsLogsInner
 */
@JsonPropertyOrder({
  DbaasServiceLogsLogsInner.JSON_PROPERTY_UNIT,
  DbaasServiceLogsLogsInner.JSON_PROPERTY_TIME,
  DbaasServiceLogsLogsInner.JSON_PROPERTY_MESSAGE,
  DbaasServiceLogsLogsInner.JSON_PROPERTY_NODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-22T07:06:13.134792Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DbaasServiceLogsLogsInner {
  public static final String JSON_PROPERTY_UNIT = "unit";
  private String unit;

  public static final String JSON_PROPERTY_TIME = "time";
  private String time;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_NODE = "node";
  private String node;

  public DbaasServiceLogsLogsInner() { 
  }

  public DbaasServiceLogsLogsInner unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUnit() {
    return unit;
  }


  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnit(String unit) {
    this.unit = unit;
  }


  public DbaasServiceLogsLogsInner time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTime() {
    return time;
  }


  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTime(String time) {
    this.time = time;
  }


  public DbaasServiceLogsLogsInner message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public DbaasServiceLogsLogsInner node(String node) {
    this.node = node;
    return this;
  }

   /**
   * Get node
   * @return node
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNode() {
    return node;
  }


  @JsonProperty(JSON_PROPERTY_NODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNode(String node) {
    this.node = node;
  }


  /**
   * Return true if this dbaas_service_logs_logs_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasServiceLogsLogsInner dbaasServiceLogsLogsInner = (DbaasServiceLogsLogsInner) o;
    return Objects.equals(this.unit, dbaasServiceLogsLogsInner.unit) &&
        Objects.equals(this.time, dbaasServiceLogsLogsInner.time) &&
        Objects.equals(this.message, dbaasServiceLogsLogsInner.message) &&
        Objects.equals(this.node, dbaasServiceLogsLogsInner.node);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, time, message, node);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasServiceLogsLogsInner {\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
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

    // add `unit` to the URL query string
    if (getUnit() != null) {
      joiner.add(String.format("%sunit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUnit()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `time` to the URL query string
    if (getTime() != null) {
      joiner.add(String.format("%stime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `message` to the URL query string
    if (getMessage() != null) {
      joiner.add(String.format("%smessage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMessage()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `node` to the URL query string
    if (getNode() != null) {
      joiner.add(String.format("%snode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

