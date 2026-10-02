

# KeyRotationConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**automatic** | **Boolean** | When set to true, dictates that the system automatically rotates material periodically. |  |
|**manualCount** | **Integer** | Total running tally of manual key rotation tasks executed by users over this key resource&#39;s lifecycle. |  |
|**nextAt** | **OffsetDateTime** | Scheduled deadline calculation pinpointing the next automated rotational iteration target date. |  |
|**rotationPeriod** | **Integer** | The set frequency period (measured in days) for triggers monitoring auto-rotation loops. |  |



