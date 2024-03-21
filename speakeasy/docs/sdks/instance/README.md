# Instance
(*instance()*)

### Available Operations

* [createSnapshot](#createsnapshot) - Create a Snapshot of a Compute instance
* [revealInstancePassword](#revealinstancepassword) - Reveal the password used during instance creation or the latest password reset.
* [resizeInstanceDisk](#resizeinstancedisk) - Resize a Compute instance disk
* [resetInstancePassword](#resetinstancepassword) - Reset a compute instance password
* [startInstance](#startinstance) - Start a Compute instance
* [scaleInstance](#scaleinstance) - Scale a Compute instance to a new Instance Type
* [stopInstance](#stopinstance) - Stop a Compute instance
* [addInstanceProtection](#addinstanceprotection) - Set instance destruction protection
* [resetInstanceField](#resetinstancefield) - Reset Instance field
* [removeInstanceProtection](#removeinstanceprotection) - Remove instance destruction protection
* [resetInstance](#resetinstance) - Reset a Compute instance to a base/target template
* [deleteInstance](#deleteinstance) - Delete a Compute instance
* [updateInstance](#updateinstance) - Update a Compute instance
* [getInstance](#getinstance) - Retrieve Compute instance details
* [rebootInstance](#rebootinstance) - Reboot a Compute instance
* [createInstance](#createinstance) - Create a Compute instance
* [listInstances](#listinstances) - List Compute instances
* [revertInstanceToSnapshot](#revertinstancetosnapshot) - Revert a snapshot for an instance

## createSnapshot

Create a Snapshot of a Compute instance

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateSnapshotRequest;
import com.exoscale.api.models.operations.CreateSnapshotResponse;
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

            CreateSnapshotResponse res = sdk.instance().createSnapshot()
                .id("c18de5cd-fc2d-4199-b563-2396831bde0e")
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
| `id`               | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateSnapshotResponse>](../../models/operations/CreateSnapshotResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## revealInstancePassword

Reveal the password used during instance creation or the latest password reset.
            This is only available for VMs created against templates having the `password-enabled`
            property set to `true`.

            Passwords are transiently stored for at most 24 hours and intended to be retrieved shortly after
            creation or resets.

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.RevealInstancePasswordRequest;
import com.exoscale.api.models.operations.RevealInstancePasswordResponse;
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

            RevealInstancePasswordResponse res = sdk.instance().revealInstancePassword()
                .id("635b523b-c94a-4ae8-a1c8-b266e86b4ecd")
                .call();

            if (res.instancePassword().isPresent()) {
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
| `id`               | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.RevealInstancePasswordResponse>](../../models/operations/RevealInstancePasswordResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## resizeInstanceDisk

This operation resizes a Compute instance's disk volume. Note: the disk can only grow, cannot be shrunk.

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ResizeInstanceDiskRequest;
import com.exoscale.api.models.operations.ResizeInstanceDiskRequestBody;
import com.exoscale.api.models.operations.ResizeInstanceDiskResponse;
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

            ResizeInstanceDiskResponse res = sdk.instance().resizeInstanceDisk()
                .id("65d3fa51-c039-4bdb-beef-0ccb0373f344")
                .requestBody(ResizeInstanceDiskRequestBody.builder()
                    .diskSize(892909L)
                    .build())
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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                         | *String*                                                                                                                     | :heavy_check_mark:                                                                                                           | N/A                                                                                                                          |
| `requestBody`                                                                                                                | [com.exoscale.api.models.operations.ResizeInstanceDiskRequestBody](../../models/operations/ResizeInstanceDiskRequestBody.md) | :heavy_check_mark:                                                                                                           | N/A                                                                                                                          |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ResizeInstanceDiskResponse>](../../models/operations/ResizeInstanceDiskResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## resetInstancePassword

Reset a compute instance password

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ResetInstancePasswordRequest;
import com.exoscale.api.models.operations.ResetInstancePasswordResponse;
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

            ResetInstancePasswordResponse res = sdk.instance().resetInstancePassword()
                .id("55954ed1-5c9d-4d16-8546-929591ac2b29")
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
| `id`               | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ResetInstancePasswordResponse>](../../models/operations/ResetInstancePasswordResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## startInstance

This operation starts a virtual machine, potentially using a rescue profile if specified

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.RescueProfile;
import com.exoscale.api.models.operations.StartInstanceRequest;
import com.exoscale.api.models.operations.StartInstanceRequestBody;
import com.exoscale.api.models.operations.StartInstanceResponse;
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

            StartInstanceResponse res = sdk.instance().startInstance()
                .id("9bc8e947-8f06-423c-bee0-9c7482ae5ce6")
                .requestBody(StartInstanceRequestBody.builder()
                    .build())
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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                               | *String*                                                                                                           | :heavy_check_mark:                                                                                                 | N/A                                                                                                                |
| `requestBody`                                                                                                      | [com.exoscale.api.models.operations.StartInstanceRequestBody](../../models/operations/StartInstanceRequestBody.md) | :heavy_check_mark:                                                                                                 | N/A                                                                                                                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.StartInstanceResponse>](../../models/operations/StartInstanceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## scaleInstance

This operation changes the Compute instance's type. Note: the new Instance Type must be within the same family (e.g. a standard instance cannot be scaled to gpu2 or storage).

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.InstanceTypeInput;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ScaleInstanceRequest;
import com.exoscale.api.models.operations.ScaleInstanceRequestBody;
import com.exoscale.api.models.operations.ScaleInstanceResponse;
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

            ScaleInstanceResponse res = sdk.instance().scaleInstance()
                .id("a918ba68-b8c0-4968-bc07-acbb1deaf693")
                .requestBody(ScaleInstanceRequestBody.builder()
                    .instanceType(InstanceTypeInput.builder()
                            .build())
                    .build())
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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                               | *String*                                                                                                           | :heavy_check_mark:                                                                                                 | N/A                                                                                                                |
| `requestBody`                                                                                                      | [com.exoscale.api.models.operations.ScaleInstanceRequestBody](../../models/operations/ScaleInstanceRequestBody.md) | :heavy_check_mark:                                                                                                 | N/A                                                                                                                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ScaleInstanceResponse>](../../models/operations/ScaleInstanceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## stopInstance

Stop a Compute instance

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.StopInstanceRequest;
import com.exoscale.api.models.operations.StopInstanceResponse;
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

            StopInstanceResponse res = sdk.instance().stopInstance()
                .id("2e95a7c9-087c-42fe-85d0-e906ae168c33")
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
| `id`               | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.StopInstanceResponse>](../../models/operations/StopInstanceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## addInstanceProtection

Set instance destruction protection

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.AddInstanceProtectionRequest;
import com.exoscale.api.models.operations.AddInstanceProtectionResponse;
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

            AddInstanceProtectionResponse res = sdk.instance().addInstanceProtection()
                .id("c1bd9bc1-87cb-4828-ae43-c06ac257b955")
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

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `id`               | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.AddInstanceProtectionResponse>](../../models/operations/AddInstanceProtectionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## resetInstanceField

Reset Instance field

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ResetInstanceFieldPathParamField;
import com.exoscale.api.models.operations.ResetInstanceFieldRequest;
import com.exoscale.api.models.operations.ResetInstanceFieldResponse;
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

            ResetInstanceFieldResponse res = sdk.instance().resetInstanceField()
                .id("d1bee0cb-a052-4035-80c8-5c0a3f3dcf15")
                .field(ResetInstanceFieldPathParamField.LABELS)
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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                               | *String*                                                                                                                           | :heavy_check_mark:                                                                                                                 | N/A                                                                                                                                |
| `field`                                                                                                                            | [com.exoscale.api.models.operations.ResetInstanceFieldPathParamField](../../models/operations/ResetInstanceFieldPathParamField.md) | :heavy_check_mark:                                                                                                                 | N/A                                                                                                                                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ResetInstanceFieldResponse>](../../models/operations/ResetInstanceFieldResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## removeInstanceProtection

Remove instance destruction protection

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.RemoveInstanceProtectionRequest;
import com.exoscale.api.models.operations.RemoveInstanceProtectionResponse;
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

            RemoveInstanceProtectionResponse res = sdk.instance().removeInstanceProtection()
                .id("3e8138bc-439c-45e5-957a-f4a8fdc7b80d")
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

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `id`               | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.RemoveInstanceProtectionResponse>](../../models/operations/RemoveInstanceProtectionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## resetInstance

This operation re-installs a Compute instance to a base template. If target template is provided it will be used to recreated instance from. Warning: the operation wipes all data stored on the disk.

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.BootMode;
import com.exoscale.api.models.components.TemplateInput;
import com.exoscale.api.models.components.ZoneName;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ResetInstanceRequest;
import com.exoscale.api.models.operations.ResetInstanceRequestBody;
import com.exoscale.api.models.operations.ResetInstanceResponse;
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

            ResetInstanceResponse res = sdk.instance().resetInstance()
                .id("c6a1d4ec-4c26-4f70-ae76-ef2f3987ec4f")
                .requestBody(ResetInstanceRequestBody.builder()
                    .build())
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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                               | *String*                                                                                                           | :heavy_check_mark:                                                                                                 | N/A                                                                                                                |
| `requestBody`                                                                                                      | [com.exoscale.api.models.operations.ResetInstanceRequestBody](../../models/operations/ResetInstanceRequestBody.md) | :heavy_check_mark:                                                                                                 | N/A                                                                                                                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ResetInstanceResponse>](../../models/operations/ResetInstanceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteInstance

Delete a Compute instance

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteInstanceRequest;
import com.exoscale.api.models.operations.DeleteInstanceResponse;
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

            DeleteInstanceResponse res = sdk.instance().deleteInstance()
                .id("460ac0ca-f520-48ad-97cc-f6844ca0a431")
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
| `id`               | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DeleteInstanceResponse>](../../models/operations/DeleteInstanceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateInstance

Update a Compute instance

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.PublicIpAssignment;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.UpdateInstanceRequest;
import com.exoscale.api.models.operations.UpdateInstanceRequestBody;
import com.exoscale.api.models.operations.UpdateInstanceResponse;
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

            UpdateInstanceResponse res = sdk.instance().updateInstance()
                .id("3e3885aa-419f-4150-b296-076d5cdf17f9")
                .requestBody(UpdateInstanceRequestBody.builder()
                    .build())
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
| `id`                                                                                                                 | *String*                                                                                                             | :heavy_check_mark:                                                                                                   | N/A                                                                                                                  |
| `requestBody`                                                                                                        | [com.exoscale.api.models.operations.UpdateInstanceRequestBody](../../models/operations/UpdateInstanceRequestBody.md) | :heavy_check_mark:                                                                                                   | N/A                                                                                                                  |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpdateInstanceResponse>](../../models/operations/UpdateInstanceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getInstance

Retrieve Compute instance details

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetInstanceRequest;
import com.exoscale.api.models.operations.GetInstanceResponse;
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

            GetInstanceResponse res = sdk.instance().getInstance()
                .id("3f95040d-39e3-4a0d-aa72-1324bdfda5fe")
                .call();

            if (res.instance().isPresent()) {
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
| `id`               | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetInstanceResponse>](../../models/operations/GetInstanceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## rebootInstance

Reboot a Compute instance

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.RebootInstanceRequest;
import com.exoscale.api.models.operations.RebootInstanceResponse;
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

            RebootInstanceResponse res = sdk.instance().rebootInstance()
                .id("592e7939-0ca2-4669-83cc-6b75e1ee7cab")
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
| `id`               | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.RebootInstanceResponse>](../../models/operations/RebootInstanceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createInstance

Create a Compute instance

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.AntiAffinityGroupInput;
import com.exoscale.api.models.components.BootMode;
import com.exoscale.api.models.components.DeployTarget;
import com.exoscale.api.models.components.DeployTargetType;
import com.exoscale.api.models.components.FlowDirection;
import com.exoscale.api.models.components.Icmp;
import com.exoscale.api.models.components.InstanceTypeInput;
import com.exoscale.api.models.components.PublicIpAssignment;
import com.exoscale.api.models.components.SecurityGroupInput;
import com.exoscale.api.models.components.SecurityGroupResource;
import com.exoscale.api.models.components.SecurityGroupResourceVisibility;
import com.exoscale.api.models.components.SecurityGroupRule;
import com.exoscale.api.models.components.SecurityGroupRuleProtocol;
import com.exoscale.api.models.components.SshKeyInput;
import com.exoscale.api.models.components.TemplateInput;
import com.exoscale.api.models.components.ZoneName;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateInstanceRequestBody;
import com.exoscale.api.models.operations.CreateInstanceResponse;
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

            CreateInstanceRequestBody req = CreateInstanceRequestBody.builder()
                .instanceType(InstanceTypeInput.builder()
                        .build())
                .template(TemplateInput.builder()
                        .description("Re-engineered neutral info-mediaries")
                        .sshKeyEnabled(false)
                        .name("<value>")
                        .defaultUser("<value>")
                        .size(470456L)
                        .passwordEnabled(false)
                        .checksum("<value>")
                        .bootMode(BootMode.UEFI)
                        .zones(java.util.List.of(
                            ZoneName.CH_GVA2))
                        .url("https://limp-racist.org")
                        .build())
                .diskSize(742261L)
                .antiAffinityGroups(java.util.List.of(
                    AntiAffinityGroupInput.builder()
                        .build()))
                .publicIpAssignment(PublicIpAssignment.NONE)
                .labels(java.util.Map.ofEntries(
                    entry("key", "<value>")))
                .autoStart(false)
                .securityGroups(java.util.List.of(
                    SecurityGroupInput.builder()
                        .build()))
                .name("<value>")
                .sshKey(SshKeyInput.builder()
                    .name("<value>")
                    .build())
                .userData("<value>")
                .deployTarget(DeployTarget.builder()
                    .id("f6141ec3-c317-42b7-987e-7d1b1c8860d9")
                    .name("<value>")
                    .type(DeployTargetType.DEDICATED)
                    .description("Reverse-engineered tangible architecture")
                    .build())
                .ipv6Enabled(false)
                .sshKeys(java.util.List.of(
                    SshKeyInput.builder()
                        .build()))
                .build();

            CreateInstanceResponse res = sdk.instance().createInstance()
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
| `request`                                                                                                            | [com.exoscale.api.models.operations.CreateInstanceRequestBody](../../models/operations/CreateInstanceRequestBody.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateInstanceResponse>](../../models/operations/CreateInstanceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listInstances

List Compute instances

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListInstancesRequest;
import com.exoscale.api.models.operations.ListInstancesResponse;
import com.exoscale.api.models.operations.ManagerType;
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

            ListInstancesResponse res = sdk.instance().listInstances()
                .managerId("29f22d5a-e972-45a6-b097-223c7a271a5f")
                .managerType(ManagerType.INSTANCE_POOL)
                .ipAddress("<value>")
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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `managerId`                                                                                                  | *Optional<? extends String>*                                                                                 | :heavy_minus_sign:                                                                                           | N/A                                                                                                          |
| `managerType`                                                                                                | [Optional<? extends com.exoscale.api.models.operations.ManagerType>](../../models/operations/ManagerType.md) | :heavy_minus_sign:                                                                                           | N/A                                                                                                          |
| `ipAddress`                                                                                                  | *Optional<? extends String>*                                                                                 | :heavy_minus_sign:                                                                                           | N/A                                                                                                          |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ListInstancesResponse>](../../models/operations/ListInstancesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## revertInstanceToSnapshot

This operation reverts the snapshot to the Compute instance volume, restoring stored data as it was at the time of the snapshot.
The Compute instance must be previously stopped.

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.RevertInstanceToSnapshotRequest;
import com.exoscale.api.models.operations.RevertInstanceToSnapshotRequestBody;
import com.exoscale.api.models.operations.RevertInstanceToSnapshotResponse;
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

            RevertInstanceToSnapshotResponse res = sdk.instance().revertInstanceToSnapshot()
                .instanceId("8e4bfd6b-98ef-4eb5-a40f-cae44ae0f9a5")
                .requestBody(RevertInstanceToSnapshotRequestBody.builder()
                    .id("68cd05b0-2f34-4302-8ed0-1c7f54f1aa50")
                    .build())
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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `instanceId`                                                                                                                             | *String*                                                                                                                                 | :heavy_check_mark:                                                                                                                       | N/A                                                                                                                                      |
| `requestBody`                                                                                                                            | [com.exoscale.api.models.operations.RevertInstanceToSnapshotRequestBody](../../models/operations/RevertInstanceToSnapshotRequestBody.md) | :heavy_check_mark:                                                                                                                       | N/A                                                                                                                                      |


### Response

**[Optional<? extends com.exoscale.api.models.operations.RevertInstanceToSnapshotResponse>](../../models/operations/RevertInstanceToSnapshotResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
