# SnapshotApi

All URIs are relative to *https://api-{zone}.exoscale.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSnapshot**](SnapshotApi.md#createSnapshot) | **POST** /instance/{id}:create-snapshot | Create a Snapshot of a Compute instance
[**deleteSnapshot**](SnapshotApi.md#deleteSnapshot) | **DELETE** /snapshot/{id} | Delete a Snapshot
[**exportSnapshot**](SnapshotApi.md#exportSnapshot) | **POST** /snapshot/{id}:export | Export a Snapshot
[**getSnapshot**](SnapshotApi.md#getSnapshot) | **GET** /snapshot/{id} | Retrieve Snapshot details
[**listSnapshots**](SnapshotApi.md#listSnapshots) | **GET** /snapshot | List Snapshots
[**promoteSnapshotToTemplate**](SnapshotApi.md#promoteSnapshotToTemplate) | **POST** /snapshot/{id}:promote | Promote a Snapshot to a Template

<a name="createSnapshot"></a>
# **createSnapshot**
> Operation createSnapshot(id)

Create a Snapshot of a Compute instance

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SnapshotApi;


SnapshotApi apiInstance = new SnapshotApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.createSnapshot(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#createSnapshot");
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

<a name="deleteSnapshot"></a>
# **deleteSnapshot**
> Operation deleteSnapshot(id)

Delete a Snapshot

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SnapshotApi;


SnapshotApi apiInstance = new SnapshotApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.deleteSnapshot(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#deleteSnapshot");
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

<a name="exportSnapshot"></a>
# **exportSnapshot**
> Operation exportSnapshot(id)

Export a Snapshot

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SnapshotApi;


SnapshotApi apiInstance = new SnapshotApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.exportSnapshot(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#exportSnapshot");
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

<a name="getSnapshot"></a>
# **getSnapshot**
> Snapshot getSnapshot(id)

Retrieve Snapshot details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SnapshotApi;


SnapshotApi apiInstance = new SnapshotApi();
UUID id = new UUID(); // UUID | 
try {
    Snapshot result = apiInstance.getSnapshot(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#getSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**Snapshot**](Snapshot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSnapshots"></a>
# **listSnapshots**
> InlineResponse20024 listSnapshots()

List Snapshots

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SnapshotApi;


SnapshotApi apiInstance = new SnapshotApi();
try {
    InlineResponse20024 result = apiInstance.listSnapshots();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#listSnapshots");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20024**](InlineResponse20024.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="promoteSnapshotToTemplate"></a>
# **promoteSnapshotToTemplate**
> Operation promoteSnapshotToTemplate(body, id)

Promote a Snapshot to a Template

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SnapshotApi;


SnapshotApi apiInstance = new SnapshotApi();
SnapshotIdpromoteBody body = new SnapshotIdpromoteBody(); // SnapshotIdpromoteBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.promoteSnapshotToTemplate(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#promoteSnapshotToTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SnapshotIdpromoteBody**](SnapshotIdpromoteBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

