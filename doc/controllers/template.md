# Template

```java
TemplateController templateController = client.getTemplateController();
```

## Class Name

`TemplateController`

## Methods

* [Delete-Template](../../doc/controllers/template.md#delete-template)
* [Copy-Template](../../doc/controllers/template.md#copy-template)
* [Update-Template](../../doc/controllers/template.md#update-template)
* [Get-Template](../../doc/controllers/template.md#get-template)
* [List-Templates](../../doc/controllers/template.md#list-templates)
* [Register-Template](../../doc/controllers/template.md#register-template)


# Delete-Template

```java
CompletableFuture<Operation> deleteTemplateAsync(
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

templateController.deleteTemplateAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Copy-Template

```java
CompletableFuture<Operation> copyTemplateAsync(
    final UUID id,
    final TemplateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`TemplateRequest`](../../doc/models/template-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
TemplateRequest body = new TemplateRequest.Builder(
    new Zone.Builder()
        .build()
)
.build();

templateController.copyTemplateAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Update-Template

```java
CompletableFuture<Operation> updateTemplateAsync(
    final UUID id,
    final TemplateRequest1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |
| `body` | [`TemplateRequest1`](../../doc/models/template-request-1.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");
TemplateRequest1 body = new TemplateRequest1.Builder()
    .build();

templateController.updateTemplateAsync(id, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Template

```java
CompletableFuture<Template> getTemplateAsync(
    final UUID id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `UUID` | Template, Required | - |

## Response Type

[`Template`](../../doc/models/template.md)

## Example Usage

```java
UUID id = UUID.fromString("00001770-0000-0000-0000-000000000000");

templateController.getTemplateAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# List-Templates

```java
CompletableFuture<TemplateResponse> listTemplatesAsync(
    final Visibility2Enum visibility,
    final String family)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `visibility` | [`Visibility2Enum`](../../doc/models/visibility-2-enum.md) | Query, Optional | - |
| `family` | `String` | Query, Optional | - |

## Response Type

[`TemplateResponse`](../../doc/models/template-response.md)

## Example Usage

```java
templateController.listTemplatesAsync(null, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Register-Template

```java
CompletableFuture<Operation> registerTemplateAsync(
    final TemplateRequest2 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`TemplateRequest2`](../../doc/models/template-request-2.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
TemplateRequest2 body = new TemplateRequest2.Builder(
    false,
    "name6",
    false,
    "checksum8",
    "url0"
)
.build();

templateController.registerTemplateAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

