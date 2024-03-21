package com.exoscale.blockstoragesnapshot;

import com.exoscale.models.BlockStorageSnapshot;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BlockStorageSnapshotGetResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The blockStorageSnapshots property
     */
    private java.util.List<BlockStorageSnapshot> blockStorageSnapshots;
    /**
     * Instantiates a new BlockStorageSnapshotGetResponse and sets the default values.
     */
    public BlockStorageSnapshotGetResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BlockStorageSnapshotGetResponse
     */
    @jakarta.annotation.Nonnull
    public static BlockStorageSnapshotGetResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BlockStorageSnapshotGetResponse();
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
     * Gets the block-storage-snapshots property value. The blockStorageSnapshots property
     * @return a java.util.List<BlockStorageSnapshot>
     */
    @jakarta.annotation.Nullable
    public java.util.List<BlockStorageSnapshot> getBlockStorageSnapshots() {
        return this.blockStorageSnapshots;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("block-storage-snapshots", (n) -> { this.setBlockStorageSnapshots(n.getCollectionOfObjectValues(BlockStorageSnapshot::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("block-storage-snapshots", this.getBlockStorageSnapshots());
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
     * Sets the block-storage-snapshots property value. The blockStorageSnapshots property
     * @param value Value to set for the block-storage-snapshots property.
     */
    public void setBlockStorageSnapshots(@jakarta.annotation.Nullable final java.util.List<BlockStorageSnapshot> value) {
        this.blockStorageSnapshots = value;
    }
}
