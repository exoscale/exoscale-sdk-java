# DeployTargetApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDeployTarget**](DeployTargetApi.md#getDeployTarget) | **GET** /deploy-target/{id} | Retrieve Deploy Target details |
| [**listDeployTargets**](DeployTargetApi.md#listDeployTargets) | **GET** /deploy-target | List Deploy Targets |



## getDeployTarget

> DeployTarget getDeployTarget(id)

Retrieve Deploy Target details



### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.DeployTargetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        DeployTargetApi apiInstance = new DeployTargetApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            DeployTarget result = apiInstance.getDeployTarget(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeployTargetApi#getDeployTarget");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**DeployTarget**](DeployTarget.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listDeployTargets

> ListDeployTargets200Response listDeployTargets()

List Deploy Targets



### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.DeployTargetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        DeployTargetApi apiInstance = new DeployTargetApi(defaultClient);
        try {
            ListDeployTargets200Response result = apiInstance.listDeployTargets();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeployTargetApi#listDeployTargets");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListDeployTargets200Response**](ListDeployTargets200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

