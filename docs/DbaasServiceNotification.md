# DbaasServiceNotification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**level** | [**LevelEnum**](#LevelEnum) | Notification level | 
**message** | **String** | Human notification message | 
**type** | [**TypeEnum**](#TypeEnum) | Notification type | 
**metadata** | **Object** | Notification type | 

<a name="LevelEnum"></a>
## Enum: LevelEnum
Name | Value
---- | -----
WARNING | &quot;warning&quot;
NOTICE | &quot;notice&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
POWERED_OFF_REMOVAL | &quot;service_powered_off_removal&quot;
END_OF_LIFE | &quot;service_end_of_life&quot;
