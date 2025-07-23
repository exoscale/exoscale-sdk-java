

# DbaasServiceOpensearchIndexTemplate

Template settings for all new indexes

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mappingNestedObjectsLimit** | **Long** | The maximum number of nested JSON objects that a single document can contain across all nested types. This limit helps to prevent out of memory errors when a document contains too many nested objects. Default is 10000. |  [optional] |
|**numberOfReplicas** | **Long** | The number of replicas each primary shard has. |  [optional] |
|**numberOfShards** | **Long** | The number of primary shards that an index should have. |  [optional] |



