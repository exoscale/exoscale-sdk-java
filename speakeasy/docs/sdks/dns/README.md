# Dns
(*dns()*)

### Available Operations

* [listDnsDomainRecords](#listdnsdomainrecords) - List DNS domain records
* [createDnsDomainRecord](#creatednsdomainrecord) - Create DNS domain record
* [listDnsDomains](#listdnsdomains) - List DNS domains
* [createDnsDomain](#creatednsdomain) - Create DNS domain
* [getDnsDomainRecord](#getdnsdomainrecord) - Retrieve DNS domain record details
* [updateDnsDomainRecord](#updatednsdomainrecord) - Update DNS domain record
* [deleteDnsDomainRecord](#deletednsdomainrecord) - Delete DNS domain record
* [getDnsDomainZoneFile](#getdnsdomainzonefile) - Retrieve DNS domain zone file
* [deleteDnsDomain](#deletednsdomain) - Delete DNS Domain
* [getDnsDomain](#getdnsdomain) - Retrieve DNS domain details

## listDnsDomainRecords

List DNS domain records

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListDnsDomainRecordsRequest;
import com.exoscale.api.models.operations.ListDnsDomainRecordsResponse;
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

            ListDnsDomainRecordsResponse res = sdk.dns().listDnsDomainRecords()
                .domainId("76b9f37c-e000-433d-acf6-f8b301d7fc65")
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
| `domainId`         | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ListDnsDomainRecordsResponse>](../../models/operations/ListDnsDomainRecordsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createDnsDomainRecord

Create DNS domain record

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateDnsDomainRecordRequest;
import com.exoscale.api.models.operations.CreateDnsDomainRecordRequestBody;
import com.exoscale.api.models.operations.CreateDnsDomainRecordResponse;
import com.exoscale.api.models.operations.CreateDnsDomainRecordType;
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

            CreateDnsDomainRecordResponse res = sdk.dns().createDnsDomainRecord()
                .domainId("bdbcdf22-9246-4a5b-920b-6961e027d47e")
                .requestBody(CreateDnsDomainRecordRequestBody.builder()
                    .name("<value>")
                    .type(CreateDnsDomainRecordType.ALIAS)
                    .content("<value>")
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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `domainId`                                                                                                                         | *String*                                                                                                                           | :heavy_check_mark:                                                                                                                 | N/A                                                                                                                                |
| `requestBody`                                                                                                                      | [com.exoscale.api.models.operations.CreateDnsDomainRecordRequestBody](../../models/operations/CreateDnsDomainRecordRequestBody.md) | :heavy_check_mark:                                                                                                                 | N/A                                                                                                                                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateDnsDomainRecordResponse>](../../models/operations/CreateDnsDomainRecordResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listDnsDomains

List DNS domains

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListDnsDomainsResponse;
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

            ListDnsDomainsResponse res = sdk.dns().listDnsDomains()
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

**[Optional<? extends com.exoscale.api.models.operations.ListDnsDomainsResponse>](../../models/operations/ListDnsDomainsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createDnsDomain

Create DNS domain

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateDnsDomainRequestBody;
import com.exoscale.api.models.operations.CreateDnsDomainResponse;
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

            CreateDnsDomainRequestBody req = CreateDnsDomainRequestBody.builder()
                .unicodeName("<value>")
                .build();

            CreateDnsDomainResponse res = sdk.dns().createDnsDomain()
                .request(req)
                .call();

            if (res.dnsDomain().isPresent()) {
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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.exoscale.api.models.operations.CreateDnsDomainRequestBody](../../models/operations/CreateDnsDomainRequestBody.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateDnsDomainResponse>](../../models/operations/CreateDnsDomainResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDnsDomainRecord

Retrieve DNS domain record details

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetDnsDomainRecordRequest;
import com.exoscale.api.models.operations.GetDnsDomainRecordResponse;
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

            GetDnsDomainRecordResponse res = sdk.dns().getDnsDomainRecord()
                .domainId("7f4662d4-6732-4029-b676-7d29867c813e")
                .recordId("c3c4eddb-b5d5-4d79-82a2-666ba67ade5f")
                .call();

            if (res.dnsDomainRecord().isPresent()) {
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
| `domainId`         | *String*           | :heavy_check_mark: | N/A                |
| `recordId`         | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.GetDnsDomainRecordResponse>](../../models/operations/GetDnsDomainRecordResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateDnsDomainRecord

Update DNS domain record

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.UpdateDnsDomainRecordRequest;
import com.exoscale.api.models.operations.UpdateDnsDomainRecordRequestBody;
import com.exoscale.api.models.operations.UpdateDnsDomainRecordResponse;
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

            UpdateDnsDomainRecordResponse res = sdk.dns().updateDnsDomainRecord()
                .domainId("af3d0bd0-5fa8-4e24-b8b6-f2607040e403")
                .recordId("4c8dbd53-c797-44ed-89ef-d5ac17ca633d")
                .requestBody(UpdateDnsDomainRecordRequestBody.builder()
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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `domainId`                                                                                                                         | *String*                                                                                                                           | :heavy_check_mark:                                                                                                                 | N/A                                                                                                                                |
| `recordId`                                                                                                                         | *String*                                                                                                                           | :heavy_check_mark:                                                                                                                 | N/A                                                                                                                                |
| `requestBody`                                                                                                                      | [com.exoscale.api.models.operations.UpdateDnsDomainRecordRequestBody](../../models/operations/UpdateDnsDomainRecordRequestBody.md) | :heavy_check_mark:                                                                                                                 | N/A                                                                                                                                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.UpdateDnsDomainRecordResponse>](../../models/operations/UpdateDnsDomainRecordResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteDnsDomainRecord

Delete DNS domain record

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteDnsDomainRecordRequest;
import com.exoscale.api.models.operations.DeleteDnsDomainRecordResponse;
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

            DeleteDnsDomainRecordResponse res = sdk.dns().deleteDnsDomainRecord()
                .domainId("5ec2ddc7-e065-4393-a882-3e18d2c9b3bf")
                .recordId("73966fd9-63ac-42b2-b042-004468795368")
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
| `domainId`         | *String*           | :heavy_check_mark: | N/A                |
| `recordId`         | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DeleteDnsDomainRecordResponse>](../../models/operations/DeleteDnsDomainRecordResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDnsDomainZoneFile

Retrieve DNS domain zone file

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetDnsDomainZoneFileRequest;
import com.exoscale.api.models.operations.GetDnsDomainZoneFileResponse;
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

            GetDnsDomainZoneFileResponse res = sdk.dns().getDnsDomainZoneFile()
                .id("094eecd8-f8ef-4036-80ea-1810ce7343f4")
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

**[Optional<? extends com.exoscale.api.models.operations.GetDnsDomainZoneFileResponse>](../../models/operations/GetDnsDomainZoneFileResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteDnsDomain

Delete DNS Domain

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteDnsDomainRequest;
import com.exoscale.api.models.operations.DeleteDnsDomainResponse;
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

            DeleteDnsDomainResponse res = sdk.dns().deleteDnsDomain()
                .id("a1bc7298-f9a8-4fd7-9938-6c10d85bae75")
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

**[Optional<? extends com.exoscale.api.models.operations.DeleteDnsDomainResponse>](../../models/operations/DeleteDnsDomainResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDnsDomain

Retrieve DNS domain details

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetDnsDomainRequest;
import com.exoscale.api.models.operations.GetDnsDomainResponse;
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

            GetDnsDomainResponse res = sdk.dns().getDnsDomain()
                .id("7aa289b0-6042-468c-a97e-30e0f6e7afa8")
                .call();

            if (res.dnsDomain().isPresent()) {
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

**[Optional<? extends com.exoscale.api.models.operations.GetDnsDomainResponse>](../../models/operations/GetDnsDomainResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
