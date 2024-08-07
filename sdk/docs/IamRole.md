

# IamRole

IAM Role

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | IAM Role ID |  [optional] [readonly] |
|**name** | **String** | IAM Role name |  [optional] |
|**description** | **String** | IAM Role description |  [optional] |
|**permissions** | [**Set&lt;PermissionsEnum&gt;**](#Set&lt;PermissionsEnum&gt;) | IAM Role permissions |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**editable** | **Boolean** | IAM Role mutability |  [optional] |
|**policy** | [**IamPolicy**](IamPolicy.md) |  |  [optional] |



## Enum: Set&lt;PermissionsEnum&gt;

| Name | Value |
|---- | -----|
| BYPASS_GOVERNANCE_RETENTION | &quot;bypass-governance-retention&quot; |



