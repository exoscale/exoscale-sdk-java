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
import com.exoscale.exoscale4j.model.SksOidc;
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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateSksClusterRequest
 */
@JsonPropertyOrder({
  CreateSksClusterRequest.JSON_PROPERTY_DESCRIPTION,
  CreateSksClusterRequest.JSON_PROPERTY_LABELS,
  CreateSksClusterRequest.JSON_PROPERTY_CNI,
  CreateSksClusterRequest.JSON_PROPERTY_AUTO_UPGRADE,
  CreateSksClusterRequest.JSON_PROPERTY_OIDC,
  CreateSksClusterRequest.JSON_PROPERTY_NAME,
  CreateSksClusterRequest.JSON_PROPERTY_LEVEL,
  CreateSksClusterRequest.JSON_PROPERTY_ADDONS,
  CreateSksClusterRequest.JSON_PROPERTY_VERSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T19:17:33.820745+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class CreateSksClusterRequest {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

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

  public static final String JSON_PROPERTY_OIDC = "oidc";
  private SksOidc oidc;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * Cluster service level
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

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public CreateSksClusterRequest() { 
  }

  public CreateSksClusterRequest description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

   /**
   * Cluster description
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public CreateSksClusterRequest labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public CreateSksClusterRequest putLabelsItem(String key, String labelsItem) {
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


  public CreateSksClusterRequest cni(CniEnum cni) {
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


  public CreateSksClusterRequest autoUpgrade(Boolean autoUpgrade) {
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


  public CreateSksClusterRequest oidc(SksOidc oidc) {
    this.oidc = oidc;
    return this;
  }

   /**
   * Get oidc
   * @return oidc
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OIDC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SksOidc getOidc() {
    return oidc;
  }


  @JsonProperty(JSON_PROPERTY_OIDC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOidc(SksOidc oidc) {
    this.oidc = oidc;
  }


  public CreateSksClusterRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Cluster name
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


  public CreateSksClusterRequest level(LevelEnum level) {
    this.level = level;
    return this;
  }

   /**
   * Cluster service level
   * @return level
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LevelEnum getLevel() {
    return level;
  }


  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLevel(LevelEnum level) {
    this.level = level;
  }


  public CreateSksClusterRequest addons(Set<AddonsEnum> addons) {
    this.addons = addons;
    return this;
  }

  public CreateSksClusterRequest addAddonsItem(AddonsEnum addonsItem) {
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


  public CreateSksClusterRequest version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Control plane Kubernetes version
   * @return version
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   * Return true if this create_sks_cluster_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSksClusterRequest createSksClusterRequest = (CreateSksClusterRequest) o;
    return equalsNullable(this.description, createSksClusterRequest.description) &&
        Objects.equals(this.labels, createSksClusterRequest.labels) &&
        Objects.equals(this.cni, createSksClusterRequest.cni) &&
        Objects.equals(this.autoUpgrade, createSksClusterRequest.autoUpgrade) &&
        Objects.equals(this.oidc, createSksClusterRequest.oidc) &&
        Objects.equals(this.name, createSksClusterRequest.name) &&
        Objects.equals(this.level, createSksClusterRequest.level) &&
        Objects.equals(this.addons, createSksClusterRequest.addons) &&
        Objects.equals(this.version, createSksClusterRequest.version);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(description), labels, cni, autoUpgrade, oidc, name, level, addons, version);
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
    sb.append("class CreateSksClusterRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    cni: ").append(toIndentedString(cni)).append("\n");
    sb.append("    autoUpgrade: ").append(toIndentedString(autoUpgrade)).append("\n");
    sb.append("    oidc: ").append(toIndentedString(oidc)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    addons: ").append(toIndentedString(addons)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

    // add `oidc` to the URL query string
    if (getOidc() != null) {
      joiner.add(getOidc().toUrlQueryString(prefix + "oidc" + suffix));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

