# Private-Network

```java
PrivateNetworkController privateNetworkController = client.getPrivateNetworkController();
```

## Class Name

`PrivateNetworkController`

## Methods

* [Attach-Instance-to-Private-Network](../../doc/controllers/private-network.md#attach-instance-to-private-network)
* [Update-Private-Network-Instance-Ip](../../doc/controllers/private-network.md#update-private-network-instance-ip)
* [List-Private-Networks](../../doc/controllers/private-network.md#list-private-networks)
* [Create-Private-Network](../../doc/controllers/private-network.md#create-private-network)
* [Detach-Instance-From-Private-Network](../../doc/controllers/private-network.md#detach-instance-from-private-network)
* [Update-Private-Network](../../doc/controllers/private-network.md#update-private-network)
* [Get-Private-Network](../../doc/controllers/private-network.md#get-private-network)
* [Delete-Private-Network](../../doc/controllers/private-network.md#delete-private-network)
* [Reset-Private-Network-Field](../../doc/controllers/private-network.md#reset-private-network-field)


# Attach-Instance-to-Private-Network

```java
CompletableFuture<Operation> attachInstanceToPrivateNetworkAsync(
    final UUID id,
    final PrivateNetworkAttachRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`PrivateNetworkAttachRequest`](../../doc/models/private-network-attach-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
PrivateNetworkAttachRequest body = new PrivateNetworkAttachRequest.Builder(
    new Instance1.Builder()
        .build()
)
.build();

privateNetworkController.attachInstanceToPrivateNetworkAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update-Private-Network-Instance-Ip

```java
CompletableFuture<Operation> updatePrivateNetworkInstanceIpAsync(
    final UUID id,
    final PrivateNetworkUpdateIpRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`PrivateNetworkUpdateIpRequest`](../../doc/models/private-network-update-ip-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
PrivateNetworkUpdateIpRequest body = new PrivateNetworkUpdateIpRequest.Builder()
    .build();

privateNetworkController.updatePrivateNetworkInstanceIpAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# List-Private-Networks

```java
CompletableFuture<PrivateNetworkResponse> listPrivateNetworksAsync()
```

## Response Type

[`PrivateNetworkResponse`](../../doc/models/private-network-response.md)

## Example Usage

```java
privateNetworkController.listPrivateNetworksAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Create-Private-Network

```java
CompletableFuture<Operation> createPrivateNetworkAsync(
    final PrivateNetworkRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`PrivateNetworkRequest`](../../doc/models/private-network-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
PrivateNetworkRequest body = new PrivateNetworkRequest.Builder(
    "name6"
)
.build();

privateNetworkController.createPrivateNetworkAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Detach-Instance-From-Private-Network

```java
CompletableFuture<Operation> detachInstanceFromPrivateNetworkAsync(
    final UUID id,
    final PrivateNetworkDetachRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`PrivateNetworkDetachRequest`](../../doc/models/private-network-detach-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
PrivateNetworkDetachRequest body = new PrivateNetworkDetachRequest.Builder(
    new Instance.Builder()
        .build()
)
.build();

privateNetworkController.detachInstanceFromPrivateNetworkAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update-Private-Network

```java
CompletableFuture<Operation> updatePrivateNetworkAsync(
    final UUID id,
    final PrivateNetworkRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`PrivateNetworkRequest1`](../../doc/models/private-network-request-1.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
PrivateNetworkRequest1 body = new PrivateNetworkRequest1.Builder()
    .build();

privateNetworkController.updatePrivateNetworkAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Private-Network

```java
CompletableFuture<PrivateNetwork> getPrivateNetworkAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

[`PrivateNetwork`](../../doc/models/private-network.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

privateNetworkController.getPrivateNetworkAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Delete-Private-Network

```java
CompletableFuture<Operation> deletePrivateNetworkAsync(
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

privateNetworkController.deletePrivateNetworkAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Reset-Private-Network-Field

```java
CompletableFuture<Operation> resetPrivateNetworkFieldAsync(
    final UUID id,
    final Field3Enum field)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `field` | [`Field3Enum`](../../doc/models/field-3-enum.md) | Template, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
Field3Enum field = Field3Enum.LABELS;

privateNetworkController.resetPrivateNetworkFieldAsync(id, field).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

