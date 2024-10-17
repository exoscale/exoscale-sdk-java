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
 * UpdateDbaasPostgresAllowReplicationRequest
 */
@JsonPropertyOrder({
  UpdateDbaasPostgresAllowReplicationRequest.JSON_PROPERTY_ALLOW_REPLICATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class UpdateDbaasPostgresAllowReplicationRequest {
  public static final String JSON_PROPERTY_ALLOW_REPLICATION = "allow-replication";
  private Boolean allowReplication;

  public UpdateDbaasPostgresAllowReplicationRequest() { 
  }

  public UpdateDbaasPostgresAllowReplicationRequest allowReplication(Boolean allowReplication) {
    this.allowReplication = allowReplication;
    return this;
  }

   /**
   * Get allowReplication
   * @return allowReplication
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOW_REPLICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowReplication() {
    return allowReplication;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_REPLICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowReplication(Boolean allowReplication) {
    this.allowReplication = allowReplication;
  }


  /**
   * Return true if this update_dbaas_postgres_allow_replication_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDbaasPostgresAllowReplicationRequest updateDbaasPostgresAllowReplicationRequest = (UpdateDbaasPostgresAllowReplicationRequest) o;
    return Objects.equals(this.allowReplication, updateDbaasPostgresAllowReplicationRequest.allowReplication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowReplication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDbaasPostgresAllowReplicationRequest {\n");
    sb.append("    allowReplication: ").append(toIndentedString(allowReplication)).append("\n");
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

    // add `allow-replication` to the URL query string
    if (getAllowReplication() != null) {
      joiner.add(String.format("%sallow-replication%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAllowReplication()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
