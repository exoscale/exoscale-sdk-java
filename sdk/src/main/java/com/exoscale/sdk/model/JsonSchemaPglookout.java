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
 * System-wide settings for pglookout.
 */
@JsonPropertyOrder({
  JsonSchemaPglookout.JSON_PROPERTY_MAX_FAILOVER_REPLICATION_TIME_LAG
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class JsonSchemaPglookout {
  public static final String JSON_PROPERTY_MAX_FAILOVER_REPLICATION_TIME_LAG = "max_failover_replication_time_lag";
  private Integer maxFailoverReplicationTimeLag = 60;

  public JsonSchemaPglookout() { 
  }

  public JsonSchemaPglookout maxFailoverReplicationTimeLag(Integer maxFailoverReplicationTimeLag) {
    this.maxFailoverReplicationTimeLag = maxFailoverReplicationTimeLag;
    return this;
  }

   /**
   * Number of seconds of master unavailability before triggering database failover to standby
   * minimum: 10
   * maximum: 9223372036854775807
   * @return maxFailoverReplicationTimeLag
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_FAILOVER_REPLICATION_TIME_LAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxFailoverReplicationTimeLag() {
    return maxFailoverReplicationTimeLag;
  }


  @JsonProperty(JSON_PROPERTY_MAX_FAILOVER_REPLICATION_TIME_LAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxFailoverReplicationTimeLag(Integer maxFailoverReplicationTimeLag) {
    this.maxFailoverReplicationTimeLag = maxFailoverReplicationTimeLag;
  }


  /**
   * Return true if this json-schema-pglookout object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonSchemaPglookout jsonSchemaPglookout = (JsonSchemaPglookout) o;
    return Objects.equals(this.maxFailoverReplicationTimeLag, jsonSchemaPglookout.maxFailoverReplicationTimeLag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxFailoverReplicationTimeLag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonSchemaPglookout {\n");
    sb.append("    maxFailoverReplicationTimeLag: ").append(toIndentedString(maxFailoverReplicationTimeLag)).append("\n");
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

    // add `max_failover_replication_time_lag` to the URL query string
    if (getMaxFailoverReplicationTimeLag() != null) {
      joiner.add(String.format("%smax_failover_replication_time_lag%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxFailoverReplicationTimeLag()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

