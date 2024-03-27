

# JsonSchemaSchemaRegistry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**topicName** | **String** | The durable single partition topic that acts as the durable log for the data. This topic must be compacted to avoid losing data due to retention policy. Please note that changing this configuration in an existing Schema Registry / Karapace setup leads to previous schemas being inaccessible, data encoded with them potentially unreadable and schema ID sequence put out of order. It&#39;s only possible to do the switch while Schema Registry / Karapace is disabled. Defaults to &#x60;_schemas&#x60;. |  [optional] |
|**leaderEligibility** | **Boolean** | If true, Karapace / Schema Registry on the service nodes can participate in leader election. It might be needed to disable this when the schemas topic is replicated to a secondary cluster and Karapace / Schema Registry there must not participate in leader election. Defaults to &#x60;true&#x60;. |  [optional] |



