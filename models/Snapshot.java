package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * Snapshot
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Snapshot implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Snapshot creation date
     */
    private OffsetDateTime createdAt;
    /**
     * Exported snapshot information
     */
    private SnapshotExport export;
    /**
     * Snapshot ID
     */
    private UUID id;
    /**
     * Instance
     */
    private Instance instance;
    /**
     * Snapshot name
     */
    private String name;
    /**
     * Snapshot size in GB
     */
    private Long size;
    /**
     * Snapshot state
     */
    private SnapshotState state;
    /**
     * Instantiates a new Snapshot and sets the default values.
     */
    public Snapshot() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Snapshot
     */
    @jakarta.annotation.Nonnull
    public static Snapshot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Snapshot();
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
     * Gets the created-at property value. Snapshot creation date
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the export property value. Exported snapshot information
     * @return a SnapshotExport
     */
    @jakarta.annotation.Nullable
    public SnapshotExport getExport() {
        return this.export;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("created-at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("export", (n) -> { this.setExport(n.getObjectValue(SnapshotExport::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("instance", (n) -> { this.setInstance(n.getObjectValue(Instance::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getLongValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(SnapshotState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Snapshot ID
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.id;
    }
    /**
     * Gets the instance property value. Instance
     * @return a Instance
     */
    @jakarta.annotation.Nullable
    public Instance getInstance() {
        return this.instance;
    }
    /**
     * Gets the name property value. Snapshot name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the size property value. Snapshot size in GB
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSize() {
        return this.size;
    }
    /**
     * Gets the state property value. Snapshot state
     * @return a SnapshotState
     */
    @jakarta.annotation.Nullable
    public SnapshotState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("export", this.getExport());
        writer.writeObjectValue("instance", this.getInstance());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("state", this.getState());
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
     * Sets the created-at property value. Snapshot creation date
     * @param value Value to set for the created-at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the export property value. Exported snapshot information
     * @param value Value to set for the export property.
     */
    public void setExport(@jakarta.annotation.Nullable final SnapshotExport value) {
        this.export = value;
    }
    /**
     * Sets the id property value. Snapshot ID
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the instance property value. Instance
     * @param value Value to set for the instance property.
     */
    public void setInstance(@jakarta.annotation.Nullable final Instance value) {
        this.instance = value;
    }
    /**
     * Sets the name property value. Snapshot name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the size property value. Snapshot size in GB
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Long value) {
        this.size = value;
    }
    /**
     * Sets the state property value. Snapshot state
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final SnapshotState value) {
        this.state = value;
    }
}
