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
import io.swagger.client.model.InstanceType;
import io.swagger.client.model.Labels;
import io.swagger.client.model.PrivateNetwork;
import io.swagger.client.model.PublicIpAssignment;
import io.swagger.client.model.SecurityGroup;
import io.swagger.client.model.SshKey;
import io.swagger.client.model.Template;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * InstancepoolBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-08T17:23:40.261901+01:00[Europe/Vienna]")

public class InstancepoolBody {
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

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("ssh-key")
  private SshKey sshKey = null;

  @JsonProperty("instance-prefix")
  private String instancePrefix = null;

  @JsonProperty("user-data")
  private String userData = null;

  @JsonProperty("deploy-target")
  private DeployTarget deployTarget = null;

  @JsonProperty("ipv6-enabled")
  private Boolean ipv6Enabled = null;

  @JsonProperty("disk-size")
  private Long diskSize = null;

  @JsonProperty("ssh-keys")
  private List<SshKey> sshKeys = null;

  public InstancepoolBody antiAffinityGroups(List<AntiAffinityGroup> antiAffinityGroups) {
    this.antiAffinityGroups = antiAffinityGroups;
    return this;
  }

  public InstancepoolBody addAntiAffinityGroupsItem(AntiAffinityGroup antiAffinityGroupsItem) {
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

  public InstancepoolBody description(String description) {
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

  public InstancepoolBody publicIpAssignment(PublicIpAssignment publicIpAssignment) {
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

  public InstancepoolBody labels(Labels labels) {
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

  public InstancepoolBody securityGroups(List<SecurityGroup> securityGroups) {
    this.securityGroups = securityGroups;
    return this;
  }

  public InstancepoolBody addSecurityGroupsItem(SecurityGroup securityGroupsItem) {
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

  public InstancepoolBody elasticIps(List<ElasticIp> elasticIps) {
    this.elasticIps = elasticIps;
    return this;
  }

  public InstancepoolBody addElasticIpsItem(ElasticIp elasticIpsItem) {
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

  public InstancepoolBody name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Instance Pool name
   * @return name
  **/
  @Schema(required = true, description = "Instance Pool name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InstancepoolBody instanceType(InstanceType instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @Schema(required = true, description = "")
  public InstanceType getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(InstanceType instanceType) {
    this.instanceType = instanceType;
  }

  public InstancepoolBody minAvailable(Long minAvailable) {
    this.minAvailable = minAvailable;
    return this;
  }

   /**
   * Minimum number of running Instances
   * minimum: 0
   * @return minAvailable
  **/
  @Schema(description = "Minimum number of running Instances")
  public Long getMinAvailable() {
    return minAvailable;
  }

  public void setMinAvailable(Long minAvailable) {
    this.minAvailable = minAvailable;
  }

  public InstancepoolBody privateNetworks(List<PrivateNetwork> privateNetworks) {
    this.privateNetworks = privateNetworks;
    return this;
  }

  public InstancepoolBody addPrivateNetworksItem(PrivateNetwork privateNetworksItem) {
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

  public InstancepoolBody template(Template template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @Schema(required = true, description = "")
  public Template getTemplate() {
    return template;
  }

  public void setTemplate(Template template) {
    this.template = template;
  }

  public InstancepoolBody size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Number of Instances
   * minimum: 0
   * @return size
  **/
  @Schema(required = true, description = "Number of Instances")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public InstancepoolBody sshKey(SshKey sshKey) {
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

  public InstancepoolBody instancePrefix(String instancePrefix) {
    this.instancePrefix = instancePrefix;
    return this;
  }

   /**
   * Prefix to apply to Instances names (default: pool)
   * @return instancePrefix
  **/
  @Schema(description = "Prefix to apply to Instances names (default: pool)")
  public String getInstancePrefix() {
    return instancePrefix;
  }

  public void setInstancePrefix(String instancePrefix) {
    this.instancePrefix = instancePrefix;
  }

  public InstancepoolBody userData(String userData) {
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

  public InstancepoolBody deployTarget(DeployTarget deployTarget) {
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

  public InstancepoolBody ipv6Enabled(Boolean ipv6Enabled) {
    this.ipv6Enabled = ipv6Enabled;
    return this;
  }

   /**
   * Enable IPv6. DEPRECATED: use &#x60;public-ip-assignments&#x60;.
   * @return ipv6Enabled
  **/
  @Schema(description = "Enable IPv6. DEPRECATED: use `public-ip-assignments`.")
  public Boolean isIpv6Enabled() {
    return ipv6Enabled;
  }

  public void setIpv6Enabled(Boolean ipv6Enabled) {
    this.ipv6Enabled = ipv6Enabled;
  }

  public InstancepoolBody diskSize(Long diskSize) {
    this.diskSize = diskSize;
    return this;
  }

   /**
   * Instances disk size in GB
   * minimum: 10
   * maximum: 50000
   * @return diskSize
  **/
  @Schema(required = true, description = "Instances disk size in GB")
  public Long getDiskSize() {
    return diskSize;
  }

  public void setDiskSize(Long diskSize) {
    this.diskSize = diskSize;
  }

  public InstancepoolBody sshKeys(List<SshKey> sshKeys) {
    this.sshKeys = sshKeys;
    return this;
  }

  public InstancepoolBody addSshKeysItem(SshKey sshKeysItem) {
    if (this.sshKeys == null) {
      this.sshKeys = new ArrayList<>();
    }
    this.sshKeys.add(sshKeysItem);
    return this;
  }

   /**
   * Instances SSH Keys
   * @return sshKeys
  **/
  @Schema(description = "Instances SSH Keys")
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
    InstancepoolBody instancepoolBody = (InstancepoolBody) o;
    return Objects.equals(this.antiAffinityGroups, instancepoolBody.antiAffinityGroups) &&
        Objects.equals(this.description, instancepoolBody.description) &&
        Objects.equals(this.publicIpAssignment, instancepoolBody.publicIpAssignment) &&
        Objects.equals(this.labels, instancepoolBody.labels) &&
        Objects.equals(this.securityGroups, instancepoolBody.securityGroups) &&
        Objects.equals(this.elasticIps, instancepoolBody.elasticIps) &&
        Objects.equals(this.name, instancepoolBody.name) &&
        Objects.equals(this.instanceType, instancepoolBody.instanceType) &&
        Objects.equals(this.minAvailable, instancepoolBody.minAvailable) &&
        Objects.equals(this.privateNetworks, instancepoolBody.privateNetworks) &&
        Objects.equals(this.template, instancepoolBody.template) &&
        Objects.equals(this.size, instancepoolBody.size) &&
        Objects.equals(this.sshKey, instancepoolBody.sshKey) &&
        Objects.equals(this.instancePrefix, instancepoolBody.instancePrefix) &&
        Objects.equals(this.userData, instancepoolBody.userData) &&
        Objects.equals(this.deployTarget, instancepoolBody.deployTarget) &&
        Objects.equals(this.ipv6Enabled, instancepoolBody.ipv6Enabled) &&
        Objects.equals(this.diskSize, instancepoolBody.diskSize) &&
        Objects.equals(this.sshKeys, instancepoolBody.sshKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(antiAffinityGroups, description, publicIpAssignment, labels, securityGroups, elasticIps, name, instanceType, minAvailable, privateNetworks, template, size, sshKey, instancePrefix, userData, deployTarget, ipv6Enabled, diskSize, sshKeys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstancepoolBody {\n");
    
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
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sshKey: ").append(toIndentedString(sshKey)).append("\n");
    sb.append("    instancePrefix: ").append(toIndentedString(instancePrefix)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    deployTarget: ").append(toIndentedString(deployTarget)).append("\n");
    sb.append("    ipv6Enabled: ").append(toIndentedString(ipv6Enabled)).append("\n");
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
