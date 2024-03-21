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
import io.swagger.client.model.Quota;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse20030
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-08T17:23:40.261901+01:00[Europe/Vienna]")

public class InlineResponse20030 {
  @JsonProperty("quotas")
  private List<Quota> quotas = null;

  public InlineResponse20030 quotas(List<Quota> quotas) {
    this.quotas = quotas;
    return this;
  }

  public InlineResponse20030 addQuotasItem(Quota quotasItem) {
    if (this.quotas == null) {
      this.quotas = new ArrayList<>();
    }
    this.quotas.add(quotasItem);
    return this;
  }

   /**
   * Get quotas
   * @return quotas
  **/
  @Schema(description = "")
  public List<Quota> getQuotas() {
    return quotas;
  }

  public void setQuotas(List<Quota> quotas) {
    this.quotas = quotas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20030 inlineResponse20030 = (InlineResponse20030) o;
    return Objects.equals(this.quotas, inlineResponse20030.quotas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quotas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20030 {\n");
    
    sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
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
