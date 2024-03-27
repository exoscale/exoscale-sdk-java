# AntiAffinityGroupApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAntiAffinityGroup**](AntiAffinityGroupApi.md#createAntiAffinityGroup) | **POST** /anti-affinity-group | Create an Anti-affinity Group |
| [**createAntiAffinityGroupWithHttpInfo**](AntiAffinityGroupApi.md#createAntiAffinityGroupWithHttpInfo) | **POST** /anti-affinity-group | Create an Anti-affinity Group |
| [**deleteAntiAffinityGroup**](AntiAffinityGroupApi.md#deleteAntiAffinityGroup) | **DELETE** /anti-affinity-group/{id} | Delete an Anti-affinity Group |
| [**deleteAntiAffinityGroupWithHttpInfo**](AntiAffinityGroupApi.md#deleteAntiAffinityGroupWithHttpInfo) | **DELETE** /anti-affinity-group/{id} | Delete an Anti-affinity Group |
| [**getAntiAffinityGroup**](AntiAffinityGroupApi.md#getAntiAffinityGroup) | **GET** /anti-affinity-group/{id} | Retrieve Anti-affinity Group details |
| [**getAntiAffinityGroupWithHttpInfo**](AntiAffinityGroupApi.md#getAntiAffinityGroupWithHttpInfo) | **GET** /anti-affinity-group/{id} | Retrieve Anti-affinity Group details |
| [**listAntiAffinityGroups**](AntiAffinityGroupApi.md#listAntiAffinityGroups) | **GET** /anti-affinity-group | List Anti-affinity Groups |
| [**listAntiAffinityGroupsWithHttpInfo**](AntiAffinityGroupApi.md#listAntiAffinityGroupsWithHttpInfo) | **GET** /anti-affinity-group | List Anti-affinity Groups |



## createAntiAffinityGroup

> Operation createAntiAffinityGroup(createAntiAffinityGroupRequest)

Create an Anti-affinity Group



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AntiAffinityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        AntiAffinityGroupApi apiInstance = new AntiAffinityGroupApi(defaultClient);
        CreateAntiAffinityGroupRequest createAntiAffinityGroupRequest = new CreateAntiAffinityGroupRequest(); // CreateAntiAffinityGroupRequest | 
        try {
            Operation result = apiInstance.createAntiAffinityGroup(createAntiAffinityGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AntiAffinityGroupApi#createAntiAffinityGroup");
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
| **createAntiAffinityGroupRequest** | [**CreateAntiAffinityGroupRequest**](CreateAntiAffinityGroupRequest.md)|  | |

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

## createAntiAffinityGroupWithHttpInfo

> ApiResponse<Operation> createAntiAffinityGroup createAntiAffinityGroupWithHttpInfo(createAntiAffinityGroupRequest)

Create an Anti-affinity Group



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AntiAffinityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        AntiAffinityGroupApi apiInstance = new AntiAffinityGroupApi(defaultClient);
        CreateAntiAffinityGroupRequest createAntiAffinityGroupRequest = new CreateAntiAffinityGroupRequest(); // CreateAntiAffinityGroupRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.createAntiAffinityGroupWithHttpInfo(createAntiAffinityGroupRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AntiAffinityGroupApi#createAntiAffinityGroup");
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
| **createAntiAffinityGroupRequest** | [**CreateAntiAffinityGroupRequest**](CreateAntiAffinityGroupRequest.md)|  | |

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


## deleteAntiAffinityGroup

> Operation deleteAntiAffinityGroup(id)

Delete an Anti-affinity Group



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AntiAffinityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        AntiAffinityGroupApi apiInstance = new AntiAffinityGroupApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            Operation result = apiInstance.deleteAntiAffinityGroup(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AntiAffinityGroupApi#deleteAntiAffinityGroup");
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

## deleteAntiAffinityGroupWithHttpInfo

> ApiResponse<Operation> deleteAntiAffinityGroup deleteAntiAffinityGroupWithHttpInfo(id)

Delete an Anti-affinity Group



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AntiAffinityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        AntiAffinityGroupApi apiInstance = new AntiAffinityGroupApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Operation> response = apiInstance.deleteAntiAffinityGroupWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AntiAffinityGroupApi#deleteAntiAffinityGroup");
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


## getAntiAffinityGroup

> AntiAffinityGroup getAntiAffinityGroup(id)

Retrieve Anti-affinity Group details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AntiAffinityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        AntiAffinityGroupApi apiInstance = new AntiAffinityGroupApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            AntiAffinityGroup result = apiInstance.getAntiAffinityGroup(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AntiAffinityGroupApi#getAntiAffinityGroup");
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

[**AntiAffinityGroup**](AntiAffinityGroup.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## getAntiAffinityGroupWithHttpInfo

> ApiResponse<AntiAffinityGroup> getAntiAffinityGroup getAntiAffinityGroupWithHttpInfo(id)

Retrieve Anti-affinity Group details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AntiAffinityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        AntiAffinityGroupApi apiInstance = new AntiAffinityGroupApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<AntiAffinityGroup> response = apiInstance.getAntiAffinityGroupWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AntiAffinityGroupApi#getAntiAffinityGroup");
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

ApiResponse<[**AntiAffinityGroup**](AntiAffinityGroup.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listAntiAffinityGroups

> ListAntiAffinityGroups200Response listAntiAffinityGroups()

List Anti-affinity Groups



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AntiAffinityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        AntiAffinityGroupApi apiInstance = new AntiAffinityGroupApi(defaultClient);
        try {
            ListAntiAffinityGroups200Response result = apiInstance.listAntiAffinityGroups();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AntiAffinityGroupApi#listAntiAffinityGroups");
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

[**ListAntiAffinityGroups200Response**](ListAntiAffinityGroups200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## listAntiAffinityGroupsWithHttpInfo

> ApiResponse<ListAntiAffinityGroups200Response> listAntiAffinityGroups listAntiAffinityGroupsWithHttpInfo()

List Anti-affinity Groups



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AntiAffinityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        AntiAffinityGroupApi apiInstance = new AntiAffinityGroupApi(defaultClient);
        try {
            ApiResponse<ListAntiAffinityGroups200Response> response = apiInstance.listAntiAffinityGroupsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AntiAffinityGroupApi#listAntiAffinityGroups");
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

ApiResponse<[**ListAntiAffinityGroups200Response**](ListAntiAffinityGroups200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

