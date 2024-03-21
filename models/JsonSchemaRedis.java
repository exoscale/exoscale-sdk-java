package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JsonSchemaRedis implements AdditionalDataHolder, Parsable {
    /**
     * Determines default pub/sub channels' ACL for new users if ACL is not supplied. When this option is not defined, all_channels is assumed to keep backward compatibility. This option doesn't affect Redis configuration acl-pubsub-default.
     */
    private JsonSchemaRedisAclChannelsDefault aclChannelsDefault;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Set Redis IO thread count. Changing this will cause a restart of the Redis service.
     */
    private Integer ioThreads;
    /**
     * The lfu_decay_time property
     */
    private Integer lfuDecayTime;
    /**
     * The lfu_log_factor property
     */
    private Integer lfuLogFactor;
    /**
     * The maxmemory_policy property
     */
    private JsonSchemaRedisMaxmemoryPolicy maxmemoryPolicy;
    /**
     * The notify_keyspace_events property
     */
    private String notifyKeyspaceEvents;
    /**
     * Set number of Redis databases. Changing this will cause a restart of the Redis service.
     */
    private Integer numberOfDatabases;
    /**
     * When persistence is 'rdb', Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is 'off', no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can't be forked.
     */
    private JsonSchemaRedisPersistence persistence;
    /**
     * Set output buffer limit for pub / sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
     */
    private Integer pubsubClientOutputBufferLimit;
    /**
     * The ssl property
     */
    private Boolean ssl;
    /**
     * The timeout property
     */
    private Integer timeout;
    /**
     * Instantiates a new JsonSchemaRedis and sets the default values.
     */
    public JsonSchemaRedis() {
        this.setAdditionalData(new HashMap<>());
        this.setMaxmemoryPolicy(JsonSchemaRedisMaxmemoryPolicy.forValue("noeviction"));
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JsonSchemaRedis
     */
    @jakarta.annotation.Nonnull
    public static JsonSchemaRedis createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JsonSchemaRedis();
    }
    /**
     * Gets the acl_channels_default property value. Determines default pub/sub channels' ACL for new users if ACL is not supplied. When this option is not defined, all_channels is assumed to keep backward compatibility. This option doesn't affect Redis configuration acl-pubsub-default.
     * @return a JsonSchemaRedisAclChannelsDefault
     */
    @jakarta.annotation.Nullable
    public JsonSchemaRedisAclChannelsDefault getAclChannelsDefault() {
        return this.aclChannelsDefault;
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("acl_channels_default", (n) -> { this.setAclChannelsDefault(n.getEnumValue(JsonSchemaRedisAclChannelsDefault::forValue)); });
        deserializerMap.put("io_threads", (n) -> { this.setIoThreads(n.getIntegerValue()); });
        deserializerMap.put("lfu_decay_time", (n) -> { this.setLfuDecayTime(n.getIntegerValue()); });
        deserializerMap.put("lfu_log_factor", (n) -> { this.setLfuLogFactor(n.getIntegerValue()); });
        deserializerMap.put("maxmemory_policy", (n) -> { this.setMaxmemoryPolicy(n.getEnumValue(JsonSchemaRedisMaxmemoryPolicy::forValue)); });
        deserializerMap.put("notify_keyspace_events", (n) -> { this.setNotifyKeyspaceEvents(n.getStringValue()); });
        deserializerMap.put("number_of_databases", (n) -> { this.setNumberOfDatabases(n.getIntegerValue()); });
        deserializerMap.put("persistence", (n) -> { this.setPersistence(n.getEnumValue(JsonSchemaRedisPersistence::forValue)); });
        deserializerMap.put("pubsub_client_output_buffer_limit", (n) -> { this.setPubsubClientOutputBufferLimit(n.getIntegerValue()); });
        deserializerMap.put("ssl", (n) -> { this.setSsl(n.getBooleanValue()); });
        deserializerMap.put("timeout", (n) -> { this.setTimeout(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the io_threads property value. Set Redis IO thread count. Changing this will cause a restart of the Redis service.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIoThreads() {
        return this.ioThreads;
    }
    /**
     * Gets the lfu_decay_time property value. The lfu_decay_time property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLfuDecayTime() {
        return this.lfuDecayTime;
    }
    /**
     * Gets the lfu_log_factor property value. The lfu_log_factor property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLfuLogFactor() {
        return this.lfuLogFactor;
    }
    /**
     * Gets the maxmemory_policy property value. The maxmemory_policy property
     * @return a JsonSchemaRedisMaxmemoryPolicy
     */
    @jakarta.annotation.Nullable
    public JsonSchemaRedisMaxmemoryPolicy getMaxmemoryPolicy() {
        return this.maxmemoryPolicy;
    }
    /**
     * Gets the notify_keyspace_events property value. The notify_keyspace_events property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNotifyKeyspaceEvents() {
        return this.notifyKeyspaceEvents;
    }
    /**
     * Gets the number_of_databases property value. Set number of Redis databases. Changing this will cause a restart of the Redis service.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfDatabases() {
        return this.numberOfDatabases;
    }
    /**
     * Gets the persistence property value. When persistence is 'rdb', Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is 'off', no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can't be forked.
     * @return a JsonSchemaRedisPersistence
     */
    @jakarta.annotation.Nullable
    public JsonSchemaRedisPersistence getPersistence() {
        return this.persistence;
    }
    /**
     * Gets the pubsub_client_output_buffer_limit property value. Set output buffer limit for pub / sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPubsubClientOutputBufferLimit() {
        return this.pubsubClientOutputBufferLimit;
    }
    /**
     * Gets the ssl property value. The ssl property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSsl() {
        return this.ssl;
    }
    /**
     * Gets the timeout property value. The timeout property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTimeout() {
        return this.timeout;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("acl_channels_default", this.getAclChannelsDefault());
        writer.writeIntegerValue("io_threads", this.getIoThreads());
        writer.writeIntegerValue("lfu_decay_time", this.getLfuDecayTime());
        writer.writeIntegerValue("lfu_log_factor", this.getLfuLogFactor());
        writer.writeEnumValue("maxmemory_policy", this.getMaxmemoryPolicy());
        writer.writeStringValue("notify_keyspace_events", this.getNotifyKeyspaceEvents());
        writer.writeIntegerValue("number_of_databases", this.getNumberOfDatabases());
        writer.writeEnumValue("persistence", this.getPersistence());
        writer.writeIntegerValue("pubsub_client_output_buffer_limit", this.getPubsubClientOutputBufferLimit());
        writer.writeBooleanValue("ssl", this.getSsl());
        writer.writeIntegerValue("timeout", this.getTimeout());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the acl_channels_default property value. Determines default pub/sub channels' ACL for new users if ACL is not supplied. When this option is not defined, all_channels is assumed to keep backward compatibility. This option doesn't affect Redis configuration acl-pubsub-default.
     * @param value Value to set for the acl_channels_default property.
     */
    public void setAclChannelsDefault(@jakarta.annotation.Nullable final JsonSchemaRedisAclChannelsDefault value) {
        this.aclChannelsDefault = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the io_threads property value. Set Redis IO thread count. Changing this will cause a restart of the Redis service.
     * @param value Value to set for the io_threads property.
     */
    public void setIoThreads(@jakarta.annotation.Nullable final Integer value) {
        this.ioThreads = value;
    }
    /**
     * Sets the lfu_decay_time property value. The lfu_decay_time property
     * @param value Value to set for the lfu_decay_time property.
     */
    public void setLfuDecayTime(@jakarta.annotation.Nullable final Integer value) {
        this.lfuDecayTime = value;
    }
    /**
     * Sets the lfu_log_factor property value. The lfu_log_factor property
     * @param value Value to set for the lfu_log_factor property.
     */
    public void setLfuLogFactor(@jakarta.annotation.Nullable final Integer value) {
        this.lfuLogFactor = value;
    }
    /**
     * Sets the maxmemory_policy property value. The maxmemory_policy property
     * @param value Value to set for the maxmemory_policy property.
     */
    public void setMaxmemoryPolicy(@jakarta.annotation.Nullable final JsonSchemaRedisMaxmemoryPolicy value) {
        this.maxmemoryPolicy = value;
    }
    /**
     * Sets the notify_keyspace_events property value. The notify_keyspace_events property
     * @param value Value to set for the notify_keyspace_events property.
     */
    public void setNotifyKeyspaceEvents(@jakarta.annotation.Nullable final String value) {
        this.notifyKeyspaceEvents = value;
    }
    /**
     * Sets the number_of_databases property value. Set number of Redis databases. Changing this will cause a restart of the Redis service.
     * @param value Value to set for the number_of_databases property.
     */
    public void setNumberOfDatabases(@jakarta.annotation.Nullable final Integer value) {
        this.numberOfDatabases = value;
    }
    /**
     * Sets the persistence property value. When persistence is 'rdb', Redis does RDB dumps each 10 minutes if any key is changed. Also RDB dumps are done according to backup schedule for backup purposes. When persistence is 'off', no RDB dumps and backups are done, so data can be lost at any moment if service is restarted for any reason, or if service is powered off. Also service can't be forked.
     * @param value Value to set for the persistence property.
     */
    public void setPersistence(@jakarta.annotation.Nullable final JsonSchemaRedisPersistence value) {
        this.persistence = value;
    }
    /**
     * Sets the pubsub_client_output_buffer_limit property value. Set output buffer limit for pub / sub clients in MB. The value is the hard limit, the soft limit is 1/4 of the hard limit. When setting the limit, be mindful of the available memory in the selected service plan.
     * @param value Value to set for the pubsub_client_output_buffer_limit property.
     */
    public void setPubsubClientOutputBufferLimit(@jakarta.annotation.Nullable final Integer value) {
        this.pubsubClientOutputBufferLimit = value;
    }
    /**
     * Sets the ssl property value. The ssl property
     * @param value Value to set for the ssl property.
     */
    public void setSsl(@jakarta.annotation.Nullable final Boolean value) {
        this.ssl = value;
    }
    /**
     * Sets the timeout property value. The timeout property
     * @param value Value to set for the timeout property.
     */
    public void setTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.timeout = value;
    }
}
