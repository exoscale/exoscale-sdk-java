

# UpdateDbaasServiceMysqlRequestMigration

Migrate data from existing server

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**host** | **String** | Hostname or IP address of the server where to migrate data from |  |
|**port** | **Long** | Port number of the server where to migrate data from |  |
|**password** | **String** | Password for authentication with the server where to migrate data from |  [optional] |
|**ssl** | **Boolean** | The server where to migrate data from is secured with SSL |  [optional] |
|**username** | **String** | User name for authentication with the server where to migrate data from |  [optional] |
|**dbname** | **String** | Database name for bootstrapping the initial connection |  [optional] |
|**ignoreDbs** | **String** | Comma-separated list of databases, which should be ignored during migration (supported by MySQL only at the moment) |  [optional] |
|**method** | **EnumMigrationMethod** |  |  [optional] |



