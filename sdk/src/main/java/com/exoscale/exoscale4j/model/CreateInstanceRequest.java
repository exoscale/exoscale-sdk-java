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
import com.exoscale.exoscale4j.model.InstanceType;
import com.exoscale.exoscale4j.model.PublicIpAssignment;
import com.exoscale.exoscale4j.model.SecurityGroup;
import com.exoscale.exoscale4j.model.SshKey;
import com.exoscale.exoscale4j.model.Template;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateInstanceRequest
 */
@JsonPropertyOrder({
  CreateInstanceRequest.JSON_PROPERTY_ANTI_AFFINITY_GROUPS,
  CreateInstanceRequest.JSON_PROPERTY_PUBLIC_IP_ASSIGNMENT,
  CreateInstanceRequest.JSON_PROPERTY_LABELS,
  CreateInstanceRequest.JSON_PROPERTY_AUTO_START,
  CreateInstanceRequest.JSON_PROPERTY_SECURITY_GROUPS,
  CreateInstanceRequest.JSON_PROPERTY_NAME,
  CreateInstanceRequest.JSON_PROPERTY_INSTANCE_TYPE,
  CreateInstanceRequest.JSON_PROPERTY_TEMPLATE,
  CreateInstanceRequest.JSON_PROPERTY_SSH_KEY,
  CreateInstanceRequest.JSON_PROPERTY_USER_DATA,
  CreateInstanceRequest.JSON_PROPERTY_DEPLOY_TARGET,
  CreateInstanceRequest.JSON_PROPERTY_IPV6_ENABLED,
  CreateInstanceRequest.JSON_PROPERTY_DISK_SIZE,
  CreateInstanceRequest.JSON_PROPERTY_SSH_KEYS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-05T21:27:44.654335085+02:00[Europe/Zurich]", comments = "Generator version: 7.4.0")
public class CreateInstanceRequest {
  public static final String JSON_PROPERTY_ANTI_AFFINITY_GROUPS = "anti-affinity-groups";
  private Set<AntiAffinityGroup> antiAffinityGroups;

  public static final String JSON_PROPERTY_PUBLIC_IP_ASSIGNMENT = "public-ip-assignment";
  private PublicIpAssignment publicIpAssignment;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private Map<String, String> labels = new HashMap<>();

  public static final String JSON_PROPERTY_AUTO_START = "auto-start";
  private Boolean autoStart;

  public static final String JSON_PROPERTY_SECURITY_GROUPS = "security-groups";
  private Set<SecurityGroup> securityGroups;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_INSTANCE_TYPE = "instance-type";
  private InstanceType instanceType;

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  private Template template;

  public static final String JSON_PROPERTY_SSH_KEY = "ssh-key";
  private SshKey sshKey;

  public static final String JSON_PROPERTY_USER_DATA = "user-data";
  private String userData;

  public static final String JSON_PROPERTY_DEPLOY_TARGET = "deploy-target";
  private DeployTarget deployTarget;

  public static final String JSON_PROPERTY_IPV6_ENABLED = "ipv6-enabled";
  private Boolean ipv6Enabled;

  public static final String JSON_PROPERTY_DISK_SIZE = "disk-size";
  private Long diskSize;

  public static final String JSON_PROPERTY_SSH_KEYS = "ssh-keys";
  private Set<SshKey> sshKeys;

  public CreateInstanceRequest() { 
  }

  public CreateInstanceRequest antiAffinityGroups(Set<AntiAffinityGroup> antiAffinityGroups) {
    this.antiAffinityGroups = antiAffinityGroups;
    return this;
  }

  public CreateInstanceRequest addAntiAffinityGroupsItem(AntiAffinityGroup antiAffinityGroupsItem) {
    if (this.antiAffinityGroups == null) {
      this.antiAffinityGroups = new LinkedHashSet<>();
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

  public Set<AntiAffinityGroup> getAntiAffinityGroups() {
    return antiAffinityGroups;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ANTI_AFFINITY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAntiAffinityGroups(Set<AntiAffinityGroup> antiAffinityGroups) {
    this.antiAffinityGroups = antiAffinityGroups;
  }


  public CreateInstanceRequest publicIpAssignment(PublicIpAssignment publicIpAssignment) {
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


  public CreateInstanceRequest labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public CreateInstanceRequest putLabelsItem(String key, String labelsItem) {
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


  public CreateInstanceRequest autoStart(Boolean autoStart) {
    this.autoStart = autoStart;
    return this;
  }

   /**
   * Start Instance on creation (default: true)
   * @return autoStart
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoStart() {
    return autoStart;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoStart(Boolean autoStart) {
    this.autoStart = autoStart;
  }


  public CreateInstanceRequest securityGroups(Set<SecurityGroup> securityGroups) {
    this.securityGroups = securityGroups;
    return this;
  }

  public CreateInstanceRequest addSecurityGroupsItem(SecurityGroup securityGroupsItem) {
    if (this.securityGroups == null) {
      this.securityGroups = new LinkedHashSet<>();
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

  public Set<SecurityGroup> getSecurityGroups() {
    return securityGroups;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_SECURITY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecurityGroups(Set<SecurityGroup> securityGroups) {
    this.securityGroups = securityGroups;
  }


  public CreateInstanceRequest name(String name) {
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


  public CreateInstanceRequest instanceType(InstanceType instanceType) {
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INSTANCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public InstanceType getInstanceType() {
    return instanceType;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInstanceType(InstanceType instanceType) {
    this.instanceType = instanceType;
  }


  public CreateInstanceRequest template(Template template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Template getTemplate() {
    return template;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTemplate(Template template) {
    this.template = template;
  }


  public CreateInstanceRequest sshKey(SshKey sshKey) {
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


  public CreateInstanceRequest userData(String userData) {
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


  public CreateInstanceRequest deployTarget(DeployTarget deployTarget) {
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


  public CreateInstanceRequest ipv6Enabled(Boolean ipv6Enabled) {
    this.ipv6Enabled = ipv6Enabled;
    return this;
  }

   /**
   * Enable IPv6. DEPRECATED: use &#x60;public-ip-assignments&#x60;.
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


  public CreateInstanceRequest diskSize(Long diskSize) {
    this.diskSize = diskSize;
    return this;
  }

   /**
   * Instance disk size in GiB
   * minimum: 10
   * maximum: 51200
   * @return diskSize
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DISK_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getDiskSize() {
    return diskSize;
  }


  @JsonProperty(JSON_PROPERTY_DISK_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDiskSize(Long diskSize) {
    this.diskSize = diskSize;
  }


  public CreateInstanceRequest sshKeys(Set<SshKey> sshKeys) {
    this.sshKeys = sshKeys;
    return this;
  }

  public CreateInstanceRequest addSshKeysItem(SshKey sshKeysItem) {
    if (this.sshKeys == null) {
      this.sshKeys = new LinkedHashSet<>();
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

  public Set<SshKey> getSshKeys() {
    return sshKeys;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_SSH_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSshKeys(Set<SshKey> sshKeys) {
    this.sshKeys = sshKeys;
  }


  /**
   * Return true if this create_instance_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInstanceRequest createInstanceRequest = (CreateInstanceRequest) o;
    return Objects.equals(this.antiAffinityGroups, createInstanceRequest.antiAffinityGroups) &&
        Objects.equals(this.publicIpAssignment, createInstanceRequest.publicIpAssignment) &&
        Objects.equals(this.labels, createInstanceRequest.labels) &&
        Objects.equals(this.autoStart, createInstanceRequest.autoStart) &&
        Objects.equals(this.securityGroups, createInstanceRequest.securityGroups) &&
        Objects.equals(this.name, createInstanceRequest.name) &&
        Objects.equals(this.instanceType, createInstanceRequest.instanceType) &&
        Objects.equals(this.template, createInstanceRequest.template) &&
        Objects.equals(this.sshKey, createInstanceRequest.sshKey) &&
        Objects.equals(this.userData, createInstanceRequest.userData) &&
        Objects.equals(this.deployTarget, createInstanceRequest.deployTarget) &&
        Objects.equals(this.ipv6Enabled, createInstanceRequest.ipv6Enabled) &&
        Objects.equals(this.diskSize, createInstanceRequest.diskSize) &&
        Objects.equals(this.sshKeys, createInstanceRequest.sshKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(antiAffinityGroups, publicIpAssignment, labels, autoStart, securityGroups, name, instanceType, template, sshKey, userData, deployTarget, ipv6Enabled, diskSize, sshKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInstanceRequest {\n");
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
      int i = 0;
      for (AntiAffinityGroup _item : getAntiAffinityGroups()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%santi-affinity-groups%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
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

    // add `auto-start` to the URL query string
    if (getAutoStart() != null) {
      joiner.add(String.format("%sauto-start%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAutoStart()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `security-groups` to the URL query string
    if (getSecurityGroups() != null) {
      int i = 0;
      for (SecurityGroup _item : getSecurityGroups()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%ssecurity-groups%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `instance-type` to the URL query string
    if (getInstanceType() != null) {
      joiner.add(getInstanceType().toUrlQueryString(prefix + "instance-type" + suffix));
    }

    // add `template` to the URL query string
    if (getTemplate() != null) {
      joiner.add(getTemplate().toUrlQueryString(prefix + "template" + suffix));
    }

    // add `ssh-key` to the URL query string
    if (getSshKey() != null) {
      joiner.add(getSshKey().toUrlQueryString(prefix + "ssh-key" + suffix));
    }

    // add `user-data` to the URL query string
    if (getUserData() != null) {
      joiner.add(String.format("%suser-data%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserData()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `deploy-target` to the URL query string
    if (getDeployTarget() != null) {
      joiner.add(getDeployTarget().toUrlQueryString(prefix + "deploy-target" + suffix));
    }

    // add `ipv6-enabled` to the URL query string
    if (getIpv6Enabled() != null) {
      joiner.add(String.format("%sipv6-enabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIpv6Enabled()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `disk-size` to the URL query string
    if (getDiskSize() != null) {
      joiner.add(String.format("%sdisk-size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDiskSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ssh-keys` to the URL query string
    if (getSshKeys() != null) {
      int i = 0;
      for (SshKey _item : getSshKeys()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%sssh-keys%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    return joiner.toString();
  }
}

