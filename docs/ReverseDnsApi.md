# ReverseDnsApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteReverseDnsElasticIp**](ReverseDnsApi.md#deleteReverseDnsElasticIp) | **DELETE** /reverse-dns/elastic-ip/{id} | Delete the PTR DNS record for an elastic IP |
| [**deleteReverseDnsElasticIpWithHttpInfo**](ReverseDnsApi.md#deleteReverseDnsElasticIpWithHttpInfo) | **DELETE** /reverse-dns/elastic-ip/{id} | Delete the PTR DNS record for an elastic IP |
| [**deleteReverseDnsInstance**](ReverseDnsApi.md#deleteReverseDnsInstance) | **DELETE** /reverse-dns/instance/{id} | Delete the PTR DNS record for an instance |
| [**deleteReverseDnsInstanceWithHttpInfo**](ReverseDnsApi.md#deleteReverseDnsInstanceWithHttpInfo) | **DELETE** /reverse-dns/instance/{id} | Delete the PTR DNS record for an instance |
| [**getReverseDnsElasticIp**](ReverseDnsApi.md#getReverseDnsElasticIp) | **GET** /reverse-dns/elastic-ip/{id} | Query the PTR DNS records for an elastic IP |
| [**getReverseDnsElasticIpWithHttpInfo**](ReverseDnsApi.md#getReverseDnsElasticIpWithHttpInfo) | **GET** /reverse-dns/elastic-ip/{id} | Query the PTR DNS records for an elastic IP |
| [**getReverseDnsInstance**](ReverseDnsApi.md#getReverseDnsInstance) | **GET** /reverse-dns/instance/{id} | Query the PTR DNS records for an instance |
| [**getReverseDnsInstanceWithHttpInfo**](ReverseDnsApi.md#getReverseDnsInstanceWithHttpInfo) | **GET** /reverse-dns/instance/{id} | Query the PTR DNS records for an instance |
| [**updateReverseDnsElasticIp**](ReverseDnsApi.md#updateReverseDnsElasticIp) | **POST** /reverse-dns/elastic-ip/{id} | Update/Create the PTR DNS record for an elastic IP |
| [**updateReverseDnsElasticIpWithHttpInfo**](ReverseDnsApi.md#updateReverseDnsElasticIpWithHttpInfo) | **POST** /reverse-dns/elastic-ip/{id} | Update/Create the PTR DNS record for an elastic IP |
| [**updateReverseDnsInstance**](ReverseDnsApi.md#updateReverseDnsInstance) | **POST** /reverse-dns/instance/{id} | Update/Create the PTR DNS record for an instance |
| [**updateReverseDnsInstanceWithHttpInfo**](ReverseDnsApi.md#updateReverseDnsInstanceWithHttpInfo) | **POST** /reverse-dns/instance/{id} | Update/Create the PTR DNS record for an instance |



## deleteReverseDnsElasticIp

> Operation deleteReverseDnsElasticIp(id)

Delete the PTR DNS record for an elastic IP



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReverseDnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        ReverseDnsApi apiInstance = new ReverseDnsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            Operation result = apiInstance.deleteReverseDnsElasticIp(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReverseDnsApi#deleteReverseDnsElasticIp");
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

## deleteReverseDnsElasticIpWithHttpInfo

> ApiResponse<Operation> deleteReverseDnsElasticIp deleteReverseDnsElasticIpWithHttpInfo(id)

Delete the PTR DNS record for an elastic IP



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReverseDnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        ReverseDnsApi apiInstance = new ReverseDnsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Operation> response = apiInstance.deleteReverseDnsElasticIpWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReverseDnsApi#deleteReverseDnsElasticIp");
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


## deleteReverseDnsInstance

> Operation deleteReverseDnsInstance(id)

Delete the PTR DNS record for an instance



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReverseDnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        ReverseDnsApi apiInstance = new ReverseDnsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            Operation result = apiInstance.deleteReverseDnsInstance(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReverseDnsApi#deleteReverseDnsInstance");
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

## deleteReverseDnsInstanceWithHttpInfo

> ApiResponse<Operation> deleteReverseDnsInstance deleteReverseDnsInstanceWithHttpInfo(id)

Delete the PTR DNS record for an instance



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReverseDnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        ReverseDnsApi apiInstance = new ReverseDnsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Operation> response = apiInstance.deleteReverseDnsInstanceWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReverseDnsApi#deleteReverseDnsInstance");
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


## getReverseDnsElasticIp

> ReverseDnsRecord getReverseDnsElasticIp(id)

Query the PTR DNS records for an elastic IP



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReverseDnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        ReverseDnsApi apiInstance = new ReverseDnsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ReverseDnsRecord result = apiInstance.getReverseDnsElasticIp(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReverseDnsApi#getReverseDnsElasticIp");
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

[**ReverseDnsRecord**](ReverseDnsRecord.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## getReverseDnsElasticIpWithHttpInfo

> ApiResponse<ReverseDnsRecord> getReverseDnsElasticIp getReverseDnsElasticIpWithHttpInfo(id)

Query the PTR DNS records for an elastic IP



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReverseDnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        ReverseDnsApi apiInstance = new ReverseDnsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<ReverseDnsRecord> response = apiInstance.getReverseDnsElasticIpWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReverseDnsApi#getReverseDnsElasticIp");
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

ApiResponse<[**ReverseDnsRecord**](ReverseDnsRecord.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## getReverseDnsInstance

> ReverseDnsRecord getReverseDnsInstance(id)

Query the PTR DNS records for an instance



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReverseDnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        ReverseDnsApi apiInstance = new ReverseDnsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ReverseDnsRecord result = apiInstance.getReverseDnsInstance(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReverseDnsApi#getReverseDnsInstance");
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

[**ReverseDnsRecord**](ReverseDnsRecord.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## getReverseDnsInstanceWithHttpInfo

> ApiResponse<ReverseDnsRecord> getReverseDnsInstance getReverseDnsInstanceWithHttpInfo(id)

Query the PTR DNS records for an instance



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReverseDnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        ReverseDnsApi apiInstance = new ReverseDnsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<ReverseDnsRecord> response = apiInstance.getReverseDnsInstanceWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReverseDnsApi#getReverseDnsInstance");
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

ApiResponse<[**ReverseDnsRecord**](ReverseDnsRecord.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |


## updateReverseDnsElasticIp

> Operation updateReverseDnsElasticIp(id, updateReverseDnsElasticIpRequest)

Update/Create the PTR DNS record for an elastic IP



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReverseDnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        ReverseDnsApi apiInstance = new ReverseDnsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateReverseDnsElasticIpRequest updateReverseDnsElasticIpRequest = new UpdateReverseDnsElasticIpRequest(); // UpdateReverseDnsElasticIpRequest | 
        try {
            Operation result = apiInstance.updateReverseDnsElasticIp(id, updateReverseDnsElasticIpRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReverseDnsApi#updateReverseDnsElasticIp");
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
| **updateReverseDnsElasticIpRequest** | [**UpdateReverseDnsElasticIpRequest**](UpdateReverseDnsElasticIpRequest.md)|  | |

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

## updateReverseDnsElasticIpWithHttpInfo

> ApiResponse<Operation> updateReverseDnsElasticIp updateReverseDnsElasticIpWithHttpInfo(id, updateReverseDnsElasticIpRequest)

Update/Create the PTR DNS record for an elastic IP



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReverseDnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        ReverseDnsApi apiInstance = new ReverseDnsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateReverseDnsElasticIpRequest updateReverseDnsElasticIpRequest = new UpdateReverseDnsElasticIpRequest(); // UpdateReverseDnsElasticIpRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.updateReverseDnsElasticIpWithHttpInfo(id, updateReverseDnsElasticIpRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReverseDnsApi#updateReverseDnsElasticIp");
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
| **updateReverseDnsElasticIpRequest** | [**UpdateReverseDnsElasticIpRequest**](UpdateReverseDnsElasticIpRequest.md)|  | |

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


## updateReverseDnsInstance

> Operation updateReverseDnsInstance(id, updateReverseDnsElasticIpRequest)

Update/Create the PTR DNS record for an instance



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReverseDnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        ReverseDnsApi apiInstance = new ReverseDnsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateReverseDnsElasticIpRequest updateReverseDnsElasticIpRequest = new UpdateReverseDnsElasticIpRequest(); // UpdateReverseDnsElasticIpRequest | 
        try {
            Operation result = apiInstance.updateReverseDnsInstance(id, updateReverseDnsElasticIpRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReverseDnsApi#updateReverseDnsInstance");
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
| **updateReverseDnsElasticIpRequest** | [**UpdateReverseDnsElasticIpRequest**](UpdateReverseDnsElasticIpRequest.md)|  | |

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

## updateReverseDnsInstanceWithHttpInfo

> ApiResponse<Operation> updateReverseDnsInstance updateReverseDnsInstanceWithHttpInfo(id, updateReverseDnsElasticIpRequest)

Update/Create the PTR DNS record for an instance



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReverseDnsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        ReverseDnsApi apiInstance = new ReverseDnsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        UpdateReverseDnsElasticIpRequest updateReverseDnsElasticIpRequest = new UpdateReverseDnsElasticIpRequest(); // UpdateReverseDnsElasticIpRequest | 
        try {
            ApiResponse<Operation> response = apiInstance.updateReverseDnsInstanceWithHttpInfo(id, updateReverseDnsElasticIpRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReverseDnsApi#updateReverseDnsInstance");
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
| **updateReverseDnsElasticIpRequest** | [**UpdateReverseDnsElasticIpRequest**](UpdateReverseDnsElasticIpRequest.md)|  | |

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

