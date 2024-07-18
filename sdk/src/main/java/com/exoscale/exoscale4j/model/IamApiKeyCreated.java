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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * IAM API Key
 */
@JsonPropertyOrder({
  IamApiKeyCreated.JSON_PROPERTY_NAME,
  IamApiKeyCreated.JSON_PROPERTY_KEY,
  IamApiKeyCreated.JSON_PROPERTY_SECRET,
  IamApiKeyCreated.JSON_PROPERTY_ROLE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-18T11:55:07.035952Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IamApiKeyCreated {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_SECRET = "secret";
  private String secret;

  public static final String JSON_PROPERTY_ROLE_ID = "role-id";
  private UUID roleId;

  public IamApiKeyCreated() { 
  }

  @JsonCreator
  public IamApiKeyCreated(
    @JsonProperty(JSON_PROPERTY_SECRET) String secret
  ) {
  this();
    this.secret = secret;
  }

  public IamApiKeyCreated name(String name) {
    this.name = name;
    return this;
  }

   /**
   * IAM API Key name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public IamApiKeyCreated key(String key) {
    this.key = key;
    return this;
  }

   /**
   * IAM API Key
   * @return key
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(String key) {
    this.key = key;
  }


   /**
   * IAM API Key Secret
   * @return secret
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecret() {
    return secret;
  }




  public IamApiKeyCreated roleId(UUID roleId) {
    this.roleId = roleId;
    return this;
  }

   /**
   * IAM API Key Role ID
   * @return roleId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getRoleId() {
    return roleId;
  }


  @JsonProperty(JSON_PROPERTY_ROLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoleId(UUID roleId) {
    this.roleId = roleId;
  }


  /**
   * Return true if this iam-api-key-created object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IamApiKeyCreated iamApiKeyCreated = (IamApiKeyCreated) o;
    return Objects.equals(this.name, iamApiKeyCreated.name) &&
        Objects.equals(this.key, iamApiKeyCreated.key) &&
        Objects.equals(this.secret, iamApiKeyCreated.secret) &&
        Objects.equals(this.roleId, iamApiKeyCreated.roleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, key, secret, roleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IamApiKeyCreated {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `key` to the URL query string
    if (getKey() != null) {
      joiner.add(String.format("%skey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKey()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `secret` to the URL query string
    if (getSecret() != null) {
      joiner.add(String.format("%ssecret%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSecret()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `role-id` to the URL query string
    if (getRoleId() != null) {
      joiner.add(String.format("%srole-id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRoleId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

