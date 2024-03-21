# Template
(*template()*)

### Available Operations

* [deleteTemplate](#deletetemplate) - Delete a Template
* [copyTemplate](#copytemplate) - Copy a Template from a zone to another
* [updateTemplate](#updatetemplate) - Update template attributes
* [getTemplate](#gettemplate) - Retrieve Template details
* [promoteSnapshotToTemplate](#promotesnapshottotemplate) - Promote a Snapshot to a Template
* [listTemplates](#listtemplates) - List Templates
* [registerTemplate](#registertemplate) - Register a Template

## deleteTemplate

Delete a Template

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteTemplateRequest;
import com.exoscale.api.models.operations.DeleteTemplateResponse;
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

            DeleteTemplateResponse res = sdk.template().deleteTemplate()
                .id("c8b9a9ab-daf8-43d4-98ad-2351d333dcf8")
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

**[Optional<? extends com.exoscale.api.models.operations.DeleteTemplateResponse>](../../models/operations/DeleteTemplateResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## copyTemplate

Copy a Template from a zone to another

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.ZoneInput;
import com.exoscale.api.models.components.ZoneName;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CopyTemplateRequest;
import com.exoscale.api.models.operations.CopyTemplateRequestBody;
import com.exoscale.api.models.operations.CopyTemplateResponse;
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

            CopyTemplateResponse res = sdk.template().copyTemplate()
                .id("942cedbc-668e-4837-aece-257d3f056c76")
                .requestBody(CopyTemplateRequestBody.builder()
                    .targetZone(ZoneInput.builder()
                            .name(ZoneName.AT_VIE2)
                            .build())
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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                             | *String*                                                                                                         | :heavy_check_mark:                                                                                               | N/A                                                                                                              |
| `requestBody`                                                                                                    | [com.exoscale.api.models.operations.CopyTemplateRequestBody](../../models/operations/CopyTemplateRequestBody.md) | :heavy_check_mark:                                                                                               | N/A                                                                                                              |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CopyTemplateResponse>](../../models/operations/CopyTemplateResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateTemplate

Update template attributes

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.UpdateTemplateRequest;
import com.exoscale.api.models.operations.UpdateTemplateRequestBody;
import com.exoscale.api.models.operations.UpdateTemplateResponse;
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

            UpdateTemplateResponse res = sdk.template().updateTemplate()
                .id("7f307499-aff6-453f-9384-6de7ede41600")
                .requestBody(UpdateTemplateRequestBody.builder()
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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                 | *String*                                                                                                             | :heavy_check_mark:                                                                                                   | N/A                                                                                                                  |
| `requestBody`                                                                                                        | [com.exoscale.api.models.operations.UpdateTemplateRequestBody](../../models/operations/UpdateTemplateRequestBody.md) | :heavy_check_mark:                                                                                                   | N/A                                                                                                                  |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpdateTemplateResponse>](../../models/operations/UpdateTemplateResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getTemplate

Retrieve Template details

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetTemplateRequest;
import com.exoscale.api.models.operations.GetTemplateResponse;
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

            GetTemplateResponse res = sdk.template().getTemplate()
                .id("a3e70d10-12f4-4ba0-8c08-fa3a39dc2269")
                .call();

            if (res.template().isPresent()) {
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

**[Optional<? extends com.exoscale.api.models.operations.GetTemplateResponse>](../../models/operations/GetTemplateResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## promoteSnapshotToTemplate

Promote a Snapshot to a Template

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.PromoteSnapshotToTemplateRequest;
import com.exoscale.api.models.operations.PromoteSnapshotToTemplateRequestBody;
import com.exoscale.api.models.operations.PromoteSnapshotToTemplateResponse;
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

            PromoteSnapshotToTemplateResponse res = sdk.template().promoteSnapshotToTemplate()
                .id("c9de5938-ebea-4fb6-aa37-2b986356ecd8")
                .requestBody(PromoteSnapshotToTemplateRequestBody.builder()
                    .name("<value>")
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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                                                       | *String*                                                                                                                                   | :heavy_check_mark:                                                                                                                         | N/A                                                                                                                                        |
| `requestBody`                                                                                                                              | [com.exoscale.api.models.operations.PromoteSnapshotToTemplateRequestBody](../../models/operations/PromoteSnapshotToTemplateRequestBody.md) | :heavy_check_mark:                                                                                                                         | N/A                                                                                                                                        |


### Response

**[Optional<? extends com.exoscale.api.models.operations.PromoteSnapshotToTemplateResponse>](../../models/operations/PromoteSnapshotToTemplateResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listTemplates

List Templates

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListTemplatesRequest;
import com.exoscale.api.models.operations.ListTemplatesResponse;
import com.exoscale.api.models.operations.QueryParamVisibility;
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

            ListTemplatesResponse res = sdk.template().listTemplates()
                .visibility(QueryParamVisibility.PUBLIC_)
                .family("<value>")
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

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `visibility`                                                                                                                   | [Optional<? extends com.exoscale.api.models.operations.QueryParamVisibility>](../../models/operations/QueryParamVisibility.md) | :heavy_minus_sign:                                                                                                             | N/A                                                                                                                            |
| `family`                                                                                                                       | *Optional<? extends String>*                                                                                                   | :heavy_minus_sign:                                                                                                             | N/A                                                                                                                            |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ListTemplatesResponse>](../../models/operations/ListTemplatesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## registerTemplate

Register a Template

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.BootMode;
import com.exoscale.api.models.operations.RegisterTemplateRequestBody;
import com.exoscale.api.models.operations.RegisterTemplateResponse;
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

            RegisterTemplateRequestBody req = RegisterTemplateRequestBody.builder()
                .sshKeyEnabled(false)
                .name("<value>")
                .passwordEnabled(false)
                .checksum("<value>")
                .url("<value>")
                .maintainer("<value>")
                .description("Multi-lateral even-keeled hardware")
                .defaultUser("<value>")
                .size(582780L)
                .build("<value>")
                .bootMode(BootMode.LEGACY)
                .version("<value>")
                .build();

            RegisterTemplateResponse res = sdk.template().registerTemplate()
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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.exoscale.api.models.operations.RegisterTemplateRequestBody](../../models/operations/RegisterTemplateRequestBody.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[Optional<? extends com.exoscale.api.models.operations.RegisterTemplateResponse>](../../models/operations/RegisterTemplateResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
