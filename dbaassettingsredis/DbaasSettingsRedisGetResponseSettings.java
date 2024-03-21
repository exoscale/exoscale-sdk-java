package com.exoscale.dbaassettingsredis;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasSettingsRedisGetResponseSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Redis configuration values
     */
    private DbaasSettingsRedisGetResponseSettingsRedis redis;
    /**
     * Instantiates a new DbaasSettingsRedisGetResponseSettings and sets the default values.
     */
    public DbaasSettingsRedisGetResponseSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasSettingsRedisGetResponseSettings
     */
    @jakarta.annotation.Nonnull
    public static DbaasSettingsRedisGetResponseSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasSettingsRedisGetResponseSettings();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("redis", (n) -> { this.setRedis(n.getObjectValue(DbaasSettingsRedisGetResponseSettingsRedis::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the redis property value. Redis configuration values
     * @return a DbaasSettingsRedisGetResponseSettingsRedis
     */
    @jakarta.annotation.Nullable
    public DbaasSettingsRedisGetResponseSettingsRedis getRedis() {
        return this.redis;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("redis", this.getRedis());
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
     * Sets the redis property value. Redis configuration values
     * @param value Value to set for the redis property.
     */
    public void setRedis(@jakarta.annotation.Nullable final DbaasSettingsRedisGetResponseSettingsRedis value) {
        this.redis = value;
    }
}
