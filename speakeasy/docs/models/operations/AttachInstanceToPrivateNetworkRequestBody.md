# AttachInstanceToPrivateNetworkRequestBody


## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `ip`                                                                               | *Optional<? extends String>*                                                       | :heavy_minus_sign:                                                                 | Static IP address lease for the corresponding network interface                    |
| `instance`                                                                         | [com.exoscale.api.models.operations.Instance](../../models/operations/Instance.md) | :heavy_check_mark:                                                                 | Compute instance                                                                   |