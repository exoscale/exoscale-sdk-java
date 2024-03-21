package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * MySQL connection information properties
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasServiceMysqlConnectionInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The params property
     */
    private java.util.List<DbaasServiceMysqlConnectionInfoParams> params;
    /**
     * The standby property
     */
    private java.util.List<String> standby;
    /**
     * The uri property
     */
    private java.util.List<String> uri;
    /**
     * Instantiates a new DbaasServiceMysqlConnectionInfo and sets the default values.
     */
    public DbaasServiceMysqlConnectionInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasServiceMysqlConnectionInfo
     */
    @jakarta.annotation.Nonnull
    public static DbaasServiceMysqlConnectionInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasServiceMysqlConnectionInfo();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("params", (n) -> { this.setParams(n.getCollectionOfObjectValues(DbaasServiceMysqlConnectionInfoParams::createFromDiscriminatorValue)); });
        deserializerMap.put("standby", (n) -> { this.setStandby(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("uri", (n) -> { this.setUri(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the params property value. The params property
     * @return a java.util.List<DbaasServiceMysqlConnectionInfoParams>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DbaasServiceMysqlConnectionInfoParams> getParams() {
        return this.params;
    }
    /**
     * Gets the standby property value. The standby property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getStandby() {
        return this.standby;
    }
    /**
     * Gets the uri property value. The uri property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getUri() {
        return this.uri;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("params", this.getParams());
        writer.writeCollectionOfPrimitiveValues("standby", this.getStandby());
        writer.writeCollectionOfPrimitiveValues("uri", this.getUri());
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
     * Sets the params property value. The params property
     * @param value Value to set for the params property.
     */
    public void setParams(@jakarta.annotation.Nullable final java.util.List<DbaasServiceMysqlConnectionInfoParams> value) {
        this.params = value;
    }
    /**
     * Sets the standby property value. The standby property
     * @param value Value to set for the standby property.
     */
    public void setStandby(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.standby = value;
    }
    /**
     * Sets the uri property value. The uri property
     * @param value Value to set for the uri property.
     */
    public void setUri(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.uri = value;
    }
}
