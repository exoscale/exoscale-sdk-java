# BlockStorageApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**attachBlockStorageVolumeToInstance**](BlockStorageApi.md#attachBlockStorageVolumeToInstance) | **PUT** /block-storage/{id}:attach | Attach block storage volume to an instance |
| [**attachBlockStorageVolumeToInstanceWithHttpInfo**](BlockStorageApi.md#attachBlockStorageVolumeToInstanceWithHttpInfo) | **PUT** /block-storage/{id}:attach | Attach block storage volume to an instance |
| [**createBlockStorageSnapshot**](BlockStorageApi.md#createBlockStorageSnapshot) | **POST** /block-storage/{id}:create-snapshot | Create a block storage snapshot |
| [**createBlockStorageSnapshotWithHttpInfo**](BlockStorageApi.md#createBlockStorageSnapshotWithHttpInfo) | **POST** /block-storage/{id}:create-snapshot | Create a block storage snapshot |
| [**createBlockStorageVolume**](BlockStorageApi.md#createBlockStorageVolume) | **POST** /block-storage | Create a block storage volume |
| [**createBlockStorageVolumeWithHttpInfo**](BlockStorageApi.md#createBlockStorageVolumeWithHttpInfo) | **POST** /block-storage | Create a block storage volume |
| [**deleteBlockStorageSnapshot**](BlockStorageApi.md#deleteBlockStorageSnapshot) | **DELETE** /block-storage-snapshot/{id} | Delete a block storage snapshot, data will be unrecoverable |
| [**deleteBlockStorageSnapshotWithHttpInfo**](BlockStorageApi.md#deleteBlockStorageSnapshotWithHttpInfo) | **DELETE** /block-storage-snapshot/{id} | Delete a block storage snapshot, data will be unrecoverable |
| [**deleteBlockStorageVolume**](BlockStorageApi.md#deleteBlockStorageVolume) | **DELETE** /block-storage/{id} | Delete a block storage volume, data will be unrecoverable |
| [**deleteBlockStorageVolumeWithHttpInfo**](BlockStorageApi.md#deleteBlockStorageVolumeWithHttpInfo) | **DELETE** /block-storage/{id} | Delete a block storage volume, data will be unrecoverable |
| [**detachBlockStorageVolume**](BlockStorageApi.md#detachBlockStorageVolume) | **PUT** /block-storage/{id}:detach | Detach block storage volume |
| [**detachBlockStorageVolumeWithHttpInfo**](BlockStorageApi.md#detachBlockStorageVolumeWithHttpInfo) | **PUT** /block-storage/{id}:detach | Detach block storage volume |
| [**getBlockStorageSnapshot**](BlockStorageApi.md#getBlockStorageSnapshot) | **GET** /block-storage-snapshot/{id} | Retrieve block storage snapshot details |
| [**getBlockStorageSnapshotWithHttpInfo**](BlockStorageApi.md#getBlockStorageSnapshotWithHttpInfo) | **GET** /block-storage-snapshot/{id} | Retrieve block storage snapshot details |
| [**getBlockStorageVolume**](BlockStorageApi.md#getBlockStorageVolume) | **GET** /block-storage/{id} | Retrieve block storage volume details |
| [**getBlockStorageVolumeWithHttpInfo**](BlockStorageApi.md#getBlockStorageVolumeWithHttpInfo) | **GET** /block-storage/{id} | Retrieve block storage volume details |
| [**listBlockStorageSnapshots**](BlockStorageApi.md#listBlockStorageSnapshots) | **GET** /block-storage-snapshot | List block storage snapshots |
| [**listBlockStorageSnapshotsWithHttpInfo**](BlockStorageApi.md#listBlockStorageSnapshotsWithHttpInfo) | **GET** /block-storage-snapshot | List block storage snapshots |
| [**listBlockStorageVolumes**](BlockStorageApi.md#listBlockStorageVolumes) | **GET** /block-storage | List block storage volumes |
| [**listBlockStorageVolumesWithHttpInfo**](BlockStorageApi.md#listBlockStorageVolumesWithHttpInfo) | **GET** /block-storage | List block storage volumes |
| [**resizeBlockStorageVolume**](BlockStorageApi.md#resizeBlockStorageVolume) | **PUT** /block-storage/{id}:resize-volume | Resize a block storage volume |
| [**resizeBlockStorageVolumeWithHttpInfo**](BlockStorageApi.md#resizeBlockStorageVolumeWithHttpInfo) | **PUT** /block-storage/{id}:resize-volume | Resize a block storage volume |
| [**updateBlockStorageVolumeLabels**](BlockStorageApi.md#updateBlockStorageVolumeLabels) | **PUT** /block-storage/{id} | Set block storage volume labels |
| [**updateBlockStorageVolumeLabelsWithHttpInfo**](BlockStorageApi.md#updateBlockStorageVolumeLabelsWithHttpInfo) | **PUT** /block-storage/{id} | Set block storage volume labels |



## attachBlockStorageVolumeToInstance

> Operation attachBlockStorageVolumeToInstance(id, attachBlockStorageVolumeToInstanceRequest)

Attach block storage volume to an instance



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        BlockStorageApi apiInstance = new BlockStorageApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        AttachBlockStorageVolumeToInstanceRequest attachBlockStorageVolumeToInstanceRequest = new AttachBlockStorageVolumeToInstanceRequest(); // AttachBlockStorageVolumeToInstanceRequest | 
        try {
            Operation result = apiInstance.attachBlockStorageVolumeToInstance(id, attachBlockStorageVolumeToInstanceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockStorageApi#attachBlockStorageVolumeToInstance");
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

## attachBlockStorageVolumeToInstanceWithHttpInfo

> ApiResponse<Operation> attachBlockStorageVolumeToInstance attachBlockStorageVolumeToInstanceWithHttpInfo(id, attachBlockStorageVolumeToInstanceRequest)

Attach block storage volume to an instance



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        BlockStorageApi apiInstance = new BlockStorageApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        AttachBlockStorageVolumeToInstanceRequest attachBlockStorageVolumeToInstanceRequest = new AttachBlockStorageVolumeToInstanceRequest(); // AttachBlockStorageVolumeToInstanceRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.attachBlockStorageVolumeToInstanceWithHttpInfo(id, attachBlockStorageVolumeToInstanceRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockStorageApi#attachBlockStorageVolumeToInstance");
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
| **attachBlockStorageVolumeToInstanceRequest** | [**AttachBlockStorageVolumeToInstanceRequest**](AttachBlockStorageVolumeToInstanceRequest.md)|  | |

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


## createBlockStorageSnapshot

> Operation createBlockStorageSnapshot(id, createBlockStorageSnapshotRequest)

Create a block storage snapshot



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        BlockStorageApi apiInstance = new BlockStorageApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        CreateBlockStorageSnapshotRequest createBlockStorageSnapshotRequest = new CreateBlockStorageSnapshotRequest(); // CreateBlockStorageSnapshotRequest | 
        try {
            Operation result = apiInstance.createBlockStorageSnapshot(id, createBlockStorageSnapshotRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockStorageApi#createBlockStorageSnapshot");
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
| **createBlockStorageSnapshotRequest** | [**CreateBlockStorageSnapshotRequest**](CreateBlockStorageSnapshotRequest.md)|  | |

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

## createBlockStorageSnapshotWithHttpInfo

> ApiResponse<Operation> createBlockStorageSnapshot createBlockStorageSnapshotWithHttpInfo(id, createBlockStorageSnapshotRequest)

Create a block storage snapshot



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        BlockStorageApi apiInstance = new BlockStorageApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        CreateBlockStorageSnapshotRequest createBlockStorageSnapshotRequest = new CreateBlockStorageSnapshotRequest(); // CreateBlockStorageSnapshotRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.createBlockStorageSnapshotWithHttpInfo(id, createBlockStorageSnapshotRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockStorageApi#createBlockStorageSnapshot");
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
| **createBlockStorageSnapshotRequest** | [**CreateBlockStorageSnapshotRequest**](CreateBlockStorageSnapshotRequest.md)|  | |

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


## createBlockStorageVolume

> Operation createBlockStorageVolume(createBlockStorageVolumeRequest)

Create a block storage volume



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        BlockStorageApi apiInstance = new BlockStorageApi(defaultClient);
        CreateBlockStorageVolumeRequest createBlockStorageVolumeRequest = new CreateBlockStorageVolumeRequest(); // CreateBlockStorageVolumeRequest | 
        try {
            Operation result = apiInstance.createBlockStorageVolume(createBlockStorageVolumeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockStorageApi#createBlockStorageVolume");
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
| **createBlockStorageVolumeRequest** | [**CreateBlockStorageVolumeRequest**](CreateBlockStorageVolumeRequest.md)|  | |

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

## createBlockStorageVolumeWithHttpInfo

> ApiResponse<Operation> createBlockStorageVolume createBlockStorageVolumeWithHttpInfo(createBlockStorageVolumeRequest)

Create a block storage volume



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        BlockStorageApi apiInstance = new BlockStorageApi(defaultClient);
        CreateBlockStorageVolumeRequest createBlockStorageVolumeRequest = new CreateBlockStorageVolumeRequest(); // CreateBlockStorageVolumeRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.createBlockStorageVolumeWithHttpInfo(createBlockStorageVolumeRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockStorageApi#createBlockStorageVolume");
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
| **createBlockStorageVolumeRequest** | [**CreateBlockStorageVolumeRequest**](CreateBlockStorageVolumeRequest.md)|  | |

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


## deleteBlockStorageSnapshot

> Operation deleteBlockStorageSnapshot(id)

Delete a block storage snapshot, data will be unrecoverable



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        BlockStorageApi apiInstance = new BlockStorageApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            Operation result = apiInstance.deleteBlockStorageSnapshot(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockStorageApi#deleteBlockStorageSnapshot");
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

## deleteBlockStorageSnapshotWithHttpInfo

> ApiResponse<Operation> deleteBlockStorageSnapshot deleteBlockStorageSnapshotWithHttpInfo(id)

Delete a block storage snapshot, data will be unrecoverable



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        BlockStorageApi apiInstance = new BlockStorageApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Operation> response = apiInstance.deleteBlockStorageSnapshotWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockStorageApi#deleteBlockStorageSnapshot");
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


## deleteBlockStorageVolume

> Operation deleteBlockStorageVolume(id)

Delete a block storage volume, data will be unrecoverable



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        BlockStorageApi apiInstance = new BlockStorageApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            Operation result = apiInstance.deleteBlockStorageVolume(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockStorageApi#deleteBlockStorageVolume");
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

## deleteBlockStorageVolumeWithHttpInfo

> ApiResponse<Operation> deleteBlockStorageVolume deleteBlockStorageVolumeWithHttpInfo(id)

Delete a block storage volume, data will be unrecoverable



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        BlockStorageApi apiInstance = new BlockStorageApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Operation> response = apiInstance.deleteBlockStorageVolumeWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockStorageApi#deleteBlockStorageVolume");
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


## detachBlockStorageVolume

> Operation detachBlockStorageVolume(id)

Detach block storage volume



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        BlockStorageApi apiInstance = new BlockStorageApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            Operation result = apiInstance.detachBlockStorageVolume(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockStorageApi#detachBlockStorageVolume");
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

## detachBlockStorageVolumeWithHttpInfo

> ApiResponse<Operation> detachBlockStorageVolume detachBlockStorageVolumeWithHttpInfo(id)

Detach block storage volume



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        BlockStorageApi apiInstance = new BlockStorageApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Operation> response = apiInstance.detachBlockStorageVolumeWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockStorageApi#detachBlockStorageVolume");
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


## getBlockStorageSnapshot

> BlockStorageSnapshot getBlockStorageSnapshot(id)

Retrieve block storage snapshot details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        BlockStorageApi apiInstance = new BlockStorageApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            BlockStorageSnapshot result = apiInstance.getBlockStorageSnapshot(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockStorageApi#getBlockStorageSnapshot");
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

[**BlockStorageSnapshot**](BlockStorageSnapshot.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## getBlockStorageSnapshotWithHttpInfo

> ApiResponse<BlockStorageSnapshot> getBlockStorageSnapshot getBlockStorageSnapshotWithHttpInfo(id)

Retrieve block storage snapshot details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        BlockStorageApi apiInstance = new BlockStorageApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<BlockStorageSnapshot> response = apiInstance.getBlockStorageSnapshotWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockStorageApi#getBlockStorageSnapshot");
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

ApiResponse<[**BlockStorageSnapshot**](BlockStorageSnapshot.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getBlockStorageVolume

> BlockStorageVolume getBlockStorageVolume(id)

Retrieve block storage volume details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        BlockStorageApi apiInstance = new BlockStorageApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            BlockStorageVolume result = apiInstance.getBlockStorageVolume(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockStorageApi#getBlockStorageVolume");
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

[**BlockStorageVolume**](BlockStorageVolume.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## getBlockStorageVolumeWithHttpInfo

> ApiResponse<BlockStorageVolume> getBlockStorageVolume getBlockStorageVolumeWithHttpInfo(id)

Retrieve block storage volume details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        BlockStorageApi apiInstance = new BlockStorageApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<BlockStorageVolume> response = apiInstance.getBlockStorageVolumeWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockStorageApi#getBlockStorageVolume");
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

ApiResponse<[**BlockStorageVolume**](BlockStorageVolume.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listBlockStorageSnapshots

> ListBlockStorageSnapshots200Response listBlockStorageSnapshots()

List block storage snapshots



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        BlockStorageApi apiInstance = new BlockStorageApi(defaultClient);
        try {
            ListBlockStorageSnapshots200Response result = apiInstance.listBlockStorageSnapshots();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockStorageApi#listBlockStorageSnapshots");
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

[**ListBlockStorageSnapshots200Response**](ListBlockStorageSnapshots200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## listBlockStorageSnapshotsWithHttpInfo

> ApiResponse<ListBlockStorageSnapshots200Response> listBlockStorageSnapshots listBlockStorageSnapshotsWithHttpInfo()

List block storage snapshots



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        BlockStorageApi apiInstance = new BlockStorageApi(defaultClient);
        try {
            ApiResponse<ListBlockStorageSnapshots200Response> response = apiInstance.listBlockStorageSnapshotsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockStorageApi#listBlockStorageSnapshots");
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

ApiResponse<[**ListBlockStorageSnapshots200Response**](ListBlockStorageSnapshots200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listBlockStorageVolumes

> ListBlockStorageVolumes200Response listBlockStorageVolumes(instanceId)

List block storage volumes



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        BlockStorageApi apiInstance = new BlockStorageApi(defaultClient);
        UUID instanceId = UUID.randomUUID(); // UUID | 
        try {
            ListBlockStorageVolumes200Response result = apiInstance.listBlockStorageVolumes(instanceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockStorageApi#listBlockStorageVolumes");
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
| **instanceId** | **UUID**|  | [optional] |

### Return type

[**ListBlockStorageVolumes200Response**](ListBlockStorageVolumes200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## listBlockStorageVolumesWithHttpInfo

> ApiResponse<ListBlockStorageVolumes200Response> listBlockStorageVolumes listBlockStorageVolumesWithHttpInfo(instanceId)

List block storage volumes



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        BlockStorageApi apiInstance = new BlockStorageApi(defaultClient);
        UUID instanceId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<ListBlockStorageVolumes200Response> response = apiInstance.listBlockStorageVolumesWithHttpInfo(instanceId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockStorageApi#listBlockStorageVolumes");
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
| **instanceId** | **UUID**|  | [optional] |

### Return type

ApiResponse<[**ListBlockStorageVolumes200Response**](ListBlockStorageVolumes200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## resizeBlockStorageVolume

> BlockStorageVolume resizeBlockStorageVolume(id, resizeBlockStorageVolumeRequest)

Resize a block storage volume

This operation resizes a Block storage volume. Note: the volume can only grow, cannot be shrunk.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        BlockStorageApi apiInstance = new BlockStorageApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        ResizeBlockStorageVolumeRequest resizeBlockStorageVolumeRequest = new ResizeBlockStorageVolumeRequest(); // ResizeBlockStorageVolumeRequest | 
        try {
            BlockStorageVolume result = apiInstance.resizeBlockStorageVolume(id, resizeBlockStorageVolumeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockStorageApi#resizeBlockStorageVolume");
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
| **resizeBlockStorageVolumeRequest** | [**ResizeBlockStorageVolumeRequest**](ResizeBlockStorageVolumeRequest.md)|  | |

### Return type

[**BlockStorageVolume**](BlockStorageVolume.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## resizeBlockStorageVolumeWithHttpInfo

> ApiResponse<BlockStorageVolume> resizeBlockStorageVolume resizeBlockStorageVolumeWithHttpInfo(id, resizeBlockStorageVolumeRequest)

Resize a block storage volume

This operation resizes a Block storage volume. Note: the volume can only grow, cannot be shrunk.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        BlockStorageApi apiInstance = new BlockStorageApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        ResizeBlockStorageVolumeRequest resizeBlockStorageVolumeRequest = new ResizeBlockStorageVolumeRequest(); // ResizeBlockStorageVolumeRequest | 
        try {
            ApiResponse<BlockStorageVolume> response = apiInstance.resizeBlockStorageVolumeWithHttpInfo(id, resizeBlockStorageVolumeRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockStorageApi#resizeBlockStorageVolume");
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
| **resizeBlockStorageVolumeRequest** | [**ResizeBlockStorageVolumeRequest**](ResizeBlockStorageVolumeRequest.md)|  | |

### Return type

ApiResponse<[**BlockStorageVolume**](BlockStorageVolume.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateBlockStorageVolumeLabels

> Operation updateBlockStorageVolumeLabels(id, updateBlockStorageVolumeLabelsRequest)

Set block storage volume labels



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        BlockStorageApi apiInstance = new BlockStorageApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateBlockStorageVolumeLabelsRequest updateBlockStorageVolumeLabelsRequest = new UpdateBlockStorageVolumeLabelsRequest(); // UpdateBlockStorageVolumeLabelsRequest | 
        try {
            Operation result = apiInstance.updateBlockStorageVolumeLabels(id, updateBlockStorageVolumeLabelsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockStorageApi#updateBlockStorageVolumeLabels");
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
| **updateBlockStorageVolumeLabelsRequest** | [**UpdateBlockStorageVolumeLabelsRequest**](UpdateBlockStorageVolumeLabelsRequest.md)|  | |

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

## updateBlockStorageVolumeLabelsWithHttpInfo

> ApiResponse<Operation> updateBlockStorageVolumeLabels updateBlockStorageVolumeLabelsWithHttpInfo(id, updateBlockStorageVolumeLabelsRequest)

Set block storage volume labels



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BlockStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        BlockStorageApi apiInstance = new BlockStorageApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateBlockStorageVolumeLabelsRequest updateBlockStorageVolumeLabelsRequest = new UpdateBlockStorageVolumeLabelsRequest(); // UpdateBlockStorageVolumeLabelsRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.updateBlockStorageVolumeLabelsWithHttpInfo(id, updateBlockStorageVolumeLabelsRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockStorageApi#updateBlockStorageVolumeLabels");
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
| **updateBlockStorageVolumeLabelsRequest** | [**UpdateBlockStorageVolumeLabelsRequest**](UpdateBlockStorageVolumeLabelsRequest.md)|  | |

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

