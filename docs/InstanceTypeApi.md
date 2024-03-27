# InstanceTypeApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInstanceType**](InstanceTypeApi.md#getInstanceType) | **GET** /instance-type/{id} | Retrieve Instance Type details |
| [**getInstanceTypeWithHttpInfo**](InstanceTypeApi.md#getInstanceTypeWithHttpInfo) | **GET** /instance-type/{id} | Retrieve Instance Type details |
| [**listInstanceTypes**](InstanceTypeApi.md#listInstanceTypes) | **GET** /instance-type | List Compute instance Types |
| [**listInstanceTypesWithHttpInfo**](InstanceTypeApi.md#listInstanceTypesWithHttpInfo) | **GET** /instance-type | List Compute instance Types |



## getInstanceType

> InstanceType getInstanceType(id)

Retrieve Instance Type details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceTypeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        InstanceTypeApi apiInstance = new InstanceTypeApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            InstanceType result = apiInstance.getInstanceType(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstanceTypeApi#getInstanceType");
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

[**InstanceType**](InstanceType.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## getInstanceTypeWithHttpInfo

> ApiResponse<InstanceType> getInstanceType getInstanceTypeWithHttpInfo(id)

Retrieve Instance Type details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceTypeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        InstanceTypeApi apiInstance = new InstanceTypeApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<InstanceType> response = apiInstance.getInstanceTypeWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling InstanceTypeApi#getInstanceType");
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

### Return type

ApiResponse<[**InstanceType**](InstanceType.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listInstanceTypes

> ListInstanceTypes200Response listInstanceTypes()

List Compute instance Types



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceTypeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        InstanceTypeApi apiInstance = new InstanceTypeApi(defaultClient);
        try {
            ListInstanceTypes200Response result = apiInstance.listInstanceTypes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstanceTypeApi#listInstanceTypes");
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

[**ListInstanceTypes200Response**](ListInstanceTypes200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## listInstanceTypesWithHttpInfo

> ApiResponse<ListInstanceTypes200Response> listInstanceTypes listInstanceTypesWithHttpInfo()

List Compute instance Types



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceTypeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        InstanceTypeApi apiInstance = new InstanceTypeApi(defaultClient);
        try {
            ApiResponse<ListInstanceTypes200Response> response = apiInstance.listInstanceTypesWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling InstanceTypeApi#listInstanceTypes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListInstanceTypes200Response**](ListInstanceTypes200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

