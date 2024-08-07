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
 * Elastic IP address healthcheck
 */
@JsonPropertyOrder({
  ElasticIpHealthcheck.JSON_PROPERTY_STRIKES_OK,
  ElasticIpHealthcheck.JSON_PROPERTY_TLS_SKIP_VERIFY,
  ElasticIpHealthcheck.JSON_PROPERTY_TLS_SNI,
  ElasticIpHealthcheck.JSON_PROPERTY_STRIKES_FAIL,
  ElasticIpHealthcheck.JSON_PROPERTY_MODE,
  ElasticIpHealthcheck.JSON_PROPERTY_PORT,
  ElasticIpHealthcheck.JSON_PROPERTY_URI,
  ElasticIpHealthcheck.JSON_PROPERTY_INTERVAL,
  ElasticIpHealthcheck.JSON_PROPERTY_TIMEOUT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-07T09:01:40.924075Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ElasticIpHealthcheck {
  public static final String JSON_PROPERTY_STRIKES_OK = "strikes-ok";
  private Long strikesOk;

  public static final String JSON_PROPERTY_TLS_SKIP_VERIFY = "tls-skip-verify";
  private Boolean tlsSkipVerify;

  public static final String JSON_PROPERTY_TLS_SNI = "tls-sni";
  private String tlsSni;

  public static final String JSON_PROPERTY_STRIKES_FAIL = "strikes-fail";
  private Long strikesFail;

  /**
   * Health check mode
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

  public static final String JSON_PROPERTY_PORT = "port";
  private Long port;

  public static final String JSON_PROPERTY_URI = "uri";
  private String uri;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private Long interval;

  public static final String JSON_PROPERTY_TIMEOUT = "timeout";
  private Long timeout;

  public ElasticIpHealthcheck() { 
  }

  public ElasticIpHealthcheck strikesOk(Long strikesOk) {
    this.strikesOk = strikesOk;
    return this;
  }

   /**
   * Number of attempts before considering the target healthy (default: 2)
   * minimum: 1
   * maximum: 20
   * @return strikesOk
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STRIKES_OK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStrikesOk() {
    return strikesOk;
  }


  @JsonProperty(JSON_PROPERTY_STRIKES_OK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrikesOk(Long strikesOk) {
    this.strikesOk = strikesOk;
  }


  public ElasticIpHealthcheck tlsSkipVerify(Boolean tlsSkipVerify) {
    this.tlsSkipVerify = tlsSkipVerify;
    return this;
  }

   /**
   * Skip TLS verification
   * @return tlsSkipVerify
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TLS_SKIP_VERIFY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTlsSkipVerify() {
    return tlsSkipVerify;
  }


  @JsonProperty(JSON_PROPERTY_TLS_SKIP_VERIFY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTlsSkipVerify(Boolean tlsSkipVerify) {
    this.tlsSkipVerify = tlsSkipVerify;
  }


  public ElasticIpHealthcheck tlsSni(String tlsSni) {
    this.tlsSni = tlsSni;
    return this;
  }

   /**
   * An optional domain or subdomain to check TLS against
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


  public ElasticIpHealthcheck strikesFail(Long strikesFail) {
    this.strikesFail = strikesFail;
    return this;
  }

   /**
   * Number of attempts before considering the target unhealthy (default: 3)
   * minimum: 1
   * maximum: 20
   * @return strikesFail
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STRIKES_FAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStrikesFail() {
    return strikesFail;
  }


  @JsonProperty(JSON_PROPERTY_STRIKES_FAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrikesFail(Long strikesFail) {
    this.strikesFail = strikesFail;
  }


  public ElasticIpHealthcheck mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Health check mode
   * @return mode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ModeEnum getMode() {
    return mode;
  }


  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }


  public ElasticIpHealthcheck port(Long port) {
    this.port = port;
    return this;
  }

   /**
   * Health check port
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


  public ElasticIpHealthcheck uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * An endpoint to use for the health check, for example &#39;/status&#39;
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


  public ElasticIpHealthcheck interval(Long interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Interval between the checks in seconds (default: 10)
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


  public ElasticIpHealthcheck timeout(Long timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Health check timeout value in seconds (default: 2)
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


  /**
   * Return true if this elastic-ip-healthcheck object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticIpHealthcheck elasticIpHealthcheck = (ElasticIpHealthcheck) o;
    return Objects.equals(this.strikesOk, elasticIpHealthcheck.strikesOk) &&
        Objects.equals(this.tlsSkipVerify, elasticIpHealthcheck.tlsSkipVerify) &&
        Objects.equals(this.tlsSni, elasticIpHealthcheck.tlsSni) &&
        Objects.equals(this.strikesFail, elasticIpHealthcheck.strikesFail) &&
        Objects.equals(this.mode, elasticIpHealthcheck.mode) &&
        Objects.equals(this.port, elasticIpHealthcheck.port) &&
        Objects.equals(this.uri, elasticIpHealthcheck.uri) &&
        Objects.equals(this.interval, elasticIpHealthcheck.interval) &&
        Objects.equals(this.timeout, elasticIpHealthcheck.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strikesOk, tlsSkipVerify, tlsSni, strikesFail, mode, port, uri, interval, timeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticIpHealthcheck {\n");
    sb.append("    strikesOk: ").append(toIndentedString(strikesOk)).append("\n");
    sb.append("    tlsSkipVerify: ").append(toIndentedString(tlsSkipVerify)).append("\n");
    sb.append("    tlsSni: ").append(toIndentedString(tlsSni)).append("\n");
    sb.append("    strikesFail: ").append(toIndentedString(strikesFail)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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

    // add `strikes-ok` to the URL query string
    if (getStrikesOk() != null) {
      joiner.add(String.format("%sstrikes-ok%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStrikesOk()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tls-skip-verify` to the URL query string
    if (getTlsSkipVerify() != null) {
      joiner.add(String.format("%stls-skip-verify%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTlsSkipVerify()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `tls-sni` to the URL query string
    if (getTlsSni() != null) {
      joiner.add(String.format("%stls-sni%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTlsSni()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `strikes-fail` to the URL query string
    if (getStrikesFail() != null) {
      joiner.add(String.format("%sstrikes-fail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStrikesFail()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `mode` to the URL query string
    if (getMode() != null) {
      joiner.add(String.format("%smode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `port` to the URL query string
    if (getPort() != null) {
      joiner.add(String.format("%sport%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPort()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `uri` to the URL query string
    if (getUri() != null) {
      joiner.add(String.format("%suri%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUri()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `interval` to the URL query string
    if (getInterval() != null) {
      joiner.add(String.format("%sinterval%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInterval()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `timeout` to the URL query string
    if (getTimeout() != null) {
      joiner.add(String.format("%stimeout%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeout()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

