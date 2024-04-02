# EventApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listEvents**](EventApi.md#listEvents) | **GET** /event | List Events |
| [**listEventsWithHttpInfo**](EventApi.md#listEventsWithHttpInfo) | **GET** /event | List Events |



## listEvents

> List<Event> listEvents(from, to)

List Events

Retrieve Mutation Events for a given date range. Defaults to retrieving Events for the past 24 hours.          Both a &#x60;from&#x60; and &#x60;to&#x60; arguments can be specified to filter Events over a specific period.          Events will be the the most descriptive possible but not all fields are mandatory

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        EventApi apiInstance = new EventApi(defaultClient);
        OffsetDateTime from = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime to = OffsetDateTime.now(); // OffsetDateTime | 
        try {
            List<Event> result = apiInstance.listEvents(from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#listEvents");
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
| **from** | **OffsetDateTime**|  | [optional] |
| **to** | **OffsetDateTime**|  | [optional] |

### Return type

[**List&lt;Event&gt;**](Event.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

## listEventsWithHttpInfo

> ApiResponse<List<Event>> listEvents listEventsWithHttpInfo(from, to)

List Events

Retrieve Mutation Events for a given date range. Defaults to retrieving Events for the past 24 hours.          Both a &#x60;from&#x60; and &#x60;to&#x60; arguments can be specified to filter Events over a specific period.          Events will be the the most descriptive possible but not all fields are mandatory

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-ch-gva-2.exoscale.com/v2");

        EventApi apiInstance = new EventApi(defaultClient);
        OffsetDateTime from = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime to = OffsetDateTime.now(); // OffsetDateTime | 
        try {
            ApiResponse<List<Event>> response = apiInstance.listEventsWithHttpInfo(from, to);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#listEvents");
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
| **from** | **OffsetDateTime**|  | [optional] |
| **to** | **OffsetDateTime**|  | [optional] |

### Return type

ApiResponse<[**List&lt;Event&gt;**](Event.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

