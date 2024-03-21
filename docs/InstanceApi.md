# InstanceApi

All URIs are relative to *https://api-{zone}.exoscale.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addInstanceProtection**](InstanceApi.md#addInstanceProtection) | **PUT** /instance/{id}:add-protection | Set instance destruction protection
[**createInstance**](InstanceApi.md#createInstance) | **POST** /instance | Create a Compute instance
[**createSnapshot**](InstanceApi.md#createSnapshot) | **POST** /instance/{id}:create-snapshot | Create a Snapshot of a Compute instance
[**deleteInstance**](InstanceApi.md#deleteInstance) | **DELETE** /instance/{id} | Delete a Compute instance
[**getInstance**](InstanceApi.md#getInstance) | **GET** /instance/{id} | Retrieve Compute instance details
[**listInstances**](InstanceApi.md#listInstances) | **GET** /instance | List Compute instances
[**rebootInstance**](InstanceApi.md#rebootInstance) | **PUT** /instance/{id}:reboot | Reboot a Compute instance
[**removeInstanceProtection**](InstanceApi.md#removeInstanceProtection) | **PUT** /instance/{id}:remove-protection | Remove instance destruction protection
[**resetInstance**](InstanceApi.md#resetInstance) | **PUT** /instance/{id}:reset | Reset a Compute instance to a base/target template
[**resetInstanceField**](InstanceApi.md#resetInstanceField) | **DELETE** /instance/{id}/{field} | Reset Instance field
[**resetInstancePassword**](InstanceApi.md#resetInstancePassword) | **PUT** /instance/{id}:reset-password | Reset a compute instance password
[**resizeInstanceDisk**](InstanceApi.md#resizeInstanceDisk) | **PUT** /instance/{id}:resize-disk | Resize a Compute instance disk
[**revealInstancePassword**](InstanceApi.md#revealInstancePassword) | **GET** /instance/{id}:password | Reveal the password used during instance creation or the latest password reset.
[**revertInstanceToSnapshot**](InstanceApi.md#revertInstanceToSnapshot) | **POST** /instance/{instance-id}:revert-snapshot | Revert a snapshot for an instance
[**scaleInstance**](InstanceApi.md#scaleInstance) | **PUT** /instance/{id}:scale | Scale a Compute instance to a new Instance Type
[**startInstance**](InstanceApi.md#startInstance) | **PUT** /instance/{id}:start | Start a Compute instance
[**stopInstance**](InstanceApi.md#stopInstance) | **PUT** /instance/{id}:stop | Stop a Compute instance
[**updateInstance**](InstanceApi.md#updateInstance) | **PUT** /instance/{id} | Update a Compute instance

<a name="addInstanceProtection"></a>
# **addInstanceProtection**
> Object addInstanceProtection(id)

Set instance destruction protection

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstanceApi;


InstanceApi apiInstance = new InstanceApi();
UUID id = new UUID(); // UUID | 
try {
    Object result = apiInstance.addInstanceProtection(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceApi#addInstanceProtection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createInstance"></a>
# **createInstance**
> Operation createInstance(body)

Create a Compute instance

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstanceApi;


InstanceApi apiInstance = new InstanceApi();
InstanceBody body = new InstanceBody(); // InstanceBody | 
try {
    Operation result = apiInstance.createInstance(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceApi#createInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InstanceBody**](InstanceBody.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSnapshot"></a>
# **createSnapshot**
> Operation createSnapshot(id)

Create a Snapshot of a Compute instance

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstanceApi;


InstanceApi apiInstance = new InstanceApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.createSnapshot(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceApi#createSnapshot");
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

<a name="deleteInstance"></a>
# **deleteInstance**
> Operation deleteInstance(id)

Delete a Compute instance

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstanceApi;


InstanceApi apiInstance = new InstanceApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.deleteInstance(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceApi#deleteInstance");
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

<a name="getInstance"></a>
# **getInstance**
> Instance getInstance(id)

Retrieve Compute instance details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstanceApi;


InstanceApi apiInstance = new InstanceApi();
UUID id = new UUID(); // UUID | 
try {
    Instance result = apiInstance.getInstance(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceApi#getInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**Instance**](Instance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listInstances"></a>
# **listInstances**
> InlineResponse20038 listInstances(managerId, managerType, ipAddress)

List Compute instances

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstanceApi;


InstanceApi apiInstance = new InstanceApi();
UUID managerId = new UUID(); // UUID | 
String managerType = "managerType_example"; // String | 
String ipAddress = "ipAddress_example"; // String | 
try {
    InlineResponse20038 result = apiInstance.listInstances(managerId, managerType, ipAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceApi#listInstances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **managerId** | [**UUID**](.md)|  | [optional]
 **managerType** | **String**|  | [optional] [enum: instance-pool]
 **ipAddress** | **String**|  | [optional]

### Return type

[**InlineResponse20038**](InlineResponse20038.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rebootInstance"></a>
# **rebootInstance**
> Operation rebootInstance(id)

Reboot a Compute instance

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstanceApi;


InstanceApi apiInstance = new InstanceApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.rebootInstance(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceApi#rebootInstance");
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

<a name="removeInstanceProtection"></a>
# **removeInstanceProtection**
> Object removeInstanceProtection(id)

Remove instance destruction protection

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstanceApi;


InstanceApi apiInstance = new InstanceApi();
UUID id = new UUID(); // UUID | 
try {
    Object result = apiInstance.removeInstanceProtection(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceApi#removeInstanceProtection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resetInstance"></a>
# **resetInstance**
> Operation resetInstance(body, id)

Reset a Compute instance to a base/target template

This operation re-installs a Compute instance to a base template. If target template is provided it will be used to recreated instance from. Warning: the operation wipes all data stored on the disk.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstanceApi;


InstanceApi apiInstance = new InstanceApi();
InstanceIdresetBody body = new InstanceIdresetBody(); // InstanceIdresetBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.resetInstance(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceApi#resetInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InstanceIdresetBody**](InstanceIdresetBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resetInstanceField"></a>
# **resetInstanceField**
> Operation resetInstanceField(id, field)

Reset Instance field

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstanceApi;


InstanceApi apiInstance = new InstanceApi();
UUID id = new UUID(); // UUID | 
String field = "field_example"; // String | 
try {
    Operation result = apiInstance.resetInstanceField(id, field);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceApi#resetInstanceField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |
 **field** | **String**|  | [enum: labels]

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resetInstancePassword"></a>
# **resetInstancePassword**
> Operation resetInstancePassword(id)

Reset a compute instance password

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstanceApi;


InstanceApi apiInstance = new InstanceApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.resetInstancePassword(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceApi#resetInstancePassword");
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

<a name="resizeInstanceDisk"></a>
# **resizeInstanceDisk**
> Operation resizeInstanceDisk(body, id)

Resize a Compute instance disk

This operation resizes a Compute instance&#x27;s disk volume. Note: the disk can only grow, cannot be shrunk.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstanceApi;


InstanceApi apiInstance = new InstanceApi();
InstanceIdresizediskBody body = new InstanceIdresizediskBody(); // InstanceIdresizediskBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.resizeInstanceDisk(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceApi#resizeInstanceDisk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InstanceIdresizediskBody**](InstanceIdresizediskBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="revealInstancePassword"></a>
# **revealInstancePassword**
> InstancePassword revealInstancePassword(id)

Reveal the password used during instance creation or the latest password reset.

Reveal the password used during instance creation or the latest password reset.             This is only available for VMs created against templates having the &#x60;password-enabled&#x60;             property set to &#x60;true&#x60;.              Passwords are transiently stored for at most 24 hours and intended to be retrieved shortly after             creation or resets.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstanceApi;


InstanceApi apiInstance = new InstanceApi();
UUID id = new UUID(); // UUID | 
try {
    InstancePassword result = apiInstance.revealInstancePassword(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceApi#revealInstancePassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**InstancePassword**](InstancePassword.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="revertInstanceToSnapshot"></a>
# **revertInstanceToSnapshot**
> Operation revertInstanceToSnapshot(body, instanceId)

Revert a snapshot for an instance

This operation reverts the snapshot to the Compute instance volume, restoring stored data as it was at the time of the snapshot. The Compute instance must be previously stopped.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstanceApi;


InstanceApi apiInstance = new InstanceApi();
InstanceInstanceidrevertsnapshotBody body = new InstanceInstanceidrevertsnapshotBody(); // InstanceInstanceidrevertsnapshotBody | 
UUID instanceId = new UUID(); // UUID | 
try {
    Operation result = apiInstance.revertInstanceToSnapshot(body, instanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceApi#revertInstanceToSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InstanceInstanceidrevertsnapshotBody**](InstanceInstanceidrevertsnapshotBody.md)|  |
 **instanceId** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="scaleInstance"></a>
# **scaleInstance**
> Operation scaleInstance(body, id)

Scale a Compute instance to a new Instance Type

This operation changes the Compute instance&#x27;s type. Note: the new Instance Type must be within the same family (e.g. a standard instance cannot be scaled to gpu2 or storage).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstanceApi;


InstanceApi apiInstance = new InstanceApi();
InstanceIdscaleBody body = new InstanceIdscaleBody(); // InstanceIdscaleBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.scaleInstance(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceApi#scaleInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InstanceIdscaleBody**](InstanceIdscaleBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="startInstance"></a>
# **startInstance**
> Operation startInstance(body, id)

Start a Compute instance

This operation starts a virtual machine, potentially using a rescue profile if specified

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstanceApi;


InstanceApi apiInstance = new InstanceApi();
InstanceIdstartBody body = new InstanceIdstartBody(); // InstanceIdstartBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.startInstance(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceApi#startInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InstanceIdstartBody**](InstanceIdstartBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stopInstance"></a>
# **stopInstance**
> Operation stopInstance(id)

Stop a Compute instance

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstanceApi;


InstanceApi apiInstance = new InstanceApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.stopInstance(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceApi#stopInstance");
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

<a name="updateInstance"></a>
# **updateInstance**
> Operation updateInstance(body, id)

Update a Compute instance

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InstanceApi;


InstanceApi apiInstance = new InstanceApi();
InstanceIdBody1 body = new InstanceIdBody1(); // InstanceIdBody1 | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.updateInstance(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceApi#updateInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InstanceIdBody1**](InstanceIdBody1.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

