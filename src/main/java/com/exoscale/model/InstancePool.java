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
import com.exoscale.model.AntiAffinityGroup;
import com.exoscale.model.DeployTarget;
import com.exoscale.model.ElasticIp;
import com.exoscale.model.Instance;
import com.exoscale.model.InstanceType;
import com.exoscale.model.Manager;
import com.exoscale.model.PrivateNetwork;
import com.exoscale.model.PublicIpAssignment;
import com.exoscale.model.SecurityGroup;
import com.exoscale.model.SshKey;
import com.exoscale.model.Template;
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
@JsonTypeName("instance-pool")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T21:01:33.231699+01:00[Europe/Vienna]")
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
   * Instances disk size in GB
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

}

