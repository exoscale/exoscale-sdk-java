package com.exoscale.instancepool;

import com.exoscale.models.InstancePool;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InstancePoolGetResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The instancePools property
     */
    private java.util.List<InstancePool> instancePools;
    /**
     * Instantiates a new InstancePoolGetResponse and sets the default values.
     */
    public InstancePoolGetResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InstancePoolGetResponse
     */
    @jakarta.annotation.Nonnull
    public static InstancePoolGetResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InstancePoolGetResponse();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("instance-pools", (n) -> { this.setInstancePools(n.getCollectionOfObjectValues(InstancePool::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the instance-pools property value. The instancePools property
     * @return a java.util.List<InstancePool>
     */
    @jakarta.annotation.Nullable
    public java.util.List<InstancePool> getInstancePools() {
        return this.instancePools;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("instance-pools", this.getInstancePools());
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
     * Sets the instance-pools property value. The instancePools property
     * @param value Value to set for the instance-pools property.
     */
    public void setInstancePools(@jakarta.annotation.Nullable final java.util.List<InstancePool> value) {
        this.instancePools = value;
    }
}
