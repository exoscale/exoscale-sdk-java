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
import io.swagger.client.model.DbaaskafkanameAuthenticationmethods;
import io.swagger.client.model.DbaasmysqlnameMaintenance;
import io.swagger.client.model.JsonSchemaKafka;
import io.swagger.client.model.JsonSchemaKafkaConnect;
import io.swagger.client.model.JsonSchemaKafkaRest;
import io.swagger.client.model.JsonSchemaSchemaRegistry;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * DbaaskafkaNameBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-08T17:23:40.261901+01:00[Europe/Vienna]")

public class DbaaskafkaNameBody {
  @JsonProperty("authentication-methods")
  private DbaaskafkanameAuthenticationmethods authenticationMethods = null;

  @JsonProperty("kafka-rest-enabled")
  private Boolean kafkaRestEnabled = null;

  @JsonProperty("kafka-connect-enabled")
  private Boolean kafkaConnectEnabled = null;

  @JsonProperty("ip-filter")
  private List<String> ipFilter = null;

  @JsonProperty("schema-registry-settings")
  private JsonSchemaSchemaRegistry schemaRegistrySettings = null;

  @JsonProperty("kafka-rest-settings")
  private JsonSchemaKafkaRest kafkaRestSettings = null;

  @JsonProperty("termination-protection")
  private Boolean terminationProtection = null;

  @JsonProperty("kafka-connect-settings")
  private JsonSchemaKafkaConnect kafkaConnectSettings = null;

  @JsonProperty("maintenance")
  private DbaasmysqlnameMaintenance maintenance = null;

  @JsonProperty("kafka-settings")
  private JsonSchemaKafka kafkaSettings = null;

  @JsonProperty("schema-registry-enabled")
  private Boolean schemaRegistryEnabled = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("plan")
  private String plan = null;

  public DbaaskafkaNameBody authenticationMethods(DbaaskafkanameAuthenticationmethods authenticationMethods) {
    this.authenticationMethods = authenticationMethods;
    return this;
  }

   /**
   * Get authenticationMethods
   * @return authenticationMethods
  **/
  @Schema(description = "")
  public DbaaskafkanameAuthenticationmethods getAuthenticationMethods() {
    return authenticationMethods;
  }

  public void setAuthenticationMethods(DbaaskafkanameAuthenticationmethods authenticationMethods) {
    this.authenticationMethods = authenticationMethods;
  }

  public DbaaskafkaNameBody kafkaRestEnabled(Boolean kafkaRestEnabled) {
    this.kafkaRestEnabled = kafkaRestEnabled;
    return this;
  }

   /**
   * Enable Kafka-REST service
   * @return kafkaRestEnabled
  **/
  @Schema(description = "Enable Kafka-REST service")
  public Boolean isKafkaRestEnabled() {
    return kafkaRestEnabled;
  }

  public void setKafkaRestEnabled(Boolean kafkaRestEnabled) {
    this.kafkaRestEnabled = kafkaRestEnabled;
  }

  public DbaaskafkaNameBody kafkaConnectEnabled(Boolean kafkaConnectEnabled) {
    this.kafkaConnectEnabled = kafkaConnectEnabled;
    return this;
  }

   /**
   * Allow clients to connect to kafka_connect from the public internet for service nodes that are in a project VPC or another type of private network
   * @return kafkaConnectEnabled
  **/
  @Schema(description = "Allow clients to connect to kafka_connect from the public internet for service nodes that are in a project VPC or another type of private network")
  public Boolean isKafkaConnectEnabled() {
    return kafkaConnectEnabled;
  }

  public void setKafkaConnectEnabled(Boolean kafkaConnectEnabled) {
    this.kafkaConnectEnabled = kafkaConnectEnabled;
  }

  public DbaaskafkaNameBody ipFilter(List<String> ipFilter) {
    this.ipFilter = ipFilter;
    return this;
  }

  public DbaaskafkaNameBody addIpFilterItem(String ipFilterItem) {
    if (this.ipFilter == null) {
      this.ipFilter = new ArrayList<>();
    }
    this.ipFilter.add(ipFilterItem);
    return this;
  }

   /**
   * Allow incoming connections from CIDR address block, e.g. &#x27;10.20.0.0/16&#x27;
   * @return ipFilter
  **/
  @Schema(description = "Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'")
  public List<String> getIpFilter() {
    return ipFilter;
  }

  public void setIpFilter(List<String> ipFilter) {
    this.ipFilter = ipFilter;
  }

  public DbaaskafkaNameBody schemaRegistrySettings(JsonSchemaSchemaRegistry schemaRegistrySettings) {
    this.schemaRegistrySettings = schemaRegistrySettings;
    return this;
  }

   /**
   * Get schemaRegistrySettings
   * @return schemaRegistrySettings
  **/
  @Schema(description = "")
  public JsonSchemaSchemaRegistry getSchemaRegistrySettings() {
    return schemaRegistrySettings;
  }

  public void setSchemaRegistrySettings(JsonSchemaSchemaRegistry schemaRegistrySettings) {
    this.schemaRegistrySettings = schemaRegistrySettings;
  }

  public DbaaskafkaNameBody kafkaRestSettings(JsonSchemaKafkaRest kafkaRestSettings) {
    this.kafkaRestSettings = kafkaRestSettings;
    return this;
  }

