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
 * Kubelet image GC options
 */
@JsonPropertyOrder({
  KubeletImageGc.JSON_PROPERTY_HIGH_THRESHOLD,
  KubeletImageGc.JSON_PROPERTY_LOW_THRESHOLD,
  KubeletImageGc.JSON_PROPERTY_MIN_AGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-25T12:43:01.822793Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class KubeletImageGc {
  public static final String JSON_PROPERTY_HIGH_THRESHOLD = "high-threshold";
  private Long highThreshold;

  public static final String JSON_PROPERTY_LOW_THRESHOLD = "low-threshold";
  private Long lowThreshold;

  public static final String JSON_PROPERTY_MIN_AGE = "min-age";
  private String minAge;

  public KubeletImageGc() { 
  }

  public KubeletImageGc highThreshold(Long highThreshold) {
    this.highThreshold = highThreshold;
    return this;
  }

   /**
   * Get highThreshold
   * minimum: 0
   * @return highThreshold
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIGH_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getHighThreshold() {
    return highThreshold;
  }


  @JsonProperty(JSON_PROPERTY_HIGH_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHighThreshold(Long highThreshold) {
    this.highThreshold = highThreshold;
  }


  public KubeletImageGc lowThreshold(Long lowThreshold) {
    this.lowThreshold = lowThreshold;
    return this;
  }

   /**
   * Get lowThreshold
   * minimum: 0
   * @return lowThreshold
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOW_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLowThreshold() {
    return lowThreshold;
  }


  @JsonProperty(JSON_PROPERTY_LOW_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLowThreshold(Long lowThreshold) {
    this.lowThreshold = lowThreshold;
  }


  public KubeletImageGc minAge(String minAge) {
    this.minAge = minAge;
    return this;
  }

   /**
   * Get minAge
   * @return minAge
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMinAge() {
    return minAge;
  }


  @JsonProperty(JSON_PROPERTY_MIN_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinAge(String minAge) {
    this.minAge = minAge;
  }


  /**
   * Return true if this kubelet-image-gc object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KubeletImageGc kubeletImageGc = (KubeletImageGc) o;
    return Objects.equals(this.highThreshold, kubeletImageGc.highThreshold) &&
        Objects.equals(this.lowThreshold, kubeletImageGc.lowThreshold) &&
        Objects.equals(this.minAge, kubeletImageGc.minAge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(highThreshold, lowThreshold, minAge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KubeletImageGc {\n");
    sb.append("    highThreshold: ").append(toIndentedString(highThreshold)).append("\n");
    sb.append("    lowThreshold: ").append(toIndentedString(lowThreshold)).append("\n");
    sb.append("    minAge: ").append(toIndentedString(minAge)).append("\n");
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

    // add `high-threshold` to the URL query string
    if (getHighThreshold() != null) {
      joiner.add(String.format("%shigh-threshold%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHighThreshold()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `low-threshold` to the URL query string
    if (getLowThreshold() != null) {
      joiner.add(String.format("%slow-threshold%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLowThreshold()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `min-age` to the URL query string
    if (getMinAge() != null) {
      joiner.add(String.format("%smin-age%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMinAge()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

