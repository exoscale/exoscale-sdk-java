

# CpuManager

CPU manager (kubelet settings)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**policy** | [**PolicyEnum**](#PolicyEnum) | CPU management policy used by the kubelet. The \&quot;static\&quot; policy grants exclusive CPUs to Guaranteed pods requesting integer CPU limits. When set to \&quot;static\&quot;, a cpu value must be set in the Nodepool kube-reserved or system-reserved |  [optional] |
|**policyOptions** | [**Set&lt;PolicyOptionsEnum&gt;**](#Set&lt;PolicyOptionsEnum&gt;) | CPU manager policy options used by the kubelet. They refine the behavior of the \&quot;static\&quot; policy and are only valid when the policy is \&quot;static\&quot; |  [optional] |
|**reconcilePeriod** | **String** | CPU manager reconcile period used by the kubelet, as a duration string (for example \&quot;10s\&quot;). |  [optional] |



## Enum: PolicyEnum

| Name | Value |
|---- | -----|
| STATIC | &quot;static&quot; |
| NONE | &quot;none&quot; |



## Enum: Set&lt;PolicyOptionsEnum&gt;

| Name | Value |
|---- | -----|
| DISTRIBUTE_CPUS_ACROSS_NUMA | &quot;distribute-cpus-across-numa&quot; |
| FULL_PCPUS_ONLY | &quot;full-pcpus-only&quot; |
| STRICT_CPU_RESERVATION | &quot;strict-cpu-reservation&quot; |
| ALIGN_BY_SOCKET | &quot;align-by-socket&quot; |
| PREFER_ALIGN_CPUS_BY_UNCORECACHE | &quot;prefer-align-cpus-by-uncorecache&quot; |
| DISTRIBUTE_CPUS_ACROSS_CORES | &quot;distribute-cpus-across-cores&quot; |



