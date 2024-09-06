

# DbaasEndpointDatadog


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**datadogApiKey** | **String** | Datadog API key |  |
|**site** | **EnumDatadogSite** |  |  |
|**datadogTags** | [**List&lt;DbaasDatadogTag&gt;**](DbaasDatadogTag.md) | Custom tags provided by user |  [optional] |
|**disableConsumerStats** | **Boolean** | Disable consumer group metrics |  [optional] |
|**kafkaConsumerCheckInstances** | **Long** | Number of separate instances to fetch kafka consumer statistics with |  [optional] |
|**kafkaConsumerStatsTimeout** | **Long** | Number of seconds that datadog will wait to get consumer statistics from brokers |  [optional] |
|**maxPartitionContexts** | **Long** | Maximum number of partition contexts to send |  [optional] |



