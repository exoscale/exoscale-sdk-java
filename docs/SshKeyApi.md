# SshKeyApi

All URIs are relative to *https://api-{zone}.exoscale.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteSshKey**](SshKeyApi.md#deleteSshKey) | **DELETE** /ssh-key/{name} | Delete a SSH key
[**getSshKey**](SshKeyApi.md#getSshKey) | **GET** /ssh-key/{name} | Retrieve SSH key details
[**listSshKeys**](SshKeyApi.md#listSshKeys) | **GET** /ssh-key | List SSH keys
[**registerSshKey**](SshKeyApi.md#registerSshKey) | **POST** /ssh-key | Import SSH key

<a name="deleteSshKey"></a>
# **deleteSshKey**
> Operation deleteSshKey(name)

Delete a SSH key

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SshKeyApi;


SshKeyApi apiInstance = new SshKeyApi();
String name = "name_example"; // String | 
try {
    Operation result = apiInstance.deleteSshKey(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SshKeyApi#deleteSshKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSshKey"></a>
# **getSshKey**
> SshKey getSshKey(name)

Retrieve SSH key details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SshKeyApi;


SshKeyApi apiInstance = new SshKeyApi();
String name = "name_example"; // String | 
try {
    SshKey result = apiInstance.getSshKey(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SshKeyApi#getSshKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**SshKey**](SshKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSshKeys"></a>
# **listSshKeys**
> InlineResponse20028 listSshKeys()

List SSH keys

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SshKeyApi;


SshKeyApi apiInstance = new SshKeyApi();
try {
    InlineResponse20028 result = apiInstance.listSshKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SshKeyApi#listSshKeys");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registerSshKey"></a>
# **registerSshKey**
> Operation registerSshKey(body)

Import SSH key

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SshKeyApi;


SshKeyApi apiInstance = new SshKeyApi();
SshkeyBody body = new SshkeyBody(); // SshkeyBody | 
try {
    Operation result = apiInstance.registerSshKey(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SshKeyApi#registerSshKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SshkeyBody**](SshkeyBody.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

