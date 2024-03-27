# InstanceApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addInstanceProtection**](InstanceApi.md#addInstanceProtection) | **PUT** /instance/{id}:add-protection | Set instance destruction protection |
| [**createInstance**](InstanceApi.md#createInstance) | **POST** /instance | Create a Compute instance |
| [**createSnapshot**](InstanceApi.md#createSnapshot) | **POST** /instance/{id}:create-snapshot | Create a Snapshot of a Compute instance |
| [**deleteInstance**](InstanceApi.md#deleteInstance) | **DELETE** /instance/{id} | Delete a Compute instance |
| [**getInstance**](InstanceApi.md#getInstance) | **GET** /instance/{id} | Retrieve Compute instance details |
| [**listInstances**](InstanceApi.md#listInstances) | **GET** /instance | List Compute instances |
| [**rebootInstance**](InstanceApi.md#rebootInstance) | **PUT** /instance/{id}:reboot | Reboot a Compute instance |
| [**removeInstanceProtection**](InstanceApi.md#removeInstanceProtection) | **PUT** /instance/{id}:remove-protection | Remove instance destruction protection |
| [**resetInstance**](InstanceApi.md#resetInstance) | **PUT** /instance/{id}:reset | Reset a Compute instance to a base/target template |
| [**resetInstanceField**](InstanceApi.md#resetInstanceField) | **DELETE** /instance/{id}/{field} | Reset Instance field |
| [**resetInstancePassword**](InstanceApi.md#resetInstancePassword) | **PUT** /instance/{id}:reset-password | Reset a compute instance password |
| [**resizeInstanceDisk**](InstanceApi.md#resizeInstanceDisk) | **PUT** /instance/{id}:resize-disk | Resize a Compute instance disk |
| [**revealInstancePassword**](InstanceApi.md#revealInstancePassword) | **GET** /instance/{id}:password | Reveal the password used during instance creation or the latest password reset. |
| [**revertInstanceToSnapshot**](InstanceApi.md#revertInstanceToSnapshot) | **POST** /instance/{instance-id}:revert-snapshot | Revert a snapshot for an instance |
| [**scaleInstance**](InstanceApi.md#scaleInstance) | **PUT** /instance/{id}:scale | Scale a Compute instance to a new Instance Type |
| [**startInstance**](InstanceApi.md#startInstance) | **PUT** /instance/{id}:start | Start a Compute instance |
| [**stopInstance**](InstanceApi.md#stopInstance) | **PUT** /instance/{id}:stop | Stop a Compute instance |
| [**updateInstance**](InstanceApi.md#updateInstance) | **PUT** /instance/{id} | Update a Compute instance |


<a id="addInstanceProtection"></a>
# **addInstanceProtection**
> Object addInstanceProtection(id)

Set instance destruction protection



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    InstanceApi apiInstance = new InstanceApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      Object result = apiInstance.addInstanceProtection(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceApi#addInstanceProtection");
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

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="createInstance"></a>
# **createInstance**
> Operation createInstance(createInstanceRequest)

Create a Compute instance



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    InstanceApi apiInstance = new InstanceApi(defaultClient);
    CreateInstanceRequest createInstanceRequest = new CreateInstanceRequest(); // CreateInstanceRequest | 
    try {
      Operation result = apiInstance.createInstance(createInstanceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceApi#createInstance");
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
| **createInstanceRequest** | [**CreateInstanceRequest**](CreateInstanceRequest.md)|  | |

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

<a id="createSnapshot"></a>
# **createSnapshot**
> Operation createSnapshot(id)

Create a Snapshot of a Compute instance



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    InstanceApi apiInstance = new InstanceApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      Operation result = apiInstance.createSnapshot(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceApi#createSnapshot");
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

<a id="deleteInstance"></a>
# **deleteInstance**
> Operation deleteInstance(id)

Delete a Compute instance



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    InstanceApi apiInstance = new InstanceApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      Operation result = apiInstance.deleteInstance(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceApi#deleteInstance");
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

<a id="getInstance"></a>
# **getInstance**
> Instance getInstance(id)

Retrieve Compute instance details



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    InstanceApi apiInstance = new InstanceApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      Instance result = apiInstance.getInstance(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceApi#getInstance");
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

[**Instance**](Instance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="listInstances"></a>
# **listInstances**
> ListInstances200Response listInstances(managerId, managerType, ipAddress)

List Compute instances



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    InstanceApi apiInstance = new InstanceApi(defaultClient);
    UUID managerId = UUID.randomUUID(); // UUID | 
    String managerType = "instance-pool"; // String | 
    String ipAddress = "ipAddress_example"; // String | 
    try {
      ListInstances200Response result = apiInstance.listInstances(managerId, managerType, ipAddress);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceApi#listInstances");
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
| **managerId** | **UUID**|  | [optional] |
| **managerType** | **String**|  | [optional] [enum: instance-pool] |
| **ipAddress** | **String**|  | [optional] |

### Return type

[**ListInstances200Response**](ListInstances200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="rebootInstance"></a>
# **rebootInstance**
> Operation rebootInstance(id)

Reboot a Compute instance



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    InstanceApi apiInstance = new InstanceApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      Operation result = apiInstance.rebootInstance(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceApi#rebootInstance");
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

<a id="removeInstanceProtection"></a>
# **removeInstanceProtection**
> Object removeInstanceProtection(id)

Remove instance destruction protection



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    InstanceApi apiInstance = new InstanceApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      Object result = apiInstance.removeInstanceProtection(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceApi#removeInstanceProtection");
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

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="resetInstance"></a>
# **resetInstance**
> Operation resetInstance(id, resetInstanceRequest)

Reset a Compute instance to a base/target template

This operation re-installs a Compute instance to a base template. If target template is provided it will be used to recreated instance from. Warning: the operation wipes all data stored on the disk.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    InstanceApi apiInstance = new InstanceApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    ResetInstanceRequest resetInstanceRequest = new ResetInstanceRequest(); // ResetInstanceRequest | 
    try {
      Operation result = apiInstance.resetInstance(id, resetInstanceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceApi#resetInstance");
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
| **resetInstanceRequest** | [**ResetInstanceRequest**](ResetInstanceRequest.md)|  | |

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

<a id="resetInstanceField"></a>
# **resetInstanceField**
> Operation resetInstanceField(id, field)

Reset Instance field



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    InstanceApi apiInstance = new InstanceApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    String field = "labels"; // String | 
    try {
      Operation result = apiInstance.resetInstanceField(id, field);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceApi#resetInstanceField");
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

<a id="resetInstancePassword"></a>
# **resetInstancePassword**
> Operation resetInstancePassword(id)

Reset a compute instance password



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    InstanceApi apiInstance = new InstanceApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      Operation result = apiInstance.resetInstancePassword(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceApi#resetInstancePassword");
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

<a id="resizeInstanceDisk"></a>
# **resizeInstanceDisk**
> Operation resizeInstanceDisk(id, resizeInstanceDiskRequest)

Resize a Compute instance disk

This operation resizes a Compute instance&#39;s disk volume. Note: the disk can only grow, cannot be shrunk.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    InstanceApi apiInstance = new InstanceApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    ResizeInstanceDiskRequest resizeInstanceDiskRequest = new ResizeInstanceDiskRequest(); // ResizeInstanceDiskRequest | 
    try {
      Operation result = apiInstance.resizeInstanceDisk(id, resizeInstanceDiskRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceApi#resizeInstanceDisk");
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
| **resizeInstanceDiskRequest** | [**ResizeInstanceDiskRequest**](ResizeInstanceDiskRequest.md)|  | |

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

<a id="revealInstancePassword"></a>
# **revealInstancePassword**
> InstancePassword revealInstancePassword(id)

Reveal the password used during instance creation or the latest password reset.

Reveal the password used during instance creation or the latest password reset.             This is only available for VMs created against templates having the &#x60;password-enabled&#x60;             property set to &#x60;true&#x60;.              Passwords are transiently stored for at most 24 hours and intended to be retrieved shortly after             creation or resets.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    InstanceApi apiInstance = new InstanceApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      InstancePassword result = apiInstance.revealInstancePassword(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceApi#revealInstancePassword");
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

[**InstancePassword**](InstancePassword.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="revertInstanceToSnapshot"></a>
# **revertInstanceToSnapshot**
> Operation revertInstanceToSnapshot(instanceId, revertInstanceToSnapshotRequest)

Revert a snapshot for an instance

This operation reverts the snapshot to the Compute instance volume, restoring stored data as it was at the time of the snapshot. The Compute instance must be previously stopped.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    InstanceApi apiInstance = new InstanceApi(defaultClient);
    UUID instanceId = UUID.randomUUID(); // UUID | 
    RevertInstanceToSnapshotRequest revertInstanceToSnapshotRequest = new RevertInstanceToSnapshotRequest(); // RevertInstanceToSnapshotRequest | 
    try {
      Operation result = apiInstance.revertInstanceToSnapshot(instanceId, revertInstanceToSnapshotRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceApi#revertInstanceToSnapshot");
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
| **instanceId** | **UUID**|  | |
| **revertInstanceToSnapshotRequest** | [**RevertInstanceToSnapshotRequest**](RevertInstanceToSnapshotRequest.md)|  | |

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

<a id="scaleInstance"></a>
# **scaleInstance**
> Operation scaleInstance(id, scaleInstanceRequest)

Scale a Compute instance to a new Instance Type

This operation changes the Compute instance&#39;s type. Note: the new Instance Type must be within the same family (e.g. a standard instance cannot be scaled to gpu2 or storage).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    InstanceApi apiInstance = new InstanceApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    ScaleInstanceRequest scaleInstanceRequest = new ScaleInstanceRequest(); // ScaleInstanceRequest | 
    try {
      Operation result = apiInstance.scaleInstance(id, scaleInstanceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceApi#scaleInstance");
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
| **scaleInstanceRequest** | [**ScaleInstanceRequest**](ScaleInstanceRequest.md)|  | |

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

<a id="startInstance"></a>
# **startInstance**
> Operation startInstance(id, startInstanceRequest)

Start a Compute instance

This operation starts a virtual machine, potentially using a rescue profile if specified

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    InstanceApi apiInstance = new InstanceApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    StartInstanceRequest startInstanceRequest = new StartInstanceRequest(); // StartInstanceRequest | 
    try {
      Operation result = apiInstance.startInstance(id, startInstanceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceApi#startInstance");
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
| **startInstanceRequest** | [**StartInstanceRequest**](StartInstanceRequest.md)|  | |

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

<a id="stopInstance"></a>
# **stopInstance**
> Operation stopInstance(id)

Stop a Compute instance



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    InstanceApi apiInstance = new InstanceApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      Operation result = apiInstance.stopInstance(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceApi#stopInstance");
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

<a id="updateInstance"></a>
# **updateInstance**
> Operation updateInstance(id, updateInstanceRequest)

Update a Compute instance



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InstanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    InstanceApi apiInstance = new InstanceApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    UpdateInstanceRequest updateInstanceRequest = new UpdateInstanceRequest(); // UpdateInstanceRequest | 
    try {
      Operation result = apiInstance.updateInstance(id, updateInstanceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InstanceApi#updateInstance");
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
| **updateInstanceRequest** | [**UpdateInstanceRequest**](UpdateInstanceRequest.md)|  | |

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

