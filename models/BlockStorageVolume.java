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
 * Block storage volume
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BlockStorageVolume implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Volume block size
     */
    private Long blocksize;
    /**
     * Volume snapshots, if any
     */
    private java.util.List<BlockStorageSnapshotTarget> blockStorageSnapshots;
    /**
     * Volume creation date
     */
    private OffsetDateTime createdAt;
    /**
     * Volume ID
     */
    private UUID id;
    /**
     * Target Instance
     */
    private InstanceTarget instance;
    /**
     * The labels property
     */
    private Labels labels;
    /**
     * Volume name
     */
    private String name;
    /**
     * Volume size
     */
    private Long size;
    /**
     * Volume state
     */
    private BlockStorageVolumeState state;
    /**
     * Instantiates a new BlockStorageVolume and sets the default values.
     */
    public BlockStorageVolume() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BlockStorageVolume
     */
    @jakarta.annotation.Nonnull
    public static BlockStorageVolume createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BlockStorageVolume();
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
     * Gets the blocksize property value. Volume block size
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getBlocksize() {
        return this.blocksize;
    }
    /**
     * Gets the block-storage-snapshots property value. Volume snapshots, if any
     * @return a java.util.List<BlockStorageSnapshotTarget>
     */
    @jakarta.annotation.Nullable
    public java.util.List<BlockStorageSnapshotTarget> getBlockStorageSnapshots() {
        return this.blockStorageSnapshots;
    }
    /**
     * Gets the created-at property value. Volume creation date
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("blocksize", (n) -> { this.setBlocksize(n.getLongValue()); });
        deserializerMap.put("block-storage-snapshots", (n) -> { this.setBlockStorageSnapshots(n.getCollectionOfObjectValues(BlockStorageSnapshotTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("created-at", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("instance", (n) -> { this.setInstance(n.getObjectValue(InstanceTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getObjectValue(Labels::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getLongValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(BlockStorageVolumeState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Volume ID
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.id;
    }
    /**
     * Gets the instance property value. Target Instance
     * @return a InstanceTarget
     */
    @jakarta.annotation.Nullable
    public InstanceTarget getInstance() {
        return this.instance;
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
     * Gets the name property value. Volume name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the size property value. Volume size
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSize() {
        return this.size;
    }
    /**
     * Gets the state property value. Volume state
     * @return a BlockStorageVolumeState
     */
    @jakarta.annotation.Nullable
    public BlockStorageVolumeState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("block-storage-snapshots", this.getBlockStorageSnapshots());
        writer.writeObjectValue("instance", this.getInstance());
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
     * Sets the blocksize property value. Volume block size
     * @param value Value to set for the blocksize property.
     */
    public void setBlocksize(@jakarta.annotation.Nullable final Long value) {
        this.blocksize = value;
    }
    /**
     * Sets the block-storage-snapshots property value. Volume snapshots, if any
     * @param value Value to set for the block-storage-snapshots property.
     */
    public void setBlockStorageSnapshots(@jakarta.annotation.Nullable final java.util.List<BlockStorageSnapshotTarget> value) {
        this.blockStorageSnapshots = value;
    }
    /**
     * Sets the created-at property value. Volume creation date
     * @param value Value to set for the created-at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the id property value. Volume ID
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the instance property value. Target Instance
     * @param value Value to set for the instance property.
     */
    public void setInstance(@jakarta.annotation.Nullable final InstanceTarget value) {
        this.instance = value;
    }
    /**
     * Sets the labels property value. The labels property
     * @param value Value to set for the labels property.
     */
    public void setLabels(@jakarta.annotation.Nullable final Labels value) {
        this.labels = value;
    }
    /**
     * Sets the name property value. Volume name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the size property value. Volume size
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Long value) {
        this.size = value;
    }
    /**
     * Sets the state property value. Volume state
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final BlockStorageVolumeState value) {
        this.state = value;
    }
}
