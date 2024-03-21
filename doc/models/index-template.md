
# Index Template

Template settings for all new indexes

## Structure

`IndexTemplate`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MappingNestedObjectsLimit` | `Long` | Optional | The maximum number of nested JSON objects that a single document can contain across all nested types. This limit helps to prevent out of memory errors when a document contains too many nested objects. Default is 10000.<br>**Constraints**: `>= 0`, `<= 100000` | Long getMappingNestedObjectsLimit() | setMappingNestedObjectsLimit(Long mappingNestedObjectsLimit) |
| `NumberOfReplicas` | `Long` | Optional | The number of replicas each primary shard has.<br>**Constraints**: `>= 0`, `<= 29` | Long getNumberOfReplicas() | setNumberOfReplicas(Long numberOfReplicas) |
| `NumberOfShards` | `Long` | Optional | The number of primary shards that an index should have.<br>**Constraints**: `>= 1`, `<= 1024` | Long getNumberOfShards() | setNumberOfShards(Long numberOfShards) |

## Example (as JSON)

```json
{
  "mapping-nested-objects-limit": 90,
  "number-of-replicas": 174,
  "number-of-shards": 226
}
```

