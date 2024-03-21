package com.exoscale.dbaaspostgres.item.upgradecheck;

import com.exoscale.models.DbaasPgTargetVersions;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpgradeCheckPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The targetVersion property
     */
    private DbaasPgTargetVersions targetVersion;
    /**
     * Instantiates a new UpgradeCheckPostRequestBody and sets the default values.
     */
    public UpgradeCheckPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UpgradeCheckPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static UpgradeCheckPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpgradeCheckPostRequestBody();
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
        deserializerMap.put("target-version", (n) -> { this.setTargetVersion(n.getEnumValue(DbaasPgTargetVersions::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the target-version property value. The targetVersion property
     * @return a DbaasPgTargetVersions
     */
    @jakarta.annotation.Nullable
    public DbaasPgTargetVersions getTargetVersion() {
        return this.targetVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("target-version", this.getTargetVersion());
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
     * Sets the target-version property value. The targetVersion property
     * @param value Value to set for the target-version property.
     */
    public void setTargetVersion(@jakarta.annotation.Nullable final DbaasPgTargetVersions value) {
        this.targetVersion = value;
    }
}
