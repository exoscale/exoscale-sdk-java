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
import com.exoscale.exoscale4j.model.InstancePool;
import com.exoscale.exoscale4j.model.LoadBalancerServerStatus;
import com.exoscale.exoscale4j.model.LoadBalancerServiceHealthcheck;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Load Balancer Service
 */
@JsonPropertyOrder({
  LoadBalancerService.JSON_PROPERTY_DESCRIPTION,
  LoadBalancerService.JSON_PROPERTY_PROTOCOL,
  LoadBalancerService.JSON_PROPERTY_NAME,
  LoadBalancerService.JSON_PROPERTY_STATE,
  LoadBalancerService.JSON_PROPERTY_TARGET_PORT,
  LoadBalancerService.JSON_PROPERTY_PORT,
  LoadBalancerService.JSON_PROPERTY_INSTANCE_POOL,
  LoadBalancerService.JSON_PROPERTY_STRATEGY,
  LoadBalancerService.JSON_PROPERTY_HEALTHCHECK,
  LoadBalancerService.JSON_PROPERTY_ID,
  LoadBalancerService.JSON_PROPERTY_HEALTHCHECK_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-05T10:50:16.155057+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class LoadBalancerService {
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

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * Load Balancer Service state
   */
  public enum StateEnum {
    CREATING("creating"),
    
    DELETING("deleting"),
    
    RUNNING("running"),
    
    UPDATING("updating"),
    
    ERROR("error");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATE = "state";
  private StateEnum state;

  public static final String JSON_PROPERTY_TARGET_PORT = "target-port";
  private Long targetPort;

  public static final String JSON_PROPERTY_PORT = "port";
  private Long port;

  public static final String JSON_PROPERTY_INSTANCE_POOL = "instance-pool";
  private InstancePool instancePool;

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

  public static final String JSON_PROPERTY_HEALTHCHECK = "healthcheck";
  private LoadBalancerServiceHealthcheck healthcheck;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_HEALTHCHECK_STATUS = "healthcheck-status";
  private List<LoadBalancerServerStatus> healthcheckStatus;

  public LoadBalancerService() { 
  }

  @JsonCreator
  public LoadBalancerService(
    @JsonProperty(JSON_PROPERTY_STATE) StateEnum state, 
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_HEALTHCHECK_STATUS) List<LoadBalancerServerStatus> healthcheckStatus
  ) {
  this();
    this.state = state;
    this.id = id;
    this.healthcheckStatus = healthcheckStatus;
  }

  public LoadBalancerService description(String description) {
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


  public LoadBalancerService protocol(ProtocolEnum protocol) {
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


  public LoadBalancerService name(String name) {
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


   /**
   * Load Balancer Service state
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StateEnum getState() {
    return state;
  }




  public LoadBalancerService targetPort(Long targetPort) {
    this.targetPort = targetPort;
    return this;
  }

   /**
   * Port on which the network traffic will be forwarded to on the receiving instance
   * minimum: 0
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


  public LoadBalancerService port(Long port) {
    this.port = port;
    return this;
  }

   /**
   * Port exposed on the Load Balancer&#39;s public IP
   * minimum: 0
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


  public LoadBalancerService instancePool(InstancePool instancePool) {
    this.instancePool = instancePool;
    return this;
  }

   /**
   * Get instancePool
   * @return instancePool
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTANCE_POOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InstancePool getInstancePool() {
    return instancePool;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE_POOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstancePool(InstancePool instancePool) {
    this.instancePool = instancePool;
  }


  public LoadBalancerService strategy(StrategyEnum strategy) {
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


  public LoadBalancerService healthcheck(LoadBalancerServiceHealthcheck healthcheck) {
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
   * Load Balancer Service ID
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




   /**
   * Healthcheck status per backend server
   * @return healthcheckStatus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEALTHCHECK_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LoadBalancerServerStatus> getHealthcheckStatus() {
    return healthcheckStatus;
  }




  /**
   * Return true if this load-balancer-service object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadBalancerService loadBalancerService = (LoadBalancerService) o;
    return Objects.equals(this.description, loadBalancerService.description) &&
        Objects.equals(this.protocol, loadBalancerService.protocol) &&
        Objects.equals(this.name, loadBalancerService.name) &&
        Objects.equals(this.state, loadBalancerService.state) &&
        Objects.equals(this.targetPort, loadBalancerService.targetPort) &&
        Objects.equals(this.port, loadBalancerService.port) &&
        Objects.equals(this.instancePool, loadBalancerService.instancePool) &&
        Objects.equals(this.strategy, loadBalancerService.strategy) &&
        Objects.equals(this.healthcheck, loadBalancerService.healthcheck) &&
        Objects.equals(this.id, loadBalancerService.id) &&
        Objects.equals(this.healthcheckStatus, loadBalancerService.healthcheckStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, protocol, name, state, targetPort, port, instancePool, strategy, healthcheck, id, healthcheckStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadBalancerService {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    targetPort: ").append(toIndentedString(targetPort)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    instancePool: ").append(toIndentedString(instancePool)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    healthcheck: ").append(toIndentedString(healthcheck)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    healthcheckStatus: ").append(toIndentedString(healthcheckStatus)).append("\n");
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

    // add `protocol` to the URL query string
    if (getProtocol() != null) {
      joiner.add(String.format("%sprotocol%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProtocol()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `state` to the URL query string
    if (getState() != null) {
      joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `target-port` to the URL query string
    if (getTargetPort() != null) {
      joiner.add(String.format("%starget-port%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTargetPort()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `port` to the URL query string
    if (getPort() != null) {
      joiner.add(String.format("%sport%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPort()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `instance-pool` to the URL query string
    if (getInstancePool() != null) {
      joiner.add(getInstancePool().toUrlQueryString(prefix + "instance-pool" + suffix));
    }

    // add `strategy` to the URL query string
    if (getStrategy() != null) {
      joiner.add(String.format("%sstrategy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStrategy()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `healthcheck` to the URL query string
    if (getHealthcheck() != null) {
      joiner.add(getHealthcheck().toUrlQueryString(prefix + "healthcheck" + suffix));
    }

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `healthcheck-status` to the URL query string
    if (getHealthcheckStatus() != null) {
      for (int i = 0; i < getHealthcheckStatus().size(); i++) {
        if (getHealthcheckStatus().get(i) != null) {
          joiner.add(getHealthcheckStatus().get(i).toUrlQueryString(String.format("%shealthcheck-status%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

