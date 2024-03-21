package com.exoscale.snapshot.withidpromote;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithIdPromotePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Template default user
     */
    private String defaultUser;
    /**
     * Template description
     */
    private String description;
    /**
     * Template name
     */
    private String name;
    /**
     * Enable password-based login in the template
     */
    private Boolean passwordEnabled;
    /**
     * Enable SSH key-based login in the template
     */
    private Boolean sshKeyEnabled;
    /**
     * Instantiates a new WithIdPromotePostRequestBody and sets the default values.
     */
    public WithIdPromotePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WithIdPromotePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static WithIdPromotePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WithIdPromotePostRequestBody();
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
     * Gets the default-user property value. Template default user
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefaultUser() {
        return this.defaultUser;
    }
    /**
     * Gets the description property value. Template description
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("default-user", (n) -> { this.setDefaultUser(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("password-enabled", (n) -> { this.setPasswordEnabled(n.getBooleanValue()); });
        deserializerMap.put("ssh-key-enabled", (n) -> { this.setSshKeyEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Template name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the password-enabled property value. Enable password-based login in the template
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordEnabled() {
        return this.passwordEnabled;
    }
    /**
     * Gets the ssh-key-enabled property value. Enable SSH key-based login in the template
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSshKeyEnabled() {
        return this.sshKeyEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("default-user", this.getDefaultUser());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("name", this.getName());
        writer.writeBooleanValue("password-enabled", this.getPasswordEnabled());
        writer.writeBooleanValue("ssh-key-enabled", this.getSshKeyEnabled());
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
     * Sets the default-user property value. Template default user
     * @param value Value to set for the default-user property.
     */
    public void setDefaultUser(@jakarta.annotation.Nullable final String value) {
        this.defaultUser = value;
    }
    /**
     * Sets the description property value. Template description
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the name property value. Template name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the password-enabled property value. Enable password-based login in the template
     * @param value Value to set for the password-enabled property.
     */
    public void setPasswordEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.passwordEnabled = value;
    }
    /**
     * Sets the ssh-key-enabled property value. Enable SSH key-based login in the template
     * @param value Value to set for the ssh-key-enabled property.
     */
    public void setSshKeyEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.sshKeyEnabled = value;
    }
}
