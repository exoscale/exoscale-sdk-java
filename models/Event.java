package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A notable Mutation Event which happened on the infrastructure
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Event implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Body parameters (free form map)
     */
    private EventBodyParams bodyParams;
    /**
     * Operation processing time
     */
    private Long elapsedMs;
    /**
     * Query string parameters (free form map)
     */
    private EventGetParams getParams;
    /**
     * Operation handler name
     */
    private String handler;
    /**
     * Operation message
     */
    private String message;
    /**
     * URI path parameters (free form map)
     */
    private EventPathParams pathParams;
    /**
     * Client IP address
     */
    private String remoteAddr;
    /**
     * Operation unique identifier
     */
    private String requestId;
    /**
     * Operation HTTP status
     */
    private Long status;
    /**
     * Time at which the event happened, millisecond resolution
     */
    private OffsetDateTime timestamp;
    /**
     * Operation request URI
     */
    private String uri;
    /**
     * Operation targeted zone
     */
    private String zone;
    /**
     * Instantiates a new Event and sets the default values.
     */
    public Event() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Event
     */
    @jakarta.annotation.Nonnull
    public static Event createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Event();
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
     * Gets the body-params property value. Body parameters (free form map)
     * @return a EventBodyParams
     */
    @jakarta.annotation.Nullable
    public EventBodyParams getBodyParams() {
        return this.bodyParams;
    }
    /**
     * Gets the elapsed-ms property value. Operation processing time
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getElapsedMs() {
        return this.elapsedMs;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("body-params", (n) -> { this.setBodyParams(n.getObjectValue(EventBodyParams::createFromDiscriminatorValue)); });
        deserializerMap.put("elapsed-ms", (n) -> { this.setElapsedMs(n.getLongValue()); });
        deserializerMap.put("get-params", (n) -> { this.setGetParams(n.getObjectValue(EventGetParams::createFromDiscriminatorValue)); });
        deserializerMap.put("handler", (n) -> { this.setHandler(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("path-params", (n) -> { this.setPathParams(n.getObjectValue(EventPathParams::createFromDiscriminatorValue)); });
        deserializerMap.put("remote-addr", (n) -> { this.setRemoteAddr(n.getStringValue()); });
        deserializerMap.put("request-id", (n) -> { this.setRequestId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getLongValue()); });
        deserializerMap.put("timestamp", (n) -> { this.setTimestamp(n.getOffsetDateTimeValue()); });
        deserializerMap.put("uri", (n) -> { this.setUri(n.getStringValue()); });
        deserializerMap.put("zone", (n) -> { this.setZone(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the get-params property value. Query string parameters (free form map)
     * @return a EventGetParams
     */
    @jakarta.annotation.Nullable
    public EventGetParams getGetParams() {
        return this.getParams;
    }
    /**
     * Gets the handler property value. Operation handler name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHandler() {
        return this.handler;
    }
    /**
     * Gets the message property value. Operation message
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the path-params property value. URI path parameters (free form map)
     * @return a EventPathParams
     */
    @jakarta.annotation.Nullable
    public EventPathParams getPathParams() {
        return this.pathParams;
    }
    /**
     * Gets the remote-addr property value. Client IP address
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRemoteAddr() {
        return this.remoteAddr;
    }
    /**
     * Gets the request-id property value. Operation unique identifier
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRequestId() {
        return this.requestId;
    }
    /**
     * Gets the status property value. Operation HTTP status
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getStatus() {
        return this.status;
    }
    /**
     * Gets the timestamp property value. Time at which the event happened, millisecond resolution
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }
    /**
     * Gets the uri property value. Operation request URI
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUri() {
        return this.uri;
    }
    /**
     * Gets the zone property value. Operation targeted zone
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getZone() {
        return this.zone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("body-params", this.getBodyParams());
        writer.writeLongValue("elapsed-ms", this.getElapsedMs());
        writer.writeObjectValue("get-params", this.getGetParams());
        writer.writeStringValue("handler", this.getHandler());
        writer.writeStringValue("message", this.getMessage());
        writer.writeObjectValue("path-params", this.getPathParams());
        writer.writeStringValue("remote-addr", this.getRemoteAddr());
        writer.writeStringValue("request-id", this.getRequestId());
        writer.writeLongValue("status", this.getStatus());
        writer.writeOffsetDateTimeValue("timestamp", this.getTimestamp());
        writer.writeStringValue("uri", this.getUri());
        writer.writeStringValue("zone", this.getZone());
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
     * Sets the body-params property value. Body parameters (free form map)
     * @param value Value to set for the body-params property.
     */
    public void setBodyParams(@jakarta.annotation.Nullable final EventBodyParams value) {
        this.bodyParams = value;
    }
    /**
     * Sets the elapsed-ms property value. Operation processing time
     * @param value Value to set for the elapsed-ms property.
     */
    public void setElapsedMs(@jakarta.annotation.Nullable final Long value) {
        this.elapsedMs = value;
    }
    /**
     * Sets the get-params property value. Query string parameters (free form map)
     * @param value Value to set for the get-params property.
     */
    public void setGetParams(@jakarta.annotation.Nullable final EventGetParams value) {
        this.getParams = value;
    }
    /**
     * Sets the handler property value. Operation handler name
     * @param value Value to set for the handler property.
     */
    public void setHandler(@jakarta.annotation.Nullable final String value) {
        this.handler = value;
    }
    /**
     * Sets the message property value. Operation message
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the path-params property value. URI path parameters (free form map)
     * @param value Value to set for the path-params property.
     */
    public void setPathParams(@jakarta.annotation.Nullable final EventPathParams value) {
        this.pathParams = value;
    }
    /**
     * Sets the remote-addr property value. Client IP address
     * @param value Value to set for the remote-addr property.
     */
    public void setRemoteAddr(@jakarta.annotation.Nullable final String value) {
        this.remoteAddr = value;
    }
    /**
     * Sets the request-id property value. Operation unique identifier
     * @param value Value to set for the request-id property.
     */
    public void setRequestId(@jakarta.annotation.Nullable final String value) {
        this.requestId = value;
    }
    /**
     * Sets the status property value. Operation HTTP status
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final Long value) {
        this.status = value;
    }
    /**
     * Sets the timestamp property value. Time at which the event happened, millisecond resolution
     * @param value Value to set for the timestamp property.
     */
    public void setTimestamp(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.timestamp = value;
    }
    /**
     * Sets the uri property value. Operation request URI
     * @param value Value to set for the uri property.
     */
    public void setUri(@jakarta.annotation.Nullable final String value) {
        this.uri = value;
    }
    /**
     * Sets the zone property value. Operation targeted zone
     * @param value Value to set for the zone property.
     */
    public void setZone(@jakarta.annotation.Nullable final String value) {
        this.zone = value;
    }
}
