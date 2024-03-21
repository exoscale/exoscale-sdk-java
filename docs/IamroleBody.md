# IamroleBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | IAM Role name | 
**description** | **String** | IAM Role description |  [optional]
**permissions** | [**List&lt;PermissionsEnum&gt;**](#List&lt;PermissionsEnum&gt;) | IAM Role permissions |  [optional]
**editable** | **Boolean** | Sets if the IAM Role Policy is editable or not (default: true). This setting cannot be changed after creation |  [optional]
**labels** | [**Labels**](Labels.md) |  |  [optional]
**policy** | [**IamPolicy**](IamPolicy.md) |  |  [optional]

<a name="List<PermissionsEnum>"></a>
## Enum: List&lt;PermissionsEnum&gt;
Name | Value
---- | -----
BYPASS_GOVERNANCE_RETENTION | &quot;bypass-governance-retention&quot;
