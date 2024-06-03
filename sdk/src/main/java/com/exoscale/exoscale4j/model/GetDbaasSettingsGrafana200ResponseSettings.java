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
import com.exoscale.exoscale4j.model.GetDbaasSettingsGrafana200ResponseSettingsGrafana;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GetDbaasSettingsGrafana200ResponseSettings
 */
@JsonPropertyOrder({
  GetDbaasSettingsGrafana200ResponseSettings.JSON_PROPERTY_GRAFANA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-03T15:12:02.588416+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class GetDbaasSettingsGrafana200ResponseSettings {
  public static final String JSON_PROPERTY_GRAFANA = "grafana";
  private GetDbaasSettingsGrafana200ResponseSettingsGrafana grafana;

  public GetDbaasSettingsGrafana200ResponseSettings() { 
  }

  public GetDbaasSettingsGrafana200ResponseSettings grafana(GetDbaasSettingsGrafana200ResponseSettingsGrafana grafana) {
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

  public GetDbaasSettingsGrafana200ResponseSettingsGrafana getGrafana() {
    return grafana;
  }


  @JsonProperty(JSON_PROPERTY_GRAFANA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrafana(GetDbaasSettingsGrafana200ResponseSettingsGrafana grafana) {
    this.grafana = grafana;
  }


  /**
   * Return true if this get_dbaas_settings_grafana_200_response_settings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDbaasSettingsGrafana200ResponseSettings getDbaasSettingsGrafana200ResponseSettings = (GetDbaasSettingsGrafana200ResponseSettings) o;
    return Objects.equals(this.grafana, getDbaasSettingsGrafana200ResponseSettings.grafana);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grafana);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDbaasSettingsGrafana200ResponseSettings {\n");
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
      joiner.add(getGrafana().toUrlQueryString(prefix + "grafana" + suffix));
    }

    return joiner.toString();
  }
}

