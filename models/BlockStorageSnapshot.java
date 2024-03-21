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
 * Block storage snapshot
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BlockStorageSnapshot implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Target block storage volume
     */
    private BlockStorageVolumeTarget blockStorageVolume;
    /**
     * Snapshot creation date
     */
    private OffsetDateTime createdAt;
    /**
     * Snapshot ID
     */
    private UUID id;
    /**
     * The labels property
     */
    private Labels labels;
    /**
     * Snapshot name
     */
    private String name;
    /**
     * Snapshot size
     */
    private Long size;
    /**
     * Snapshot state
     */
    private BlockStorageSnapshotState state;
    /**
     * Instantiates a new BlockStorageSnapshot and sets the default values.
     */
    public BlockStorageSnapshot() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BlockStorageSnapshot
     */
    @jakarta.annotation.Nonnull
    public static BlockStorageSnapshot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BlockStorageSnapshot();
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
     * Gets the block-storage-volume property value. Target block storage volume
     * @return a BlockStorageVolumeTarget
     */
    @jakarta.annotation.Nullable
    public BlockStorageVolumeTarget getBlockStorageVolume() {
        return this.blockStorageVolume;
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("block-storage-volume", (n) -> { this.setBlockStorageVolume(n.getObjectValue(BlockStorageVolumeTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("created-at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getObjectValue(Labels::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getLongValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(BlockStorageSnapshotState::forValue)); });
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
     * Gets the labels property value. The labels property
     * @return a Labels
     */
    @jakarta.annotation.Nullable
    public Labels getLabels() {
        return this.labels;
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
     * Gets the size property value. Snapshot size
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSize() {
        return this.size;
    }
    /**
     * Gets the state property value. Snapshot state
     * @return a BlockStorageSnapshotState
     */
    @jakarta.annotation.Nullable
    public BlockStorageSnapshotState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("block-storage-volume", this.getBlockStorageVolume());
        writer.writeObjectValue("labels", this.getLabels());
        writer.writeStringValue("name", this.getName());
        writer.writeLongValue("size", this.getSize());
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
     * Sets the block-storage-volume property value. Target block storage volume
     * @param value Value to set for the block-storage-volume property.
     */
    public void setBlockStorageVolume(@jakarta.annotation.Nullable final BlockStorageVolumeTarget value) {
        this.blockStorageVolume = value;
    }
    /**
     * Sets the created-at property value. Snapshot creation date
     * @param value Value to set for the created-at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the id property value. Snapshot ID
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the labels property value. The labels property
     * @param value Value to set for the labels property.
     */
    public void setLabels(@jakarta.annotation.Nullable final Labels value) {
        this.labels = value;
    }
    /**
     * Sets the name property value. Snapshot name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the size property value. Snapshot size
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Long value) {
        this.size = value;
    }
    /**
     * Sets the state property value. Snapshot state
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final BlockStorageSnapshotState value) {
        this.state = value;
    }
}
