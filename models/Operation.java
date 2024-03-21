package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * Operation
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Operation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Operation ID
     */
    private UUID id;
    /**
     * Operation message
     */
    private String message;
    /**
     * Operation failure reason
     */
    private OperationReason reason;
    /**
     * Related resource reference
     */
    private OperationReference reference;
    /**
     * Operation status
     */
    private OperationState state;
    /**
     * Instantiates a new Operation and sets the default values.
     */
    public Operation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Operation
     */
    @jakarta.annotation.Nonnull
    public static Operation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Operation();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getEnumValue(OperationReason::forValue)); });
        deserializerMap.put("reference", (n) -> { this.setReference(n.getObjectValue(OperationReference::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(OperationState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Operation ID
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.id;
    }
    /**
     * Gets the message property value. Operation message
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the reason property value. Operation failure reason
     * @return a OperationReason
     */
    @jakarta.annotation.Nullable
    public OperationReason getReason() {
        return this.reason;
    }
    /**
     * Gets the reference property value. Related resource reference
     * @return a OperationReference
     */
    @jakarta.annotation.Nullable
    public OperationReference getReference() {
        return this.reference;
    }
    /**
     * Gets the state property value. Operation status
     * @return a OperationState
     */
    @jakarta.annotation.Nullable
    public OperationState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
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
     * Sets the id property value. Operation ID
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the message property value. Operation message
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the reason property value. Operation failure reason
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final OperationReason value) {
        this.reason = value;
    }
    /**
     * Sets the reference property value. Related resource reference
     * @param value Value to set for the reference property.
     */
    public void setReference(@jakarta.annotation.Nullable final OperationReference value) {
        this.reference = value;
    }
    /**
     * Sets the state property value. Operation status
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final OperationState value) {
        this.state = value;
    }
}
