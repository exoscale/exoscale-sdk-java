package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasServiceKafkaUsers implements AdditionalDataHolder, Parsable {
    /**
     * The accessCert property
     */
    private String accessCert;
    /**
     * The accessCertExpiry property
     */
    private OffsetDateTime accessCertExpiry;
    /**
     * The accessKey property
     */
    private String accessKey;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The password property
     */
    private String password;
    /**
     * The type property
     */
    private String type;
    /**
     * The username property
     */
    private String username;
    /**
     * Instantiates a new DbaasServiceKafkaUsers and sets the default values.
     */
    public DbaasServiceKafkaUsers() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasServiceKafkaUsers
     */
    @jakarta.annotation.Nonnull
    public static DbaasServiceKafkaUsers createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasServiceKafkaUsers();
    }
    /**
     * Gets the access-cert property value. The accessCert property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccessCert() {
        return this.accessCert;
    }
    /**
     * Gets the access-cert-expiry property value. The accessCertExpiry property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAccessCertExpiry() {
        return this.accessCertExpiry;
    }
    /**
     * Gets the access-key property value. The accessKey property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccessKey() {
        return this.accessKey;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("access-cert", (n) -> { this.setAccessCert(n.getStringValue()); });
        deserializerMap.put("access-cert-expiry", (n) -> { this.setAccessCertExpiry(n.getOffsetDateTimeValue()); });
        deserializerMap.put("access-key", (n) -> { this.setAccessKey(n.getStringValue()); });
        deserializerMap.put("password", (n) -> { this.setPassword(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the password property value. The password property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPassword() {
        return this.password;
    }
    /**
     * Gets the type property value. The type property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Gets the username property value. The username property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUsername() {
        return this.username;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("access-cert", this.getAccessCert());
        writer.writeOffsetDateTimeValue("access-cert-expiry", this.getAccessCertExpiry());
        writer.writeStringValue("access-key", this.getAccessKey());
        writer.writeStringValue("password", this.getPassword());
        writer.writeStringValue("type", this.getType());
        writer.writeStringValue("username", this.getUsername());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the access-cert property value. The accessCert property
     * @param value Value to set for the access-cert property.
     */
    public void setAccessCert(@jakarta.annotation.Nullable final String value) {
        this.accessCert = value;
    }
    /**
     * Sets the access-cert-expiry property value. The accessCertExpiry property
     * @param value Value to set for the access-cert-expiry property.
     */
    public void setAccessCertExpiry(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.accessCertExpiry = value;
    }
    /**
     * Sets the access-key property value. The accessKey property
     * @param value Value to set for the access-key property.
     */
    public void setAccessKey(@jakarta.annotation.Nullable final String value) {
        this.accessKey = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the password property value. The password property
     * @param value Value to set for the password property.
     */
    public void setPassword(@jakarta.annotation.Nullable final String value) {
        this.password = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
    /**
     * Sets the username property value. The username property
     * @param value Value to set for the username property.
     */
    public void setUsername(@jakarta.annotation.Nullable final String value) {
        this.username = value;
    }
}
