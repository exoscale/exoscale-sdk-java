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
 * DbaasIntegrationSettingsDatadog
 */
@JsonPropertyOrder({
  DbaasIntegrationSettingsDatadog.JSON_PROPERTY_DATADOG_DBM_ENABLED,
  DbaasIntegrationSettingsDatadog.JSON_PROPERTY_DATADOG_PGBOUNCER_ENABLED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class DbaasIntegrationSettingsDatadog {
  public static final String JSON_PROPERTY_DATADOG_DBM_ENABLED = "datadog-dbm-enabled";
  private Boolean datadogDbmEnabled;

  public static final String JSON_PROPERTY_DATADOG_PGBOUNCER_ENABLED = "datadog-pgbouncer-enabled";
  private Boolean datadogPgbouncerEnabled;

  public DbaasIntegrationSettingsDatadog() { 
  }

  public DbaasIntegrationSettingsDatadog datadogDbmEnabled(Boolean datadogDbmEnabled) {
    this.datadogDbmEnabled = datadogDbmEnabled;
    return this;
  }

   /**
   * Database monitoring: view query metrics, explain plans, and execution details. Correlate queries with host metrics.
   * @return datadogDbmEnabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATADOG_DBM_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDatadogDbmEnabled() {
    return datadogDbmEnabled;
  }


  @JsonProperty(JSON_PROPERTY_DATADOG_DBM_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatadogDbmEnabled(Boolean datadogDbmEnabled) {
    this.datadogDbmEnabled = datadogDbmEnabled;
  }


  public DbaasIntegrationSettingsDatadog datadogPgbouncerEnabled(Boolean datadogPgbouncerEnabled) {
    this.datadogPgbouncerEnabled = datadogPgbouncerEnabled;
    return this;
  }

   /**
   * Integrate PgBouncer with Datadog to track connection pool metrics and monitor application traffic.
   * @return datadogPgbouncerEnabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATADOG_PGBOUNCER_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDatadogPgbouncerEnabled() {
    return datadogPgbouncerEnabled;
  }


  @JsonProperty(JSON_PROPERTY_DATADOG_PGBOUNCER_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatadogPgbouncerEnabled(Boolean datadogPgbouncerEnabled) {
    this.datadogPgbouncerEnabled = datadogPgbouncerEnabled;
  }


  /**
   * Return true if this dbaas-integration-settings-datadog object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasIntegrationSettingsDatadog dbaasIntegrationSettingsDatadog = (DbaasIntegrationSettingsDatadog) o;
    return Objects.equals(this.datadogDbmEnabled, dbaasIntegrationSettingsDatadog.datadogDbmEnabled) &&
        Objects.equals(this.datadogPgbouncerEnabled, dbaasIntegrationSettingsDatadog.datadogPgbouncerEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datadogDbmEnabled, datadogPgbouncerEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasIntegrationSettingsDatadog {\n");
    sb.append("    datadogDbmEnabled: ").append(toIndentedString(datadogDbmEnabled)).append("\n");
    sb.append("    datadogPgbouncerEnabled: ").append(toIndentedString(datadogPgbouncerEnabled)).append("\n");
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

    // add `datadog-dbm-enabled` to the URL query string
    if (getDatadogDbmEnabled() != null) {
      joiner.add(String.format("%sdatadog-dbm-enabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDatadogDbmEnabled()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `datadog-pgbouncer-enabled` to the URL query string
    if (getDatadogPgbouncerEnabled() != null) {
      joiner.add(String.format("%sdatadog-pgbouncer-enabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDatadogPgbouncerEnabled()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
