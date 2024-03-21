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
import io.swagger.client.model.ElasticIp;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse2005
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-08T17:23:40.261901+01:00[Europe/Vienna]")

public class InlineResponse2005 {
  @JsonProperty("elastic-ips")
  private List<ElasticIp> elasticIps = null;

  public InlineResponse2005 elasticIps(List<ElasticIp> elasticIps) {
    this.elasticIps = elasticIps;
    return this;
  }

  public InlineResponse2005 addElasticIpsItem(ElasticIp elasticIpsItem) {
    if (this.elasticIps == null) {
      this.elasticIps = new ArrayList<>();
    }
    this.elasticIps.add(elasticIpsItem);
    return this;
  }

   /**
   * Get elasticIps
   * @return elasticIps
  **/
  @Schema(description = "")
  public List<ElasticIp> getElasticIps() {
    return elasticIps;
  }

  public void setElasticIps(List<ElasticIp> elasticIps) {
    this.elasticIps = elasticIps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005 inlineResponse2005 = (InlineResponse2005) o;
    return Objects.equals(this.elasticIps, inlineResponse2005.elasticIps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elasticIps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005 {\n");
    
    sb.append("    elasticIps: ").append(toIndentedString(elasticIps)).append("\n");
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
