# Reverse-Dns

```java
ReverseDnsController reverseDnsController = client.getReverseDnsController();
```

## Class Name

`ReverseDnsController`

## Methods

* [Get-Reverse-Dns-Elastic-Ip](../../doc/controllers/reverse-dns.md#get-reverse-dns-elastic-ip)
* [Update-Reverse-Dns-Elastic-Ip](../../doc/controllers/reverse-dns.md#update-reverse-dns-elastic-ip)
* [Delete-Reverse-Dns-Elastic-Ip](../../doc/controllers/reverse-dns.md#delete-reverse-dns-elastic-ip)
* [Update-Reverse-Dns-Instance](../../doc/controllers/reverse-dns.md#update-reverse-dns-instance)
* [Get-Reverse-Dns-Instance](../../doc/controllers/reverse-dns.md#get-reverse-dns-instance)
* [Delete-Reverse-Dns-Instance](../../doc/controllers/reverse-dns.md#delete-reverse-dns-instance)


# Get-Reverse-Dns-Elastic-Ip

```java
CompletableFuture<ReverseDnsRecord> getReverseDnsElasticIpAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

[`ReverseDnsRecord`](../../doc/models/reverse-dns-record.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

reverseDnsController.getReverseDnsElasticIpAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update-Reverse-Dns-Elastic-Ip

```java
CompletableFuture<Operation> updateReverseDnsElasticIpAsync(
    final UUID id,
    final ReverseDnsRecord body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`ReverseDnsRecord`](../../doc/models/reverse-dns-record.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
ReverseDnsRecord body = new ReverseDnsRecord.Builder()
    .build();

reverseDnsController.updateReverseDnsElasticIpAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Delete-Reverse-Dns-Elastic-Ip

```java
CompletableFuture<Operation> deleteReverseDnsElasticIpAsync(
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

reverseDnsController.deleteReverseDnsElasticIpAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update-Reverse-Dns-Instance

```java
CompletableFuture<Operation> updateReverseDnsInstanceAsync(
    final UUID id,
    final ReverseDnsRecord body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`ReverseDnsRecord`](../../doc/models/reverse-dns-record.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
ReverseDnsRecord body = new ReverseDnsRecord.Builder()
    .build();

reverseDnsController.updateReverseDnsInstanceAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Reverse-Dns-Instance

```java
CompletableFuture<ReverseDnsRecord> getReverseDnsInstanceAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

[`ReverseDnsRecord`](../../doc/models/reverse-dns-record.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

reverseDnsController.getReverseDnsInstanceAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Delete-Reverse-Dns-Instance

```java
CompletableFuture<Operation> deleteReverseDnsInstanceAsync(
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

reverseDnsController.deleteReverseDnsInstanceAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

