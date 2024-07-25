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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DbaasIntegration
 */
@JsonPropertyOrder({
  DbaasIntegration.JSON_PROPERTY_DESCRIPTION,
  DbaasIntegration.JSON_PROPERTY_SETTINGS,
  DbaasIntegration.JSON_PROPERTY_TYPE,
  DbaasIntegration.JSON_PROPERTY_IS_ENABLED,
  DbaasIntegration.JSON_PROPERTY_SOURCE,
  DbaasIntegration.JSON_PROPERTY_IS_ACTIVE,
  DbaasIntegration.JSON_PROPERTY_STATUS,
  DbaasIntegration.JSON_PROPERTY_ID,
  DbaasIntegration.JSON_PROPERTY_DEST
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-25T13:19:43.121270Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DbaasIntegration {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private Object settings;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_IS_ENABLED = "is-enabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_IS_ACTIVE = "is-active";
  private Boolean isActive;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_DEST = "dest";
  private String dest;

  public DbaasIntegration() { 
  }

  public DbaasIntegration description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the integration
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public DbaasIntegration settings(Object settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Integration settings
   * @return settings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getSettings() {
    return settings;
  }


  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettings(Object settings) {
    this.settings = settings;
  }


  public DbaasIntegration type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Integration type
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


  public DbaasIntegration isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Whether the integration is enabled or not
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public DbaasIntegration source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Source service name
   * @return source
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(String source) {
    this.source = source;
  }


  public DbaasIntegration isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Whether the integration is active or not
   * @return isActive
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsActive() {
    return isActive;
  }


  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public DbaasIntegration status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Integration status
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public DbaasIntegration id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Integration id
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public DbaasIntegration dest(String dest) {
    this.dest = dest;
    return this;
  }

   /**
   * Destination service name
   * @return dest
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDest() {
    return dest;
  }


  @JsonProperty(JSON_PROPERTY_DEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDest(String dest) {
    this.dest = dest;
  }


  /**
   * Return true if this dbaas-integration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasIntegration dbaasIntegration = (DbaasIntegration) o;
    return Objects.equals(this.description, dbaasIntegration.description) &&
        Objects.equals(this.settings, dbaasIntegration.settings) &&
        Objects.equals(this.type, dbaasIntegration.type) &&
        Objects.equals(this.isEnabled, dbaasIntegration.isEnabled) &&
        Objects.equals(this.source, dbaasIntegration.source) &&
        Objects.equals(this.isActive, dbaasIntegration.isActive) &&
        Objects.equals(this.status, dbaasIntegration.status) &&
        Objects.equals(this.id, dbaasIntegration.id) &&
        Objects.equals(this.dest, dbaasIntegration.dest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, settings, type, isEnabled, source, isActive, status, id, dest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasIntegration {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dest: ").append(toIndentedString(dest)).append("\n");
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

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `settings` to the URL query string
    if (getSettings() != null) {
      joiner.add(String.format("%ssettings%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSettings()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `is-enabled` to the URL query string
    if (getIsEnabled() != null) {
      joiner.add(String.format("%sis-enabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsEnabled()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `source` to the URL query string
    if (getSource() != null) {
      joiner.add(String.format("%ssource%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSource()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `is-active` to the URL query string
    if (getIsActive() != null) {
      joiner.add(String.format("%sis-active%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsActive()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dest` to the URL query string
    if (getDest() != null) {
      joiner.add(String.format("%sdest%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDest()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

