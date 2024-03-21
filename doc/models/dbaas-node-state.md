
# Dbaas Node State

Automatic maintenance settings

## Structure

`DbaasNodeState`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Name of the service node | String getName() | setName(String name) |
| `ProgressUpdates` | [`List<DbaasNodeStateProgressUpdate>`](../../doc/models/dbaas-node-state-progress-update.md) | Optional | Extra information regarding the progress for current state | List<DbaasNodeStateProgressUpdate> getProgressUpdates() | setProgressUpdates(List<DbaasNodeStateProgressUpdate> progressUpdates) |
| `Role` | [`RoleEnum`](../../doc/models/role-enum.md) | Optional | Role of this node. Only returned for a subset of service types | RoleEnum getRole() | setRole(RoleEnum role) |
| `State` | [`StateEnum`](../../doc/models/state-enum.md) | Required | Current state of the service node | StateEnum getState() | setState(StateEnum state) |

## Example (as JSON)

```json
{
  "name": "name8",
  "progress-updates": [
    {
      "completed": false,
      "current": 24,
      "max": 192,
      "min": 238,
      "phase": "prepare",
      "unit": "unit8"
    },
    {
      "completed": false,
      "current": 24,
      "max": 192,
      "min": 238,
      "phase": "prepare",
      "unit": "unit8"
    }
  ],
  "role": "master",
  "state": "unknown"
}
```

