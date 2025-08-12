

# CreateDnsDomainRecordRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | DNS domain record name |  |
|**type** | [**TypeEnum**](#TypeEnum) | DNS domain record type |  |
|**content** | **String** | DNS domain record content |  |
|**ttl** | **Long** | DNS domain record TTL |  [optional] |
|**priority** | **Long** | DNS domain record priority |  [optional] |



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
| SSHFP | &quot;SSHFP&quot; |
| SRV | &quot;SRV&quot; |
| AAAA | &quot;AAAA&quot; |
| MX | &quot;MX&quot; |
| TXT | &quot;TXT&quot; |
| ALIAS | &quot;ALIAS&quot; |
| URL | &quot;URL&quot; |



