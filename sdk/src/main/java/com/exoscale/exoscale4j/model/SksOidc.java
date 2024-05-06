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
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SKS Cluster OpenID config map
 */
@JsonPropertyOrder({
  SksOidc.JSON_PROPERTY_CLIENT_ID,
  SksOidc.JSON_PROPERTY_ISSUER_URL,
  SksOidc.JSON_PROPERTY_USERNAME_CLAIM,
  SksOidc.JSON_PROPERTY_USERNAME_PREFIX,
  SksOidc.JSON_PROPERTY_GROUPS_CLAIM,
  SksOidc.JSON_PROPERTY_GROUPS_PREFIX,
  SksOidc.JSON_PROPERTY_REQUIRED_CLAIM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T14:27:11.860946+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class SksOidc {
  public static final String JSON_PROPERTY_CLIENT_ID = "client-id";
  private String clientId;

  public static final String JSON_PROPERTY_ISSUER_URL = "issuer-url";
  private String issuerUrl;

  public static final String JSON_PROPERTY_USERNAME_CLAIM = "username-claim";
  private String usernameClaim;

  public static final String JSON_PROPERTY_USERNAME_PREFIX = "username-prefix";
  private String usernamePrefix;

  public static final String JSON_PROPERTY_GROUPS_CLAIM = "groups-claim";
  private String groupsClaim;

  public static final String JSON_PROPERTY_GROUPS_PREFIX = "groups-prefix";
  private String groupsPrefix;

  public static final String JSON_PROPERTY_REQUIRED_CLAIM = "required-claim";
  private Map<String, String> requiredClaim = new HashMap<>();

  public SksOidc() { 
  }

  public SksOidc clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * OpenID client ID
   * @return clientId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientId() {
    return clientId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public SksOidc issuerUrl(String issuerUrl) {
    this.issuerUrl = issuerUrl;
    return this;
  }

   /**
   * OpenID provider URL
   * @return issuerUrl
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ISSUER_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIssuerUrl() {
    return issuerUrl;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIssuerUrl(String issuerUrl) {
    this.issuerUrl = issuerUrl;
  }


  public SksOidc usernameClaim(String usernameClaim) {
    this.usernameClaim = usernameClaim;
    return this;
  }

   /**
   * JWT claim to use as the user name
   * @return usernameClaim
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME_CLAIM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsernameClaim() {
    return usernameClaim;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME_CLAIM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsernameClaim(String usernameClaim) {
    this.usernameClaim = usernameClaim;
  }


  public SksOidc usernamePrefix(String usernamePrefix) {
    this.usernamePrefix = usernamePrefix;
    return this;
  }

   /**
   * Prefix prepended to username claims
   * @return usernamePrefix
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsernamePrefix() {
    return usernamePrefix;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsernamePrefix(String usernamePrefix) {
    this.usernamePrefix = usernamePrefix;
  }


  public SksOidc groupsClaim(String groupsClaim) {
    this.groupsClaim = groupsClaim;
    return this;
  }

   /**
   * JWT claim to use as the user&#39;s group
   * @return groupsClaim
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUPS_CLAIM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupsClaim() {
    return groupsClaim;
  }


  @JsonProperty(JSON_PROPERTY_GROUPS_CLAIM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupsClaim(String groupsClaim) {
    this.groupsClaim = groupsClaim;
  }


  public SksOidc groupsPrefix(String groupsPrefix) {
    this.groupsPrefix = groupsPrefix;
    return this;
  }

   /**
   * Prefix prepended to group claims
   * @return groupsPrefix
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUPS_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupsPrefix() {
    return groupsPrefix;
  }


  @JsonProperty(JSON_PROPERTY_GROUPS_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupsPrefix(String groupsPrefix) {
    this.groupsPrefix = groupsPrefix;
  }


  public SksOidc requiredClaim(Map<String, String> requiredClaim) {
    this.requiredClaim = requiredClaim;
    return this;
  }

  public SksOidc putRequiredClaimItem(String key, String requiredClaimItem) {
    if (this.requiredClaim == null) {
      this.requiredClaim = new HashMap<>();
    }
    this.requiredClaim.put(key, requiredClaimItem);
    return this;
  }

   /**
   * A key value map that describes a required claim in the ID Token
   * @return requiredClaim
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUIRED_CLAIM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getRequiredClaim() {
    return requiredClaim;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRED_CLAIM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequiredClaim(Map<String, String> requiredClaim) {
    this.requiredClaim = requiredClaim;
  }


  /**
   * Return true if this sks-oidc object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SksOidc sksOidc = (SksOidc) o;
    return Objects.equals(this.clientId, sksOidc.clientId) &&
        Objects.equals(this.issuerUrl, sksOidc.issuerUrl) &&
        Objects.equals(this.usernameClaim, sksOidc.usernameClaim) &&
        Objects.equals(this.usernamePrefix, sksOidc.usernamePrefix) &&
        Objects.equals(this.groupsClaim, sksOidc.groupsClaim) &&
        Objects.equals(this.groupsPrefix, sksOidc.groupsPrefix) &&
        Objects.equals(this.requiredClaim, sksOidc.requiredClaim);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, issuerUrl, usernameClaim, usernamePrefix, groupsClaim, groupsPrefix, requiredClaim);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SksOidc {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    issuerUrl: ").append(toIndentedString(issuerUrl)).append("\n");
    sb.append("    usernameClaim: ").append(toIndentedString(usernameClaim)).append("\n");
    sb.append("    usernamePrefix: ").append(toIndentedString(usernamePrefix)).append("\n");
    sb.append("    groupsClaim: ").append(toIndentedString(groupsClaim)).append("\n");
    sb.append("    groupsPrefix: ").append(toIndentedString(groupsPrefix)).append("\n");
    sb.append("    requiredClaim: ").append(toIndentedString(requiredClaim)).append("\n");
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

    // add `client-id` to the URL query string
    if (getClientId() != null) {
      joiner.add(String.format("%sclient-id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClientId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `issuer-url` to the URL query string
    if (getIssuerUrl() != null) {
      joiner.add(String.format("%sissuer-url%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIssuerUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `username-claim` to the URL query string
    if (getUsernameClaim() != null) {
      joiner.add(String.format("%susername-claim%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUsernameClaim()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `username-prefix` to the URL query string
    if (getUsernamePrefix() != null) {
      joiner.add(String.format("%susername-prefix%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUsernamePrefix()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `groups-claim` to the URL query string
    if (getGroupsClaim() != null) {
      joiner.add(String.format("%sgroups-claim%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGroupsClaim()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `groups-prefix` to the URL query string
    if (getGroupsPrefix() != null) {
      joiner.add(String.format("%sgroups-prefix%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGroupsPrefix()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `required-claim` to the URL query string
    if (getRequiredClaim() != null) {
      for (String _key : getRequiredClaim().keySet()) {
        joiner.add(String.format("%srequired-claim%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getRequiredClaim().get(_key), URLEncoder.encode(String.valueOf(getRequiredClaim().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}

