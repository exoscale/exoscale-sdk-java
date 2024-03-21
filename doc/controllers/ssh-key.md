# Ssh-Key

```java
SshKeyController sshKeyController = client.getSshKeyController();
```

## Class Name

`SshKeyController`

## Methods

* [Delete-Ssh-Key](../../doc/controllers/ssh-key.md#delete-ssh-key)
* [Get-Ssh-Key](../../doc/controllers/ssh-key.md#get-ssh-key)
* [List-Ssh-Keys](../../doc/controllers/ssh-key.md#list-ssh-keys)
* [Register-Ssh-Key](../../doc/controllers/ssh-key.md#register-ssh-key)


# Delete-Ssh-Key

```java
CompletableFuture<Operation> deleteSshKeyAsync(
    final String name)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Template, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
String name = "name0";

sshKeyController.deleteSshKeyAsync(name).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get-Ssh-Key

```java
CompletableFuture<SshKey> getSshKeyAsync(
    final String name)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Template, Required | - |

## Response Type

[`SshKey`](../../doc/models/ssh-key.md)

## Example Usage

```java
String name = "name0";

sshKeyController.getSshKeyAsync(name).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# List-Ssh-Keys

```java
CompletableFuture<SshKeyResponse> listSshKeysAsync()
```

## Response Type

[`SshKeyResponse`](../../doc/models/ssh-key-response.md)

## Example Usage

```java
sshKeyController.listSshKeysAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Register-Ssh-Key

```java
CompletableFuture<Operation> registerSshKeyAsync(
    final SshKeyRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`SshKeyRequest`](../../doc/models/ssh-key-request.md) | Body, Required | - |

## Response Type

[`Operation`](../../doc/models/operation.md)

## Example Usage

```java
SshKeyRequest body = new SshKeyRequest.Builder(
    "name6",
    "public-key2"
)
.build();

sshKeyController.registerSshKeyAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

