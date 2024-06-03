

# DbaasMigrationStatus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**error** | **String** | Error message in case that migration has failed |  [optional] |
|**masterLastIoSecondsAgo** | **Long** | Redis only: how many seconds since last I/O with redis master |  [optional] |
|**masterLinkStatus** | **EnumMasterLinkStatus** |  |  [optional] |
|**method** | **String** | Migration method. Empty in case of multiple methods or error |  [optional] |
|**status** | **String** | Migration status |  [optional] |
|**details** | [**List&lt;DbaasMigrationStatusDetailsInner&gt;**](DbaasMigrationStatusDetailsInner.md) | Migration status per database |  [optional] |



