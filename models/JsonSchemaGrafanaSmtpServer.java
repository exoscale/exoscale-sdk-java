package com.exoscale.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JsonSchemaGrafanaSmtpServer implements Parsable {
    /**
     * The from_address property
     */
    private String fromAddress;
    /**
     * The from_name property
     */
    private String fromName;
    /**
     * The host property
     */
    private String host;
    /**
     * The password property
     */
    private String password;
    /**
     * The port property
     */
    private Integer port;
    /**
     * The skip_verify property
     */
    private Boolean skipVerify;
    /**
     * The starttls_policy property
     */
    private JsonSchemaGrafanaSmtpServerStarttlsPolicy starttlsPolicy;
    /**
     * The username property
     */
    private String username;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JsonSchemaGrafanaSmtpServer
     */
    @jakarta.annotation.Nonnull
    public static JsonSchemaGrafanaSmtpServer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JsonSchemaGrafanaSmtpServer();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("from_address", (n) -> { this.setFromAddress(n.getStringValue()); });
        deserializerMap.put("from_name", (n) -> { this.setFromName(n.getStringValue()); });
        deserializerMap.put("host", (n) -> { this.setHost(n.getStringValue()); });
        deserializerMap.put("password", (n) -> { this.setPassword(n.getStringValue()); });
        deserializerMap.put("port", (n) -> { this.setPort(n.getIntegerValue()); });
        deserializerMap.put("skip_verify", (n) -> { this.setSkipVerify(n.getBooleanValue()); });
        deserializerMap.put("starttls_policy", (n) -> { this.setStarttlsPolicy(n.getEnumValue(JsonSchemaGrafanaSmtpServerStarttlsPolicy::forValue)); });
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the from_address property value. The from_address property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFromAddress() {
        return this.fromAddress;
    }
    /**
     * Gets the from_name property value. The from_name property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFromName() {
        return this.fromName;
    }
    /**
     * Gets the host property value. The host property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHost() {
        return this.host;
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
     * Gets the port property value. The port property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPort() {
        return this.port;
    }
    /**
     * Gets the skip_verify property value. The skip_verify property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSkipVerify() {
        return this.skipVerify;
    }
    /**
     * Gets the starttls_policy property value. The starttls_policy property
     * @return a JsonSchemaGrafanaSmtpServerStarttlsPolicy
     */
    @jakarta.annotation.Nullable
    public JsonSchemaGrafanaSmtpServerStarttlsPolicy getStarttlsPolicy() {
        return this.starttlsPolicy;
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
        writer.writeStringValue("from_address", this.getFromAddress());
        writer.writeStringValue("from_name", this.getFromName());
        writer.writeStringValue("host", this.getHost());
        writer.writeStringValue("password", this.getPassword());
        writer.writeIntegerValue("port", this.getPort());
        writer.writeBooleanValue("skip_verify", this.getSkipVerify());
        writer.writeEnumValue("starttls_policy", this.getStarttlsPolicy());
        writer.writeStringValue("username", this.getUsername());
    }
    /**
     * Sets the from_address property value. The from_address property
     * @param value Value to set for the from_address property.
     */
    public void setFromAddress(@jakarta.annotation.Nullable final String value) {
        this.fromAddress = value;
    }
    /**
     * Sets the from_name property value. The from_name property
     * @param value Value to set for the from_name property.
     */
    public void setFromName(@jakarta.annotation.Nullable final String value) {
        this.fromName = value;
    }
    /**
     * Sets the host property value. The host property
     * @param value Value to set for the host property.
     */
    public void setHost(@jakarta.annotation.Nullable final String value) {
        this.host = value;
    }
    /**
     * Sets the password property value. The password property
     * @param value Value to set for the password property.
     */
    public void setPassword(@jakarta.annotation.Nullable final String value) {
        this.password = value;
    }
    /**
     * Sets the port property value. The port property
     * @param value Value to set for the port property.
     */
    public void setPort(@jakarta.annotation.Nullable final Integer value) {
        this.port = value;
    }
    /**
     * Sets the skip_verify property value. The skip_verify property
     * @param value Value to set for the skip_verify property.
     */
    public void setSkipVerify(@jakarta.annotation.Nullable final Boolean value) {
        this.skipVerify = value;
    }
    /**
     * Sets the starttls_policy property value. The starttls_policy property
     * @param value Value to set for the starttls_policy property.
     */
    public void setStarttlsPolicy(@jakarta.annotation.Nullable final JsonSchemaGrafanaSmtpServerStarttlsPolicy value) {
        this.starttlsPolicy = value;
    }
    /**
     * Sets the username property value. The username property
     * @param value Value to set for the username property.
     */
    public void setUsername(@jakarta.annotation.Nullable final String value) {
        this.username = value;
    }
}
