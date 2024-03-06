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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

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
@JsonTypeName("Opensearch_ISM_History_Settings")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T21:01:33.231699+01:00[Europe/Vienna]")
public class OpensearchISMHistorySettings {
  public static final String JSON_PROPERTY_ISM_ENABLED = "ism_enabled";
  private Boolean ismEnabled = true;

  public static final String JSON_PROPERTY_ISM_HISTORY_ENABLED = "ism_history_enabled";
  private JsonNullable<Boolean> ismHistoryEnabled = JsonNullable.<Boolean>of(true);

  public static final String JSON_PROPERTY_ISM_HISTORY_MAX_AGE = "ism_history_max_age";
  private JsonNullable<Integer> ismHistoryMaxAge = JsonNullable.<Integer>of(24);

  public static final String JSON_PROPERTY_ISM_HISTORY_MAX_DOCS = "ism_history_max_docs";
  private JsonNullable<Integer> ismHistoryMaxDocs = JsonNullable.<Integer>of(2500000);

  public static final String JSON_PROPERTY_ISM_HISTORY_ROLLOVER_CHECK_PERIOD = "ism_history_rollover_check_period";
  private JsonNullable<Integer> ismHistoryRolloverCheckPeriod = JsonNullable.<Integer>of(8);

  public static final String JSON_PROPERTY_ISM_HISTORY_ROLLOVER_RETENTION_PERIOD = "ism_history_rollover_retention_period";
  private JsonNullable<Integer> ismHistoryRolloverRetentionPeriod = JsonNullable.<Integer>of(30);

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
  @javax.annotation.Nullable
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
    this.ismHistoryEnabled = JsonNullable.<Boolean>of(ismHistoryEnabled);
    
