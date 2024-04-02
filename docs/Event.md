

# Event

A notable Mutation Event which happened on the infrastructure

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | Operation unique identifier |  [optional] |
|**iamRole** | [**IamRole**](IamRole.md) |  |  [optional] |
|**zone** | **String** | Operation targeted zone |  [optional] |
|**getParams** | **Object** | Query string parameters (free form map) |  [optional] |
|**bodyParams** | **Object** | Body parameters (free form map) |  [optional] |
|**status** | **Long** | Operation HTTP status |  [optional] |
|**sourceIp** | **String** | Client IP address |  [optional] |
|**iamApiKey** | [**IamApiKey**](IamApiKey.md) |  |  [optional] |
|**uri** | **String** | Operation request URI |  [optional] |
|**elapsedMs** | **Long** | Operation processing time |  [optional] |
|**timestamp** | **OffsetDateTime** | Time at which the event happened, millisecond resolution |  [optional] |
|**pathParams** | **Object** | URI path parameters (free form map) |  [optional] |
|**handler** | **String** | Operation handler name |  [optional] |
|**message** | **String** | Operation message |  [optional] |



