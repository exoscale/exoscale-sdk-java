

# MLCommonsSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mlCommonsConnectorAccessControlEnabled** | **Boolean** | When set to true, the setting allows admins to control access and permissions to the connector API using backend_roles. Defaults to false. |  [optional] |
|**mlCommonsMaxModelOnNode** | **Integer** | Maximum number of ML models that can be deployed on a single ML node. Defaults to 10. |  [optional] |
|**mlCommonsModelAccessControlEnabled** | **Boolean** | Enable or disable model access control for ML Commons. When enabled, access to ML models is controlled by security permissions. Defaults to false. |  [optional] |
|**mlCommonsModelAutoDeployEnable** | **Boolean** | For externally hosted models only: automatically deploy a model on its first predict request instead of requiring an explicit deploy call first. Defaults to true. |  [optional] |
|**mlCommonsModelAutoRedeployEnable** | **Boolean** | Automatically redeploy deployed or partially deployed models after ML nodes rejoin the cluster, e.g. after a node replacement. Defaults to true. |  [optional] |
|**mlCommonsNativeMemoryThreshold** | **Integer** | Native memory threshold percentage for ML Commons. Controls the maximum percentage of native memory that can be used by ML Commons operations. Defaults to 90%. |  [optional] |
|**mlCommonsOnlyRunOnMlNode** | **Boolean** | Enable or disable running ML Commons tasks only on ML nodes. When enabled, ML tasks will only execute on nodes designated as ML nodes. Defaults to true. |  [optional] |
|**mlCommonsTrustedConnectorEndpointsRegex** | **List&lt;String&gt;** | Adds the trusted endpoints to the cluster settings. Supports Java regex expressions. |  [optional] |



