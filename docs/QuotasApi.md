# QuotasApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getQuota**](QuotasApi.md#getQuota) | **GET** /quota/{entity} | Retrieve Resource Quota |
| [**listQuotas**](QuotasApi.md#listQuotas) | **GET** /quota | List Organization Quotas |


<a id="getQuota"></a>
# **getQuota**
> Quota getQuota(entity)

Retrieve Resource Quota



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    QuotasApi apiInstance = new QuotasApi(defaultClient);
    String entity = "entity_example"; // String | 
    try {
      Quota result = apiInstance.getQuota(entity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotasApi#getQuota");
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
| **entity** | **String**|  | |

### Return type

[**Quota**](Quota.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="listQuotas"></a>
# **listQuotas**
> ListQuotas200Response listQuotas()

List Organization Quotas



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QuotasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    QuotasApi apiInstance = new QuotasApi(defaultClient);
    try {
      ListQuotas200Response result = apiInstance.listQuotas();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotasApi#listQuotas");
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

[**ListQuotas200Response**](ListQuotas200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

