package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JsonSchemaKafkaLogCleanupAndCompaction implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * How long are delete records retained?
     */
    private Integer logCleanerDeleteRetentionMs;
    /**
     * The maximum amount of time message will remain uncompacted. Only applicable for logs that are being compacted
     */
    private Integer logCleanerMaxCompactionLagMs;
    /**
     * Controls log compactor frequency. Larger value means more frequent compactions but also more space wasted for logs. Consider setting log.cleaner.max.compaction.lag.ms to enforce compactions sooner, instead of setting a very high value for this option.
     */
    private Double logCleanerMinCleanableRatio;
    /**
     * The minimum time a message will remain uncompacted in the log. Only applicable for logs that are being compacted.
     */
    private Integer logCleanerMinCompactionLagMs;
    /**
     * The default cleanup policy for segments beyond the retention window
     */
    private JsonSchemaKafkaLogCleanupAndCompactionLogCleanupPolicy logCleanupPolicy;
    /**
     * Instantiates a new JsonSchemaKafkaLogCleanupAndCompaction and sets the default values.
     */
    public JsonSchemaKafkaLogCleanupAndCompaction() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JsonSchemaKafkaLogCleanupAndCompaction
     */
    @jakarta.annotation.Nonnull
    public static JsonSchemaKafkaLogCleanupAndCompaction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JsonSchemaKafkaLogCleanupAndCompaction();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("log_cleaner_delete_retention_ms", (n) -> { this.setLogCleanerDeleteRetentionMs(n.getIntegerValue()); });
        deserializerMap.put("log_cleaner_max_compaction_lag_ms", (n) -> { this.setLogCleanerMaxCompactionLagMs(n.getIntegerValue()); });
        deserializerMap.put("log_cleaner_min_cleanable_ratio", (n) -> { this.setLogCleanerMinCleanableRatio(n.getDoubleValue()); });
        deserializerMap.put("log_cleaner_min_compaction_lag_ms", (n) -> { this.setLogCleanerMinCompactionLagMs(n.getIntegerValue()); });
        deserializerMap.put("log_cleanup_policy", (n) -> { this.setLogCleanupPolicy(n.getEnumValue(JsonSchemaKafkaLogCleanupAndCompactionLogCleanupPolicy::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the log_cleaner_delete_retention_ms property value. How long are delete records retained?
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLogCleanerDeleteRetentionMs() {
        return this.logCleanerDeleteRetentionMs;
    }
    /**
     * Gets the log_cleaner_max_compaction_lag_ms property value. The maximum amount of time message will remain uncompacted. Only applicable for logs that are being compacted
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLogCleanerMaxCompactionLagMs() {
        return this.logCleanerMaxCompactionLagMs;
    }
    /**
     * Gets the log_cleaner_min_cleanable_ratio property value. Controls log compactor frequency. Larger value means more frequent compactions but also more space wasted for logs. Consider setting log.cleaner.max.compaction.lag.ms to enforce compactions sooner, instead of setting a very high value for this option.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getLogCleanerMinCleanableRatio() {
        return this.logCleanerMinCleanableRatio;
    }
    /**
     * Gets the log_cleaner_min_compaction_lag_ms property value. The minimum time a message will remain uncompacted in the log. Only applicable for logs that are being compacted.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getLogCleanerMinCompactionLagMs() {
        return this.logCleanerMinCompactionLagMs;
    }
    /**
     * Gets the log_cleanup_policy property value. The default cleanup policy for segments beyond the retention window
     * @return a JsonSchemaKafkaLogCleanupAndCompactionLogCleanupPolicy
     */
    @jakarta.annotation.Nullable
    public JsonSchemaKafkaLogCleanupAndCompactionLogCleanupPolicy getLogCleanupPolicy() {
        return this.logCleanupPolicy;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("log_cleaner_delete_retention_ms", this.getLogCleanerDeleteRetentionMs());
        writer.writeIntegerValue("log_cleaner_max_compaction_lag_ms", this.getLogCleanerMaxCompactionLagMs());
        writer.writeDoubleValue("log_cleaner_min_cleanable_ratio", this.getLogCleanerMinCleanableRatio());
        writer.writeIntegerValue("log_cleaner_min_compaction_lag_ms", this.getLogCleanerMinCompactionLagMs());
        writer.writeEnumValue("log_cleanup_policy", this.getLogCleanupPolicy());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the log_cleaner_delete_retention_ms property value. How long are delete records retained?
     * @param value Value to set for the log_cleaner_delete_retention_ms property.
     */
    public void setLogCleanerDeleteRetentionMs(@jakarta.annotation.Nullable final Integer value) {
        this.logCleanerDeleteRetentionMs = value;
    }
    /**
     * Sets the log_cleaner_max_compaction_lag_ms property value. The maximum amount of time message will remain uncompacted. Only applicable for logs that are being compacted
     * @param value Value to set for the log_cleaner_max_compaction_lag_ms property.
     */
    public void setLogCleanerMaxCompactionLagMs(@jakarta.annotation.Nullable final Integer value) {
        this.logCleanerMaxCompactionLagMs = value;
    }
    /**
     * Sets the log_cleaner_min_cleanable_ratio property value. Controls log compactor frequency. Larger value means more frequent compactions but also more space wasted for logs. Consider setting log.cleaner.max.compaction.lag.ms to enforce compactions sooner, instead of setting a very high value for this option.
     * @param value Value to set for the log_cleaner_min_cleanable_ratio property.
     */
    public void setLogCleanerMinCleanableRatio(@jakarta.annotation.Nullable final Double value) {
        this.logCleanerMinCleanableRatio = value;
    }
    /**
     * Sets the log_cleaner_min_compaction_lag_ms property value. The minimum time a message will remain uncompacted in the log. Only applicable for logs that are being compacted.
     * @param value Value to set for the log_cleaner_min_compaction_lag_ms property.
     */
    public void setLogCleanerMinCompactionLagMs(@jakarta.annotation.Nullable final Integer value) {
        this.logCleanerMinCompactionLagMs = value;
    }
    /**
     * Sets the log_cleanup_policy property value. The default cleanup policy for segments beyond the retention window
     * @param value Value to set for the log_cleanup_policy property.
     */
    public void setLogCleanupPolicy(@jakarta.annotation.Nullable final JsonSchemaKafkaLogCleanupAndCompactionLogCleanupPolicy value) {
        this.logCleanupPolicy = value;
    }
}
