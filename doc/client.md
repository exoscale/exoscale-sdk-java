
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `zone` | `ZoneNameEnum` | *Default*: `ZoneNameEnum.CHGVA2` |
| `environment` | `Environment` | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) | Http Client Configuration instance. |

The API client can be initialized as follows:

```java
ExoscalePublicAPIClient client = new ExoscalePublicAPIClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .environment(Environment.PRODUCTION)
    .zone(ZoneNameEnum.CHGVA2)
    .build();
```

## Exoscale Public APIClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getNetworkLoadBalancerController()` | Provides access to NetworkLoadBalancer controller. | `NetworkLoadBalancerController` |
| `getEventController()` | Provides access to Event controller. | `EventController` |
| `getBlockStorageController()` | Provides access to BlockStorage controller. | `BlockStorageController` |
| `getSksController()` | Provides access to Sks controller. | `SksController` |
| `getDbaasController()` | Provides access to Dbaas controller. | `DbaasController` |
| `getInstancePoolController()` | Provides access to InstancePool controller. | `InstancePoolController` |
| `getInstanceController()` | Provides access to Instance controller. | `InstanceController` |
| `getReverseDnsController()` | Provides access to ReverseDns controller. | `ReverseDnsController` |
| `getAntiAffinityGroupController()` | Provides access to AntiAffinityGroup controller. | `AntiAffinityGroupController` |
| `getSecurityGroupController()` | Provides access to SecurityGroup controller. | `SecurityGroupController` |
| `getIamController()` | Provides access to Iam controller. | `IamController` |
| `getPrivateNetworkController()` | Provides access to PrivateNetwork controller. | `PrivateNetworkController` |
| `getInstanceTypeController()` | Provides access to InstanceType controller. | `InstanceTypeController` |
| `getElasticIpController()` | Provides access to ElasticIp controller. | `ElasticIpController` |
| `getZoneController()` | Provides access to Zone controller. | `ZoneController` |
| `getDnsController()` | Provides access to Dns controller. | `DnsController` |
| `getDeployTargetController()` | Provides access to DeployTarget controller. | `DeployTargetController` |
| `getSnapshotController()` | Provides access to Snapshot controller. | `SnapshotController` |
| `getQuotasController()` | Provides access to Quotas controller. | `QuotasController` |
| `getOperationController()` | Provides access to Operation controller. | `OperationController` |
| `getTemplateController()` | Provides access to Template controller. | `TemplateController` |
| `getSosController()` | Provides access to Sos controller. | `SosController` |
| `getSshKeyController()` | Provides access to SshKey controller. | `SshKeyController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getZone()` | zone value. | `ZoneNameEnum` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

