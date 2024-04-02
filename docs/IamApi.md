# IamApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAccessKey**](IamApi.md#createAccessKey) | **POST** /access-key | Create a legacy IAM Access Key |
| [**createAccessKeyWithHttpInfo**](IamApi.md#createAccessKeyWithHttpInfo) | **POST** /access-key | Create a legacy IAM Access Key |
| [**createApiKey**](IamApi.md#createApiKey) | **POST** /api-key | Create a new API key |
| [**createApiKeyWithHttpInfo**](IamApi.md#createApiKeyWithHttpInfo) | **POST** /api-key | Create a new API key |
| [**createIamRole**](IamApi.md#createIamRole) | **POST** /iam-role | Create IAM Role |
| [**createIamRoleWithHttpInfo**](IamApi.md#createIamRoleWithHttpInfo) | **POST** /iam-role | Create IAM Role |
| [**deleteApiKey**](IamApi.md#deleteApiKey) | **DELETE** /api-key/{id} | Delete an API key |
| [**deleteApiKeyWithHttpInfo**](IamApi.md#deleteApiKeyWithHttpInfo) | **DELETE** /api-key/{id} | Delete an API key |
| [**deleteIamRole**](IamApi.md#deleteIamRole) | **DELETE** /iam-role/{id} | Delete IAM Role |
| [**deleteIamRoleWithHttpInfo**](IamApi.md#deleteIamRoleWithHttpInfo) | **DELETE** /iam-role/{id} | Delete IAM Role |
| [**getAccessKey**](IamApi.md#getAccessKey) | **GET** /access-key/{key} | Retrieve IAM Access Key details |
| [**getAccessKeyWithHttpInfo**](IamApi.md#getAccessKeyWithHttpInfo) | **GET** /access-key/{key} | Retrieve IAM Access Key details |
| [**getApiKey**](IamApi.md#getApiKey) | **GET** /api-key/{id} | Get API key |
| [**getApiKeyWithHttpInfo**](IamApi.md#getApiKeyWithHttpInfo) | **GET** /api-key/{id} | Get API key |
| [**getIamOrganizationPolicy**](IamApi.md#getIamOrganizationPolicy) | **GET** /iam-organization-policy | Retrieve IAM Organization Policy |
| [**getIamOrganizationPolicyWithHttpInfo**](IamApi.md#getIamOrganizationPolicyWithHttpInfo) | **GET** /iam-organization-policy | Retrieve IAM Organization Policy |
| [**getIamRole**](IamApi.md#getIamRole) | **GET** /iam-role/{id} | Retrieve IAM Role |
| [**getIamRoleWithHttpInfo**](IamApi.md#getIamRoleWithHttpInfo) | **GET** /iam-role/{id} | Retrieve IAM Role |
| [**listAccessKeyKnownOperations**](IamApi.md#listAccessKeyKnownOperations) | **GET** /access-key-known-operations | Retrieve all known available IAM Access Key operations and associated tags |
| [**listAccessKeyKnownOperationsWithHttpInfo**](IamApi.md#listAccessKeyKnownOperationsWithHttpInfo) | **GET** /access-key-known-operations | Retrieve all known available IAM Access Key operations and associated tags |
| [**listAccessKeyOperations**](IamApi.md#listAccessKeyOperations) | **GET** /access-key-operations | Retrieve IAM Access Key operations and associated tags for the signing key |
| [**listAccessKeyOperationsWithHttpInfo**](IamApi.md#listAccessKeyOperationsWithHttpInfo) | **GET** /access-key-operations | Retrieve IAM Access Key operations and associated tags for the signing key |
| [**listAccessKeys**](IamApi.md#listAccessKeys) | **GET** /access-key | List IAM Access Keys |
| [**listAccessKeysWithHttpInfo**](IamApi.md#listAccessKeysWithHttpInfo) | **GET** /access-key | List IAM Access Keys |
| [**listApiKeys**](IamApi.md#listApiKeys) | **GET** /api-key | List API keys |
| [**listApiKeysWithHttpInfo**](IamApi.md#listApiKeysWithHttpInfo) | **GET** /api-key | List API keys |
| [**listIamRoles**](IamApi.md#listIamRoles) | **GET** /iam-role | List IAM Roles |
| [**listIamRolesWithHttpInfo**](IamApi.md#listIamRolesWithHttpInfo) | **GET** /iam-role | List IAM Roles |
| [**revokeAccessKey**](IamApi.md#revokeAccessKey) | **DELETE** /access-key/{key} | Revoke an IAM Access Key |
| [**revokeAccessKeyWithHttpInfo**](IamApi.md#revokeAccessKeyWithHttpInfo) | **DELETE** /access-key/{key} | Revoke an IAM Access Key |
| [**updateIamOrganizationPolicy**](IamApi.md#updateIamOrganizationPolicy) | **PUT** /iam-organization-policy | Update IAM Organization Policy |
| [**updateIamOrganizationPolicyWithHttpInfo**](IamApi.md#updateIamOrganizationPolicyWithHttpInfo) | **PUT** /iam-organization-policy | Update IAM Organization Policy |
| [**updateIamRole**](IamApi.md#updateIamRole) | **PUT** /iam-role/{id} | Update IAM Role |
| [**updateIamRoleWithHttpInfo**](IamApi.md#updateIamRoleWithHttpInfo) | **PUT** /iam-role/{id} | Update IAM Role |
| [**updateIamRolePolicy**](IamApi.md#updateIamRolePolicy) | **PUT** /iam-role/{id}:policy | Update IAM Role Policy |
| [**updateIamRolePolicyWithHttpInfo**](IamApi.md#updateIamRolePolicyWithHttpInfo) | **PUT** /iam-role/{id}:policy | Update IAM Role Policy |



## createAccessKey

> AccessKey createAccessKey(createAccessKeyRequest)

Create a legacy IAM Access Key

This operation creates a legacy IAM Access Key, to create a key for use with IAM roles use the api-key endpoint.The corresponding secret is only available in the response returned by this operation, the caller must take care of storing it safely as there is no other way to retrieve it.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

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

## createAccessKeyWithHttpInfo

> ApiResponse<AccessKey> createAccessKey createAccessKeyWithHttpInfo(createAccessKeyRequest)

Create a legacy IAM Access Key

This operation creates a legacy IAM Access Key, to create a key for use with IAM roles use the api-key endpoint.The corresponding secret is only available in the response returned by this operation, the caller must take care of storing it safely as there is no other way to retrieve it.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        CreateAccessKeyRequest createAccessKeyRequest = new CreateAccessKeyRequest(); // CreateAccessKeyRequest | 
        try {
            ApiResponse<AccessKey> response = apiInstance.createAccessKeyWithHttpInfo(createAccessKeyRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#createAccessKey");
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
| **createAccessKeyRequest** | [**CreateAccessKeyRequest**](CreateAccessKeyRequest.md)|  | |

### Return type

ApiResponse<[**AccessKey**](AccessKey.md)>


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
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

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

## createApiKeyWithHttpInfo

> ApiResponse<IamApiKeyCreated> createApiKey createApiKeyWithHttpInfo(createApiKeyRequest)

Create a new API key

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        CreateApiKeyRequest createApiKeyRequest = new CreateApiKeyRequest(); // CreateApiKeyRequest | 
        try {
            ApiResponse<IamApiKeyCreated> response = apiInstance.createApiKeyWithHttpInfo(createApiKeyRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#createApiKey");
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
| **createApiKeyRequest** | [**CreateApiKeyRequest**](CreateApiKeyRequest.md)|  | |

### Return type

ApiResponse<[**IamApiKeyCreated**](IamApiKeyCreated.md)>


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
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

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

## createIamRoleWithHttpInfo

> ApiResponse<Operation> createIamRole createIamRoleWithHttpInfo(createIamRoleRequest)

Create IAM Role



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        CreateIamRoleRequest createIamRoleRequest = new CreateIamRoleRequest(); // CreateIamRoleRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.createIamRoleWithHttpInfo(createIamRoleRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#createIamRole");
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
| **createIamRoleRequest** | [**CreateIamRoleRequest**](CreateIamRoleRequest.md)|  | |

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


## deleteApiKey

> Operation deleteApiKey(id)

Delete an API key

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

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

## deleteApiKeyWithHttpInfo

> ApiResponse<Operation> deleteApiKey deleteApiKeyWithHttpInfo(id)

Delete an API key

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            ApiResponse<Operation> response = apiInstance.deleteApiKeyWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#deleteApiKey");
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
| **id** | **String**|  | |

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


## deleteIamRole

> Operation deleteIamRole(id)

Delete IAM Role



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

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

## deleteIamRoleWithHttpInfo

> ApiResponse<Operation> deleteIamRole deleteIamRoleWithHttpInfo(id)

Delete IAM Role



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Operation> response = apiInstance.deleteIamRoleWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#deleteIamRole");
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


## getAccessKey

> AccessKey getAccessKey(key)

Retrieve IAM Access Key details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

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

## getAccessKeyWithHttpInfo

> ApiResponse<AccessKey> getAccessKey getAccessKeyWithHttpInfo(key)

Retrieve IAM Access Key details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        String key = "key_example"; // String | 
        try {
            ApiResponse<AccessKey> response = apiInstance.getAccessKeyWithHttpInfo(key);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#getAccessKey");
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
| **key** | **String**|  | |

### Return type

ApiResponse<[**AccessKey**](AccessKey.md)>


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
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

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

## getApiKeyWithHttpInfo

> ApiResponse<IamApiKey> getApiKey getApiKeyWithHttpInfo(id)

Get API key

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            ApiResponse<IamApiKey> response = apiInstance.getApiKeyWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#getApiKey");
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
| **id** | **String**|  | |

### Return type

ApiResponse<[**IamApiKey**](IamApiKey.md)>


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
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

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

## getIamOrganizationPolicyWithHttpInfo

> ApiResponse<IamPolicy> getIamOrganizationPolicy getIamOrganizationPolicyWithHttpInfo()

Retrieve IAM Organization Policy



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        try {
            ApiResponse<IamPolicy> response = apiInstance.getIamOrganizationPolicyWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#getIamOrganizationPolicy");
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

ApiResponse<[**IamPolicy**](IamPolicy.md)>


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
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

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

## getIamRoleWithHttpInfo

> ApiResponse<IamRole> getIamRole getIamRoleWithHttpInfo(id)

Retrieve IAM Role



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<IamRole> response = apiInstance.getIamRoleWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#getIamRole");
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

ApiResponse<[**IamRole**](IamRole.md)>


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
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

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

## listAccessKeyKnownOperationsWithHttpInfo

> ApiResponse<ListAccessKeyKnownOperations200Response> listAccessKeyKnownOperations listAccessKeyKnownOperationsWithHttpInfo()

Retrieve all known available IAM Access Key operations and associated tags



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        try {
            ApiResponse<ListAccessKeyKnownOperations200Response> response = apiInstance.listAccessKeyKnownOperationsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#listAccessKeyKnownOperations");
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

ApiResponse<[**ListAccessKeyKnownOperations200Response**](ListAccessKeyKnownOperations200Response.md)>


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
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

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

## listAccessKeyOperationsWithHttpInfo

> ApiResponse<ListAccessKeyKnownOperations200Response> listAccessKeyOperations listAccessKeyOperationsWithHttpInfo()

Retrieve IAM Access Key operations and associated tags for the signing key



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        try {
            ApiResponse<ListAccessKeyKnownOperations200Response> response = apiInstance.listAccessKeyOperationsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#listAccessKeyOperations");
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

ApiResponse<[**ListAccessKeyKnownOperations200Response**](ListAccessKeyKnownOperations200Response.md)>


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
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

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

## listAccessKeysWithHttpInfo

> ApiResponse<ListAccessKeys200Response> listAccessKeys listAccessKeysWithHttpInfo()

List IAM Access Keys



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        try {
            ApiResponse<ListAccessKeys200Response> response = apiInstance.listAccessKeysWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#listAccessKeys");
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

ApiResponse<[**ListAccessKeys200Response**](ListAccessKeys200Response.md)>


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
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

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

## listApiKeysWithHttpInfo

> ApiResponse<ListApiKeys200Response> listApiKeys listApiKeysWithHttpInfo()

List API keys

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        try {
            ApiResponse<ListApiKeys200Response> response = apiInstance.listApiKeysWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#listApiKeys");
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

ApiResponse<[**ListApiKeys200Response**](ListApiKeys200Response.md)>


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
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

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

## listIamRolesWithHttpInfo

> ApiResponse<ListIamRoles200Response> listIamRoles listIamRolesWithHttpInfo()

List IAM Roles



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        try {
            ApiResponse<ListIamRoles200Response> response = apiInstance.listIamRolesWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#listIamRoles");
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

ApiResponse<[**ListIamRoles200Response**](ListIamRoles200Response.md)>


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
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

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

## revokeAccessKeyWithHttpInfo

> ApiResponse<Operation> revokeAccessKey revokeAccessKeyWithHttpInfo(key)

Revoke an IAM Access Key

This operation revokes the specified IAM Access Key. Access Keys created by the revoked Access Key will not be revoked.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        String key = "key_example"; // String | 
        try {
            ApiResponse<Operation> response = apiInstance.revokeAccessKeyWithHttpInfo(key);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#revokeAccessKey");
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
| **key** | **String**|  | |

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


## updateIamOrganizationPolicy

> Operation updateIamOrganizationPolicy(iamPolicy)

Update IAM Organization Policy



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

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

## updateIamOrganizationPolicyWithHttpInfo

> ApiResponse<Operation> updateIamOrganizationPolicy updateIamOrganizationPolicyWithHttpInfo(iamPolicy)

Update IAM Organization Policy



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        IamPolicy iamPolicy = new IamPolicy(); // IamPolicy | 
        try {
            ApiResponse<Operation> response = apiInstance.updateIamOrganizationPolicyWithHttpInfo(iamPolicy);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#updateIamOrganizationPolicy");
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
| **iamPolicy** | [**IamPolicy**](IamPolicy.md)|  | |

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


## updateIamRole

> Operation updateIamRole(id, updateIamRoleRequest)

Update IAM Role



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

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

## updateIamRoleWithHttpInfo

> ApiResponse<Operation> updateIamRole updateIamRoleWithHttpInfo(id, updateIamRoleRequest)

Update IAM Role



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateIamRoleRequest updateIamRoleRequest = new UpdateIamRoleRequest(); // UpdateIamRoleRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.updateIamRoleWithHttpInfo(id, updateIamRoleRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#updateIamRole");
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
| **updateIamRoleRequest** | [**UpdateIamRoleRequest**](UpdateIamRoleRequest.md)|  | |

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


## updateIamRolePolicy

> Operation updateIamRolePolicy(id, iamPolicy)

Update IAM Role Policy



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

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

## updateIamRolePolicyWithHttpInfo

> ApiResponse<Operation> updateIamRolePolicy updateIamRolePolicyWithHttpInfo(id, iamPolicy)

Update IAM Role Policy



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        IamApi apiInstance = new IamApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        IamPolicy iamPolicy = new IamPolicy(); // IamPolicy | 
        try {
            ApiResponse<Operation> response = apiInstance.updateIamRolePolicyWithHttpInfo(id, iamPolicy);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IamApi#updateIamRolePolicy");
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
| **iamPolicy** | [**IamPolicy**](IamPolicy.md)|  | |

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

