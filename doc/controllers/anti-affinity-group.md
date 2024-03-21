# Anti-Affinity-Group

```java
AntiAffinityGroupController antiAffinityGroupController = client.getAntiAffinityGroupController();
```

## Class Name

`AntiAffinityGroupController`

## Methods

* [List-Anti-Affinity-Groups](../../doc/controllers/anti-affinity-group.md#list-anti-affinity-groups)
* [Create-Anti-Affinity-Group](../../doc/controllers/anti-affinity-group.md#create-anti-affinity-group)
* [Get-Anti-Affinity-Group](../../doc/controllers/anti-affinity-group.md#get-anti-affinity-group)
* [Delete-Anti-Affinity-Group](../../doc/controllers/anti-affinity-group.md#delete-anti-affinity-group)


# List-Anti-Affinity-Groups

```java
CompletableFuture<AntiAffinityGroupResponse> listAntiAffinityGroupsAsync()
```

## Response Type

[`AntiAffinityGroupResponse`](../../doc/models/anti-affinity-group-response.md)

## Example Usage

```java
antiAffinityGroupController.listAntiAffinityGroupsAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Create-Anti-Affinity-Group

```java
CompletableFuture<Operation> createAntiAffinityGroupAsync(
    final AntiAffinityGroupRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`AntiAffinityGroupRequest`](../../doc/models/anti-affinity-group-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
AntiAffinityGroupRequest body = new AntiAffinityGroupRequest.Builder(
    "name6"
)
.build();

antiAffinityGroupController.createAntiAffinityGroupAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Anti-Affinity-Group

```java
CompletableFuture<AntiAffinityGroup> getAntiAffinityGroupAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

[`AntiAffinityGroup`](../../doc/models/anti-affinity-group.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

antiAffinityGroupController.getAntiAffinityGroupAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Delete-Anti-Affinity-Group

```java
CompletableFuture<Operation> deleteAntiAffinityGroupAsync(
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

antiAffinityGroupController.deleteAntiAffinityGroupAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

