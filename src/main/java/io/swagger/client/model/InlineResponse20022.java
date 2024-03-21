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
import io.swagger.client.model.DbaasIntegrationType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse20022
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-08T17:23:40.261901+01:00[Europe/Vienna]")

public class InlineResponse20022 {
  @JsonProperty("dbaas-integration-types")
  private List<DbaasIntegrationType> dbaasIntegrationTypes = null;

  public InlineResponse20022 dbaasIntegrationTypes(List<DbaasIntegrationType> dbaasIntegrationTypes) {
    this.dbaasIntegrationTypes = dbaasIntegrationTypes;
    return this;
  }

  public InlineResponse20022 addDbaasIntegrationTypesItem(DbaasIntegrationType dbaasIntegrationTypesItem) {
    if (this.dbaasIntegrationTypes == null) {
      this.dbaasIntegrationTypes = new ArrayList<>();
    }
    this.dbaasIntegrationTypes.add(dbaasIntegrationTypesItem);
    return this;
  }

   /**
   * Get dbaasIntegrationTypes
   * @return dbaasIntegrationTypes
  **/
  @Schema(description = "")
  public List<DbaasIntegrationType> getDbaasIntegrationTypes() {
    return dbaasIntegrationTypes;
  }

  public void setDbaasIntegrationTypes(List<DbaasIntegrationType> dbaasIntegrationTypes) {
    this.dbaasIntegrationTypes = dbaasIntegrationTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20022 inlineResponse20022 = (InlineResponse20022) o;
    return Objects.equals(this.dbaasIntegrationTypes, inlineResponse20022.dbaasIntegrationTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbaasIntegrationTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20022 {\n");
    
    sb.append("    dbaasIntegrationTypes: ").append(toIndentedString(dbaasIntegrationTypes)).append("\n");
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
