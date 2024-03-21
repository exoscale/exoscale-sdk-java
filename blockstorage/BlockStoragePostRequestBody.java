package com.exoscale.blockstorage;

import com.exoscale.models.BlockStorageSnapshotTarget;
import com.exoscale.models.Labels;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BlockStoragePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Target block storage snapshot
     */
    private BlockStorageSnapshotTarget blockStorageSnapshot;
    /**
     * The labels property
     */
    private Labels labels;
    /**
     * Volume name
     */
    private String name;
    /**
     * Volume size in GB.                            When a snapshot ID is supplied, this defaults to the size of the source volume, but can be set to a larger value.
     */
    private Long size;
    /**
     * Instantiates a new BlockStoragePostRequestBody and sets the default values.
     */
    public BlockStoragePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BlockStoragePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static BlockStoragePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BlockStoragePostRequestBody();
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
     * Gets the block-storage-snapshot property value. Target block storage snapshot
     * @return a BlockStorageSnapshotTarget
     */
    @jakarta.annotation.Nullable
    public BlockStorageSnapshotTarget getBlockStorageSnapshot() {
        return this.blockStorageSnapshot;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("block-storage-snapshot", (n) -> { this.setBlockStorageSnapshot(n.getObjectValue(BlockStorageSnapshotTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getObjectValue(Labels::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getLongValue()); });
        return deserializerMap;
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
     * Gets the size property value. Volume size in GB.                            When a snapshot ID is supplied, this defaults to the size of the source volume, but can be set to a larger value.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSize() {
        return this.size;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("block-storage-snapshot", this.getBlockStorageSnapshot());
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
     * Sets the block-storage-snapshot property value. Target block storage snapshot
     * @param value Value to set for the block-storage-snapshot property.
     */
    public void setBlockStorageSnapshot(@jakarta.annotation.Nullable final BlockStorageSnapshotTarget value) {
        this.blockStorageSnapshot = value;
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
     * Sets the size property value. Volume size in GB.                            When a snapshot ID is supplied, this defaults to the size of the source volume, but can be set to a larger value.
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Long value) {
        this.size = value;
    }
}
