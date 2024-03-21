# Zone

```java
ZoneController zoneController = client.getZoneController();
```

## Class Name

`ZoneController`


# List-Zones

```java
CompletableFuture<ZoneResponse> listZonesAsync()
```

## Response Type

[`ZoneResponse`](../../doc/models/zone-response.md)

## Example Usage

```java
zoneController.listZonesAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

