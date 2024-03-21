package com.exoscale.iamrole;

import com.exoscale.models.IamPolicy;
import com.exoscale.models.Labels;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IamRolePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * IAM Role description
     */
    private String description;
    /**
     * Sets if the IAM Role Policy is editable or not (default: true). This setting cannot be changed after creation
     */
    private Boolean editable;
    /**
     * The labels property
     */
    private Labels labels;
    /**
     * IAM Role name
     */
    private String name;
    /**
     * IAM Role permissions
     */
    private java.util.List<IamRolePostRequestBodyPermissions> permissions;
    /**
     * Policy
     */
    private IamPolicy policy;
    /**
     * Instantiates a new IamRolePostRequestBody and sets the default values.
     */
    public IamRolePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IamRolePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static IamRolePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IamRolePostRequestBody();
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
     * Gets the description property value. IAM Role description
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the editable property value. Sets if the IAM Role Policy is editable or not (default: true). This setting cannot be changed after creation
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEditable() {
        return this.editable;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("editable", (n) -> { this.setEditable(n.getBooleanValue()); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getObjectValue(Labels::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("permissions", (n) -> { this.setPermissions(n.getCollectionOfEnumValues(IamRolePostRequestBodyPermissions::forValue)); });
        deserializerMap.put("policy", (n) -> { this.setPolicy(n.getObjectValue(IamPolicy::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the labels property value. The labels property
     * @return a Labels
     */
    @jakarta.annotation.Nullable
    public Labels getLabels() {
        return this.labels;
    }
    /**
     * Gets the name property value. IAM Role name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the permissions property value. IAM Role permissions
     * @return a java.util.List<IamRolePostRequestBodyPermissions>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IamRolePostRequestBodyPermissions> getPermissions() {
        return this.permissions;
    }
    /**
     * Gets the policy property value. Policy
     * @return a IamPolicy
     */
    @jakarta.annotation.Nullable
    public IamPolicy getPolicy() {
        return this.policy;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("editable", this.getEditable());
        writer.writeObjectValue("labels", this.getLabels());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfEnumValues("permissions", this.getPermissions());
        writer.writeObjectValue("policy", this.getPolicy());
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
     * Sets the description property value. IAM Role description
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the editable property value. Sets if the IAM Role Policy is editable or not (default: true). This setting cannot be changed after creation
     * @param value Value to set for the editable property.
     */
    public void setEditable(@jakarta.annotation.Nullable final Boolean value) {
        this.editable = value;
    }
    /**
     * Sets the labels property value. The labels property
     * @param value Value to set for the labels property.
     */
    public void setLabels(@jakarta.annotation.Nullable final Labels value) {
        this.labels = value;
    }
    /**
     * Sets the name property value. IAM Role name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the permissions property value. IAM Role permissions
     * @param value Value to set for the permissions property.
     */
    public void setPermissions(@jakarta.annotation.Nullable final java.util.List<IamRolePostRequestBodyPermissions> value) {
        this.permissions = value;
    }
    /**
     * Sets the policy property value. Policy
     * @param value Value to set for the policy property.
     */
    public void setPolicy(@jakarta.annotation.Nullable final IamPolicy value) {
        this.policy = value;
    }
}
