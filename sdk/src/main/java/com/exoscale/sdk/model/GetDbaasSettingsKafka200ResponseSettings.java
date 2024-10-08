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
import com.exoscale.sdk.model.GetDbaasSettingsKafka200ResponseSettingsKafka;
import com.exoscale.sdk.model.GetDbaasSettingsKafka200ResponseSettingsKafkaConnect;
import com.exoscale.sdk.model.GetDbaasSettingsKafka200ResponseSettingsKafkaRest;
import com.exoscale.sdk.model.GetDbaasSettingsKafka200ResponseSettingsSchemaRegistry;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GetDbaasSettingsKafka200ResponseSettings
 */
@JsonPropertyOrder({
  GetDbaasSettingsKafka200ResponseSettings.JSON_PROPERTY_KAFKA,
  GetDbaasSettingsKafka200ResponseSettings.JSON_PROPERTY_KAFKA_CONNECT,
  GetDbaasSettingsKafka200ResponseSettings.JSON_PROPERTY_KAFKA_REST,
  GetDbaasSettingsKafka200ResponseSettings.JSON_PROPERTY_SCHEMA_REGISTRY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class GetDbaasSettingsKafka200ResponseSettings {
  public static final String JSON_PROPERTY_KAFKA = "kafka";
  private GetDbaasSettingsKafka200ResponseSettingsKafka kafka;

  public static final String JSON_PROPERTY_KAFKA_CONNECT = "kafka-connect";
  private GetDbaasSettingsKafka200ResponseSettingsKafkaConnect kafkaConnect;

  public static final String JSON_PROPERTY_KAFKA_REST = "kafka-rest";
  private GetDbaasSettingsKafka200ResponseSettingsKafkaRest kafkaRest;

  public static final String JSON_PROPERTY_SCHEMA_REGISTRY = "schema-registry";
  private GetDbaasSettingsKafka200ResponseSettingsSchemaRegistry schemaRegistry;

  public GetDbaasSettingsKafka200ResponseSettings() { 
  }

  public GetDbaasSettingsKafka200ResponseSettings kafka(GetDbaasSettingsKafka200ResponseSettingsKafka kafka) {
    this.kafka = kafka;
    return this;
  }

   /**
   * Get kafka
   * @return kafka
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KAFKA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetDbaasSettingsKafka200ResponseSettingsKafka getKafka() {
    return kafka;
  }


  @JsonProperty(JSON_PROPERTY_KAFKA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKafka(GetDbaasSettingsKafka200ResponseSettingsKafka kafka) {
    this.kafka = kafka;
  }


  public GetDbaasSettingsKafka200ResponseSettings kafkaConnect(GetDbaasSettingsKafka200ResponseSettingsKafkaConnect kafkaConnect) {
    this.kafkaConnect = kafkaConnect;
    return this;
  }

   /**
   * Get kafkaConnect
   * @return kafkaConnect
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KAFKA_CONNECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetDbaasSettingsKafka200ResponseSettingsKafkaConnect getKafkaConnect() {
    return kafkaConnect;
  }


  @JsonProperty(JSON_PROPERTY_KAFKA_CONNECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKafkaConnect(GetDbaasSettingsKafka200ResponseSettingsKafkaConnect kafkaConnect) {
    this.kafkaConnect = kafkaConnect;
  }


  public GetDbaasSettingsKafka200ResponseSettings kafkaRest(GetDbaasSettingsKafka200ResponseSettingsKafkaRest kafkaRest) {
    this.kafkaRest = kafkaRest;
    return this;
  }

   /**
   * Get kafkaRest
   * @return kafkaRest
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KAFKA_REST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetDbaasSettingsKafka200ResponseSettingsKafkaRest getKafkaRest() {
    return kafkaRest;
  }


  @JsonProperty(JSON_PROPERTY_KAFKA_REST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKafkaRest(GetDbaasSettingsKafka200ResponseSettingsKafkaRest kafkaRest) {
    this.kafkaRest = kafkaRest;
  }


  public GetDbaasSettingsKafka200ResponseSettings schemaRegistry(GetDbaasSettingsKafka200ResponseSettingsSchemaRegistry schemaRegistry) {
    this.schemaRegistry = schemaRegistry;
    return this;
  }

   /**
   * Get schemaRegistry
   * @return schemaRegistry
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEMA_REGISTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetDbaasSettingsKafka200ResponseSettingsSchemaRegistry getSchemaRegistry() {
    return schemaRegistry;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA_REGISTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemaRegistry(GetDbaasSettingsKafka200ResponseSettingsSchemaRegistry schemaRegistry) {
    this.schemaRegistry = schemaRegistry;
  }


  /**
   * Return true if this get_dbaas_settings_kafka_200_response_settings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDbaasSettingsKafka200ResponseSettings getDbaasSettingsKafka200ResponseSettings = (GetDbaasSettingsKafka200ResponseSettings) o;
    return Objects.equals(this.kafka, getDbaasSettingsKafka200ResponseSettings.kafka) &&
        Objects.equals(this.kafkaConnect, getDbaasSettingsKafka200ResponseSettings.kafkaConnect) &&
        Objects.equals(this.kafkaRest, getDbaasSettingsKafka200ResponseSettings.kafkaRest) &&
        Objects.equals(this.schemaRegistry, getDbaasSettingsKafka200ResponseSettings.schemaRegistry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kafka, kafkaConnect, kafkaRest, schemaRegistry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDbaasSettingsKafka200ResponseSettings {\n");
    sb.append("    kafka: ").append(toIndentedString(kafka)).append("\n");
    sb.append("    kafkaConnect: ").append(toIndentedString(kafkaConnect)).append("\n");
    sb.append("    kafkaRest: ").append(toIndentedString(kafkaRest)).append("\n");
    sb.append("    schemaRegistry: ").append(toIndentedString(schemaRegistry)).append("\n");
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

    // add `kafka` to the URL query string
    if (getKafka() != null) {
      joiner.add(getKafka().toUrlQueryString(prefix + "kafka" + suffix));
    }

    // add `kafka-connect` to the URL query string
    if (getKafkaConnect() != null) {
      joiner.add(getKafkaConnect().toUrlQueryString(prefix + "kafka-connect" + suffix));
    }

    // add `kafka-rest` to the URL query string
    if (getKafkaRest() != null) {
      joiner.add(getKafkaRest().toUrlQueryString(prefix + "kafka-rest" + suffix));
    }

    // add `schema-registry` to the URL query string
    if (getSchemaRegistry() != null) {
      joiner.add(getSchemaRegistry().toUrlQueryString(prefix + "schema-registry" + suffix));
    }

    return joiner.toString();
  }
}

