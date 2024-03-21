package com.exoscale.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JsonSchemaPgBgWriter implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Specifies the delay between activity rounds for the background writer in milliseconds. Default is 200.
     */
    private Integer bgwriterDelay;
    /**
     * Whenever more than bgwriter_flush_after bytes have been written by the background writer, attempt to force the OS to issue these writes to the underlying storage. Specified in kilobytes, default is 512. Setting of 0 disables forced writeback.
     */
    private Integer bgwriterFlushAfter;
    /**
     * In each round, no more than this many buffers will be written by the background writer. Setting this to zero disables background writing. Default is 100.
     */
    private Integer bgwriterLruMaxpages;
    /**
     * The average recent need for new buffers is multiplied by bgwriter_lru_multiplier to arrive at an estimate of the number that will be needed during the next round, (up to bgwriter_lru_maxpages). 1.0 represents a just in time policy of writing exactly the number of buffers predicted to be needed. Larger values provide some cushion against spikes in demand, while smaller values intentionally leave writes to be done by server processes. The default is 2.0.
     */
    private Double bgwriterLruMultiplier;
    /**
     * Instantiates a new JsonSchemaPgBgWriter and sets the default values.
     */
    public JsonSchemaPgBgWriter() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a JsonSchemaPgBgWriter
     */
    @jakarta.annotation.Nonnull
    public static JsonSchemaPgBgWriter createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new JsonSchemaPgBgWriter();
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
     * Gets the bgwriter_delay property value. Specifies the delay between activity rounds for the background writer in milliseconds. Default is 200.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getBgwriterDelay() {
        return this.bgwriterDelay;
    }
    /**
     * Gets the bgwriter_flush_after property value. Whenever more than bgwriter_flush_after bytes have been written by the background writer, attempt to force the OS to issue these writes to the underlying storage. Specified in kilobytes, default is 512. Setting of 0 disables forced writeback.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getBgwriterFlushAfter() {
        return this.bgwriterFlushAfter;
    }
    /**
     * Gets the bgwriter_lru_maxpages property value. In each round, no more than this many buffers will be written by the background writer. Setting this to zero disables background writing. Default is 100.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getBgwriterLruMaxpages() {
        return this.bgwriterLruMaxpages;
    }
    /**
     * Gets the bgwriter_lru_multiplier property value. The average recent need for new buffers is multiplied by bgwriter_lru_multiplier to arrive at an estimate of the number that will be needed during the next round, (up to bgwriter_lru_maxpages). 1.0 represents a just in time policy of writing exactly the number of buffers predicted to be needed. Larger values provide some cushion against spikes in demand, while smaller values intentionally leave writes to be done by server processes. The default is 2.0.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getBgwriterLruMultiplier() {
        return this.bgwriterLruMultiplier;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("bgwriter_delay", (n) -> { this.setBgwriterDelay(n.getIntegerValue()); });
        deserializerMap.put("bgwriter_flush_after", (n) -> { this.setBgwriterFlushAfter(n.getIntegerValue()); });
        deserializerMap.put("bgwriter_lru_maxpages", (n) -> { this.setBgwriterLruMaxpages(n.getIntegerValue()); });
        deserializerMap.put("bgwriter_lru_multiplier", (n) -> { this.setBgwriterLruMultiplier(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("bgwriter_delay", this.getBgwriterDelay());
        writer.writeIntegerValue("bgwriter_flush_after", this.getBgwriterFlushAfter());
        writer.writeIntegerValue("bgwriter_lru_maxpages", this.getBgwriterLruMaxpages());
        writer.writeDoubleValue("bgwriter_lru_multiplier", this.getBgwriterLruMultiplier());
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
     * Sets the bgwriter_delay property value. Specifies the delay between activity rounds for the background writer in milliseconds. Default is 200.
     * @param value Value to set for the bgwriter_delay property.
     */
    public void setBgwriterDelay(@jakarta.annotation.Nullable final Integer value) {
        this.bgwriterDelay = value;
    }
    /**
     * Sets the bgwriter_flush_after property value. Whenever more than bgwriter_flush_after bytes have been written by the background writer, attempt to force the OS to issue these writes to the underlying storage. Specified in kilobytes, default is 512. Setting of 0 disables forced writeback.
     * @param value Value to set for the bgwriter_flush_after property.
     */
    public void setBgwriterFlushAfter(@jakarta.annotation.Nullable final Integer value) {
        this.bgwriterFlushAfter = value;
    }
    /**
     * Sets the bgwriter_lru_maxpages property value. In each round, no more than this many buffers will be written by the background writer. Setting this to zero disables background writing. Default is 100.
     * @param value Value to set for the bgwriter_lru_maxpages property.
     */
    public void setBgwriterLruMaxpages(@jakarta.annotation.Nullable final Integer value) {
        this.bgwriterLruMaxpages = value;
    }
    /**
     * Sets the bgwriter_lru_multiplier property value. The average recent need for new buffers is multiplied by bgwriter_lru_multiplier to arrive at an estimate of the number that will be needed during the next round, (up to bgwriter_lru_maxpages). 1.0 represents a just in time policy of writing exactly the number of buffers predicted to be needed. Larger values provide some cushion against spikes in demand, while smaller values intentionally leave writes to be done by server processes. The default is 2.0.
     * @param value Value to set for the bgwriter_lru_multiplier property.
     */
    public void setBgwriterLruMultiplier(@jakarta.annotation.Nullable final Double value) {
        this.bgwriterLruMultiplier = value;
    }
}
