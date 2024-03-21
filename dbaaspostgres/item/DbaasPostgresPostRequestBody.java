package com.exoscale.dbaaspostgres.item;

import com.exoscale.models.DbaasPgTargetVersions;
import com.exoscale.models.EnumPgSynchronousReplication;
import com.exoscale.models.EnumPgVariant;
import com.exoscale.models.JsonSchemaPg;
import com.exoscale.models.JsonSchemaPgbouncer;
import com.exoscale.models.JsonSchemaPglookout;
import com.exoscale.models.JsonSchemaTimescaledb;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasPostgresPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Custom password for admin user. Defaults to random string. This must be set only when a new service is being created.
     */
    private String adminPassword;
    /**
     * Custom username for admin user. This must be set only when a new service is being created.
     */
    private String adminUsername;
    /**
     * The backupSchedule property
     */
    private DbaasPostgresPostRequestBodyBackupSchedule backupSchedule;
    /**
     * The forkFromService property
     */
    private String forkFromService;
    /**
     * Service integrations to be enabled when creating the service.
     */
    private java.util.List<DbaasPostgresPostRequestBodyIntegrations> integrations;
    /**
     * Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'
     */
    private java.util.List<String> ipFilter;
    /**
     * Automatic maintenance settings
     */
    private DbaasPostgresPostRequestBodyMaintenance maintenance;
    /**
     * Migrate data from existing server
     */
    private DbaasPostgresPostRequestBodyMigration migration;
    /**
     * The pgbouncerSettings property
     */
    private JsonSchemaPgbouncer pgbouncerSettings;
    /**
     * The pglookoutSettings property
     */
    private JsonSchemaPglookout pglookoutSettings;
    /**
     * The pgSettings property
     */
    private JsonSchemaPg pgSettings;
    /**
     * Subscription plan
     */
    private String plan;
    /**
     * ISO time of a backup to recover from for services that support arbitrary times
     */
    private String recoveryBackupTime;
    /**
     * Percentage of total RAM that the database server uses for shared memory buffers. Valid range is 20-60 (float), which corresponds to 20% - 60%. This setting adjusts the shared_buffers configuration value.
     */
    private Long sharedBuffersPercentage;
    /**
     * The synchronousReplication property
     */
    private EnumPgSynchronousReplication synchronousReplication;
    /**
     * Service is protected against termination and powering off
     */
    private Boolean terminationProtection;
    /**
     * The timescaledbSettings property
     */
    private JsonSchemaTimescaledb timescaledbSettings;
    /**
     * The variant property
     */
    private EnumPgVariant variant;
    /**
     * The version property
     */
    private DbaasPgTargetVersions version;
    /**
     * Sets the maximum amount of memory to be used by a query operation (such as a sort or hash table) before writing to temporary disk files, in MB. Default is 1MB + 0.075% of total RAM (up to 32MB).
     */
    private Long workMem;
    /**
     * Instantiates a new DbaasPostgresPostRequestBody and sets the default values.
     */
    public DbaasPostgresPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasPostgresPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static DbaasPostgresPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasPostgresPostRequestBody();
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
     * Gets the admin-password property value. Custom password for admin user. Defaults to random string. This must be set only when a new service is being created.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAdminPassword() {
        return this.adminPassword;
    }
    /**
     * Gets the admin-username property value. Custom username for admin user. This must be set only when a new service is being created.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAdminUsername() {
        return this.adminUsername;
    }
    /**
     * Gets the backup-schedule property value. The backupSchedule property
     * @return a DbaasPostgresPostRequestBodyBackupSchedule
     */
    @jakarta.annotation.Nullable
    public DbaasPostgresPostRequestBodyBackupSchedule getBackupSchedule() {
        return this.backupSchedule;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(20);
        deserializerMap.put("admin-password", (n) -> { this.setAdminPassword(n.getStringValue()); });
        deserializerMap.put("admin-username", (n) -> { this.setAdminUsername(n.getStringValue()); });
        deserializerMap.put("backup-schedule", (n) -> { this.setBackupSchedule(n.getObjectValue(DbaasPostgresPostRequestBodyBackupSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("fork-from-service", (n) -> { this.setForkFromService(n.getStringValue()); });
        deserializerMap.put("integrations", (n) -> { this.setIntegrations(n.getCollectionOfObjectValues(DbaasPostgresPostRequestBodyIntegrations::createFromDiscriminatorValue)); });
        deserializerMap.put("ip-filter", (n) -> { this.setIpFilter(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("maintenance", (n) -> { this.setMaintenance(n.getObjectValue(DbaasPostgresPostRequestBodyMaintenance::createFromDiscriminatorValue)); });
        deserializerMap.put("migration", (n) -> { this.setMigration(n.getObjectValue(DbaasPostgresPostRequestBodyMigration::createFromDiscriminatorValue)); });
        deserializerMap.put("pgbouncer-settings", (n) -> { this.setPgbouncerSettings(n.getObjectValue(JsonSchemaPgbouncer::createFromDiscriminatorValue)); });
        deserializerMap.put("pglookout-settings", (n) -> { this.setPglookoutSettings(n.getObjectValue(JsonSchemaPglookout::createFromDiscriminatorValue)); });
        deserializerMap.put("pg-settings", (n) -> { this.setPgSettings(n.getObjectValue(JsonSchemaPg::createFromDiscriminatorValue)); });
        deserializerMap.put("plan", (n) -> { this.setPlan(n.getStringValue()); });
        deserializerMap.put("recovery-backup-time", (n) -> { this.setRecoveryBackupTime(n.getStringValue()); });
        deserializerMap.put("shared-buffers-percentage", (n) -> { this.setSharedBuffersPercentage(n.getLongValue()); });
        deserializerMap.put("synchronous-replication", (n) -> { this.setSynchronousReplication(n.getEnumValue(EnumPgSynchronousReplication::forValue)); });
        deserializerMap.put("termination-protection", (n) -> { this.setTerminationProtection(n.getBooleanValue()); });
        deserializerMap.put("timescaledb-settings", (n) -> { this.setTimescaledbSettings(n.getObjectValue(JsonSchemaTimescaledb::createFromDiscriminatorValue)); });
        deserializerMap.put("variant", (n) -> { this.setVariant(n.getEnumValue(EnumPgVariant::forValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getEnumValue(DbaasPgTargetVersions::forValue)); });
        deserializerMap.put("work-mem", (n) -> { this.setWorkMem(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fork-from-service property value. The forkFromService property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getForkFromService() {
        return this.forkFromService;
    }
    /**
     * Gets the integrations property value. Service integrations to be enabled when creating the service.
     * @return a java.util.List<DbaasPostgresPostRequestBodyIntegrations>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DbaasPostgresPostRequestBodyIntegrations> getIntegrations() {
        return this.integrations;
    }
    /**
     * Gets the ip-filter property value. Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIpFilter() {
        return this.ipFilter;
    }
    /**
     * Gets the maintenance property value. Automatic maintenance settings
     * @return a DbaasPostgresPostRequestBodyMaintenance
     */
    @jakarta.annotation.Nullable
    public DbaasPostgresPostRequestBodyMaintenance getMaintenance() {
        return this.maintenance;
    }
    /**
     * Gets the migration property value. Migrate data from existing server
     * @return a DbaasPostgresPostRequestBodyMigration
     */
    @jakarta.annotation.Nullable
    public DbaasPostgresPostRequestBodyMigration getMigration() {
        return this.migration;
    }
    /**
     * Gets the pgbouncer-settings property value. The pgbouncerSettings property
     * @return a JsonSchemaPgbouncer
     */
    @jakarta.annotation.Nullable
    public JsonSchemaPgbouncer getPgbouncerSettings() {
        return this.pgbouncerSettings;
    }
    /**
     * Gets the pglookout-settings property value. The pglookoutSettings property
     * @return a JsonSchemaPglookout
     */
    @jakarta.annotation.Nullable
    public JsonSchemaPglookout getPglookoutSettings() {
        return this.pglookoutSettings;
    }
    /**
     * Gets the pg-settings property value. The pgSettings property
     * @return a JsonSchemaPg
     */
    @jakarta.annotation.Nullable
    public JsonSchemaPg getPgSettings() {
        return this.pgSettings;
    }
    /**
     * Gets the plan property value. Subscription plan
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPlan() {
        return this.plan;
    }
    /**
     * Gets the recovery-backup-time property value. ISO time of a backup to recover from for services that support arbitrary times
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRecoveryBackupTime() {
        return this.recoveryBackupTime;
    }
    /**
     * Gets the shared-buffers-percentage property value. Percentage of total RAM that the database server uses for shared memory buffers. Valid range is 20-60 (float), which corresponds to 20% - 60%. This setting adjusts the shared_buffers configuration value.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSharedBuffersPercentage() {
        return this.sharedBuffersPercentage;
    }
    /**
     * Gets the synchronous-replication property value. The synchronousReplication property
     * @return a EnumPgSynchronousReplication
     */
    @jakarta.annotation.Nullable
    public EnumPgSynchronousReplication getSynchronousReplication() {
        return this.synchronousReplication;
    }
    /**
     * Gets the termination-protection property value. Service is protected against termination and powering off
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTerminationProtection() {
        return this.terminationProtection;
    }
    /**
     * Gets the timescaledb-settings property value. The timescaledbSettings property
     * @return a JsonSchemaTimescaledb
     */
    @jakarta.annotation.Nullable
    public JsonSchemaTimescaledb getTimescaledbSettings() {
        return this.timescaledbSettings;
    }
    /**
     * Gets the variant property value. The variant property
     * @return a EnumPgVariant
     */
    @jakarta.annotation.Nullable
    public EnumPgVariant getVariant() {
        return this.variant;
    }
    /**
     * Gets the version property value. The version property
     * @return a DbaasPgTargetVersions
     */
    @jakarta.annotation.Nullable
    public DbaasPgTargetVersions getVersion() {
        return this.version;
    }
    /**
     * Gets the work-mem property value. Sets the maximum amount of memory to be used by a query operation (such as a sort or hash table) before writing to temporary disk files, in MB. Default is 1MB + 0.075% of total RAM (up to 32MB).
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getWorkMem() {
        return this.workMem;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("admin-password", this.getAdminPassword());
        writer.writeStringValue("admin-username", this.getAdminUsername());
        writer.writeObjectValue("backup-schedule", this.getBackupSchedule());
        writer.writeStringValue("fork-from-service", this.getForkFromService());
        writer.writeCollectionOfObjectValues("integrations", this.getIntegrations());
        writer.writeCollectionOfPrimitiveValues("ip-filter", this.getIpFilter());
        writer.writeObjectValue("maintenance", this.getMaintenance());
        writer.writeObjectValue("migration", this.getMigration());
        writer.writeObjectValue("pgbouncer-settings", this.getPgbouncerSettings());
        writer.writeObjectValue("pglookout-settings", this.getPglookoutSettings());
        writer.writeObjectValue("pg-settings", this.getPgSettings());
        writer.writeStringValue("plan", this.getPlan());
        writer.writeStringValue("recovery-backup-time", this.getRecoveryBackupTime());
        writer.writeLongValue("shared-buffers-percentage", this.getSharedBuffersPercentage());
        writer.writeEnumValue("synchronous-replication", this.getSynchronousReplication());
        writer.writeBooleanValue("termination-protection", this.getTerminationProtection());
        writer.writeObjectValue("timescaledb-settings", this.getTimescaledbSettings());
        writer.writeEnumValue("variant", this.getVariant());
        writer.writeEnumValue("version", this.getVersion());
        writer.writeLongValue("work-mem", this.getWorkMem());
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
     * Sets the admin-password property value. Custom password for admin user. Defaults to random string. This must be set only when a new service is being created.
     * @param value Value to set for the admin-password property.
     */
    public void setAdminPassword(@jakarta.annotation.Nullable final String value) {
        this.adminPassword = value;
    }
    /**
     * Sets the admin-username property value. Custom username for admin user. This must be set only when a new service is being created.
     * @param value Value to set for the admin-username property.
     */
    public void setAdminUsername(@jakarta.annotation.Nullable final String value) {
        this.adminUsername = value;
    }
    /**
     * Sets the backup-schedule property value. The backupSchedule property
     * @param value Value to set for the backup-schedule property.
     */
    public void setBackupSchedule(@jakarta.annotation.Nullable final DbaasPostgresPostRequestBodyBackupSchedule value) {
        this.backupSchedule = value;
    }
    /**
     * Sets the fork-from-service property value. The forkFromService property
     * @param value Value to set for the fork-from-service property.
     */
    public void setForkFromService(@jakarta.annotation.Nullable final String value) {
        this.forkFromService = value;
    }
    /**
     * Sets the integrations property value. Service integrations to be enabled when creating the service.
     * @param value Value to set for the integrations property.
     */
    public void setIntegrations(@jakarta.annotation.Nullable final java.util.List<DbaasPostgresPostRequestBodyIntegrations> value) {
        this.integrations = value;
    }
    /**
     * Sets the ip-filter property value. Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'
     * @param value Value to set for the ip-filter property.
     */
    public void setIpFilter(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.ipFilter = value;
    }
    /**
     * Sets the maintenance property value. Automatic maintenance settings
     * @param value Value to set for the maintenance property.
     */
    public void setMaintenance(@jakarta.annotation.Nullable final DbaasPostgresPostRequestBodyMaintenance value) {
        this.maintenance = value;
    }
    /**
     * Sets the migration property value. Migrate data from existing server
     * @param value Value to set for the migration property.
     */
    public void setMigration(@jakarta.annotation.Nullable final DbaasPostgresPostRequestBodyMigration value) {
        this.migration = value;
    }
    /**
     * Sets the pgbouncer-settings property value. The pgbouncerSettings property
     * @param value Value to set for the pgbouncer-settings property.
     */
    public void setPgbouncerSettings(@jakarta.annotation.Nullable final JsonSchemaPgbouncer value) {
        this.pgbouncerSettings = value;
    }
    /**
     * Sets the pglookout-settings property value. The pglookoutSettings property
     * @param value Value to set for the pglookout-settings property.
     */
    public void setPglookoutSettings(@jakarta.annotation.Nullable final JsonSchemaPglookout value) {
        this.pglookoutSettings = value;
    }
    /**
     * Sets the pg-settings property value. The pgSettings property
     * @param value Value to set for the pg-settings property.
     */
    public void setPgSettings(@jakarta.annotation.Nullable final JsonSchemaPg value) {
        this.pgSettings = value;
    }
    /**
     * Sets the plan property value. Subscription plan
     * @param value Value to set for the plan property.
     */
    public void setPlan(@jakarta.annotation.Nullable final String value) {
        this.plan = value;
    }
    /**
     * Sets the recovery-backup-time property value. ISO time of a backup to recover from for services that support arbitrary times
     * @param value Value to set for the recovery-backup-time property.
     */
    public void setRecoveryBackupTime(@jakarta.annotation.Nullable final String value) {
        this.recoveryBackupTime = value;
    }
    /**
     * Sets the shared-buffers-percentage property value. Percentage of total RAM that the database server uses for shared memory buffers. Valid range is 20-60 (float), which corresponds to 20% - 60%. This setting adjusts the shared_buffers configuration value.
     * @param value Value to set for the shared-buffers-percentage property.
     */
    public void setSharedBuffersPercentage(@jakarta.annotation.Nullable final Long value) {
        this.sharedBuffersPercentage = value;
    }
    /**
     * Sets the synchronous-replication property value. The synchronousReplication property
     * @param value Value to set for the synchronous-replication property.
     */
    public void setSynchronousReplication(@jakarta.annotation.Nullable final EnumPgSynchronousReplication value) {
        this.synchronousReplication = value;
    }
    /**
     * Sets the termination-protection property value. Service is protected against termination and powering off
     * @param value Value to set for the termination-protection property.
     */
    public void setTerminationProtection(@jakarta.annotation.Nullable final Boolean value) {
        this.terminationProtection = value;
    }
    /**
     * Sets the timescaledb-settings property value. The timescaledbSettings property
     * @param value Value to set for the timescaledb-settings property.
     */
    public void setTimescaledbSettings(@jakarta.annotation.Nullable final JsonSchemaTimescaledb value) {
        this.timescaledbSettings = value;
    }
    /**
     * Sets the variant property value. The variant property
     * @param value Value to set for the variant property.
     */
    public void setVariant(@jakarta.annotation.Nullable final EnumPgVariant value) {
        this.variant = value;
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final DbaasPgTargetVersions value) {
        this.version = value;
    }
    /**
     * Sets the work-mem property value. Sets the maximum amount of memory to be used by a query operation (such as a sort or hash table) before writing to temporary disk files, in MB. Default is 1MB + 0.075% of total RAM (up to 32MB).
     * @param value Value to set for the work-mem property.
     */
    public void setWorkMem(@jakarta.annotation.Nullable final Long value) {
        this.workMem = value;
    }
}
