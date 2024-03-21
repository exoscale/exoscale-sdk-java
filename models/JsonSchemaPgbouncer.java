package com.exoscale.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JsonSchemaPgbouncer implements Parsable {
    /**
     * The autodb_idle_timeout property
     */
    private Integer autodbIdleTimeout;
    /**
     * The autodb_max_db_connections property
     */
    private Integer autodbMaxDbConnections;
    /**
     * The autodb_pool_mode property
     */
    private JsonSchemaPgbouncerAutodbPoolMode autodbPoolMode;
    /**
     * The autodb_pool_size property
     */
    private Integer autodbPoolSize;
    /**
     * The ignore_startup_parameters property
     */
    private java.util.List<JsonSchemaPgbouncerIgnoreStartupParameters> ignoreStartupParameters;
    /**
     * The min_pool_size property
     */
    private Integer minPoolSize;
    /**
     * The server_idle_timeout property
     */
    private Integer serverIdleTimeout;
    /**
     * The server_lifetime property
     */
    private Integer serverLifetime;
    /**
     * The server_reset_query_always property
     */
    private Boolean serverResetQueryAlways;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JsonSchemaPgbouncer
     */
    @jakarta.annotation.Nonnull
    public static JsonSchemaPgbouncer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JsonSchemaPgbouncer();
    }
    /**
     * Gets the autodb_idle_timeout property value. The autodb_idle_timeout property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAutodbIdleTimeout() {
        return this.autodbIdleTimeout;
    }
    /**
     * Gets the autodb_max_db_connections property value. The autodb_max_db_connections property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAutodbMaxDbConnections() {
        return this.autodbMaxDbConnections;
    }
    /**
     * Gets the autodb_pool_mode property value. The autodb_pool_mode property
     * @return a JsonSchemaPgbouncerAutodbPoolMode
     */
    @jakarta.annotation.Nullable
    public JsonSchemaPgbouncerAutodbPoolMode getAutodbPoolMode() {
        return this.autodbPoolMode;
    }
    /**
     * Gets the autodb_pool_size property value. The autodb_pool_size property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAutodbPoolSize() {
        return this.autodbPoolSize;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("autodb_idle_timeout", (n) -> { this.setAutodbIdleTimeout(n.getIntegerValue()); });
        deserializerMap.put("autodb_max_db_connections", (n) -> { this.setAutodbMaxDbConnections(n.getIntegerValue()); });
        deserializerMap.put("autodb_pool_mode", (n) -> { this.setAutodbPoolMode(n.getEnumValue(JsonSchemaPgbouncerAutodbPoolMode::forValue)); });
        deserializerMap.put("autodb_pool_size", (n) -> { this.setAutodbPoolSize(n.getIntegerValue()); });
        deserializerMap.put("ignore_startup_parameters", (n) -> { this.setIgnoreStartupParameters(n.getCollectionOfEnumValues(JsonSchemaPgbouncerIgnoreStartupParameters::forValue)); });
        deserializerMap.put("min_pool_size", (n) -> { this.setMinPoolSize(n.getIntegerValue()); });
        deserializerMap.put("server_idle_timeout", (n) -> { this.setServerIdleTimeout(n.getIntegerValue()); });
        deserializerMap.put("server_lifetime", (n) -> { this.setServerLifetime(n.getIntegerValue()); });
        deserializerMap.put("server_reset_query_always", (n) -> { this.setServerResetQueryAlways(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ignore_startup_parameters property value. The ignore_startup_parameters property
     * @return a java.util.List<JsonSchemaPgbouncerIgnoreStartupParameters>
     */
    @jakarta.annotation.Nullable
    public java.util.List<JsonSchemaPgbouncerIgnoreStartupParameters> getIgnoreStartupParameters() {
        return this.ignoreStartupParameters;
    }
    /**
     * Gets the min_pool_size property value. The min_pool_size property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMinPoolSize() {
        return this.minPoolSize;
    }
    /**
     * Gets the server_idle_timeout property value. The server_idle_timeout property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getServerIdleTimeout() {
        return this.serverIdleTimeout;
    }
    /**
     * Gets the server_lifetime property value. The server_lifetime property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getServerLifetime() {
        return this.serverLifetime;
    }
    /**
     * Gets the server_reset_query_always property value. The server_reset_query_always property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getServerResetQueryAlways() {
        return this.serverResetQueryAlways;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("autodb_idle_timeout", this.getAutodbIdleTimeout());
        writer.writeIntegerValue("autodb_max_db_connections", this.getAutodbMaxDbConnections());
        writer.writeEnumValue("autodb_pool_mode", this.getAutodbPoolMode());
        writer.writeIntegerValue("autodb_pool_size", this.getAutodbPoolSize());
        writer.writeCollectionOfEnumValues("ignore_startup_parameters", this.getIgnoreStartupParameters());
        writer.writeIntegerValue("min_pool_size", this.getMinPoolSize());
        writer.writeIntegerValue("server_idle_timeout", this.getServerIdleTimeout());
        writer.writeIntegerValue("server_lifetime", this.getServerLifetime());
        writer.writeBooleanValue("server_reset_query_always", this.getServerResetQueryAlways());
    }
    /**
     * Sets the autodb_idle_timeout property value. The autodb_idle_timeout property
     * @param value Value to set for the autodb_idle_timeout property.
     */
    public void setAutodbIdleTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.autodbIdleTimeout = value;
    }
    /**
     * Sets the autodb_max_db_connections property value. The autodb_max_db_connections property
     * @param value Value to set for the autodb_max_db_connections property.
     */
    public void setAutodbMaxDbConnections(@jakarta.annotation.Nullable final Integer value) {
        this.autodbMaxDbConnections = value;
    }
    /**
     * Sets the autodb_pool_mode property value. The autodb_pool_mode property
     * @param value Value to set for the autodb_pool_mode property.
     */
    public void setAutodbPoolMode(@jakarta.annotation.Nullable final JsonSchemaPgbouncerAutodbPoolMode value) {
        this.autodbPoolMode = value;
    }
    /**
     * Sets the autodb_pool_size property value. The autodb_pool_size property
     * @param value Value to set for the autodb_pool_size property.
     */
    public void setAutodbPoolSize(@jakarta.annotation.Nullable final Integer value) {
        this.autodbPoolSize = value;
    }
    /**
     * Sets the ignore_startup_parameters property value. The ignore_startup_parameters property
     * @param value Value to set for the ignore_startup_parameters property.
     */
    public void setIgnoreStartupParameters(@jakarta.annotation.Nullable final java.util.List<JsonSchemaPgbouncerIgnoreStartupParameters> value) {
        this.ignoreStartupParameters = value;
    }
    /**
     * Sets the min_pool_size property value. The min_pool_size property
     * @param value Value to set for the min_pool_size property.
     */
    public void setMinPoolSize(@jakarta.annotation.Nullable final Integer value) {
        this.minPoolSize = value;
    }
    /**
     * Sets the server_idle_timeout property value. The server_idle_timeout property
     * @param value Value to set for the server_idle_timeout property.
     */
    public void setServerIdleTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.serverIdleTimeout = value;
    }
    /**
     * Sets the server_lifetime property value. The server_lifetime property
     * @param value Value to set for the server_lifetime property.
     */
    public void setServerLifetime(@jakarta.annotation.Nullable final Integer value) {
        this.serverLifetime = value;
    }
    /**
     * Sets the server_reset_query_always property value. The server_reset_query_always property
     * @param value Value to set for the server_reset_query_always property.
     */
    public void setServerResetQueryAlways(@jakarta.annotation.Nullable final Boolean value) {
        this.serverResetQueryAlways = value;
    }
}
