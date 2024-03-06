# ComputeApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**resetLoadBalancerServiceField**](ComputeApi.md#resetLoadBalancerServiceField) | **DELETE** /load-balancer/{id}/service/{service-id}/{field} | Reset a Load Balancer Service field to its default value |



## resetLoadBalancerServiceField

> Operation resetLoadBalancerServiceField(id, serviceId, field)

Reset a Load Balancer Service field to its default value



### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.ComputeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        ComputeApi apiInstance = new ComputeApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UUID serviceId = UUID.randomUUID(); // UUID | 
        String field = "description"; // String | 
        try {
            Operation result = apiInstance.resetLoadBalancerServiceField(id, serviceId, field);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ComputeApi#resetLoadBalancerServiceField");
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
| **serviceId** | **UUID**|  | |
| **field** | **String**|  | [enum: description] |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

