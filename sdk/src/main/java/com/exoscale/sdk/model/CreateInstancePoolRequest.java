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
import com.exoscale.sdk.model.InstanceType;
import com.exoscale.sdk.model.PrivateNetwork;
import com.exoscale.sdk.model.SecurityGroup;
import com.exoscale.sdk.model.SshKey;
import com.exoscale.sdk.model.Template;
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
 * CreateInstancePoolRequest
 */
@JsonPropertyOrder({
  CreateInstancePoolRequest.JSON_PROPERTY_ANTI_AFFINITY_GROUPS,
  CreateInstancePoolRequest.JSON_PROPERTY_DESCRIPTION,
  CreateInstancePoolRequest.JSON_PROPERTY_PUBLIC_IP_ASSIGNMENT,
  CreateInstancePoolRequest.JSON_PROPERTY_LABELS,
  CreateInstancePoolRequest.JSON_PROPERTY_SECURITY_GROUPS,
  CreateInstancePoolRequest.JSON_PROPERTY_ELASTIC_IPS,
  CreateInstancePoolRequest.JSON_PROPERTY_NAME,
  CreateInstancePoolRequest.JSON_PROPERTY_INSTANCE_TYPE,
  CreateInstancePoolRequest.JSON_PROPERTY_MIN_AVAILABLE,
  CreateInstancePoolRequest.JSON_PROPERTY_PRIVATE_NETWORKS,
  CreateInstancePoolRequest.JSON_PROPERTY_TEMPLATE,
  CreateInstancePoolRequest.JSON_PROPERTY_SIZE,
  CreateInstancePoolRequest.JSON_PROPERTY_SSH_KEY,
  CreateInstancePoolRequest.JSON_PROPERTY_INSTANCE_PREFIX,
  CreateInstancePoolRequest.JSON_PROPERTY_USER_DATA,
  CreateInstancePoolRequest.JSON_PROPERTY_DEPLOY_TARGET,
  CreateInstancePoolRequest.JSON_PROPERTY_IPV6_ENABLED,
  CreateInstancePoolRequest.JSON_PROPERTY_DISK_SIZE,
  CreateInstancePoolRequest.JSON_PROPERTY_SSH_KEYS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CreateInstancePoolRequest {
  public static final String JSON_PROPERTY_ANTI_AFFINITY_GROUPS = "anti-affinity-groups";
  private Set<AntiAffinityGroup> antiAffinityGroups;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  /**
   * Determines public IP assignment of the Instances. Type &#x60;none&#x60; is final and can&#39;t be changed later on.
   */
  public enum PublicIpAssignmentEnum {
    INET4("inet4"),
    
    DUAL("dual"),
    
    NONE("none");

    private String value;

    PublicIpAssignmentEnum(String value) {
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
    public static PublicIpAssignmentEnum fromValue(String value) {
      for (PublicIpAssignmentEnum b : PublicIpAssignmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PUBLIC_IP_ASSIGNMENT = "public-ip-assignment";
  private PublicIpAssignmentEnum publicIpAssignment;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private Map<String, String> labels = new HashMap<>();

  public static final String JSON_PROPERTY_SECURITY_GROUPS = "security-groups";
  private Set<SecurityGroup> securityGroups;

  public static final String JSON_PROPERTY_ELASTIC_IPS = "elastic-ips";
  private Set<ElasticIp> elasticIps;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_INSTANCE_TYPE = "instance-type";
  private InstanceType instanceType;

  public static final String JSON_PROPERTY_MIN_AVAILABLE = "min-available";
  private Long minAvailable;

  public static final String JSON_PROPERTY_PRIVATE_NETWORKS = "private-networks";
  private Set<PrivateNetwork> privateNetworks;

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  private Template template;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_SSH_KEY = "ssh-key";
  private SshKey sshKey;

  public static final String JSON_PROPERTY_INSTANCE_PREFIX = "instance-prefix";
  private String instancePrefix;

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

  public CreateInstancePoolRequest() { 
  }

  public CreateInstancePoolRequest antiAffinityGroups(Set<AntiAffinityGroup> antiAffinityGroups) {
    this.antiAffinityGroups = antiAffinityGroups;
    return this;
  }

  public CreateInstancePoolRequest addAntiAffinityGroupsItem(AntiAffinityGroup antiAffinityGroupsItem) {
    if (this.antiAffinityGroups == null) {
      this.antiAffinityGroups = new LinkedHashSet<>();
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

  public Set<AntiAffinityGroup> getAntiAffinityGroups() {
    return antiAffinityGroups;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ANTI_AFFINITY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAntiAffinityGroups(Set<AntiAffinityGroup> antiAffinityGroups) {
    this.antiAffinityGroups = antiAffinityGroups;
  }


  public CreateInstancePoolRequest description(String description) {
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


  public CreateInstancePoolRequest publicIpAssignment(PublicIpAssignmentEnum publicIpAssignment) {
    this.publicIpAssignment = publicIpAssignment;
    return this;
  }

   /**
   * Determines public IP assignment of the Instances. Type &#x60;none&#x60; is final and can&#39;t be changed later on.
   * @return publicIpAssignment
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_IP_ASSIGNMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PublicIpAssignmentEnum getPublicIpAssignment() {
    return publicIpAssignment;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_IP_ASSIGNMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicIpAssignment(PublicIpAssignmentEnum publicIpAssignment) {
    this.publicIpAssignment = publicIpAssignment;
  }


  public CreateInstancePoolRequest labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public CreateInstancePoolRequest putLabelsItem(String key, String labelsItem) {
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


  public CreateInstancePoolRequest securityGroups(Set<SecurityGroup> securityGroups) {
    this.securityGroups = securityGroups;
    return this;
  }

  public CreateInstancePoolRequest addSecurityGroupsItem(SecurityGroup securityGroupsItem) {
    if (this.securityGroups == null) {
      this.securityGroups = new LinkedHashSet<>();
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

  public Set<SecurityGroup> getSecurityGroups() {
    return securityGroups;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_SECURITY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecurityGroups(Set<SecurityGroup> securityGroups) {
    this.securityGroups = securityGroups;
  }


  public CreateInstancePoolRequest elasticIps(Set<ElasticIp> elasticIps) {
    this.elasticIps = elasticIps;
    return this;
  }

  public CreateInstancePoolRequest addElasticIpsItem(ElasticIp elasticIpsItem) {
    if (this.elasticIps == null) {
      this.elasticIps = new LinkedHashSet<>();
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

  public Set<ElasticIp> getElasticIps() {
    return elasticIps;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ELASTIC_IPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElasticIps(Set<ElasticIp> elasticIps) {
    this.elasticIps = elasticIps;
  }


  public CreateInstancePoolRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Instance Pool name
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public CreateInstancePoolRequest instanceType(InstanceType instanceType) {
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


  public CreateInstancePoolRequest minAvailable(Long minAvailable) {
    this.minAvailable = minAvailable;
    return this;
  }

   /**
   * Minimum number of running Instances
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


  public CreateInstancePoolRequest privateNetworks(Set<PrivateNetwork> privateNetworks) {
    this.privateNetworks = privateNetworks;
    return this;
  }

  public CreateInstancePoolRequest addPrivateNetworksItem(PrivateNetwork privateNetworksItem) {
    if (this.privateNetworks == null) {
      this.privateNetworks = new LinkedHashSet<>();
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

  public Set<PrivateNetwork> getPrivateNetworks() {
    return privateNetworks;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_PRIVATE_NETWORKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivateNetworks(Set<PrivateNetwork> privateNetworks) {
    this.privateNetworks = privateNetworks;
  }


  public CreateInstancePoolRequest template(Template template) {
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


  public CreateInstancePoolRequest size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Number of Instances
   * minimum: 0
   * @return size
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSize(Long size) {
    this.size = size;
  }


  public CreateInstancePoolRequest sshKey(SshKey sshKey) {
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


  public CreateInstancePoolRequest instancePrefix(String instancePrefix) {
    this.instancePrefix = instancePrefix;
    return this;
  }

   /**
   * Prefix to apply to Instances names (default: pool)
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


  public CreateInstancePoolRequest userData(String userData) {
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


  public CreateInstancePoolRequest deployTarget(DeployTarget deployTarget) {
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


  public CreateInstancePoolRequest ipv6Enabled(Boolean ipv6Enabled) {
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


  public CreateInstancePoolRequest diskSize(Long diskSize) {
    this.diskSize = diskSize;
    return this;
  }

   /**
   * Instances disk size in GiB
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


  public CreateInstancePoolRequest sshKeys(Set<SshKey> sshKeys) {
    this.sshKeys = sshKeys;
    return this;
  }

  public CreateInstancePoolRequest addSshKeysItem(SshKey sshKeysItem) {
    if (this.sshKeys == null) {
      this.sshKeys = new LinkedHashSet<>();
    }
    this.sshKeys.add(sshKeysItem);
    return this;
  }

   /**
   * Instances SSH Keys
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
   * Return true if this create_instance_pool_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInstancePoolRequest createInstancePoolRequest = (CreateInstancePoolRequest) o;
    return Objects.equals(this.antiAffinityGroups, createInstancePoolRequest.antiAffinityGroups) &&
        Objects.equals(this.description, createInstancePoolRequest.description) &&
        Objects.equals(this.publicIpAssignment, createInstancePoolRequest.publicIpAssignment) &&
        Objects.equals(this.labels, createInstancePoolRequest.labels) &&
        Objects.equals(this.securityGroups, createInstancePoolRequest.securityGroups) &&
        Objects.equals(this.elasticIps, createInstancePoolRequest.elasticIps) &&
        Objects.equals(this.name, createInstancePoolRequest.name) &&
        Objects.equals(this.instanceType, createInstancePoolRequest.instanceType) &&
        Objects.equals(this.minAvailable, createInstancePoolRequest.minAvailable) &&
        Objects.equals(this.privateNetworks, createInstancePoolRequest.privateNetworks) &&
        Objects.equals(this.template, createInstancePoolRequest.template) &&
        Objects.equals(this.size, createInstancePoolRequest.size) &&
        Objects.equals(this.sshKey, createInstancePoolRequest.sshKey) &&
        Objects.equals(this.instancePrefix, createInstancePoolRequest.instancePrefix) &&
        Objects.equals(this.userData, createInstancePoolRequest.userData) &&
        Objects.equals(this.deployTarget, createInstancePoolRequest.deployTarget) &&
        Objects.equals(this.ipv6Enabled, createInstancePoolRequest.ipv6Enabled) &&
        Objects.equals(this.diskSize, createInstancePoolRequest.diskSize) &&
        Objects.equals(this.sshKeys, createInstancePoolRequest.sshKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(antiAffinityGroups, description, publicIpAssignment, labels, securityGroups, elasticIps, name, instanceType, minAvailable, privateNetworks, template, size, sshKey, instancePrefix, userData, deployTarget, ipv6Enabled, diskSize, sshKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInstancePoolRequest {\n");
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
      int i = 0;
      for (SecurityGroup _item : getSecurityGroups()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%ssecurity-groups%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `elastic-ips` to the URL query string
    if (getElasticIps() != null) {
      int i = 0;
      for (ElasticIp _item : getElasticIps()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%selastic-ips%s%s", prefix, suffix,
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

    // add `min-available` to the URL query string
    if (getMinAvailable() != null) {
      joiner.add(String.format("%smin-available%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMinAvailable()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

    // add `template` to the URL query string
    if (getTemplate() != null) {
      joiner.add(getTemplate().toUrlQueryString(prefix + "template" + suffix));
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

