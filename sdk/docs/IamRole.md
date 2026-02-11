

# IamRole

IAM Role

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | IAM Role description |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**permissions** | [**Set&lt;PermissionsEnum&gt;**](#Set&lt;PermissionsEnum&gt;) | IAM Role permissions |  [optional] |
|**assumeRolePolicy** | [**IamPolicy**](IamPolicy.md) |  |  [optional] |
|**editable** | **Boolean** | IAM Role mutability |  [optional] |
|**name** | **String** | IAM Role name |  [optional] |
|**maxSessionTtl** | **Long** | Maximum TTL requester is allowed to ask for when assuming a role |  [optional] |
|**policy** | [**IamPolicy**](IamPolicy.md) |  |  [optional] |
|**id** | **UUID** | IAM Role ID |  [optional] [readonly] |



## Enum: Set&lt;PermissionsEnum&gt;

| Name | Value |
|---- | -----|
| BYPASS_GOVERNANCE_RETENTION | &quot;bypass-governance-retention&quot; |
| RESET_IAM_ORGANIZATION_POLICY | &quot;reset-iam-organization-policy&quot; |



