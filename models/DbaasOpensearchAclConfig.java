package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasOpensearchAclConfig implements AdditionalDataHolder, Parsable {
    /**
     * Enable OpenSearch ACLs. When disabled authenticated service users have unrestricted access.
     */
    private Boolean aclEnabled;
    /**
     * List of OpenSearch ACLs
     */
    private java.util.List<DbaasOpensearchAclConfigAcls> acls;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Enable to enforce index rules in a limited fashion for requests that use the _mget, _msearch, and _bulk APIs
     */
    private Boolean extendedAclEnabled;
    /**
     * Instantiates a new DbaasOpensearchAclConfig and sets the default values.
     */
    public DbaasOpensearchAclConfig() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasOpensearchAclConfig
     */
    @jakarta.annotation.Nonnull
    public static DbaasOpensearchAclConfig createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasOpensearchAclConfig();
    }
    /**
     * Gets the acl-enabled property value. Enable OpenSearch ACLs. When disabled authenticated service users have unrestricted access.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAclEnabled() {
        return this.aclEnabled;
    }
    /**
     * Gets the acls property value. List of OpenSearch ACLs
     * @return a java.util.List<DbaasOpensearchAclConfigAcls>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DbaasOpensearchAclConfigAcls> getAcls() {
        return this.acls;
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
     * Gets the extended-acl-enabled property value. Enable to enforce index rules in a limited fashion for requests that use the _mget, _msearch, and _bulk APIs
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getExtendedAclEnabled() {
        return this.extendedAclEnabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("acl-enabled", (n) -> { this.setAclEnabled(n.getBooleanValue()); });
        deserializerMap.put("acls", (n) -> { this.setAcls(n.getCollectionOfObjectValues(DbaasOpensearchAclConfigAcls::createFromDiscriminatorValue)); });
        deserializerMap.put("extended-acl-enabled", (n) -> { this.setExtendedAclEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("acl-enabled", this.getAclEnabled());
        writer.writeCollectionOfObjectValues("acls", this.getAcls());
        writer.writeBooleanValue("extended-acl-enabled", this.getExtendedAclEnabled());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the acl-enabled property value. Enable OpenSearch ACLs. When disabled authenticated service users have unrestricted access.
     * @param value Value to set for the acl-enabled property.
     */
    public void setAclEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.aclEnabled = value;
    }
    /**
     * Sets the acls property value. List of OpenSearch ACLs
     * @param value Value to set for the acls property.
     */
    public void setAcls(@jakarta.annotation.Nullable final java.util.List<DbaasOpensearchAclConfigAcls> value) {
        this.acls = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the extended-acl-enabled property value. Enable to enforce index rules in a limited fashion for requests that use the _mget, _msearch, and _bulk APIs
     * @param value Value to set for the extended-acl-enabled property.
     */
    public void setExtendedAclEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.extendedAclEnabled = value;
    }
}
