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
import com.exoscale.model.PrivateNetworkLease;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Private Network
 */
@JsonPropertyOrder({
  PrivateNetwork.JSON_PROPERTY_ID,
  PrivateNetwork.JSON_PROPERTY_NAME,
  PrivateNetwork.JSON_PROPERTY_DESCRIPTION,
  PrivateNetwork.JSON_PROPERTY_NETMASK,
  PrivateNetwork.JSON_PROPERTY_START_IP,
  PrivateNetwork.JSON_PROPERTY_END_IP,
  PrivateNetwork.JSON_PROPERTY_LEASES,
  PrivateNetwork.JSON_PROPERTY_LABELS
})
@JsonTypeName("private-network")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T16:37:05.548288+01:00[Europe/Vienna]")
public class PrivateNetwork {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NETMASK = "netmask";
  private String netmask;

  public static final String JSON_PROPERTY_START_IP = "start-ip";
  private String startIp;

  public static final String JSON_PROPERTY_END_IP = "end-ip";
  private String endIp;

  public static final String JSON_PROPERTY_LEASES = "leases";
  private List<PrivateNetworkLease> leases;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private Map<String, String> labels = new HashMap<>();

  public PrivateNetwork() {
  }

  @JsonCreator
  public PrivateNetwork(
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_LEASES) List<PrivateNetworkLease> leases
  ) {
    this();
    this.id = id;
    this.leases = leases;
  }

   /**
   * Private Network ID
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




  public PrivateNetwork name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Private Network name
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


  public PrivateNetwork description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Private Network description
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


  public PrivateNetwork netmask(String netmask) {
    
    this.netmask = netmask;
    return this;
  }

   /**
   * Private Network netmask
   * @return netmask
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NETMASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNetmask() {
    return netmask;
  }


  @JsonProperty(JSON_PROPERTY_NETMASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetmask(String netmask) {
    this.netmask = netmask;
  }


  public PrivateNetwork startIp(String startIp) {
    
    this.startIp = startIp;
    return this;
  }

   /**
   * Private Network start IP address
   * @return startIp
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartIp() {
    return startIp;
  }


  @JsonProperty(JSON_PROPERTY_START_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartIp(String startIp) {
    this.startIp = startIp;
  }


  public PrivateNetwork endIp(String endIp) {
    
    this.endIp = endIp;
    return this;
  }

   /**
   * Private Network end IP address
   * @return endIp
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndIp() {
    return endIp;
  }


  @JsonProperty(JSON_PROPERTY_END_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndIp(String endIp) {
    this.endIp = endIp;
  }


   /**
   * Private Network leased IP addresses
   * @return leases
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PrivateNetworkLease> getLeases() {
    return leases;
  }




  public PrivateNetwork labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public PrivateNetwork putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getLabels() {
    return labels;
  }


  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivateNetwork privateNetwork = (PrivateNetwork) o;
    return Objects.equals(this.id, privateNetwork.id) &&
        Objects.equals(this.name, privateNetwork.name) &&
        Objects.equals(this.description, privateNetwork.description) &&
        Objects.equals(this.netmask, privateNetwork.netmask) &&
        Objects.equals(this.startIp, privateNetwork.startIp) &&
        Objects.equals(this.endIp, privateNetwork.endIp) &&
        Objects.equals(this.leases, privateNetwork.leases) &&
        Objects.equals(this.labels, privateNetwork.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, netmask, startIp, endIp, leases, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateNetwork {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    netmask: ").append(toIndentedString(netmask)).append("\n");
    sb.append("    startIp: ").append(toIndentedString(startIp)).append("\n");
    sb.append("    endIp: ").append(toIndentedString(endIp)).append("\n");
    sb.append("    leases: ").append(toIndentedString(leases)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

