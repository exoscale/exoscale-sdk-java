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


package com.exoscale.model;

import java.util.Objects;
import java.util.Arrays;
import com.exoscale.model.ElasticIpHealthcheck;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateElasticIpRequest
 */
@JsonPropertyOrder({
  UpdateElasticIpRequest.JSON_PROPERTY_DESCRIPTION,
  UpdateElasticIpRequest.JSON_PROPERTY_HEALTHCHECK,
  UpdateElasticIpRequest.JSON_PROPERTY_LABELS
})
@JsonTypeName("update_elastic_ip_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T21:01:33.231699+01:00[Europe/Vienna]")
public class UpdateElasticIpRequest {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_HEALTHCHECK = "healthcheck";
  private ElasticIpHealthcheck healthcheck;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private Map<String, String> labels = new HashMap<>();

  public UpdateElasticIpRequest() {
  }

  public UpdateElasticIpRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Elastic IP description
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateElasticIpRequest healthcheck(ElasticIpHealthcheck healthcheck) {
    
    this.healthcheck = healthcheck;
    return this;
  }

   /**
   * Get healthcheck
   * @return healthcheck
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEALTHCHECK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ElasticIpHealthcheck getHealthcheck() {
    return healthcheck;
  }


  @JsonProperty(JSON_PROPERTY_HEALTHCHECK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHealthcheck(ElasticIpHealthcheck healthcheck) {
    this.healthcheck = healthcheck;
  }


  public UpdateElasticIpRequest labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public UpdateElasticIpRequest putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getLabels() {
    return labels;
  }


  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateElasticIpRequest updateElasticIpRequest = (UpdateElasticIpRequest) o;
    return Objects.equals(this.description, updateElasticIpRequest.description) &&
        Objects.equals(this.healthcheck, updateElasticIpRequest.healthcheck) &&
        Objects.equals(this.labels, updateElasticIpRequest.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, healthcheck, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateElasticIpRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    healthcheck: ").append(toIndentedString(healthcheck)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

}

