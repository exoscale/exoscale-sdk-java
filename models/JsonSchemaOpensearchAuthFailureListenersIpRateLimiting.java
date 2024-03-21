package com.exoscale.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JsonSchemaOpensearchAuthFailureListenersIpRateLimiting implements Parsable {
    /**
     * The number of login attempts allowed before login is blocked
     */
    private Integer allowedTries;
    /**
     * The duration of time that login remains blocked after a failed login
     */
    private Integer blockExpirySeconds;
    /**
     * The maximum number of blocked IP addresses
     */
    private Integer maxBlockedClients;
    /**
     * The maximum number of tracked IP addresses that have failed login
     */
    private Integer maxTrackedClients;
    /**
     * The window of time in which the value for `allowed_tries` is enforced
     */
    private Integer timeWindowSeconds;
    /**
     * The type of rate limiting
     */
    private JsonSchemaOpensearchAuthFailureListenersIpRateLimitingType type;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JsonSchemaOpensearchAuthFailureListenersIpRateLimiting
     */
    @jakarta.annotation.Nonnull
    public static JsonSchemaOpensearchAuthFailureListenersIpRateLimiting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JsonSchemaOpensearchAuthFailureListenersIpRateLimiting();
    }
    /**
     * Gets the allowed_tries property value. The number of login attempts allowed before login is blocked
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAllowedTries() {
        return this.allowedTries;
    }
    /**
     * Gets the block_expiry_seconds property value. The duration of time that login remains blocked after a failed login
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getBlockExpirySeconds() {
        return this.blockExpirySeconds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("allowed_tries", (n) -> { this.setAllowedTries(n.getIntegerValue()); });
        deserializerMap.put("block_expiry_seconds", (n) -> { this.setBlockExpirySeconds(n.getIntegerValue()); });
        deserializerMap.put("max_blocked_clients", (n) -> { this.setMaxBlockedClients(n.getIntegerValue()); });
        deserializerMap.put("max_tracked_clients", (n) -> { this.setMaxTrackedClients(n.getIntegerValue()); });
        deserializerMap.put("time_window_seconds", (n) -> { this.setTimeWindowSeconds(n.getIntegerValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(JsonSchemaOpensearchAuthFailureListenersIpRateLimitingType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the max_blocked_clients property value. The maximum number of blocked IP addresses
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxBlockedClients() {
        return this.maxBlockedClients;
    }
    /**
     * Gets the max_tracked_clients property value. The maximum number of tracked IP addresses that have failed login
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxTrackedClients() {
        return this.maxTrackedClients;
    }
    /**
     * Gets the time_window_seconds property value. The window of time in which the value for `allowed_tries` is enforced
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTimeWindowSeconds() {
        return this.timeWindowSeconds;
    }
    /**
     * Gets the type property value. The type of rate limiting
     * @return a JsonSchemaOpensearchAuthFailureListenersIpRateLimitingType
     */
    @jakarta.annotation.Nullable
    public JsonSchemaOpensearchAuthFailureListenersIpRateLimitingType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("allowed_tries", this.getAllowedTries());
        writer.writeIntegerValue("block_expiry_seconds", this.getBlockExpirySeconds());
        writer.writeIntegerValue("max_blocked_clients", this.getMaxBlockedClients());
        writer.writeIntegerValue("max_tracked_clients", this.getMaxTrackedClients());
        writer.writeIntegerValue("time_window_seconds", this.getTimeWindowSeconds());
        writer.writeEnumValue("type", this.getType());
    }
    /**
     * Sets the allowed_tries property value. The number of login attempts allowed before login is blocked
     * @param value Value to set for the allowed_tries property.
     */
    public void setAllowedTries(@jakarta.annotation.Nullable final Integer value) {
        this.allowedTries = value;
    }
    /**
     * Sets the block_expiry_seconds property value. The duration of time that login remains blocked after a failed login
     * @param value Value to set for the block_expiry_seconds property.
     */
    public void setBlockExpirySeconds(@jakarta.annotation.Nullable final Integer value) {
        this.blockExpirySeconds = value;
    }
    /**
     * Sets the max_blocked_clients property value. The maximum number of blocked IP addresses
     * @param value Value to set for the max_blocked_clients property.
     */
    public void setMaxBlockedClients(@jakarta.annotation.Nullable final Integer value) {
        this.maxBlockedClients = value;
    }
    /**
     * Sets the max_tracked_clients property value. The maximum number of tracked IP addresses that have failed login
     * @param value Value to set for the max_tracked_clients property.
     */
    public void setMaxTrackedClients(@jakarta.annotation.Nullable final Integer value) {
        this.maxTrackedClients = value;
    }
    /**
     * Sets the time_window_seconds property value. The window of time in which the value for `allowed_tries` is enforced
     * @param value Value to set for the time_window_seconds property.
     */
    public void setTimeWindowSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.timeWindowSeconds = value;
    }
    /**
     * Sets the type property value. The type of rate limiting
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final JsonSchemaOpensearchAuthFailureListenersIpRateLimitingType value) {
        this.type = value;
    }
}
