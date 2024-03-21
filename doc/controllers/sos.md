# Sos

```java
SosController sosController = client.getSosController();
```

## Class Name

`SosController`

## Methods

* [List-Sos-Buckets-Usage](../../doc/controllers/sos.md#list-sos-buckets-usage)
* [Get-Sos-Presigned-Url](../../doc/controllers/sos.md#get-sos-presigned-url)


# List-Sos-Buckets-Usage

```java
CompletableFuture<SosBucketsUsageResponse> listSosBucketsUsageAsync()
```

## Response Type

[`SosBucketsUsageResponse`](../../doc/models/sos-buckets-usage-response.md)

## Example Usage

```java
sosController.listSosBucketsUsageAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Sos-Presigned-Url

Generates Presigned Download URL for SOS object

```java
CompletableFuture<SosPresignedUrlResponse> getSosPresignedUrlAsync(
    final String bucket,
    final String key)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `bucket` | `String` | Template, Required | - |
| `key` | `String` | Query, Optional | - |

## Response Type

[`SosPresignedUrlResponse`](../../doc/models/sos-presigned-url-response.md)

## Example Usage

```java
String bucket = "bucket2";

sosController.getSosPresignedUrlAsync(bucket, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

