package com.exoscale.dbaastaskmigrationcheck.item;

import com.exoscale.models.EnumMigrationMethod;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithServicePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Comma-separated list of databases, which should be ignored during migration (supported by MySQL only at the moment)
     */
    private String ignoreDbs;
    /**
     * The method property
     */
    private EnumMigrationMethod method;
    /**
     * Service URI of the source MySQL or PostgreSQL database with admin credentials.
     */
    private String sourceServiceUri;
    /**
     * Instantiates a new WithServicePostRequestBody and sets the default values.
     */
    public WithServicePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WithServicePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static WithServicePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WithServicePostRequestBody();
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
        deserializerMap.put("ignore-dbs", (n) -> { this.setIgnoreDbs(n.getStringValue()); });
        deserializerMap.put("method", (n) -> { this.setMethod(n.getEnumValue(EnumMigrationMethod::forValue)); });
        deserializerMap.put("source-service-uri", (n) -> { this.setSourceServiceUri(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ignore-dbs property value. Comma-separated list of databases, which should be ignored during migration (supported by MySQL only at the moment)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIgnoreDbs() {
        return this.ignoreDbs;
    }
    /**
     * Gets the method property value. The method property
     * @return a EnumMigrationMethod
     */
    @jakarta.annotation.Nullable
    public EnumMigrationMethod getMethod() {
        return this.method;
    }
    /**
     * Gets the source-service-uri property value. Service URI of the source MySQL or PostgreSQL database with admin credentials.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSourceServiceUri() {
        return this.sourceServiceUri;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("ignore-dbs", this.getIgnoreDbs());
        writer.writeEnumValue("method", this.getMethod());
        writer.writeStringValue("source-service-uri", this.getSourceServiceUri());
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
     * Sets the ignore-dbs property value. Comma-separated list of databases, which should be ignored during migration (supported by MySQL only at the moment)
     * @param value Value to set for the ignore-dbs property.
     */
    public void setIgnoreDbs(@jakarta.annotation.Nullable final String value) {
        this.ignoreDbs = value;
    }
    /**
     * Sets the method property value. The method property
     * @param value Value to set for the method property.
     */
    public void setMethod(@jakarta.annotation.Nullable final EnumMigrationMethod value) {
        this.method = value;
    }
    /**
     * Sets the source-service-uri property value. Service URI of the source MySQL or PostgreSQL database with admin credentials.
     * @param value Value to set for the source-service-uri property.
     */
    public void setSourceServiceUri(@jakarta.annotation.Nullable final String value) {
        this.sourceServiceUri = value;
    }
}
