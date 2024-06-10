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
import com.exoscale.exoscale4j.model.EnumPgPoolMode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateDbaasPgConnectionPoolRequest
 */
@JsonPropertyOrder({
  CreateDbaasPgConnectionPoolRequest.JSON_PROPERTY_NAME,
  CreateDbaasPgConnectionPoolRequest.JSON_PROPERTY_DATABASE_NAME,
  CreateDbaasPgConnectionPoolRequest.JSON_PROPERTY_MODE,
  CreateDbaasPgConnectionPoolRequest.JSON_PROPERTY_SIZE,
  CreateDbaasPgConnectionPoolRequest.JSON_PROPERTY_USERNAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-10T11:13:25.453512+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class CreateDbaasPgConnectionPoolRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DATABASE_NAME = "database-name";
  private String databaseName;

  public static final String JSON_PROPERTY_MODE = "mode";
  private EnumPgPoolMode mode;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public CreateDbaasPgConnectionPoolRequest() { 
  }

  public CreateDbaasPgConnectionPoolRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
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


  public CreateDbaasPgConnectionPoolRequest databaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
  }

   /**
   * Get databaseName
   * @return databaseName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATABASE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDatabaseName() {
    return databaseName;
  }


  @JsonProperty(JSON_PROPERTY_DATABASE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }


  public CreateDbaasPgConnectionPoolRequest mode(EnumPgPoolMode mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EnumPgPoolMode getMode() {
    return mode;
  }


  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMode(EnumPgPoolMode mode) {
    this.mode = mode;
  }


  public CreateDbaasPgConnectionPoolRequest size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * minimum: 1
   * maximum: 10000
   * @return size
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(Long size) {
    this.size = size;
  }


  public CreateDbaasPgConnectionPoolRequest username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(String username) {
    this.username = username;
  }


  /**
   * Return true if this create_dbaas_pg_connection_pool_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDbaasPgConnectionPoolRequest createDbaasPgConnectionPoolRequest = (CreateDbaasPgConnectionPoolRequest) o;
    return Objects.equals(this.name, createDbaasPgConnectionPoolRequest.name) &&
        Objects.equals(this.databaseName, createDbaasPgConnectionPoolRequest.databaseName) &&
        Objects.equals(this.mode, createDbaasPgConnectionPoolRequest.mode) &&
        Objects.equals(this.size, createDbaasPgConnectionPoolRequest.size) &&
        Objects.equals(this.username, createDbaasPgConnectionPoolRequest.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, databaseName, mode, size, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDbaasPgConnectionPoolRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

    // add `database-name` to the URL query string
    if (getDatabaseName() != null) {
      joiner.add(String.format("%sdatabase-name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDatabaseName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `mode` to the URL query string
    if (getMode() != null) {
      joiner.add(String.format("%smode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `size` to the URL query string
    if (getSize() != null) {
      joiner.add(String.format("%ssize%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `username` to the URL query string
    if (getUsername() != null) {
      joiner.add(String.format("%susername%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUsername()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

