# ComputeApi

All URIs are relative to *https://api-{zone}.exoscale.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**resetLoadBalancerServiceField**](ComputeApi.md#resetLoadBalancerServiceField) | **DELETE** /load-balancer/{id}/service/{service-id}/{field} | Reset a Load Balancer Service field to its default value

<a name="resetLoadBalancerServiceField"></a>
# **resetLoadBalancerServiceField**
> Operation resetLoadBalancerServiceField(id, serviceId, field)

Reset a Load Balancer Service field to its default value

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ComputeApi;


ComputeApi apiInstance = new ComputeApi();
UUID id = new UUID(); // UUID | 
UUID serviceId = new UUID(); // UUID | 
String field = "field_example"; // String | 
try {
    Operation result = apiInstance.resetLoadBalancerServiceField(id, serviceId, field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComputeApi#resetLoadBalancerServiceField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |
 **serviceId** | [**UUID**](.md)|  |
 **field** | **String**|  | [enum: description]

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

