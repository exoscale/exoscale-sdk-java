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


package org.openapitools.client.model;

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
import org.openapitools.client.model.EnumComponentRoute;
import org.openapitools.client.model.EnumComponentUsage;
import org.openapitools.client.model.EnumKafkaAuthMethod;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DbaasServiceKafkaComponentsInner
 */
@JsonPropertyOrder({
  DbaasServiceKafkaComponentsInner.JSON_PROPERTY_COMPONENT,
  DbaasServiceKafkaComponentsInner.JSON_PROPERTY_HOST,
  DbaasServiceKafkaComponentsInner.JSON_PROPERTY_KAFKA_AUTHENTICATION_METHOD,
  DbaasServiceKafkaComponentsInner.JSON_PROPERTY_PORT,
  DbaasServiceKafkaComponentsInner.JSON_PROPERTY_ROUTE,
  DbaasServiceKafkaComponentsInner.JSON_PROPERTY_USAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T18:00:26.790082348Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class DbaasServiceKafkaComponentsInner {
  public static final String JSON_PROPERTY_COMPONENT = "component";
  private String component;

  public static final String JSON_PROPERTY_HOST = "host";
  private String host;

  public static final String JSON_PROPERTY_KAFKA_AUTHENTICATION_METHOD = "kafka-authentication-method";
  private EnumKafkaAuthMethod kafkaAuthenticationMethod;

  public static final String JSON_PROPERTY_PORT = "port";
  private Long port;

  public static final String JSON_PROPERTY_ROUTE = "route";
  private EnumComponentRoute route;

  public static final String JSON_PROPERTY_USAGE = "usage";
  private EnumComponentUsage usage;

  public DbaasServiceKafkaComponentsInner() { 
  }

  public DbaasServiceKafkaComponentsInner component(String component) {
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


  public DbaasServiceKafkaComponentsInner host(String host) {
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


  public DbaasServiceKafkaComponentsInner kafkaAuthenticationMethod(EnumKafkaAuthMethod kafkaAuthenticationMethod) {
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


  public DbaasServiceKafkaComponentsInner port(Long port) {
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


  public DbaasServiceKafkaComponentsInner route(EnumComponentRoute route) {
    this.route = route;
    return this;
  }

   /**
   * Get route
   * @return route
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EnumComponentRoute getRoute() {
    return route;
  }


  @JsonProperty(JSON_PROPERTY_ROUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoute(EnumComponentRoute route) {
    this.route = route;
  }


  public DbaasServiceKafkaComponentsInner usage(EnumComponentUsage usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EnumComponentUsage getUsage() {
    return usage;
  }


  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUsage(EnumComponentUsage usage) {
    this.usage = usage;
  }


  /**
   * Return true if this dbaas_service_kafka_components_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasServiceKafkaComponentsInner dbaasServiceKafkaComponentsInner = (DbaasServiceKafkaComponentsInner) o;
    return Objects.equals(this.component, dbaasServiceKafkaComponentsInner.component) &&
        Objects.equals(this.host, dbaasServiceKafkaComponentsInner.host) &&
        Objects.equals(this.kafkaAuthenticationMethod, dbaasServiceKafkaComponentsInner.kafkaAuthenticationMethod) &&
        Objects.equals(this.port, dbaasServiceKafkaComponentsInner.port) &&
        Objects.equals(this.route, dbaasServiceKafkaComponentsInner.route) &&
        Objects.equals(this.usage, dbaasServiceKafkaComponentsInner.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, host, kafkaAuthenticationMethod, port, route, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasServiceKafkaComponentsInner {\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    kafkaAuthenticationMethod: ").append(toIndentedString(kafkaAuthenticationMethod)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
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

    // add `port` to the URL query string
    if (getPort() != null) {
      joiner.add(String.format("%sport%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPort()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `route` to the URL query string
    if (getRoute() != null) {
      joiner.add(String.format("%sroute%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoute()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `usage` to the URL query string
    if (getUsage() != null) {
      joiner.add(String.format("%susage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUsage()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

