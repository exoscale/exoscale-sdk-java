package com.exoscale.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JsonSchemaGrafanaAuthGoogle implements Parsable {
    /**
     * The allowed_domains property
     */
    private java.util.List<String> allowedDomains;
    /**
     * The allow_sign_up property
     */
    private Boolean allowSignUp;
    /**
     * The client_id property
     */
    private String clientId;
    /**
     * The client_secret property
     */
    private String clientSecret;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JsonSchemaGrafanaAuthGoogle
     */
    @jakarta.annotation.Nonnull
    public static JsonSchemaGrafanaAuthGoogle createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JsonSchemaGrafanaAuthGoogle();
    }
    /**
     * Gets the allowed_domains property value. The allowed_domains property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedDomains() {
        return this.allowedDomains;
    }
    /**
     * Gets the allow_sign_up property value. The allow_sign_up property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowSignUp() {
        return this.allowSignUp;
    }
    /**
     * Gets the client_id property value. The client_id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getClientId() {
        return this.clientId;
    }
    /**
     * Gets the client_secret property value. The client_secret property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getClientSecret() {
        return this.clientSecret;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("allowed_domains", (n) -> { this.setAllowedDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("allow_sign_up", (n) -> { this.setAllowSignUp(n.getBooleanValue()); });
        deserializerMap.put("client_id", (n) -> { this.setClientId(n.getStringValue()); });
        deserializerMap.put("client_secret", (n) -> { this.setClientSecret(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("allowed_domains", this.getAllowedDomains());
        writer.writeBooleanValue("allow_sign_up", this.getAllowSignUp());
        writer.writeStringValue("client_id", this.getClientId());
        writer.writeStringValue("client_secret", this.getClientSecret());
    }
    /**
     * Sets the allowed_domains property value. The allowed_domains property
     * @param value Value to set for the allowed_domains property.
     */
    public void setAllowedDomains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.allowedDomains = value;
    }
    /**
     * Sets the allow_sign_up property value. The allow_sign_up property
     * @param value Value to set for the allow_sign_up property.
     */
    public void setAllowSignUp(@jakarta.annotation.Nullable final Boolean value) {
        this.allowSignUp = value;
    }
    /**
     * Sets the client_id property value. The client_id property
     * @param value Value to set for the client_id property.
     */
    public void setClientId(@jakarta.annotation.Nullable final String value) {
        this.clientId = value;
    }
    /**
     * Sets the client_secret property value. The client_secret property
     * @param value Value to set for the client_secret property.
     */
    public void setClientSecret(@jakarta.annotation.Nullable final String value) {
        this.clientSecret = value;
    }
}
