# ComputeApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**resetLoadBalancerServiceField**](ComputeApi.md#resetLoadBalancerServiceField) | **DELETE** /load-balancer/{id}/service/{service-id}/{field} | Reset a Load Balancer Service field to its default value |
| [**resetLoadBalancerServiceFieldWithHttpInfo**](ComputeApi.md#resetLoadBalancerServiceFieldWithHttpInfo) | **DELETE** /load-balancer/{id}/service/{service-id}/{field} | Reset a Load Balancer Service field to its default value |



## resetLoadBalancerServiceField

> Operation resetLoadBalancerServiceField(id, serviceId, field)

Reset a Load Balancer Service field to its default value



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ComputeApi;

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

## resetLoadBalancerServiceFieldWithHttpInfo

> ApiResponse<Operation> resetLoadBalancerServiceField resetLoadBalancerServiceFieldWithHttpInfo(id, serviceId, field)

Reset a Load Balancer Service field to its default value



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ComputeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        ComputeApi apiInstance = new ComputeApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UUID serviceId = UUID.randomUUID(); // UUID | 
        String field = "description"; // String | 
        try {
            ApiResponse<Operation> response = apiInstance.resetLoadBalancerServiceFieldWithHttpInfo(id, serviceId, field);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ComputeApi#resetLoadBalancerServiceField");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
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

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

