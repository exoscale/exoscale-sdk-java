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
import com.exoscale.sdk.model.BlockStorageSnapshotTarget;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateBlockStorageVolumeRequest
 */
@JsonPropertyOrder({
  CreateBlockStorageVolumeRequest.JSON_PROPERTY_NAME,
  CreateBlockStorageVolumeRequest.JSON_PROPERTY_SIZE,
  CreateBlockStorageVolumeRequest.JSON_PROPERTY_LABELS,
  CreateBlockStorageVolumeRequest.JSON_PROPERTY_BLOCK_STORAGE_SNAPSHOT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CreateBlockStorageVolumeRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private Map<String, String> labels = new HashMap<>();

  public static final String JSON_PROPERTY_BLOCK_STORAGE_SNAPSHOT = "block-storage-snapshot";
  private BlockStorageSnapshotTarget blockStorageSnapshot;

  public CreateBlockStorageVolumeRequest() { 
  }

  public CreateBlockStorageVolumeRequest name(String name) {
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


  public CreateBlockStorageVolumeRequest size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Volume size in GiB.                             When a snapshot ID is supplied, this defaults to the size of the source volume, but can be set to a larger value.
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


  public CreateBlockStorageVolumeRequest labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public CreateBlockStorageVolumeRequest putLabelsItem(String key, String labelsItem) {
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


  public CreateBlockStorageVolumeRequest blockStorageSnapshot(BlockStorageSnapshotTarget blockStorageSnapshot) {
    this.blockStorageSnapshot = blockStorageSnapshot;
    return this;
  }

   /**
   * Get blockStorageSnapshot
   * @return blockStorageSnapshot
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCK_STORAGE_SNAPSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BlockStorageSnapshotTarget getBlockStorageSnapshot() {
    return blockStorageSnapshot;
  }


  @JsonProperty(JSON_PROPERTY_BLOCK_STORAGE_SNAPSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlockStorageSnapshot(BlockStorageSnapshotTarget blockStorageSnapshot) {
    this.blockStorageSnapshot = blockStorageSnapshot;
  }


  /**
   * Return true if this create_block_storage_volume_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBlockStorageVolumeRequest createBlockStorageVolumeRequest = (CreateBlockStorageVolumeRequest) o;
    return Objects.equals(this.name, createBlockStorageVolumeRequest.name) &&
        Objects.equals(this.size, createBlockStorageVolumeRequest.size) &&
        Objects.equals(this.labels, createBlockStorageVolumeRequest.labels) &&
        Objects.equals(this.blockStorageSnapshot, createBlockStorageVolumeRequest.blockStorageSnapshot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, size, labels, blockStorageSnapshot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBlockStorageVolumeRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    blockStorageSnapshot: ").append(toIndentedString(blockStorageSnapshot)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `size` to the URL query string
    if (getSize() != null) {
      joiner.add(String.format("%ssize%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `labels` to the URL query string
    if (getLabels() != null) {
      for (String _key : getLabels().keySet()) {
        joiner.add(String.format("%slabels%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getLabels().get(_key), URLEncoder.encode(String.valueOf(getLabels().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `block-storage-snapshot` to the URL query string
    if (getBlockStorageSnapshot() != null) {
      joiner.add(getBlockStorageSnapshot().toUrlQueryString(prefix + "block-storage-snapshot" + suffix));
    }

    return joiner.toString();
  }
}
