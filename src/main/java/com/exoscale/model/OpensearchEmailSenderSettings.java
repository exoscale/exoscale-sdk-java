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


package com.exoscale.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OpensearchEmailSenderSettings
 */
@JsonPropertyOrder({
  OpensearchEmailSenderSettings.JSON_PROPERTY_EMAIL_SENDER_NAME,
  OpensearchEmailSenderSettings.JSON_PROPERTY_EMAIL_SENDER_PASSWORD,
  OpensearchEmailSenderSettings.JSON_PROPERTY_EMAIL_SENDER_USERNAME
})
@JsonTypeName("Opensearch_Email_Sender_Settings")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T21:01:33.231699+01:00[Europe/Vienna]")
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

}

