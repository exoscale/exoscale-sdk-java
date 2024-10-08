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


package com.exoscale.sdk.model;

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
 * RegisterSshKeyRequest
 */
@JsonPropertyOrder({
  RegisterSshKeyRequest.JSON_PROPERTY_NAME,
  RegisterSshKeyRequest.JSON_PROPERTY_PUBLIC_KEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class RegisterSshKeyRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PUBLIC_KEY = "public-key";
  private String publicKey;

  public RegisterSshKeyRequest() { 
  }

  public RegisterSshKeyRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * SSH key name
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public RegisterSshKeyRequest publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

   /**
   * Public key value
   * @return publicKey
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PUBLIC_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPublicKey() {
    return publicKey;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }


  /**
   * Return true if this register_ssh_key_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterSshKeyRequest registerSshKeyRequest = (RegisterSshKeyRequest) o;
    return Objects.equals(this.name, registerSshKeyRequest.name) &&
        Objects.equals(this.publicKey, registerSshKeyRequest.publicKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, publicKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterSshKeyRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
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

    // add `public-key` to the URL query string
    if (getPublicKey() != null) {
      joiner.add(String.format("%spublic-key%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPublicKey()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

