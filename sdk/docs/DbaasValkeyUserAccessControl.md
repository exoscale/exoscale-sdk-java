

# DbaasValkeyUserAccessControl


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**categories** | **List&lt;String&gt;** | Use +@&lt;category&gt; to allow and -@&lt;category&gt; to disallow. Separate entries with a single space. Example: +@all -@dangerous. |  [optional] |
|**channels** | **List&lt;String&gt;** | Patterns use standard glob syntax and must be separated by a single space. Example: ~* &amp;events. |  [optional] |
|**commands** | **List&lt;String&gt;** | Use +&lt;command&gt; to allow and -&lt;command&gt; to disallow. You can also use @&lt;category&gt;. Separate entries with a single space. Example: +@all -flushall. |  [optional] |
|**keys** | **List&lt;String&gt;** | Patterns use standard glob syntax and must be separated by a single space. Example: cache:* session:*. |  [optional] |



