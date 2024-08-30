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
 * ResizeInstanceDiskRequest
 */
@JsonPropertyOrder({
  ResizeInstanceDiskRequest.JSON_PROPERTY_DISK_SIZE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-30T13:37:22.669691+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class ResizeInstanceDiskRequest {
  public static final String JSON_PROPERTY_DISK_SIZE = "disk-size";
  private Long diskSize;

  public ResizeInstanceDiskRequest() { 
  }

  public ResizeInstanceDiskRequest diskSize(Long diskSize) {
    this.diskSize = diskSize;
    return this;
  }

   /**
   * Instance disk size in GiB
   * minimum: 10
   * maximum: 51200
   * @return diskSize
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DISK_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getDiskSize() {
    return diskSize;
  }


  @JsonProperty(JSON_PROPERTY_DISK_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDiskSize(Long diskSize) {
    this.diskSize = diskSize;
  }


  /**
   * Return true if this resize_instance_disk_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResizeInstanceDiskRequest resizeInstanceDiskRequest = (ResizeInstanceDiskRequest) o;
    return Objects.equals(this.diskSize, resizeInstanceDiskRequest.diskSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diskSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResizeInstanceDiskRequest {\n");
    sb.append("    diskSize: ").append(toIndentedString(diskSize)).append("\n");
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

    // add `disk-size` to the URL query string
    if (getDiskSize() != null) {
      joiner.add(String.format("%sdisk-size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDiskSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

