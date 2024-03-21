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
/**
 * RecordRecordidBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-08T17:23:40.261901+01:00[Europe/Vienna]")

public class RecordRecordidBody {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("ttl")
  private Long ttl = null;

  @JsonProperty("priority")
  private Long priority = null;

  public RecordRecordidBody name(String name) {
    this.name = name;
    return this;
  }

   /**
   * DNS domain record name
   * @return name
  **/
  @Schema(description = "DNS domain record name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RecordRecordidBody content(String content) {
    this.content = content;
    return this;
  }

   /**
   * DNS domain record content
   * @return content
  **/
  @Schema(description = "DNS domain record content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public RecordRecordidBody ttl(Long ttl) {
    this.ttl = ttl;
    return this;
  }

   /**
   * DNS domain record TTL
   * minimum: 0
   * @return ttl
  **/
  @Schema(description = "DNS domain record TTL")
  public Long getTtl() {
    return ttl;
  }

  public void setTtl(Long ttl) {
    this.ttl = ttl;
  }

  public RecordRecordidBody priority(Long priority) {
    this.priority = priority;
    return this;
  }

   /**
   * DNS domain record priority
   * minimum: 0
   * @return priority
  **/
  @Schema(description = "DNS domain record priority")
  public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordRecordidBody recordRecordidBody = (RecordRecordidBody) o;
    return Objects.equals(this.name, recordRecordidBody.name) &&
        Objects.equals(this.content, recordRecordidBody.content) &&
        Objects.equals(this.ttl, recordRecordidBody.ttl) &&
        Objects.equals(this.priority, recordRecordidBody.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, content, ttl, priority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordRecordidBody {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
