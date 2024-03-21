# ZoneApi

All URIs are relative to *https://api-{zone}.exoscale.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listZones**](ZoneApi.md#listZones) | **GET** /zone | List Zones

<a name="listZones"></a>
# **listZones**
> InlineResponse2006 listZones()

List Zones

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ZoneApi;


ZoneApi apiInstance = new ZoneApi();
try {
    InlineResponse2006 result = apiInstance.listZones();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneApi#listZones");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

