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
import com.exoscale.sdk.model.EnumMigrationMethod;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateDbaasTaskMigrationCheckRequest
 */
@JsonPropertyOrder({
  CreateDbaasTaskMigrationCheckRequest.JSON_PROPERTY_SOURCE_SERVICE_URI,
  CreateDbaasTaskMigrationCheckRequest.JSON_PROPERTY_METHOD,
  CreateDbaasTaskMigrationCheckRequest.JSON_PROPERTY_IGNORE_DBS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T07:23:47.609974Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateDbaasTaskMigrationCheckRequest {
  public static final String JSON_PROPERTY_SOURCE_SERVICE_URI = "source-service-uri";
  private String sourceServiceUri;

  public static final String JSON_PROPERTY_METHOD = "method";
  private EnumMigrationMethod method;

  public static final String JSON_PROPERTY_IGNORE_DBS = "ignore-dbs";
  private String ignoreDbs;

  public CreateDbaasTaskMigrationCheckRequest() { 
  }

  public CreateDbaasTaskMigrationCheckRequest sourceServiceUri(String sourceServiceUri) {
    this.sourceServiceUri = sourceServiceUri;
    return this;
  }

   /**
   * Service URI of the source MySQL or PostgreSQL database with admin credentials.
   * @return sourceServiceUri
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SOURCE_SERVICE_URI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSourceServiceUri() {
    return sourceServiceUri;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_SERVICE_URI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSourceServiceUri(String sourceServiceUri) {
    this.sourceServiceUri = sourceServiceUri;
  }


  public CreateDbaasTaskMigrationCheckRequest method(EnumMigrationMethod method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EnumMigrationMethod getMethod() {
    return method;
  }


  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMethod(EnumMigrationMethod method) {
    this.method = method;
  }


  public CreateDbaasTaskMigrationCheckRequest ignoreDbs(String ignoreDbs) {
    this.ignoreDbs = ignoreDbs;
    return this;
  }

   /**
   * Comma-separated list of databases, which should be ignored during migration (supported by MySQL only at the moment)
   * @return ignoreDbs
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IGNORE_DBS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIgnoreDbs() {
    return ignoreDbs;
  }


  @JsonProperty(JSON_PROPERTY_IGNORE_DBS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIgnoreDbs(String ignoreDbs) {
    this.ignoreDbs = ignoreDbs;
  }


  /**
   * Return true if this create_dbaas_task_migration_check_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDbaasTaskMigrationCheckRequest createDbaasTaskMigrationCheckRequest = (CreateDbaasTaskMigrationCheckRequest) o;
    return Objects.equals(this.sourceServiceUri, createDbaasTaskMigrationCheckRequest.sourceServiceUri) &&
        Objects.equals(this.method, createDbaasTaskMigrationCheckRequest.method) &&
        Objects.equals(this.ignoreDbs, createDbaasTaskMigrationCheckRequest.ignoreDbs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceServiceUri, method, ignoreDbs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDbaasTaskMigrationCheckRequest {\n");
    sb.append("    sourceServiceUri: ").append(toIndentedString(sourceServiceUri)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    ignoreDbs: ").append(toIndentedString(ignoreDbs)).append("\n");
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

    // add `source-service-uri` to the URL query string
    if (getSourceServiceUri() != null) {
      joiner.add(String.format("%ssource-service-uri%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSourceServiceUri()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `method` to the URL query string
    if (getMethod() != null) {
      joiner.add(String.format("%smethod%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMethod()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ignore-dbs` to the URL query string
    if (getIgnoreDbs() != null) {
      joiner.add(String.format("%signore-dbs%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIgnoreDbs()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

