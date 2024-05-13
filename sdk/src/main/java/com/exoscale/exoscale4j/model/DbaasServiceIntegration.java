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
 * Integrations with other services
 */
@JsonPropertyOrder({
  DbaasServiceIntegration.JSON_PROPERTY_INTEGRATION_STATUS,
  DbaasServiceIntegration.JSON_PROPERTY_DESCRIPTION,
  DbaasServiceIntegration.JSON_PROPERTY_SOURCE_SERVICE_TYPE,
  DbaasServiceIntegration.JSON_PROPERTY_SOURCE_ENDPOINT,
  DbaasServiceIntegration.JSON_PROPERTY_DEST_SERVICE_TYPE,
  DbaasServiceIntegration.JSON_PROPERTY_INTEGRATION_TYPE,
  DbaasServiceIntegration.JSON_PROPERTY_DEST_ENDPOINT,
  DbaasServiceIntegration.JSON_PROPERTY_USER_CONFIG,
  DbaasServiceIntegration.JSON_PROPERTY_DEST_ENDPOINT_ID,
  DbaasServiceIntegration.JSON_PROPERTY_SERVICE_INTEGRATION_ID,
  DbaasServiceIntegration.JSON_PROPERTY_DEST_SERVICE,
  DbaasServiceIntegration.JSON_PROPERTY_ACTIVE,
  DbaasServiceIntegration.JSON_PROPERTY_SOURCE_ENDPOINT_ID,
  DbaasServiceIntegration.JSON_PROPERTY_SOURCE_SERVICE,
  DbaasServiceIntegration.JSON_PROPERTY_ENABLED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T11:36:46.703938+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class DbaasServiceIntegration {
  public static final String JSON_PROPERTY_INTEGRATION_STATUS = "integration-status";
  private Object integrationStatus;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_SOURCE_SERVICE_TYPE = "source-service-type";
  private String sourceServiceType;

  public static final String JSON_PROPERTY_SOURCE_ENDPOINT = "source-endpoint";
  private String sourceEndpoint;

  public static final String JSON_PROPERTY_DEST_SERVICE_TYPE = "dest-service-type";
  private String destServiceType;

  public static final String JSON_PROPERTY_INTEGRATION_TYPE = "integration-type";
  private String integrationType;

  public static final String JSON_PROPERTY_DEST_ENDPOINT = "dest-endpoint";
  private String destEndpoint;

  public static final String JSON_PROPERTY_USER_CONFIG = "user-config";
  private Object userConfig;

  public static final String JSON_PROPERTY_DEST_ENDPOINT_ID = "dest-endpoint-id";
  private String destEndpointId;

  public static final String JSON_PROPERTY_SERVICE_INTEGRATION_ID = "service-integration-id";
  private String serviceIntegrationId;

  public static final String JSON_PROPERTY_DEST_SERVICE = "dest-service";
  private String destService;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_SOURCE_ENDPOINT_ID = "source-endpoint-id";
  private String sourceEndpointId;

  public static final String JSON_PROPERTY_SOURCE_SERVICE = "source-service";
  private String sourceService;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public DbaasServiceIntegration() { 
  }

  public DbaasServiceIntegration integrationStatus(Object integrationStatus) {
    this.integrationStatus = integrationStatus;
    return this;
  }

   /**
   * Integration status
   * @return integrationStatus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getIntegrationStatus() {
    return integrationStatus;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrationStatus(Object integrationStatus) {
    this.integrationStatus = integrationStatus;
  }


  public DbaasServiceIntegration description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the integration
   * @return description
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public DbaasServiceIntegration sourceServiceType(String sourceServiceType) {
    this.sourceServiceType = sourceServiceType;
    return this;
  }

   /**
   * Get sourceServiceType
   * @return sourceServiceType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SOURCE_SERVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSourceServiceType() {
    return sourceServiceType;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_SERVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSourceServiceType(String sourceServiceType) {
    this.sourceServiceType = sourceServiceType;
  }


  public DbaasServiceIntegration sourceEndpoint(String sourceEndpoint) {
    this.sourceEndpoint = sourceEndpoint;
    return this;
  }

   /**
   * Source endpoint name
   * @return sourceEndpoint
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceEndpoint() {
    return sourceEndpoint;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceEndpoint(String sourceEndpoint) {
    this.sourceEndpoint = sourceEndpoint;
  }


  public DbaasServiceIntegration destServiceType(String destServiceType) {
    this.destServiceType = destServiceType;
    return this;
  }

   /**
   * Get destServiceType
   * @return destServiceType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEST_SERVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDestServiceType() {
    return destServiceType;
  }


  @JsonProperty(JSON_PROPERTY_DEST_SERVICE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDestServiceType(String destServiceType) {
    this.destServiceType = destServiceType;
  }


  public DbaasServiceIntegration integrationType(String integrationType) {
    this.integrationType = integrationType;
    return this;
  }

   /**
   * Type of the integration
   * @return integrationType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIntegrationType() {
    return integrationType;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIntegrationType(String integrationType) {
    this.integrationType = integrationType;
  }


  public DbaasServiceIntegration destEndpoint(String destEndpoint) {
    this.destEndpoint = destEndpoint;
    return this;
  }

   /**
   * Destination endpoint name
   * @return destEndpoint
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEST_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDestEndpoint() {
    return destEndpoint;
  }


  @JsonProperty(JSON_PROPERTY_DEST_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDestEndpoint(String destEndpoint) {
    this.destEndpoint = destEndpoint;
  }


  public DbaasServiceIntegration userConfig(Object userConfig) {
    this.userConfig = userConfig;
    return this;
  }

   /**
   * Service integration settings
   * @return userConfig
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getUserConfig() {
    return userConfig;
  }


  @JsonProperty(JSON_PROPERTY_USER_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserConfig(Object userConfig) {
    this.userConfig = userConfig;
  }


  public DbaasServiceIntegration destEndpointId(String destEndpointId) {
    this.destEndpointId = destEndpointId;
    return this;
  }

   /**
   * Destination endpoint id
   * @return destEndpointId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEST_ENDPOINT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDestEndpointId() {
    return destEndpointId;
  }


  @JsonProperty(JSON_PROPERTY_DEST_ENDPOINT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDestEndpointId(String destEndpointId) {
    this.destEndpointId = destEndpointId;
  }


  public DbaasServiceIntegration serviceIntegrationId(String serviceIntegrationId) {
    this.serviceIntegrationId = serviceIntegrationId;
    return this;
  }

   /**
   * Integration ID
   * @return serviceIntegrationId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SERVICE_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getServiceIntegrationId() {
    return serviceIntegrationId;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServiceIntegrationId(String serviceIntegrationId) {
    this.serviceIntegrationId = serviceIntegrationId;
  }


  public DbaasServiceIntegration destService(String destService) {
    this.destService = destService;
    return this;
  }

   /**
   * Destination service name
   * @return destService
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEST_SERVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDestService() {
    return destService;
  }


  @JsonProperty(JSON_PROPERTY_DEST_SERVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDestService(String destService) {
    this.destService = destService;
  }


  public DbaasServiceIntegration active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * True when integration is active
   * @return active
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public DbaasServiceIntegration sourceEndpointId(String sourceEndpointId) {
    this.sourceEndpointId = sourceEndpointId;
    return this;
  }

   /**
   * Source endpoint ID
   * @return sourceEndpointId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_ENDPOINT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceEndpointId() {
    return sourceEndpointId;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_ENDPOINT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceEndpointId(String sourceEndpointId) {
    this.sourceEndpointId = sourceEndpointId;
  }


  public DbaasServiceIntegration sourceService(String sourceService) {
    this.sourceService = sourceService;
    return this;
  }

   /**
   * Source service name
   * @return sourceService
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SOURCE_SERVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSourceService() {
    return sourceService;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_SERVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSourceService(String sourceService) {
    this.sourceService = sourceService;
  }


  public DbaasServiceIntegration enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * True when integration is enabled
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * Return true if this dbaas-service-integration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasServiceIntegration dbaasServiceIntegration = (DbaasServiceIntegration) o;
    return Objects.equals(this.integrationStatus, dbaasServiceIntegration.integrationStatus) &&
        Objects.equals(this.description, dbaasServiceIntegration.description) &&
        Objects.equals(this.sourceServiceType, dbaasServiceIntegration.sourceServiceType) &&
        Objects.equals(this.sourceEndpoint, dbaasServiceIntegration.sourceEndpoint) &&
        Objects.equals(this.destServiceType, dbaasServiceIntegration.destServiceType) &&
        Objects.equals(this.integrationType, dbaasServiceIntegration.integrationType) &&
        Objects.equals(this.destEndpoint, dbaasServiceIntegration.destEndpoint) &&
        Objects.equals(this.userConfig, dbaasServiceIntegration.userConfig) &&
        Objects.equals(this.destEndpointId, dbaasServiceIntegration.destEndpointId) &&
        Objects.equals(this.serviceIntegrationId, dbaasServiceIntegration.serviceIntegrationId) &&
        Objects.equals(this.destService, dbaasServiceIntegration.destService) &&
        Objects.equals(this.active, dbaasServiceIntegration.active) &&
        Objects.equals(this.sourceEndpointId, dbaasServiceIntegration.sourceEndpointId) &&
        Objects.equals(this.sourceService, dbaasServiceIntegration.sourceService) &&
        Objects.equals(this.enabled, dbaasServiceIntegration.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationStatus, description, sourceServiceType, sourceEndpoint, destServiceType, integrationType, destEndpoint, userConfig, destEndpointId, serviceIntegrationId, destService, active, sourceEndpointId, sourceService, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasServiceIntegration {\n");
    sb.append("    integrationStatus: ").append(toIndentedString(integrationStatus)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sourceServiceType: ").append(toIndentedString(sourceServiceType)).append("\n");
    sb.append("    sourceEndpoint: ").append(toIndentedString(sourceEndpoint)).append("\n");
    sb.append("    destServiceType: ").append(toIndentedString(destServiceType)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    destEndpoint: ").append(toIndentedString(destEndpoint)).append("\n");
    sb.append("    userConfig: ").append(toIndentedString(userConfig)).append("\n");
    sb.append("    destEndpointId: ").append(toIndentedString(destEndpointId)).append("\n");
    sb.append("    serviceIntegrationId: ").append(toIndentedString(serviceIntegrationId)).append("\n");
    sb.append("    destService: ").append(toIndentedString(destService)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    sourceEndpointId: ").append(toIndentedString(sourceEndpointId)).append("\n");
    sb.append("    sourceService: ").append(toIndentedString(sourceService)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

    // add `integration-status` to the URL query string
    if (getIntegrationStatus() != null) {
      joiner.add(String.format("%sintegration-status%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIntegrationStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `source-service-type` to the URL query string
    if (getSourceServiceType() != null) {
      joiner.add(String.format("%ssource-service-type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSourceServiceType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `source-endpoint` to the URL query string
    if (getSourceEndpoint() != null) {
      joiner.add(String.format("%ssource-endpoint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSourceEndpoint()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dest-service-type` to the URL query string
    if (getDestServiceType() != null) {
      joiner.add(String.format("%sdest-service-type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDestServiceType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `integration-type` to the URL query string
    if (getIntegrationType() != null) {
      joiner.add(String.format("%sintegration-type%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIntegrationType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dest-endpoint` to the URL query string
    if (getDestEndpoint() != null) {
      joiner.add(String.format("%sdest-endpoint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDestEndpoint()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `user-config` to the URL query string
    if (getUserConfig() != null) {
      joiner.add(String.format("%suser-config%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserConfig()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dest-endpoint-id` to the URL query string
    if (getDestEndpointId() != null) {
      joiner.add(String.format("%sdest-endpoint-id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDestEndpointId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `service-integration-id` to the URL query string
    if (getServiceIntegrationId() != null) {
      joiner.add(String.format("%sservice-integration-id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServiceIntegrationId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dest-service` to the URL query string
    if (getDestService() != null) {
      joiner.add(String.format("%sdest-service%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDestService()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `active` to the URL query string
    if (getActive() != null) {
      joiner.add(String.format("%sactive%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActive()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `source-endpoint-id` to the URL query string
    if (getSourceEndpointId() != null) {
      joiner.add(String.format("%ssource-endpoint-id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSourceEndpointId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `source-service` to the URL query string
    if (getSourceService() != null) {
      joiner.add(String.format("%ssource-service%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSourceService()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `enabled` to the URL query string
    if (getEnabled() != null) {
      joiner.add(String.format("%senabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnabled()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

