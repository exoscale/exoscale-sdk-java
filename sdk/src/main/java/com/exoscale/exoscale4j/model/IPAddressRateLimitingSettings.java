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
 * IPAddressRateLimitingSettings
 */
@JsonPropertyOrder({
  IPAddressRateLimitingSettings.JSON_PROPERTY_ALLOWED_TRIES,
  IPAddressRateLimitingSettings.JSON_PROPERTY_BLOCK_EXPIRY_SECONDS,
  IPAddressRateLimitingSettings.JSON_PROPERTY_MAX_BLOCKED_CLIENTS,
  IPAddressRateLimitingSettings.JSON_PROPERTY_MAX_TRACKED_CLIENTS,
  IPAddressRateLimitingSettings.JSON_PROPERTY_TIME_WINDOW_SECONDS,
  IPAddressRateLimitingSettings.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-10T11:13:25.453512+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class IPAddressRateLimitingSettings {
  public static final String JSON_PROPERTY_ALLOWED_TRIES = "allowed_tries";
  private Integer allowedTries;

  public static final String JSON_PROPERTY_BLOCK_EXPIRY_SECONDS = "block_expiry_seconds";
  private Integer blockExpirySeconds;

  public static final String JSON_PROPERTY_MAX_BLOCKED_CLIENTS = "max_blocked_clients";
  private Integer maxBlockedClients;

  public static final String JSON_PROPERTY_MAX_TRACKED_CLIENTS = "max_tracked_clients";
  private Integer maxTrackedClients;

  public static final String JSON_PROPERTY_TIME_WINDOW_SECONDS = "time_window_seconds";
  private Integer timeWindowSeconds;

  /**
   * The type of rate limiting
   */
  public enum TypeEnum {
    IP("ip");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public IPAddressRateLimitingSettings() { 
  }

  public IPAddressRateLimitingSettings allowedTries(Integer allowedTries) {
    this.allowedTries = allowedTries;
    return this;
  }

   /**
   * The number of login attempts allowed before login is blocked
   * minimum: 1
   * maximum: 2147483647
   * @return allowedTries
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_TRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAllowedTries() {
    return allowedTries;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_TRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedTries(Integer allowedTries) {
    this.allowedTries = allowedTries;
  }


  public IPAddressRateLimitingSettings blockExpirySeconds(Integer blockExpirySeconds) {
    this.blockExpirySeconds = blockExpirySeconds;
    return this;
  }

   /**
   * The duration of time that login remains blocked after a failed login
   * minimum: 1
   * maximum: 36000
   * @return blockExpirySeconds
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCK_EXPIRY_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBlockExpirySeconds() {
    return blockExpirySeconds;
  }


  @JsonProperty(JSON_PROPERTY_BLOCK_EXPIRY_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlockExpirySeconds(Integer blockExpirySeconds) {
    this.blockExpirySeconds = blockExpirySeconds;
  }


  public IPAddressRateLimitingSettings maxBlockedClients(Integer maxBlockedClients) {
    this.maxBlockedClients = maxBlockedClients;
    return this;
  }

   /**
   * The maximum number of blocked IP addresses
   * minimum: 0
   * maximum: 2147483647
   * @return maxBlockedClients
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_BLOCKED_CLIENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxBlockedClients() {
    return maxBlockedClients;
  }


  @JsonProperty(JSON_PROPERTY_MAX_BLOCKED_CLIENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxBlockedClients(Integer maxBlockedClients) {
    this.maxBlockedClients = maxBlockedClients;
  }


  public IPAddressRateLimitingSettings maxTrackedClients(Integer maxTrackedClients) {
    this.maxTrackedClients = maxTrackedClients;
    return this;
  }

   /**
   * The maximum number of tracked IP addresses that have failed login
   * minimum: 0
   * maximum: 2147483647
   * @return maxTrackedClients
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_TRACKED_CLIENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxTrackedClients() {
    return maxTrackedClients;
  }


  @JsonProperty(JSON_PROPERTY_MAX_TRACKED_CLIENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxTrackedClients(Integer maxTrackedClients) {
    this.maxTrackedClients = maxTrackedClients;
  }


  public IPAddressRateLimitingSettings timeWindowSeconds(Integer timeWindowSeconds) {
    this.timeWindowSeconds = timeWindowSeconds;
    return this;
  }

   /**
   * The window of time in which the value for &#x60;allowed_tries&#x60; is enforced
   * minimum: 1
   * maximum: 36000
   * @return timeWindowSeconds
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_WINDOW_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTimeWindowSeconds() {
    return timeWindowSeconds;
  }


  @JsonProperty(JSON_PROPERTY_TIME_WINDOW_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeWindowSeconds(Integer timeWindowSeconds) {
    this.timeWindowSeconds = timeWindowSeconds;
  }


  public IPAddressRateLimitingSettings type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of rate limiting
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this IP_address_rate_limiting_settings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPAddressRateLimitingSettings ipAddressRateLimitingSettings = (IPAddressRateLimitingSettings) o;
    return Objects.equals(this.allowedTries, ipAddressRateLimitingSettings.allowedTries) &&
        Objects.equals(this.blockExpirySeconds, ipAddressRateLimitingSettings.blockExpirySeconds) &&
        Objects.equals(this.maxBlockedClients, ipAddressRateLimitingSettings.maxBlockedClients) &&
        Objects.equals(this.maxTrackedClients, ipAddressRateLimitingSettings.maxTrackedClients) &&
        Objects.equals(this.timeWindowSeconds, ipAddressRateLimitingSettings.timeWindowSeconds) &&
        Objects.equals(this.type, ipAddressRateLimitingSettings.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedTries, blockExpirySeconds, maxBlockedClients, maxTrackedClients, timeWindowSeconds, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAddressRateLimitingSettings {\n");
    sb.append("    allowedTries: ").append(toIndentedString(allowedTries)).append("\n");
    sb.append("    blockExpirySeconds: ").append(toIndentedString(blockExpirySeconds)).append("\n");
    sb.append("    maxBlockedClients: ").append(toIndentedString(maxBlockedClients)).append("\n");
    sb.append("    maxTrackedClients: ").append(toIndentedString(maxTrackedClients)).append("\n");
    sb.append("    timeWindowSeconds: ").append(toIndentedString(timeWindowSeconds)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

    // add `allowed_tries` to the URL query string
    if (getAllowedTries() != null) {
      joiner.add(String.format("%sallowed_tries%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAllowedTries()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `block_expiry_seconds` to the URL query string
    if (getBlockExpirySeconds() != null) {
      joiner.add(String.format("%sblock_expiry_seconds%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBlockExpirySeconds()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `max_blocked_clients` to the URL query string
    if (getMaxBlockedClients() != null) {
      joiner.add(String.format("%smax_blocked_clients%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxBlockedClients()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `max_tracked_clients` to the URL query string
    if (getMaxTrackedClients() != null) {
      joiner.add(String.format("%smax_tracked_clients%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxTrackedClients()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `time_window_seconds` to the URL query string
    if (getTimeWindowSeconds() != null) {
      joiner.add(String.format("%stime_window_seconds%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeWindowSeconds()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

