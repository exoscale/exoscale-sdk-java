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
import io.swagger.client.model.InlineResponse20032Settings;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * InlineResponse20032
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-08T17:23:40.261901+01:00[Europe/Vienna]")

public class InlineResponse20032 {
  @JsonProperty("settings")
  private InlineResponse20032Settings settings = null;

  public InlineResponse20032 settings(InlineResponse20032Settings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @Schema(description = "")
  public InlineResponse20032Settings getSettings() {
    return settings;
  }

  public void setSettings(InlineResponse20032Settings settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20032 inlineResponse20032 = (InlineResponse20032) o;
    return Objects.equals(this.settings, inlineResponse20032.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20032 {\n");
    
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
