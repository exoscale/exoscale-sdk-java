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
import com.exoscale.exoscale4j.model.PrivateNetworkLease;
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


/**
 * Private Network
 */
@JsonPropertyOrder({
  PrivateNetwork.JSON_PROPERTY_DESCRIPTION,
  PrivateNetwork.JSON_PROPERTY_LABELS,
  PrivateNetwork.JSON_PROPERTY_NAME,
  PrivateNetwork.JSON_PROPERTY_START_IP,
  PrivateNetwork.JSON_PROPERTY_LEASES,
  PrivateNetwork.JSON_PROPERTY_ID,
  PrivateNetwork.JSON_PROPERTY_VNI,
  PrivateNetwork.JSON_PROPERTY_NETMASK,
  PrivateNetwork.JSON_PROPERTY_END_IP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-25T12:43:01.822793Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PrivateNetwork {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private Map<String, String> labels = new HashMap<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_START_IP = "start-ip";
  private String startIp;

  public static final String JSON_PROPERTY_LEASES = "leases";
  private List<PrivateNetworkLease> leases;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_VNI = "vni";
  private Long vni;

  public static final String JSON_PROPERTY_NETMASK = "netmask";
  private String netmask;

  public static final String JSON_PROPERTY_END_IP = "end-ip";
  private String endIp;

  public PrivateNetwork() { 
  }

  @JsonCreator
  public PrivateNetwork(
    @JsonProperty(JSON_PROPERTY_LEASES) List<PrivateNetworkLease> leases, 
    @JsonProperty(JSON_PROPERTY_ID) UUID id
  ) {
  this();
    this.leases = leases;
    this.id = id;
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




  public PrivateNetwork vni(Long vni) {
    this.vni = vni;
    return this;
  }

   /**
   * Private Network VXLAN ID
   * minimum: 0
   * @return vni
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VNI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getVni() {
    return vni;
  }


  @JsonProperty(JSON_PROPERTY_VNI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVni(Long vni) {
    this.vni = vni;
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
   * Return true if this private-network object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivateNetwork privateNetwork = (PrivateNetwork) o;
    return Objects.equals(this.description, privateNetwork.description) &&
        Objects.equals(this.labels, privateNetwork.labels) &&
        Objects.equals(this.name, privateNetwork.name) &&
        Objects.equals(this.startIp, privateNetwork.startIp) &&
        Objects.equals(this.leases, privateNetwork.leases) &&
        Objects.equals(this.id, privateNetwork.id) &&
        Objects.equals(this.vni, privateNetwork.vni) &&
        Objects.equals(this.netmask, privateNetwork.netmask) &&
        Objects.equals(this.endIp, privateNetwork.endIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, labels, name, startIp, leases, id, vni, netmask, endIp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateNetwork {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startIp: ").append(toIndentedString(startIp)).append("\n");
    sb.append("    leases: ").append(toIndentedString(leases)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    vni: ").append(toIndentedString(vni)).append("\n");
    sb.append("    netmask: ").append(toIndentedString(netmask)).append("\n");
    sb.append("    endIp: ").append(toIndentedString(endIp)).append("\n");
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

    // add `labels` to the URL query string
    if (getLabels() != null) {
      for (String _key : getLabels().keySet()) {
        joiner.add(String.format("%slabels%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getLabels().get(_key), URLEncoder.encode(String.valueOf(getLabels().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `start-ip` to the URL query string
    if (getStartIp() != null) {
      joiner.add(String.format("%sstart-ip%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartIp()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `leases` to the URL query string
    if (getLeases() != null) {
      for (int i = 0; i < getLeases().size(); i++) {
        if (getLeases().get(i) != null) {
          joiner.add(getLeases().get(i).toUrlQueryString(String.format("%sleases%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `vni` to the URL query string
    if (getVni() != null) {
      joiner.add(String.format("%svni%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVni()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `netmask` to the URL query string
    if (getNetmask() != null) {
      joiner.add(String.format("%snetmask%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNetmask()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `end-ip` to the URL query string
    if (getEndIp() != null) {
      joiner.add(String.format("%send-ip%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEndIp()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

