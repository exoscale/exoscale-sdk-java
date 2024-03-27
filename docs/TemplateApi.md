# TemplateApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**copyTemplate**](TemplateApi.md#copyTemplate) | **POST** /template/{id} | Copy a Template from a zone to another |
| [**copyTemplateWithHttpInfo**](TemplateApi.md#copyTemplateWithHttpInfo) | **POST** /template/{id} | Copy a Template from a zone to another |
| [**deleteTemplate**](TemplateApi.md#deleteTemplate) | **DELETE** /template/{id} | Delete a Template |
| [**deleteTemplateWithHttpInfo**](TemplateApi.md#deleteTemplateWithHttpInfo) | **DELETE** /template/{id} | Delete a Template |
| [**getTemplate**](TemplateApi.md#getTemplate) | **GET** /template/{id} | Retrieve Template details |
| [**getTemplateWithHttpInfo**](TemplateApi.md#getTemplateWithHttpInfo) | **GET** /template/{id} | Retrieve Template details |
| [**listTemplates**](TemplateApi.md#listTemplates) | **GET** /template | List Templates |
| [**listTemplatesWithHttpInfo**](TemplateApi.md#listTemplatesWithHttpInfo) | **GET** /template | List Templates |
| [**promoteSnapshotToTemplate**](TemplateApi.md#promoteSnapshotToTemplate) | **POST** /snapshot/{id}:promote | Promote a Snapshot to a Template |
| [**promoteSnapshotToTemplateWithHttpInfo**](TemplateApi.md#promoteSnapshotToTemplateWithHttpInfo) | **POST** /snapshot/{id}:promote | Promote a Snapshot to a Template |
| [**registerTemplate**](TemplateApi.md#registerTemplate) | **POST** /template | Register a Template |
| [**registerTemplateWithHttpInfo**](TemplateApi.md#registerTemplateWithHttpInfo) | **POST** /template | Register a Template |
| [**updateTemplate**](TemplateApi.md#updateTemplate) | **PUT** /template/{id} | Update template attributes |
| [**updateTemplateWithHttpInfo**](TemplateApi.md#updateTemplateWithHttpInfo) | **PUT** /template/{id} | Update template attributes |



## copyTemplate

> Operation copyTemplate(id, copyTemplateRequest)

Copy a Template from a zone to another



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        CopyTemplateRequest copyTemplateRequest = new CopyTemplateRequest(); // CopyTemplateRequest | 
        try {
            Operation result = apiInstance.copyTemplate(id, copyTemplateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#copyTemplate");
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
| **copyTemplateRequest** | [**CopyTemplateRequest**](CopyTemplateRequest.md)|  | |

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

## copyTemplateWithHttpInfo

> ApiResponse<Operation> copyTemplate copyTemplateWithHttpInfo(id, copyTemplateRequest)

Copy a Template from a zone to another



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        CopyTemplateRequest copyTemplateRequest = new CopyTemplateRequest(); // CopyTemplateRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.copyTemplateWithHttpInfo(id, copyTemplateRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#copyTemplate");
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
| **copyTemplateRequest** | [**CopyTemplateRequest**](CopyTemplateRequest.md)|  | |

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


## deleteTemplate

> Operation deleteTemplate(id)

Delete a Template



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            Operation result = apiInstance.deleteTemplate(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#deleteTemplate");
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

## deleteTemplateWithHttpInfo

> ApiResponse<Operation> deleteTemplate deleteTemplateWithHttpInfo(id)

Delete a Template



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Operation> response = apiInstance.deleteTemplateWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#deleteTemplate");
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


## getTemplate

> Template getTemplate(id)

Retrieve Template details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            Template result = apiInstance.getTemplate(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#getTemplate");
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

[**Template**](Template.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## getTemplateWithHttpInfo

> ApiResponse<Template> getTemplate getTemplateWithHttpInfo(id)

Retrieve Template details



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Template> response = apiInstance.getTemplateWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#getTemplate");
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

ApiResponse<[**Template**](Template.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## listTemplates

> ListTemplates200Response listTemplates(visibility, family)

List Templates



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        String visibility = "private"; // String | 
        String family = "family_example"; // String | 
        try {
            ListTemplates200Response result = apiInstance.listTemplates(visibility, family);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#listTemplates");
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
| **family** | **String**|  | [optional] |

### Return type

[**ListTemplates200Response**](ListTemplates200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## listTemplatesWithHttpInfo

> ApiResponse<ListTemplates200Response> listTemplates listTemplatesWithHttpInfo(visibility, family)

List Templates



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        String visibility = "private"; // String | 
        String family = "family_example"; // String | 
        try {
            ApiResponse<ListTemplates200Response> response = apiInstance.listTemplatesWithHttpInfo(visibility, family);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#listTemplates");
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
| **family** | **String**|  | [optional] |

### Return type

ApiResponse<[**ListTemplates200Response**](ListTemplates200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## promoteSnapshotToTemplate

> Operation promoteSnapshotToTemplate(id, promoteSnapshotToTemplateRequest)

Promote a Snapshot to a Template



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        PromoteSnapshotToTemplateRequest promoteSnapshotToTemplateRequest = new PromoteSnapshotToTemplateRequest(); // PromoteSnapshotToTemplateRequest | 
        try {
            Operation result = apiInstance.promoteSnapshotToTemplate(id, promoteSnapshotToTemplateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#promoteSnapshotToTemplate");
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
| **promoteSnapshotToTemplateRequest** | [**PromoteSnapshotToTemplateRequest**](PromoteSnapshotToTemplateRequest.md)|  | |

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

## promoteSnapshotToTemplateWithHttpInfo

> ApiResponse<Operation> promoteSnapshotToTemplate promoteSnapshotToTemplateWithHttpInfo(id, promoteSnapshotToTemplateRequest)

Promote a Snapshot to a Template



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        PromoteSnapshotToTemplateRequest promoteSnapshotToTemplateRequest = new PromoteSnapshotToTemplateRequest(); // PromoteSnapshotToTemplateRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.promoteSnapshotToTemplateWithHttpInfo(id, promoteSnapshotToTemplateRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#promoteSnapshotToTemplate");
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
| **promoteSnapshotToTemplateRequest** | [**PromoteSnapshotToTemplateRequest**](PromoteSnapshotToTemplateRequest.md)|  | |

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


## registerTemplate

> Operation registerTemplate(registerTemplateRequest)

Register a Template



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        RegisterTemplateRequest registerTemplateRequest = new RegisterTemplateRequest(); // RegisterTemplateRequest | 
        try {
            Operation result = apiInstance.registerTemplate(registerTemplateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#registerTemplate");
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
| **registerTemplateRequest** | [**RegisterTemplateRequest**](RegisterTemplateRequest.md)|  | |

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

## registerTemplateWithHttpInfo

> ApiResponse<Operation> registerTemplate registerTemplateWithHttpInfo(registerTemplateRequest)

Register a Template



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        RegisterTemplateRequest registerTemplateRequest = new RegisterTemplateRequest(); // RegisterTemplateRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.registerTemplateWithHttpInfo(registerTemplateRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#registerTemplate");
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
| **registerTemplateRequest** | [**RegisterTemplateRequest**](RegisterTemplateRequest.md)|  | |

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


## updateTemplate

> Operation updateTemplate(id, updateTemplateRequest)

Update template attributes



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateTemplateRequest updateTemplateRequest = new UpdateTemplateRequest(); // UpdateTemplateRequest | 
        try {
            Operation result = apiInstance.updateTemplate(id, updateTemplateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#updateTemplate");
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
| **updateTemplateRequest** | [**UpdateTemplateRequest**](UpdateTemplateRequest.md)|  | |

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

## updateTemplateWithHttpInfo

> ApiResponse<Operation> updateTemplate updateTemplateWithHttpInfo(id, updateTemplateRequest)

Update template attributes



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        TemplateApi apiInstance = new TemplateApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateTemplateRequest updateTemplateRequest = new UpdateTemplateRequest(); // UpdateTemplateRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.updateTemplateWithHttpInfo(id, updateTemplateRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplateApi#updateTemplate");
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
| **updateTemplateRequest** | [**UpdateTemplateRequest**](UpdateTemplateRequest.md)|  | |

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

