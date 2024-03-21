# QuotasApi

All URIs are relative to *https://api-{zone}.exoscale.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getQuota**](QuotasApi.md#getQuota) | **GET** /quota/{entity} | Retrieve Resource Quota
[**listQuotas**](QuotasApi.md#listQuotas) | **GET** /quota | List Organization Quotas

<a name="getQuota"></a>
# **getQuota**
> Quota getQuota(entity)

Retrieve Resource Quota

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QuotasApi;


QuotasApi apiInstance = new QuotasApi();
String entity = "entity_example"; // String | 
try {
    Quota result = apiInstance.getQuota(entity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotasApi#getQuota");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | **String**|  |

### Return type

[**Quota**](Quota.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listQuotas"></a>
# **listQuotas**
> InlineResponse20030 listQuotas()

List Organization Quotas

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QuotasApi;


QuotasApi apiInstance = new QuotasApi();
try {
    InlineResponse20030 result = apiInstance.listQuotas();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotasApi#listQuotas");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20030**](InlineResponse20030.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

