package com.exoscale.dbaaskafka.item;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Kafka authentication methods
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasKafkaPutRequestBodyAuthenticationMethods implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Enable certificate/SSL authentication
     */
    private Boolean certificate;
    /**
     * Enable SASL authentication
     */
    private Boolean sasl;
    /**
     * Instantiates a new DbaasKafkaPutRequestBodyAuthenticationMethods and sets the default values.
     */
    public DbaasKafkaPutRequestBodyAuthenticationMethods() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasKafkaPutRequestBodyAuthenticationMethods
     */
    @jakarta.annotation.Nonnull
    public static DbaasKafkaPutRequestBodyAuthenticationMethods createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasKafkaPutRequestBodyAuthenticationMethods();
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
     * Gets the certificate property value. Enable certificate/SSL authentication
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCertificate() {
        return this.certificate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("certificate", (n) -> { this.setCertificate(n.getBooleanValue()); });
        deserializerMap.put("sasl", (n) -> { this.setSasl(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sasl property value. Enable SASL authentication
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSasl() {
        return this.sasl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("certificate", this.getCertificate());
        writer.writeBooleanValue("sasl", this.getSasl());
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
     * Sets the certificate property value. Enable certificate/SSL authentication
     * @param value Value to set for the certificate property.
     */
    public void setCertificate(@jakarta.annotation.Nullable final Boolean value) {
        this.certificate = value;
    }
    /**
     * Sets the sasl property value. Enable SASL authentication
     * @param value Value to set for the sasl property.
     */
    public void setSasl(@jakarta.annotation.Nullable final Boolean value) {
        this.sasl = value;
    }
}
