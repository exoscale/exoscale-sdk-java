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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MySQL connection information properties
 */
@JsonPropertyOrder({
  DbaasServiceMysqlConnectionInfo.JSON_PROPERTY_URI,
  DbaasServiceMysqlConnectionInfo.JSON_PROPERTY_PARAMS,
  DbaasServiceMysqlConnectionInfo.JSON_PROPERTY_STANDBY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-07T09:01:40.924075Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DbaasServiceMysqlConnectionInfo {
  public static final String JSON_PROPERTY_URI = "uri";
  private List<String> uri;

  public static final String JSON_PROPERTY_PARAMS = "params";
  private List<Map<String, String>> params;

  public static final String JSON_PROPERTY_STANDBY = "standby";
  private List<String> standby;

  public DbaasServiceMysqlConnectionInfo() { 
  }

  public DbaasServiceMysqlConnectionInfo uri(List<String> uri) {
    this.uri = uri;
    return this;
  }

  public DbaasServiceMysqlConnectionInfo addUriItem(String uriItem) {
    if (this.uri == null) {
      this.uri = new ArrayList<>();
    }
    this.uri.add(uriItem);
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getUri() {
    return uri;
  }


  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUri(List<String> uri) {
    this.uri = uri;
  }


  public DbaasServiceMysqlConnectionInfo params(List<Map<String, String>> params) {
    this.params = params;
    return this;
  }

  public DbaasServiceMysqlConnectionInfo addParamsItem(Map<String, String> paramsItem) {
    if (this.params == null) {
      this.params = new ArrayList<>();
    }
    this.params.add(paramsItem);
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Map<String, String>> getParams() {
    return params;
  }


  @JsonProperty(JSON_PROPERTY_PARAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParams(List<Map<String, String>> params) {
    this.params = params;
  }


  public DbaasServiceMysqlConnectionInfo standby(List<String> standby) {
    this.standby = standby;
    return this;
  }

  public DbaasServiceMysqlConnectionInfo addStandbyItem(String standbyItem) {
    if (this.standby == null) {
      this.standby = new ArrayList<>();
    }
    this.standby.add(standbyItem);
    return this;
  }

   /**
   * Get standby
   * @return standby
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STANDBY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getStandby() {
    return standby;
  }


  @JsonProperty(JSON_PROPERTY_STANDBY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStandby(List<String> standby) {
    this.standby = standby;
  }


  /**
   * Return true if this dbaas_service_mysql_connection_info object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasServiceMysqlConnectionInfo dbaasServiceMysqlConnectionInfo = (DbaasServiceMysqlConnectionInfo) o;
    return Objects.equals(this.uri, dbaasServiceMysqlConnectionInfo.uri) &&
        Objects.equals(this.params, dbaasServiceMysqlConnectionInfo.params) &&
        Objects.equals(this.standby, dbaasServiceMysqlConnectionInfo.standby);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, params, standby);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasServiceMysqlConnectionInfo {\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    standby: ").append(toIndentedString(standby)).append("\n");
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

    // add `uri` to the URL query string
    if (getUri() != null) {
      for (int i = 0; i < getUri().size(); i++) {
        joiner.add(String.format("%suri%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getUri().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `params` to the URL query string
    if (getParams() != null) {
      for (int i = 0; i < getParams().size(); i++) {
        joiner.add(String.format("%sparams%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getParams().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `standby` to the URL query string
    if (getStandby() != null) {
      for (int i = 0; i < getStandby().size(); i++) {
        joiner.add(String.format("%sstandby%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getStandby().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}

