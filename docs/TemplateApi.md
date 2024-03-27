# TemplateApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**copyTemplate**](TemplateApi.md#copyTemplate) | **POST** /template/{id} | Copy a Template from a zone to another |
| [**deleteTemplate**](TemplateApi.md#deleteTemplate) | **DELETE** /template/{id} | Delete a Template |
| [**getTemplate**](TemplateApi.md#getTemplate) | **GET** /template/{id} | Retrieve Template details |
| [**listTemplates**](TemplateApi.md#listTemplates) | **GET** /template | List Templates |
| [**promoteSnapshotToTemplate**](TemplateApi.md#promoteSnapshotToTemplate) | **POST** /snapshot/{id}:promote | Promote a Snapshot to a Template |
| [**registerTemplate**](TemplateApi.md#registerTemplate) | **POST** /template | Register a Template |
| [**updateTemplate**](TemplateApi.md#updateTemplate) | **PUT** /template/{id} | Update template attributes |


<a id="copyTemplate"></a>
# **copyTemplate**
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

<a id="deleteTemplate"></a>
# **deleteTemplate**
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

<a id="getTemplate"></a>
# **getTemplate**
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

<a id="listTemplates"></a>
# **listTemplates**
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

<a id="promoteSnapshotToTemplate"></a>
# **promoteSnapshotToTemplate**
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

<a id="registerTemplate"></a>
# **registerTemplate**
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

<a id="updateTemplate"></a>
# **updateTemplate**
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

