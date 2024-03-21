# ReverseDnsApi

All URIs are relative to *https://api-{zone}.exoscale.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteReverseDnsElasticIp**](ReverseDnsApi.md#deleteReverseDnsElasticIp) | **DELETE** /reverse-dns/elastic-ip/{id} | Delete the PTR DNS record for an elastic IP
[**deleteReverseDnsInstance**](ReverseDnsApi.md#deleteReverseDnsInstance) | **DELETE** /reverse-dns/instance/{id} | Delete the PTR DNS record for an instance
[**getReverseDnsElasticIp**](ReverseDnsApi.md#getReverseDnsElasticIp) | **GET** /reverse-dns/elastic-ip/{id} | Query the PTR DNS records for an elastic IP
[**getReverseDnsInstance**](ReverseDnsApi.md#getReverseDnsInstance) | **GET** /reverse-dns/instance/{id} | Query the PTR DNS records for an instance
[**updateReverseDnsElasticIp**](ReverseDnsApi.md#updateReverseDnsElasticIp) | **POST** /reverse-dns/elastic-ip/{id} | Update/Create the PTR DNS record for an elastic IP
[**updateReverseDnsInstance**](ReverseDnsApi.md#updateReverseDnsInstance) | **POST** /reverse-dns/instance/{id} | Update/Create the PTR DNS record for an instance

<a name="deleteReverseDnsElasticIp"></a>
# **deleteReverseDnsElasticIp**
> Operation deleteReverseDnsElasticIp(id)

Delete the PTR DNS record for an elastic IP

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReverseDnsApi;


ReverseDnsApi apiInstance = new ReverseDnsApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.deleteReverseDnsElasticIp(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReverseDnsApi#deleteReverseDnsElasticIp");
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

<a name="deleteReverseDnsInstance"></a>
# **deleteReverseDnsInstance**
> Operation deleteReverseDnsInstance(id)

Delete the PTR DNS record for an instance

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReverseDnsApi;


ReverseDnsApi apiInstance = new ReverseDnsApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.deleteReverseDnsInstance(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReverseDnsApi#deleteReverseDnsInstance");
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

<a name="getReverseDnsElasticIp"></a>
# **getReverseDnsElasticIp**
> ReverseDnsRecord getReverseDnsElasticIp(id)

Query the PTR DNS records for an elastic IP

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReverseDnsApi;


ReverseDnsApi apiInstance = new ReverseDnsApi();
UUID id = new UUID(); // UUID | 
try {
    ReverseDnsRecord result = apiInstance.getReverseDnsElasticIp(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReverseDnsApi#getReverseDnsElasticIp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**ReverseDnsRecord**](ReverseDnsRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReverseDnsInstance"></a>
# **getReverseDnsInstance**
> ReverseDnsRecord getReverseDnsInstance(id)

Query the PTR DNS records for an instance

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReverseDnsApi;


ReverseDnsApi apiInstance = new ReverseDnsApi();
UUID id = new UUID(); // UUID | 
try {
    ReverseDnsRecord result = apiInstance.getReverseDnsInstance(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReverseDnsApi#getReverseDnsInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**ReverseDnsRecord**](ReverseDnsRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateReverseDnsElasticIp"></a>
# **updateReverseDnsElasticIp**
> Operation updateReverseDnsElasticIp(body, id)

Update/Create the PTR DNS record for an elastic IP

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReverseDnsApi;


ReverseDnsApi apiInstance = new ReverseDnsApi();
ElasticipIdBody body = new ElasticipIdBody(); // ElasticipIdBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.updateReverseDnsElasticIp(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReverseDnsApi#updateReverseDnsElasticIp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ElasticipIdBody**](ElasticipIdBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateReverseDnsInstance"></a>
# **updateReverseDnsInstance**
> Operation updateReverseDnsInstance(body, id)

Update/Create the PTR DNS record for an instance

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReverseDnsApi;


ReverseDnsApi apiInstance = new ReverseDnsApi();
InstanceIdBody body = new InstanceIdBody(); // InstanceIdBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.updateReverseDnsInstance(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReverseDnsApi#updateReverseDnsInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InstanceIdBody**](InstanceIdBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

