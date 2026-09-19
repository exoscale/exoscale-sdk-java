

# IamSystemRole

IAM System Role

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | IAM System Role description |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**permissions** | [**Set&lt;PermissionsEnum&gt;**](#Set&lt;PermissionsEnum&gt;) | IAM System Role permissions |  [optional] |
|**assumeRolePolicy** | [**IamAssumeRolePolicy**](IamAssumeRolePolicy.md) |  |  [optional] |
|**editable** | **Boolean** | IAM System Role mutability |  [optional] |
|**name** | **String** | IAM System Role name |  [optional] |
|**maxSessionTtl** | **Long** | Maximum TTL requester is allowed to ask for when assuming a system role |  [optional] |
|**policy** | [**IamPolicy**](IamPolicy.md) |  |  [optional] |
|**id** | **UUID** | IAM System Role ID |  [optional] [readonly] |



## Enum: Set&lt;PermissionsEnum&gt;

| Name | Value |
|---- | -----|
| BYPASS_GOVERNANCE_RETENTION | &quot;bypass-governance-retention&quot; |
| RESET_IAM_ORGANIZATION_POLICY | &quot;reset-iam-organization-policy&quot; |



