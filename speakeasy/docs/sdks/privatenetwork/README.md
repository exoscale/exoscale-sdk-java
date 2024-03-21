# PrivateNetwork
(*privateNetwork()*)

### Available Operations

* [attachInstanceToPrivateNetwork](#attachinstancetoprivatenetwork) - Attach a Compute instance to a Private Network
* [updatePrivateNetworkInstanceIp](#updateprivatenetworkinstanceip) - Update the IP address of an instance attached to a managed private network
* [listPrivateNetworks](#listprivatenetworks) - List Private Networks
* [createPrivateNetwork](#createprivatenetwork) - Create a Private Network
* [detachInstanceFromPrivateNetwork](#detachinstancefromprivatenetwork) - Detach a Compute instance from a Private Network
* [updatePrivateNetwork](#updateprivatenetwork) - Update a Private Network
* [getPrivateNetwork](#getprivatenetwork) - Retrieve Private Network details
* [deletePrivateNetwork](#deleteprivatenetwork) - Delete a Private Network
* [resetPrivateNetworkField](#resetprivatenetworkfield) - Reset Private Network field

## attachInstanceToPrivateNetwork

Attach a Compute instance to a Private Network

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.AttachInstanceToPrivateNetworkRequest;
import com.exoscale.api.models.operations.AttachInstanceToPrivateNetworkRequestBody;
import com.exoscale.api.models.operations.AttachInstanceToPrivateNetworkResponse;
import com.exoscale.api.models.operations.Instance;
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

            AttachInstanceToPrivateNetworkResponse res = sdk.privateNetwork().attachInstanceToPrivateNetwork()
                .id("ba874a02-c489-47c1-a375-5ed611a531be")
                .requestBody(AttachInstanceToPrivateNetworkRequestBody.builder()
                    .instance(Instance.builder()
                            .id("66c8eefc-c463-4e2f-9864-25eaaf95e05d")
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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                 | *String*                                                                                                                                             | :heavy_check_mark:                                                                                                                                   | N/A                                                                                                                                                  |
| `requestBody`                                                                                                                                        | [com.exoscale.api.models.operations.AttachInstanceToPrivateNetworkRequestBody](../../models/operations/AttachInstanceToPrivateNetworkRequestBody.md) | :heavy_check_mark:                                                                                                                                   | N/A                                                                                                                                                  |


### Response

**[Optional<? extends com.exoscale.api.models.operations.AttachInstanceToPrivateNetworkResponse>](../../models/operations/AttachInstanceToPrivateNetworkResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updatePrivateNetworkInstanceIp

Update the IP address of an instance attached to a managed private network

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.UpdatePrivateNetworkInstanceIpInstance;
import com.exoscale.api.models.operations.UpdatePrivateNetworkInstanceIpRequest;
import com.exoscale.api.models.operations.UpdatePrivateNetworkInstanceIpRequestBody;
import com.exoscale.api.models.operations.UpdatePrivateNetworkInstanceIpResponse;
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

            UpdatePrivateNetworkInstanceIpResponse res = sdk.privateNetwork().updatePrivateNetworkInstanceIp()
                .id("e5bd5442-6e67-407c-9798-17948d835ce4")
                .requestBody(UpdatePrivateNetworkInstanceIpRequestBody.builder()
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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                 | *String*                                                                                                                                             | :heavy_check_mark:                                                                                                                                   | N/A                                                                                                                                                  |
| `requestBody`                                                                                                                                        | [com.exoscale.api.models.operations.UpdatePrivateNetworkInstanceIpRequestBody](../../models/operations/UpdatePrivateNetworkInstanceIpRequestBody.md) | :heavy_check_mark:                                                                                                                                   | N/A                                                                                                                                                  |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpdatePrivateNetworkInstanceIpResponse>](../../models/operations/UpdatePrivateNetworkInstanceIpResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listPrivateNetworks

List Private Networks

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListPrivateNetworksResponse;
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

            ListPrivateNetworksResponse res = sdk.privateNetwork().listPrivateNetworks()
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

**[Optional<? extends com.exoscale.api.models.operations.ListPrivateNetworksResponse>](../../models/operations/ListPrivateNetworksResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createPrivateNetwork

Create a Private Network

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreatePrivateNetworkRequestBody;
import com.exoscale.api.models.operations.CreatePrivateNetworkResponse;
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

            CreatePrivateNetworkRequestBody req = CreatePrivateNetworkRequestBody.builder()
                .name("<value>")
                .description("Balanced maximized internet solution")
                .netmask("169.147.99.80")
                .startIp("0.125.55.174")
                .endIp("13.54.138.36")
                .labels(java.util.Map.ofEntries(
                    entry("key", "<value>")))
                .build();

            CreatePrivateNetworkResponse res = sdk.privateNetwork().createPrivateNetwork()
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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.exoscale.api.models.operations.CreatePrivateNetworkRequestBody](../../models/operations/CreatePrivateNetworkRequestBody.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreatePrivateNetworkResponse>](../../models/operations/CreatePrivateNetworkResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## detachInstanceFromPrivateNetwork

Detach a Compute instance from a Private Network

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
import com.exoscale.api.models.components.Export;
import com.exoscale.api.models.components.FlowDirection;
import com.exoscale.api.models.components.Icmp;
import com.exoscale.api.models.components.Instance;
import com.exoscale.api.models.components.InstanceInput;
import com.exoscale.api.models.components.InstanceState;
import com.exoscale.api.models.components.InstanceTypeInput;
import com.exoscale.api.models.components.Manager;
import com.exoscale.api.models.components.PrivateNetworkInput;
import com.exoscale.api.models.components.PublicIpAssignment;
import com.exoscale.api.models.components.SecurityGroupInput;
import com.exoscale.api.models.components.SecurityGroupResource;
import com.exoscale.api.models.components.SecurityGroupResourceVisibility;
import com.exoscale.api.models.components.SecurityGroupRule;
import com.exoscale.api.models.components.SecurityGroupRuleProtocol;
import com.exoscale.api.models.components.SnapshotInput;
import com.exoscale.api.models.components.SnapshotState;
import com.exoscale.api.models.components.SshKeyInput;
import com.exoscale.api.models.components.TemplateInput;
import com.exoscale.api.models.components.Type;
import com.exoscale.api.models.components.ZoneName;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DetachInstanceFromPrivateNetworkRequest;
import com.exoscale.api.models.operations.DetachInstanceFromPrivateNetworkRequestBody;
import com.exoscale.api.models.operations.DetachInstanceFromPrivateNetworkResponse;
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

            DetachInstanceFromPrivateNetworkResponse res = sdk.privateNetwork().detachInstanceFromPrivateNetwork()
                .id("b7b25178-700b-4c79-a195-27016f340d57")
                .requestBody(DetachInstanceFromPrivateNetworkRequestBody.builder()
                    .instance(InstanceInput.builder()
                            .antiAffinityGroups(java.util.List.of(
                                AntiAffinityGroupInput.builder()
                                    .build()))
                            .publicIpAssignment(PublicIpAssignment.DUAL)
                            .labels(java.util.Map.ofEntries(
                                entry("key", "<value>")))
                            .securityGroups(java.util.List.of(
                                SecurityGroupInput.builder()
                                    .build()))
                            .elasticIps(java.util.List.of(
                                ElasticIpInput.builder()
                                    .build()))
                            .name("<value>")
                            .instanceType(InstanceTypeInput.builder()
                                .build())
                            .privateNetworks(java.util.List.of(
                                PrivateNetworkInput.builder()
                                    .build()))
                            .template(TemplateInput.builder()
                                .description("Upgradable uniform model")
                                .sshKeyEnabled(false)
                                .name("<value>")
                                .defaultUser("<value>")
                                .size(294929L)
                                .passwordEnabled(false)
                                .checksum("<value>")
                                .bootMode(BootMode.LEGACY)
                                .zones(java.util.List.of(
                                    ZoneName.AT_VIE2))
                                .url("http://ragged-sausage.com")
                                .build())
                            .state(InstanceState.STARTING)
                            .sshKey(SshKeyInput.builder()
                                .name("<value>")
                                .build())
                            .userData("<value>")
                            .manager(Manager.builder()
                                .id("9fdd0c02-704b-465c-881c-a45d8e76787a")
                                .type(Type.SKS_NODEPOOL)
                                .build())
                            .deployTarget(DeployTarget.builder()
                                .id("7fd8e7ae-c6de-4af4-9754-b699908016e4")
                                .name("<value>")
                                .type(DeployTargetType.DEDICATED)
                                .description("Reverse-engineered real-time internet solution")
                                .build())
                            .snapshots(java.util.List.of(
                                SnapshotInput.builder()
                                    .build()))
                            .diskSize(985717L)
                            .sshKeys(java.util.List.of(
                                SshKeyInput.builder()
                                    .build()))
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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                     | *String*                                                                                                                                                 | :heavy_check_mark:                                                                                                                                       | N/A                                                                                                                                                      |
| `requestBody`                                                                                                                                            | [com.exoscale.api.models.operations.DetachInstanceFromPrivateNetworkRequestBody](../../models/operations/DetachInstanceFromPrivateNetworkRequestBody.md) | :heavy_check_mark:                                                                                                                                       | N/A                                                                                                                                                      |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DetachInstanceFromPrivateNetworkResponse>](../../models/operations/DetachInstanceFromPrivateNetworkResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updatePrivateNetwork

Update a Private Network

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.UpdatePrivateNetworkRequest;
import com.exoscale.api.models.operations.UpdatePrivateNetworkRequestBody;
import com.exoscale.api.models.operations.UpdatePrivateNetworkResponse;
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

            UpdatePrivateNetworkResponse res = sdk.privateNetwork().updatePrivateNetwork()
                .id("14ef7bed-2e19-49f7-8119-c79f5c778191")
                .requestBody(UpdatePrivateNetworkRequestBody.builder()
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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                             | *String*                                                                                                                         | :heavy_check_mark:                                                                                                               | N/A                                                                                                                              |
| `requestBody`                                                                                                                    | [com.exoscale.api.models.operations.UpdatePrivateNetworkRequestBody](../../models/operations/UpdatePrivateNetworkRequestBody.md) | :heavy_check_mark:                                                                                                               | N/A                                                                                                                              |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpdatePrivateNetworkResponse>](../../models/operations/UpdatePrivateNetworkResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getPrivateNetwork

Retrieve Private Network details

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetPrivateNetworkRequest;
import com.exoscale.api.models.operations.GetPrivateNetworkResponse;
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

            GetPrivateNetworkResponse res = sdk.privateNetwork().getPrivateNetwork()
                .id("c5cb37b9-3879-48d4-b707-8c0a70a76423")
                .call();

            if (res.privateNetwork().isPresent()) {
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

**[Optional<? extends com.exoscale.api.models.operations.GetPrivateNetworkResponse>](../../models/operations/GetPrivateNetworkResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deletePrivateNetwork

Delete a Private Network

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeletePrivateNetworkRequest;
import com.exoscale.api.models.operations.DeletePrivateNetworkResponse;
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

            DeletePrivateNetworkResponse res = sdk.privateNetwork().deletePrivateNetwork()
                .id("de8976a1-24fe-4984-9430-c1ebe04efffc")
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

**[Optional<? extends com.exoscale.api.models.operations.DeletePrivateNetworkResponse>](../../models/operations/DeletePrivateNetworkResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## resetPrivateNetworkField

Reset Private Network field

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ResetPrivateNetworkFieldPathParamField;
import com.exoscale.api.models.operations.ResetPrivateNetworkFieldRequest;
import com.exoscale.api.models.operations.ResetPrivateNetworkFieldResponse;
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

            ResetPrivateNetworkFieldResponse res = sdk.privateNetwork().resetPrivateNetworkField()
                .id("fd8981d6-e5b8-4088-aba2-7f822c977310")
                .field(ResetPrivateNetworkFieldPathParamField.LABELS)
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
| `field`                                                                                                                                        | [com.exoscale.api.models.operations.ResetPrivateNetworkFieldPathParamField](../../models/operations/ResetPrivateNetworkFieldPathParamField.md) | :heavy_check_mark:                                                                                                                             | N/A                                                                                                                                            |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ResetPrivateNetworkFieldResponse>](../../models/operations/ResetPrivateNetworkFieldResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
