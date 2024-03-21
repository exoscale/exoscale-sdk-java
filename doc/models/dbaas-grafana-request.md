
# Dbaas Grafana Request

## Structure

`DbaasGrafanaRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Maintenance` | [`Maintenance`](../../doc/models/maintenance.md) | Optional | Automatic maintenance settings | Maintenance getMaintenance() | setMaintenance(Maintenance maintenance) |
| `Plan` | `String` | Optional | Subscription plan<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `128` | String getPlan() | setPlan(String plan) |
| `TerminationProtection` | `Boolean` | Optional | Service is protected against termination and powering off | Boolean getTerminationProtection() | setTerminationProtection(Boolean terminationProtection) |
| `GrafanaSettings` | [`GrafanaSettings`](../../doc/models/grafana-settings.md) | Optional | - | GrafanaSettings getGrafanaSettings() | setGrafanaSettings(GrafanaSettings grafanaSettings) |
| `IpFilter` | `List<String>` | Optional | Allowed CIDR address blocks for incoming connections | List<String> getIpFilter() | setIpFilter(List<String> ipFilter) |

## Example (as JSON)

```json
{
  "maintenance": {
    "dow": "never",
    "time": "time2"
  },
  "plan": "plan8",
  "termination-protection": false,
  "grafana-settings": {
    "allow_embedding": false,
    "cookie_samesite": "none",
    "dashboard_previews_enabled": false,
    "metrics_enabled": false,
    "recovery_basebackup_name": "recovery_basebackup_name0"
  },
  "ip-filter": [
    "ip-filter5",
    "ip-filter6",
    "ip-filter7"
  ]
}
```

