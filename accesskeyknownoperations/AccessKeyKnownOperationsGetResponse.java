package com.exoscale.accesskeyknownoperations;

import com.exoscale.models.AccessKeyOperation;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessKeyKnownOperationsGetResponse implements AdditionalDataHolder, Parsable {
    /**
     * The accessKeyOperations property
     */
    private java.util.List<AccessKeyOperation> accessKeyOperations;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Instantiates a new AccessKeyKnownOperationsGetResponse and sets the default values.
     */
    public AccessKeyKnownOperationsGetResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessKeyKnownOperationsGetResponse
     */
    @jakarta.annotation.Nonnull
    public static AccessKeyKnownOperationsGetResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessKeyKnownOperationsGetResponse();
    }
    /**
     * Gets the access-key-operations property value. The accessKeyOperations property
     * @return a java.util.List<AccessKeyOperation>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessKeyOperation> getAccessKeyOperations() {
        return this.accessKeyOperations;
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
        deserializerMap.put("access-key-operations", (n) -> { this.setAccessKeyOperations(n.getCollectionOfObjectValues(AccessKeyOperation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("access-key-operations", this.getAccessKeyOperations());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the access-key-operations property value. The accessKeyOperations property
     * @param value Value to set for the access-key-operations property.
     */
    public void setAccessKeyOperations(@jakarta.annotation.Nullable final java.util.List<AccessKeyOperation> value) {
        this.accessKeyOperations = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
}
