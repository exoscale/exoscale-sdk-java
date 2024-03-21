# Sos
(*sos()*)

### Available Operations

* [listSosBucketsUsage](#listsosbucketsusage) - List SOS Buckets Usage
* [getSosPresignedUrl](#getsospresignedurl) - Retrieve Presigned Download URL for SOS object

## listSosBucketsUsage

List SOS Buckets Usage

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListSosBucketsUsageResponse;
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

            ListSosBucketsUsageResponse res = sdk.sos().listSosBucketsUsage()
                .call();

            if (res.object().isPresent()) {
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


### Response

**[Optional<? extends com.exoscale.api.models.operations.ListSosBucketsUsageResponse>](../../models/operations/ListSosBucketsUsageResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getSosPresignedUrl

Generates Presigned Download URL for SOS object

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetSosPresignedUrlRequest;
import com.exoscale.api.models.operations.GetSosPresignedUrlResponse;
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

            GetSosPresignedUrlResponse res = sdk.sos().getSosPresignedUrl()
                .bucket("<value>")
                .key("<value>")
                .call();

            if (res.object().isPresent()) {
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

| Parameter                    | Type                         | Required                     | Description                  |
| ---------------------------- | ---------------------------- | ---------------------------- | ---------------------------- |
| `bucket`                     | *String*                     | :heavy_check_mark:           | N/A                          |
| `key`                        | *Optional<? extends String>* | :heavy_minus_sign:           | N/A                          |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetSosPresignedUrlResponse>](../../models/operations/GetSosPresignedUrlResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
