

# JsonSchemaValkey


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ssl** | **Boolean** |  |  [optional] |
|**lfuLogFactor** | **Integer** |  |  [optional] |
|**maxmemoryPolicy** | [**MaxmemoryPolicyEnum**](#MaxmemoryPolicyEnum) |  |  [optional] |
|**ioThreads** | **Integer** | Set Valkey IO thread count. Changing this will cause a restart of the Valkey service. |  [optional] |
|**lfuDecayTime** | **Integer** |  |  [optional] |
|**pubsubClientOutputBufferLimit** | **Integer** | Set output buffer limit for pub / sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan. |  [optional] |
|**notifyKeyspaceEvents** | **String** |  |  [optional] |
|**persistence** | [**PersistenceEnum**](#PersistenceEnum) | When persistence is &#39;rdb&#39;, Valkey does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is &#39;off&#39;, no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can&#39;t be forked. |  [optional] |
|**timeout** | **Integer** |  |  [optional] |
|**aclChannelsDefault** | [**AclChannelsDefaultEnum**](#AclChannelsDefaultEnum) | Determines default pub/sub channels&#39; ACL for new users if ACL is not supplied. When this option is not defined, all_channels is assumed to keep backward compatibility. This option doesn&#39;t affect Valkey configuration acl-pubsub-default. |  [optional] |
|**numberOfDatabases** | **Integer** | Set number of Valkey databases. Changing this will cause a restart of the Valkey service. |  [optional] |



## Enum: MaxmemoryPolicyEnum

| Name | Value |
|---- | -----|
| NOEVICTION | &quot;noeviction&quot; |
| ALLKEYS_LRU | &quot;allkeys-lru&quot; |
| VOLATILE_LRU | &quot;volatile-lru&quot; |
| ALLKEYS_RANDOM | &quot;allkeys-random&quot; |
| VOLATILE_RANDOM | &quot;volatile-random&quot; |
| VOLATILE_TTL | &quot;volatile-ttl&quot; |
| VOLATILE_LFU | &quot;volatile-lfu&quot; |
| ALLKEYS_LFU | &quot;allkeys-lfu&quot; |



## Enum: PersistenceEnum

| Name | Value |
|---- | -----|
| OFF | &quot;off&quot; |
| RDB | &quot;rdb&quot; |



## Enum: AclChannelsDefaultEnum

| Name | Value |
|---- | -----|
| ALLCHANNELS | &quot;allchannels&quot; |
| RESETCHANNELS | &quot;resetchannels&quot; |



