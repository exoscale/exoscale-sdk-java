/*
 * ExoscalePublicAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.exoscale.apichgva2.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for DbaasMysqlRequest type.
 */
public class DbaasMysqlRequest {
    private Maintenance maintenance;
    private String plan;
    private Boolean terminationProtection;
    private List<String> ipFilter;
    private MysqlConfConfigurationValues mysqlSettings;
    private Migration migration;
    private Long binlogRetentionPeriod;
    private BackupSchedule2 backupSchedule;

    /**
     * Default constructor.
     */
    public DbaasMysqlRequest() {
    }

    /**
     * Initialization constructor.
     * @param  maintenance  Maintenance value for maintenance.
     * @param  plan  String value for plan.
     * @param  terminationProtection  Boolean value for terminationProtection.
     * @param  ipFilter  List of String value for ipFilter.
     * @param  mysqlSettings  MysqlConfConfigurationValues value for mysqlSettings.
     * @param  migration  Migration value for migration.
     * @param  binlogRetentionPeriod  Long value for binlogRetentionPeriod.
     * @param  backupSchedule  BackupSchedule2 value for backupSchedule.
     */
    public DbaasMysqlRequest(
            Maintenance maintenance,
            String plan,
            Boolean terminationProtection,
            List<String> ipFilter,
            MysqlConfConfigurationValues mysqlSettings,
            Migration migration,
            Long binlogRetentionPeriod,
            BackupSchedule2 backupSchedule) {
        this.maintenance = maintenance;
        this.plan = plan;
        this.terminationProtection = terminationProtection;
        this.ipFilter = ipFilter;
        this.mysqlSettings = mysqlSettings;
        this.migration = migration;
        this.binlogRetentionPeriod = binlogRetentionPeriod;
        this.backupSchedule = backupSchedule;
    }

    /**
     * Getter for Maintenance.
     * Automatic maintenance settings
     * @return Returns the Maintenance
     */
    @JsonGetter("maintenance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Maintenance getMaintenance() {
        return maintenance;
    }

