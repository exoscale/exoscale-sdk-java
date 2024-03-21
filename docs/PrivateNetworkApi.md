# PrivateNetworkApi

All URIs are relative to *https://api-{zone}.exoscale.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachInstanceToPrivateNetwork**](PrivateNetworkApi.md#attachInstanceToPrivateNetwork) | **PUT** /private-network/{id}:attach | Attach a Compute instance to a Private Network
[**createPrivateNetwork**](PrivateNetworkApi.md#createPrivateNetwork) | **POST** /private-network | Create a Private Network
[**deletePrivateNetwork**](PrivateNetworkApi.md#deletePrivateNetwork) | **DELETE** /private-network/{id} | Delete a Private Network
[**detachInstanceFromPrivateNetwork**](PrivateNetworkApi.md#detachInstanceFromPrivateNetwork) | **PUT** /private-network/{id}:detach | Detach a Compute instance from a Private Network
[**getPrivateNetwork**](PrivateNetworkApi.md#getPrivateNetwork) | **GET** /private-network/{id} | Retrieve Private Network details
[**listPrivateNetworks**](PrivateNetworkApi.md#listPrivateNetworks) | **GET** /private-network | List Private Networks
[**resetPrivateNetworkField**](PrivateNetworkApi.md#resetPrivateNetworkField) | **DELETE** /private-network/{id}/{field} | Reset Private Network field
[**updatePrivateNetwork**](PrivateNetworkApi.md#updatePrivateNetwork) | **PUT** /private-network/{id} | Update a Private Network
[**updatePrivateNetworkInstanceIp**](PrivateNetworkApi.md#updatePrivateNetworkInstanceIp) | **PUT** /private-network/{id}:update-ip | Update the IP address of an instance attached to a managed private network

<a name="attachInstanceToPrivateNetwork"></a>
# **attachInstanceToPrivateNetwork**
> Operation attachInstanceToPrivateNetwork(body, id)

Attach a Compute instance to a Private Network

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrivateNetworkApi;


PrivateNetworkApi apiInstance = new PrivateNetworkApi();
PrivatenetworkIdattachBody body = new PrivatenetworkIdattachBody(); // PrivatenetworkIdattachBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.attachInstanceToPrivateNetwork(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateNetworkApi#attachInstanceToPrivateNetwork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PrivatenetworkIdattachBody**](PrivatenetworkIdattachBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPrivateNetwork"></a>
# **createPrivateNetwork**
> Operation createPrivateNetwork(body)

Create a Private Network

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrivateNetworkApi;


PrivateNetworkApi apiInstance = new PrivateNetworkApi();
PrivatenetworkBody body = new PrivatenetworkBody(); // PrivatenetworkBody | 
try {
    Operation result = apiInstance.createPrivateNetwork(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateNetworkApi#createPrivateNetwork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PrivatenetworkBody**](PrivatenetworkBody.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePrivateNetwork"></a>
# **deletePrivateNetwork**
> Operation deletePrivateNetwork(id)

Delete a Private Network

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrivateNetworkApi;


PrivateNetworkApi apiInstance = new PrivateNetworkApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.deletePrivateNetwork(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateNetworkApi#deletePrivateNetwork");
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

<a name="detachInstanceFromPrivateNetwork"></a>
# **detachInstanceFromPrivateNetwork**
> Operation detachInstanceFromPrivateNetwork(body, id)

Detach a Compute instance from a Private Network

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrivateNetworkApi;


PrivateNetworkApi apiInstance = new PrivateNetworkApi();
PrivatenetworkIddetachBody body = new PrivatenetworkIddetachBody(); // PrivatenetworkIddetachBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.detachInstanceFromPrivateNetwork(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateNetworkApi#detachInstanceFromPrivateNetwork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PrivatenetworkIddetachBody**](PrivatenetworkIddetachBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPrivateNetwork"></a>
# **getPrivateNetwork**
> PrivateNetwork getPrivateNetwork(id)

Retrieve Private Network details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrivateNetworkApi;


PrivateNetworkApi apiInstance = new PrivateNetworkApi();
UUID id = new UUID(); // UUID | 
try {
    PrivateNetwork result = apiInstance.getPrivateNetwork(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateNetworkApi#getPrivateNetwork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**PrivateNetwork**](PrivateNetwork.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPrivateNetworks"></a>
# **listPrivateNetworks**
> InlineResponse20016 listPrivateNetworks()

List Private Networks

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrivateNetworkApi;


PrivateNetworkApi apiInstance = new PrivateNetworkApi();
try {
    InlineResponse20016 result = apiInstance.listPrivateNetworks();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateNetworkApi#listPrivateNetworks");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resetPrivateNetworkField"></a>
# **resetPrivateNetworkField**
> Operation resetPrivateNetworkField(id, field)

Reset Private Network field

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrivateNetworkApi;


PrivateNetworkApi apiInstance = new PrivateNetworkApi();
UUID id = new UUID(); // UUID | 
String field = "field_example"; // String | 
try {
    Operation result = apiInstance.resetPrivateNetworkField(id, field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateNetworkApi#resetPrivateNetworkField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |
 **field** | **String**|  | [enum: labels]

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePrivateNetwork"></a>
# **updatePrivateNetwork**
> Operation updatePrivateNetwork(body, id)

Update a Private Network

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrivateNetworkApi;


PrivateNetworkApi apiInstance = new PrivateNetworkApi();
PrivatenetworkIdBody body = new PrivatenetworkIdBody(); // PrivatenetworkIdBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.updatePrivateNetwork(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateNetworkApi#updatePrivateNetwork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PrivatenetworkIdBody**](PrivatenetworkIdBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePrivateNetworkInstanceIp"></a>
# **updatePrivateNetworkInstanceIp**
> Operation updatePrivateNetworkInstanceIp(body, id)

Update the IP address of an instance attached to a managed private network

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrivateNetworkApi;


PrivateNetworkApi apiInstance = new PrivateNetworkApi();
PrivatenetworkIdupdateipBody body = new PrivatenetworkIdupdateipBody(); // PrivatenetworkIdupdateipBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.updatePrivateNetworkInstanceIp(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrivateNetworkApi#updatePrivateNetworkInstanceIp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PrivatenetworkIdupdateipBody**](PrivatenetworkIdupdateipBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

