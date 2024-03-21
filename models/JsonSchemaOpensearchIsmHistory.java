package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JsonSchemaOpensearchIsmHistory implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The ism_enabled property
     */
    private Boolean ismEnabled;
    /**
     * The ism_history_enabled property
     */
    private Boolean ismHistoryEnabled;
    /**
     * The ism_history_max_age property
     */
    private Integer ismHistoryMaxAge;
    /**
     * The ism_history_max_docs property
     */
    private Integer ismHistoryMaxDocs;
    /**
     * The ism_history_rollover_check_period property
     */
    private Integer ismHistoryRolloverCheckPeriod;
    /**
     * The ism_history_rollover_retention_period property
     */
    private Integer ismHistoryRolloverRetentionPeriod;
    /**
     * Instantiates a new JsonSchemaOpensearchIsmHistory and sets the default values.
     */
    public JsonSchemaOpensearchIsmHistory() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JsonSchemaOpensearchIsmHistory
     */
    @jakarta.annotation.Nonnull
    public static JsonSchemaOpensearchIsmHistory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JsonSchemaOpensearchIsmHistory();
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
        deserializerMap.put("ism_enabled", (n) -> { this.setIsmEnabled(n.getBooleanValue()); });
        deserializerMap.put("ism_history_enabled", (n) -> { this.setIsmHistoryEnabled(n.getBooleanValue()); });
        deserializerMap.put("ism_history_max_age", (n) -> { this.setIsmHistoryMaxAge(n.getIntegerValue()); });
        deserializerMap.put("ism_history_max_docs", (n) -> { this.setIsmHistoryMaxDocs(n.getIntegerValue()); });
        deserializerMap.put("ism_history_rollover_check_period", (n) -> { this.setIsmHistoryRolloverCheckPeriod(n.getIntegerValue()); });
        deserializerMap.put("ism_history_rollover_retention_period", (n) -> { this.setIsmHistoryRolloverRetentionPeriod(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ism_enabled property value. The ism_enabled property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsmEnabled() {
        return this.ismEnabled;
    }
    /**
     * Gets the ism_history_enabled property value. The ism_history_enabled property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsmHistoryEnabled() {
        return this.ismHistoryEnabled;
    }
    /**
     * Gets the ism_history_max_age property value. The ism_history_max_age property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIsmHistoryMaxAge() {
        return this.ismHistoryMaxAge;
    }
    /**
     * Gets the ism_history_max_docs property value. The ism_history_max_docs property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIsmHistoryMaxDocs() {
        return this.ismHistoryMaxDocs;
    }
    /**
     * Gets the ism_history_rollover_check_period property value. The ism_history_rollover_check_period property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIsmHistoryRolloverCheckPeriod() {
        return this.ismHistoryRolloverCheckPeriod;
    }
    /**
     * Gets the ism_history_rollover_retention_period property value. The ism_history_rollover_retention_period property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIsmHistoryRolloverRetentionPeriod() {
        return this.ismHistoryRolloverRetentionPeriod;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("ism_enabled", this.getIsmEnabled());
        writer.writeBooleanValue("ism_history_enabled", this.getIsmHistoryEnabled());
        writer.writeIntegerValue("ism_history_max_age", this.getIsmHistoryMaxAge());
        writer.writeIntegerValue("ism_history_max_docs", this.getIsmHistoryMaxDocs());
        writer.writeIntegerValue("ism_history_rollover_check_period", this.getIsmHistoryRolloverCheckPeriod());
        writer.writeIntegerValue("ism_history_rollover_retention_period", this.getIsmHistoryRolloverRetentionPeriod());
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
     * Sets the ism_enabled property value. The ism_enabled property
     * @param value Value to set for the ism_enabled property.
     */
    public void setIsmEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.ismEnabled = value;
    }
    /**
     * Sets the ism_history_enabled property value. The ism_history_enabled property
     * @param value Value to set for the ism_history_enabled property.
     */
    public void setIsmHistoryEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.ismHistoryEnabled = value;
    }
    /**
     * Sets the ism_history_max_age property value. The ism_history_max_age property
     * @param value Value to set for the ism_history_max_age property.
     */
    public void setIsmHistoryMaxAge(@jakarta.annotation.Nullable final Integer value) {
        this.ismHistoryMaxAge = value;
    }
    /**
     * Sets the ism_history_max_docs property value. The ism_history_max_docs property
     * @param value Value to set for the ism_history_max_docs property.
     */
    public void setIsmHistoryMaxDocs(@jakarta.annotation.Nullable final Integer value) {
        this.ismHistoryMaxDocs = value;
    }
    /**
     * Sets the ism_history_rollover_check_period property value. The ism_history_rollover_check_period property
     * @param value Value to set for the ism_history_rollover_check_period property.
     */
    public void setIsmHistoryRolloverCheckPeriod(@jakarta.annotation.Nullable final Integer value) {
        this.ismHistoryRolloverCheckPeriod = value;
    }
    /**
     * Sets the ism_history_rollover_retention_period property value. The ism_history_rollover_retention_period property
     * @param value Value to set for the ism_history_rollover_retention_period property.
     */
    public void setIsmHistoryRolloverRetentionPeriod(@jakarta.annotation.Nullable final Integer value) {
        this.ismHistoryRolloverRetentionPeriod = value;
    }
}
