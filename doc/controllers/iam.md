# Iam

```java
IamController iamController = client.getIamController();
```

## Class Name

`IamController`

## Methods

* [Revoke-Access-Key](../../doc/controllers/iam.md#revoke-access-key)
* [Get-Access-Key](../../doc/controllers/iam.md#get-access-key)
* [List-Access-Keys](../../doc/controllers/iam.md#list-access-keys)
* [Create-Access-Key](../../doc/controllers/iam.md#create-access-key)
* [Create-Api-Key](../../doc/controllers/iam.md#create-api-key)
* [List-Api-Keys](../../doc/controllers/iam.md#list-api-keys)
* [Delete-Api-Key](../../doc/controllers/iam.md#delete-api-key)
* [Get-Api-Key](../../doc/controllers/iam.md#get-api-key)
* [List-Access-Key-Known-Operations](../../doc/controllers/iam.md#list-access-key-known-operations)
* [Update-Iam-Role](../../doc/controllers/iam.md#update-iam-role)
* [Get-Iam-Role](../../doc/controllers/iam.md#get-iam-role)
* [Delete-Iam-Role](../../doc/controllers/iam.md#delete-iam-role)
* [Get-Iam-Organization-Policy](../../doc/controllers/iam.md#get-iam-organization-policy)
* [Update-Iam-Organization-Policy](../../doc/controllers/iam.md#update-iam-organization-policy)
* [List-Access-Key-Operations](../../doc/controllers/iam.md#list-access-key-operations)
* [Update-Iam-Role-Policy](../../doc/controllers/iam.md#update-iam-role-policy)
* [List-Iam-Roles](../../doc/controllers/iam.md#list-iam-roles)
* [Create-Iam-Role](../../doc/controllers/iam.md#create-iam-role)


# Revoke-Access-Key

This operation revokes the specified IAM Access Key. Access Keys created by the revoked Access Key will not be revoked.

```java
CompletableFuture<Operation> revokeAccessKeyAsync(
    final String key)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `key` | `String` | Template, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
String key = "key0";

iamController.revokeAccessKeyAsync(key).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Access-Key

```java
CompletableFuture<AccessKey> getAccessKeyAsync(
    final String key)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `key` | `String` | Template, Required | - |

## Response Type

[`AccessKey`](../../doc/models/access-key.md)

## Example Usage

```java
String key = "key0";

iamController.getAccessKeyAsync(key).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# List-Access-Keys

```java
CompletableFuture<AccessKeyResponse> listAccessKeysAsync()
```

## Response Type

[`AccessKeyResponse`](../../doc/models/access-key-response.md)

## Example Usage

```java
iamController.listAccessKeysAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Create-Access-Key

This operation creates a legacy IAM Access Key, to create a key for use with IAM roles use the api-key endpoint.The corresponding secret is only available in the response returned by this operation, the caller must take care of storing it safely as there is no other way to retrieve it.

```java
CompletableFuture<AccessKey> createAccessKeyAsync(
    final AccessKeyRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`AccessKeyRequest`](../../doc/models/access-key-request.md) | Body, Required | - |

## Response Type

[`AccessKey`](../../doc/models/access-key.md)

## Example Usage

```java
AccessKeyRequest body = new AccessKeyRequest.Builder()
    .build();

iamController.createAccessKeyAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Create-Api-Key

```java
CompletableFuture<IamApiKeyCreated> createApiKeyAsync(
    final ApiKeyRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ApiKeyRequest`](../../doc/models/api-key-request.md) | Body, Required | - |

## Response Type

[`IamApiKeyCreated`](../../doc/models/iam-api-key-created.md)

## Example Usage

```java
ApiKeyRequest body = new ApiKeyRequest.Builder(
    UUID.fromString("0000107a-0000-0000-0000-000000000000"),
    "name6"
)
.build();

iamController.createApiKeyAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# List-Api-Keys

```java
CompletableFuture<ApiKeyResponse> listApiKeysAsync()
```

## Response Type

[`ApiKeyResponse`](../../doc/models/api-key-response.md)

## Example Usage

```java
iamController.listApiKeysAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Delete-Api-Key

```java
CompletableFuture<Operation> deleteApiKeyAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
String id = "id0";

iamController.deleteApiKeyAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Api-Key

```java
CompletableFuture<IamApiKey> getApiKeyAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | - |

## Response Type

[`IamApiKey`](../../doc/models/iam-api-key.md)

## Example Usage

```java
String id = "id0";

iamController.getApiKeyAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# List-Access-Key-Known-Operations

```java
CompletableFuture<AccessKeyKnownOperationsResponse> listAccessKeyKnownOperationsAsync()
```

## Response Type

[`AccessKeyKnownOperationsResponse`](../../doc/models/access-key-known-operations-response.md)

## Example Usage

```java
iamController.listAccessKeyKnownOperationsAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update-Iam-Role

```java
CompletableFuture<Operation> updateIamRoleAsync(
    final UUID id,
    final IamRoleRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`IamRoleRequest`](../../doc/models/iam-role-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
IamRoleRequest body = new IamRoleRequest.Builder()
    .build();

iamController.updateIamRoleAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Iam-Role

```java
CompletableFuture<IamRole> getIamRoleAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

[`IamRole`](../../doc/models/iam-role.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

iamController.getIamRoleAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Delete-Iam-Role

```java
CompletableFuture<Operation> deleteIamRoleAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

iamController.deleteIamRoleAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Iam-Organization-Policy

```java
CompletableFuture<IamPolicy> getIamOrganizationPolicyAsync()
```

## Response Type

[`IamPolicy`](../../doc/models/iam-policy.md)

## Example Usage

```java
iamController.getIamOrganizationPolicyAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update-Iam-Organization-Policy

```java
CompletableFuture<Operation> updateIamOrganizationPolicyAsync(
    final IamPolicy body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`IamPolicy`](../../doc/models/iam-policy.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
IamPolicy body = new IamPolicy.Builder(
    DefaultServiceStrategyEnum.ALLOW,
    new LinkedHashMap<String, IamServicePolicy>() {{
        put("key0", new IamServicePolicy.Builder()
            .build());
    }}
)
.build();

iamController.updateIamOrganizationPolicyAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# List-Access-Key-Operations

```java
CompletableFuture<AccessKeyOperationsResponse> listAccessKeyOperationsAsync()
```

## Response Type

[`AccessKeyOperationsResponse`](../../doc/models/access-key-operations-response.md)

## Example Usage

```java
iamController.listAccessKeyOperationsAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update-Iam-Role-Policy

```java
CompletableFuture<Operation> updateIamRolePolicyAsync(
    final UUID id,
    final IamPolicy body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`IamPolicy`](../../doc/models/iam-policy.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
IamPolicy body = new IamPolicy.Builder(
    DefaultServiceStrategyEnum.ALLOW,
    new LinkedHashMap<String, IamServicePolicy>() {{
        put("key0", new IamServicePolicy.Builder()
            .build());
    }}
)
.build();

iamController.updateIamRolePolicyAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# List-Iam-Roles

```java
CompletableFuture<IamRoleResponse> listIamRolesAsync()
```

## Response Type

[`IamRoleResponse`](../../doc/models/iam-role-response.md)

## Example Usage

```java
iamController.listIamRolesAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Create-Iam-Role

```java
CompletableFuture<Operation> createIamRoleAsync(
    final IamRoleRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`IamRoleRequest1`](../../doc/models/iam-role-request-1.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
IamRoleRequest1 body = new IamRoleRequest1.Builder(
    "name6"
)
.build();

iamController.createIamRoleAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

