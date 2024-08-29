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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Extra information regarding the progress for current state
 */
@JsonPropertyOrder({
  DbaasNodeStateProgressUpdate.JSON_PROPERTY_COMPLETED,
  DbaasNodeStateProgressUpdate.JSON_PROPERTY_CURRENT,
  DbaasNodeStateProgressUpdate.JSON_PROPERTY_MAX,
  DbaasNodeStateProgressUpdate.JSON_PROPERTY_MIN,
  DbaasNodeStateProgressUpdate.JSON_PROPERTY_PHASE,
  DbaasNodeStateProgressUpdate.JSON_PROPERTY_UNIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-29T07:06:33.173380Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DbaasNodeStateProgressUpdate {
  public static final String JSON_PROPERTY_COMPLETED = "completed";
  private Boolean completed;

  public static final String JSON_PROPERTY_CURRENT = "current";
  private Long current;

  public static final String JSON_PROPERTY_MAX = "max";
  private Long max;

  public static final String JSON_PROPERTY_MIN = "min";
  private Long min;

  /**
   * Key identifying this phase
   */
  public enum PhaseEnum {
    STREAM("stream"),
    
    BASEBACKUP("basebackup"),
    
    PREPARE("prepare"),
    
    FINALIZE("finalize");

    private String value;

    PhaseEnum(String value) {
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
    public static PhaseEnum fromValue(String value) {
      for (PhaseEnum b : PhaseEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PHASE = "phase";
  private PhaseEnum phase;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private String unit;

  public DbaasNodeStateProgressUpdate() { 
  }

  public DbaasNodeStateProgressUpdate completed(Boolean completed) {
    this.completed = completed;
    return this;
  }

   /**
   * Indicates whether this phase has been completed or not
   * @return completed
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMPLETED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getCompleted() {
    return completed;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }


  public DbaasNodeStateProgressUpdate current(Long current) {
    this.current = current;
    return this;
  }

   /**
   * Current progress for this phase. May be missing or null.
   * minimum: 0
   * @return current
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCurrent() {
    return current;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrent(Long current) {
    this.current = current;
  }


  public DbaasNodeStateProgressUpdate max(Long max) {
    this.max = max;
    return this;
  }

   /**
   * Maximum progress value for this phase. May be missing or null. May change.
   * minimum: 0
   * @return max
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMax() {
    return max;
  }


  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMax(Long max) {
    this.max = max;
  }


  public DbaasNodeStateProgressUpdate min(Long min) {
    this.min = min;
    return this;
  }

   /**
   * Minimum progress value for this phase. May be missing or null.
   * minimum: 0
   * @return min
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMin() {
    return min;
  }


  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMin(Long min) {
    this.min = min;
  }


  public DbaasNodeStateProgressUpdate phase(PhaseEnum phase) {
    this.phase = phase;
    return this;
  }

   /**
   * Key identifying this phase
   * @return phase
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PHASE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PhaseEnum getPhase() {
    return phase;
  }


  @JsonProperty(JSON_PROPERTY_PHASE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPhase(PhaseEnum phase) {
    this.phase = phase;
  }


  public DbaasNodeStateProgressUpdate unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Unit for current/min/max values. New units may be added.                         If null should be treated as generic unit
   * @return unit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUnit() {
    return unit;
  }


  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnit(String unit) {
    this.unit = unit;
  }


  /**
   * Return true if this dbaas-node-state-progress-update object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasNodeStateProgressUpdate dbaasNodeStateProgressUpdate = (DbaasNodeStateProgressUpdate) o;
    return Objects.equals(this.completed, dbaasNodeStateProgressUpdate.completed) &&
        Objects.equals(this.current, dbaasNodeStateProgressUpdate.current) &&
        Objects.equals(this.max, dbaasNodeStateProgressUpdate.max) &&
        Objects.equals(this.min, dbaasNodeStateProgressUpdate.min) &&
        Objects.equals(this.phase, dbaasNodeStateProgressUpdate.phase) &&
        Objects.equals(this.unit, dbaasNodeStateProgressUpdate.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completed, current, max, min, phase, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasNodeStateProgressUpdate {\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

    // add `completed` to the URL query string
    if (getCompleted() != null) {
      joiner.add(String.format("%scompleted%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompleted()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `current` to the URL query string
    if (getCurrent() != null) {
      joiner.add(String.format("%scurrent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrent()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `max` to the URL query string
    if (getMax() != null) {
      joiner.add(String.format("%smax%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMax()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `min` to the URL query string
    if (getMin() != null) {
      joiner.add(String.format("%smin%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMin()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `phase` to the URL query string
    if (getPhase() != null) {
      joiner.add(String.format("%sphase%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPhase()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `unit` to the URL query string
    if (getUnit() != null) {
      joiner.add(String.format("%sunit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUnit()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

