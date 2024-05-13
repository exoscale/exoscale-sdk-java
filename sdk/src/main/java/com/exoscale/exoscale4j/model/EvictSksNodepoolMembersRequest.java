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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EvictSksNodepoolMembersRequest
 */
@JsonPropertyOrder({
  EvictSksNodepoolMembersRequest.JSON_PROPERTY_INSTANCES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T11:36:46.703938+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class EvictSksNodepoolMembersRequest {
  public static final String JSON_PROPERTY_INSTANCES = "instances";
  private Set<UUID> instances;

  public EvictSksNodepoolMembersRequest() { 
  }

  public EvictSksNodepoolMembersRequest instances(Set<UUID> instances) {
    this.instances = instances;
    return this;
  }

  public EvictSksNodepoolMembersRequest addInstancesItem(UUID instancesItem) {
    if (this.instances == null) {
      this.instances = new LinkedHashSet<>();
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

  public Set<UUID> getInstances() {
    return instances;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_INSTANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstances(Set<UUID> instances) {
    this.instances = instances;
  }


  /**
   * Return true if this evict_sks_nodepool_members_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvictSksNodepoolMembersRequest evictSksNodepoolMembersRequest = (EvictSksNodepoolMembersRequest) o;
    return Objects.equals(this.instances, evictSksNodepoolMembersRequest.instances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvictSksNodepoolMembersRequest {\n");
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
      int i = 0;
      for (UUID _item : getInstances()) {
        if (_item != null) {
          joiner.add(String.format("%sinstances%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(_item), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }
        i++;
      }
    }

    return joiner.toString();
  }
}

