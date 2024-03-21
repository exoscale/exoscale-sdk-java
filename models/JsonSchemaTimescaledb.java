package com.exoscale.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JsonSchemaTimescaledb implements Parsable {
    /**
     * The number of background workers for timescaledb operations. You should configure this setting to the sum of your number of databases and the total number of concurrent background workers you want running at any given point in time.
     */
    private Integer maxBackgroundWorkers;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JsonSchemaTimescaledb
     */
    @jakarta.annotation.Nonnull
    public static JsonSchemaTimescaledb createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JsonSchemaTimescaledb();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("max_background_workers", (n) -> { this.setMaxBackgroundWorkers(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the max_background_workers property value. The number of background workers for timescaledb operations. You should configure this setting to the sum of your number of databases and the total number of concurrent background workers you want running at any given point in time.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxBackgroundWorkers() {
        return this.maxBackgroundWorkers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("max_background_workers", this.getMaxBackgroundWorkers());
    }
    /**
     * Sets the max_background_workers property value. The number of background workers for timescaledb operations. You should configure this setting to the sum of your number of databases and the total number of concurrent background workers you want running at any given point in time.
     * @param value Value to set for the max_background_workers property.
     */
    public void setMaxBackgroundWorkers(@jakarta.annotation.Nullable final Integer value) {
        this.maxBackgroundWorkers = value;
    }
}
