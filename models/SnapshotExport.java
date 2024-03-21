package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Exported snapshot information
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SnapshotExport implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Exported snapshot disk file MD5 checksum
     */
    private String md5sum;
    /**
     * Exported snapshot disk file pre-signed URL
     */
    private String presignedUrl;
    /**
     * Instantiates a new SnapshotExport and sets the default values.
     */
    public SnapshotExport() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SnapshotExport
     */
    @jakarta.annotation.Nonnull
    public static SnapshotExport createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SnapshotExport();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("md5sum", (n) -> { this.setMd5sum(n.getStringValue()); });
        deserializerMap.put("presigned-url", (n) -> { this.setPresignedUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the md5sum property value. Exported snapshot disk file MD5 checksum
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMd5sum() {
        return this.md5sum;
    }
    /**
     * Gets the presigned-url property value. Exported snapshot disk file pre-signed URL
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPresignedUrl() {
        return this.presignedUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("md5sum", this.getMd5sum());
        writer.writeStringValue("presigned-url", this.getPresignedUrl());
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
     * Sets the md5sum property value. Exported snapshot disk file MD5 checksum
     * @param value Value to set for the md5sum property.
     */
    public void setMd5sum(@jakarta.annotation.Nullable final String value) {
        this.md5sum = value;
    }
    /**
     * Sets the presigned-url property value. Exported snapshot disk file pre-signed URL
     * @param value Value to set for the presigned-url property.
     */
    public void setPresignedUrl(@jakarta.annotation.Nullable final String value) {
        this.presignedUrl = value;
    }
}
