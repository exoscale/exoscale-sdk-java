# Instance-Pool

```java
InstancePoolController instancePoolController = client.getInstancePoolController();
```

## Class Name

`InstancePoolController`

## Methods

* [Scale-Instance-Pool](../../doc/controllers/instance-pool.md#scale-instance-pool)
* [List-Instance-Pools](../../doc/controllers/instance-pool.md#list-instance-pools)
* [Create-Instance-Pool](../../doc/controllers/instance-pool.md#create-instance-pool)
* [Delete-Instance-Pool](../../doc/controllers/instance-pool.md#delete-instance-pool)
* [Get-Instance-Pool](../../doc/controllers/instance-pool.md#get-instance-pool)
* [Update-Instance-Pool](../../doc/controllers/instance-pool.md#update-instance-pool)
* [Reset-Instance-Pool-Field](../../doc/controllers/instance-pool.md#reset-instance-pool-field)
* [Evict-Instance-Pool-Members](../../doc/controllers/instance-pool.md#evict-instance-pool-members)


# Scale-Instance-Pool

```java
CompletableFuture<Operation> scaleInstancePoolAsync(
    final UUID id,
    final InstancePoolScaleRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`InstancePoolScaleRequest`](../../doc/models/instance-pool-scale-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
InstancePoolScaleRequest body = new InstancePoolScaleRequest.Builder(
    10L
)
.build();

instancePoolController.scaleInstancePoolAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# List-Instance-Pools

```java
CompletableFuture<InstancePoolResponse> listInstancePoolsAsync()
```

## Response Type

[`InstancePoolResponse`](../../doc/models/instance-pool-response.md)

## Example Usage

```java
instancePoolController.listInstancePoolsAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Create-Instance-Pool

```java
CompletableFuture<Operation> createInstancePoolAsync(
    final InstancePoolRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`InstancePoolRequest`](../../doc/models/instance-pool-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
InstancePoolRequest body = new InstancePoolRequest.Builder(
    "name6",
    new InstanceType.Builder()
        .build(),
    new Template.Builder()
        .build(),
    10L,
    222L
)
.build();

instancePoolController.createInstancePoolAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Delete-Instance-Pool

```java
CompletableFuture<Operation> deleteInstancePoolAsync(
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

instancePoolController.deleteInstancePoolAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Instance-Pool

```java
CompletableFuture<InstancePool> getInstancePoolAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

[`InstancePool`](../../doc/models/instance-pool.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

instancePoolController.getInstancePoolAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update-Instance-Pool

```java
CompletableFuture<Operation> updateInstancePoolAsync(
    final UUID id,
    final InstancePoolRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`InstancePoolRequest1`](../../doc/models/instance-pool-request-1.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
InstancePoolRequest1 body = new InstancePoolRequest1.Builder()
    .build();

instancePoolController.updateInstancePoolAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Reset-Instance-Pool-Field

```java
CompletableFuture<Operation> resetInstancePoolFieldAsync(
    final UUID id,
    final Field4Enum field)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `field` | [`Field4Enum`](../../doc/models/field-4-enum.md) | Template, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
Field4Enum field = Field4Enum.SSHKEY;

instancePoolController.resetInstancePoolFieldAsync(id, field).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Evict-Instance-Pool-Members

This operation evicts the specified Compute instances member from the Instance Pool, shrinking it to `&lt;current pool size&gt; - &lt;# evicted members&gt;`.

```java
CompletableFuture<Operation> evictInstancePoolMembersAsync(
    final UUID id,
    final InstancePoolEvictRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`InstancePoolEvictRequest`](../../doc/models/instance-pool-evict-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
InstancePoolEvictRequest body = new InstancePoolEvictRequest.Builder()
    .build();

instancePoolController.evictInstancePoolMembersAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

