package com.exoscale.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JsonSchemaSchemaRegistry implements Parsable {
    /**
     * If true, Karapace / Schema Registry on the service nodes can participate in leader election. It might be needed to disable this when the schemas topic is replicated to a secondary cluster and Karapace / Schema Registry there must not participate in leader election. Defaults to `true`.
     */
    private Boolean leaderEligibility;
    /**
     * The durable single partition topic that acts as the durable log for the data. This topic must be compacted to avoid losing data due to retention policy. Please note that changing this configuration in an existing Schema Registry / Karapace setup leads to previous schemas being inaccessible, data encoded with them potentially unreadable and schema ID sequence put out of order. It's only possible to do the switch while Schema Registry / Karapace is disabled. Defaults to `_schemas`.
     */
    private String topicName;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JsonSchemaSchemaRegistry
     */
    @jakarta.annotation.Nonnull
    public static JsonSchemaSchemaRegistry createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JsonSchemaSchemaRegistry();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("leader_eligibility", (n) -> { this.setLeaderEligibility(n.getBooleanValue()); });
        deserializerMap.put("topic_name", (n) -> { this.setTopicName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the leader_eligibility property value. If true, Karapace / Schema Registry on the service nodes can participate in leader election. It might be needed to disable this when the schemas topic is replicated to a secondary cluster and Karapace / Schema Registry there must not participate in leader election. Defaults to `true`.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLeaderEligibility() {
        return this.leaderEligibility;
    }
    /**
     * Gets the topic_name property value. The durable single partition topic that acts as the durable log for the data. This topic must be compacted to avoid losing data due to retention policy. Please note that changing this configuration in an existing Schema Registry / Karapace setup leads to previous schemas being inaccessible, data encoded with them potentially unreadable and schema ID sequence put out of order. It's only possible to do the switch while Schema Registry / Karapace is disabled. Defaults to `_schemas`.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTopicName() {
        return this.topicName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("leader_eligibility", this.getLeaderEligibility());
        writer.writeStringValue("topic_name", this.getTopicName());
    }
    /**
     * Sets the leader_eligibility property value. If true, Karapace / Schema Registry on the service nodes can participate in leader election. It might be needed to disable this when the schemas topic is replicated to a secondary cluster and Karapace / Schema Registry there must not participate in leader election. Defaults to `true`.
     * @param value Value to set for the leader_eligibility property.
     */
    public void setLeaderEligibility(@jakarta.annotation.Nullable final Boolean value) {
        this.leaderEligibility = value;
    }
    /**
     * Sets the topic_name property value. The durable single partition topic that acts as the durable log for the data. This topic must be compacted to avoid losing data due to retention policy. Please note that changing this configuration in an existing Schema Registry / Karapace setup leads to previous schemas being inaccessible, data encoded with them potentially unreadable and schema ID sequence put out of order. It's only possible to do the switch while Schema Registry / Karapace is disabled. Defaults to `_schemas`.
     * @param value Value to set for the topic_name property.
     */
    public void setTopicName(@jakarta.annotation.Nullable final String value) {
        this.topicName = value;
    }
}
