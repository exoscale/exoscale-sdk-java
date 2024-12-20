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
import com.exoscale.sdk.model.OperatingFactor;
import com.exoscale.sdk.model.PrimaryParameter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ShardIndexingBackPressureSettings
 */
@JsonPropertyOrder({
  ShardIndexingBackPressureSettings.JSON_PROPERTY_PRIMARY_PARAMETER,
  ShardIndexingBackPressureSettings.JSON_PROPERTY_OPERATING_FACTOR,
  ShardIndexingBackPressureSettings.JSON_PROPERTY_ENFORCED,
  ShardIndexingBackPressureSettings.JSON_PROPERTY_ENABLED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class ShardIndexingBackPressureSettings {
  public static final String JSON_PROPERTY_PRIMARY_PARAMETER = "primary_parameter";
  private PrimaryParameter primaryParameter;

  public static final String JSON_PROPERTY_OPERATING_FACTOR = "operating_factor";
  private OperatingFactor operatingFactor;

  public static final String JSON_PROPERTY_ENFORCED = "enforced";
  private Boolean enforced;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public ShardIndexingBackPressureSettings() { 
  }

  public ShardIndexingBackPressureSettings primaryParameter(PrimaryParameter primaryParameter) {
    this.primaryParameter = primaryParameter;
    return this;
  }

   /**
   * Get primaryParameter
   * @return primaryParameter
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMARY_PARAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PrimaryParameter getPrimaryParameter() {
    return primaryParameter;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_PARAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryParameter(PrimaryParameter primaryParameter) {
    this.primaryParameter = primaryParameter;
  }


  public ShardIndexingBackPressureSettings operatingFactor(OperatingFactor operatingFactor) {
    this.operatingFactor = operatingFactor;
    return this;
  }

   /**
   * Get operatingFactor
   * @return operatingFactor
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATING_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OperatingFactor getOperatingFactor() {
    return operatingFactor;
  }


  @JsonProperty(JSON_PROPERTY_OPERATING_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatingFactor(OperatingFactor operatingFactor) {
    this.operatingFactor = operatingFactor;
  }


  public ShardIndexingBackPressureSettings enforced(Boolean enforced) {
    this.enforced = enforced;
    return this;
  }

   /**
   * Run shard indexing backpressure in shadow mode or enforced mode. In shadow mode (value set as false), shard indexing backpressure tracks all granular-level metrics, but it doesn’t actually reject any indexing requests. In enforced mode (value set as true), shard indexing backpressure rejects any requests to the cluster that might cause a dip in its performance. Default is false
   * @return enforced
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENFORCED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnforced() {
    return enforced;
  }


  @JsonProperty(JSON_PROPERTY_ENFORCED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnforced(Boolean enforced) {
    this.enforced = enforced;
  }


  public ShardIndexingBackPressureSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Enable or disable shard indexing backpressure. Default is false
   * @return enabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * Return true if this Shard_indexing_back_pressure_settings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShardIndexingBackPressureSettings shardIndexingBackPressureSettings = (ShardIndexingBackPressureSettings) o;
    return Objects.equals(this.primaryParameter, shardIndexingBackPressureSettings.primaryParameter) &&
        Objects.equals(this.operatingFactor, shardIndexingBackPressureSettings.operatingFactor) &&
        Objects.equals(this.enforced, shardIndexingBackPressureSettings.enforced) &&
        Objects.equals(this.enabled, shardIndexingBackPressureSettings.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryParameter, operatingFactor, enforced, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShardIndexingBackPressureSettings {\n");
    sb.append("    primaryParameter: ").append(toIndentedString(primaryParameter)).append("\n");
    sb.append("    operatingFactor: ").append(toIndentedString(operatingFactor)).append("\n");
    sb.append("    enforced: ").append(toIndentedString(enforced)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

    // add `primary_parameter` to the URL query string
    if (getPrimaryParameter() != null) {
      joiner.add(getPrimaryParameter().toUrlQueryString(prefix + "primary_parameter" + suffix));
    }

    // add `operating_factor` to the URL query string
    if (getOperatingFactor() != null) {
      joiner.add(getOperatingFactor().toUrlQueryString(prefix + "operating_factor" + suffix));
    }

    // add `enforced` to the URL query string
    if (getEnforced() != null) {
      joiner.add(String.format("%senforced%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnforced()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `enabled` to the URL query string
    if (getEnabled() != null) {
      joiner.add(String.format("%senabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnabled()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