   /**
   * Get kafkaRestSettings
   * @return kafkaRestSettings
  **/
  @Schema(description = "")
  public JsonSchemaKafkaRest getKafkaRestSettings() {
    return kafkaRestSettings;
  }

  public void setKafkaRestSettings(JsonSchemaKafkaRest kafkaRestSettings) {
    this.kafkaRestSettings = kafkaRestSettings;
  }

  public DbaaskafkaNameBody terminationProtection(Boolean terminationProtection) {
    this.terminationProtection = terminationProtection;
    return this;
  }

   /**
   * Service is protected against termination and powering off
   * @return terminationProtection
  **/
  @Schema(description = "Service is protected against termination and powering off")
  public Boolean isTerminationProtection() {
    return terminationProtection;
  }

  public void setTerminationProtection(Boolean terminationProtection) {
    this.terminationProtection = terminationProtection;
  }

  public DbaaskafkaNameBody kafkaConnectSettings(JsonSchemaKafkaConnect kafkaConnectSettings) {
    this.kafkaConnectSettings = kafkaConnectSettings;
    return this;
  }

   /**
   * Get kafkaConnectSettings
   * @return kafkaConnectSettings
  **/
  @Schema(description = "")
  public JsonSchemaKafkaConnect getKafkaConnectSettings() {
    return kafkaConnectSettings;
  }

  public void setKafkaConnectSettings(JsonSchemaKafkaConnect kafkaConnectSettings) {
    this.kafkaConnectSettings = kafkaConnectSettings;
  }

  public DbaaskafkaNameBody maintenance(DbaasmysqlnameMaintenance maintenance) {
    this.maintenance = maintenance;
    return this;
  }

   /**
   * Get maintenance
   * @return maintenance
  **/
  @Schema(description = "")
  public DbaasmysqlnameMaintenance getMaintenance() {
    return maintenance;
  }

  public void setMaintenance(DbaasmysqlnameMaintenance maintenance) {
    this.maintenance = maintenance;
  }

  public DbaaskafkaNameBody kafkaSettings(JsonSchemaKafka kafkaSettings) {
    this.kafkaSettings = kafkaSettings;
    return this;
  }

   /**
   * Get kafkaSettings
   * @return kafkaSettings
  **/
  @Schema(description = "")
  public JsonSchemaKafka getKafkaSettings() {
    return kafkaSettings;
  }

  public void setKafkaSettings(JsonSchemaKafka kafkaSettings) {
    this.kafkaSettings = kafkaSettings;
  }

  public DbaaskafkaNameBody schemaRegistryEnabled(Boolean schemaRegistryEnabled) {
    this.schemaRegistryEnabled = schemaRegistryEnabled;
    return this;
  }

   /**
   * Enable Schema-Registry service
   * @return schemaRegistryEnabled
  **/
  @Schema(description = "Enable Schema-Registry service")
  public Boolean isSchemaRegistryEnabled() {
    return schemaRegistryEnabled;
  }

  public void setSchemaRegistryEnabled(Boolean schemaRegistryEnabled) {
    this.schemaRegistryEnabled = schemaRegistryEnabled;
  }

  public DbaaskafkaNameBody version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Kafka major version
   * @return version
  **/
  @Schema(description = "Kafka major version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public DbaaskafkaNameBody plan(String plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Subscription plan
   * @return plan
  **/
  @Schema(description = "Subscription plan")
  public String getPlan() {
    return plan;
  }

  public void setPlan(String plan) {
    this.plan = plan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaaskafkaNameBody dbaaskafkaNameBody = (DbaaskafkaNameBody) o;
    return Objects.equals(this.authenticationMethods, dbaaskafkaNameBody.authenticationMethods) &&
        Objects.equals(this.kafkaRestEnabled, dbaaskafkaNameBody.kafkaRestEnabled) &&
        Objects.equals(this.kafkaConnectEnabled, dbaaskafkaNameBody.kafkaConnectEnabled) &&
        Objects.equals(this.ipFilter, dbaaskafkaNameBody.ipFilter) &&
        Objects.equals(this.schemaRegistrySettings, dbaaskafkaNameBody.schemaRegistrySettings) &&
        Objects.equals(this.kafkaRestSettings, dbaaskafkaNameBody.kafkaRestSettings) &&
        Objects.equals(this.terminationProtection, dbaaskafkaNameBody.terminationProtection) &&
        Objects.equals(this.kafkaConnectSettings, dbaaskafkaNameBody.kafkaConnectSettings) &&
        Objects.equals(this.maintenance, dbaaskafkaNameBody.maintenance) &&
        Objects.equals(this.kafkaSettings, dbaaskafkaNameBody.kafkaSettings) &&
        Objects.equals(this.schemaRegistryEnabled, dbaaskafkaNameBody.schemaRegistryEnabled) &&
        Objects.equals(this.version, dbaaskafkaNameBody.version) &&
        Objects.equals(this.plan, dbaaskafkaNameBody.plan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationMethods, kafkaRestEnabled, kafkaConnectEnabled, ipFilter, schemaRegistrySettings, kafkaRestSettings, terminationProtection, kafkaConnectSettings, maintenance, kafkaSettings, schemaRegistryEnabled, version, plan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaaskafkaNameBody {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
