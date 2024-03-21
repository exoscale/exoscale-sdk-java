# BlockStorage
(*blockStorage()*)

## Overview


Exoscale's Block Storage offers persistent
externally attached volumes for your workloads.

Read more
<https://community.exoscale.com/documentation/compute/>
### Available Operations

* [attachBlockStorageVolumeToInstance](#attachblockstoragevolumetoinstance) - Attach block storage volume to an instance
* [deleteBlockStorageSnapshot](#deleteblockstoragesnapshot) - Delete a block storage snapshot, data will be unrecoverable
* [getBlockStorageSnapshot](#getblockstoragesnapshot) - Retrieve block storage snapshot details
* [getBlockStorageVolume](#getblockstoragevolume) - Retrieve block storage volume details
* [updateBlockStorageVolumeLabels](#updateblockstoragevolumelabels) - Set block storage volume labels
* [deleteBlockStorageVolume](#deleteblockstoragevolume) - Delete a block storage volume, data will be unrecoverable
* [createBlockStorageSnapshot](#createblockstoragesnapshot) - Create a block storage snapshot
* [listBlockStorageSnapshots](#listblockstoragesnapshots) - List block storage snapshots
* [resizeBlockStorageVolume](#resizeblockstoragevolume) - Resize a block storage volume
* [detachBlockStorageVolume](#detachblockstoragevolume) - Detach block storage volume
* [listBlockStorageVolumes](#listblockstoragevolumes) - List block storage volumes
* [createBlockStorageVolume](#createblockstoragevolume) - Create a block storage volume

## attachBlockStorageVolumeToInstance

Attach block storage volume to an instance

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.InstanceTarget;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.AttachBlockStorageVolumeToInstanceRequest;
import com.exoscale.api.models.operations.AttachBlockStorageVolumeToInstanceRequestBody;
import com.exoscale.api.models.operations.AttachBlockStorageVolumeToInstanceResponse;
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

            AttachBlockStorageVolumeToInstanceResponse res = sdk.blockStorage().attachBlockStorageVolumeToInstance()
                .id("2979cc6d-f79c-43ba-86e7-ccf9a7a10c6a")
                .requestBody(AttachBlockStorageVolumeToInstanceRequestBody.builder()
                    .instance(InstanceTarget.builder()
                            .id("58267b60-0e41-4bce-aa44-1c414765e272")
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

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                                                                         | *String*                                                                                                                                                     | :heavy_check_mark:                                                                                                                                           | N/A                                                                                                                                                          |
| `requestBody`                                                                                                                                                | [com.exoscale.api.models.operations.AttachBlockStorageVolumeToInstanceRequestBody](../../models/operations/AttachBlockStorageVolumeToInstanceRequestBody.md) | :heavy_check_mark:                                                                                                                                           | N/A                                                                                                                                                          |


### Response

**[Optional<? extends com.exoscale.api.models.operations.AttachBlockStorageVolumeToInstanceResponse>](../../models/operations/AttachBlockStorageVolumeToInstanceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteBlockStorageSnapshot

Delete a block storage snapshot, data will be unrecoverable

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteBlockStorageSnapshotRequest;
import com.exoscale.api.models.operations.DeleteBlockStorageSnapshotResponse;
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

            DeleteBlockStorageSnapshotResponse res = sdk.blockStorage().deleteBlockStorageSnapshot()
                .id("07079ee6-3763-4a31-b0b7-faf503eaed00")
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

**[Optional<? extends com.exoscale.api.models.operations.DeleteBlockStorageSnapshotResponse>](../../models/operations/DeleteBlockStorageSnapshotResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getBlockStorageSnapshot

Retrieve block storage snapshot details

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetBlockStorageSnapshotRequest;
import com.exoscale.api.models.operations.GetBlockStorageSnapshotResponse;
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

            GetBlockStorageSnapshotResponse res = sdk.blockStorage().getBlockStorageSnapshot()
                .id("72ae648f-be2f-410b-bc35-746965b83c35")
                .call();

            if (res.blockStorageSnapshot().isPresent()) {
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

**[Optional<? extends com.exoscale.api.models.operations.GetBlockStorageSnapshotResponse>](../../models/operations/GetBlockStorageSnapshotResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getBlockStorageVolume

Retrieve block storage volume details

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetBlockStorageVolumeRequest;
import com.exoscale.api.models.operations.GetBlockStorageVolumeResponse;
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

            GetBlockStorageVolumeResponse res = sdk.blockStorage().getBlockStorageVolume()
                .id("c4094081-d3ec-4bdc-9c53-b7d1cc763789")
                .call();

            if (res.blockStorageVolume().isPresent()) {
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

**[Optional<? extends com.exoscale.api.models.operations.GetBlockStorageVolumeResponse>](../../models/operations/GetBlockStorageVolumeResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateBlockStorageVolumeLabels

Set block storage volume labels

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.UpdateBlockStorageVolumeLabelsRequest;
import com.exoscale.api.models.operations.UpdateBlockStorageVolumeLabelsRequestBody;
import com.exoscale.api.models.operations.UpdateBlockStorageVolumeLabelsResponse;
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

            UpdateBlockStorageVolumeLabelsResponse res = sdk.blockStorage().updateBlockStorageVolumeLabels()
                .id("b60de1bb-110f-4fe2-8f90-992482ff2271")
                .requestBody(UpdateBlockStorageVolumeLabelsRequestBody.builder()
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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                 | *String*                                                                                                                                             | :heavy_check_mark:                                                                                                                                   | N/A                                                                                                                                                  |
| `requestBody`                                                                                                                                        | [com.exoscale.api.models.operations.UpdateBlockStorageVolumeLabelsRequestBody](../../models/operations/UpdateBlockStorageVolumeLabelsRequestBody.md) | :heavy_check_mark:                                                                                                                                   | N/A                                                                                                                                                  |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpdateBlockStorageVolumeLabelsResponse>](../../models/operations/UpdateBlockStorageVolumeLabelsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteBlockStorageVolume

Delete a block storage volume, data will be unrecoverable

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteBlockStorageVolumeRequest;
import com.exoscale.api.models.operations.DeleteBlockStorageVolumeResponse;
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

            DeleteBlockStorageVolumeResponse res = sdk.blockStorage().deleteBlockStorageVolume()
                .id("7506c35f-eb11-438f-9378-2b9fd551be08")
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

**[Optional<? extends com.exoscale.api.models.operations.DeleteBlockStorageVolumeResponse>](../../models/operations/DeleteBlockStorageVolumeResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createBlockStorageSnapshot

Create a block storage snapshot

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateBlockStorageSnapshotRequest;
import com.exoscale.api.models.operations.CreateBlockStorageSnapshotRequestBody;
import com.exoscale.api.models.operations.CreateBlockStorageSnapshotResponse;
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

            CreateBlockStorageSnapshotResponse res = sdk.blockStorage().createBlockStorageSnapshot()
                .id("b8b11c31-1637-4b4e-98a3-700d7644c0de")
                .requestBody(CreateBlockStorageSnapshotRequestBody.builder()
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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                         | *String*                                                                                                                                     | :heavy_check_mark:                                                                                                                           | N/A                                                                                                                                          |
| `requestBody`                                                                                                                                | [com.exoscale.api.models.operations.CreateBlockStorageSnapshotRequestBody](../../models/operations/CreateBlockStorageSnapshotRequestBody.md) | :heavy_check_mark:                                                                                                                           | N/A                                                                                                                                          |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateBlockStorageSnapshotResponse>](../../models/operations/CreateBlockStorageSnapshotResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listBlockStorageSnapshots

List block storage snapshots

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListBlockStorageSnapshotsResponse;
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

            ListBlockStorageSnapshotsResponse res = sdk.blockStorage().listBlockStorageSnapshots()
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

**[Optional<? extends com.exoscale.api.models.operations.ListBlockStorageSnapshotsResponse>](../../models/operations/ListBlockStorageSnapshotsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## resizeBlockStorageVolume

This operation resizes a Block storage volume. Note: the volume can only grow, cannot be shrunk.

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ResizeBlockStorageVolumeRequest;
import com.exoscale.api.models.operations.ResizeBlockStorageVolumeRequestBody;
import com.exoscale.api.models.operations.ResizeBlockStorageVolumeResponse;
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

            ResizeBlockStorageVolumeResponse res = sdk.blockStorage().resizeBlockStorageVolume()
                .id("4198809b-6b30-491b-a6c4-eebc91f72568")
                .requestBody(ResizeBlockStorageVolumeRequestBody.builder()
                    .size(411756L)
                    .build())
                .call();

            if (res.blockStorageVolume().isPresent()) {
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
| `id`                                                                                                                                     | *String*                                                                                                                                 | :heavy_check_mark:                                                                                                                       | N/A                                                                                                                                      |
| `requestBody`                                                                                                                            | [com.exoscale.api.models.operations.ResizeBlockStorageVolumeRequestBody](../../models/operations/ResizeBlockStorageVolumeRequestBody.md) | :heavy_check_mark:                                                                                                                       | N/A                                                                                                                                      |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ResizeBlockStorageVolumeResponse>](../../models/operations/ResizeBlockStorageVolumeResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## detachBlockStorageVolume

Detach block storage volume

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DetachBlockStorageVolumeRequest;
import com.exoscale.api.models.operations.DetachBlockStorageVolumeResponse;
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

            DetachBlockStorageVolumeResponse res = sdk.blockStorage().detachBlockStorageVolume()
                .id("333165a1-308f-4224-a51b-56826e07dea1")
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

**[Optional<? extends com.exoscale.api.models.operations.DetachBlockStorageVolumeResponse>](../../models/operations/DetachBlockStorageVolumeResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listBlockStorageVolumes

List block storage volumes

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListBlockStorageVolumesRequest;
import com.exoscale.api.models.operations.ListBlockStorageVolumesResponse;
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

            ListBlockStorageVolumesResponse res = sdk.blockStorage().listBlockStorageVolumes()
                .instanceId("ceb41118-9eca-4294-9aa2-a42421e04494")
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
| `instanceId`                 | *Optional<? extends String>* | :heavy_minus_sign:           | N/A                          |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ListBlockStorageVolumesResponse>](../../models/operations/ListBlockStorageVolumesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createBlockStorageVolume

Create a block storage volume

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.BlockStorageSnapshotTarget;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateBlockStorageVolumeRequestBody;
import com.exoscale.api.models.operations.CreateBlockStorageVolumeResponse;
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

            CreateBlockStorageVolumeRequestBody req = CreateBlockStorageVolumeRequestBody.builder()
                .name("<value>")
                .size(139593L)
                .labels(java.util.Map.ofEntries(
                    entry("key", "<value>")))
                .blockStorageSnapshot(BlockStorageSnapshotTarget.builder()
                    .id("f1e24844-1f89-4601-b67b-582cc9c372a4")
                    .build())
                .build();

            CreateBlockStorageVolumeResponse res = sdk.blockStorage().createBlockStorageVolume()
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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [com.exoscale.api.models.operations.CreateBlockStorageVolumeRequestBody](../../models/operations/CreateBlockStorageVolumeRequestBody.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateBlockStorageVolumeResponse>](../../models/operations/CreateBlockStorageVolumeResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
