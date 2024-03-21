package com.exoscale.dbaasopensearch.item;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Template settings for all new indexes
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasOpensearchPutRequestBodyIndexTemplate implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The maximum number of nested JSON objects that a single document can contain across all nested types. This limit helps to prevent out of memory errors when a document contains too many nested objects. Default is 10000.
     */
    private Long mappingNestedObjectsLimit;
    /**
     * The number of replicas each primary shard has.
     */
    private Long numberOfReplicas;
    /**
     * The number of primary shards that an index should have.
     */
    private Long numberOfShards;
    /**
     * Instantiates a new DbaasOpensearchPutRequestBodyIndexTemplate and sets the default values.
     */
    public DbaasOpensearchPutRequestBodyIndexTemplate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasOpensearchPutRequestBodyIndexTemplate
     */
    @jakarta.annotation.Nonnull
    public static DbaasOpensearchPutRequestBodyIndexTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasOpensearchPutRequestBodyIndexTemplate();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("mapping-nested-objects-limit", (n) -> { this.setMappingNestedObjectsLimit(n.getLongValue()); });
        deserializerMap.put("number-of-replicas", (n) -> { this.setNumberOfReplicas(n.getLongValue()); });
        deserializerMap.put("number-of-shards", (n) -> { this.setNumberOfShards(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mapping-nested-objects-limit property value. The maximum number of nested JSON objects that a single document can contain across all nested types. This limit helps to prevent out of memory errors when a document contains too many nested objects. Default is 10000.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getMappingNestedObjectsLimit() {
        return this.mappingNestedObjectsLimit;
    }
    /**
     * Gets the number-of-replicas property value. The number of replicas each primary shard has.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getNumberOfReplicas() {
        return this.numberOfReplicas;
    }
    /**
     * Gets the number-of-shards property value. The number of primary shards that an index should have.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getNumberOfShards() {
        return this.numberOfShards;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("mapping-nested-objects-limit", this.getMappingNestedObjectsLimit());
        writer.writeLongValue("number-of-replicas", this.getNumberOfReplicas());
        writer.writeLongValue("number-of-shards", this.getNumberOfShards());
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
     * Sets the mapping-nested-objects-limit property value. The maximum number of nested JSON objects that a single document can contain across all nested types. This limit helps to prevent out of memory errors when a document contains too many nested objects. Default is 10000.
     * @param value Value to set for the mapping-nested-objects-limit property.
     */
    public void setMappingNestedObjectsLimit(@jakarta.annotation.Nullable final Long value) {
        this.mappingNestedObjectsLimit = value;
    }
    /**
     * Sets the number-of-replicas property value. The number of replicas each primary shard has.
     * @param value Value to set for the number-of-replicas property.
     */
    public void setNumberOfReplicas(@jakarta.annotation.Nullable final Long value) {
        this.numberOfReplicas = value;
    }
    /**
     * Sets the number-of-shards property value. The number of primary shards that an index should have.
     * @param value Value to set for the number-of-shards property.
     */
    public void setNumberOfShards(@jakarta.annotation.Nullable final Long value) {
        this.numberOfShards = value;
    }
}
