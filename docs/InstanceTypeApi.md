# InstanceTypeApi

All URIs are relative to *https://api-{zone}.exoscale.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInstanceType**](InstanceTypeApi.md#getInstanceType) | **GET** /instance-type/{id} | Retrieve Instance Type details
[**listInstanceTypes**](InstanceTypeApi.md#listInstanceTypes) | **GET** /instance-type | List Compute instance Types

<a name="getInstanceType"></a>
# **getInstanceType**
> InstanceType getInstanceType(id)

Retrieve Instance Type details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstanceTypeApi;


InstanceTypeApi apiInstance = new InstanceTypeApi();
UUID id = new UUID(); // UUID | 
try {
    InstanceType result = apiInstance.getInstanceType(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceTypeApi#getInstanceType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**InstanceType**](InstanceType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listInstanceTypes"></a>
# **listInstanceTypes**
> InlineResponse20013 listInstanceTypes()

List Compute instance Types

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstanceTypeApi;


InstanceTypeApi apiInstance = new InstanceTypeApi();
try {
    InlineResponse20013 result = apiInstance.listInstanceTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceTypeApi#listInstanceTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

