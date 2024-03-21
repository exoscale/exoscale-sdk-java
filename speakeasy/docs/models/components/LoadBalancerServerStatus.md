# LoadBalancerServerStatus

Load Balancer Service status


## Fields

| Field                                                                                              | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `publicIp`                                                                                         | *Optional<? extends String>*                                                                       | :heavy_minus_sign:                                                                                 | Backend server public IP                                                                           |
| `status`                                                                                           | [Optional<? extends com.exoscale.api.models.components.Status>](../../models/components/Status.md) | :heavy_minus_sign:                                                                                 | Status of the instance's healthcheck                                                               |