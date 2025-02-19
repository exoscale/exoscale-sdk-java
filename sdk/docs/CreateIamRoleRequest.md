

# CreateIamRoleRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | IAM Role name |  |
|**description** | **String** | IAM Role description |  [optional] |
|**permissions** | [**Set&lt;PermissionsEnum&gt;**](#Set&lt;PermissionsEnum&gt;) | IAM Role permissions |  [optional] |
|**editable** | **Boolean** | Sets if the IAM Role Policy is editable or not (default: true). This setting cannot be changed after creation |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**policy** | [**IamPolicy**](IamPolicy.md) |  |  [optional] |



## Enum: Set&lt;PermissionsEnum&gt;

| Name | Value |
|---- | -----|
| BYPASS_GOVERNANCE_RETENTION | &quot;bypass-governance-retention&quot; |
| RESET_IAM_ORGANIZATION_POLICY | &quot;reset-iam-organization-policy&quot; |



