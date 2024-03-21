package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * DBaaS service
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasServiceType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * DbaaS service available versions
     */
    private java.util.List<String> availableVersions;
    /**
     * DbaaS service default version
     */
    private String defaultVersion;
    /**
     * DbaaS service description
     */
    private String description;
    /**
     * The name property
     */
    private String name;
    /**
     * DbaaS service plans
     */
    private java.util.List<DbaasPlan> plans;
    /**
     * Instantiates a new DbaasServiceType and sets the default values.
     */
    public DbaasServiceType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasServiceType
     */
    @jakarta.annotation.Nonnull
    public static DbaasServiceType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasServiceType();
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
     * Gets the available-versions property value. DbaaS service available versions
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAvailableVersions() {
        return this.availableVersions;
    }
    /**
     * Gets the default-version property value. DbaaS service default version
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefaultVersion() {
        return this.defaultVersion;
    }
    /**
     * Gets the description property value. DbaaS service description
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("available-versions", (n) -> { this.setAvailableVersions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("default-version", (n) -> { this.setDefaultVersion(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("plans", (n) -> { this.setPlans(n.getCollectionOfObjectValues(DbaasPlan::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the plans property value. DbaaS service plans
     * @return a java.util.List<DbaasPlan>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DbaasPlan> getPlans() {
        return this.plans;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("name", this.getName());
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
     * Sets the available-versions property value. DbaaS service available versions
     * @param value Value to set for the available-versions property.
     */
    public void setAvailableVersions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.availableVersions = value;
    }
    /**
     * Sets the default-version property value. DbaaS service default version
     * @param value Value to set for the default-version property.
     */
    public void setDefaultVersion(@jakarta.annotation.Nullable final String value) {
        this.defaultVersion = value;
    }
    /**
     * Sets the description property value. DbaaS service description
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the plans property value. DbaaS service plans
     * @param value Value to set for the plans property.
     */
    public void setPlans(@jakarta.annotation.Nullable final java.util.List<DbaasPlan> value) {
        this.plans = value;
    }
}
