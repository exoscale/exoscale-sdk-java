package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * List of backups for the service
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasServiceBackup implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Internal name of this backup
     */
    private String backupName;
    /**
     * Backup timestamp (ISO 8601)
     */
    private OffsetDateTime backupTime;
    /**
     * Backup's original size before compression
     */
    private Long dataSize;
    /**
     * Instantiates a new DbaasServiceBackup and sets the default values.
     */
    public DbaasServiceBackup() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasServiceBackup
     */
    @jakarta.annotation.Nonnull
    public static DbaasServiceBackup createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasServiceBackup();
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
     * Gets the backup-name property value. Internal name of this backup
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBackupName() {
        return this.backupName;
    }
    /**
     * Gets the backup-time property value. Backup timestamp (ISO 8601)
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getBackupTime() {
        return this.backupTime;
    }
    /**
     * Gets the data-size property value. Backup's original size before compression
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getDataSize() {
        return this.dataSize;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("backup-name", (n) -> { this.setBackupName(n.getStringValue()); });
        deserializerMap.put("backup-time", (n) -> { this.setBackupTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("data-size", (n) -> { this.setDataSize(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("backup-name", this.getBackupName());
        writer.writeOffsetDateTimeValue("backup-time", this.getBackupTime());
        writer.writeLongValue("data-size", this.getDataSize());
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
     * Sets the backup-name property value. Internal name of this backup
     * @param value Value to set for the backup-name property.
     */
    public void setBackupName(@jakarta.annotation.Nullable final String value) {
        this.backupName = value;
    }
    /**
     * Sets the backup-time property value. Backup timestamp (ISO 8601)
     * @param value Value to set for the backup-time property.
     */
    public void setBackupTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backupTime = value;
    }
    /**
     * Sets the data-size property value. Backup's original size before compression
     * @param value Value to set for the data-size property.
     */
    public void setDataSize(@jakarta.annotation.Nullable final Long value) {
        this.dataSize = value;
    }
}
