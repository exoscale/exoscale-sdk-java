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


package com.exoscale.exoscale4j.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.exoscale.exoscale4j.model.JsonSchemaGrafana;
import com.exoscale.exoscale4j.model.UpdateDbaasServiceMysqlRequestMaintenance;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateDbaasServiceGrafanaRequest
 */
@JsonPropertyOrder({
  CreateDbaasServiceGrafanaRequest.JSON_PROPERTY_MAINTENANCE,
  CreateDbaasServiceGrafanaRequest.JSON_PROPERTY_PLAN,
  CreateDbaasServiceGrafanaRequest.JSON_PROPERTY_TERMINATION_PROTECTION,
  CreateDbaasServiceGrafanaRequest.JSON_PROPERTY_FORK_FROM_SERVICE,
  CreateDbaasServiceGrafanaRequest.JSON_PROPERTY_GRAFANA_SETTINGS,
  CreateDbaasServiceGrafanaRequest.JSON_PROPERTY_IP_FILTER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-25T12:43:01.822793Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateDbaasServiceGrafanaRequest {
  public static final String JSON_PROPERTY_MAINTENANCE = "maintenance";
  private UpdateDbaasServiceMysqlRequestMaintenance maintenance;

  public static final String JSON_PROPERTY_PLAN = "plan";
  private String plan;

  public static final String JSON_PROPERTY_TERMINATION_PROTECTION = "termination-protection";
  private Boolean terminationProtection;

  public static final String JSON_PROPERTY_FORK_FROM_SERVICE = "fork-from-service";
  private String forkFromService;

  public static final String JSON_PROPERTY_GRAFANA_SETTINGS = "grafana-settings";
  private JsonSchemaGrafana grafanaSettings;

  public static final String JSON_PROPERTY_IP_FILTER = "ip-filter";
  private List<String> ipFilter;

  public CreateDbaasServiceGrafanaRequest() { 
  }

  public CreateDbaasServiceGrafanaRequest maintenance(UpdateDbaasServiceMysqlRequestMaintenance maintenance) {
    this.maintenance = maintenance;
    return this;
  }

   /**
   * Get maintenance
   * @return maintenance
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAINTENANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdateDbaasServiceMysqlRequestMaintenance getMaintenance() {
    return maintenance;
  }


  @JsonProperty(JSON_PROPERTY_MAINTENANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaintenance(UpdateDbaasServiceMysqlRequestMaintenance maintenance) {
    this.maintenance = maintenance;
  }


  public CreateDbaasServiceGrafanaRequest plan(String plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Subscription plan
   * @return plan
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PLAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPlan() {
    return plan;
  }


  @JsonProperty(JSON_PROPERTY_PLAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlan(String plan) {
    this.plan = plan;
  }


  public CreateDbaasServiceGrafanaRequest terminationProtection(Boolean terminationProtection) {
    this.terminationProtection = terminationProtection;
    return this;
  }

   /**
   * Service is protected against termination and powering off
   * @return terminationProtection
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERMINATION_PROTECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTerminationProtection() {
    return terminationProtection;
  }


  @JsonProperty(JSON_PROPERTY_TERMINATION_PROTECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTerminationProtection(Boolean terminationProtection) {
    this.terminationProtection = terminationProtection;
  }


  public CreateDbaasServiceGrafanaRequest forkFromService(String forkFromService) {
    this.forkFromService = forkFromService;
    return this;
  }

   /**
   * Get forkFromService
   * @return forkFromService
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORK_FROM_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getForkFromService() {
    return forkFromService;
  }


  @JsonProperty(JSON_PROPERTY_FORK_FROM_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForkFromService(String forkFromService) {
    this.forkFromService = forkFromService;
  }


  public CreateDbaasServiceGrafanaRequest grafanaSettings(JsonSchemaGrafana grafanaSettings) {
    this.grafanaSettings = grafanaSettings;
    return this;
  }

   /**
   * Get grafanaSettings
   * @return grafanaSettings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRAFANA_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonSchemaGrafana getGrafanaSettings() {
    return grafanaSettings;
  }


  @JsonProperty(JSON_PROPERTY_GRAFANA_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrafanaSettings(JsonSchemaGrafana grafanaSettings) {
    this.grafanaSettings = grafanaSettings;
  }


  public CreateDbaasServiceGrafanaRequest ipFilter(List<String> ipFilter) {
    this.ipFilter = ipFilter;
    return this;
  }

  public CreateDbaasServiceGrafanaRequest addIpFilterItem(String ipFilterItem) {
    if (this.ipFilter == null) {
      this.ipFilter = new ArrayList<>();
    }
    this.ipFilter.add(ipFilterItem);
    return this;
  }

   /**
   * Allowed CIDR address blocks for incoming connections
   * @return ipFilter
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIpFilter() {
    return ipFilter;
  }


  @JsonProperty(JSON_PROPERTY_IP_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpFilter(List<String> ipFilter) {
    this.ipFilter = ipFilter;
  }


  /**
   * Return true if this create_dbaas_service_grafana_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDbaasServiceGrafanaRequest createDbaasServiceGrafanaRequest = (CreateDbaasServiceGrafanaRequest) o;
    return Objects.equals(this.maintenance, createDbaasServiceGrafanaRequest.maintenance) &&
        Objects.equals(this.plan, createDbaasServiceGrafanaRequest.plan) &&
        Objects.equals(this.terminationProtection, createDbaasServiceGrafanaRequest.terminationProtection) &&
        Objects.equals(this.forkFromService, createDbaasServiceGrafanaRequest.forkFromService) &&
        Objects.equals(this.grafanaSettings, createDbaasServiceGrafanaRequest.grafanaSettings) &&
        Objects.equals(this.ipFilter, createDbaasServiceGrafanaRequest.ipFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maintenance, plan, terminationProtection, forkFromService, grafanaSettings, ipFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDbaasServiceGrafanaRequest {\n");
    sb.append("    maintenance: ").append(toIndentedString(maintenance)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    terminationProtection: ").append(toIndentedString(terminationProtection)).append("\n");
    sb.append("    forkFromService: ").append(toIndentedString(forkFromService)).append("\n");
    sb.append("    grafanaSettings: ").append(toIndentedString(grafanaSettings)).append("\n");
    sb.append("    ipFilter: ").append(toIndentedString(ipFilter)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `maintenance` to the URL query string
    if (getMaintenance() != null) {
      joiner.add(getMaintenance().toUrlQueryString(prefix + "maintenance" + suffix));
    }

    // add `plan` to the URL query string
    if (getPlan() != null) {
      joiner.add(String.format("%splan%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlan()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `termination-protection` to the URL query string
    if (getTerminationProtection() != null) {
      joiner.add(String.format("%stermination-protection%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTerminationProtection()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `fork-from-service` to the URL query string
    if (getForkFromService() != null) {
      joiner.add(String.format("%sfork-from-service%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getForkFromService()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `grafana-settings` to the URL query string
    if (getGrafanaSettings() != null) {
      joiner.add(getGrafanaSettings().toUrlQueryString(prefix + "grafana-settings" + suffix));
    }

    // add `ip-filter` to the URL query string
    if (getIpFilter() != null) {
      for (int i = 0; i < getIpFilter().size(); i++) {
        joiner.add(String.format("%sip-filter%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getIpFilter().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}

