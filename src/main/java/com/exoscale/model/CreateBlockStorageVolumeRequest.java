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


package com.exoscale.model;

import java.util.Objects;
import java.util.Arrays;
import com.exoscale.model.BlockStorageSnapshotTarget;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreateBlockStorageVolumeRequest
 */
@JsonPropertyOrder({
  CreateBlockStorageVolumeRequest.JSON_PROPERTY_NAME,
  CreateBlockStorageVolumeRequest.JSON_PROPERTY_SIZE,
  CreateBlockStorageVolumeRequest.JSON_PROPERTY_LABELS,
  CreateBlockStorageVolumeRequest.JSON_PROPERTY_BLOCK_STORAGE_SNAPSHOT
})
@JsonTypeName("create_block_storage_volume_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T16:37:05.548288+01:00[Europe/Vienna]")
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
   * Volume size in GB.                             When a snapshot ID is supplied, this defaults to the size of the source volume, but can be set to a larger value.
   * minimum: 10
   * maximum: 10240
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

}

