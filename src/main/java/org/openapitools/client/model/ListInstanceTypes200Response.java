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


package org.openapitools.client.model;

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
import org.openapitools.client.model.InstanceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ListInstanceTypes200Response
 */
@JsonPropertyOrder({
  ListInstanceTypes200Response.JSON_PROPERTY_INSTANCE_TYPES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T09:42:26.601985678Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class ListInstanceTypes200Response {
  public static final String JSON_PROPERTY_INSTANCE_TYPES = "instance-types";
  private List<InstanceType> instanceTypes = new ArrayList<>();

  public ListInstanceTypes200Response() { 
  }

  public ListInstanceTypes200Response instanceTypes(List<InstanceType> instanceTypes) {
    this.instanceTypes = instanceTypes;
    return this;
  }

  public ListInstanceTypes200Response addInstanceTypesItem(InstanceType instanceTypesItem) {
    if (this.instanceTypes == null) {
      this.instanceTypes = new ArrayList<>();
    }
    this.instanceTypes.add(instanceTypesItem);
    return this;
  }

   /**
   * Get instanceTypes
   * @return instanceTypes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTANCE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InstanceType> getInstanceTypes() {
    return instanceTypes;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstanceTypes(List<InstanceType> instanceTypes) {
    this.instanceTypes = instanceTypes;
  }


  /**
   * Return true if this list_instance_types_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListInstanceTypes200Response listInstanceTypes200Response = (ListInstanceTypes200Response) o;
    return Objects.equals(this.instanceTypes, listInstanceTypes200Response.instanceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListInstanceTypes200Response {\n");
    sb.append("    instanceTypes: ").append(toIndentedString(instanceTypes)).append("\n");
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

    // add `instance-types` to the URL query string
    if (getInstanceTypes() != null) {
      for (int i = 0; i < getInstanceTypes().size(); i++) {
        if (getInstanceTypes().get(i) != null) {
          joiner.add(getInstanceTypes().get(i).toUrlQueryString(String.format("%sinstance-types%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

