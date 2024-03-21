<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteLoadBalancerServiceRequest;
import com.exoscale.api.models.operations.DeleteLoadBalancerServiceResponse;
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

            DeleteLoadBalancerServiceResponse res = sdk.networkLoadBalancer().deleteLoadBalancerService()
                .id("266197f0-c85e-4981-85ec-e73d8dc6e6bf")
                .serviceId("03cf7ba0-13f2-4305-9769-06e0ffb8d5fc")
                .call();

            if (res.operation().isPresent()) {
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
<!-- End SDK Example Usage [usage] -->