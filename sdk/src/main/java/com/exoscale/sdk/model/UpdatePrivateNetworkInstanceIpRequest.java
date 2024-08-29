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
import com.exoscale.sdk.model.UpdatePrivateNetworkInstanceIpRequestInstance;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UpdatePrivateNetworkInstanceIpRequest
 */
@JsonPropertyOrder({
  UpdatePrivateNetworkInstanceIpRequest.JSON_PROPERTY_IP,
  UpdatePrivateNetworkInstanceIpRequest.JSON_PROPERTY_INSTANCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-29T07:06:33.173380Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UpdatePrivateNetworkInstanceIpRequest {
  public static final String JSON_PROPERTY_IP = "ip";
  private String ip;

  public static final String JSON_PROPERTY_INSTANCE = "instance";
  private UpdatePrivateNetworkInstanceIpRequestInstance instance;

  public UpdatePrivateNetworkInstanceIpRequest() { 
  }

  public UpdatePrivateNetworkInstanceIpRequest ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Static IP address lease for the corresponding network interface
   * @return ip
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIp() {
    return ip;
  }


  @JsonProperty(JSON_PROPERTY_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIp(String ip) {
    this.ip = ip;
  }


  public UpdatePrivateNetworkInstanceIpRequest instance(UpdatePrivateNetworkInstanceIpRequestInstance instance) {
    this.instance = instance;
    return this;
  }

   /**
   * Get instance
   * @return instance
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdatePrivateNetworkInstanceIpRequestInstance getInstance() {
    return instance;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstance(UpdatePrivateNetworkInstanceIpRequestInstance instance) {
    this.instance = instance;
  }


  /**
   * Return true if this update_private_network_instance_ip_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePrivateNetworkInstanceIpRequest updatePrivateNetworkInstanceIpRequest = (UpdatePrivateNetworkInstanceIpRequest) o;
    return Objects.equals(this.ip, updatePrivateNetworkInstanceIpRequest.ip) &&
        Objects.equals(this.instance, updatePrivateNetworkInstanceIpRequest.instance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ip, instance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePrivateNetworkInstanceIpRequest {\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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

    // add `instance` to the URL query string
    if (getInstance() != null) {
      joiner.add(getInstance().toUrlQueryString(prefix + "instance" + suffix));
    }

    return joiner.toString();
  }
}

