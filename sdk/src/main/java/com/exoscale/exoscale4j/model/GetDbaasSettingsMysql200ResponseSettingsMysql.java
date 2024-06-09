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
 * mysql.conf configuration values
 */
@JsonPropertyOrder({
  GetDbaasSettingsMysql200ResponseSettingsMysql.JSON_PROPERTY_PROPERTIES,
  GetDbaasSettingsMysql200ResponseSettingsMysql.JSON_PROPERTY_ADDITIONAL_PROPERTIES,
  GetDbaasSettingsMysql200ResponseSettingsMysql.JSON_PROPERTY_TYPE,
  GetDbaasSettingsMysql200ResponseSettingsMysql.JSON_PROPERTY_TITLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-09T23:00:30.419743+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class GetDbaasSettingsMysql200ResponseSettingsMysql {
  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private Object properties;

  public static final String JSON_PROPERTY_ADDITIONAL_PROPERTIES = "additionalProperties";
  private Boolean additionalProperties;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public GetDbaasSettingsMysql200ResponseSettingsMysql() { 
  }

  public GetDbaasSettingsMysql200ResponseSettingsMysql properties(Object properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getProperties() {
    return properties;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperties(Object properties) {
    this.properties = properties;
  }


  public GetDbaasSettingsMysql200ResponseSettingsMysql additionalProperties(Boolean additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

   /**
   * Get additionalProperties
   * @return additionalProperties
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAdditionalProperties() {
    return additionalProperties;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalProperties(Boolean additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  public GetDbaasSettingsMysql200ResponseSettingsMysql type(String type) {
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

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public GetDbaasSettingsMysql200ResponseSettingsMysql title(String title) {
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
   * Return true if this get_dbaas_settings_mysql_200_response_settings_mysql object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDbaasSettingsMysql200ResponseSettingsMysql getDbaasSettingsMysql200ResponseSettingsMysql = (GetDbaasSettingsMysql200ResponseSettingsMysql) o;
    return Objects.equals(this.properties, getDbaasSettingsMysql200ResponseSettingsMysql.properties) &&
        Objects.equals(this.additionalProperties, getDbaasSettingsMysql200ResponseSettingsMysql.additionalProperties) &&
        Objects.equals(this.type, getDbaasSettingsMysql200ResponseSettingsMysql.type) &&
        Objects.equals(this.title, getDbaasSettingsMysql200ResponseSettingsMysql.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties, additionalProperties, type, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDbaasSettingsMysql200ResponseSettingsMysql {\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

    // add `properties` to the URL query string
    if (getProperties() != null) {
      joiner.add(String.format("%sproperties%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProperties()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `additionalProperties` to the URL query string
    if (getAdditionalProperties() != null) {
      joiner.add(String.format("%sadditionalProperties%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAdditionalProperties()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format("%stitle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTitle()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

