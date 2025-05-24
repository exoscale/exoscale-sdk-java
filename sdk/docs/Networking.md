

# Networking

Cluster networking configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clusterCidr** | **String** | CIDR Range for Pods in cluster. This must not overlap with any IP ranges assigned to pods. Max of two, comma-separated, dual-stack CIDRs is allowed.               If not specified, defaults to 192.168.0.0/16. |  [optional] |
|**serviceClusterIpRange** | **String** | CIDR range for service cluster IPs. This must not overlap with any IP ranges assigned to nodes or pods. Max of two, comma-separated, dual-stack CIDRs is allowed.               If not specified, defaults to 10.96.0.0/12. |  [optional] |
|**nodeCidrMaskSizeIpv4** | **Long** | Mask size for node cidr in cluster. It must be larger than the Pod CIDR subnet mask. Defaults to 24 |  [optional] |
|**nodeCidrMaskSizeIpv6** | **Long** | Mask size for node cidr in cluster. It must be larger than the Pod CIDR subnet mask. Defaults to 64 |  [optional] |



