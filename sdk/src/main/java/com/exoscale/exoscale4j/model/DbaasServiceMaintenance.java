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
import com.exoscale.exoscale4j.model.DbaasServiceUpdate;
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
  DbaasServiceMaintenance.JSON_PROPERTY_DOW,
  DbaasServiceMaintenance.JSON_PROPERTY_TIME,
  DbaasServiceMaintenance.JSON_PROPERTY_UPDATES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-09T23:00:30.419743+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class DbaasServiceMaintenance {
  /**
   * Day of week for installing updates
   */
  public enum DowEnum {
    SATURDAY("saturday"),
    
    TUESDAY("tuesday"),
    
    NEVER("never"),
    
    WEDNESDAY("wednesday"),
    
    SUNDAY("sunday"),
    
    FRIDAY("friday"),
    
    MONDAY("monday"),
    
    THURSDAY("thursday");

    private String value;

    DowEnum(String value) {
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
    public static DowEnum fromValue(String value) {
      for (DowEnum b : DowEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DOW = "dow";
  private DowEnum dow;

  public static final String JSON_PROPERTY_TIME = "time";
  private String time;

  public static final String JSON_PROPERTY_UPDATES = "updates";
  private List<DbaasServiceUpdate> updates = new ArrayList<>();

  public DbaasServiceMaintenance() { 
  }

  public DbaasServiceMaintenance dow(DowEnum dow) {
    this.dow = dow;
    return this;
  }

   /**
   * Day of week for installing updates
   * @return dow
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DowEnum getDow() {
    return dow;
  }


  @JsonProperty(JSON_PROPERTY_DOW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDow(DowEnum dow) {
    this.dow = dow;
  }


  public DbaasServiceMaintenance time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Time for installing updates, UTC
   * @return time
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTime() {
    return time;
  }


  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTime(String time) {
    this.time = time;
  }


  public DbaasServiceMaintenance updates(List<DbaasServiceUpdate> updates) {
    this.updates = updates;
    return this;
  }

  public DbaasServiceMaintenance addUpdatesItem(DbaasServiceUpdate updatesItem) {
    if (this.updates == null) {
      this.updates = new ArrayList<>();
    }
    this.updates.add(updatesItem);
    return this;
  }

   /**
   * List of updates waiting to be installed
   * @return updates
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UPDATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<DbaasServiceUpdate> getUpdates() {
    return updates;
  }


  @JsonProperty(JSON_PROPERTY_UPDATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdates(List<DbaasServiceUpdate> updates) {
    this.updates = updates;
  }


  /**
   * Return true if this dbaas-service-maintenance object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasServiceMaintenance dbaasServiceMaintenance = (DbaasServiceMaintenance) o;
    return Objects.equals(this.dow, dbaasServiceMaintenance.dow) &&
        Objects.equals(this.time, dbaasServiceMaintenance.time) &&
        Objects.equals(this.updates, dbaasServiceMaintenance.updates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dow, time, updates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasServiceMaintenance {\n");
    sb.append("    dow: ").append(toIndentedString(dow)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    updates: ").append(toIndentedString(updates)).append("\n");
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

    // add `dow` to the URL query string
    if (getDow() != null) {
      joiner.add(String.format("%sdow%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDow()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `time` to the URL query string
    if (getTime() != null) {
      joiner.add(String.format("%stime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `updates` to the URL query string
    if (getUpdates() != null) {
      for (int i = 0; i < getUpdates().size(); i++) {
        if (getUpdates().get(i) != null) {
          joiner.add(getUpdates().get(i).toUrlQueryString(String.format("%supdates%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

