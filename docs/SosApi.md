# SosApi

All URIs are relative to *https://api-{zone}.exoscale.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSosPresignedUrl**](SosApi.md#getSosPresignedUrl) | **GET** /sos/{bucket}/presigned-url | Retrieve Presigned Download URL for SOS object
[**listSosBucketsUsage**](SosApi.md#listSosBucketsUsage) | **GET** /sos-buckets-usage | List SOS Buckets Usage

<a name="getSosPresignedUrl"></a>
# **getSosPresignedUrl**
> InlineResponse20036 getSosPresignedUrl(bucket, key)

Retrieve Presigned Download URL for SOS object

Generates Presigned Download URL for SOS object

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SosApi;


SosApi apiInstance = new SosApi();
String bucket = "bucket_example"; // String | 
String key = "key_example"; // String | 
try {
    InlineResponse20036 result = apiInstance.getSosPresignedUrl(bucket, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SosApi#getSosPresignedUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucket** | **String**|  |
 **key** | **String**|  | [optional]

### Return type

[**InlineResponse20036**](InlineResponse20036.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSosBucketsUsage"></a>
# **listSosBucketsUsage**
> InlineResponse20026 listSosBucketsUsage()

List SOS Buckets Usage

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SosApi;


SosApi apiInstance = new SosApi();
try {
    InlineResponse20026 result = apiInstance.listSosBucketsUsage();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SosApi#listSosBucketsUsage");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20026**](InlineResponse20026.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

