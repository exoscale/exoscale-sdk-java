

# UpdateIamRoleRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | IAM Role description |  [optional] |
|**permissions** | [**Set&lt;PermissionsEnum&gt;**](#Set&lt;PermissionsEnum&gt;) | IAM Role permissions |  [optional] |
|**labels** | **Map&lt;String, String&gt;** |  |  [optional] |
|**maxSessionTtl** | **Long** | Maximum TTL requester is allowed to ask for when assuming a role |  [optional] |



## Enum: Set&lt;PermissionsEnum&gt;

| Name | Value |
|---- | -----|
| BYPASS_GOVERNANCE_RETENTION | &quot;bypass-governance-retention&quot; |
| RESET_IAM_ORGANIZATION_POLICY | &quot;reset-iam-organization-policy&quot; |



