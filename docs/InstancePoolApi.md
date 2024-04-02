# InstancePoolApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInstancePool**](InstancePoolApi.md#createInstancePool) | **POST** /instance-pool | Create an Instance Pool |
| [**createInstancePoolWithHttpInfo**](InstancePoolApi.md#createInstancePoolWithHttpInfo) | **POST** /instance-pool | Create an Instance Pool |
| [**deleteInstancePool**](InstancePoolApi.md#deleteInstancePool) | **DELETE** /instance-pool/{id} | Delete an Instance Pool |
| [**deleteInstancePoolWithHttpInfo**](InstancePoolApi.md#deleteInstancePoolWithHttpInfo) | **DELETE** /instance-pool/{id} | Delete an Instance Pool |
| [**evictInstancePoolMembers**](InstancePoolApi.md#evictInstancePoolMembers) | **PUT** /instance-pool/{id}:evict | Evict Instance Pool members |
| [**evictInstancePoolMembersWithHttpInfo**](InstancePoolApi.md#evictInstancePoolMembersWithHttpInfo) | **PUT** /instance-pool/{id}:evict | Evict Instance Pool members |
| [**getInstancePool**](InstancePoolApi.md#getInstancePool) | **GET** /instance-pool/{id} | Retrieve Instance Pool details |
| [**getInstancePoolWithHttpInfo**](InstancePoolApi.md#getInstancePoolWithHttpInfo) | **GET** /instance-pool/{id} | Retrieve Instance Pool details |
| [**listInstancePools**](InstancePoolApi.md#listInstancePools) | **GET** /instance-pool | List Instance Pools |
| [**listInstancePoolsWithHttpInfo**](InstancePoolApi.md#listInstancePoolsWithHttpInfo) | **GET** /instance-pool | List Instance Pools |
| [**resetInstancePoolField**](InstancePoolApi.md#resetInstancePoolField) | **DELETE** /instance-pool/{id}/{field} | Reset an Instance Pool field to its default value |
| [**resetInstancePoolFieldWithHttpInfo**](InstancePoolApi.md#resetInstancePoolFieldWithHttpInfo) | **DELETE** /instance-pool/{id}/{field} | Reset an Instance Pool field to its default value |
| [**scaleInstancePool**](InstancePoolApi.md#scaleInstancePool) | **PUT** /instance-pool/{id}:scale | Scale an Instance Pool |
| [**scaleInstancePoolWithHttpInfo**](InstancePoolApi.md#scaleInstancePoolWithHttpInfo) | **PUT** /instance-pool/{id}:scale | Scale an Instance Pool |
| [**updateInstancePool**](InstancePoolApi.md#updateInstancePool) | **PUT** /instance-pool/{id} | Update an Instance Pool |
| [**updateInstancePoolWithHttpInfo**](InstancePoolApi.md#updateInstancePoolWithHttpInfo) | **PUT** /instance-pool/{id} | Update an Instance Pool |



## createInstancePool

> Operation createInstancePool(createInstancePoolRequest)

Create an Instance Pool



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstancePoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        InstancePoolApi apiInstance = new InstancePoolApi(defaultClient);
        CreateInstancePoolRequest createInstancePoolRequest = new CreateInstancePoolRequest(); // CreateInstancePoolRequest | 
        try {
            Operation result = apiInstance.createInstancePool(createInstancePoolRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstancePoolApi#createInstancePool");
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
| **createInstancePoolRequest** | [**CreateInstancePoolRequest**](CreateInstancePoolRequest.md)|  | |

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

## createInstancePoolWithHttpInfo

> ApiResponse<Operation> createInstancePool createInstancePoolWithHttpInfo(createInstancePoolRequest)

Create an Instance Pool



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstancePoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        InstancePoolApi apiInstance = new InstancePoolApi(defaultClient);
        CreateInstancePoolRequest createInstancePoolRequest = new CreateInstancePoolRequest(); // CreateInstancePoolRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.createInstancePoolWithHttpInfo(createInstancePoolRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling InstancePoolApi#createInstancePool");
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
| **createInstancePoolRequest** | [**CreateInstancePoolRequest**](CreateInstancePoolRequest.md)|  | |

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


## deleteInstancePool

> Operation deleteInstancePool(id)

Delete an Instance Pool



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstancePoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        InstancePoolApi apiInstance = new InstancePoolApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            Operation result = apiInstance.deleteInstancePool(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstancePoolApi#deleteInstancePool");
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

## deleteInstancePoolWithHttpInfo

> ApiResponse<Operation> deleteInstancePool deleteInstancePoolWithHttpInfo(id)

Delete an Instance Pool



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstancePoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        InstancePoolApi apiInstance = new InstancePoolApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Operation> response = apiInstance.deleteInstancePoolWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling InstancePoolApi#deleteInstancePool");
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


## evictInstancePoolMembers

> Operation evictInstancePoolMembers(id, evictInstancePoolMembersRequest)

Evict Instance Pool members

This operation evicts the specified Compute instances member from the Instance Pool, shrinking it to &#x60;&amp;lt;current pool size&amp;gt; - &amp;lt;# evicted members&amp;gt;&#x60;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstancePoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        InstancePoolApi apiInstance = new InstancePoolApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        EvictInstancePoolMembersRequest evictInstancePoolMembersRequest = new EvictInstancePoolMembersRequest(); // EvictInstancePoolMembersRequest | 
        try {
            Operation result = apiInstance.evictInstancePoolMembers(id, evictInstancePoolMembersRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstancePoolApi#evictInstancePoolMembers");
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
| **evictInstancePoolMembersRequest** | [**EvictInstancePoolMembersRequest**](EvictInstancePoolMembersRequest.md)|  | |

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

## evictInstancePoolMembersWithHttpInfo

> ApiResponse<Operation> evictInstancePoolMembers evictInstancePoolMembersWithHttpInfo(id, evictInstancePoolMembersRequest)

Evict Instance Pool members

This operation evicts the specified Compute instances member from the Instance Pool, shrinking it to &#x60;&amp;lt;current pool size&amp;gt; - &amp;lt;# evicted members&amp;gt;&#x60;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstancePoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        InstancePoolApi apiInstance = new InstancePoolApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        EvictInstancePoolMembersRequest evictInstancePoolMembersRequest = new EvictInstancePoolMembersRequest(); // EvictInstancePoolMembersRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.evictInstancePoolMembersWithHttpInfo(id, evictInstancePoolMembersRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling InstancePoolApi#evictInstancePoolMembers");
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
| **evictInstancePoolMembersRequest** | [**EvictInstancePoolMembersRequest**](EvictInstancePoolMembersRequest.md)|  | |

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


## getInstancePool

> InstancePool getInstancePool(id)

Retrieve Instance Pool details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstancePoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        InstancePoolApi apiInstance = new InstancePoolApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            InstancePool result = apiInstance.getInstancePool(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstancePoolApi#getInstancePool");
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

[**InstancePool**](InstancePool.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## getInstancePoolWithHttpInfo

> ApiResponse<InstancePool> getInstancePool getInstancePoolWithHttpInfo(id)

Retrieve Instance Pool details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstancePoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        InstancePoolApi apiInstance = new InstancePoolApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<InstancePool> response = apiInstance.getInstancePoolWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling InstancePoolApi#getInstancePool");
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

ApiResponse<[**InstancePool**](InstancePool.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listInstancePools

> ListInstancePools200Response listInstancePools()

List Instance Pools



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstancePoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        InstancePoolApi apiInstance = new InstancePoolApi(defaultClient);
        try {
            ListInstancePools200Response result = apiInstance.listInstancePools();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstancePoolApi#listInstancePools");
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

[**ListInstancePools200Response**](ListInstancePools200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## listInstancePoolsWithHttpInfo

> ApiResponse<ListInstancePools200Response> listInstancePools listInstancePoolsWithHttpInfo()

List Instance Pools



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstancePoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        InstancePoolApi apiInstance = new InstancePoolApi(defaultClient);
        try {
            ApiResponse<ListInstancePools200Response> response = apiInstance.listInstancePoolsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling InstancePoolApi#listInstancePools");
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

ApiResponse<[**ListInstancePools200Response**](ListInstancePools200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## resetInstancePoolField

> Operation resetInstancePoolField(id, field)

Reset an Instance Pool field to its default value



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstancePoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        InstancePoolApi apiInstance = new InstancePoolApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        String field = "anti-affinity-groups"; // String | 
        try {
            Operation result = apiInstance.resetInstancePoolField(id, field);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstancePoolApi#resetInstancePoolField");
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
| **field** | **String**|  | [enum: anti-affinity-groups, description, labels, security-groups, elastic-ips, private-networks, ssh-key, user-data, deploy-target, ipv6-enabled] |

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

## resetInstancePoolFieldWithHttpInfo

> ApiResponse<Operation> resetInstancePoolField resetInstancePoolFieldWithHttpInfo(id, field)

Reset an Instance Pool field to its default value



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstancePoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        InstancePoolApi apiInstance = new InstancePoolApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        String field = "anti-affinity-groups"; // String | 
        try {
            ApiResponse<Operation> response = apiInstance.resetInstancePoolFieldWithHttpInfo(id, field);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling InstancePoolApi#resetInstancePoolField");
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
| **field** | **String**|  | [enum: anti-affinity-groups, description, labels, security-groups, elastic-ips, private-networks, ssh-key, user-data, deploy-target, ipv6-enabled] |

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


## scaleInstancePool

> Operation scaleInstancePool(id, scaleInstancePoolRequest)

Scale an Instance Pool



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstancePoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        InstancePoolApi apiInstance = new InstancePoolApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        ScaleInstancePoolRequest scaleInstancePoolRequest = new ScaleInstancePoolRequest(); // ScaleInstancePoolRequest | 
        try {
            Operation result = apiInstance.scaleInstancePool(id, scaleInstancePoolRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstancePoolApi#scaleInstancePool");
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
| **scaleInstancePoolRequest** | [**ScaleInstancePoolRequest**](ScaleInstancePoolRequest.md)|  | |

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

## scaleInstancePoolWithHttpInfo

> ApiResponse<Operation> scaleInstancePool scaleInstancePoolWithHttpInfo(id, scaleInstancePoolRequest)

Scale an Instance Pool



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstancePoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        InstancePoolApi apiInstance = new InstancePoolApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        ScaleInstancePoolRequest scaleInstancePoolRequest = new ScaleInstancePoolRequest(); // ScaleInstancePoolRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.scaleInstancePoolWithHttpInfo(id, scaleInstancePoolRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling InstancePoolApi#scaleInstancePool");
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
| **scaleInstancePoolRequest** | [**ScaleInstancePoolRequest**](ScaleInstancePoolRequest.md)|  | |

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


## updateInstancePool

> Operation updateInstancePool(id, updateInstancePoolRequest)

Update an Instance Pool



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstancePoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        InstancePoolApi apiInstance = new InstancePoolApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateInstancePoolRequest updateInstancePoolRequest = new UpdateInstancePoolRequest(); // UpdateInstancePoolRequest | 
        try {
            Operation result = apiInstance.updateInstancePool(id, updateInstancePoolRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstancePoolApi#updateInstancePool");
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
| **updateInstancePoolRequest** | [**UpdateInstancePoolRequest**](UpdateInstancePoolRequest.md)|  | |

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

## updateInstancePoolWithHttpInfo

> ApiResponse<Operation> updateInstancePool updateInstancePoolWithHttpInfo(id, updateInstancePoolRequest)

Update an Instance Pool



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstancePoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        InstancePoolApi apiInstance = new InstancePoolApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateInstancePoolRequest updateInstancePoolRequest = new UpdateInstancePoolRequest(); // UpdateInstancePoolRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.updateInstancePoolWithHttpInfo(id, updateInstancePoolRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling InstancePoolApi#updateInstancePool");
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
| **updateInstancePoolRequest** | [**UpdateInstancePoolRequest**](UpdateInstancePoolRequest.md)|  | |

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

