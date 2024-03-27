# ReverseDnsApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteReverseDnsElasticIp**](ReverseDnsApi.md#deleteReverseDnsElasticIp) | **DELETE** /reverse-dns/elastic-ip/{id} | Delete the PTR DNS record for an elastic IP |
| [**deleteReverseDnsInstance**](ReverseDnsApi.md#deleteReverseDnsInstance) | **DELETE** /reverse-dns/instance/{id} | Delete the PTR DNS record for an instance |
| [**getReverseDnsElasticIp**](ReverseDnsApi.md#getReverseDnsElasticIp) | **GET** /reverse-dns/elastic-ip/{id} | Query the PTR DNS records for an elastic IP |
| [**getReverseDnsInstance**](ReverseDnsApi.md#getReverseDnsInstance) | **GET** /reverse-dns/instance/{id} | Query the PTR DNS records for an instance |
| [**updateReverseDnsElasticIp**](ReverseDnsApi.md#updateReverseDnsElasticIp) | **POST** /reverse-dns/elastic-ip/{id} | Update/Create the PTR DNS record for an elastic IP |
| [**updateReverseDnsInstance**](ReverseDnsApi.md#updateReverseDnsInstance) | **POST** /reverse-dns/instance/{id} | Update/Create the PTR DNS record for an instance |


<a id="deleteReverseDnsElasticIp"></a>
# **deleteReverseDnsElasticIp**
> Operation deleteReverseDnsElasticIp(id)

Delete the PTR DNS record for an elastic IP



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReverseDnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    ReverseDnsApi apiInstance = new ReverseDnsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      Operation result = apiInstance.deleteReverseDnsElasticIp(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReverseDnsApi#deleteReverseDnsElasticIp");
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

<a id="deleteReverseDnsInstance"></a>
# **deleteReverseDnsInstance**
> Operation deleteReverseDnsInstance(id)

Delete the PTR DNS record for an instance



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReverseDnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    ReverseDnsApi apiInstance = new ReverseDnsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      Operation result = apiInstance.deleteReverseDnsInstance(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReverseDnsApi#deleteReverseDnsInstance");
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

<a id="getReverseDnsElasticIp"></a>
# **getReverseDnsElasticIp**
> ReverseDnsRecord getReverseDnsElasticIp(id)

Query the PTR DNS records for an elastic IP



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReverseDnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    ReverseDnsApi apiInstance = new ReverseDnsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      ReverseDnsRecord result = apiInstance.getReverseDnsElasticIp(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReverseDnsApi#getReverseDnsElasticIp");
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

[**ReverseDnsRecord**](ReverseDnsRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="getReverseDnsInstance"></a>
# **getReverseDnsInstance**
> ReverseDnsRecord getReverseDnsInstance(id)

Query the PTR DNS records for an instance



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReverseDnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    ReverseDnsApi apiInstance = new ReverseDnsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      ReverseDnsRecord result = apiInstance.getReverseDnsInstance(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReverseDnsApi#getReverseDnsInstance");
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

[**ReverseDnsRecord**](ReverseDnsRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="updateReverseDnsElasticIp"></a>
# **updateReverseDnsElasticIp**
> Operation updateReverseDnsElasticIp(id, updateReverseDnsElasticIpRequest)

Update/Create the PTR DNS record for an elastic IP



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReverseDnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    ReverseDnsApi apiInstance = new ReverseDnsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    UpdateReverseDnsElasticIpRequest updateReverseDnsElasticIpRequest = new UpdateReverseDnsElasticIpRequest(); // UpdateReverseDnsElasticIpRequest | 
    try {
      Operation result = apiInstance.updateReverseDnsElasticIp(id, updateReverseDnsElasticIpRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReverseDnsApi#updateReverseDnsElasticIp");
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
| **updateReverseDnsElasticIpRequest** | [**UpdateReverseDnsElasticIpRequest**](UpdateReverseDnsElasticIpRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="updateReverseDnsInstance"></a>
# **updateReverseDnsInstance**
> Operation updateReverseDnsInstance(id, updateReverseDnsElasticIpRequest)

Update/Create the PTR DNS record for an instance



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReverseDnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    ReverseDnsApi apiInstance = new ReverseDnsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    UpdateReverseDnsElasticIpRequest updateReverseDnsElasticIpRequest = new UpdateReverseDnsElasticIpRequest(); // UpdateReverseDnsElasticIpRequest | 
    try {
      Operation result = apiInstance.updateReverseDnsInstance(id, updateReverseDnsElasticIpRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReverseDnsApi#updateReverseDnsInstance");
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
| **updateReverseDnsElasticIpRequest** | [**UpdateReverseDnsElasticIpRequest**](UpdateReverseDnsElasticIpRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

