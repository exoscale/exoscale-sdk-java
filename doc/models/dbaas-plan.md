
# Dbaas Plan

DBaaS plan

## Structure

`DbaasPlan`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | DBaaS plan name | String getName() | setName(String name) |
| `NodeCount` | `Long` | Optional | DBaaS plan node count<br>**Constraints**: `> 0` | Long getNodeCount() | setNodeCount(Long nodeCount) |
| `NodeCpuCount` | `Long` | Optional | DBaaS plan CPU count per node<br>**Constraints**: `> 0` | Long getNodeCpuCount() | setNodeCpuCount(Long nodeCpuCount) |
| `DiskSpace` | `Long` | Optional | DBaaS plan disk space | Long getDiskSpace() | setDiskSpace(Long diskSpace) |
| `NodeMemory` | `Long` | Optional | DBaaS plan memory count per node<br>**Constraints**: `> 0` | Long getNodeMemory() | setNodeMemory(Long nodeMemory) |
| `MaxMemoryPercent` | `Long` | Optional | DBaaS plan max memory allocated percentage<br>**Constraints**: `> 0` | Long getMaxMemoryPercent() | setMaxMemoryPercent(Long maxMemoryPercent) |
| `BackupConfig` | [`DbaasBackupConfig`](../../doc/models/dbaas-backup-config.md) | Optional | DBaaS plan backup config | DbaasBackupConfig getBackupConfig() | setBackupConfig(DbaasBackupConfig backupConfig) |
| `Authorized` | `Boolean` | Optional | Requires authorization or publicly available | Boolean getAuthorized() | setAuthorized(Boolean authorized) |

## Example (as JSON)

```json
{
  "name": "name4",
  "node-count": 184,
  "node-cpu-count": 250,
  "disk-space": 228,
  "node-memory": 106
}
```

