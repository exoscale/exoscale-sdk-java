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
import java.math.BigDecimal;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NodeDuressSettings
 */
@JsonPropertyOrder({
  NodeDuressSettings.JSON_PROPERTY_CPU_THRESHOLD,
  NodeDuressSettings.JSON_PROPERTY_HEAP_THRESHOLD,
  NodeDuressSettings.JSON_PROPERTY_NUM_SUCCESSIVE_BREACHES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class NodeDuressSettings {
  public static final String JSON_PROPERTY_CPU_THRESHOLD = "cpu_threshold";
  private BigDecimal cpuThreshold;

  public static final String JSON_PROPERTY_HEAP_THRESHOLD = "heap_threshold";
  private BigDecimal heapThreshold;

  public static final String JSON_PROPERTY_NUM_SUCCESSIVE_BREACHES = "num_successive_breaches";
  private Integer numSuccessiveBreaches;

  public NodeDuressSettings() { 
  }

  public NodeDuressSettings cpuThreshold(BigDecimal cpuThreshold) {
    this.cpuThreshold = cpuThreshold;
    return this;
  }

   /**
   * The CPU usage threshold (as a percentage) required for a node to be considered to be under duress. Default is 0.9
   * minimum: 0.0
   * maximum: 1.0
   * @return cpuThreshold
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CPU_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCpuThreshold() {
    return cpuThreshold;
  }


  @JsonProperty(JSON_PROPERTY_CPU_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpuThreshold(BigDecimal cpuThreshold) {
    this.cpuThreshold = cpuThreshold;
  }


  public NodeDuressSettings heapThreshold(BigDecimal heapThreshold) {
    this.heapThreshold = heapThreshold;
    return this;
  }

   /**
   * The heap usage threshold (as a percentage) required for a node to be considered to be under duress. Default is 0.7
   * minimum: 0.0
   * maximum: 1.0
   * @return heapThreshold
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEAP_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getHeapThreshold() {
    return heapThreshold;
  }


  @JsonProperty(JSON_PROPERTY_HEAP_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeapThreshold(BigDecimal heapThreshold) {
    this.heapThreshold = heapThreshold;
  }


  public NodeDuressSettings numSuccessiveBreaches(Integer numSuccessiveBreaches) {
    this.numSuccessiveBreaches = numSuccessiveBreaches;
    return this;
  }

   /**
   * The number of successive limit breaches after which the node is considered to be under duress. Default is 3
   * minimum: 1
   * @return numSuccessiveBreaches
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_SUCCESSIVE_BREACHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumSuccessiveBreaches() {
    return numSuccessiveBreaches;
  }


  @JsonProperty(JSON_PROPERTY_NUM_SUCCESSIVE_BREACHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumSuccessiveBreaches(Integer numSuccessiveBreaches) {
    this.numSuccessiveBreaches = numSuccessiveBreaches;
  }


  /**
   * Return true if this Node_duress_settings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeDuressSettings nodeDuressSettings = (NodeDuressSettings) o;
    return Objects.equals(this.cpuThreshold, nodeDuressSettings.cpuThreshold) &&
        Objects.equals(this.heapThreshold, nodeDuressSettings.heapThreshold) &&
        Objects.equals(this.numSuccessiveBreaches, nodeDuressSettings.numSuccessiveBreaches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuThreshold, heapThreshold, numSuccessiveBreaches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeDuressSettings {\n");
    sb.append("    cpuThreshold: ").append(toIndentedString(cpuThreshold)).append("\n");
    sb.append("    heapThreshold: ").append(toIndentedString(heapThreshold)).append("\n");
    sb.append("    numSuccessiveBreaches: ").append(toIndentedString(numSuccessiveBreaches)).append("\n");
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

    // add `cpu_threshold` to the URL query string
    if (getCpuThreshold() != null) {
      joiner.add(String.format("%scpu_threshold%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCpuThreshold()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `heap_threshold` to the URL query string
    if (getHeapThreshold() != null) {
      joiner.add(String.format("%sheap_threshold%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHeapThreshold()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `num_successive_breaches` to the URL query string
    if (getNumSuccessiveBreaches() != null) {
      joiner.add(String.format("%snum_successive_breaches%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNumSuccessiveBreaches()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

