# EventApi

All URIs are relative to *https://api-ch-gva-2.exoscale.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listEvents**](EventApi.md#listEvents) | **GET** /event | List Events |



## listEvents

> List&lt;Event&gt; listEvents(from, to)

List Events

Retrieve Mutation Events for a given date range. Defaults to retrieving Events for the past 24 hours.          Both a &#x60;from&#x60; and &#x60;to&#x60; arguments can be specified to filter Events over a specific period.          Events will be the the most descriptive possible but not all fields are mandatory

### Example

```java
// Import classes:
import com.exoscale.invoker.ApiClient;
import com.exoscale.invoker.ApiException;
import com.exoscale.invoker.Configuration;
import com.exoscale.invoker.models.*;
import com.exoscale.api.EventApi;

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

