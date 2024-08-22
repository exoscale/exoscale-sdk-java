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
import com.exoscale.sdk.model.EnumSortOrder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GetDbaasServiceLogsRequest
 */
@JsonPropertyOrder({
  GetDbaasServiceLogsRequest.JSON_PROPERTY_LIMIT,
  GetDbaasServiceLogsRequest.JSON_PROPERTY_SORT_ORDER,
  GetDbaasServiceLogsRequest.JSON_PROPERTY_OFFSET
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-22T07:06:13.134792Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class GetDbaasServiceLogsRequest {
  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_SORT_ORDER = "sort-order";
  private EnumSortOrder sortOrder;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private String offset;

  public GetDbaasServiceLogsRequest() { 
  }

  public GetDbaasServiceLogsRequest limit(Long limit) {
    this.limit = limit;
    return this;
  }

   /**
   * How many log entries to receive at most, up to 500 (default: 100)
   * minimum: 1
   * maximum: 500
   * @return limit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(Long limit) {
    this.limit = limit;
  }


  public GetDbaasServiceLogsRequest sortOrder(EnumSortOrder sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EnumSortOrder getSortOrder() {
    return sortOrder;
  }


  @JsonProperty(JSON_PROPERTY_SORT_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortOrder(EnumSortOrder sortOrder) {
    this.sortOrder = sortOrder;
  }


  public GetDbaasServiceLogsRequest offset(String offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Opaque offset identifier
   * @return offset
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOffset() {
    return offset;
  }


  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOffset(String offset) {
    this.offset = offset;
  }


  /**
   * Return true if this get_dbaas_service_logs_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDbaasServiceLogsRequest getDbaasServiceLogsRequest = (GetDbaasServiceLogsRequest) o;
    return Objects.equals(this.limit, getDbaasServiceLogsRequest.limit) &&
        Objects.equals(this.sortOrder, getDbaasServiceLogsRequest.sortOrder) &&
        Objects.equals(this.offset, getDbaasServiceLogsRequest.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, sortOrder, offset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDbaasServiceLogsRequest {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

    // add `limit` to the URL query string
    if (getLimit() != null) {
      joiner.add(String.format("%slimit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLimit()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sort-order` to the URL query string
    if (getSortOrder() != null) {
      joiner.add(String.format("%ssort-order%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSortOrder()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `offset` to the URL query string
    if (getOffset() != null) {
      joiner.add(String.format("%soffset%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOffset()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

