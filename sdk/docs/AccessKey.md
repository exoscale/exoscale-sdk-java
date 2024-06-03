

# AccessKey

IAM Access Key

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | IAM Access Key name |  [optional] |
|**key** | **String** | IAM Access Key |  [optional] |
|**secret** | **String** | IAM Access Key Secret |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | IAM Access Key type |  [optional] [readonly] |
|**version** | [**VersionEnum**](#VersionEnum) | IAM Access Key version |  [optional] |
|**tags** | **List&lt;String&gt;** | IAM Access Key tags |  [optional] |
|**operations** | **List&lt;String&gt;** | IAM Access Key operations |  [optional] |
|**resources** | [**List&lt;AccessKeyResource&gt;**](AccessKeyResource.md) | IAM Access Key Resources |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| RESTRICTED | &quot;restricted&quot; |
| UNRESTRICTED | &quot;unrestricted&quot; |



## Enum: VersionEnum

| Name | Value |
|---- | -----|
| V2 | &quot;v2&quot; |
| V1 | &quot;v1&quot; |



