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
 * System-wide settings for pgbouncer.
 */
@JsonPropertyOrder({
  JsonSchemaPgbouncer.JSON_PROPERTY_MIN_POOL_SIZE,
  JsonSchemaPgbouncer.JSON_PROPERTY_IGNORE_STARTUP_PARAMETERS,
  JsonSchemaPgbouncer.JSON_PROPERTY_SERVER_LIFETIME,
  JsonSchemaPgbouncer.JSON_PROPERTY_AUTODB_POOL_MODE,
  JsonSchemaPgbouncer.JSON_PROPERTY_SERVER_IDLE_TIMEOUT,
  JsonSchemaPgbouncer.JSON_PROPERTY_AUTODB_MAX_DB_CONNECTIONS,
  JsonSchemaPgbouncer.JSON_PROPERTY_SERVER_RESET_QUERY_ALWAYS,
  JsonSchemaPgbouncer.JSON_PROPERTY_AUTODB_POOL_SIZE,
  JsonSchemaPgbouncer.JSON_PROPERTY_AUTODB_IDLE_TIMEOUT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-09T22:11:49.172310+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class JsonSchemaPgbouncer {
  public static final String JSON_PROPERTY_MIN_POOL_SIZE = "min_pool_size";
  private Integer minPoolSize = 0;

  /**
   * Gets or Sets ignoreStartupParameters
   */
  public enum IgnoreStartupParametersEnum {
    EXTRA_FLOAT_DIGITS("extra_float_digits"),
    
    SEARCH_PATH("search_path");

    private String value;

    IgnoreStartupParametersEnum(String value) {
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
    public static IgnoreStartupParametersEnum fromValue(String value) {
      for (IgnoreStartupParametersEnum b : IgnoreStartupParametersEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_IGNORE_STARTUP_PARAMETERS = "ignore_startup_parameters";
  private List<IgnoreStartupParametersEnum> ignoreStartupParameters;

  public static final String JSON_PROPERTY_SERVER_LIFETIME = "server_lifetime";
  private Integer serverLifetime = 3600;

  /**
   * Gets or Sets autodbPoolMode
   */
  public enum AutodbPoolModeEnum {
    TRANSACTION("transaction"),
    
    SESSION("session"),
    
    STATEMENT("statement");

    private String value;

    AutodbPoolModeEnum(String value) {
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
    public static AutodbPoolModeEnum fromValue(String value) {
      for (AutodbPoolModeEnum b : AutodbPoolModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_AUTODB_POOL_MODE = "autodb_pool_mode";
  private AutodbPoolModeEnum autodbPoolMode = AutodbPoolModeEnum.TRANSACTION;

  public static final String JSON_PROPERTY_SERVER_IDLE_TIMEOUT = "server_idle_timeout";
  private Integer serverIdleTimeout = 600;

  public static final String JSON_PROPERTY_AUTODB_MAX_DB_CONNECTIONS = "autodb_max_db_connections";
  private Integer autodbMaxDbConnections;

  public static final String JSON_PROPERTY_SERVER_RESET_QUERY_ALWAYS = "server_reset_query_always";
  private Boolean serverResetQueryAlways = false;

  public static final String JSON_PROPERTY_AUTODB_POOL_SIZE = "autodb_pool_size";
  private Integer autodbPoolSize = 0;

  public static final String JSON_PROPERTY_AUTODB_IDLE_TIMEOUT = "autodb_idle_timeout";
  private Integer autodbIdleTimeout = 3600;

  public JsonSchemaPgbouncer() { 
  }

  public JsonSchemaPgbouncer minPoolSize(Integer minPoolSize) {
    this.minPoolSize = minPoolSize;
    return this;
  }

   /**
   * Get minPoolSize
   * minimum: 0
   * maximum: 10000
   * @return minPoolSize
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_POOL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinPoolSize() {
    return minPoolSize;
  }


  @JsonProperty(JSON_PROPERTY_MIN_POOL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinPoolSize(Integer minPoolSize) {
    this.minPoolSize = minPoolSize;
  }


  public JsonSchemaPgbouncer ignoreStartupParameters(List<IgnoreStartupParametersEnum> ignoreStartupParameters) {
    this.ignoreStartupParameters = ignoreStartupParameters;
    return this;
  }

  public JsonSchemaPgbouncer addIgnoreStartupParametersItem(IgnoreStartupParametersEnum ignoreStartupParametersItem) {
    if (this.ignoreStartupParameters == null) {
      this.ignoreStartupParameters = new ArrayList<>();
    }
    this.ignoreStartupParameters.add(ignoreStartupParametersItem);
    return this;
  }

   /**
   * Get ignoreStartupParameters
   * @return ignoreStartupParameters
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IGNORE_STARTUP_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<IgnoreStartupParametersEnum> getIgnoreStartupParameters() {
    return ignoreStartupParameters;
  }


  @JsonProperty(JSON_PROPERTY_IGNORE_STARTUP_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIgnoreStartupParameters(List<IgnoreStartupParametersEnum> ignoreStartupParameters) {
    this.ignoreStartupParameters = ignoreStartupParameters;
  }


  public JsonSchemaPgbouncer serverLifetime(Integer serverLifetime) {
    this.serverLifetime = serverLifetime;
    return this;
  }

   /**
   * Get serverLifetime
   * minimum: 60
   * maximum: 86400
   * @return serverLifetime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER_LIFETIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getServerLifetime() {
    return serverLifetime;
  }


  @JsonProperty(JSON_PROPERTY_SERVER_LIFETIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServerLifetime(Integer serverLifetime) {
    this.serverLifetime = serverLifetime;
  }


  public JsonSchemaPgbouncer autodbPoolMode(AutodbPoolModeEnum autodbPoolMode) {
    this.autodbPoolMode = autodbPoolMode;
    return this;
  }

   /**
   * Get autodbPoolMode
   * @return autodbPoolMode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTODB_POOL_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AutodbPoolModeEnum getAutodbPoolMode() {
    return autodbPoolMode;
  }


  @JsonProperty(JSON_PROPERTY_AUTODB_POOL_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutodbPoolMode(AutodbPoolModeEnum autodbPoolMode) {
    this.autodbPoolMode = autodbPoolMode;
  }


  public JsonSchemaPgbouncer serverIdleTimeout(Integer serverIdleTimeout) {
    this.serverIdleTimeout = serverIdleTimeout;
    return this;
  }

   /**
   * Get serverIdleTimeout
   * minimum: 0
   * maximum: 86400
   * @return serverIdleTimeout
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER_IDLE_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getServerIdleTimeout() {
    return serverIdleTimeout;
  }


  @JsonProperty(JSON_PROPERTY_SERVER_IDLE_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServerIdleTimeout(Integer serverIdleTimeout) {
    this.serverIdleTimeout = serverIdleTimeout;
  }


  public JsonSchemaPgbouncer autodbMaxDbConnections(Integer autodbMaxDbConnections) {
    this.autodbMaxDbConnections = autodbMaxDbConnections;
    return this;
  }

   /**
   * Get autodbMaxDbConnections
   * minimum: 0
   * maximum: 2147483647
   * @return autodbMaxDbConnections
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTODB_MAX_DB_CONNECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAutodbMaxDbConnections() {
    return autodbMaxDbConnections;
  }


  @JsonProperty(JSON_PROPERTY_AUTODB_MAX_DB_CONNECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutodbMaxDbConnections(Integer autodbMaxDbConnections) {
    this.autodbMaxDbConnections = autodbMaxDbConnections;
  }


  public JsonSchemaPgbouncer serverResetQueryAlways(Boolean serverResetQueryAlways) {
    this.serverResetQueryAlways = serverResetQueryAlways;
    return this;
  }

   /**
   * Get serverResetQueryAlways
   * @return serverResetQueryAlways
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER_RESET_QUERY_ALWAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getServerResetQueryAlways() {
    return serverResetQueryAlways;
  }


  @JsonProperty(JSON_PROPERTY_SERVER_RESET_QUERY_ALWAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServerResetQueryAlways(Boolean serverResetQueryAlways) {
    this.serverResetQueryAlways = serverResetQueryAlways;
  }


  public JsonSchemaPgbouncer autodbPoolSize(Integer autodbPoolSize) {
    this.autodbPoolSize = autodbPoolSize;
    return this;
  }

   /**
   * Get autodbPoolSize
   * minimum: 0
   * maximum: 10000
   * @return autodbPoolSize
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTODB_POOL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAutodbPoolSize() {
    return autodbPoolSize;
  }


  @JsonProperty(JSON_PROPERTY_AUTODB_POOL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutodbPoolSize(Integer autodbPoolSize) {
    this.autodbPoolSize = autodbPoolSize;
  }


  public JsonSchemaPgbouncer autodbIdleTimeout(Integer autodbIdleTimeout) {
    this.autodbIdleTimeout = autodbIdleTimeout;
    return this;
  }

   /**
   * Get autodbIdleTimeout
   * minimum: 0
   * maximum: 86400
   * @return autodbIdleTimeout
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTODB_IDLE_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAutodbIdleTimeout() {
    return autodbIdleTimeout;
  }


  @JsonProperty(JSON_PROPERTY_AUTODB_IDLE_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutodbIdleTimeout(Integer autodbIdleTimeout) {
    this.autodbIdleTimeout = autodbIdleTimeout;
  }


  /**
   * Return true if this json-schema-pgbouncer object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonSchemaPgbouncer jsonSchemaPgbouncer = (JsonSchemaPgbouncer) o;
    return Objects.equals(this.minPoolSize, jsonSchemaPgbouncer.minPoolSize) &&
        Objects.equals(this.ignoreStartupParameters, jsonSchemaPgbouncer.ignoreStartupParameters) &&
        Objects.equals(this.serverLifetime, jsonSchemaPgbouncer.serverLifetime) &&
        Objects.equals(this.autodbPoolMode, jsonSchemaPgbouncer.autodbPoolMode) &&
        Objects.equals(this.serverIdleTimeout, jsonSchemaPgbouncer.serverIdleTimeout) &&
        Objects.equals(this.autodbMaxDbConnections, jsonSchemaPgbouncer.autodbMaxDbConnections) &&
        Objects.equals(this.serverResetQueryAlways, jsonSchemaPgbouncer.serverResetQueryAlways) &&
        Objects.equals(this.autodbPoolSize, jsonSchemaPgbouncer.autodbPoolSize) &&
        Objects.equals(this.autodbIdleTimeout, jsonSchemaPgbouncer.autodbIdleTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minPoolSize, ignoreStartupParameters, serverLifetime, autodbPoolMode, serverIdleTimeout, autodbMaxDbConnections, serverResetQueryAlways, autodbPoolSize, autodbIdleTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonSchemaPgbouncer {\n");
    sb.append("    minPoolSize: ").append(toIndentedString(minPoolSize)).append("\n");
    sb.append("    ignoreStartupParameters: ").append(toIndentedString(ignoreStartupParameters)).append("\n");
    sb.append("    serverLifetime: ").append(toIndentedString(serverLifetime)).append("\n");
    sb.append("    autodbPoolMode: ").append(toIndentedString(autodbPoolMode)).append("\n");
    sb.append("    serverIdleTimeout: ").append(toIndentedString(serverIdleTimeout)).append("\n");
    sb.append("    autodbMaxDbConnections: ").append(toIndentedString(autodbMaxDbConnections)).append("\n");
    sb.append("    serverResetQueryAlways: ").append(toIndentedString(serverResetQueryAlways)).append("\n");
    sb.append("    autodbPoolSize: ").append(toIndentedString(autodbPoolSize)).append("\n");
    sb.append("    autodbIdleTimeout: ").append(toIndentedString(autodbIdleTimeout)).append("\n");
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

    // add `min_pool_size` to the URL query string
    if (getMinPoolSize() != null) {
      joiner.add(String.format("%smin_pool_size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMinPoolSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ignore_startup_parameters` to the URL query string
    if (getIgnoreStartupParameters() != null) {
      for (int i = 0; i < getIgnoreStartupParameters().size(); i++) {
        joiner.add(String.format("%signore_startup_parameters%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getIgnoreStartupParameters().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `server_lifetime` to the URL query string
    if (getServerLifetime() != null) {
      joiner.add(String.format("%sserver_lifetime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServerLifetime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `autodb_pool_mode` to the URL query string
    if (getAutodbPoolMode() != null) {
      joiner.add(String.format("%sautodb_pool_mode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAutodbPoolMode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `server_idle_timeout` to the URL query string
    if (getServerIdleTimeout() != null) {
      joiner.add(String.format("%sserver_idle_timeout%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServerIdleTimeout()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `autodb_max_db_connections` to the URL query string
    if (getAutodbMaxDbConnections() != null) {
      joiner.add(String.format("%sautodb_max_db_connections%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAutodbMaxDbConnections()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `server_reset_query_always` to the URL query string
    if (getServerResetQueryAlways() != null) {
      joiner.add(String.format("%sserver_reset_query_always%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServerResetQueryAlways()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `autodb_pool_size` to the URL query string
    if (getAutodbPoolSize() != null) {
      joiner.add(String.format("%sautodb_pool_size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAutodbPoolSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `autodb_idle_timeout` to the URL query string
    if (getAutodbIdleTimeout() != null) {
      joiner.add(String.format("%sautodb_idle_timeout%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAutodbIdleTimeout()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

