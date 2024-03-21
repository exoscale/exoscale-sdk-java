# DeployTargetApi

All URIs are relative to *https://api-{zone}.exoscale.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDeployTarget**](DeployTargetApi.md#getDeployTarget) | **GET** /deploy-target/{id} | Retrieve Deploy Target details
[**listDeployTargets**](DeployTargetApi.md#listDeployTargets) | **GET** /deploy-target | List Deploy Targets

<a name="getDeployTarget"></a>
# **getDeployTarget**
> DeployTarget getDeployTarget(id)

Retrieve Deploy Target details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DeployTargetApi;


DeployTargetApi apiInstance = new DeployTargetApi();
UUID id = new UUID(); // UUID | 
try {
    DeployTarget result = apiInstance.getDeployTarget(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeployTargetApi#getDeployTarget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**DeployTarget**](DeployTarget.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDeployTargets"></a>
# **listDeployTargets**
> InlineResponse20012 listDeployTargets()

List Deploy Targets

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DeployTargetApi;


DeployTargetApi apiInstance = new DeployTargetApi();
try {
    InlineResponse20012 result = apiInstance.listDeployTargets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeployTargetApi#listDeployTargets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

