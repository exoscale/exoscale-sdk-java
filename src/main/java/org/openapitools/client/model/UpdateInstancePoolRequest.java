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


package org.openapitools.client.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapitools.client.model.AntiAffinityGroup;
import org.openapitools.client.model.DeployTarget;
import org.openapitools.client.model.ElasticIp;
import org.openapitools.client.model.InstanceType;
import org.openapitools.client.model.PrivateNetwork;
import org.openapitools.client.model.PublicIpAssignment;
import org.openapitools.client.model.SecurityGroup;
import org.openapitools.client.model.SshKey;
import org.openapitools.client.model.Template;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UpdateInstancePoolRequest
 */
@JsonPropertyOrder({
  UpdateInstancePoolRequest.JSON_PROPERTY_ANTI_AFFINITY_GROUPS,
  UpdateInstancePoolRequest.JSON_PROPERTY_DESCRIPTION,
  UpdateInstancePoolRequest.JSON_PROPERTY_PUBLIC_IP_ASSIGNMENT,
  UpdateInstancePoolRequest.JSON_PROPERTY_LABELS,
  UpdateInstancePoolRequest.JSON_PROPERTY_SECURITY_GROUPS,
  UpdateInstancePoolRequest.JSON_PROPERTY_ELASTIC_IPS,
  UpdateInstancePoolRequest.JSON_PROPERTY_NAME,
  UpdateInstancePoolRequest.JSON_PROPERTY_INSTANCE_TYPE,
  UpdateInstancePoolRequest.JSON_PROPERTY_MIN_AVAILABLE,
  UpdateInstancePoolRequest.JSON_PROPERTY_PRIVATE_NETWORKS,
  UpdateInstancePoolRequest.JSON_PROPERTY_TEMPLATE,
  UpdateInstancePoolRequest.JSON_PROPERTY_SSH_KEY,
  UpdateInstancePoolRequest.JSON_PROPERTY_INSTANCE_PREFIX,
  UpdateInstancePoolRequest.JSON_PROPERTY_USER_DATA,
  UpdateInstancePoolRequest.JSON_PROPERTY_DEPLOY_TARGET,
  UpdateInstancePoolRequest.JSON_PROPERTY_IPV6_ENABLED,
  UpdateInstancePoolRequest.JSON_PROPERTY_DISK_SIZE,
  UpdateInstancePoolRequest.JSON_PROPERTY_SSH_KEYS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-10T11:00:33.694281+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class UpdateInstancePoolRequest {
  public static final String JSON_PROPERTY_ANTI_AFFINITY_GROUPS = "anti-affinity-groups";
  private JsonNullable<Set<AntiAffinityGroup>> antiAffinityGroups = JsonNullable.<Set<AntiAffinityGroup>>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_PUBLIC_IP_ASSIGNMENT = "public-ip-assignment";
  private PublicIpAssignment publicIpAssignment;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private Map<String, String> labels = new HashMap<>();

  public static final String JSON_PROPERTY_SECURITY_GROUPS = "security-groups";
  private JsonNullable<Set<SecurityGroup>> securityGroups = JsonNullable.<Set<SecurityGroup>>undefined();

  public static final String JSON_PROPERTY_ELASTIC_IPS = "elastic-ips";
  private JsonNullable<List<ElasticIp>> elasticIps = JsonNullable.<List<ElasticIp>>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_INSTANCE_TYPE = "instance-type";
  private InstanceType instanceType;

  public static final String JSON_PROPERTY_MIN_AVAILABLE = "min-available";
  private JsonNullable<Long> minAvailable = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_PRIVATE_NETWORKS = "private-networks";
  private JsonNullable<Set<PrivateNetwork>> privateNetworks = JsonNullable.<Set<PrivateNetwork>>undefined();

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  private Template template;

  public static final String JSON_PROPERTY_SSH_KEY = "ssh-key";
  private SshKey sshKey;

  public static final String JSON_PROPERTY_INSTANCE_PREFIX = "instance-prefix";
  private JsonNullable<String> instancePrefix = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_USER_DATA = "user-data";
  private JsonNullable<String> userData = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DEPLOY_TARGET = "deploy-target";
  private DeployTarget deployTarget;

  public static final String JSON_PROPERTY_IPV6_ENABLED = "ipv6-enabled";
  private Boolean ipv6Enabled;

  public static final String JSON_PROPERTY_DISK_SIZE = "disk-size";
  private Long diskSize;

  public static final String JSON_PROPERTY_SSH_KEYS = "ssh-keys";
  private JsonNullable<Set<SshKey>> sshKeys = JsonNullable.<Set<SshKey>>undefined();

  public UpdateInstancePoolRequest() { 
  }

  public UpdateInstancePoolRequest antiAffinityGroups(Set<AntiAffinityGroup> antiAffinityGroups) {
    this.antiAffinityGroups = JsonNullable.<Set<AntiAffinityGroup>>of(antiAffinityGroups);
    return this;
  }

  public UpdateInstancePoolRequest addAntiAffinityGroupsItem(AntiAffinityGroup antiAffinityGroupsItem) {
    if (this.antiAffinityGroups == null || !this.antiAffinityGroups.isPresent()) {
      this.antiAffinityGroups = JsonNullable.<Set<AntiAffinityGroup>>of(new LinkedHashSet<>());
    }
    try {
      this.antiAffinityGroups.get().add(antiAffinityGroupsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Instance Pool Anti-affinity Groups
   * @return antiAffinityGroups
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Set<AntiAffinityGroup> getAntiAffinityGroups() {
        return antiAffinityGroups.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ANTI_AFFINITY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<AntiAffinityGroup>> getAntiAffinityGroups_JsonNullable() {
    return antiAffinityGroups;
  }
  
  @JsonProperty(JSON_PROPERTY_ANTI_AFFINITY_GROUPS)
  public void setAntiAffinityGroups_JsonNullable(JsonNullable<Set<AntiAffinityGroup>> antiAffinityGroups) {
    this.antiAffinityGroups = antiAffinityGroups;
  }

  public void setAntiAffinityGroups(Set<AntiAffinityGroup> antiAffinityGroups) {
    this.antiAffinityGroups = JsonNullable.<Set<AntiAffinityGroup>>of(antiAffinityGroups);
  }


  public UpdateInstancePoolRequest description(String description) {
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


  public UpdateInstancePoolRequest publicIpAssignment(PublicIpAssignment publicIpAssignment) {
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


  public UpdateInstancePoolRequest labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public UpdateInstancePoolRequest putLabelsItem(String key, String labelsItem) {
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


  public UpdateInstancePoolRequest securityGroups(Set<SecurityGroup> securityGroups) {
    this.securityGroups = JsonNullable.<Set<SecurityGroup>>of(securityGroups);
    return this;
  }

  public UpdateInstancePoolRequest addSecurityGroupsItem(SecurityGroup securityGroupsItem) {
    if (this.securityGroups == null || !this.securityGroups.isPresent()) {
      this.securityGroups = JsonNullable.<Set<SecurityGroup>>of(new LinkedHashSet<>());
    }
    try {
      this.securityGroups.get().add(securityGroupsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Instance Pool Security Groups
   * @return securityGroups
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Set<SecurityGroup> getSecurityGroups() {
        return securityGroups.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SECURITY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<SecurityGroup>> getSecurityGroups_JsonNullable() {
    return securityGroups;
  }
  
  @JsonProperty(JSON_PROPERTY_SECURITY_GROUPS)
  public void setSecurityGroups_JsonNullable(JsonNullable<Set<SecurityGroup>> securityGroups) {
    this.securityGroups = securityGroups;
  }

  public void setSecurityGroups(Set<SecurityGroup> securityGroups) {
    this.securityGroups = JsonNullable.<Set<SecurityGroup>>of(securityGroups);
  }


  public UpdateInstancePoolRequest elasticIps(List<ElasticIp> elasticIps) {
    this.elasticIps = JsonNullable.<List<ElasticIp>>of(elasticIps);
    return this;
  }

  public UpdateInstancePoolRequest addElasticIpsItem(ElasticIp elasticIpsItem) {
    if (this.elasticIps == null || !this.elasticIps.isPresent()) {
      this.elasticIps = JsonNullable.<List<ElasticIp>>of(new ArrayList<>());
    }
    try {
      this.elasticIps.get().add(elasticIpsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Instances Elastic IPs
   * @return elasticIps
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public List<ElasticIp> getElasticIps() {
        return elasticIps.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ELASTIC_IPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<ElasticIp>> getElasticIps_JsonNullable() {
    return elasticIps;
  }
  
  @JsonProperty(JSON_PROPERTY_ELASTIC_IPS)
  public void setElasticIps_JsonNullable(JsonNullable<List<ElasticIp>> elasticIps) {
    this.elasticIps = elasticIps;
  }

  public void setElasticIps(List<ElasticIp> elasticIps) {
    this.elasticIps = JsonNullable.<List<ElasticIp>>of(elasticIps);
  }


  public UpdateInstancePoolRequest name(String name) {
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


  public UpdateInstancePoolRequest instanceType(InstanceType instanceType) {
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


  public UpdateInstancePoolRequest minAvailable(Long minAvailable) {
    this.minAvailable = JsonNullable.<Long>of(minAvailable);
    return this;
  }

   /**
   * Minimum number of running Instances
   * minimum: 0
   * @return minAvailable
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Long getMinAvailable() {
        return minAvailable.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MIN_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getMinAvailable_JsonNullable() {
    return minAvailable;
  }
  
  @JsonProperty(JSON_PROPERTY_MIN_AVAILABLE)
  public void setMinAvailable_JsonNullable(JsonNullable<Long> minAvailable) {
    this.minAvailable = minAvailable;
  }

  public void setMinAvailable(Long minAvailable) {
    this.minAvailable = JsonNullable.<Long>of(minAvailable);
  }


  public UpdateInstancePoolRequest privateNetworks(Set<PrivateNetwork> privateNetworks) {
    this.privateNetworks = JsonNullable.<Set<PrivateNetwork>>of(privateNetworks);
    return this;
  }

  public UpdateInstancePoolRequest addPrivateNetworksItem(PrivateNetwork privateNetworksItem) {
    if (this.privateNetworks == null || !this.privateNetworks.isPresent()) {
      this.privateNetworks = JsonNullable.<Set<PrivateNetwork>>of(new LinkedHashSet<>());
    }
    try {
      this.privateNetworks.get().add(privateNetworksItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Instance Pool Private Networks
   * @return privateNetworks
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Set<PrivateNetwork> getPrivateNetworks() {
        return privateNetworks.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIVATE_NETWORKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<PrivateNetwork>> getPrivateNetworks_JsonNullable() {
    return privateNetworks;
  }
  
  @JsonProperty(JSON_PROPERTY_PRIVATE_NETWORKS)
  public void setPrivateNetworks_JsonNullable(JsonNullable<Set<PrivateNetwork>> privateNetworks) {
    this.privateNetworks = privateNetworks;
  }

  public void setPrivateNetworks(Set<PrivateNetwork> privateNetworks) {
    this.privateNetworks = JsonNullable.<Set<PrivateNetwork>>of(privateNetworks);
  }


  public UpdateInstancePoolRequest template(Template template) {
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


  public UpdateInstancePoolRequest sshKey(SshKey sshKey) {
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


  public UpdateInstancePoolRequest instancePrefix(String instancePrefix) {
    this.instancePrefix = JsonNullable.<String>of(instancePrefix);
    return this;
  }

   /**
   * Prefix to apply to Instances names (default: pool)
   * @return instancePrefix
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getInstancePrefix() {
        return instancePrefix.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INSTANCE_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getInstancePrefix_JsonNullable() {
    return instancePrefix;
  }
  
  @JsonProperty(JSON_PROPERTY_INSTANCE_PREFIX)
  public void setInstancePrefix_JsonNullable(JsonNullable<String> instancePrefix) {
    this.instancePrefix = instancePrefix;
  }

  public void setInstancePrefix(String instancePrefix) {
    this.instancePrefix = JsonNullable.<String>of(instancePrefix);
  }


  public UpdateInstancePoolRequest userData(String userData) {
    this.userData = JsonNullable.<String>of(userData);
    return this;
  }

   /**
   * Instances Cloud-init user-data
   * @return userData
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getUserData() {
        return userData.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUserData_JsonNullable() {
    return userData;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_DATA)
  public void setUserData_JsonNullable(JsonNullable<String> userData) {
    this.userData = userData;
  }

  public void setUserData(String userData) {
    this.userData = JsonNullable.<String>of(userData);
  }


  public UpdateInstancePoolRequest deployTarget(DeployTarget deployTarget) {
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


  public UpdateInstancePoolRequest ipv6Enabled(Boolean ipv6Enabled) {
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


  public UpdateInstancePoolRequest diskSize(Long diskSize) {
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


  public UpdateInstancePoolRequest sshKeys(Set<SshKey> sshKeys) {
    this.sshKeys = JsonNullable.<Set<SshKey>>of(sshKeys);
    return this;
  }

  public UpdateInstancePoolRequest addSshKeysItem(SshKey sshKeysItem) {
    if (this.sshKeys == null || !this.sshKeys.isPresent()) {
      this.sshKeys = JsonNullable.<Set<SshKey>>of(new LinkedHashSet<>());
    }
    try {
      this.sshKeys.get().add(sshKeysItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Instances SSH keys
   * @return sshKeys
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Set<SshKey> getSshKeys() {
        return sshKeys.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SSH_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Set<SshKey>> getSshKeys_JsonNullable() {
    return sshKeys;
  }
  
  @JsonProperty(JSON_PROPERTY_SSH_KEYS)
  public void setSshKeys_JsonNullable(JsonNullable<Set<SshKey>> sshKeys) {
    this.sshKeys = sshKeys;
  }

  public void setSshKeys(Set<SshKey> sshKeys) {
    this.sshKeys = JsonNullable.<Set<SshKey>>of(sshKeys);
  }


  /**
   * Return true if this update_instance_pool_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateInstancePoolRequest updateInstancePoolRequest = (UpdateInstancePoolRequest) o;
    return equalsNullable(this.antiAffinityGroups, updateInstancePoolRequest.antiAffinityGroups) &&
        Objects.equals(this.description, updateInstancePoolRequest.description) &&
        Objects.equals(this.publicIpAssignment, updateInstancePoolRequest.publicIpAssignment) &&
        Objects.equals(this.labels, updateInstancePoolRequest.labels) &&
        equalsNullable(this.securityGroups, updateInstancePoolRequest.securityGroups) &&
        equalsNullable(this.elasticIps, updateInstancePoolRequest.elasticIps) &&
        Objects.equals(this.name, updateInstancePoolRequest.name) &&
        Objects.equals(this.instanceType, updateInstancePoolRequest.instanceType) &&
        equalsNullable(this.minAvailable, updateInstancePoolRequest.minAvailable) &&
        equalsNullable(this.privateNetworks, updateInstancePoolRequest.privateNetworks) &&
        Objects.equals(this.template, updateInstancePoolRequest.template) &&
        Objects.equals(this.sshKey, updateInstancePoolRequest.sshKey) &&
        equalsNullable(this.instancePrefix, updateInstancePoolRequest.instancePrefix) &&
        equalsNullable(this.userData, updateInstancePoolRequest.userData) &&
        Objects.equals(this.deployTarget, updateInstancePoolRequest.deployTarget) &&
        Objects.equals(this.ipv6Enabled, updateInstancePoolRequest.ipv6Enabled) &&
        Objects.equals(this.diskSize, updateInstancePoolRequest.diskSize) &&
        equalsNullable(this.sshKeys, updateInstancePoolRequest.sshKeys);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(antiAffinityGroups), description, publicIpAssignment, labels, hashCodeNullable(securityGroups), hashCodeNullable(elasticIps), name, instanceType, hashCodeNullable(minAvailable), hashCodeNullable(privateNetworks), template, sshKey, hashCodeNullable(instancePrefix), hashCodeNullable(userData), deployTarget, ipv6Enabled, diskSize, hashCodeNullable(sshKeys));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInstancePoolRequest {\n");
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

