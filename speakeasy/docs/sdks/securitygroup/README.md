# SecurityGroup
(*securityGroup()*)

### Available Operations

* [deleteRuleFromSecurityGroup](#deleterulefromsecuritygroup) - Delete a Security Group rule
* [createSecurityGroup](#createsecuritygroup) - Create a Security Group
* [listSecurityGroups](#listsecuritygroups) - List Security Groups.
* [getSecurityGroup](#getsecuritygroup) - Retrieve Security Group details
* [deleteSecurityGroup](#deletesecuritygroup) - Delete a Security Group
* [attachInstanceToSecurityGroup](#attachinstancetosecuritygroup) - Attach a Compute instance to a Security Group
* [addRuleToSecurityGroup](#addruletosecuritygroup) - Create a Security Group rule
* [removeExternalSourceFromSecurityGroup](#removeexternalsourcefromsecuritygroup) - Remove an external source from a Security Group
* [detachInstanceFromSecurityGroup](#detachinstancefromsecuritygroup) - Detach a Compute instance from a Security Group
* [addExternalSourceToSecurityGroup](#addexternalsourcetosecuritygroup) - Add an external source as a member of a Security Group

## deleteRuleFromSecurityGroup

Delete a Security Group rule

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteRuleFromSecurityGroupRequest;
import com.exoscale.api.models.operations.DeleteRuleFromSecurityGroupResponse;
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

            DeleteRuleFromSecurityGroupResponse res = sdk.securityGroup().deleteRuleFromSecurityGroup()
                .id("8a03a2ac-b64b-46ba-b787-fcb7e9eba307")
                .ruleId("ea8bce72-e2ab-4a56-89cc-9e7159b3263c")
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
| `ruleId`           | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DeleteRuleFromSecurityGroupResponse>](../../models/operations/DeleteRuleFromSecurityGroupResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createSecurityGroup

Create a Security Group

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.CreateSecurityGroupRequestBody;
import com.exoscale.api.models.operations.CreateSecurityGroupResponse;
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

            CreateSecurityGroupRequestBody req = CreateSecurityGroupRequestBody.builder()
                .name("<value>")
                .description("Total client-server conglomeration")
                .build();

            CreateSecurityGroupResponse res = sdk.securityGroup().createSecurityGroup()
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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.exoscale.api.models.operations.CreateSecurityGroupRequestBody](../../models/operations/CreateSecurityGroupRequestBody.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[Optional<? extends com.exoscale.api.models.operations.CreateSecurityGroupResponse>](../../models/operations/CreateSecurityGroupResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listSecurityGroups

Lists security groups. When visibility is set to public, lists public security groups.
Public security groups are objects maintained by Exoscale which contain source addresses for
relevant services hosted by Exoscale. They can be used a source in ingress rules and as a destination
in egress rules.

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.ListSecurityGroupsRequest;
import com.exoscale.api.models.operations.ListSecurityGroupsResponse;
import com.exoscale.api.models.operations.Visibility;
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

            ListSecurityGroupsResponse res = sdk.securityGroup().listSecurityGroups()
                .visibility(Visibility.PRIVATE_)
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

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `visibility`                                                                                               | [Optional<? extends com.exoscale.api.models.operations.Visibility>](../../models/operations/Visibility.md) | :heavy_minus_sign:                                                                                         | N/A                                                                                                        |


### Response

**[Optional<? extends com.exoscale.api.models.operations.ListSecurityGroupsResponse>](../../models/operations/ListSecurityGroupsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getSecurityGroup

Retrieve Security Group details

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.GetSecurityGroupRequest;
import com.exoscale.api.models.operations.GetSecurityGroupResponse;
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

            GetSecurityGroupResponse res = sdk.securityGroup().getSecurityGroup()
                .id("6f817c22-ca58-4301-9cd3-3f21cad9fe4e")
                .call();

            if (res.securityGroup().isPresent()) {
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

**[Optional<? extends com.exoscale.api.models.operations.GetSecurityGroupResponse>](../../models/operations/GetSecurityGroupResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteSecurityGroup

Delete a Security Group

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DeleteSecurityGroupRequest;
import com.exoscale.api.models.operations.DeleteSecurityGroupResponse;
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

            DeleteSecurityGroupResponse res = sdk.securityGroup().deleteSecurityGroup()
                .id("88fb7de4-04ff-40fe-a226-1b8364a1b9e3")
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

**[Optional<? extends com.exoscale.api.models.operations.DeleteSecurityGroupResponse>](../../models/operations/DeleteSecurityGroupResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## attachInstanceToSecurityGroup

Attach a Compute instance to a Security Group

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.AntiAffinityGroupInput;
import com.exoscale.api.models.components.BootMode;
import com.exoscale.api.models.components.DeployTarget;
import com.exoscale.api.models.components.DeployTargetType;
import com.exoscale.api.models.components.ElasticIpHealthcheck;
import com.exoscale.api.models.components.ElasticIpHealthcheckMode;
import com.exoscale.api.models.components.ElasticIpInput;
import com.exoscale.api.models.components.Export;
import com.exoscale.api.models.components.FlowDirection;
import com.exoscale.api.models.components.Icmp;
import com.exoscale.api.models.components.Instance;
import com.exoscale.api.models.components.InstanceInput;
import com.exoscale.api.models.components.InstanceState;
import com.exoscale.api.models.components.InstanceTypeInput;
import com.exoscale.api.models.components.Manager;
import com.exoscale.api.models.components.PrivateNetworkInput;
import com.exoscale.api.models.components.PublicIpAssignment;
import com.exoscale.api.models.components.SecurityGroupInput;
import com.exoscale.api.models.components.SecurityGroupResource;
import com.exoscale.api.models.components.SecurityGroupResourceVisibility;
import com.exoscale.api.models.components.SecurityGroupRule;
import com.exoscale.api.models.components.SecurityGroupRuleProtocol;
import com.exoscale.api.models.components.SnapshotInput;
import com.exoscale.api.models.components.SnapshotState;
import com.exoscale.api.models.components.SshKeyInput;
import com.exoscale.api.models.components.TemplateInput;
import com.exoscale.api.models.components.Type;
import com.exoscale.api.models.components.ZoneName;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.AttachInstanceToSecurityGroupRequest;
import com.exoscale.api.models.operations.AttachInstanceToSecurityGroupRequestBody;
import com.exoscale.api.models.operations.AttachInstanceToSecurityGroupResponse;
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

            AttachInstanceToSecurityGroupResponse res = sdk.securityGroup().attachInstanceToSecurityGroup()
                .id("43b12fe0-7907-4bf2-84b0-c0ba6ef56f2f")
                .requestBody(AttachInstanceToSecurityGroupRequestBody.builder()
                    .instance(InstanceInput.builder()
                            .antiAffinityGroups(java.util.List.of(
                                AntiAffinityGroupInput.builder()
                                    .build()))
                            .publicIpAssignment(PublicIpAssignment.INET4)
                            .labels(java.util.Map.ofEntries(
                                entry("key", "<value>")))
                            .securityGroups(java.util.List.of(
                                SecurityGroupInput.builder()
                                    .build()))
                            .elasticIps(java.util.List.of(
                                ElasticIpInput.builder()
                                    .build()))
                            .name("<value>")
                            .instanceType(InstanceTypeInput.builder()
                                .build())
                            .privateNetworks(java.util.List.of(
                                PrivateNetworkInput.builder()
                                    .build()))
                            .template(TemplateInput.builder()
                                .description("Optional analyzing matrix")
                                .sshKeyEnabled(false)
                                .name("<value>")
                                .defaultUser("<value>")
                                .size(518311L)
                                .passwordEnabled(false)
                                .checksum("<value>")
                                .bootMode(BootMode.LEGACY)
                                .zones(java.util.List.of(
                                    ZoneName.CH_GVA2))
                                .url("http://adolescent-fedora.info")
                                .build())
                            .state(InstanceState.MIGRATING)
                            .sshKey(SshKeyInput.builder()
                                .name("<value>")
                                .build())
                            .userData("<value>")
                            .manager(Manager.builder()
                                .id("7dc2b4a0-d43a-45e3-b279-d0a4e6e81fd9")
                                .type(Type.SKS_NODEPOOL)
                                .build())
                            .deployTarget(DeployTarget.builder()
                                .id("89eaaec2-c179-4f26-91e2-9001f60fadce")
                                .name("<value>")
                                .type(DeployTargetType.DEDICATED)
                                .description("Expanded secondary encoding")
                                .build())
                            .snapshots(java.util.List.of(
                                SnapshotInput.builder()
                                    .build()))
                            .diskSize(898474L)
                            .sshKeys(java.util.List.of(
                                SshKeyInput.builder()
                                    .build()))
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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                               | *String*                                                                                                                                           | :heavy_check_mark:                                                                                                                                 | N/A                                                                                                                                                |
| `requestBody`                                                                                                                                      | [com.exoscale.api.models.operations.AttachInstanceToSecurityGroupRequestBody](../../models/operations/AttachInstanceToSecurityGroupRequestBody.md) | :heavy_check_mark:                                                                                                                                 | N/A                                                                                                                                                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.AttachInstanceToSecurityGroupResponse>](../../models/operations/AttachInstanceToSecurityGroupResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## addRuleToSecurityGroup

Create a Security Group rule

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.SecurityGroupResource;
import com.exoscale.api.models.components.SecurityGroupResourceVisibility;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.AddRuleToSecurityGroupProtocol;
import com.exoscale.api.models.operations.AddRuleToSecurityGroupRequest;
import com.exoscale.api.models.operations.AddRuleToSecurityGroupRequestBody;
import com.exoscale.api.models.operations.AddRuleToSecurityGroupResponse;
import com.exoscale.api.models.operations.FlowDirection;
import com.exoscale.api.models.operations.Icmp;
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

            AddRuleToSecurityGroupResponse res = sdk.securityGroup().addRuleToSecurityGroup()
                .id("e06561fa-9095-4099-bc8c-3c1358cdca98")
                .requestBody(AddRuleToSecurityGroupRequestBody.builder()
                    .flowDirection(FlowDirection.EGRESS)
                    .protocol(AddRuleToSecurityGroupProtocol.UDP)
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

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                                                 | *String*                                                                                                                             | :heavy_check_mark:                                                                                                                   | N/A                                                                                                                                  |
| `requestBody`                                                                                                                        | [com.exoscale.api.models.operations.AddRuleToSecurityGroupRequestBody](../../models/operations/AddRuleToSecurityGroupRequestBody.md) | :heavy_check_mark:                                                                                                                   | N/A                                                                                                                                  |


### Response

**[Optional<? extends com.exoscale.api.models.operations.AddRuleToSecurityGroupResponse>](../../models/operations/AddRuleToSecurityGroupResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## removeExternalSourceFromSecurityGroup

Remove an external source from a Security Group

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.RemoveExternalSourceFromSecurityGroupRequest;
import com.exoscale.api.models.operations.RemoveExternalSourceFromSecurityGroupRequestBody;
import com.exoscale.api.models.operations.RemoveExternalSourceFromSecurityGroupResponse;
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

            RemoveExternalSourceFromSecurityGroupResponse res = sdk.securityGroup().removeExternalSourceFromSecurityGroup()
                .id("c157660c-3226-4a14-8d16-1604cabba514")
                .requestBody(RemoveExternalSourceFromSecurityGroupRequestBody.builder()
                    .cidr("<value>")
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

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                                                                               | *String*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | N/A                                                                                                                                                                |
| `requestBody`                                                                                                                                                      | [com.exoscale.api.models.operations.RemoveExternalSourceFromSecurityGroupRequestBody](../../models/operations/RemoveExternalSourceFromSecurityGroupRequestBody.md) | :heavy_check_mark:                                                                                                                                                 | N/A                                                                                                                                                                |


### Response

**[Optional<? extends com.exoscale.api.models.operations.RemoveExternalSourceFromSecurityGroupResponse>](../../models/operations/RemoveExternalSourceFromSecurityGroupResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## detachInstanceFromSecurityGroup

Detach a Compute instance from a Security Group

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.components.AntiAffinityGroupInput;
import com.exoscale.api.models.components.BootMode;
import com.exoscale.api.models.components.DeployTarget;
import com.exoscale.api.models.components.DeployTargetType;
import com.exoscale.api.models.components.ElasticIpHealthcheck;
import com.exoscale.api.models.components.ElasticIpHealthcheckMode;
import com.exoscale.api.models.components.ElasticIpInput;
import com.exoscale.api.models.components.Export;
import com.exoscale.api.models.components.FlowDirection;
import com.exoscale.api.models.components.Icmp;
import com.exoscale.api.models.components.Instance;
import com.exoscale.api.models.components.InstanceInput;
import com.exoscale.api.models.components.InstanceState;
import com.exoscale.api.models.components.InstanceTypeInput;
import com.exoscale.api.models.components.Manager;
import com.exoscale.api.models.components.PrivateNetworkInput;
import com.exoscale.api.models.components.PublicIpAssignment;
import com.exoscale.api.models.components.SecurityGroupInput;
import com.exoscale.api.models.components.SecurityGroupResource;
import com.exoscale.api.models.components.SecurityGroupResourceVisibility;
import com.exoscale.api.models.components.SecurityGroupRule;
import com.exoscale.api.models.components.SecurityGroupRuleProtocol;
import com.exoscale.api.models.components.SnapshotInput;
import com.exoscale.api.models.components.SnapshotState;
import com.exoscale.api.models.components.SshKeyInput;
import com.exoscale.api.models.components.TemplateInput;
import com.exoscale.api.models.components.Type;
import com.exoscale.api.models.components.ZoneName;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.DetachInstanceFromSecurityGroupRequest;
import com.exoscale.api.models.operations.DetachInstanceFromSecurityGroupRequestBody;
import com.exoscale.api.models.operations.DetachInstanceFromSecurityGroupResponse;
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

            DetachInstanceFromSecurityGroupResponse res = sdk.securityGroup().detachInstanceFromSecurityGroup()
                .id("c7d68a2d-da10-404f-b4f7-93a3e2ca1524")
                .requestBody(DetachInstanceFromSecurityGroupRequestBody.builder()
                    .instance(InstanceInput.builder()
                            .antiAffinityGroups(java.util.List.of(
                                AntiAffinityGroupInput.builder()
                                    .build()))
                            .publicIpAssignment(PublicIpAssignment.NONE)
                            .labels(java.util.Map.ofEntries(
                                entry("key", "<value>")))
                            .securityGroups(java.util.List.of(
                                SecurityGroupInput.builder()
                                    .build()))
                            .elasticIps(java.util.List.of(
                                ElasticIpInput.builder()
                                    .build()))
                            .name("<value>")
                            .instanceType(InstanceTypeInput.builder()
                                .build())
                            .privateNetworks(java.util.List.of(
                                PrivateNetworkInput.builder()
                                    .build()))
                            .template(TemplateInput.builder()
                                .description("Grass-roots attitude-oriented monitoring")
                                .sshKeyEnabled(false)
                                .name("<value>")
                                .defaultUser("<value>")
                                .size(80702L)
                                .passwordEnabled(false)
                                .checksum("<value>")
                                .bootMode(BootMode.LEGACY)
                                .zones(java.util.List.of(
                                    ZoneName.BG_SOF1))
                                .url("http://untimely-blazer.name")
                                .build())
                            .state(InstanceState.DESTROYED)
                            .sshKey(SshKeyInput.builder()
                                .name("<value>")
                                .build())
                            .userData("<value>")
                            .manager(Manager.builder()
                                .id("edcf2088-9072-4549-8493-b31eb194e75a")
                                .type(Type.INSTANCE_POOL)
                                .build())
                            .deployTarget(DeployTarget.builder()
                                .id("36d89eaa-f16e-4bd7-af95-0b78eeae8657")
                                .name("<value>")
                                .type(DeployTargetType.EDGE)
                                .description("Persevering bifurcated model")
                                .build())
                            .snapshots(java.util.List.of(
                                SnapshotInput.builder()
                                    .build()))
                            .diskSize(514936L)
                            .sshKeys(java.util.List.of(
                                SshKeyInput.builder()
                                    .build()))
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

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                                                                   | *String*                                                                                                                                               | :heavy_check_mark:                                                                                                                                     | N/A                                                                                                                                                    |
| `requestBody`                                                                                                                                          | [com.exoscale.api.models.operations.DetachInstanceFromSecurityGroupRequestBody](../../models/operations/DetachInstanceFromSecurityGroupRequestBody.md) | :heavy_check_mark:                                                                                                                                     | N/A                                                                                                                                                    |


### Response

**[Optional<? extends com.exoscale.api.models.operations.DetachInstanceFromSecurityGroupResponse>](../../models/operations/DetachInstanceFromSecurityGroupResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## addExternalSourceToSecurityGroup

Add an external source as a member of a Security Group

### Example Usage

```java
package hello.world;

import com.exoscale.api.Exoscale;
import com.exoscale.api.models.components.*;
import com.exoscale.api.models.operations.*;
import com.exoscale.api.models.operations.AddExternalSourceToSecurityGroupRequest;
import com.exoscale.api.models.operations.AddExternalSourceToSecurityGroupRequestBody;
import com.exoscale.api.models.operations.AddExternalSourceToSecurityGroupResponse;
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

            AddExternalSourceToSecurityGroupResponse res = sdk.securityGroup().addExternalSourceToSecurityGroup()
                .id("25660087-a3ba-45a7-b81d-ea2cbfaa07e4")
                .requestBody(AddExternalSourceToSecurityGroupRequestBody.builder()
                    .cidr("<value>")
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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                     | *String*                                                                                                                                                 | :heavy_check_mark:                                                                                                                                       | N/A                                                                                                                                                      |
| `requestBody`                                                                                                                                            | [com.exoscale.api.models.operations.AddExternalSourceToSecurityGroupRequestBody](../../models/operations/AddExternalSourceToSecurityGroupRequestBody.md) | :heavy_check_mark:                                                                                                                                       | N/A                                                                                                                                                      |


### Response

**[Optional<? extends com.exoscale.api.models.operations.AddExternalSourceToSecurityGroupResponse>](../../models/operations/AddExternalSourceToSecurityGroupResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
