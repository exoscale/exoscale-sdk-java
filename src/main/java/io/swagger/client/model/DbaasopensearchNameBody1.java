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
import io.swagger.client.model.DbaasmysqlnameMaintenance;
import io.swagger.client.model.DbaasopensearchnameIndexpatterns;
import io.swagger.client.model.DbaasopensearchnameIndextemplate;
import io.swagger.client.model.DbaasopensearchnameOpensearchdashboards;
import io.swagger.client.model.JsonSchemaOpensearch;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * DbaasopensearchNameBody1
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-08T17:23:40.261901+01:00[Europe/Vienna]")

public class DbaasopensearchNameBody1 {
  @JsonProperty("max-index-count")
  private Long maxIndexCount = null;

  @JsonProperty("keep-index-refresh-interval")
  private Boolean keepIndexRefreshInterval = null;

  @JsonProperty("ip-filter")
  private List<String> ipFilter = null;

  @JsonProperty("termination-protection")
  private Boolean terminationProtection = null;

  @JsonProperty("fork-from-service")
  private String forkFromService = null;

  @JsonProperty("index-patterns")
  private List<DbaasopensearchnameIndexpatterns> indexPatterns = null;

  @JsonProperty("maintenance")
  private DbaasmysqlnameMaintenance maintenance = null;

  @JsonProperty("index-template")
  private DbaasopensearchnameIndextemplate indexTemplate = null;

  @JsonProperty("opensearch-settings")
  private JsonSchemaOpensearch opensearchSettings = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("recovery-backup-name")
  private String recoveryBackupName = null;

  @JsonProperty("plan")
  private String plan = null;

  @JsonProperty("opensearch-dashboards")
  private DbaasopensearchnameOpensearchdashboards opensearchDashboards = null;

  public DbaasopensearchNameBody1 maxIndexCount(Long maxIndexCount) {
    this.maxIndexCount = maxIndexCount;
    return this;
  }

   /**
   * Maximum number of indexes to keep before deleting the oldest one
   * minimum: 0
   * @return maxIndexCount
  **/
  @Schema(description = "Maximum number of indexes to keep before deleting the oldest one")
  public Long getMaxIndexCount() {
    return maxIndexCount;
  }

  public void setMaxIndexCount(Long maxIndexCount) {
    this.maxIndexCount = maxIndexCount;
  }

  public DbaasopensearchNameBody1 keepIndexRefreshInterval(Boolean keepIndexRefreshInterval) {
    this.keepIndexRefreshInterval = keepIndexRefreshInterval;
    return this;
  }

   /**
   * Aiven automation resets index.refresh_interval to default value for every index to be sure that indices are always visible to search. If it doesn&#x27;t fit your case, you can disable this by setting up this flag to true.
   * @return keepIndexRefreshInterval
  **/
  @Schema(description = "Aiven automation resets index.refresh_interval to default value for every index to be sure that indices are always visible to search. If it doesn't fit your case, you can disable this by setting up this flag to true.")
  public Boolean isKeepIndexRefreshInterval() {
    return keepIndexRefreshInterval;
  }

  public void setKeepIndexRefreshInterval(Boolean keepIndexRefreshInterval) {
    this.keepIndexRefreshInterval = keepIndexRefreshInterval;
  }

  public DbaasopensearchNameBody1 ipFilter(List<String> ipFilter) {
    this.ipFilter = ipFilter;
    return this;
  }

  public DbaasopensearchNameBody1 addIpFilterItem(String ipFilterItem) {
    if (this.ipFilter == null) {
      this.ipFilter = new ArrayList<>();
    }
    this.ipFilter.add(ipFilterItem);
    return this;
  }

   /**
   * Allow incoming connections from CIDR address block, e.g. &#x27;10.20.0.0/16&#x27;
   * @return ipFilter
  **/
  @Schema(description = "Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'")
  public List<String> getIpFilter() {
    return ipFilter;
  }

  public void setIpFilter(List<String> ipFilter) {
    this.ipFilter = ipFilter;
  }

  public DbaasopensearchNameBody1 terminationProtection(Boolean terminationProtection) {
    this.terminationProtection = terminationProtection;
    return this;
  }

