/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.exoscale.api.models.components;

import com.exoscale.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

/**
 * DbaasServicePgBackupSchedule - Backup schedule
 */

public class DbaasServicePgBackupSchedule {

    /**
     * The hour of day (in UTC) when backup for the service is started. New backup is only started if previous backup has already completed.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("backup-hour")
    private Optional<? extends Long> backupHour;

    /**
     * The minute of an hour when backup for the service is started. New backup is only started if previous backup has already completed.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("backup-minute")
    private Optional<? extends Long> backupMinute;

    public DbaasServicePgBackupSchedule(
            @JsonProperty("backup-hour") Optional<? extends Long> backupHour,
            @JsonProperty("backup-minute") Optional<? extends Long> backupMinute) {
        Utils.checkNotNull(backupHour, "backupHour");
        Utils.checkNotNull(backupMinute, "backupMinute");
        this.backupHour = backupHour;
        this.backupMinute = backupMinute;
    }

    /**
     * The hour of day (in UTC) when backup for the service is started. New backup is only started if previous backup has already completed.
     */
    public Optional<? extends Long> backupHour() {
        return backupHour;
    }

    /**
     * The minute of an hour when backup for the service is started. New backup is only started if previous backup has already completed.
     */
    public Optional<? extends Long> backupMinute() {
        return backupMinute;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The hour of day (in UTC) when backup for the service is started. New backup is only started if previous backup has already completed.
     */
    public DbaasServicePgBackupSchedule withBackupHour(long backupHour) {
        Utils.checkNotNull(backupHour, "backupHour");
        this.backupHour = Optional.ofNullable(backupHour);
        return this;
    }

    /**
     * The hour of day (in UTC) when backup for the service is started. New backup is only started if previous backup has already completed.
     */
    public DbaasServicePgBackupSchedule withBackupHour(Optional<? extends Long> backupHour) {
        Utils.checkNotNull(backupHour, "backupHour");
        this.backupHour = backupHour;
        return this;
    }

    /**
     * The minute of an hour when backup for the service is started. New backup is only started if previous backup has already completed.
     */
    public DbaasServicePgBackupSchedule withBackupMinute(long backupMinute) {
        Utils.checkNotNull(backupMinute, "backupMinute");
        this.backupMinute = Optional.ofNullable(backupMinute);
        return this;
    }

    /**
     * The minute of an hour when backup for the service is started. New backup is only started if previous backup has already completed.
     */
    public DbaasServicePgBackupSchedule withBackupMinute(Optional<? extends Long> backupMinute) {
        Utils.checkNotNull(backupMinute, "backupMinute");
        this.backupMinute = backupMinute;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DbaasServicePgBackupSchedule other = (DbaasServicePgBackupSchedule) o;
        return 
            java.util.Objects.deepEquals(this.backupHour, other.backupHour) &&
            java.util.Objects.deepEquals(this.backupMinute, other.backupMinute);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            backupHour,
            backupMinute);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DbaasServicePgBackupSchedule.class,
                "backupHour", backupHour,
                "backupMinute", backupMinute);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> backupHour = Optional.empty();
 
        private Optional<? extends Long> backupMinute = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The hour of day (in UTC) when backup for the service is started. New backup is only started if previous backup has already completed.
         */
        public Builder backupHour(long backupHour) {
            Utils.checkNotNull(backupHour, "backupHour");
            this.backupHour = Optional.ofNullable(backupHour);
            return this;
        }

        /**
         * The hour of day (in UTC) when backup for the service is started. New backup is only started if previous backup has already completed.
         */
        public Builder backupHour(Optional<? extends Long> backupHour) {
            Utils.checkNotNull(backupHour, "backupHour");
            this.backupHour = backupHour;
            return this;
        }

        /**
         * The minute of an hour when backup for the service is started. New backup is only started if previous backup has already completed.
         */
        public Builder backupMinute(long backupMinute) {
            Utils.checkNotNull(backupMinute, "backupMinute");
            this.backupMinute = Optional.ofNullable(backupMinute);
            return this;
        }

        /**
         * The minute of an hour when backup for the service is started. New backup is only started if previous backup has already completed.
         */
        public Builder backupMinute(Optional<? extends Long> backupMinute) {
            Utils.checkNotNull(backupMinute, "backupMinute");
            this.backupMinute = backupMinute;
            return this;
        }
        
        public DbaasServicePgBackupSchedule build() {
            return new DbaasServicePgBackupSchedule(
                backupHour,
                backupMinute);
        }
    }
}

