package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JsonSchemaOpensearchEmailSender implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This should be identical to the Sender name defined in Opensearch dashboards
     */
    private String emailSenderName;
    /**
     * Sender password for Opensearch alerts to authenticate with SMTP server
     */
    private String emailSenderPassword;
    /**
     * The email_sender_username property
     */
    private String emailSenderUsername;
    /**
     * Instantiates a new JsonSchemaOpensearchEmailSender and sets the default values.
     */
    public JsonSchemaOpensearchEmailSender() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JsonSchemaOpensearchEmailSender
     */
    @jakarta.annotation.Nonnull
    public static JsonSchemaOpensearchEmailSender createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JsonSchemaOpensearchEmailSender();
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
     * Gets the email_sender_name property value. This should be identical to the Sender name defined in Opensearch dashboards
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmailSenderName() {
        return this.emailSenderName;
    }
    /**
     * Gets the email_sender_password property value. Sender password for Opensearch alerts to authenticate with SMTP server
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmailSenderPassword() {
        return this.emailSenderPassword;
    }
    /**
     * Gets the email_sender_username property value. The email_sender_username property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmailSenderUsername() {
        return this.emailSenderUsername;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("email_sender_name", (n) -> { this.setEmailSenderName(n.getStringValue()); });
        deserializerMap.put("email_sender_password", (n) -> { this.setEmailSenderPassword(n.getStringValue()); });
        deserializerMap.put("email_sender_username", (n) -> { this.setEmailSenderUsername(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("email_sender_name", this.getEmailSenderName());
        writer.writeStringValue("email_sender_password", this.getEmailSenderPassword());
        writer.writeStringValue("email_sender_username", this.getEmailSenderUsername());
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
     * Sets the email_sender_name property value. This should be identical to the Sender name defined in Opensearch dashboards
     * @param value Value to set for the email_sender_name property.
     */
    public void setEmailSenderName(@jakarta.annotation.Nullable final String value) {
        this.emailSenderName = value;
    }
    /**
     * Sets the email_sender_password property value. Sender password for Opensearch alerts to authenticate with SMTP server
     * @param value Value to set for the email_sender_password property.
     */
    public void setEmailSenderPassword(@jakarta.annotation.Nullable final String value) {
        this.emailSenderPassword = value;
    }
    /**
     * Sets the email_sender_username property value. The email_sender_username property
     * @param value Value to set for the email_sender_username property.
     */
    public void setEmailSenderUsername(@jakarta.annotation.Nullable final String value) {
        this.emailSenderUsername = value;
    }
}
