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
import com.exoscale.sdk.model.BlockStorageVolumeTarget;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Block storage snapshot
 */
@JsonPropertyOrder({
  BlockStorageSnapshot.JSON_PROPERTY_ID,
  BlockStorageSnapshot.JSON_PROPERTY_NAME,
  BlockStorageSnapshot.JSON_PROPERTY_SIZE,
  BlockStorageSnapshot.JSON_PROPERTY_VOLUME_SIZE,
  BlockStorageSnapshot.JSON_PROPERTY_CREATED_AT,
  BlockStorageSnapshot.JSON_PROPERTY_STATE,
  BlockStorageSnapshot.JSON_PROPERTY_LABELS,
  BlockStorageSnapshot.JSON_PROPERTY_BLOCK_STORAGE_VOLUME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class BlockStorageSnapshot {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_VOLUME_SIZE = "volume-size";
  private Long volumeSize;

  public static final String JSON_PROPERTY_CREATED_AT = "created-at";
  private OffsetDateTime createdAt;

  /**
   * Snapshot state
   */
  public enum StateEnum {
    PARTIALLY_DESTROYED("partially-destroyed"),
    
    DESTROYING("destroying"),
    
    CREATING("creating"),
    
    CREATED("created"),
    
    PROMOTING("promoting"),
    
    ERROR("error"),
    
    DESTROYED("destroyed"),
    
    ALLOCATED("allocated");

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

  public static final String JSON_PROPERTY_LABELS = "labels";
  private Map<String, String> labels = new HashMap<>();

  public static final String JSON_PROPERTY_BLOCK_STORAGE_VOLUME = "block-storage-volume";
  private BlockStorageVolumeTarget blockStorageVolume;

  public BlockStorageSnapshot() { 
  }

  @JsonCreator
  public BlockStorageSnapshot(
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt, 
    @JsonProperty(JSON_PROPERTY_STATE) StateEnum state
  ) {
  this();
    this.id = id;
    this.createdAt = createdAt;
    this.state = state;
  }

   /**
   * Snapshot ID
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




  public BlockStorageSnapshot name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Snapshot name
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


  public BlockStorageSnapshot size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Snapshot size
   * minimum: 1
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


  public BlockStorageSnapshot volumeSize(Long volumeSize) {
    this.volumeSize = volumeSize;
    return this;
  }

   /**
   * Original Volume size
   * minimum: 0
   * @return volumeSize
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VOLUME_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getVolumeSize() {
    return volumeSize;
  }


  @JsonProperty(JSON_PROPERTY_VOLUME_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolumeSize(Long volumeSize) {
    this.volumeSize = volumeSize;
  }


   /**
   * Snapshot creation date
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * Snapshot state
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StateEnum getState() {
    return state;
  }




  public BlockStorageSnapshot labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public BlockStorageSnapshot putLabelsItem(String key, String labelsItem) {
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


  public BlockStorageSnapshot blockStorageVolume(BlockStorageVolumeTarget blockStorageVolume) {
    this.blockStorageVolume = blockStorageVolume;
    return this;
  }

   /**
   * Get blockStorageVolume
   * @return blockStorageVolume
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCK_STORAGE_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BlockStorageVolumeTarget getBlockStorageVolume() {
    return blockStorageVolume;
  }


  @JsonProperty(JSON_PROPERTY_BLOCK_STORAGE_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlockStorageVolume(BlockStorageVolumeTarget blockStorageVolume) {
    this.blockStorageVolume = blockStorageVolume;
  }


  /**
   * Return true if this block-storage-snapshot object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockStorageSnapshot blockStorageSnapshot = (BlockStorageSnapshot) o;
    return Objects.equals(this.id, blockStorageSnapshot.id) &&
        Objects.equals(this.name, blockStorageSnapshot.name) &&
        Objects.equals(this.size, blockStorageSnapshot.size) &&
        Objects.equals(this.volumeSize, blockStorageSnapshot.volumeSize) &&
        Objects.equals(this.createdAt, blockStorageSnapshot.createdAt) &&
        Objects.equals(this.state, blockStorageSnapshot.state) &&
        Objects.equals(this.labels, blockStorageSnapshot.labels) &&
        Objects.equals(this.blockStorageVolume, blockStorageSnapshot.blockStorageVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, size, volumeSize, createdAt, state, labels, blockStorageVolume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockStorageSnapshot {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    blockStorageVolume: ").append(toIndentedString(blockStorageVolume)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `size` to the URL query string
    if (getSize() != null) {
      joiner.add(String.format("%ssize%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `volume-size` to the URL query string
    if (getVolumeSize() != null) {
      joiner.add(String.format("%svolume-size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVolumeSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `created-at` to the URL query string
    if (getCreatedAt() != null) {
      joiner.add(String.format("%screated-at%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `state` to the URL query string
    if (getState() != null) {
      joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `labels` to the URL query string
    if (getLabels() != null) {
      for (String _key : getLabels().keySet()) {
        joiner.add(String.format("%slabels%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getLabels().get(_key), URLEncoder.encode(String.valueOf(getLabels().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `block-storage-volume` to the URL query string
    if (getBlockStorageVolume() != null) {
      joiner.add(getBlockStorageVolume().toUrlQueryString(prefix + "block-storage-volume" + suffix));
    }

    return joiner.toString();
  }
}

