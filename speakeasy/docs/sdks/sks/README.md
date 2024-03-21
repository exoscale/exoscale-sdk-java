# Sks
(*sks()*)

## Overview


SKS is Exoscale's scalable Kubernetes service which provides managed Kubernetes
control planes with integrated support for Exoscale instance pools ands network load
balancers.
[Read more](https://www.exoscale.com/scalable-kubernetes-service/)

Read more
<https://www.exoscale.com/scalable-kubernetes-service/>
### Available Operations

* [generateSksClusterKubeconfig](#generatesksclusterkubeconfig) - Generate a new Kubeconfig file for a SKS cluster
* [updateSksNodepool](#updatesksnodepool) - Update an SKS Nodepool
* [getSksNodepool](#getsksnodepool) - Retrieve SKS Nodepool details
* [deleteSksNodepool](#deletesksnodepool) - Delete an SKS Nodepool
* [getSksClusterAuthorityCert](#getsksclusterauthoritycert) - Get the certificate for a SKS cluster authority
* [listSksClusterDeprecatedResources](#listsksclusterdeprecatedresources) - Resources that are scheduled to be removed in future kubernetes releases
* [scaleSksNodepool](#scalesksnodepool) - Scale a SKS Nodepool
* [upgradeSksClusterServiceLevel](#upgradesksclusterservicelevel) - Upgrade a SKS cluster to pro
* [evictSksNodepoolMembers](#evictsksnodepoolmembers) - Evict Nodepool members
* [createSksCluster](#createskscluster) - Create an SKS cluster
* [listSksClusters](#listsksclusters) - List SKS clusters
* [deleteSksCluster](#deleteskscluster) - Delete an SKS cluster
* [getSksCluster](#getskscluster) - Retrieve SKS cluster details
* [updateSksCluster](#updateskscluster) - Update an SKS cluster
* [getSksClusterInspection](#getsksclusterinspection) - Get the latest inspection result
* [rotateSksCcmCredentials](#rotatesksccmcredentials) - Rotate Exoscale CCM credentials
* [resetSksClusterField](#resetsksclusterfield) - Reset an SKS cluster field to its default value
* [createSksNodepool](#createsksnodepool) - Create a new SKS Nodepool
* [resetSksNodepoolField](#resetsksnodepoolfield) - Reset an SKS Nodepool field to its default value
* [rotateSksOperatorsCa](#rotatesksoperatorsca) - Rotate operators certificate authority
* [listSksClusterVersions](#listsksclusterversions) - List available versions for SKS clusters
* [upgradeSksCluster](#upgradeskscluster) - Upgrade an SKS cluster

## generateSksClusterKubeconfig

This operation returns a Kubeconfig file encoded in base64.

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.SksKubeconfigRequest;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GenerateSksClusterKubeconfigRequest;
import com.exoscale.api.models.operations.GenerateSksClusterKubeconfigResponse;
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

            GenerateSksClusterKubeconfigResponse res = sdk.sks().generateSksClusterKubeconfig()
                .id("225679c1-13b4-48bc-a1a9-e5efaab19566")
                .sksKubeconfigRequest(SksKubeconfigRequest.builder()
                    .build())
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

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                       | *String*                                                                                                   | :heavy_check_mark:                                                                                         | N/A                                                                                                        |
| `sksKubeconfigRequest`                                                                                     | [com.exoscale.api.models.components.SksKubeconfigRequest](../../models/components/SksKubeconfigRequest.md) | :heavy_check_mark:                                                                                         | N/A                                                                                                        |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GenerateSksClusterKubeconfigResponse>](../../models/operations/GenerateSksClusterKubeconfigResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateSksNodepool

Update an SKS Nodepool

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.AntiAffinityGroupInput;
import com.exoscale.api.models.components.DeployTarget;
import com.exoscale.api.models.components.DeployTargetType;
import com.exoscale.api.models.components.Effect;
import com.exoscale.api.models.components.FlowDirection;
import com.exoscale.api.models.components.Icmp;
import com.exoscale.api.models.components.InstanceTypeInput;
import com.exoscale.api.models.components.PrivateNetworkInput;
import com.exoscale.api.models.components.SecurityGroupInput;
import com.exoscale.api.models.components.SecurityGroupResource;
import com.exoscale.api.models.components.SecurityGroupResourceVisibility;
import com.exoscale.api.models.components.SecurityGroupRule;
import com.exoscale.api.models.components.SecurityGroupRuleProtocol;
import com.exoscale.api.models.components.SksNodepoolTaint;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.UpdateSksNodepoolRequest;
import com.exoscale.api.models.operations.UpdateSksNodepoolRequestBody;
import com.exoscale.api.models.operations.UpdateSksNodepoolResponse;
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

            UpdateSksNodepoolResponse res = sdk.sks().updateSksNodepool()
                .id("62f2da14-f713-48c5-9787-3caa3a2cbcdc")
                .sksNodepoolId("67bfe4cc-faeb-45ee-a4eb-6f142d2be2f6")
                .requestBody(UpdateSksNodepoolRequestBody.builder()
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
| `sksNodepoolId`                                                                                                            | *String*                                                                                                                   | :heavy_check_mark:                                                                                                         | N/A                                                                                                                        |
| `requestBody`                                                                                                              | [com.exoscale.api.models.operations.UpdateSksNodepoolRequestBody](../../models/operations/UpdateSksNodepoolRequestBody.md) | :heavy_check_mark:                                                                                                         | N/A                                                                                                                        |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpdateSksNodepoolResponse>](../../models/operations/UpdateSksNodepoolResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getSksNodepool

Retrieve SKS Nodepool details

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetSksNodepoolRequest;
import com.exoscale.api.models.operations.GetSksNodepoolResponse;
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

            GetSksNodepoolResponse res = sdk.sks().getSksNodepool()
                .id("0caa1077-3810-4f0b-886f-c0b32b6b4904")
                .sksNodepoolId("d2f104b4-191d-4954-a07a-4b9d409e207e")
                .call();

            if (res.sksNodepool().isPresent()) {
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
| `sksNodepoolId`    | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetSksNodepoolResponse>](../../models/operations/GetSksNodepoolResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteSksNodepool

Delete an SKS Nodepool

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteSksNodepoolRequest;
import com.exoscale.api.models.operations.DeleteSksNodepoolResponse;
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

            DeleteSksNodepoolResponse res = sdk.sks().deleteSksNodepool()
                .id("f2564a90-aa8e-4a58-817e-035c798270b7")
                .sksNodepoolId("ba8225c8-ae42-492d-9696-a218140b3faf")
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
| `sksNodepoolId`    | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DeleteSksNodepoolResponse>](../../models/operations/DeleteSksNodepoolResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getSksClusterAuthorityCert

This operation returns the certificate for the given SKS cluster authority encoded in base64.

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.Authority;
import com.exoscale.api.models.operations.GetSksClusterAuthorityCertRequest;
import com.exoscale.api.models.operations.GetSksClusterAuthorityCertResponse;
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

            GetSksClusterAuthorityCertResponse res = sdk.sks().getSksClusterAuthorityCert()
                .id("1f8990ee-7386-44f1-a2bd-7bb72fd9538f")
                .authority(Authority.KUBELET)
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

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `id`                                                                                 | *String*                                                                             | :heavy_check_mark:                                                                   | N/A                                                                                  |
| `authority`                                                                          | [com.exoscale.api.models.operations.Authority](../../models/operations/Authority.md) | :heavy_check_mark:                                                                   | N/A                                                                                  |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetSksClusterAuthorityCertResponse>](../../models/operations/GetSksClusterAuthorityCertResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listSksClusterDeprecatedResources

This operation returns the deprecated resources for a given cluster

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListSksClusterDeprecatedResourcesRequest;
import com.exoscale.api.models.operations.ListSksClusterDeprecatedResourcesResponse;
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

            ListSksClusterDeprecatedResourcesResponse res = sdk.sks().listSksClusterDeprecatedResources()
                .id("f1e0157c-d711-402b-a1c4-00ec4e2b18c9")
                .call();

            if (res.maps().isPresent()) {
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

**[Optional<? extends com.exoscale.api.models.operations.ListSksClusterDeprecatedResourcesResponse>](../../models/operations/ListSksClusterDeprecatedResourcesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## scaleSksNodepool

Scale a SKS Nodepool

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ScaleSksNodepoolRequest;
import com.exoscale.api.models.operations.ScaleSksNodepoolRequestBody;
import com.exoscale.api.models.operations.ScaleSksNodepoolResponse;
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

            ScaleSksNodepoolResponse res = sdk.sks().scaleSksNodepool()
                .id("1c81a804-3aec-4758-b672-dc5f60973883")
                .sksNodepoolId("25ff30c6-f451-40f5-8c3a-debd73573c8b")
                .requestBody(ScaleSksNodepoolRequestBody.builder()
                    .size(921559L)
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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                                     | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `sksNodepoolId`                                                                                                          | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `requestBody`                                                                                                            | [com.exoscale.api.models.operations.ScaleSksNodepoolRequestBody](../../models/operations/ScaleSksNodepoolRequestBody.md) | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ScaleSksNodepoolResponse>](../../models/operations/ScaleSksNodepoolResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## upgradeSksClusterServiceLevel

Upgrade a SKS cluster to pro

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.UpgradeSksClusterServiceLevelRequest;
import com.exoscale.api.models.operations.UpgradeSksClusterServiceLevelResponse;
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

            UpgradeSksClusterServiceLevelResponse res = sdk.sks().upgradeSksClusterServiceLevel()
                .id("682a7eaa-f076-4af7-b736-4130824868bb")
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

**[Optional<? extends com.exoscale.api.models.operations.UpgradeSksClusterServiceLevelResponse>](../../models/operations/UpgradeSksClusterServiceLevelResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## evictSksNodepoolMembers

This operation evicts the specified Compute instances member from the Nodepool, shrinking it to `&lt;current nodepool size&gt; - &lt;# evicted members&gt;`.

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.EvictSksNodepoolMembersRequest;
import com.exoscale.api.models.operations.EvictSksNodepoolMembersRequestBody;
import com.exoscale.api.models.operations.EvictSksNodepoolMembersResponse;
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

            EvictSksNodepoolMembersResponse res = sdk.sks().evictSksNodepoolMembers()
                .id("170a99c1-27d2-4e07-b23c-39ebf69c7bdd")
                .sksNodepoolId("ca196fe2-4c3e-48ee-b263-829359bcc625")
                .requestBody(EvictSksNodepoolMembersRequestBody.builder()
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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                   | *String*                                                                                                                               | :heavy_check_mark:                                                                                                                     | N/A                                                                                                                                    |
| `sksNodepoolId`                                                                                                                        | *String*                                                                                                                               | :heavy_check_mark:                                                                                                                     | N/A                                                                                                                                    |
| `requestBody`                                                                                                                          | [com.exoscale.api.models.operations.EvictSksNodepoolMembersRequestBody](../../models/operations/EvictSksNodepoolMembersRequestBody.md) | :heavy_check_mark:                                                                                                                     | N/A                                                                                                                                    |


### Response

**[Optional<? extends com.exoscale.api.models.operations.EvictSksNodepoolMembersResponse>](../../models/operations/EvictSksNodepoolMembersResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createSksCluster

Create an SKS cluster

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.SksOidc;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.Addons;
import com.exoscale.api.models.operations.Cni;
import com.exoscale.api.models.operations.CreateSksClusterRequestBody;
import com.exoscale.api.models.operations.CreateSksClusterResponse;
import com.exoscale.api.models.operations.Level;
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

            CreateSksClusterRequestBody req = CreateSksClusterRequestBody.builder()
                .name("<value>")
                .level(Level.PRO)
                .version("<value>")
                .description("Organic eco-centric Graphic Interface")
                .labels(java.util.Map.ofEntries(
                    entry("key", "<value>")))
                .cni(Cni.CALICO)
                .autoUpgrade(false)
                .oidc(SksOidc.builder()
                    .clientId("<value>")
                    .issuerUrl("<value>")
                    .usernameClaim("<value>")
                    .usernamePrefix("<value>")
                    .groupsClaim("<value>")
                    .groupsPrefix("<value>")
                    .requiredClaim(java.util.Map.ofEntries(
                        entry("key", "<value>")))
                    .build())
                .addons(java.util.List.of(
                    Addons.EXOSCALE_CONTAINER_STORAGE_INTERFACE))
                .build();

            CreateSksClusterResponse res = sdk.sks().createSksCluster()
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
| `request`                                                                                                                | [com.exoscale.api.models.operations.CreateSksClusterRequestBody](../../models/operations/CreateSksClusterRequestBody.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateSksClusterResponse>](../../models/operations/CreateSksClusterResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listSksClusters

List SKS clusters

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListSksClustersResponse;
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

            ListSksClustersResponse res = sdk.sks().listSksClusters()
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

**[Optional<? extends com.exoscale.api.models.operations.ListSksClustersResponse>](../../models/operations/ListSksClustersResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteSksCluster

Delete an SKS cluster

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteSksClusterRequest;
import com.exoscale.api.models.operations.DeleteSksClusterResponse;
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

            DeleteSksClusterResponse res = sdk.sks().deleteSksCluster()
                .id("0b2a8956-0f84-4213-bee2-c91f946ea28b")
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

**[Optional<? extends com.exoscale.api.models.operations.DeleteSksClusterResponse>](../../models/operations/DeleteSksClusterResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getSksCluster

Retrieve SKS cluster details

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetSksClusterRequest;
import com.exoscale.api.models.operations.GetSksClusterResponse;
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

            GetSksClusterResponse res = sdk.sks().getSksCluster()
                .id("e030847c-ca74-4da4-b1f6-d8d441e2615b")
                .call();

            if (res.sksCluster().isPresent()) {
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

**[Optional<? extends com.exoscale.api.models.operations.GetSksClusterResponse>](../../models/operations/GetSksClusterResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateSksCluster

Update an SKS cluster

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.SksOidc;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.UpdateSksClusterAddons;
import com.exoscale.api.models.operations.UpdateSksClusterRequest;
import com.exoscale.api.models.operations.UpdateSksClusterRequestBody;
import com.exoscale.api.models.operations.UpdateSksClusterResponse;
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

            UpdateSksClusterResponse res = sdk.sks().updateSksCluster()
                .id("3a17ce82-f8c0-41c9-8453-3197682304d9")
                .requestBody(UpdateSksClusterRequestBody.builder()
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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                                     | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `requestBody`                                                                                                            | [com.exoscale.api.models.operations.UpdateSksClusterRequestBody](../../models/operations/UpdateSksClusterRequestBody.md) | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpdateSksClusterResponse>](../../models/operations/UpdateSksClusterResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getSksClusterInspection

Helps troubleshoot common problems when deploying a kubernetes cluster. Inspections run every couple of minutes.

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetSksClusterInspectionRequest;
import com.exoscale.api.models.operations.GetSksClusterInspectionResponse;
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

            GetSksClusterInspectionResponse res = sdk.sks().getSksClusterInspection()
                .id("8b1b0d41-77e8-49e4-8129-c286131b7769")
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

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `id`               | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetSksClusterInspectionResponse>](../../models/operations/GetSksClusterInspectionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## rotateSksCcmCredentials

Rotate Exoscale CCM credentials

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.RotateSksCcmCredentialsRequest;
import com.exoscale.api.models.operations.RotateSksCcmCredentialsResponse;
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

            RotateSksCcmCredentialsResponse res = sdk.sks().rotateSksCcmCredentials()
                .id("9d9c8e73-b85e-43ae-adac-3d3da477dce9")
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

**[Optional<? extends com.exoscale.api.models.operations.RotateSksCcmCredentialsResponse>](../../models/operations/RotateSksCcmCredentialsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## resetSksClusterField

Reset an SKS cluster field to its default value

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ResetSksClusterFieldPathParamField;
import com.exoscale.api.models.operations.ResetSksClusterFieldRequest;
import com.exoscale.api.models.operations.ResetSksClusterFieldResponse;
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

            ResetSksClusterFieldResponse res = sdk.sks().resetSksClusterField()
                .id("01eed668-96b0-461d-93a6-0c740fdc48f2")
                .field(ResetSksClusterFieldPathParamField.DESCRIPTION)
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
| `id`                                                                                                                                   | *String*                                                                                                                               | :heavy_check_mark:                                                                                                                     | N/A                                                                                                                                    |
| `field`                                                                                                                                | [com.exoscale.api.models.operations.ResetSksClusterFieldPathParamField](../../models/operations/ResetSksClusterFieldPathParamField.md) | :heavy_check_mark:                                                                                                                     | N/A                                                                                                                                    |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ResetSksClusterFieldResponse>](../../models/operations/ResetSksClusterFieldResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createSksNodepool

Create a new SKS Nodepool

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.AntiAffinityGroupInput;
import com.exoscale.api.models.components.DeployTarget;
import com.exoscale.api.models.components.DeployTargetType;
import com.exoscale.api.models.components.Effect;
import com.exoscale.api.models.components.FlowDirection;
import com.exoscale.api.models.components.Icmp;
import com.exoscale.api.models.components.InstanceTypeInput;
import com.exoscale.api.models.components.KubeletImageGc;
import com.exoscale.api.models.components.PrivateNetworkInput;
import com.exoscale.api.models.components.SecurityGroupInput;
import com.exoscale.api.models.components.SecurityGroupResource;
import com.exoscale.api.models.components.SecurityGroupResourceVisibility;
import com.exoscale.api.models.components.SecurityGroupRule;
import com.exoscale.api.models.components.SecurityGroupRuleProtocol;
import com.exoscale.api.models.components.SksNodepoolTaint;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateSksNodepoolAddons;
import com.exoscale.api.models.operations.CreateSksNodepoolRequest;
import com.exoscale.api.models.operations.CreateSksNodepoolRequestBody;
import com.exoscale.api.models.operations.CreateSksNodepoolResponse;
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

            CreateSksNodepoolResponse res = sdk.sks().createSksNodepool()
                .id("137eca77-cd01-4602-9f24-f22d4e14c6c9")
                .requestBody(CreateSksNodepoolRequestBody.builder()
                    .name("<value>")
                    .instanceType(InstanceTypeInput.builder()
                            .build())
                    .size(9636L)
                    .diskSize(871837L)
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
| `requestBody`                                                                                                              | [com.exoscale.api.models.operations.CreateSksNodepoolRequestBody](../../models/operations/CreateSksNodepoolRequestBody.md) | :heavy_check_mark:                                                                                                         | N/A                                                                                                                        |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateSksNodepoolResponse>](../../models/operations/CreateSksNodepoolResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## resetSksNodepoolField

Reset an SKS Nodepool field to its default value

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ResetSksNodepoolFieldPathParamField;
import com.exoscale.api.models.operations.ResetSksNodepoolFieldRequest;
import com.exoscale.api.models.operations.ResetSksNodepoolFieldResponse;
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

            ResetSksNodepoolFieldResponse res = sdk.sks().resetSksNodepoolField()
                .id("8e42423e-a46d-4ed5-b787-2f29d6e4fa0c")
                .sksNodepoolId("56c18dc1-7969-42ea-bf85-a15b70f4aece")
                .field(ResetSksNodepoolFieldPathParamField.PRIVATE_NETWORKS)
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
| `sksNodepoolId`                                                                                                                          | *String*                                                                                                                                 | :heavy_check_mark:                                                                                                                       | N/A                                                                                                                                      |
| `field`                                                                                                                                  | [com.exoscale.api.models.operations.ResetSksNodepoolFieldPathParamField](../../models/operations/ResetSksNodepoolFieldPathParamField.md) | :heavy_check_mark:                                                                                                                       | N/A                                                                                                                                      |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ResetSksNodepoolFieldResponse>](../../models/operations/ResetSksNodepoolFieldResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## rotateSksOperatorsCa

Rotate operators certificate authority

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.RotateSksOperatorsCaRequest;
import com.exoscale.api.models.operations.RotateSksOperatorsCaResponse;
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

            RotateSksOperatorsCaResponse res = sdk.sks().rotateSksOperatorsCa()
                .id("cd1b68ec-24d2-48c9-955a-d8d060d3d1b6")
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

**[Optional<? extends com.exoscale.api.models.operations.RotateSksOperatorsCaResponse>](../../models/operations/RotateSksOperatorsCaResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listSksClusterVersions

List available versions for SKS clusters

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListSksClusterVersionsRequest;
import com.exoscale.api.models.operations.ListSksClusterVersionsResponse;
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

            ListSksClusterVersionsResponse res = sdk.sks().listSksClusterVersions()
                .includeDeprecated("<value>")
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

| Parameter                    | Type                         | Required                     | Description                  |
| ---------------------------- | ---------------------------- | ---------------------------- | ---------------------------- |
| `includeDeprecated`          | *Optional<? extends String>* | :heavy_minus_sign:           | N/A                          |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ListSksClusterVersionsResponse>](../../models/operations/ListSksClusterVersionsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## upgradeSksCluster

Upgrade an SKS cluster

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.UpgradeSksClusterRequest;
import com.exoscale.api.models.operations.UpgradeSksClusterRequestBody;
import com.exoscale.api.models.operations.UpgradeSksClusterResponse;
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

            UpgradeSksClusterResponse res = sdk.sks().upgradeSksCluster()
                .id("9d9a80ea-76e7-445b-98fa-4b6c8eb90ca6")
                .requestBody(UpgradeSksClusterRequestBody.builder()
                    .version("<value>")
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
| `requestBody`                                                                                                              | [com.exoscale.api.models.operations.UpgradeSksClusterRequestBody](../../models/operations/UpgradeSksClusterRequestBody.md) | :heavy_check_mark:                                                                                                         | N/A                                                                                                                        |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpgradeSksClusterResponse>](../../models/operations/UpgradeSksClusterResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
