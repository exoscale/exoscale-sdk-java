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
import com.exoscale.sdk.model.EnumExternalEndpointTypes;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ListDbaasExternalEndpointTypes200ResponseEndpointTypesInner
 */
@JsonPropertyOrder({
  ListDbaasExternalEndpointTypes200ResponseEndpointTypesInner.JSON_PROPERTY_TYPE,
  ListDbaasExternalEndpointTypes200ResponseEndpointTypesInner.JSON_PROPERTY_SERVICE_TYPES,
  ListDbaasExternalEndpointTypes200ResponseEndpointTypesInner.JSON_PROPERTY_TITLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-29T07:06:33.173380Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ListDbaasExternalEndpointTypes200ResponseEndpointTypesInner {
  public static final String JSON_PROPERTY_TYPE = "type";
  private EnumExternalEndpointTypes type;

  public static final String JSON_PROPERTY_SERVICE_TYPES = "service-types";
  private List<String> serviceTypes;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public ListDbaasExternalEndpointTypes200ResponseEndpointTypesInner() { 
  }

  public ListDbaasExternalEndpointTypes200ResponseEndpointTypesInner type(EnumExternalEndpointTypes type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EnumExternalEndpointTypes getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(EnumExternalEndpointTypes type) {
    this.type = type;
  }


  public ListDbaasExternalEndpointTypes200ResponseEndpointTypesInner serviceTypes(List<String> serviceTypes) {
    this.serviceTypes = serviceTypes;
    return this;
  }

  public ListDbaasExternalEndpointTypes200ResponseEndpointTypesInner addServiceTypesItem(String serviceTypesItem) {
    if (this.serviceTypes == null) {
      this.serviceTypes = new ArrayList<>();
    }
    this.serviceTypes.add(serviceTypesItem);
    return this;
  }

   /**
   * Get serviceTypes
   * @return serviceTypes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getServiceTypes() {
    return serviceTypes;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceTypes(List<String> serviceTypes) {
    this.serviceTypes = serviceTypes;
  }


  public ListDbaasExternalEndpointTypes200ResponseEndpointTypesInner title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Return true if this list_dbaas_external_endpoint_types_200_response_endpoint_types_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDbaasExternalEndpointTypes200ResponseEndpointTypesInner listDbaasExternalEndpointTypes200ResponseEndpointTypesInner = (ListDbaasExternalEndpointTypes200ResponseEndpointTypesInner) o;
    return Objects.equals(this.type, listDbaasExternalEndpointTypes200ResponseEndpointTypesInner.type) &&
        Objects.equals(this.serviceTypes, listDbaasExternalEndpointTypes200ResponseEndpointTypesInner.serviceTypes) &&
        Objects.equals(this.title, listDbaasExternalEndpointTypes200ResponseEndpointTypesInner.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, serviceTypes, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDbaasExternalEndpointTypes200ResponseEndpointTypesInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    serviceTypes: ").append(toIndentedString(serviceTypes)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `service-types` to the URL query string
    if (getServiceTypes() != null) {
      for (int i = 0; i < getServiceTypes().size(); i++) {
        joiner.add(String.format("%sservice-types%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getServiceTypes().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

