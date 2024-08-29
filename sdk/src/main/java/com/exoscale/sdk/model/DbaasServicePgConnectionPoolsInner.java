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
import com.exoscale.sdk.model.EnumPgPoolMode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DbaasServicePgConnectionPoolsInner
 */
@JsonPropertyOrder({
  DbaasServicePgConnectionPoolsInner.JSON_PROPERTY_CONNECTION_URI,
  DbaasServicePgConnectionPoolsInner.JSON_PROPERTY_DATABASE,
  DbaasServicePgConnectionPoolsInner.JSON_PROPERTY_MODE,
  DbaasServicePgConnectionPoolsInner.JSON_PROPERTY_NAME,
  DbaasServicePgConnectionPoolsInner.JSON_PROPERTY_SIZE,
  DbaasServicePgConnectionPoolsInner.JSON_PROPERTY_USERNAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-29T07:06:33.173380Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DbaasServicePgConnectionPoolsInner {
  public static final String JSON_PROPERTY_CONNECTION_URI = "connection-uri";
  private String connectionUri;

  public static final String JSON_PROPERTY_DATABASE = "database";
  private String database;

  public static final String JSON_PROPERTY_MODE = "mode";
  private EnumPgPoolMode mode;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public DbaasServicePgConnectionPoolsInner() { 
  }

  public DbaasServicePgConnectionPoolsInner connectionUri(String connectionUri) {
    this.connectionUri = connectionUri;
    return this;
  }

   /**
   * Connection URI for the DB pool
   * @return connectionUri
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONNECTION_URI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConnectionUri() {
    return connectionUri;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_URI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnectionUri(String connectionUri) {
    this.connectionUri = connectionUri;
  }


  public DbaasServicePgConnectionPoolsInner database(String database) {
    this.database = database;
    return this;
  }

   /**
   * Get database
   * @return database
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATABASE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDatabase() {
    return database;
  }


  @JsonProperty(JSON_PROPERTY_DATABASE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDatabase(String database) {
    this.database = database;
  }


  public DbaasServicePgConnectionPoolsInner mode(EnumPgPoolMode mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EnumPgPoolMode getMode() {
    return mode;
  }


  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMode(EnumPgPoolMode mode) {
    this.mode = mode;
  }


  public DbaasServicePgConnectionPoolsInner name(String name) {
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


  public DbaasServicePgConnectionPoolsInner size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * minimum: 1
   * maximum: 10000
   * @return size
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSize(Long size) {
    this.size = size;
  }


  public DbaasServicePgConnectionPoolsInner username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUsername(String username) {
    this.username = username;
  }


  /**
   * Return true if this dbaas_service_pg_connection_pools_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasServicePgConnectionPoolsInner dbaasServicePgConnectionPoolsInner = (DbaasServicePgConnectionPoolsInner) o;
    return Objects.equals(this.connectionUri, dbaasServicePgConnectionPoolsInner.connectionUri) &&
        Objects.equals(this.database, dbaasServicePgConnectionPoolsInner.database) &&
        Objects.equals(this.mode, dbaasServicePgConnectionPoolsInner.mode) &&
        Objects.equals(this.name, dbaasServicePgConnectionPoolsInner.name) &&
        Objects.equals(this.size, dbaasServicePgConnectionPoolsInner.size) &&
        Objects.equals(this.username, dbaasServicePgConnectionPoolsInner.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionUri, database, mode, name, size, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasServicePgConnectionPoolsInner {\n");
    sb.append("    connectionUri: ").append(toIndentedString(connectionUri)).append("\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

    // add `connection-uri` to the URL query string
    if (getConnectionUri() != null) {
      joiner.add(String.format("%sconnection-uri%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConnectionUri()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `database` to the URL query string
    if (getDatabase() != null) {
      joiner.add(String.format("%sdatabase%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDatabase()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `mode` to the URL query string
    if (getMode() != null) {
      joiner.add(String.format("%smode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

