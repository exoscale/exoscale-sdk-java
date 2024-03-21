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
 * This is a model class for DbaasPostgresRequest1 type.
 */
public class DbaasPostgresRequest1 {
    private PGBouncerConnectionPoolingSettings pgbouncerSettings;
    private BackupSchedule2 backupSchedule;
    private EnumPgVariantEnum variant;
    private List<Integration> integrations;
    private TimescaleDBExtensionConfigurationValues timescaledbSettings;
    private List<String> ipFilter;
    private Boolean terminationProtection;
    private String forkFromService;
    private EnumPgSynchronousReplicationEnum synchronousReplication;
    private String recoveryBackupTime;
    private PGLookoutSettings pglookoutSettings;
    private Maintenance maintenance;
    private String adminUsername;
    private DbaasPgTargetVersionsEnum version;
    private String plan;
    private Long workMem;
    private Long sharedBuffersPercentage;
    private PostgresqlConfConfigurationValues pgSettings;
    private String adminPassword;
    private Migration migration;

    /**
     * Default constructor.
     */
    public DbaasPostgresRequest1() {
    }

    /**
     * Initialization constructor.
     * @param  plan  String value for plan.
     * @param  pgbouncerSettings  PGBouncerConnectionPoolingSettings value for pgbouncerSettings.
     * @param  backupSchedule  BackupSchedule2 value for backupSchedule.
     * @param  variant  EnumPgVariantEnum value for variant.
     * @param  integrations  List of Integration value for integrations.
     * @param  timescaledbSettings  TimescaleDBExtensionConfigurationValues value for
     *         timescaledbSettings.
     * @param  ipFilter  List of String value for ipFilter.
     * @param  terminationProtection  Boolean value for terminationProtection.
     * @param  forkFromService  String value for forkFromService.
     * @param  synchronousReplication  EnumPgSynchronousReplicationEnum value for
     *         synchronousReplication.
     * @param  recoveryBackupTime  String value for recoveryBackupTime.
     * @param  pglookoutSettings  PGLookoutSettings value for pglookoutSettings.
     * @param  maintenance  Maintenance value for maintenance.
     * @param  adminUsername  String value for adminUsername.
     * @param  version  DbaasPgTargetVersionsEnum value for version.
     * @param  workMem  Long value for workMem.
     * @param  sharedBuffersPercentage  Long value for sharedBuffersPercentage.
     * @param  pgSettings  PostgresqlConfConfigurationValues value for pgSettings.
     * @param  adminPassword  String value for adminPassword.
     * @param  migration  Migration value for migration.
     */
    public DbaasPostgresRequest1(
            String plan,
            PGBouncerConnectionPoolingSettings pgbouncerSettings,
            BackupSchedule2 backupSchedule,
            EnumPgVariantEnum variant,
            List<Integration> integrations,
            TimescaleDBExtensionConfigurationValues timescaledbSettings,
            List<String> ipFilter,
            Boolean terminationProtection,
            String forkFromService,
            EnumPgSynchronousReplicationEnum synchronousReplication,
            String recoveryBackupTime,
            PGLookoutSettings pglookoutSettings,
            Maintenance maintenance,
            String adminUsername,
            DbaasPgTargetVersionsEnum version,
            Long workMem,
            Long sharedBuffersPercentage,
            PostgresqlConfConfigurationValues pgSettings,
            String adminPassword,
            Migration migration) {
        this.pgbouncerSettings = pgbouncerSettings;
        this.backupSchedule = backupSchedule;
        this.variant = variant;
        this.integrations = integrations;
        this.timescaledbSettings = timescaledbSettings;
        this.ipFilter = ipFilter;
        this.terminationProtection = terminationProtection;
        this.forkFromService = forkFromService;
        this.synchronousReplication = synchronousReplication;
        this.recoveryBackupTime = recoveryBackupTime;
        this.pglookoutSettings = pglookoutSettings;
        this.maintenance = maintenance;
        this.adminUsername = adminUsername;
        this.version = version;
        this.plan = plan;
        this.workMem = workMem;
        this.sharedBuffersPercentage = sharedBuffersPercentage;
        this.pgSettings = pgSettings;
        this.adminPassword = adminPassword;
        this.migration = migration;
    }

