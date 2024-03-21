package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Redis connection information properties
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasServiceRedisConnectionInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The password property
     */
    private String password;
    /**
     * The slave property
     */
    private java.util.List<String> slave;
    /**
     * The uri property
     */
    private java.util.List<String> uri;
    /**
     * Instantiates a new DbaasServiceRedisConnectionInfo and sets the default values.
     */
    public DbaasServiceRedisConnectionInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasServiceRedisConnectionInfo
     */
    @jakarta.annotation.Nonnull
    public static DbaasServiceRedisConnectionInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasServiceRedisConnectionInfo();
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
        deserializerMap.put("password", (n) -> { this.setPassword(n.getStringValue()); });
        deserializerMap.put("slave", (n) -> { this.setSlave(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("uri", (n) -> { this.setUri(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the password property value. The password property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPassword() {
        return this.password;
    }
    /**
     * Gets the slave property value. The slave property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSlave() {
        return this.slave;
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
        writer.writeStringValue("password", this.getPassword());
        writer.writeCollectionOfPrimitiveValues("slave", this.getSlave());
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
     * Sets the password property value. The password property
     * @param value Value to set for the password property.
     */
    public void setPassword(@jakarta.annotation.Nullable final String value) {
        this.password = value;
    }
    /**
     * Sets the slave property value. The slave property
     * @param value Value to set for the slave property.
     */
    public void setSlave(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.slave = value;
    }
    /**
     * Sets the uri property value. The uri property
     * @param value Value to set for the uri property.
     */
    public void setUri(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.uri = value;
    }
}
