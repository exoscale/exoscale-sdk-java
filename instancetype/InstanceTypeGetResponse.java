package com.exoscale.instancetype;

import com.exoscale.models.InstanceType;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InstanceTypeGetResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The instanceTypes property
     */
    private java.util.List<InstanceType> instanceTypes;
    /**
     * Instantiates a new InstanceTypeGetResponse and sets the default values.
     */
    public InstanceTypeGetResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InstanceTypeGetResponse
     */
    @jakarta.annotation.Nonnull
    public static InstanceTypeGetResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InstanceTypeGetResponse();
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
        deserializerMap.put("instance-types", (n) -> { this.setInstanceTypes(n.getCollectionOfObjectValues(InstanceType::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the instance-types property value. The instanceTypes property
     * @return a java.util.List<InstanceType>
     */
    @jakarta.annotation.Nullable
    public java.util.List<InstanceType> getInstanceTypes() {
        return this.instanceTypes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("instance-types", this.getInstanceTypes());
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
     * Sets the instance-types property value. The instanceTypes property
     * @param value Value to set for the instance-types property.
     */
    public void setInstanceTypes(@jakarta.annotation.Nullable final java.util.List<InstanceType> value) {
        this.instanceTypes = value;
    }
}
