package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * DBaaS plan backup config
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasBackupConfig implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Interval of taking a frequent backup in service types supporting different backup schedules
     */
    private Long frequentIntervalMinutes;
    /**
     * Maximum age of the oldest frequent backup in service types supporting different backup schedules
     */
    private Long frequentOldestAgeMinutes;
    /**
     * Interval of taking a frequent backup in service types supporting different backup schedules
     */
    private Long infrequentIntervalMinutes;
    /**
     * Maximum age of the oldest infrequent backup in service types supporting different backup schedules
     */
    private Long infrequentOldestAgeMinutes;
    /**
     * The interval, in hours, at which backups are generated.                                            For some services, like PostgreSQL, this is the interval                                            at which full snapshots are taken and continuous incremental                                            backup stream is maintained in addition to that.
     */
    private Long interval;
    /**
     * Maximum number of backups to keep. Zero when no backups are created.
     */
    private Long maxCount;
    /**
     * Mechanism how backups can be restored. 'regular'                                            means a backup is restored as is so that the system                                            is restored to the state it was when the backup was generated.                                            'pitr' means point-in-time-recovery, which allows restoring the system to any state since the first available full snapshot.
     */
    private String recoveryMode;
    /**
     * Instantiates a new DbaasBackupConfig and sets the default values.
     */
    public DbaasBackupConfig() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasBackupConfig
     */
    @jakarta.annotation.Nonnull
    public static DbaasBackupConfig createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasBackupConfig();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("frequent-interval-minutes", (n) -> { this.setFrequentIntervalMinutes(n.getLongValue()); });
        deserializerMap.put("frequent-oldest-age-minutes", (n) -> { this.setFrequentOldestAgeMinutes(n.getLongValue()); });
        deserializerMap.put("infrequent-interval-minutes", (n) -> { this.setInfrequentIntervalMinutes(n.getLongValue()); });
        deserializerMap.put("infrequent-oldest-age-minutes", (n) -> { this.setInfrequentOldestAgeMinutes(n.getLongValue()); });
        deserializerMap.put("interval", (n) -> { this.setInterval(n.getLongValue()); });
        deserializerMap.put("max-count", (n) -> { this.setMaxCount(n.getLongValue()); });
        deserializerMap.put("recovery-mode", (n) -> { this.setRecoveryMode(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the frequent-interval-minutes property value. Interval of taking a frequent backup in service types supporting different backup schedules
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getFrequentIntervalMinutes() {
        return this.frequentIntervalMinutes;
    }
    /**
     * Gets the frequent-oldest-age-minutes property value. Maximum age of the oldest frequent backup in service types supporting different backup schedules
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getFrequentOldestAgeMinutes() {
        return this.frequentOldestAgeMinutes;
    }
    /**
     * Gets the infrequent-interval-minutes property value. Interval of taking a frequent backup in service types supporting different backup schedules
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getInfrequentIntervalMinutes() {
        return this.infrequentIntervalMinutes;
    }
    /**
     * Gets the infrequent-oldest-age-minutes property value. Maximum age of the oldest infrequent backup in service types supporting different backup schedules
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getInfrequentOldestAgeMinutes() {
        return this.infrequentOldestAgeMinutes;
    }
    /**
     * Gets the interval property value. The interval, in hours, at which backups are generated.                                            For some services, like PostgreSQL, this is the interval                                            at which full snapshots are taken and continuous incremental                                            backup stream is maintained in addition to that.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getInterval() {
        return this.interval;
    }
    /**
     * Gets the max-count property value. Maximum number of backups to keep. Zero when no backups are created.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getMaxCount() {
        return this.maxCount;
    }
    /**
     * Gets the recovery-mode property value. Mechanism how backups can be restored. 'regular'                                            means a backup is restored as is so that the system                                            is restored to the state it was when the backup was generated.                                            'pitr' means point-in-time-recovery, which allows restoring the system to any state since the first available full snapshot.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRecoveryMode() {
        return this.recoveryMode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
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
     * Sets the frequent-interval-minutes property value. Interval of taking a frequent backup in service types supporting different backup schedules
     * @param value Value to set for the frequent-interval-minutes property.
     */
    public void setFrequentIntervalMinutes(@jakarta.annotation.Nullable final Long value) {
        this.frequentIntervalMinutes = value;
    }
    /**
     * Sets the frequent-oldest-age-minutes property value. Maximum age of the oldest frequent backup in service types supporting different backup schedules
     * @param value Value to set for the frequent-oldest-age-minutes property.
     */
    public void setFrequentOldestAgeMinutes(@jakarta.annotation.Nullable final Long value) {
        this.frequentOldestAgeMinutes = value;
    }
    /**
     * Sets the infrequent-interval-minutes property value. Interval of taking a frequent backup in service types supporting different backup schedules
     * @param value Value to set for the infrequent-interval-minutes property.
     */
    public void setInfrequentIntervalMinutes(@jakarta.annotation.Nullable final Long value) {
        this.infrequentIntervalMinutes = value;
    }
    /**
     * Sets the infrequent-oldest-age-minutes property value. Maximum age of the oldest infrequent backup in service types supporting different backup schedules
     * @param value Value to set for the infrequent-oldest-age-minutes property.
     */
    public void setInfrequentOldestAgeMinutes(@jakarta.annotation.Nullable final Long value) {
        this.infrequentOldestAgeMinutes = value;
    }
    /**
     * Sets the interval property value. The interval, in hours, at which backups are generated.                                            For some services, like PostgreSQL, this is the interval                                            at which full snapshots are taken and continuous incremental                                            backup stream is maintained in addition to that.
     * @param value Value to set for the interval property.
     */
    public void setInterval(@jakarta.annotation.Nullable final Long value) {
        this.interval = value;
    }
    /**
     * Sets the max-count property value. Maximum number of backups to keep. Zero when no backups are created.
     * @param value Value to set for the max-count property.
     */
    public void setMaxCount(@jakarta.annotation.Nullable final Long value) {
        this.maxCount = value;
    }
    /**
     * Sets the recovery-mode property value. Mechanism how backups can be restored. 'regular'                                            means a backup is restored as is so that the system                                            is restored to the state it was when the backup was generated.                                            'pitr' means point-in-time-recovery, which allows restoring the system to any state since the first available full snapshot.
     * @param value Value to set for the recovery-mode property.
     */
    public void setRecoveryMode(@jakarta.annotation.Nullable final String value) {
        this.recoveryMode = value;
    }
}