   /**
   * Service is protected against termination and powering off
   * @return terminationProtection
  **/
  @Schema(description = "Service is protected against termination and powering off")
  public Boolean isTerminationProtection() {
    return terminationProtection;
  }

  public void setTerminationProtection(Boolean terminationProtection) {
    this.terminationProtection = terminationProtection;
  }

  public DbaasopensearchNameBody1 forkFromService(String forkFromService) {
    this.forkFromService = forkFromService;
    return this;
  }

   /**
   * Get forkFromService
   * @return forkFromService
  **/
  @Schema(description = "")
  public String getForkFromService() {
    return forkFromService;
  }

  public void setForkFromService(String forkFromService) {
    this.forkFromService = forkFromService;
  }

  public DbaasopensearchNameBody1 indexPatterns(List<DbaasopensearchnameIndexpatterns> indexPatterns) {
    this.indexPatterns = indexPatterns;
    return this;
  }

  public DbaasopensearchNameBody1 addIndexPatternsItem(DbaasopensearchnameIndexpatterns indexPatternsItem) {
    if (this.indexPatterns == null) {
      this.indexPatterns = new ArrayList<>();
    }
    this.indexPatterns.add(indexPatternsItem);
    return this;
  }

   /**
   * Allows you to create glob style patterns and set a max number of indexes matching this pattern you want to keep. Creating indexes exceeding this value will cause the oldest one to get deleted. You could for example create a pattern looking like &#x27;logs.?&#x27; and then create index logs.1, logs.2 etc, it will delete logs.1 once you create logs.6. Do note &#x27;logs.?&#x27; does not apply to logs.10. Note: Setting max_index_count to 0 will do nothing and the pattern gets ignored.
   * @return indexPatterns
  **/
  @Schema(description = "Allows you to create glob style patterns and set a max number of indexes matching this pattern you want to keep. Creating indexes exceeding this value will cause the oldest one to get deleted. You could for example create a pattern looking like 'logs.?' and then create index logs.1, logs.2 etc, it will delete logs.1 once you create logs.6. Do note 'logs.?' does not apply to logs.10. Note: Setting max_index_count to 0 will do nothing and the pattern gets ignored.")
  public List<DbaasopensearchnameIndexpatterns> getIndexPatterns() {
    return indexPatterns;
  }

  public void setIndexPatterns(List<DbaasopensearchnameIndexpatterns> indexPatterns) {
    this.indexPatterns = indexPatterns;
  }

  public DbaasopensearchNameBody1 maintenance(DbaasmysqlnameMaintenance maintenance) {
    this.maintenance = maintenance;
    return this;
  }

   /**
   * Get maintenance
   * @return maintenance
  **/
  @Schema(description = "")
  public DbaasmysqlnameMaintenance getMaintenance() {
    return maintenance;
  }

  public void setMaintenance(DbaasmysqlnameMaintenance maintenance) {
    this.maintenance = maintenance;
  }

  public DbaasopensearchNameBody1 indexTemplate(DbaasopensearchnameIndextemplate indexTemplate) {
    this.indexTemplate = indexTemplate;
    return this;
  }

   /**
   * Get indexTemplate
   * @return indexTemplate
  **/
  @Schema(description = "")
  public DbaasopensearchnameIndextemplate getIndexTemplate() {
    return indexTemplate;
  }

  public void setIndexTemplate(DbaasopensearchnameIndextemplate indexTemplate) {
    this.indexTemplate = indexTemplate;
  }

  public DbaasopensearchNameBody1 opensearchSettings(JsonSchemaOpensearch opensearchSettings) {
    this.opensearchSettings = opensearchSettings;
    return this;
  }

   /**
   * Get opensearchSettings
   * @return opensearchSettings
  **/
  @Schema(description = "")
  public JsonSchemaOpensearch getOpensearchSettings() {
    return opensearchSettings;
  }

  public void setOpensearchSettings(JsonSchemaOpensearch opensearchSettings) {
    this.opensearchSettings = opensearchSettings;
  }

  public DbaasopensearchNameBody1 version(String version) {
    this.version = version;
    return this;
  }

