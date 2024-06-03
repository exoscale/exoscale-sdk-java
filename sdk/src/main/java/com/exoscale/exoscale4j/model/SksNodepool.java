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
import com.exoscale.exoscale4j.model.InstancePool;
import com.exoscale.exoscale4j.model.InstanceType;
import com.exoscale.exoscale4j.model.KubeletImageGc;
import com.exoscale.exoscale4j.model.PrivateNetwork;
import com.exoscale.exoscale4j.model.SecurityGroup;
import com.exoscale.exoscale4j.model.SksNodepoolTaint;
import com.exoscale.exoscale4j.model.Template;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SKS Nodepool
 */
@JsonPropertyOrder({
  SksNodepool.JSON_PROPERTY_ANTI_AFFINITY_GROUPS,
  SksNodepool.JSON_PROPERTY_DESCRIPTION,
  SksNodepool.JSON_PROPERTY_LABELS,
  SksNodepool.JSON_PROPERTY_TAINTS,
  SksNodepool.JSON_PROPERTY_SECURITY_GROUPS,
  SksNodepool.JSON_PROPERTY_NAME,
  SksNodepool.JSON_PROPERTY_INSTANCE_TYPE,
  SksNodepool.JSON_PROPERTY_PRIVATE_NETWORKS,
  SksNodepool.JSON_PROPERTY_TEMPLATE,
  SksNodepool.JSON_PROPERTY_STATE,
  SksNodepool.JSON_PROPERTY_SIZE,
  SksNodepool.JSON_PROPERTY_KUBELET_IMAGE_GC,
  SksNodepool.JSON_PROPERTY_INSTANCE_POOL,
  SksNodepool.JSON_PROPERTY_INSTANCE_PREFIX,
  SksNodepool.JSON_PROPERTY_DEPLOY_TARGET,
  SksNodepool.JSON_PROPERTY_ADDONS,
  SksNodepool.JSON_PROPERTY_ID,
  SksNodepool.JSON_PROPERTY_DISK_SIZE,
  SksNodepool.JSON_PROPERTY_VERSION,
  SksNodepool.JSON_PROPERTY_CREATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-03T15:12:02.588416+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class SksNodepool {
  public static final String JSON_PROPERTY_ANTI_AFFINITY_GROUPS = "anti-affinity-groups";
  private List<AntiAffinityGroup> antiAffinityGroups;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private Map<String, String> labels = new HashMap<>();

  public static final String JSON_PROPERTY_TAINTS = "taints";
  private Map<String, SksNodepoolTaint> taints = new HashMap<>();

  public static final String JSON_PROPERTY_SECURITY_GROUPS = "security-groups";
  private List<SecurityGroup> securityGroups;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_INSTANCE_TYPE = "instance-type";
  private InstanceType instanceType;

  public static final String JSON_PROPERTY_PRIVATE_NETWORKS = "private-networks";
  private List<PrivateNetwork> privateNetworks;

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  private Template template;

  /**
   * Nodepool state
   */
  public enum StateEnum {
    RENEWING_TOKEN("renewing-token"),
    
    CREATING("creating"),
    
    DELETING("deleting"),
    
    RUNNING("running"),
    
    SCALING("scaling"),
    
    UPDATING("updating"),
    
    ERROR("error");

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

  public static final String JSON_PROPERTY_KUBELET_IMAGE_GC = "kubelet-image-gc";
  private KubeletImageGc kubeletImageGc;

  public static final String JSON_PROPERTY_INSTANCE_POOL = "instance-pool";
  private InstancePool instancePool;

  public static final String JSON_PROPERTY_INSTANCE_PREFIX = "instance-prefix";
  private String instancePrefix;

  public static final String JSON_PROPERTY_DEPLOY_TARGET = "deploy-target";
  private DeployTarget deployTarget;

  /**
   * Gets or Sets addons
   */
  public enum AddonsEnum {
    STORAGE_LVM("storage-lvm");

    private String value;

    AddonsEnum(String value) {
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
    public static AddonsEnum fromValue(String value) {
      for (AddonsEnum b : AddonsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ADDONS = "addons";
  private Set<AddonsEnum> addons;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_DISK_SIZE = "disk-size";
  private Long diskSize;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_CREATED_AT = "created-at";
  private OffsetDateTime createdAt;

  public SksNodepool() { 
  }

  @JsonCreator
  public SksNodepool(
    @JsonProperty(JSON_PROPERTY_STATE) StateEnum state, 
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_VERSION) String version, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt
  ) {
  this();
    this.state = state;
    this.id = id;
    this.version = version;
    this.createdAt = createdAt;
  }

  public SksNodepool antiAffinityGroups(List<AntiAffinityGroup> antiAffinityGroups) {
    this.antiAffinityGroups = antiAffinityGroups;
    return this;
  }

  public SksNodepool addAntiAffinityGroupsItem(AntiAffinityGroup antiAffinityGroupsItem) {
    if (this.antiAffinityGroups == null) {
      this.antiAffinityGroups = new ArrayList<>();
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

  public List<AntiAffinityGroup> getAntiAffinityGroups() {
    return antiAffinityGroups;
  }


  @JsonProperty(JSON_PROPERTY_ANTI_AFFINITY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAntiAffinityGroups(List<AntiAffinityGroup> antiAffinityGroups) {
    this.antiAffinityGroups = antiAffinityGroups;
  }


  public SksNodepool description(String description) {
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


  public SksNodepool labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public SksNodepool putLabelsItem(String key, String labelsItem) {
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


  public SksNodepool taints(Map<String, SksNodepoolTaint> taints) {
    this.taints = taints;
    return this;
  }

  public SksNodepool putTaintsItem(String key, SksNodepoolTaint taintsItem) {
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


  public SksNodepool securityGroups(List<SecurityGroup> securityGroups) {
    this.securityGroups = securityGroups;
    return this;
  }

  public SksNodepool addSecurityGroupsItem(SecurityGroup securityGroupsItem) {
    if (this.securityGroups == null) {
      this.securityGroups = new ArrayList<>();
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

  public List<SecurityGroup> getSecurityGroups() {
    return securityGroups;
  }


  @JsonProperty(JSON_PROPERTY_SECURITY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecurityGroups(List<SecurityGroup> securityGroups) {
    this.securityGroups = securityGroups;
  }


  public SksNodepool name(String name) {
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


  public SksNodepool instanceType(InstanceType instanceType) {
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


  public SksNodepool privateNetworks(List<PrivateNetwork> privateNetworks) {
    this.privateNetworks = privateNetworks;
    return this;
  }

  public SksNodepool addPrivateNetworksItem(PrivateNetwork privateNetworksItem) {
    if (this.privateNetworks == null) {
      this.privateNetworks = new ArrayList<>();
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

  public List<PrivateNetwork> getPrivateNetworks() {
    return privateNetworks;
  }


  @JsonProperty(JSON_PROPERTY_PRIVATE_NETWORKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivateNetworks(List<PrivateNetwork> privateNetworks) {
    this.privateNetworks = privateNetworks;
  }


  public SksNodepool template(Template template) {
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
   * Nodepool state
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StateEnum getState() {
    return state;
  }




  public SksNodepool size(Long size) {
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


  public SksNodepool kubeletImageGc(KubeletImageGc kubeletImageGc) {
    this.kubeletImageGc = kubeletImageGc;
    return this;
  }

   /**
   * Get kubeletImageGc
   * @return kubeletImageGc
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KUBELET_IMAGE_GC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KubeletImageGc getKubeletImageGc() {
    return kubeletImageGc;
  }


  @JsonProperty(JSON_PROPERTY_KUBELET_IMAGE_GC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKubeletImageGc(KubeletImageGc kubeletImageGc) {
    this.kubeletImageGc = kubeletImageGc;
  }


  public SksNodepool instancePool(InstancePool instancePool) {
    this.instancePool = instancePool;
    return this;
  }

   /**
   * Get instancePool
   * @return instancePool
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTANCE_POOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InstancePool getInstancePool() {
    return instancePool;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE_POOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstancePool(InstancePool instancePool) {
    this.instancePool = instancePool;
  }


  public SksNodepool instancePrefix(String instancePrefix) {
    this.instancePrefix = instancePrefix;
    return this;
  }

   /**
   * The instances created by the Nodepool will be prefixed with this value (default: pool)
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


  public SksNodepool deployTarget(DeployTarget deployTarget) {
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


  public SksNodepool addons(Set<AddonsEnum> addons) {
    this.addons = addons;
    return this;
  }

  public SksNodepool addAddonsItem(AddonsEnum addonsItem) {
    if (this.addons == null) {
      this.addons = new LinkedHashSet<>();
    }
    this.addons.add(addonsItem);
    return this;
  }

   /**
   * Nodepool addons
   * @return addons
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<AddonsEnum> getAddons() {
    return addons;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ADDONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddons(Set<AddonsEnum> addons) {
    this.addons = addons;
  }


   /**
   * Nodepool ID
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




  public SksNodepool diskSize(Long diskSize) {
    this.diskSize = diskSize;
    return this;
  }

   /**
   * Nodepool instances disk size in GiB
   * minimum: 20
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


   /**
   * Nodepool version
   * @return version
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }




   /**
   * Nodepool creation date
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




  /**
   * Return true if this sks-nodepool object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SksNodepool sksNodepool = (SksNodepool) o;
    return Objects.equals(this.antiAffinityGroups, sksNodepool.antiAffinityGroups) &&
        Objects.equals(this.description, sksNodepool.description) &&
        Objects.equals(this.labels, sksNodepool.labels) &&
        Objects.equals(this.taints, sksNodepool.taints) &&
        Objects.equals(this.securityGroups, sksNodepool.securityGroups) &&
        Objects.equals(this.name, sksNodepool.name) &&
        Objects.equals(this.instanceType, sksNodepool.instanceType) &&
        Objects.equals(this.privateNetworks, sksNodepool.privateNetworks) &&
        Objects.equals(this.template, sksNodepool.template) &&
        Objects.equals(this.state, sksNodepool.state) &&
        Objects.equals(this.size, sksNodepool.size) &&
        Objects.equals(this.kubeletImageGc, sksNodepool.kubeletImageGc) &&
        Objects.equals(this.instancePool, sksNodepool.instancePool) &&
        Objects.equals(this.instancePrefix, sksNodepool.instancePrefix) &&
        Objects.equals(this.deployTarget, sksNodepool.deployTarget) &&
        Objects.equals(this.addons, sksNodepool.addons) &&
        Objects.equals(this.id, sksNodepool.id) &&
        Objects.equals(this.diskSize, sksNodepool.diskSize) &&
        Objects.equals(this.version, sksNodepool.version) &&
        Objects.equals(this.createdAt, sksNodepool.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(antiAffinityGroups, description, labels, taints, securityGroups, name, instanceType, privateNetworks, template, state, size, kubeletImageGc, instancePool, instancePrefix, deployTarget, addons, id, diskSize, version, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SksNodepool {\n");
    sb.append("    antiAffinityGroups: ").append(toIndentedString(antiAffinityGroups)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    taints: ").append(toIndentedString(taints)).append("\n");
    sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    privateNetworks: ").append(toIndentedString(privateNetworks)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    kubeletImageGc: ").append(toIndentedString(kubeletImageGc)).append("\n");
    sb.append("    instancePool: ").append(toIndentedString(instancePool)).append("\n");
    sb.append("    instancePrefix: ").append(toIndentedString(instancePrefix)).append("\n");
    sb.append("    deployTarget: ").append(toIndentedString(deployTarget)).append("\n");
    sb.append("    addons: ").append(toIndentedString(addons)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    diskSize: ").append(toIndentedString(diskSize)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
      for (int i = 0; i < getSecurityGroups().size(); i++) {
        if (getSecurityGroups().get(i) != null) {
          joiner.add(getSecurityGroups().get(i).toUrlQueryString(String.format("%ssecurity-groups%s%s", prefix, suffix,
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

    // add `kubelet-image-gc` to the URL query string
    if (getKubeletImageGc() != null) {
      joiner.add(getKubeletImageGc().toUrlQueryString(prefix + "kubelet-image-gc" + suffix));
    }

    // add `instance-pool` to the URL query string
    if (getInstancePool() != null) {
      joiner.add(getInstancePool().toUrlQueryString(prefix + "instance-pool" + suffix));
    }

    // add `instance-prefix` to the URL query string
    if (getInstancePrefix() != null) {
      joiner.add(String.format("%sinstance-prefix%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInstancePrefix()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `deploy-target` to the URL query string
    if (getDeployTarget() != null) {
      joiner.add(getDeployTarget().toUrlQueryString(prefix + "deploy-target" + suffix));
    }

    // add `addons` to the URL query string
    if (getAddons() != null) {
      int i = 0;
      for (AddonsEnum _item : getAddons()) {
        joiner.add(String.format("%saddons%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(_item), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
      i++;
    }

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `disk-size` to the URL query string
    if (getDiskSize() != null) {
      joiner.add(String.format("%sdisk-size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDiskSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `created-at` to the URL query string
    if (getCreatedAt() != null) {
      joiner.add(String.format("%screated-at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

