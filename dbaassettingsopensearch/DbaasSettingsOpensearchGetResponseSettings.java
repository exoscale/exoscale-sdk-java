package com.exoscale.dbaassettingsopensearch;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasSettingsOpensearchGetResponseSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * OpenSearch configuration values
     */
    private DbaasSettingsOpensearchGetResponseSettingsOpensearch opensearch;
    /**
     * Instantiates a new DbaasSettingsOpensearchGetResponseSettings and sets the default values.
     */
    public DbaasSettingsOpensearchGetResponseSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasSettingsOpensearchGetResponseSettings
     */
    @jakarta.annotation.Nonnull
    public static DbaasSettingsOpensearchGetResponseSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasSettingsOpensearchGetResponseSettings();
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
        deserializerMap.put("opensearch", (n) -> { this.setOpensearch(n.getObjectValue(DbaasSettingsOpensearchGetResponseSettingsOpensearch::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the opensearch property value. OpenSearch configuration values
     * @return a DbaasSettingsOpensearchGetResponseSettingsOpensearch
     */
    @jakarta.annotation.Nullable
    public DbaasSettingsOpensearchGetResponseSettingsOpensearch getOpensearch() {
        return this.opensearch;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("opensearch", this.getOpensearch());
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
     * Sets the opensearch property value. OpenSearch configuration values
     * @param value Value to set for the opensearch property.
     */
    public void setOpensearch(@jakarta.annotation.Nullable final DbaasSettingsOpensearchGetResponseSettingsOpensearch value) {
        this.opensearch = value;
    }
}
