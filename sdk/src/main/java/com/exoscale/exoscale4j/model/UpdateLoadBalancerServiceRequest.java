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
import com.exoscale.exoscale4j.model.LoadBalancerServiceHealthcheck;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UpdateLoadBalancerServiceRequest
 */
@JsonPropertyOrder({
  UpdateLoadBalancerServiceRequest.JSON_PROPERTY_NAME,
  UpdateLoadBalancerServiceRequest.JSON_PROPERTY_DESCRIPTION,
  UpdateLoadBalancerServiceRequest.JSON_PROPERTY_PROTOCOL,
  UpdateLoadBalancerServiceRequest.JSON_PROPERTY_STRATEGY,
  UpdateLoadBalancerServiceRequest.JSON_PROPERTY_PORT,
  UpdateLoadBalancerServiceRequest.JSON_PROPERTY_TARGET_PORT,
  UpdateLoadBalancerServiceRequest.JSON_PROPERTY_HEALTHCHECK
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T19:17:33.820745+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class UpdateLoadBalancerServiceRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  /**
   * Network traffic protocol
   */
  public enum ProtocolEnum {
    TCP("tcp"),
    
    UDP("udp");

    private String value;

    ProtocolEnum(String value) {
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
    public static ProtocolEnum fromValue(String value) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private ProtocolEnum protocol;

  /**
   * Load balancing strategy
   */
  public enum StrategyEnum {
    ROUND_ROBIN("round-robin"),
    
    SOURCE_HASH("source-hash");

    private String value;

    StrategyEnum(String value) {
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
    public static StrategyEnum fromValue(String value) {
      for (StrategyEnum b : StrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STRATEGY = "strategy";
  private StrategyEnum strategy;

  public static final String JSON_PROPERTY_PORT = "port";
  private Long port;

  public static final String JSON_PROPERTY_TARGET_PORT = "target-port";
  private Long targetPort;

  public static final String JSON_PROPERTY_HEALTHCHECK = "healthcheck";
  private LoadBalancerServiceHealthcheck healthcheck;

  public UpdateLoadBalancerServiceRequest() { 
  }

  public UpdateLoadBalancerServiceRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Load Balancer Service name
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


  public UpdateLoadBalancerServiceRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Load Balancer Service description
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


  public UpdateLoadBalancerServiceRequest protocol(ProtocolEnum protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Network traffic protocol
   * @return protocol
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProtocolEnum getProtocol() {
    return protocol;
  }


  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }


  public UpdateLoadBalancerServiceRequest strategy(StrategyEnum strategy) {
    this.strategy = strategy;
    return this;
  }

   /**
   * Load balancing strategy
   * @return strategy
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StrategyEnum getStrategy() {
    return strategy;
  }


  @JsonProperty(JSON_PROPERTY_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrategy(StrategyEnum strategy) {
    this.strategy = strategy;
  }


  public UpdateLoadBalancerServiceRequest port(Long port) {
    this.port = port;
    return this;
  }

   /**
   * Port exposed on the Load Balancer&#39;s public IP
   * minimum: 1
   * maximum: 65535
   * @return port
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPort() {
    return port;
  }


  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPort(Long port) {
    this.port = port;
  }


  public UpdateLoadBalancerServiceRequest targetPort(Long targetPort) {
    this.targetPort = targetPort;
    return this;
  }

   /**
   * Port on which the network traffic will be forwarded to on the receiving instance
   * minimum: 1
   * maximum: 65535
   * @return targetPort
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTargetPort() {
    return targetPort;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetPort(Long targetPort) {
    this.targetPort = targetPort;
  }


  public UpdateLoadBalancerServiceRequest healthcheck(LoadBalancerServiceHealthcheck healthcheck) {
    this.healthcheck = healthcheck;
    return this;
  }

   /**
   * Get healthcheck
   * @return healthcheck
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEALTHCHECK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LoadBalancerServiceHealthcheck getHealthcheck() {
    return healthcheck;
  }


  @JsonProperty(JSON_PROPERTY_HEALTHCHECK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHealthcheck(LoadBalancerServiceHealthcheck healthcheck) {
    this.healthcheck = healthcheck;
  }


  /**
   * Return true if this update_load_balancer_service_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateLoadBalancerServiceRequest updateLoadBalancerServiceRequest = (UpdateLoadBalancerServiceRequest) o;
    return Objects.equals(this.name, updateLoadBalancerServiceRequest.name) &&
        Objects.equals(this.description, updateLoadBalancerServiceRequest.description) &&
        Objects.equals(this.protocol, updateLoadBalancerServiceRequest.protocol) &&
        Objects.equals(this.strategy, updateLoadBalancerServiceRequest.strategy) &&
        Objects.equals(this.port, updateLoadBalancerServiceRequest.port) &&
        Objects.equals(this.targetPort, updateLoadBalancerServiceRequest.targetPort) &&
        Objects.equals(this.healthcheck, updateLoadBalancerServiceRequest.healthcheck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, protocol, strategy, port, targetPort, healthcheck);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLoadBalancerServiceRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    targetPort: ").append(toIndentedString(targetPort)).append("\n");
    sb.append("    healthcheck: ").append(toIndentedString(healthcheck)).append("\n");
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

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `protocol` to the URL query string
    if (getProtocol() != null) {
      joiner.add(String.format("%sprotocol%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProtocol()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `strategy` to the URL query string
    if (getStrategy() != null) {
      joiner.add(String.format("%sstrategy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStrategy()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `port` to the URL query string
    if (getPort() != null) {
      joiner.add(String.format("%sport%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPort()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `target-port` to the URL query string
    if (getTargetPort() != null) {
      joiner.add(String.format("%starget-port%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTargetPort()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `healthcheck` to the URL query string
    if (getHealthcheck() != null) {
      joiner.add(getHealthcheck().toUrlQueryString(prefix + "healthcheck" + suffix));
    }

    return joiner.toString();
  }
}

