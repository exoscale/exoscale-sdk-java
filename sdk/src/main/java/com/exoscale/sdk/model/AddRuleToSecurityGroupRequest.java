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


package com.exoscale.sdk.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.exoscale.sdk.model.AddRuleToSecurityGroupRequestIcmp;
import com.exoscale.sdk.model.SecurityGroupResource;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AddRuleToSecurityGroupRequest
 */
@JsonPropertyOrder({
  AddRuleToSecurityGroupRequest.JSON_PROPERTY_FLOW_DIRECTION,
  AddRuleToSecurityGroupRequest.JSON_PROPERTY_DESCRIPTION,
  AddRuleToSecurityGroupRequest.JSON_PROPERTY_NETWORK,
  AddRuleToSecurityGroupRequest.JSON_PROPERTY_SECURITY_GROUP,
  AddRuleToSecurityGroupRequest.JSON_PROPERTY_PROTOCOL,
  AddRuleToSecurityGroupRequest.JSON_PROPERTY_ICMP,
  AddRuleToSecurityGroupRequest.JSON_PROPERTY_START_PORT,
  AddRuleToSecurityGroupRequest.JSON_PROPERTY_END_PORT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class AddRuleToSecurityGroupRequest {
  /**
   * Network flow direction to match
   */
  public enum FlowDirectionEnum {
    INGRESS("ingress"),
    
    EGRESS("egress");

    private String value;

    FlowDirectionEnum(String value) {
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
    public static FlowDirectionEnum fromValue(String value) {
      for (FlowDirectionEnum b : FlowDirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FLOW_DIRECTION = "flow-direction";
  private FlowDirectionEnum flowDirection;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NETWORK = "network";
  private String network;

  public static final String JSON_PROPERTY_SECURITY_GROUP = "security-group";
  private SecurityGroupResource securityGroup;

  /**
   * Network protocol
   */
  public enum ProtocolEnum {
    TCP("tcp"),
    
    ESP("esp"),
    
    ICMP("icmp"),
    
    UDP("udp"),
    
    GRE("gre"),
    
    AH("ah"),
    
    IPIP("ipip"),
    
    ICMPV6("icmpv6");

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

  public static final String JSON_PROPERTY_ICMP = "icmp";
  private AddRuleToSecurityGroupRequestIcmp icmp;

  public static final String JSON_PROPERTY_START_PORT = "start-port";
  private Long startPort;

  public static final String JSON_PROPERTY_END_PORT = "end-port";
  private Long endPort;

  public AddRuleToSecurityGroupRequest() { 
  }

  public AddRuleToSecurityGroupRequest flowDirection(FlowDirectionEnum flowDirection) {
    this.flowDirection = flowDirection;
    return this;
  }

   /**
   * Network flow direction to match
   * @return flowDirection
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FLOW_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FlowDirectionEnum getFlowDirection() {
    return flowDirection;
  }


  @JsonProperty(JSON_PROPERTY_FLOW_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFlowDirection(FlowDirectionEnum flowDirection) {
    this.flowDirection = flowDirection;
  }


  public AddRuleToSecurityGroupRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Security Group rule description
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


  public AddRuleToSecurityGroupRequest network(String network) {
    this.network = network;
    return this;
  }

   /**
   * CIDR-formatted network allowed
   * @return network
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNetwork() {
    return network;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetwork(String network) {
    this.network = network;
  }


  public AddRuleToSecurityGroupRequest securityGroup(SecurityGroupResource securityGroup) {
    this.securityGroup = securityGroup;
    return this;
  }

   /**
   * Get securityGroup
   * @return securityGroup
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECURITY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecurityGroupResource getSecurityGroup() {
    return securityGroup;
  }


  @JsonProperty(JSON_PROPERTY_SECURITY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecurityGroup(SecurityGroupResource securityGroup) {
    this.securityGroup = securityGroup;
  }


  public AddRuleToSecurityGroupRequest protocol(ProtocolEnum protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Network protocol
   * @return protocol
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ProtocolEnum getProtocol() {
    return protocol;
  }


  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }


  public AddRuleToSecurityGroupRequest icmp(AddRuleToSecurityGroupRequestIcmp icmp) {
    this.icmp = icmp;
    return this;
  }

   /**
   * Get icmp
   * @return icmp
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ICMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AddRuleToSecurityGroupRequestIcmp getIcmp() {
    return icmp;
  }


  @JsonProperty(JSON_PROPERTY_ICMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIcmp(AddRuleToSecurityGroupRequestIcmp icmp) {
    this.icmp = icmp;
  }


  public AddRuleToSecurityGroupRequest startPort(Long startPort) {
    this.startPort = startPort;
    return this;
  }

   /**
   * Start port of the range
   * minimum: 1
   * maximum: 65535
   * @return startPort
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStartPort() {
    return startPort;
  }


  @JsonProperty(JSON_PROPERTY_START_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartPort(Long startPort) {
    this.startPort = startPort;
  }


  public AddRuleToSecurityGroupRequest endPort(Long endPort) {
    this.endPort = endPort;
    return this;
  }

   /**
   * End port of the range
   * minimum: 1
   * maximum: 65535
   * @return endPort
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEndPort() {
    return endPort;
  }


  @JsonProperty(JSON_PROPERTY_END_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndPort(Long endPort) {
    this.endPort = endPort;
  }


  /**
   * Return true if this add_rule_to_security_group_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddRuleToSecurityGroupRequest addRuleToSecurityGroupRequest = (AddRuleToSecurityGroupRequest) o;
    return Objects.equals(this.flowDirection, addRuleToSecurityGroupRequest.flowDirection) &&
        Objects.equals(this.description, addRuleToSecurityGroupRequest.description) &&
        Objects.equals(this.network, addRuleToSecurityGroupRequest.network) &&
        Objects.equals(this.securityGroup, addRuleToSecurityGroupRequest.securityGroup) &&
        Objects.equals(this.protocol, addRuleToSecurityGroupRequest.protocol) &&
        Objects.equals(this.icmp, addRuleToSecurityGroupRequest.icmp) &&
        Objects.equals(this.startPort, addRuleToSecurityGroupRequest.startPort) &&
        Objects.equals(this.endPort, addRuleToSecurityGroupRequest.endPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowDirection, description, network, securityGroup, protocol, icmp, startPort, endPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddRuleToSecurityGroupRequest {\n");
    sb.append("    flowDirection: ").append(toIndentedString(flowDirection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    securityGroup: ").append(toIndentedString(securityGroup)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    icmp: ").append(toIndentedString(icmp)).append("\n");
    sb.append("    startPort: ").append(toIndentedString(startPort)).append("\n");
    sb.append("    endPort: ").append(toIndentedString(endPort)).append("\n");
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

    // add `flow-direction` to the URL query string
    if (getFlowDirection() != null) {
      joiner.add(String.format("%sflow-direction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFlowDirection()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `network` to the URL query string
    if (getNetwork() != null) {
      joiner.add(String.format("%snetwork%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNetwork()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `security-group` to the URL query string
    if (getSecurityGroup() != null) {
      joiner.add(getSecurityGroup().toUrlQueryString(prefix + "security-group" + suffix));
    }

    // add `protocol` to the URL query string
    if (getProtocol() != null) {
      joiner.add(String.format("%sprotocol%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProtocol()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `icmp` to the URL query string
    if (getIcmp() != null) {
      joiner.add(getIcmp().toUrlQueryString(prefix + "icmp" + suffix));
    }

    // add `start-port` to the URL query string
    if (getStartPort() != null) {
      joiner.add(String.format("%sstart-port%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartPort()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `end-port` to the URL query string
    if (getEndPort() != null) {
      joiner.add(String.format("%send-port%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEndPort()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

