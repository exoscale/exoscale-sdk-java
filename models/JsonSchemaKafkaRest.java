package com.exoscale.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JsonSchemaKafkaRest implements Parsable {
    /**
     * If true the consumer's offset will be periodically committed to Kafka in the background
     */
    private Boolean consumerEnableAutoCommit;
    /**
     * Maximum number of bytes in unencoded message keys and values by a single request
     */
    private Integer consumerRequestMaxBytes;
    /**
     * The maximum total time to wait for messages for a request if the maximum number of messages has not yet been reached
     */
    private Integer consumerRequestTimeoutMs;
    /**
     * The number of acknowledgments the producer requires the leader to have received before considering a request complete. If set to 'all' or '-1', the leader will wait for the full set of in-sync replicas to acknowledge the record.
     */
    private JsonSchemaKafkaRestProducerAcks producerAcks;
    /**
     * Specify the default compression type for producers. This configuration accepts the standard compression codecs ('gzip', 'snappy', 'lz4', 'zstd'). It additionally accepts 'none' which is the default and equivalent to no compression.
     */
    private JsonSchemaKafkaRestProducerCompressionType producerCompressionType;
    /**
     * Wait for up to the given delay to allow batching records together
     */
    private Integer producerLingerMs;
    /**
     * The maximum size of a request in bytes. Note that Kafka broker can also cap the record batch size.
     */
    private Integer producerMaxRequestSize;
    /**
     * Maximum number of SimpleConsumers that can be instantiated per broker
     */
    private Integer simpleconsumerPoolSizeMax;
    /**
     * Instantiates a new JsonSchemaKafkaRest and sets the default values.
     */
    public JsonSchemaKafkaRest() {
        this.setProducerAcks(JsonSchemaKafkaRestProducerAcks.forValue("1"));
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JsonSchemaKafkaRest
     */
    @jakarta.annotation.Nonnull
    public static JsonSchemaKafkaRest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JsonSchemaKafkaRest();
    }
    /**
     * Gets the consumer_enable_auto_commit property value. If true the consumer's offset will be periodically committed to Kafka in the background
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getConsumerEnableAutoCommit() {
        return this.consumerEnableAutoCommit;
    }
    /**
     * Gets the consumer_request_max_bytes property value. Maximum number of bytes in unencoded message keys and values by a single request
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConsumerRequestMaxBytes() {
        return this.consumerRequestMaxBytes;
    }
    /**
     * Gets the consumer_request_timeout_ms property value. The maximum total time to wait for messages for a request if the maximum number of messages has not yet been reached
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConsumerRequestTimeoutMs() {
        return this.consumerRequestTimeoutMs;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("consumer_enable_auto_commit", (n) -> { this.setConsumerEnableAutoCommit(n.getBooleanValue()); });
        deserializerMap.put("consumer_request_max_bytes", (n) -> { this.setConsumerRequestMaxBytes(n.getIntegerValue()); });
        deserializerMap.put("consumer_request_timeout_ms", (n) -> { this.setConsumerRequestTimeoutMs(n.getIntegerValue()); });
        deserializerMap.put("producer_acks", (n) -> { this.setProducerAcks(n.getEnumValue(JsonSchemaKafkaRestProducerAcks::forValue)); });
        deserializerMap.put("producer_compression_type", (n) -> { this.setProducerCompressionType(n.getEnumValue(JsonSchemaKafkaRestProducerCompressionType::forValue)); });
        deserializerMap.put("producer_linger_ms", (n) -> { this.setProducerLingerMs(n.getIntegerValue()); });
        deserializerMap.put("producer_max_request_size", (n) -> { this.setProducerMaxRequestSize(n.getIntegerValue()); });
        deserializerMap.put("simpleconsumer_pool_size_max", (n) -> { this.setSimpleconsumerPoolSizeMax(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the producer_acks property value. The number of acknowledgments the producer requires the leader to have received before considering a request complete. If set to 'all' or '-1', the leader will wait for the full set of in-sync replicas to acknowledge the record.
     * @return a JsonSchemaKafkaRestProducerAcks
     */
    @jakarta.annotation.Nullable
    public JsonSchemaKafkaRestProducerAcks getProducerAcks() {
        return this.producerAcks;
    }
    /**
     * Gets the producer_compression_type property value. Specify the default compression type for producers. This configuration accepts the standard compression codecs ('gzip', 'snappy', 'lz4', 'zstd'). It additionally accepts 'none' which is the default and equivalent to no compression.
     * @return a JsonSchemaKafkaRestProducerCompressionType
     */
    @jakarta.annotation.Nullable
    public JsonSchemaKafkaRestProducerCompressionType getProducerCompressionType() {
        return this.producerCompressionType;
    }
    /**
     * Gets the producer_linger_ms property value. Wait for up to the given delay to allow batching records together
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getProducerLingerMs() {
        return this.producerLingerMs;
    }
    /**
     * Gets the producer_max_request_size property value. The maximum size of a request in bytes. Note that Kafka broker can also cap the record batch size.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getProducerMaxRequestSize() {
        return this.producerMaxRequestSize;
    }
    /**
     * Gets the simpleconsumer_pool_size_max property value. Maximum number of SimpleConsumers that can be instantiated per broker
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getSimpleconsumerPoolSizeMax() {
        return this.simpleconsumerPoolSizeMax;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("consumer_enable_auto_commit", this.getConsumerEnableAutoCommit());
        writer.writeIntegerValue("consumer_request_max_bytes", this.getConsumerRequestMaxBytes());
        writer.writeIntegerValue("consumer_request_timeout_ms", this.getConsumerRequestTimeoutMs());
        writer.writeEnumValue("producer_acks", this.getProducerAcks());
        writer.writeEnumValue("producer_compression_type", this.getProducerCompressionType());
        writer.writeIntegerValue("producer_linger_ms", this.getProducerLingerMs());
        writer.writeIntegerValue("producer_max_request_size", this.getProducerMaxRequestSize());
        writer.writeIntegerValue("simpleconsumer_pool_size_max", this.getSimpleconsumerPoolSizeMax());
    }
    /**
     * Sets the consumer_enable_auto_commit property value. If true the consumer's offset will be periodically committed to Kafka in the background
     * @param value Value to set for the consumer_enable_auto_commit property.
     */
    public void setConsumerEnableAutoCommit(@jakarta.annotation.Nullable final Boolean value) {
        this.consumerEnableAutoCommit = value;
    }
    /**
     * Sets the consumer_request_max_bytes property value. Maximum number of bytes in unencoded message keys and values by a single request
     * @param value Value to set for the consumer_request_max_bytes property.
     */
    public void setConsumerRequestMaxBytes(@jakarta.annotation.Nullable final Integer value) {
        this.consumerRequestMaxBytes = value;
    }
    /**
     * Sets the consumer_request_timeout_ms property value. The maximum total time to wait for messages for a request if the maximum number of messages has not yet been reached
     * @param value Value to set for the consumer_request_timeout_ms property.
     */
    public void setConsumerRequestTimeoutMs(@jakarta.annotation.Nullable final Integer value) {
        this.consumerRequestTimeoutMs = value;
    }
    /**
     * Sets the producer_acks property value. The number of acknowledgments the producer requires the leader to have received before considering a request complete. If set to 'all' or '-1', the leader will wait for the full set of in-sync replicas to acknowledge the record.
     * @param value Value to set for the producer_acks property.
     */
    public void setProducerAcks(@jakarta.annotation.Nullable final JsonSchemaKafkaRestProducerAcks value) {
        this.producerAcks = value;
    }
    /**
     * Sets the producer_compression_type property value. Specify the default compression type for producers. This configuration accepts the standard compression codecs ('gzip', 'snappy', 'lz4', 'zstd'). It additionally accepts 'none' which is the default and equivalent to no compression.
     * @param value Value to set for the producer_compression_type property.
     */
    public void setProducerCompressionType(@jakarta.annotation.Nullable final JsonSchemaKafkaRestProducerCompressionType value) {
        this.producerCompressionType = value;
    }
    /**
     * Sets the producer_linger_ms property value. Wait for up to the given delay to allow batching records together
     * @param value Value to set for the producer_linger_ms property.
     */
    public void setProducerLingerMs(@jakarta.annotation.Nullable final Integer value) {
        this.producerLingerMs = value;
    }
    /**
     * Sets the producer_max_request_size property value. The maximum size of a request in bytes. Note that Kafka broker can also cap the record batch size.
     * @param value Value to set for the producer_max_request_size property.
     */
    public void setProducerMaxRequestSize(@jakarta.annotation.Nullable final Integer value) {
        this.producerMaxRequestSize = value;
    }
    /**
     * Sets the simpleconsumer_pool_size_max property value. Maximum number of SimpleConsumers that can be instantiated per broker
     * @param value Value to set for the simpleconsumer_pool_size_max property.
     */
    public void setSimpleconsumerPoolSizeMax(@jakarta.annotation.Nullable final Integer value) {
        this.simpleconsumerPoolSizeMax = value;
    }
}
