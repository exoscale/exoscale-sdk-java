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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Private Network leased IP address
 */
@JsonPropertyOrder({
  PrivateNetworkLease.JSON_PROPERTY_IP,
  PrivateNetworkLease.JSON_PROPERTY_INSTANCE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-07T11:18:35.752314Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PrivateNetworkLease {
  public static final String JSON_PROPERTY_IP = "ip";
  private String ip;

  public static final String JSON_PROPERTY_INSTANCE_ID = "instance-id";
  private UUID instanceId;

  public PrivateNetworkLease() { 
  }

  @JsonCreator
  public PrivateNetworkLease(
    @JsonProperty(JSON_PROPERTY_IP) String ip, 
    @JsonProperty(JSON_PROPERTY_INSTANCE_ID) UUID instanceId
  ) {
  this();
    this.ip = ip;
    this.instanceId = instanceId;
  }

   /**
   * Private Network IP address
   * @return ip
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIp() {
    return ip;
  }




   /**
   * Attached instance ID
   * @return instanceId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getInstanceId() {
    return instanceId;
  }




  /**
   * Return true if this private-network-lease object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivateNetworkLease privateNetworkLease = (PrivateNetworkLease) o;
    return Objects.equals(this.ip, privateNetworkLease.ip) &&
        Objects.equals(this.instanceId, privateNetworkLease.instanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ip, instanceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateNetworkLease {\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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

    // add `ip` to the URL query string
    if (getIp() != null) {
      joiner.add(String.format("%sip%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIp()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `instance-id` to the URL query string
    if (getInstanceId() != null) {
      joiner.add(String.format("%sinstance-id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInstanceId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

