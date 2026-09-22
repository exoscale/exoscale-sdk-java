

# CpuManagerConfig

CPU manager config

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cpuManagerPolicy** | [**CpuManagerPolicyEnum**](#CpuManagerPolicyEnum) | CPU management policy used by the kubelet. The \&quot;static\&quot; policy grants exclusive CPUs to Guaranteed pods requesting integer CPU limits. When set to \&quot;static\&quot;, a CPU reservation must be provided via kube-reserved or system-reserved |  [optional] |
|**cpuManagerPolicyOptions** | [**Set&lt;CpuManagerPolicyOptionsEnum&gt;**](#Set&lt;CpuManagerPolicyOptionsEnum&gt;) | CPU manager policy options used by the kubelet. They refine the behavior of the \&quot;static\&quot; cpu-manager-policy and are only valid when the policy is \&quot;static\&quot; |  [optional] |
|**kubeReserved** | [**ReservedResources**](ReservedResources.md) |  |  [optional] |
|**systemReserved** | [**ReservedResources**](ReservedResources.md) |  |  [optional] |
|**cpuManagerReconcilePeriod** | **String** | CPU manager reconcile period used by the kubelet, as a duration string (for example \&quot;10s\&quot;). |  [optional] |



## Enum: CpuManagerPolicyEnum

| Name | Value |
|---- | -----|
| STATIC | &quot;static&quot; |
| NONE | &quot;none&quot; |



## Enum: Set&lt;CpuManagerPolicyOptionsEnum&gt;

| Name | Value |
|---- | -----|
| DISTRIBUTE_CPUS_ACROSS_NUMA | &quot;distribute-cpus-across-numa&quot; |
| FULL_PCPUS_ONLY | &quot;full-pcpus-only&quot; |
| STRICT_CPU_RESERVATION | &quot;strict-cpu-reservation&quot; |
| ALIGN_BY_SOCKET | &quot;align-by-socket&quot; |
| PREFER_ALIGN_CPUS_BY_UNCORECACHE | &quot;prefer-align-cpus-by-uncorecache&quot; |
| DISTRIBUTE_CPUS_ACROSS_CORES | &quot;distribute-cpus-across-cores&quot; |



