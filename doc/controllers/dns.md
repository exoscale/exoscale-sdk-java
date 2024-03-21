# Dns

```java
DnsController dnsController = client.getDnsController();
```

## Class Name

`DnsController`

## Methods

* [List-Dns-Domain-Records](../../doc/controllers/dns.md#list-dns-domain-records)
* [Create-Dns-Domain-Record](../../doc/controllers/dns.md#create-dns-domain-record)
* [List-Dns-Domains](../../doc/controllers/dns.md#list-dns-domains)
* [Create-Dns-Domain](../../doc/controllers/dns.md#create-dns-domain)
* [Get-Dns-Domain-Record](../../doc/controllers/dns.md#get-dns-domain-record)
* [Update-Dns-Domain-Record](../../doc/controllers/dns.md#update-dns-domain-record)
* [Delete-Dns-Domain-Record](../../doc/controllers/dns.md#delete-dns-domain-record)
* [Get-Dns-Domain-Zone-File](../../doc/controllers/dns.md#get-dns-domain-zone-file)
* [Delete-Dns-Domain](../../doc/controllers/dns.md#delete-dns-domain)
* [Get-Dns-Domain](../../doc/controllers/dns.md#get-dns-domain)


# List-Dns-Domain-Records

```java
CompletableFuture<DnsDomainRecordResponse> listDnsDomainRecordsAsync(
    final UUID domainId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `domainId` | `UUID` | Template, Required | - |

## Response Type

[`DnsDomainRecordResponse`](../../doc/models/dns-domain-record-response.md)

## Example Usage

```java
UUID domainId = UUID.fromString("000015c0-0000-0000-0000-000000000000");

dnsController.listDnsDomainRecordsAsync(domainId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Create-Dns-Domain-Record

```java
CompletableFuture<Operation> createDnsDomainRecordAsync(
    final UUID domainId,
    final DnsDomainRecordRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `domainId` | `UUID` | Template, Required | - |
| `body` | [`DnsDomainRecordRequest`](../../doc/models/dns-domain-record-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID domainId = UUID.fromString("000015c0-0000-0000-0000-000000000000");
DnsDomainRecordRequest body = new DnsDomainRecordRequest.Builder(
    "name6",
    Type6Enum.A,
    "content0"
)
.build();

dnsController.createDnsDomainRecordAsync(domainId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# List-Dns-Domains

```java
CompletableFuture<DnsDomainResponse> listDnsDomainsAsync()
```

## Response Type

[`DnsDomainResponse`](../../doc/models/dns-domain-response.md)

## Example Usage

```java
dnsController.listDnsDomainsAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Create-Dns-Domain

```java
CompletableFuture<DnsDomain> createDnsDomainAsync(
    final DnsDomainRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`DnsDomainRequest`](../../doc/models/dns-domain-request.md) | Body, Required | - |

## Response Type

[`DnsDomain`](../../doc/models/dns-domain.md)

## Example Usage

```java
DnsDomainRequest body = new DnsDomainRequest.Builder()
    .build();

dnsController.createDnsDomainAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Dns-Domain-Record

```java
CompletableFuture<DnsDomainRecord> getDnsDomainRecordAsync(
    final UUID domainId,
    final UUID recordId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `domainId` | `UUID` | Template, Required | - |
| `recordId` | `UUID` | Template, Required | - |

## Response Type

[`DnsDomainRecord`](../../doc/models/dns-domain-record.md)

## Example Usage

```java
UUID domainId = UUID.fromString("000015c0-0000-0000-0000-000000000000");
UUID recordId = UUID.fromString("000019b2-0000-0000-0000-000000000000");

dnsController.getDnsDomainRecordAsync(domainId, recordId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update-Dns-Domain-Record

```java
CompletableFuture<Operation> updateDnsDomainRecordAsync(
    final UUID domainId,
    final UUID recordId,
    final DnsDomainRecordRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `domainId` | `UUID` | Template, Required | - |
| `recordId` | `UUID` | Template, Required | - |
| `body` | [`DnsDomainRecordRequest1`](../../doc/models/dns-domain-record-request-1.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID domainId = UUID.fromString("000015c0-0000-0000-0000-000000000000");
UUID recordId = UUID.fromString("000019b2-0000-0000-0000-000000000000");
DnsDomainRecordRequest1 body = new DnsDomainRecordRequest1.Builder()
    .build();

dnsController.updateDnsDomainRecordAsync(domainId, recordId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Delete-Dns-Domain-Record

```java
CompletableFuture<Operation> deleteDnsDomainRecordAsync(
    final UUID domainId,
    final UUID recordId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `domainId` | `UUID` | Template, Required | - |
| `recordId` | `UUID` | Template, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID domainId = UUID.fromString("000015c0-0000-0000-0000-000000000000");
UUID recordId = UUID.fromString("000019b2-0000-0000-0000-000000000000");

dnsController.deleteDnsDomainRecordAsync(domainId, recordId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Dns-Domain-Zone-File

```java
CompletableFuture<DnsDomainZoneResponse> getDnsDomainZoneFileAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

[`DnsDomainZoneResponse`](../../doc/models/dns-domain-zone-response.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

dnsController.getDnsDomainZoneFileAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Delete-Dns-Domain

```java
CompletableFuture<Operation> deleteDnsDomainAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

dnsController.deleteDnsDomainAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Dns-Domain

```java
CompletableFuture<DnsDomain> getDnsDomainAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

[`DnsDomain`](../../doc/models/dns-domain.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

dnsController.getDnsDomainAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

