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
 * OpensearchEmailSenderSettings
 */
@JsonPropertyOrder({
  OpensearchEmailSenderSettings.JSON_PROPERTY_EMAIL_SENDER_NAME,
  OpensearchEmailSenderSettings.JSON_PROPERTY_EMAIL_SENDER_PASSWORD,
  OpensearchEmailSenderSettings.JSON_PROPERTY_EMAIL_SENDER_USERNAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T17:28:20.527227Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OpensearchEmailSenderSettings {
  public static final String JSON_PROPERTY_EMAIL_SENDER_NAME = "email_sender_name";
  private String emailSenderName;

  public static final String JSON_PROPERTY_EMAIL_SENDER_PASSWORD = "email_sender_password";
  private String emailSenderPassword;

  public static final String JSON_PROPERTY_EMAIL_SENDER_USERNAME = "email_sender_username";
  private String emailSenderUsername;

  public OpensearchEmailSenderSettings() { 
  }

  public OpensearchEmailSenderSettings emailSenderName(String emailSenderName) {
    this.emailSenderName = emailSenderName;
    return this;
  }

   /**
   * This should be identical to the Sender name defined in Opensearch dashboards
   * @return emailSenderName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL_SENDER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmailSenderName() {
    return emailSenderName;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_SENDER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmailSenderName(String emailSenderName) {
    this.emailSenderName = emailSenderName;
  }


  public OpensearchEmailSenderSettings emailSenderPassword(String emailSenderPassword) {
    this.emailSenderPassword = emailSenderPassword;
    return this;
  }

   /**
   * Sender password for Opensearch alerts to authenticate with SMTP server
   * @return emailSenderPassword
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL_SENDER_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmailSenderPassword() {
    return emailSenderPassword;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_SENDER_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmailSenderPassword(String emailSenderPassword) {
    this.emailSenderPassword = emailSenderPassword;
  }


  public OpensearchEmailSenderSettings emailSenderUsername(String emailSenderUsername) {
    this.emailSenderUsername = emailSenderUsername;
    return this;
  }

   /**
   * Get emailSenderUsername
   * @return emailSenderUsername
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL_SENDER_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmailSenderUsername() {
    return emailSenderUsername;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_SENDER_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmailSenderUsername(String emailSenderUsername) {
    this.emailSenderUsername = emailSenderUsername;
  }


  /**
   * Return true if this Opensearch_Email_Sender_Settings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpensearchEmailSenderSettings opensearchEmailSenderSettings = (OpensearchEmailSenderSettings) o;
    return Objects.equals(this.emailSenderName, opensearchEmailSenderSettings.emailSenderName) &&
        Objects.equals(this.emailSenderPassword, opensearchEmailSenderSettings.emailSenderPassword) &&
        Objects.equals(this.emailSenderUsername, opensearchEmailSenderSettings.emailSenderUsername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailSenderName, emailSenderPassword, emailSenderUsername);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpensearchEmailSenderSettings {\n");
    sb.append("    emailSenderName: ").append(toIndentedString(emailSenderName)).append("\n");
    sb.append("    emailSenderPassword: ").append(toIndentedString(emailSenderPassword)).append("\n");
    sb.append("    emailSenderUsername: ").append(toIndentedString(emailSenderUsername)).append("\n");
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

    // add `email_sender_name` to the URL query string
    if (getEmailSenderName() != null) {
      joiner.add(String.format("%semail_sender_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmailSenderName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `email_sender_password` to the URL query string
    if (getEmailSenderPassword() != null) {
      joiner.add(String.format("%semail_sender_password%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmailSenderPassword()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `email_sender_username` to the URL query string
    if (getEmailSenderUsername() != null) {
      joiner.add(String.format("%semail_sender_username%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmailSenderUsername()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