    return this;
  }

   /**
   * Get ismHistoryEnabled
   * @return ismHistoryEnabled
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getIsmHistoryEnabled() {
        return ismHistoryEnabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ISM_HISTORY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsmHistoryEnabled_JsonNullable() {
    return ismHistoryEnabled;
  }
  
  @JsonProperty(JSON_PROPERTY_ISM_HISTORY_ENABLED)
  public void setIsmHistoryEnabled_JsonNullable(JsonNullable<Boolean> ismHistoryEnabled) {
    this.ismHistoryEnabled = ismHistoryEnabled;
  }

  public void setIsmHistoryEnabled(Boolean ismHistoryEnabled) {
    this.ismHistoryEnabled = JsonNullable.<Boolean>of(ismHistoryEnabled);
  }


  public OpensearchISMHistorySettings ismHistoryMaxAge(Integer ismHistoryMaxAge) {
    this.ismHistoryMaxAge = JsonNullable.<Integer>of(ismHistoryMaxAge);
    
    return this;
  }

   /**
   * Get ismHistoryMaxAge
   * minimum: 1
   * maximum: 2147483647
   * @return ismHistoryMaxAge
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getIsmHistoryMaxAge() {
        return ismHistoryMaxAge.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ISM_HISTORY_MAX_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getIsmHistoryMaxAge_JsonNullable() {
    return ismHistoryMaxAge;
  }
  
  @JsonProperty(JSON_PROPERTY_ISM_HISTORY_MAX_AGE)
  public void setIsmHistoryMaxAge_JsonNullable(JsonNullable<Integer> ismHistoryMaxAge) {
    this.ismHistoryMaxAge = ismHistoryMaxAge;
  }

  public void setIsmHistoryMaxAge(Integer ismHistoryMaxAge) {
    this.ismHistoryMaxAge = JsonNullable.<Integer>of(ismHistoryMaxAge);
  }


  public OpensearchISMHistorySettings ismHistoryMaxDocs(Integer ismHistoryMaxDocs) {
    this.ismHistoryMaxDocs = JsonNullable.<Integer>of(ismHistoryMaxDocs);
    
    return this;
  }

   /**
   * Get ismHistoryMaxDocs
   * minimum: 1
   * maximum: 9223372036854775807
   * @return ismHistoryMaxDocs
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getIsmHistoryMaxDocs() {
        return ismHistoryMaxDocs.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ISM_HISTORY_MAX_DOCS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getIsmHistoryMaxDocs_JsonNullable() {
    return ismHistoryMaxDocs;
  }
  
  @JsonProperty(JSON_PROPERTY_ISM_HISTORY_MAX_DOCS)
  public void setIsmHistoryMaxDocs_JsonNullable(JsonNullable<Integer> ismHistoryMaxDocs) {
    this.ismHistoryMaxDocs = ismHistoryMaxDocs;
  }

  public void setIsmHistoryMaxDocs(Integer ismHistoryMaxDocs) {
    this.ismHistoryMaxDocs = JsonNullable.<Integer>of(ismHistoryMaxDocs);
  }


  public OpensearchISMHistorySettings ismHistoryRolloverCheckPeriod(Integer ismHistoryRolloverCheckPeriod) {
    this.ismHistoryRolloverCheckPeriod = JsonNullable.<Integer>of(ismHistoryRolloverCheckPeriod);
    
    return this;
  }

   /**
   * Get ismHistoryRolloverCheckPeriod
   * minimum: 1
   * maximum: 2147483647
   * @return ismHistoryRolloverCheckPeriod
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getIsmHistoryRolloverCheckPeriod() {
        return ismHistoryRolloverCheckPeriod.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ISM_HISTORY_ROLLOVER_CHECK_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getIsmHistoryRolloverCheckPeriod_JsonNullable() {
    return ismHistoryRolloverCheckPeriod;
  }
  
  @JsonProperty(JSON_PROPERTY_ISM_HISTORY_ROLLOVER_CHECK_PERIOD)
  public void setIsmHistoryRolloverCheckPeriod_JsonNullable(JsonNullable<Integer> ismHistoryRolloverCheckPeriod) {
    this.ismHistoryRolloverCheckPeriod = ismHistoryRolloverCheckPeriod;
  }

  public void setIsmHistoryRolloverCheckPeriod(Integer ismHistoryRolloverCheckPeriod) {
    this.ismHistoryRolloverCheckPeriod = JsonNullable.<Integer>of(ismHistoryRolloverCheckPeriod);
  }


  public OpensearchISMHistorySettings ismHistoryRolloverRetentionPeriod(Integer ismHistoryRolloverRetentionPeriod) {
    this.ismHistoryRolloverRetentionPeriod = JsonNullable.<Integer>of(ismHistoryRolloverRetentionPeriod);
    
    return this;
  }

   /**
   * Get ismHistoryRolloverRetentionPeriod
   * minimum: 1
   * maximum: 2147483647
   * @return ismHistoryRolloverRetentionPeriod
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getIsmHistoryRolloverRetentionPeriod() {
        return ismHistoryRolloverRetentionPeriod.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ISM_HISTORY_ROLLOVER_RETENTION_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getIsmHistoryRolloverRetentionPeriod_JsonNullable() {
    return ismHistoryRolloverRetentionPeriod;
  }
  
  @JsonProperty(JSON_PROPERTY_ISM_HISTORY_ROLLOVER_RETENTION_PERIOD)
  public void setIsmHistoryRolloverRetentionPeriod_JsonNullable(JsonNullable<Integer> ismHistoryRolloverRetentionPeriod) {
    this.ismHistoryRolloverRetentionPeriod = ismHistoryRolloverRetentionPeriod;
  }

  public void setIsmHistoryRolloverRetentionPeriod(Integer ismHistoryRolloverRetentionPeriod) {
    this.ismHistoryRolloverRetentionPeriod = JsonNullable.<Integer>of(ismHistoryRolloverRetentionPeriod);
  }

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
        equalsNullable(this.ismHistoryEnabled, opensearchISMHistorySettings.ismHistoryEnabled) &&
        equalsNullable(this.ismHistoryMaxAge, opensearchISMHistorySettings.ismHistoryMaxAge) &&
        equalsNullable(this.ismHistoryMaxDocs, opensearchISMHistorySettings.ismHistoryMaxDocs) &&
        equalsNullable(this.ismHistoryRolloverCheckPeriod, opensearchISMHistorySettings.ismHistoryRolloverCheckPeriod) &&
        equalsNullable(this.ismHistoryRolloverRetentionPeriod, opensearchISMHistorySettings.ismHistoryRolloverRetentionPeriod);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ismEnabled, hashCodeNullable(ismHistoryEnabled), hashCodeNullable(ismHistoryMaxAge), hashCodeNullable(ismHistoryMaxDocs), hashCodeNullable(ismHistoryRolloverCheckPeriod), hashCodeNullable(ismHistoryRolloverRetentionPeriod));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

}

