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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Schema Registry configuration
 */
@JsonPropertyOrder({
  GetDbaasSettingsKafka200ResponseSettingsSchemaRegistry.JSON_PROPERTY_PROPERTIES,
  GetDbaasSettingsKafka200ResponseSettingsSchemaRegistry.JSON_PROPERTY_ADDITIONAL_PROPERTIES,
  GetDbaasSettingsKafka200ResponseSettingsSchemaRegistry.JSON_PROPERTY_TYPE,
  GetDbaasSettingsKafka200ResponseSettingsSchemaRegistry.JSON_PROPERTY_TITLE
})
@JsonTypeName("get_dbaas_settings_kafka_200_response_settings_schema_registry")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T16:37:05.548288+01:00[Europe/Vienna]")
public class GetDbaasSettingsKafka200ResponseSettingsSchemaRegistry {
  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private Object properties;

  public static final String JSON_PROPERTY_ADDITIONAL_PROPERTIES = "additionalProperties";
  private Boolean additionalProperties;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public GetDbaasSettingsKafka200ResponseSettingsSchemaRegistry() {
  }

  public GetDbaasSettingsKafka200ResponseSettingsSchemaRegistry properties(Object properties) {
    
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


  public GetDbaasSettingsKafka200ResponseSettingsSchemaRegistry additionalProperties(Boolean additionalProperties) {
    
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


  public GetDbaasSettingsKafka200ResponseSettingsSchemaRegistry type(String type) {
    
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


  public GetDbaasSettingsKafka200ResponseSettingsSchemaRegistry title(String title) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDbaasSettingsKafka200ResponseSettingsSchemaRegistry getDbaasSettingsKafka200ResponseSettingsSchemaRegistry = (GetDbaasSettingsKafka200ResponseSettingsSchemaRegistry) o;
    return Objects.equals(this.properties, getDbaasSettingsKafka200ResponseSettingsSchemaRegistry.properties) &&
        Objects.equals(this.additionalProperties, getDbaasSettingsKafka200ResponseSettingsSchemaRegistry.additionalProperties) &&
        Objects.equals(this.type, getDbaasSettingsKafka200ResponseSettingsSchemaRegistry.type) &&
        Objects.equals(this.title, getDbaasSettingsKafka200ResponseSettingsSchemaRegistry.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties, additionalProperties, type, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDbaasSettingsKafka200ResponseSettingsSchemaRegistry {\n");
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

}

