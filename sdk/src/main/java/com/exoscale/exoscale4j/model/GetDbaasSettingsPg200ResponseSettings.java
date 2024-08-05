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
import com.exoscale.exoscale4j.model.GetDbaasSettingsPg200ResponseSettingsPg;
import com.exoscale.exoscale4j.model.GetDbaasSettingsPg200ResponseSettingsPgbouncer;
import com.exoscale.exoscale4j.model.GetDbaasSettingsPg200ResponseSettingsPglookout;
import com.exoscale.exoscale4j.model.GetDbaasSettingsPg200ResponseSettingsTimescaledb;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GetDbaasSettingsPg200ResponseSettings
 */
@JsonPropertyOrder({
  GetDbaasSettingsPg200ResponseSettings.JSON_PROPERTY_PG,
  GetDbaasSettingsPg200ResponseSettings.JSON_PROPERTY_PGLOOKOUT,
  GetDbaasSettingsPg200ResponseSettings.JSON_PROPERTY_PGBOUNCER,
  GetDbaasSettingsPg200ResponseSettings.JSON_PROPERTY_TIMESCALEDB
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-05T21:53:56.743866Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class GetDbaasSettingsPg200ResponseSettings {
  public static final String JSON_PROPERTY_PG = "pg";
  private GetDbaasSettingsPg200ResponseSettingsPg pg;

  public static final String JSON_PROPERTY_PGLOOKOUT = "pglookout";
  private GetDbaasSettingsPg200ResponseSettingsPglookout pglookout;

  public static final String JSON_PROPERTY_PGBOUNCER = "pgbouncer";
  private GetDbaasSettingsPg200ResponseSettingsPgbouncer pgbouncer;

  public static final String JSON_PROPERTY_TIMESCALEDB = "timescaledb";
  private GetDbaasSettingsPg200ResponseSettingsTimescaledb timescaledb;

  public GetDbaasSettingsPg200ResponseSettings() { 
  }

  public GetDbaasSettingsPg200ResponseSettings pg(GetDbaasSettingsPg200ResponseSettingsPg pg) {
    this.pg = pg;
    return this;
  }

   /**
   * Get pg
   * @return pg
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetDbaasSettingsPg200ResponseSettingsPg getPg() {
    return pg;
  }


  @JsonProperty(JSON_PROPERTY_PG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPg(GetDbaasSettingsPg200ResponseSettingsPg pg) {
    this.pg = pg;
  }


  public GetDbaasSettingsPg200ResponseSettings pglookout(GetDbaasSettingsPg200ResponseSettingsPglookout pglookout) {
    this.pglookout = pglookout;
    return this;
  }

   /**
   * Get pglookout
   * @return pglookout
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PGLOOKOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetDbaasSettingsPg200ResponseSettingsPglookout getPglookout() {
    return pglookout;
  }


  @JsonProperty(JSON_PROPERTY_PGLOOKOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPglookout(GetDbaasSettingsPg200ResponseSettingsPglookout pglookout) {
    this.pglookout = pglookout;
  }


  public GetDbaasSettingsPg200ResponseSettings pgbouncer(GetDbaasSettingsPg200ResponseSettingsPgbouncer pgbouncer) {
    this.pgbouncer = pgbouncer;
    return this;
  }

   /**
   * Get pgbouncer
   * @return pgbouncer
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PGBOUNCER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetDbaasSettingsPg200ResponseSettingsPgbouncer getPgbouncer() {
    return pgbouncer;
  }


  @JsonProperty(JSON_PROPERTY_PGBOUNCER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPgbouncer(GetDbaasSettingsPg200ResponseSettingsPgbouncer pgbouncer) {
    this.pgbouncer = pgbouncer;
  }


  public GetDbaasSettingsPg200ResponseSettings timescaledb(GetDbaasSettingsPg200ResponseSettingsTimescaledb timescaledb) {
    this.timescaledb = timescaledb;
    return this;
  }

   /**
   * Get timescaledb
   * @return timescaledb
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESCALEDB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetDbaasSettingsPg200ResponseSettingsTimescaledb getTimescaledb() {
    return timescaledb;
  }


  @JsonProperty(JSON_PROPERTY_TIMESCALEDB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimescaledb(GetDbaasSettingsPg200ResponseSettingsTimescaledb timescaledb) {
    this.timescaledb = timescaledb;
  }


  /**
   * Return true if this get_dbaas_settings_pg_200_response_settings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDbaasSettingsPg200ResponseSettings getDbaasSettingsPg200ResponseSettings = (GetDbaasSettingsPg200ResponseSettings) o;
    return Objects.equals(this.pg, getDbaasSettingsPg200ResponseSettings.pg) &&
        Objects.equals(this.pglookout, getDbaasSettingsPg200ResponseSettings.pglookout) &&
        Objects.equals(this.pgbouncer, getDbaasSettingsPg200ResponseSettings.pgbouncer) &&
        Objects.equals(this.timescaledb, getDbaasSettingsPg200ResponseSettings.timescaledb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pg, pglookout, pgbouncer, timescaledb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDbaasSettingsPg200ResponseSettings {\n");
    sb.append("    pg: ").append(toIndentedString(pg)).append("\n");
    sb.append("    pglookout: ").append(toIndentedString(pglookout)).append("\n");
    sb.append("    pgbouncer: ").append(toIndentedString(pgbouncer)).append("\n");
    sb.append("    timescaledb: ").append(toIndentedString(timescaledb)).append("\n");
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

    // add `pg` to the URL query string
    if (getPg() != null) {
      joiner.add(getPg().toUrlQueryString(prefix + "pg" + suffix));
    }

    // add `pglookout` to the URL query string
    if (getPglookout() != null) {
      joiner.add(getPglookout().toUrlQueryString(prefix + "pglookout" + suffix));
    }

    // add `pgbouncer` to the URL query string
    if (getPgbouncer() != null) {
      joiner.add(getPgbouncer().toUrlQueryString(prefix + "pgbouncer" + suffix));
    }

    // add `timescaledb` to the URL query string
    if (getTimescaledb() != null) {
      joiner.add(getTimescaledb().toUrlQueryString(prefix + "timescaledb" + suffix));
    }

    return joiner.toString();
  }
}

