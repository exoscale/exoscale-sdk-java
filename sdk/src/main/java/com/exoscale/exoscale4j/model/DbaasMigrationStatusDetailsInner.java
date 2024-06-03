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
import com.exoscale.exoscale4j.model.EnumMigrationStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DbaasMigrationStatusDetailsInner
 */
@JsonPropertyOrder({
  DbaasMigrationStatusDetailsInner.JSON_PROPERTY_DBNAME,
  DbaasMigrationStatusDetailsInner.JSON_PROPERTY_ERROR,
  DbaasMigrationStatusDetailsInner.JSON_PROPERTY_METHOD,
  DbaasMigrationStatusDetailsInner.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-03T20:04:17.479783+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class DbaasMigrationStatusDetailsInner {
  public static final String JSON_PROPERTY_DBNAME = "dbname";
  private String dbname;

  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_METHOD = "method";
  private String method;

  public static final String JSON_PROPERTY_STATUS = "status";
  private EnumMigrationStatus status;

  public DbaasMigrationStatusDetailsInner() { 
  }

  public DbaasMigrationStatusDetailsInner dbname(String dbname) {
    this.dbname = dbname;
    return this;
  }

   /**
   * Migrated db name (PG) or number (Redis)
   * @return dbname
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DBNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDbname() {
    return dbname;
  }


  @JsonProperty(JSON_PROPERTY_DBNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbname(String dbname) {
    this.dbname = dbname;
  }


  public DbaasMigrationStatusDetailsInner error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Error message in case that migration has failed
   * @return error
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(String error) {
    this.error = error;
  }


  public DbaasMigrationStatusDetailsInner method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Migration method
   * @return method
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMethod() {
    return method;
  }


  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMethod(String method) {
    this.method = method;
  }


  public DbaasMigrationStatusDetailsInner status(EnumMigrationStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EnumMigrationStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(EnumMigrationStatus status) {
    this.status = status;
  }


  /**
   * Return true if this dbaas_migration_status_details_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasMigrationStatusDetailsInner dbaasMigrationStatusDetailsInner = (DbaasMigrationStatusDetailsInner) o;
    return Objects.equals(this.dbname, dbaasMigrationStatusDetailsInner.dbname) &&
        Objects.equals(this.error, dbaasMigrationStatusDetailsInner.error) &&
        Objects.equals(this.method, dbaasMigrationStatusDetailsInner.method) &&
        Objects.equals(this.status, dbaasMigrationStatusDetailsInner.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbname, error, method, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasMigrationStatusDetailsInner {\n");
    sb.append("    dbname: ").append(toIndentedString(dbname)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

    // add `dbname` to the URL query string
    if (getDbname() != null) {
      joiner.add(String.format("%sdbname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDbname()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `error` to the URL query string
    if (getError() != null) {
      joiner.add(String.format("%serror%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getError()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `method` to the URL query string
    if (getMethod() != null) {
      joiner.add(String.format("%smethod%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMethod()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

