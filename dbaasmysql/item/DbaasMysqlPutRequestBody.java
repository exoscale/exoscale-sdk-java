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
public class DbaasMysqlPutRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The backupSchedule property
     */
    private DbaasMysqlPutRequestBodyBackupSchedule backupSchedule;
    /**
     * The minimum amount of time in seconds to keep binlog entries before deletion. This may be extended for services that require binlog entries for longer than the default for example if using the MySQL Debezium Kafka connector.
     */
    private Long binlogRetentionPeriod;
    /**
     * Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'
     */
    private java.util.List<String> ipFilter;
    /**
     * Automatic maintenance settings
     */
    private DbaasMysqlPutRequestBodyMaintenance maintenance;
    /**
     * Migrate data from existing server
     */
    private DbaasMysqlPutRequestBodyMigration migration;
    /**
     * The mysqlSettings property
     */
    private JsonSchemaMysql mysqlSettings;
    /**
     * Subscription plan
     */
    private String plan;
    /**
     * Service is protected against termination and powering off
     */
    private Boolean terminationProtection;
    /**
     * Instantiates a new DbaasMysqlPutRequestBody and sets the default values.
     */
    public DbaasMysqlPutRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasMysqlPutRequestBody
     */
    @jakarta.annotation.Nonnull
    public static DbaasMysqlPutRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasMysqlPutRequestBody();
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
     * Gets the backup-schedule property value. The backupSchedule property
     * @return a DbaasMysqlPutRequestBodyBackupSchedule
     */
    @jakarta.annotation.Nullable
    public DbaasMysqlPutRequestBodyBackupSchedule getBackupSchedule() {
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("backup-schedule", (n) -> { this.setBackupSchedule(n.getObjectValue(DbaasMysqlPutRequestBodyBackupSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("binlog-retention-period", (n) -> { this.setBinlogRetentionPeriod(n.getLongValue()); });
        deserializerMap.put("ip-filter", (n) -> { this.setIpFilter(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("maintenance", (n) -> { this.setMaintenance(n.getObjectValue(DbaasMysqlPutRequestBodyMaintenance::createFromDiscriminatorValue)); });
        deserializerMap.put("migration", (n) -> { this.setMigration(n.getObjectValue(DbaasMysqlPutRequestBodyMigration::createFromDiscriminatorValue)); });
        deserializerMap.put("mysql-settings", (n) -> { this.setMysqlSettings(n.getObjectValue(JsonSchemaMysql::createFromDiscriminatorValue)); });
        deserializerMap.put("plan", (n) -> { this.setPlan(n.getStringValue()); });
        deserializerMap.put("termination-protection", (n) -> { this.setTerminationProtection(n.getBooleanValue()); });
        return deserializerMap;
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
     * @return a DbaasMysqlPutRequestBodyMaintenance
     */
    @jakarta.annotation.Nullable
    public DbaasMysqlPutRequestBodyMaintenance getMaintenance() {
        return this.maintenance;
    }
    /**
     * Gets the migration property value. Migrate data from existing server
     * @return a DbaasMysqlPutRequestBodyMigration
     */
    @jakarta.annotation.Nullable
    public DbaasMysqlPutRequestBodyMigration getMigration() {
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
     * Gets the termination-protection property value. Service is protected against termination and powering off
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTerminationProtection() {
        return this.terminationProtection;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("backup-schedule", this.getBackupSchedule());
        writer.writeLongValue("binlog-retention-period", this.getBinlogRetentionPeriod());
        writer.writeCollectionOfPrimitiveValues("ip-filter", this.getIpFilter());
        writer.writeObjectValue("maintenance", this.getMaintenance());
        writer.writeObjectValue("migration", this.getMigration());
        writer.writeObjectValue("mysql-settings", this.getMysqlSettings());
        writer.writeStringValue("plan", this.getPlan());
        writer.writeBooleanValue("termination-protection", this.getTerminationProtection());
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
     * Sets the backup-schedule property value. The backupSchedule property
     * @param value Value to set for the backup-schedule property.
     */
    public void setBackupSchedule(@jakarta.annotation.Nullable final DbaasMysqlPutRequestBodyBackupSchedule value) {
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
    public void setMaintenance(@jakarta.annotation.Nullable final DbaasMysqlPutRequestBodyMaintenance value) {
        this.maintenance = value;
    }
    /**
     * Sets the migration property value. Migrate data from existing server
     * @param value Value to set for the migration property.
     */
    public void setMigration(@jakarta.annotation.Nullable final DbaasMysqlPutRequestBodyMigration value) {
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
     * Sets the termination-protection property value. Service is protected against termination and powering off
     * @param value Value to set for the termination-protection property.
     */
    public void setTerminationProtection(@jakarta.annotation.Nullable final Boolean value) {
        this.terminationProtection = value;
    }
}
