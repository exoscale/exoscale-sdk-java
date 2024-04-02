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


package org.openapitools.client.model;

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
 * CreateDbaasMysqlDatabaseRequest
 */
@JsonPropertyOrder({
  CreateDbaasMysqlDatabaseRequest.JSON_PROPERTY_DATABASE_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-28T09:42:26.601985678Z[Etc/UTC]", comments = "Generator version: 7.5.0-SNAPSHOT")
public class CreateDbaasMysqlDatabaseRequest {
  public static final String JSON_PROPERTY_DATABASE_NAME = "database-name";
  private String databaseName;

  public CreateDbaasMysqlDatabaseRequest() { 
  }

  public CreateDbaasMysqlDatabaseRequest databaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
  }

   /**
   * Get databaseName
   * @return databaseName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATABASE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDatabaseName() {
    return databaseName;
  }


  @JsonProperty(JSON_PROPERTY_DATABASE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }


  /**
   * Return true if this create_dbaas_mysql_database_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDbaasMysqlDatabaseRequest createDbaasMysqlDatabaseRequest = (CreateDbaasMysqlDatabaseRequest) o;
    return Objects.equals(this.databaseName, createDbaasMysqlDatabaseRequest.databaseName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDbaasMysqlDatabaseRequest {\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
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

    // add `database-name` to the URL query string
    if (getDatabaseName() != null) {
      joiner.add(String.format("%sdatabase-name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDatabaseName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

