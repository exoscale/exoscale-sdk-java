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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Load Balancer Service healthcheck
 */
@JsonPropertyOrder({
  LoadBalancerServiceHealthcheck.JSON_PROPERTY_MODE,
  LoadBalancerServiceHealthcheck.JSON_PROPERTY_INTERVAL,
  LoadBalancerServiceHealthcheck.JSON_PROPERTY_URI,
  LoadBalancerServiceHealthcheck.JSON_PROPERTY_PORT,
  LoadBalancerServiceHealthcheck.JSON_PROPERTY_TIMEOUT,
  LoadBalancerServiceHealthcheck.JSON_PROPERTY_RETRIES,
  LoadBalancerServiceHealthcheck.JSON_PROPERTY_TLS_SNI
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T14:27:11.860946+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class LoadBalancerServiceHealthcheck {
  /**
   * Healthcheck mode
   */
  public enum ModeEnum {
    TCP("tcp"),
    
    HTTP("http"),
    
    HTTPS("https");

    private String value;

    ModeEnum(String value) {
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
    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MODE = "mode";
  private ModeEnum mode;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private Long interval;

  public static final String JSON_PROPERTY_URI = "uri";
  private String uri;

  public static final String JSON_PROPERTY_PORT = "port";
  private Long port;

  public static final String JSON_PROPERTY_TIMEOUT = "timeout";
  private Long timeout;

  public static final String JSON_PROPERTY_RETRIES = "retries";
  private Long retries;

  public static final String JSON_PROPERTY_TLS_SNI = "tls-sni";
  private String tlsSni;

  public LoadBalancerServiceHealthcheck() { 
  }

  public LoadBalancerServiceHealthcheck mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Healthcheck mode
   * @return mode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ModeEnum getMode() {
    return mode;
  }


  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }


  public LoadBalancerServiceHealthcheck interval(Long interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Healthcheck interval (default: 10). Must be greater than or equal to Timeout
   * minimum: 5
   * maximum: 300
   * @return interval
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getInterval() {
    return interval;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterval(Long interval) {
    this.interval = interval;
  }


  public LoadBalancerServiceHealthcheck uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * An endpoint to use for the HTTP healthcheck, e.g. &#39;/status&#39;
   * @return uri
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUri() {
    return uri;
  }


  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUri(String uri) {
    this.uri = uri;
  }


  public LoadBalancerServiceHealthcheck port(Long port) {
    this.port = port;
    return this;
  }

   /**
   * Healthcheck port
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


  public LoadBalancerServiceHealthcheck timeout(Long timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Healthcheck timeout value (default: 2). Must be lower than or equal to Interval
   * minimum: 2
   * maximum: 60
   * @return timeout
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTimeout() {
    return timeout;
  }


  @JsonProperty(JSON_PROPERTY_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeout(Long timeout) {
    this.timeout = timeout;
  }


  public LoadBalancerServiceHealthcheck retries(Long retries) {
    this.retries = retries;
    return this;
  }

   /**
   * Number of retries before considering a Service failed
   * minimum: 1
   * maximum: 20
   * @return retries
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRetries() {
    return retries;
  }


  @JsonProperty(JSON_PROPERTY_RETRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetries(Long retries) {
    this.retries = retries;
  }


  public LoadBalancerServiceHealthcheck tlsSni(String tlsSni) {
    this.tlsSni = tlsSni;
    return this;
  }

   /**
   * SNI domain for HTTPS healthchecks
   * @return tlsSni
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TLS_SNI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTlsSni() {
    return tlsSni;
  }


  @JsonProperty(JSON_PROPERTY_TLS_SNI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTlsSni(String tlsSni) {
    this.tlsSni = tlsSni;
  }


  /**
   * Return true if this load-balancer-service-healthcheck object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadBalancerServiceHealthcheck loadBalancerServiceHealthcheck = (LoadBalancerServiceHealthcheck) o;
    return Objects.equals(this.mode, loadBalancerServiceHealthcheck.mode) &&
        Objects.equals(this.interval, loadBalancerServiceHealthcheck.interval) &&
        Objects.equals(this.uri, loadBalancerServiceHealthcheck.uri) &&
        Objects.equals(this.port, loadBalancerServiceHealthcheck.port) &&
        Objects.equals(this.timeout, loadBalancerServiceHealthcheck.timeout) &&
        Objects.equals(this.retries, loadBalancerServiceHealthcheck.retries) &&
        Objects.equals(this.tlsSni, loadBalancerServiceHealthcheck.tlsSni);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, interval, uri, port, timeout, retries, tlsSni);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadBalancerServiceHealthcheck {\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    tlsSni: ").append(toIndentedString(tlsSni)).append("\n");
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

    // add `mode` to the URL query string
    if (getMode() != null) {
      joiner.add(String.format("%smode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `interval` to the URL query string
    if (getInterval() != null) {
      joiner.add(String.format("%sinterval%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInterval()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `uri` to the URL query string
    if (getUri() != null) {
      joiner.add(String.format("%suri%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUri()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `port` to the URL query string
    if (getPort() != null) {
      joiner.add(String.format("%sport%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPort()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `timeout` to the URL query string
    if (getTimeout() != null) {
      joiner.add(String.format("%stimeout%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeout()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `retries` to the URL query string
    if (getRetries() != null) {
      joiner.add(String.format("%sretries%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRetries()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tls-sni` to the URL query string
    if (getTlsSni() != null) {
      joiner.add(String.format("%stls-sni%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTlsSni()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