    /**
     * Setter for Maintenance.
     * Automatic maintenance settings
     * @param maintenance Value for Maintenance
     */
    @JsonSetter("maintenance")
    public void setMaintenance(Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    /**
     * Getter for Plan.
     * Subscription plan
     * @return Returns the String
     */
    @JsonGetter("plan")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPlan() {
        return plan;
    }

    /**
     * Setter for Plan.
     * Subscription plan
     * @param plan Value for String
     */
    @JsonSetter("plan")
    public void setPlan(String plan) {
        this.plan = plan;
    }

    /**
     * Getter for TerminationProtection.
     * Service is protected against termination and powering off
     * @return Returns the Boolean
     */
    @JsonGetter("termination-protection")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTerminationProtection() {
        return terminationProtection;
    }

    /**
     * Setter for TerminationProtection.
     * Service is protected against termination and powering off
     * @param terminationProtection Value for Boolean
     */
    @JsonSetter("termination-protection")
    public void setTerminationProtection(Boolean terminationProtection) {
        this.terminationProtection = terminationProtection;
    }

    /**
     * Getter for IpFilter.
     * Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'
     * @return Returns the List of String
     */
    @JsonGetter("ip-filter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getIpFilter() {
        return ipFilter;
    }

    /**
     * Setter for IpFilter.
     * Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'
     * @param ipFilter Value for List of String
     */
    @JsonSetter("ip-filter")
    public void setIpFilter(List<String> ipFilter) {
        this.ipFilter = ipFilter;
    }

    /**
     * Getter for MysqlSettings.
     * @return Returns the MysqlConfConfigurationValues
     */
    @JsonGetter("mysql-settings")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MysqlConfConfigurationValues getMysqlSettings() {
        return mysqlSettings;
    }

    /**
     * Setter for MysqlSettings.
     * @param mysqlSettings Value for MysqlConfConfigurationValues
     */
    @JsonSetter("mysql-settings")
    public void setMysqlSettings(MysqlConfConfigurationValues mysqlSettings) {
        this.mysqlSettings = mysqlSettings;
    }

    /**
     * Getter for Migration.
     * Migrate data from existing server
     * @return Returns the Migration
     */
    @JsonGetter("migration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Migration getMigration() {
        return migration;
    }

    /**
     * Setter for Migration.
     * Migrate data from existing server
     * @param migration Value for Migration
     */
    @JsonSetter("migration")
    public void setMigration(Migration migration) {
        this.migration = migration;
    }

    /**
     * Getter for BinlogRetentionPeriod.
     * The minimum amount of time in seconds to keep binlog entries before deletion. This may be
     * extended for services that require binlog entries for longer than the default for example if
     * using the MySQL Debezium Kafka connector.
     * @return Returns the Long
     */
    @JsonGetter("binlog-retention-period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getBinlogRetentionPeriod() {
        return binlogRetentionPeriod;
    }

    /**
     * Setter for BinlogRetentionPeriod.
     * The minimum amount of time in seconds to keep binlog entries before deletion. This may be
     * extended for services that require binlog entries for longer than the default for example if
     * using the MySQL Debezium Kafka connector.
     * @param binlogRetentionPeriod Value for Long
     */
    @JsonSetter("binlog-retention-period")
    public void setBinlogRetentionPeriod(Long binlogRetentionPeriod) {
        this.binlogRetentionPeriod = binlogRetentionPeriod;
    }

    /**
     * Getter for BackupSchedule.
     * @return Returns the BackupSchedule2
     */
    @JsonGetter("backup-schedule")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BackupSchedule2 getBackupSchedule() {
        return backupSchedule;
    }

    /**
     * Setter for BackupSchedule.
     * @param backupSchedule Value for BackupSchedule2
     */
    @JsonSetter("backup-schedule")
    public void setBackupSchedule(BackupSchedule2 backupSchedule) {
        this.backupSchedule = backupSchedule;
    }

    /**
     * Converts this DbaasMysqlRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DbaasMysqlRequest [" + "maintenance=" + maintenance + ", plan=" + plan
                + ", terminationProtection=" + terminationProtection + ", ipFilter=" + ipFilter
                + ", mysqlSettings=" + mysqlSettings + ", migration=" + migration
                + ", binlogRetentionPeriod=" + binlogRetentionPeriod + ", backupSchedule="
                + backupSchedule + "]";
    }

    /**
     * Builds a new {@link DbaasMysqlRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DbaasMysqlRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .maintenance(getMaintenance())
                .plan(getPlan())
                .terminationProtection(getTerminationProtection())
                .ipFilter(getIpFilter())
                .mysqlSettings(getMysqlSettings())
                .migration(getMigration())
                .binlogRetentionPeriod(getBinlogRetentionPeriod())
                .backupSchedule(getBackupSchedule());
        return builder;
    }

    /**
     * Class to build instances of {@link DbaasMysqlRequest}.
     */
    public static class Builder {
        private Maintenance maintenance;
        private String plan;
        private Boolean terminationProtection;
        private List<String> ipFilter;
        private MysqlConfConfigurationValues mysqlSettings;
        private Migration migration;
        private Long binlogRetentionPeriod;
        private BackupSchedule2 backupSchedule;



        /**
         * Setter for maintenance.
         * @param  maintenance  Maintenance value for maintenance.
         * @return Builder
         */
        public Builder maintenance(Maintenance maintenance) {
            this.maintenance = maintenance;
            return this;
        }

        /**
         * Setter for plan.
         * @param  plan  String value for plan.
         * @return Builder
         */
        public Builder plan(String plan) {
            this.plan = plan;
            return this;
        }

        /**
         * Setter for terminationProtection.
         * @param  terminationProtection  Boolean value for terminationProtection.
         * @return Builder
         */
        public Builder terminationProtection(Boolean terminationProtection) {
            this.terminationProtection = terminationProtection;
            return this;
        }

        /**
         * Setter for ipFilter.
         * @param  ipFilter  List of String value for ipFilter.
         * @return Builder
         */
        public Builder ipFilter(List<String> ipFilter) {
            this.ipFilter = ipFilter;
            return this;
        }

        /**
         * Setter for mysqlSettings.
         * @param  mysqlSettings  MysqlConfConfigurationValues value for mysqlSettings.
         * @return Builder
         */
        public Builder mysqlSettings(MysqlConfConfigurationValues mysqlSettings) {
            this.mysqlSettings = mysqlSettings;
            return this;
        }

        /**
         * Setter for migration.
         * @param  migration  Migration value for migration.
         * @return Builder
         */
        public Builder migration(Migration migration) {
            this.migration = migration;
            return this;
        }

        /**
         * Setter for binlogRetentionPeriod.
         * @param  binlogRetentionPeriod  Long value for binlogRetentionPeriod.
         * @return Builder
         */
        public Builder binlogRetentionPeriod(Long binlogRetentionPeriod) {
            this.binlogRetentionPeriod = binlogRetentionPeriod;
            return this;
        }

        /**
         * Setter for backupSchedule.
         * @param  backupSchedule  BackupSchedule2 value for backupSchedule.
         * @return Builder
         */
        public Builder backupSchedule(BackupSchedule2 backupSchedule) {
            this.backupSchedule = backupSchedule;
            return this;
        }

        /**
         * Builds a new {@link DbaasMysqlRequest} object using the set fields.
         * @return {@link DbaasMysqlRequest}
         */
        public DbaasMysqlRequest build() {
            return new DbaasMysqlRequest(maintenance, plan, terminationProtection, ipFilter,
                    mysqlSettings, migration, binlogRetentionPeriod, backupSchedule);
        }
    }
}
