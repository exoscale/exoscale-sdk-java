# SshKeyApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteSshKey**](SshKeyApi.md#deleteSshKey) | **DELETE** /ssh-key/{name} | Delete a SSH key |
| [**getSshKey**](SshKeyApi.md#getSshKey) | **GET** /ssh-key/{name} | Retrieve SSH key details |
| [**listSshKeys**](SshKeyApi.md#listSshKeys) | **GET** /ssh-key | List SSH keys |
| [**registerSshKey**](SshKeyApi.md#registerSshKey) | **POST** /ssh-key | Import SSH key |


<a id="deleteSshKey"></a>
# **deleteSshKey**
> Operation deleteSshKey(name)

Delete a SSH key



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SshKeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    SshKeyApi apiInstance = new SshKeyApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      Operation result = apiInstance.deleteSshKey(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SshKeyApi#deleteSshKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="getSshKey"></a>
# **getSshKey**
> SshKey getSshKey(name)

Retrieve SSH key details



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SshKeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    SshKeyApi apiInstance = new SshKeyApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      SshKey result = apiInstance.getSshKey(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SshKeyApi#getSshKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**SshKey**](SshKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="listSshKeys"></a>
# **listSshKeys**
> ListSshKeys200Response listSshKeys()

List SSH keys



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SshKeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    SshKeyApi apiInstance = new SshKeyApi(defaultClient);
    try {
      ListSshKeys200Response result = apiInstance.listSshKeys();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SshKeyApi#listSshKeys");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListSshKeys200Response**](ListSshKeys200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="registerSshKey"></a>
# **registerSshKey**
> Operation registerSshKey(registerSshKeyRequest)

Import SSH key



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SshKeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    SshKeyApi apiInstance = new SshKeyApi(defaultClient);
    RegisterSshKeyRequest registerSshKeyRequest = new RegisterSshKeyRequest(); // RegisterSshKeyRequest | 
    try {
      Operation result = apiInstance.registerSshKey(registerSshKeyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SshKeyApi#registerSshKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **registerSshKeyRequest** | [**RegisterSshKeyRequest**](RegisterSshKeyRequest.md)|  | |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

