package com.exoscale.dnsdomain.item.record;

import com.exoscale.models.DnsDomainRecord;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecordGetResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The dnsDomainRecords property
     */
    private java.util.List<DnsDomainRecord> dnsDomainRecords;
    /**
     * Instantiates a new RecordGetResponse and sets the default values.
     */
    public RecordGetResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RecordGetResponse
     */
    @jakarta.annotation.Nonnull
    public static RecordGetResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecordGetResponse();
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
     * Gets the dns-domain-records property value. The dnsDomainRecords property
     * @return a java.util.List<DnsDomainRecord>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DnsDomainRecord> getDnsDomainRecords() {
        return this.dnsDomainRecords;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("dns-domain-records", (n) -> { this.setDnsDomainRecords(n.getCollectionOfObjectValues(DnsDomainRecord::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("dns-domain-records", this.getDnsDomainRecords());
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
     * Sets the dns-domain-records property value. The dnsDomainRecords property
     * @param value Value to set for the dns-domain-records property.
     */
    public void setDnsDomainRecords(@jakarta.annotation.Nullable final java.util.List<DnsDomainRecord> value) {
        this.dnsDomainRecords = value;
    }
}
