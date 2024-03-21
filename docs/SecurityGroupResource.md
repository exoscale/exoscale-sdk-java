# SecurityGroupResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | Security Group ID |  [optional]
**name** | **String** | Security Group name |  [optional]
**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Whether this points to a public security group. This is only valid when in the context of                    a rule addition which uses a public security group as a source or destination. |  [optional]

<a name="VisibilityEnum"></a>
## Enum: VisibilityEnum
Name | Value
---- | -----
PRIVATE | &quot;private&quot;
PUBLIC | &quot;public&quot;
