/*
 * Exoscale Public API
 *  Infrastructure automation API, allowing programmatic access to all Exoscale products and services.  The [OpenAPI Specification](http://spec.openapis.org/oas/v3.0.3.html) source of this documentation can be obtained here:  * [JSON format](https://openapi-v2.exoscale.com/source.json) * [YAML format](https://openapi-v2.exoscale.com/source.yaml)
 *
 * OpenAPI spec version: 2.0.0
 * Contact: api@exoscale.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.client.model.AntiAffinityGroup;
import io.swagger.client.model.DeployTarget;
import io.swagger.client.model.ElasticIp;
import io.swagger.client.model.Instance;
import io.swagger.client.model.InstanceType;
import io.swagger.client.model.Labels;
import io.swagger.client.model.Manager;
import io.swagger.client.model.PrivateNetwork;
import io.swagger.client.model.PublicIpAssignment;
import io.swagger.client.model.SecurityGroup;
import io.swagger.client.model.SshKey;
import io.swagger.client.model.Template;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * Instance Pool
 */
@Schema(description = "Instance Pool")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-08T17:23:40.261901+01:00[Europe/Vienna]")

public class InstancePool {
  @JsonProperty("anti-affinity-groups")
  private List<AntiAffinityGroup> antiAffinityGroups = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("public-ip-assignment")
  private PublicIpAssignment publicIpAssignment = null;

  @JsonProperty("labels")
  private Labels labels = null;

  @JsonProperty("security-groups")
  private List<SecurityGroup> securityGroups = null;

  @JsonProperty("elastic-ips")
  private List<ElasticIp> elasticIps = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("instance-type")
  private InstanceType instanceType = null;

  @JsonProperty("min-available")
  private Long minAvailable = null;

  @JsonProperty("private-networks")
  private List<PrivateNetwork> privateNetworks = null;

  @JsonProperty("template")
  private Template template = null;

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
    public static StateEnum fromValue(String input) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("state")
  private StateEnum state = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("ssh-key")
  private SshKey sshKey = null;

  @JsonProperty("instance-prefix")
  private String instancePrefix = null;

  @JsonProperty("user-data")
  private String userData = null;

  @JsonProperty("manager")
  private Manager manager = null;

  @JsonProperty("instances")
  private List<Instance> instances = null;

  @JsonProperty("deploy-target")
  private DeployTarget deployTarget = null;

  @JsonProperty("ipv6-enabled")
  private Boolean ipv6Enabled = null;

  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("disk-size")
  private Long diskSize = null;

  @JsonProperty("ssh-keys")
  private List<SshKey> sshKeys = null;

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
  @Schema(description = "Instance Pool Anti-affinity Groups")
  public List<AntiAffinityGroup> getAntiAffinityGroups() {
    return antiAffinityGroups;
  }

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
  @Schema(description = "Instance Pool description")
  public String getDescription() {
    return description;
  }

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
  @Schema(description = "")
  public PublicIpAssignment getPublicIpAssignment() {
    return publicIpAssignment;
  }

  public void setPublicIpAssignment(PublicIpAssignment publicIpAssignment) {
    this.publicIpAssignment = publicIpAssignment;
  }

  public InstancePool labels(Labels labels) {
    this.labels = labels;
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @Schema(description = "")
  public Labels getLabels() {
    return labels;
  }

  public void setLabels(Labels labels) {
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
  @Schema(description = "Instance Pool Security Groups")
  public List<SecurityGroup> getSecurityGroups() {
    return securityGroups;
  }

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
  @Schema(description = "Instances Elastic IPs")
  public List<ElasticIp> getElasticIps() {
    return elasticIps;
  }

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
  @Schema(description = "Instance Pool name")
  public String getName() {
    return name;
  }

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
  @Schema(description = "")
  public InstanceType getInstanceType() {
    return instanceType;
  }

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
  @Schema(description = "Minimum number of running instances")
  public Long getMinAvailable() {
    return minAvailable;
  }

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
  @Schema(description = "Instance Pool Private Networks")
  public List<PrivateNetwork> getPrivateNetworks() {
    return privateNetworks;
  }

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
  @Schema(description = "")
  public Template getTemplate() {
    return template;
  }

  public void setTemplate(Template template) {
    this.template = template;
  }

   /**
   * Instance Pool state
   * @return state
  **/
  @Schema(description = "Instance Pool state")
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
  @Schema(description = "Number of instances")
  public Long getSize() {
    return size;
  }

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
  @Schema(description = "")
  public SshKey getSshKey() {
    return sshKey;
  }

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
  @Schema(description = "The instances created by the Instance Pool will be prefixed with this value (default: pool)")
  public String getInstancePrefix() {
    return instancePrefix;
  }

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
  @Schema(description = "Instances Cloud-init user-data")
  public String getUserData() {
    return userData;
  }

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
  @Schema(description = "")
  public Manager getManager() {
    return manager;
  }

  public void setManager(Manager manager) {
    this.manager = manager;
  }

   /**
   * Instances
   * @return instances
  **/
  @Schema(description = "Instances")
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
  @Schema(description = "")
  public DeployTarget getDeployTarget() {
    return deployTarget;
  }

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
  @Schema(description = "Enable IPv6 for instances")
  public Boolean isIpv6Enabled() {
    return ipv6Enabled;
  }

  public void setIpv6Enabled(Boolean ipv6Enabled) {
    this.ipv6Enabled = ipv6Enabled;
  }

   /**
   * Instance Pool ID
   * @return id
  **/
  @Schema(description = "Instance Pool ID")
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
  @Schema(description = "Instances disk size in GB")
  public Long getDiskSize() {
    return diskSize;
  }

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
  @Schema(description = "Instances SSH keys")
  public List<SshKey> getSshKeys() {
    return sshKeys;
  }

  public void setSshKeys(List<SshKey> sshKeys) {
    this.sshKeys = sshKeys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
