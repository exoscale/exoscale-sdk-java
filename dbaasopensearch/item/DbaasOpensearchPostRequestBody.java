package com.exoscale.dbaasopensearch.item;

import com.exoscale.models.JsonSchemaOpensearch;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasOpensearchPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The forkFromService property
     */
    private String forkFromService;
    /**
     * Allows you to create glob style patterns and set a max number of indexes matching this pattern you want to keep. Creating indexes exceeding this value will cause the oldest one to get deleted. You could for example create a pattern looking like 'logs.?' and then create index logs.1, logs.2 etc, it will delete logs.1 once you create logs.6. Do note 'logs.?' does not apply to logs.10. Note: Setting max_index_count to 0 will do nothing and the pattern gets ignored.
     */
    private java.util.List<DbaasOpensearchPostRequestBodyIndexPatterns> indexPatterns;
    /**
     * Template settings for all new indexes
     */
    private DbaasOpensearchPostRequestBodyIndexTemplate indexTemplate;
    /**
     * Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'
     */
    private java.util.List<String> ipFilter;
    /**
     * Aiven automation resets index.refresh_interval to default value for every index to be sure that indices are always visible to search. If it doesn't fit your case, you can disable this by setting up this flag to true.
     */
    private Boolean keepIndexRefreshInterval;
    /**
     * Automatic maintenance settings
     */
    private DbaasOpensearchPostRequestBodyMaintenance maintenance;
    /**
     * Maximum number of indexes to keep before deleting the oldest one
     */
    private Long maxIndexCount;
    /**
     * OpenSearch Dashboards settings
     */
    private DbaasOpensearchPostRequestBodyOpensearchDashboards opensearchDashboards;
    /**
     * The opensearchSettings property
     */
    private JsonSchemaOpensearch opensearchSettings;
    /**
     * Subscription plan
     */
    private String plan;
    /**
     * Name of a backup to recover from for services that support backup names
     */
    private String recoveryBackupName;
    /**
     * Service is protected against termination and powering off
     */
    private Boolean terminationProtection;
    /**
     * OpenSearch major version
     */
    private String version;
    /**
     * Instantiates a new DbaasOpensearchPostRequestBody and sets the default values.
     */
    public DbaasOpensearchPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasOpensearchPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static DbaasOpensearchPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasOpensearchPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("fork-from-service", (n) -> { this.setForkFromService(n.getStringValue()); });
        deserializerMap.put("index-patterns", (n) -> { this.setIndexPatterns(n.getCollectionOfObjectValues(DbaasOpensearchPostRequestBodyIndexPatterns::createFromDiscriminatorValue)); });
        deserializerMap.put("index-template", (n) -> { this.setIndexTemplate(n.getObjectValue(DbaasOpensearchPostRequestBodyIndexTemplate::createFromDiscriminatorValue)); });
        deserializerMap.put("ip-filter", (n) -> { this.setIpFilter(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("keep-index-refresh-interval", (n) -> { this.setKeepIndexRefreshInterval(n.getBooleanValue()); });
        deserializerMap.put("maintenance", (n) -> { this.setMaintenance(n.getObjectValue(DbaasOpensearchPostRequestBodyMaintenance::createFromDiscriminatorValue)); });
        deserializerMap.put("max-index-count", (n) -> { this.setMaxIndexCount(n.getLongValue()); });
        deserializerMap.put("opensearch-dashboards", (n) -> { this.setOpensearchDashboards(n.getObjectValue(DbaasOpensearchPostRequestBodyOpensearchDashboards::createFromDiscriminatorValue)); });
        deserializerMap.put("opensearch-settings", (n) -> { this.setOpensearchSettings(n.getObjectValue(JsonSchemaOpensearch::createFromDiscriminatorValue)); });
        deserializerMap.put("plan", (n) -> { this.setPlan(n.getStringValue()); });
        deserializerMap.put("recovery-backup-name", (n) -> { this.setRecoveryBackupName(n.getStringValue()); });
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
     * Gets the index-patterns property value. Allows you to create glob style patterns and set a max number of indexes matching this pattern you want to keep. Creating indexes exceeding this value will cause the oldest one to get deleted. You could for example create a pattern looking like 'logs.?' and then create index logs.1, logs.2 etc, it will delete logs.1 once you create logs.6. Do note 'logs.?' does not apply to logs.10. Note: Setting max_index_count to 0 will do nothing and the pattern gets ignored.
     * @return a java.util.List<DbaasOpensearchPostRequestBodyIndexPatterns>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DbaasOpensearchPostRequestBodyIndexPatterns> getIndexPatterns() {
        return this.indexPatterns;
    }
    /**
     * Gets the index-template property value. Template settings for all new indexes
     * @return a DbaasOpensearchPostRequestBodyIndexTemplate
     */
    @jakarta.annotation.Nullable
    public DbaasOpensearchPostRequestBodyIndexTemplate getIndexTemplate() {
        return this.indexTemplate;
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
     * Gets the keep-index-refresh-interval property value. Aiven automation resets index.refresh_interval to default value for every index to be sure that indices are always visible to search. If it doesn't fit your case, you can disable this by setting up this flag to true.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKeepIndexRefreshInterval() {
        return this.keepIndexRefreshInterval;
    }
    /**
     * Gets the maintenance property value. Automatic maintenance settings
     * @return a DbaasOpensearchPostRequestBodyMaintenance
     */
    @jakarta.annotation.Nullable
    public DbaasOpensearchPostRequestBodyMaintenance getMaintenance() {
        return this.maintenance;
    }
    /**
     * Gets the max-index-count property value. Maximum number of indexes to keep before deleting the oldest one
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getMaxIndexCount() {
        return this.maxIndexCount;
    }
    /**
     * Gets the opensearch-dashboards property value. OpenSearch Dashboards settings
     * @return a DbaasOpensearchPostRequestBodyOpensearchDashboards
     */
    @jakarta.annotation.Nullable
    public DbaasOpensearchPostRequestBodyOpensearchDashboards getOpensearchDashboards() {
        return this.opensearchDashboards;
    }
    /**
     * Gets the opensearch-settings property value. The opensearchSettings property
     * @return a JsonSchemaOpensearch
     */
    @jakarta.annotation.Nullable
    public JsonSchemaOpensearch getOpensearchSettings() {
        return this.opensearchSettings;
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
     * Gets the recovery-backup-name property value. Name of a backup to recover from for services that support backup names
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRecoveryBackupName() {
        return this.recoveryBackupName;
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
     * Gets the version property value. OpenSearch major version
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
        writer.writeStringValue("fork-from-service", this.getForkFromService());
        writer.writeCollectionOfObjectValues("index-patterns", this.getIndexPatterns());
        writer.writeObjectValue("index-template", this.getIndexTemplate());
        writer.writeCollectionOfPrimitiveValues("ip-filter", this.getIpFilter());
        writer.writeBooleanValue("keep-index-refresh-interval", this.getKeepIndexRefreshInterval());
        writer.writeObjectValue("maintenance", this.getMaintenance());
        writer.writeLongValue("max-index-count", this.getMaxIndexCount());
        writer.writeObjectValue("opensearch-dashboards", this.getOpensearchDashboards());
        writer.writeObjectValue("opensearch-settings", this.getOpensearchSettings());
        writer.writeStringValue("plan", this.getPlan());
        writer.writeStringValue("recovery-backup-name", this.getRecoveryBackupName());
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
     * Sets the fork-from-service property value. The forkFromService property
     * @param value Value to set for the fork-from-service property.
     */
    public void setForkFromService(@jakarta.annotation.Nullable final String value) {
        this.forkFromService = value;
    }
    /**
     * Sets the index-patterns property value. Allows you to create glob style patterns and set a max number of indexes matching this pattern you want to keep. Creating indexes exceeding this value will cause the oldest one to get deleted. You could for example create a pattern looking like 'logs.?' and then create index logs.1, logs.2 etc, it will delete logs.1 once you create logs.6. Do note 'logs.?' does not apply to logs.10. Note: Setting max_index_count to 0 will do nothing and the pattern gets ignored.
     * @param value Value to set for the index-patterns property.
     */
    public void setIndexPatterns(@jakarta.annotation.Nullable final java.util.List<DbaasOpensearchPostRequestBodyIndexPatterns> value) {
        this.indexPatterns = value;
    }
    /**
     * Sets the index-template property value. Template settings for all new indexes
     * @param value Value to set for the index-template property.
     */
    public void setIndexTemplate(@jakarta.annotation.Nullable final DbaasOpensearchPostRequestBodyIndexTemplate value) {
        this.indexTemplate = value;
    }
    /**
     * Sets the ip-filter property value. Allow incoming connections from CIDR address block, e.g. '10.20.0.0/16'
     * @param value Value to set for the ip-filter property.
     */
    public void setIpFilter(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.ipFilter = value;
    }
    /**
     * Sets the keep-index-refresh-interval property value. Aiven automation resets index.refresh_interval to default value for every index to be sure that indices are always visible to search. If it doesn't fit your case, you can disable this by setting up this flag to true.
     * @param value Value to set for the keep-index-refresh-interval property.
     */
    public void setKeepIndexRefreshInterval(@jakarta.annotation.Nullable final Boolean value) {
        this.keepIndexRefreshInterval = value;
    }
    /**
     * Sets the maintenance property value. Automatic maintenance settings
     * @param value Value to set for the maintenance property.
     */
    public void setMaintenance(@jakarta.annotation.Nullable final DbaasOpensearchPostRequestBodyMaintenance value) {
        this.maintenance = value;
    }
    /**
     * Sets the max-index-count property value. Maximum number of indexes to keep before deleting the oldest one
     * @param value Value to set for the max-index-count property.
     */
    public void setMaxIndexCount(@jakarta.annotation.Nullable final Long value) {
        this.maxIndexCount = value;
    }
    /**
     * Sets the opensearch-dashboards property value. OpenSearch Dashboards settings
     * @param value Value to set for the opensearch-dashboards property.
     */
    public void setOpensearchDashboards(@jakarta.annotation.Nullable final DbaasOpensearchPostRequestBodyOpensearchDashboards value) {
        this.opensearchDashboards = value;
    }
    /**
     * Sets the opensearch-settings property value. The opensearchSettings property
     * @param value Value to set for the opensearch-settings property.
     */
    public void setOpensearchSettings(@jakarta.annotation.Nullable final JsonSchemaOpensearch value) {
        this.opensearchSettings = value;
    }
    /**
     * Sets the plan property value. Subscription plan
     * @param value Value to set for the plan property.
     */
    public void setPlan(@jakarta.annotation.Nullable final String value) {
        this.plan = value;
    }
    /**
     * Sets the recovery-backup-name property value. Name of a backup to recover from for services that support backup names
     * @param value Value to set for the recovery-backup-name property.
     */
    public void setRecoveryBackupName(@jakarta.annotation.Nullable final String value) {
        this.recoveryBackupName = value;
    }
    /**
     * Sets the termination-protection property value. Service is protected against termination and powering off
     * @param value Value to set for the termination-protection property.
     */
    public void setTerminationProtection(@jakarta.annotation.Nullable final Boolean value) {
        this.terminationProtection = value;
    }
    /**
     * Sets the version property value. OpenSearch major version
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.version = value;
    }
}
