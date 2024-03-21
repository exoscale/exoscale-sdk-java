package com.exoscale.accesskey;

import com.exoscale.models.AccessKey;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessKeyGetResponse implements AdditionalDataHolder, Parsable {
    /**
     * The accessKeys property
     */
    private java.util.List<AccessKey> accessKeys;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Instantiates a new AccessKeyGetResponse and sets the default values.
     */
    public AccessKeyGetResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessKeyGetResponse
     */
    @jakarta.annotation.Nonnull
    public static AccessKeyGetResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessKeyGetResponse();
    }
    /**
     * Gets the access-keys property value. The accessKeys property
     * @return a java.util.List<AccessKey>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessKey> getAccessKeys() {
        return this.accessKeys;
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
        deserializerMap.put("access-keys", (n) -> { this.setAccessKeys(n.getCollectionOfObjectValues(AccessKey::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("access-keys", this.getAccessKeys());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the access-keys property value. The accessKeys property
     * @param value Value to set for the access-keys property.
     */
    public void setAccessKeys(@jakarta.annotation.Nullable final java.util.List<AccessKey> value) {
        this.accessKeys = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
}
