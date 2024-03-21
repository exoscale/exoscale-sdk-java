# AntiAffinityGroup
(*antiAffinityGroup()*)

### Available Operations

* [listAntiAffinityGroups](#listantiaffinitygroups) - List Anti-affinity Groups
* [createAntiAffinityGroup](#createantiaffinitygroup) - Create an Anti-affinity Group
* [getAntiAffinityGroup](#getantiaffinitygroup) - Retrieve Anti-affinity Group details
* [deleteAntiAffinityGroup](#deleteantiaffinitygroup) - Delete an Anti-affinity Group

## listAntiAffinityGroups

List Anti-affinity Groups

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListAntiAffinityGroupsResponse;
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

            ListAntiAffinityGroupsResponse res = sdk.antiAffinityGroup().listAntiAffinityGroups()
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

**[Optional<? extends com.exoscale.api.models.operations.ListAntiAffinityGroupsResponse>](../../models/operations/ListAntiAffinityGroupsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createAntiAffinityGroup

Create an Anti-affinity Group

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateAntiAffinityGroupRequestBody;
import com.exoscale.api.models.operations.CreateAntiAffinityGroupResponse;
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

            CreateAntiAffinityGroupRequestBody req = CreateAntiAffinityGroupRequestBody.builder()
                .name("<value>")
                .description("Horizontal mission-critical solution")
                .build();

            CreateAntiAffinityGroupResponse res = sdk.antiAffinityGroup().createAntiAffinityGroup()
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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.exoscale.api.models.operations.CreateAntiAffinityGroupRequestBody](../../models/operations/CreateAntiAffinityGroupRequestBody.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateAntiAffinityGroupResponse>](../../models/operations/CreateAntiAffinityGroupResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getAntiAffinityGroup

Retrieve Anti-affinity Group details

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetAntiAffinityGroupRequest;
import com.exoscale.api.models.operations.GetAntiAffinityGroupResponse;
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

            GetAntiAffinityGroupResponse res = sdk.antiAffinityGroup().getAntiAffinityGroup()
                .id("a50855ff-8fc0-4124-a82b-00326d325784")
                .call();

            if (res.antiAffinityGroup().isPresent()) {
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

**[Optional<? extends com.exoscale.api.models.operations.GetAntiAffinityGroupResponse>](../../models/operations/GetAntiAffinityGroupResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteAntiAffinityGroup

Delete an Anti-affinity Group

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteAntiAffinityGroupRequest;
import com.exoscale.api.models.operations.DeleteAntiAffinityGroupResponse;
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

            DeleteAntiAffinityGroupResponse res = sdk.antiAffinityGroup().deleteAntiAffinityGroup()
                .id("42d52d5d-2535-4385-ac5f-af23993fdb37")
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

**[Optional<? extends com.exoscale.api.models.operations.DeleteAntiAffinityGroupResponse>](../../models/operations/DeleteAntiAffinityGroupResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
