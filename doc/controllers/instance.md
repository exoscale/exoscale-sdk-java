# Instance

```java
InstanceController instanceController = client.getInstanceController();
```

## Class Name

`InstanceController`

## Methods

* [Create-Snapshot](../../doc/controllers/instance.md#create-snapshot)
* [Reveal-Instance-Password](../../doc/controllers/instance.md#reveal-instance-password)
* [Resize-Instance-Disk](../../doc/controllers/instance.md#resize-instance-disk)
* [Reset-Instance-Password](../../doc/controllers/instance.md#reset-instance-password)
* [Start-Instance](../../doc/controllers/instance.md#start-instance)
* [Scale-Instance](../../doc/controllers/instance.md#scale-instance)
* [Stop-Instance](../../doc/controllers/instance.md#stop-instance)
* [Add-Instance-Protection](../../doc/controllers/instance.md#add-instance-protection)
* [Reset-Instance-Field](../../doc/controllers/instance.md#reset-instance-field)
* [Remove-Instance-Protection](../../doc/controllers/instance.md#remove-instance-protection)
* [Reset-Instance](../../doc/controllers/instance.md#reset-instance)
* [Delete-Instance](../../doc/controllers/instance.md#delete-instance)
* [Update-Instance](../../doc/controllers/instance.md#update-instance)
* [Get-Instance](../../doc/controllers/instance.md#get-instance)
* [Reboot-Instance](../../doc/controllers/instance.md#reboot-instance)
* [Create-Instance](../../doc/controllers/instance.md#create-instance)
* [List-Instances](../../doc/controllers/instance.md#list-instances)
* [Revert-Instance-to-Snapshot](../../doc/controllers/instance.md#revert-instance-to-snapshot)


# Create-Snapshot

```java
CompletableFuture<Operation> createSnapshotAsync(
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

instanceController.createSnapshotAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Reveal-Instance-Password

Reveal the password used during instance creation or the latest password reset.
This is only available for VMs created against templates having the `password-enabled`
property set to `true`.

            Passwords are transiently stored for at most 24 hours and intended to be retrieved shortly after
            creation or resets.

```java
CompletableFuture<InstancePassword> revealInstancePasswordAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

[`InstancePassword`](../../doc/models/instance-password.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

instanceController.revealInstancePasswordAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Resize-Instance-Disk

This operation resizes a Compute instance's disk volume. Note: the disk can only grow, cannot be shrunk.

```java
CompletableFuture<Operation> resizeInstanceDiskAsync(
    final UUID id,
    final InstanceResizeDiskRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`InstanceResizeDiskRequest`](../../doc/models/instance-resize-disk-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
InstanceResizeDiskRequest body = new InstanceResizeDiskRequest.Builder(
    222L
)
.build();

instanceController.resizeInstanceDiskAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Reset-Instance-Password

```java
CompletableFuture<Operation> resetInstancePasswordAsync(
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

instanceController.resetInstancePasswordAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Start-Instance

This operation starts a virtual machine, potentially using a rescue profile if specified

```java
CompletableFuture<Operation> startInstanceAsync(
    final UUID id,
    final InstanceStartRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`InstanceStartRequest`](../../doc/models/instance-start-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
InstanceStartRequest body = new InstanceStartRequest.Builder()
    .build();

instanceController.startInstanceAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Scale-Instance

This operation changes the Compute instance's type. Note: the new Instance Type must be within the same family (e.g. a standard instance cannot be scaled to gpu2 or storage).

```java
CompletableFuture<Operation> scaleInstanceAsync(
    final UUID id,
    final InstanceScaleRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`InstanceScaleRequest`](../../doc/models/instance-scale-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
InstanceScaleRequest body = new InstanceScaleRequest.Builder(
    new InstanceType.Builder()
        .build()
)
.build();

instanceController.scaleInstanceAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Stop-Instance

```java
CompletableFuture<Operation> stopInstanceAsync(
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

instanceController.stopInstanceAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Add-Instance-Protection

```java
CompletableFuture<Object> addInstanceProtectionAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

`Object`

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

instanceController.addInstanceProtectionAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Reset-Instance-Field

```java
CompletableFuture<Operation> resetInstanceFieldAsync(
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

instanceController.resetInstanceFieldAsync(id, field).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Remove-Instance-Protection

```java
CompletableFuture<Object> removeInstanceProtectionAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

`Object`

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

instanceController.removeInstanceProtectionAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Reset-Instance

This operation re-installs a Compute instance to a base template. If target template is provided it will be used to recreated instance from. Warning: the operation wipes all data stored on the disk.

```java
CompletableFuture<Operation> resetInstanceAsync(
    final UUID id,
    final InstanceResetRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`InstanceResetRequest`](../../doc/models/instance-reset-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
InstanceResetRequest body = new InstanceResetRequest.Builder()
    .build();

instanceController.resetInstanceAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Delete-Instance

```java
CompletableFuture<Operation> deleteInstanceAsync(
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

instanceController.deleteInstanceAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update-Instance

```java
CompletableFuture<Operation> updateInstanceAsync(
    final UUID id,
    final InstanceRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`InstanceRequest`](../../doc/models/instance-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
InstanceRequest body = new InstanceRequest.Builder()
    .build();

instanceController.updateInstanceAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Instance

```java
CompletableFuture<Instance> getInstanceAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

[`Instance`](../../doc/models/instance.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

instanceController.getInstanceAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Reboot-Instance

```java
CompletableFuture<Operation> rebootInstanceAsync(
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

instanceController.rebootInstanceAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Create-Instance

```java
CompletableFuture<Operation> createInstanceAsync(
    final InstanceRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`InstanceRequest1`](../../doc/models/instance-request-1.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
InstanceRequest1 body = new InstanceRequest1.Builder(
    new InstanceType.Builder()
        .build(),
    new Template.Builder()
        .build(),
    222L
)
.build();

instanceController.createInstanceAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# List-Instances

```java
CompletableFuture<InstanceResponse> listInstancesAsync(
    final UUID managerId,
    final ManagerTypeEnum managerType,
    final String ipAddress)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `managerId` | `UUID` | Query, Optional | - |
| `managerType` | [`ManagerTypeEnum`](../../doc/models/manager-type-enum.md) | Query, Optional | - |
| `ipAddress` | `String` | Query, Optional | - |

## Response Type

[`InstanceResponse`](../../doc/models/instance-response.md)

## Example Usage

```java
instanceController.listInstancesAsync(null, null, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Revert-Instance-to-Snapshot

This operation reverts the snapshot to the Compute instance volume, restoring stored data as it was at the time of the snapshot.
The Compute instance must be previously stopped.

```java
CompletableFuture<Operation> revertInstanceToSnapshotAsync(
    final UUID instanceId,
    final InstanceRevertSnapshotRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `instanceId` | `UUID` | Template, Required | - |
| `body` | [`InstanceRevertSnapshotRequest`](../../doc/models/instance-revert-snapshot-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID instanceId = UUID.fromString("000004c4-0000-0000-0000-000000000000");
InstanceRevertSnapshotRequest body = new InstanceRevertSnapshotRequest.Builder(
    UUID.fromString("00002568-0000-0000-0000-000000000000")
)
.build();

instanceController.revertInstanceToSnapshotAsync(instanceId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

