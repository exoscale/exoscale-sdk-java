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
import com.exoscale.exoscale4j.model.BlockStorageSnapshot;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ListBlockStorageSnapshots200Response
 */
@JsonPropertyOrder({
  ListBlockStorageSnapshots200Response.JSON_PROPERTY_BLOCK_STORAGE_SNAPSHOTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-03T20:04:17.479783+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class ListBlockStorageSnapshots200Response {
  public static final String JSON_PROPERTY_BLOCK_STORAGE_SNAPSHOTS = "block-storage-snapshots";
  private List<BlockStorageSnapshot> blockStorageSnapshots;

  public ListBlockStorageSnapshots200Response() { 
  }

  public ListBlockStorageSnapshots200Response blockStorageSnapshots(List<BlockStorageSnapshot> blockStorageSnapshots) {
    this.blockStorageSnapshots = blockStorageSnapshots;
    return this;
  }

  public ListBlockStorageSnapshots200Response addBlockStorageSnapshotsItem(BlockStorageSnapshot blockStorageSnapshotsItem) {
    if (this.blockStorageSnapshots == null) {
      this.blockStorageSnapshots = new ArrayList<>();
    }
    this.blockStorageSnapshots.add(blockStorageSnapshotsItem);
    return this;
  }

   /**
   * Get blockStorageSnapshots
   * @return blockStorageSnapshots
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCK_STORAGE_SNAPSHOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BlockStorageSnapshot> getBlockStorageSnapshots() {
    return blockStorageSnapshots;
  }


  @JsonProperty(JSON_PROPERTY_BLOCK_STORAGE_SNAPSHOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlockStorageSnapshots(List<BlockStorageSnapshot> blockStorageSnapshots) {
    this.blockStorageSnapshots = blockStorageSnapshots;
  }


  /**
   * Return true if this list_block_storage_snapshots_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListBlockStorageSnapshots200Response listBlockStorageSnapshots200Response = (ListBlockStorageSnapshots200Response) o;
    return Objects.equals(this.blockStorageSnapshots, listBlockStorageSnapshots200Response.blockStorageSnapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockStorageSnapshots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBlockStorageSnapshots200Response {\n");
    sb.append("    blockStorageSnapshots: ").append(toIndentedString(blockStorageSnapshots)).append("\n");
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

    // add `block-storage-snapshots` to the URL query string
    if (getBlockStorageSnapshots() != null) {
      for (int i = 0; i < getBlockStorageSnapshots().size(); i++) {
        if (getBlockStorageSnapshots().get(i) != null) {
          joiner.add(getBlockStorageSnapshots().get(i).toUrlQueryString(String.format("%sblock-storage-snapshots%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

