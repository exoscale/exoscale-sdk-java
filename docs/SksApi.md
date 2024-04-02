# SksApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSksCluster**](SksApi.md#createSksCluster) | **POST** /sks-cluster | Create an SKS cluster |
| [**createSksClusterWithHttpInfo**](SksApi.md#createSksClusterWithHttpInfo) | **POST** /sks-cluster | Create an SKS cluster |
| [**createSksNodepool**](SksApi.md#createSksNodepool) | **POST** /sks-cluster/{id}/nodepool | Create a new SKS Nodepool |
| [**createSksNodepoolWithHttpInfo**](SksApi.md#createSksNodepoolWithHttpInfo) | **POST** /sks-cluster/{id}/nodepool | Create a new SKS Nodepool |
| [**deleteSksCluster**](SksApi.md#deleteSksCluster) | **DELETE** /sks-cluster/{id} | Delete an SKS cluster |
| [**deleteSksClusterWithHttpInfo**](SksApi.md#deleteSksClusterWithHttpInfo) | **DELETE** /sks-cluster/{id} | Delete an SKS cluster |
| [**deleteSksNodepool**](SksApi.md#deleteSksNodepool) | **DELETE** /sks-cluster/{id}/nodepool/{sks-nodepool-id} | Delete an SKS Nodepool |
| [**deleteSksNodepoolWithHttpInfo**](SksApi.md#deleteSksNodepoolWithHttpInfo) | **DELETE** /sks-cluster/{id}/nodepool/{sks-nodepool-id} | Delete an SKS Nodepool |
| [**evictSksNodepoolMembers**](SksApi.md#evictSksNodepoolMembers) | **PUT** /sks-cluster/{id}/nodepool/{sks-nodepool-id}:evict | Evict Nodepool members |
| [**evictSksNodepoolMembersWithHttpInfo**](SksApi.md#evictSksNodepoolMembersWithHttpInfo) | **PUT** /sks-cluster/{id}/nodepool/{sks-nodepool-id}:evict | Evict Nodepool members |
| [**generateSksClusterKubeconfig**](SksApi.md#generateSksClusterKubeconfig) | **POST** /sks-cluster-kubeconfig/{id} | Generate a new Kubeconfig file for a SKS cluster |
| [**generateSksClusterKubeconfigWithHttpInfo**](SksApi.md#generateSksClusterKubeconfigWithHttpInfo) | **POST** /sks-cluster-kubeconfig/{id} | Generate a new Kubeconfig file for a SKS cluster |
| [**getSksCluster**](SksApi.md#getSksCluster) | **GET** /sks-cluster/{id} | Retrieve SKS cluster details |
| [**getSksClusterWithHttpInfo**](SksApi.md#getSksClusterWithHttpInfo) | **GET** /sks-cluster/{id} | Retrieve SKS cluster details |
| [**getSksClusterAuthorityCert**](SksApi.md#getSksClusterAuthorityCert) | **GET** /sks-cluster/{id}/authority/{authority}/cert | Get the certificate for a SKS cluster authority |
| [**getSksClusterAuthorityCertWithHttpInfo**](SksApi.md#getSksClusterAuthorityCertWithHttpInfo) | **GET** /sks-cluster/{id}/authority/{authority}/cert | Get the certificate for a SKS cluster authority |
| [**getSksClusterInspection**](SksApi.md#getSksClusterInspection) | **GET** /sks-cluster/{id}/inspection | Get the latest inspection result |
| [**getSksClusterInspectionWithHttpInfo**](SksApi.md#getSksClusterInspectionWithHttpInfo) | **GET** /sks-cluster/{id}/inspection | Get the latest inspection result |
| [**getSksNodepool**](SksApi.md#getSksNodepool) | **GET** /sks-cluster/{id}/nodepool/{sks-nodepool-id} | Retrieve SKS Nodepool details |
| [**getSksNodepoolWithHttpInfo**](SksApi.md#getSksNodepoolWithHttpInfo) | **GET** /sks-cluster/{id}/nodepool/{sks-nodepool-id} | Retrieve SKS Nodepool details |
| [**listSksClusterDeprecatedResources**](SksApi.md#listSksClusterDeprecatedResources) | **GET** /sks-cluster-deprecated-resources/{id} | Resources that are scheduled to be removed in future kubernetes releases |
| [**listSksClusterDeprecatedResourcesWithHttpInfo**](SksApi.md#listSksClusterDeprecatedResourcesWithHttpInfo) | **GET** /sks-cluster-deprecated-resources/{id} | Resources that are scheduled to be removed in future kubernetes releases |
| [**listSksClusterVersions**](SksApi.md#listSksClusterVersions) | **GET** /sks-cluster-version | List available versions for SKS clusters |
| [**listSksClusterVersionsWithHttpInfo**](SksApi.md#listSksClusterVersionsWithHttpInfo) | **GET** /sks-cluster-version | List available versions for SKS clusters |
| [**listSksClusters**](SksApi.md#listSksClusters) | **GET** /sks-cluster | List SKS clusters |
| [**listSksClustersWithHttpInfo**](SksApi.md#listSksClustersWithHttpInfo) | **GET** /sks-cluster | List SKS clusters |
| [**resetSksClusterField**](SksApi.md#resetSksClusterField) | **DELETE** /sks-cluster/{id}/{field} | Reset an SKS cluster field to its default value |
| [**resetSksClusterFieldWithHttpInfo**](SksApi.md#resetSksClusterFieldWithHttpInfo) | **DELETE** /sks-cluster/{id}/{field} | Reset an SKS cluster field to its default value |
| [**resetSksNodepoolField**](SksApi.md#resetSksNodepoolField) | **DELETE** /sks-cluster/{id}/nodepool/{sks-nodepool-id}/{field} | Reset an SKS Nodepool field to its default value |
| [**resetSksNodepoolFieldWithHttpInfo**](SksApi.md#resetSksNodepoolFieldWithHttpInfo) | **DELETE** /sks-cluster/{id}/nodepool/{sks-nodepool-id}/{field} | Reset an SKS Nodepool field to its default value |
| [**rotateSksCcmCredentials**](SksApi.md#rotateSksCcmCredentials) | **PUT** /sks-cluster/{id}/rotate-ccm-credentials | Rotate Exoscale CCM credentials |
| [**rotateSksCcmCredentialsWithHttpInfo**](SksApi.md#rotateSksCcmCredentialsWithHttpInfo) | **PUT** /sks-cluster/{id}/rotate-ccm-credentials | Rotate Exoscale CCM credentials |
| [**rotateSksOperatorsCa**](SksApi.md#rotateSksOperatorsCa) | **PUT** /sks-cluster/{id}/rotate-operators-ca | Rotate operators certificate authority |
| [**rotateSksOperatorsCaWithHttpInfo**](SksApi.md#rotateSksOperatorsCaWithHttpInfo) | **PUT** /sks-cluster/{id}/rotate-operators-ca | Rotate operators certificate authority |
| [**scaleSksNodepool**](SksApi.md#scaleSksNodepool) | **PUT** /sks-cluster/{id}/nodepool/{sks-nodepool-id}:scale | Scale a SKS Nodepool |
| [**scaleSksNodepoolWithHttpInfo**](SksApi.md#scaleSksNodepoolWithHttpInfo) | **PUT** /sks-cluster/{id}/nodepool/{sks-nodepool-id}:scale | Scale a SKS Nodepool |
| [**updateSksCluster**](SksApi.md#updateSksCluster) | **PUT** /sks-cluster/{id} | Update an SKS cluster |
| [**updateSksClusterWithHttpInfo**](SksApi.md#updateSksClusterWithHttpInfo) | **PUT** /sks-cluster/{id} | Update an SKS cluster |
| [**updateSksNodepool**](SksApi.md#updateSksNodepool) | **PUT** /sks-cluster/{id}/nodepool/{sks-nodepool-id} | Update an SKS Nodepool |
| [**updateSksNodepoolWithHttpInfo**](SksApi.md#updateSksNodepoolWithHttpInfo) | **PUT** /sks-cluster/{id}/nodepool/{sks-nodepool-id} | Update an SKS Nodepool |
| [**upgradeSksCluster**](SksApi.md#upgradeSksCluster) | **PUT** /sks-cluster/{id}/upgrade | Upgrade an SKS cluster |
| [**upgradeSksClusterWithHttpInfo**](SksApi.md#upgradeSksClusterWithHttpInfo) | **PUT** /sks-cluster/{id}/upgrade | Upgrade an SKS cluster |
| [**upgradeSksClusterServiceLevel**](SksApi.md#upgradeSksClusterServiceLevel) | **PUT** /sks-cluster/{id}/upgrade-service-level | Upgrade a SKS cluster to pro |
| [**upgradeSksClusterServiceLevelWithHttpInfo**](SksApi.md#upgradeSksClusterServiceLevelWithHttpInfo) | **PUT** /sks-cluster/{id}/upgrade-service-level | Upgrade a SKS cluster to pro |



## createSksCluster

> Operation createSksCluster(createSksClusterRequest)

Create an SKS cluster



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        CreateSksClusterRequest createSksClusterRequest = new CreateSksClusterRequest(); // CreateSksClusterRequest | 
        try {
            Operation result = apiInstance.createSksCluster(createSksClusterRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#createSksCluster");
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
| **createSksClusterRequest** | [**CreateSksClusterRequest**](CreateSksClusterRequest.md)|  | |

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

## createSksClusterWithHttpInfo

> ApiResponse<Operation> createSksCluster createSksClusterWithHttpInfo(createSksClusterRequest)

Create an SKS cluster



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        CreateSksClusterRequest createSksClusterRequest = new CreateSksClusterRequest(); // CreateSksClusterRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.createSksClusterWithHttpInfo(createSksClusterRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#createSksCluster");
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
| **createSksClusterRequest** | [**CreateSksClusterRequest**](CreateSksClusterRequest.md)|  | |

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


## createSksNodepool

> Operation createSksNodepool(id, createSksNodepoolRequest)

Create a new SKS Nodepool



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        CreateSksNodepoolRequest createSksNodepoolRequest = new CreateSksNodepoolRequest(); // CreateSksNodepoolRequest | 
        try {
            Operation result = apiInstance.createSksNodepool(id, createSksNodepoolRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#createSksNodepool");
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
| **createSksNodepoolRequest** | [**CreateSksNodepoolRequest**](CreateSksNodepoolRequest.md)|  | |

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

## createSksNodepoolWithHttpInfo

> ApiResponse<Operation> createSksNodepool createSksNodepoolWithHttpInfo(id, createSksNodepoolRequest)

Create a new SKS Nodepool



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        CreateSksNodepoolRequest createSksNodepoolRequest = new CreateSksNodepoolRequest(); // CreateSksNodepoolRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.createSksNodepoolWithHttpInfo(id, createSksNodepoolRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#createSksNodepool");
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
| **createSksNodepoolRequest** | [**CreateSksNodepoolRequest**](CreateSksNodepoolRequest.md)|  | |

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


## deleteSksCluster

> Operation deleteSksCluster(id)

Delete an SKS cluster



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            Operation result = apiInstance.deleteSksCluster(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#deleteSksCluster");
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

## deleteSksClusterWithHttpInfo

> ApiResponse<Operation> deleteSksCluster deleteSksClusterWithHttpInfo(id)

Delete an SKS cluster



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Operation> response = apiInstance.deleteSksClusterWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#deleteSksCluster");
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


## deleteSksNodepool

> Operation deleteSksNodepool(id, sksNodepoolId)

Delete an SKS Nodepool



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UUID sksNodepoolId = UUID.randomUUID(); // UUID | 
        try {
            Operation result = apiInstance.deleteSksNodepool(id, sksNodepoolId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#deleteSksNodepool");
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
| **sksNodepoolId** | **UUID**|  | |

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

## deleteSksNodepoolWithHttpInfo

> ApiResponse<Operation> deleteSksNodepool deleteSksNodepoolWithHttpInfo(id, sksNodepoolId)

Delete an SKS Nodepool



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UUID sksNodepoolId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Operation> response = apiInstance.deleteSksNodepoolWithHttpInfo(id, sksNodepoolId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#deleteSksNodepool");
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
| **sksNodepoolId** | **UUID**|  | |

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


## evictSksNodepoolMembers

> Operation evictSksNodepoolMembers(id, sksNodepoolId, evictSksNodepoolMembersRequest)

Evict Nodepool members

This operation evicts the specified Compute instances member from the Nodepool, shrinking it to &#x60;&amp;lt;current nodepool size&amp;gt; - &amp;lt;# evicted members&amp;gt;&#x60;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UUID sksNodepoolId = UUID.randomUUID(); // UUID | 
        EvictSksNodepoolMembersRequest evictSksNodepoolMembersRequest = new EvictSksNodepoolMembersRequest(); // EvictSksNodepoolMembersRequest | 
        try {
            Operation result = apiInstance.evictSksNodepoolMembers(id, sksNodepoolId, evictSksNodepoolMembersRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#evictSksNodepoolMembers");
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
| **sksNodepoolId** | **UUID**|  | |
| **evictSksNodepoolMembersRequest** | [**EvictSksNodepoolMembersRequest**](EvictSksNodepoolMembersRequest.md)|  | |

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

## evictSksNodepoolMembersWithHttpInfo

> ApiResponse<Operation> evictSksNodepoolMembers evictSksNodepoolMembersWithHttpInfo(id, sksNodepoolId, evictSksNodepoolMembersRequest)

Evict Nodepool members

This operation evicts the specified Compute instances member from the Nodepool, shrinking it to &#x60;&amp;lt;current nodepool size&amp;gt; - &amp;lt;# evicted members&amp;gt;&#x60;.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UUID sksNodepoolId = UUID.randomUUID(); // UUID | 
        EvictSksNodepoolMembersRequest evictSksNodepoolMembersRequest = new EvictSksNodepoolMembersRequest(); // EvictSksNodepoolMembersRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.evictSksNodepoolMembersWithHttpInfo(id, sksNodepoolId, evictSksNodepoolMembersRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#evictSksNodepoolMembers");
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
| **sksNodepoolId** | **UUID**|  | |
| **evictSksNodepoolMembersRequest** | [**EvictSksNodepoolMembersRequest**](EvictSksNodepoolMembersRequest.md)|  | |

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


## generateSksClusterKubeconfig

> GenerateSksClusterKubeconfig200Response generateSksClusterKubeconfig(id, sksKubeconfigRequest)

Generate a new Kubeconfig file for a SKS cluster

This operation returns a Kubeconfig file encoded in base64.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        SksKubeconfigRequest sksKubeconfigRequest = new SksKubeconfigRequest(); // SksKubeconfigRequest | 
        try {
            GenerateSksClusterKubeconfig200Response result = apiInstance.generateSksClusterKubeconfig(id, sksKubeconfigRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#generateSksClusterKubeconfig");
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
| **sksKubeconfigRequest** | [**SksKubeconfigRequest**](SksKubeconfigRequest.md)|  | |

### Return type

[**GenerateSksClusterKubeconfig200Response**](GenerateSksClusterKubeconfig200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## generateSksClusterKubeconfigWithHttpInfo

> ApiResponse<GenerateSksClusterKubeconfig200Response> generateSksClusterKubeconfig generateSksClusterKubeconfigWithHttpInfo(id, sksKubeconfigRequest)

Generate a new Kubeconfig file for a SKS cluster

This operation returns a Kubeconfig file encoded in base64.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        SksKubeconfigRequest sksKubeconfigRequest = new SksKubeconfigRequest(); // SksKubeconfigRequest | 
        try {
            ApiResponse<GenerateSksClusterKubeconfig200Response> response = apiInstance.generateSksClusterKubeconfigWithHttpInfo(id, sksKubeconfigRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#generateSksClusterKubeconfig");
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
| **sksKubeconfigRequest** | [**SksKubeconfigRequest**](SksKubeconfigRequest.md)|  | |

### Return type

ApiResponse<[**GenerateSksClusterKubeconfig200Response**](GenerateSksClusterKubeconfig200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getSksCluster

> SksCluster getSksCluster(id)

Retrieve SKS cluster details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            SksCluster result = apiInstance.getSksCluster(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#getSksCluster");
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

[**SksCluster**](SksCluster.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## getSksClusterWithHttpInfo

> ApiResponse<SksCluster> getSksCluster getSksClusterWithHttpInfo(id)

Retrieve SKS cluster details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<SksCluster> response = apiInstance.getSksClusterWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#getSksCluster");
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

ApiResponse<[**SksCluster**](SksCluster.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getSksClusterAuthorityCert

> GetSksClusterAuthorityCert200Response getSksClusterAuthorityCert(id, authority)

Get the certificate for a SKS cluster authority

This operation returns the certificate for the given SKS cluster authority encoded in base64.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        String authority = "control-plane"; // String | 
        try {
            GetSksClusterAuthorityCert200Response result = apiInstance.getSksClusterAuthorityCert(id, authority);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#getSksClusterAuthorityCert");
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
| **authority** | **String**|  | [enum: control-plane, aggregation, kubelet] |

### Return type

[**GetSksClusterAuthorityCert200Response**](GetSksClusterAuthorityCert200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## getSksClusterAuthorityCertWithHttpInfo

> ApiResponse<GetSksClusterAuthorityCert200Response> getSksClusterAuthorityCert getSksClusterAuthorityCertWithHttpInfo(id, authority)

Get the certificate for a SKS cluster authority

This operation returns the certificate for the given SKS cluster authority encoded in base64.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        String authority = "control-plane"; // String | 
        try {
            ApiResponse<GetSksClusterAuthorityCert200Response> response = apiInstance.getSksClusterAuthorityCertWithHttpInfo(id, authority);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#getSksClusterAuthorityCert");
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
| **authority** | **String**|  | [enum: control-plane, aggregation, kubelet] |

### Return type

ApiResponse<[**GetSksClusterAuthorityCert200Response**](GetSksClusterAuthorityCert200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getSksClusterInspection

> Map<String, Object> getSksClusterInspection(id)

Get the latest inspection result

Helps troubleshoot common problems when deploying a kubernetes cluster. Inspections run every couple of minutes.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            Map<String, Object> result = apiInstance.getSksClusterInspection(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#getSksClusterInspection");
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

**Map&lt;String, Object&gt;**


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## getSksClusterInspectionWithHttpInfo

> ApiResponse<Map<String, Object>> getSksClusterInspection getSksClusterInspectionWithHttpInfo(id)

Get the latest inspection result

Helps troubleshoot common problems when deploying a kubernetes cluster. Inspections run every couple of minutes.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Map<String, Object>> response = apiInstance.getSksClusterInspectionWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#getSksClusterInspection");
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

ApiResponse<**Map&lt;String, Object&gt;**>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getSksNodepool

> SksNodepool getSksNodepool(id, sksNodepoolId)

Retrieve SKS Nodepool details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UUID sksNodepoolId = UUID.randomUUID(); // UUID | 
        try {
            SksNodepool result = apiInstance.getSksNodepool(id, sksNodepoolId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#getSksNodepool");
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
| **sksNodepoolId** | **UUID**|  | |

### Return type

[**SksNodepool**](SksNodepool.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## getSksNodepoolWithHttpInfo

> ApiResponse<SksNodepool> getSksNodepool getSksNodepoolWithHttpInfo(id, sksNodepoolId)

Retrieve SKS Nodepool details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UUID sksNodepoolId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<SksNodepool> response = apiInstance.getSksNodepoolWithHttpInfo(id, sksNodepoolId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#getSksNodepool");
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
| **sksNodepoolId** | **UUID**|  | |

### Return type

ApiResponse<[**SksNodepool**](SksNodepool.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listSksClusterDeprecatedResources

> List<Map<String, String>> listSksClusterDeprecatedResources(id)

Resources that are scheduled to be removed in future kubernetes releases

This operation returns the deprecated resources for a given cluster

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            List<Map<String, String>> result = apiInstance.listSksClusterDeprecatedResources(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#listSksClusterDeprecatedResources");
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

[**List&lt;Map&lt;String, String&gt;&gt;**](Map.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## listSksClusterDeprecatedResourcesWithHttpInfo

> ApiResponse<List<Map<String, String>>> listSksClusterDeprecatedResources listSksClusterDeprecatedResourcesWithHttpInfo(id)

Resources that are scheduled to be removed in future kubernetes releases

This operation returns the deprecated resources for a given cluster

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<List<Map<String, String>>> response = apiInstance.listSksClusterDeprecatedResourcesWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#listSksClusterDeprecatedResources");
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

ApiResponse<[**List&lt;Map&lt;String, String&gt;&gt;**](Map.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listSksClusterVersions

> ListSksClusterVersions200Response listSksClusterVersions(includeDeprecated)

List available versions for SKS clusters



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        String includeDeprecated = "includeDeprecated_example"; // String | 
        try {
            ListSksClusterVersions200Response result = apiInstance.listSksClusterVersions(includeDeprecated);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#listSksClusterVersions");
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
| **includeDeprecated** | **String**|  | [optional] |

### Return type

[**ListSksClusterVersions200Response**](ListSksClusterVersions200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## listSksClusterVersionsWithHttpInfo

> ApiResponse<ListSksClusterVersions200Response> listSksClusterVersions listSksClusterVersionsWithHttpInfo(includeDeprecated)

List available versions for SKS clusters



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        String includeDeprecated = "includeDeprecated_example"; // String | 
        try {
            ApiResponse<ListSksClusterVersions200Response> response = apiInstance.listSksClusterVersionsWithHttpInfo(includeDeprecated);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#listSksClusterVersions");
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
| **includeDeprecated** | **String**|  | [optional] |

### Return type

ApiResponse<[**ListSksClusterVersions200Response**](ListSksClusterVersions200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listSksClusters

> ListSksClusters200Response listSksClusters()

List SKS clusters



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        try {
            ListSksClusters200Response result = apiInstance.listSksClusters();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#listSksClusters");
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

[**ListSksClusters200Response**](ListSksClusters200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## listSksClustersWithHttpInfo

> ApiResponse<ListSksClusters200Response> listSksClusters listSksClustersWithHttpInfo()

List SKS clusters



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        try {
            ApiResponse<ListSksClusters200Response> response = apiInstance.listSksClustersWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#listSksClusters");
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

ApiResponse<[**ListSksClusters200Response**](ListSksClusters200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## resetSksClusterField

> Operation resetSksClusterField(id, field)

Reset an SKS cluster field to its default value



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        String field = "description"; // String | 
        try {
            Operation result = apiInstance.resetSksClusterField(id, field);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#resetSksClusterField");
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

## resetSksClusterFieldWithHttpInfo

> ApiResponse<Operation> resetSksClusterField resetSksClusterFieldWithHttpInfo(id, field)

Reset an SKS cluster field to its default value



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        String field = "description"; // String | 
        try {
            ApiResponse<Operation> response = apiInstance.resetSksClusterFieldWithHttpInfo(id, field);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#resetSksClusterField");
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


## resetSksNodepoolField

> Operation resetSksNodepoolField(id, sksNodepoolId, field)

Reset an SKS Nodepool field to its default value



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UUID sksNodepoolId = UUID.randomUUID(); // UUID | 
        String field = "anti-affinity-groups"; // String | 
        try {
            Operation result = apiInstance.resetSksNodepoolField(id, sksNodepoolId, field);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#resetSksNodepoolField");
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
| **sksNodepoolId** | **UUID**|  | |
| **field** | **String**|  | [enum: anti-affinity-groups, description, labels, security-groups, private-networks, deploy-target] |

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

## resetSksNodepoolFieldWithHttpInfo

> ApiResponse<Operation> resetSksNodepoolField resetSksNodepoolFieldWithHttpInfo(id, sksNodepoolId, field)

Reset an SKS Nodepool field to its default value



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UUID sksNodepoolId = UUID.randomUUID(); // UUID | 
        String field = "anti-affinity-groups"; // String | 
        try {
            ApiResponse<Operation> response = apiInstance.resetSksNodepoolFieldWithHttpInfo(id, sksNodepoolId, field);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#resetSksNodepoolField");
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
| **sksNodepoolId** | **UUID**|  | |
| **field** | **String**|  | [enum: anti-affinity-groups, description, labels, security-groups, private-networks, deploy-target] |

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


## rotateSksCcmCredentials

> Operation rotateSksCcmCredentials(id)

Rotate Exoscale CCM credentials



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            Operation result = apiInstance.rotateSksCcmCredentials(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#rotateSksCcmCredentials");
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

## rotateSksCcmCredentialsWithHttpInfo

> ApiResponse<Operation> rotateSksCcmCredentials rotateSksCcmCredentialsWithHttpInfo(id)

Rotate Exoscale CCM credentials



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Operation> response = apiInstance.rotateSksCcmCredentialsWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#rotateSksCcmCredentials");
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


## rotateSksOperatorsCa

> Operation rotateSksOperatorsCa(id)

Rotate operators certificate authority



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            Operation result = apiInstance.rotateSksOperatorsCa(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#rotateSksOperatorsCa");
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

## rotateSksOperatorsCaWithHttpInfo

> ApiResponse<Operation> rotateSksOperatorsCa rotateSksOperatorsCaWithHttpInfo(id)

Rotate operators certificate authority



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Operation> response = apiInstance.rotateSksOperatorsCaWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#rotateSksOperatorsCa");
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


## scaleSksNodepool

> Operation scaleSksNodepool(id, sksNodepoolId, scaleSksNodepoolRequest)

Scale a SKS Nodepool



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UUID sksNodepoolId = UUID.randomUUID(); // UUID | 
        ScaleSksNodepoolRequest scaleSksNodepoolRequest = new ScaleSksNodepoolRequest(); // ScaleSksNodepoolRequest | 
        try {
            Operation result = apiInstance.scaleSksNodepool(id, sksNodepoolId, scaleSksNodepoolRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#scaleSksNodepool");
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
| **sksNodepoolId** | **UUID**|  | |
| **scaleSksNodepoolRequest** | [**ScaleSksNodepoolRequest**](ScaleSksNodepoolRequest.md)|  | |

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

## scaleSksNodepoolWithHttpInfo

> ApiResponse<Operation> scaleSksNodepool scaleSksNodepoolWithHttpInfo(id, sksNodepoolId, scaleSksNodepoolRequest)

Scale a SKS Nodepool



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UUID sksNodepoolId = UUID.randomUUID(); // UUID | 
        ScaleSksNodepoolRequest scaleSksNodepoolRequest = new ScaleSksNodepoolRequest(); // ScaleSksNodepoolRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.scaleSksNodepoolWithHttpInfo(id, sksNodepoolId, scaleSksNodepoolRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#scaleSksNodepool");
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
| **sksNodepoolId** | **UUID**|  | |
| **scaleSksNodepoolRequest** | [**ScaleSksNodepoolRequest**](ScaleSksNodepoolRequest.md)|  | |

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


## updateSksCluster

> Operation updateSksCluster(id, updateSksClusterRequest)

Update an SKS cluster



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateSksClusterRequest updateSksClusterRequest = new UpdateSksClusterRequest(); // UpdateSksClusterRequest | 
        try {
            Operation result = apiInstance.updateSksCluster(id, updateSksClusterRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#updateSksCluster");
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
| **updateSksClusterRequest** | [**UpdateSksClusterRequest**](UpdateSksClusterRequest.md)|  | |

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

## updateSksClusterWithHttpInfo

> ApiResponse<Operation> updateSksCluster updateSksClusterWithHttpInfo(id, updateSksClusterRequest)

Update an SKS cluster



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateSksClusterRequest updateSksClusterRequest = new UpdateSksClusterRequest(); // UpdateSksClusterRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.updateSksClusterWithHttpInfo(id, updateSksClusterRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#updateSksCluster");
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
| **updateSksClusterRequest** | [**UpdateSksClusterRequest**](UpdateSksClusterRequest.md)|  | |

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


## updateSksNodepool

> Operation updateSksNodepool(id, sksNodepoolId, updateSksNodepoolRequest)

Update an SKS Nodepool



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UUID sksNodepoolId = UUID.randomUUID(); // UUID | 
        UpdateSksNodepoolRequest updateSksNodepoolRequest = new UpdateSksNodepoolRequest(); // UpdateSksNodepoolRequest | 
        try {
            Operation result = apiInstance.updateSksNodepool(id, sksNodepoolId, updateSksNodepoolRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#updateSksNodepool");
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
| **sksNodepoolId** | **UUID**|  | |
| **updateSksNodepoolRequest** | [**UpdateSksNodepoolRequest**](UpdateSksNodepoolRequest.md)|  | |

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

## updateSksNodepoolWithHttpInfo

> ApiResponse<Operation> updateSksNodepool updateSksNodepoolWithHttpInfo(id, sksNodepoolId, updateSksNodepoolRequest)

Update an SKS Nodepool



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UUID sksNodepoolId = UUID.randomUUID(); // UUID | 
        UpdateSksNodepoolRequest updateSksNodepoolRequest = new UpdateSksNodepoolRequest(); // UpdateSksNodepoolRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.updateSksNodepoolWithHttpInfo(id, sksNodepoolId, updateSksNodepoolRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#updateSksNodepool");
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
| **sksNodepoolId** | **UUID**|  | |
| **updateSksNodepoolRequest** | [**UpdateSksNodepoolRequest**](UpdateSksNodepoolRequest.md)|  | |

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


## upgradeSksCluster

> Operation upgradeSksCluster(id, upgradeSksClusterRequest)

Upgrade an SKS cluster



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UpgradeSksClusterRequest upgradeSksClusterRequest = new UpgradeSksClusterRequest(); // UpgradeSksClusterRequest | 
        try {
            Operation result = apiInstance.upgradeSksCluster(id, upgradeSksClusterRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#upgradeSksCluster");
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
| **upgradeSksClusterRequest** | [**UpgradeSksClusterRequest**](UpgradeSksClusterRequest.md)|  | |

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

## upgradeSksClusterWithHttpInfo

> ApiResponse<Operation> upgradeSksCluster upgradeSksClusterWithHttpInfo(id, upgradeSksClusterRequest)

Upgrade an SKS cluster



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UpgradeSksClusterRequest upgradeSksClusterRequest = new UpgradeSksClusterRequest(); // UpgradeSksClusterRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.upgradeSksClusterWithHttpInfo(id, upgradeSksClusterRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#upgradeSksCluster");
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
| **upgradeSksClusterRequest** | [**UpgradeSksClusterRequest**](UpgradeSksClusterRequest.md)|  | |

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


## upgradeSksClusterServiceLevel

> Operation upgradeSksClusterServiceLevel(id)

Upgrade a SKS cluster to pro



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            Operation result = apiInstance.upgradeSksClusterServiceLevel(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#upgradeSksClusterServiceLevel");
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

## upgradeSksClusterServiceLevelWithHttpInfo

> ApiResponse<Operation> upgradeSksClusterServiceLevel upgradeSksClusterServiceLevelWithHttpInfo(id)

Upgrade a SKS cluster to pro



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SksApi apiInstance = new SksApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Operation> response = apiInstance.upgradeSksClusterServiceLevelWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SksApi#upgradeSksClusterServiceLevel");
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

