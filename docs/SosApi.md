# SosApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSosPresignedUrl**](SosApi.md#getSosPresignedUrl) | **GET** /sos/{bucket}/presigned-url | Retrieve Presigned Download URL for SOS object |
| [**listSosBucketsUsage**](SosApi.md#listSosBucketsUsage) | **GET** /sos-buckets-usage | List SOS Buckets Usage |



## getSosPresignedUrl

> GetSosPresignedUrl200Response getSosPresignedUrl(bucket, key)

Retrieve Presigned Download URL for SOS object

Generates Presigned Download URL for SOS object

### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.SosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SosApi apiInstance = new SosApi(defaultClient);
        String bucket = "bucket_example"; // String | 
        String key = "key_example"; // String | 
        try {
            GetSosPresignedUrl200Response result = apiInstance.getSosPresignedUrl(bucket, key);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SosApi#getSosPresignedUrl");
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
| **bucket** | **String**|  | |
| **key** | **String**|  | [optional] |

### Return type

[**GetSosPresignedUrl200Response**](GetSosPresignedUrl200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listSosBucketsUsage

> ListSosBucketsUsage200Response listSosBucketsUsage()

List SOS Buckets Usage



### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.SosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SosApi apiInstance = new SosApi(defaultClient);
        try {
            ListSosBucketsUsage200Response result = apiInstance.listSosBucketsUsage();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SosApi#listSosBucketsUsage");
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

[**ListSosBucketsUsage200Response**](ListSosBucketsUsage200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

