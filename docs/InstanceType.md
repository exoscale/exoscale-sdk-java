# InstanceType

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) | Instance type ID |  [optional]
**size** | [**SizeEnum**](#SizeEnum) | Instance type size |  [optional]
**family** | [**FamilyEnum**](#FamilyEnum) | Instance type family |  [optional]
**cpus** | **Long** | CPU count |  [optional]
**gpus** | **Long** | GPU count |  [optional]
**authorized** | **Boolean** | Requires authorization or publicly available |  [optional]
**memory** | **Long** | Available memory |  [optional]
**zones** | [**List&lt;ZoneName&gt;**](ZoneName.md) | Instance Type available zones |  [optional]

<a name="SizeEnum"></a>
## Enum: SizeEnum
Name | Value
---- | -----
LARGE | &quot;large&quot;
HUGE | &quot;huge&quot;
JUMBO | &quot;jumbo&quot;
MEDIUM | &quot;medium&quot;
MEGA | &quot;mega&quot;
SMALL | &quot;small&quot;
EXTRA_LARGE | &quot;extra-large&quot;
TITAN | &quot;titan&quot;
MICRO | &quot;micro&quot;
COLOSSUS | &quot;colossus&quot;
TINY | &quot;tiny&quot;

<a name="FamilyEnum"></a>
## Enum: FamilyEnum
Name | Value
---- | -----
GPU3 | &quot;gpu3&quot;
GPU2 | &quot;gpu2&quot;
GPU | &quot;gpu&quot;
MEMORY | &quot;memory&quot;
STORAGE | &quot;storage&quot;
STANDARD | &quot;standard&quot;
COLOSSUS | &quot;colossus&quot;
CPU | &quot;cpu&quot;
