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
import com.exoscale.exoscale4j.model.InstanceState;
import com.exoscale.exoscale4j.model.InstanceType;
import com.exoscale.exoscale4j.model.ListInstances200ResponseInstancesInnerPrivateNetworksInner;
import com.exoscale.exoscale4j.model.Manager;
import com.exoscale.exoscale4j.model.PublicIpAssignment;
import com.exoscale.exoscale4j.model.SecurityGroup;
import com.exoscale.exoscale4j.model.SshKey;
import com.exoscale.exoscale4j.model.Template;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Instance
 */
@JsonPropertyOrder({
  ListInstances200ResponseInstancesInner.JSON_PROPERTY_PUBLIC_IP_ASSIGNMENT,
  ListInstances200ResponseInstancesInner.JSON_PROPERTY_LABELS,
  ListInstances200ResponseInstancesInner.JSON_PROPERTY_SECURITY_GROUPS,
  ListInstances200ResponseInstancesInner.JSON_PROPERTY_NAME,
  ListInstances200ResponseInstancesInner.JSON_PROPERTY_INSTANCE_TYPE,
  ListInstances200ResponseInstancesInner.JSON_PROPERTY_PRIVATE_NETWORKS,
  ListInstances200ResponseInstancesInner.JSON_PROPERTY_TEMPLATE,
  ListInstances200ResponseInstancesInner.JSON_PROPERTY_STATE,
  ListInstances200ResponseInstancesInner.JSON_PROPERTY_SSH_KEY,
  ListInstances200ResponseInstancesInner.JSON_PROPERTY_MAC_ADDRESS,
  ListInstances200ResponseInstancesInner.JSON_PROPERTY_MANAGER,
  ListInstances200ResponseInstancesInner.JSON_PROPERTY_IPV6_ADDRESS,
  ListInstances200ResponseInstancesInner.JSON_PROPERTY_ID,
  ListInstances200ResponseInstancesInner.JSON_PROPERTY_SSH_KEYS,
  ListInstances200ResponseInstancesInner.JSON_PROPERTY_CREATED_AT,
  ListInstances200ResponseInstancesInner.JSON_PROPERTY_PUBLIC_IP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-25T13:26:02.309598Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ListInstances200ResponseInstancesInner {
  public static final String JSON_PROPERTY_PUBLIC_IP_ASSIGNMENT = "public-ip-assignment";
  private PublicIpAssignment publicIpAssignment;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private Map<String, String> labels = new HashMap<>();

  public static final String JSON_PROPERTY_SECURITY_GROUPS = "security-groups";
  private List<SecurityGroup> securityGroups;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_INSTANCE_TYPE = "instance-type";
  private InstanceType instanceType;

  public static final String JSON_PROPERTY_PRIVATE_NETWORKS = "private-networks";
  private List<ListInstances200ResponseInstancesInnerPrivateNetworksInner> privateNetworks;

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  private Template template;

  public static final String JSON_PROPERTY_STATE = "state";
  private InstanceState state;

  public static final String JSON_PROPERTY_SSH_KEY = "ssh-key";
  private SshKey sshKey;

  public static final String JSON_PROPERTY_MAC_ADDRESS = "mac-address";
  private String macAddress;

  public static final String JSON_PROPERTY_MANAGER = "manager";
  private Manager manager;

  public static final String JSON_PROPERTY_IPV6_ADDRESS = "ipv6-address";
  private String ipv6Address;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_SSH_KEYS = "ssh-keys";
  private List<SshKey> sshKeys;

  public static final String JSON_PROPERTY_CREATED_AT = "created-at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_PUBLIC_IP = "public-ip";
  private String publicIp;

  public ListInstances200ResponseInstancesInner() { 
  }

  public ListInstances200ResponseInstancesInner publicIpAssignment(PublicIpAssignment publicIpAssignment) {
    this.publicIpAssignment = publicIpAssignment;
    return this;
  }

   /**
   * Get publicIpAssignment
   * @return publicIpAssignment
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_IP_ASSIGNMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PublicIpAssignment getPublicIpAssignment() {
    return publicIpAssignment;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_IP_ASSIGNMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicIpAssignment(PublicIpAssignment publicIpAssignment) {
    this.publicIpAssignment = publicIpAssignment;
  }


  public ListInstances200ResponseInstancesInner labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public ListInstances200ResponseInstancesInner putLabelsItem(String key, String labelsItem) {
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


  public ListInstances200ResponseInstancesInner securityGroups(List<SecurityGroup> securityGroups) {
    this.securityGroups = securityGroups;
    return this;
  }

  public ListInstances200ResponseInstancesInner addSecurityGroupsItem(SecurityGroup securityGroupsItem) {
    if (this.securityGroups == null) {
      this.securityGroups = new ArrayList<>();
    }
    this.securityGroups.add(securityGroupsItem);
    return this;
  }

   /**
   * Instance Security Groups
   * @return securityGroups
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECURITY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SecurityGroup> getSecurityGroups() {
    return securityGroups;
  }


  @JsonProperty(JSON_PROPERTY_SECURITY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecurityGroups(List<SecurityGroup> securityGroups) {
    this.securityGroups = securityGroups;
  }


  public ListInstances200ResponseInstancesInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Instance name
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


  public ListInstances200ResponseInstancesInner instanceType(InstanceType instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTANCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InstanceType getInstanceType() {
    return instanceType;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstanceType(InstanceType instanceType) {
    this.instanceType = instanceType;
  }


  public ListInstances200ResponseInstancesInner privateNetworks(List<ListInstances200ResponseInstancesInnerPrivateNetworksInner> privateNetworks) {
    this.privateNetworks = privateNetworks;
    return this;
  }

  public ListInstances200ResponseInstancesInner addPrivateNetworksItem(ListInstances200ResponseInstancesInnerPrivateNetworksInner privateNetworksItem) {
    if (this.privateNetworks == null) {
      this.privateNetworks = new ArrayList<>();
    }
    this.privateNetworks.add(privateNetworksItem);
    return this;
  }

   /**
   * Instance Private Networks
   * @return privateNetworks
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVATE_NETWORKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ListInstances200ResponseInstancesInnerPrivateNetworksInner> getPrivateNetworks() {
    return privateNetworks;
  }


  @JsonProperty(JSON_PROPERTY_PRIVATE_NETWORKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivateNetworks(List<ListInstances200ResponseInstancesInnerPrivateNetworksInner> privateNetworks) {
    this.privateNetworks = privateNetworks;
  }


  public ListInstances200ResponseInstancesInner template(Template template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Template getTemplate() {
    return template;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplate(Template template) {
    this.template = template;
  }


  public ListInstances200ResponseInstancesInner state(InstanceState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InstanceState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(InstanceState state) {
    this.state = state;
  }


  public ListInstances200ResponseInstancesInner sshKey(SshKey sshKey) {
    this.sshKey = sshKey;
    return this;
  }

   /**
   * Get sshKey
   * @return sshKey
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSH_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SshKey getSshKey() {
    return sshKey;
  }


  @JsonProperty(JSON_PROPERTY_SSH_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSshKey(SshKey sshKey) {
    this.sshKey = sshKey;
  }


  public ListInstances200ResponseInstancesInner macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

   /**
   * Instance MAC address
   * @return macAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAC_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMacAddress() {
    return macAddress;
  }


  @JsonProperty(JSON_PROPERTY_MAC_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }


  public ListInstances200ResponseInstancesInner manager(Manager manager) {
    this.manager = manager;
    return this;
  }

   /**
   * Get manager
   * @return manager
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANAGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Manager getManager() {
    return manager;
  }


  @JsonProperty(JSON_PROPERTY_MANAGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManager(Manager manager) {
    this.manager = manager;
  }


  public ListInstances200ResponseInstancesInner ipv6Address(String ipv6Address) {
    this.ipv6Address = ipv6Address;
    return this;
  }

   /**
   * Instance IPv6 address
   * @return ipv6Address
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IPV6_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpv6Address() {
    return ipv6Address;
  }


  @JsonProperty(JSON_PROPERTY_IPV6_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpv6Address(String ipv6Address) {
    this.ipv6Address = ipv6Address;
  }


  public ListInstances200ResponseInstancesInner id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Instance ID
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public ListInstances200ResponseInstancesInner sshKeys(List<SshKey> sshKeys) {
    this.sshKeys = sshKeys;
    return this;
  }

  public ListInstances200ResponseInstancesInner addSshKeysItem(SshKey sshKeysItem) {
    if (this.sshKeys == null) {
      this.sshKeys = new ArrayList<>();
    }
    this.sshKeys.add(sshKeysItem);
    return this;
  }

   /**
   * Instance SSH Keys
   * @return sshKeys
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSH_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SshKey> getSshKeys() {
    return sshKeys;
  }


  @JsonProperty(JSON_PROPERTY_SSH_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSshKeys(List<SshKey> sshKeys) {
    this.sshKeys = sshKeys;
  }


  public ListInstances200ResponseInstancesInner createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Instance creation date
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ListInstances200ResponseInstancesInner publicIp(String publicIp) {
    this.publicIp = publicIp;
    return this;
  }

   /**
   * Instance public IPv4 address
   * @return publicIp
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPublicIp() {
    return publicIp;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicIp(String publicIp) {
    this.publicIp = publicIp;
  }


  /**
   * Return true if this list_instances_200_response_instances_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListInstances200ResponseInstancesInner listInstances200ResponseInstancesInner = (ListInstances200ResponseInstancesInner) o;
    return Objects.equals(this.publicIpAssignment, listInstances200ResponseInstancesInner.publicIpAssignment) &&
        Objects.equals(this.labels, listInstances200ResponseInstancesInner.labels) &&
        Objects.equals(this.securityGroups, listInstances200ResponseInstancesInner.securityGroups) &&
        Objects.equals(this.name, listInstances200ResponseInstancesInner.name) &&
        Objects.equals(this.instanceType, listInstances200ResponseInstancesInner.instanceType) &&
        Objects.equals(this.privateNetworks, listInstances200ResponseInstancesInner.privateNetworks) &&
        Objects.equals(this.template, listInstances200ResponseInstancesInner.template) &&
        Objects.equals(this.state, listInstances200ResponseInstancesInner.state) &&
        Objects.equals(this.sshKey, listInstances200ResponseInstancesInner.sshKey) &&
        Objects.equals(this.macAddress, listInstances200ResponseInstancesInner.macAddress) &&
        Objects.equals(this.manager, listInstances200ResponseInstancesInner.manager) &&
        Objects.equals(this.ipv6Address, listInstances200ResponseInstancesInner.ipv6Address) &&
        Objects.equals(this.id, listInstances200ResponseInstancesInner.id) &&
        Objects.equals(this.sshKeys, listInstances200ResponseInstancesInner.sshKeys) &&
        Objects.equals(this.createdAt, listInstances200ResponseInstancesInner.createdAt) &&
        Objects.equals(this.publicIp, listInstances200ResponseInstancesInner.publicIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicIpAssignment, labels, securityGroups, name, instanceType, privateNetworks, template, state, sshKey, macAddress, manager, ipv6Address, id, sshKeys, createdAt, publicIp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListInstances200ResponseInstancesInner {\n");
    sb.append("    publicIpAssignment: ").append(toIndentedString(publicIpAssignment)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    privateNetworks: ").append(toIndentedString(privateNetworks)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    sshKey: ").append(toIndentedString(sshKey)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    ipv6Address: ").append(toIndentedString(ipv6Address)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sshKeys: ").append(toIndentedString(sshKeys)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
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

    // add `public-ip-assignment` to the URL query string
    if (getPublicIpAssignment() != null) {
      joiner.add(String.format("%spublic-ip-assignment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPublicIpAssignment()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `labels` to the URL query string
    if (getLabels() != null) {
      for (String _key : getLabels().keySet()) {
        joiner.add(String.format("%slabels%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getLabels().get(_key), URLEncoder.encode(String.valueOf(getLabels().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `security-groups` to the URL query string
    if (getSecurityGroups() != null) {
      for (int i = 0; i < getSecurityGroups().size(); i++) {
        if (getSecurityGroups().get(i) != null) {
          joiner.add(getSecurityGroups().get(i).toUrlQueryString(String.format("%ssecurity-groups%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `instance-type` to the URL query string
    if (getInstanceType() != null) {
      joiner.add(getInstanceType().toUrlQueryString(prefix + "instance-type" + suffix));
    }

    // add `private-networks` to the URL query string
    if (getPrivateNetworks() != null) {
      for (int i = 0; i < getPrivateNetworks().size(); i++) {
        if (getPrivateNetworks().get(i) != null) {
          joiner.add(getPrivateNetworks().get(i).toUrlQueryString(String.format("%sprivate-networks%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `template` to the URL query string
    if (getTemplate() != null) {
      joiner.add(getTemplate().toUrlQueryString(prefix + "template" + suffix));
    }

    // add `state` to the URL query string
    if (getState() != null) {
      joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ssh-key` to the URL query string
    if (getSshKey() != null) {
      joiner.add(getSshKey().toUrlQueryString(prefix + "ssh-key" + suffix));
    }

    // add `mac-address` to the URL query string
    if (getMacAddress() != null) {
      joiner.add(String.format("%smac-address%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMacAddress()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `manager` to the URL query string
    if (getManager() != null) {
      joiner.add(getManager().toUrlQueryString(prefix + "manager" + suffix));
    }

    // add `ipv6-address` to the URL query string
    if (getIpv6Address() != null) {
      joiner.add(String.format("%sipv6-address%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIpv6Address()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ssh-keys` to the URL query string
    if (getSshKeys() != null) {
      for (int i = 0; i < getSshKeys().size(); i++) {
        if (getSshKeys().get(i) != null) {
          joiner.add(getSshKeys().get(i).toUrlQueryString(String.format("%sssh-keys%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `created-at` to the URL query string
    if (getCreatedAt() != null) {
      joiner.add(String.format("%screated-at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `public-ip` to the URL query string
    if (getPublicIp() != null) {
      joiner.add(String.format("%spublic-ip%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPublicIp()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

