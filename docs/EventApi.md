# EventApi

All URIs are relative to *https://api-{zone}.exoscale.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listEvents**](EventApi.md#listEvents) | **GET** /event | List Events

<a name="listEvents"></a>
# **listEvents**
> List&lt;Event&gt; listEvents(from, to)

List Events

Retrieve Mutation Events for a given date range. Defaults to retrieving Events for the past 24 hours.          Both a &#x60;from&#x60; and &#x60;to&#x60; arguments can be specified to filter Events over a specific period.          Events will be the the most descriptive possible but not all fields are mandatory

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EventApi;


EventApi apiInstance = new EventApi();
OffsetDateTime from = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime to = new OffsetDateTime(); // OffsetDateTime | 
try {
    List<Event> result = apiInstance.listEvents(from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventApi#listEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **OffsetDateTime**|  | [optional]
 **to** | **OffsetDateTime**|  | [optional]

### Return type

[**List&lt;Event&gt;**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

