# ElasticIpApi

All URIs are relative to *https://api-{zone}.exoscale.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachInstanceToElasticIp**](ElasticIpApi.md#attachInstanceToElasticIp) | **PUT** /elastic-ip/{id}:attach | Attach a Compute instance to an Elastic IP
[**createElasticIp**](ElasticIpApi.md#createElasticIp) | **POST** /elastic-ip | Create an Elastic IP
[**deleteElasticIp**](ElasticIpApi.md#deleteElasticIp) | **DELETE** /elastic-ip/{id} | Delete an Elastic IP
[**detachInstanceFromElasticIp**](ElasticIpApi.md#detachInstanceFromElasticIp) | **PUT** /elastic-ip/{id}:detach | Detach a Compute instance from an Elastic IP
[**getElasticIp**](ElasticIpApi.md#getElasticIp) | **GET** /elastic-ip/{id} | Retrieve Elastic IP details
[**listElasticIps**](ElasticIpApi.md#listElasticIps) | **GET** /elastic-ip | List Elastic IPs
[**resetElasticIpField**](ElasticIpApi.md#resetElasticIpField) | **DELETE** /elastic-ip/{id}/{field} | Reset an Elastic IP field to its default value
[**updateElasticIp**](ElasticIpApi.md#updateElasticIp) | **PUT** /elastic-ip/{id} | Update an Elastic IP

<a name="attachInstanceToElasticIp"></a>
# **attachInstanceToElasticIp**
> Operation attachInstanceToElasticIp(body, id)

Attach a Compute instance to an Elastic IP

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ElasticIpApi;


ElasticIpApi apiInstance = new ElasticIpApi();
ElasticipIdattachBody body = new ElasticipIdattachBody(); // ElasticipIdattachBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.attachInstanceToElasticIp(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElasticIpApi#attachInstanceToElasticIp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ElasticipIdattachBody**](ElasticipIdattachBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createElasticIp"></a>
# **createElasticIp**
> Operation createElasticIp(body)

Create an Elastic IP

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ElasticIpApi;


ElasticIpApi apiInstance = new ElasticIpApi();
ElasticipBody body = new ElasticipBody(); // ElasticipBody | 
try {
    Operation result = apiInstance.createElasticIp(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElasticIpApi#createElasticIp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ElasticipBody**](ElasticipBody.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteElasticIp"></a>
# **deleteElasticIp**
> Operation deleteElasticIp(id)

Delete an Elastic IP

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ElasticIpApi;


ElasticIpApi apiInstance = new ElasticIpApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.deleteElasticIp(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElasticIpApi#deleteElasticIp");
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

<a name="detachInstanceFromElasticIp"></a>
# **detachInstanceFromElasticIp**
> Operation detachInstanceFromElasticIp(body, id)

Detach a Compute instance from an Elastic IP

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ElasticIpApi;


ElasticIpApi apiInstance = new ElasticIpApi();
ElasticipIddetachBody body = new ElasticipIddetachBody(); // ElasticipIddetachBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.detachInstanceFromElasticIp(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElasticIpApi#detachInstanceFromElasticIp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ElasticipIddetachBody**](ElasticipIddetachBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getElasticIp"></a>
# **getElasticIp**
> ElasticIp getElasticIp(id)

Retrieve Elastic IP details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ElasticIpApi;


ElasticIpApi apiInstance = new ElasticIpApi();
UUID id = new UUID(); // UUID | 
try {
    ElasticIp result = apiInstance.getElasticIp(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElasticIpApi#getElasticIp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**ElasticIp**](ElasticIp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listElasticIps"></a>
# **listElasticIps**
> InlineResponse2005 listElasticIps()

List Elastic IPs

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ElasticIpApi;


ElasticIpApi apiInstance = new ElasticIpApi();
try {
    InlineResponse2005 result = apiInstance.listElasticIps();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElasticIpApi#listElasticIps");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resetElasticIpField"></a>
# **resetElasticIpField**
> Operation resetElasticIpField(id, field)

Reset an Elastic IP field to its default value

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ElasticIpApi;


ElasticIpApi apiInstance = new ElasticIpApi();
UUID id = new UUID(); // UUID | 
String field = "field_example"; // String | 
try {
    Operation result = apiInstance.resetElasticIpField(id, field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElasticIpApi#resetElasticIpField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |
 **field** | **String**|  | [enum: description]

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateElasticIp"></a>
# **updateElasticIp**
> Operation updateElasticIp(body, id)

Update an Elastic IP

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ElasticIpApi;


ElasticIpApi apiInstance = new ElasticIpApi();
ElasticipIdBody1 body = new ElasticipIdBody1(); // ElasticipIdBody1 | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.updateElasticIp(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElasticIpApi#updateElasticIp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ElasticipIdBody1**](ElasticipIdBody1.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

