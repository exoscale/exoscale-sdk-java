

# UpdateSksNodepoolRequestVpc

Nodepool VPC: the Instances are attached to the given Subnets of the VPC, or none (`null` or `{}`) to detach them

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | VPC ID, required with &#x60;subnets&#x60; |  [optional] |
|**subnets** | [**Set&lt;VpcSubnetRef&gt;**](VpcSubnetRef.md) | VPC Subnets to attach the Instances to, required with &#x60;id&#x60; |  [optional] |



