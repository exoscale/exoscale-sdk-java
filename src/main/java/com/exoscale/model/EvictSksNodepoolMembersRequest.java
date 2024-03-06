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


package com.exoscale.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * EvictSksNodepoolMembersRequest
 */
@JsonPropertyOrder({
  EvictSksNodepoolMembersRequest.JSON_PROPERTY_INSTANCES
})
@JsonTypeName("evict_sks_nodepool_members_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T21:01:33.231699+01:00[Europe/Vienna]")
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

}

