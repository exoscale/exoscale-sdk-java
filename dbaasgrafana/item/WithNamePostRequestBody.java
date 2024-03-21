package com.exoscale.dbaasgrafana.item;

import com.exoscale.models.JsonSchemaGrafana;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithNamePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The forkFromService property
     */
    private String forkFromService;
    /**
     * The grafanaSettings property
     */
    private JsonSchemaGrafana grafanaSettings;
    /**
     * Allowed CIDR address blocks for incoming connections
     */
    private java.util.List<String> ipFilter;
    /**
     * Automatic maintenance settings
     */
    private WithNamePostRequestBodyMaintenance maintenance;
    /**
     * Subscription plan
     */
    private String plan;
    /**
     * Service is protected against termination and powering off
     */
    private Boolean terminationProtection;
    /**
     * Instantiates a new WithNamePostRequestBody and sets the default values.
     */
    public WithNamePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WithNamePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static WithNamePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WithNamePostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("fork-from-service", (n) -> { this.setForkFromService(n.getStringValue()); });
        deserializerMap.put("grafana-settings", (n) -> { this.setGrafanaSettings(n.getObjectValue(JsonSchemaGrafana::createFromDiscriminatorValue)); });
        deserializerMap.put("ip-filter", (n) -> { this.setIpFilter(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("maintenance", (n) -> { this.setMaintenance(n.getObjectValue(WithNamePostRequestBodyMaintenance::createFromDiscriminatorValue)); });
        deserializerMap.put("plan", (n) -> { this.setPlan(n.getStringValue()); });
        deserializerMap.put("termination-protection", (n) -> { this.setTerminationProtection(n.getBooleanValue()); });
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
     * Gets the grafana-settings property value. The grafanaSettings property
     * @return a JsonSchemaGrafana
     */
    @jakarta.annotation.Nullable
    public JsonSchemaGrafana getGrafanaSettings() {
        return this.grafanaSettings;
    }
    /**
     * Gets the ip-filter property value. Allowed CIDR address blocks for incoming connections
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIpFilter() {
        return this.ipFilter;
    }
    /**
     * Gets the maintenance property value. Automatic maintenance settings
     * @return a WithNamePostRequestBodyMaintenance
     */
    @jakarta.annotation.Nullable
    public WithNamePostRequestBodyMaintenance getMaintenance() {
        return this.maintenance;
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
        writer.writeStringValue("fork-from-service", this.getForkFromService());
        writer.writeObjectValue("grafana-settings", this.getGrafanaSettings());
        writer.writeCollectionOfPrimitiveValues("ip-filter", this.getIpFilter());
        writer.writeObjectValue("maintenance", this.getMaintenance());
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
     * Sets the fork-from-service property value. The forkFromService property
     * @param value Value to set for the fork-from-service property.
     */
    public void setForkFromService(@jakarta.annotation.Nullable final String value) {
        this.forkFromService = value;
    }
    /**
     * Sets the grafana-settings property value. The grafanaSettings property
     * @param value Value to set for the grafana-settings property.
     */
    public void setGrafanaSettings(@jakarta.annotation.Nullable final JsonSchemaGrafana value) {
        this.grafanaSettings = value;
    }
    /**
     * Sets the ip-filter property value. Allowed CIDR address blocks for incoming connections
     * @param value Value to set for the ip-filter property.
     */
    public void setIpFilter(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.ipFilter = value;
    }
    /**
     * Sets the maintenance property value. Automatic maintenance settings
     * @param value Value to set for the maintenance property.
     */
    public void setMaintenance(@jakarta.annotation.Nullable final WithNamePostRequestBodyMaintenance value) {
        this.maintenance = value;
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
