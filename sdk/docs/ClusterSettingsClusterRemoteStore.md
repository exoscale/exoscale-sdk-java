

# ClusterSettingsClusterRemoteStore


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**stateGlobalMetadataUploadTimeout** | **String** | The amount of time to wait for the cluster state upload to complete. Defaults to 20s. |  [optional] |
|**stateMetadataManifestUploadTimeout** | **String** | The amount of time to wait for the manifest file upload to complete. The manifest file contains the details of each of the files uploaded for a single cluster state, both index metadata files and global metadata files. Defaults to 20s. |  [optional] |
|**translogBufferInterval** | **String** | The default value of the translog buffer interval used when performing periodic translog updates. This setting is only effective when the index setting &#x60;index.remote_store.translog.buffer_interval&#x60; is not present. Defaults to 650ms. |  [optional] |
|**translogMaxReaders** | **Integer** | Sets the maximum number of open translog files for remote-backed indexes. This limits the total number of translog files per shard. After reaching this limit, the remote store flushes the translog files. Default is 1000. The minimum required is 100. |  [optional] |



