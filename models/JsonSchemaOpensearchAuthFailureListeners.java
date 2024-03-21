package com.exoscale.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JsonSchemaOpensearchAuthFailureListeners implements Parsable {
    /**
     * The internal_authentication_backend_limiting property
     */
    private JsonSchemaOpensearchAuthFailureListenersInternalAuthenticationBackendLimiting internalAuthenticationBackendLimiting;
    /**
     * The ip_rate_limiting property
     */
    private JsonSchemaOpensearchAuthFailureListenersIpRateLimiting ipRateLimiting;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JsonSchemaOpensearchAuthFailureListeners
     */
    @jakarta.annotation.Nonnull
    public static JsonSchemaOpensearchAuthFailureListeners createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JsonSchemaOpensearchAuthFailureListeners();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("internal_authentication_backend_limiting", (n) -> { this.setInternalAuthenticationBackendLimiting(n.getObjectValue(JsonSchemaOpensearchAuthFailureListenersInternalAuthenticationBackendLimiting::createFromDiscriminatorValue)); });
        deserializerMap.put("ip_rate_limiting", (n) -> { this.setIpRateLimiting(n.getObjectValue(JsonSchemaOpensearchAuthFailureListenersIpRateLimiting::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the internal_authentication_backend_limiting property value. The internal_authentication_backend_limiting property
     * @return a JsonSchemaOpensearchAuthFailureListenersInternalAuthenticationBackendLimiting
     */
    @jakarta.annotation.Nullable
    public JsonSchemaOpensearchAuthFailureListenersInternalAuthenticationBackendLimiting getInternalAuthenticationBackendLimiting() {
        return this.internalAuthenticationBackendLimiting;
    }
    /**
     * Gets the ip_rate_limiting property value. The ip_rate_limiting property
     * @return a JsonSchemaOpensearchAuthFailureListenersIpRateLimiting
     */
    @jakarta.annotation.Nullable
    public JsonSchemaOpensearchAuthFailureListenersIpRateLimiting getIpRateLimiting() {
        return this.ipRateLimiting;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("internal_authentication_backend_limiting", this.getInternalAuthenticationBackendLimiting());
        writer.writeObjectValue("ip_rate_limiting", this.getIpRateLimiting());
    }
    /**
     * Sets the internal_authentication_backend_limiting property value. The internal_authentication_backend_limiting property
     * @param value Value to set for the internal_authentication_backend_limiting property.
     */
    public void setInternalAuthenticationBackendLimiting(@jakarta.annotation.Nullable final JsonSchemaOpensearchAuthFailureListenersInternalAuthenticationBackendLimiting value) {
        this.internalAuthenticationBackendLimiting = value;
    }
    /**
     * Sets the ip_rate_limiting property value. The ip_rate_limiting property
     * @param value Value to set for the ip_rate_limiting property.
     */
    public void setIpRateLimiting(@jakarta.annotation.Nullable final JsonSchemaOpensearchAuthFailureListenersIpRateLimiting value) {
        this.ipRateLimiting = value;
    }
}
