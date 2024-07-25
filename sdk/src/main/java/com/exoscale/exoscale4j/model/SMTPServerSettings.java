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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SMTPServerSettings
 */
@JsonPropertyOrder({
  SMTPServerSettings.JSON_PROPERTY_FROM_ADDRESS,
  SMTPServerSettings.JSON_PROPERTY_FROM_NAME,
  SMTPServerSettings.JSON_PROPERTY_HOST,
  SMTPServerSettings.JSON_PROPERTY_PASSWORD,
  SMTPServerSettings.JSON_PROPERTY_PORT,
  SMTPServerSettings.JSON_PROPERTY_SKIP_VERIFY,
  SMTPServerSettings.JSON_PROPERTY_STARTTLS_POLICY,
  SMTPServerSettings.JSON_PROPERTY_USERNAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-25T13:08:43.238996Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SMTPServerSettings {
  public static final String JSON_PROPERTY_FROM_ADDRESS = "from_address";
  private String fromAddress;

  public static final String JSON_PROPERTY_FROM_NAME = "from_name";
  private JsonNullable<String> fromName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HOST = "host";
  private String host;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private JsonNullable<String> password = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PORT = "port";
  private Integer port;

  public static final String JSON_PROPERTY_SKIP_VERIFY = "skip_verify";
  private Boolean skipVerify;

  /**
   * Gets or Sets starttlsPolicy
   */
  public enum StarttlsPolicyEnum {
    OPPORTUNISTICSTARTTLS("OpportunisticStartTLS"),
    
    MANDATORYSTARTTLS("MandatoryStartTLS"),
    
    NOSTARTTLS("NoStartTLS");

    private String value;

    StarttlsPolicyEnum(String value) {
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
    public static StarttlsPolicyEnum fromValue(String value) {
      for (StarttlsPolicyEnum b : StarttlsPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STARTTLS_POLICY = "starttls_policy";
  private StarttlsPolicyEnum starttlsPolicy;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private JsonNullable<String> username = JsonNullable.<String>undefined();

  public SMTPServerSettings() { 
  }

  public SMTPServerSettings fromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }

   /**
   * Get fromAddress
   * @return fromAddress
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FROM_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFromAddress() {
    return fromAddress;
  }


  @JsonProperty(JSON_PROPERTY_FROM_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }


  public SMTPServerSettings fromName(String fromName) {
    this.fromName = JsonNullable.<String>of(fromName);
    return this;
  }

   /**
   * Get fromName
   * @return fromName
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFromName() {
        return fromName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FROM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFromName_JsonNullable() {
    return fromName;
  }
  
  @JsonProperty(JSON_PROPERTY_FROM_NAME)
  public void setFromName_JsonNullable(JsonNullable<String> fromName) {
    this.fromName = fromName;
  }

  public void setFromName(String fromName) {
    this.fromName = JsonNullable.<String>of(fromName);
  }


  public SMTPServerSettings host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
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


  public SMTPServerSettings password(String password) {
    this.password = JsonNullable.<String>of(password);
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPassword() {
        return password.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPassword_JsonNullable() {
    return password;
  }
  
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  public void setPassword_JsonNullable(JsonNullable<String> password) {
    this.password = password;
  }

  public void setPassword(String password) {
    this.password = JsonNullable.<String>of(password);
  }


  public SMTPServerSettings port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * minimum: 1
   * maximum: 65535
   * @return port
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPort() {
    return port;
  }


  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPort(Integer port) {
    this.port = port;
  }


  public SMTPServerSettings skipVerify(Boolean skipVerify) {
    this.skipVerify = skipVerify;
    return this;
  }

   /**
   * Get skipVerify
   * @return skipVerify
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SKIP_VERIFY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSkipVerify() {
    return skipVerify;
  }


  @JsonProperty(JSON_PROPERTY_SKIP_VERIFY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkipVerify(Boolean skipVerify) {
    this.skipVerify = skipVerify;
  }


  public SMTPServerSettings starttlsPolicy(StarttlsPolicyEnum starttlsPolicy) {
    this.starttlsPolicy = starttlsPolicy;
    return this;
  }

   /**
   * Get starttlsPolicy
   * @return starttlsPolicy
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STARTTLS_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StarttlsPolicyEnum getStarttlsPolicy() {
    return starttlsPolicy;
  }


  @JsonProperty(JSON_PROPERTY_STARTTLS_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStarttlsPolicy(StarttlsPolicyEnum starttlsPolicy) {
    this.starttlsPolicy = starttlsPolicy;
  }


  public SMTPServerSettings username(String username) {
    this.username = JsonNullable.<String>of(username);
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getUsername() {
        return username.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUsername_JsonNullable() {
    return username;
  }
  
  @JsonProperty(JSON_PROPERTY_USERNAME)
  public void setUsername_JsonNullable(JsonNullable<String> username) {
    this.username = username;
  }

  public void setUsername(String username) {
    this.username = JsonNullable.<String>of(username);
  }


  /**
   * Return true if this SMTP_server_settings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SMTPServerSettings smTPServerSettings = (SMTPServerSettings) o;
    return Objects.equals(this.fromAddress, smTPServerSettings.fromAddress) &&
        equalsNullable(this.fromName, smTPServerSettings.fromName) &&
        Objects.equals(this.host, smTPServerSettings.host) &&
        equalsNullable(this.password, smTPServerSettings.password) &&
        Objects.equals(this.port, smTPServerSettings.port) &&
        Objects.equals(this.skipVerify, smTPServerSettings.skipVerify) &&
        Objects.equals(this.starttlsPolicy, smTPServerSettings.starttlsPolicy) &&
        equalsNullable(this.username, smTPServerSettings.username);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAddress, hashCodeNullable(fromName), host, hashCodeNullable(password), port, skipVerify, starttlsPolicy, hashCodeNullable(username));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SMTPServerSettings {\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    fromName: ").append(toIndentedString(fromName)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    skipVerify: ").append(toIndentedString(skipVerify)).append("\n");
    sb.append("    starttlsPolicy: ").append(toIndentedString(starttlsPolicy)).append("\n");
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

    // add `from_address` to the URL query string
    if (getFromAddress() != null) {
      joiner.add(String.format("%sfrom_address%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFromAddress()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `from_name` to the URL query string
    if (getFromName() != null) {
      joiner.add(String.format("%sfrom_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFromName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `host` to the URL query string
    if (getHost() != null) {
      joiner.add(String.format("%shost%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHost()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `password` to the URL query string
    if (getPassword() != null) {
      joiner.add(String.format("%spassword%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPassword()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `port` to the URL query string
    if (getPort() != null) {
      joiner.add(String.format("%sport%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPort()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `skip_verify` to the URL query string
    if (getSkipVerify() != null) {
      joiner.add(String.format("%sskip_verify%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSkipVerify()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `starttls_policy` to the URL query string
    if (getStarttlsPolicy() != null) {
      joiner.add(String.format("%sstarttls_policy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStarttlsPolicy()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `username` to the URL query string
    if (getUsername() != null) {
      joiner.add(String.format("%susername%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUsername()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

