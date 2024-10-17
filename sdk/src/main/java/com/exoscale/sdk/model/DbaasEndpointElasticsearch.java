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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DbaasEndpointElasticsearch
 */
@JsonPropertyOrder({
  DbaasEndpointElasticsearch.JSON_PROPERTY_URL,
  DbaasEndpointElasticsearch.JSON_PROPERTY_INDEX_PREFIX,
  DbaasEndpointElasticsearch.JSON_PROPERTY_INDEX_DAYS_MAX,
  DbaasEndpointElasticsearch.JSON_PROPERTY_TIMEOUT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class DbaasEndpointElasticsearch {
  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_INDEX_PREFIX = "index-prefix";
  private String indexPrefix;

  public static final String JSON_PROPERTY_INDEX_DAYS_MAX = "index-days-max";
  private Long indexDaysMax;

  public static final String JSON_PROPERTY_TIMEOUT = "timeout";
  private Long timeout;

  public DbaasEndpointElasticsearch() { 
  }

  public DbaasEndpointElasticsearch url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Elasticsearch connection URL
   * @return url
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  public DbaasEndpointElasticsearch indexPrefix(String indexPrefix) {
    this.indexPrefix = indexPrefix;
    return this;
  }

   /**
   * Elasticsearch index prefix
   * @return indexPrefix
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INDEX_PREFIX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIndexPrefix() {
    return indexPrefix;
  }


  @JsonProperty(JSON_PROPERTY_INDEX_PREFIX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIndexPrefix(String indexPrefix) {
    this.indexPrefix = indexPrefix;
  }


  public DbaasEndpointElasticsearch indexDaysMax(Long indexDaysMax) {
    this.indexDaysMax = indexDaysMax;
    return this;
  }

   /**
   * Maximum number of days of logs to keep
   * minimum: 1
   * maximum: 10000
   * @return indexDaysMax
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEX_DAYS_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getIndexDaysMax() {
    return indexDaysMax;
  }


  @JsonProperty(JSON_PROPERTY_INDEX_DAYS_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndexDaysMax(Long indexDaysMax) {
    this.indexDaysMax = indexDaysMax;
  }


  public DbaasEndpointElasticsearch timeout(Long timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Elasticsearch request timeout limit
   * minimum: 10
   * maximum: 120
   * @return timeout
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTimeout() {
    return timeout;
  }


  @JsonProperty(JSON_PROPERTY_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeout(Long timeout) {
    this.timeout = timeout;
  }


  /**
   * Return true if this dbaas-endpoint-elasticsearch object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasEndpointElasticsearch dbaasEndpointElasticsearch = (DbaasEndpointElasticsearch) o;
    return Objects.equals(this.url, dbaasEndpointElasticsearch.url) &&
        Objects.equals(this.indexPrefix, dbaasEndpointElasticsearch.indexPrefix) &&
        Objects.equals(this.indexDaysMax, dbaasEndpointElasticsearch.indexDaysMax) &&
        Objects.equals(this.timeout, dbaasEndpointElasticsearch.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, indexPrefix, indexDaysMax, timeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasEndpointElasticsearch {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    indexPrefix: ").append(toIndentedString(indexPrefix)).append("\n");
    sb.append("    indexDaysMax: ").append(toIndentedString(indexDaysMax)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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

    // add `url` to the URL query string
    if (getUrl() != null) {
      joiner.add(String.format("%surl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `index-prefix` to the URL query string
    if (getIndexPrefix() != null) {
      joiner.add(String.format("%sindex-prefix%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIndexPrefix()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `index-days-max` to the URL query string
    if (getIndexDaysMax() != null) {
      joiner.add(String.format("%sindex-days-max%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIndexDaysMax()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `timeout` to the URL query string
    if (getTimeout() != null) {
      joiner.add(String.format("%stimeout%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeout()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
