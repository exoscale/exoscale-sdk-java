# ElasticIp
(*elasticIp()*)

### Available Operations

* [createElasticIp](#createelasticip) - Create an Elastic IP
* [listElasticIps](#listelasticips) - List Elastic IPs
* [resetElasticIpField](#resetelasticipfield) - Reset an Elastic IP field to its default value
* [detachInstanceFromElasticIp](#detachinstancefromelasticip) - Detach a Compute instance from an Elastic IP
* [attachInstanceToElasticIp](#attachinstancetoelasticip) - Attach a Compute instance to an Elastic IP
* [updateElasticIp](#updateelasticip) - Update an Elastic IP
* [getElasticIp](#getelasticip) - Retrieve Elastic IP details
* [deleteElasticIp](#deleteelasticip) - Delete an Elastic IP

## createElasticIp

Create an Elastic IP

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.ElasticIpHealthcheck;
import com.exoscale.api.models.components.ElasticIpHealthcheckMode;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.Addressfamily;
import com.exoscale.api.models.operations.CreateElasticIpRequestBody;
import com.exoscale.api.models.operations.CreateElasticIpResponse;
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

            CreateElasticIpRequestBody req = CreateElasticIpRequestBody.builder()
                .addressfamily(Addressfamily.INET6)
                .description("Fundamental mobile website")
                .healthcheck(ElasticIpHealthcheck.builder()
                    .mode(ElasticIpHealthcheckMode.TCP)
                    .port(104835L)
                    .strikesOk(517624L)
                    .tlsSkipVerify(false)
                    .tlsSni("<value>")
                    .strikesFail(830705L)
                    .uri("http://minor-creativity.biz")
                    .interval(190249L)
                    .timeout(409181L)
                    .build())
                .labels(java.util.Map.ofEntries(
                    entry("key", "<value>")))
                .build();

            CreateElasticIpResponse res = sdk.elasticIp().createElasticIp()
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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.exoscale.api.models.operations.CreateElasticIpRequestBody](../../models/operations/CreateElasticIpRequestBody.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateElasticIpResponse>](../../models/operations/CreateElasticIpResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listElasticIps

List Elastic IPs

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListElasticIpsResponse;
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

            ListElasticIpsResponse res = sdk.elasticIp().listElasticIps()
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

**[Optional<? extends com.exoscale.api.models.operations.ListElasticIpsResponse>](../../models/operations/ListElasticIpsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## resetElasticIpField

Reset an Elastic IP field to its default value

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.Field;
import com.exoscale.api.models.operations.ResetElasticIpFieldRequest;
import com.exoscale.api.models.operations.ResetElasticIpFieldResponse;
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

            ResetElasticIpFieldResponse res = sdk.elasticIp().resetElasticIpField()
                .id("6db96d39-ed02-4227-bdfe-249e018f7fc6")
                .field(Field.DESCRIPTION)
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

| Parameter                                                                    | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `id`                                                                         | *String*                                                                     | :heavy_check_mark:                                                           | N/A                                                                          |
| `field`                                                                      | [com.exoscale.api.models.operations.Field](../../models/operations/Field.md) | :heavy_check_mark:                                                           | N/A                                                                          |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ResetElasticIpFieldResponse>](../../models/operations/ResetElasticIpFieldResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## detachInstanceFromElasticIp

Detach a Compute instance from an Elastic IP

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.InstanceTarget;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DetachInstanceFromElasticIpRequest;
import com.exoscale.api.models.operations.DetachInstanceFromElasticIpRequestBody;
import com.exoscale.api.models.operations.DetachInstanceFromElasticIpResponse;
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

            DetachInstanceFromElasticIpResponse res = sdk.elasticIp().detachInstanceFromElasticIp()
                .id("0bc91ff5-f54a-45a1-8c0f-e832427c243d")
                .requestBody(DetachInstanceFromElasticIpRequestBody.builder()
                    .instance(InstanceTarget.builder()
                            .id("7f4425c8-6f7a-4da1-babd-1ae9ba4473ab")
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

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                           | *String*                                                                                                                                       | :heavy_check_mark:                                                                                                                             | N/A                                                                                                                                            |
| `requestBody`                                                                                                                                  | [com.exoscale.api.models.operations.DetachInstanceFromElasticIpRequestBody](../../models/operations/DetachInstanceFromElasticIpRequestBody.md) | :heavy_check_mark:                                                                                                                             | N/A                                                                                                                                            |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DetachInstanceFromElasticIpResponse>](../../models/operations/DetachInstanceFromElasticIpResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## attachInstanceToElasticIp

Attach a Compute instance to an Elastic IP

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.InstanceTarget;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.AttachInstanceToElasticIpRequest;
import com.exoscale.api.models.operations.AttachInstanceToElasticIpRequestBody;
import com.exoscale.api.models.operations.AttachInstanceToElasticIpResponse;
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

            AttachInstanceToElasticIpResponse res = sdk.elasticIp().attachInstanceToElasticIp()
                .id("ba5806b3-ad1a-440f-9209-079c2a2be3c9")
                .requestBody(AttachInstanceToElasticIpRequestBody.builder()
                    .instance(InstanceTarget.builder()
                            .id("8e4c80c4-a16f-4e3c-b9fc-a4c7aabd29f6")
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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                                                       | *String*                                                                                                                                   | :heavy_check_mark:                                                                                                                         | N/A                                                                                                                                        |
| `requestBody`                                                                                                                              | [com.exoscale.api.models.operations.AttachInstanceToElasticIpRequestBody](../../models/operations/AttachInstanceToElasticIpRequestBody.md) | :heavy_check_mark:                                                                                                                         | N/A                                                                                                                                        |


### Response

**[Optional<? extends com.exoscale.api.models.operations.AttachInstanceToElasticIpResponse>](../../models/operations/AttachInstanceToElasticIpResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateElasticIp

Update an Elastic IP

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.ElasticIpHealthcheck;
import com.exoscale.api.models.components.ElasticIpHealthcheckMode;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.UpdateElasticIpRequest;
import com.exoscale.api.models.operations.UpdateElasticIpRequestBody;
import com.exoscale.api.models.operations.UpdateElasticIpResponse;
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

            UpdateElasticIpResponse res = sdk.elasticIp().updateElasticIp()
                .id("f711fb1f-5250-4c42-8b2a-b839ede237a2")
                .requestBody(UpdateElasticIpRequestBody.builder()
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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                   | *String*                                                                                                               | :heavy_check_mark:                                                                                                     | N/A                                                                                                                    |
| `requestBody`                                                                                                          | [com.exoscale.api.models.operations.UpdateElasticIpRequestBody](../../models/operations/UpdateElasticIpRequestBody.md) | :heavy_check_mark:                                                                                                     | N/A                                                                                                                    |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpdateElasticIpResponse>](../../models/operations/UpdateElasticIpResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getElasticIp

Retrieve Elastic IP details

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetElasticIpRequest;
import com.exoscale.api.models.operations.GetElasticIpResponse;
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

            GetElasticIpResponse res = sdk.elasticIp().getElasticIp()
                .id("58f58c63-fa20-41fe-80fe-006154553eba")
                .call();

            if (res.elasticIp().isPresent()) {
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

**[Optional<? extends com.exoscale.api.models.operations.GetElasticIpResponse>](../../models/operations/GetElasticIpResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteElasticIp

Delete an Elastic IP

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteElasticIpRequest;
import com.exoscale.api.models.operations.DeleteElasticIpResponse;
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

            DeleteElasticIpResponse res = sdk.elasticIp().deleteElasticIp()
                .id("0434f406-d6b5-42a1-b813-3b085335a1ac")
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

**[Optional<? extends com.exoscale.api.models.operations.DeleteElasticIpResponse>](../../models/operations/DeleteElasticIpResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
