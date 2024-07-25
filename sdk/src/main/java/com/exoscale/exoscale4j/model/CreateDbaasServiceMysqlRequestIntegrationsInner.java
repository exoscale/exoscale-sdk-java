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
 * CreateDbaasServiceMysqlRequestIntegrationsInner
 */
@JsonPropertyOrder({
  CreateDbaasServiceMysqlRequestIntegrationsInner.JSON_PROPERTY_TYPE,
  CreateDbaasServiceMysqlRequestIntegrationsInner.JSON_PROPERTY_SOURCE_SERVICE,
  CreateDbaasServiceMysqlRequestIntegrationsInner.JSON_PROPERTY_DEST_SERVICE,
  CreateDbaasServiceMysqlRequestIntegrationsInner.JSON_PROPERTY_SETTINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-25T13:26:02.309598Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateDbaasServiceMysqlRequestIntegrationsInner {
  /**
   * Integration type
   */
  public enum TypeEnum {
    READ_REPLICA("read_replica");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_SOURCE_SERVICE = "source-service";
  private String sourceService;

  public static final String JSON_PROPERTY_DEST_SERVICE = "dest-service";
  private String destService;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private Object settings;

  public CreateDbaasServiceMysqlRequestIntegrationsInner() { 
  }

  public CreateDbaasServiceMysqlRequestIntegrationsInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Integration type
   * @return type
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CreateDbaasServiceMysqlRequestIntegrationsInner sourceService(String sourceService) {
    this.sourceService = sourceService;
    return this;
  }

   /**
   * Get sourceService
   * @return sourceService
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceService() {
    return sourceService;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceService(String sourceService) {
    this.sourceService = sourceService;
  }


  public CreateDbaasServiceMysqlRequestIntegrationsInner destService(String destService) {
    this.destService = destService;
    return this;
  }

   /**
   * Get destService
   * @return destService
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEST_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDestService() {
    return destService;
  }


  @JsonProperty(JSON_PROPERTY_DEST_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDestService(String destService) {
    this.destService = destService;
  }


  public CreateDbaasServiceMysqlRequestIntegrationsInner settings(Object settings) {
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


  /**
   * Return true if this create_dbaas_service_mysql_request_integrations_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDbaasServiceMysqlRequestIntegrationsInner createDbaasServiceMysqlRequestIntegrationsInner = (CreateDbaasServiceMysqlRequestIntegrationsInner) o;
    return Objects.equals(this.type, createDbaasServiceMysqlRequestIntegrationsInner.type) &&
        Objects.equals(this.sourceService, createDbaasServiceMysqlRequestIntegrationsInner.sourceService) &&
        Objects.equals(this.destService, createDbaasServiceMysqlRequestIntegrationsInner.destService) &&
        Objects.equals(this.settings, createDbaasServiceMysqlRequestIntegrationsInner.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, sourceService, destService, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDbaasServiceMysqlRequestIntegrationsInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sourceService: ").append(toIndentedString(sourceService)).append("\n");
    sb.append("    destService: ").append(toIndentedString(destService)).append("\n");
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

    // add `source-service` to the URL query string
    if (getSourceService() != null) {
      joiner.add(String.format("%ssource-service%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSourceService()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dest-service` to the URL query string
    if (getDestService() != null) {
      joiner.add(String.format("%sdest-service%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDestService()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `settings` to the URL query string
    if (getSettings() != null) {
      joiner.add(String.format("%ssettings%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSettings()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

