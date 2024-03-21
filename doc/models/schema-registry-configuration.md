
# Schema Registry Configuration

## Structure

`SchemaRegistryConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TopicName` | `String` | Optional | The durable single partition topic that acts as the durable log for the data. This topic must be compacted to avoid losing data due to retention policy. Please note that changing this configuration in an existing Schema Registry / Karapace setup leads to previous schemas being inaccessible, data encoded with them potentially unreadable and schema ID sequence put out of order. It's only possible to do the switch while Schema Registry / Karapace is disabled. Defaults to `_schemas`.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `249`, *Pattern*: `^(?!\.$\|\.\.$)[-_.A-Za-z0-9]+$` | String getTopicName() | setTopicName(String topicName) |
| `LeaderEligibility` | `Boolean` | Optional | If true, Karapace / Schema Registry on the service nodes can participate in leader election. It might be needed to disable this when the schemas topic is replicated to a secondary cluster and Karapace / Schema Registry there must not participate in leader election. Defaults to `true`. | Boolean getLeaderEligibility() | setLeaderEligibility(Boolean leaderEligibility) |

## Example (as JSON)

```json
{
  "topic_name": "_schemas",
  "leader_eligibility": true
}
```