    /**
     * Getter for PgbouncerSettings.
     * @return Returns the PGBouncerConnectionPoolingSettings
     */
    @JsonGetter("pgbouncer-settings")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PGBouncerConnectionPoolingSettings getPgbouncerSettings() {
        return pgbouncerSettings;
    }

    /**
     * Setter for PgbouncerSettings.
     * @param pgbouncerSettings Value for PGBouncerConnectionPoolingSettings
     */
    @JsonSetter("pgbouncer-settings")
    public void setPgbouncerSettings(PGBouncerConnectionPoolingSettings pgbouncerSettings) {
        this.pgbouncerSettings = pgbouncerSettings;
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
     * Getter for Variant.
     * @return Returns the EnumPgVariantEnum
     */
    @JsonGetter("variant")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public EnumPgVariantEnum getVariant() {
        return variant;
    }

    /**
     * Setter for Variant.
     * @param variant Value for EnumPgVariantEnum
     */
    @JsonSetter("variant")
    public void setVariant(EnumPgVariantEnum variant) {
        this.variant = variant;
    }

    /**
     * Getter for Integrations.
     * Service integrations to be enabled when creating the service.
     * @return Returns the List of Integration
     */
    @JsonGetter("integrations")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integration> getIntegrations() {
        return integrations;
    }

    /**
     * Setter for Integrations.
     * Service integrations to be enabled when creating the service.
     * @param integrations Value for List of Integration
     */
    @JsonSetter("integrations")
    public void setIntegrations(List<Integration> integrations) {
        this.integrations = integrations;
    }

    /**
     * Getter for TimescaledbSettings.
     * @return Returns the TimescaleDBExtensionConfigurationValues
     */
    @JsonGetter("timescaledb-settings")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TimescaleDBExtensionConfigurationValues getTimescaledbSettings() {
        return timescaledbSettings;
    }

    /**
     * Setter for TimescaledbSettings.
     * @param timescaledbSettings Value for TimescaleDBExtensionConfigurationValues
     */
    @JsonSetter("timescaledb-settings")
    public void setTimescaledbSettings(TimescaleDBExtensionConfigurationValues timescaledbSettings) {
        this.timescaledbSettings = timescaledbSettings;
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
     * Getter for ForkFromService.
     * @return Returns the String
     */
    @JsonGetter("fork-from-service")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getForkFromService() {
        return forkFromService;
    }

    /**
     * Setter for ForkFromService.
     * @param forkFromService Value for String
     */
    @JsonSetter("fork-from-service")
    public void setForkFromService(String forkFromService) {
        this.forkFromService = forkFromService;
    }

    /**
     * Getter for SynchronousReplication.
     * @return Returns the EnumPgSynchronousReplicationEnum
     */
    @JsonGetter("synchronous-replication")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public EnumPgSynchronousReplicationEnum getSynchronousReplication() {
        return synchronousReplication;
    }

    /**
     * Setter for SynchronousReplication.
     * @param synchronousReplication Value for EnumPgSynchronousReplicationEnum
     */
    @JsonSetter("synchronous-replication")
    public void setSynchronousReplication(EnumPgSynchronousReplicationEnum synchronousReplication) {
        this.synchronousReplication = synchronousReplication;
    }

    /**
     * Getter for RecoveryBackupTime.
     * ISO time of a backup to recover from for services that support arbitrary times
     * @return Returns the String
     */
    @JsonGetter("recovery-backup-time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRecoveryBackupTime() {
        return recoveryBackupTime;
    }

    /**
     * Setter for RecoveryBackupTime.
     * ISO time of a backup to recover from for services that support arbitrary times
     * @param recoveryBackupTime Value for String
     */
    @JsonSetter("recovery-backup-time")
    public void setRecoveryBackupTime(String recoveryBackupTime) {
        this.recoveryBackupTime = recoveryBackupTime;
    }

    /**
     * Getter for PglookoutSettings.
     * @return Returns the PGLookoutSettings
     */
    @JsonGetter("pglookout-settings")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PGLookoutSettings getPglookoutSettings() {
        return pglookoutSettings;
    }

    /**
     * Setter for PglookoutSettings.
     * @param pglookoutSettings Value for PGLookoutSettings
     */
    @JsonSetter("pglookout-settings")
    public void setPglookoutSettings(PGLookoutSettings pglookoutSettings) {
        this.pglookoutSettings = pglookoutSettings;
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
     * Getter for AdminUsername.
     * Custom username for admin user. This must be set only when a new service is being created.
     * @return Returns the String
     */
    @JsonGetter("admin-username")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAdminUsername() {
        return adminUsername;
    }

    /**
     * Setter for AdminUsername.
     * Custom username for admin user. This must be set only when a new service is being created.
     * @param adminUsername Value for String
     */
    @JsonSetter("admin-username")
    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    /**
     * Getter for Version.
     * @return Returns the DbaasPgTargetVersionsEnum
     */
    @JsonGetter("version")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DbaasPgTargetVersionsEnum getVersion() {
        return version;
    }

    /**
     * Setter for Version.
     * @param version Value for DbaasPgTargetVersionsEnum
     */
    @JsonSetter("version")
    public void setVersion(DbaasPgTargetVersionsEnum version) {
        this.version = version;
    }

    /**
     * Getter for Plan.
     * Subscription plan
     * @return Returns the String
     */
    @JsonGetter("plan")
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
     * Getter for WorkMem.
     * Sets the maximum amount of memory to be used by a query operation (such as a sort or hash
     * table) before writing to temporary disk files, in MB. Default is 1MB + 0.075% of total RAM
     * (up to 32MB).
     * @return Returns the Long
     */
    @JsonGetter("work-mem")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getWorkMem() {
        return workMem;
    }

    /**
     * Setter for WorkMem.
     * Sets the maximum amount of memory to be used by a query operation (such as a sort or hash
     * table) before writing to temporary disk files, in MB. Default is 1MB + 0.075% of total RAM
     * (up to 32MB).
     * @param workMem Value for Long
     */
    @JsonSetter("work-mem")
    public void setWorkMem(Long workMem) {
        this.workMem = workMem;
    }

    /**
     * Getter for SharedBuffersPercentage.
     * Percentage of total RAM that the database server uses for shared memory buffers. Valid range
     * is 20-60 (float), which corresponds to 20% - 60%. This setting adjusts the shared_buffers
     * configuration value.
     * @return Returns the Long
     */
    @JsonGetter("shared-buffers-percentage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getSharedBuffersPercentage() {
        return sharedBuffersPercentage;
    }

    /**
     * Setter for SharedBuffersPercentage.
     * Percentage of total RAM that the database server uses for shared memory buffers. Valid range
     * is 20-60 (float), which corresponds to 20% - 60%. This setting adjusts the shared_buffers
     * configuration value.
     * @param sharedBuffersPercentage Value for Long
     */
    @JsonSetter("shared-buffers-percentage")
    public void setSharedBuffersPercentage(Long sharedBuffersPercentage) {
        this.sharedBuffersPercentage = sharedBuffersPercentage;
    }

    /**
     * Getter for PgSettings.
     * @return Returns the PostgresqlConfConfigurationValues
     */
    @JsonGetter("pg-settings")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PostgresqlConfConfigurationValues getPgSettings() {
        return pgSettings;
    }

    /**
     * Setter for PgSettings.
     * @param pgSettings Value for PostgresqlConfConfigurationValues
     */
    @JsonSetter("pg-settings")
    public void setPgSettings(PostgresqlConfConfigurationValues pgSettings) {
        this.pgSettings = pgSettings;
    }

    /**
     * Getter for AdminPassword.
     * Custom password for admin user. Defaults to random string. This must be set only when a new
     * service is being created.
     * @return Returns the String
     */
    @JsonGetter("admin-password")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * Setter for AdminPassword.
     * Custom password for admin user. Defaults to random string. This must be set only when a new
     * service is being created.
     * @param adminPassword Value for String
     */
    @JsonSetter("admin-password")
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
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
     * Converts this DbaasPostgresRequest1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DbaasPostgresRequest1 [" + "plan=" + plan + ", pgbouncerSettings="
                + pgbouncerSettings + ", backupSchedule=" + backupSchedule + ", variant=" + variant
                + ", integrations=" + integrations + ", timescaledbSettings=" + timescaledbSettings
                + ", ipFilter=" + ipFilter + ", terminationProtection=" + terminationProtection
                + ", forkFromService=" + forkFromService + ", synchronousReplication="
                + synchronousReplication + ", recoveryBackupTime=" + recoveryBackupTime
                + ", pglookoutSettings=" + pglookoutSettings + ", maintenance=" + maintenance
                + ", adminUsername=" + adminUsername + ", version=" + version + ", workMem="
                + workMem + ", sharedBuffersPercentage=" + sharedBuffersPercentage + ", pgSettings="
                + pgSettings + ", adminPassword=" + adminPassword + ", migration=" + migration
                + "]";
    }

    /**
     * Builds a new {@link DbaasPostgresRequest1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DbaasPostgresRequest1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(plan)
                .pgbouncerSettings(getPgbouncerSettings())
                .backupSchedule(getBackupSchedule())
                .variant(getVariant())
                .integrations(getIntegrations())
                .timescaledbSettings(getTimescaledbSettings())
                .ipFilter(getIpFilter())
                .terminationProtection(getTerminationProtection())
                .forkFromService(getForkFromService())
                .synchronousReplication(getSynchronousReplication())
                .recoveryBackupTime(getRecoveryBackupTime())
                .pglookoutSettings(getPglookoutSettings())
                .maintenance(getMaintenance())
                .adminUsername(getAdminUsername())
                .version(getVersion())
                .workMem(getWorkMem())
                .sharedBuffersPercentage(getSharedBuffersPercentage())
                .pgSettings(getPgSettings())
                .adminPassword(getAdminPassword())
                .migration(getMigration());
        return builder;
    }

    /**
     * Class to build instances of {@link DbaasPostgresRequest1}.
     */
    public static class Builder {
        private String plan;
        private PGBouncerConnectionPoolingSettings pgbouncerSettings;
        private BackupSchedule2 backupSchedule;
        private EnumPgVariantEnum variant;
        private List<Integration> integrations;
        private TimescaleDBExtensionConfigurationValues timescaledbSettings;
        private List<String> ipFilter;
        private Boolean terminationProtection;
        private String forkFromService;
        private EnumPgSynchronousReplicationEnum synchronousReplication;
        private String recoveryBackupTime;
        private PGLookoutSettings pglookoutSettings;
        private Maintenance maintenance;
        private String adminUsername;
        private DbaasPgTargetVersionsEnum version;
        private Long workMem;
        private Long sharedBuffersPercentage;
        private PostgresqlConfConfigurationValues pgSettings;
        private String adminPassword;
        private Migration migration;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  plan  String value for plan.
         */
        public Builder(String plan) {
            this.plan = plan;
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
         * Setter for pgbouncerSettings.
         * @param  pgbouncerSettings  PGBouncerConnectionPoolingSettings value for
         *         pgbouncerSettings.
         * @return Builder
         */
        public Builder pgbouncerSettings(PGBouncerConnectionPoolingSettings pgbouncerSettings) {
            this.pgbouncerSettings = pgbouncerSettings;
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
         * Setter for variant.
         * @param  variant  EnumPgVariantEnum value for variant.
         * @return Builder
         */
        public Builder variant(EnumPgVariantEnum variant) {
            this.variant = variant;
            return this;
        }

        /**
         * Setter for integrations.
         * @param  integrations  List of Integration value for integrations.
         * @return Builder
         */
        public Builder integrations(List<Integration> integrations) {
            this.integrations = integrations;
            return this;
        }

        /**
         * Setter for timescaledbSettings.
         * @param  timescaledbSettings  TimescaleDBExtensionConfigurationValues value for
         *         timescaledbSettings.
         * @return Builder
         */
        public Builder timescaledbSettings(
                TimescaleDBExtensionConfigurationValues timescaledbSettings) {
            this.timescaledbSettings = timescaledbSettings;
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
         * Setter for terminationProtection.
         * @param  terminationProtection  Boolean value for terminationProtection.
         * @return Builder
         */
        public Builder terminationProtection(Boolean terminationProtection) {
            this.terminationProtection = terminationProtection;
            return this;
        }

        /**
         * Setter for forkFromService.
         * @param  forkFromService  String value for forkFromService.
         * @return Builder
         */
        public Builder forkFromService(String forkFromService) {
            this.forkFromService = forkFromService;
            return this;
        }

        /**
         * Setter for synchronousReplication.
         * @param  synchronousReplication  EnumPgSynchronousReplicationEnum value for
         *         synchronousReplication.
         * @return Builder
         */
        public Builder synchronousReplication(
                EnumPgSynchronousReplicationEnum synchronousReplication) {
            this.synchronousReplication = synchronousReplication;
            return this;
        }

        /**
         * Setter for recoveryBackupTime.
         * @param  recoveryBackupTime  String value for recoveryBackupTime.
         * @return Builder
         */
        public Builder recoveryBackupTime(String recoveryBackupTime) {
            this.recoveryBackupTime = recoveryBackupTime;
            return this;
        }

        /**
         * Setter for pglookoutSettings.
         * @param  pglookoutSettings  PGLookoutSettings value for pglookoutSettings.
         * @return Builder
         */
        public Builder pglookoutSettings(PGLookoutSettings pglookoutSettings) {
            this.pglookoutSettings = pglookoutSettings;
            return this;
        }

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
         * Setter for adminUsername.
         * @param  adminUsername  String value for adminUsername.
         * @return Builder
         */
        public Builder adminUsername(String adminUsername) {
            this.adminUsername = adminUsername;
            return this;
        }

        /**
         * Setter for version.
         * @param  version  DbaasPgTargetVersionsEnum value for version.
         * @return Builder
         */
        public Builder version(DbaasPgTargetVersionsEnum version) {
            this.version = version;
            return this;
        }

        /**
         * Setter for workMem.
         * @param  workMem  Long value for workMem.
         * @return Builder
         */
        public Builder workMem(Long workMem) {
            this.workMem = workMem;
            return this;
        }

        /**
         * Setter for sharedBuffersPercentage.
         * @param  sharedBuffersPercentage  Long value for sharedBuffersPercentage.
         * @return Builder
         */
        public Builder sharedBuffersPercentage(Long sharedBuffersPercentage) {
            this.sharedBuffersPercentage = sharedBuffersPercentage;
            return this;
        }

        /**
         * Setter for pgSettings.
         * @param  pgSettings  PostgresqlConfConfigurationValues value for pgSettings.
         * @return Builder
         */
        public Builder pgSettings(PostgresqlConfConfigurationValues pgSettings) {
            this.pgSettings = pgSettings;
            return this;
        }

        /**
         * Setter for adminPassword.
         * @param  adminPassword  String value for adminPassword.
         * @return Builder
         */
        public Builder adminPassword(String adminPassword) {
            this.adminPassword = adminPassword;
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
         * Builds a new {@link DbaasPostgresRequest1} object using the set fields.
         * @return {@link DbaasPostgresRequest1}
         */
        public DbaasPostgresRequest1 build() {
            return new DbaasPostgresRequest1(plan, pgbouncerSettings, backupSchedule, variant,
                    integrations, timescaledbSettings, ipFilter, terminationProtection,
                    forkFromService, synchronousReplication, recoveryBackupTime, pglookoutSettings,
                    maintenance, adminUsername, version, workMem, sharedBuffersPercentage,
                    pgSettings, adminPassword, migration);
        }
    }
}
