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
 * Access key resource
 */
@JsonPropertyOrder({
  AccessKeyResource.JSON_PROPERTY_DOMAIN,
  AccessKeyResource.JSON_PROPERTY_RESOURCE_TYPE,
  AccessKeyResource.JSON_PROPERTY_RESOURCE_NAME
})
@JsonTypeName("access-key-resource")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T21:01:33.231699+01:00[Europe/Vienna]")
public class AccessKeyResource {
  /**
   * Resource domain
   */
  public enum DomainEnum {
    PARTNER("partner"),
    
    SOS("sos");

    private String value;

    DomainEnum(String value) {
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
    public static DomainEnum fromValue(String value) {
      for (DomainEnum b : DomainEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private DomainEnum domain;

  /**
   * Resource type
   */
  public enum ResourceTypeEnum {
    PRODUCT("product"),
    
    BUCKET("bucket");

    private String value;

    ResourceTypeEnum(String value) {
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
    public static ResourceTypeEnum fromValue(String value) {
      for (ResourceTypeEnum b : ResourceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resource-type";
  private ResourceTypeEnum resourceType;

  public static final String JSON_PROPERTY_RESOURCE_NAME = "resource-name";
  private String resourceName;

  public AccessKeyResource() {
  }

  public AccessKeyResource domain(DomainEnum domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * Resource domain
   * @return domain
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DomainEnum getDomain() {
    return domain;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomain(DomainEnum domain) {
    this.domain = domain;
  }


  public AccessKeyResource resourceType(ResourceTypeEnum resourceType) {
    
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Resource type
   * @return resourceType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
  }


  public AccessKeyResource resourceName(String resourceName) {
    
    this.resourceName = resourceName;
    return this;
  }

   /**
   * Resource name
   * @return resourceName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResourceName() {
    return resourceName;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessKeyResource accessKeyResource = (AccessKeyResource) o;
    return Objects.equals(this.domain, accessKeyResource.domain) &&
        Objects.equals(this.resourceType, accessKeyResource.resourceType) &&
        Objects.equals(this.resourceName, accessKeyResource.resourceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, resourceType, resourceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessKeyResource {\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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

