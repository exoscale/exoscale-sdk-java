
# Dbaas Opensearch Request

## Structure

`DbaasOpensearchRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MaxIndexCount` | `Long` | Optional | Maximum number of indexes to keep before deleting the oldest one<br>**Constraints**: `>= 0` | Long getMaxIndexCount() | setMaxIndexCount(Long maxIndexCount) |
| `KeepIndexRefreshInterval` | `Boolean` | Optional | Aiven automation resets index.refresh_interval to default value for every index to be sure that indices are always visible to search. If it doesn't fit your case, you can disable this by setting up this flag to true. | Boolean getKeepIndexRefreshInterval() | setKeepIndexRefreshInterval(Boolean keepIndexRefreshInterval) |
| `IpFilter` | `List<String>` | Optional | Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16' | List<String> getIpFilter() | setIpFilter(List<String> ipFilter) |
| `TerminationProtection` | `Boolean` | Optional | Service is protected against termination and powering off | Boolean getTerminationProtection() | setTerminationProtection(Boolean terminationProtection) |
| `ForkFromService` | `String` | Optional | **Constraints**: *Minimum Length*: `0`, *Maximum Length*: `63` | String getForkFromService() | setForkFromService(String forkFromService) |
| `IndexPatterns` | [`List<IndexPattern>`](../../doc/models/index-pattern.md) | Optional | Allows you to create glob style patterns and set a max number of indexes matching this pattern you want to keep. Creating indexes exceeding this value will cause the oldest one to get deleted. You could for example create a pattern looking like 'logs.?' and then create index logs.1, logs.2 etc, it will delete logs.1 once you create logs.6. Do note 'logs.?' does not apply to logs.10. Note: Setting max_index_count to 0 will do nothing and the pattern gets ignored. | List<IndexPattern> getIndexPatterns() | setIndexPatterns(List<IndexPattern> indexPatterns) |
| `Maintenance` | [`Maintenance`](../../doc/models/maintenance.md) | Optional | Automatic maintenance settings | Maintenance getMaintenance() | setMaintenance(Maintenance maintenance) |
| `IndexTemplate` | [`IndexTemplate`](../../doc/models/index-template.md) | Optional | Template settings for all new indexes | IndexTemplate getIndexTemplate() | setIndexTemplate(IndexTemplate indexTemplate) |
| `OpensearchSettings` | [`OpenSearchSettings`](../../doc/models/open-search-settings.md) | Optional | - | OpenSearchSettings getOpensearchSettings() | setOpensearchSettings(OpenSearchSettings opensearchSettings) |
| `Version` | `String` | Optional | OpenSearch major version<br>**Constraints**: *Minimum Length*: `1` | String getVersion() | setVersion(String version) |
| `RecoveryBackupName` | `String` | Optional | Name of a backup to recover from for services that support backup names<br>**Constraints**: *Minimum Length*: `1` | String getRecoveryBackupName() | setRecoveryBackupName(String recoveryBackupName) |
| `Plan` | `String` | Required | Subscription plan<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `128` | String getPlan() | setPlan(String plan) |
| `OpensearchDashboards` | [`OpensearchDashboards`](../../doc/models/opensearch-dashboards.md) | Optional | OpenSearch Dashboards settings | OpensearchDashboards getOpensearchDashboards() | setOpensearchDashboards(OpensearchDashboards opensearchDashboards) |

## Example (as JSON)

```json
{
  "max-index-count": 234,
  "keep-index-refresh-interval": false,
  "ip-filter": [
    "ip-filter1"
  ],
  "termination-protection": false,
  "fork-from-service": "fork-from-service0",
  "plan": "plan2"
}
```

