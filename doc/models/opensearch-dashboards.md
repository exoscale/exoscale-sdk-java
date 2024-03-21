
# Opensearch Dashboards

OpenSearch Dashboards settings

## Structure

`OpensearchDashboards`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `OpensearchRequestTimeout` | `Long` | Optional | Timeout in milliseconds for requests made by OpenSearch Dashboards towards OpenSearch (default: 30000)<br>**Constraints**: `>= 5000`, `<= 120000` | Long getOpensearchRequestTimeout() | setOpensearchRequestTimeout(Long opensearchRequestTimeout) |
| `Enabled` | `Boolean` | Optional | Enable or disable OpenSearch Dashboards (default: true) | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `MaxOldSpaceSize` | `Long` | Optional | Limits the maximum amount of memory (in MiB) the OpenSearch Dashboards process can use. This sets the max_old_space_size option of the nodejs running the OpenSearch Dashboards. Note: the memory reserved by OpenSearch Dashboards is not available for OpenSearch. (default: 128)<br>**Constraints**: `>= 64`, `<= 1024` | Long getMaxOldSpaceSize() | setMaxOldSpaceSize(Long maxOldSpaceSize) |

## Example (as JSON)

```json
{
  "opensearch-request-timeout": 182,
  "enabled": false,
  "max-old-space-size": 194
}
```

