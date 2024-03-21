package com.exoscale.template;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TemplatePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Boot mode (default: legacy)
     */
    private TemplatePostRequestBodyBootMode bootMode;
    /**
     * Template build
     */
    private String build;
    /**
     * Template MD5 checksum
     */
    private String checksum;
    /**
     * Template default user
     */
    private String defaultUser;
    /**
     * Template description
     */
    private String description;
    /**
     * Template maintainer
     */
    private String maintainer;
    /**
     * Template name
     */
    private String name;
    /**
     * Enable password-based login
     */
    private Boolean passwordEnabled;
    /**
     * Template size
     */
    private Long size;
    /**
     * Enable SSH key-based login
     */
    private Boolean sshKeyEnabled;
    /**
     * Template source URL
     */
    private String url;
    /**
     * Template version
     */
    private String version;
    /**
     * Instantiates a new TemplatePostRequestBody and sets the default values.
     */
    public TemplatePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TemplatePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static TemplatePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TemplatePostRequestBody();
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
     * Gets the boot-mode property value. Boot mode (default: legacy)
     * @return a TemplatePostRequestBodyBootMode
     */
    @jakarta.annotation.Nullable
    public TemplatePostRequestBodyBootMode getBootMode() {
        return this.bootMode;
    }
    /**
     * Gets the build property value. Template build
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBuild() {
        return this.build;
    }
    /**
     * Gets the checksum property value. Template MD5 checksum
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getChecksum() {
        return this.checksum;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("boot-mode", (n) -> { this.setBootMode(n.getEnumValue(TemplatePostRequestBodyBootMode::forValue)); });
        deserializerMap.put("build", (n) -> { this.setBuild(n.getStringValue()); });
        deserializerMap.put("checksum", (n) -> { this.setChecksum(n.getStringValue()); });
        deserializerMap.put("default-user", (n) -> { this.setDefaultUser(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("maintainer", (n) -> { this.setMaintainer(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("password-enabled", (n) -> { this.setPasswordEnabled(n.getBooleanValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getLongValue()); });
        deserializerMap.put("ssh-key-enabled", (n) -> { this.setSshKeyEnabled(n.getBooleanValue()); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maintainer property value. Template maintainer
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMaintainer() {
        return this.maintainer;
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
     * Gets the password-enabled property value. Enable password-based login
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordEnabled() {
        return this.passwordEnabled;
    }
    /**
     * Gets the size property value. Template size
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSize() {
        return this.size;
    }
    /**
     * Gets the ssh-key-enabled property value. Enable SSH key-based login
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSshKeyEnabled() {
        return this.sshKeyEnabled;
    }
    /**
     * Gets the url property value. Template source URL
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.url;
    }
    /**
     * Gets the version property value. Template version
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("boot-mode", this.getBootMode());
        writer.writeStringValue("build", this.getBuild());
        writer.writeStringValue("checksum", this.getChecksum());
        writer.writeStringValue("default-user", this.getDefaultUser());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("maintainer", this.getMaintainer());
        writer.writeStringValue("name", this.getName());
        writer.writeBooleanValue("password-enabled", this.getPasswordEnabled());
        writer.writeLongValue("size", this.getSize());
        writer.writeBooleanValue("ssh-key-enabled", this.getSshKeyEnabled());
        writer.writeStringValue("url", this.getUrl());
        writer.writeStringValue("version", this.getVersion());
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
     * Sets the boot-mode property value. Boot mode (default: legacy)
     * @param value Value to set for the boot-mode property.
     */
    public void setBootMode(@jakarta.annotation.Nullable final TemplatePostRequestBodyBootMode value) {
        this.bootMode = value;
    }
    /**
     * Sets the build property value. Template build
     * @param value Value to set for the build property.
     */
    public void setBuild(@jakarta.annotation.Nullable final String value) {
        this.build = value;
    }
    /**
     * Sets the checksum property value. Template MD5 checksum
     * @param value Value to set for the checksum property.
     */
    public void setChecksum(@jakarta.annotation.Nullable final String value) {
        this.checksum = value;
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
     * Sets the maintainer property value. Template maintainer
     * @param value Value to set for the maintainer property.
     */
    public void setMaintainer(@jakarta.annotation.Nullable final String value) {
        this.maintainer = value;
    }
    /**
     * Sets the name property value. Template name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the password-enabled property value. Enable password-based login
     * @param value Value to set for the password-enabled property.
     */
    public void setPasswordEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.passwordEnabled = value;
    }
    /**
     * Sets the size property value. Template size
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Long value) {
        this.size = value;
    }
    /**
     * Sets the ssh-key-enabled property value. Enable SSH key-based login
     * @param value Value to set for the ssh-key-enabled property.
     */
    public void setSshKeyEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.sshKeyEnabled = value;
    }
    /**
     * Sets the url property value. Template source URL
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.url = value;
    }
    /**
     * Sets the version property value. Template version
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.version = value;
    }
}
