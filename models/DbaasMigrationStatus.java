package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasMigrationStatus implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Migration status per database
     */
    private java.util.List<DbaasMigrationStatusDetails> details;
    /**
     * Error message in case that migration has failed
     */
    private String error;
    /**
     * Redis only: how many seconds since last I/O with redis master
     */
    private Long masterLastIoSecondsAgo;
    /**
     * The masterLinkStatus property
     */
    private EnumMasterLinkStatus masterLinkStatus;
    /**
     * Migration method. Empty in case of multiple methods or error
     */
    private String method;
    /**
     * Migration status
     */
    private String status;
    /**
     * Instantiates a new DbaasMigrationStatus and sets the default values.
     */
    public DbaasMigrationStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasMigrationStatus
     */
    @jakarta.annotation.Nonnull
    public static DbaasMigrationStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasMigrationStatus();
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
     * Gets the details property value. Migration status per database
     * @return a java.util.List<DbaasMigrationStatusDetails>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DbaasMigrationStatusDetails> getDetails() {
        return this.details;
    }
    /**
     * Gets the error property value. Error message in case that migration has failed
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getError() {
        return this.error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("details", (n) -> { this.setDetails(n.getCollectionOfObjectValues(DbaasMigrationStatusDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("error", (n) -> { this.setError(n.getStringValue()); });
        deserializerMap.put("master-last-io-seconds-ago", (n) -> { this.setMasterLastIoSecondsAgo(n.getLongValue()); });
        deserializerMap.put("master-link-status", (n) -> { this.setMasterLinkStatus(n.getEnumValue(EnumMasterLinkStatus::forValue)); });
        deserializerMap.put("method", (n) -> { this.setMethod(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the master-last-io-seconds-ago property value. Redis only: how many seconds since last I/O with redis master
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getMasterLastIoSecondsAgo() {
        return this.masterLastIoSecondsAgo;
    }
    /**
     * Gets the master-link-status property value. The masterLinkStatus property
     * @return a EnumMasterLinkStatus
     */
    @jakarta.annotation.Nullable
    public EnumMasterLinkStatus getMasterLinkStatus() {
        return this.masterLinkStatus;
    }
    /**
     * Gets the method property value. Migration method. Empty in case of multiple methods or error
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMethod() {
        return this.method;
    }
    /**
     * Gets the status property value. Migration status
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("details", this.getDetails());
        writer.writeStringValue("error", this.getError());
        writer.writeLongValue("master-last-io-seconds-ago", this.getMasterLastIoSecondsAgo());
        writer.writeEnumValue("master-link-status", this.getMasterLinkStatus());
        writer.writeStringValue("method", this.getMethod());
        writer.writeStringValue("status", this.getStatus());
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
     * Sets the details property value. Migration status per database
     * @param value Value to set for the details property.
     */
    public void setDetails(@jakarta.annotation.Nullable final java.util.List<DbaasMigrationStatusDetails> value) {
        this.details = value;
    }
    /**
     * Sets the error property value. Error message in case that migration has failed
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final String value) {
        this.error = value;
    }
    /**
     * Sets the master-last-io-seconds-ago property value. Redis only: how many seconds since last I/O with redis master
     * @param value Value to set for the master-last-io-seconds-ago property.
     */
    public void setMasterLastIoSecondsAgo(@jakarta.annotation.Nullable final Long value) {
        this.masterLastIoSecondsAgo = value;
    }
    /**
     * Sets the master-link-status property value. The masterLinkStatus property
     * @param value Value to set for the master-link-status property.
     */
    public void setMasterLinkStatus(@jakarta.annotation.Nullable final EnumMasterLinkStatus value) {
        this.masterLinkStatus = value;
    }
    /**
     * Sets the method property value. Migration method. Empty in case of multiple methods or error
     * @param value Value to set for the method property.
     */
    public void setMethod(@jakarta.annotation.Nullable final String value) {
        this.method = value;
    }
    /**
     * Sets the status property value. Migration status
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
}
