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
import com.exoscale.exoscale4j.model.ZoneName;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Zone
 */
@JsonPropertyOrder({
  Zone.JSON_PROPERTY_NAME,
  Zone.JSON_PROPERTY_API_ENDPOINT,
  Zone.JSON_PROPERTY_SOS_ENDPOINT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-07T09:01:40.924075Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Zone {
  public static final String JSON_PROPERTY_NAME = "name";
  private ZoneName name;

  public static final String JSON_PROPERTY_API_ENDPOINT = "api-endpoint";
  private String apiEndpoint;

  public static final String JSON_PROPERTY_SOS_ENDPOINT = "sos-endpoint";
  private String sosEndpoint;

  public Zone() { 
  }

  @JsonCreator
  public Zone(
    @JsonProperty(JSON_PROPERTY_API_ENDPOINT) String apiEndpoint, 
    @JsonProperty(JSON_PROPERTY_SOS_ENDPOINT) String sosEndpoint
  ) {
  this();
    this.apiEndpoint = apiEndpoint;
    this.sosEndpoint = sosEndpoint;
  }

  public Zone name(ZoneName name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ZoneName getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(ZoneName name) {
    this.name = name;
  }


   /**
   * Zone API endpoint
   * @return apiEndpoint
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApiEndpoint() {
    return apiEndpoint;
  }




   /**
   * Zone SOS endpoint
   * @return sosEndpoint
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOS_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSosEndpoint() {
    return sosEndpoint;
  }




  /**
   * Return true if this zone object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Zone zone = (Zone) o;
    return Objects.equals(this.name, zone.name) &&
        Objects.equals(this.apiEndpoint, zone.apiEndpoint) &&
        Objects.equals(this.sosEndpoint, zone.sosEndpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, apiEndpoint, sosEndpoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Zone {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    apiEndpoint: ").append(toIndentedString(apiEndpoint)).append("\n");
    sb.append("    sosEndpoint: ").append(toIndentedString(sosEndpoint)).append("\n");
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

    // add `api-endpoint` to the URL query string
    if (getApiEndpoint() != null) {
      joiner.add(String.format("%sapi-endpoint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getApiEndpoint()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sos-endpoint` to the URL query string
    if (getSosEndpoint() != null) {
      joiner.add(String.format("%ssos-endpoint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSosEndpoint()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

