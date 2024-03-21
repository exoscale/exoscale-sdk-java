# Deploy-Target

```java
DeployTargetController deployTargetController = client.getDeployTargetController();
```

## Class Name

`DeployTargetController`

## Methods

* [List-Deploy-Targets](../../doc/controllers/deploy-target.md#list-deploy-targets)
* [Get-Deploy-Target](../../doc/controllers/deploy-target.md#get-deploy-target)


# List-Deploy-Targets

```java
CompletableFuture<DeployTargetResponse> listDeployTargetsAsync()
```

## Response Type

[`DeployTargetResponse`](../../doc/models/deploy-target-response.md)

## Example Usage

```java
deployTargetController.listDeployTargetsAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Deploy-Target

```java
CompletableFuture<DeployTarget> getDeployTargetAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

[`DeployTarget`](../../doc/models/deploy-target.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

deployTargetController.getDeployTargetAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

