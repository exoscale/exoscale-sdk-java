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
import com.exoscale.exoscale4j.model.JsonSchemaKafka;
import com.exoscale.exoscale4j.model.JsonSchemaKafkaConnect;
import com.exoscale.exoscale4j.model.JsonSchemaKafkaRest;
import com.exoscale.exoscale4j.model.JsonSchemaSchemaRegistry;
import com.exoscale.exoscale4j.model.UpdateDbaasServiceKafkaRequestAuthenticationMethods;
import com.exoscale.exoscale4j.model.UpdateDbaasServiceMysqlRequestMaintenance;
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
 * UpdateDbaasServiceKafkaRequest
 */
@JsonPropertyOrder({
  UpdateDbaasServiceKafkaRequest.JSON_PROPERTY_AUTHENTICATION_METHODS,
  UpdateDbaasServiceKafkaRequest.JSON_PROPERTY_KAFKA_REST_ENABLED,
  UpdateDbaasServiceKafkaRequest.JSON_PROPERTY_KAFKA_CONNECT_ENABLED,
  UpdateDbaasServiceKafkaRequest.JSON_PROPERTY_IP_FILTER,
  UpdateDbaasServiceKafkaRequest.JSON_PROPERTY_SCHEMA_REGISTRY_SETTINGS,
  UpdateDbaasServiceKafkaRequest.JSON_PROPERTY_KAFKA_REST_SETTINGS,
  UpdateDbaasServiceKafkaRequest.JSON_PROPERTY_TERMINATION_PROTECTION,
  UpdateDbaasServiceKafkaRequest.JSON_PROPERTY_KAFKA_CONNECT_SETTINGS,
  UpdateDbaasServiceKafkaRequest.JSON_PROPERTY_MAINTENANCE,
  UpdateDbaasServiceKafkaRequest.JSON_PROPERTY_KAFKA_SETTINGS,
  UpdateDbaasServiceKafkaRequest.JSON_PROPERTY_SCHEMA_REGISTRY_ENABLED,
  UpdateDbaasServiceKafkaRequest.JSON_PROPERTY_VERSION,
  UpdateDbaasServiceKafkaRequest.JSON_PROPERTY_PLAN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-09T22:11:49.172310+02:00[Europe/Vienna]", comments = "Generator version: 7.4.0")
public class UpdateDbaasServiceKafkaRequest {
  public static final String JSON_PROPERTY_AUTHENTICATION_METHODS = "authentication-methods";
  private UpdateDbaasServiceKafkaRequestAuthenticationMethods authenticationMethods;

  public static final String JSON_PROPERTY_KAFKA_REST_ENABLED = "kafka-rest-enabled";
  private Boolean kafkaRestEnabled;

  public static final String JSON_PROPERTY_KAFKA_CONNECT_ENABLED = "kafka-connect-enabled";
  private Boolean kafkaConnectEnabled;

  public static final String JSON_PROPERTY_IP_FILTER = "ip-filter";
  private List<String> ipFilter;

  public static final String JSON_PROPERTY_SCHEMA_REGISTRY_SETTINGS = "schema-registry-settings";
  private JsonSchemaSchemaRegistry schemaRegistrySettings;

  public static final String JSON_PROPERTY_KAFKA_REST_SETTINGS = "kafka-rest-settings";
  private JsonSchemaKafkaRest kafkaRestSettings;

  public static final String JSON_PROPERTY_TERMINATION_PROTECTION = "termination-protection";
  private Boolean terminationProtection;

  public static final String JSON_PROPERTY_KAFKA_CONNECT_SETTINGS = "kafka-connect-settings";
  private JsonSchemaKafkaConnect kafkaConnectSettings;

  public static final String JSON_PROPERTY_MAINTENANCE = "maintenance";
  private UpdateDbaasServiceMysqlRequestMaintenance maintenance;

  public static final String JSON_PROPERTY_KAFKA_SETTINGS = "kafka-settings";
  private JsonSchemaKafka kafkaSettings;

  public static final String JSON_PROPERTY_SCHEMA_REGISTRY_ENABLED = "schema-registry-enabled";
  private Boolean schemaRegistryEnabled;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_PLAN = "plan";
  private String plan;

  public UpdateDbaasServiceKafkaRequest() { 
  }

  public UpdateDbaasServiceKafkaRequest authenticationMethods(UpdateDbaasServiceKafkaRequestAuthenticationMethods authenticationMethods) {
    this.authenticationMethods = authenticationMethods;
    return this;
  }

   /**
   * Get authenticationMethods
   * @return authenticationMethods
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdateDbaasServiceKafkaRequestAuthenticationMethods getAuthenticationMethods() {
    return authenticationMethods;
  }


  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthenticationMethods(UpdateDbaasServiceKafkaRequestAuthenticationMethods authenticationMethods) {
    this.authenticationMethods = authenticationMethods;
  }


  public UpdateDbaasServiceKafkaRequest kafkaRestEnabled(Boolean kafkaRestEnabled) {
    this.kafkaRestEnabled = kafkaRestEnabled;
    return this;
  }

   /**
   * Enable Kafka-REST service
   * @return kafkaRestEnabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KAFKA_REST_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getKafkaRestEnabled() {
    return kafkaRestEnabled;
  }


  @JsonProperty(JSON_PROPERTY_KAFKA_REST_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKafkaRestEnabled(Boolean kafkaRestEnabled) {
    this.kafkaRestEnabled = kafkaRestEnabled;
  }


  public UpdateDbaasServiceKafkaRequest kafkaConnectEnabled(Boolean kafkaConnectEnabled) {
    this.kafkaConnectEnabled = kafkaConnectEnabled;
    return this;
  }

   /**
   * Allow clients to connect to kafka_connect from the public internet for service nodes that are in a project VPC or another type of private network
   * @return kafkaConnectEnabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KAFKA_CONNECT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getKafkaConnectEnabled() {
    return kafkaConnectEnabled;
  }


  @JsonProperty(JSON_PROPERTY_KAFKA_CONNECT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKafkaConnectEnabled(Boolean kafkaConnectEnabled) {
    this.kafkaConnectEnabled = kafkaConnectEnabled;
  }


  public UpdateDbaasServiceKafkaRequest ipFilter(List<String> ipFilter) {
    this.ipFilter = ipFilter;
    return this;
  }

  public UpdateDbaasServiceKafkaRequest addIpFilterItem(String ipFilterItem) {
    if (this.ipFilter == null) {
      this.ipFilter = new ArrayList<>();
    }
    this.ipFilter.add(ipFilterItem);
    return this;
  }

   /**
   * Allow incoming connections from CIDR address block, e.g. &#39;10.20.0.0/16&#39;
   * @return ipFilter
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIpFilter() {
    return ipFilter;
  }


  @JsonProperty(JSON_PROPERTY_IP_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpFilter(List<String> ipFilter) {
    this.ipFilter = ipFilter;
  }


  public UpdateDbaasServiceKafkaRequest schemaRegistrySettings(JsonSchemaSchemaRegistry schemaRegistrySettings) {
    this.schemaRegistrySettings = schemaRegistrySettings;
    return this;
  }

   /**
   * Get schemaRegistrySettings
   * @return schemaRegistrySettings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEMA_REGISTRY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonSchemaSchemaRegistry getSchemaRegistrySettings() {
    return schemaRegistrySettings;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA_REGISTRY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemaRegistrySettings(JsonSchemaSchemaRegistry schemaRegistrySettings) {
    this.schemaRegistrySettings = schemaRegistrySettings;
  }


  public UpdateDbaasServiceKafkaRequest kafkaRestSettings(JsonSchemaKafkaRest kafkaRestSettings) {
    this.kafkaRestSettings = kafkaRestSettings;
    return this;
  }

   /**
   * Get kafkaRestSettings
   * @return kafkaRestSettings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KAFKA_REST_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonSchemaKafkaRest getKafkaRestSettings() {
    return kafkaRestSettings;
  }


  @JsonProperty(JSON_PROPERTY_KAFKA_REST_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKafkaRestSettings(JsonSchemaKafkaRest kafkaRestSettings) {
    this.kafkaRestSettings = kafkaRestSettings;
  }


  public UpdateDbaasServiceKafkaRequest terminationProtection(Boolean terminationProtection) {
    this.terminationProtection = terminationProtection;
    return this;
  }

   /**
   * Service is protected against termination and powering off
   * @return terminationProtection
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERMINATION_PROTECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTerminationProtection() {
    return terminationProtection;
  }


  @JsonProperty(JSON_PROPERTY_TERMINATION_PROTECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTerminationProtection(Boolean terminationProtection) {
    this.terminationProtection = terminationProtection;
  }


  public UpdateDbaasServiceKafkaRequest kafkaConnectSettings(JsonSchemaKafkaConnect kafkaConnectSettings) {
    this.kafkaConnectSettings = kafkaConnectSettings;
    return this;
  }

   /**
   * Get kafkaConnectSettings
   * @return kafkaConnectSettings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KAFKA_CONNECT_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonSchemaKafkaConnect getKafkaConnectSettings() {
    return kafkaConnectSettings;
  }


  @JsonProperty(JSON_PROPERTY_KAFKA_CONNECT_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKafkaConnectSettings(JsonSchemaKafkaConnect kafkaConnectSettings) {
    this.kafkaConnectSettings = kafkaConnectSettings;
  }


  public UpdateDbaasServiceKafkaRequest maintenance(UpdateDbaasServiceMysqlRequestMaintenance maintenance) {
    this.maintenance = maintenance;
    return this;
  }

   /**
   * Get maintenance
   * @return maintenance
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAINTENANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdateDbaasServiceMysqlRequestMaintenance getMaintenance() {
    return maintenance;
  }


  @JsonProperty(JSON_PROPERTY_MAINTENANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaintenance(UpdateDbaasServiceMysqlRequestMaintenance maintenance) {
    this.maintenance = maintenance;
  }


  public UpdateDbaasServiceKafkaRequest kafkaSettings(JsonSchemaKafka kafkaSettings) {
    this.kafkaSettings = kafkaSettings;
    return this;
  }

   /**
   * Get kafkaSettings
   * @return kafkaSettings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KAFKA_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonSchemaKafka getKafkaSettings() {
    return kafkaSettings;
  }


  @JsonProperty(JSON_PROPERTY_KAFKA_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKafkaSettings(JsonSchemaKafka kafkaSettings) {
    this.kafkaSettings = kafkaSettings;
  }


  public UpdateDbaasServiceKafkaRequest schemaRegistryEnabled(Boolean schemaRegistryEnabled) {
    this.schemaRegistryEnabled = schemaRegistryEnabled;
    return this;
  }

   /**
   * Enable Schema-Registry service
   * @return schemaRegistryEnabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEMA_REGISTRY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSchemaRegistryEnabled() {
    return schemaRegistryEnabled;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA_REGISTRY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemaRegistryEnabled(Boolean schemaRegistryEnabled) {
    this.schemaRegistryEnabled = schemaRegistryEnabled;
  }


  public UpdateDbaasServiceKafkaRequest version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Kafka major version
   * @return version
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  public UpdateDbaasServiceKafkaRequest plan(String plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Subscription plan
   * @return plan
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlan() {
    return plan;
  }


  @JsonProperty(JSON_PROPERTY_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlan(String plan) {
    this.plan = plan;
  }


  /**
   * Return true if this update_dbaas_service_kafka_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDbaasServiceKafkaRequest updateDbaasServiceKafkaRequest = (UpdateDbaasServiceKafkaRequest) o;
    return Objects.equals(this.authenticationMethods, updateDbaasServiceKafkaRequest.authenticationMethods) &&
        Objects.equals(this.kafkaRestEnabled, updateDbaasServiceKafkaRequest.kafkaRestEnabled) &&
        Objects.equals(this.kafkaConnectEnabled, updateDbaasServiceKafkaRequest.kafkaConnectEnabled) &&
        Objects.equals(this.ipFilter, updateDbaasServiceKafkaRequest.ipFilter) &&
        Objects.equals(this.schemaRegistrySettings, updateDbaasServiceKafkaRequest.schemaRegistrySettings) &&
        Objects.equals(this.kafkaRestSettings, updateDbaasServiceKafkaRequest.kafkaRestSettings) &&
        Objects.equals(this.terminationProtection, updateDbaasServiceKafkaRequest.terminationProtection) &&
        Objects.equals(this.kafkaConnectSettings, updateDbaasServiceKafkaRequest.kafkaConnectSettings) &&
        Objects.equals(this.maintenance, updateDbaasServiceKafkaRequest.maintenance) &&
        Objects.equals(this.kafkaSettings, updateDbaasServiceKafkaRequest.kafkaSettings) &&
        Objects.equals(this.schemaRegistryEnabled, updateDbaasServiceKafkaRequest.schemaRegistryEnabled) &&
        Objects.equals(this.version, updateDbaasServiceKafkaRequest.version) &&
        Objects.equals(this.plan, updateDbaasServiceKafkaRequest.plan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationMethods, kafkaRestEnabled, kafkaConnectEnabled, ipFilter, schemaRegistrySettings, kafkaRestSettings, terminationProtection, kafkaConnectSettings, maintenance, kafkaSettings, schemaRegistryEnabled, version, plan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDbaasServiceKafkaRequest {\n");
    sb.append("    authenticationMethods: ").append(toIndentedString(authenticationMethods)).append("\n");
    sb.append("    kafkaRestEnabled: ").append(toIndentedString(kafkaRestEnabled)).append("\n");
    sb.append("    kafkaConnectEnabled: ").append(toIndentedString(kafkaConnectEnabled)).append("\n");
    sb.append("    ipFilter: ").append(toIndentedString(ipFilter)).append("\n");
    sb.append("    schemaRegistrySettings: ").append(toIndentedString(schemaRegistrySettings)).append("\n");
    sb.append("    kafkaRestSettings: ").append(toIndentedString(kafkaRestSettings)).append("\n");
    sb.append("    terminationProtection: ").append(toIndentedString(terminationProtection)).append("\n");
    sb.append("    kafkaConnectSettings: ").append(toIndentedString(kafkaConnectSettings)).append("\n");
    sb.append("    maintenance: ").append(toIndentedString(maintenance)).append("\n");
    sb.append("    kafkaSettings: ").append(toIndentedString(kafkaSettings)).append("\n");
    sb.append("    schemaRegistryEnabled: ").append(toIndentedString(schemaRegistryEnabled)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
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

    // add `authentication-methods` to the URL query string
    if (getAuthenticationMethods() != null) {
      joiner.add(getAuthenticationMethods().toUrlQueryString(prefix + "authentication-methods" + suffix));
    }

    // add `kafka-rest-enabled` to the URL query string
    if (getKafkaRestEnabled() != null) {
      joiner.add(String.format("%skafka-rest-enabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKafkaRestEnabled()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `kafka-connect-enabled` to the URL query string
    if (getKafkaConnectEnabled() != null) {
      joiner.add(String.format("%skafka-connect-enabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKafkaConnectEnabled()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ip-filter` to the URL query string
    if (getIpFilter() != null) {
      for (int i = 0; i < getIpFilter().size(); i++) {
        joiner.add(String.format("%sip-filter%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getIpFilter().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `schema-registry-settings` to the URL query string
    if (getSchemaRegistrySettings() != null) {
      joiner.add(getSchemaRegistrySettings().toUrlQueryString(prefix + "schema-registry-settings" + suffix));
    }

    // add `kafka-rest-settings` to the URL query string
    if (getKafkaRestSettings() != null) {
      joiner.add(getKafkaRestSettings().toUrlQueryString(prefix + "kafka-rest-settings" + suffix));
    }

    // add `termination-protection` to the URL query string
    if (getTerminationProtection() != null) {
      joiner.add(String.format("%stermination-protection%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTerminationProtection()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `kafka-connect-settings` to the URL query string
    if (getKafkaConnectSettings() != null) {
      joiner.add(getKafkaConnectSettings().toUrlQueryString(prefix + "kafka-connect-settings" + suffix));
    }

    // add `maintenance` to the URL query string
    if (getMaintenance() != null) {
      joiner.add(getMaintenance().toUrlQueryString(prefix + "maintenance" + suffix));
    }

    // add `kafka-settings` to the URL query string
    if (getKafkaSettings() != null) {
      joiner.add(getKafkaSettings().toUrlQueryString(prefix + "kafka-settings" + suffix));
    }

    // add `schema-registry-enabled` to the URL query string
    if (getSchemaRegistryEnabled() != null) {
      joiner.add(String.format("%sschema-registry-enabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSchemaRegistryEnabled()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `plan` to the URL query string
    if (getPlan() != null) {
      joiner.add(String.format("%splan%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlan()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

