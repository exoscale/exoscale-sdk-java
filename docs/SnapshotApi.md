# SnapshotApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSnapshot**](SnapshotApi.md#createSnapshot) | **POST** /instance/{id}:create-snapshot | Create a Snapshot of a Compute instance |
| [**createSnapshotWithHttpInfo**](SnapshotApi.md#createSnapshotWithHttpInfo) | **POST** /instance/{id}:create-snapshot | Create a Snapshot of a Compute instance |
| [**deleteSnapshot**](SnapshotApi.md#deleteSnapshot) | **DELETE** /snapshot/{id} | Delete a Snapshot |
| [**deleteSnapshotWithHttpInfo**](SnapshotApi.md#deleteSnapshotWithHttpInfo) | **DELETE** /snapshot/{id} | Delete a Snapshot |
| [**exportSnapshot**](SnapshotApi.md#exportSnapshot) | **POST** /snapshot/{id}:export | Export a Snapshot |
| [**exportSnapshotWithHttpInfo**](SnapshotApi.md#exportSnapshotWithHttpInfo) | **POST** /snapshot/{id}:export | Export a Snapshot |
| [**getSnapshot**](SnapshotApi.md#getSnapshot) | **GET** /snapshot/{id} | Retrieve Snapshot details |
| [**getSnapshotWithHttpInfo**](SnapshotApi.md#getSnapshotWithHttpInfo) | **GET** /snapshot/{id} | Retrieve Snapshot details |
| [**listSnapshots**](SnapshotApi.md#listSnapshots) | **GET** /snapshot | List Snapshots |
| [**listSnapshotsWithHttpInfo**](SnapshotApi.md#listSnapshotsWithHttpInfo) | **GET** /snapshot | List Snapshots |
| [**promoteSnapshotToTemplate**](SnapshotApi.md#promoteSnapshotToTemplate) | **POST** /snapshot/{id}:promote | Promote a Snapshot to a Template |
| [**promoteSnapshotToTemplateWithHttpInfo**](SnapshotApi.md#promoteSnapshotToTemplateWithHttpInfo) | **POST** /snapshot/{id}:promote | Promote a Snapshot to a Template |



## createSnapshot

> Operation createSnapshot(id)

Create a Snapshot of a Compute instance



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SnapshotApi apiInstance = new SnapshotApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            Operation result = apiInstance.createSnapshot(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotApi#createSnapshot");
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

## createSnapshotWithHttpInfo

> ApiResponse<Operation> createSnapshot createSnapshotWithHttpInfo(id)

Create a Snapshot of a Compute instance



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SnapshotApi apiInstance = new SnapshotApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Operation> response = apiInstance.createSnapshotWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotApi#createSnapshot");
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


## deleteSnapshot

> Operation deleteSnapshot(id)

Delete a Snapshot



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SnapshotApi apiInstance = new SnapshotApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            Operation result = apiInstance.deleteSnapshot(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotApi#deleteSnapshot");
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

## deleteSnapshotWithHttpInfo

> ApiResponse<Operation> deleteSnapshot deleteSnapshotWithHttpInfo(id)

Delete a Snapshot



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SnapshotApi apiInstance = new SnapshotApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Operation> response = apiInstance.deleteSnapshotWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotApi#deleteSnapshot");
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


## exportSnapshot

> Operation exportSnapshot(id)

Export a Snapshot



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SnapshotApi apiInstance = new SnapshotApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            Operation result = apiInstance.exportSnapshot(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotApi#exportSnapshot");
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

## exportSnapshotWithHttpInfo

> ApiResponse<Operation> exportSnapshot exportSnapshotWithHttpInfo(id)

Export a Snapshot



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SnapshotApi apiInstance = new SnapshotApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Operation> response = apiInstance.exportSnapshotWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotApi#exportSnapshot");
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


## getSnapshot

> Snapshot getSnapshot(id)

Retrieve Snapshot details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SnapshotApi apiInstance = new SnapshotApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            Snapshot result = apiInstance.getSnapshot(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotApi#getSnapshot");
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

[**Snapshot**](Snapshot.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## getSnapshotWithHttpInfo

> ApiResponse<Snapshot> getSnapshot getSnapshotWithHttpInfo(id)

Retrieve Snapshot details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SnapshotApi apiInstance = new SnapshotApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Snapshot> response = apiInstance.getSnapshotWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotApi#getSnapshot");
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

ApiResponse<[**Snapshot**](Snapshot.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listSnapshots

> ListSnapshots200Response listSnapshots()

List Snapshots



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SnapshotApi apiInstance = new SnapshotApi(defaultClient);
        try {
            ListSnapshots200Response result = apiInstance.listSnapshots();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotApi#listSnapshots");
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

[**ListSnapshots200Response**](ListSnapshots200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## listSnapshotsWithHttpInfo

> ApiResponse<ListSnapshots200Response> listSnapshots listSnapshotsWithHttpInfo()

List Snapshots



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SnapshotApi apiInstance = new SnapshotApi(defaultClient);
        try {
            ApiResponse<ListSnapshots200Response> response = apiInstance.listSnapshotsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotApi#listSnapshots");
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

ApiResponse<[**ListSnapshots200Response**](ListSnapshots200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## promoteSnapshotToTemplate

> Operation promoteSnapshotToTemplate(id, promoteSnapshotToTemplateRequest)

Promote a Snapshot to a Template



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SnapshotApi apiInstance = new SnapshotApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        PromoteSnapshotToTemplateRequest promoteSnapshotToTemplateRequest = new PromoteSnapshotToTemplateRequest(); // PromoteSnapshotToTemplateRequest | 
        try {
            Operation result = apiInstance.promoteSnapshotToTemplate(id, promoteSnapshotToTemplateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotApi#promoteSnapshotToTemplate");
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
| **promoteSnapshotToTemplateRequest** | [**PromoteSnapshotToTemplateRequest**](PromoteSnapshotToTemplateRequest.md)|  | |

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

## promoteSnapshotToTemplateWithHttpInfo

> ApiResponse<Operation> promoteSnapshotToTemplate promoteSnapshotToTemplateWithHttpInfo(id, promoteSnapshotToTemplateRequest)

Promote a Snapshot to a Template



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SnapshotApi apiInstance = new SnapshotApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        PromoteSnapshotToTemplateRequest promoteSnapshotToTemplateRequest = new PromoteSnapshotToTemplateRequest(); // PromoteSnapshotToTemplateRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.promoteSnapshotToTemplateWithHttpInfo(id, promoteSnapshotToTemplateRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SnapshotApi#promoteSnapshotToTemplate");
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
| **promoteSnapshotToTemplateRequest** | [**PromoteSnapshotToTemplateRequest**](PromoteSnapshotToTemplateRequest.md)|  | |

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

