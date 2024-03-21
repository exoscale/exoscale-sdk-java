package com.exoscale.dbaasmysql.item;

import com.exoscale.models.JsonSchemaMysql;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasMysqlPostRequestBody implements AdditionalDataHolder, Parsable {
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
    private DbaasMysqlPostRequestBodyBackupSchedule backupSchedule;
    /**
     * The minimum amount of time in seconds to keep binlog entries before deletion. This may be extended for services that require binlog entries for longer than the default for example if using the MySQL Debezium Kafka connector.
     */
    private Long binlogRetentionPeriod;
    /**
     * The forkFromService property
     */
    private String forkFromService;
    /**
     * Service integrations to be enabled when creating the service.
     */
    private java.util.List<DbaasMysqlPostRequestBodyIntegrations> integrations;
    /**
     * Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'
     */
    private java.util.List<String> ipFilter;
    /**
     * Automatic maintenance settings
     */
    private DbaasMysqlPostRequestBodyMaintenance maintenance;
    /**
     * Migrate data from existing server
     */
    private DbaasMysqlPostRequestBodyMigration migration;
    /**
     * The mysqlSettings property
     */
    private JsonSchemaMysql mysqlSettings;
    /**
     * Subscription plan
     */
    private String plan;
    /**
     * ISO time of a backup to recover from for services that support arbitrary times
     */
    private String recoveryBackupTime;
    /**
     * Service is protected against termination and powering off
     */
    private Boolean terminationProtection;
    /**
     * MySQL major version
     */
    private String version;
    /**
     * Instantiates a new DbaasMysqlPostRequestBody and sets the default values.
     */
    public DbaasMysqlPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasMysqlPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static DbaasMysqlPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasMysqlPostRequestBody();
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
     * @return a DbaasMysqlPostRequestBodyBackupSchedule
     */
    @jakarta.annotation.Nullable
    public DbaasMysqlPostRequestBodyBackupSchedule getBackupSchedule() {
        return this.backupSchedule;
    }
    /**
     * Gets the binlog-retention-period property value. The minimum amount of time in seconds to keep binlog entries before deletion. This may be extended for services that require binlog entries for longer than the default for example if using the MySQL Debezium Kafka connector.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getBinlogRetentionPeriod() {
        return this.binlogRetentionPeriod;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(14);
        deserializerMap.put("admin-password", (n) -> { this.setAdminPassword(n.getStringValue()); });
        deserializerMap.put("admin-username", (n) -> { this.setAdminUsername(n.getStringValue()); });
        deserializerMap.put("backup-schedule", (n) -> { this.setBackupSchedule(n.getObjectValue(DbaasMysqlPostRequestBodyBackupSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("binlog-retention-period", (n) -> { this.setBinlogRetentionPeriod(n.getLongValue()); });
        deserializerMap.put("fork-from-service", (n) -> { this.setForkFromService(n.getStringValue()); });
        deserializerMap.put("integrations", (n) -> { this.setIntegrations(n.getCollectionOfObjectValues(DbaasMysqlPostRequestBodyIntegrations::createFromDiscriminatorValue)); });
        deserializerMap.put("ip-filter", (n) -> { this.setIpFilter(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("maintenance", (n) -> { this.setMaintenance(n.getObjectValue(DbaasMysqlPostRequestBodyMaintenance::createFromDiscriminatorValue)); });
        deserializerMap.put("migration", (n) -> { this.setMigration(n.getObjectValue(DbaasMysqlPostRequestBodyMigration::createFromDiscriminatorValue)); });
        deserializerMap.put("mysql-settings", (n) -> { this.setMysqlSettings(n.getObjectValue(JsonSchemaMysql::createFromDiscriminatorValue)); });
        deserializerMap.put("plan", (n) -> { this.setPlan(n.getStringValue()); });
        deserializerMap.put("recovery-backup-time", (n) -> { this.setRecoveryBackupTime(n.getStringValue()); });
        deserializerMap.put("termination-protection", (n) -> { this.setTerminationProtection(n.getBooleanValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
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
     * @return a java.util.List<DbaasMysqlPostRequestBodyIntegrations>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DbaasMysqlPostRequestBodyIntegrations> getIntegrations() {
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
     * @return a DbaasMysqlPostRequestBodyMaintenance
     */
    @jakarta.annotation.Nullable
    public DbaasMysqlPostRequestBodyMaintenance getMaintenance() {
        return this.maintenance;
    }
    /**
     * Gets the migration property value. Migrate data from existing server
     * @return a DbaasMysqlPostRequestBodyMigration
     */
    @jakarta.annotation.Nullable
    public DbaasMysqlPostRequestBodyMigration getMigration() {
        return this.migration;
    }
    /**
     * Gets the mysql-settings property value. The mysqlSettings property
     * @return a JsonSchemaMysql
     */
    @jakarta.annotation.Nullable
    public JsonSchemaMysql getMysqlSettings() {
        return this.mysqlSettings;
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
     * Gets the termination-protection property value. Service is protected against termination and powering off
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTerminationProtection() {
        return this.terminationProtection;
    }
    /**
     * Gets the version property value. MySQL major version
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.version;
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
        writer.writeLongValue("binlog-retention-period", this.getBinlogRetentionPeriod());
        writer.writeStringValue("fork-from-service", this.getForkFromService());
        writer.writeCollectionOfObjectValues("integrations", this.getIntegrations());
        writer.writeCollectionOfPrimitiveValues("ip-filter", this.getIpFilter());
        writer.writeObjectValue("maintenance", this.getMaintenance());
        writer.writeObjectValue("migration", this.getMigration());
        writer.writeObjectValue("mysql-settings", this.getMysqlSettings());
        writer.writeStringValue("plan", this.getPlan());
        writer.writeStringValue("recovery-backup-time", this.getRecoveryBackupTime());
        writer.writeBooleanValue("termination-protection", this.getTerminationProtection());
        writer.writeStringValue("version", this.getVersion());
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
    public void setBackupSchedule(@jakarta.annotation.Nullable final DbaasMysqlPostRequestBodyBackupSchedule value) {
        this.backupSchedule = value;
    }
    /**
     * Sets the binlog-retention-period property value. The minimum amount of time in seconds to keep binlog entries before deletion. This may be extended for services that require binlog entries for longer than the default for example if using the MySQL Debezium Kafka connector.
     * @param value Value to set for the binlog-retention-period property.
     */
    public void setBinlogRetentionPeriod(@jakarta.annotation.Nullable final Long value) {
        this.binlogRetentionPeriod = value;
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
    public void setIntegrations(@jakarta.annotation.Nullable final java.util.List<DbaasMysqlPostRequestBodyIntegrations> value) {
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
    public void setMaintenance(@jakarta.annotation.Nullable final DbaasMysqlPostRequestBodyMaintenance value) {
        this.maintenance = value;
    }
    /**
     * Sets the migration property value. Migrate data from existing server
     * @param value Value to set for the migration property.
     */
    public void setMigration(@jakarta.annotation.Nullable final DbaasMysqlPostRequestBodyMigration value) {
        this.migration = value;
    }
    /**
     * Sets the mysql-settings property value. The mysqlSettings property
     * @param value Value to set for the mysql-settings property.
     */
    public void setMysqlSettings(@jakarta.annotation.Nullable final JsonSchemaMysql value) {
        this.mysqlSettings = value;
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
     * Sets the termination-protection property value. Service is protected against termination and powering off
     * @param value Value to set for the termination-protection property.
     */
    public void setTerminationProtection(@jakarta.annotation.Nullable final Boolean value) {
        this.terminationProtection = value;
    }
    /**
     * Sets the version property value. MySQL major version
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.version = value;
    }
}
