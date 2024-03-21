# InstancePool
(*instancePool()*)

### Available Operations

* [scaleInstancePool](#scaleinstancepool) - Scale an Instance Pool
* [listInstancePools](#listinstancepools) - List Instance Pools
* [createInstancePool](#createinstancepool) - Create an Instance Pool
* [deleteInstancePool](#deleteinstancepool) - Delete an Instance Pool
* [getInstancePool](#getinstancepool) - Retrieve Instance Pool details
* [updateInstancePool](#updateinstancepool) - Update an Instance Pool
* [resetInstancePoolField](#resetinstancepoolfield) - Reset an Instance Pool field to its default value
* [evictInstancePoolMembers](#evictinstancepoolmembers) - Evict Instance Pool members

## scaleInstancePool

Scale an Instance Pool

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ScaleInstancePoolRequest;
import com.exoscale.api.models.operations.ScaleInstancePoolRequestBody;
import com.exoscale.api.models.operations.ScaleInstancePoolResponse;
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

            ScaleInstancePoolResponse res = sdk.instancePool().scaleInstancePool()
                .id("17714eee-31b4-476b-b656-89d062df0b9f")
                .requestBody(ScaleInstancePoolRequestBody.builder()
                    .size(252584L)
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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                       | *String*                                                                                                                   | :heavy_check_mark:                                                                                                         | N/A                                                                                                                        |
| `requestBody`                                                                                                              | [com.exoscale.api.models.operations.ScaleInstancePoolRequestBody](../../models/operations/ScaleInstancePoolRequestBody.md) | :heavy_check_mark:                                                                                                         | N/A                                                                                                                        |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ScaleInstancePoolResponse>](../../models/operations/ScaleInstancePoolResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listInstancePools

List Instance Pools

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListInstancePoolsResponse;
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

            ListInstancePoolsResponse res = sdk.instancePool().listInstancePools()
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

**[Optional<? extends com.exoscale.api.models.operations.ListInstancePoolsResponse>](../../models/operations/ListInstancePoolsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createInstancePool

Create an Instance Pool

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.AntiAffinityGroupInput;
import com.exoscale.api.models.components.BootMode;
import com.exoscale.api.models.components.DeployTarget;
import com.exoscale.api.models.components.DeployTargetType;
import com.exoscale.api.models.components.ElasticIpHealthcheck;
import com.exoscale.api.models.components.ElasticIpHealthcheckMode;
import com.exoscale.api.models.components.ElasticIpInput;
import com.exoscale.api.models.components.FlowDirection;
import com.exoscale.api.models.components.Icmp;
import com.exoscale.api.models.components.InstanceTypeInput;
import com.exoscale.api.models.components.PrivateNetworkInput;
import com.exoscale.api.models.components.PublicIpAssignment;
import com.exoscale.api.models.components.SecurityGroupInput;
import com.exoscale.api.models.components.SecurityGroupResource;
import com.exoscale.api.models.components.SecurityGroupResourceVisibility;
import com.exoscale.api.models.components.SecurityGroupRule;
import com.exoscale.api.models.components.SecurityGroupRuleProtocol;
import com.exoscale.api.models.components.SshKeyInput;
import com.exoscale.api.models.components.TemplateInput;
import com.exoscale.api.models.components.ZoneName;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateInstancePoolRequestBody;
import com.exoscale.api.models.operations.CreateInstancePoolResponse;
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

            CreateInstancePoolRequestBody req = CreateInstancePoolRequestBody.builder()
                .name("<value>")
                .instanceType(InstanceTypeInput.builder()
                        .build())
                .template(TemplateInput.builder()
                        .description("Innovative bandwidth-monitored secured line")
                        .sshKeyEnabled(false)
                        .name("<value>")
                        .defaultUser("<value>")
                        .size(269132L)
                        .passwordEnabled(false)
                        .checksum("<value>")
                        .bootMode(BootMode.UEFI)
                        .zones(java.util.List.of(
                            ZoneName.CH_DK2))
                        .url("https://bright-judge.com")
                        .build())
                .size(584691L)
                .diskSize(543261L)
                .antiAffinityGroups(java.util.List.of(
                    AntiAffinityGroupInput.builder()
                        .build()))
                .description("Cross-group object-oriented circuit")
                .publicIpAssignment(PublicIpAssignment.NONE)
                .labels(java.util.Map.ofEntries(
                    entry("key", "<value>")))
                .securityGroups(java.util.List.of(
                    SecurityGroupInput.builder()
                        .build()))
                .elasticIps(java.util.List.of(
                    ElasticIpInput.builder()
                        .build()))
                .minAvailable(353614L)
                .privateNetworks(java.util.List.of(
                    PrivateNetworkInput.builder()
                        .build()))
                .sshKey(SshKeyInput.builder()
                    .name("<value>")
                    .build())
                .instancePrefix("<value>")
                .userData("<value>")
                .deployTarget(DeployTarget.builder()
                    .id("af515361-4ef1-4d57-b728-07f7c448c8a8")
                    .name("<value>")
                    .type(DeployTargetType.EDGE)
                    .description("Advanced solution-oriented neural-net")
                    .build())
                .ipv6Enabled(false)
                .sshKeys(java.util.List.of(
                    SshKeyInput.builder()
                        .build()))
                .build();

            CreateInstancePoolResponse res = sdk.instancePool().createInstancePool()
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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.exoscale.api.models.operations.CreateInstancePoolRequestBody](../../models/operations/CreateInstancePoolRequestBody.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateInstancePoolResponse>](../../models/operations/CreateInstancePoolResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteInstancePool

Delete an Instance Pool

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteInstancePoolRequest;
import com.exoscale.api.models.operations.DeleteInstancePoolResponse;
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

            DeleteInstancePoolResponse res = sdk.instancePool().deleteInstancePool()
                .id("67690401-f1d2-4855-9d39-471819d308d3")
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

**[Optional<? extends com.exoscale.api.models.operations.DeleteInstancePoolResponse>](../../models/operations/DeleteInstancePoolResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getInstancePool

Retrieve Instance Pool details

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetInstancePoolRequest;
import com.exoscale.api.models.operations.GetInstancePoolResponse;
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

            GetInstancePoolResponse res = sdk.instancePool().getInstancePool()
                .id("c340464a-89af-41ca-8686-9ebc33b90624")
                .call();

            if (res.instancePool().isPresent()) {
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

**[Optional<? extends com.exoscale.api.models.operations.GetInstancePoolResponse>](../../models/operations/GetInstancePoolResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateInstancePool

Update an Instance Pool

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.AntiAffinityGroupInput;
import com.exoscale.api.models.components.BootMode;
import com.exoscale.api.models.components.DeployTarget;
import com.exoscale.api.models.components.DeployTargetType;
import com.exoscale.api.models.components.ElasticIpHealthcheck;
import com.exoscale.api.models.components.ElasticIpHealthcheckMode;
import com.exoscale.api.models.components.ElasticIpInput;
import com.exoscale.api.models.components.FlowDirection;
import com.exoscale.api.models.components.Icmp;
import com.exoscale.api.models.components.InstanceTypeInput;
import com.exoscale.api.models.components.PrivateNetworkInput;
import com.exoscale.api.models.components.PublicIpAssignment;
import com.exoscale.api.models.components.SecurityGroupInput;
import com.exoscale.api.models.components.SecurityGroupResource;
import com.exoscale.api.models.components.SecurityGroupResourceVisibility;
import com.exoscale.api.models.components.SecurityGroupRule;
import com.exoscale.api.models.components.SecurityGroupRuleProtocol;
import com.exoscale.api.models.components.SshKeyInput;
import com.exoscale.api.models.components.TemplateInput;
import com.exoscale.api.models.components.ZoneName;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.UpdateInstancePoolRequest;
import com.exoscale.api.models.operations.UpdateInstancePoolRequestBody;
import com.exoscale.api.models.operations.UpdateInstancePoolResponse;
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

            UpdateInstancePoolResponse res = sdk.instancePool().updateInstancePool()
                .id("fa75c03e-1883-4215-b058-9a2515a2eb70")
                .requestBody(UpdateInstancePoolRequestBody.builder()
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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                         | *String*                                                                                                                     | :heavy_check_mark:                                                                                                           | N/A                                                                                                                          |
| `requestBody`                                                                                                                | [com.exoscale.api.models.operations.UpdateInstancePoolRequestBody](../../models/operations/UpdateInstancePoolRequestBody.md) | :heavy_check_mark:                                                                                                           | N/A                                                                                                                          |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpdateInstancePoolResponse>](../../models/operations/UpdateInstancePoolResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## resetInstancePoolField

Reset an Instance Pool field to its default value

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ResetInstancePoolFieldPathParamField;
import com.exoscale.api.models.operations.ResetInstancePoolFieldRequest;
import com.exoscale.api.models.operations.ResetInstancePoolFieldResponse;
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

            ResetInstancePoolFieldResponse res = sdk.instancePool().resetInstancePoolField()
                .id("996e406d-e3f1-4359-9659-6ae111a92563")
                .field(ResetInstancePoolFieldPathParamField.ANTI_AFFINITY_GROUPS)
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
| `field`                                                                                                                                    | [com.exoscale.api.models.operations.ResetInstancePoolFieldPathParamField](../../models/operations/ResetInstancePoolFieldPathParamField.md) | :heavy_check_mark:                                                                                                                         | N/A                                                                                                                                        |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ResetInstancePoolFieldResponse>](../../models/operations/ResetInstancePoolFieldResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## evictInstancePoolMembers

This operation evicts the specified Compute instances member from the Instance Pool, shrinking it to `&lt;current pool size&gt; - &lt;# evicted members&gt;`.

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.EvictInstancePoolMembersRequest;
import com.exoscale.api.models.operations.EvictInstancePoolMembersRequestBody;
import com.exoscale.api.models.operations.EvictInstancePoolMembersResponse;
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

            EvictInstancePoolMembersResponse res = sdk.instancePool().evictInstancePoolMembers()
                .id("2956d875-6a88-48d2-81c1-30cd49a23823")
                .requestBody(EvictInstancePoolMembersRequestBody.builder()
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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                     | *String*                                                                                                                                 | :heavy_check_mark:                                                                                                                       | N/A                                                                                                                                      |
| `requestBody`                                                                                                                            | [com.exoscale.api.models.operations.EvictInstancePoolMembersRequestBody](../../models/operations/EvictInstancePoolMembersRequestBody.md) | :heavy_check_mark:                                                                                                                       | N/A                                                                                                                                      |


### Response

**[Optional<? extends com.exoscale.api.models.operations.EvictInstancePoolMembersResponse>](../../models/operations/EvictInstancePoolMembersResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
