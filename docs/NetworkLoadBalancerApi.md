# NetworkLoadBalancerApi

All URIs are relative to *https://api-{zone}.exoscale.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addServiceToLoadBalancer**](NetworkLoadBalancerApi.md#addServiceToLoadBalancer) | **POST** /load-balancer/{id}/service | Add a Load Balancer Service
[**createLoadBalancer**](NetworkLoadBalancerApi.md#createLoadBalancer) | **POST** /load-balancer | Create a Load Balancer
[**deleteLoadBalancer**](NetworkLoadBalancerApi.md#deleteLoadBalancer) | **DELETE** /load-balancer/{id} | Delete a Load Balancer
[**deleteLoadBalancerService**](NetworkLoadBalancerApi.md#deleteLoadBalancerService) | **DELETE** /load-balancer/{id}/service/{service-id} | Delete a Load Balancer Service
[**getLoadBalancer**](NetworkLoadBalancerApi.md#getLoadBalancer) | **GET** /load-balancer/{id} | Retrieve Load Balancer details
[**getLoadBalancerService**](NetworkLoadBalancerApi.md#getLoadBalancerService) | **GET** /load-balancer/{id}/service/{service-id} | Retrieve Load Balancer Service details
[**listLoadBalancers**](NetworkLoadBalancerApi.md#listLoadBalancers) | **GET** /load-balancer | List Load Balancers
[**resetLoadBalancerField**](NetworkLoadBalancerApi.md#resetLoadBalancerField) | **DELETE** /load-balancer/{id}/{field} | Reset a Load Balancer field to its default value
[**resetLoadBalancerServiceField**](NetworkLoadBalancerApi.md#resetLoadBalancerServiceField) | **DELETE** /load-balancer/{id}/service/{service-id}/{field} | Reset a Load Balancer Service field to its default value
[**updateLoadBalancer**](NetworkLoadBalancerApi.md#updateLoadBalancer) | **PUT** /load-balancer/{id} | Update a Load Balancer
[**updateLoadBalancerService**](NetworkLoadBalancerApi.md#updateLoadBalancerService) | **PUT** /load-balancer/{id}/service/{service-id} | Update a Load Balancer Service

<a name="addServiceToLoadBalancer"></a>
# **addServiceToLoadBalancer**
> Operation addServiceToLoadBalancer(body, id)

Add a Load Balancer Service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NetworkLoadBalancerApi;


NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi();
IdServiceBody body = new IdServiceBody(); // IdServiceBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.addServiceToLoadBalancer(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkLoadBalancerApi#addServiceToLoadBalancer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IdServiceBody**](IdServiceBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createLoadBalancer"></a>
# **createLoadBalancer**
> Operation createLoadBalancer(body)

Create a Load Balancer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NetworkLoadBalancerApi;


NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi();
LoadbalancerBody body = new LoadbalancerBody(); // LoadbalancerBody | 
try {
    Operation result = apiInstance.createLoadBalancer(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkLoadBalancerApi#createLoadBalancer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoadbalancerBody**](LoadbalancerBody.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLoadBalancer"></a>
# **deleteLoadBalancer**
> Operation deleteLoadBalancer(id)

Delete a Load Balancer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NetworkLoadBalancerApi;


NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.deleteLoadBalancer(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkLoadBalancerApi#deleteLoadBalancer");
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

<a name="deleteLoadBalancerService"></a>
# **deleteLoadBalancerService**
> Operation deleteLoadBalancerService(id, serviceId)

Delete a Load Balancer Service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NetworkLoadBalancerApi;


NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi();
UUID id = new UUID(); // UUID | 
UUID serviceId = new UUID(); // UUID | 
try {
    Operation result = apiInstance.deleteLoadBalancerService(id, serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkLoadBalancerApi#deleteLoadBalancerService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |
 **serviceId** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoadBalancer"></a>
# **getLoadBalancer**
> LoadBalancer getLoadBalancer(id)

Retrieve Load Balancer details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NetworkLoadBalancerApi;


NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi();
UUID id = new UUID(); // UUID | 
try {
    LoadBalancer result = apiInstance.getLoadBalancer(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkLoadBalancerApi#getLoadBalancer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**LoadBalancer**](LoadBalancer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoadBalancerService"></a>
# **getLoadBalancerService**
> LoadBalancerService getLoadBalancerService(id, serviceId)

Retrieve Load Balancer Service details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NetworkLoadBalancerApi;


NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi();
UUID id = new UUID(); // UUID | 
UUID serviceId = new UUID(); // UUID | 
try {
    LoadBalancerService result = apiInstance.getLoadBalancerService(id, serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkLoadBalancerApi#getLoadBalancerService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |
 **serviceId** | [**UUID**](.md)|  |

### Return type

[**LoadBalancerService**](LoadBalancerService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLoadBalancers"></a>
# **listLoadBalancers**
> InlineResponse2001 listLoadBalancers()

List Load Balancers

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NetworkLoadBalancerApi;


NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi();
try {
    InlineResponse2001 result = apiInstance.listLoadBalancers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkLoadBalancerApi#listLoadBalancers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resetLoadBalancerField"></a>
# **resetLoadBalancerField**
> Operation resetLoadBalancerField(id, field)

Reset a Load Balancer field to its default value

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NetworkLoadBalancerApi;


NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi();
UUID id = new UUID(); // UUID | 
String field = "field_example"; // String | 
try {
    Operation result = apiInstance.resetLoadBalancerField(id, field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkLoadBalancerApi#resetLoadBalancerField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |
 **field** | **String**|  | [enum: description, labels]

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resetLoadBalancerServiceField"></a>
# **resetLoadBalancerServiceField**
> Operation resetLoadBalancerServiceField(id, serviceId, field)

Reset a Load Balancer Service field to its default value

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NetworkLoadBalancerApi;


NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi();
UUID id = new UUID(); // UUID | 
UUID serviceId = new UUID(); // UUID | 
String field = "field_example"; // String | 
try {
    Operation result = apiInstance.resetLoadBalancerServiceField(id, serviceId, field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkLoadBalancerApi#resetLoadBalancerServiceField");
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

<a name="updateLoadBalancer"></a>
# **updateLoadBalancer**
> Operation updateLoadBalancer(body, id)

Update a Load Balancer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NetworkLoadBalancerApi;


NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi();
LoadbalancerIdBody body = new LoadbalancerIdBody(); // LoadbalancerIdBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.updateLoadBalancer(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkLoadBalancerApi#updateLoadBalancer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoadbalancerIdBody**](LoadbalancerIdBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLoadBalancerService"></a>
# **updateLoadBalancerService**
> Operation updateLoadBalancerService(body, id, serviceId)

Update a Load Balancer Service

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NetworkLoadBalancerApi;


NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi();
ServiceServiceidBody body = new ServiceServiceidBody(); // ServiceServiceidBody | 
UUID id = new UUID(); // UUID | 
UUID serviceId = new UUID(); // UUID | 
try {
    Operation result = apiInstance.updateLoadBalancerService(body, id, serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkLoadBalancerApi#updateLoadBalancerService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ServiceServiceidBody**](ServiceServiceidBody.md)|  |
 **id** | [**UUID**](.md)|  |
 **serviceId** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

