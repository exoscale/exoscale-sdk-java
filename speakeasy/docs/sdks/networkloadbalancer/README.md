# NetworkLoadBalancer
(*networkLoadBalancer()*)

## Overview


A Network Load Balancer (NLB) is a Layer 4 (TCP/UDP) load balancer that distributes incoming traffic to Compute instances managed by an Instance Pool.

[Read more](https://community.exoscale.com/documentation/compute/network-load-balancer/)


Read more
<https://community.exoscale.com/documentation/compute/network-load-balancer/>
### Available Operations

* [deleteLoadBalancerService](#deleteloadbalancerservice) - Delete a Load Balancer Service
* [updateLoadBalancerService](#updateloadbalancerservice) - Update a Load Balancer Service
* [getLoadBalancerService](#getloadbalancerservice) - Retrieve Load Balancer Service details
* [createLoadBalancer](#createloadbalancer) - Create a Load Balancer
* [listLoadBalancers](#listloadbalancers) - List Load Balancers
* [resetLoadBalancerField](#resetloadbalancerfield) - Reset a Load Balancer field to its default value
* [resetLoadBalancerServiceField](#resetloadbalancerservicefield) - Reset a Load Balancer Service field to its default value
* [addServiceToLoadBalancer](#addservicetoloadbalancer) - Add a Load Balancer Service
* [updateLoadBalancer](#updateloadbalancer) - Update a Load Balancer
* [deleteLoadBalancer](#deleteloadbalancer) - Delete a Load Balancer
* [getLoadBalancer](#getloadbalancer) - Retrieve Load Balancer details

## deleteLoadBalancerService

Delete a Load Balancer Service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteLoadBalancerServiceRequest;
import com.exoscale.api.models.operations.DeleteLoadBalancerServiceResponse;
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

            DeleteLoadBalancerServiceResponse res = sdk.networkLoadBalancer().deleteLoadBalancerService()
                .id("266197f0-c85e-4981-85ec-e73d8dc6e6bf")
                .serviceId("03cf7ba0-13f2-4305-9769-06e0ffb8d5fc")
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
| `serviceId`        | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DeleteLoadBalancerServiceResponse>](../../models/operations/DeleteLoadBalancerServiceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateLoadBalancerService

Update a Load Balancer Service

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.LoadBalancerServiceHealthcheck;
import com.exoscale.api.models.components.Mode;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.Protocol;
import com.exoscale.api.models.operations.Strategy;
import com.exoscale.api.models.operations.UpdateLoadBalancerServiceRequest;
import com.exoscale.api.models.operations.UpdateLoadBalancerServiceRequestBody;
import com.exoscale.api.models.operations.UpdateLoadBalancerServiceResponse;
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

            UpdateLoadBalancerServiceResponse res = sdk.networkLoadBalancer().updateLoadBalancerService()
                .id("7ff5b3c3-35f1-472b-b8dd-d889167cc5a8")
                .serviceId("6d448a05-1546-4e32-a98e-bab1b60e1150")
                .requestBody(UpdateLoadBalancerServiceRequestBody.builder()
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
| `serviceId`                                                                                                                                | *String*                                                                                                                                   | :heavy_check_mark:                                                                                                                         | N/A                                                                                                                                        |
| `requestBody`                                                                                                                              | [com.exoscale.api.models.operations.UpdateLoadBalancerServiceRequestBody](../../models/operations/UpdateLoadBalancerServiceRequestBody.md) | :heavy_check_mark:                                                                                                                         | N/A                                                                                                                                        |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpdateLoadBalancerServiceResponse>](../../models/operations/UpdateLoadBalancerServiceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getLoadBalancerService

Retrieve Load Balancer Service details

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetLoadBalancerServiceRequest;
import com.exoscale.api.models.operations.GetLoadBalancerServiceResponse;
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

            GetLoadBalancerServiceResponse res = sdk.networkLoadBalancer().getLoadBalancerService()
                .id("dff55bdf-d46f-4cbb-acf6-c5975506a5f4")
                .serviceId("10945833-b4c4-4481-be27-797bdf252317")
                .call();

            if (res.loadBalancerService().isPresent()) {
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
| `serviceId`        | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetLoadBalancerServiceResponse>](../../models/operations/GetLoadBalancerServiceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createLoadBalancer

Create a Load Balancer

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateLoadBalancerRequestBody;
import com.exoscale.api.models.operations.CreateLoadBalancerResponse;
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

            CreateLoadBalancerRequestBody req = CreateLoadBalancerRequestBody.builder()
                .name("<value>")
                .description("Sharable dynamic infrastructure")
                .labels(java.util.Map.ofEntries(
                    entry("key", "<value>")))
                .build();

            CreateLoadBalancerResponse res = sdk.networkLoadBalancer().createLoadBalancer()
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
| `request`                                                                                                                    | [com.exoscale.api.models.operations.CreateLoadBalancerRequestBody](../../models/operations/CreateLoadBalancerRequestBody.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateLoadBalancerResponse>](../../models/operations/CreateLoadBalancerResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listLoadBalancers

List Load Balancers

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListLoadBalancersResponse;
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

            ListLoadBalancersResponse res = sdk.networkLoadBalancer().listLoadBalancers()
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

**[Optional<? extends com.exoscale.api.models.operations.ListLoadBalancersResponse>](../../models/operations/ListLoadBalancersResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## resetLoadBalancerField

Reset a Load Balancer field to its default value

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.PathParamField;
import com.exoscale.api.models.operations.ResetLoadBalancerFieldRequest;
import com.exoscale.api.models.operations.ResetLoadBalancerFieldResponse;
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

            ResetLoadBalancerFieldResponse res = sdk.networkLoadBalancer().resetLoadBalancerField()
                .id("41aaa1dd-b5cf-484a-8a72-f43b15272116")
                .field(PathParamField.DESCRIPTION)
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

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `id`                                                                                           | *String*                                                                                       | :heavy_check_mark:                                                                             | N/A                                                                                            |
| `field`                                                                                        | [com.exoscale.api.models.operations.PathParamField](../../models/operations/PathParamField.md) | :heavy_check_mark:                                                                             | N/A                                                                                            |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ResetLoadBalancerFieldResponse>](../../models/operations/ResetLoadBalancerFieldResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## resetLoadBalancerServiceField

Reset a Load Balancer Service field to its default value

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ResetLoadBalancerServiceFieldPathParamField;
import com.exoscale.api.models.operations.ResetLoadBalancerServiceFieldRequest;
import com.exoscale.api.models.operations.ResetLoadBalancerServiceFieldResponse;
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

            ResetLoadBalancerServiceFieldResponse res = sdk.networkLoadBalancer().resetLoadBalancerServiceField()
                .id("4601a50f-d19e-456f-b47b-965ae1d16ec2")
                .serviceId("752231d3-5c56-40e9-b608-9ac30b2e489a")
                .field(ResetLoadBalancerServiceFieldPathParamField.DESCRIPTION)
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
| `serviceId`                                                                                                                                              | *String*                                                                                                                                                 | :heavy_check_mark:                                                                                                                                       | N/A                                                                                                                                                      |
| `field`                                                                                                                                                  | [com.exoscale.api.models.operations.ResetLoadBalancerServiceFieldPathParamField](../../models/operations/ResetLoadBalancerServiceFieldPathParamField.md) | :heavy_check_mark:                                                                                                                                       | N/A                                                                                                                                                      |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ResetLoadBalancerServiceFieldResponse>](../../models/operations/ResetLoadBalancerServiceFieldResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## addServiceToLoadBalancer

Add a Load Balancer Service

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
import com.exoscale.api.models.components.InstancePoolInput;
import com.exoscale.api.models.components.InstanceTypeInput;
import com.exoscale.api.models.components.LoadBalancerServiceHealthcheck;
import com.exoscale.api.models.components.Manager;
import com.exoscale.api.models.components.Mode;
import com.exoscale.api.models.components.PrivateNetworkInput;
import com.exoscale.api.models.components.PublicIpAssignment;
import com.exoscale.api.models.components.SecurityGroupInput;
import com.exoscale.api.models.components.SecurityGroupResource;
import com.exoscale.api.models.components.SecurityGroupResourceVisibility;
import com.exoscale.api.models.components.SecurityGroupRule;
import com.exoscale.api.models.components.SecurityGroupRuleProtocol;
import com.exoscale.api.models.components.SshKeyInput;
import com.exoscale.api.models.components.TemplateInput;
import com.exoscale.api.models.components.Type;
import com.exoscale.api.models.components.ZoneName;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.AddServiceToLoadBalancerProtocol;
import com.exoscale.api.models.operations.AddServiceToLoadBalancerRequest;
import com.exoscale.api.models.operations.AddServiceToLoadBalancerRequestBody;
import com.exoscale.api.models.operations.AddServiceToLoadBalancerResponse;
import com.exoscale.api.models.operations.AddServiceToLoadBalancerStrategy;
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

            AddServiceToLoadBalancerResponse res = sdk.networkLoadBalancer().addServiceToLoadBalancer()
                .id("6ea0b5f5-38de-492f-a88e-38da4afa1ca4")
                .requestBody(AddServiceToLoadBalancerRequestBody.builder()
                    .name("<value>")
                    .instancePool(InstancePoolInput.builder()
                            .antiAffinityGroups(java.util.List.of(
                                AntiAffinityGroupInput.builder()
                                    .build()))
                            .description("Vision-oriented tangible budgetary management")
                            .publicIpAssignment(PublicIpAssignment.NONE)
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
                            .minAvailable(430449L)
                            .privateNetworks(java.util.List.of(
                                PrivateNetworkInput.builder()
                                    .build()))
                            .template(TemplateInput.builder()
                                .description("Profit-focused global framework")
                                .sshKeyEnabled(false)
                                .name("<value>")
                                .defaultUser("<value>")
                                .size(767508L)
                                .passwordEnabled(false)
                                .checksum("<value>")
                                .bootMode(BootMode.UEFI)
                                .zones(java.util.List.of(
                                    ZoneName.AT_VIE2))
                                .url("http://hoarse-software.org")
                                .build())
                            .size(143722L)
                            .sshKey(SshKeyInput.builder()
                                .name("<value>")
                                .build())
                            .instancePrefix("<value>")
                            .userData("<value>")
                            .manager(Manager.builder()
                                .id("aa813dc0-aa9e-4567-88f3-62d0da28c2b2")
                                .type(Type.SKS_NODEPOOL)
                                .build())
                            .deployTarget(DeployTarget.builder()
                                .id("912ff211-5196-457b-95e2-def2b4ceac48")
                                .name("<value>")
                                .type(DeployTargetType.DEDICATED)
                                .description("Front-line non-volatile frame")
                                .build())
                            .ipv6Enabled(false)
                            .diskSize(363148L)
                            .sshKeys(java.util.List.of(
                                SshKeyInput.builder()
                                    .build()))
                            .build())
                    .protocol(AddServiceToLoadBalancerProtocol.TCP)
                    .strategy(AddServiceToLoadBalancerStrategy.ROUND_ROBIN)
                    .port(740265L)
                    .targetPort(735904L)
                    .healthcheck(LoadBalancerServiceHealthcheck.builder()
                            .mode(Mode.HTTPS)
                            .interval(987824L)
                            .uri("http://granular-cook.com")
                            .port(384012L)
                            .timeout(802943L)
                            .retries(151607L)
                            .tlsSni("<value>")
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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                     | *String*                                                                                                                                 | :heavy_check_mark:                                                                                                                       | N/A                                                                                                                                      |
| `requestBody`                                                                                                                            | [com.exoscale.api.models.operations.AddServiceToLoadBalancerRequestBody](../../models/operations/AddServiceToLoadBalancerRequestBody.md) | :heavy_check_mark:                                                                                                                       | N/A                                                                                                                                      |


### Response

**[Optional<? extends com.exoscale.api.models.operations.AddServiceToLoadBalancerResponse>](../../models/operations/AddServiceToLoadBalancerResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateLoadBalancer

Update a Load Balancer

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.UpdateLoadBalancerRequest;
import com.exoscale.api.models.operations.UpdateLoadBalancerRequestBody;
import com.exoscale.api.models.operations.UpdateLoadBalancerResponse;
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

            UpdateLoadBalancerResponse res = sdk.networkLoadBalancer().updateLoadBalancer()
                .id("1cfda584-39da-4a45-8207-ff962cb4bcea")
                .requestBody(UpdateLoadBalancerRequestBody.builder()
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
| `requestBody`                                                                                                                | [com.exoscale.api.models.operations.UpdateLoadBalancerRequestBody](../../models/operations/UpdateLoadBalancerRequestBody.md) | :heavy_check_mark:                                                                                                           | N/A                                                                                                                          |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpdateLoadBalancerResponse>](../../models/operations/UpdateLoadBalancerResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteLoadBalancer

Delete a Load Balancer

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteLoadBalancerRequest;
import com.exoscale.api.models.operations.DeleteLoadBalancerResponse;
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

            DeleteLoadBalancerResponse res = sdk.networkLoadBalancer().deleteLoadBalancer()
                .id("abfb8760-0512-46c2-bb36-5004d0f74fe7")
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

**[Optional<? extends com.exoscale.api.models.operations.DeleteLoadBalancerResponse>](../../models/operations/DeleteLoadBalancerResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getLoadBalancer

Retrieve Load Balancer details

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetLoadBalancerRequest;
import com.exoscale.api.models.operations.GetLoadBalancerResponse;
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

            GetLoadBalancerResponse res = sdk.networkLoadBalancer().getLoadBalancer()
                .id("e5898236-68d7-4a7a-bae6-932131135ce4")
                .call();

            if (res.loadBalancer().isPresent()) {
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

**[Optional<? extends com.exoscale.api.models.operations.GetLoadBalancerResponse>](../../models/operations/GetLoadBalancerResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
