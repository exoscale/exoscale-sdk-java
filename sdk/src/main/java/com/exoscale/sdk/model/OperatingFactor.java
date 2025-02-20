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
 * OperatingFactor
 */
@JsonPropertyOrder({
  OperatingFactor.JSON_PROPERTY_UPPER,
  OperatingFactor.JSON_PROPERTY_OPTIMAL,
  OperatingFactor.JSON_PROPERTY_LOWER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class OperatingFactor {
  public static final String JSON_PROPERTY_UPPER = "upper";
  private BigDecimal upper;

  public static final String JSON_PROPERTY_OPTIMAL = "optimal";
  private BigDecimal optimal;

  public static final String JSON_PROPERTY_LOWER = "lower";
  private BigDecimal lower;

  public OperatingFactor() { 
  }

  public OperatingFactor upper(BigDecimal upper) {
    this.upper = upper;
    return this;
  }

   /**
   * Specify the upper occupancy limit of the allocated quota of memory for the shard. If the total memory usage of a shard is above this limit, shard indexing backpressure increases the current allocated memory for that shard. Default is 0.95
   * minimum: 0.0
   * @return upper
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPPER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getUpper() {
    return upper;
  }


  @JsonProperty(JSON_PROPERTY_UPPER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpper(BigDecimal upper) {
    this.upper = upper;
  }


  public OperatingFactor optimal(BigDecimal optimal) {
    this.optimal = optimal;
    return this;
  }

   /**
   * Specify the optimal occupancy of the allocated quota of memory for the shard. If the total memory usage of a shard is at this level, shard indexing backpressure doesn’t change the current allocated memory for that shard. Default is 0.85
   * minimum: 0.0
   * @return optimal
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIMAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOptimal() {
    return optimal;
  }


  @JsonProperty(JSON_PROPERTY_OPTIMAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptimal(BigDecimal optimal) {
    this.optimal = optimal;
  }


  public OperatingFactor lower(BigDecimal lower) {
    this.lower = lower;
    return this;
  }

   /**
   * Specify the lower occupancy limit of the allocated quota of memory for the shard. If the total memory usage of a shard is below this limit, shard indexing backpressure decreases the current allocated memory for that shard. Default is 0.75
   * minimum: 0.0
   * @return lower
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOWER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLower() {
    return lower;
  }


  @JsonProperty(JSON_PROPERTY_LOWER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLower(BigDecimal lower) {
    this.lower = lower;
  }


  /**
   * Return true if this Operating_factor object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperatingFactor operatingFactor = (OperatingFactor) o;
    return Objects.equals(this.upper, operatingFactor.upper) &&
        Objects.equals(this.optimal, operatingFactor.optimal) &&
        Objects.equals(this.lower, operatingFactor.lower);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upper, optimal, lower);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperatingFactor {\n");
    sb.append("    upper: ").append(toIndentedString(upper)).append("\n");
    sb.append("    optimal: ").append(toIndentedString(optimal)).append("\n");
    sb.append("    lower: ").append(toIndentedString(lower)).append("\n");
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

    // add `upper` to the URL query string
    if (getUpper() != null) {
      joiner.add(String.format("%supper%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUpper()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `optimal` to the URL query string
    if (getOptimal() != null) {
      joiner.add(String.format("%soptimal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOptimal()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `lower` to the URL query string
    if (getLower() != null) {
      joiner.add(String.format("%slower%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLower()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

