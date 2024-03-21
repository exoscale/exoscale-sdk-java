# Snapshot

```java
SnapshotController snapshotController = client.getSnapshotController();
```

## Class Name

`SnapshotController`

## Methods

* [Export-Snapshot](../../doc/controllers/snapshot.md#export-snapshot)
* [Delete-Snapshot](../../doc/controllers/snapshot.md#delete-snapshot)
* [Get-Snapshot](../../doc/controllers/snapshot.md#get-snapshot)
* [List-Snapshots](../../doc/controllers/snapshot.md#list-snapshots)
* [Promote-Snapshot-to-Template](../../doc/controllers/snapshot.md#promote-snapshot-to-template)


# Export-Snapshot

```java
CompletableFuture<Operation> exportSnapshotAsync(
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

snapshotController.exportSnapshotAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Delete-Snapshot

```java
CompletableFuture<Operation> deleteSnapshotAsync(
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

snapshotController.deleteSnapshotAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Snapshot

```java
CompletableFuture<Snapshot> getSnapshotAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

[`Snapshot`](../../doc/models/snapshot.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

snapshotController.getSnapshotAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# List-Snapshots

```java
CompletableFuture<SnapshotResponse> listSnapshotsAsync()
```

## Response Type

[`SnapshotResponse`](../../doc/models/snapshot-response.md)

## Example Usage

```java
snapshotController.listSnapshotsAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Promote-Snapshot-to-Template

```java
CompletableFuture<Operation> promoteSnapshotToTemplateAsync(
    final UUID id,
    final SnapshotPromoteRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`SnapshotPromoteRequest`](../../doc/models/snapshot-promote-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
SnapshotPromoteRequest body = new SnapshotPromoteRequest.Builder(
    "name6"
)
.build();

snapshotController.promoteSnapshotToTemplateAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

