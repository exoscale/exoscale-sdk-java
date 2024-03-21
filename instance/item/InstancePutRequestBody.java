package com.exoscale.instance.item;

import com.exoscale.models.Labels;
import com.exoscale.models.PublicIpAssignment;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InstancePutRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The labels property
     */
    private Labels labels;
    /**
     * Instance name
     */
    private String name;
    /**
     * The publicIpAssignment property
     */
    private PublicIpAssignment publicIpAssignment;
    /**
     * Instance Cloud-init user-data
     */
    private String userData;
    /**
     * Instantiates a new InstancePutRequestBody and sets the default values.
     */
    public InstancePutRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InstancePutRequestBody
     */
    @jakarta.annotation.Nonnull
    public static InstancePutRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InstancePutRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getObjectValue(Labels::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("public-ip-assignment", (n) -> { this.setPublicIpAssignment(n.getEnumValue(PublicIpAssignment::forValue)); });
        deserializerMap.put("user-data", (n) -> { this.setUserData(n.getStringValue()); });
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
     * Gets the name property value. Instance name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the public-ip-assignment property value. The publicIpAssignment property
     * @return a PublicIpAssignment
     */
    @jakarta.annotation.Nullable
    public PublicIpAssignment getPublicIpAssignment() {
        return this.publicIpAssignment;
    }
    /**
     * Gets the user-data property value. Instance Cloud-init user-data
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserData() {
        return this.userData;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("labels", this.getLabels());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("public-ip-assignment", this.getPublicIpAssignment());
        writer.writeStringValue("user-data", this.getUserData());
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
     * Sets the labels property value. The labels property
     * @param value Value to set for the labels property.
     */
    public void setLabels(@jakarta.annotation.Nullable final Labels value) {
        this.labels = value;
    }
    /**
     * Sets the name property value. Instance name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the public-ip-assignment property value. The publicIpAssignment property
     * @param value Value to set for the public-ip-assignment property.
     */
    public void setPublicIpAssignment(@jakarta.annotation.Nullable final PublicIpAssignment value) {
        this.publicIpAssignment = value;
    }
    /**
     * Sets the user-data property value. Instance Cloud-init user-data
     * @param value Value to set for the user-data property.
     */
    public void setUserData(@jakarta.annotation.Nullable final String value) {
        this.userData = value;
    }
}
