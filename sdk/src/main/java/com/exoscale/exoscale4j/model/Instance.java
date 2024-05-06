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
import com.exoscale.exoscale4j.model.AntiAffinityGroup;
import com.exoscale.exoscale4j.model.DeployTarget;
import com.exoscale.exoscale4j.model.ElasticIp;
import com.exoscale.exoscale4j.model.InstanceState;
import com.exoscale.exoscale4j.model.InstanceType;
import com.exoscale.exoscale4j.model.ListInstances200ResponseInstancesInnerPrivateNetworksInner;
import com.exoscale.exoscale4j.model.Manager;
import com.exoscale.exoscale4j.model.PublicIpAssignment;
import com.exoscale.exoscale4j.model.SecurityGroup;
import com.exoscale.exoscale4j.model.Snapshot;
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
  Instance.JSON_PROPERTY_ANTI_AFFINITY_GROUPS,
  Instance.JSON_PROPERTY_PUBLIC_IP_ASSIGNMENT,
  Instance.JSON_PROPERTY_LABELS,
  Instance.JSON_PROPERTY_SECURITY_GROUPS,
  Instance.JSON_PROPERTY_ELASTIC_IPS,
  Instance.JSON_PROPERTY_NAME,
  Instance.JSON_PROPERTY_INSTANCE_TYPE,
  Instance.JSON_PROPERTY_PRIVATE_NETWORKS,
  Instance.JSON_PROPERTY_TEMPLATE,
  Instance.JSON_PROPERTY_STATE,
  Instance.JSON_PROPERTY_SSH_KEY,
  Instance.JSON_PROPERTY_USER_DATA,
  Instance.JSON_PROPERTY_MAC_ADDRESS,
  Instance.JSON_PROPERTY_MANAGER,
  Instance.JSON_PROPERTY_DEPLOY_TARGET,
  Instance.JSON_PROPERTY_IPV6_ADDRESS,
  Instance.JSON_PROPERTY_ID,
  Instance.JSON_PROPERTY_SNAPSHOTS,
  Instance.JSON_PROPERTY_DISK_SIZE,
  Instance.JSON_PROPERTY_SSH_KEYS,
  Instance.JSON_PROPERTY_CREATED_AT,
  Instance.JSON_PROPERTY_PUBLIC_IP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T14:27:11.860946+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class Instance {
  public static final String JSON_PROPERTY_ANTI_AFFINITY_GROUPS = "anti-affinity-groups";
  private List<AntiAffinityGroup> antiAffinityGroups;

  public static final String JSON_PROPERTY_PUBLIC_IP_ASSIGNMENT = "public-ip-assignment";
  private PublicIpAssignment publicIpAssignment;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private Map<String, String> labels = new HashMap<>();

  public static final String JSON_PROPERTY_SECURITY_GROUPS = "security-groups";
  private List<SecurityGroup> securityGroups;

  public static final String JSON_PROPERTY_ELASTIC_IPS = "elastic-ips";
  private List<ElasticIp> elasticIps;

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

  public static final String JSON_PROPERTY_USER_DATA = "user-data";
  private String userData;

  public static final String JSON_PROPERTY_MAC_ADDRESS = "mac-address";
  private String macAddress;

  public static final String JSON_PROPERTY_MANAGER = "manager";
  private Manager manager;

  public static final String JSON_PROPERTY_DEPLOY_TARGET = "deploy-target";
  private DeployTarget deployTarget;

  public static final String JSON_PROPERTY_IPV6_ADDRESS = "ipv6-address";
  private String ipv6Address;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_SNAPSHOTS = "snapshots";
  private List<Snapshot> snapshots;

  public static final String JSON_PROPERTY_DISK_SIZE = "disk-size";
  private Long diskSize;

  public static final String JSON_PROPERTY_SSH_KEYS = "ssh-keys";
  private List<SshKey> sshKeys;

  public static final String JSON_PROPERTY_CREATED_AT = "created-at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_PUBLIC_IP = "public-ip";
  private String publicIp;

  public Instance() { 
  }

  @JsonCreator
  public Instance(
    @JsonProperty(JSON_PROPERTY_MAC_ADDRESS) String macAddress, 
    @JsonProperty(JSON_PROPERTY_IPV6_ADDRESS) String ipv6Address, 
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt, 
    @JsonProperty(JSON_PROPERTY_PUBLIC_IP) String publicIp
  ) {
  this();
    this.macAddress = macAddress;
    this.ipv6Address = ipv6Address;
    this.id = id;
    this.createdAt = createdAt;
    this.publicIp = publicIp;
  }

  public Instance antiAffinityGroups(List<AntiAffinityGroup> antiAffinityGroups) {
    this.antiAffinityGroups = antiAffinityGroups;
    return this;
  }

  public Instance addAntiAffinityGroupsItem(AntiAffinityGroup antiAffinityGroupsItem) {
    if (this.antiAffinityGroups == null) {
      this.antiAffinityGroups = new ArrayList<>();
    }
    this.antiAffinityGroups.add(antiAffinityGroupsItem);
    return this;
  }

   /**
   * Instance Anti-affinity Groups
   * @return antiAffinityGroups
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANTI_AFFINITY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AntiAffinityGroup> getAntiAffinityGroups() {
    return antiAffinityGroups;
  }


  @JsonProperty(JSON_PROPERTY_ANTI_AFFINITY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAntiAffinityGroups(List<AntiAffinityGroup> antiAffinityGroups) {
    this.antiAffinityGroups = antiAffinityGroups;
  }


  public Instance publicIpAssignment(PublicIpAssignment publicIpAssignment) {
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


  public Instance labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public Instance putLabelsItem(String key, String labelsItem) {
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


  public Instance securityGroups(List<SecurityGroup> securityGroups) {
    this.securityGroups = securityGroups;
    return this;
  }

  public Instance addSecurityGroupsItem(SecurityGroup securityGroupsItem) {
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


  public Instance elasticIps(List<ElasticIp> elasticIps) {
    this.elasticIps = elasticIps;
    return this;
  }

  public Instance addElasticIpsItem(ElasticIp elasticIpsItem) {
    if (this.elasticIps == null) {
      this.elasticIps = new ArrayList<>();
    }
    this.elasticIps.add(elasticIpsItem);
    return this;
  }

   /**
   * Instance Elastic IPs
   * @return elasticIps
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELASTIC_IPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ElasticIp> getElasticIps() {
    return elasticIps;
  }


  @JsonProperty(JSON_PROPERTY_ELASTIC_IPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElasticIps(List<ElasticIp> elasticIps) {
    this.elasticIps = elasticIps;
  }


  public Instance name(String name) {
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


  public Instance instanceType(InstanceType instanceType) {
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


  public Instance privateNetworks(List<ListInstances200ResponseInstancesInnerPrivateNetworksInner> privateNetworks) {
    this.privateNetworks = privateNetworks;
    return this;
  }

  public Instance addPrivateNetworksItem(ListInstances200ResponseInstancesInnerPrivateNetworksInner privateNetworksItem) {
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


  public Instance template(Template template) {
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


  public Instance state(InstanceState state) {
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


  public Instance sshKey(SshKey sshKey) {
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


  public Instance userData(String userData) {
    this.userData = userData;
    return this;
  }

   /**
   * Instance Cloud-init user-data (base64 encoded)
   * @return userData
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserData() {
    return userData;
  }


  @JsonProperty(JSON_PROPERTY_USER_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserData(String userData) {
    this.userData = userData;
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




  public Instance manager(Manager manager) {
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


  public Instance deployTarget(DeployTarget deployTarget) {
    this.deployTarget = deployTarget;
    return this;
  }

   /**
   * Get deployTarget
   * @return deployTarget
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPLOY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DeployTarget getDeployTarget() {
    return deployTarget;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeployTarget(DeployTarget deployTarget) {
    this.deployTarget = deployTarget;
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




  public Instance snapshots(List<Snapshot> snapshots) {
    this.snapshots = snapshots;
    return this;
  }

  public Instance addSnapshotsItem(Snapshot snapshotsItem) {
    if (this.snapshots == null) {
      this.snapshots = new ArrayList<>();
    }
    this.snapshots.add(snapshotsItem);
    return this;
  }

   /**
   * Instance Snapshots
   * @return snapshots
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNAPSHOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Snapshot> getSnapshots() {
    return snapshots;
  }


  @JsonProperty(JSON_PROPERTY_SNAPSHOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnapshots(List<Snapshot> snapshots) {
    this.snapshots = snapshots;
  }


  public Instance diskSize(Long diskSize) {
    this.diskSize = diskSize;
    return this;
  }

   /**
   * Instance disk size in GB
   * minimum: 10
   * maximum: 50000
   * @return diskSize
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISK_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDiskSize() {
    return diskSize;
  }


  @JsonProperty(JSON_PROPERTY_DISK_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiskSize(Long diskSize) {
    this.diskSize = diskSize;
  }


  public Instance sshKeys(List<SshKey> sshKeys) {
    this.sshKeys = sshKeys;
    return this;
  }

  public Instance addSshKeysItem(SshKey sshKeysItem) {
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




  /**
   * Return true if this instance object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instance instance = (Instance) o;
    return Objects.equals(this.antiAffinityGroups, instance.antiAffinityGroups) &&
        Objects.equals(this.publicIpAssignment, instance.publicIpAssignment) &&
        Objects.equals(this.labels, instance.labels) &&
        Objects.equals(this.securityGroups, instance.securityGroups) &&
        Objects.equals(this.elasticIps, instance.elasticIps) &&
        Objects.equals(this.name, instance.name) &&
        Objects.equals(this.instanceType, instance.instanceType) &&
        Objects.equals(this.privateNetworks, instance.privateNetworks) &&
        Objects.equals(this.template, instance.template) &&
        Objects.equals(this.state, instance.state) &&
        Objects.equals(this.sshKey, instance.sshKey) &&
        Objects.equals(this.userData, instance.userData) &&
        Objects.equals(this.macAddress, instance.macAddress) &&
        Objects.equals(this.manager, instance.manager) &&
        Objects.equals(this.deployTarget, instance.deployTarget) &&
        Objects.equals(this.ipv6Address, instance.ipv6Address) &&
        Objects.equals(this.id, instance.id) &&
        Objects.equals(this.snapshots, instance.snapshots) &&
        Objects.equals(this.diskSize, instance.diskSize) &&
        Objects.equals(this.sshKeys, instance.sshKeys) &&
        Objects.equals(this.createdAt, instance.createdAt) &&
        Objects.equals(this.publicIp, instance.publicIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(antiAffinityGroups, publicIpAssignment, labels, securityGroups, elasticIps, name, instanceType, privateNetworks, template, state, sshKey, userData, macAddress, manager, deployTarget, ipv6Address, id, snapshots, diskSize, sshKeys, createdAt, publicIp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instance {\n");
    sb.append("    antiAffinityGroups: ").append(toIndentedString(antiAffinityGroups)).append("\n");
    sb.append("    publicIpAssignment: ").append(toIndentedString(publicIpAssignment)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
    sb.append("    elasticIps: ").append(toIndentedString(elasticIps)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    privateNetworks: ").append(toIndentedString(privateNetworks)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    sshKey: ").append(toIndentedString(sshKey)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    deployTarget: ").append(toIndentedString(deployTarget)).append("\n");
    sb.append("    ipv6Address: ").append(toIndentedString(ipv6Address)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
    sb.append("    diskSize: ").append(toIndentedString(diskSize)).append("\n");
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

    // add `anti-affinity-groups` to the URL query string
    if (getAntiAffinityGroups() != null) {
      for (int i = 0; i < getAntiAffinityGroups().size(); i++) {
        if (getAntiAffinityGroups().get(i) != null) {
          joiner.add(getAntiAffinityGroups().get(i).toUrlQueryString(String.format("%santi-affinity-groups%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

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

    // add `elastic-ips` to the URL query string
    if (getElasticIps() != null) {
      for (int i = 0; i < getElasticIps().size(); i++) {
        if (getElasticIps().get(i) != null) {
          joiner.add(getElasticIps().get(i).toUrlQueryString(String.format("%selastic-ips%s%s", prefix, suffix,
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

    // add `user-data` to the URL query string
    if (getUserData() != null) {
      joiner.add(String.format("%suser-data%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserData()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `mac-address` to the URL query string
    if (getMacAddress() != null) {
      joiner.add(String.format("%smac-address%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMacAddress()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `manager` to the URL query string
    if (getManager() != null) {
      joiner.add(getManager().toUrlQueryString(prefix + "manager" + suffix));
    }

    // add `deploy-target` to the URL query string
    if (getDeployTarget() != null) {
      joiner.add(getDeployTarget().toUrlQueryString(prefix + "deploy-target" + suffix));
    }

    // add `ipv6-address` to the URL query string
    if (getIpv6Address() != null) {
      joiner.add(String.format("%sipv6-address%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIpv6Address()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `snapshots` to the URL query string
    if (getSnapshots() != null) {
      for (int i = 0; i < getSnapshots().size(); i++) {
        if (getSnapshots().get(i) != null) {
          joiner.add(getSnapshots().get(i).toUrlQueryString(String.format("%ssnapshots%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `disk-size` to the URL query string
    if (getDiskSize() != null) {
      joiner.add(String.format("%sdisk-size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDiskSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

