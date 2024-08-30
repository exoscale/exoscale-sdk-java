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
import com.exoscale.sdk.model.AntiAffinityGroup;
import com.exoscale.sdk.model.DeployTarget;
import com.exoscale.sdk.model.ElasticIp;
import com.exoscale.sdk.model.Instance;
import com.exoscale.sdk.model.InstanceType;
import com.exoscale.sdk.model.Manager;
import com.exoscale.sdk.model.PrivateNetwork;
import com.exoscale.sdk.model.PublicIpAssignment;
import com.exoscale.sdk.model.SecurityGroup;
import com.exoscale.sdk.model.SshKey;
import com.exoscale.sdk.model.Template;
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
 * Instance Pool
 */
@JsonPropertyOrder({
  InstancePool.JSON_PROPERTY_ANTI_AFFINITY_GROUPS,
  InstancePool.JSON_PROPERTY_DESCRIPTION,
  InstancePool.JSON_PROPERTY_PUBLIC_IP_ASSIGNMENT,
  InstancePool.JSON_PROPERTY_LABELS,
  InstancePool.JSON_PROPERTY_SECURITY_GROUPS,
  InstancePool.JSON_PROPERTY_ELASTIC_IPS,
  InstancePool.JSON_PROPERTY_NAME,
  InstancePool.JSON_PROPERTY_INSTANCE_TYPE,
  InstancePool.JSON_PROPERTY_MIN_AVAILABLE,
  InstancePool.JSON_PROPERTY_PRIVATE_NETWORKS,
  InstancePool.JSON_PROPERTY_TEMPLATE,
  InstancePool.JSON_PROPERTY_STATE,
  InstancePool.JSON_PROPERTY_SIZE,
  InstancePool.JSON_PROPERTY_SSH_KEY,
  InstancePool.JSON_PROPERTY_INSTANCE_PREFIX,
  InstancePool.JSON_PROPERTY_USER_DATA,
  InstancePool.JSON_PROPERTY_MANAGER,
  InstancePool.JSON_PROPERTY_INSTANCES,
  InstancePool.JSON_PROPERTY_DEPLOY_TARGET,
  InstancePool.JSON_PROPERTY_IPV6_ENABLED,
  InstancePool.JSON_PROPERTY_ID,
  InstancePool.JSON_PROPERTY_DISK_SIZE,
  InstancePool.JSON_PROPERTY_SSH_KEYS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-30T13:37:22.669691+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class InstancePool {
  public static final String JSON_PROPERTY_ANTI_AFFINITY_GROUPS = "anti-affinity-groups";
  private List<AntiAffinityGroup> antiAffinityGroups;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

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

  public static final String JSON_PROPERTY_MIN_AVAILABLE = "min-available";
  private Long minAvailable;

  public static final String JSON_PROPERTY_PRIVATE_NETWORKS = "private-networks";
  private List<PrivateNetwork> privateNetworks;

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  private Template template;

  /**
   * Instance Pool state
   */
  public enum StateEnum {
    SCALING_UP("scaling-up"),
    
    SCALING_DOWN("scaling-down"),
    
    DESTROYING("destroying"),
    
    CREATING("creating"),
    
    SUSPENDED("suspended"),
    
    RUNNING("running"),
    
    UPDATING("updating");

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

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_SSH_KEY = "ssh-key";
  private SshKey sshKey;

  public static final String JSON_PROPERTY_INSTANCE_PREFIX = "instance-prefix";
  private String instancePrefix;

  public static final String JSON_PROPERTY_USER_DATA = "user-data";
  private String userData;

  public static final String JSON_PROPERTY_MANAGER = "manager";
  private Manager manager;

  public static final String JSON_PROPERTY_INSTANCES = "instances";
  private List<Instance> instances;

  public static final String JSON_PROPERTY_DEPLOY_TARGET = "deploy-target";
  private DeployTarget deployTarget;

  public static final String JSON_PROPERTY_IPV6_ENABLED = "ipv6-enabled";
  private Boolean ipv6Enabled;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_DISK_SIZE = "disk-size";
  private Long diskSize;

  public static final String JSON_PROPERTY_SSH_KEYS = "ssh-keys";
  private List<SshKey> sshKeys;

  public InstancePool() { 
  }

  @JsonCreator
  public InstancePool(
    @JsonProperty(JSON_PROPERTY_STATE) StateEnum state, 
    @JsonProperty(JSON_PROPERTY_INSTANCES) List<Instance> instances, 
    @JsonProperty(JSON_PROPERTY_ID) UUID id
  ) {
  this();
    this.state = state;
    this.instances = instances;
    this.id = id;
  }

  public InstancePool antiAffinityGroups(List<AntiAffinityGroup> antiAffinityGroups) {
    this.antiAffinityGroups = antiAffinityGroups;
    return this;
  }

  public InstancePool addAntiAffinityGroupsItem(AntiAffinityGroup antiAffinityGroupsItem) {
    if (this.antiAffinityGroups == null) {
      this.antiAffinityGroups = new ArrayList<>();
    }
    this.antiAffinityGroups.add(antiAffinityGroupsItem);
    return this;
  }

   /**
   * Instance Pool Anti-affinity Groups
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


  public InstancePool description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Instance Pool description
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


  public InstancePool publicIpAssignment(PublicIpAssignment publicIpAssignment) {
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


  public InstancePool labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public InstancePool putLabelsItem(String key, String labelsItem) {
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


  public InstancePool securityGroups(List<SecurityGroup> securityGroups) {
    this.securityGroups = securityGroups;
    return this;
  }

  public InstancePool addSecurityGroupsItem(SecurityGroup securityGroupsItem) {
    if (this.securityGroups == null) {
      this.securityGroups = new ArrayList<>();
    }
    this.securityGroups.add(securityGroupsItem);
    return this;
  }

   /**
   * Instance Pool Security Groups
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


  public InstancePool elasticIps(List<ElasticIp> elasticIps) {
    this.elasticIps = elasticIps;
    return this;
  }

  public InstancePool addElasticIpsItem(ElasticIp elasticIpsItem) {
    if (this.elasticIps == null) {
      this.elasticIps = new ArrayList<>();
    }
    this.elasticIps.add(elasticIpsItem);
    return this;
  }

   /**
   * Instances Elastic IPs
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


  public InstancePool name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Instance Pool name
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


  public InstancePool instanceType(InstanceType instanceType) {
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


  public InstancePool minAvailable(Long minAvailable) {
    this.minAvailable = minAvailable;
    return this;
  }

   /**
   * Minimum number of running instances
   * minimum: 0
   * @return minAvailable
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMinAvailable() {
    return minAvailable;
  }


  @JsonProperty(JSON_PROPERTY_MIN_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinAvailable(Long minAvailable) {
    this.minAvailable = minAvailable;
  }


  public InstancePool privateNetworks(List<PrivateNetwork> privateNetworks) {
    this.privateNetworks = privateNetworks;
    return this;
  }

  public InstancePool addPrivateNetworksItem(PrivateNetwork privateNetworksItem) {
    if (this.privateNetworks == null) {
      this.privateNetworks = new ArrayList<>();
    }
    this.privateNetworks.add(privateNetworksItem);
    return this;
  }

   /**
   * Instance Pool Private Networks
   * @return privateNetworks
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVATE_NETWORKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PrivateNetwork> getPrivateNetworks() {
    return privateNetworks;
  }


  @JsonProperty(JSON_PROPERTY_PRIVATE_NETWORKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivateNetworks(List<PrivateNetwork> privateNetworks) {
    this.privateNetworks = privateNetworks;
  }


  public InstancePool template(Template template) {
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


   /**
   * Instance Pool state
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StateEnum getState() {
    return state;
  }




  public InstancePool size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Number of instances
   * minimum: 0
   * @return size
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(Long size) {
    this.size = size;
  }


  public InstancePool sshKey(SshKey sshKey) {
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


  public InstancePool instancePrefix(String instancePrefix) {
    this.instancePrefix = instancePrefix;
    return this;
  }

   /**
   * The instances created by the Instance Pool will be prefixed with this value (default: pool)
   * @return instancePrefix
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTANCE_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstancePrefix() {
    return instancePrefix;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstancePrefix(String instancePrefix) {
    this.instancePrefix = instancePrefix;
  }


  public InstancePool userData(String userData) {
    this.userData = userData;
    return this;
  }

   /**
   * Instances Cloud-init user-data
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


  public InstancePool manager(Manager manager) {
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


   /**
   * Instances
   * @return instances
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Instance> getInstances() {
    return instances;
  }




  public InstancePool deployTarget(DeployTarget deployTarget) {
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


  public InstancePool ipv6Enabled(Boolean ipv6Enabled) {
    this.ipv6Enabled = ipv6Enabled;
    return this;
  }

   /**
   * Enable IPv6 for instances
   * @return ipv6Enabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IPV6_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIpv6Enabled() {
    return ipv6Enabled;
  }


  @JsonProperty(JSON_PROPERTY_IPV6_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpv6Enabled(Boolean ipv6Enabled) {
    this.ipv6Enabled = ipv6Enabled;
  }


   /**
   * Instance Pool ID
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




  public InstancePool diskSize(Long diskSize) {
    this.diskSize = diskSize;
    return this;
  }

   /**
   * Instances disk size in GiB
   * minimum: 10
   * maximum: 51200
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


  public InstancePool sshKeys(List<SshKey> sshKeys) {
    this.sshKeys = sshKeys;
    return this;
  }

  public InstancePool addSshKeysItem(SshKey sshKeysItem) {
    if (this.sshKeys == null) {
      this.sshKeys = new ArrayList<>();
    }
    this.sshKeys.add(sshKeysItem);
    return this;
  }

   /**
   * Instances SSH keys
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
   * Return true if this instance-pool object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstancePool instancePool = (InstancePool) o;
    return Objects.equals(this.antiAffinityGroups, instancePool.antiAffinityGroups) &&
        Objects.equals(this.description, instancePool.description) &&
        Objects.equals(this.publicIpAssignment, instancePool.publicIpAssignment) &&
        Objects.equals(this.labels, instancePool.labels) &&
        Objects.equals(this.securityGroups, instancePool.securityGroups) &&
        Objects.equals(this.elasticIps, instancePool.elasticIps) &&
        Objects.equals(this.name, instancePool.name) &&
        Objects.equals(this.instanceType, instancePool.instanceType) &&
        Objects.equals(this.minAvailable, instancePool.minAvailable) &&
        Objects.equals(this.privateNetworks, instancePool.privateNetworks) &&
        Objects.equals(this.template, instancePool.template) &&
        Objects.equals(this.state, instancePool.state) &&
        Objects.equals(this.size, instancePool.size) &&
        Objects.equals(this.sshKey, instancePool.sshKey) &&
        Objects.equals(this.instancePrefix, instancePool.instancePrefix) &&
        Objects.equals(this.userData, instancePool.userData) &&
        Objects.equals(this.manager, instancePool.manager) &&
        Objects.equals(this.instances, instancePool.instances) &&
        Objects.equals(this.deployTarget, instancePool.deployTarget) &&
        Objects.equals(this.ipv6Enabled, instancePool.ipv6Enabled) &&
        Objects.equals(this.id, instancePool.id) &&
        Objects.equals(this.diskSize, instancePool.diskSize) &&
        Objects.equals(this.sshKeys, instancePool.sshKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(antiAffinityGroups, description, publicIpAssignment, labels, securityGroups, elasticIps, name, instanceType, minAvailable, privateNetworks, template, state, size, sshKey, instancePrefix, userData, manager, instances, deployTarget, ipv6Enabled, id, diskSize, sshKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstancePool {\n");
    sb.append("    antiAffinityGroups: ").append(toIndentedString(antiAffinityGroups)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    publicIpAssignment: ").append(toIndentedString(publicIpAssignment)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
    sb.append("    elasticIps: ").append(toIndentedString(elasticIps)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    minAvailable: ").append(toIndentedString(minAvailable)).append("\n");
    sb.append("    privateNetworks: ").append(toIndentedString(privateNetworks)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sshKey: ").append(toIndentedString(sshKey)).append("\n");
    sb.append("    instancePrefix: ").append(toIndentedString(instancePrefix)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    deployTarget: ").append(toIndentedString(deployTarget)).append("\n");
    sb.append("    ipv6Enabled: ").append(toIndentedString(ipv6Enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    diskSize: ").append(toIndentedString(diskSize)).append("\n");
    sb.append("    sshKeys: ").append(toIndentedString(sshKeys)).append("\n");
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

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

    // add `min-available` to the URL query string
    if (getMinAvailable() != null) {
      joiner.add(String.format("%smin-available%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMinAvailable()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

    // add `size` to the URL query string
    if (getSize() != null) {
      joiner.add(String.format("%ssize%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ssh-key` to the URL query string
    if (getSshKey() != null) {
      joiner.add(getSshKey().toUrlQueryString(prefix + "ssh-key" + suffix));
    }

    // add `instance-prefix` to the URL query string
    if (getInstancePrefix() != null) {
      joiner.add(String.format("%sinstance-prefix%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInstancePrefix()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `user-data` to the URL query string
    if (getUserData() != null) {
      joiner.add(String.format("%suser-data%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserData()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `manager` to the URL query string
    if (getManager() != null) {
      joiner.add(getManager().toUrlQueryString(prefix + "manager" + suffix));
    }

    // add `instances` to the URL query string
    if (getInstances() != null) {
      for (int i = 0; i < getInstances().size(); i++) {
        if (getInstances().get(i) != null) {
          joiner.add(getInstances().get(i).toUrlQueryString(String.format("%sinstances%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `deploy-target` to the URL query string
    if (getDeployTarget() != null) {
      joiner.add(getDeployTarget().toUrlQueryString(prefix + "deploy-target" + suffix));
    }

    // add `ipv6-enabled` to the URL query string
    if (getIpv6Enabled() != null) {
      joiner.add(String.format("%sipv6-enabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIpv6Enabled()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }
}

