package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Access key resource
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessKeyResource implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Resource domain
     */
    private AccessKeyResourceDomain domain;
    /**
     * Resource name
     */
    private String resourceName;
    /**
     * Resource type
     */
    private AccessKeyResourceResourceType resourceType;
    /**
     * Instantiates a new AccessKeyResource and sets the default values.
     */
    public AccessKeyResource() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessKeyResource
     */
    @jakarta.annotation.Nonnull
    public static AccessKeyResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessKeyResource();
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
     * Gets the domain property value. Resource domain
     * @return a AccessKeyResourceDomain
     */
    @jakarta.annotation.Nullable
    public AccessKeyResourceDomain getDomain() {
        return this.domain;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("domain", (n) -> { this.setDomain(n.getEnumValue(AccessKeyResourceDomain::forValue)); });
        deserializerMap.put("resource-name", (n) -> { this.setResourceName(n.getStringValue()); });
        deserializerMap.put("resource-type", (n) -> { this.setResourceType(n.getEnumValue(AccessKeyResourceResourceType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the resource-name property value. Resource name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceName() {
        return this.resourceName;
    }
    /**
     * Gets the resource-type property value. Resource type
     * @return a AccessKeyResourceResourceType
     */
    @jakarta.annotation.Nullable
    public AccessKeyResourceResourceType getResourceType() {
        return this.resourceType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("domain", this.getDomain());
        writer.writeStringValue("resource-name", this.getResourceName());
        writer.writeEnumValue("resource-type", this.getResourceType());
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
     * Sets the domain property value. Resource domain
     * @param value Value to set for the domain property.
     */
    public void setDomain(@jakarta.annotation.Nullable final AccessKeyResourceDomain value) {
        this.domain = value;
    }
    /**
     * Sets the resource-name property value. Resource name
     * @param value Value to set for the resource-name property.
     */
    public void setResourceName(@jakarta.annotation.Nullable final String value) {
        this.resourceName = value;
    }
    /**
     * Sets the resource-type property value. Resource type
     * @param value Value to set for the resource-type property.
     */
    public void setResourceType(@jakarta.annotation.Nullable final AccessKeyResourceResourceType value) {
        this.resourceType = value;
    }
}
