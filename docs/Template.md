# Template

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maintainer** | **String** | Template maintainer |  [optional]
**description** | **String** | Template description |  [optional]
**sshKeyEnabled** | **Boolean** | Enable SSH key-based login |  [optional]
**family** | **String** | Template family |  [optional]
**name** | **String** | Template name |  [optional]
**defaultUser** | **String** | Template default user |  [optional]
**size** | **Long** | Template size |  [optional]
**passwordEnabled** | **Boolean** | Enable password-based login |  [optional]
**build** | **String** | Template build |  [optional]
**checksum** | **String** | Template MD5 checksum |  [optional]
**bootMode** | [**BootModeEnum**](#BootModeEnum) | Boot mode (default: legacy) |  [optional]
**id** | [**UUID**](UUID.md) | Template ID |  [optional]
**zones** | [**List&lt;ZoneName&gt;**](ZoneName.md) | Zones availability |  [optional]
**url** | **String** | Template source URL |  [optional]
**version** | **String** | Template version |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Template creation date |  [optional]
**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Template visibility |  [optional]

<a name="BootModeEnum"></a>
## Enum: BootModeEnum
Name | Value
---- | -----
LEGACY | &quot;legacy&quot;
UEFI | &quot;uefi&quot;

<a name="VisibilityEnum"></a>
## Enum: VisibilityEnum
Name | Value
---- | -----
PRIVATE | &quot;private&quot;
PUBLIC | &quot;public&quot;
