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
 * Template settings for all new indexes
 */
@JsonPropertyOrder({
  UpdateDbaasServiceOpensearchRequestIndexTemplate.JSON_PROPERTY_MAPPING_NESTED_OBJECTS_LIMIT,
  UpdateDbaasServiceOpensearchRequestIndexTemplate.JSON_PROPERTY_NUMBER_OF_REPLICAS,
  UpdateDbaasServiceOpensearchRequestIndexTemplate.JSON_PROPERTY_NUMBER_OF_SHARDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-03T15:12:02.588416+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class UpdateDbaasServiceOpensearchRequestIndexTemplate {
  public static final String JSON_PROPERTY_MAPPING_NESTED_OBJECTS_LIMIT = "mapping-nested-objects-limit";
  private Long mappingNestedObjectsLimit;

  public static final String JSON_PROPERTY_NUMBER_OF_REPLICAS = "number-of-replicas";
  private Long numberOfReplicas;

  public static final String JSON_PROPERTY_NUMBER_OF_SHARDS = "number-of-shards";
  private Long numberOfShards;

  public UpdateDbaasServiceOpensearchRequestIndexTemplate() { 
  }

  public UpdateDbaasServiceOpensearchRequestIndexTemplate mappingNestedObjectsLimit(Long mappingNestedObjectsLimit) {
    this.mappingNestedObjectsLimit = mappingNestedObjectsLimit;
    return this;
  }

   /**
   * The maximum number of nested JSON objects that a single document can contain across all nested types. This limit helps to prevent out of memory errors when a document contains too many nested objects. Default is 10000.
   * minimum: 0
   * maximum: 100000
   * @return mappingNestedObjectsLimit
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAPPING_NESTED_OBJECTS_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMappingNestedObjectsLimit() {
    return mappingNestedObjectsLimit;
  }


  @JsonProperty(JSON_PROPERTY_MAPPING_NESTED_OBJECTS_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMappingNestedObjectsLimit(Long mappingNestedObjectsLimit) {
    this.mappingNestedObjectsLimit = mappingNestedObjectsLimit;
  }


  public UpdateDbaasServiceOpensearchRequestIndexTemplate numberOfReplicas(Long numberOfReplicas) {
    this.numberOfReplicas = numberOfReplicas;
    return this;
  }

   /**
   * The number of replicas each primary shard has.
   * minimum: 0
   * maximum: 29
   * @return numberOfReplicas
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_REPLICAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfReplicas() {
    return numberOfReplicas;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_REPLICAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfReplicas(Long numberOfReplicas) {
    this.numberOfReplicas = numberOfReplicas;
  }


  public UpdateDbaasServiceOpensearchRequestIndexTemplate numberOfShards(Long numberOfShards) {
    this.numberOfShards = numberOfShards;
    return this;
  }

   /**
   * The number of primary shards that an index should have.
   * minimum: 1
   * maximum: 1024
   * @return numberOfShards
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_SHARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfShards() {
    return numberOfShards;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_SHARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfShards(Long numberOfShards) {
    this.numberOfShards = numberOfShards;
  }


  /**
   * Return true if this update_dbaas_service_opensearch_request_index_template object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDbaasServiceOpensearchRequestIndexTemplate updateDbaasServiceOpensearchRequestIndexTemplate = (UpdateDbaasServiceOpensearchRequestIndexTemplate) o;
    return Objects.equals(this.mappingNestedObjectsLimit, updateDbaasServiceOpensearchRequestIndexTemplate.mappingNestedObjectsLimit) &&
        Objects.equals(this.numberOfReplicas, updateDbaasServiceOpensearchRequestIndexTemplate.numberOfReplicas) &&
        Objects.equals(this.numberOfShards, updateDbaasServiceOpensearchRequestIndexTemplate.numberOfShards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mappingNestedObjectsLimit, numberOfReplicas, numberOfShards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDbaasServiceOpensearchRequestIndexTemplate {\n");
    sb.append("    mappingNestedObjectsLimit: ").append(toIndentedString(mappingNestedObjectsLimit)).append("\n");
    sb.append("    numberOfReplicas: ").append(toIndentedString(numberOfReplicas)).append("\n");
    sb.append("    numberOfShards: ").append(toIndentedString(numberOfShards)).append("\n");
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

    // add `mapping-nested-objects-limit` to the URL query string
    if (getMappingNestedObjectsLimit() != null) {
      joiner.add(String.format("%smapping-nested-objects-limit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMappingNestedObjectsLimit()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `number-of-replicas` to the URL query string
    if (getNumberOfReplicas() != null) {
      joiner.add(String.format("%snumber-of-replicas%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNumberOfReplicas()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `number-of-shards` to the URL query string
    if (getNumberOfShards() != null) {
      joiner.add(String.format("%snumber-of-shards%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNumberOfShards()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

