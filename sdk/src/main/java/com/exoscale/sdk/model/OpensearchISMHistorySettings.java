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
 * OpensearchISMHistorySettings
 */
@JsonPropertyOrder({
  OpensearchISMHistorySettings.JSON_PROPERTY_ISM_ENABLED,
  OpensearchISMHistorySettings.JSON_PROPERTY_ISM_HISTORY_ENABLED,
  OpensearchISMHistorySettings.JSON_PROPERTY_ISM_HISTORY_MAX_AGE,
  OpensearchISMHistorySettings.JSON_PROPERTY_ISM_HISTORY_MAX_DOCS,
  OpensearchISMHistorySettings.JSON_PROPERTY_ISM_HISTORY_ROLLOVER_CHECK_PERIOD,
  OpensearchISMHistorySettings.JSON_PROPERTY_ISM_HISTORY_ROLLOVER_RETENTION_PERIOD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-22T07:06:13.134792Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OpensearchISMHistorySettings {
  public static final String JSON_PROPERTY_ISM_ENABLED = "ism_enabled";
  private Boolean ismEnabled = true;

  public static final String JSON_PROPERTY_ISM_HISTORY_ENABLED = "ism_history_enabled";
  private Boolean ismHistoryEnabled = true;

  public static final String JSON_PROPERTY_ISM_HISTORY_MAX_AGE = "ism_history_max_age";
  private Integer ismHistoryMaxAge = 24;

  public static final String JSON_PROPERTY_ISM_HISTORY_MAX_DOCS = "ism_history_max_docs";
  private Integer ismHistoryMaxDocs = 2500000;

  public static final String JSON_PROPERTY_ISM_HISTORY_ROLLOVER_CHECK_PERIOD = "ism_history_rollover_check_period";
  private Integer ismHistoryRolloverCheckPeriod = 8;

  public static final String JSON_PROPERTY_ISM_HISTORY_ROLLOVER_RETENTION_PERIOD = "ism_history_rollover_retention_period";
  private Integer ismHistoryRolloverRetentionPeriod = 30;

  public OpensearchISMHistorySettings() { 
  }

  public OpensearchISMHistorySettings ismEnabled(Boolean ismEnabled) {
    this.ismEnabled = ismEnabled;
    return this;
  }

   /**
   * Get ismEnabled
   * @return ismEnabled
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ISM_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsmEnabled() {
    return ismEnabled;
  }


  @JsonProperty(JSON_PROPERTY_ISM_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsmEnabled(Boolean ismEnabled) {
    this.ismEnabled = ismEnabled;
  }


  public OpensearchISMHistorySettings ismHistoryEnabled(Boolean ismHistoryEnabled) {
    this.ismHistoryEnabled = ismHistoryEnabled;
    return this;
  }

   /**
   * Get ismHistoryEnabled
   * @return ismHistoryEnabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISM_HISTORY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsmHistoryEnabled() {
    return ismHistoryEnabled;
  }


  @JsonProperty(JSON_PROPERTY_ISM_HISTORY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsmHistoryEnabled(Boolean ismHistoryEnabled) {
    this.ismHistoryEnabled = ismHistoryEnabled;
  }


  public OpensearchISMHistorySettings ismHistoryMaxAge(Integer ismHistoryMaxAge) {
    this.ismHistoryMaxAge = ismHistoryMaxAge;
    return this;
  }

   /**
   * Get ismHistoryMaxAge
   * minimum: 1
   * maximum: 2147483647
   * @return ismHistoryMaxAge
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISM_HISTORY_MAX_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIsmHistoryMaxAge() {
    return ismHistoryMaxAge;
  }


  @JsonProperty(JSON_PROPERTY_ISM_HISTORY_MAX_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsmHistoryMaxAge(Integer ismHistoryMaxAge) {
    this.ismHistoryMaxAge = ismHistoryMaxAge;
  }


  public OpensearchISMHistorySettings ismHistoryMaxDocs(Integer ismHistoryMaxDocs) {
    this.ismHistoryMaxDocs = ismHistoryMaxDocs;
    return this;
  }

   /**
   * Get ismHistoryMaxDocs
   * minimum: 1
   * maximum: 9223372036854775807
   * @return ismHistoryMaxDocs
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISM_HISTORY_MAX_DOCS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIsmHistoryMaxDocs() {
    return ismHistoryMaxDocs;
  }


  @JsonProperty(JSON_PROPERTY_ISM_HISTORY_MAX_DOCS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsmHistoryMaxDocs(Integer ismHistoryMaxDocs) {
    this.ismHistoryMaxDocs = ismHistoryMaxDocs;
  }


  public OpensearchISMHistorySettings ismHistoryRolloverCheckPeriod(Integer ismHistoryRolloverCheckPeriod) {
    this.ismHistoryRolloverCheckPeriod = ismHistoryRolloverCheckPeriod;
    return this;
  }

   /**
   * Get ismHistoryRolloverCheckPeriod
   * minimum: 1
   * maximum: 2147483647
   * @return ismHistoryRolloverCheckPeriod
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISM_HISTORY_ROLLOVER_CHECK_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIsmHistoryRolloverCheckPeriod() {
    return ismHistoryRolloverCheckPeriod;
  }


  @JsonProperty(JSON_PROPERTY_ISM_HISTORY_ROLLOVER_CHECK_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsmHistoryRolloverCheckPeriod(Integer ismHistoryRolloverCheckPeriod) {
    this.ismHistoryRolloverCheckPeriod = ismHistoryRolloverCheckPeriod;
  }


  public OpensearchISMHistorySettings ismHistoryRolloverRetentionPeriod(Integer ismHistoryRolloverRetentionPeriod) {
    this.ismHistoryRolloverRetentionPeriod = ismHistoryRolloverRetentionPeriod;
    return this;
  }

   /**
   * Get ismHistoryRolloverRetentionPeriod
   * minimum: 1
   * maximum: 2147483647
   * @return ismHistoryRolloverRetentionPeriod
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISM_HISTORY_ROLLOVER_RETENTION_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIsmHistoryRolloverRetentionPeriod() {
    return ismHistoryRolloverRetentionPeriod;
  }


  @JsonProperty(JSON_PROPERTY_ISM_HISTORY_ROLLOVER_RETENTION_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsmHistoryRolloverRetentionPeriod(Integer ismHistoryRolloverRetentionPeriod) {
    this.ismHistoryRolloverRetentionPeriod = ismHistoryRolloverRetentionPeriod;
  }


  /**
   * Return true if this Opensearch_ISM_History_Settings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpensearchISMHistorySettings opensearchISMHistorySettings = (OpensearchISMHistorySettings) o;
    return Objects.equals(this.ismEnabled, opensearchISMHistorySettings.ismEnabled) &&
        Objects.equals(this.ismHistoryEnabled, opensearchISMHistorySettings.ismHistoryEnabled) &&
        Objects.equals(this.ismHistoryMaxAge, opensearchISMHistorySettings.ismHistoryMaxAge) &&
        Objects.equals(this.ismHistoryMaxDocs, opensearchISMHistorySettings.ismHistoryMaxDocs) &&
        Objects.equals(this.ismHistoryRolloverCheckPeriod, opensearchISMHistorySettings.ismHistoryRolloverCheckPeriod) &&
        Objects.equals(this.ismHistoryRolloverRetentionPeriod, opensearchISMHistorySettings.ismHistoryRolloverRetentionPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ismEnabled, ismHistoryEnabled, ismHistoryMaxAge, ismHistoryMaxDocs, ismHistoryRolloverCheckPeriod, ismHistoryRolloverRetentionPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpensearchISMHistorySettings {\n");
    sb.append("    ismEnabled: ").append(toIndentedString(ismEnabled)).append("\n");
    sb.append("    ismHistoryEnabled: ").append(toIndentedString(ismHistoryEnabled)).append("\n");
    sb.append("    ismHistoryMaxAge: ").append(toIndentedString(ismHistoryMaxAge)).append("\n");
    sb.append("    ismHistoryMaxDocs: ").append(toIndentedString(ismHistoryMaxDocs)).append("\n");
    sb.append("    ismHistoryRolloverCheckPeriod: ").append(toIndentedString(ismHistoryRolloverCheckPeriod)).append("\n");
    sb.append("    ismHistoryRolloverRetentionPeriod: ").append(toIndentedString(ismHistoryRolloverRetentionPeriod)).append("\n");
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

    // add `ism_enabled` to the URL query string
    if (getIsmEnabled() != null) {
      joiner.add(String.format("%sism_enabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsmEnabled()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ism_history_enabled` to the URL query string
    if (getIsmHistoryEnabled() != null) {
      joiner.add(String.format("%sism_history_enabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsmHistoryEnabled()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ism_history_max_age` to the URL query string
    if (getIsmHistoryMaxAge() != null) {
      joiner.add(String.format("%sism_history_max_age%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsmHistoryMaxAge()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ism_history_max_docs` to the URL query string
    if (getIsmHistoryMaxDocs() != null) {
      joiner.add(String.format("%sism_history_max_docs%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsmHistoryMaxDocs()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ism_history_rollover_check_period` to the URL query string
    if (getIsmHistoryRolloverCheckPeriod() != null) {
      joiner.add(String.format("%sism_history_rollover_check_period%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsmHistoryRolloverCheckPeriod()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ism_history_rollover_retention_period` to the URL query string
    if (getIsmHistoryRolloverRetentionPeriod() != null) {
      joiner.add(String.format("%sism_history_rollover_retention_period%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsmHistoryRolloverRetentionPeriod()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

