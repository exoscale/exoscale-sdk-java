

# InstanceType

Compute instance type

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Instance type ID |  [optional] [readonly] |
|**size** | [**SizeEnum**](#SizeEnum) | Instance type size |  [optional] [readonly] |
|**family** | [**FamilyEnum**](#FamilyEnum) | Instance type family |  [optional] [readonly] |
|**cpus** | **Long** | CPU count |  [optional] [readonly] |
|**gpus** | **Long** | GPU count |  [optional] [readonly] |
|**authorized** | **Boolean** | Requires authorization or publicly available |  [optional] [readonly] |
|**memory** | **Long** | Available memory |  [optional] [readonly] |
|**zones** | **List&lt;ZoneName&gt;** | Instance Type available zones |  [optional] [readonly] |



## Enum: SizeEnum

| Name | Value |
|---- | -----|
| LARGE | &quot;large&quot; |
| HUGE | &quot;huge&quot; |
| JUMBO | &quot;jumbo&quot; |
| MEDIUM | &quot;medium&quot; |
| MEGA | &quot;mega&quot; |
| SMALL | &quot;small&quot; |
| EXTRA_LARGE | &quot;extra-large&quot; |
| TITAN | &quot;titan&quot; |
| MICRO | &quot;micro&quot; |
| COLOSSUS | &quot;colossus&quot; |
| TINY | &quot;tiny&quot; |



## Enum: FamilyEnum

| Name | Value |
|---- | -----|
| GPU3 | &quot;gpu3&quot; |
| GPU2 | &quot;gpu2&quot; |
| GPU | &quot;gpu&quot; |
| MEMORY | &quot;memory&quot; |
| STORAGE | &quot;storage&quot; |
| STANDARD | &quot;standard&quot; |
| COLOSSUS | &quot;colossus&quot; |
| CPU | &quot;cpu&quot; |



