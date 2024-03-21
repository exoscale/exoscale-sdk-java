# Block-Storage

Exoscale's Block Storage offers persistent
externally attached volumes for your workloads.

Read more: [https://community.exoscale.com/documentation/compute/](https://community.exoscale.com/documentation/compute/)

```java
BlockStorageController blockStorageController = client.getBlockStorageController();
```

## Class Name

`BlockStorageController`

## Methods

* [Attach-Block-Storage-Volume-to-Instance](../../doc/controllers/block-storage.md#attach-block-storage-volume-to-instance)
* [Delete-Block-Storage-Snapshot](../../doc/controllers/block-storage.md#delete-block-storage-snapshot)
* [Get-Block-Storage-Snapshot](../../doc/controllers/block-storage.md#get-block-storage-snapshot)
* [Get-Block-Storage-Volume](../../doc/controllers/block-storage.md#get-block-storage-volume)
* [Update-Block-Storage-Volume-Labels](../../doc/controllers/block-storage.md#update-block-storage-volume-labels)
* [Delete-Block-Storage-Volume](../../doc/controllers/block-storage.md#delete-block-storage-volume)
* [Create-Block-Storage-Snapshot](../../doc/controllers/block-storage.md#create-block-storage-snapshot)
* [List-Block-Storage-Snapshots](../../doc/controllers/block-storage.md#list-block-storage-snapshots)
* [Resize-Block-Storage-Volume](../../doc/controllers/block-storage.md#resize-block-storage-volume)
* [Detach-Block-Storage-Volume](../../doc/controllers/block-storage.md#detach-block-storage-volume)
* [List-Block-Storage-Volumes](../../doc/controllers/block-storage.md#list-block-storage-volumes)
* [Create-Block-Storage-Volume](../../doc/controllers/block-storage.md#create-block-storage-volume)


# Attach-Block-Storage-Volume-to-Instance

```java
CompletableFuture<Operation> attachBlockStorageVolumeToInstanceAsync(
    final UUID id,
    final BlockStorageAttachRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`BlockStorageAttachRequest`](../../doc/models/block-storage-attach-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
BlockStorageAttachRequest body = new BlockStorageAttachRequest.Builder(
    new InstanceTarget.Builder()
        .build()
)
.build();

blockStorageController.attachBlockStorageVolumeToInstanceAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Delete-Block-Storage-Snapshot

```java
CompletableFuture<Operation> deleteBlockStorageSnapshotAsync(
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

blockStorageController.deleteBlockStorageSnapshotAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Block-Storage-Snapshot

```java
CompletableFuture<BlockStorageSnapshot> getBlockStorageSnapshotAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

[`BlockStorageSnapshot`](../../doc/models/block-storage-snapshot.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

blockStorageController.getBlockStorageSnapshotAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Block-Storage-Volume

```java
CompletableFuture<BlockStorageVolume> getBlockStorageVolumeAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

[`BlockStorageVolume`](../../doc/models/block-storage-volume.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

blockStorageController.getBlockStorageVolumeAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update-Block-Storage-Volume-Labels

```java
CompletableFuture<Operation> updateBlockStorageVolumeLabelsAsync(
    final UUID id,
    final BlockStorageRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`BlockStorageRequest`](../../doc/models/block-storage-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
BlockStorageRequest body = new BlockStorageRequest.Builder()
    .build();

blockStorageController.updateBlockStorageVolumeLabelsAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Delete-Block-Storage-Volume

```java
CompletableFuture<Operation> deleteBlockStorageVolumeAsync(
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

blockStorageController.deleteBlockStorageVolumeAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Create-Block-Storage-Snapshot

```java
CompletableFuture<Operation> createBlockStorageSnapshotAsync(
    final UUID id,
    final BlockStorageCreateSnapshotRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`BlockStorageCreateSnapshotRequest`](../../doc/models/block-storage-create-snapshot-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
BlockStorageCreateSnapshotRequest body = new BlockStorageCreateSnapshotRequest.Builder()
    .build();

blockStorageController.createBlockStorageSnapshotAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# List-Block-Storage-Snapshots

```java
CompletableFuture<BlockStorageSnapshotResponse> listBlockStorageSnapshotsAsync()
```

## Response Type

[`BlockStorageSnapshotResponse`](../../doc/models/block-storage-snapshot-response.md)

## Example Usage

```java
blockStorageController.listBlockStorageSnapshotsAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Resize-Block-Storage-Volume

This operation resizes a Block storage volume. Note: the volume can only grow, cannot be shrunk.

```java
CompletableFuture<BlockStorageVolume> resizeBlockStorageVolumeAsync(
    final UUID id,
    final BlockStorageResizeVolumeRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`BlockStorageResizeVolumeRequest`](../../doc/models/block-storage-resize-volume-request.md) | Body, Required | - |

## Response Type

[`BlockStorageVolume`](../../doc/models/block-storage-volume.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
BlockStorageResizeVolumeRequest body = new BlockStorageResizeVolumeRequest.Builder(
    10L
)
.build();

blockStorageController.resizeBlockStorageVolumeAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Detach-Block-Storage-Volume

```java
CompletableFuture<Operation> detachBlockStorageVolumeAsync(
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

blockStorageController.detachBlockStorageVolumeAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# List-Block-Storage-Volumes

```java
CompletableFuture<BlockStorageResponse> listBlockStorageVolumesAsync(
    final UUID instanceId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `instanceId` | `UUID` | Query, Optional | - |

## Response Type

[`BlockStorageResponse`](../../doc/models/block-storage-response.md)

## Example Usage

```java
blockStorageController.listBlockStorageVolumesAsync(null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Create-Block-Storage-Volume

```java
CompletableFuture<Operation> createBlockStorageVolumeAsync(
    final BlockStorageRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`BlockStorageRequest1`](../../doc/models/block-storage-request-1.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
BlockStorageRequest1 body = new BlockStorageRequest1.Builder()
    .build();

blockStorageController.createBlockStorageVolumeAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

