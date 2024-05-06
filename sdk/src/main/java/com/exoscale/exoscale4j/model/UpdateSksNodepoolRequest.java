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
import com.exoscale.exoscale4j.model.PrivateNetwork;
import com.exoscale.exoscale4j.model.SecurityGroup;
import com.exoscale.exoscale4j.model.SksNodepoolTaint;
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
 * UpdateSksNodepoolRequest
 */
@JsonPropertyOrder({
  UpdateSksNodepoolRequest.JSON_PROPERTY_ANTI_AFFINITY_GROUPS,
  UpdateSksNodepoolRequest.JSON_PROPERTY_DESCRIPTION,
  UpdateSksNodepoolRequest.JSON_PROPERTY_LABELS,
  UpdateSksNodepoolRequest.JSON_PROPERTY_TAINTS,
  UpdateSksNodepoolRequest.JSON_PROPERTY_SECURITY_GROUPS,
  UpdateSksNodepoolRequest.JSON_PROPERTY_NAME,
  UpdateSksNodepoolRequest.JSON_PROPERTY_INSTANCE_TYPE,
  UpdateSksNodepoolRequest.JSON_PROPERTY_PRIVATE_NETWORKS,
  UpdateSksNodepoolRequest.JSON_PROPERTY_INSTANCE_PREFIX,
  UpdateSksNodepoolRequest.JSON_PROPERTY_DEPLOY_TARGET,
  UpdateSksNodepoolRequest.JSON_PROPERTY_DISK_SIZE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T14:27:11.860946+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class UpdateSksNodepoolRequest {
  public static final String JSON_PROPERTY_ANTI_AFFINITY_GROUPS = "anti-affinity-groups";
  private Set<AntiAffinityGroup> antiAffinityGroups;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private Map<String, String> labels = new HashMap<>();

  public static final String JSON_PROPERTY_TAINTS = "taints";
  private Map<String, SksNodepoolTaint> taints = new HashMap<>();

  public static final String JSON_PROPERTY_SECURITY_GROUPS = "security-groups";
  private Set<SecurityGroup> securityGroups;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_INSTANCE_TYPE = "instance-type";
  private InstanceType instanceType;

  public static final String JSON_PROPERTY_PRIVATE_NETWORKS = "private-networks";
  private Set<PrivateNetwork> privateNetworks;

  public static final String JSON_PROPERTY_INSTANCE_PREFIX = "instance-prefix";
  private String instancePrefix;

  public static final String JSON_PROPERTY_DEPLOY_TARGET = "deploy-target";
  private DeployTarget deployTarget;

  public static final String JSON_PROPERTY_DISK_SIZE = "disk-size";
  private Long diskSize;

  public UpdateSksNodepoolRequest() { 
  }

  public UpdateSksNodepoolRequest antiAffinityGroups(Set<AntiAffinityGroup> antiAffinityGroups) {
    this.antiAffinityGroups = antiAffinityGroups;
    return this;
  }

  public UpdateSksNodepoolRequest addAntiAffinityGroupsItem(AntiAffinityGroup antiAffinityGroupsItem) {
    if (this.antiAffinityGroups == null) {
      this.antiAffinityGroups = new LinkedHashSet<>();
    }
    this.antiAffinityGroups.add(antiAffinityGroupsItem);
    return this;
  }

   /**
   * Nodepool Anti-affinity Groups
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


  public UpdateSksNodepoolRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Nodepool description
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


  public UpdateSksNodepoolRequest labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public UpdateSksNodepoolRequest putLabelsItem(String key, String labelsItem) {
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


  public UpdateSksNodepoolRequest taints(Map<String, SksNodepoolTaint> taints) {
    this.taints = taints;
    return this;
  }

  public UpdateSksNodepoolRequest putTaintsItem(String key, SksNodepoolTaint taintsItem) {
    if (this.taints == null) {
      this.taints = new HashMap<>();
    }
    this.taints.put(key, taintsItem);
    return this;
  }

   /**
   * Get taints
   * @return taints
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, SksNodepoolTaint> getTaints() {
    return taints;
  }


  @JsonProperty(JSON_PROPERTY_TAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaints(Map<String, SksNodepoolTaint> taints) {
    this.taints = taints;
  }


  public UpdateSksNodepoolRequest securityGroups(Set<SecurityGroup> securityGroups) {
    this.securityGroups = securityGroups;
    return this;
  }

  public UpdateSksNodepoolRequest addSecurityGroupsItem(SecurityGroup securityGroupsItem) {
    if (this.securityGroups == null) {
      this.securityGroups = new LinkedHashSet<>();
    }
    this.securityGroups.add(securityGroupsItem);
    return this;
  }

   /**
   * Nodepool Security Groups
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


  public UpdateSksNodepoolRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nodepool name
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


  public UpdateSksNodepoolRequest instanceType(InstanceType instanceType) {
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


  public UpdateSksNodepoolRequest privateNetworks(Set<PrivateNetwork> privateNetworks) {
    this.privateNetworks = privateNetworks;
    return this;
  }

  public UpdateSksNodepoolRequest addPrivateNetworksItem(PrivateNetwork privateNetworksItem) {
    if (this.privateNetworks == null) {
      this.privateNetworks = new LinkedHashSet<>();
    }
    this.privateNetworks.add(privateNetworksItem);
    return this;
  }

   /**
   * Nodepool Private Networks
   * @return privateNetworks
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVATE_NETWORKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<PrivateNetwork> getPrivateNetworks() {
    return privateNetworks;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_PRIVATE_NETWORKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivateNetworks(Set<PrivateNetwork> privateNetworks) {
    this.privateNetworks = privateNetworks;
  }


  public UpdateSksNodepoolRequest instancePrefix(String instancePrefix) {
    this.instancePrefix = instancePrefix;
    return this;
  }

   /**
   * Prefix to apply to managed instances names (default: pool)
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


  public UpdateSksNodepoolRequest deployTarget(DeployTarget deployTarget) {
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


  public UpdateSksNodepoolRequest diskSize(Long diskSize) {
    this.diskSize = diskSize;
    return this;
  }

   /**
   * Nodepool instances disk size in GB
   * minimum: 20
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


  /**
   * Return true if this update_sks_nodepool_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSksNodepoolRequest updateSksNodepoolRequest = (UpdateSksNodepoolRequest) o;
    return Objects.equals(this.antiAffinityGroups, updateSksNodepoolRequest.antiAffinityGroups) &&
        Objects.equals(this.description, updateSksNodepoolRequest.description) &&
        Objects.equals(this.labels, updateSksNodepoolRequest.labels) &&
        Objects.equals(this.taints, updateSksNodepoolRequest.taints) &&
        Objects.equals(this.securityGroups, updateSksNodepoolRequest.securityGroups) &&
        Objects.equals(this.name, updateSksNodepoolRequest.name) &&
        Objects.equals(this.instanceType, updateSksNodepoolRequest.instanceType) &&
        Objects.equals(this.privateNetworks, updateSksNodepoolRequest.privateNetworks) &&
        Objects.equals(this.instancePrefix, updateSksNodepoolRequest.instancePrefix) &&
        Objects.equals(this.deployTarget, updateSksNodepoolRequest.deployTarget) &&
        Objects.equals(this.diskSize, updateSksNodepoolRequest.diskSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(antiAffinityGroups, description, labels, taints, securityGroups, name, instanceType, privateNetworks, instancePrefix, deployTarget, diskSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSksNodepoolRequest {\n");
    sb.append("    antiAffinityGroups: ").append(toIndentedString(antiAffinityGroups)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    taints: ").append(toIndentedString(taints)).append("\n");
    sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    privateNetworks: ").append(toIndentedString(privateNetworks)).append("\n");
    sb.append("    instancePrefix: ").append(toIndentedString(instancePrefix)).append("\n");
    sb.append("    deployTarget: ").append(toIndentedString(deployTarget)).append("\n");
    sb.append("    diskSize: ").append(toIndentedString(diskSize)).append("\n");
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

    // add `taints` to the URL query string
    if (getTaints() != null) {
      for (String _key : getTaints().keySet()) {
        if (getTaints().get(_key) != null) {
          joiner.add(getTaints().get(_key).toUrlQueryString(String.format("%staints%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
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

    // add `private-networks` to the URL query string
    if (getPrivateNetworks() != null) {
      int i = 0;
      for (PrivateNetwork _item : getPrivateNetworks()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%sprivate-networks%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `instance-prefix` to the URL query string
    if (getInstancePrefix() != null) {
      joiner.add(String.format("%sinstance-prefix%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInstancePrefix()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `deploy-target` to the URL query string
    if (getDeployTarget() != null) {
      joiner.add(getDeployTarget().toUrlQueryString(prefix + "deploy-target" + suffix));
    }

    // add `disk-size` to the URL query string
    if (getDiskSize() != null) {
      joiner.add(String.format("%sdisk-size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDiskSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
