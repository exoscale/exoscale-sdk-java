# DbaasServiceMaintenance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dow** | [**DowEnum**](#DowEnum) | Day of week for installing updates | 
**time** | **String** | Time for installing updates, UTC | 
**updates** | [**List&lt;DbaasServiceUpdate&gt;**](DbaasServiceUpdate.md) | List of updates waiting to be installed | 

<a name="DowEnum"></a>
## Enum: DowEnum
Name | Value
---- | -----
SATURDAY | &quot;saturday&quot;
TUESDAY | &quot;tuesday&quot;
NEVER | &quot;never&quot;
WEDNESDAY | &quot;wednesday&quot;
SUNDAY | &quot;sunday&quot;
FRIDAY | &quot;friday&quot;
MONDAY | &quot;monday&quot;
THURSDAY | &quot;thursday&quot;
