# BlockStorageApi

All URIs are relative to *https://api-{zone}.exoscale.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachBlockStorageVolumeToInstance**](BlockStorageApi.md#attachBlockStorageVolumeToInstance) | **PUT** /block-storage/{id}:attach | Attach block storage volume to an instance
[**createBlockStorageSnapshot**](BlockStorageApi.md#createBlockStorageSnapshot) | **POST** /block-storage/{id}:create-snapshot | Create a block storage snapshot
[**createBlockStorageVolume**](BlockStorageApi.md#createBlockStorageVolume) | **POST** /block-storage | Create a block storage volume
[**deleteBlockStorageSnapshot**](BlockStorageApi.md#deleteBlockStorageSnapshot) | **DELETE** /block-storage-snapshot/{id} | Delete a block storage snapshot, data will be unrecoverable
[**deleteBlockStorageVolume**](BlockStorageApi.md#deleteBlockStorageVolume) | **DELETE** /block-storage/{id} | Delete a block storage volume, data will be unrecoverable
[**detachBlockStorageVolume**](BlockStorageApi.md#detachBlockStorageVolume) | **PUT** /block-storage/{id}:detach | Detach block storage volume
[**getBlockStorageSnapshot**](BlockStorageApi.md#getBlockStorageSnapshot) | **GET** /block-storage-snapshot/{id} | Retrieve block storage snapshot details
[**getBlockStorageVolume**](BlockStorageApi.md#getBlockStorageVolume) | **GET** /block-storage/{id} | Retrieve block storage volume details
[**listBlockStorageSnapshots**](BlockStorageApi.md#listBlockStorageSnapshots) | **GET** /block-storage-snapshot | List block storage snapshots
[**listBlockStorageVolumes**](BlockStorageApi.md#listBlockStorageVolumes) | **GET** /block-storage | List block storage volumes
[**resizeBlockStorageVolume**](BlockStorageApi.md#resizeBlockStorageVolume) | **PUT** /block-storage/{id}:resize-volume | Resize a block storage volume
[**updateBlockStorageVolumeLabels**](BlockStorageApi.md#updateBlockStorageVolumeLabels) | **PUT** /block-storage/{id} | Set block storage volume labels

<a name="attachBlockStorageVolumeToInstance"></a>
# **attachBlockStorageVolumeToInstance**
> Operation attachBlockStorageVolumeToInstance(body, id)

Attach block storage volume to an instance

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlockStorageApi;


BlockStorageApi apiInstance = new BlockStorageApi();
BlockstorageIdattachBody body = new BlockstorageIdattachBody(); // BlockstorageIdattachBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.attachBlockStorageVolumeToInstance(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockStorageApi#attachBlockStorageVolumeToInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BlockstorageIdattachBody**](BlockstorageIdattachBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBlockStorageSnapshot"></a>
# **createBlockStorageSnapshot**
> Operation createBlockStorageSnapshot(body, id)

Create a block storage snapshot

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlockStorageApi;


BlockStorageApi apiInstance = new BlockStorageApi();
BlockstorageIdcreatesnapshotBody body = new BlockstorageIdcreatesnapshotBody(); // BlockstorageIdcreatesnapshotBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.createBlockStorageSnapshot(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockStorageApi#createBlockStorageSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BlockstorageIdcreatesnapshotBody**](BlockstorageIdcreatesnapshotBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createBlockStorageVolume"></a>
# **createBlockStorageVolume**
> Operation createBlockStorageVolume(body)

Create a block storage volume

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlockStorageApi;


BlockStorageApi apiInstance = new BlockStorageApi();
BlockstorageBody body = new BlockstorageBody(); // BlockstorageBody | 
try {
    Operation result = apiInstance.createBlockStorageVolume(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockStorageApi#createBlockStorageVolume");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BlockstorageBody**](BlockstorageBody.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBlockStorageSnapshot"></a>
# **deleteBlockStorageSnapshot**
> Operation deleteBlockStorageSnapshot(id)

Delete a block storage snapshot, data will be unrecoverable

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlockStorageApi;


BlockStorageApi apiInstance = new BlockStorageApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.deleteBlockStorageSnapshot(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockStorageApi#deleteBlockStorageSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteBlockStorageVolume"></a>
# **deleteBlockStorageVolume**
> Operation deleteBlockStorageVolume(id)

Delete a block storage volume, data will be unrecoverable

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlockStorageApi;


BlockStorageApi apiInstance = new BlockStorageApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.deleteBlockStorageVolume(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockStorageApi#deleteBlockStorageVolume");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="detachBlockStorageVolume"></a>
# **detachBlockStorageVolume**
> Operation detachBlockStorageVolume(id)

Detach block storage volume

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlockStorageApi;


BlockStorageApi apiInstance = new BlockStorageApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.detachBlockStorageVolume(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockStorageApi#detachBlockStorageVolume");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBlockStorageSnapshot"></a>
# **getBlockStorageSnapshot**
> BlockStorageSnapshot getBlockStorageSnapshot(id)

Retrieve block storage snapshot details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlockStorageApi;


BlockStorageApi apiInstance = new BlockStorageApi();
UUID id = new UUID(); // UUID | 
try {
    BlockStorageSnapshot result = apiInstance.getBlockStorageSnapshot(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockStorageApi#getBlockStorageSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**BlockStorageSnapshot**](BlockStorageSnapshot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBlockStorageVolume"></a>
# **getBlockStorageVolume**
> BlockStorageVolume getBlockStorageVolume(id)

Retrieve block storage volume details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlockStorageApi;


BlockStorageApi apiInstance = new BlockStorageApi();
UUID id = new UUID(); // UUID | 
try {
    BlockStorageVolume result = apiInstance.getBlockStorageVolume(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockStorageApi#getBlockStorageVolume");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**BlockStorageVolume**](BlockStorageVolume.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBlockStorageSnapshots"></a>
# **listBlockStorageSnapshots**
> InlineResponse20019 listBlockStorageSnapshots()

List block storage snapshots

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlockStorageApi;


BlockStorageApi apiInstance = new BlockStorageApi();
try {
    InlineResponse20019 result = apiInstance.listBlockStorageSnapshots();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockStorageApi#listBlockStorageSnapshots");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBlockStorageVolumes"></a>
# **listBlockStorageVolumes**
> InlineResponse20040 listBlockStorageVolumes(instanceId)

List block storage volumes

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlockStorageApi;


BlockStorageApi apiInstance = new BlockStorageApi();
UUID instanceId = new UUID(); // UUID | 
try {
    InlineResponse20040 result = apiInstance.listBlockStorageVolumes(instanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockStorageApi#listBlockStorageVolumes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **instanceId** | [**UUID**](.md)|  | [optional]

### Return type

[**InlineResponse20040**](InlineResponse20040.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resizeBlockStorageVolume"></a>
# **resizeBlockStorageVolume**
> BlockStorageVolume resizeBlockStorageVolume(body, id)

Resize a block storage volume

This operation resizes a Block storage volume. Note: the volume can only grow, cannot be shrunk.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlockStorageApi;


BlockStorageApi apiInstance = new BlockStorageApi();
BlockstorageIdresizevolumeBody body = new BlockstorageIdresizevolumeBody(); // BlockstorageIdresizevolumeBody | 
UUID id = new UUID(); // UUID | 
try {
    BlockStorageVolume result = apiInstance.resizeBlockStorageVolume(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockStorageApi#resizeBlockStorageVolume");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BlockstorageIdresizevolumeBody**](BlockstorageIdresizevolumeBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**BlockStorageVolume**](BlockStorageVolume.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBlockStorageVolumeLabels"></a>
# **updateBlockStorageVolumeLabels**
> Operation updateBlockStorageVolumeLabels(body, id)

Set block storage volume labels

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BlockStorageApi;


BlockStorageApi apiInstance = new BlockStorageApi();
BlockstorageIdBody body = new BlockstorageIdBody(); // BlockstorageIdBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.updateBlockStorageVolumeLabels(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockStorageApi#updateBlockStorageVolumeLabels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BlockstorageIdBody**](BlockstorageIdBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

