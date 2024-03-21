package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Elastic IP address healthcheck
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ElasticIpHealthcheck implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Interval between the checks in seconds (default: 10)
     */
    private Long interval;
    /**
     * Health check mode
     */
    private ElasticIpHealthcheckMode mode;
    /**
     * Health check port
     */
    private Long port;
    /**
     * Number of attempts before considering the target unhealthy (default: 3)
     */
    private Long strikesFail;
    /**
     * Number of attempts before considering the target healthy (default: 2)
     */
    private Long strikesOk;
    /**
     * Health check timeout value in seconds (default: 2)
     */
    private Long timeout;
    /**
     * Skip TLS verification
     */
    private Boolean tlsSkipVerify;
    /**
     * An optional domain or subdomain to check TLS against
     */
    private String tlsSni;
    /**
     * An endpoint to use for the health check, for example '/status'
     */
    private String uri;
    /**
     * Instantiates a new ElasticIpHealthcheck and sets the default values.
     */
    public ElasticIpHealthcheck() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ElasticIpHealthcheck
     */
    @jakarta.annotation.Nonnull
    public static ElasticIpHealthcheck createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ElasticIpHealthcheck();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("interval", (n) -> { this.setInterval(n.getLongValue()); });
        deserializerMap.put("mode", (n) -> { this.setMode(n.getEnumValue(ElasticIpHealthcheckMode::forValue)); });
        deserializerMap.put("port", (n) -> { this.setPort(n.getLongValue()); });
        deserializerMap.put("strikes-fail", (n) -> { this.setStrikesFail(n.getLongValue()); });
        deserializerMap.put("strikes-ok", (n) -> { this.setStrikesOk(n.getLongValue()); });
        deserializerMap.put("timeout", (n) -> { this.setTimeout(n.getLongValue()); });
        deserializerMap.put("tls-skip-verify", (n) -> { this.setTlsSkipVerify(n.getBooleanValue()); });
        deserializerMap.put("tls-sni", (n) -> { this.setTlsSni(n.getStringValue()); });
        deserializerMap.put("uri", (n) -> { this.setUri(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the interval property value. Interval between the checks in seconds (default: 10)
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getInterval() {
        return this.interval;
    }
    /**
     * Gets the mode property value. Health check mode
     * @return a ElasticIpHealthcheckMode
     */
    @jakarta.annotation.Nullable
    public ElasticIpHealthcheckMode getMode() {
        return this.mode;
    }
    /**
     * Gets the port property value. Health check port
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getPort() {
        return this.port;
    }
    /**
     * Gets the strikes-fail property value. Number of attempts before considering the target unhealthy (default: 3)
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getStrikesFail() {
        return this.strikesFail;
    }
    /**
     * Gets the strikes-ok property value. Number of attempts before considering the target healthy (default: 2)
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getStrikesOk() {
        return this.strikesOk;
    }
    /**
     * Gets the timeout property value. Health check timeout value in seconds (default: 2)
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getTimeout() {
        return this.timeout;
    }
    /**
     * Gets the tls-skip-verify property value. Skip TLS verification
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTlsSkipVerify() {
        return this.tlsSkipVerify;
    }
    /**
     * Gets the tls-sni property value. An optional domain or subdomain to check TLS against
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTlsSni() {
        return this.tlsSni;
    }
    /**
     * Gets the uri property value. An endpoint to use for the health check, for example '/status'
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
        writer.writeLongValue("strikes-fail", this.getStrikesFail());
        writer.writeLongValue("strikes-ok", this.getStrikesOk());
        writer.writeLongValue("timeout", this.getTimeout());
        writer.writeBooleanValue("tls-skip-verify", this.getTlsSkipVerify());
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
     * Sets the interval property value. Interval between the checks in seconds (default: 10)
     * @param value Value to set for the interval property.
     */
    public void setInterval(@jakarta.annotation.Nullable final Long value) {
        this.interval = value;
    }
    /**
     * Sets the mode property value. Health check mode
     * @param value Value to set for the mode property.
     */
    public void setMode(@jakarta.annotation.Nullable final ElasticIpHealthcheckMode value) {
        this.mode = value;
    }
    /**
     * Sets the port property value. Health check port
     * @param value Value to set for the port property.
     */
    public void setPort(@jakarta.annotation.Nullable final Long value) {
        this.port = value;
    }
    /**
     * Sets the strikes-fail property value. Number of attempts before considering the target unhealthy (default: 3)
     * @param value Value to set for the strikes-fail property.
     */
    public void setStrikesFail(@jakarta.annotation.Nullable final Long value) {
        this.strikesFail = value;
    }
    /**
     * Sets the strikes-ok property value. Number of attempts before considering the target healthy (default: 2)
     * @param value Value to set for the strikes-ok property.
     */
    public void setStrikesOk(@jakarta.annotation.Nullable final Long value) {
        this.strikesOk = value;
    }
    /**
     * Sets the timeout property value. Health check timeout value in seconds (default: 2)
     * @param value Value to set for the timeout property.
     */
    public void setTimeout(@jakarta.annotation.Nullable final Long value) {
        this.timeout = value;
    }
    /**
     * Sets the tls-skip-verify property value. Skip TLS verification
     * @param value Value to set for the tls-skip-verify property.
     */
    public void setTlsSkipVerify(@jakarta.annotation.Nullable final Boolean value) {
        this.tlsSkipVerify = value;
    }
    /**
     * Sets the tls-sni property value. An optional domain or subdomain to check TLS against
     * @param value Value to set for the tls-sni property.
     */
    public void setTlsSni(@jakarta.annotation.Nullable final String value) {
        this.tlsSni = value;
    }
    /**
     * Sets the uri property value. An endpoint to use for the health check, for example '/status'
     * @param value Value to set for the uri property.
     */
    public void setUri(@jakarta.annotation.Nullable final String value) {
        this.uri = value;
    }
}
