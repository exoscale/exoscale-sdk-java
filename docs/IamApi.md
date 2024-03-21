# IamApi

All URIs are relative to *https://api-{zone}.exoscale.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccessKey**](IamApi.md#createAccessKey) | **POST** /access-key | Create a legacy IAM Access Key
[**createApiKey**](IamApi.md#createApiKey) | **POST** /api-key | Create a new API key
[**createIamRole**](IamApi.md#createIamRole) | **POST** /iam-role | Create IAM Role
[**deleteApiKey**](IamApi.md#deleteApiKey) | **DELETE** /api-key/{id} | Delete an API key
[**deleteIamRole**](IamApi.md#deleteIamRole) | **DELETE** /iam-role/{id} | Delete IAM Role
[**getAccessKey**](IamApi.md#getAccessKey) | **GET** /access-key/{key} | Retrieve IAM Access Key details
[**getApiKey**](IamApi.md#getApiKey) | **GET** /api-key/{id} | Get API key
[**getIamOrganizationPolicy**](IamApi.md#getIamOrganizationPolicy) | **GET** /iam-organization-policy | Retrieve IAM Organization Policy
[**getIamRole**](IamApi.md#getIamRole) | **GET** /iam-role/{id} | Retrieve IAM Role
[**listAccessKeyKnownOperations**](IamApi.md#listAccessKeyKnownOperations) | **GET** /access-key-known-operations | Retrieve all known available IAM Access Key operations and associated tags
[**listAccessKeyOperations**](IamApi.md#listAccessKeyOperations) | **GET** /access-key-operations | Retrieve IAM Access Key operations and associated tags for the signing key
[**listAccessKeys**](IamApi.md#listAccessKeys) | **GET** /access-key | List IAM Access Keys
[**listApiKeys**](IamApi.md#listApiKeys) | **GET** /api-key | List API keys
[**listIamRoles**](IamApi.md#listIamRoles) | **GET** /iam-role | List IAM Roles
[**revokeAccessKey**](IamApi.md#revokeAccessKey) | **DELETE** /access-key/{key} | Revoke an IAM Access Key
[**updateIamOrganizationPolicy**](IamApi.md#updateIamOrganizationPolicy) | **PUT** /iam-organization-policy | Update IAM Organization Policy
[**updateIamRole**](IamApi.md#updateIamRole) | **PUT** /iam-role/{id} | Update IAM Role
[**updateIamRolePolicy**](IamApi.md#updateIamRolePolicy) | **PUT** /iam-role/{id}:policy | Update IAM Role Policy

<a name="createAccessKey"></a>
# **createAccessKey**
> AccessKey createAccessKey(body)

Create a legacy IAM Access Key

This operation creates a legacy IAM Access Key, to create a key for use with IAM roles use the api-key endpoint.The corresponding secret is only available in the response returned by this operation, the caller must take care of storing it safely as there is no other way to retrieve it.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IamApi;


IamApi apiInstance = new IamApi();
AccesskeyBody body = new AccesskeyBody(); // AccesskeyBody | 
try {
    AccessKey result = apiInstance.createAccessKey(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IamApi#createAccessKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccesskeyBody**](AccesskeyBody.md)|  |

### Return type

[**AccessKey**](AccessKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createApiKey"></a>
# **createApiKey**
> IamApiKeyCreated createApiKey(body)

Create a new API key

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IamApi;


IamApi apiInstance = new IamApi();
ApikeyBody body = new ApikeyBody(); // ApikeyBody | 
try {
    IamApiKeyCreated result = apiInstance.createApiKey(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IamApi#createApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApikeyBody**](ApikeyBody.md)|  |

### Return type

[**IamApiKeyCreated**](IamApiKeyCreated.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createIamRole"></a>
# **createIamRole**
> Operation createIamRole(body)

Create IAM Role

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IamApi;


IamApi apiInstance = new IamApi();
IamroleBody body = new IamroleBody(); // IamroleBody | 
try {
    Operation result = apiInstance.createIamRole(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IamApi#createIamRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IamroleBody**](IamroleBody.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteApiKey"></a>
# **deleteApiKey**
> Operation deleteApiKey(id)

Delete an API key

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IamApi;


IamApi apiInstance = new IamApi();
String id = "id_example"; // String | 
try {
    Operation result = apiInstance.deleteApiKey(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IamApi#deleteApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteIamRole"></a>
# **deleteIamRole**
> Operation deleteIamRole(id)

Delete IAM Role

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IamApi;


IamApi apiInstance = new IamApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.deleteIamRole(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IamApi#deleteIamRole");
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

<a name="getAccessKey"></a>
# **getAccessKey**
> AccessKey getAccessKey(key)

Retrieve IAM Access Key details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IamApi;


IamApi apiInstance = new IamApi();
String key = "key_example"; // String | 
try {
    AccessKey result = apiInstance.getAccessKey(key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IamApi#getAccessKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**|  |

### Return type

[**AccessKey**](AccessKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getApiKey"></a>
# **getApiKey**
> IamApiKey getApiKey(id)

Get API key

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IamApi;


IamApi apiInstance = new IamApi();
String id = "id_example"; // String | 
try {
    IamApiKey result = apiInstance.getApiKey(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IamApi#getApiKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**IamApiKey**](IamApiKey.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIamOrganizationPolicy"></a>
# **getIamOrganizationPolicy**
> IamPolicy getIamOrganizationPolicy()

Retrieve IAM Organization Policy

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IamApi;


IamApi apiInstance = new IamApi();
try {
    IamPolicy result = apiInstance.getIamOrganizationPolicy();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IamApi#getIamOrganizationPolicy");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IamPolicy**](IamPolicy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIamRole"></a>
# **getIamRole**
> IamRole getIamRole(id)

Retrieve IAM Role

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IamApi;


IamApi apiInstance = new IamApi();
UUID id = new UUID(); // UUID | 
try {
    IamRole result = apiInstance.getIamRole(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IamApi#getIamRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**IamRole**](IamRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAccessKeyKnownOperations"></a>
# **listAccessKeyKnownOperations**
> InlineResponse20023 listAccessKeyKnownOperations()

Retrieve all known available IAM Access Key operations and associated tags

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IamApi;


IamApi apiInstance = new IamApi();
try {
    InlineResponse20023 result = apiInstance.listAccessKeyKnownOperations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IamApi#listAccessKeyKnownOperations");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20023**](InlineResponse20023.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAccessKeyOperations"></a>
# **listAccessKeyOperations**
> InlineResponse20023 listAccessKeyOperations()

Retrieve IAM Access Key operations and associated tags for the signing key

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IamApi;


IamApi apiInstance = new IamApi();
try {
    InlineResponse20023 result = apiInstance.listAccessKeyOperations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IamApi#listAccessKeyOperations");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20023**](InlineResponse20023.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAccessKeys"></a>
# **listAccessKeys**
> InlineResponse20015 listAccessKeys()

List IAM Access Keys

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IamApi;


IamApi apiInstance = new IamApi();
try {
    InlineResponse20015 result = apiInstance.listAccessKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IamApi#listAccessKeys");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listApiKeys"></a>
# **listApiKeys**
> InlineResponse20018 listApiKeys()

List API keys

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IamApi;


IamApi apiInstance = new IamApi();
try {
    InlineResponse20018 result = apiInstance.listApiKeys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IamApi#listApiKeys");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIamRoles"></a>
# **listIamRoles**
> InlineResponse20039 listIamRoles()

List IAM Roles

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IamApi;


IamApi apiInstance = new IamApi();
try {
    InlineResponse20039 result = apiInstance.listIamRoles();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IamApi#listIamRoles");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20039**](InlineResponse20039.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="revokeAccessKey"></a>
# **revokeAccessKey**
> Operation revokeAccessKey(key)

Revoke an IAM Access Key

This operation revokes the specified IAM Access Key. Access Keys created by the revoked Access Key will not be revoked.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IamApi;


IamApi apiInstance = new IamApi();
String key = "key_example"; // String | 
try {
    Operation result = apiInstance.revokeAccessKey(key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IamApi#revokeAccessKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateIamOrganizationPolicy"></a>
# **updateIamOrganizationPolicy**
> Operation updateIamOrganizationPolicy(body)

Update IAM Organization Policy

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IamApi;


IamApi apiInstance = new IamApi();
IamPolicy body = new IamPolicy(); // IamPolicy | 
try {
    Operation result = apiInstance.updateIamOrganizationPolicy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IamApi#updateIamOrganizationPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IamPolicy**](IamPolicy.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateIamRole"></a>
# **updateIamRole**
> Operation updateIamRole(body, id)

Update IAM Role

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IamApi;


IamApi apiInstance = new IamApi();
IamroleIdBody body = new IamroleIdBody(); // IamroleIdBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.updateIamRole(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IamApi#updateIamRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IamroleIdBody**](IamroleIdBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateIamRolePolicy"></a>
# **updateIamRolePolicy**
> Operation updateIamRolePolicy(body, id)

Update IAM Role Policy

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IamApi;


IamApi apiInstance = new IamApi();
IamPolicy body = new IamPolicy(); // IamPolicy | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.updateIamRolePolicy(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IamApi#updateIamRolePolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IamPolicy**](IamPolicy.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

