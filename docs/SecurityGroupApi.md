# SecurityGroupApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addExternalSourceToSecurityGroup**](SecurityGroupApi.md#addExternalSourceToSecurityGroup) | **PUT** /security-group/{id}:add-source | Add an external source as a member of a Security Group |
| [**addExternalSourceToSecurityGroupWithHttpInfo**](SecurityGroupApi.md#addExternalSourceToSecurityGroupWithHttpInfo) | **PUT** /security-group/{id}:add-source | Add an external source as a member of a Security Group |
| [**addRuleToSecurityGroup**](SecurityGroupApi.md#addRuleToSecurityGroup) | **POST** /security-group/{id}/rules | Create a Security Group rule |
| [**addRuleToSecurityGroupWithHttpInfo**](SecurityGroupApi.md#addRuleToSecurityGroupWithHttpInfo) | **POST** /security-group/{id}/rules | Create a Security Group rule |
| [**attachInstanceToSecurityGroup**](SecurityGroupApi.md#attachInstanceToSecurityGroup) | **PUT** /security-group/{id}:attach | Attach a Compute instance to a Security Group |
| [**attachInstanceToSecurityGroupWithHttpInfo**](SecurityGroupApi.md#attachInstanceToSecurityGroupWithHttpInfo) | **PUT** /security-group/{id}:attach | Attach a Compute instance to a Security Group |
| [**createSecurityGroup**](SecurityGroupApi.md#createSecurityGroup) | **POST** /security-group | Create a Security Group |
| [**createSecurityGroupWithHttpInfo**](SecurityGroupApi.md#createSecurityGroupWithHttpInfo) | **POST** /security-group | Create a Security Group |
| [**deleteRuleFromSecurityGroup**](SecurityGroupApi.md#deleteRuleFromSecurityGroup) | **DELETE** /security-group/{id}/rules/{rule-id} | Delete a Security Group rule |
| [**deleteRuleFromSecurityGroupWithHttpInfo**](SecurityGroupApi.md#deleteRuleFromSecurityGroupWithHttpInfo) | **DELETE** /security-group/{id}/rules/{rule-id} | Delete a Security Group rule |
| [**deleteSecurityGroup**](SecurityGroupApi.md#deleteSecurityGroup) | **DELETE** /security-group/{id} | Delete a Security Group |
| [**deleteSecurityGroupWithHttpInfo**](SecurityGroupApi.md#deleteSecurityGroupWithHttpInfo) | **DELETE** /security-group/{id} | Delete a Security Group |
| [**detachInstanceFromSecurityGroup**](SecurityGroupApi.md#detachInstanceFromSecurityGroup) | **PUT** /security-group/{id}:detach | Detach a Compute instance from a Security Group |
| [**detachInstanceFromSecurityGroupWithHttpInfo**](SecurityGroupApi.md#detachInstanceFromSecurityGroupWithHttpInfo) | **PUT** /security-group/{id}:detach | Detach a Compute instance from a Security Group |
| [**getSecurityGroup**](SecurityGroupApi.md#getSecurityGroup) | **GET** /security-group/{id} | Retrieve Security Group details |
| [**getSecurityGroupWithHttpInfo**](SecurityGroupApi.md#getSecurityGroupWithHttpInfo) | **GET** /security-group/{id} | Retrieve Security Group details |
| [**listSecurityGroups**](SecurityGroupApi.md#listSecurityGroups) | **GET** /security-group | List Security Groups. |
| [**listSecurityGroupsWithHttpInfo**](SecurityGroupApi.md#listSecurityGroupsWithHttpInfo) | **GET** /security-group | List Security Groups. |
| [**removeExternalSourceFromSecurityGroup**](SecurityGroupApi.md#removeExternalSourceFromSecurityGroup) | **PUT** /security-group/{id}:remove-source | Remove an external source from a Security Group |
| [**removeExternalSourceFromSecurityGroupWithHttpInfo**](SecurityGroupApi.md#removeExternalSourceFromSecurityGroupWithHttpInfo) | **PUT** /security-group/{id}:remove-source | Remove an external source from a Security Group |



## addExternalSourceToSecurityGroup

> Operation addExternalSourceToSecurityGroup(id, addExternalSourceToSecurityGroupRequest)

Add an external source as a member of a Security Group



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SecurityGroupApi apiInstance = new SecurityGroupApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        AddExternalSourceToSecurityGroupRequest addExternalSourceToSecurityGroupRequest = new AddExternalSourceToSecurityGroupRequest(); // AddExternalSourceToSecurityGroupRequest | 
        try {
            Operation result = apiInstance.addExternalSourceToSecurityGroup(id, addExternalSourceToSecurityGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityGroupApi#addExternalSourceToSecurityGroup");
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
| **addExternalSourceToSecurityGroupRequest** | [**AddExternalSourceToSecurityGroupRequest**](AddExternalSourceToSecurityGroupRequest.md)|  | |

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

## addExternalSourceToSecurityGroupWithHttpInfo

> ApiResponse<Operation> addExternalSourceToSecurityGroup addExternalSourceToSecurityGroupWithHttpInfo(id, addExternalSourceToSecurityGroupRequest)

Add an external source as a member of a Security Group



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SecurityGroupApi apiInstance = new SecurityGroupApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        AddExternalSourceToSecurityGroupRequest addExternalSourceToSecurityGroupRequest = new AddExternalSourceToSecurityGroupRequest(); // AddExternalSourceToSecurityGroupRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.addExternalSourceToSecurityGroupWithHttpInfo(id, addExternalSourceToSecurityGroupRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityGroupApi#addExternalSourceToSecurityGroup");
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
| **addExternalSourceToSecurityGroupRequest** | [**AddExternalSourceToSecurityGroupRequest**](AddExternalSourceToSecurityGroupRequest.md)|  | |

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


## addRuleToSecurityGroup

> Operation addRuleToSecurityGroup(id, addRuleToSecurityGroupRequest)

Create a Security Group rule



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SecurityGroupApi apiInstance = new SecurityGroupApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        AddRuleToSecurityGroupRequest addRuleToSecurityGroupRequest = new AddRuleToSecurityGroupRequest(); // AddRuleToSecurityGroupRequest | 
        try {
            Operation result = apiInstance.addRuleToSecurityGroup(id, addRuleToSecurityGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityGroupApi#addRuleToSecurityGroup");
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
| **addRuleToSecurityGroupRequest** | [**AddRuleToSecurityGroupRequest**](AddRuleToSecurityGroupRequest.md)|  | |

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

## addRuleToSecurityGroupWithHttpInfo

> ApiResponse<Operation> addRuleToSecurityGroup addRuleToSecurityGroupWithHttpInfo(id, addRuleToSecurityGroupRequest)

Create a Security Group rule



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SecurityGroupApi apiInstance = new SecurityGroupApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        AddRuleToSecurityGroupRequest addRuleToSecurityGroupRequest = new AddRuleToSecurityGroupRequest(); // AddRuleToSecurityGroupRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.addRuleToSecurityGroupWithHttpInfo(id, addRuleToSecurityGroupRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityGroupApi#addRuleToSecurityGroup");
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
| **addRuleToSecurityGroupRequest** | [**AddRuleToSecurityGroupRequest**](AddRuleToSecurityGroupRequest.md)|  | |

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


## attachInstanceToSecurityGroup

> Operation attachInstanceToSecurityGroup(id, detachInstanceFromPrivateNetworkRequest)

Attach a Compute instance to a Security Group



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SecurityGroupApi apiInstance = new SecurityGroupApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest = new DetachInstanceFromPrivateNetworkRequest(); // DetachInstanceFromPrivateNetworkRequest | 
        try {
            Operation result = apiInstance.attachInstanceToSecurityGroup(id, detachInstanceFromPrivateNetworkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityGroupApi#attachInstanceToSecurityGroup");
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
| **detachInstanceFromPrivateNetworkRequest** | [**DetachInstanceFromPrivateNetworkRequest**](DetachInstanceFromPrivateNetworkRequest.md)|  | |

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

## attachInstanceToSecurityGroupWithHttpInfo

> ApiResponse<Operation> attachInstanceToSecurityGroup attachInstanceToSecurityGroupWithHttpInfo(id, detachInstanceFromPrivateNetworkRequest)

Attach a Compute instance to a Security Group



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SecurityGroupApi apiInstance = new SecurityGroupApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest = new DetachInstanceFromPrivateNetworkRequest(); // DetachInstanceFromPrivateNetworkRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.attachInstanceToSecurityGroupWithHttpInfo(id, detachInstanceFromPrivateNetworkRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityGroupApi#attachInstanceToSecurityGroup");
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
| **detachInstanceFromPrivateNetworkRequest** | [**DetachInstanceFromPrivateNetworkRequest**](DetachInstanceFromPrivateNetworkRequest.md)|  | |

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


## createSecurityGroup

> Operation createSecurityGroup(createSecurityGroupRequest)

Create a Security Group



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SecurityGroupApi apiInstance = new SecurityGroupApi(defaultClient);
        CreateSecurityGroupRequest createSecurityGroupRequest = new CreateSecurityGroupRequest(); // CreateSecurityGroupRequest | 
        try {
            Operation result = apiInstance.createSecurityGroup(createSecurityGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityGroupApi#createSecurityGroup");
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
| **createSecurityGroupRequest** | [**CreateSecurityGroupRequest**](CreateSecurityGroupRequest.md)|  | |

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

## createSecurityGroupWithHttpInfo

> ApiResponse<Operation> createSecurityGroup createSecurityGroupWithHttpInfo(createSecurityGroupRequest)

Create a Security Group



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SecurityGroupApi apiInstance = new SecurityGroupApi(defaultClient);
        CreateSecurityGroupRequest createSecurityGroupRequest = new CreateSecurityGroupRequest(); // CreateSecurityGroupRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.createSecurityGroupWithHttpInfo(createSecurityGroupRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityGroupApi#createSecurityGroup");
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
| **createSecurityGroupRequest** | [**CreateSecurityGroupRequest**](CreateSecurityGroupRequest.md)|  | |

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


## deleteRuleFromSecurityGroup

> Operation deleteRuleFromSecurityGroup(id, ruleId)

Delete a Security Group rule



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SecurityGroupApi apiInstance = new SecurityGroupApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UUID ruleId = UUID.randomUUID(); // UUID | 
        try {
            Operation result = apiInstance.deleteRuleFromSecurityGroup(id, ruleId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityGroupApi#deleteRuleFromSecurityGroup");
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
| **ruleId** | **UUID**|  | |

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

## deleteRuleFromSecurityGroupWithHttpInfo

> ApiResponse<Operation> deleteRuleFromSecurityGroup deleteRuleFromSecurityGroupWithHttpInfo(id, ruleId)

Delete a Security Group rule



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SecurityGroupApi apiInstance = new SecurityGroupApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UUID ruleId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Operation> response = apiInstance.deleteRuleFromSecurityGroupWithHttpInfo(id, ruleId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityGroupApi#deleteRuleFromSecurityGroup");
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
| **ruleId** | **UUID**|  | |

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


## deleteSecurityGroup

> Operation deleteSecurityGroup(id)

Delete a Security Group



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SecurityGroupApi apiInstance = new SecurityGroupApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            Operation result = apiInstance.deleteSecurityGroup(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityGroupApi#deleteSecurityGroup");
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

## deleteSecurityGroupWithHttpInfo

> ApiResponse<Operation> deleteSecurityGroup deleteSecurityGroupWithHttpInfo(id)

Delete a Security Group



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SecurityGroupApi apiInstance = new SecurityGroupApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Operation> response = apiInstance.deleteSecurityGroupWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityGroupApi#deleteSecurityGroup");
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


## detachInstanceFromSecurityGroup

> Operation detachInstanceFromSecurityGroup(id, detachInstanceFromPrivateNetworkRequest)

Detach a Compute instance from a Security Group



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SecurityGroupApi apiInstance = new SecurityGroupApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest = new DetachInstanceFromPrivateNetworkRequest(); // DetachInstanceFromPrivateNetworkRequest | 
        try {
            Operation result = apiInstance.detachInstanceFromSecurityGroup(id, detachInstanceFromPrivateNetworkRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityGroupApi#detachInstanceFromSecurityGroup");
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
| **detachInstanceFromPrivateNetworkRequest** | [**DetachInstanceFromPrivateNetworkRequest**](DetachInstanceFromPrivateNetworkRequest.md)|  | |

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

## detachInstanceFromSecurityGroupWithHttpInfo

> ApiResponse<Operation> detachInstanceFromSecurityGroup detachInstanceFromSecurityGroupWithHttpInfo(id, detachInstanceFromPrivateNetworkRequest)

Detach a Compute instance from a Security Group



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SecurityGroupApi apiInstance = new SecurityGroupApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest = new DetachInstanceFromPrivateNetworkRequest(); // DetachInstanceFromPrivateNetworkRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.detachInstanceFromSecurityGroupWithHttpInfo(id, detachInstanceFromPrivateNetworkRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityGroupApi#detachInstanceFromSecurityGroup");
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
| **detachInstanceFromPrivateNetworkRequest** | [**DetachInstanceFromPrivateNetworkRequest**](DetachInstanceFromPrivateNetworkRequest.md)|  | |

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


## getSecurityGroup

> SecurityGroup getSecurityGroup(id)

Retrieve Security Group details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SecurityGroupApi apiInstance = new SecurityGroupApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            SecurityGroup result = apiInstance.getSecurityGroup(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityGroupApi#getSecurityGroup");
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

[**SecurityGroup**](SecurityGroup.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## getSecurityGroupWithHttpInfo

> ApiResponse<SecurityGroup> getSecurityGroup getSecurityGroupWithHttpInfo(id)

Retrieve Security Group details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SecurityGroupApi apiInstance = new SecurityGroupApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<SecurityGroup> response = apiInstance.getSecurityGroupWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityGroupApi#getSecurityGroup");
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

ApiResponse<[**SecurityGroup**](SecurityGroup.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listSecurityGroups

> ListSecurityGroups200Response listSecurityGroups(visibility)

List Security Groups.

Lists security groups. When visibility is set to public, lists public security groups. Public security groups are objects maintained by Exoscale which contain source addresses for relevant services hosted by Exoscale. They can be used a source in ingress rules and as a destination in egress rules.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SecurityGroupApi apiInstance = new SecurityGroupApi(defaultClient);
        String visibility = "private"; // String | 
        try {
            ListSecurityGroups200Response result = apiInstance.listSecurityGroups(visibility);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityGroupApi#listSecurityGroups");
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
| **visibility** | **String**|  | [optional] [enum: private, public] |

### Return type

[**ListSecurityGroups200Response**](ListSecurityGroups200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## listSecurityGroupsWithHttpInfo

> ApiResponse<ListSecurityGroups200Response> listSecurityGroups listSecurityGroupsWithHttpInfo(visibility)

List Security Groups.

Lists security groups. When visibility is set to public, lists public security groups. Public security groups are objects maintained by Exoscale which contain source addresses for relevant services hosted by Exoscale. They can be used a source in ingress rules and as a destination in egress rules.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SecurityGroupApi apiInstance = new SecurityGroupApi(defaultClient);
        String visibility = "private"; // String | 
        try {
            ApiResponse<ListSecurityGroups200Response> response = apiInstance.listSecurityGroupsWithHttpInfo(visibility);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityGroupApi#listSecurityGroups");
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
| **visibility** | **String**|  | [optional] [enum: private, public] |

### Return type

ApiResponse<[**ListSecurityGroups200Response**](ListSecurityGroups200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## removeExternalSourceFromSecurityGroup

> Operation removeExternalSourceFromSecurityGroup(id, removeExternalSourceFromSecurityGroupRequest)

Remove an external source from a Security Group



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SecurityGroupApi apiInstance = new SecurityGroupApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        RemoveExternalSourceFromSecurityGroupRequest removeExternalSourceFromSecurityGroupRequest = new RemoveExternalSourceFromSecurityGroupRequest(); // RemoveExternalSourceFromSecurityGroupRequest | 
        try {
            Operation result = apiInstance.removeExternalSourceFromSecurityGroup(id, removeExternalSourceFromSecurityGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityGroupApi#removeExternalSourceFromSecurityGroup");
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
| **removeExternalSourceFromSecurityGroupRequest** | [**RemoveExternalSourceFromSecurityGroupRequest**](RemoveExternalSourceFromSecurityGroupRequest.md)|  | |

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

## removeExternalSourceFromSecurityGroupWithHttpInfo

> ApiResponse<Operation> removeExternalSourceFromSecurityGroup removeExternalSourceFromSecurityGroupWithHttpInfo(id, removeExternalSourceFromSecurityGroupRequest)

Remove an external source from a Security Group



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SecurityGroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        SecurityGroupApi apiInstance = new SecurityGroupApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        RemoveExternalSourceFromSecurityGroupRequest removeExternalSourceFromSecurityGroupRequest = new RemoveExternalSourceFromSecurityGroupRequest(); // RemoveExternalSourceFromSecurityGroupRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.removeExternalSourceFromSecurityGroupWithHttpInfo(id, removeExternalSourceFromSecurityGroupRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityGroupApi#removeExternalSourceFromSecurityGroup");
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
| **removeExternalSourceFromSecurityGroupRequest** | [**RemoveExternalSourceFromSecurityGroupRequest**](RemoveExternalSourceFromSecurityGroupRequest.md)|  | |

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

