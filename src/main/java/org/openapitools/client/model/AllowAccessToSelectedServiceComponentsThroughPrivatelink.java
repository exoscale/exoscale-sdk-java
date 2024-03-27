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


package org.openapitools.client.model;

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
 * AllowAccessToSelectedServiceComponentsThroughPrivatelink
 */
@JsonPropertyOrder({
  AllowAccessToSelectedServiceComponentsThroughPrivatelink.JSON_PROPERTY_GRAFANA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-27T18:00:26.790082348Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class AllowAccessToSelectedServiceComponentsThroughPrivatelink {
  public static final String JSON_PROPERTY_GRAFANA = "grafana";
  private Boolean grafana;

  public AllowAccessToSelectedServiceComponentsThroughPrivatelink() { 
  }

  public AllowAccessToSelectedServiceComponentsThroughPrivatelink grafana(Boolean grafana) {
    this.grafana = grafana;
    return this;
  }

   /**
   * Get grafana
   * @return grafana
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRAFANA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getGrafana() {
    return grafana;
  }


  @JsonProperty(JSON_PROPERTY_GRAFANA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrafana(Boolean grafana) {
    this.grafana = grafana;
  }


  /**
   * Return true if this Allow_access_to_selected_service_components_through_Privatelink object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllowAccessToSelectedServiceComponentsThroughPrivatelink allowAccessToSelectedServiceComponentsThroughPrivatelink = (AllowAccessToSelectedServiceComponentsThroughPrivatelink) o;
    return Objects.equals(this.grafana, allowAccessToSelectedServiceComponentsThroughPrivatelink.grafana);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grafana);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllowAccessToSelectedServiceComponentsThroughPrivatelink {\n");
    sb.append("    grafana: ").append(toIndentedString(grafana)).append("\n");
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

    // add `grafana` to the URL query string
    if (getGrafana() != null) {
      joiner.add(String.format("%sgrafana%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGrafana()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

