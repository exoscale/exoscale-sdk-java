# SecurityGroupApi

All URIs are relative to *https://api-{zone}.exoscale.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addExternalSourceToSecurityGroup**](SecurityGroupApi.md#addExternalSourceToSecurityGroup) | **PUT** /security-group/{id}:add-source | Add an external source as a member of a Security Group
[**addRuleToSecurityGroup**](SecurityGroupApi.md#addRuleToSecurityGroup) | **POST** /security-group/{id}/rules | Create a Security Group rule
[**attachInstanceToSecurityGroup**](SecurityGroupApi.md#attachInstanceToSecurityGroup) | **PUT** /security-group/{id}:attach | Attach a Compute instance to a Security Group
[**createSecurityGroup**](SecurityGroupApi.md#createSecurityGroup) | **POST** /security-group | Create a Security Group
[**deleteRuleFromSecurityGroup**](SecurityGroupApi.md#deleteRuleFromSecurityGroup) | **DELETE** /security-group/{id}/rules/{rule-id} | Delete a Security Group rule
[**deleteSecurityGroup**](SecurityGroupApi.md#deleteSecurityGroup) | **DELETE** /security-group/{id} | Delete a Security Group
[**detachInstanceFromSecurityGroup**](SecurityGroupApi.md#detachInstanceFromSecurityGroup) | **PUT** /security-group/{id}:detach | Detach a Compute instance from a Security Group
[**getSecurityGroup**](SecurityGroupApi.md#getSecurityGroup) | **GET** /security-group/{id} | Retrieve Security Group details
[**listSecurityGroups**](SecurityGroupApi.md#listSecurityGroups) | **GET** /security-group | List Security Groups.
[**removeExternalSourceFromSecurityGroup**](SecurityGroupApi.md#removeExternalSourceFromSecurityGroup) | **PUT** /security-group/{id}:remove-source | Remove an external source from a Security Group

<a name="addExternalSourceToSecurityGroup"></a>
# **addExternalSourceToSecurityGroup**
> Operation addExternalSourceToSecurityGroup(body, id)

Add an external source as a member of a Security Group

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityGroupApi;


SecurityGroupApi apiInstance = new SecurityGroupApi();
SecuritygroupIdaddsourceBody body = new SecuritygroupIdaddsourceBody(); // SecuritygroupIdaddsourceBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.addExternalSourceToSecurityGroup(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityGroupApi#addExternalSourceToSecurityGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecuritygroupIdaddsourceBody**](SecuritygroupIdaddsourceBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addRuleToSecurityGroup"></a>
# **addRuleToSecurityGroup**
> Operation addRuleToSecurityGroup(body, id)

Create a Security Group rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityGroupApi;


SecurityGroupApi apiInstance = new SecurityGroupApi();
IdRulesBody body = new IdRulesBody(); // IdRulesBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.addRuleToSecurityGroup(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityGroupApi#addRuleToSecurityGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IdRulesBody**](IdRulesBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="attachInstanceToSecurityGroup"></a>
# **attachInstanceToSecurityGroup**
> Operation attachInstanceToSecurityGroup(body, id)

Attach a Compute instance to a Security Group

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityGroupApi;


SecurityGroupApi apiInstance = new SecurityGroupApi();
SecuritygroupIdattachBody body = new SecuritygroupIdattachBody(); // SecuritygroupIdattachBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.attachInstanceToSecurityGroup(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityGroupApi#attachInstanceToSecurityGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecuritygroupIdattachBody**](SecuritygroupIdattachBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSecurityGroup"></a>
# **createSecurityGroup**
> Operation createSecurityGroup(body)

Create a Security Group

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityGroupApi;


SecurityGroupApi apiInstance = new SecurityGroupApi();
SecuritygroupBody body = new SecuritygroupBody(); // SecuritygroupBody | 
try {
    Operation result = apiInstance.createSecurityGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityGroupApi#createSecurityGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecuritygroupBody**](SecuritygroupBody.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRuleFromSecurityGroup"></a>
# **deleteRuleFromSecurityGroup**
> Operation deleteRuleFromSecurityGroup(id, ruleId)

Delete a Security Group rule

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityGroupApi;


SecurityGroupApi apiInstance = new SecurityGroupApi();
UUID id = new UUID(); // UUID | 
UUID ruleId = new UUID(); // UUID | 
try {
    Operation result = apiInstance.deleteRuleFromSecurityGroup(id, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityGroupApi#deleteRuleFromSecurityGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |
 **ruleId** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteSecurityGroup"></a>
# **deleteSecurityGroup**
> Operation deleteSecurityGroup(id)

Delete a Security Group

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityGroupApi;


SecurityGroupApi apiInstance = new SecurityGroupApi();
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.deleteSecurityGroup(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityGroupApi#deleteSecurityGroup");
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

<a name="detachInstanceFromSecurityGroup"></a>
# **detachInstanceFromSecurityGroup**
> Operation detachInstanceFromSecurityGroup(body, id)

Detach a Compute instance from a Security Group

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityGroupApi;


SecurityGroupApi apiInstance = new SecurityGroupApi();
SecuritygroupIddetachBody body = new SecuritygroupIddetachBody(); // SecuritygroupIddetachBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.detachInstanceFromSecurityGroup(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityGroupApi#detachInstanceFromSecurityGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecuritygroupIddetachBody**](SecuritygroupIddetachBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSecurityGroup"></a>
# **getSecurityGroup**
> SecurityGroup getSecurityGroup(id)

Retrieve Security Group details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityGroupApi;


SecurityGroupApi apiInstance = new SecurityGroupApi();
UUID id = new UUID(); // UUID | 
try {
    SecurityGroup result = apiInstance.getSecurityGroup(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityGroupApi#getSecurityGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)|  |

### Return type

[**SecurityGroup**](SecurityGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSecurityGroups"></a>
# **listSecurityGroups**
> InlineResponse2002 listSecurityGroups(visibility)

List Security Groups.

Lists security groups. When visibility is set to public, lists public security groups. Public security groups are objects maintained by Exoscale which contain source addresses for relevant services hosted by Exoscale. They can be used a source in ingress rules and as a destination in egress rules.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityGroupApi;


SecurityGroupApi apiInstance = new SecurityGroupApi();
String visibility = "visibility_example"; // String | 
try {
    InlineResponse2002 result = apiInstance.listSecurityGroups(visibility);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityGroupApi#listSecurityGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **visibility** | **String**|  | [optional] [enum: private, public]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeExternalSourceFromSecurityGroup"></a>
# **removeExternalSourceFromSecurityGroup**
> Operation removeExternalSourceFromSecurityGroup(body, id)

Remove an external source from a Security Group

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SecurityGroupApi;


SecurityGroupApi apiInstance = new SecurityGroupApi();
SecuritygroupIdremovesourceBody body = new SecuritygroupIdremovesourceBody(); // SecuritygroupIdremovesourceBody | 
UUID id = new UUID(); // UUID | 
try {
    Operation result = apiInstance.removeExternalSourceFromSecurityGroup(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityGroupApi#removeExternalSourceFromSecurityGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecuritygroupIdremovesourceBody**](SecuritygroupIdremovesourceBody.md)|  |
 **id** | [**UUID**](.md)|  |

### Return type

[**Operation**](Operation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

