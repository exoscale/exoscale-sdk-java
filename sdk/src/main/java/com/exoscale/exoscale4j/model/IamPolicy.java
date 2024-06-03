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
import com.exoscale.exoscale4j.model.IamServicePolicy;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Policy
 */
@JsonPropertyOrder({
  IamPolicy.JSON_PROPERTY_DEFAULT_SERVICE_STRATEGY,
  IamPolicy.JSON_PROPERTY_SERVICES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-03T20:04:17.479783+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class IamPolicy {
  /**
   * IAM default service strategy
   */
  public enum DefaultServiceStrategyEnum {
    ALLOW("allow"),
    
    DENY("deny");

    private String value;

    DefaultServiceStrategyEnum(String value) {
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
    public static DefaultServiceStrategyEnum fromValue(String value) {
      for (DefaultServiceStrategyEnum b : DefaultServiceStrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DEFAULT_SERVICE_STRATEGY = "default-service-strategy";
  private DefaultServiceStrategyEnum defaultServiceStrategy;

  public static final String JSON_PROPERTY_SERVICES = "services";
  private Map<String, IamServicePolicy> services = new HashMap<>();

  public IamPolicy() { 
  }

  public IamPolicy defaultServiceStrategy(DefaultServiceStrategyEnum defaultServiceStrategy) {
    this.defaultServiceStrategy = defaultServiceStrategy;
    return this;
  }

   /**
   * IAM default service strategy
   * @return defaultServiceStrategy
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEFAULT_SERVICE_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DefaultServiceStrategyEnum getDefaultServiceStrategy() {
    return defaultServiceStrategy;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_SERVICE_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDefaultServiceStrategy(DefaultServiceStrategyEnum defaultServiceStrategy) {
    this.defaultServiceStrategy = defaultServiceStrategy;
  }


  public IamPolicy services(Map<String, IamServicePolicy> services) {
    this.services = services;
    return this;
  }

  public IamPolicy putServicesItem(String key, IamServicePolicy servicesItem) {
    if (this.services == null) {
      this.services = new HashMap<>();
    }
    this.services.put(key, servicesItem);
    return this;
  }

   /**
   * IAM services
   * @return services
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SERVICES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Map<String, IamServicePolicy> getServices() {
    return services;
  }


  @JsonProperty(JSON_PROPERTY_SERVICES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServices(Map<String, IamServicePolicy> services) {
    this.services = services;
  }


  /**
   * Return true if this iam-policy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IamPolicy iamPolicy = (IamPolicy) o;
    return Objects.equals(this.defaultServiceStrategy, iamPolicy.defaultServiceStrategy) &&
        Objects.equals(this.services, iamPolicy.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultServiceStrategy, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IamPolicy {\n");
    sb.append("    defaultServiceStrategy: ").append(toIndentedString(defaultServiceStrategy)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

    // add `default-service-strategy` to the URL query string
    if (getDefaultServiceStrategy() != null) {
      joiner.add(String.format("%sdefault-service-strategy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDefaultServiceStrategy()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `services` to the URL query string
    if (getServices() != null) {
      for (String _key : getServices().keySet()) {
        if (getServices().get(_key) != null) {
          joiner.add(getServices().get(_key).toUrlQueryString(String.format("%sservices%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

