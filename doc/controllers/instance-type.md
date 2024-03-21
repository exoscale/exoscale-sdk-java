# Instance-Type

```java
InstanceTypeController instanceTypeController = client.getInstanceTypeController();
```

## Class Name

`InstanceTypeController`

## Methods

* [Get-Instance-Type](../../doc/controllers/instance-type.md#get-instance-type)
* [List-Instance-Types](../../doc/controllers/instance-type.md#list-instance-types)


# Get-Instance-Type

```java
CompletableFuture<InstanceType> getInstanceTypeAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

[`InstanceType`](../../doc/models/instance-type.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

instanceTypeController.getInstanceTypeAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# List-Instance-Types

```java
CompletableFuture<InstanceTypeResponse> listInstanceTypesAsync()
```

## Response Type

[`InstanceTypeResponse`](../../doc/models/instance-type-response.md)

## Example Usage

```java
instanceTypeController.listInstanceTypesAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

