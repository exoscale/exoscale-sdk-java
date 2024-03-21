# OperationApi

All URIs are relative to *https://api-{zone}.exoscale.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOperation**](OperationApi.md#getOperation) | **GET** /operation/{id} | Retrieve Operation details

<a name="getOperation"></a>
# **getOperation**
> Operation getOperation(id)

Retrieve Operation details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OperationApi;


OperationApi apiInstance = new OperationApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.getOperation(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperationApi#getOperation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

