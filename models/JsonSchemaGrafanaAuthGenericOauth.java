package com.exoscale.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JsonSchemaGrafanaAuthGenericOauth implements Parsable {
    /**
     * The allowed_domains property
     */
    private java.util.List<String> allowedDomains;
    /**
     * The allowed_organizations property
     */
    private java.util.List<String> allowedOrganizations;
    /**
     * The allow_sign_up property
     */
    private Boolean allowSignUp;
    /**
     * The api_url property
     */
    private String apiUrl;
    /**
     * The auth_url property
     */
    private String authUrl;
    /**
     * The auto_login property
     */
    private Boolean autoLogin;
    /**
     * The client_id property
     */
    private String clientId;
    /**
     * The client_secret property
     */
    private String clientSecret;
    /**
     * The name property
     */
    private String name;
    /**
     * The scopes property
     */
    private java.util.List<String> scopes;
    /**
     * The token_url property
     */
    private String tokenUrl;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JsonSchemaGrafanaAuthGenericOauth
     */
    @jakarta.annotation.Nonnull
    public static JsonSchemaGrafanaAuthGenericOauth createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JsonSchemaGrafanaAuthGenericOauth();
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
     * Gets the allowed_organizations property value. The allowed_organizations property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedOrganizations() {
        return this.allowedOrganizations;
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
     * Gets the api_url property value. The api_url property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getApiUrl() {
        return this.apiUrl;
    }
    /**
     * Gets the auth_url property value. The auth_url property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAuthUrl() {
        return this.authUrl;
    }
    /**
     * Gets the auto_login property value. The auto_login property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoLogin() {
        return this.autoLogin;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("allowed_domains", (n) -> { this.setAllowedDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("allowed_organizations", (n) -> { this.setAllowedOrganizations(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("allow_sign_up", (n) -> { this.setAllowSignUp(n.getBooleanValue()); });
        deserializerMap.put("api_url", (n) -> { this.setApiUrl(n.getStringValue()); });
        deserializerMap.put("auth_url", (n) -> { this.setAuthUrl(n.getStringValue()); });
        deserializerMap.put("auto_login", (n) -> { this.setAutoLogin(n.getBooleanValue()); });
        deserializerMap.put("client_id", (n) -> { this.setClientId(n.getStringValue()); });
        deserializerMap.put("client_secret", (n) -> { this.setClientSecret(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("scopes", (n) -> { this.setScopes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("token_url", (n) -> { this.setTokenUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the scopes property value. The scopes property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getScopes() {
        return this.scopes;
    }
    /**
     * Gets the token_url property value. The token_url property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTokenUrl() {
        return this.tokenUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("allowed_domains", this.getAllowedDomains());
        writer.writeCollectionOfPrimitiveValues("allowed_organizations", this.getAllowedOrganizations());
        writer.writeBooleanValue("allow_sign_up", this.getAllowSignUp());
        writer.writeStringValue("api_url", this.getApiUrl());
        writer.writeStringValue("auth_url", this.getAuthUrl());
        writer.writeBooleanValue("auto_login", this.getAutoLogin());
        writer.writeStringValue("client_id", this.getClientId());
        writer.writeStringValue("client_secret", this.getClientSecret());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfPrimitiveValues("scopes", this.getScopes());
        writer.writeStringValue("token_url", this.getTokenUrl());
    }
    /**
     * Sets the allowed_domains property value. The allowed_domains property
     * @param value Value to set for the allowed_domains property.
     */
    public void setAllowedDomains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.allowedDomains = value;
    }
    /**
     * Sets the allowed_organizations property value. The allowed_organizations property
     * @param value Value to set for the allowed_organizations property.
     */
    public void setAllowedOrganizations(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.allowedOrganizations = value;
    }
    /**
     * Sets the allow_sign_up property value. The allow_sign_up property
     * @param value Value to set for the allow_sign_up property.
     */
    public void setAllowSignUp(@jakarta.annotation.Nullable final Boolean value) {
        this.allowSignUp = value;
    }
    /**
     * Sets the api_url property value. The api_url property
     * @param value Value to set for the api_url property.
     */
    public void setApiUrl(@jakarta.annotation.Nullable final String value) {
        this.apiUrl = value;
    }
    /**
     * Sets the auth_url property value. The auth_url property
     * @param value Value to set for the auth_url property.
     */
    public void setAuthUrl(@jakarta.annotation.Nullable final String value) {
        this.authUrl = value;
    }
    /**
     * Sets the auto_login property value. The auto_login property
     * @param value Value to set for the auto_login property.
     */
    public void setAutoLogin(@jakarta.annotation.Nullable final Boolean value) {
        this.autoLogin = value;
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
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the scopes property value. The scopes property
     * @param value Value to set for the scopes property.
     */
    public void setScopes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.scopes = value;
    }
    /**
     * Sets the token_url property value. The token_url property
     * @param value Value to set for the token_url property.
     */
    public void setTokenUrl(@jakarta.annotation.Nullable final String value) {
        this.tokenUrl = value;
    }
}
