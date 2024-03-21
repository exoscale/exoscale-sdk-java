# InstancePoolApi

All URIs are relative to *https://api-{zone}.exoscale.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInstancePool**](InstancePoolApi.md#createInstancePool) | **POST** /instance-pool | Create an Instance Pool
[**deleteInstancePool**](InstancePoolApi.md#deleteInstancePool) | **DELETE** /instance-pool/{id} | Delete an Instance Pool
[**evictInstancePoolMembers**](InstancePoolApi.md#evictInstancePoolMembers) | **PUT** /instance-pool/{id}:evict | Evict Instance Pool members
[**getInstancePool**](InstancePoolApi.md#getInstancePool) | **GET** /instance-pool/{id} | Retrieve Instance Pool details
[**listInstancePools**](InstancePoolApi.md#listInstancePools) | **GET** /instance-pool | List Instance Pools
[**resetInstancePoolField**](InstancePoolApi.md#resetInstancePoolField) | **DELETE** /instance-pool/{id}/{field} | Reset an Instance Pool field to its default value
[**scaleInstancePool**](InstancePoolApi.md#scaleInstancePool) | **PUT** /instance-pool/{id}:scale | Scale an Instance Pool
[**updateInstancePool**](InstancePoolApi.md#updateInstancePool) | **PUT** /instance-pool/{id} | Update an Instance Pool

<a name="createInstancePool"></a>
# **createInstancePool**
> Operation createInstancePool(body)

Create an Instance Pool

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstancePoolApi;


InstancePoolApi apiInstance = new InstancePoolApi();
InstancepoolBody body = new InstancepoolBody(); // InstancepoolBody | 
try {
    Operation result = apiInstance.createInstancePool(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstancePoolApi#createInstancePool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InstancepoolBody**](InstancepoolBody.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteInstancePool"></a>
# **deleteInstancePool**
> Operation deleteInstancePool(id)

Delete an Instance Pool

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstancePoolApi;


InstancePoolApi apiInstance = new InstancePoolApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.deleteInstancePool(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstancePoolApi#deleteInstancePool");
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

<a name="evictInstancePoolMembers"></a>
# **evictInstancePoolMembers**
> Operation evictInstancePoolMembers(body, id)

Evict Instance Pool members

This operation evicts the specified Compute instances member from the Instance Pool, shrinking it to &#x60;&amp;lt;current pool size&amp;gt; - &amp;lt;# evicted members&amp;gt;&#x60;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstancePoolApi;


InstancePoolApi apiInstance = new InstancePoolApi();
InstancepoolIdevictBody body = new InstancepoolIdevictBody(); // InstancepoolIdevictBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.evictInstancePoolMembers(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstancePoolApi#evictInstancePoolMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InstancepoolIdevictBody**](InstancepoolIdevictBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInstancePool"></a>
# **getInstancePool**
> InstancePool getInstancePool(id)

Retrieve Instance Pool details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstancePoolApi;


InstancePoolApi apiInstance = new InstancePoolApi();
UUID id = new UUID(); // UUID | 
try {
    InstancePool result = apiInstance.getInstancePool(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstancePoolApi#getInstancePool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**InstancePool**](InstancePool.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listInstancePools"></a>
# **listInstancePools**
> InlineResponse2007 listInstancePools()

List Instance Pools

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstancePoolApi;


InstancePoolApi apiInstance = new InstancePoolApi();
try {
    InlineResponse2007 result = apiInstance.listInstancePools();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstancePoolApi#listInstancePools");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resetInstancePoolField"></a>
# **resetInstancePoolField**
> Operation resetInstancePoolField(id, field)

Reset an Instance Pool field to its default value

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstancePoolApi;


InstancePoolApi apiInstance = new InstancePoolApi();
UUID id = new UUID(); // UUID | 
String field = "field_example"; // String | 
try {
    Operation result = apiInstance.resetInstancePoolField(id, field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstancePoolApi#resetInstancePoolField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |
 **field** | **String**|  | [enum: anti-affinity-groups, description, labels, security-groups, elastic-ips, private-networks, ssh-key, user-data, deploy-target, ipv6-enabled]

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="scaleInstancePool"></a>
# **scaleInstancePool**
> Operation scaleInstancePool(body, id)

Scale an Instance Pool

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstancePoolApi;


InstancePoolApi apiInstance = new InstancePoolApi();
InstancepoolIdscaleBody body = new InstancepoolIdscaleBody(); // InstancepoolIdscaleBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.scaleInstancePool(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstancePoolApi#scaleInstancePool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InstancepoolIdscaleBody**](InstancepoolIdscaleBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateInstancePool"></a>
# **updateInstancePool**
> Operation updateInstancePool(body, id)

Update an Instance Pool

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstancePoolApi;


InstancePoolApi apiInstance = new InstancePoolApi();
InstancepoolIdBody body = new InstancepoolIdBody(); // InstancepoolIdBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.updateInstancePool(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstancePoolApi#updateInstancePool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InstancepoolIdBody**](InstancepoolIdBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

