package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Policy
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IamPolicy implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * IAM default service strategy
     */
    private IamPolicyDefaultServiceStrategy defaultServiceStrategy;
    /**
     * IAM services
     */
    private IamPolicyServices services;
    /**
     * Instantiates a new IamPolicy and sets the default values.
     */
    public IamPolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IamPolicy
     */
    @jakarta.annotation.Nonnull
    public static IamPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IamPolicy();
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
     * Gets the default-service-strategy property value. IAM default service strategy
     * @return a IamPolicyDefaultServiceStrategy
     */
    @jakarta.annotation.Nullable
    public IamPolicyDefaultServiceStrategy getDefaultServiceStrategy() {
        return this.defaultServiceStrategy;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("default-service-strategy", (n) -> { this.setDefaultServiceStrategy(n.getEnumValue(IamPolicyDefaultServiceStrategy::forValue)); });
        deserializerMap.put("services", (n) -> { this.setServices(n.getObjectValue(IamPolicyServices::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the services property value. IAM services
     * @return a IamPolicyServices
     */
    @jakarta.annotation.Nullable
    public IamPolicyServices getServices() {
        return this.services;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("default-service-strategy", this.getDefaultServiceStrategy());
        writer.writeObjectValue("services", this.getServices());
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
     * Sets the default-service-strategy property value. IAM default service strategy
     * @param value Value to set for the default-service-strategy property.
     */
    public void setDefaultServiceStrategy(@jakarta.annotation.Nullable final IamPolicyDefaultServiceStrategy value) {
        this.defaultServiceStrategy = value;
    }
    /**
     * Sets the services property value. IAM services
     * @param value Value to set for the services property.
     */
    public void setServices(@jakarta.annotation.Nullable final IamPolicyServices value) {
        this.services = value;
    }
}
