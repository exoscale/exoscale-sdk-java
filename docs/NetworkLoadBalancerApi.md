# NetworkLoadBalancerApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addServiceToLoadBalancer**](NetworkLoadBalancerApi.md#addServiceToLoadBalancer) | **POST** /load-balancer/{id}/service | Add a Load Balancer Service |
| [**addServiceToLoadBalancerWithHttpInfo**](NetworkLoadBalancerApi.md#addServiceToLoadBalancerWithHttpInfo) | **POST** /load-balancer/{id}/service | Add a Load Balancer Service |
| [**createLoadBalancer**](NetworkLoadBalancerApi.md#createLoadBalancer) | **POST** /load-balancer | Create a Load Balancer |
| [**createLoadBalancerWithHttpInfo**](NetworkLoadBalancerApi.md#createLoadBalancerWithHttpInfo) | **POST** /load-balancer | Create a Load Balancer |
| [**deleteLoadBalancer**](NetworkLoadBalancerApi.md#deleteLoadBalancer) | **DELETE** /load-balancer/{id} | Delete a Load Balancer |
| [**deleteLoadBalancerWithHttpInfo**](NetworkLoadBalancerApi.md#deleteLoadBalancerWithHttpInfo) | **DELETE** /load-balancer/{id} | Delete a Load Balancer |
| [**deleteLoadBalancerService**](NetworkLoadBalancerApi.md#deleteLoadBalancerService) | **DELETE** /load-balancer/{id}/service/{service-id} | Delete a Load Balancer Service |
| [**deleteLoadBalancerServiceWithHttpInfo**](NetworkLoadBalancerApi.md#deleteLoadBalancerServiceWithHttpInfo) | **DELETE** /load-balancer/{id}/service/{service-id} | Delete a Load Balancer Service |
| [**getLoadBalancer**](NetworkLoadBalancerApi.md#getLoadBalancer) | **GET** /load-balancer/{id} | Retrieve Load Balancer details |
| [**getLoadBalancerWithHttpInfo**](NetworkLoadBalancerApi.md#getLoadBalancerWithHttpInfo) | **GET** /load-balancer/{id} | Retrieve Load Balancer details |
| [**getLoadBalancerService**](NetworkLoadBalancerApi.md#getLoadBalancerService) | **GET** /load-balancer/{id}/service/{service-id} | Retrieve Load Balancer Service details |
| [**getLoadBalancerServiceWithHttpInfo**](NetworkLoadBalancerApi.md#getLoadBalancerServiceWithHttpInfo) | **GET** /load-balancer/{id}/service/{service-id} | Retrieve Load Balancer Service details |
| [**listLoadBalancers**](NetworkLoadBalancerApi.md#listLoadBalancers) | **GET** /load-balancer | List Load Balancers |
| [**listLoadBalancersWithHttpInfo**](NetworkLoadBalancerApi.md#listLoadBalancersWithHttpInfo) | **GET** /load-balancer | List Load Balancers |
| [**resetLoadBalancerField**](NetworkLoadBalancerApi.md#resetLoadBalancerField) | **DELETE** /load-balancer/{id}/{field} | Reset a Load Balancer field to its default value |
| [**resetLoadBalancerFieldWithHttpInfo**](NetworkLoadBalancerApi.md#resetLoadBalancerFieldWithHttpInfo) | **DELETE** /load-balancer/{id}/{field} | Reset a Load Balancer field to its default value |
| [**resetLoadBalancerServiceField**](NetworkLoadBalancerApi.md#resetLoadBalancerServiceField) | **DELETE** /load-balancer/{id}/service/{service-id}/{field} | Reset a Load Balancer Service field to its default value |
| [**resetLoadBalancerServiceFieldWithHttpInfo**](NetworkLoadBalancerApi.md#resetLoadBalancerServiceFieldWithHttpInfo) | **DELETE** /load-balancer/{id}/service/{service-id}/{field} | Reset a Load Balancer Service field to its default value |
| [**updateLoadBalancer**](NetworkLoadBalancerApi.md#updateLoadBalancer) | **PUT** /load-balancer/{id} | Update a Load Balancer |
| [**updateLoadBalancerWithHttpInfo**](NetworkLoadBalancerApi.md#updateLoadBalancerWithHttpInfo) | **PUT** /load-balancer/{id} | Update a Load Balancer |
| [**updateLoadBalancerService**](NetworkLoadBalancerApi.md#updateLoadBalancerService) | **PUT** /load-balancer/{id}/service/{service-id} | Update a Load Balancer Service |
| [**updateLoadBalancerServiceWithHttpInfo**](NetworkLoadBalancerApi.md#updateLoadBalancerServiceWithHttpInfo) | **PUT** /load-balancer/{id}/service/{service-id} | Update a Load Balancer Service |



## addServiceToLoadBalancer

> Operation addServiceToLoadBalancer(id, addServiceToLoadBalancerRequest)

Add a Load Balancer Service



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkLoadBalancerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        AddServiceToLoadBalancerRequest addServiceToLoadBalancerRequest = new AddServiceToLoadBalancerRequest(); // AddServiceToLoadBalancerRequest | 
        try {
            Operation result = apiInstance.addServiceToLoadBalancer(id, addServiceToLoadBalancerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkLoadBalancerApi#addServiceToLoadBalancer");
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
| **addServiceToLoadBalancerRequest** | [**AddServiceToLoadBalancerRequest**](AddServiceToLoadBalancerRequest.md)|  | |

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

## addServiceToLoadBalancerWithHttpInfo

> ApiResponse<Operation> addServiceToLoadBalancer addServiceToLoadBalancerWithHttpInfo(id, addServiceToLoadBalancerRequest)

Add a Load Balancer Service



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkLoadBalancerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        AddServiceToLoadBalancerRequest addServiceToLoadBalancerRequest = new AddServiceToLoadBalancerRequest(); // AddServiceToLoadBalancerRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.addServiceToLoadBalancerWithHttpInfo(id, addServiceToLoadBalancerRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkLoadBalancerApi#addServiceToLoadBalancer");
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
| **addServiceToLoadBalancerRequest** | [**AddServiceToLoadBalancerRequest**](AddServiceToLoadBalancerRequest.md)|  | |

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


## createLoadBalancer

> Operation createLoadBalancer(createLoadBalancerRequest)

Create a Load Balancer



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkLoadBalancerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi(defaultClient);
        CreateLoadBalancerRequest createLoadBalancerRequest = new CreateLoadBalancerRequest(); // CreateLoadBalancerRequest | 
        try {
            Operation result = apiInstance.createLoadBalancer(createLoadBalancerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkLoadBalancerApi#createLoadBalancer");
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
| **createLoadBalancerRequest** | [**CreateLoadBalancerRequest**](CreateLoadBalancerRequest.md)|  | |

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

## createLoadBalancerWithHttpInfo

> ApiResponse<Operation> createLoadBalancer createLoadBalancerWithHttpInfo(createLoadBalancerRequest)

Create a Load Balancer



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkLoadBalancerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi(defaultClient);
        CreateLoadBalancerRequest createLoadBalancerRequest = new CreateLoadBalancerRequest(); // CreateLoadBalancerRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.createLoadBalancerWithHttpInfo(createLoadBalancerRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkLoadBalancerApi#createLoadBalancer");
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
| **createLoadBalancerRequest** | [**CreateLoadBalancerRequest**](CreateLoadBalancerRequest.md)|  | |

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


## deleteLoadBalancer

> Operation deleteLoadBalancer(id)

Delete a Load Balancer



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkLoadBalancerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            Operation result = apiInstance.deleteLoadBalancer(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkLoadBalancerApi#deleteLoadBalancer");
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

## deleteLoadBalancerWithHttpInfo

> ApiResponse<Operation> deleteLoadBalancer deleteLoadBalancerWithHttpInfo(id)

Delete a Load Balancer



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkLoadBalancerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Operation> response = apiInstance.deleteLoadBalancerWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkLoadBalancerApi#deleteLoadBalancer");
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


## deleteLoadBalancerService

> Operation deleteLoadBalancerService(id, serviceId)

Delete a Load Balancer Service



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkLoadBalancerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UUID serviceId = UUID.randomUUID(); // UUID | 
        try {
            Operation result = apiInstance.deleteLoadBalancerService(id, serviceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkLoadBalancerApi#deleteLoadBalancerService");
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
| **serviceId** | **UUID**|  | |

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

## deleteLoadBalancerServiceWithHttpInfo

> ApiResponse<Operation> deleteLoadBalancerService deleteLoadBalancerServiceWithHttpInfo(id, serviceId)

Delete a Load Balancer Service



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkLoadBalancerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UUID serviceId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Operation> response = apiInstance.deleteLoadBalancerServiceWithHttpInfo(id, serviceId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkLoadBalancerApi#deleteLoadBalancerService");
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
| **serviceId** | **UUID**|  | |

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


## getLoadBalancer

> LoadBalancer getLoadBalancer(id)

Retrieve Load Balancer details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkLoadBalancerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            LoadBalancer result = apiInstance.getLoadBalancer(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkLoadBalancerApi#getLoadBalancer");
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

[**LoadBalancer**](LoadBalancer.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## getLoadBalancerWithHttpInfo

> ApiResponse<LoadBalancer> getLoadBalancer getLoadBalancerWithHttpInfo(id)

Retrieve Load Balancer details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkLoadBalancerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<LoadBalancer> response = apiInstance.getLoadBalancerWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkLoadBalancerApi#getLoadBalancer");
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

ApiResponse<[**LoadBalancer**](LoadBalancer.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getLoadBalancerService

> LoadBalancerService getLoadBalancerService(id, serviceId)

Retrieve Load Balancer Service details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkLoadBalancerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UUID serviceId = UUID.randomUUID(); // UUID | 
        try {
            LoadBalancerService result = apiInstance.getLoadBalancerService(id, serviceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkLoadBalancerApi#getLoadBalancerService");
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
| **serviceId** | **UUID**|  | |

### Return type

[**LoadBalancerService**](LoadBalancerService.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## getLoadBalancerServiceWithHttpInfo

> ApiResponse<LoadBalancerService> getLoadBalancerService getLoadBalancerServiceWithHttpInfo(id, serviceId)

Retrieve Load Balancer Service details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkLoadBalancerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UUID serviceId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<LoadBalancerService> response = apiInstance.getLoadBalancerServiceWithHttpInfo(id, serviceId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkLoadBalancerApi#getLoadBalancerService");
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
| **serviceId** | **UUID**|  | |

### Return type

ApiResponse<[**LoadBalancerService**](LoadBalancerService.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listLoadBalancers

> ListLoadBalancers200Response listLoadBalancers()

List Load Balancers



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkLoadBalancerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi(defaultClient);
        try {
            ListLoadBalancers200Response result = apiInstance.listLoadBalancers();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkLoadBalancerApi#listLoadBalancers");
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

[**ListLoadBalancers200Response**](ListLoadBalancers200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## listLoadBalancersWithHttpInfo

> ApiResponse<ListLoadBalancers200Response> listLoadBalancers listLoadBalancersWithHttpInfo()

List Load Balancers



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkLoadBalancerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi(defaultClient);
        try {
            ApiResponse<ListLoadBalancers200Response> response = apiInstance.listLoadBalancersWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkLoadBalancerApi#listLoadBalancers");
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

ApiResponse<[**ListLoadBalancers200Response**](ListLoadBalancers200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## resetLoadBalancerField

> Operation resetLoadBalancerField(id, field)

Reset a Load Balancer field to its default value



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkLoadBalancerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        String field = "description"; // String | 
        try {
            Operation result = apiInstance.resetLoadBalancerField(id, field);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkLoadBalancerApi#resetLoadBalancerField");
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
| **field** | **String**|  | [enum: description, labels] |

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

## resetLoadBalancerFieldWithHttpInfo

> ApiResponse<Operation> resetLoadBalancerField resetLoadBalancerFieldWithHttpInfo(id, field)

Reset a Load Balancer field to its default value



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkLoadBalancerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        String field = "description"; // String | 
        try {
            ApiResponse<Operation> response = apiInstance.resetLoadBalancerFieldWithHttpInfo(id, field);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkLoadBalancerApi#resetLoadBalancerField");
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
| **field** | **String**|  | [enum: description, labels] |

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


## resetLoadBalancerServiceField

> Operation resetLoadBalancerServiceField(id, serviceId, field)

Reset a Load Balancer Service field to its default value



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkLoadBalancerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UUID serviceId = UUID.randomUUID(); // UUID | 
        String field = "description"; // String | 
        try {
            Operation result = apiInstance.resetLoadBalancerServiceField(id, serviceId, field);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkLoadBalancerApi#resetLoadBalancerServiceField");
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
| **serviceId** | **UUID**|  | |
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

## resetLoadBalancerServiceFieldWithHttpInfo

> ApiResponse<Operation> resetLoadBalancerServiceField resetLoadBalancerServiceFieldWithHttpInfo(id, serviceId, field)

Reset a Load Balancer Service field to its default value



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkLoadBalancerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UUID serviceId = UUID.randomUUID(); // UUID | 
        String field = "description"; // String | 
        try {
            ApiResponse<Operation> response = apiInstance.resetLoadBalancerServiceFieldWithHttpInfo(id, serviceId, field);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkLoadBalancerApi#resetLoadBalancerServiceField");
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
| **serviceId** | **UUID**|  | |
| **field** | **String**|  | [enum: description] |

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


## updateLoadBalancer

> Operation updateLoadBalancer(id, updateLoadBalancerRequest)

Update a Load Balancer



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkLoadBalancerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateLoadBalancerRequest updateLoadBalancerRequest = new UpdateLoadBalancerRequest(); // UpdateLoadBalancerRequest | 
        try {
            Operation result = apiInstance.updateLoadBalancer(id, updateLoadBalancerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkLoadBalancerApi#updateLoadBalancer");
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
| **updateLoadBalancerRequest** | [**UpdateLoadBalancerRequest**](UpdateLoadBalancerRequest.md)|  | |

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

## updateLoadBalancerWithHttpInfo

> ApiResponse<Operation> updateLoadBalancer updateLoadBalancerWithHttpInfo(id, updateLoadBalancerRequest)

Update a Load Balancer



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkLoadBalancerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateLoadBalancerRequest updateLoadBalancerRequest = new UpdateLoadBalancerRequest(); // UpdateLoadBalancerRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.updateLoadBalancerWithHttpInfo(id, updateLoadBalancerRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkLoadBalancerApi#updateLoadBalancer");
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
| **updateLoadBalancerRequest** | [**UpdateLoadBalancerRequest**](UpdateLoadBalancerRequest.md)|  | |

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


## updateLoadBalancerService

> Operation updateLoadBalancerService(id, serviceId, updateLoadBalancerServiceRequest)

Update a Load Balancer Service



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkLoadBalancerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UUID serviceId = UUID.randomUUID(); // UUID | 
        UpdateLoadBalancerServiceRequest updateLoadBalancerServiceRequest = new UpdateLoadBalancerServiceRequest(); // UpdateLoadBalancerServiceRequest | 
        try {
            Operation result = apiInstance.updateLoadBalancerService(id, serviceId, updateLoadBalancerServiceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkLoadBalancerApi#updateLoadBalancerService");
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
| **serviceId** | **UUID**|  | |
| **updateLoadBalancerServiceRequest** | [**UpdateLoadBalancerServiceRequest**](UpdateLoadBalancerServiceRequest.md)|  | |

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

## updateLoadBalancerServiceWithHttpInfo

> ApiResponse<Operation> updateLoadBalancerService updateLoadBalancerServiceWithHttpInfo(id, serviceId, updateLoadBalancerServiceRequest)

Update a Load Balancer Service



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NetworkLoadBalancerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        NetworkLoadBalancerApi apiInstance = new NetworkLoadBalancerApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UUID serviceId = UUID.randomUUID(); // UUID | 
        UpdateLoadBalancerServiceRequest updateLoadBalancerServiceRequest = new UpdateLoadBalancerServiceRequest(); // UpdateLoadBalancerServiceRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.updateLoadBalancerServiceWithHttpInfo(id, serviceId, updateLoadBalancerServiceRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkLoadBalancerApi#updateLoadBalancerService");
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
| **serviceId** | **UUID**|  | |
| **updateLoadBalancerServiceRequest** | [**UpdateLoadBalancerServiceRequest**](UpdateLoadBalancerServiceRequest.md)|  | |

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

