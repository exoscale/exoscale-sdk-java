# SksApi

All URIs are relative to *https://api-{zone}.exoscale.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSksCluster**](SksApi.md#createSksCluster) | **POST** /sks-cluster | Create an SKS cluster
[**createSksNodepool**](SksApi.md#createSksNodepool) | **POST** /sks-cluster/{id}/nodepool | Create a new SKS Nodepool
[**deleteSksCluster**](SksApi.md#deleteSksCluster) | **DELETE** /sks-cluster/{id} | Delete an SKS cluster
[**deleteSksNodepool**](SksApi.md#deleteSksNodepool) | **DELETE** /sks-cluster/{id}/nodepool/{sks-nodepool-id} | Delete an SKS Nodepool
[**evictSksNodepoolMembers**](SksApi.md#evictSksNodepoolMembers) | **PUT** /sks-cluster/{id}/nodepool/{sks-nodepool-id}:evict | Evict Nodepool members
[**generateSksClusterKubeconfig**](SksApi.md#generateSksClusterKubeconfig) | **POST** /sks-cluster-kubeconfig/{id} | Generate a new Kubeconfig file for a SKS cluster
[**getSksCluster**](SksApi.md#getSksCluster) | **GET** /sks-cluster/{id} | Retrieve SKS cluster details
[**getSksClusterAuthorityCert**](SksApi.md#getSksClusterAuthorityCert) | **GET** /sks-cluster/{id}/authority/{authority}/cert | Get the certificate for a SKS cluster authority
[**getSksClusterInspection**](SksApi.md#getSksClusterInspection) | **GET** /sks-cluster/{id}/inspection | Get the latest inspection result
[**getSksNodepool**](SksApi.md#getSksNodepool) | **GET** /sks-cluster/{id}/nodepool/{sks-nodepool-id} | Retrieve SKS Nodepool details
[**listSksClusterDeprecatedResources**](SksApi.md#listSksClusterDeprecatedResources) | **GET** /sks-cluster-deprecated-resources/{id} | Resources that are scheduled to be removed in future kubernetes releases
[**listSksClusterVersions**](SksApi.md#listSksClusterVersions) | **GET** /sks-cluster-version | List available versions for SKS clusters
[**listSksClusters**](SksApi.md#listSksClusters) | **GET** /sks-cluster | List SKS clusters
[**resetSksClusterField**](SksApi.md#resetSksClusterField) | **DELETE** /sks-cluster/{id}/{field} | Reset an SKS cluster field to its default value
[**resetSksNodepoolField**](SksApi.md#resetSksNodepoolField) | **DELETE** /sks-cluster/{id}/nodepool/{sks-nodepool-id}/{field} | Reset an SKS Nodepool field to its default value
[**rotateSksCcmCredentials**](SksApi.md#rotateSksCcmCredentials) | **PUT** /sks-cluster/{id}/rotate-ccm-credentials | Rotate Exoscale CCM credentials
[**rotateSksOperatorsCa**](SksApi.md#rotateSksOperatorsCa) | **PUT** /sks-cluster/{id}/rotate-operators-ca | Rotate operators certificate authority
[**scaleSksNodepool**](SksApi.md#scaleSksNodepool) | **PUT** /sks-cluster/{id}/nodepool/{sks-nodepool-id}:scale | Scale a SKS Nodepool
[**updateSksCluster**](SksApi.md#updateSksCluster) | **PUT** /sks-cluster/{id} | Update an SKS cluster
[**updateSksNodepool**](SksApi.md#updateSksNodepool) | **PUT** /sks-cluster/{id}/nodepool/{sks-nodepool-id} | Update an SKS Nodepool
[**upgradeSksCluster**](SksApi.md#upgradeSksCluster) | **PUT** /sks-cluster/{id}/upgrade | Upgrade an SKS cluster
[**upgradeSksClusterServiceLevel**](SksApi.md#upgradeSksClusterServiceLevel) | **PUT** /sks-cluster/{id}/upgrade-service-level | Upgrade a SKS cluster to pro

<a name="createSksCluster"></a>
# **createSksCluster**
> Operation createSksCluster(body)

Create an SKS cluster

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SksApi;


SksApi apiInstance = new SksApi();
SksclusterBody body = new SksclusterBody(); // SksclusterBody | 
try {
    Operation result = apiInstance.createSksCluster(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SksApi#createSksCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SksclusterBody**](SksclusterBody.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSksNodepool"></a>
# **createSksNodepool**
> Operation createSksNodepool(body, id)

Create a new SKS Nodepool

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SksApi;


SksApi apiInstance = new SksApi();
IdNodepoolBody body = new IdNodepoolBody(); // IdNodepoolBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.createSksNodepool(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SksApi#createSksNodepool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IdNodepoolBody**](IdNodepoolBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSksCluster"></a>
# **deleteSksCluster**
> Operation deleteSksCluster(id)

Delete an SKS cluster

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SksApi;


SksApi apiInstance = new SksApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.deleteSksCluster(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SksApi#deleteSksCluster");
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

<a name="deleteSksNodepool"></a>
# **deleteSksNodepool**
> Operation deleteSksNodepool(id, sksNodepoolId)

Delete an SKS Nodepool

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SksApi;


SksApi apiInstance = new SksApi();
UUID id = new UUID(); // UUID | 
UUID sksNodepoolId = new UUID(); // UUID | 
try {
    Operation result = apiInstance.deleteSksNodepool(id, sksNodepoolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SksApi#deleteSksNodepool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |
 **sksNodepoolId** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="evictSksNodepoolMembers"></a>
# **evictSksNodepoolMembers**
> Operation evictSksNodepoolMembers(body, id, sksNodepoolId)

Evict Nodepool members

This operation evicts the specified Compute instances member from the Nodepool, shrinking it to &#x60;&amp;lt;current nodepool size&amp;gt; - &amp;lt;# evicted members&amp;gt;&#x60;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SksApi;


SksApi apiInstance = new SksApi();
NodepoolSksnodepoolidevictBody body = new NodepoolSksnodepoolidevictBody(); // NodepoolSksnodepoolidevictBody | 
UUID id = new UUID(); // UUID | 
UUID sksNodepoolId = new UUID(); // UUID | 
try {
    Operation result = apiInstance.evictSksNodepoolMembers(body, id, sksNodepoolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SksApi#evictSksNodepoolMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodepoolSksnodepoolidevictBody**](NodepoolSksnodepoolidevictBody.md)|  |
 **id** | [**UUID**](.md)|  |
 **sksNodepoolId** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="generateSksClusterKubeconfig"></a>
# **generateSksClusterKubeconfig**
> InlineResponse2008 generateSksClusterKubeconfig(body, id)

Generate a new Kubeconfig file for a SKS cluster

This operation returns a Kubeconfig file encoded in base64.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SksApi;


SksApi apiInstance = new SksApi();
SksKubeconfigRequest body = new SksKubeconfigRequest(); // SksKubeconfigRequest | 
UUID id = new UUID(); // UUID | 
try {
    InlineResponse2008 result = apiInstance.generateSksClusterKubeconfig(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SksApi#generateSksClusterKubeconfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SksKubeconfigRequest**](SksKubeconfigRequest.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSksCluster"></a>
# **getSksCluster**
> SksCluster getSksCluster(id)

Retrieve SKS cluster details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SksApi;


SksApi apiInstance = new SksApi();
UUID id = new UUID(); // UUID | 
try {
    SksCluster result = apiInstance.getSksCluster(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SksApi#getSksCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**SksCluster**](SksCluster.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSksClusterAuthorityCert"></a>
# **getSksClusterAuthorityCert**
> InlineResponse20017 getSksClusterAuthorityCert(id, authority)

Get the certificate for a SKS cluster authority

This operation returns the certificate for the given SKS cluster authority encoded in base64.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SksApi;


SksApi apiInstance = new SksApi();
UUID id = new UUID(); // UUID | 
String authority = "authority_example"; // String | 
try {
    InlineResponse20017 result = apiInstance.getSksClusterAuthorityCert(id, authority);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SksApi#getSksClusterAuthorityCert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |
 **authority** | **String**|  | [enum: control-plane, aggregation, kubelet]

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSksClusterInspection"></a>
# **getSksClusterInspection**
> Map&lt;String, Object&gt; getSksClusterInspection(id)

Get the latest inspection result

Helps troubleshoot common problems when deploying a kubernetes cluster. Inspections run every couple of minutes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SksApi;


SksApi apiInstance = new SksApi();
UUID id = new UUID(); // UUID | 
try {
    Map<String, Object> result = apiInstance.getSksClusterInspection(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SksApi#getSksClusterInspection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSksNodepool"></a>
# **getSksNodepool**
> SksNodepool getSksNodepool(id, sksNodepoolId)

Retrieve SKS Nodepool details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SksApi;


SksApi apiInstance = new SksApi();
UUID id = new UUID(); // UUID | 
UUID sksNodepoolId = new UUID(); // UUID | 
try {
    SksNodepool result = apiInstance.getSksNodepool(id, sksNodepoolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SksApi#getSksNodepool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |
 **sksNodepoolId** | [**UUID**](.md)|  |

### Return type

[**SksNodepool**](SksNodepool.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSksClusterDeprecatedResources"></a>
# **listSksClusterDeprecatedResources**
> List&lt;SksClusterDeprecatedResource&gt; listSksClusterDeprecatedResources(id)

Resources that are scheduled to be removed in future kubernetes releases

This operation returns the deprecated resources for a given cluster

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SksApi;


SksApi apiInstance = new SksApi();
UUID id = new UUID(); // UUID | 
try {
    List<SksClusterDeprecatedResource> result = apiInstance.listSksClusterDeprecatedResources(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SksApi#listSksClusterDeprecatedResources");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**List&lt;SksClusterDeprecatedResource&gt;**](SksClusterDeprecatedResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSksClusterVersions"></a>
# **listSksClusterVersions**
> InlineResponse20037 listSksClusterVersions(includeDeprecated)

List available versions for SKS clusters

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SksApi;


SksApi apiInstance = new SksApi();
String includeDeprecated = "includeDeprecated_example"; // String | 
try {
    InlineResponse20037 result = apiInstance.listSksClusterVersions(includeDeprecated);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SksApi#listSksClusterVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeDeprecated** | **String**|  | [optional]

### Return type

[**InlineResponse20037**](InlineResponse20037.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSksClusters"></a>
# **listSksClusters**
> InlineResponse20029 listSksClusters()

List SKS clusters

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SksApi;


SksApi apiInstance = new SksApi();
try {
    InlineResponse20029 result = apiInstance.listSksClusters();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SksApi#listSksClusters");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20029**](InlineResponse20029.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resetSksClusterField"></a>
# **resetSksClusterField**
> Operation resetSksClusterField(id, field)

Reset an SKS cluster field to its default value

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SksApi;


SksApi apiInstance = new SksApi();
UUID id = new UUID(); // UUID | 
String field = "field_example"; // String | 
try {
    Operation result = apiInstance.resetSksClusterField(id, field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SksApi#resetSksClusterField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |
 **field** | **String**|  | [enum: description, labels]

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resetSksNodepoolField"></a>
# **resetSksNodepoolField**
> Operation resetSksNodepoolField(id, sksNodepoolId, field)

Reset an SKS Nodepool field to its default value

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SksApi;


SksApi apiInstance = new SksApi();
UUID id = new UUID(); // UUID | 
UUID sksNodepoolId = new UUID(); // UUID | 
String field = "field_example"; // String | 
try {
    Operation result = apiInstance.resetSksNodepoolField(id, sksNodepoolId, field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SksApi#resetSksNodepoolField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |
 **sksNodepoolId** | [**UUID**](.md)|  |
 **field** | **String**|  | [enum: anti-affinity-groups, description, labels, security-groups, private-networks, deploy-target]

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rotateSksCcmCredentials"></a>
# **rotateSksCcmCredentials**
> Operation rotateSksCcmCredentials(id)

Rotate Exoscale CCM credentials

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SksApi;


SksApi apiInstance = new SksApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.rotateSksCcmCredentials(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SksApi#rotateSksCcmCredentials");
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

<a name="rotateSksOperatorsCa"></a>
# **rotateSksOperatorsCa**
> Operation rotateSksOperatorsCa(id)

Rotate operators certificate authority

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SksApi;


SksApi apiInstance = new SksApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.rotateSksOperatorsCa(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SksApi#rotateSksOperatorsCa");
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

<a name="scaleSksNodepool"></a>
# **scaleSksNodepool**
> Operation scaleSksNodepool(body, id, sksNodepoolId)

Scale a SKS Nodepool

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SksApi;


SksApi apiInstance = new SksApi();
NodepoolSksnodepoolidscaleBody body = new NodepoolSksnodepoolidscaleBody(); // NodepoolSksnodepoolidscaleBody | 
UUID id = new UUID(); // UUID | 
UUID sksNodepoolId = new UUID(); // UUID | 
try {
    Operation result = apiInstance.scaleSksNodepool(body, id, sksNodepoolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SksApi#scaleSksNodepool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodepoolSksnodepoolidscaleBody**](NodepoolSksnodepoolidscaleBody.md)|  |
 **id** | [**UUID**](.md)|  |
 **sksNodepoolId** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSksCluster"></a>
# **updateSksCluster**
> Operation updateSksCluster(body, id)

Update an SKS cluster

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SksApi;


SksApi apiInstance = new SksApi();
SksclusterIdBody body = new SksclusterIdBody(); // SksclusterIdBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.updateSksCluster(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SksApi#updateSksCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SksclusterIdBody**](SksclusterIdBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSksNodepool"></a>
# **updateSksNodepool**
> Operation updateSksNodepool(body, id, sksNodepoolId)

Update an SKS Nodepool

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SksApi;


SksApi apiInstance = new SksApi();
NodepoolSksnodepoolidBody body = new NodepoolSksnodepoolidBody(); // NodepoolSksnodepoolidBody | 
UUID id = new UUID(); // UUID | 
UUID sksNodepoolId = new UUID(); // UUID | 
try {
    Operation result = apiInstance.updateSksNodepool(body, id, sksNodepoolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SksApi#updateSksNodepool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodepoolSksnodepoolidBody**](NodepoolSksnodepoolidBody.md)|  |
 **id** | [**UUID**](.md)|  |
 **sksNodepoolId** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="upgradeSksCluster"></a>
# **upgradeSksCluster**
> Operation upgradeSksCluster(body, id)

Upgrade an SKS cluster

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SksApi;


SksApi apiInstance = new SksApi();
IdUpgradeBody body = new IdUpgradeBody(); // IdUpgradeBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.upgradeSksCluster(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SksApi#upgradeSksCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IdUpgradeBody**](IdUpgradeBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="upgradeSksClusterServiceLevel"></a>
# **upgradeSksClusterServiceLevel**
> Operation upgradeSksClusterServiceLevel(id)

Upgrade a SKS cluster to pro

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SksApi;


SksApi apiInstance = new SksApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.upgradeSksClusterServiceLevel(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SksApi#upgradeSksClusterServiceLevel");
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

