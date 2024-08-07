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
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Kafka User secrets
 */
@JsonPropertyOrder({
  DbaasUserKafkaSecrets.JSON_PROPERTY_USERNAME,
  DbaasUserKafkaSecrets.JSON_PROPERTY_PASSWORD,
  DbaasUserKafkaSecrets.JSON_PROPERTY_ACCESS_CERT,
  DbaasUserKafkaSecrets.JSON_PROPERTY_ACCESS_CERT_EXPIRY,
  DbaasUserKafkaSecrets.JSON_PROPERTY_ACCESS_KEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-07T09:01:40.924075Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DbaasUserKafkaSecrets {
  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_ACCESS_CERT = "access-cert";
  private String accessCert;

  public static final String JSON_PROPERTY_ACCESS_CERT_EXPIRY = "access-cert-expiry";
  private OffsetDateTime accessCertExpiry;

  public static final String JSON_PROPERTY_ACCESS_KEY = "access-key";
  private String accessKey;

  public DbaasUserKafkaSecrets() { 
  }

  public DbaasUserKafkaSecrets username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Kafka username
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


  public DbaasUserKafkaSecrets password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Kafka password
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


  public DbaasUserKafkaSecrets accessCert(String accessCert) {
    this.accessCert = accessCert;
    return this;
  }

   /**
   * Kafka certificate
   * @return accessCert
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_CERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccessCert() {
    return accessCert;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_CERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessCert(String accessCert) {
    this.accessCert = accessCert;
  }


  public DbaasUserKafkaSecrets accessCertExpiry(OffsetDateTime accessCertExpiry) {
    this.accessCertExpiry = accessCertExpiry;
    return this;
  }

   /**
   * Get accessCertExpiry
   * @return accessCertExpiry
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_CERT_EXPIRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getAccessCertExpiry() {
    return accessCertExpiry;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_CERT_EXPIRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessCertExpiry(OffsetDateTime accessCertExpiry) {
    this.accessCertExpiry = accessCertExpiry;
  }


  public DbaasUserKafkaSecrets accessKey(String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

   /**
   * Kafka access key
   * @return accessKey
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCESS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccessKey() {
    return accessKey;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }


  /**
   * Return true if this dbaas-user-kafka-secrets object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasUserKafkaSecrets dbaasUserKafkaSecrets = (DbaasUserKafkaSecrets) o;
    return Objects.equals(this.username, dbaasUserKafkaSecrets.username) &&
        Objects.equals(this.password, dbaasUserKafkaSecrets.password) &&
        Objects.equals(this.accessCert, dbaasUserKafkaSecrets.accessCert) &&
        Objects.equals(this.accessCertExpiry, dbaasUserKafkaSecrets.accessCertExpiry) &&
        Objects.equals(this.accessKey, dbaasUserKafkaSecrets.accessKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, accessCert, accessCertExpiry, accessKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasUserKafkaSecrets {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    accessCert: ").append(toIndentedString(accessCert)).append("\n");
    sb.append("    accessCertExpiry: ").append(toIndentedString(accessCertExpiry)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
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

    // add `username` to the URL query string
    if (getUsername() != null) {
      joiner.add(String.format("%susername%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUsername()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `password` to the URL query string
    if (getPassword() != null) {
      joiner.add(String.format("%spassword%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPassword()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `access-cert` to the URL query string
    if (getAccessCert() != null) {
      joiner.add(String.format("%saccess-cert%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccessCert()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `access-cert-expiry` to the URL query string
    if (getAccessCertExpiry() != null) {
      joiner.add(String.format("%saccess-cert-expiry%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccessCertExpiry()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `access-key` to the URL query string
    if (getAccessKey() != null) {
      joiner.add(String.format("%saccess-key%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccessKey()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

