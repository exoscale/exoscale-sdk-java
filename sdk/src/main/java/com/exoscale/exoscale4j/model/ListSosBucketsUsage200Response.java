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
import com.exoscale.exoscale4j.model.SosBucketUsage;
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
 * ListSosBucketsUsage200Response
 */
@JsonPropertyOrder({
  ListSosBucketsUsage200Response.JSON_PROPERTY_SOS_BUCKETS_USAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-05T21:27:44.654335085+02:00[Europe/Zurich]", comments = "Generator version: 7.4.0")
public class ListSosBucketsUsage200Response {
  public static final String JSON_PROPERTY_SOS_BUCKETS_USAGE = "sos-buckets-usage";
  private List<SosBucketUsage> sosBucketsUsage;

  public ListSosBucketsUsage200Response() { 
  }

  public ListSosBucketsUsage200Response sosBucketsUsage(List<SosBucketUsage> sosBucketsUsage) {
    this.sosBucketsUsage = sosBucketsUsage;
    return this;
  }

  public ListSosBucketsUsage200Response addSosBucketsUsageItem(SosBucketUsage sosBucketsUsageItem) {
    if (this.sosBucketsUsage == null) {
      this.sosBucketsUsage = new ArrayList<>();
    }
    this.sosBucketsUsage.add(sosBucketsUsageItem);
    return this;
  }

   /**
   * Get sosBucketsUsage
   * @return sosBucketsUsage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOS_BUCKETS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SosBucketUsage> getSosBucketsUsage() {
    return sosBucketsUsage;
  }


  @JsonProperty(JSON_PROPERTY_SOS_BUCKETS_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSosBucketsUsage(List<SosBucketUsage> sosBucketsUsage) {
    this.sosBucketsUsage = sosBucketsUsage;
  }


  /**
   * Return true if this list_sos_buckets_usage_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSosBucketsUsage200Response listSosBucketsUsage200Response = (ListSosBucketsUsage200Response) o;
    return Objects.equals(this.sosBucketsUsage, listSosBucketsUsage200Response.sosBucketsUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sosBucketsUsage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSosBucketsUsage200Response {\n");
    sb.append("    sosBucketsUsage: ").append(toIndentedString(sosBucketsUsage)).append("\n");
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

    // add `sos-buckets-usage` to the URL query string
    if (getSosBucketsUsage() != null) {
      for (int i = 0; i < getSosBucketsUsage().size(); i++) {
        if (getSosBucketsUsage().get(i) != null) {
          joiner.add(getSosBucketsUsage().get(i).toUrlQueryString(String.format("%ssos-buckets-usage%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

