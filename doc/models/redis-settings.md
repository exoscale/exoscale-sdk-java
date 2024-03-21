
# Redis Settings

## Structure

`RedisSettings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Ssl` | `Boolean` | Optional | **Default**: `true` | Boolean getSsl() | setSsl(Boolean ssl) |
| `LfuLogFactor` | `Integer` | Optional | **Default**: `10`<br>**Constraints**: `>= 0`, `<= 100` | Integer getLfuLogFactor() | setLfuLogFactor(Integer lfuLogFactor) |
| `MaxmemoryPolicy` | [`RedisMaxmemoryPolicyEnum`](../../doc/models/redis-maxmemory-policy-enum.md) | Optional | **Default**: `RedisMaxmemoryPolicyEnum.NOEVICTION` | RedisMaxmemoryPolicyEnum getMaxmemoryPolicy() | setMaxmemoryPolicy(RedisMaxmemoryPolicyEnum maxmemoryPolicy) |
| `IoThreads` | `Integer` | Optional | Set Redis IO thread count. Changing this will cause a restart of the Redis service.<br>**Constraints**: `>= 1`, `<= 32` | Integer getIoThreads() | setIoThreads(Integer ioThreads) |
| `LfuDecayTime` | `Integer` | Optional | **Default**: `1`<br>**Constraints**: `>= 1`, `<= 120` | Integer getLfuDecayTime() | setLfuDecayTime(Integer lfuDecayTime) |
| `PubsubClientOutputBufferLimit` | `Integer` | Optional | Set output buffer limit for pub / sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.<br>**Constraints**: `>= 32`, `<= 512` | Integer getPubsubClientOutputBufferLimit() | setPubsubClientOutputBufferLimit(Integer pubsubClientOutputBufferLimit) |
| `NotifyKeyspaceEvents` | `String` | Optional | **Constraints**: *Maximum Length*: `32`, *Pattern*: `^[KEg\$lshzxeA]*$` | String getNotifyKeyspaceEvents() | setNotifyKeyspaceEvents(String notifyKeyspaceEvents) |
| `Persistence` | [`RedisPersistenceEnum`](../../doc/models/redis-persistence-enum.md) | Optional | When persistence is 'rdb', Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is 'off', no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can't be forked. | RedisPersistenceEnum getPersistence() | setPersistence(RedisPersistenceEnum persistence) |
| `Timeout` | `Integer` | Optional | **Default**: `300`<br>**Constraints**: `>= 0`, `<= 31536000` | Integer getTimeout() | setTimeout(Integer timeout) |
| `AclChannelsDefault` | [`DefaultACLForPubSubChannelsUsedWhenRedisUserIsCreatedEnum`](../../doc/models/default-acl-for-pub-sub-channels-used-when-redis-user-is-created-enum.md) | Optional | Determines default pub/sub channels' ACL for new users if ACL is not supplied. When this option is not defined, all_channels is assumed to keep backward compatibility. This option doesn't affect Redis configuration acl-pubsub-default. | DefaultACLForPubSubChannelsUsedWhenRedisUserIsCreatedEnum getAclChannelsDefault() | setAclChannelsDefault(DefaultACLForPubSubChannelsUsedWhenRedisUserIsCreatedEnum aclChannelsDefault) |
| `NumberOfDatabases` | `Integer` | Optional | Set number of Redis databases. Changing this will cause a restart of the Redis service.<br>**Constraints**: `>= 1`, `<= 128` | Integer getNumberOfDatabases() | setNumberOfDatabases(Integer numberOfDatabases) |

## Example (as JSON)

```json
{
  "ssl": true,
  "lfu_log_factor": 10,
  "maxmemory_policy": "noeviction",
  "io_threads": 1,
  "lfu_decay_time": 1,
  "pubsub_client_output_buffer_limit": 64,
  "timeout": 300,
  "number_of_databases": 16
}
```

