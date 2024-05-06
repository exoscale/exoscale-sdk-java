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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EvictInstancePoolMembersRequest
 */
@JsonPropertyOrder({
  EvictInstancePoolMembersRequest.JSON_PROPERTY_INSTANCES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T14:27:11.860946+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class EvictInstancePoolMembersRequest {
  public static final String JSON_PROPERTY_INSTANCES = "instances";
  private List<UUID> instances;

  public EvictInstancePoolMembersRequest() { 
  }

  public EvictInstancePoolMembersRequest instances(List<UUID> instances) {
    this.instances = instances;
    return this;
  }

  public EvictInstancePoolMembersRequest addInstancesItem(UUID instancesItem) {
    if (this.instances == null) {
      this.instances = new ArrayList<>();
    }
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * Get instances
   * @return instances
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getInstances() {
    return instances;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstances(List<UUID> instances) {
    this.instances = instances;
  }


  /**
   * Return true if this evict_instance_pool_members_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvictInstancePoolMembersRequest evictInstancePoolMembersRequest = (EvictInstancePoolMembersRequest) o;
    return Objects.equals(this.instances, evictInstancePoolMembersRequest.instances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvictInstancePoolMembersRequest {\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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

    // add `instances` to the URL query string
    if (getInstances() != null) {
      for (int i = 0; i < getInstances().size(); i++) {
        if (getInstances().get(i) != null) {
          joiner.add(String.format("%sinstances%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getInstances().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }
      }
    }

    return joiner.toString();
  }
}
