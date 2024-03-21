package com.exoscale.accesskey;

import com.exoscale.models.AccessKeyResource;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * IAM Access Key
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessKeyPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * IAM Access Key name
     */
    private String name;
    /**
     * IAM Access Key operations
     */
    private java.util.List<String> operations;
    /**
     * IAM Access Key Resources
     */
    private java.util.List<AccessKeyResource> resources;
    /**
     * IAM Access Key tags
     */
    private java.util.List<String> tags;
    /**
     * Instantiates a new AccessKeyPostRequestBody and sets the default values.
     */
    public AccessKeyPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessKeyPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static AccessKeyPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessKeyPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("resources", (n) -> { this.setResources(n.getCollectionOfObjectValues(AccessKeyResource::createFromDiscriminatorValue)); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. IAM Access Key name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the operations property value. IAM Access Key operations
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOperations() {
        return this.operations;
    }
    /**
     * Gets the resources property value. IAM Access Key Resources
     * @return a java.util.List<AccessKeyResource>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AccessKeyResource> getResources() {
        return this.resources;
    }
    /**
     * Gets the tags property value. IAM Access Key tags
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTags() {
        return this.tags;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfPrimitiveValues("operations", this.getOperations());
        writer.writeCollectionOfObjectValues("resources", this.getResources());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
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
     * Sets the name property value. IAM Access Key name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the operations property value. IAM Access Key operations
     * @param value Value to set for the operations property.
     */
    public void setOperations(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.operations = value;
    }
    /**
     * Sets the resources property value. IAM Access Key Resources
     * @param value Value to set for the resources property.
     */
    public void setResources(@jakarta.annotation.Nullable final java.util.List<AccessKeyResource> value) {
        this.resources = value;
    }
    /**
     * Sets the tags property value. IAM Access Key tags
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.tags = value;
    }
}
