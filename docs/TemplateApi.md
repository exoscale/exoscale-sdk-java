# TemplateApi

All URIs are relative to *https://api-{zone}.exoscale.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**copyTemplate**](TemplateApi.md#copyTemplate) | **POST** /template/{id} | Copy a Template from a zone to another
[**deleteTemplate**](TemplateApi.md#deleteTemplate) | **DELETE** /template/{id} | Delete a Template
[**getTemplate**](TemplateApi.md#getTemplate) | **GET** /template/{id} | Retrieve Template details
[**listTemplates**](TemplateApi.md#listTemplates) | **GET** /template | List Templates
[**promoteSnapshotToTemplate**](TemplateApi.md#promoteSnapshotToTemplate) | **POST** /snapshot/{id}:promote | Promote a Snapshot to a Template
[**registerTemplate**](TemplateApi.md#registerTemplate) | **POST** /template | Register a Template
[**updateTemplate**](TemplateApi.md#updateTemplate) | **PUT** /template/{id} | Update template attributes

<a name="copyTemplate"></a>
# **copyTemplate**
> Operation copyTemplate(body, id)

Copy a Template from a zone to another

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TemplateApi;


TemplateApi apiInstance = new TemplateApi();
TemplateIdBody1 body = new TemplateIdBody1(); // TemplateIdBody1 | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.copyTemplate(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateApi#copyTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TemplateIdBody1**](TemplateIdBody1.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTemplate"></a>
# **deleteTemplate**
> Operation deleteTemplate(id)

Delete a Template

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TemplateApi;


TemplateApi apiInstance = new TemplateApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.deleteTemplate(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateApi#deleteTemplate");
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

<a name="getTemplate"></a>
# **getTemplate**
> Template getTemplate(id)

Retrieve Template details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TemplateApi;


TemplateApi apiInstance = new TemplateApi();
UUID id = new UUID(); // UUID | 
try {
    Template result = apiInstance.getTemplate(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateApi#getTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**Template**](Template.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTemplates"></a>
# **listTemplates**
> InlineResponse20033 listTemplates(visibility, family)

List Templates

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TemplateApi;


TemplateApi apiInstance = new TemplateApi();
String visibility = "visibility_example"; // String | 
String family = "family_example"; // String | 
try {
    InlineResponse20033 result = apiInstance.listTemplates(visibility, family);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateApi#listTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **visibility** | **String**|  | [optional] [enum: private, public]
 **family** | **String**|  | [optional]

### Return type

[**InlineResponse20033**](InlineResponse20033.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="promoteSnapshotToTemplate"></a>
# **promoteSnapshotToTemplate**
> Operation promoteSnapshotToTemplate(body, id)

Promote a Snapshot to a Template

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TemplateApi;


TemplateApi apiInstance = new TemplateApi();
SnapshotIdpromoteBody body = new SnapshotIdpromoteBody(); // SnapshotIdpromoteBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.promoteSnapshotToTemplate(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateApi#promoteSnapshotToTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SnapshotIdpromoteBody**](SnapshotIdpromoteBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="registerTemplate"></a>
# **registerTemplate**
> Operation registerTemplate(body)

Register a Template

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TemplateApi;


TemplateApi apiInstance = new TemplateApi();
TemplateBody body = new TemplateBody(); // TemplateBody | 
try {
    Operation result = apiInstance.registerTemplate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateApi#registerTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TemplateBody**](TemplateBody.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTemplate"></a>
# **updateTemplate**
> Operation updateTemplate(body, id)

Update template attributes

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TemplateApi;


TemplateApi apiInstance = new TemplateApi();
TemplateIdBody body = new TemplateIdBody(); // TemplateIdBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.updateTemplate(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplateApi#updateTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TemplateIdBody**](TemplateIdBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

