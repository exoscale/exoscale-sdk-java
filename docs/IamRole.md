# IamRole

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | IAM Role ID |  [optional]
**name** | **String** | IAM Role name |  [optional]
**description** | **String** | IAM Role description |  [optional]
**permissions** | [**List&lt;PermissionsEnum&gt;**](#List&lt;PermissionsEnum&gt;) | IAM Role permissions |  [optional]
**labels** | [**Labels**](Labels.md) |  |  [optional]
**editable** | **Boolean** | IAM Role mutability |  [optional]
**policy** | [**IamPolicy**](IamPolicy.md) |  |  [optional]

<a name="List<PermissionsEnum>"></a>
## Enum: List&lt;PermissionsEnum&gt;
Name | Value
---- | -----
BYPASS_GOVERNANCE_RETENTION | &quot;bypass-governance-retention&quot;
