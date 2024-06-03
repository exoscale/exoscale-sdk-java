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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Opensearch connection information properties
 */
@JsonPropertyOrder({
  DbaasServiceOpensearchConnectionInfo.JSON_PROPERTY_URI,
  DbaasServiceOpensearchConnectionInfo.JSON_PROPERTY_USERNAME,
  DbaasServiceOpensearchConnectionInfo.JSON_PROPERTY_PASSWORD,
  DbaasServiceOpensearchConnectionInfo.JSON_PROPERTY_DASHBOARD_URI
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-03T20:04:17.479783+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class DbaasServiceOpensearchConnectionInfo {
  public static final String JSON_PROPERTY_URI = "uri";
  private List<String> uri;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_DASHBOARD_URI = "dashboard-uri";
  private String dashboardUri;

  public DbaasServiceOpensearchConnectionInfo() { 
  }

  public DbaasServiceOpensearchConnectionInfo uri(List<String> uri) {
    this.uri = uri;
    return this;
  }

  public DbaasServiceOpensearchConnectionInfo addUriItem(String uriItem) {
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


  public DbaasServiceOpensearchConnectionInfo username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(String username) {
    this.username = username;
  }


  public DbaasServiceOpensearchConnectionInfo password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }


  public DbaasServiceOpensearchConnectionInfo dashboardUri(String dashboardUri) {
    this.dashboardUri = dashboardUri;
    return this;
  }

   /**
   * Get dashboardUri
   * @return dashboardUri
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DASHBOARD_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDashboardUri() {
    return dashboardUri;
  }


  @JsonProperty(JSON_PROPERTY_DASHBOARD_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDashboardUri(String dashboardUri) {
    this.dashboardUri = dashboardUri;
  }


  /**
   * Return true if this dbaas_service_opensearch_connection_info object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasServiceOpensearchConnectionInfo dbaasServiceOpensearchConnectionInfo = (DbaasServiceOpensearchConnectionInfo) o;
    return Objects.equals(this.uri, dbaasServiceOpensearchConnectionInfo.uri) &&
        Objects.equals(this.username, dbaasServiceOpensearchConnectionInfo.username) &&
        Objects.equals(this.password, dbaasServiceOpensearchConnectionInfo.password) &&
        Objects.equals(this.dashboardUri, dbaasServiceOpensearchConnectionInfo.dashboardUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, username, password, dashboardUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasServiceOpensearchConnectionInfo {\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    dashboardUri: ").append(toIndentedString(dashboardUri)).append("\n");
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

    // add `username` to the URL query string
    if (getUsername() != null) {
      joiner.add(String.format("%susername%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUsername()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `password` to the URL query string
    if (getPassword() != null) {
      joiner.add(String.format("%spassword%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPassword()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dashboard-uri` to the URL query string
    if (getDashboardUri() != null) {
      joiner.add(String.format("%sdashboard-uri%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDashboardUri()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

