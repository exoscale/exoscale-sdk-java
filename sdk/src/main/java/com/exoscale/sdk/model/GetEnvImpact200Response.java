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
import com.exoscale.sdk.model.GetEnvImpact200ResponseEnvImpactValue;
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
 * GetEnvImpact200Response
 */
@JsonPropertyOrder({
  GetEnvImpact200Response.JSON_PROPERTY_ENV_IMPACT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class GetEnvImpact200Response {
  public static final String JSON_PROPERTY_ENV_IMPACT = "env_impact";
  private Map<String, GetEnvImpact200ResponseEnvImpactValue> envImpact = new HashMap<>();

  public GetEnvImpact200Response() { 
  }

  public GetEnvImpact200Response envImpact(Map<String, GetEnvImpact200ResponseEnvImpactValue> envImpact) {
    this.envImpact = envImpact;
    return this;
  }

  public GetEnvImpact200Response putEnvImpactItem(String key, GetEnvImpact200ResponseEnvImpactValue envImpactItem) {
    if (this.envImpact == null) {
      this.envImpact = new HashMap<>();
    }
    this.envImpact.put(key, envImpactItem);
    return this;
  }

   /**
   * Get envImpact
   * @return envImpact
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENV_IMPACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, GetEnvImpact200ResponseEnvImpactValue> getEnvImpact() {
    return envImpact;
  }


  @JsonProperty(JSON_PROPERTY_ENV_IMPACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvImpact(Map<String, GetEnvImpact200ResponseEnvImpactValue> envImpact) {
    this.envImpact = envImpact;
  }


  /**
   * Return true if this get_env_impact_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEnvImpact200Response getEnvImpact200Response = (GetEnvImpact200Response) o;
    return Objects.equals(this.envImpact, getEnvImpact200Response.envImpact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envImpact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEnvImpact200Response {\n");
    sb.append("    envImpact: ").append(toIndentedString(envImpact)).append("\n");
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

    // add `env_impact` to the URL query string
    if (getEnvImpact() != null) {
      for (String _key : getEnvImpact().keySet()) {
        if (getEnvImpact().get(_key) != null) {
          joiner.add(getEnvImpact().get(_key).toUrlQueryString(String.format("%senv_impact%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

