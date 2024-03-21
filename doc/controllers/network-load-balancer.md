# Network-Load-Balancer

A Network Load Balancer (NLB) is a Layer 4 (TCP/UDP) load balancer that distributes incoming traffic to Compute instances managed by an Instance Pool.

[Read more](https://community.exoscale.com/documentation/compute/network-load-balancer/)

Read more: [https://community.exoscale.com/documentation/compute/network-load-balancer/](https://community.exoscale.com/documentation/compute/network-load-balancer/)

```java
NetworkLoadBalancerController networkLoadBalancerController = client.getNetworkLoadBalancerController();
```

## Class Name

`NetworkLoadBalancerController`

## Methods

* [Delete-Load-Balancer-Service](../../doc/controllers/network-load-balancer.md#delete-load-balancer-service)
* [Update-Load-Balancer-Service](../../doc/controllers/network-load-balancer.md#update-load-balancer-service)
* [Get-Load-Balancer-Service](../../doc/controllers/network-load-balancer.md#get-load-balancer-service)
* [Create-Load-Balancer](../../doc/controllers/network-load-balancer.md#create-load-balancer)
* [List-Load-Balancers](../../doc/controllers/network-load-balancer.md#list-load-balancers)
* [Reset-Load-Balancer-Field](../../doc/controllers/network-load-balancer.md#reset-load-balancer-field)
* [Reset-Load-Balancer-Service-Field](../../doc/controllers/network-load-balancer.md#reset-load-balancer-service-field)
* [Add-Service-to-Load-Balancer](../../doc/controllers/network-load-balancer.md#add-service-to-load-balancer)
* [Update-Load-Balancer](../../doc/controllers/network-load-balancer.md#update-load-balancer)
* [Delete-Load-Balancer](../../doc/controllers/network-load-balancer.md#delete-load-balancer)
* [Get-Load-Balancer](../../doc/controllers/network-load-balancer.md#get-load-balancer)


# Delete-Load-Balancer-Service

```java
CompletableFuture<Operation> deleteLoadBalancerServiceAsync(
    final UUID id,
    final UUID serviceId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `serviceId` | `UUID` | Template, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
UUID serviceId = UUID.fromString("00000be2-0000-0000-0000-000000000000");

networkLoadBalancerController.deleteLoadBalancerServiceAsync(id, serviceId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update-Load-Balancer-Service

```java
CompletableFuture<Operation> updateLoadBalancerServiceAsync(
    final UUID id,
    final UUID serviceId,
    final LoadBalancerServiceRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `serviceId` | `UUID` | Template, Required | - |
| `body` | [`LoadBalancerServiceRequest`](../../doc/models/load-balancer-service-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
UUID serviceId = UUID.fromString("00000be2-0000-0000-0000-000000000000");
LoadBalancerServiceRequest body = new LoadBalancerServiceRequest.Builder()
    .build();

networkLoadBalancerController.updateLoadBalancerServiceAsync(id, serviceId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Load-Balancer-Service

```java
CompletableFuture<LoadBalancerService> getLoadBalancerServiceAsync(
    final UUID id,
    final UUID serviceId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `serviceId` | `UUID` | Template, Required | - |

## Response Type

[`LoadBalancerService`](../../doc/models/load-balancer-service.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
UUID serviceId = UUID.fromString("00000be2-0000-0000-0000-000000000000");

networkLoadBalancerController.getLoadBalancerServiceAsync(id, serviceId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Create-Load-Balancer

```java
CompletableFuture<Operation> createLoadBalancerAsync(
    final LoadBalancerRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`LoadBalancerRequest`](../../doc/models/load-balancer-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
LoadBalancerRequest body = new LoadBalancerRequest.Builder(
    "name6"
)
.build();

networkLoadBalancerController.createLoadBalancerAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# List-Load-Balancers

```java
CompletableFuture<LoadBalancerResponse> listLoadBalancersAsync()
```

## Response Type

[`LoadBalancerResponse`](../../doc/models/load-balancer-response.md)

## Example Usage

```java
networkLoadBalancerController.listLoadBalancersAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Reset-Load-Balancer-Field

```java
CompletableFuture<Operation> resetLoadBalancerFieldAsync(
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

networkLoadBalancerController.resetLoadBalancerFieldAsync(id, field).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Reset-Load-Balancer-Service-Field

```java
CompletableFuture<Operation> resetLoadBalancerServiceFieldAsync(
    final UUID id,
    final UUID serviceId,
    final FieldEnum field)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `serviceId` | `UUID` | Template, Required | - |
| `field` | [`FieldEnum`](../../doc/models/field-enum.md) | Template, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
UUID serviceId = UUID.fromString("00000be2-0000-0000-0000-000000000000");
FieldEnum field = FieldEnum.DESCRIPTION;

networkLoadBalancerController.resetLoadBalancerServiceFieldAsync(id, serviceId, field).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Add-Service-to-Load-Balancer

```java
CompletableFuture<Operation> addServiceToLoadBalancerAsync(
    final UUID id,
    final LoadBalancerServiceRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`LoadBalancerServiceRequest1`](../../doc/models/load-balancer-service-request-1.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
LoadBalancerServiceRequest1 body = new LoadBalancerServiceRequest1.Builder(
    "name6",
    new InstancePool.Builder()
        .build(),
    Protocol1Enum.TCP,
    StrategyEnum.ROUNDROBIN,
    40L,
    92L,
    new LoadBalancerServiceHealthcheck.Builder()
        .build()
)
.build();

networkLoadBalancerController.addServiceToLoadBalancerAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update-Load-Balancer

```java
CompletableFuture<Operation> updateLoadBalancerAsync(
    final UUID id,
    final LoadBalancerRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`LoadBalancerRequest1`](../../doc/models/load-balancer-request-1.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
LoadBalancerRequest1 body = new LoadBalancerRequest1.Builder()
    .build();

networkLoadBalancerController.updateLoadBalancerAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Delete-Load-Balancer

```java
CompletableFuture<Operation> deleteLoadBalancerAsync(
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

networkLoadBalancerController.deleteLoadBalancerAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Load-Balancer

```java
CompletableFuture<LoadBalancer> getLoadBalancerAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

[`LoadBalancer`](../../doc/models/load-balancer.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

networkLoadBalancerController.getLoadBalancerAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

