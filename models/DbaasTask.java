package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasTask implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The createTime property
     */
    private OffsetDateTime createTime;
    /**
     * The id property
     */
    private UUID id;
    /**
     * The result property
     */
    private String result;
    /**
     * The resultCodes property
     */
    private java.util.List<DbaasTaskResultCodes> resultCodes;
    /**
     * The success property
     */
    private Boolean success;
    /**
     * The taskType property
     */
    private String taskType;
    /**
     * Instantiates a new DbaasTask and sets the default values.
     */
    public DbaasTask() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasTask
     */
    @jakarta.annotation.Nonnull
    public static DbaasTask createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasTask();
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
     * Gets the create-time property value. The createTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreateTime() {
        return this.createTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("create-time", (n) -> { this.setCreateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getUUIDValue()); });
        deserializerMap.put("result", (n) -> { this.setResult(n.getStringValue()); });
        deserializerMap.put("result-codes", (n) -> { this.setResultCodes(n.getCollectionOfObjectValues(DbaasTaskResultCodes::createFromDiscriminatorValue)); });
        deserializerMap.put("success", (n) -> { this.setSuccess(n.getBooleanValue()); });
        deserializerMap.put("task-type", (n) -> { this.setTaskType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getId() {
        return this.id;
    }
    /**
     * Gets the result property value. The result property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResult() {
        return this.result;
    }
    /**
     * Gets the result-codes property value. The resultCodes property
     * @return a java.util.List<DbaasTaskResultCodes>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DbaasTaskResultCodes> getResultCodes() {
        return this.resultCodes;
    }
    /**
     * Gets the success property value. The success property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSuccess() {
        return this.success;
    }
    /**
     * Gets the task-type property value. The taskType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTaskType() {
        return this.taskType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("create-time", this.getCreateTime());
        writer.writeUUIDValue("id", this.getId());
        writer.writeStringValue("result", this.getResult());
        writer.writeCollectionOfObjectValues("result-codes", this.getResultCodes());
        writer.writeBooleanValue("success", this.getSuccess());
        writer.writeStringValue("task-type", this.getTaskType());
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
     * Sets the create-time property value. The createTime property
     * @param value Value to set for the create-time property.
     */
    public void setCreateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createTime = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final UUID value) {
        this.id = value;
    }
    /**
     * Sets the result property value. The result property
     * @param value Value to set for the result property.
     */
    public void setResult(@jakarta.annotation.Nullable final String value) {
        this.result = value;
    }
    /**
     * Sets the result-codes property value. The resultCodes property
     * @param value Value to set for the result-codes property.
     */
    public void setResultCodes(@jakarta.annotation.Nullable final java.util.List<DbaasTaskResultCodes> value) {
        this.resultCodes = value;
    }
    /**
     * Sets the success property value. The success property
     * @param value Value to set for the success property.
     */
    public void setSuccess(@jakarta.annotation.Nullable final Boolean value) {
        this.success = value;
    }
    /**
     * Sets the task-type property value. The taskType property
     * @param value Value to set for the task-type property.
     */
    public void setTaskType(@jakarta.annotation.Nullable final String value) {
        this.taskType = value;
    }
}
