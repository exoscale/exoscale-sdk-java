# Event
(*event()*)

## Overview


Events form the basis of the Exoscale audit-trail, a mechanism to query past events
performing mutations on resources which happened on an organization

Read more
<https://www.exoscale.com/support/>
### Available Operations

* [listEvents](#listevents) - List Events

## listEvents

Retrieve Mutation Events for a given date range. Defaults to retrieving Events for the past 24 hours.
         Both a `from` and `to` arguments can be specified to filter Events over a specific period.
         Events will be the the most descriptive possible but not all fields are mandatory

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListEventsRequest;
import com.exoscale.api.models.operations.ListEventsResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Exoscale sdk = Exoscale.builder()
                .build();

            ListEventsResponse res = sdk.event().listEvents()
                .from(OffsetDateTime.parse("2024-11-12T01:22:09.505Z"))
                .to(OffsetDateTime.parse("2023-06-11T11:21:31.496Z"))
                .call();

            if (res.events().isPresent()) {
                // handle response
            }
        } catch (com.exoscale.api.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `from`                                                                                    | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_minus_sign:                                                                        | N/A                                                                                       |
| `to`                                                                                      | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_minus_sign:                                                                        | N/A                                                                                       |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ListEventsResponse>](../../models/operations/ListEventsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
