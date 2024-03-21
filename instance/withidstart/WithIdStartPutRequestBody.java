package com.exoscale.instance.withidstart;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithIdStartPutRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Boot in Rescue Mode, using named profile (supported: netboot, netboot-efi)
     */
    private WithIdStartPutRequestBodyRescueProfile rescueProfile;
    /**
     * Instantiates a new WithIdStartPutRequestBody and sets the default values.
     */
    public WithIdStartPutRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WithIdStartPutRequestBody
     */
    @jakarta.annotation.Nonnull
    public static WithIdStartPutRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WithIdStartPutRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("rescue-profile", (n) -> { this.setRescueProfile(n.getEnumValue(WithIdStartPutRequestBodyRescueProfile::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the rescue-profile property value. Boot in Rescue Mode, using named profile (supported: netboot, netboot-efi)
     * @return a WithIdStartPutRequestBodyRescueProfile
     */
    @jakarta.annotation.Nullable
    public WithIdStartPutRequestBodyRescueProfile getRescueProfile() {
        return this.rescueProfile;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("rescue-profile", this.getRescueProfile());
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
     * Sets the rescue-profile property value. Boot in Rescue Mode, using named profile (supported: netboot, netboot-efi)
     * @param value Value to set for the rescue-profile property.
     */
    public void setRescueProfile(@jakarta.annotation.Nullable final WithIdStartPutRequestBodyRescueProfile value) {
        this.rescueProfile = value;
    }
}
