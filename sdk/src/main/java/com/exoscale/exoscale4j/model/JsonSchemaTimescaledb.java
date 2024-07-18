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
 * System-wide settings for the timescaledb extension
 */
@JsonPropertyOrder({
  JsonSchemaTimescaledb.JSON_PROPERTY_MAX_BACKGROUND_WORKERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-18T11:55:07.035952Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class JsonSchemaTimescaledb {
  public static final String JSON_PROPERTY_MAX_BACKGROUND_WORKERS = "max_background_workers";
  private Integer maxBackgroundWorkers = 16;

  public JsonSchemaTimescaledb() { 
  }

  public JsonSchemaTimescaledb maxBackgroundWorkers(Integer maxBackgroundWorkers) {
    this.maxBackgroundWorkers = maxBackgroundWorkers;
    return this;
  }

   /**
   * The number of background workers for timescaledb operations. You should configure this setting to the sum of your number of databases and the total number of concurrent background workers you want running at any given point in time.
   * minimum: 1
   * maximum: 4096
   * @return maxBackgroundWorkers
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_BACKGROUND_WORKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxBackgroundWorkers() {
    return maxBackgroundWorkers;
  }


  @JsonProperty(JSON_PROPERTY_MAX_BACKGROUND_WORKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxBackgroundWorkers(Integer maxBackgroundWorkers) {
    this.maxBackgroundWorkers = maxBackgroundWorkers;
  }


  /**
   * Return true if this json-schema-timescaledb object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonSchemaTimescaledb jsonSchemaTimescaledb = (JsonSchemaTimescaledb) o;
    return Objects.equals(this.maxBackgroundWorkers, jsonSchemaTimescaledb.maxBackgroundWorkers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxBackgroundWorkers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonSchemaTimescaledb {\n");
    sb.append("    maxBackgroundWorkers: ").append(toIndentedString(maxBackgroundWorkers)).append("\n");
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

    // add `max_background_workers` to the URL query string
    if (getMaxBackgroundWorkers() != null) {
      joiner.add(String.format("%smax_background_workers%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxBackgroundWorkers()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