   /**
   * OpenSearch major version
   * @return version
  **/
  @Schema(description = "OpenSearch major version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public DbaasopensearchNameBody1 recoveryBackupName(String recoveryBackupName) {
    this.recoveryBackupName = recoveryBackupName;
    return this;
  }

   /**
   * Name of a backup to recover from for services that support backup names
   * @return recoveryBackupName
  **/
  @Schema(description = "Name of a backup to recover from for services that support backup names")
  public String getRecoveryBackupName() {
    return recoveryBackupName;
  }

  public void setRecoveryBackupName(String recoveryBackupName) {
    this.recoveryBackupName = recoveryBackupName;
  }

  public DbaasopensearchNameBody1 plan(String plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Subscription plan
   * @return plan
  **/
  @Schema(required = true, description = "Subscription plan")
  public String getPlan() {
    return plan;
  }

  public void setPlan(String plan) {
    this.plan = plan;
  }

  public DbaasopensearchNameBody1 opensearchDashboards(DbaasopensearchnameOpensearchdashboards opensearchDashboards) {
    this.opensearchDashboards = opensearchDashboards;
    return this;
  }

   /**
   * Get opensearchDashboards
   * @return opensearchDashboards
  **/
  @Schema(description = "")
  public DbaasopensearchnameOpensearchdashboards getOpensearchDashboards() {
    return opensearchDashboards;
  }

  public void setOpensearchDashboards(DbaasopensearchnameOpensearchdashboards opensearchDashboards) {
    this.opensearchDashboards = opensearchDashboards;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasopensearchNameBody1 dbaasopensearchNameBody1 = (DbaasopensearchNameBody1) o;
    return Objects.equals(this.maxIndexCount, dbaasopensearchNameBody1.maxIndexCount) &&
        Objects.equals(this.keepIndexRefreshInterval, dbaasopensearchNameBody1.keepIndexRefreshInterval) &&
        Objects.equals(this.ipFilter, dbaasopensearchNameBody1.ipFilter) &&
        Objects.equals(this.terminationProtection, dbaasopensearchNameBody1.terminationProtection) &&
        Objects.equals(this.forkFromService, dbaasopensearchNameBody1.forkFromService) &&
        Objects.equals(this.indexPatterns, dbaasopensearchNameBody1.indexPatterns) &&
        Objects.equals(this.maintenance, dbaasopensearchNameBody1.maintenance) &&
        Objects.equals(this.indexTemplate, dbaasopensearchNameBody1.indexTemplate) &&
        Objects.equals(this.opensearchSettings, dbaasopensearchNameBody1.opensearchSettings) &&
        Objects.equals(this.version, dbaasopensearchNameBody1.version) &&
        Objects.equals(this.recoveryBackupName, dbaasopensearchNameBody1.recoveryBackupName) &&
        Objects.equals(this.plan, dbaasopensearchNameBody1.plan) &&
        Objects.equals(this.opensearchDashboards, dbaasopensearchNameBody1.opensearchDashboards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxIndexCount, keepIndexRefreshInterval, ipFilter, terminationProtection, forkFromService, indexPatterns, maintenance, indexTemplate, opensearchSettings, version, recoveryBackupName, plan, opensearchDashboards);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasopensearchNameBody1 {\n");
    
    sb.append("    maxIndexCount: ").append(toIndentedString(maxIndexCount)).append("\n");
    sb.append("    keepIndexRefreshInterval: ").append(toIndentedString(keepIndexRefreshInterval)).append("\n");
    sb.append("    ipFilter: ").append(toIndentedString(ipFilter)).append("\n");
    sb.append("    terminationProtection: ").append(toIndentedString(terminationProtection)).append("\n");
    sb.append("    forkFromService: ").append(toIndentedString(forkFromService)).append("\n");
    sb.append("    indexPatterns: ").append(toIndentedString(indexPatterns)).append("\n");
    sb.append("    maintenance: ").append(toIndentedString(maintenance)).append("\n");
    sb.append("    indexTemplate: ").append(toIndentedString(indexTemplate)).append("\n");
    sb.append("    opensearchSettings: ").append(toIndentedString(opensearchSettings)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    recoveryBackupName: ").append(toIndentedString(recoveryBackupName)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    opensearchDashboards: ").append(toIndentedString(opensearchDashboards)).append("\n");
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
