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


package org.openapitools.client.model;

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
import org.openapitools.client.model.EnumMigrationMethod;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Migrate data from existing server
 */
@JsonPropertyOrder({
  UpdateDbaasServiceMysqlRequestMigration.JSON_PROPERTY_HOST,
  UpdateDbaasServiceMysqlRequestMigration.JSON_PROPERTY_PORT,
  UpdateDbaasServiceMysqlRequestMigration.JSON_PROPERTY_PASSWORD,
  UpdateDbaasServiceMysqlRequestMigration.JSON_PROPERTY_SSL,
  UpdateDbaasServiceMysqlRequestMigration.JSON_PROPERTY_USERNAME,
  UpdateDbaasServiceMysqlRequestMigration.JSON_PROPERTY_DBNAME,
  UpdateDbaasServiceMysqlRequestMigration.JSON_PROPERTY_IGNORE_DBS,
  UpdateDbaasServiceMysqlRequestMigration.JSON_PROPERTY_METHOD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T18:00:26.790082348Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class UpdateDbaasServiceMysqlRequestMigration {
  public static final String JSON_PROPERTY_HOST = "host";
  private String host;

  public static final String JSON_PROPERTY_PORT = "port";
  private Long port;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_SSL = "ssl";
  private Boolean ssl;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_DBNAME = "dbname";
  private String dbname;

  public static final String JSON_PROPERTY_IGNORE_DBS = "ignore-dbs";
  private String ignoreDbs;

  public static final String JSON_PROPERTY_METHOD = "method";
  private EnumMigrationMethod method;

  public UpdateDbaasServiceMysqlRequestMigration() { 
  }

  public UpdateDbaasServiceMysqlRequestMigration host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Hostname or IP address of the server where to migrate data from
   * @return host
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HOST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHost() {
    return host;
  }


  @JsonProperty(JSON_PROPERTY_HOST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHost(String host) {
    this.host = host;
  }


  public UpdateDbaasServiceMysqlRequestMigration port(Long port) {
    this.port = port;
    return this;
  }

   /**
   * Port number of the server where to migrate data from
   * minimum: 1
   * maximum: 65535
   * @return port
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getPort() {
    return port;
  }


  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPort(Long port) {
    this.port = port;
  }


  public UpdateDbaasServiceMysqlRequestMigration password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password for authentication with the server where to migrate data from
   * @return password
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }


  public UpdateDbaasServiceMysqlRequestMigration ssl(Boolean ssl) {
    this.ssl = ssl;
    return this;
  }

   /**
   * The server where to migrate data from is secured with SSL
   * @return ssl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSsl() {
    return ssl;
  }


  @JsonProperty(JSON_PROPERTY_SSL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSsl(Boolean ssl) {
    this.ssl = ssl;
  }


  public UpdateDbaasServiceMysqlRequestMigration username(String username) {
    this.username = username;
    return this;
  }

   /**
   * User name for authentication with the server where to migrate data from
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


  public UpdateDbaasServiceMysqlRequestMigration dbname(String dbname) {
    this.dbname = dbname;
    return this;
  }

   /**
   * Database name for bootstrapping the initial connection
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


  public UpdateDbaasServiceMysqlRequestMigration ignoreDbs(String ignoreDbs) {
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


  public UpdateDbaasServiceMysqlRequestMigration method(EnumMigrationMethod method) {
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


  /**
   * Return true if this update_dbaas_service_mysql_request_migration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDbaasServiceMysqlRequestMigration updateDbaasServiceMysqlRequestMigration = (UpdateDbaasServiceMysqlRequestMigration) o;
    return Objects.equals(this.host, updateDbaasServiceMysqlRequestMigration.host) &&
        Objects.equals(this.port, updateDbaasServiceMysqlRequestMigration.port) &&
        Objects.equals(this.password, updateDbaasServiceMysqlRequestMigration.password) &&
        Objects.equals(this.ssl, updateDbaasServiceMysqlRequestMigration.ssl) &&
        Objects.equals(this.username, updateDbaasServiceMysqlRequestMigration.username) &&
        Objects.equals(this.dbname, updateDbaasServiceMysqlRequestMigration.dbname) &&
        Objects.equals(this.ignoreDbs, updateDbaasServiceMysqlRequestMigration.ignoreDbs) &&
        Objects.equals(this.method, updateDbaasServiceMysqlRequestMigration.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, port, password, ssl, username, dbname, ignoreDbs, method);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDbaasServiceMysqlRequestMigration {\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    dbname: ").append(toIndentedString(dbname)).append("\n");
    sb.append("    ignoreDbs: ").append(toIndentedString(ignoreDbs)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

    // add `host` to the URL query string
    if (getHost() != null) {
      joiner.add(String.format("%shost%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHost()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `port` to the URL query string
    if (getPort() != null) {
      joiner.add(String.format("%sport%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPort()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `password` to the URL query string
    if (getPassword() != null) {
      joiner.add(String.format("%spassword%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPassword()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ssl` to the URL query string
    if (getSsl() != null) {
      joiner.add(String.format("%sssl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSsl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `username` to the URL query string
    if (getUsername() != null) {
      joiner.add(String.format("%susername%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUsername()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dbname` to the URL query string
    if (getDbname() != null) {
      joiner.add(String.format("%sdbname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDbname()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ignore-dbs` to the URL query string
    if (getIgnoreDbs() != null) {
      joiner.add(String.format("%signore-dbs%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIgnoreDbs()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `method` to the URL query string
    if (getMethod() != null) {
      joiner.add(String.format("%smethod%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMethod()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

