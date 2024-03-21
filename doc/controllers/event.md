# Event

Events form the basis of the Exoscale audit-trail, a mechanism to query past events
performing mutations on resources which happened on an organization

Read more: [https://www.exoscale.com/support/](https://www.exoscale.com/support/)

```java
EventController eventController = client.getEventController();
```

## Class Name

`EventController`


# List-Events

Retrieve Mutation Events for a given date range. Defaults to retrieving Events for the past 24 hours.
Both a `from` and `to` arguments can be specified to filter Events over a specific period.
Events will be the the most descriptive possible but not all fields are mandatory

```java
CompletableFuture<List<Event>> listEventsAsync(
    final LocalDateTime from,
    final LocalDateTime to)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `from` | `LocalDateTime` | Query, Optional | - |
| `to` | `LocalDateTime` | Query, Optional | - |

## Response Type

[`List<Event>`](../../doc/models/event.md)

## Example Usage

```java
eventController.listEventsAsync(null, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

