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
import com.exoscale.exoscale4j.model.SksNodepool;
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
 * SKS Cluster
 */
@JsonPropertyOrder({
  SksCluster.JSON_PROPERTY_DESCRIPTION,
  SksCluster.JSON_PROPERTY_LABELS,
  SksCluster.JSON_PROPERTY_CNI,
  SksCluster.JSON_PROPERTY_AUTO_UPGRADE,
  SksCluster.JSON_PROPERTY_NAME,
  SksCluster.JSON_PROPERTY_STATE,
  SksCluster.JSON_PROPERTY_NODEPOOLS,
  SksCluster.JSON_PROPERTY_LEVEL,
  SksCluster.JSON_PROPERTY_ADDONS,
  SksCluster.JSON_PROPERTY_ID,
  SksCluster.JSON_PROPERTY_VERSION,
  SksCluster.JSON_PROPERTY_CREATED_AT,
  SksCluster.JSON_PROPERTY_ENDPOINT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T17:28:20.527227Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SksCluster {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private Map<String, String> labels = new HashMap<>();

  /**
   * Cluster CNI
   */
  public enum CniEnum {
    CALICO("calico"),
    
    CILIUM("cilium");

    private String value;

    CniEnum(String value) {
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
    public static CniEnum fromValue(String value) {
      for (CniEnum b : CniEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CNI = "cni";
  private CniEnum cni;

  public static final String JSON_PROPERTY_AUTO_UPGRADE = "auto-upgrade";
  private Boolean autoUpgrade;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * Cluster state
   */
  public enum StateEnum {
    ROTATING_CCM_CREDENTIALS("rotating-ccm-credentials"),
    
    CREATING("creating"),
    
    UPGRADING("upgrading"),
    
    DELETING("deleting"),
    
    RUNNING("running"),
    
    SUSPENDING("suspending"),
    
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

  public static final String JSON_PROPERTY_NODEPOOLS = "nodepools";
  private List<SksNodepool> nodepools;

  /**
   * Cluster level
   */
  public enum LevelEnum {
    STARTER("starter"),
    
    PRO("pro");

    private String value;

    LevelEnum(String value) {
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
    public static LevelEnum fromValue(String value) {
      for (LevelEnum b : LevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_LEVEL = "level";
  private LevelEnum level;

  /**
   * Gets or Sets addons
   */
  public enum AddonsEnum {
    EXOSCALE_CLOUD_CONTROLLER("exoscale-cloud-controller"),
    
    EXOSCALE_CONTAINER_STORAGE_INTERFACE("exoscale-container-storage-interface"),
    
    METRICS_SERVER("metrics-server");

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

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_CREATED_AT = "created-at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_ENDPOINT = "endpoint";
  private String endpoint;

  public SksCluster() { 
  }

  @JsonCreator
  public SksCluster(
    @JsonProperty(JSON_PROPERTY_STATE) StateEnum state, 
    @JsonProperty(JSON_PROPERTY_NODEPOOLS) List<SksNodepool> nodepools, 
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt, 
    @JsonProperty(JSON_PROPERTY_ENDPOINT) String endpoint
  ) {
  this();
    this.state = state;
    this.nodepools = nodepools;
    this.id = id;
    this.createdAt = createdAt;
    this.endpoint = endpoint;
  }

  public SksCluster description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Cluster description
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


  public SksCluster labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public SksCluster putLabelsItem(String key, String labelsItem) {
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


  public SksCluster cni(CniEnum cni) {
    this.cni = cni;
    return this;
  }

   /**
   * Cluster CNI
   * @return cni
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CNI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CniEnum getCni() {
    return cni;
  }


  @JsonProperty(JSON_PROPERTY_CNI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCni(CniEnum cni) {
    this.cni = cni;
  }


  public SksCluster autoUpgrade(Boolean autoUpgrade) {
    this.autoUpgrade = autoUpgrade;
    return this;
  }

   /**
   * Enable auto upgrade of the control plane to the latest patch version available
   * @return autoUpgrade
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_UPGRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoUpgrade() {
    return autoUpgrade;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_UPGRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoUpgrade(Boolean autoUpgrade) {
    this.autoUpgrade = autoUpgrade;
  }


  public SksCluster name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Cluster name
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


   /**
   * Cluster state
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StateEnum getState() {
    return state;
  }




   /**
   * Cluster Nodepools
   * @return nodepools
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NODEPOOLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SksNodepool> getNodepools() {
    return nodepools;
  }




  public SksCluster level(LevelEnum level) {
    this.level = level;
    return this;
  }

   /**
   * Cluster level
   * @return level
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LevelEnum getLevel() {
    return level;
  }


  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLevel(LevelEnum level) {
    this.level = level;
  }


  public SksCluster addons(Set<AddonsEnum> addons) {
    this.addons = addons;
    return this;
  }

  public SksCluster addAddonsItem(AddonsEnum addonsItem) {
    if (this.addons == null) {
      this.addons = new LinkedHashSet<>();
    }
    this.addons.add(addonsItem);
    return this;
  }

   /**
   * Cluster addons
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
   * Cluster ID
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




  public SksCluster version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Control plane Kubernetes version
   * @return version
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


   /**
   * Cluster creation date
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * Cluster endpoint
   * @return endpoint
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndpoint() {
    return endpoint;
  }




  /**
   * Return true if this sks-cluster object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SksCluster sksCluster = (SksCluster) o;
    return Objects.equals(this.description, sksCluster.description) &&
        Objects.equals(this.labels, sksCluster.labels) &&
        Objects.equals(this.cni, sksCluster.cni) &&
        Objects.equals(this.autoUpgrade, sksCluster.autoUpgrade) &&
        Objects.equals(this.name, sksCluster.name) &&
        Objects.equals(this.state, sksCluster.state) &&
        Objects.equals(this.nodepools, sksCluster.nodepools) &&
        Objects.equals(this.level, sksCluster.level) &&
        Objects.equals(this.addons, sksCluster.addons) &&
        Objects.equals(this.id, sksCluster.id) &&
        Objects.equals(this.version, sksCluster.version) &&
        Objects.equals(this.createdAt, sksCluster.createdAt) &&
        Objects.equals(this.endpoint, sksCluster.endpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, labels, cni, autoUpgrade, name, state, nodepools, level, addons, id, version, createdAt, endpoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SksCluster {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    cni: ").append(toIndentedString(cni)).append("\n");
    sb.append("    autoUpgrade: ").append(toIndentedString(autoUpgrade)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    nodepools: ").append(toIndentedString(nodepools)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    addons: ").append(toIndentedString(addons)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
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

    // add `cni` to the URL query string
    if (getCni() != null) {
      joiner.add(String.format("%scni%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCni()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `auto-upgrade` to the URL query string
    if (getAutoUpgrade() != null) {
      joiner.add(String.format("%sauto-upgrade%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAutoUpgrade()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `state` to the URL query string
    if (getState() != null) {
      joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `nodepools` to the URL query string
    if (getNodepools() != null) {
      for (int i = 0; i < getNodepools().size(); i++) {
        if (getNodepools().get(i) != null) {
          joiner.add(getNodepools().get(i).toUrlQueryString(String.format("%snodepools%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `level` to the URL query string
    if (getLevel() != null) {
      joiner.add(String.format("%slevel%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLevel()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `created-at` to the URL query string
    if (getCreatedAt() != null) {
      joiner.add(String.format("%screated-at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `endpoint` to the URL query string
    if (getEndpoint() != null) {
      joiner.add(String.format("%sendpoint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEndpoint()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

