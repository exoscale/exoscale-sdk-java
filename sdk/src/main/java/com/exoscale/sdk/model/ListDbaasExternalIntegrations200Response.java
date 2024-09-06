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
import com.exoscale.sdk.model.DbaasExternalIntegration;
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
 * ListDbaasExternalIntegrations200Response
 */
@JsonPropertyOrder({
  ListDbaasExternalIntegrations200Response.JSON_PROPERTY_EXTERNAL_INTEGRATIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-06T07:23:47.609974Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ListDbaasExternalIntegrations200Response {
  public static final String JSON_PROPERTY_EXTERNAL_INTEGRATIONS = "external-integrations";
  private List<DbaasExternalIntegration> externalIntegrations;

  public ListDbaasExternalIntegrations200Response() { 
  }

  public ListDbaasExternalIntegrations200Response externalIntegrations(List<DbaasExternalIntegration> externalIntegrations) {
    this.externalIntegrations = externalIntegrations;
    return this;
  }

  public ListDbaasExternalIntegrations200Response addExternalIntegrationsItem(DbaasExternalIntegration externalIntegrationsItem) {
    if (this.externalIntegrations == null) {
      this.externalIntegrations = new ArrayList<>();
    }
    this.externalIntegrations.add(externalIntegrationsItem);
    return this;
  }

   /**
   * Get externalIntegrations
   * @return externalIntegrations
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_INTEGRATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DbaasExternalIntegration> getExternalIntegrations() {
    return externalIntegrations;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_INTEGRATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalIntegrations(List<DbaasExternalIntegration> externalIntegrations) {
    this.externalIntegrations = externalIntegrations;
  }


  /**
   * Return true if this list_dbaas_external_integrations_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDbaasExternalIntegrations200Response listDbaasExternalIntegrations200Response = (ListDbaasExternalIntegrations200Response) o;
    return Objects.equals(this.externalIntegrations, listDbaasExternalIntegrations200Response.externalIntegrations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalIntegrations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDbaasExternalIntegrations200Response {\n");
    sb.append("    externalIntegrations: ").append(toIndentedString(externalIntegrations)).append("\n");
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

    // add `external-integrations` to the URL query string
    if (getExternalIntegrations() != null) {
      for (int i = 0; i < getExternalIntegrations().size(); i++) {
        if (getExternalIntegrations().get(i) != null) {
          joiner.add(getExternalIntegrations().get(i).toUrlQueryString(String.format("%sexternal-integrations%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

