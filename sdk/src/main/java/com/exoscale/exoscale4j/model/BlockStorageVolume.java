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
import com.exoscale.exoscale4j.model.BlockStorageSnapshotTarget;
import com.exoscale.exoscale4j.model.InstanceTarget;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Block storage volume
 */
@JsonPropertyOrder({
  BlockStorageVolume.JSON_PROPERTY_LABELS,
  BlockStorageVolume.JSON_PROPERTY_INSTANCE,
  BlockStorageVolume.JSON_PROPERTY_NAME,
  BlockStorageVolume.JSON_PROPERTY_STATE,
  BlockStorageVolume.JSON_PROPERTY_SIZE,
  BlockStorageVolume.JSON_PROPERTY_BLOCKSIZE,
  BlockStorageVolume.JSON_PROPERTY_BLOCK_STORAGE_SNAPSHOTS,
  BlockStorageVolume.JSON_PROPERTY_ID,
  BlockStorageVolume.JSON_PROPERTY_CREATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-03T15:12:02.588416+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class BlockStorageVolume {
  public static final String JSON_PROPERTY_LABELS = "labels";
  private Map<String, String> labels = new HashMap<>();

  public static final String JSON_PROPERTY_INSTANCE = "instance";
  private InstanceTarget instance;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * Volume state
   */
  public enum StateEnum {
    SNAPSHOTTING("snapshotting"),
    
    DELETED("deleted"),
    
    CREATING("creating"),
    
    DETACHED("detached"),
    
    DELETING("deleting"),
    
    ATTACHING("attaching"),
    
    ERROR("error"),
    
    ATTACHED("attached"),
    
    DETACHING("detaching");

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

  public static final String JSON_PROPERTY_BLOCKSIZE = "blocksize";
  private Long blocksize;

  public static final String JSON_PROPERTY_BLOCK_STORAGE_SNAPSHOTS = "block-storage-snapshots";
  private List<BlockStorageSnapshotTarget> blockStorageSnapshots;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_CREATED_AT = "created-at";
  private OffsetDateTime createdAt;

  public BlockStorageVolume() { 
  }

  @JsonCreator
  public BlockStorageVolume(
    @JsonProperty(JSON_PROPERTY_STATE) StateEnum state, 
    @JsonProperty(JSON_PROPERTY_BLOCKSIZE) Long blocksize, 
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt
  ) {
  this();
    this.state = state;
    this.blocksize = blocksize;
    this.id = id;
    this.createdAt = createdAt;
  }

  public BlockStorageVolume labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public BlockStorageVolume putLabelsItem(String key, String labelsItem) {
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


  public BlockStorageVolume instance(InstanceTarget instance) {
    this.instance = instance;
    return this;
  }

   /**
   * Get instance
   * @return instance
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InstanceTarget getInstance() {
    return instance;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstance(InstanceTarget instance) {
    this.instance = instance;
  }


  public BlockStorageVolume name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Volume name
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
   * Volume state
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StateEnum getState() {
    return state;
  }




  public BlockStorageVolume size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Volume size
   * minimum: 10
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


   /**
   * Volume block size
   * minimum: 0
   * @return blocksize
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCKSIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBlocksize() {
    return blocksize;
  }




  public BlockStorageVolume blockStorageSnapshots(List<BlockStorageSnapshotTarget> blockStorageSnapshots) {
    this.blockStorageSnapshots = blockStorageSnapshots;
    return this;
  }

  public BlockStorageVolume addBlockStorageSnapshotsItem(BlockStorageSnapshotTarget blockStorageSnapshotsItem) {
    if (this.blockStorageSnapshots == null) {
      this.blockStorageSnapshots = new ArrayList<>();
    }
    this.blockStorageSnapshots.add(blockStorageSnapshotsItem);
    return this;
  }

   /**
   * Volume snapshots, if any
   * @return blockStorageSnapshots
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCK_STORAGE_SNAPSHOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BlockStorageSnapshotTarget> getBlockStorageSnapshots() {
    return blockStorageSnapshots;
  }


  @JsonProperty(JSON_PROPERTY_BLOCK_STORAGE_SNAPSHOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlockStorageSnapshots(List<BlockStorageSnapshotTarget> blockStorageSnapshots) {
    this.blockStorageSnapshots = blockStorageSnapshots;
  }


   /**
   * Volume ID
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




   /**
   * Volume creation date
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




  /**
   * Return true if this block-storage-volume object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockStorageVolume blockStorageVolume = (BlockStorageVolume) o;
    return Objects.equals(this.labels, blockStorageVolume.labels) &&
        Objects.equals(this.instance, blockStorageVolume.instance) &&
        Objects.equals(this.name, blockStorageVolume.name) &&
        Objects.equals(this.state, blockStorageVolume.state) &&
        Objects.equals(this.size, blockStorageVolume.size) &&
        Objects.equals(this.blocksize, blockStorageVolume.blocksize) &&
        Objects.equals(this.blockStorageSnapshots, blockStorageVolume.blockStorageSnapshots) &&
        Objects.equals(this.id, blockStorageVolume.id) &&
        Objects.equals(this.createdAt, blockStorageVolume.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, instance, name, state, size, blocksize, blockStorageSnapshots, id, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockStorageVolume {\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    blocksize: ").append(toIndentedString(blocksize)).append("\n");
    sb.append("    blockStorageSnapshots: ").append(toIndentedString(blockStorageSnapshots)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

    // add `labels` to the URL query string
    if (getLabels() != null) {
      for (String _key : getLabels().keySet()) {
        joiner.add(String.format("%slabels%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getLabels().get(_key), URLEncoder.encode(String.valueOf(getLabels().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `instance` to the URL query string
    if (getInstance() != null) {
      joiner.add(getInstance().toUrlQueryString(prefix + "instance" + suffix));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `state` to the URL query string
    if (getState() != null) {
      joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `size` to the URL query string
    if (getSize() != null) {
      joiner.add(String.format("%ssize%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `blocksize` to the URL query string
    if (getBlocksize() != null) {
      joiner.add(String.format("%sblocksize%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBlocksize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `block-storage-snapshots` to the URL query string
    if (getBlockStorageSnapshots() != null) {
      for (int i = 0; i < getBlockStorageSnapshots().size(); i++) {
        if (getBlockStorageSnapshots().get(i) != null) {
          joiner.add(getBlockStorageSnapshots().get(i).toUrlQueryString(String.format("%sblock-storage-snapshots%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `created-at` to the URL query string
    if (getCreatedAt() != null) {
      joiner.add(String.format("%screated-at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

