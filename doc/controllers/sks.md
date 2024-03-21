# Sks

SKS is Exoscale's scalable Kubernetes service which provides managed Kubernetes
control planes with integrated support for Exoscale instance pools ands network load
balancers.
[Read more](https://www.exoscale.com/scalable-kubernetes-service/)

Read more: [https://www.exoscale.com/scalable-kubernetes-service/](https://www.exoscale.com/scalable-kubernetes-service/)

```java
SksController sksController = client.getSksController();
```

## Class Name

`SksController`

## Methods

* [Generate-Sks-Cluster-Kubeconfig](../../doc/controllers/sks.md#generate-sks-cluster-kubeconfig)
* [Update-Sks-Nodepool](../../doc/controllers/sks.md#update-sks-nodepool)
* [Get-Sks-Nodepool](../../doc/controllers/sks.md#get-sks-nodepool)
* [Delete-Sks-Nodepool](../../doc/controllers/sks.md#delete-sks-nodepool)
* [Get-Sks-Cluster-Authority-Cert](../../doc/controllers/sks.md#get-sks-cluster-authority-cert)
* [List-Sks-Cluster-Deprecated-Resources](../../doc/controllers/sks.md#list-sks-cluster-deprecated-resources)
* [Scale-Sks-Nodepool](../../doc/controllers/sks.md#scale-sks-nodepool)
* [Upgrade-Sks-Cluster-Service-Level](../../doc/controllers/sks.md#upgrade-sks-cluster-service-level)
* [Evict-Sks-Nodepool-Members](../../doc/controllers/sks.md#evict-sks-nodepool-members)
* [Create-Sks-Cluster](../../doc/controllers/sks.md#create-sks-cluster)
* [List-Sks-Clusters](../../doc/controllers/sks.md#list-sks-clusters)
* [Delete-Sks-Cluster](../../doc/controllers/sks.md#delete-sks-cluster)
* [Get-Sks-Cluster](../../doc/controllers/sks.md#get-sks-cluster)
* [Update-Sks-Cluster](../../doc/controllers/sks.md#update-sks-cluster)
* [Get-Sks-Cluster-Inspection](../../doc/controllers/sks.md#get-sks-cluster-inspection)
* [Rotate-Sks-Ccm-Credentials](../../doc/controllers/sks.md#rotate-sks-ccm-credentials)
* [Reset-Sks-Cluster-Field](../../doc/controllers/sks.md#reset-sks-cluster-field)
* [Create-Sks-Nodepool](../../doc/controllers/sks.md#create-sks-nodepool)
* [Reset-Sks-Nodepool-Field](../../doc/controllers/sks.md#reset-sks-nodepool-field)
* [Rotate-Sks-Operators-Ca](../../doc/controllers/sks.md#rotate-sks-operators-ca)
* [List-Sks-Cluster-Versions](../../doc/controllers/sks.md#list-sks-cluster-versions)
* [Upgrade-Sks-Cluster](../../doc/controllers/sks.md#upgrade-sks-cluster)


# Generate-Sks-Cluster-Kubeconfig

This operation returns a Kubeconfig file encoded in base64.

```java
CompletableFuture<SksClusterKubeconfigResponse> generateSksClusterKubeconfigAsync(
    final UUID id,
    final SksKubeconfigRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`SksKubeconfigRequest`](../../doc/models/sks-kubeconfig-request.md) | Body, Required | - |

## Response Type

[`SksClusterKubeconfigResponse`](../../doc/models/sks-cluster-kubeconfig-response.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
SksKubeconfigRequest body = new SksKubeconfigRequest.Builder()
    .build();

sksController.generateSksClusterKubeconfigAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update-Sks-Nodepool

```java
CompletableFuture<Operation> updateSksNodepoolAsync(
    final UUID id,
    final UUID sksNodepoolId,
    final SksClusterNodepoolRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `sksNodepoolId` | `UUID` | Template, Required | - |
| `body` | [`SksClusterNodepoolRequest`](../../doc/models/sks-cluster-nodepool-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
UUID sksNodepoolId = UUID.fromString("000008d8-0000-0000-0000-000000000000");
SksClusterNodepoolRequest body = new SksClusterNodepoolRequest.Builder()
    .build();

sksController.updateSksNodepoolAsync(id, sksNodepoolId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Sks-Nodepool

```java
CompletableFuture<SksNodepool> getSksNodepoolAsync(
    final UUID id,
    final UUID sksNodepoolId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `sksNodepoolId` | `UUID` | Template, Required | - |

## Response Type

[`SksNodepool`](../../doc/models/sks-nodepool.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
UUID sksNodepoolId = UUID.fromString("000008d8-0000-0000-0000-000000000000");

sksController.getSksNodepoolAsync(id, sksNodepoolId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Delete-Sks-Nodepool

```java
CompletableFuture<Operation> deleteSksNodepoolAsync(
    final UUID id,
    final UUID sksNodepoolId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `sksNodepoolId` | `UUID` | Template, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
UUID sksNodepoolId = UUID.fromString("000008d8-0000-0000-0000-000000000000");

sksController.deleteSksNodepoolAsync(id, sksNodepoolId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Sks-Cluster-Authority-Cert

This operation returns the certificate for the given SKS cluster authority encoded in base64.

```java
CompletableFuture<SksClusterAuthorityCertResponse> getSksClusterAuthorityCertAsync(
    final UUID id,
    final AuthorityEnum authority)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `authority` | [`AuthorityEnum`](../../doc/models/authority-enum.md) | Template, Required | - |

## Response Type

[`SksClusterAuthorityCertResponse`](../../doc/models/sks-cluster-authority-cert-response.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
AuthorityEnum authority = AuthorityEnum.AGGREGATION;

sksController.getSksClusterAuthorityCertAsync(id, authority).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# List-Sks-Cluster-Deprecated-Resources

This operation returns the deprecated resources for a given cluster

```java
CompletableFuture<List<String>> listSksClusterDeprecatedResourcesAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

`List<String>`

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

sksController.listSksClusterDeprecatedResourcesAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Scale-Sks-Nodepool

```java
CompletableFuture<Operation> scaleSksNodepoolAsync(
    final UUID id,
    final UUID sksNodepoolId,
    final SksClusterNodepoolScaleRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `sksNodepoolId` | `UUID` | Template, Required | - |
| `body` | [`SksClusterNodepoolScaleRequest`](../../doc/models/sks-cluster-nodepool-scale-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
UUID sksNodepoolId = UUID.fromString("000008d8-0000-0000-0000-000000000000");
SksClusterNodepoolScaleRequest body = new SksClusterNodepoolScaleRequest.Builder(
    10L
)
.build();

sksController.scaleSksNodepoolAsync(id, sksNodepoolId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Upgrade-Sks-Cluster-Service-Level

```java
CompletableFuture<Operation> upgradeSksClusterServiceLevelAsync(
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

sksController.upgradeSksClusterServiceLevelAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Evict-Sks-Nodepool-Members

This operation evicts the specified Compute instances member from the Nodepool, shrinking it to `&lt;current nodepool size&gt; - &lt;# evicted members&gt;`.

```java
CompletableFuture<Operation> evictSksNodepoolMembersAsync(
    final UUID id,
    final UUID sksNodepoolId,
    final SksClusterNodepoolEvictRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `sksNodepoolId` | `UUID` | Template, Required | - |
| `body` | [`SksClusterNodepoolEvictRequest`](../../doc/models/sks-cluster-nodepool-evict-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
UUID sksNodepoolId = UUID.fromString("000008d8-0000-0000-0000-000000000000");
SksClusterNodepoolEvictRequest body = new SksClusterNodepoolEvictRequest.Builder()
    .build();

sksController.evictSksNodepoolMembersAsync(id, sksNodepoolId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Create-Sks-Cluster

```java
CompletableFuture<Operation> createSksClusterAsync(
    final SksClusterRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`SksClusterRequest`](../../doc/models/sks-cluster-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
SksClusterRequest body = new SksClusterRequest.Builder(
    "name6",
    Level2Enum.STARTER,
    "version2"
)
.build();

sksController.createSksClusterAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# List-Sks-Clusters

```java
CompletableFuture<SksClusterResponse> listSksClustersAsync()
```

## Response Type

[`SksClusterResponse`](../../doc/models/sks-cluster-response.md)

## Example Usage

```java
sksController.listSksClustersAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Delete-Sks-Cluster

```java
CompletableFuture<Operation> deleteSksClusterAsync(
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

sksController.deleteSksClusterAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Sks-Cluster

```java
CompletableFuture<SksCluster> getSksClusterAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

[`SksCluster`](../../doc/models/sks-cluster.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

sksController.getSksClusterAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update-Sks-Cluster

```java
CompletableFuture<Operation> updateSksClusterAsync(
    final UUID id,
    final SksClusterRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`SksClusterRequest1`](../../doc/models/sks-cluster-request-1.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
SksClusterRequest1 body = new SksClusterRequest1.Builder()
    .build();

sksController.updateSksClusterAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Sks-Cluster-Inspection

Helps troubleshoot common problems when deploying a kubernetes cluster. Inspections run every couple of minutes.

```java
CompletableFuture<Map<String, Object>> getSksClusterInspectionAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

`Map<String, Object>`

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

sksController.getSksClusterInspectionAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Rotate-Sks-Ccm-Credentials

```java
CompletableFuture<Operation> rotateSksCcmCredentialsAsync(
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

sksController.rotateSksCcmCredentialsAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Reset-Sks-Cluster-Field

```java
CompletableFuture<Operation> resetSksClusterFieldAsync(
    final UUID id,
    final Field1Enum field)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `field` | [`Field1Enum`](../../doc/models/field-1-enum.md) | Template, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
Field1Enum field = Field1Enum.DESCRIPTION;

sksController.resetSksClusterFieldAsync(id, field).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Create-Sks-Nodepool

```java
CompletableFuture<Operation> createSksNodepoolAsync(
    final UUID id,
    final SksClusterNodepoolRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`SksClusterNodepoolRequest1`](../../doc/models/sks-cluster-nodepool-request-1.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
SksClusterNodepoolRequest1 body = new SksClusterNodepoolRequest1.Builder(
    "name6",
    new InstanceType.Builder()
        .build(),
    10L,
    222L
)
.build();

sksController.createSksNodepoolAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Reset-Sks-Nodepool-Field

```java
CompletableFuture<Operation> resetSksNodepoolFieldAsync(
    final UUID id,
    final UUID sksNodepoolId,
    final Field6Enum field)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `sksNodepoolId` | `UUID` | Template, Required | - |
| `field` | [`Field6Enum`](../../doc/models/field-6-enum.md) | Template, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
UUID sksNodepoolId = UUID.fromString("000008d8-0000-0000-0000-000000000000");
Field6Enum field = Field6Enum.PRIVATENETWORKS;

sksController.resetSksNodepoolFieldAsync(id, sksNodepoolId, field).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Rotate-Sks-Operators-Ca

```java
CompletableFuture<Operation> rotateSksOperatorsCaAsync(
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

sksController.rotateSksOperatorsCaAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# List-Sks-Cluster-Versions

```java
CompletableFuture<SksClusterVersionResponse> listSksClusterVersionsAsync(
    final String includeDeprecated)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `includeDeprecated` | `String` | Query, Optional | - |

## Response Type

[`SksClusterVersionResponse`](../../doc/models/sks-cluster-version-response.md)

## Example Usage

```java
sksController.listSksClusterVersionsAsync(null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Upgrade-Sks-Cluster

```java
CompletableFuture<Operation> upgradeSksClusterAsync(
    final UUID id,
    final SksClusterUpgradeRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`SksClusterUpgradeRequest`](../../doc/models/sks-cluster-upgrade-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
SksClusterUpgradeRequest body = new SksClusterUpgradeRequest.Builder(
    "version2"
)
.build();

sksController.upgradeSksClusterAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

