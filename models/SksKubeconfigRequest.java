package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Kubeconfig request for a SKS cluster
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SksKubeconfigRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * List of roles. The certificate present in the Kubeconfig will have these roles set in the Org field.
     */
    private java.util.List<String> groups;
    /**
     * Validity in seconds of the Kubeconfig user certificate (default: 30 days)
     */
    private Long ttl;
    /**
     * User name in the generated Kubeconfig. The certificate present in the Kubeconfig will also have this name set for the CN field.
     */
    private String user;
    /**
     * Instantiates a new SksKubeconfigRequest and sets the default values.
     */
    public SksKubeconfigRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SksKubeconfigRequest
     */
    @jakarta.annotation.Nonnull
    public static SksKubeconfigRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SksKubeconfigRequest();
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
        deserializerMap.put("groups", (n) -> { this.setGroups(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("ttl", (n) -> { this.setTtl(n.getLongValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groups property value. List of roles. The certificate present in the Kubeconfig will have these roles set in the Org field.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getGroups() {
        return this.groups;
    }
    /**
     * Gets the ttl property value. Validity in seconds of the Kubeconfig user certificate (default: 30 days)
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getTtl() {
        return this.ttl;
    }
    /**
     * Gets the user property value. User name in the generated Kubeconfig. The certificate present in the Kubeconfig will also have this name set for the CN field.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUser() {
        return this.user;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("groups", this.getGroups());
        writer.writeLongValue("ttl", this.getTtl());
        writer.writeStringValue("user", this.getUser());
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
     * Sets the groups property value. List of roles. The certificate present in the Kubeconfig will have these roles set in the Org field.
     * @param value Value to set for the groups property.
     */
    public void setGroups(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.groups = value;
    }
    /**
     * Sets the ttl property value. Validity in seconds of the Kubeconfig user certificate (default: 30 days)
     * @param value Value to set for the ttl property.
     */
    public void setTtl(@jakarta.annotation.Nullable final Long value) {
        this.ttl = value;
    }
    /**
     * Sets the user property value. User name in the generated Kubeconfig. The certificate present in the Kubeconfig will also have this name set for the CN field.
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final String value) {
        this.user = value;
    }
}
