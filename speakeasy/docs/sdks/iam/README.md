# Iam
(*iam()*)

### Available Operations

* [revokeAccessKey](#revokeaccesskey) - Revoke an IAM Access Key
* [getAccessKey](#getaccesskey) - Retrieve IAM Access Key details
* [listAccessKeys](#listaccesskeys) - List IAM Access Keys
* [createAccessKey](#createaccesskey) - Create a legacy IAM Access Key
* [createApiKey](#createapikey) - Create a new API key
* [listApiKeys](#listapikeys) - List API keys
* [deleteApiKey](#deleteapikey) - Delete an API key
* [getApiKey](#getapikey) - Get API key
* [listAccessKeyKnownOperations](#listaccesskeyknownoperations) - Retrieve all known available IAM Access Key operations and associated tags
* [updateIamRole](#updateiamrole) - Update IAM Role
* [getIamRole](#getiamrole) - Retrieve IAM Role
* [deleteIamRole](#deleteiamrole) - Delete IAM Role
* [getIamOrganizationPolicy](#getiamorganizationpolicy) - Retrieve IAM Organization Policy
* [updateIamOrganizationPolicy](#updateiamorganizationpolicy) - Update IAM Organization Policy
* [listAccessKeyOperations](#listaccesskeyoperations) - Retrieve IAM Access Key operations and associated tags for the signing key
* [updateIamRolePolicy](#updateiamrolepolicy) - Update IAM Role Policy
* [listIamRoles](#listiamroles) - List IAM Roles
* [createIamRole](#createiamrole) - Create IAM Role

## revokeAccessKey

This operation revokes the specified IAM Access Key. Access Keys created by the revoked Access Key will not be revoked.

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.RevokeAccessKeyRequest;
import com.exoscale.api.models.operations.RevokeAccessKeyResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Exoscale sdk = Exoscale.builder()
                .build();

            RevokeAccessKeyResponse res = sdk.iam().revokeAccessKey()
                .key("<value>")
                .call();

            if (res.operation().isPresent()) {
                // handle response
            }
        } catch (com.exoscale.api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `key`              | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.RevokeAccessKeyResponse>](../../models/operations/RevokeAccessKeyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getAccessKey

Retrieve IAM Access Key details

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetAccessKeyRequest;
import com.exoscale.api.models.operations.GetAccessKeyResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Exoscale sdk = Exoscale.builder()
                .build();

            GetAccessKeyResponse res = sdk.iam().getAccessKey()
                .key("<value>")
                .call();

            if (res.accessKey().isPresent()) {
                // handle response
            }
        } catch (com.exoscale.api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `key`              | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetAccessKeyResponse>](../../models/operations/GetAccessKeyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listAccessKeys

List IAM Access Keys

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListAccessKeysResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Exoscale sdk = Exoscale.builder()
                .build();

            ListAccessKeysResponse res = sdk.iam().listAccessKeys()
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (com.exoscale.api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[Optional<? extends com.exoscale.api.models.operations.ListAccessKeysResponse>](../../models/operations/ListAccessKeysResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createAccessKey

This operation creates a legacy IAM Access Key, to create a key for use with IAM roles use the api-key endpoint.The corresponding secret is only available in the response returned by this operation, the caller must take care of storing it safely as there is no other way to retrieve it.

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.AccessKeyResource;
import com.exoscale.api.models.components.Domain;
import com.exoscale.api.models.components.ResourceType;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateAccessKeyRequestBody;
import com.exoscale.api.models.operations.CreateAccessKeyResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Exoscale sdk = Exoscale.builder()
                .build();

            CreateAccessKeyRequestBody req = CreateAccessKeyRequestBody.builder()
                .name("<value>")
                .tags(java.util.List.of(
                    "<value>"))
                .operations(java.util.List.of(
                    "<value>"))
                .resources(java.util.List.of(
                    AccessKeyResource.builder()
                        .build()))
                .build();

            CreateAccessKeyResponse res = sdk.iam().createAccessKey()
                .request(req)
                .call();

            if (res.accessKey().isPresent()) {
                // handle response
            }
        } catch (com.exoscale.api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.exoscale.api.models.operations.CreateAccessKeyRequestBody](../../models/operations/CreateAccessKeyRequestBody.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateAccessKeyResponse>](../../models/operations/CreateAccessKeyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createApiKey

Create a new API key

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateApiKeyRequestBody;
import com.exoscale.api.models.operations.CreateApiKeyResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Exoscale sdk = Exoscale.builder()
                .build();

            CreateApiKeyRequestBody req = CreateApiKeyRequestBody.builder()
                .roleId("2a3d8a5c-633c-4e9b-aa56-e43becf4c7ec")
                .name("<value>")
                .build();

            CreateApiKeyResponse res = sdk.iam().createApiKey()
                .request(req)
                .call();

            if (res.iamApiKeyCreated().isPresent()) {
                // handle response
            }
        } catch (com.exoscale.api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.exoscale.api.models.operations.CreateApiKeyRequestBody](../../models/operations/CreateApiKeyRequestBody.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateApiKeyResponse>](../../models/operations/CreateApiKeyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listApiKeys

List API keys

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListApiKeysResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Exoscale sdk = Exoscale.builder()
                .build();

            ListApiKeysResponse res = sdk.iam().listApiKeys()
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (com.exoscale.api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[Optional<? extends com.exoscale.api.models.operations.ListApiKeysResponse>](../../models/operations/ListApiKeysResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteApiKey

Delete an API key

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteApiKeyRequest;
import com.exoscale.api.models.operations.DeleteApiKeyResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Exoscale sdk = Exoscale.builder()
                .build();

            DeleteApiKeyResponse res = sdk.iam().deleteApiKey()
                .id("<value>")
                .call();

            if (res.operation().isPresent()) {
                // handle response
            }
        } catch (com.exoscale.api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `id`               | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DeleteApiKeyResponse>](../../models/operations/DeleteApiKeyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getApiKey

Get API key

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetApiKeyRequest;
import com.exoscale.api.models.operations.GetApiKeyResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Exoscale sdk = Exoscale.builder()
                .build();

            GetApiKeyResponse res = sdk.iam().getApiKey()
                .id("<value>")
                .call();

            if (res.iamApiKey().isPresent()) {
                // handle response
            }
        } catch (com.exoscale.api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `id`               | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetApiKeyResponse>](../../models/operations/GetApiKeyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listAccessKeyKnownOperations

Retrieve all known available IAM Access Key operations and associated tags

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListAccessKeyKnownOperationsResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Exoscale sdk = Exoscale.builder()
                .build();

            ListAccessKeyKnownOperationsResponse res = sdk.iam().listAccessKeyKnownOperations()
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (com.exoscale.api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[Optional<? extends com.exoscale.api.models.operations.ListAccessKeyKnownOperationsResponse>](../../models/operations/ListAccessKeyKnownOperationsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateIamRole

Update IAM Role

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.Permissions;
import com.exoscale.api.models.operations.UpdateIamRoleRequest;
import com.exoscale.api.models.operations.UpdateIamRoleRequestBody;
import com.exoscale.api.models.operations.UpdateIamRoleResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Exoscale sdk = Exoscale.builder()
                .build();

            UpdateIamRoleResponse res = sdk.iam().updateIamRole()
                .id("1d17abeb-27e1-46f9-b34f-d1ac52466648")
                .requestBody(UpdateIamRoleRequestBody.builder()
                    .build())
                .call();

            if (res.operation().isPresent()) {
                // handle response
            }
        } catch (com.exoscale.api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                               | *String*                                                                                                           | :heavy_check_mark:                                                                                                 | N/A                                                                                                                |
| `requestBody`                                                                                                      | [com.exoscale.api.models.operations.UpdateIamRoleRequestBody](../../models/operations/UpdateIamRoleRequestBody.md) | :heavy_check_mark:                                                                                                 | N/A                                                                                                                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpdateIamRoleResponse>](../../models/operations/UpdateIamRoleResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getIamRole

Retrieve IAM Role

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetIamRoleRequest;
import com.exoscale.api.models.operations.GetIamRoleResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Exoscale sdk = Exoscale.builder()
                .build();

            GetIamRoleResponse res = sdk.iam().getIamRole()
                .id("67f064b8-908b-45d8-bbcb-93be91c7ba81")
                .call();

            if (res.iamRole().isPresent()) {
                // handle response
            }
        } catch (com.exoscale.api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `id`               | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetIamRoleResponse>](../../models/operations/GetIamRoleResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteIamRole

Delete IAM Role

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteIamRoleRequest;
import com.exoscale.api.models.operations.DeleteIamRoleResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Exoscale sdk = Exoscale.builder()
                .build();

            DeleteIamRoleResponse res = sdk.iam().deleteIamRole()
                .id("d07fe076-0ec1-4454-9a37-240f8a22a305")
                .call();

            if (res.operation().isPresent()) {
                // handle response
            }
        } catch (com.exoscale.api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `id`               | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DeleteIamRoleResponse>](../../models/operations/DeleteIamRoleResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getIamOrganizationPolicy

Retrieve IAM Organization Policy

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetIamOrganizationPolicyResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Exoscale sdk = Exoscale.builder()
                .build();

            GetIamOrganizationPolicyResponse res = sdk.iam().getIamOrganizationPolicy()
                .call();

            if (res.iamPolicy().isPresent()) {
                // handle response
            }
        } catch (com.exoscale.api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetIamOrganizationPolicyResponse>](../../models/operations/GetIamOrganizationPolicyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateIamOrganizationPolicy

Update IAM Organization Policy

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.Action;
import com.exoscale.api.models.components.DefaultServiceStrategy;
import com.exoscale.api.models.components.IamPolicy;
import com.exoscale.api.models.components.IamServicePolicy;
import com.exoscale.api.models.components.IamServicePolicyRule;
import com.exoscale.api.models.components.IamServicePolicyType;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.UpdateIamOrganizationPolicyResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Exoscale sdk = Exoscale.builder()
                .build();

            IamPolicy req = IamPolicy.builder()
                .defaultServiceStrategy(DefaultServiceStrategy.ALLOW)
                .services(java.util.Map.ofEntries(
                        entry("key", IamServicePolicy.builder()
                            .build())))
                .build();

            UpdateIamOrganizationPolicyResponse res = sdk.iam().updateIamOrganizationPolicy()
                .request(req)
                .call();

            if (res.operation().isPresent()) {
                // handle response
            }
        } catch (com.exoscale.api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                        | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `request`                                                                        | [com.exoscale.api.models.components.IamPolicy](../../models/shared/IamPolicy.md) | :heavy_check_mark:                                                               | The request object to use for the request.                                       |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpdateIamOrganizationPolicyResponse>](../../models/operations/UpdateIamOrganizationPolicyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listAccessKeyOperations

Retrieve IAM Access Key operations and associated tags for the signing key

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListAccessKeyOperationsResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Exoscale sdk = Exoscale.builder()
                .build();

            ListAccessKeyOperationsResponse res = sdk.iam().listAccessKeyOperations()
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (com.exoscale.api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[Optional<? extends com.exoscale.api.models.operations.ListAccessKeyOperationsResponse>](../../models/operations/ListAccessKeyOperationsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateIamRolePolicy

Update IAM Role Policy

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.Action;
import com.exoscale.api.models.components.DefaultServiceStrategy;
import com.exoscale.api.models.components.IamPolicy;
import com.exoscale.api.models.components.IamServicePolicy;
import com.exoscale.api.models.components.IamServicePolicyRule;
import com.exoscale.api.models.components.IamServicePolicyType;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.UpdateIamRolePolicyRequest;
import com.exoscale.api.models.operations.UpdateIamRolePolicyResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Exoscale sdk = Exoscale.builder()
                .build();

            UpdateIamRolePolicyResponse res = sdk.iam().updateIamRolePolicy()
                .id("2a65c269-e1e4-48ac-bef6-f5e408b750da")
                .iamPolicy(IamPolicy.builder()
                    .defaultServiceStrategy(DefaultServiceStrategy.DENY)
                    .services(java.util.Map.ofEntries(
                            entry("key", IamServicePolicy.builder()
                                .build())))
                    .build())
                .call();

            if (res.operation().isPresent()) {
                // handle response
            }
        } catch (com.exoscale.api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `id`                                                                                 | *String*                                                                             | :heavy_check_mark:                                                                   | N/A                                                                                  |
| `iamPolicy`                                                                          | [com.exoscale.api.models.components.IamPolicy](../../models/components/IamPolicy.md) | :heavy_check_mark:                                                                   | N/A                                                                                  |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpdateIamRolePolicyResponse>](../../models/operations/UpdateIamRolePolicyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listIamRoles

List IAM Roles

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListIamRolesResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Exoscale sdk = Exoscale.builder()
                .build();

            ListIamRolesResponse res = sdk.iam().listIamRoles()
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (com.exoscale.api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[Optional<? extends com.exoscale.api.models.operations.ListIamRolesResponse>](../../models/operations/ListIamRolesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createIamRole

Create IAM Role

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.Action;
import com.exoscale.api.models.components.DefaultServiceStrategy;
import com.exoscale.api.models.components.IamPolicy;
import com.exoscale.api.models.components.IamServicePolicy;
import com.exoscale.api.models.components.IamServicePolicyRule;
import com.exoscale.api.models.components.IamServicePolicyType;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateIamRolePermissions;
import com.exoscale.api.models.operations.CreateIamRoleRequestBody;
import com.exoscale.api.models.operations.CreateIamRoleResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Exoscale sdk = Exoscale.builder()
                .build();

            CreateIamRoleRequestBody req = CreateIamRoleRequestBody.builder()
                .name("<value>")
                .description("Implemented asynchronous ability")
                .permissions(java.util.List.of(
                    CreateIamRolePermissions.BYPASS_GOVERNANCE_RETENTION))
                .editable(false)
                .labels(java.util.Map.ofEntries(
                    entry("key", "<value>")))
                .policy(IamPolicy.builder()
                    .defaultServiceStrategy(DefaultServiceStrategy.ALLOW)
                    .services(java.util.Map.ofEntries(
                            entry("key", IamServicePolicy.builder()
                                .build())))
                    .build())
                .build();

            CreateIamRoleResponse res = sdk.iam().createIamRole()
                .request(req)
                .call();

            if (res.operation().isPresent()) {
                // handle response
            }
        } catch (com.exoscale.api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.exoscale.api.models.operations.CreateIamRoleRequestBody](../../models/operations/CreateIamRoleRequestBody.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateIamRoleResponse>](../../models/operations/CreateIamRoleResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
