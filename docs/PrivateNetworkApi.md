# PrivateNetworkApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**attachInstanceToPrivateNetwork**](PrivateNetworkApi.md#attachInstanceToPrivateNetwork) | **PUT** /private-network/{id}:attach | Attach a Compute instance to a Private Network |
| [**attachInstanceToPrivateNetworkWithHttpInfo**](PrivateNetworkApi.md#attachInstanceToPrivateNetworkWithHttpInfo) | **PUT** /private-network/{id}:attach | Attach a Compute instance to a Private Network |
| [**createPrivateNetwork**](PrivateNetworkApi.md#createPrivateNetwork) | **POST** /private-network | Create a Private Network |
| [**createPrivateNetworkWithHttpInfo**](PrivateNetworkApi.md#createPrivateNetworkWithHttpInfo) | **POST** /private-network | Create a Private Network |
| [**deletePrivateNetwork**](PrivateNetworkApi.md#deletePrivateNetwork) | **DELETE** /private-network/{id} | Delete a Private Network |
| [**deletePrivateNetworkWithHttpInfo**](PrivateNetworkApi.md#deletePrivateNetworkWithHttpInfo) | **DELETE** /private-network/{id} | Delete a Private Network |
| [**detachInstanceFromPrivateNetwork**](PrivateNetworkApi.md#detachInstanceFromPrivateNetwork) | **PUT** /private-network/{id}:detach | Detach a Compute instance from a Private Network |
| [**detachInstanceFromPrivateNetworkWithHttpInfo**](PrivateNetworkApi.md#detachInstanceFromPrivateNetworkWithHttpInfo) | **PUT** /private-network/{id}:detach | Detach a Compute instance from a Private Network |
| [**getPrivateNetwork**](PrivateNetworkApi.md#getPrivateNetwork) | **GET** /private-network/{id} | Retrieve Private Network details |
| [**getPrivateNetworkWithHttpInfo**](PrivateNetworkApi.md#getPrivateNetworkWithHttpInfo) | **GET** /private-network/{id} | Retrieve Private Network details |
| [**listPrivateNetworks**](PrivateNetworkApi.md#listPrivateNetworks) | **GET** /private-network | List Private Networks |
| [**listPrivateNetworksWithHttpInfo**](PrivateNetworkApi.md#listPrivateNetworksWithHttpInfo) | **GET** /private-network | List Private Networks |
| [**resetPrivateNetworkField**](PrivateNetworkApi.md#resetPrivateNetworkField) | **DELETE** /private-network/{id}/{field} | Reset Private Network field |
| [**resetPrivateNetworkFieldWithHttpInfo**](PrivateNetworkApi.md#resetPrivateNetworkFieldWithHttpInfo) | **DELETE** /private-network/{id}/{field} | Reset Private Network field |
| [**updatePrivateNetwork**](PrivateNetworkApi.md#updatePrivateNetwork) | **PUT** /private-network/{id} | Update a Private Network |
| [**updatePrivateNetworkWithHttpInfo**](PrivateNetworkApi.md#updatePrivateNetworkWithHttpInfo) | **PUT** /private-network/{id} | Update a Private Network |
| [**updatePrivateNetworkInstanceIp**](PrivateNetworkApi.md#updatePrivateNetworkInstanceIp) | **PUT** /private-network/{id}:update-ip | Update the IP address of an instance attached to a managed private network |
| [**updatePrivateNetworkInstanceIpWithHttpInfo**](PrivateNetworkApi.md#updatePrivateNetworkInstanceIpWithHttpInfo) | **PUT** /private-network/{id}:update-ip | Update the IP address of an instance attached to a managed private network |



## attachInstanceToPrivateNetwork

> Operation attachInstanceToPrivateNetwork(id, attachInstanceToPrivateNetworkRequest)

Attach a Compute instance to a Private Network



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PrivateNetworkApi;

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

## attachInstanceToPrivateNetworkWithHttpInfo

> ApiResponse<Operation> attachInstanceToPrivateNetwork attachInstanceToPrivateNetworkWithHttpInfo(id, attachInstanceToPrivateNetworkRequest)

Attach a Compute instance to a Private Network



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PrivateNetworkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        PrivateNetworkApi apiInstance = new PrivateNetworkApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        AttachInstanceToPrivateNetworkRequest attachInstanceToPrivateNetworkRequest = new AttachInstanceToPrivateNetworkRequest(); // AttachInstanceToPrivateNetworkRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.attachInstanceToPrivateNetworkWithHttpInfo(id, attachInstanceToPrivateNetworkRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivateNetworkApi#attachInstanceToPrivateNetwork");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
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

ApiResponse<[**Operation**](Operation.md)>


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
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PrivateNetworkApi;

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

## createPrivateNetworkWithHttpInfo

> ApiResponse<Operation> createPrivateNetwork createPrivateNetworkWithHttpInfo(createPrivateNetworkRequest)

Create a Private Network



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PrivateNetworkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        PrivateNetworkApi apiInstance = new PrivateNetworkApi(defaultClient);
        CreatePrivateNetworkRequest createPrivateNetworkRequest = new CreatePrivateNetworkRequest(); // CreatePrivateNetworkRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.createPrivateNetworkWithHttpInfo(createPrivateNetworkRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivateNetworkApi#createPrivateNetwork");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
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

ApiResponse<[**Operation**](Operation.md)>


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
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PrivateNetworkApi;

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

## deletePrivateNetworkWithHttpInfo

> ApiResponse<Operation> deletePrivateNetwork deletePrivateNetworkWithHttpInfo(id)

Delete a Private Network



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PrivateNetworkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        PrivateNetworkApi apiInstance = new PrivateNetworkApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Operation> response = apiInstance.deletePrivateNetworkWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivateNetworkApi#deletePrivateNetwork");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
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

ApiResponse<[**Operation**](Operation.md)>


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
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PrivateNetworkApi;

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

## detachInstanceFromPrivateNetworkWithHttpInfo

> ApiResponse<Operation> detachInstanceFromPrivateNetwork detachInstanceFromPrivateNetworkWithHttpInfo(id, detachInstanceFromPrivateNetworkRequest)

Detach a Compute instance from a Private Network



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PrivateNetworkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        PrivateNetworkApi apiInstance = new PrivateNetworkApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest = new DetachInstanceFromPrivateNetworkRequest(); // DetachInstanceFromPrivateNetworkRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.detachInstanceFromPrivateNetworkWithHttpInfo(id, detachInstanceFromPrivateNetworkRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivateNetworkApi#detachInstanceFromPrivateNetwork");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
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

ApiResponse<[**Operation**](Operation.md)>


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
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PrivateNetworkApi;

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

## getPrivateNetworkWithHttpInfo

> ApiResponse<PrivateNetwork> getPrivateNetwork getPrivateNetworkWithHttpInfo(id)

Retrieve Private Network details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PrivateNetworkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        PrivateNetworkApi apiInstance = new PrivateNetworkApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<PrivateNetwork> response = apiInstance.getPrivateNetworkWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivateNetworkApi#getPrivateNetwork");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
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

ApiResponse<[**PrivateNetwork**](PrivateNetwork.md)>


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
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PrivateNetworkApi;

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

## listPrivateNetworksWithHttpInfo

> ApiResponse<ListPrivateNetworks200Response> listPrivateNetworks listPrivateNetworksWithHttpInfo()

List Private Networks



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PrivateNetworkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        PrivateNetworkApi apiInstance = new PrivateNetworkApi(defaultClient);
        try {
            ApiResponse<ListPrivateNetworks200Response> response = apiInstance.listPrivateNetworksWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivateNetworkApi#listPrivateNetworks");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListPrivateNetworks200Response**](ListPrivateNetworks200Response.md)>


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
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PrivateNetworkApi;

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

## resetPrivateNetworkFieldWithHttpInfo

> ApiResponse<Operation> resetPrivateNetworkField resetPrivateNetworkFieldWithHttpInfo(id, field)

Reset Private Network field



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PrivateNetworkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        PrivateNetworkApi apiInstance = new PrivateNetworkApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        String field = "labels"; // String | 
        try {
            ApiResponse<Operation> response = apiInstance.resetPrivateNetworkFieldWithHttpInfo(id, field);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivateNetworkApi#resetPrivateNetworkField");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
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

ApiResponse<[**Operation**](Operation.md)>


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
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PrivateNetworkApi;

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

## updatePrivateNetworkWithHttpInfo

> ApiResponse<Operation> updatePrivateNetwork updatePrivateNetworkWithHttpInfo(id, updatePrivateNetworkRequest)

Update a Private Network



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PrivateNetworkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        PrivateNetworkApi apiInstance = new PrivateNetworkApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UpdatePrivateNetworkRequest updatePrivateNetworkRequest = new UpdatePrivateNetworkRequest(); // UpdatePrivateNetworkRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.updatePrivateNetworkWithHttpInfo(id, updatePrivateNetworkRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivateNetworkApi#updatePrivateNetwork");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
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

ApiResponse<[**Operation**](Operation.md)>


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
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PrivateNetworkApi;

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

## updatePrivateNetworkInstanceIpWithHttpInfo

> ApiResponse<Operation> updatePrivateNetworkInstanceIp updatePrivateNetworkInstanceIpWithHttpInfo(id, updatePrivateNetworkInstanceIpRequest)

Update the IP address of an instance attached to a managed private network



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PrivateNetworkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        PrivateNetworkApi apiInstance = new PrivateNetworkApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UpdatePrivateNetworkInstanceIpRequest updatePrivateNetworkInstanceIpRequest = new UpdatePrivateNetworkInstanceIpRequest(); // UpdatePrivateNetworkInstanceIpRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.updatePrivateNetworkInstanceIpWithHttpInfo(id, updatePrivateNetworkInstanceIpRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivateNetworkApi#updatePrivateNetworkInstanceIp");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
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

ApiResponse<[**Operation**](Operation.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

