# IamApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAccessKey**](IamApi.md#createAccessKey) | **POST** /access-key | Create a legacy IAM Access Key |
| [**createApiKey**](IamApi.md#createApiKey) | **POST** /api-key | Create a new API key |
| [**createIamRole**](IamApi.md#createIamRole) | **POST** /iam-role | Create IAM Role |
| [**deleteApiKey**](IamApi.md#deleteApiKey) | **DELETE** /api-key/{id} | Delete an API key |
| [**deleteIamRole**](IamApi.md#deleteIamRole) | **DELETE** /iam-role/{id} | Delete IAM Role |
| [**getAccessKey**](IamApi.md#getAccessKey) | **GET** /access-key/{key} | Retrieve IAM Access Key details |
| [**getApiKey**](IamApi.md#getApiKey) | **GET** /api-key/{id} | Get API key |
| [**getIamOrganizationPolicy**](IamApi.md#getIamOrganizationPolicy) | **GET** /iam-organization-policy | Retrieve IAM Organization Policy |
| [**getIamRole**](IamApi.md#getIamRole) | **GET** /iam-role/{id} | Retrieve IAM Role |
| [**listAccessKeyKnownOperations**](IamApi.md#listAccessKeyKnownOperations) | **GET** /access-key-known-operations | Retrieve all known available IAM Access Key operations and associated tags |
| [**listAccessKeyOperations**](IamApi.md#listAccessKeyOperations) | **GET** /access-key-operations | Retrieve IAM Access Key operations and associated tags for the signing key |
| [**listAccessKeys**](IamApi.md#listAccessKeys) | **GET** /access-key | List IAM Access Keys |
| [**listApiKeys**](IamApi.md#listApiKeys) | **GET** /api-key | List API keys |
| [**listIamRoles**](IamApi.md#listIamRoles) | **GET** /iam-role | List IAM Roles |
| [**revokeAccessKey**](IamApi.md#revokeAccessKey) | **DELETE** /access-key/{key} | Revoke an IAM Access Key |
| [**updateIamOrganizationPolicy**](IamApi.md#updateIamOrganizationPolicy) | **PUT** /iam-organization-policy | Update IAM Organization Policy |
| [**updateIamRole**](IamApi.md#updateIamRole) | **PUT** /iam-role/{id} | Update IAM Role |
| [**updateIamRolePolicy**](IamApi.md#updateIamRolePolicy) | **PUT** /iam-role/{id}:policy | Update IAM Role Policy |



## createAccessKey

> AccessKey createAccessKey(createAccessKeyRequest)

Create a legacy IAM Access Key

This operation creates a legacy IAM Access Key, to create a key for use with IAM roles use the api-key endpoint.The corresponding secret is only available in the response returned by this operation, the caller must take care of storing it safely as there is no other way to retrieve it.

### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        CreateAccessKeyRequest createAccessKeyRequest = new CreateAccessKeyRequest(); // CreateAccessKeyRequest | 
        try {
            AccessKey result = apiInstance.createAccessKey(createAccessKeyRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#createAccessKey");
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
| **createAccessKeyRequest** | [**CreateAccessKeyRequest**](CreateAccessKeyRequest.md)|  | |

### Return type

[**AccessKey**](AccessKey.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createApiKey

> IamApiKeyCreated createApiKey(createApiKeyRequest)

Create a new API key

### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        CreateApiKeyRequest createApiKeyRequest = new CreateApiKeyRequest(); // CreateApiKeyRequest | 
        try {
            IamApiKeyCreated result = apiInstance.createApiKey(createApiKeyRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#createApiKey");
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
| **createApiKeyRequest** | [**CreateApiKeyRequest**](CreateApiKeyRequest.md)|  | |

### Return type

[**IamApiKeyCreated**](IamApiKeyCreated.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## createIamRole

> Operation createIamRole(createIamRoleRequest)

Create IAM Role



### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        CreateIamRoleRequest createIamRoleRequest = new CreateIamRoleRequest(); // CreateIamRoleRequest | 
        try {
            Operation result = apiInstance.createIamRole(createIamRoleRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#createIamRole");
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
| **createIamRoleRequest** | [**CreateIamRoleRequest**](CreateIamRoleRequest.md)|  | |

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


## deleteApiKey

> Operation deleteApiKey(id)

Delete an API key

### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            Operation result = apiInstance.deleteApiKey(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#deleteApiKey");
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
| **id** | **String**|  | |

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


## deleteIamRole

> Operation deleteIamRole(id)

Delete IAM Role



### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            Operation result = apiInstance.deleteIamRole(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#deleteIamRole");
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


## getAccessKey

> AccessKey getAccessKey(key)

Retrieve IAM Access Key details



### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        String key = "key_example"; // String | 
        try {
            AccessKey result = apiInstance.getAccessKey(key);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#getAccessKey");
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
| **key** | **String**|  | |

### Return type

[**AccessKey**](AccessKey.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getApiKey

> IamApiKey getApiKey(id)

Get API key

### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            IamApiKey result = apiInstance.getApiKey(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#getApiKey");
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
| **id** | **String**|  | |

### Return type

[**IamApiKey**](IamApiKey.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getIamOrganizationPolicy

> IamPolicy getIamOrganizationPolicy()

Retrieve IAM Organization Policy



### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        try {
            IamPolicy result = apiInstance.getIamOrganizationPolicy();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#getIamOrganizationPolicy");
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

[**IamPolicy**](IamPolicy.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getIamRole

> IamRole getIamRole(id)

Retrieve IAM Role



### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            IamRole result = apiInstance.getIamRole(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#getIamRole");
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

[**IamRole**](IamRole.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listAccessKeyKnownOperations

> ListAccessKeyKnownOperations200Response listAccessKeyKnownOperations()

Retrieve all known available IAM Access Key operations and associated tags



### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        try {
            ListAccessKeyKnownOperations200Response result = apiInstance.listAccessKeyKnownOperations();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#listAccessKeyKnownOperations");
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

[**ListAccessKeyKnownOperations200Response**](ListAccessKeyKnownOperations200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listAccessKeyOperations

> ListAccessKeyKnownOperations200Response listAccessKeyOperations()

Retrieve IAM Access Key operations and associated tags for the signing key



### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        try {
            ListAccessKeyKnownOperations200Response result = apiInstance.listAccessKeyOperations();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#listAccessKeyOperations");
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

[**ListAccessKeyKnownOperations200Response**](ListAccessKeyKnownOperations200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listAccessKeys

> ListAccessKeys200Response listAccessKeys()

List IAM Access Keys



### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        try {
            ListAccessKeys200Response result = apiInstance.listAccessKeys();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#listAccessKeys");
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

[**ListAccessKeys200Response**](ListAccessKeys200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listApiKeys

> ListApiKeys200Response listApiKeys()

List API keys

### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        try {
            ListApiKeys200Response result = apiInstance.listApiKeys();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#listApiKeys");
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

[**ListApiKeys200Response**](ListApiKeys200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listIamRoles

> ListIamRoles200Response listIamRoles()

List IAM Roles



### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        try {
            ListIamRoles200Response result = apiInstance.listIamRoles();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#listIamRoles");
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

[**ListIamRoles200Response**](ListIamRoles200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## revokeAccessKey

> Operation revokeAccessKey(key)

Revoke an IAM Access Key

This operation revokes the specified IAM Access Key. Access Keys created by the revoked Access Key will not be revoked.

### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        String key = "key_example"; // String | 
        try {
            Operation result = apiInstance.revokeAccessKey(key);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#revokeAccessKey");
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
| **key** | **String**|  | |

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


## updateIamOrganizationPolicy

> Operation updateIamOrganizationPolicy(iamPolicy)

Update IAM Organization Policy



### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        IamPolicy iamPolicy = new IamPolicy(); // IamPolicy | 
        try {
            Operation result = apiInstance.updateIamOrganizationPolicy(iamPolicy);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#updateIamOrganizationPolicy");
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
| **iamPolicy** | [**IamPolicy**](IamPolicy.md)|  | |

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


## updateIamRole

> Operation updateIamRole(id, updateIamRoleRequest)

Update IAM Role



### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateIamRoleRequest updateIamRoleRequest = new UpdateIamRoleRequest(); // UpdateIamRoleRequest | 
        try {
            Operation result = apiInstance.updateIamRole(id, updateIamRoleRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#updateIamRole");
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
| **updateIamRoleRequest** | [**UpdateIamRoleRequest**](UpdateIamRoleRequest.md)|  | |

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


## updateIamRolePolicy

> Operation updateIamRolePolicy(id, iamPolicy)

Update IAM Role Policy



### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        IamPolicy iamPolicy = new IamPolicy(); // IamPolicy | 
        try {
            Operation result = apiInstance.updateIamRolePolicy(id, iamPolicy);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#updateIamRolePolicy");
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
| **iamPolicy** | [**IamPolicy**](IamPolicy.md)|  | |

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

