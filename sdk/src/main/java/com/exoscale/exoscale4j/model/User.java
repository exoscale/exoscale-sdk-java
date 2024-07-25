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
import com.exoscale.exoscale4j.model.IamRole;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * User
 */
@JsonPropertyOrder({
  User.JSON_PROPERTY_SSO,
  User.JSON_PROPERTY_TWO_FACTOR_AUTHENTICATION,
  User.JSON_PROPERTY_EMAIL,
  User.JSON_PROPERTY_ID,
  User.JSON_PROPERTY_ROLE,
  User.JSON_PROPERTY_PENDING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-25T13:26:02.309598Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class User {
  public static final String JSON_PROPERTY_SSO = "sso";
  private Boolean sso;

  public static final String JSON_PROPERTY_TWO_FACTOR_AUTHENTICATION = "two-factor-authentication";
  private Boolean twoFactorAuthentication;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_ROLE = "role";
  private IamRole role;

  public static final String JSON_PROPERTY_PENDING = "pending";
  private Boolean pending;

  public User() { 
  }

  @JsonCreator
  public User(
    @JsonProperty(JSON_PROPERTY_EMAIL) String email, 
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_PENDING) Boolean pending
  ) {
  this();
    this.email = email;
    this.id = id;
    this.pending = pending;
  }

  public User sso(Boolean sso) {
    this.sso = sso;
    return this;
  }

   /**
   * SSO enabled
   * @return sso
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSso() {
    return sso;
  }


  @JsonProperty(JSON_PROPERTY_SSO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSso(Boolean sso) {
    this.sso = sso;
  }


  public User twoFactorAuthentication(Boolean twoFactorAuthentication) {
    this.twoFactorAuthentication = twoFactorAuthentication;
    return this;
  }

   /**
   * Two Factor Authentication enabled
   * @return twoFactorAuthentication
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TWO_FACTOR_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTwoFactorAuthentication() {
    return twoFactorAuthentication;
  }


  @JsonProperty(JSON_PROPERTY_TWO_FACTOR_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTwoFactorAuthentication(Boolean twoFactorAuthentication) {
    this.twoFactorAuthentication = twoFactorAuthentication;
  }


   /**
   * User Email
   * @return email
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }




   /**
   * User ID
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




  public User role(IamRole role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public IamRole getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRole(IamRole role) {
    this.role = role;
  }


   /**
   * True if the user has not yet created an Exoscale account
   * @return pending
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PENDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPending() {
    return pending;
  }




  /**
   * Return true if this user object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.sso, user.sso) &&
        Objects.equals(this.twoFactorAuthentication, user.twoFactorAuthentication) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.role, user.role) &&
        Objects.equals(this.pending, user.pending);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sso, twoFactorAuthentication, email, id, role, pending);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    sso: ").append(toIndentedString(sso)).append("\n");
    sb.append("    twoFactorAuthentication: ").append(toIndentedString(twoFactorAuthentication)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
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

    // add `sso` to the URL query string
    if (getSso() != null) {
      joiner.add(String.format("%ssso%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSso()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `two-factor-authentication` to the URL query string
    if (getTwoFactorAuthentication() != null) {
      joiner.add(String.format("%stwo-factor-authentication%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTwoFactorAuthentication()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `role` to the URL query string
    if (getRole() != null) {
      joiner.add(getRole().toUrlQueryString(prefix + "role" + suffix));
    }

    // add `pending` to the URL query string
    if (getPending() != null) {
      joiner.add(String.format("%spending%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPending()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

