package com.exoscale.dbaassettingspg;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasSettingsPgGetResponseSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * postgresql.conf configuration values
     */
    private DbaasSettingsPgGetResponseSettingsPg pg;
    /**
     * PGBouncer connection pooling settings
     */
    private DbaasSettingsPgGetResponseSettingsPgbouncer pgbouncer;
    /**
     * PGLookout settings
     */
    private DbaasSettingsPgGetResponseSettingsPglookout pglookout;
    /**
     * TimescaleDB extension configuration values
     */
    private DbaasSettingsPgGetResponseSettingsTimescaledb timescaledb;
    /**
     * Instantiates a new DbaasSettingsPgGetResponseSettings and sets the default values.
     */
    public DbaasSettingsPgGetResponseSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasSettingsPgGetResponseSettings
     */
    @jakarta.annotation.Nonnull
    public static DbaasSettingsPgGetResponseSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasSettingsPgGetResponseSettings();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("pg", (n) -> { this.setPg(n.getObjectValue(DbaasSettingsPgGetResponseSettingsPg::createFromDiscriminatorValue)); });
        deserializerMap.put("pgbouncer", (n) -> { this.setPgbouncer(n.getObjectValue(DbaasSettingsPgGetResponseSettingsPgbouncer::createFromDiscriminatorValue)); });
        deserializerMap.put("pglookout", (n) -> { this.setPglookout(n.getObjectValue(DbaasSettingsPgGetResponseSettingsPglookout::createFromDiscriminatorValue)); });
        deserializerMap.put("timescaledb", (n) -> { this.setTimescaledb(n.getObjectValue(DbaasSettingsPgGetResponseSettingsTimescaledb::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the pg property value. postgresql.conf configuration values
     * @return a DbaasSettingsPgGetResponseSettingsPg
     */
    @jakarta.annotation.Nullable
    public DbaasSettingsPgGetResponseSettingsPg getPg() {
        return this.pg;
    }
    /**
     * Gets the pgbouncer property value. PGBouncer connection pooling settings
     * @return a DbaasSettingsPgGetResponseSettingsPgbouncer
     */
    @jakarta.annotation.Nullable
    public DbaasSettingsPgGetResponseSettingsPgbouncer getPgbouncer() {
        return this.pgbouncer;
    }
    /**
     * Gets the pglookout property value. PGLookout settings
     * @return a DbaasSettingsPgGetResponseSettingsPglookout
     */
    @jakarta.annotation.Nullable
    public DbaasSettingsPgGetResponseSettingsPglookout getPglookout() {
        return this.pglookout;
    }
    /**
     * Gets the timescaledb property value. TimescaleDB extension configuration values
     * @return a DbaasSettingsPgGetResponseSettingsTimescaledb
     */
    @jakarta.annotation.Nullable
    public DbaasSettingsPgGetResponseSettingsTimescaledb getTimescaledb() {
        return this.timescaledb;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("pg", this.getPg());
        writer.writeObjectValue("pgbouncer", this.getPgbouncer());
        writer.writeObjectValue("pglookout", this.getPglookout());
        writer.writeObjectValue("timescaledb", this.getTimescaledb());
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
     * Sets the pg property value. postgresql.conf configuration values
     * @param value Value to set for the pg property.
     */
    public void setPg(@jakarta.annotation.Nullable final DbaasSettingsPgGetResponseSettingsPg value) {
        this.pg = value;
    }
    /**
     * Sets the pgbouncer property value. PGBouncer connection pooling settings
     * @param value Value to set for the pgbouncer property.
     */
    public void setPgbouncer(@jakarta.annotation.Nullable final DbaasSettingsPgGetResponseSettingsPgbouncer value) {
        this.pgbouncer = value;
    }
    /**
     * Sets the pglookout property value. PGLookout settings
     * @param value Value to set for the pglookout property.
     */
    public void setPglookout(@jakarta.annotation.Nullable final DbaasSettingsPgGetResponseSettingsPglookout value) {
        this.pglookout = value;
    }
    /**
     * Sets the timescaledb property value. TimescaleDB extension configuration values
     * @param value Value to set for the timescaledb property.
     */
    public void setTimescaledb(@jakarta.annotation.Nullable final DbaasSettingsPgGetResponseSettingsTimescaledb value) {
        this.timescaledb = value;
    }
}
