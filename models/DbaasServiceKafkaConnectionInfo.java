package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Kafka connection information properties
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasServiceKafkaConnectionInfo implements AdditionalDataHolder, Parsable {
    /**
     * The accessCert property
     */
    private String accessCert;
    /**
     * The accessKey property
     */
    private String accessKey;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The connectUri property
     */
    private String connectUri;
    /**
     * The nodes property
     */
    private java.util.List<String> nodes;
    /**
     * The registryUri property
     */
    private String registryUri;
    /**
     * The restUri property
     */
    private String restUri;
    /**
     * Instantiates a new DbaasServiceKafkaConnectionInfo and sets the default values.
     */
    public DbaasServiceKafkaConnectionInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasServiceKafkaConnectionInfo
     */
    @jakarta.annotation.Nonnull
    public static DbaasServiceKafkaConnectionInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasServiceKafkaConnectionInfo();
    }
    /**
     * Gets the access-cert property value. The accessCert property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccessCert() {
        return this.accessCert;
    }
    /**
     * Gets the access-key property value. The accessKey property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAccessKey() {
        return this.accessKey;
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
     * Gets the connect-uri property value. The connectUri property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getConnectUri() {
        return this.connectUri;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("access-cert", (n) -> { this.setAccessCert(n.getStringValue()); });
        deserializerMap.put("access-key", (n) -> { this.setAccessKey(n.getStringValue()); });
        deserializerMap.put("connect-uri", (n) -> { this.setConnectUri(n.getStringValue()); });
        deserializerMap.put("nodes", (n) -> { this.setNodes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("registry-uri", (n) -> { this.setRegistryUri(n.getStringValue()); });
        deserializerMap.put("rest-uri", (n) -> { this.setRestUri(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the nodes property value. The nodes property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getNodes() {
        return this.nodes;
    }
    /**
     * Gets the registry-uri property value. The registryUri property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRegistryUri() {
        return this.registryUri;
    }
    /**
     * Gets the rest-uri property value. The restUri property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRestUri() {
        return this.restUri;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("access-cert", this.getAccessCert());
        writer.writeStringValue("access-key", this.getAccessKey());
        writer.writeStringValue("connect-uri", this.getConnectUri());
        writer.writeCollectionOfPrimitiveValues("nodes", this.getNodes());
        writer.writeStringValue("registry-uri", this.getRegistryUri());
        writer.writeStringValue("rest-uri", this.getRestUri());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the access-cert property value. The accessCert property
     * @param value Value to set for the access-cert property.
     */
    public void setAccessCert(@jakarta.annotation.Nullable final String value) {
        this.accessCert = value;
    }
    /**
     * Sets the access-key property value. The accessKey property
     * @param value Value to set for the access-key property.
     */
    public void setAccessKey(@jakarta.annotation.Nullable final String value) {
        this.accessKey = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the connect-uri property value. The connectUri property
     * @param value Value to set for the connect-uri property.
     */
    public void setConnectUri(@jakarta.annotation.Nullable final String value) {
        this.connectUri = value;
    }
    /**
     * Sets the nodes property value. The nodes property
     * @param value Value to set for the nodes property.
     */
    public void setNodes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.nodes = value;
    }
    /**
     * Sets the registry-uri property value. The registryUri property
     * @param value Value to set for the registry-uri property.
     */
    public void setRegistryUri(@jakarta.annotation.Nullable final String value) {
        this.registryUri = value;
    }
    /**
     * Sets the rest-uri property value. The restUri property
     * @param value Value to set for the rest-uri property.
     */
    public void setRestUri(@jakarta.annotation.Nullable final String value) {
        this.restUri = value;
    }
}
