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
import com.exoscale.sdk.model.EnumRsyslogFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DbaasEndpointRsyslogOptionalFields
 */
@JsonPropertyOrder({
  DbaasEndpointRsyslogOptionalFields.JSON_PROPERTY_SERVER,
  DbaasEndpointRsyslogOptionalFields.JSON_PROPERTY_PORT,
  DbaasEndpointRsyslogOptionalFields.JSON_PROPERTY_TLS,
  DbaasEndpointRsyslogOptionalFields.JSON_PROPERTY_FORMAT,
  DbaasEndpointRsyslogOptionalFields.JSON_PROPERTY_LOGLINE,
  DbaasEndpointRsyslogOptionalFields.JSON_PROPERTY_SD,
  DbaasEndpointRsyslogOptionalFields.JSON_PROPERTY_MAX_MESSAGE_SIZE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class DbaasEndpointRsyslogOptionalFields {
  public static final String JSON_PROPERTY_SERVER = "server";
  private String server;

  public static final String JSON_PROPERTY_PORT = "port";
  private Long port;

  public static final String JSON_PROPERTY_TLS = "tls";
  private Boolean tls;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private EnumRsyslogFormat format;

  public static final String JSON_PROPERTY_LOGLINE = "logline";
  private String logline;

  public static final String JSON_PROPERTY_SD = "sd";
  private String sd;

  public static final String JSON_PROPERTY_MAX_MESSAGE_SIZE = "max-message-size";
  private Long maxMessageSize;

  public DbaasEndpointRsyslogOptionalFields() { 
  }

  public DbaasEndpointRsyslogOptionalFields server(String server) {
    this.server = server;
    return this;
  }

   /**
   * Rsyslog server IP address or hostname
   * @return server
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServer() {
    return server;
  }


  @JsonProperty(JSON_PROPERTY_SERVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServer(String server) {
    this.server = server;
  }


  public DbaasEndpointRsyslogOptionalFields port(Long port) {
    this.port = port;
    return this;
  }

   /**
   * Rsyslog server port
   * minimum: 1
   * maximum: 65535
   * @return port
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPort() {
    return port;
  }


  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPort(Long port) {
    this.port = port;
  }


  public DbaasEndpointRsyslogOptionalFields tls(Boolean tls) {
    this.tls = tls;
    return this;
  }

   /**
   * Require TLS
   * @return tls
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTls() {
    return tls;
  }


  @JsonProperty(JSON_PROPERTY_TLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTls(Boolean tls) {
    this.tls = tls;
  }


  public DbaasEndpointRsyslogOptionalFields format(EnumRsyslogFormat format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EnumRsyslogFormat getFormat() {
    return format;
  }


  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormat(EnumRsyslogFormat format) {
    this.format = format;
  }


  public DbaasEndpointRsyslogOptionalFields logline(String logline) {
    this.logline = logline;
    return this;
  }

   /**
   * Custom syslog message format
   * @return logline
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogline() {
    return logline;
  }


  @JsonProperty(JSON_PROPERTY_LOGLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogline(String logline) {
    this.logline = logline;
  }


  public DbaasEndpointRsyslogOptionalFields sd(String sd) {
    this.sd = sd;
    return this;
  }

   /**
   * Structured data block for log message
   * @return sd
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSd() {
    return sd;
  }


  @JsonProperty(JSON_PROPERTY_SD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSd(String sd) {
    this.sd = sd;
  }


  public DbaasEndpointRsyslogOptionalFields maxMessageSize(Long maxMessageSize) {
    this.maxMessageSize = maxMessageSize;
    return this;
  }

   /**
   * Rsyslog max message size
   * minimum: 2048
   * maximum: 2147483647
   * @return maxMessageSize
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_MESSAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaxMessageSize() {
    return maxMessageSize;
  }


  @JsonProperty(JSON_PROPERTY_MAX_MESSAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxMessageSize(Long maxMessageSize) {
    this.maxMessageSize = maxMessageSize;
  }


  /**
   * Return true if this dbaas-endpoint-rsyslog-optional-fields object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasEndpointRsyslogOptionalFields dbaasEndpointRsyslogOptionalFields = (DbaasEndpointRsyslogOptionalFields) o;
    return Objects.equals(this.server, dbaasEndpointRsyslogOptionalFields.server) &&
        Objects.equals(this.port, dbaasEndpointRsyslogOptionalFields.port) &&
        Objects.equals(this.tls, dbaasEndpointRsyslogOptionalFields.tls) &&
        Objects.equals(this.format, dbaasEndpointRsyslogOptionalFields.format) &&
        Objects.equals(this.logline, dbaasEndpointRsyslogOptionalFields.logline) &&
        Objects.equals(this.sd, dbaasEndpointRsyslogOptionalFields.sd) &&
        Objects.equals(this.maxMessageSize, dbaasEndpointRsyslogOptionalFields.maxMessageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(server, port, tls, format, logline, sd, maxMessageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasEndpointRsyslogOptionalFields {\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    logline: ").append(toIndentedString(logline)).append("\n");
    sb.append("    sd: ").append(toIndentedString(sd)).append("\n");
    sb.append("    maxMessageSize: ").append(toIndentedString(maxMessageSize)).append("\n");
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

    // add `server` to the URL query string
    if (getServer() != null) {
      joiner.add(String.format("%sserver%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getServer()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `port` to the URL query string
    if (getPort() != null) {
      joiner.add(String.format("%sport%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPort()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tls` to the URL query string
    if (getTls() != null) {
      joiner.add(String.format("%stls%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTls()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `format` to the URL query string
    if (getFormat() != null) {
      joiner.add(String.format("%sformat%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFormat()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `logline` to the URL query string
    if (getLogline() != null) {
      joiner.add(String.format("%slogline%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLogline()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sd` to the URL query string
    if (getSd() != null) {
      joiner.add(String.format("%ssd%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSd()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `max-message-size` to the URL query string
    if (getMaxMessageSize() != null) {
      joiner.add(String.format("%smax-message-size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxMessageSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

