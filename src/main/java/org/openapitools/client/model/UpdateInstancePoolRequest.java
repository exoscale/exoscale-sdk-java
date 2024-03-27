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

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * UpdateInstancePoolRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T17:14:44.205710495Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class UpdateInstancePoolRequest {
  public static final String SERIALIZED_NAME_ANTI_AFFINITY_GROUPS = "anti-affinity-groups";
  @SerializedName(SERIALIZED_NAME_ANTI_AFFINITY_GROUPS)
  private Set<AntiAffinityGroup> antiAffinityGroups;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PUBLIC_IP_ASSIGNMENT = "public-ip-assignment";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IP_ASSIGNMENT)
  private PublicIpAssignment publicIpAssignment;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_SECURITY_GROUPS = "security-groups";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUPS)
  private Set<SecurityGroup> securityGroups;

  public static final String SERIALIZED_NAME_ELASTIC_IPS = "elastic-ips";
  @SerializedName(SERIALIZED_NAME_ELASTIC_IPS)
  private List<ElasticIp> elasticIps;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INSTANCE_TYPE = "instance-type";
  @SerializedName(SERIALIZED_NAME_INSTANCE_TYPE)
  private InstanceType instanceType;

  public static final String SERIALIZED_NAME_MIN_AVAILABLE = "min-available";
  @SerializedName(SERIALIZED_NAME_MIN_AVAILABLE)
  private Long minAvailable;

  public static final String SERIALIZED_NAME_PRIVATE_NETWORKS = "private-networks";
  @SerializedName(SERIALIZED_NAME_PRIVATE_NETWORKS)
  private Set<PrivateNetwork> privateNetworks;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private Template template;

  public static final String SERIALIZED_NAME_SSH_KEY = "ssh-key";
  @SerializedName(SERIALIZED_NAME_SSH_KEY)
  private SshKey sshKey;

  public static final String SERIALIZED_NAME_INSTANCE_PREFIX = "instance-prefix";
  @SerializedName(SERIALIZED_NAME_INSTANCE_PREFIX)
  private String instancePrefix;

  public static final String SERIALIZED_NAME_USER_DATA = "user-data";
  @SerializedName(SERIALIZED_NAME_USER_DATA)
  private String userData;

  public static final String SERIALIZED_NAME_DEPLOY_TARGET = "deploy-target";
  @SerializedName(SERIALIZED_NAME_DEPLOY_TARGET)
  private DeployTarget deployTarget;

  public static final String SERIALIZED_NAME_IPV6_ENABLED = "ipv6-enabled";
  @SerializedName(SERIALIZED_NAME_IPV6_ENABLED)
  private Boolean ipv6Enabled;

  public static final String SERIALIZED_NAME_DISK_SIZE = "disk-size";
  @SerializedName(SERIALIZED_NAME_DISK_SIZE)
  private Long diskSize;

  public static final String SERIALIZED_NAME_SSH_KEYS = "ssh-keys";
  @SerializedName(SERIALIZED_NAME_SSH_KEYS)
  private Set<SshKey> sshKeys;

  public UpdateInstancePoolRequest() {
  }

  public UpdateInstancePoolRequest antiAffinityGroups(Set<AntiAffinityGroup> antiAffinityGroups) {
    this.antiAffinityGroups = antiAffinityGroups;
    return this;
  }

  public UpdateInstancePoolRequest addAntiAffinityGroupsItem(AntiAffinityGroup antiAffinityGroupsItem) {
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
  public Set<AntiAffinityGroup> getAntiAffinityGroups() {
    return antiAffinityGroups;
  }

  public void setAntiAffinityGroups(Set<AntiAffinityGroup> antiAffinityGroups) {
    this.antiAffinityGroups = antiAffinityGroups;
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
  public String getDescription() {
    return description;
  }

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
  public PublicIpAssignment getPublicIpAssignment() {
    return publicIpAssignment;
  }

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
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public UpdateInstancePoolRequest securityGroups(Set<SecurityGroup> securityGroups) {
    this.securityGroups = securityGroups;
    return this;
  }

  public UpdateInstancePoolRequest addSecurityGroupsItem(SecurityGroup securityGroupsItem) {
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
  public Set<SecurityGroup> getSecurityGroups() {
    return securityGroups;
  }

  public void setSecurityGroups(Set<SecurityGroup> securityGroups) {
    this.securityGroups = securityGroups;
  }


  public UpdateInstancePoolRequest elasticIps(List<ElasticIp> elasticIps) {
    this.elasticIps = elasticIps;
    return this;
  }

  public UpdateInstancePoolRequest addElasticIpsItem(ElasticIp elasticIpsItem) {
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
  public List<ElasticIp> getElasticIps() {
    return elasticIps;
  }

  public void setElasticIps(List<ElasticIp> elasticIps) {
    this.elasticIps = elasticIps;
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
  public String getName() {
    return name;
  }

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
  public InstanceType getInstanceType() {
    return instanceType;
  }

  public void setInstanceType(InstanceType instanceType) {
    this.instanceType = instanceType;
  }


  public UpdateInstancePoolRequest minAvailable(Long minAvailable) {
    this.minAvailable = minAvailable;
    return this;
  }

   /**
   * Minimum number of running Instances
   * minimum: 0
   * @return minAvailable
  **/
  @javax.annotation.Nullable
  public Long getMinAvailable() {
    return minAvailable;
  }

  public void setMinAvailable(Long minAvailable) {
    this.minAvailable = minAvailable;
  }


  public UpdateInstancePoolRequest privateNetworks(Set<PrivateNetwork> privateNetworks) {
    this.privateNetworks = privateNetworks;
    return this;
  }

  public UpdateInstancePoolRequest addPrivateNetworksItem(PrivateNetwork privateNetworksItem) {
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
  public Set<PrivateNetwork> getPrivateNetworks() {
    return privateNetworks;
  }

  public void setPrivateNetworks(Set<PrivateNetwork> privateNetworks) {
    this.privateNetworks = privateNetworks;
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
  public Template getTemplate() {
    return template;
  }

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
  public SshKey getSshKey() {
    return sshKey;
  }

  public void setSshKey(SshKey sshKey) {
    this.sshKey = sshKey;
  }


  public UpdateInstancePoolRequest instancePrefix(String instancePrefix) {
    this.instancePrefix = instancePrefix;
    return this;
  }

   /**
   * Prefix to apply to Instances names (default: pool)
   * @return instancePrefix
  **/
  @javax.annotation.Nullable
  public String getInstancePrefix() {
    return instancePrefix;
  }

  public void setInstancePrefix(String instancePrefix) {
    this.instancePrefix = instancePrefix;
  }


  public UpdateInstancePoolRequest userData(String userData) {
    this.userData = userData;
    return this;
  }

   /**
   * Instances Cloud-init user-data
   * @return userData
  **/
  @javax.annotation.Nullable
  public String getUserData() {
    return userData;
  }

  public void setUserData(String userData) {
    this.userData = userData;
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
  public DeployTarget getDeployTarget() {
    return deployTarget;
  }

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
  public Boolean getIpv6Enabled() {
    return ipv6Enabled;
  }

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
  public Long getDiskSize() {
    return diskSize;
  }

  public void setDiskSize(Long diskSize) {
    this.diskSize = diskSize;
  }


  public UpdateInstancePoolRequest sshKeys(Set<SshKey> sshKeys) {
    this.sshKeys = sshKeys;
    return this;
  }

  public UpdateInstancePoolRequest addSshKeysItem(SshKey sshKeysItem) {
    if (this.sshKeys == null) {
      this.sshKeys = new LinkedHashSet<>();
    }
    this.sshKeys.add(sshKeysItem);
    return this;
  }

   /**
   * Instances SSH keys
   * @return sshKeys
  **/
  @javax.annotation.Nullable
  public Set<SshKey> getSshKeys() {
    return sshKeys;
  }

  public void setSshKeys(Set<SshKey> sshKeys) {
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
    UpdateInstancePoolRequest updateInstancePoolRequest = (UpdateInstancePoolRequest) o;
    return Objects.equals(this.antiAffinityGroups, updateInstancePoolRequest.antiAffinityGroups) &&
        Objects.equals(this.description, updateInstancePoolRequest.description) &&
        Objects.equals(this.publicIpAssignment, updateInstancePoolRequest.publicIpAssignment) &&
        Objects.equals(this.labels, updateInstancePoolRequest.labels) &&
        Objects.equals(this.securityGroups, updateInstancePoolRequest.securityGroups) &&
        Objects.equals(this.elasticIps, updateInstancePoolRequest.elasticIps) &&
        Objects.equals(this.name, updateInstancePoolRequest.name) &&
        Objects.equals(this.instanceType, updateInstancePoolRequest.instanceType) &&
        Objects.equals(this.minAvailable, updateInstancePoolRequest.minAvailable) &&
        Objects.equals(this.privateNetworks, updateInstancePoolRequest.privateNetworks) &&
        Objects.equals(this.template, updateInstancePoolRequest.template) &&
        Objects.equals(this.sshKey, updateInstancePoolRequest.sshKey) &&
        Objects.equals(this.instancePrefix, updateInstancePoolRequest.instancePrefix) &&
        Objects.equals(this.userData, updateInstancePoolRequest.userData) &&
        Objects.equals(this.deployTarget, updateInstancePoolRequest.deployTarget) &&
        Objects.equals(this.ipv6Enabled, updateInstancePoolRequest.ipv6Enabled) &&
        Objects.equals(this.diskSize, updateInstancePoolRequest.diskSize) &&
        Objects.equals(this.sshKeys, updateInstancePoolRequest.sshKeys);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(antiAffinityGroups, description, publicIpAssignment, labels, securityGroups, elasticIps, name, instanceType, minAvailable, privateNetworks, template, sshKey, instancePrefix, userData, deployTarget, ipv6Enabled, diskSize, sshKeys);
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("anti-affinity-groups");
    openapiFields.add("description");
    openapiFields.add("public-ip-assignment");
    openapiFields.add("labels");
    openapiFields.add("security-groups");
    openapiFields.add("elastic-ips");
    openapiFields.add("name");
    openapiFields.add("instance-type");
    openapiFields.add("min-available");
    openapiFields.add("private-networks");
    openapiFields.add("template");
    openapiFields.add("ssh-key");
    openapiFields.add("instance-prefix");
    openapiFields.add("user-data");
    openapiFields.add("deploy-target");
    openapiFields.add("ipv6-enabled");
    openapiFields.add("disk-size");
    openapiFields.add("ssh-keys");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateInstancePoolRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateInstancePoolRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateInstancePoolRequest is not found in the empty JSON string", UpdateInstancePoolRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateInstancePoolRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateInstancePoolRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("anti-affinity-groups") != null && !jsonObj.get("anti-affinity-groups").isJsonNull()) {
        JsonArray jsonArrayantiAffinityGroups = jsonObj.getAsJsonArray("anti-affinity-groups");
        if (jsonArrayantiAffinityGroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("anti-affinity-groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `anti-affinity-groups` to be an array in the JSON string but got `%s`", jsonObj.get("anti-affinity-groups").toString()));
          }

          // validate the optional field `anti-affinity-groups` (array)
          for (int i = 0; i < jsonArrayantiAffinityGroups.size(); i++) {
            AntiAffinityGroup.validateJsonElement(jsonArrayantiAffinityGroups.get(i));
          };
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `public-ip-assignment`
      if (jsonObj.get("public-ip-assignment") != null && !jsonObj.get("public-ip-assignment").isJsonNull()) {
        PublicIpAssignment.validateJsonElement(jsonObj.get("public-ip-assignment"));
      }
      if (jsonObj.get("security-groups") != null && !jsonObj.get("security-groups").isJsonNull()) {
        JsonArray jsonArraysecurityGroups = jsonObj.getAsJsonArray("security-groups");
        if (jsonArraysecurityGroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("security-groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `security-groups` to be an array in the JSON string but got `%s`", jsonObj.get("security-groups").toString()));
          }

          // validate the optional field `security-groups` (array)
          for (int i = 0; i < jsonArraysecurityGroups.size(); i++) {
            SecurityGroup.validateJsonElement(jsonArraysecurityGroups.get(i));
          };
        }
      }
      if (jsonObj.get("elastic-ips") != null && !jsonObj.get("elastic-ips").isJsonNull()) {
        JsonArray jsonArrayelasticIps = jsonObj.getAsJsonArray("elastic-ips");
        if (jsonArrayelasticIps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("elastic-ips").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `elastic-ips` to be an array in the JSON string but got `%s`", jsonObj.get("elastic-ips").toString()));
          }

          // validate the optional field `elastic-ips` (array)
          for (int i = 0; i < jsonArrayelasticIps.size(); i++) {
            ElasticIp.validateJsonElement(jsonArrayelasticIps.get(i));
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `instance-type`
      if (jsonObj.get("instance-type") != null && !jsonObj.get("instance-type").isJsonNull()) {
        InstanceType.validateJsonElement(jsonObj.get("instance-type"));
      }
      if (jsonObj.get("private-networks") != null && !jsonObj.get("private-networks").isJsonNull()) {
        JsonArray jsonArrayprivateNetworks = jsonObj.getAsJsonArray("private-networks");
        if (jsonArrayprivateNetworks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("private-networks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `private-networks` to be an array in the JSON string but got `%s`", jsonObj.get("private-networks").toString()));
          }

          // validate the optional field `private-networks` (array)
          for (int i = 0; i < jsonArrayprivateNetworks.size(); i++) {
            PrivateNetwork.validateJsonElement(jsonArrayprivateNetworks.get(i));
          };
        }
      }
      // validate the optional field `template`
      if (jsonObj.get("template") != null && !jsonObj.get("template").isJsonNull()) {
        Template.validateJsonElement(jsonObj.get("template"));
      }
      // validate the optional field `ssh-key`
      if (jsonObj.get("ssh-key") != null && !jsonObj.get("ssh-key").isJsonNull()) {
        SshKey.validateJsonElement(jsonObj.get("ssh-key"));
      }
      if ((jsonObj.get("instance-prefix") != null && !jsonObj.get("instance-prefix").isJsonNull()) && !jsonObj.get("instance-prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instance-prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instance-prefix").toString()));
      }
      if ((jsonObj.get("user-data") != null && !jsonObj.get("user-data").isJsonNull()) && !jsonObj.get("user-data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user-data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user-data").toString()));
      }
      // validate the optional field `deploy-target`
      if (jsonObj.get("deploy-target") != null && !jsonObj.get("deploy-target").isJsonNull()) {
        DeployTarget.validateJsonElement(jsonObj.get("deploy-target"));
      }
      if (jsonObj.get("ssh-keys") != null && !jsonObj.get("ssh-keys").isJsonNull()) {
        JsonArray jsonArraysshKeys = jsonObj.getAsJsonArray("ssh-keys");
        if (jsonArraysshKeys != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ssh-keys").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ssh-keys` to be an array in the JSON string but got `%s`", jsonObj.get("ssh-keys").toString()));
          }

          // validate the optional field `ssh-keys` (array)
          for (int i = 0; i < jsonArraysshKeys.size(); i++) {
            SshKey.validateJsonElement(jsonArraysshKeys.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateInstancePoolRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateInstancePoolRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateInstancePoolRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateInstancePoolRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateInstancePoolRequest>() {
           @Override
           public void write(JsonWriter out, UpdateInstancePoolRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateInstancePoolRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateInstancePoolRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateInstancePoolRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateInstancePoolRequest
  */
  public static UpdateInstancePoolRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateInstancePoolRequest.class);
  }

 /**
  * Convert an instance of UpdateInstancePoolRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

