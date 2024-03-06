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
import com.exoscale.model.DbaasIntegrationTypeSettings;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DbaasIntegrationType
 */
@JsonPropertyOrder({
  DbaasIntegrationType.JSON_PROPERTY_TYPE,
  DbaasIntegrationType.JSON_PROPERTY_SOURCE_DESCRIPTION,
  DbaasIntegrationType.JSON_PROPERTY_SOURCE_SERVICE_TYPES,
  DbaasIntegrationType.JSON_PROPERTY_DEST_DESCRIPTION,
  DbaasIntegrationType.JSON_PROPERTY_DEST_SERVICE_TYPES,
  DbaasIntegrationType.JSON_PROPERTY_SETTINGS
})
@JsonTypeName("dbaas-integration-type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T16:37:05.548288+01:00[Europe/Vienna]")
public class DbaasIntegrationType {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_SOURCE_DESCRIPTION = "source-description";
  private String sourceDescription;

  public static final String JSON_PROPERTY_SOURCE_SERVICE_TYPES = "source-service-types";
  private List<String> sourceServiceTypes;

  public static final String JSON_PROPERTY_DEST_DESCRIPTION = "dest-description";
  private String destDescription;

  public static final String JSON_PROPERTY_DEST_SERVICE_TYPES = "dest-service-types";
  private List<String> destServiceTypes;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private DbaasIntegrationTypeSettings settings;

  public DbaasIntegrationType() {
  }

  public DbaasIntegrationType type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the integration.
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


  public DbaasIntegrationType sourceDescription(String sourceDescription) {
    
    this.sourceDescription = sourceDescription;
    return this;
  }

   /**
   * The description of the source service types.
   * @return sourceDescription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceDescription() {
    return sourceDescription;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceDescription(String sourceDescription) {
    this.sourceDescription = sourceDescription;
  }


  public DbaasIntegrationType sourceServiceTypes(List<String> sourceServiceTypes) {
    
    this.sourceServiceTypes = sourceServiceTypes;
    return this;
  }

  public DbaasIntegrationType addSourceServiceTypesItem(String sourceServiceTypesItem) {
    if (this.sourceServiceTypes == null) {
      this.sourceServiceTypes = new ArrayList<>();
    }
    this.sourceServiceTypes.add(sourceServiceTypesItem);
    return this;
  }

   /**
   * A list of the source service types the integration supports.
   * @return sourceServiceTypes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_SERVICE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSourceServiceTypes() {
    return sourceServiceTypes;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_SERVICE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceServiceTypes(List<String> sourceServiceTypes) {
    this.sourceServiceTypes = sourceServiceTypes;
  }


  public DbaasIntegrationType destDescription(String destDescription) {
    
    this.destDescription = destDescription;
    return this;
  }

   /**
   * The description of the destination service types.
   * @return destDescription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEST_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDestDescription() {
    return destDescription;
  }


  @JsonProperty(JSON_PROPERTY_DEST_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDestDescription(String destDescription) {
    this.destDescription = destDescription;
  }


  public DbaasIntegrationType destServiceTypes(List<String> destServiceTypes) {
    
    this.destServiceTypes = destServiceTypes;
    return this;
  }

  public DbaasIntegrationType addDestServiceTypesItem(String destServiceTypesItem) {
    if (this.destServiceTypes == null) {
      this.destServiceTypes = new ArrayList<>();
    }
    this.destServiceTypes.add(destServiceTypesItem);
    return this;
  }

   /**
   * A list of the destination service types the integration supports.
   * @return destServiceTypes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEST_SERVICE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDestServiceTypes() {
    return destServiceTypes;
  }


  @JsonProperty(JSON_PROPERTY_DEST_SERVICE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDestServiceTypes(List<String> destServiceTypes) {
    this.destServiceTypes = destServiceTypes;
  }


  public DbaasIntegrationType settings(DbaasIntegrationTypeSettings settings) {
    
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DbaasIntegrationTypeSettings getSettings() {
    return settings;
  }


  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettings(DbaasIntegrationTypeSettings settings) {
    this.settings = settings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasIntegrationType dbaasIntegrationType = (DbaasIntegrationType) o;
    return Objects.equals(this.type, dbaasIntegrationType.type) &&
        Objects.equals(this.sourceDescription, dbaasIntegrationType.sourceDescription) &&
        Objects.equals(this.sourceServiceTypes, dbaasIntegrationType.sourceServiceTypes) &&
        Objects.equals(this.destDescription, dbaasIntegrationType.destDescription) &&
        Objects.equals(this.destServiceTypes, dbaasIntegrationType.destServiceTypes) &&
        Objects.equals(this.settings, dbaasIntegrationType.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, sourceDescription, sourceServiceTypes, destDescription, destServiceTypes, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasIntegrationType {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sourceDescription: ").append(toIndentedString(sourceDescription)).append("\n");
    sb.append("    sourceServiceTypes: ").append(toIndentedString(sourceServiceTypes)).append("\n");
    sb.append("    destDescription: ").append(toIndentedString(destDescription)).append("\n");
    sb.append("    destServiceTypes: ").append(toIndentedString(destServiceTypes)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

