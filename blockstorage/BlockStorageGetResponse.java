package com.exoscale.blockstorage;

import com.exoscale.models.BlockStorageVolume;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BlockStorageGetResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The blockStorageVolumes property
     */
    private java.util.List<BlockStorageVolume> blockStorageVolumes;
    /**
     * Instantiates a new BlockStorageGetResponse and sets the default values.
     */
    public BlockStorageGetResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BlockStorageGetResponse
     */
    @jakarta.annotation.Nonnull
    public static BlockStorageGetResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BlockStorageGetResponse();
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
     * Gets the block-storage-volumes property value. The blockStorageVolumes property
     * @return a java.util.List<BlockStorageVolume>
     */
    @jakarta.annotation.Nullable
    public java.util.List<BlockStorageVolume> getBlockStorageVolumes() {
        return this.blockStorageVolumes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("block-storage-volumes", (n) -> { this.setBlockStorageVolumes(n.getCollectionOfObjectValues(BlockStorageVolume::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("block-storage-volumes", this.getBlockStorageVolumes());
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
     * Sets the block-storage-volumes property value. The blockStorageVolumes property
     * @param value Value to set for the block-storage-volumes property.
     */
    public void setBlockStorageVolumes(@jakarta.annotation.Nullable final java.util.List<BlockStorageVolume> value) {
        this.blockStorageVolumes = value;
    }
}
