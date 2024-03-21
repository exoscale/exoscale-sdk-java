# Security-Group

```java
SecurityGroupController securityGroupController = client.getSecurityGroupController();
```

## Class Name

`SecurityGroupController`

## Methods

* [Delete-Rule-From-Security-Group](../../doc/controllers/security-group.md#delete-rule-from-security-group)
* [Create-Security-Group](../../doc/controllers/security-group.md#create-security-group)
* [List-Security-Groups](../../doc/controllers/security-group.md#list-security-groups)
* [Get-Security-Group](../../doc/controllers/security-group.md#get-security-group)
* [Delete-Security-Group](../../doc/controllers/security-group.md#delete-security-group)
* [Attach-Instance-to-Security-Group](../../doc/controllers/security-group.md#attach-instance-to-security-group)
* [Add-Rule-to-Security-Group](../../doc/controllers/security-group.md#add-rule-to-security-group)
* [Remove-External-Source-From-Security-Group](../../doc/controllers/security-group.md#remove-external-source-from-security-group)
* [Detach-Instance-From-Security-Group](../../doc/controllers/security-group.md#detach-instance-from-security-group)
* [Add-External-Source-to-Security-Group](../../doc/controllers/security-group.md#add-external-source-to-security-group)


# Delete-Rule-From-Security-Group

```java
CompletableFuture<Operation> deleteRuleFromSecurityGroupAsync(
    final UUID id,
    final UUID ruleId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `ruleId` | `UUID` | Template, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
UUID ruleId = UUID.fromString("00001942-0000-0000-0000-000000000000");

securityGroupController.deleteRuleFromSecurityGroupAsync(id, ruleId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Create-Security-Group

```java
CompletableFuture<Operation> createSecurityGroupAsync(
    final SecurityGroupRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`SecurityGroupRequest`](../../doc/models/security-group-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
SecurityGroupRequest body = new SecurityGroupRequest.Builder(
    "name6"
)
.build();

securityGroupController.createSecurityGroupAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# List-Security-Groups

Lists security groups. When visibility is set to public, lists public security groups.
Public security groups are objects maintained by Exoscale which contain source addresses for
relevant services hosted by Exoscale. They can be used a source in ingress rules and as a destination
in egress rules.

```java
CompletableFuture<SecurityGroupResponse> listSecurityGroupsAsync(
    final Visibility2Enum visibility)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `visibility` | [`Visibility2Enum`](../../doc/models/visibility-2-enum.md) | Query, Optional | - |

## Response Type

[`SecurityGroupResponse`](../../doc/models/security-group-response.md)

## Example Usage

```java
securityGroupController.listSecurityGroupsAsync(null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Security-Group

```java
CompletableFuture<SecurityGroup> getSecurityGroupAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

[`SecurityGroup`](../../doc/models/security-group.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

securityGroupController.getSecurityGroupAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Delete-Security-Group

```java
CompletableFuture<Operation> deleteSecurityGroupAsync(
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

securityGroupController.deleteSecurityGroupAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Attach-Instance-to-Security-Group

```java
CompletableFuture<Operation> attachInstanceToSecurityGroupAsync(
    final UUID id,
    final SecurityGroupAttachRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`SecurityGroupAttachRequest`](../../doc/models/security-group-attach-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
SecurityGroupAttachRequest body = new SecurityGroupAttachRequest.Builder(
    new Instance.Builder()
        .build()
)
.build();

securityGroupController.attachInstanceToSecurityGroupAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Add-Rule-to-Security-Group

```java
CompletableFuture<Operation> addRuleToSecurityGroupAsync(
    final UUID id,
    final SecurityGroupRulesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`SecurityGroupRulesRequest`](../../doc/models/security-group-rules-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
SecurityGroupRulesRequest body = new SecurityGroupRulesRequest.Builder(
    FlowDirectionEnum.INGRESS,
    ProtocolEnum.ICMP
)
.build();

securityGroupController.addRuleToSecurityGroupAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Remove-External-Source-From-Security-Group

```java
CompletableFuture<Operation> removeExternalSourceFromSecurityGroupAsync(
    final UUID id,
    final SecurityGroupRemoveSourceRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`SecurityGroupRemoveSourceRequest`](../../doc/models/security-group-remove-source-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
SecurityGroupRemoveSourceRequest body = new SecurityGroupRemoveSourceRequest.Builder(
    "cidr6"
)
.build();

securityGroupController.removeExternalSourceFromSecurityGroupAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Detach-Instance-From-Security-Group

```java
CompletableFuture<Operation> detachInstanceFromSecurityGroupAsync(
    final UUID id,
    final SecurityGroupDetachRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`SecurityGroupDetachRequest`](../../doc/models/security-group-detach-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
SecurityGroupDetachRequest body = new SecurityGroupDetachRequest.Builder(
    new Instance.Builder()
        .build()
)
.build();

securityGroupController.detachInstanceFromSecurityGroupAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Add-External-Source-to-Security-Group

```java
CompletableFuture<Operation> addExternalSourceToSecurityGroupAsync(
    final UUID id,
    final SecurityGroupAddSourceRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`SecurityGroupAddSourceRequest`](../../doc/models/security-group-add-source-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
SecurityGroupAddSourceRequest body = new SecurityGroupAddSourceRequest.Builder(
    "cidr6"
)
.build();

securityGroupController.addExternalSourceToSecurityGroupAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

