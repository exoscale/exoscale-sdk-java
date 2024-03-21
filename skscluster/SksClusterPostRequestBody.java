package com.exoscale.skscluster;

import com.exoscale.models.Labels;
import com.exoscale.models.SksOidc;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SksClusterPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Cluster addons
     */
    private java.util.List<SksClusterPostRequestBodyAddons> addons;
    /**
     * Enable auto upgrade of the control plane to the latest patch version available
     */
    private Boolean autoUpgrade;
    /**
     * Cluster CNI
     */
    private SksClusterPostRequestBodyCni cni;
    /**
     * Cluster description
     */
    private String description;
    /**
     * The labels property
     */
    private Labels labels;
    /**
     * Cluster service level
     */
    private SksClusterPostRequestBodyLevel level;
    /**
     * Cluster name
     */
    private String name;
    /**
     * SKS Cluster OpenID config map
     */
    private SksOidc oidc;
    /**
     * Control plane Kubernetes version
     */
    private String version;
    /**
     * Instantiates a new SksClusterPostRequestBody and sets the default values.
     */
    public SksClusterPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SksClusterPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static SksClusterPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SksClusterPostRequestBody();
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
     * Gets the addons property value. Cluster addons
     * @return a java.util.List<SksClusterPostRequestBodyAddons>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SksClusterPostRequestBodyAddons> getAddons() {
        return this.addons;
    }
    /**
     * Gets the auto-upgrade property value. Enable auto upgrade of the control plane to the latest patch version available
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoUpgrade() {
        return this.autoUpgrade;
    }
    /**
     * Gets the cni property value. Cluster CNI
     * @return a SksClusterPostRequestBodyCni
     */
    @jakarta.annotation.Nullable
    public SksClusterPostRequestBodyCni getCni() {
        return this.cni;
    }
    /**
     * Gets the description property value. Cluster description
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("addons", (n) -> { this.setAddons(n.getCollectionOfEnumValues(SksClusterPostRequestBodyAddons::forValue)); });
        deserializerMap.put("auto-upgrade", (n) -> { this.setAutoUpgrade(n.getBooleanValue()); });
        deserializerMap.put("cni", (n) -> { this.setCni(n.getEnumValue(SksClusterPostRequestBodyCni::forValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getObjectValue(Labels::createFromDiscriminatorValue)); });
        deserializerMap.put("level", (n) -> { this.setLevel(n.getEnumValue(SksClusterPostRequestBodyLevel::forValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("oidc", (n) -> { this.setOidc(n.getObjectValue(SksOidc::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
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
     * Gets the level property value. Cluster service level
     * @return a SksClusterPostRequestBodyLevel
     */
    @jakarta.annotation.Nullable
    public SksClusterPostRequestBodyLevel getLevel() {
        return this.level;
    }
    /**
     * Gets the name property value. Cluster name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the oidc property value. SKS Cluster OpenID config map
     * @return a SksOidc
     */
    @jakarta.annotation.Nullable
    public SksOidc getOidc() {
        return this.oidc;
    }
    /**
     * Gets the version property value. Control plane Kubernetes version
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
        writer.writeCollectionOfEnumValues("addons", this.getAddons());
        writer.writeBooleanValue("auto-upgrade", this.getAutoUpgrade());
        writer.writeEnumValue("cni", this.getCni());
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("labels", this.getLabels());
        writer.writeEnumValue("level", this.getLevel());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("oidc", this.getOidc());
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
     * Sets the addons property value. Cluster addons
     * @param value Value to set for the addons property.
     */
    public void setAddons(@jakarta.annotation.Nullable final java.util.List<SksClusterPostRequestBodyAddons> value) {
        this.addons = value;
    }
    /**
     * Sets the auto-upgrade property value. Enable auto upgrade of the control plane to the latest patch version available
     * @param value Value to set for the auto-upgrade property.
     */
    public void setAutoUpgrade(@jakarta.annotation.Nullable final Boolean value) {
        this.autoUpgrade = value;
    }
    /**
     * Sets the cni property value. Cluster CNI
     * @param value Value to set for the cni property.
     */
    public void setCni(@jakarta.annotation.Nullable final SksClusterPostRequestBodyCni value) {
        this.cni = value;
    }
    /**
     * Sets the description property value. Cluster description
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the labels property value. The labels property
     * @param value Value to set for the labels property.
     */
    public void setLabels(@jakarta.annotation.Nullable final Labels value) {
        this.labels = value;
    }
    /**
     * Sets the level property value. Cluster service level
     * @param value Value to set for the level property.
     */
    public void setLevel(@jakarta.annotation.Nullable final SksClusterPostRequestBodyLevel value) {
        this.level = value;
    }
    /**
     * Sets the name property value. Cluster name
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the oidc property value. SKS Cluster OpenID config map
     * @param value Value to set for the oidc property.
     */
    public void setOidc(@jakarta.annotation.Nullable final SksOidc value) {
        this.oidc = value;
    }
    /**
     * Sets the version property value. Control plane Kubernetes version
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.version = value;
    }
}
