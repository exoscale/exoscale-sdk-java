package com.exoscale.skscluster;

import com.exoscale.models.SksCluster;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SksClusterGetResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The sksClusters property
     */
    private java.util.List<SksCluster> sksClusters;
    /**
     * Instantiates a new SksClusterGetResponse and sets the default values.
     */
    public SksClusterGetResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SksClusterGetResponse
     */
    @jakarta.annotation.Nonnull
    public static SksClusterGetResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SksClusterGetResponse();
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
        deserializerMap.put("sks-clusters", (n) -> { this.setSksClusters(n.getCollectionOfObjectValues(SksCluster::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the sks-clusters property value. The sksClusters property
     * @return a java.util.List<SksCluster>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SksCluster> getSksClusters() {
        return this.sksClusters;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("sks-clusters", this.getSksClusters());
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
     * Sets the sks-clusters property value. The sksClusters property
     * @param value Value to set for the sks-clusters property.
     */
    public void setSksClusters(@jakarta.annotation.Nullable final java.util.List<SksCluster> value) {
        this.sksClusters = value;
    }
}
