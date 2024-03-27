# ElasticIpApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**attachInstanceToElasticIp**](ElasticIpApi.md#attachInstanceToElasticIp) | **PUT** /elastic-ip/{id}:attach | Attach a Compute instance to an Elastic IP |
| [**createElasticIp**](ElasticIpApi.md#createElasticIp) | **POST** /elastic-ip | Create an Elastic IP |
| [**deleteElasticIp**](ElasticIpApi.md#deleteElasticIp) | **DELETE** /elastic-ip/{id} | Delete an Elastic IP |
| [**detachInstanceFromElasticIp**](ElasticIpApi.md#detachInstanceFromElasticIp) | **PUT** /elastic-ip/{id}:detach | Detach a Compute instance from an Elastic IP |
| [**getElasticIp**](ElasticIpApi.md#getElasticIp) | **GET** /elastic-ip/{id} | Retrieve Elastic IP details |
| [**listElasticIps**](ElasticIpApi.md#listElasticIps) | **GET** /elastic-ip | List Elastic IPs |
| [**resetElasticIpField**](ElasticIpApi.md#resetElasticIpField) | **DELETE** /elastic-ip/{id}/{field} | Reset an Elastic IP field to its default value |
| [**updateElasticIp**](ElasticIpApi.md#updateElasticIp) | **PUT** /elastic-ip/{id} | Update an Elastic IP |


<a id="attachInstanceToElasticIp"></a>
# **attachInstanceToElasticIp**
> Operation attachInstanceToElasticIp(id, attachBlockStorageVolumeToInstanceRequest)

Attach a Compute instance to an Elastic IP



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ElasticIpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    ElasticIpApi apiInstance = new ElasticIpApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    AttachBlockStorageVolumeToInstanceRequest attachBlockStorageVolumeToInstanceRequest = new AttachBlockStorageVolumeToInstanceRequest(); // AttachBlockStorageVolumeToInstanceRequest | 
    try {
      Operation result = apiInstance.attachInstanceToElasticIp(id, attachBlockStorageVolumeToInstanceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ElasticIpApi#attachInstanceToElasticIp");
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
| **id** | **UUID**|  | |
| **attachBlockStorageVolumeToInstanceRequest** | [**AttachBlockStorageVolumeToInstanceRequest**](AttachBlockStorageVolumeToInstanceRequest.md)|  | |

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

<a id="createElasticIp"></a>
# **createElasticIp**
> Operation createElasticIp(createElasticIpRequest)

Create an Elastic IP



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ElasticIpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    ElasticIpApi apiInstance = new ElasticIpApi(defaultClient);
    CreateElasticIpRequest createElasticIpRequest = new CreateElasticIpRequest(); // CreateElasticIpRequest | 
    try {
      Operation result = apiInstance.createElasticIp(createElasticIpRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ElasticIpApi#createElasticIp");
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
| **createElasticIpRequest** | [**CreateElasticIpRequest**](CreateElasticIpRequest.md)|  | |

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

<a id="deleteElasticIp"></a>
# **deleteElasticIp**
> Operation deleteElasticIp(id)

Delete an Elastic IP



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ElasticIpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    ElasticIpApi apiInstance = new ElasticIpApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      Operation result = apiInstance.deleteElasticIp(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ElasticIpApi#deleteElasticIp");
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
| **id** | **UUID**|  | |

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

<a id="detachInstanceFromElasticIp"></a>
# **detachInstanceFromElasticIp**
> Operation detachInstanceFromElasticIp(id, attachBlockStorageVolumeToInstanceRequest)

Detach a Compute instance from an Elastic IP



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ElasticIpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    ElasticIpApi apiInstance = new ElasticIpApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    AttachBlockStorageVolumeToInstanceRequest attachBlockStorageVolumeToInstanceRequest = new AttachBlockStorageVolumeToInstanceRequest(); // AttachBlockStorageVolumeToInstanceRequest | 
    try {
      Operation result = apiInstance.detachInstanceFromElasticIp(id, attachBlockStorageVolumeToInstanceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ElasticIpApi#detachInstanceFromElasticIp");
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
| **id** | **UUID**|  | |
| **attachBlockStorageVolumeToInstanceRequest** | [**AttachBlockStorageVolumeToInstanceRequest**](AttachBlockStorageVolumeToInstanceRequest.md)|  | |

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

<a id="getElasticIp"></a>
# **getElasticIp**
> ElasticIp getElasticIp(id)

Retrieve Elastic IP details



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ElasticIpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    ElasticIpApi apiInstance = new ElasticIpApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      ElasticIp result = apiInstance.getElasticIp(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ElasticIpApi#getElasticIp");
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
| **id** | **UUID**|  | |

### Return type

[**ElasticIp**](ElasticIp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="listElasticIps"></a>
# **listElasticIps**
> ListElasticIps200Response listElasticIps()

List Elastic IPs



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ElasticIpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    ElasticIpApi apiInstance = new ElasticIpApi(defaultClient);
    try {
      ListElasticIps200Response result = apiInstance.listElasticIps();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ElasticIpApi#listElasticIps");
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

[**ListElasticIps200Response**](ListElasticIps200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="resetElasticIpField"></a>
# **resetElasticIpField**
> Operation resetElasticIpField(id, field)

Reset an Elastic IP field to its default value



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ElasticIpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    ElasticIpApi apiInstance = new ElasticIpApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    String field = "description"; // String | 
    try {
      Operation result = apiInstance.resetElasticIpField(id, field);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ElasticIpApi#resetElasticIpField");
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
| **id** | **UUID**|  | |
| **field** | **String**|  | [enum: description] |

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

<a id="updateElasticIp"></a>
# **updateElasticIp**
> Operation updateElasticIp(id, updateElasticIpRequest)

Update an Elastic IP



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ElasticIpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    ElasticIpApi apiInstance = new ElasticIpApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    UpdateElasticIpRequest updateElasticIpRequest = new UpdateElasticIpRequest(); // UpdateElasticIpRequest | 
    try {
      Operation result = apiInstance.updateElasticIp(id, updateElasticIpRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ElasticIpApi#updateElasticIp");
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
| **id** | **UUID**|  | |
| **updateElasticIpRequest** | [**UpdateElasticIpRequest**](UpdateElasticIpRequest.md)|  | |

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

