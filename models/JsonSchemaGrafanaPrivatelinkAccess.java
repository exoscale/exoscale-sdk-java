package com.exoscale.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JsonSchemaGrafanaPrivatelinkAccess implements Parsable {
    /**
     * The grafana property
     */
    private Boolean grafana;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JsonSchemaGrafanaPrivatelinkAccess
     */
    @jakarta.annotation.Nonnull
    public static JsonSchemaGrafanaPrivatelinkAccess createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JsonSchemaGrafanaPrivatelinkAccess();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("grafana", (n) -> { this.setGrafana(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the grafana property value. The grafana property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getGrafana() {
        return this.grafana;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("grafana", this.getGrafana());
    }
    /**
     * Sets the grafana property value. The grafana property
     * @param value Value to set for the grafana property.
     */
    public void setGrafana(@jakarta.annotation.Nullable final Boolean value) {
        this.grafana = value;
    }
}
