package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Automatic maintenance settings
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasNodeState implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Name of the service node
     */
    private String name;
    /**
     * Extra information regarding the progress for current state
     */
    private java.util.List<DbaasNodeStateProgressUpdate> progressUpdates;
    /**
     * Role of this node. Only returned for a subset of service types
     */
    private DbaasNodeStateRole role;
    /**
     * Current state of the service node
     */
    private DbaasNodeStateState state;
    /**
     * Instantiates a new DbaasNodeState and sets the default values.
     */
    public DbaasNodeState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasNodeState
     */
    @jakarta.annotation.Nonnull
    public static DbaasNodeState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasNodeState();
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
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("progress-updates", (n) -> { this.setProgressUpdates(n.getCollectionOfObjectValues(DbaasNodeStateProgressUpdate::createFromDiscriminatorValue)); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(DbaasNodeStateRole::forValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(DbaasNodeStateState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Name of the service node
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the progress-updates property value. Extra information regarding the progress for current state
     * @return a java.util.List<DbaasNodeStateProgressUpdate>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DbaasNodeStateProgressUpdate> getProgressUpdates() {
        return this.progressUpdates;
    }
    /**
     * Gets the role property value. Role of this node. Only returned for a subset of service types
     * @return a DbaasNodeStateRole
     */
    @jakarta.annotation.Nullable
    public DbaasNodeStateRole getRole() {
        return this.role;
    }
    /**
     * Gets the state property value. Current state of the service node
     * @return a DbaasNodeStateState
     */
    @jakarta.annotation.Nullable
    public DbaasNodeStateState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("progress-updates", this.getProgressUpdates());
        writer.writeEnumValue("role", this.getRole());
        writer.writeEnumValue("state", this.getState());
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
     * Sets the name property value. Name of the service node
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the progress-updates property value. Extra information regarding the progress for current state
     * @param value Value to set for the progress-updates property.
     */
    public void setProgressUpdates(@jakarta.annotation.Nullable final java.util.List<DbaasNodeStateProgressUpdate> value) {
        this.progressUpdates = value;
    }
    /**
     * Sets the role property value. Role of this node. Only returned for a subset of service types
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final DbaasNodeStateRole value) {
        this.role = value;
    }
    /**
     * Sets the state property value. Current state of the service node
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final DbaasNodeStateState value) {
        this.state = value;
    }
}
