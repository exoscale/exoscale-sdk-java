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
 * JsonSchemaSchemaRegistry
 */
@JsonPropertyOrder({
  JsonSchemaSchemaRegistry.JSON_PROPERTY_LEADER_ELIGIBILITY,
  JsonSchemaSchemaRegistry.JSON_PROPERTY_TOPIC_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-05T21:27:44.654335085+02:00[Europe/Zurich]", comments = "Generator version: 7.4.0")
public class JsonSchemaSchemaRegistry {
  public static final String JSON_PROPERTY_LEADER_ELIGIBILITY = "leader_eligibility";
  private Boolean leaderEligibility;

  public static final String JSON_PROPERTY_TOPIC_NAME = "topic_name";
  private String topicName;

  public JsonSchemaSchemaRegistry() { 
  }

  public JsonSchemaSchemaRegistry leaderEligibility(Boolean leaderEligibility) {
    this.leaderEligibility = leaderEligibility;
    return this;
  }

   /**
   * If true, Karapace / Schema Registry on the service nodes can participate in leader election. It might be needed to disable this when the schemas topic is replicated to a secondary cluster and Karapace / Schema Registry there must not participate in leader election. Defaults to &#x60;true&#x60;.
   * @return leaderEligibility
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEADER_ELIGIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLeaderEligibility() {
    return leaderEligibility;
  }


  @JsonProperty(JSON_PROPERTY_LEADER_ELIGIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeaderEligibility(Boolean leaderEligibility) {
    this.leaderEligibility = leaderEligibility;
  }


  public JsonSchemaSchemaRegistry topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

   /**
   * The durable single partition topic that acts as the durable log for the data. This topic must be compacted to avoid losing data due to retention policy. Please note that changing this configuration in an existing Schema Registry / Karapace setup leads to previous schemas being inaccessible, data encoded with them potentially unreadable and schema ID sequence put out of order. It&#39;s only possible to do the switch while Schema Registry / Karapace is disabled. Defaults to &#x60;_schemas&#x60;.
   * @return topicName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOPIC_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTopicName() {
    return topicName;
  }


  @JsonProperty(JSON_PROPERTY_TOPIC_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }


  /**
   * Return true if this json-schema-schema-registry object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonSchemaSchemaRegistry jsonSchemaSchemaRegistry = (JsonSchemaSchemaRegistry) o;
    return Objects.equals(this.leaderEligibility, jsonSchemaSchemaRegistry.leaderEligibility) &&
        Objects.equals(this.topicName, jsonSchemaSchemaRegistry.topicName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leaderEligibility, topicName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonSchemaSchemaRegistry {\n");
    sb.append("    leaderEligibility: ").append(toIndentedString(leaderEligibility)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
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

    // add `leader_eligibility` to the URL query string
    if (getLeaderEligibility() != null) {
      joiner.add(String.format("%sleader_eligibility%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLeaderEligibility()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `topic_name` to the URL query string
    if (getTopicName() != null) {
      joiner.add(String.format("%stopic_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTopicName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

