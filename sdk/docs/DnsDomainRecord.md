

# DnsDomainRecord

DNS domain record

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**updatedAt** | **OffsetDateTime** | DNS domain record update date |  [optional] [readonly] |
|**content** | **String** | DNS domain record content |  [optional] |
|**name** | **String** | DNS domain record name |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | DNS domain record type |  [optional] |
|**ttl** | **Long** | DNS domain record TTL |  [optional] |
|**priority** | **Long** | DNS domain record priority |  [optional] |
|**id** | **UUID** | DNS domain record ID |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | DNS domain record creation date |  [optional] [readonly] |
|**systemRecord** | **Boolean** | DNS domain record system status |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NS | &quot;NS&quot; |
| CAA | &quot;CAA&quot; |
| NAPTR | &quot;NAPTR&quot; |
| POOL | &quot;POOL&quot; |
| A | &quot;A&quot; |
| HINFO | &quot;HINFO&quot; |
| CNAME | &quot;CNAME&quot; |
| SOA | &quot;SOA&quot; |
| SSHFP | &quot;SSHFP&quot; |
| SRV | &quot;SRV&quot; |
| AAAA | &quot;AAAA&quot; |
| MX | &quot;MX&quot; |
| TXT | &quot;TXT&quot; |
| ALIAS | &quot;ALIAS&quot; |
| URL | &quot;URL&quot; |
| SPF | &quot;SPF&quot; |



