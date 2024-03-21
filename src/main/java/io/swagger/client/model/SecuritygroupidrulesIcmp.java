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
 * ICMP details (default: -1 (ANY))
 */
@Schema(description = "ICMP details (default: -1 (ANY))")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-08T17:23:40.261901+01:00[Europe/Vienna]")

public class SecuritygroupidrulesIcmp {
  @JsonProperty("code")
  private Long code = null;

  @JsonProperty("type")
  private Long type = null;

  public SecuritygroupidrulesIcmp code(Long code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * minimum: -1
   * maximum: 254
   * @return code
  **/
  @Schema(description = "")
  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public SecuritygroupidrulesIcmp type(Long type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * minimum: -1
   * maximum: 254
   * @return type
  **/
  @Schema(description = "")
  public Long getType() {
    return type;
  }

  public void setType(Long type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritygroupidrulesIcmp securitygroupidrulesIcmp = (SecuritygroupidrulesIcmp) o;
    return Objects.equals(this.code, securitygroupidrulesIcmp.code) &&
        Objects.equals(this.type, securitygroupidrulesIcmp.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritygroupidrulesIcmp {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
