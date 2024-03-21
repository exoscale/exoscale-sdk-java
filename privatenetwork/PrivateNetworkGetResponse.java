package com.exoscale.privatenetwork;

import com.exoscale.models.PrivateNetwork;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivateNetworkGetResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The privateNetworks property
     */
    private java.util.List<PrivateNetwork> privateNetworks;
    /**
     * Instantiates a new PrivateNetworkGetResponse and sets the default values.
     */
    public PrivateNetworkGetResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PrivateNetworkGetResponse
     */
    @jakarta.annotation.Nonnull
    public static PrivateNetworkGetResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivateNetworkGetResponse();
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
        deserializerMap.put("private-networks", (n) -> { this.setPrivateNetworks(n.getCollectionOfObjectValues(PrivateNetwork::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the private-networks property value. The privateNetworks property
     * @return a java.util.List<PrivateNetwork>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PrivateNetwork> getPrivateNetworks() {
        return this.privateNetworks;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("private-networks", this.getPrivateNetworks());
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
     * Sets the private-networks property value. The privateNetworks property
     * @param value Value to set for the private-networks property.
     */
    public void setPrivateNetworks(@jakarta.annotation.Nullable final java.util.List<PrivateNetwork> value) {
        this.privateNetworks = value;
    }
}
