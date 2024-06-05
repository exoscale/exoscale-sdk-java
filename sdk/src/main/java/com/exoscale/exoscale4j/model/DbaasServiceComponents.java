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
import com.exoscale.exoscale4j.model.EnumKafkaAuthMethod;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Service component information objects
 */
@JsonPropertyOrder({
  DbaasServiceComponents.JSON_PROPERTY_COMPONENT,
  DbaasServiceComponents.JSON_PROPERTY_HOST,
  DbaasServiceComponents.JSON_PROPERTY_KAFKA_AUTHENTICATION_METHOD,
  DbaasServiceComponents.JSON_PROPERTY_PATH,
  DbaasServiceComponents.JSON_PROPERTY_PORT,
  DbaasServiceComponents.JSON_PROPERTY_ROUTE,
  DbaasServiceComponents.JSON_PROPERTY_SSL,
  DbaasServiceComponents.JSON_PROPERTY_USAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-05T10:50:16.155057+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class DbaasServiceComponents {
  public static final String JSON_PROPERTY_COMPONENT = "component";
  private String component;

  public static final String JSON_PROPERTY_HOST = "host";
  private String host;

  public static final String JSON_PROPERTY_KAFKA_AUTHENTICATION_METHOD = "kafka-authentication-method";
  private EnumKafkaAuthMethod kafkaAuthenticationMethod;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public static final String JSON_PROPERTY_PORT = "port";
  private Long port;

  /**
   * Network access route
   */
  public enum RouteEnum {
    DYNAMIC("dynamic"),
    
    PRIVATE("private"),
    
    PUBLIC("public"),
    
    PRIVATELINK("privatelink");

    private String value;

    RouteEnum(String value) {
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
    public static RouteEnum fromValue(String value) {
      for (RouteEnum b : RouteEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ROUTE = "route";
  private RouteEnum route;

  public static final String JSON_PROPERTY_SSL = "ssl";
  private Boolean ssl;

  /**
   * DNS usage name
   */
  public enum UsageEnum {
    PRIMARY("primary"),
    
    REPLICA("replica");

    private String value;

    UsageEnum(String value) {
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
    public static UsageEnum fromValue(String value) {
      for (UsageEnum b : UsageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_USAGE = "usage";
  private UsageEnum usage;

  public DbaasServiceComponents() { 
  }

  public DbaasServiceComponents component(String component) {
    this.component = component;
    return this;
  }

   /**
   * Service component name
   * @return component
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMPONENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getComponent() {
    return component;
  }


  @JsonProperty(JSON_PROPERTY_COMPONENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setComponent(String component) {
    this.component = component;
  }


  public DbaasServiceComponents host(String host) {
    this.host = host;
    return this;
  }

   /**
   * DNS name for connecting to the service component
   * @return host
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HOST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHost() {
    return host;
  }


  @JsonProperty(JSON_PROPERTY_HOST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHost(String host) {
    this.host = host;
  }


  public DbaasServiceComponents kafkaAuthenticationMethod(EnumKafkaAuthMethod kafkaAuthenticationMethod) {
    this.kafkaAuthenticationMethod = kafkaAuthenticationMethod;
    return this;
  }

   /**
   * Get kafkaAuthenticationMethod
   * @return kafkaAuthenticationMethod
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KAFKA_AUTHENTICATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EnumKafkaAuthMethod getKafkaAuthenticationMethod() {
    return kafkaAuthenticationMethod;
  }


  @JsonProperty(JSON_PROPERTY_KAFKA_AUTHENTICATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKafkaAuthenticationMethod(EnumKafkaAuthMethod kafkaAuthenticationMethod) {
    this.kafkaAuthenticationMethod = kafkaAuthenticationMethod;
  }


  public DbaasServiceComponents path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Path component of the service URL (useful only if service component is HTTP or HTTPS endpoint)
   * @return path
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPath() {
    return path;
  }


  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPath(String path) {
    this.path = path;
  }


  public DbaasServiceComponents port(Long port) {
    this.port = port;
    return this;
  }

   /**
   * Port number for connecting to the service component
   * minimum: 0
   * maximum: 65535
   * @return port
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getPort() {
    return port;
  }


  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPort(Long port) {
    this.port = port;
  }


  public DbaasServiceComponents route(RouteEnum route) {
    this.route = route;
    return this;
  }

   /**
   * Network access route
   * @return route
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RouteEnum getRoute() {
    return route;
  }


  @JsonProperty(JSON_PROPERTY_ROUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoute(RouteEnum route) {
    this.route = route;
  }


  public DbaasServiceComponents ssl(Boolean ssl) {
    this.ssl = ssl;
    return this;
  }

   /**
   * Whether the endpoint is encrypted or accepts plaintext.                                            By default endpoints are always encrypted and                                            this property is only included for service components that may disable encryption.
   * @return ssl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSsl() {
    return ssl;
  }


  @JsonProperty(JSON_PROPERTY_SSL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSsl(Boolean ssl) {
    this.ssl = ssl;
  }


  public DbaasServiceComponents usage(UsageEnum usage) {
    this.usage = usage;
    return this;
  }

   /**
   * DNS usage name
   * @return usage
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UsageEnum getUsage() {
    return usage;
  }


  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUsage(UsageEnum usage) {
    this.usage = usage;
  }


  /**
   * Return true if this dbaas-service-components object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasServiceComponents dbaasServiceComponents = (DbaasServiceComponents) o;
    return Objects.equals(this.component, dbaasServiceComponents.component) &&
        Objects.equals(this.host, dbaasServiceComponents.host) &&
        Objects.equals(this.kafkaAuthenticationMethod, dbaasServiceComponents.kafkaAuthenticationMethod) &&
        Objects.equals(this.path, dbaasServiceComponents.path) &&
        Objects.equals(this.port, dbaasServiceComponents.port) &&
        Objects.equals(this.route, dbaasServiceComponents.route) &&
        Objects.equals(this.ssl, dbaasServiceComponents.ssl) &&
        Objects.equals(this.usage, dbaasServiceComponents.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, host, kafkaAuthenticationMethod, path, port, route, ssl, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasServiceComponents {\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    kafkaAuthenticationMethod: ").append(toIndentedString(kafkaAuthenticationMethod)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

    // add `component` to the URL query string
    if (getComponent() != null) {
      joiner.add(String.format("%scomponent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getComponent()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `host` to the URL query string
    if (getHost() != null) {
      joiner.add(String.format("%shost%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHost()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `kafka-authentication-method` to the URL query string
    if (getKafkaAuthenticationMethod() != null) {
      joiner.add(String.format("%skafka-authentication-method%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKafkaAuthenticationMethod()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `path` to the URL query string
    if (getPath() != null) {
      joiner.add(String.format("%spath%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPath()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `port` to the URL query string
    if (getPort() != null) {
      joiner.add(String.format("%sport%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPort()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `route` to the URL query string
    if (getRoute() != null) {
      joiner.add(String.format("%sroute%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoute()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ssl` to the URL query string
    if (getSsl() != null) {
      joiner.add(String.format("%sssl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSsl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `usage` to the URL query string
    if (getUsage() != null) {
      joiner.add(String.format("%susage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUsage()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

