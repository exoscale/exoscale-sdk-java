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
import com.exoscale.sdk.model.NodeDuressSettings;
import com.exoscale.sdk.model.SearchShardSettings;
import com.exoscale.sdk.model.SearchTaskSettings;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SearchBackpressureSettings
 */
@JsonPropertyOrder({
  SearchBackpressureSettings.JSON_PROPERTY_MODE,
  SearchBackpressureSettings.JSON_PROPERTY_NODE_DURESS,
  SearchBackpressureSettings.JSON_PROPERTY_SEARCH_SHARD_TASK,
  SearchBackpressureSettings.JSON_PROPERTY_SEARCH_TASK
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class SearchBackpressureSettings {
  /**
   * The search backpressure mode. Valid values are monitor_only, enforced, or disabled. Default is monitor_only
   */
  public enum ModeEnum {
    MONITOR_ONLY("monitor_only"),
    
    ENFORCED("enforced"),
    
    DISABLED("disabled");

    private String value;

    ModeEnum(String value) {
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
    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MODE = "mode";
  private ModeEnum mode;

  public static final String JSON_PROPERTY_NODE_DURESS = "node_duress";
  private NodeDuressSettings nodeDuress;

  public static final String JSON_PROPERTY_SEARCH_SHARD_TASK = "search_shard_task";
  private SearchShardSettings searchShardTask;

  public static final String JSON_PROPERTY_SEARCH_TASK = "search_task";
  private SearchTaskSettings searchTask;

  public SearchBackpressureSettings() { 
  }

  public SearchBackpressureSettings mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

   /**
   * The search backpressure mode. Valid values are monitor_only, enforced, or disabled. Default is monitor_only
   * @return mode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ModeEnum getMode() {
    return mode;
  }


  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }


  public SearchBackpressureSettings nodeDuress(NodeDuressSettings nodeDuress) {
    this.nodeDuress = nodeDuress;
    return this;
  }

   /**
   * Get nodeDuress
   * @return nodeDuress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NODE_DURESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NodeDuressSettings getNodeDuress() {
    return nodeDuress;
  }


  @JsonProperty(JSON_PROPERTY_NODE_DURESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNodeDuress(NodeDuressSettings nodeDuress) {
    this.nodeDuress = nodeDuress;
  }


  public SearchBackpressureSettings searchShardTask(SearchShardSettings searchShardTask) {
    this.searchShardTask = searchShardTask;
    return this;
  }

   /**
   * Get searchShardTask
   * @return searchShardTask
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH_SHARD_TASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SearchShardSettings getSearchShardTask() {
    return searchShardTask;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_SHARD_TASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchShardTask(SearchShardSettings searchShardTask) {
    this.searchShardTask = searchShardTask;
  }


  public SearchBackpressureSettings searchTask(SearchTaskSettings searchTask) {
    this.searchTask = searchTask;
    return this;
  }

   /**
   * Get searchTask
   * @return searchTask
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH_TASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SearchTaskSettings getSearchTask() {
    return searchTask;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_TASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchTask(SearchTaskSettings searchTask) {
    this.searchTask = searchTask;
  }


  /**
   * Return true if this Search_Backpressure_Settings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchBackpressureSettings searchBackpressureSettings = (SearchBackpressureSettings) o;
    return Objects.equals(this.mode, searchBackpressureSettings.mode) &&
        Objects.equals(this.nodeDuress, searchBackpressureSettings.nodeDuress) &&
        Objects.equals(this.searchShardTask, searchBackpressureSettings.searchShardTask) &&
        Objects.equals(this.searchTask, searchBackpressureSettings.searchTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, nodeDuress, searchShardTask, searchTask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchBackpressureSettings {\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    nodeDuress: ").append(toIndentedString(nodeDuress)).append("\n");
    sb.append("    searchShardTask: ").append(toIndentedString(searchShardTask)).append("\n");
    sb.append("    searchTask: ").append(toIndentedString(searchTask)).append("\n");
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

    // add `mode` to the URL query string
    if (getMode() != null) {
      joiner.add(String.format("%smode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `node_duress` to the URL query string
    if (getNodeDuress() != null) {
      joiner.add(getNodeDuress().toUrlQueryString(prefix + "node_duress" + suffix));
    }

    // add `search_shard_task` to the URL query string
    if (getSearchShardTask() != null) {
      joiner.add(getSearchShardTask().toUrlQueryString(prefix + "search_shard_task" + suffix));
    }

    // add `search_task` to the URL query string
    if (getSearchTask() != null) {
      joiner.add(getSearchTask().toUrlQueryString(prefix + "search_task" + suffix));
    }

    return joiner.toString();
  }
}

