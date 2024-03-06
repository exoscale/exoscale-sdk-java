# PrivateNetworkApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**attachInstanceToPrivateNetwork**](PrivateNetworkApi.md#attachInstanceToPrivateNetwork) | **PUT** /private-network/{id}:attach | Attach a Compute instance to a Private Network |
| [**createPrivateNetwork**](PrivateNetworkApi.md#createPrivateNetwork) | **POST** /private-network | Create a Private Network |
| [**deletePrivateNetwork**](PrivateNetworkApi.md#deletePrivateNetwork) | **DELETE** /private-network/{id} | Delete a Private Network |
| [**detachInstanceFromPrivateNetwork**](PrivateNetworkApi.md#detachInstanceFromPrivateNetwork) | **PUT** /private-network/{id}:detach | Detach a Compute instance from a Private Network |
| [**getPrivateNetwork**](PrivateNetworkApi.md#getPrivateNetwork) | **GET** /private-network/{id} | Retrieve Private Network details |
| [**listPrivateNetworks**](PrivateNetworkApi.md#listPrivateNetworks) | **GET** /private-network | List Private Networks |
| [**resetPrivateNetworkField**](PrivateNetworkApi.md#resetPrivateNetworkField) | **DELETE** /private-network/{id}/{field} | Reset Private Network field |
| [**updatePrivateNetwork**](PrivateNetworkApi.md#updatePrivateNetwork) | **PUT** /private-network/{id} | Update a Private Network |
| [**updatePrivateNetworkInstanceIp**](PrivateNetworkApi.md#updatePrivateNetworkInstanceIp) | **PUT** /private-network/{id}:update-ip | Update the IP address of an instance attached to a managed private network |



## attachInstanceToPrivateNetwork

> Operation attachInstanceToPrivateNetwork(id, attachInstanceToPrivateNetworkRequest)

Attach a Compute instance to a Private Network



### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.PrivateNetworkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        PrivateNetworkApi apiInstance = new PrivateNetworkApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        AttachInstanceToPrivateNetworkRequest attachInstanceToPrivateNetworkRequest = new AttachInstanceToPrivateNetworkRequest(); // AttachInstanceToPrivateNetworkRequest | 
        try {
            Operation result = apiInstance.attachInstanceToPrivateNetwork(id, attachInstanceToPrivateNetworkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivateNetworkApi#attachInstanceToPrivateNetwork");
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
| **attachInstanceToPrivateNetworkRequest** | [**AttachInstanceToPrivateNetworkRequest**](AttachInstanceToPrivateNetworkRequest.md)|  | |

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


## createPrivateNetwork

> Operation createPrivateNetwork(createPrivateNetworkRequest)

Create a Private Network



### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.PrivateNetworkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        PrivateNetworkApi apiInstance = new PrivateNetworkApi(defaultClient);
        CreatePrivateNetworkRequest createPrivateNetworkRequest = new CreatePrivateNetworkRequest(); // CreatePrivateNetworkRequest | 
        try {
            Operation result = apiInstance.createPrivateNetwork(createPrivateNetworkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivateNetworkApi#createPrivateNetwork");
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
| **createPrivateNetworkRequest** | [**CreatePrivateNetworkRequest**](CreatePrivateNetworkRequest.md)|  | |

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


## deletePrivateNetwork

> Operation deletePrivateNetwork(id)

Delete a Private Network



### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.PrivateNetworkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        PrivateNetworkApi apiInstance = new PrivateNetworkApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            Operation result = apiInstance.deletePrivateNetwork(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivateNetworkApi#deletePrivateNetwork");
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


## detachInstanceFromPrivateNetwork

> Operation detachInstanceFromPrivateNetwork(id, detachInstanceFromPrivateNetworkRequest)

Detach a Compute instance from a Private Network



### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.PrivateNetworkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        PrivateNetworkApi apiInstance = new PrivateNetworkApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest = new DetachInstanceFromPrivateNetworkRequest(); // DetachInstanceFromPrivateNetworkRequest | 
        try {
            Operation result = apiInstance.detachInstanceFromPrivateNetwork(id, detachInstanceFromPrivateNetworkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivateNetworkApi#detachInstanceFromPrivateNetwork");
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
| **detachInstanceFromPrivateNetworkRequest** | [**DetachInstanceFromPrivateNetworkRequest**](DetachInstanceFromPrivateNetworkRequest.md)|  | |

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


## getPrivateNetwork

> PrivateNetwork getPrivateNetwork(id)

Retrieve Private Network details



### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.PrivateNetworkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        PrivateNetworkApi apiInstance = new PrivateNetworkApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            PrivateNetwork result = apiInstance.getPrivateNetwork(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivateNetworkApi#getPrivateNetwork");
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

[**PrivateNetwork**](PrivateNetwork.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listPrivateNetworks

> ListPrivateNetworks200Response listPrivateNetworks()

List Private Networks



### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.PrivateNetworkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        PrivateNetworkApi apiInstance = new PrivateNetworkApi(defaultClient);
        try {
            ListPrivateNetworks200Response result = apiInstance.listPrivateNetworks();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivateNetworkApi#listPrivateNetworks");
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

[**ListPrivateNetworks200Response**](ListPrivateNetworks200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## resetPrivateNetworkField

> Operation resetPrivateNetworkField(id, field)

Reset Private Network field



### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.PrivateNetworkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        PrivateNetworkApi apiInstance = new PrivateNetworkApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        String field = "labels"; // String | 
        try {
            Operation result = apiInstance.resetPrivateNetworkField(id, field);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivateNetworkApi#resetPrivateNetworkField");
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
| **field** | **String**|  | [enum: labels] |

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


## updatePrivateNetwork

> Operation updatePrivateNetwork(id, updatePrivateNetworkRequest)

Update a Private Network



### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.PrivateNetworkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        PrivateNetworkApi apiInstance = new PrivateNetworkApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UpdatePrivateNetworkRequest updatePrivateNetworkRequest = new UpdatePrivateNetworkRequest(); // UpdatePrivateNetworkRequest | 
        try {
            Operation result = apiInstance.updatePrivateNetwork(id, updatePrivateNetworkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivateNetworkApi#updatePrivateNetwork");
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
| **updatePrivateNetworkRequest** | [**UpdatePrivateNetworkRequest**](UpdatePrivateNetworkRequest.md)|  | |

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


## updatePrivateNetworkInstanceIp

> Operation updatePrivateNetworkInstanceIp(id, updatePrivateNetworkInstanceIpRequest)

Update the IP address of an instance attached to a managed private network



### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.PrivateNetworkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        PrivateNetworkApi apiInstance = new PrivateNetworkApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UpdatePrivateNetworkInstanceIpRequest updatePrivateNetworkInstanceIpRequest = new UpdatePrivateNetworkInstanceIpRequest(); // UpdatePrivateNetworkInstanceIpRequest | 
        try {
            Operation result = apiInstance.updatePrivateNetworkInstanceIp(id, updatePrivateNetworkInstanceIpRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivateNetworkApi#updatePrivateNetworkInstanceIp");
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
| **updatePrivateNetworkInstanceIpRequest** | [**UpdatePrivateNetworkInstanceIpRequest**](UpdatePrivateNetworkInstanceIpRequest.md)|  | |

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

