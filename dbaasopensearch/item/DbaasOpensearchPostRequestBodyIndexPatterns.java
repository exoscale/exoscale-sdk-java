package com.exoscale.dbaasopensearch.item;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasOpensearchPostRequestBodyIndexPatterns implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Maximum number of indexes to keep
     */
    private Long maxIndexCount;
    /**
     * fnmatch pattern
     */
    private String pattern;
    /**
     * Deletion sorting algorithm
     */
    private DbaasOpensearchPostRequestBodyIndexPatternsSortingAlgorithm sortingAlgorithm;
    /**
     * Instantiates a new DbaasOpensearchPostRequestBodyIndexPatterns and sets the default values.
     */
    public DbaasOpensearchPostRequestBodyIndexPatterns() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasOpensearchPostRequestBodyIndexPatterns
     */
    @jakarta.annotation.Nonnull
    public static DbaasOpensearchPostRequestBodyIndexPatterns createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasOpensearchPostRequestBodyIndexPatterns();
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
        deserializerMap.put("max-index-count", (n) -> { this.setMaxIndexCount(n.getLongValue()); });
        deserializerMap.put("pattern", (n) -> { this.setPattern(n.getStringValue()); });
        deserializerMap.put("sorting-algorithm", (n) -> { this.setSortingAlgorithm(n.getEnumValue(DbaasOpensearchPostRequestBodyIndexPatternsSortingAlgorithm::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the max-index-count property value. Maximum number of indexes to keep
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getMaxIndexCount() {
        return this.maxIndexCount;
    }
    /**
     * Gets the pattern property value. fnmatch pattern
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPattern() {
        return this.pattern;
    }
    /**
     * Gets the sorting-algorithm property value. Deletion sorting algorithm
     * @return a DbaasOpensearchPostRequestBodyIndexPatternsSortingAlgorithm
     */
    @jakarta.annotation.Nullable
    public DbaasOpensearchPostRequestBodyIndexPatternsSortingAlgorithm getSortingAlgorithm() {
        return this.sortingAlgorithm;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("max-index-count", this.getMaxIndexCount());
        writer.writeStringValue("pattern", this.getPattern());
        writer.writeEnumValue("sorting-algorithm", this.getSortingAlgorithm());
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
     * Sets the max-index-count property value. Maximum number of indexes to keep
     * @param value Value to set for the max-index-count property.
     */
    public void setMaxIndexCount(@jakarta.annotation.Nullable final Long value) {
        this.maxIndexCount = value;
    }
    /**
     * Sets the pattern property value. fnmatch pattern
     * @param value Value to set for the pattern property.
     */
    public void setPattern(@jakarta.annotation.Nullable final String value) {
        this.pattern = value;
    }
    /**
     * Sets the sorting-algorithm property value. Deletion sorting algorithm
     * @param value Value to set for the sorting-algorithm property.
     */
    public void setSortingAlgorithm(@jakarta.annotation.Nullable final DbaasOpensearchPostRequestBodyIndexPatternsSortingAlgorithm value) {
        this.sortingAlgorithm = value;
    }
}
