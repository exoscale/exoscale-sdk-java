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
import com.exoscale.exoscale4j.model.DnsDomainRecord;
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
 * ListDnsDomainRecords200Response
 */
@JsonPropertyOrder({
  ListDnsDomainRecords200Response.JSON_PROPERTY_DNS_DOMAIN_RECORDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-10T11:13:25.453512+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class ListDnsDomainRecords200Response {
  public static final String JSON_PROPERTY_DNS_DOMAIN_RECORDS = "dns-domain-records";
  private List<DnsDomainRecord> dnsDomainRecords;

  public ListDnsDomainRecords200Response() { 
  }

  public ListDnsDomainRecords200Response dnsDomainRecords(List<DnsDomainRecord> dnsDomainRecords) {
    this.dnsDomainRecords = dnsDomainRecords;
    return this;
  }

  public ListDnsDomainRecords200Response addDnsDomainRecordsItem(DnsDomainRecord dnsDomainRecordsItem) {
    if (this.dnsDomainRecords == null) {
      this.dnsDomainRecords = new ArrayList<>();
    }
    this.dnsDomainRecords.add(dnsDomainRecordsItem);
    return this;
  }

   /**
   * Get dnsDomainRecords
   * @return dnsDomainRecords
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DNS_DOMAIN_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DnsDomainRecord> getDnsDomainRecords() {
    return dnsDomainRecords;
  }


  @JsonProperty(JSON_PROPERTY_DNS_DOMAIN_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDnsDomainRecords(List<DnsDomainRecord> dnsDomainRecords) {
    this.dnsDomainRecords = dnsDomainRecords;
  }


  /**
   * Return true if this list_dns_domain_records_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDnsDomainRecords200Response listDnsDomainRecords200Response = (ListDnsDomainRecords200Response) o;
    return Objects.equals(this.dnsDomainRecords, listDnsDomainRecords200Response.dnsDomainRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsDomainRecords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDnsDomainRecords200Response {\n");
    sb.append("    dnsDomainRecords: ").append(toIndentedString(dnsDomainRecords)).append("\n");
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

    // add `dns-domain-records` to the URL query string
    if (getDnsDomainRecords() != null) {
      for (int i = 0; i < getDnsDomainRecords().size(); i++) {
        if (getDnsDomainRecords().get(i) != null) {
          joiner.add(getDnsDomainRecords().get(i).toUrlQueryString(String.format("%sdns-domain-records%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

