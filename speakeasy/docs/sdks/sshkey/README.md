# SshKey
(*sshKey()*)

### Available Operations

* [deleteSshKey](#deletesshkey) - Delete a SSH key
* [getSshKey](#getsshkey) - Retrieve SSH key details
* [listSshKeys](#listsshkeys) - List SSH keys
* [registerSshKey](#registersshkey) - Import SSH key

## deleteSshKey

Delete a SSH key

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteSshKeyRequest;
import com.exoscale.api.models.operations.DeleteSshKeyResponse;
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

            DeleteSshKeyResponse res = sdk.sshKey().deleteSshKey()
                .name("<value>")
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

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DeleteSshKeyResponse>](../../models/operations/DeleteSshKeyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getSshKey

Retrieve SSH key details

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetSshKeyRequest;
import com.exoscale.api.models.operations.GetSshKeyResponse;
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

            GetSshKeyResponse res = sdk.sshKey().getSshKey()
                .name("<value>")
                .call();

            if (res.sshKey().isPresent()) {
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

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `name`             | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetSshKeyResponse>](../../models/operations/GetSshKeyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listSshKeys

List SSH keys

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListSshKeysResponse;
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

            ListSshKeysResponse res = sdk.sshKey().listSshKeys()
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

**[Optional<? extends com.exoscale.api.models.operations.ListSshKeysResponse>](../../models/operations/ListSshKeysResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## registerSshKey

Import SSH key

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.RegisterSshKeyRequestBody;
import com.exoscale.api.models.operations.RegisterSshKeyResponse;
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

            RegisterSshKeyRequestBody req = RegisterSshKeyRequestBody.builder()
                .name("<value>")
                .publicKey("<value>")
                .build();

            RegisterSshKeyResponse res = sdk.sshKey().registerSshKey()
                .request(req)
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

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.exoscale.api.models.operations.RegisterSshKeyRequestBody](../../models/operations/RegisterSshKeyRequestBody.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[Optional<? extends com.exoscale.api.models.operations.RegisterSshKeyResponse>](../../models/operations/RegisterSshKeyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
