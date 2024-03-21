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
import io.swagger.client.model.InstanceType;
import io.swagger.client.model.Labels;
import io.swagger.client.model.PublicIpAssignment;
import io.swagger.client.model.SecurityGroup;
import io.swagger.client.model.SshKey;
import io.swagger.client.model.Template;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * InstanceBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-08T17:23:40.261901+01:00[Europe/Vienna]")

public class InstanceBody {
  @JsonProperty("anti-affinity-groups")
  private List<AntiAffinityGroup> antiAffinityGroups = null;

  @JsonProperty("public-ip-assignment")
  private PublicIpAssignment publicIpAssignment = null;

  @JsonProperty("labels")
  private Labels labels = null;

  @JsonProperty("auto-start")
  private Boolean autoStart = null;

  @JsonProperty("security-groups")
  private List<SecurityGroup> securityGroups = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("instance-type")
  private InstanceType instanceType = null;

  @JsonProperty("template")
  private Template template = null;

  @JsonProperty("ssh-key")
  private SshKey sshKey = null;

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

  public InstanceBody antiAffinityGroups(List<AntiAffinityGroup> antiAffinityGroups) {
    this.antiAffinityGroups = antiAffinityGroups;
    return this;
  }

  public InstanceBody addAntiAffinityGroupsItem(AntiAffinityGroup antiAffinityGroupsItem) {
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
  @Schema(description = "Instance Anti-affinity Groups")
  public List<AntiAffinityGroup> getAntiAffinityGroups() {
    return antiAffinityGroups;
  }

  public void setAntiAffinityGroups(List<AntiAffinityGroup> antiAffinityGroups) {
    this.antiAffinityGroups = antiAffinityGroups;
  }

  public InstanceBody publicIpAssignment(PublicIpAssignment publicIpAssignment) {
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

  public InstanceBody labels(Labels labels) {
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

  public InstanceBody autoStart(Boolean autoStart) {
    this.autoStart = autoStart;
    return this;
  }

   /**
   * Start Instance on creation (default: true)
   * @return autoStart
  **/
  @Schema(description = "Start Instance on creation (default: true)")
  public Boolean isAutoStart() {
    return autoStart;
  }

  public void setAutoStart(Boolean autoStart) {
    this.autoStart = autoStart;
  }

  public InstanceBody securityGroups(List<SecurityGroup> securityGroups) {
    this.securityGroups = securityGroups;
    return this;
  }

  public InstanceBody addSecurityGroupsItem(SecurityGroup securityGroupsItem) {
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
  @Schema(description = "Instance Security Groups")
  public List<SecurityGroup> getSecurityGroups() {
    return securityGroups;
  }

  public void setSecurityGroups(List<SecurityGroup> securityGroups) {
    this.securityGroups = securityGroups;
  }

  public InstanceBody name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Instance name
   * @return name
  **/
  @Schema(description = "Instance name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InstanceBody instanceType(InstanceType instanceType) {
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

  public InstanceBody template(Template template) {
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

  public InstanceBody sshKey(SshKey sshKey) {
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

  public InstanceBody userData(String userData) {
    this.userData = userData;
    return this;
  }

   /**
   * Instance Cloud-init user-data
   * @return userData
  **/
  @Schema(description = "Instance Cloud-init user-data")
  public String getUserData() {
    return userData;
  }

  public void setUserData(String userData) {
    this.userData = userData;
  }

  public InstanceBody deployTarget(DeployTarget deployTarget) {
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

  public InstanceBody ipv6Enabled(Boolean ipv6Enabled) {
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

  public InstanceBody diskSize(Long diskSize) {
    this.diskSize = diskSize;
    return this;
  }

   /**
   * Instance disk size in GB
   * minimum: 10
   * maximum: 50000
   * @return diskSize
  **/
  @Schema(required = true, description = "Instance disk size in GB")
  public Long getDiskSize() {
    return diskSize;
  }

  public void setDiskSize(Long diskSize) {
    this.diskSize = diskSize;
  }

  public InstanceBody sshKeys(List<SshKey> sshKeys) {
    this.sshKeys = sshKeys;
    return this;
  }

  public InstanceBody addSshKeysItem(SshKey sshKeysItem) {
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
  @Schema(description = "Instance SSH Keys")
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
    InstanceBody instanceBody = (InstanceBody) o;
    return Objects.equals(this.antiAffinityGroups, instanceBody.antiAffinityGroups) &&
        Objects.equals(this.publicIpAssignment, instanceBody.publicIpAssignment) &&
        Objects.equals(this.labels, instanceBody.labels) &&
        Objects.equals(this.autoStart, instanceBody.autoStart) &&
        Objects.equals(this.securityGroups, instanceBody.securityGroups) &&
        Objects.equals(this.name, instanceBody.name) &&
        Objects.equals(this.instanceType, instanceBody.instanceType) &&
        Objects.equals(this.template, instanceBody.template) &&
        Objects.equals(this.sshKey, instanceBody.sshKey) &&
        Objects.equals(this.userData, instanceBody.userData) &&
        Objects.equals(this.deployTarget, instanceBody.deployTarget) &&
        Objects.equals(this.ipv6Enabled, instanceBody.ipv6Enabled) &&
        Objects.equals(this.diskSize, instanceBody.diskSize) &&
        Objects.equals(this.sshKeys, instanceBody.sshKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(antiAffinityGroups, publicIpAssignment, labels, autoStart, securityGroups, name, instanceType, template, sshKey, userData, deployTarget, ipv6Enabled, diskSize, sshKeys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceBody {\n");
    
    sb.append("    antiAffinityGroups: ").append(toIndentedString(antiAffinityGroups)).append("\n");
    sb.append("    publicIpAssignment: ").append(toIndentedString(publicIpAssignment)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    autoStart: ").append(toIndentedString(autoStart)).append("\n");
    sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    sshKey: ").append(toIndentedString(sshKey)).append("\n");
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
