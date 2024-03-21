/*
 * Exoscale Public API
 *  Infrastructure automation API, allowing programmatic access to all Exoscale products and services.  The [OpenAPI Specification](http://spec.openapis.org/oas/v3.0.3.html) source of this documentation can be obtained here:  * [JSON format](https://openapi-v2.exoscale.com/source.json) * [YAML format](https://openapi-v2.exoscale.com/source.yaml)
 *
 * OpenAPI spec version: 2.0.0
 * Contact: api@exoscale.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Opensearch connection information properties
 */
@Schema(description = "Opensearch connection information properties")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-08T17:23:40.261901+01:00[Europe/Vienna]")

public class DbaasserviceopensearchConnectioninfo {
  @JsonProperty("uri")
  private List<String> uri = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("dashboard-uri")
  private String dashboardUri = null;

  public DbaasserviceopensearchConnectioninfo uri(List<String> uri) {
    this.uri = uri;
    return this;
  }

  public DbaasserviceopensearchConnectioninfo addUriItem(String uriItem) {
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
  @Schema(description = "")
  public List<String> getUri() {
    return uri;
  }

  public void setUri(List<String> uri) {
    this.uri = uri;
  }

  public DbaasserviceopensearchConnectioninfo username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @Schema(description = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public DbaasserviceopensearchConnectioninfo password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @Schema(description = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public DbaasserviceopensearchConnectioninfo dashboardUri(String dashboardUri) {
    this.dashboardUri = dashboardUri;
    return this;
  }

   /**
   * Get dashboardUri
   * @return dashboardUri
  **/
  @Schema(description = "")
  public String getDashboardUri() {
    return dashboardUri;
  }

  public void setDashboardUri(String dashboardUri) {
    this.dashboardUri = dashboardUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasserviceopensearchConnectioninfo dbaasserviceopensearchConnectioninfo = (DbaasserviceopensearchConnectioninfo) o;
    return Objects.equals(this.uri, dbaasserviceopensearchConnectioninfo.uri) &&
        Objects.equals(this.username, dbaasserviceopensearchConnectioninfo.username) &&
        Objects.equals(this.password, dbaasserviceopensearchConnectioninfo.password) &&
        Objects.equals(this.dashboardUri, dbaasserviceopensearchConnectioninfo.dashboardUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, username, password, dashboardUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasserviceopensearchConnectioninfo {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
