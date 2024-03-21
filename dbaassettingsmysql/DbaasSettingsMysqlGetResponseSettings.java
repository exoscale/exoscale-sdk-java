package com.exoscale.dbaassettingsmysql;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasSettingsMysqlGetResponseSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * mysql.conf configuration values
     */
    private DbaasSettingsMysqlGetResponseSettingsMysql mysql;
    /**
     * Instantiates a new DbaasSettingsMysqlGetResponseSettings and sets the default values.
     */
    public DbaasSettingsMysqlGetResponseSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasSettingsMysqlGetResponseSettings
     */
    @jakarta.annotation.Nonnull
    public static DbaasSettingsMysqlGetResponseSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasSettingsMysqlGetResponseSettings();
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
        deserializerMap.put("mysql", (n) -> { this.setMysql(n.getObjectValue(DbaasSettingsMysqlGetResponseSettingsMysql::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the mysql property value. mysql.conf configuration values
     * @return a DbaasSettingsMysqlGetResponseSettingsMysql
     */
    @jakarta.annotation.Nullable
    public DbaasSettingsMysqlGetResponseSettingsMysql getMysql() {
        return this.mysql;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("mysql", this.getMysql());
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
     * Sets the mysql property value. mysql.conf configuration values
     * @param value Value to set for the mysql property.
     */
    public void setMysql(@jakarta.annotation.Nullable final DbaasSettingsMysqlGetResponseSettingsMysql value) {
        this.mysql = value;
    }
}
