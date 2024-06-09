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
import com.exoscale.exoscale4j.model.DnsDomain;
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
 * ListDnsDomains200Response
 */
@JsonPropertyOrder({
  ListDnsDomains200Response.JSON_PROPERTY_DNS_DOMAINS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-09T22:11:49.172310+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class ListDnsDomains200Response {
  public static final String JSON_PROPERTY_DNS_DOMAINS = "dns-domains";
  private List<DnsDomain> dnsDomains;

  public ListDnsDomains200Response() { 
  }

  public ListDnsDomains200Response dnsDomains(List<DnsDomain> dnsDomains) {
    this.dnsDomains = dnsDomains;
    return this;
  }

  public ListDnsDomains200Response addDnsDomainsItem(DnsDomain dnsDomainsItem) {
    if (this.dnsDomains == null) {
      this.dnsDomains = new ArrayList<>();
    }
    this.dnsDomains.add(dnsDomainsItem);
    return this;
  }

   /**
   * Get dnsDomains
   * @return dnsDomains
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DNS_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DnsDomain> getDnsDomains() {
    return dnsDomains;
  }


  @JsonProperty(JSON_PROPERTY_DNS_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDnsDomains(List<DnsDomain> dnsDomains) {
    this.dnsDomains = dnsDomains;
  }


  /**
   * Return true if this list_dns_domains_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDnsDomains200Response listDnsDomains200Response = (ListDnsDomains200Response) o;
    return Objects.equals(this.dnsDomains, listDnsDomains200Response.dnsDomains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsDomains);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDnsDomains200Response {\n");
    sb.append("    dnsDomains: ").append(toIndentedString(dnsDomains)).append("\n");
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

    // add `dns-domains` to the URL query string
    if (getDnsDomains() != null) {
      for (int i = 0; i < getDnsDomains().size(); i++) {
        if (getDnsDomains().get(i) != null) {
          joiner.add(getDnsDomains().get(i).toUrlQueryString(String.format("%sdns-domains%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

