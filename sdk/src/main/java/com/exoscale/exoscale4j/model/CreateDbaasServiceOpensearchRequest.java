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
import com.exoscale.exoscale4j.model.JsonSchemaOpensearch;
import com.exoscale.exoscale4j.model.UpdateDbaasServiceMysqlRequestMaintenance;
import com.exoscale.exoscale4j.model.UpdateDbaasServiceOpensearchRequestIndexPatternsInner;
import com.exoscale.exoscale4j.model.UpdateDbaasServiceOpensearchRequestIndexTemplate;
import com.exoscale.exoscale4j.model.UpdateDbaasServiceOpensearchRequestOpensearchDashboards;
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
 * CreateDbaasServiceOpensearchRequest
 */
@JsonPropertyOrder({
  CreateDbaasServiceOpensearchRequest.JSON_PROPERTY_MAX_INDEX_COUNT,
  CreateDbaasServiceOpensearchRequest.JSON_PROPERTY_KEEP_INDEX_REFRESH_INTERVAL,
  CreateDbaasServiceOpensearchRequest.JSON_PROPERTY_IP_FILTER,
  CreateDbaasServiceOpensearchRequest.JSON_PROPERTY_TERMINATION_PROTECTION,
  CreateDbaasServiceOpensearchRequest.JSON_PROPERTY_FORK_FROM_SERVICE,
  CreateDbaasServiceOpensearchRequest.JSON_PROPERTY_INDEX_PATTERNS,
  CreateDbaasServiceOpensearchRequest.JSON_PROPERTY_MAINTENANCE,
  CreateDbaasServiceOpensearchRequest.JSON_PROPERTY_INDEX_TEMPLATE,
  CreateDbaasServiceOpensearchRequest.JSON_PROPERTY_OPENSEARCH_SETTINGS,
  CreateDbaasServiceOpensearchRequest.JSON_PROPERTY_VERSION,
  CreateDbaasServiceOpensearchRequest.JSON_PROPERTY_RECOVERY_BACKUP_NAME,
  CreateDbaasServiceOpensearchRequest.JSON_PROPERTY_PLAN,
  CreateDbaasServiceOpensearchRequest.JSON_PROPERTY_OPENSEARCH_DASHBOARDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-25T12:43:01.822793Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateDbaasServiceOpensearchRequest {
  public static final String JSON_PROPERTY_MAX_INDEX_COUNT = "max-index-count";
  private Long maxIndexCount;

  public static final String JSON_PROPERTY_KEEP_INDEX_REFRESH_INTERVAL = "keep-index-refresh-interval";
  private Boolean keepIndexRefreshInterval;

  public static final String JSON_PROPERTY_IP_FILTER = "ip-filter";
  private List<String> ipFilter;

  public static final String JSON_PROPERTY_TERMINATION_PROTECTION = "termination-protection";
  private Boolean terminationProtection;

  public static final String JSON_PROPERTY_FORK_FROM_SERVICE = "fork-from-service";
  private String forkFromService;

  public static final String JSON_PROPERTY_INDEX_PATTERNS = "index-patterns";
  private List<UpdateDbaasServiceOpensearchRequestIndexPatternsInner> indexPatterns;

  public static final String JSON_PROPERTY_MAINTENANCE = "maintenance";
  private UpdateDbaasServiceMysqlRequestMaintenance maintenance;

  public static final String JSON_PROPERTY_INDEX_TEMPLATE = "index-template";
  private UpdateDbaasServiceOpensearchRequestIndexTemplate indexTemplate;

  public static final String JSON_PROPERTY_OPENSEARCH_SETTINGS = "opensearch-settings";
  private JsonSchemaOpensearch opensearchSettings;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_RECOVERY_BACKUP_NAME = "recovery-backup-name";
  private String recoveryBackupName;

  public static final String JSON_PROPERTY_PLAN = "plan";
  private String plan;

  public static final String JSON_PROPERTY_OPENSEARCH_DASHBOARDS = "opensearch-dashboards";
  private UpdateDbaasServiceOpensearchRequestOpensearchDashboards opensearchDashboards;

  public CreateDbaasServiceOpensearchRequest() { 
  }

  public CreateDbaasServiceOpensearchRequest maxIndexCount(Long maxIndexCount) {
    this.maxIndexCount = maxIndexCount;
    return this;
  }

   /**
   * Maximum number of indexes to keep before deleting the oldest one
   * minimum: 0
   * @return maxIndexCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_INDEX_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaxIndexCount() {
    return maxIndexCount;
  }


  @JsonProperty(JSON_PROPERTY_MAX_INDEX_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxIndexCount(Long maxIndexCount) {
    this.maxIndexCount = maxIndexCount;
  }


  public CreateDbaasServiceOpensearchRequest keepIndexRefreshInterval(Boolean keepIndexRefreshInterval) {
    this.keepIndexRefreshInterval = keepIndexRefreshInterval;
    return this;
  }

   /**
   * Aiven automation resets index.refresh_interval to default value for every index to be sure that indices are always visible to search. If it doesn&#39;t fit your case, you can disable this by setting up this flag to true.
   * @return keepIndexRefreshInterval
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEEP_INDEX_REFRESH_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getKeepIndexRefreshInterval() {
    return keepIndexRefreshInterval;
  }


  @JsonProperty(JSON_PROPERTY_KEEP_INDEX_REFRESH_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeepIndexRefreshInterval(Boolean keepIndexRefreshInterval) {
    this.keepIndexRefreshInterval = keepIndexRefreshInterval;
  }


  public CreateDbaasServiceOpensearchRequest ipFilter(List<String> ipFilter) {
    this.ipFilter = ipFilter;
    return this;
  }

  public CreateDbaasServiceOpensearchRequest addIpFilterItem(String ipFilterItem) {
    if (this.ipFilter == null) {
      this.ipFilter = new ArrayList<>();
    }
    this.ipFilter.add(ipFilterItem);
    return this;
  }

   /**
   * Allow incoming connections from CIDR address block, e.g. &#39;10.20.0.0/16&#39;
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


  public CreateDbaasServiceOpensearchRequest terminationProtection(Boolean terminationProtection) {
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


  public CreateDbaasServiceOpensearchRequest forkFromService(String forkFromService) {
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


  public CreateDbaasServiceOpensearchRequest indexPatterns(List<UpdateDbaasServiceOpensearchRequestIndexPatternsInner> indexPatterns) {
    this.indexPatterns = indexPatterns;
    return this;
  }

  public CreateDbaasServiceOpensearchRequest addIndexPatternsItem(UpdateDbaasServiceOpensearchRequestIndexPatternsInner indexPatternsItem) {
    if (this.indexPatterns == null) {
      this.indexPatterns = new ArrayList<>();
    }
    this.indexPatterns.add(indexPatternsItem);
    return this;
  }

   /**
   * Allows you to create glob style patterns and set a max number of indexes matching this pattern you want to keep. Creating indexes exceeding this value will cause the oldest one to get deleted. You could for example create a pattern looking like &#39;logs.?&#39; and then create index logs.1, logs.2 etc, it will delete logs.1 once you create logs.6. Do note &#39;logs.?&#39; does not apply to logs.10. Note: Setting max_index_count to 0 will do nothing and the pattern gets ignored.
   * @return indexPatterns
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEX_PATTERNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateDbaasServiceOpensearchRequestIndexPatternsInner> getIndexPatterns() {
    return indexPatterns;
  }


  @JsonProperty(JSON_PROPERTY_INDEX_PATTERNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndexPatterns(List<UpdateDbaasServiceOpensearchRequestIndexPatternsInner> indexPatterns) {
    this.indexPatterns = indexPatterns;
  }


  public CreateDbaasServiceOpensearchRequest maintenance(UpdateDbaasServiceMysqlRequestMaintenance maintenance) {
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


  public CreateDbaasServiceOpensearchRequest indexTemplate(UpdateDbaasServiceOpensearchRequestIndexTemplate indexTemplate) {
    this.indexTemplate = indexTemplate;
    return this;
  }

   /**
   * Get indexTemplate
   * @return indexTemplate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEX_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdateDbaasServiceOpensearchRequestIndexTemplate getIndexTemplate() {
    return indexTemplate;
  }


  @JsonProperty(JSON_PROPERTY_INDEX_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndexTemplate(UpdateDbaasServiceOpensearchRequestIndexTemplate indexTemplate) {
    this.indexTemplate = indexTemplate;
  }


  public CreateDbaasServiceOpensearchRequest opensearchSettings(JsonSchemaOpensearch opensearchSettings) {
    this.opensearchSettings = opensearchSettings;
    return this;
  }

   /**
   * Get opensearchSettings
   * @return opensearchSettings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENSEARCH_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonSchemaOpensearch getOpensearchSettings() {
    return opensearchSettings;
  }


  @JsonProperty(JSON_PROPERTY_OPENSEARCH_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpensearchSettings(JsonSchemaOpensearch opensearchSettings) {
    this.opensearchSettings = opensearchSettings;
  }


  public CreateDbaasServiceOpensearchRequest version(String version) {
    this.version = version;
    return this;
  }

   /**
   * OpenSearch major version
   * @return version
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  public CreateDbaasServiceOpensearchRequest recoveryBackupName(String recoveryBackupName) {
    this.recoveryBackupName = recoveryBackupName;
    return this;
  }

   /**
   * Name of a backup to recover from for services that support backup names
   * @return recoveryBackupName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECOVERY_BACKUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecoveryBackupName() {
    return recoveryBackupName;
  }


  @JsonProperty(JSON_PROPERTY_RECOVERY_BACKUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecoveryBackupName(String recoveryBackupName) {
    this.recoveryBackupName = recoveryBackupName;
  }


  public CreateDbaasServiceOpensearchRequest plan(String plan) {
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


  public CreateDbaasServiceOpensearchRequest opensearchDashboards(UpdateDbaasServiceOpensearchRequestOpensearchDashboards opensearchDashboards) {
    this.opensearchDashboards = opensearchDashboards;
    return this;
  }

   /**
   * Get opensearchDashboards
   * @return opensearchDashboards
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPENSEARCH_DASHBOARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdateDbaasServiceOpensearchRequestOpensearchDashboards getOpensearchDashboards() {
    return opensearchDashboards;
  }


  @JsonProperty(JSON_PROPERTY_OPENSEARCH_DASHBOARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpensearchDashboards(UpdateDbaasServiceOpensearchRequestOpensearchDashboards opensearchDashboards) {
    this.opensearchDashboards = opensearchDashboards;
  }


  /**
   * Return true if this create_dbaas_service_opensearch_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDbaasServiceOpensearchRequest createDbaasServiceOpensearchRequest = (CreateDbaasServiceOpensearchRequest) o;
    return Objects.equals(this.maxIndexCount, createDbaasServiceOpensearchRequest.maxIndexCount) &&
        Objects.equals(this.keepIndexRefreshInterval, createDbaasServiceOpensearchRequest.keepIndexRefreshInterval) &&
        Objects.equals(this.ipFilter, createDbaasServiceOpensearchRequest.ipFilter) &&
        Objects.equals(this.terminationProtection, createDbaasServiceOpensearchRequest.terminationProtection) &&
        Objects.equals(this.forkFromService, createDbaasServiceOpensearchRequest.forkFromService) &&
        Objects.equals(this.indexPatterns, createDbaasServiceOpensearchRequest.indexPatterns) &&
        Objects.equals(this.maintenance, createDbaasServiceOpensearchRequest.maintenance) &&
        Objects.equals(this.indexTemplate, createDbaasServiceOpensearchRequest.indexTemplate) &&
        Objects.equals(this.opensearchSettings, createDbaasServiceOpensearchRequest.opensearchSettings) &&
        Objects.equals(this.version, createDbaasServiceOpensearchRequest.version) &&
        Objects.equals(this.recoveryBackupName, createDbaasServiceOpensearchRequest.recoveryBackupName) &&
        Objects.equals(this.plan, createDbaasServiceOpensearchRequest.plan) &&
        Objects.equals(this.opensearchDashboards, createDbaasServiceOpensearchRequest.opensearchDashboards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxIndexCount, keepIndexRefreshInterval, ipFilter, terminationProtection, forkFromService, indexPatterns, maintenance, indexTemplate, opensearchSettings, version, recoveryBackupName, plan, opensearchDashboards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDbaasServiceOpensearchRequest {\n");
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

    // add `max-index-count` to the URL query string
    if (getMaxIndexCount() != null) {
      joiner.add(String.format("%smax-index-count%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxIndexCount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `keep-index-refresh-interval` to the URL query string
    if (getKeepIndexRefreshInterval() != null) {
      joiner.add(String.format("%skeep-index-refresh-interval%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKeepIndexRefreshInterval()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ip-filter` to the URL query string
    if (getIpFilter() != null) {
      for (int i = 0; i < getIpFilter().size(); i++) {
        joiner.add(String.format("%sip-filter%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getIpFilter().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `termination-protection` to the URL query string
    if (getTerminationProtection() != null) {
      joiner.add(String.format("%stermination-protection%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTerminationProtection()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `fork-from-service` to the URL query string
    if (getForkFromService() != null) {
      joiner.add(String.format("%sfork-from-service%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getForkFromService()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `index-patterns` to the URL query string
    if (getIndexPatterns() != null) {
      for (int i = 0; i < getIndexPatterns().size(); i++) {
        if (getIndexPatterns().get(i) != null) {
          joiner.add(getIndexPatterns().get(i).toUrlQueryString(String.format("%sindex-patterns%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `maintenance` to the URL query string
    if (getMaintenance() != null) {
      joiner.add(getMaintenance().toUrlQueryString(prefix + "maintenance" + suffix));
    }

    // add `index-template` to the URL query string
    if (getIndexTemplate() != null) {
      joiner.add(getIndexTemplate().toUrlQueryString(prefix + "index-template" + suffix));
    }

    // add `opensearch-settings` to the URL query string
    if (getOpensearchSettings() != null) {
      joiner.add(getOpensearchSettings().toUrlQueryString(prefix + "opensearch-settings" + suffix));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `recovery-backup-name` to the URL query string
    if (getRecoveryBackupName() != null) {
      joiner.add(String.format("%srecovery-backup-name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecoveryBackupName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `plan` to the URL query string
    if (getPlan() != null) {
      joiner.add(String.format("%splan%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlan()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `opensearch-dashboards` to the URL query string
    if (getOpensearchDashboards() != null) {
      joiner.add(getOpensearchDashboards().toUrlQueryString(prefix + "opensearch-dashboards" + suffix));
    }

    return joiner.toString();
  }
}

