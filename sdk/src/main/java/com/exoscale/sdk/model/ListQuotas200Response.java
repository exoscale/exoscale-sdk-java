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
import com.exoscale.sdk.model.Quota;
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
 * ListQuotas200Response
 */
@JsonPropertyOrder({
  ListQuotas200Response.JSON_PROPERTY_QUOTAS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class ListQuotas200Response {
  public static final String JSON_PROPERTY_QUOTAS = "quotas";
  private List<Quota> quotas;

  public ListQuotas200Response() { 
  }

  public ListQuotas200Response quotas(List<Quota> quotas) {
    this.quotas = quotas;
    return this;
  }

  public ListQuotas200Response addQuotasItem(Quota quotasItem) {
    if (this.quotas == null) {
      this.quotas = new ArrayList<>();
    }
    this.quotas.add(quotasItem);
    return this;
  }

   /**
   * Get quotas
   * @return quotas
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUOTAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Quota> getQuotas() {
    return quotas;
  }


  @JsonProperty(JSON_PROPERTY_QUOTAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuotas(List<Quota> quotas) {
    this.quotas = quotas;
  }


  /**
   * Return true if this list_quotas_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListQuotas200Response listQuotas200Response = (ListQuotas200Response) o;
    return Objects.equals(this.quotas, listQuotas200Response.quotas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quotas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListQuotas200Response {\n");
    sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
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

    // add `quotas` to the URL query string
    if (getQuotas() != null) {
      for (int i = 0; i < getQuotas().size(); i++) {
        if (getQuotas().get(i) != null) {
          joiner.add(getQuotas().get(i).toUrlQueryString(String.format("%squotas%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

