package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * Compute instance type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InstanceType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Requires authorization or publicly available
     */
    private Boolean authorized;
    /**
     * CPU count
     */
    private Long cpus;
    /**
     * Instance type family
     */
    private InstanceTypeFamily family;
    /**
     * GPU count
     */
    private Long gpus;
    /**
     * Instance type ID
     */
    private UUID id;
    /**
     * Available memory
     */
    private Long memory;
    /**
     * Instance type size
     */
    private InstanceTypeSize size;
    /**
     * Instance Type available zones
     */
    private java.util.List<ZoneName> zones;
    /**
     * Instantiates a new InstanceType and sets the default values.
     */
    public InstanceType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InstanceType
     */
    @jakarta.annotation.Nonnull
    public static InstanceType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InstanceType();
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
     * Gets the authorized property value. Requires authorization or publicly available
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAuthorized() {
        return this.authorized;
    }
    /**
     * Gets the cpus property value. CPU count
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getCpus() {
        return this.cpus;
    }
    /**
     * Gets the family property value. Instance type family
     * @return a InstanceTypeFamily
     */
    @jakarta.annotation.Nullable
    public InstanceTypeFamily getFamily() {
        return this.family;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("authorized", (n) -> { this.setAuthorized(n.getBooleanValue()); });
        deserializerMap.put("cpus", (n) -> { this.setCpus(n.getLongValue()); });
        deserializerMap.put("family", (n) -> { this.setFamily(n.getEnumValue(InstanceTypeFamily::forValue)); });
        deserializerMap.put("gpus", (n) -> { this.setGpus(n.getLongValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("memory", (n) -> { this.setMemory(n.getLongValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getEnumValue(InstanceTypeSize::forValue)); });
        deserializerMap.put("zones", (n) -> { this.setZones(n.getCollectionOfEnumValues(ZoneName::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the gpus property value. GPU count
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getGpus() {
        return this.gpus;
    }
    /**
     * Gets the id property value. Instance type ID
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.id;
    }
    /**
     * Gets the memory property value. Available memory
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getMemory() {
        return this.memory;
    }
    /**
     * Gets the size property value. Instance type size
     * @return a InstanceTypeSize
     */
    @jakarta.annotation.Nullable
    public InstanceTypeSize getSize() {
        return this.size;
    }
    /**
     * Gets the zones property value. Instance Type available zones
     * @return a java.util.List<ZoneName>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ZoneName> getZones() {
        return this.zones;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
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
     * Sets the authorized property value. Requires authorization or publicly available
     * @param value Value to set for the authorized property.
     */
    public void setAuthorized(@jakarta.annotation.Nullable final Boolean value) {
        this.authorized = value;
    }
    /**
     * Sets the cpus property value. CPU count
     * @param value Value to set for the cpus property.
     */
    public void setCpus(@jakarta.annotation.Nullable final Long value) {
        this.cpus = value;
    }
    /**
     * Sets the family property value. Instance type family
     * @param value Value to set for the family property.
     */
    public void setFamily(@jakarta.annotation.Nullable final InstanceTypeFamily value) {
        this.family = value;
    }
    /**
     * Sets the gpus property value. GPU count
     * @param value Value to set for the gpus property.
     */
    public void setGpus(@jakarta.annotation.Nullable final Long value) {
        this.gpus = value;
    }
    /**
     * Sets the id property value. Instance type ID
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the memory property value. Available memory
     * @param value Value to set for the memory property.
     */
    public void setMemory(@jakarta.annotation.Nullable final Long value) {
        this.memory = value;
    }
    /**
     * Sets the size property value. Instance type size
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final InstanceTypeSize value) {
        this.size = value;
    }
    /**
     * Sets the zones property value. Instance Type available zones
     * @param value Value to set for the zones property.
     */
    public void setZones(@jakarta.annotation.Nullable final java.util.List<ZoneName> value) {
        this.zones = value;
    }
}
