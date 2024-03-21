# DnsApi

All URIs are relative to *https://api-{zone}.exoscale.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDnsDomain**](DnsApi.md#createDnsDomain) | **POST** /dns-domain | Create DNS domain
[**createDnsDomainRecord**](DnsApi.md#createDnsDomainRecord) | **POST** /dns-domain/{domain-id}/record | Create DNS domain record
[**deleteDnsDomain**](DnsApi.md#deleteDnsDomain) | **DELETE** /dns-domain/{id} | Delete DNS Domain
[**deleteDnsDomainRecord**](DnsApi.md#deleteDnsDomainRecord) | **DELETE** /dns-domain/{domain-id}/record/{record-id} | Delete DNS domain record
[**getDnsDomain**](DnsApi.md#getDnsDomain) | **GET** /dns-domain/{id} | Retrieve DNS domain details
[**getDnsDomainRecord**](DnsApi.md#getDnsDomainRecord) | **GET** /dns-domain/{domain-id}/record/{record-id} | Retrieve DNS domain record details
[**getDnsDomainZoneFile**](DnsApi.md#getDnsDomainZoneFile) | **GET** /dns-domain/{id}/zone | Retrieve DNS domain zone file
[**listDnsDomainRecords**](DnsApi.md#listDnsDomainRecords) | **GET** /dns-domain/{domain-id}/record | List DNS domain records
[**listDnsDomains**](DnsApi.md#listDnsDomains) | **GET** /dns-domain | List DNS domains
[**updateDnsDomainRecord**](DnsApi.md#updateDnsDomainRecord) | **PUT** /dns-domain/{domain-id}/record/{record-id} | Update DNS domain record

<a name="createDnsDomain"></a>
# **createDnsDomain**
> DnsDomain createDnsDomain(body)

Create DNS domain

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DnsApi;


DnsApi apiInstance = new DnsApi();
DnsdomainBody body = new DnsdomainBody(); // DnsdomainBody | 
try {
    DnsDomain result = apiInstance.createDnsDomain(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsApi#createDnsDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DnsdomainBody**](DnsdomainBody.md)|  |

### Return type

[**DnsDomain**](DnsDomain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDnsDomainRecord"></a>
# **createDnsDomainRecord**
> Operation createDnsDomainRecord(body, domainId)

Create DNS domain record

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DnsApi;


DnsApi apiInstance = new DnsApi();
DomainidRecordBody body = new DomainidRecordBody(); // DomainidRecordBody | 
UUID domainId = new UUID(); // UUID | 
try {
    Operation result = apiInstance.createDnsDomainRecord(body, domainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsApi#createDnsDomainRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DomainidRecordBody**](DomainidRecordBody.md)|  |
 **domainId** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDnsDomain"></a>
# **deleteDnsDomain**
> Operation deleteDnsDomain(id)

Delete DNS Domain

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DnsApi;


DnsApi apiInstance = new DnsApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.deleteDnsDomain(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsApi#deleteDnsDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDnsDomainRecord"></a>
# **deleteDnsDomainRecord**
> Operation deleteDnsDomainRecord(domainId, recordId)

Delete DNS domain record

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DnsApi;


DnsApi apiInstance = new DnsApi();
UUID domainId = new UUID(); // UUID | 
UUID recordId = new UUID(); // UUID | 
try {
    Operation result = apiInstance.deleteDnsDomainRecord(domainId, recordId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsApi#deleteDnsDomainRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainId** | [**UUID**](.md)|  |
 **recordId** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDnsDomain"></a>
# **getDnsDomain**
> DnsDomain getDnsDomain(id)

Retrieve DNS domain details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DnsApi;


DnsApi apiInstance = new DnsApi();
UUID id = new UUID(); // UUID | 
try {
    DnsDomain result = apiInstance.getDnsDomain(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsApi#getDnsDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**DnsDomain**](DnsDomain.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDnsDomainRecord"></a>
# **getDnsDomainRecord**
> DnsDomainRecord getDnsDomainRecord(domainId, recordId)

Retrieve DNS domain record details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DnsApi;


DnsApi apiInstance = new DnsApi();
UUID domainId = new UUID(); // UUID | 
UUID recordId = new UUID(); // UUID | 
try {
    DnsDomainRecord result = apiInstance.getDnsDomainRecord(domainId, recordId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsApi#getDnsDomainRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainId** | [**UUID**](.md)|  |
 **recordId** | [**UUID**](.md)|  |

### Return type

[**DnsDomainRecord**](DnsDomainRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDnsDomainZoneFile"></a>
# **getDnsDomainZoneFile**
> InlineResponse20025 getDnsDomainZoneFile(id)

Retrieve DNS domain zone file

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DnsApi;


DnsApi apiInstance = new DnsApi();
UUID id = new UUID(); // UUID | 
try {
    InlineResponse20025 result = apiInstance.getDnsDomainZoneFile(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsApi#getDnsDomainZoneFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**InlineResponse20025**](InlineResponse20025.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDnsDomainRecords"></a>
# **listDnsDomainRecords**
> InlineResponse2009 listDnsDomainRecords(domainId)

List DNS domain records

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DnsApi;


DnsApi apiInstance = new DnsApi();
UUID domainId = new UUID(); // UUID | 
try {
    InlineResponse2009 result = apiInstance.listDnsDomainRecords(domainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsApi#listDnsDomainRecords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainId** | [**UUID**](.md)|  |

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDnsDomains"></a>
# **listDnsDomains**
> InlineResponse20020 listDnsDomains()

List DNS domains

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DnsApi;


DnsApi apiInstance = new DnsApi();
try {
    InlineResponse20020 result = apiInstance.listDnsDomains();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsApi#listDnsDomains");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDnsDomainRecord"></a>
# **updateDnsDomainRecord**
> Operation updateDnsDomainRecord(body, domainId, recordId)

Update DNS domain record

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DnsApi;


DnsApi apiInstance = new DnsApi();
RecordRecordidBody body = new RecordRecordidBody(); // RecordRecordidBody | 
UUID domainId = new UUID(); // UUID | 
UUID recordId = new UUID(); // UUID | 
try {
    Operation result = apiInstance.updateDnsDomainRecord(body, domainId, recordId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsApi#updateDnsDomainRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecordRecordidBody**](RecordRecordidBody.md)|  |
 **domainId** | [**UUID**](.md)|  |
 **recordId** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

