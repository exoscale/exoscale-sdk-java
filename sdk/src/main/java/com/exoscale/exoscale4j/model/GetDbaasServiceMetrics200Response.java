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
 * GetDbaasServiceMetrics200Response
 */
@JsonPropertyOrder({
  GetDbaasServiceMetrics200Response.JSON_PROPERTY_METRICS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-09T23:00:30.419743+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class GetDbaasServiceMetrics200Response {
  public static final String JSON_PROPERTY_METRICS = "metrics";
  private Object metrics;

  public GetDbaasServiceMetrics200Response() { 
  }

  public GetDbaasServiceMetrics200Response metrics(Object metrics) {
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getMetrics() {
    return metrics;
  }


  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetrics(Object metrics) {
    this.metrics = metrics;
  }


  /**
   * Return true if this get_dbaas_service_metrics_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDbaasServiceMetrics200Response getDbaasServiceMetrics200Response = (GetDbaasServiceMetrics200Response) o;
    return Objects.equals(this.metrics, getDbaasServiceMetrics200Response.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDbaasServiceMetrics200Response {\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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

    // add `metrics` to the URL query string
    if (getMetrics() != null) {
      joiner.add(String.format("%smetrics%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMetrics()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

