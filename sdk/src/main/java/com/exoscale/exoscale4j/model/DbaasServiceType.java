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
import com.exoscale.exoscale4j.model.DbaasPlan;
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
 * DBaaS service
 */
@JsonPropertyOrder({
  DbaasServiceType.JSON_PROPERTY_NAME,
  DbaasServiceType.JSON_PROPERTY_AVAILABLE_VERSIONS,
  DbaasServiceType.JSON_PROPERTY_DEFAULT_VERSION,
  DbaasServiceType.JSON_PROPERTY_DESCRIPTION,
  DbaasServiceType.JSON_PROPERTY_PLANS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-03T20:04:17.479783+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class DbaasServiceType {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_AVAILABLE_VERSIONS = "available-versions";
  private List<String> availableVersions;

  public static final String JSON_PROPERTY_DEFAULT_VERSION = "default-version";
  private String defaultVersion;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_PLANS = "plans";
  private List<DbaasPlan> plans;

  public DbaasServiceType() { 
  }

  @JsonCreator
  public DbaasServiceType(
    @JsonProperty(JSON_PROPERTY_AVAILABLE_VERSIONS) List<String> availableVersions, 
    @JsonProperty(JSON_PROPERTY_DEFAULT_VERSION) String defaultVersion, 
    @JsonProperty(JSON_PROPERTY_DESCRIPTION) String description, 
    @JsonProperty(JSON_PROPERTY_PLANS) List<DbaasPlan> plans
  ) {
  this();
    this.availableVersions = availableVersions;
    this.defaultVersion = defaultVersion;
    this.description = description;
    this.plans = plans;
  }

  public DbaasServiceType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


   /**
   * DbaaS service available versions
   * @return availableVersions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABLE_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAvailableVersions() {
    return availableVersions;
  }




   /**
   * DbaaS service default version
   * @return defaultVersion
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultVersion() {
    return defaultVersion;
  }




   /**
   * DbaaS service description
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }




   /**
   * DbaaS service plans
   * @return plans
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DbaasPlan> getPlans() {
    return plans;
  }




  /**
   * Return true if this dbaas-service-type object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasServiceType dbaasServiceType = (DbaasServiceType) o;
    return Objects.equals(this.name, dbaasServiceType.name) &&
        Objects.equals(this.availableVersions, dbaasServiceType.availableVersions) &&
        Objects.equals(this.defaultVersion, dbaasServiceType.defaultVersion) &&
        Objects.equals(this.description, dbaasServiceType.description) &&
        Objects.equals(this.plans, dbaasServiceType.plans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, availableVersions, defaultVersion, description, plans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasServiceType {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    availableVersions: ").append(toIndentedString(availableVersions)).append("\n");
    sb.append("    defaultVersion: ").append(toIndentedString(defaultVersion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `available-versions` to the URL query string
    if (getAvailableVersions() != null) {
      for (int i = 0; i < getAvailableVersions().size(); i++) {
        joiner.add(String.format("%savailable-versions%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getAvailableVersions().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `default-version` to the URL query string
    if (getDefaultVersion() != null) {
      joiner.add(String.format("%sdefault-version%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDefaultVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `plans` to the URL query string
    if (getPlans() != null) {
      for (int i = 0; i < getPlans().size(); i++) {
        if (getPlans().get(i) != null) {
          joiner.add(getPlans().get(i).toUrlQueryString(String.format("%splans%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

