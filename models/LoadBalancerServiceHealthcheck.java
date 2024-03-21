package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Load Balancer Service healthcheck
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LoadBalancerServiceHealthcheck implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Healthcheck interval (default: 10). Must be greater than or equal to Timeout
     */
    private Long interval;
    /**
     * Healthcheck mode
     */
    private LoadBalancerServiceHealthcheckMode mode;
    /**
     * Healthcheck port
     */
    private Long port;
    /**
     * Number of retries before considering a Service failed
     */
    private Long retries;
    /**
     * Healthcheck timeout value (default: 2). Must be lower than or equal to Interval
     */
    private Long timeout;
    /**
     * SNI domain for HTTPS healthchecks
     */
    private String tlsSni;
    /**
     * An endpoint to use for the HTTP healthcheck, e.g. '/status'
     */
    private String uri;
    /**
     * Instantiates a new LoadBalancerServiceHealthcheck and sets the default values.
     */
    public LoadBalancerServiceHealthcheck() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LoadBalancerServiceHealthcheck
     */
    @jakarta.annotation.Nonnull
    public static LoadBalancerServiceHealthcheck createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LoadBalancerServiceHealthcheck();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("interval", (n) -> { this.setInterval(n.getLongValue()); });
        deserializerMap.put("mode", (n) -> { this.setMode(n.getEnumValue(LoadBalancerServiceHealthcheckMode::forValue)); });
        deserializerMap.put("port", (n) -> { this.setPort(n.getLongValue()); });
        deserializerMap.put("retries", (n) -> { this.setRetries(n.getLongValue()); });
        deserializerMap.put("timeout", (n) -> { this.setTimeout(n.getLongValue()); });
        deserializerMap.put("tls-sni", (n) -> { this.setTlsSni(n.getStringValue()); });
        deserializerMap.put("uri", (n) -> { this.setUri(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the interval property value. Healthcheck interval (default: 10). Must be greater than or equal to Timeout
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getInterval() {
        return this.interval;
    }
    /**
     * Gets the mode property value. Healthcheck mode
     * @return a LoadBalancerServiceHealthcheckMode
     */
    @jakarta.annotation.Nullable
    public LoadBalancerServiceHealthcheckMode getMode() {
        return this.mode;
    }
    /**
     * Gets the port property value. Healthcheck port
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getPort() {
        return this.port;
    }
    /**
     * Gets the retries property value. Number of retries before considering a Service failed
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getRetries() {
        return this.retries;
    }
    /**
     * Gets the timeout property value. Healthcheck timeout value (default: 2). Must be lower than or equal to Interval
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getTimeout() {
        return this.timeout;
    }
    /**
     * Gets the tls-sni property value. SNI domain for HTTPS healthchecks
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTlsSni() {
        return this.tlsSni;
    }
    /**
     * Gets the uri property value. An endpoint to use for the HTTP healthcheck, e.g. '/status'
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUri() {
        return this.uri;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("interval", this.getInterval());
        writer.writeEnumValue("mode", this.getMode());
        writer.writeLongValue("port", this.getPort());
        writer.writeLongValue("retries", this.getRetries());
        writer.writeLongValue("timeout", this.getTimeout());
        writer.writeStringValue("tls-sni", this.getTlsSni());
        writer.writeStringValue("uri", this.getUri());
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
     * Sets the interval property value. Healthcheck interval (default: 10). Must be greater than or equal to Timeout
     * @param value Value to set for the interval property.
     */
    public void setInterval(@jakarta.annotation.Nullable final Long value) {
        this.interval = value;
    }
    /**
     * Sets the mode property value. Healthcheck mode
     * @param value Value to set for the mode property.
     */
    public void setMode(@jakarta.annotation.Nullable final LoadBalancerServiceHealthcheckMode value) {
        this.mode = value;
    }
    /**
     * Sets the port property value. Healthcheck port
     * @param value Value to set for the port property.
     */
    public void setPort(@jakarta.annotation.Nullable final Long value) {
        this.port = value;
    }
    /**
     * Sets the retries property value. Number of retries before considering a Service failed
     * @param value Value to set for the retries property.
     */
    public void setRetries(@jakarta.annotation.Nullable final Long value) {
        this.retries = value;
    }
    /**
     * Sets the timeout property value. Healthcheck timeout value (default: 2). Must be lower than or equal to Interval
     * @param value Value to set for the timeout property.
     */
    public void setTimeout(@jakarta.annotation.Nullable final Long value) {
        this.timeout = value;
    }
    /**
     * Sets the tls-sni property value. SNI domain for HTTPS healthchecks
     * @param value Value to set for the tls-sni property.
     */
    public void setTlsSni(@jakarta.annotation.Nullable final String value) {
        this.tlsSni = value;
    }
    /**
     * Sets the uri property value. An endpoint to use for the HTTP healthcheck, e.g. '/status'
     * @param value Value to set for the uri property.
     */
    public void setUri(@jakarta.annotation.Nullable final String value) {
        this.uri = value;
    }
}
