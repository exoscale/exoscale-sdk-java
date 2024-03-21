# Elastic-Ip

```java
ElasticIpController elasticIpController = client.getElasticIpController();
```

## Class Name

`ElasticIpController`

## Methods

* [Create-Elastic-Ip](../../doc/controllers/elastic-ip.md#create-elastic-ip)
* [List-Elastic-Ips](../../doc/controllers/elastic-ip.md#list-elastic-ips)
* [Reset-Elastic-Ip-Field](../../doc/controllers/elastic-ip.md#reset-elastic-ip-field)
* [Detach-Instance-From-Elastic-Ip](../../doc/controllers/elastic-ip.md#detach-instance-from-elastic-ip)
* [Attach-Instance-to-Elastic-Ip](../../doc/controllers/elastic-ip.md#attach-instance-to-elastic-ip)
* [Update-Elastic-Ip](../../doc/controllers/elastic-ip.md#update-elastic-ip)
* [Get-Elastic-Ip](../../doc/controllers/elastic-ip.md#get-elastic-ip)
* [Delete-Elastic-Ip](../../doc/controllers/elastic-ip.md#delete-elastic-ip)


# Create-Elastic-Ip

```java
CompletableFuture<Operation> createElasticIpAsync(
    final ElasticIpRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ElasticIpRequest`](../../doc/models/elastic-ip-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
ElasticIpRequest body = new ElasticIpRequest.Builder()
    .build();

elasticIpController.createElasticIpAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# List-Elastic-Ips

```java
CompletableFuture<ElasticIpResponse> listElasticIpsAsync()
```

## Response Type

[`ElasticIpResponse`](../../doc/models/elastic-ip-response.md)

## Example Usage

```java
elasticIpController.listElasticIpsAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Reset-Elastic-Ip-Field

```java
CompletableFuture<Operation> resetElasticIpFieldAsync(
    final UUID id,
    final FieldEnum field)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `field` | [`FieldEnum`](../../doc/models/field-enum.md) | Template, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
FieldEnum field = FieldEnum.DESCRIPTION;

elasticIpController.resetElasticIpFieldAsync(id, field).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Detach-Instance-From-Elastic-Ip

```java
CompletableFuture<Operation> detachInstanceFromElasticIpAsync(
    final UUID id,
    final ElasticIpDetachRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`ElasticIpDetachRequest`](../../doc/models/elastic-ip-detach-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
ElasticIpDetachRequest body = new ElasticIpDetachRequest.Builder(
    new InstanceTarget.Builder()
        .build()
)
.build();

elasticIpController.detachInstanceFromElasticIpAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Attach-Instance-to-Elastic-Ip

```java
CompletableFuture<Operation> attachInstanceToElasticIpAsync(
    final UUID id,
    final ElasticIpAttachRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`ElasticIpAttachRequest`](../../doc/models/elastic-ip-attach-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
ElasticIpAttachRequest body = new ElasticIpAttachRequest.Builder(
    new InstanceTarget.Builder()
        .build()
)
.build();

elasticIpController.attachInstanceToElasticIpAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update-Elastic-Ip

```java
CompletableFuture<Operation> updateElasticIpAsync(
    final UUID id,
    final ElasticIpRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`ElasticIpRequest1`](../../doc/models/elastic-ip-request-1.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
ElasticIpRequest1 body = new ElasticIpRequest1.Builder()
    .build();

elasticIpController.updateElasticIpAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Elastic-Ip

```java
CompletableFuture<ElasticIp> getElasticIpAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

[`ElasticIp`](../../doc/models/elastic-ip.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

elasticIpController.getElasticIpAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Delete-Elastic-Ip

```java
CompletableFuture<Operation> deleteElasticIpAsync(
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

elasticIpController.deleteElasticIpAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

