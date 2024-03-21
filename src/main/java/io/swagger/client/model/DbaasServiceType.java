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
import io.swagger.client.model.DbaasPlan;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * DBaaS service
 */
@Schema(description = "DBaaS service")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-08T17:23:40.261901+01:00[Europe/Vienna]")

public class DbaasServiceType {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("available-versions")
  private List<String> availableVersions = null;

  @JsonProperty("default-version")
  private String defaultVersion = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("plans")
  private List<DbaasPlan> plans = null;

  public DbaasServiceType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

   /**
   * DbaaS service available versions
   * @return availableVersions
  **/
  @Schema(description = "DbaaS service available versions")
  public List<String> getAvailableVersions() {
    return availableVersions;
  }

   /**
   * DbaaS service default version
   * @return defaultVersion
  **/
  @Schema(description = "DbaaS service default version")
  public String getDefaultVersion() {
    return defaultVersion;
  }

   /**
   * DbaaS service description
   * @return description
  **/
  @Schema(description = "DbaaS service description")
  public String getDescription() {
    return description;
  }

   /**
   * DbaaS service plans
   * @return plans
  **/
  @Schema(description = "DbaaS service plans")
  public List<DbaasPlan> getPlans() {
    return plans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasServiceType dbaasServiceType = (DbaasServiceType) o;
    return Objects.equals(this.name, dbaasServiceType.name) &&
        Objects.equals(this.availableVersions, dbaasServiceType.availableVersions) &&
        Objects.equals(this.defaultVersion, dbaasServiceType.defaultVersion) &&
        Objects.equals(this.description, dbaasServiceType.description) &&
        Objects.equals(this.plans, dbaasServiceType.plans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, availableVersions, defaultVersion, description, plans);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasServiceType {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    availableVersions: ").append(toIndentedString(availableVersions)).append("\n");
    sb.append("    defaultVersion: ").append(toIndentedString(defaultVersion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
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
