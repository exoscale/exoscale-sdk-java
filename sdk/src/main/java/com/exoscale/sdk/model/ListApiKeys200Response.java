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
import com.exoscale.sdk.model.IamApiKey;
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
 * ListApiKeys200Response
 */
@JsonPropertyOrder({
  ListApiKeys200Response.JSON_PROPERTY_API_KEYS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-22T07:06:13.134792Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ListApiKeys200Response {
  public static final String JSON_PROPERTY_API_KEYS = "api-keys";
  private List<IamApiKey> apiKeys;

  public ListApiKeys200Response() { 
  }

  public ListApiKeys200Response apiKeys(List<IamApiKey> apiKeys) {
    this.apiKeys = apiKeys;
    return this;
  }

  public ListApiKeys200Response addApiKeysItem(IamApiKey apiKeysItem) {
    if (this.apiKeys == null) {
      this.apiKeys = new ArrayList<>();
    }
    this.apiKeys.add(apiKeysItem);
    return this;
  }

   /**
   * Get apiKeys
   * @return apiKeys
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<IamApiKey> getApiKeys() {
    return apiKeys;
  }


  @JsonProperty(JSON_PROPERTY_API_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiKeys(List<IamApiKey> apiKeys) {
    this.apiKeys = apiKeys;
  }


  /**
   * Return true if this list_api_keys_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListApiKeys200Response listApiKeys200Response = (ListApiKeys200Response) o;
    return Objects.equals(this.apiKeys, listApiKeys200Response.apiKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListApiKeys200Response {\n");
    sb.append("    apiKeys: ").append(toIndentedString(apiKeys)).append("\n");
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

    // add `api-keys` to the URL query string
    if (getApiKeys() != null) {
      for (int i = 0; i < getApiKeys().size(); i++) {
        if (getApiKeys().get(i) != null) {
          joiner.add(getApiKeys().get(i).toUrlQueryString(String.format("%sapi-keys%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

