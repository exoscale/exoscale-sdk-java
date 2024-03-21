package com.exoscale.dbaassettingskafka;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasSettingsKafkaGetResponseSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Kafka broker configuration values
     */
    private DbaasSettingsKafkaGetResponseSettingsKafka kafka;
    /**
     * Kafka Connect configuration values
     */
    private DbaasSettingsKafkaGetResponseSettingsKafkaConnect kafkaConnect;
    /**
     * Kafka REST configuration
     */
    private DbaasSettingsKafkaGetResponseSettingsKafkaRest kafkaRest;
    /**
     * Schema Registry configuration
     */
    private DbaasSettingsKafkaGetResponseSettingsSchemaRegistry schemaRegistry;
    /**
     * Instantiates a new DbaasSettingsKafkaGetResponseSettings and sets the default values.
     */
    public DbaasSettingsKafkaGetResponseSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasSettingsKafkaGetResponseSettings
     */
    @jakarta.annotation.Nonnull
    public static DbaasSettingsKafkaGetResponseSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasSettingsKafkaGetResponseSettings();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("kafka", (n) -> { this.setKafka(n.getObjectValue(DbaasSettingsKafkaGetResponseSettingsKafka::createFromDiscriminatorValue)); });
        deserializerMap.put("kafka-connect", (n) -> { this.setKafkaConnect(n.getObjectValue(DbaasSettingsKafkaGetResponseSettingsKafkaConnect::createFromDiscriminatorValue)); });
        deserializerMap.put("kafka-rest", (n) -> { this.setKafkaRest(n.getObjectValue(DbaasSettingsKafkaGetResponseSettingsKafkaRest::createFromDiscriminatorValue)); });
        deserializerMap.put("schema-registry", (n) -> { this.setSchemaRegistry(n.getObjectValue(DbaasSettingsKafkaGetResponseSettingsSchemaRegistry::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the kafka property value. Kafka broker configuration values
     * @return a DbaasSettingsKafkaGetResponseSettingsKafka
     */
    @jakarta.annotation.Nullable
    public DbaasSettingsKafkaGetResponseSettingsKafka getKafka() {
        return this.kafka;
    }
    /**
     * Gets the kafka-connect property value. Kafka Connect configuration values
     * @return a DbaasSettingsKafkaGetResponseSettingsKafkaConnect
     */
    @jakarta.annotation.Nullable
    public DbaasSettingsKafkaGetResponseSettingsKafkaConnect getKafkaConnect() {
        return this.kafkaConnect;
    }
    /**
     * Gets the kafka-rest property value. Kafka REST configuration
     * @return a DbaasSettingsKafkaGetResponseSettingsKafkaRest
     */
    @jakarta.annotation.Nullable
    public DbaasSettingsKafkaGetResponseSettingsKafkaRest getKafkaRest() {
        return this.kafkaRest;
    }
    /**
     * Gets the schema-registry property value. Schema Registry configuration
     * @return a DbaasSettingsKafkaGetResponseSettingsSchemaRegistry
     */
    @jakarta.annotation.Nullable
    public DbaasSettingsKafkaGetResponseSettingsSchemaRegistry getSchemaRegistry() {
        return this.schemaRegistry;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("kafka", this.getKafka());
        writer.writeObjectValue("kafka-connect", this.getKafkaConnect());
        writer.writeObjectValue("kafka-rest", this.getKafkaRest());
        writer.writeObjectValue("schema-registry", this.getSchemaRegistry());
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
     * Sets the kafka property value. Kafka broker configuration values
     * @param value Value to set for the kafka property.
     */
    public void setKafka(@jakarta.annotation.Nullable final DbaasSettingsKafkaGetResponseSettingsKafka value) {
        this.kafka = value;
    }
    /**
     * Sets the kafka-connect property value. Kafka Connect configuration values
     * @param value Value to set for the kafka-connect property.
     */
    public void setKafkaConnect(@jakarta.annotation.Nullable final DbaasSettingsKafkaGetResponseSettingsKafkaConnect value) {
        this.kafkaConnect = value;
    }
    /**
     * Sets the kafka-rest property value. Kafka REST configuration
     * @param value Value to set for the kafka-rest property.
     */
    public void setKafkaRest(@jakarta.annotation.Nullable final DbaasSettingsKafkaGetResponseSettingsKafkaRest value) {
        this.kafkaRest = value;
    }
    /**
     * Sets the schema-registry property value. Schema Registry configuration
     * @param value Value to set for the schema-registry property.
     */
    public void setSchemaRegistry(@jakarta.annotation.Nullable final DbaasSettingsKafkaGetResponseSettingsSchemaRegistry value) {
        this.schemaRegistry = value;
    }
}
