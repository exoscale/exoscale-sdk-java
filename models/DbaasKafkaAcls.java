package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasKafkaAcls implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The schemaRegistryAcl property
     */
    private java.util.List<DbaasKafkaSchemaRegistryAclEntry> schemaRegistryAcl;
    /**
     * The topicAcl property
     */
    private java.util.List<DbaasKafkaTopicAclEntry> topicAcl;
    /**
     * Instantiates a new DbaasKafkaAcls and sets the default values.
     */
    public DbaasKafkaAcls() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasKafkaAcls
     */
    @jakarta.annotation.Nonnull
    public static DbaasKafkaAcls createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasKafkaAcls();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("schema-registry-acl", (n) -> { this.setSchemaRegistryAcl(n.getCollectionOfObjectValues(DbaasKafkaSchemaRegistryAclEntry::createFromDiscriminatorValue)); });
        deserializerMap.put("topic-acl", (n) -> { this.setTopicAcl(n.getCollectionOfObjectValues(DbaasKafkaTopicAclEntry::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the schema-registry-acl property value. The schemaRegistryAcl property
     * @return a java.util.List<DbaasKafkaSchemaRegistryAclEntry>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DbaasKafkaSchemaRegistryAclEntry> getSchemaRegistryAcl() {
        return this.schemaRegistryAcl;
    }
    /**
     * Gets the topic-acl property value. The topicAcl property
     * @return a java.util.List<DbaasKafkaTopicAclEntry>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DbaasKafkaTopicAclEntry> getTopicAcl() {
        return this.topicAcl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("schema-registry-acl", this.getSchemaRegistryAcl());
        writer.writeCollectionOfObjectValues("topic-acl", this.getTopicAcl());
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
     * Sets the schema-registry-acl property value. The schemaRegistryAcl property
     * @param value Value to set for the schema-registry-acl property.
     */
    public void setSchemaRegistryAcl(@jakarta.annotation.Nullable final java.util.List<DbaasKafkaSchemaRegistryAclEntry> value) {
        this.schemaRegistryAcl = value;
    }
    /**
     * Sets the topic-acl property value. The topicAcl property
     * @param value Value to set for the topic-acl property.
     */
    public void setTopicAcl(@jakarta.annotation.Nullable final java.util.List<DbaasKafkaTopicAclEntry> value) {
        this.topicAcl = value;
    }
}
