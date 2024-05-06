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
 * Kafka authentication methods
 */
@JsonPropertyOrder({
  DbaasServiceKafkaAuthenticationMethods.JSON_PROPERTY_CERTIFICATE,
  DbaasServiceKafkaAuthenticationMethods.JSON_PROPERTY_SASL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T19:17:33.820745+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class DbaasServiceKafkaAuthenticationMethods {
  public static final String JSON_PROPERTY_CERTIFICATE = "certificate";
  private Boolean certificate;

  public static final String JSON_PROPERTY_SASL = "sasl";
  private Boolean sasl;

  public DbaasServiceKafkaAuthenticationMethods() { 
  }

  public DbaasServiceKafkaAuthenticationMethods certificate(Boolean certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * Whether certificate/SSL authentication is enabled
   * @return certificate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCertificate() {
    return certificate;
  }


  @JsonProperty(JSON_PROPERTY_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCertificate(Boolean certificate) {
    this.certificate = certificate;
  }


  public DbaasServiceKafkaAuthenticationMethods sasl(Boolean sasl) {
    this.sasl = sasl;
    return this;
  }

   /**
   * Whether SASL authentication is enabled
   * @return sasl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SASL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSasl() {
    return sasl;
  }


  @JsonProperty(JSON_PROPERTY_SASL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSasl(Boolean sasl) {
    this.sasl = sasl;
  }


  /**
   * Return true if this dbaas_service_kafka_authentication_methods object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasServiceKafkaAuthenticationMethods dbaasServiceKafkaAuthenticationMethods = (DbaasServiceKafkaAuthenticationMethods) o;
    return Objects.equals(this.certificate, dbaasServiceKafkaAuthenticationMethods.certificate) &&
        Objects.equals(this.sasl, dbaasServiceKafkaAuthenticationMethods.sasl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate, sasl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasServiceKafkaAuthenticationMethods {\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    sasl: ").append(toIndentedString(sasl)).append("\n");
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

    // add `certificate` to the URL query string
    if (getCertificate() != null) {
      joiner.add(String.format("%scertificate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCertificate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sasl` to the URL query string
    if (getSasl() != null) {
      joiner.add(String.format("%ssasl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSasl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

