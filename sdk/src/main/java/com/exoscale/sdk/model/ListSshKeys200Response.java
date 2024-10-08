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
import com.exoscale.sdk.model.SshKey;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ListSshKeys200Response
 */
@JsonPropertyOrder({
  ListSshKeys200Response.JSON_PROPERTY_SSH_KEYS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class ListSshKeys200Response {
  public static final String JSON_PROPERTY_SSH_KEYS = "ssh-keys";
  private List<SshKey> sshKeys;

  public ListSshKeys200Response() { 
  }

  public ListSshKeys200Response sshKeys(List<SshKey> sshKeys) {
    this.sshKeys = sshKeys;
    return this;
  }

  public ListSshKeys200Response addSshKeysItem(SshKey sshKeysItem) {
    if (this.sshKeys == null) {
      this.sshKeys = new ArrayList<>();
    }
    this.sshKeys.add(sshKeysItem);
    return this;
  }

   /**
   * Get sshKeys
   * @return sshKeys
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SSH_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SshKey> getSshKeys() {
    return sshKeys;
  }


  @JsonProperty(JSON_PROPERTY_SSH_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSshKeys(List<SshKey> sshKeys) {
    this.sshKeys = sshKeys;
  }


  /**
   * Return true if this list_ssh_keys_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSshKeys200Response listSshKeys200Response = (ListSshKeys200Response) o;
    return Objects.equals(this.sshKeys, listSshKeys200Response.sshKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sshKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSshKeys200Response {\n");
    sb.append("    sshKeys: ").append(toIndentedString(sshKeys)).append("\n");
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

    // add `ssh-keys` to the URL query string
    if (getSshKeys() != null) {
      for (int i = 0; i < getSshKeys().size(); i++) {
        if (getSshKeys().get(i) != null) {
          joiner.add(getSshKeys().get(i).toUrlQueryString(String.format("%sssh-keys%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

