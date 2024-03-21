# Quotas

```java
QuotasController quotasController = client.getQuotasController();
```

## Class Name

`QuotasController`

## Methods

* [Get-Quota](../../doc/controllers/quotas.md#get-quota)
* [List-Quotas](../../doc/controllers/quotas.md#list-quotas)


# Get-Quota

```java
CompletableFuture<Quota> getQuotaAsync(
    final String entity)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `entity` | `String` | Template, Required | - |

## Response Type

[`Quota`](../../doc/models/quota.md)

## Example Usage

```java
String entity = "entity2";

quotasController.getQuotaAsync(entity).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# List-Quotas

```java
CompletableFuture<QuotaResponse> listQuotasAsync()
```

## Response Type

[`QuotaResponse`](../../doc/models/quota-response.md)

## Example Usage

```java
quotasController.listQuotasAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

