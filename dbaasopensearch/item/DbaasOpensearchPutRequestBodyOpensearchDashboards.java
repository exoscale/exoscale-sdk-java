package com.exoscale.dbaasopensearch.item;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * OpenSearch Dashboards settings
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasOpensearchPutRequestBodyOpensearchDashboards implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Enable or disable OpenSearch Dashboards (default: true)
     */
    private Boolean enabled;
    /**
     * Limits the maximum amount of memory (in MiB) the OpenSearch Dashboards process can use. This sets the max_old_space_size option of the nodejs running the OpenSearch Dashboards. Note: the memory reserved by OpenSearch Dashboards is not available for OpenSearch. (default: 128)
     */
    private Long maxOldSpaceSize;
    /**
     * Timeout in milliseconds for requests made by OpenSearch Dashboards towards OpenSearch (default: 30000)
     */
    private Long opensearchRequestTimeout;
    /**
     * Instantiates a new DbaasOpensearchPutRequestBodyOpensearchDashboards and sets the default values.
     */
    public DbaasOpensearchPutRequestBodyOpensearchDashboards() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasOpensearchPutRequestBodyOpensearchDashboards
     */
    @jakarta.annotation.Nonnull
    public static DbaasOpensearchPutRequestBodyOpensearchDashboards createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasOpensearchPutRequestBodyOpensearchDashboards();
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
     * Gets the enabled property value. Enable or disable OpenSearch Dashboards (default: true)
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("max-old-space-size", (n) -> { this.setMaxOldSpaceSize(n.getLongValue()); });
        deserializerMap.put("opensearch-request-timeout", (n) -> { this.setOpensearchRequestTimeout(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the max-old-space-size property value. Limits the maximum amount of memory (in MiB) the OpenSearch Dashboards process can use. This sets the max_old_space_size option of the nodejs running the OpenSearch Dashboards. Note: the memory reserved by OpenSearch Dashboards is not available for OpenSearch. (default: 128)
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getMaxOldSpaceSize() {
        return this.maxOldSpaceSize;
    }
    /**
     * Gets the opensearch-request-timeout property value. Timeout in milliseconds for requests made by OpenSearch Dashboards towards OpenSearch (default: 30000)
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getOpensearchRequestTimeout() {
        return this.opensearchRequestTimeout;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeLongValue("max-old-space-size", this.getMaxOldSpaceSize());
        writer.writeLongValue("opensearch-request-timeout", this.getOpensearchRequestTimeout());
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
     * Sets the enabled property value. Enable or disable OpenSearch Dashboards (default: true)
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the max-old-space-size property value. Limits the maximum amount of memory (in MiB) the OpenSearch Dashboards process can use. This sets the max_old_space_size option of the nodejs running the OpenSearch Dashboards. Note: the memory reserved by OpenSearch Dashboards is not available for OpenSearch. (default: 128)
     * @param value Value to set for the max-old-space-size property.
     */
    public void setMaxOldSpaceSize(@jakarta.annotation.Nullable final Long value) {
        this.maxOldSpaceSize = value;
    }
    /**
     * Sets the opensearch-request-timeout property value. Timeout in milliseconds for requests made by OpenSearch Dashboards towards OpenSearch (default: 30000)
     * @param value Value to set for the opensearch-request-timeout property.
     */
    public void setOpensearchRequestTimeout(@jakarta.annotation.Nullable final Long value) {
        this.opensearchRequestTimeout = value;
    }
}
