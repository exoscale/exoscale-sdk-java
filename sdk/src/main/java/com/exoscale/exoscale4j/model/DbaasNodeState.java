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
import com.exoscale.exoscale4j.model.DbaasNodeStateProgressUpdate;
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
 * Automatic maintenance settings
 */
@JsonPropertyOrder({
  DbaasNodeState.JSON_PROPERTY_NAME,
  DbaasNodeState.JSON_PROPERTY_PROGRESS_UPDATES,
  DbaasNodeState.JSON_PROPERTY_ROLE,
  DbaasNodeState.JSON_PROPERTY_STATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-07T11:18:35.752314Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DbaasNodeState {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROGRESS_UPDATES = "progress-updates";
  private List<DbaasNodeStateProgressUpdate> progressUpdates;

  /**
   * Role of this node. Only returned for a subset of service types
   */
  public enum RoleEnum {
    STANDBY("standby"),
    
    MASTER("master"),
    
    READ_REPLICA("read-replica");

    private String value;

    RoleEnum(String value) {
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
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ROLE = "role";
  private RoleEnum role;

  /**
   * Current state of the service node
   */
  public enum StateEnum {
    LEAVING("leaving"),
    
    RUNNING("running"),
    
    SYNCING_DATA("syncing_data"),
    
    SETTING_UP_VM("setting_up_vm"),
    
    UNKNOWN("unknown");

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

  public DbaasNodeState() { 
  }

  public DbaasNodeState name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the service node
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


  public DbaasNodeState progressUpdates(List<DbaasNodeStateProgressUpdate> progressUpdates) {
    this.progressUpdates = progressUpdates;
    return this;
  }

  public DbaasNodeState addProgressUpdatesItem(DbaasNodeStateProgressUpdate progressUpdatesItem) {
    if (this.progressUpdates == null) {
      this.progressUpdates = new ArrayList<>();
    }
    this.progressUpdates.add(progressUpdatesItem);
    return this;
  }

   /**
   * Extra information regarding the progress for current state
   * @return progressUpdates
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROGRESS_UPDATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DbaasNodeStateProgressUpdate> getProgressUpdates() {
    return progressUpdates;
  }


  @JsonProperty(JSON_PROPERTY_PROGRESS_UPDATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProgressUpdates(List<DbaasNodeStateProgressUpdate> progressUpdates) {
    this.progressUpdates = progressUpdates;
  }


  public DbaasNodeState role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * Role of this node. Only returned for a subset of service types
   * @return role
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoleEnum getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRole(RoleEnum role) {
    this.role = role;
  }


  public DbaasNodeState state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Current state of the service node
   * @return state
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StateEnum getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * Return true if this dbaas-node-state object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasNodeState dbaasNodeState = (DbaasNodeState) o;
    return Objects.equals(this.name, dbaasNodeState.name) &&
        Objects.equals(this.progressUpdates, dbaasNodeState.progressUpdates) &&
        Objects.equals(this.role, dbaasNodeState.role) &&
        Objects.equals(this.state, dbaasNodeState.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, progressUpdates, role, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasNodeState {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    progressUpdates: ").append(toIndentedString(progressUpdates)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

    // add `progress-updates` to the URL query string
    if (getProgressUpdates() != null) {
      for (int i = 0; i < getProgressUpdates().size(); i++) {
        if (getProgressUpdates().get(i) != null) {
          joiner.add(getProgressUpdates().get(i).toUrlQueryString(String.format("%sprogress-updates%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `role` to the URL query string
    if (getRole() != null) {
      joiner.add(String.format("%srole%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRole()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `state` to the URL query string
    if (getState() != null) {
      joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

