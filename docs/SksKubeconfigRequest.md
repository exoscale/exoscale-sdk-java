# SksKubeconfigRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ttl** | **Long** | Validity in seconds of the Kubeconfig user certificate (default: 30 days) |  [optional]
**user** | **String** | User name in the generated Kubeconfig. The certificate present in the Kubeconfig will also have this name set for the CN field. |  [optional]
**groups** | **List&lt;String&gt;** | List of roles. The certificate present in the Kubeconfig will have these roles set in the Org field. |  [optional]
