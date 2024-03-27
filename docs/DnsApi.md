# DnsApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDnsDomain**](DnsApi.md#createDnsDomain) | **POST** /dns-domain | Create DNS domain |
| [**createDnsDomainRecord**](DnsApi.md#createDnsDomainRecord) | **POST** /dns-domain/{domain-id}/record | Create DNS domain record |
| [**deleteDnsDomain**](DnsApi.md#deleteDnsDomain) | **DELETE** /dns-domain/{id} | Delete DNS Domain |
| [**deleteDnsDomainRecord**](DnsApi.md#deleteDnsDomainRecord) | **DELETE** /dns-domain/{domain-id}/record/{record-id} | Delete DNS domain record |
| [**getDnsDomain**](DnsApi.md#getDnsDomain) | **GET** /dns-domain/{id} | Retrieve DNS domain details |
| [**getDnsDomainRecord**](DnsApi.md#getDnsDomainRecord) | **GET** /dns-domain/{domain-id}/record/{record-id} | Retrieve DNS domain record details |
| [**getDnsDomainZoneFile**](DnsApi.md#getDnsDomainZoneFile) | **GET** /dns-domain/{id}/zone | Retrieve DNS domain zone file |
| [**listDnsDomainRecords**](DnsApi.md#listDnsDomainRecords) | **GET** /dns-domain/{domain-id}/record | List DNS domain records |
| [**listDnsDomains**](DnsApi.md#listDnsDomains) | **GET** /dns-domain | List DNS domains |
| [**updateDnsDomainRecord**](DnsApi.md#updateDnsDomainRecord) | **PUT** /dns-domain/{domain-id}/record/{record-id} | Update DNS domain record |


<a id="createDnsDomain"></a>
# **createDnsDomain**
> DnsDomain createDnsDomain(createDnsDomainRequest)

Create DNS domain



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DnsApi apiInstance = new DnsApi(defaultClient);
    CreateDnsDomainRequest createDnsDomainRequest = new CreateDnsDomainRequest(); // CreateDnsDomainRequest | 
    try {
      DnsDomain result = apiInstance.createDnsDomain(createDnsDomainRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsApi#createDnsDomain");
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
| **createDnsDomainRequest** | [**CreateDnsDomainRequest**](CreateDnsDomainRequest.md)|  | |

### Return type

[**DnsDomain**](DnsDomain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="createDnsDomainRecord"></a>
# **createDnsDomainRecord**
> Operation createDnsDomainRecord(domainId, createDnsDomainRecordRequest)

Create DNS domain record



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DnsApi apiInstance = new DnsApi(defaultClient);
    UUID domainId = UUID.randomUUID(); // UUID | 
    CreateDnsDomainRecordRequest createDnsDomainRecordRequest = new CreateDnsDomainRecordRequest(); // CreateDnsDomainRecordRequest | 
    try {
      Operation result = apiInstance.createDnsDomainRecord(domainId, createDnsDomainRecordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsApi#createDnsDomainRecord");
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
| **domainId** | **UUID**|  | |
| **createDnsDomainRecordRequest** | [**CreateDnsDomainRecordRequest**](CreateDnsDomainRecordRequest.md)|  | |

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

<a id="deleteDnsDomain"></a>
# **deleteDnsDomain**
> Operation deleteDnsDomain(id)

Delete DNS Domain



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DnsApi apiInstance = new DnsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      Operation result = apiInstance.deleteDnsDomain(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsApi#deleteDnsDomain");
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

<a id="deleteDnsDomainRecord"></a>
# **deleteDnsDomainRecord**
> Operation deleteDnsDomainRecord(domainId, recordId)

Delete DNS domain record



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DnsApi apiInstance = new DnsApi(defaultClient);
    UUID domainId = UUID.randomUUID(); // UUID | 
    UUID recordId = UUID.randomUUID(); // UUID | 
    try {
      Operation result = apiInstance.deleteDnsDomainRecord(domainId, recordId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsApi#deleteDnsDomainRecord");
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
| **domainId** | **UUID**|  | |
| **recordId** | **UUID**|  | |

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

<a id="getDnsDomain"></a>
# **getDnsDomain**
> DnsDomain getDnsDomain(id)

Retrieve DNS domain details



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DnsApi apiInstance = new DnsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      DnsDomain result = apiInstance.getDnsDomain(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsApi#getDnsDomain");
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

[**DnsDomain**](DnsDomain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="getDnsDomainRecord"></a>
# **getDnsDomainRecord**
> DnsDomainRecord getDnsDomainRecord(domainId, recordId)

Retrieve DNS domain record details



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DnsApi apiInstance = new DnsApi(defaultClient);
    UUID domainId = UUID.randomUUID(); // UUID | 
    UUID recordId = UUID.randomUUID(); // UUID | 
    try {
      DnsDomainRecord result = apiInstance.getDnsDomainRecord(domainId, recordId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsApi#getDnsDomainRecord");
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
| **domainId** | **UUID**|  | |
| **recordId** | **UUID**|  | |

### Return type

[**DnsDomainRecord**](DnsDomainRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="getDnsDomainZoneFile"></a>
# **getDnsDomainZoneFile**
> GetDnsDomainZoneFile200Response getDnsDomainZoneFile(id)

Retrieve DNS domain zone file



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DnsApi apiInstance = new DnsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      GetDnsDomainZoneFile200Response result = apiInstance.getDnsDomainZoneFile(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsApi#getDnsDomainZoneFile");
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

[**GetDnsDomainZoneFile200Response**](GetDnsDomainZoneFile200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="listDnsDomainRecords"></a>
# **listDnsDomainRecords**
> ListDnsDomainRecords200Response listDnsDomainRecords(domainId)

List DNS domain records



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DnsApi apiInstance = new DnsApi(defaultClient);
    UUID domainId = UUID.randomUUID(); // UUID | 
    try {
      ListDnsDomainRecords200Response result = apiInstance.listDnsDomainRecords(domainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsApi#listDnsDomainRecords");
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
| **domainId** | **UUID**|  | |

### Return type

[**ListDnsDomainRecords200Response**](ListDnsDomainRecords200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="listDnsDomains"></a>
# **listDnsDomains**
> ListDnsDomains200Response listDnsDomains()

List DNS domains



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DnsApi apiInstance = new DnsApi(defaultClient);
    try {
      ListDnsDomains200Response result = apiInstance.listDnsDomains();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsApi#listDnsDomains");
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

[**ListDnsDomains200Response**](ListDnsDomains200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a id="updateDnsDomainRecord"></a>
# **updateDnsDomainRecord**
> Operation updateDnsDomainRecord(domainId, recordId, updateDnsDomainRecordRequest)

Update DNS domain record



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

    DnsApi apiInstance = new DnsApi(defaultClient);
    UUID domainId = UUID.randomUUID(); // UUID | 
    UUID recordId = UUID.randomUUID(); // UUID | 
    UpdateDnsDomainRecordRequest updateDnsDomainRecordRequest = new UpdateDnsDomainRecordRequest(); // UpdateDnsDomainRecordRequest | 
    try {
      Operation result = apiInstance.updateDnsDomainRecord(domainId, recordId, updateDnsDomainRecordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DnsApi#updateDnsDomainRecord");
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
| **domainId** | **UUID**|  | |
| **recordId** | **UUID**|  | |
| **updateDnsDomainRecordRequest** | [**UpdateDnsDomainRecordRequest**](UpdateDnsDomainRecordRequest.md)|  | |

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

