

# KeyRotationConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**manualCount** | **Integer** | Total running tally of manual key rotation tasks executed by users over this key resource&#39;s lifecycle. |  |
|**automatic** | **Boolean** | When set to true, dictates that the system automatically rotates material periodically. |  |
|**rotationPeriod** | **Integer** | The set frequency period (measured in days) for triggers monitoring auto-rotation loops. |  |
|**nextAt** | **OffsetDateTime** | Scheduled deadline calculation pinpointing the next automated rotational iteration target date. |  |



