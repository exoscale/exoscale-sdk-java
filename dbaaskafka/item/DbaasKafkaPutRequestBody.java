package com.exoscale.dbaaskafka.item;

import com.exoscale.models.JsonSchemaKafka;
import com.exoscale.models.JsonSchemaKafkaConnect;
import com.exoscale.models.JsonSchemaKafkaRest;
import com.exoscale.models.JsonSchemaSchemaRegistry;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasKafkaPutRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Kafka authentication methods
     */
    private DbaasKafkaPutRequestBodyAuthenticationMethods authenticationMethods;
    /**
     * Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'
     */
    private java.util.List<String> ipFilter;
    /**
     * Allow clients to connect to kafka_connect from the public internet for service nodes that are in a project VPC or another type of private network
     */
    private Boolean kafkaConnectEnabled;
    /**
     * The kafkaConnectSettings property
     */
    private JsonSchemaKafkaConnect kafkaConnectSettings;
    /**
     * Enable Kafka-REST service
     */
    private Boolean kafkaRestEnabled;
    /**
     * The kafkaRestSettings property
     */
    private JsonSchemaKafkaRest kafkaRestSettings;
    /**
     * The kafkaSettings property
     */
    private JsonSchemaKafka kafkaSettings;
    /**
     * Automatic maintenance settings
     */
    private DbaasKafkaPutRequestBodyMaintenance maintenance;
    /**
     * Subscription plan
     */
    private String plan;
    /**
     * Enable Schema-Registry service
     */
    private Boolean schemaRegistryEnabled;
    /**
     * The schemaRegistrySettings property
     */
    private JsonSchemaSchemaRegistry schemaRegistrySettings;
    /**
     * Service is protected against termination and powering off
     */
    private Boolean terminationProtection;
    /**
     * Kafka major version
     */
    private String version;
    /**
     * Instantiates a new DbaasKafkaPutRequestBody and sets the default values.
     */
    public DbaasKafkaPutRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasKafkaPutRequestBody
     */
    @jakarta.annotation.Nonnull
    public static DbaasKafkaPutRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasKafkaPutRequestBody();
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
     * Gets the authentication-methods property value. Kafka authentication methods
     * @return a DbaasKafkaPutRequestBodyAuthenticationMethods
     */
    @jakarta.annotation.Nullable
    public DbaasKafkaPutRequestBodyAuthenticationMethods getAuthenticationMethods() {
        return this.authenticationMethods;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("authentication-methods", (n) -> { this.setAuthenticationMethods(n.getObjectValue(DbaasKafkaPutRequestBodyAuthenticationMethods::createFromDiscriminatorValue)); });
        deserializerMap.put("ip-filter", (n) -> { this.setIpFilter(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("kafka-connect-enabled", (n) -> { this.setKafkaConnectEnabled(n.getBooleanValue()); });
        deserializerMap.put("kafka-connect-settings", (n) -> { this.setKafkaConnectSettings(n.getObjectValue(JsonSchemaKafkaConnect::createFromDiscriminatorValue)); });
        deserializerMap.put("kafka-rest-enabled", (n) -> { this.setKafkaRestEnabled(n.getBooleanValue()); });
        deserializerMap.put("kafka-rest-settings", (n) -> { this.setKafkaRestSettings(n.getObjectValue(JsonSchemaKafkaRest::createFromDiscriminatorValue)); });
        deserializerMap.put("kafka-settings", (n) -> { this.setKafkaSettings(n.getObjectValue(JsonSchemaKafka::createFromDiscriminatorValue)); });
        deserializerMap.put("maintenance", (n) -> { this.setMaintenance(n.getObjectValue(DbaasKafkaPutRequestBodyMaintenance::createFromDiscriminatorValue)); });
        deserializerMap.put("plan", (n) -> { this.setPlan(n.getStringValue()); });
        deserializerMap.put("schema-registry-enabled", (n) -> { this.setSchemaRegistryEnabled(n.getBooleanValue()); });
        deserializerMap.put("schema-registry-settings", (n) -> { this.setSchemaRegistrySettings(n.getObjectValue(JsonSchemaSchemaRegistry::createFromDiscriminatorValue)); });
        deserializerMap.put("termination-protection", (n) -> { this.setTerminationProtection(n.getBooleanValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ip-filter property value. Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIpFilter() {
        return this.ipFilter;
    }
    /**
     * Gets the kafka-connect-enabled property value. Allow clients to connect to kafka_connect from the public internet for service nodes that are in a project VPC or another type of private network
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKafkaConnectEnabled() {
        return this.kafkaConnectEnabled;
    }
    /**
     * Gets the kafka-connect-settings property value. The kafkaConnectSettings property
     * @return a JsonSchemaKafkaConnect
     */
    @jakarta.annotation.Nullable
    public JsonSchemaKafkaConnect getKafkaConnectSettings() {
        return this.kafkaConnectSettings;
    }
    /**
     * Gets the kafka-rest-enabled property value. Enable Kafka-REST service
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKafkaRestEnabled() {
        return this.kafkaRestEnabled;
    }
    /**
     * Gets the kafka-rest-settings property value. The kafkaRestSettings property
     * @return a JsonSchemaKafkaRest
     */
    @jakarta.annotation.Nullable
    public JsonSchemaKafkaRest getKafkaRestSettings() {
        return this.kafkaRestSettings;
    }
    /**
     * Gets the kafka-settings property value. The kafkaSettings property
     * @return a JsonSchemaKafka
     */
    @jakarta.annotation.Nullable
    public JsonSchemaKafka getKafkaSettings() {
        return this.kafkaSettings;
    }
    /**
     * Gets the maintenance property value. Automatic maintenance settings
     * @return a DbaasKafkaPutRequestBodyMaintenance
     */
    @jakarta.annotation.Nullable
    public DbaasKafkaPutRequestBodyMaintenance getMaintenance() {
        return this.maintenance;
    }
    /**
     * Gets the plan property value. Subscription plan
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPlan() {
        return this.plan;
    }
    /**
     * Gets the schema-registry-enabled property value. Enable Schema-Registry service
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSchemaRegistryEnabled() {
        return this.schemaRegistryEnabled;
    }
    /**
     * Gets the schema-registry-settings property value. The schemaRegistrySettings property
     * @return a JsonSchemaSchemaRegistry
     */
    @jakarta.annotation.Nullable
    public JsonSchemaSchemaRegistry getSchemaRegistrySettings() {
        return this.schemaRegistrySettings;
    }
    /**
     * Gets the termination-protection property value. Service is protected against termination and powering off
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTerminationProtection() {
        return this.terminationProtection;
    }
    /**
     * Gets the version property value. Kafka major version
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("authentication-methods", this.getAuthenticationMethods());
        writer.writeCollectionOfPrimitiveValues("ip-filter", this.getIpFilter());
        writer.writeBooleanValue("kafka-connect-enabled", this.getKafkaConnectEnabled());
        writer.writeObjectValue("kafka-connect-settings", this.getKafkaConnectSettings());
        writer.writeBooleanValue("kafka-rest-enabled", this.getKafkaRestEnabled());
        writer.writeObjectValue("kafka-rest-settings", this.getKafkaRestSettings());
        writer.writeObjectValue("kafka-settings", this.getKafkaSettings());
        writer.writeObjectValue("maintenance", this.getMaintenance());
        writer.writeStringValue("plan", this.getPlan());
        writer.writeBooleanValue("schema-registry-enabled", this.getSchemaRegistryEnabled());
        writer.writeObjectValue("schema-registry-settings", this.getSchemaRegistrySettings());
        writer.writeBooleanValue("termination-protection", this.getTerminationProtection());
        writer.writeStringValue("version", this.getVersion());
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
     * Sets the authentication-methods property value. Kafka authentication methods
     * @param value Value to set for the authentication-methods property.
     */
    public void setAuthenticationMethods(@jakarta.annotation.Nullable final DbaasKafkaPutRequestBodyAuthenticationMethods value) {
        this.authenticationMethods = value;
    }
    /**
     * Sets the ip-filter property value. Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'
     * @param value Value to set for the ip-filter property.
     */
    public void setIpFilter(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.ipFilter = value;
    }
    /**
     * Sets the kafka-connect-enabled property value. Allow clients to connect to kafka_connect from the public internet for service nodes that are in a project VPC or another type of private network
     * @param value Value to set for the kafka-connect-enabled property.
     */
    public void setKafkaConnectEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.kafkaConnectEnabled = value;
    }
    /**
     * Sets the kafka-connect-settings property value. The kafkaConnectSettings property
     * @param value Value to set for the kafka-connect-settings property.
     */
    public void setKafkaConnectSettings(@jakarta.annotation.Nullable final JsonSchemaKafkaConnect value) {
        this.kafkaConnectSettings = value;
    }
    /**
     * Sets the kafka-rest-enabled property value. Enable Kafka-REST service
     * @param value Value to set for the kafka-rest-enabled property.
     */
    public void setKafkaRestEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.kafkaRestEnabled = value;
    }
    /**
     * Sets the kafka-rest-settings property value. The kafkaRestSettings property
     * @param value Value to set for the kafka-rest-settings property.
     */
    public void setKafkaRestSettings(@jakarta.annotation.Nullable final JsonSchemaKafkaRest value) {
        this.kafkaRestSettings = value;
    }
    /**
     * Sets the kafka-settings property value. The kafkaSettings property
     * @param value Value to set for the kafka-settings property.
     */
    public void setKafkaSettings(@jakarta.annotation.Nullable final JsonSchemaKafka value) {
        this.kafkaSettings = value;
    }
    /**
     * Sets the maintenance property value. Automatic maintenance settings
     * @param value Value to set for the maintenance property.
     */
    public void setMaintenance(@jakarta.annotation.Nullable final DbaasKafkaPutRequestBodyMaintenance value) {
        this.maintenance = value;
    }
    /**
     * Sets the plan property value. Subscription plan
     * @param value Value to set for the plan property.
     */
    public void setPlan(@jakarta.annotation.Nullable final String value) {
        this.plan = value;
    }
    /**
     * Sets the schema-registry-enabled property value. Enable Schema-Registry service
     * @param value Value to set for the schema-registry-enabled property.
     */
    public void setSchemaRegistryEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.schemaRegistryEnabled = value;
    }
    /**
     * Sets the schema-registry-settings property value. The schemaRegistrySettings property
     * @param value Value to set for the schema-registry-settings property.
     */
    public void setSchemaRegistrySettings(@jakarta.annotation.Nullable final JsonSchemaSchemaRegistry value) {
        this.schemaRegistrySettings = value;
    }
    /**
     * Sets the termination-protection property value. Service is protected against termination and powering off
     * @param value Value to set for the termination-protection property.
     */
    public void setTerminationProtection(@jakarta.annotation.Nullable final Boolean value) {
        this.terminationProtection = value;
    }
    /**
     * Sets the version property value. Kafka major version
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.version = value;
    }
}
