package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * SKS Cluster OpenID config map
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SksOidc implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * OpenID client ID
     */
    private String clientId;
    /**
     * JWT claim to use as the user's group
     */
    private String groupsClaim;
    /**
     * Prefix prepended to group claims
     */
    private String groupsPrefix;
    /**
     * OpenID provider URL
     */
    private String issuerUrl;
    /**
     * A key value map that describes a required claim in the ID Token
     */
    private SksOidcRequiredClaim requiredClaim;
    /**
     * JWT claim to use as the user name
     */
    private String usernameClaim;
    /**
     * Prefix prepended to username claims
     */
    private String usernamePrefix;
    /**
     * Instantiates a new SksOidc and sets the default values.
     */
    public SksOidc() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SksOidc
     */
    @jakarta.annotation.Nonnull
    public static SksOidc createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SksOidc();
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
     * Gets the client-id property value. OpenID client ID
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getClientId() {
        return this.clientId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("client-id", (n) -> { this.setClientId(n.getStringValue()); });
        deserializerMap.put("groups-claim", (n) -> { this.setGroupsClaim(n.getStringValue()); });
        deserializerMap.put("groups-prefix", (n) -> { this.setGroupsPrefix(n.getStringValue()); });
        deserializerMap.put("issuer-url", (n) -> { this.setIssuerUrl(n.getStringValue()); });
        deserializerMap.put("required-claim", (n) -> { this.setRequiredClaim(n.getObjectValue(SksOidcRequiredClaim::createFromDiscriminatorValue)); });
        deserializerMap.put("username-claim", (n) -> { this.setUsernameClaim(n.getStringValue()); });
        deserializerMap.put("username-prefix", (n) -> { this.setUsernamePrefix(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groups-claim property value. JWT claim to use as the user's group
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGroupsClaim() {
        return this.groupsClaim;
    }
    /**
     * Gets the groups-prefix property value. Prefix prepended to group claims
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGroupsPrefix() {
        return this.groupsPrefix;
    }
    /**
     * Gets the issuer-url property value. OpenID provider URL
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIssuerUrl() {
        return this.issuerUrl;
    }
    /**
     * Gets the required-claim property value. A key value map that describes a required claim in the ID Token
     * @return a SksOidcRequiredClaim
     */
    @jakarta.annotation.Nullable
    public SksOidcRequiredClaim getRequiredClaim() {
        return this.requiredClaim;
    }
    /**
     * Gets the username-claim property value. JWT claim to use as the user name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUsernameClaim() {
        return this.usernameClaim;
    }
    /**
     * Gets the username-prefix property value. Prefix prepended to username claims
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUsernamePrefix() {
        return this.usernamePrefix;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("client-id", this.getClientId());
        writer.writeStringValue("groups-claim", this.getGroupsClaim());
        writer.writeStringValue("groups-prefix", this.getGroupsPrefix());
        writer.writeStringValue("issuer-url", this.getIssuerUrl());
        writer.writeObjectValue("required-claim", this.getRequiredClaim());
        writer.writeStringValue("username-claim", this.getUsernameClaim());
        writer.writeStringValue("username-prefix", this.getUsernamePrefix());
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
     * Sets the client-id property value. OpenID client ID
     * @param value Value to set for the client-id property.
     */
    public void setClientId(@jakarta.annotation.Nullable final String value) {
        this.clientId = value;
    }
    /**
     * Sets the groups-claim property value. JWT claim to use as the user's group
     * @param value Value to set for the groups-claim property.
     */
    public void setGroupsClaim(@jakarta.annotation.Nullable final String value) {
        this.groupsClaim = value;
    }
    /**
     * Sets the groups-prefix property value. Prefix prepended to group claims
     * @param value Value to set for the groups-prefix property.
     */
    public void setGroupsPrefix(@jakarta.annotation.Nullable final String value) {
        this.groupsPrefix = value;
    }
    /**
     * Sets the issuer-url property value. OpenID provider URL
     * @param value Value to set for the issuer-url property.
     */
    public void setIssuerUrl(@jakarta.annotation.Nullable final String value) {
        this.issuerUrl = value;
    }
    /**
     * Sets the required-claim property value. A key value map that describes a required claim in the ID Token
     * @param value Value to set for the required-claim property.
     */
    public void setRequiredClaim(@jakarta.annotation.Nullable final SksOidcRequiredClaim value) {
        this.requiredClaim = value;
    }
    /**
     * Sets the username-claim property value. JWT claim to use as the user name
     * @param value Value to set for the username-claim property.
     */
    public void setUsernameClaim(@jakarta.annotation.Nullable final String value) {
        this.usernameClaim = value;
    }
    /**
     * Sets the username-prefix property value. Prefix prepended to username claims
     * @param value Value to set for the username-prefix property.
     */
    public void setUsernamePrefix(@jakarta.annotation.Nullable final String value) {
        this.usernamePrefix = value;
    }
}
