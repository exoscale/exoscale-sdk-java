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
import com.exoscale.model.DbaasServiceCommon;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ListDbaasServices200Response
 */
@JsonPropertyOrder({
  ListDbaasServices200Response.JSON_PROPERTY_DBAAS_SERVICES
})
@JsonTypeName("list_dbaas_services_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T16:37:05.548288+01:00[Europe/Vienna]")
public class ListDbaasServices200Response {
  public static final String JSON_PROPERTY_DBAAS_SERVICES = "dbaas-services";
  private List<DbaasServiceCommon> dbaasServices;

  public ListDbaasServices200Response() {
  }

  public ListDbaasServices200Response dbaasServices(List<DbaasServiceCommon> dbaasServices) {
    
    this.dbaasServices = dbaasServices;
    return this;
  }

  public ListDbaasServices200Response addDbaasServicesItem(DbaasServiceCommon dbaasServicesItem) {
    if (this.dbaasServices == null) {
      this.dbaasServices = new ArrayList<>();
    }
    this.dbaasServices.add(dbaasServicesItem);
    return this;
  }

   /**
   * Get dbaasServices
   * @return dbaasServices
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DBAAS_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DbaasServiceCommon> getDbaasServices() {
    return dbaasServices;
  }


  @JsonProperty(JSON_PROPERTY_DBAAS_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbaasServices(List<DbaasServiceCommon> dbaasServices) {
    this.dbaasServices = dbaasServices;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDbaasServices200Response listDbaasServices200Response = (ListDbaasServices200Response) o;
    return Objects.equals(this.dbaasServices, listDbaasServices200Response.dbaasServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbaasServices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDbaasServices200Response {\n");
    sb.append("    dbaasServices: ").append(toIndentedString(dbaasServices)).append("\n");
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

