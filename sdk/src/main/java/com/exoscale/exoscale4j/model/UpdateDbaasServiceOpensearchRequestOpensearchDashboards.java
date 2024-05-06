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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OpenSearch Dashboards settings
 */
@JsonPropertyOrder({
  UpdateDbaasServiceOpensearchRequestOpensearchDashboards.JSON_PROPERTY_OPENSEARCH_REQUEST_TIMEOUT,
  UpdateDbaasServiceOpensearchRequestOpensearchDashboards.JSON_PROPERTY_ENABLED,
  UpdateDbaasServiceOpensearchRequestOpensearchDashboards.JSON_PROPERTY_MAX_OLD_SPACE_SIZE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-06T19:17:33.820745+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class UpdateDbaasServiceOpensearchRequestOpensearchDashboards {
  public static final String JSON_PROPERTY_OPENSEARCH_REQUEST_TIMEOUT = "opensearch-request-timeout";
  private Long opensearchRequestTimeout;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_MAX_OLD_SPACE_SIZE = "max-old-space-size";
  private Long maxOldSpaceSize;

  public UpdateDbaasServiceOpensearchRequestOpensearchDashboards() { 
  }

  public UpdateDbaasServiceOpensearchRequestOpensearchDashboards opensearchRequestTimeout(Long opensearchRequestTimeout) {
    this.opensearchRequestTimeout = opensearchRequestTimeout;
    return this;
  }

   /**
   * Timeout in milliseconds for requests made by OpenSearch Dashboards towards OpenSearch (default: 30000)
   * minimum: 5000
   * maximum: 120000
   * @return opensearchRequestTimeout
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENSEARCH_REQUEST_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getOpensearchRequestTimeout() {
    return opensearchRequestTimeout;
  }


  @JsonProperty(JSON_PROPERTY_OPENSEARCH_REQUEST_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpensearchRequestTimeout(Long opensearchRequestTimeout) {
    this.opensearchRequestTimeout = opensearchRequestTimeout;
  }


  public UpdateDbaasServiceOpensearchRequestOpensearchDashboards enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Enable or disable OpenSearch Dashboards (default: true)
   * @return enabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public UpdateDbaasServiceOpensearchRequestOpensearchDashboards maxOldSpaceSize(Long maxOldSpaceSize) {
    this.maxOldSpaceSize = maxOldSpaceSize;
    return this;
  }

   /**
   * Limits the maximum amount of memory (in MiB) the OpenSearch Dashboards process can use. This sets the max_old_space_size option of the nodejs running the OpenSearch Dashboards. Note: the memory reserved by OpenSearch Dashboards is not available for OpenSearch. (default: 128)
   * minimum: 64
   * maximum: 1024
   * @return maxOldSpaceSize
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_OLD_SPACE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaxOldSpaceSize() {
    return maxOldSpaceSize;
  }


  @JsonProperty(JSON_PROPERTY_MAX_OLD_SPACE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxOldSpaceSize(Long maxOldSpaceSize) {
    this.maxOldSpaceSize = maxOldSpaceSize;
  }


  /**
   * Return true if this update_dbaas_service_opensearch_request_opensearch_dashboards object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDbaasServiceOpensearchRequestOpensearchDashboards updateDbaasServiceOpensearchRequestOpensearchDashboards = (UpdateDbaasServiceOpensearchRequestOpensearchDashboards) o;
    return Objects.equals(this.opensearchRequestTimeout, updateDbaasServiceOpensearchRequestOpensearchDashboards.opensearchRequestTimeout) &&
        Objects.equals(this.enabled, updateDbaasServiceOpensearchRequestOpensearchDashboards.enabled) &&
        Objects.equals(this.maxOldSpaceSize, updateDbaasServiceOpensearchRequestOpensearchDashboards.maxOldSpaceSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opensearchRequestTimeout, enabled, maxOldSpaceSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDbaasServiceOpensearchRequestOpensearchDashboards {\n");
    sb.append("    opensearchRequestTimeout: ").append(toIndentedString(opensearchRequestTimeout)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    maxOldSpaceSize: ").append(toIndentedString(maxOldSpaceSize)).append("\n");
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

    // add `opensearch-request-timeout` to the URL query string
    if (getOpensearchRequestTimeout() != null) {
      joiner.add(String.format("%sopensearch-request-timeout%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOpensearchRequestTimeout()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `enabled` to the URL query string
    if (getEnabled() != null) {
      joiner.add(String.format("%senabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnabled()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `max-old-space-size` to the URL query string
    if (getMaxOldSpaceSize() != null) {
      joiner.add(String.format("%smax-old-space-size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxOldSpaceSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

