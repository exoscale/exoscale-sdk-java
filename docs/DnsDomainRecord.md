# DnsDomainRecord

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | DNS domain record ID |  [optional]
**priority** | **Long** | DNS domain record priority |  [optional]
**content** | **String** | DNS domain record content |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | DNS domain record type |  [optional]
**ttl** | **Long** | DNS domain record TTL |  [optional]
**name** | **String** | DNS domain record name |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | DNS domain record creation date |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | DNS domain record update date |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
NS | &quot;NS&quot;
CAA | &quot;CAA&quot;
NAPTR | &quot;NAPTR&quot;
POOL | &quot;POOL&quot;
A | &quot;A&quot;
HINFO | &quot;HINFO&quot;
CNAME | &quot;CNAME&quot;
SOA | &quot;SOA&quot;
SSHFP | &quot;SSHFP&quot;
SRV | &quot;SRV&quot;
AAAA | &quot;AAAA&quot;
MX | &quot;MX&quot;
TXT | &quot;TXT&quot;
ALIAS | &quot;ALIAS&quot;
URL | &quot;URL&quot;
SPF | &quot;SPF&quot;
