package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Backup schedule
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasServiceMysqlBackupSchedule implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The hour of day (in UTC) when backup for the service is started. New backup is only started if previous backup has already completed.
     */
    private Long backupHour;
    /**
     * The minute of an hour when backup for the service is started. New backup is only started if previous backup has already completed.
     */
    private Long backupMinute;
    /**
     * Instantiates a new DbaasServiceMysqlBackupSchedule and sets the default values.
     */
    public DbaasServiceMysqlBackupSchedule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasServiceMysqlBackupSchedule
     */
    @jakarta.annotation.Nonnull
    public static DbaasServiceMysqlBackupSchedule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasServiceMysqlBackupSchedule();
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
     * Gets the backup-hour property value. The hour of day (in UTC) when backup for the service is started. New backup is only started if previous backup has already completed.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getBackupHour() {
        return this.backupHour;
    }
    /**
     * Gets the backup-minute property value. The minute of an hour when backup for the service is started. New backup is only started if previous backup has already completed.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getBackupMinute() {
        return this.backupMinute;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("backup-hour", (n) -> { this.setBackupHour(n.getLongValue()); });
        deserializerMap.put("backup-minute", (n) -> { this.setBackupMinute(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("backup-hour", this.getBackupHour());
        writer.writeLongValue("backup-minute", this.getBackupMinute());
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
     * Sets the backup-hour property value. The hour of day (in UTC) when backup for the service is started. New backup is only started if previous backup has already completed.
     * @param value Value to set for the backup-hour property.
     */
    public void setBackupHour(@jakarta.annotation.Nullable final Long value) {
        this.backupHour = value;
    }
    /**
     * Sets the backup-minute property value. The minute of an hour when backup for the service is started. New backup is only started if previous backup has already completed.
     * @param value Value to set for the backup-minute property.
     */
    public void setBackupMinute(@jakarta.annotation.Nullable final Long value) {
        this.backupMinute = value;
    }
}
