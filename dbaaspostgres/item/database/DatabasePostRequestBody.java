package com.exoscale.dbaaspostgres.item.database;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DatabasePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The databaseName property
     */
    private String databaseName;
    /**
     * Default string sort order (LC_COLLATE) for PostgreSQL database
     */
    private String lcCollate;
    /**
     * Default character classification (LC_CTYPE) for PostgreSQL database
     */
    private String lcCtype;
    /**
     * Instantiates a new DatabasePostRequestBody and sets the default values.
     */
    public DatabasePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DatabasePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static DatabasePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DatabasePostRequestBody();
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
     * Gets the database-name property value. The databaseName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDatabaseName() {
        return this.databaseName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("database-name", (n) -> { this.setDatabaseName(n.getStringValue()); });
        deserializerMap.put("lc-collate", (n) -> { this.setLcCollate(n.getStringValue()); });
        deserializerMap.put("lc-ctype", (n) -> { this.setLcCtype(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lc-collate property value. Default string sort order (LC_COLLATE) for PostgreSQL database
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLcCollate() {
        return this.lcCollate;
    }
    /**
     * Gets the lc-ctype property value. Default character classification (LC_CTYPE) for PostgreSQL database
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLcCtype() {
        return this.lcCtype;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("database-name", this.getDatabaseName());
        writer.writeStringValue("lc-collate", this.getLcCollate());
        writer.writeStringValue("lc-ctype", this.getLcCtype());
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
     * Sets the database-name property value. The databaseName property
     * @param value Value to set for the database-name property.
     */
    public void setDatabaseName(@jakarta.annotation.Nullable final String value) {
        this.databaseName = value;
    }
    /**
     * Sets the lc-collate property value. Default string sort order (LC_COLLATE) for PostgreSQL database
     * @param value Value to set for the lc-collate property.
     */
    public void setLcCollate(@jakarta.annotation.Nullable final String value) {
        this.lcCollate = value;
    }
    /**
     * Sets the lc-ctype property value. Default character classification (LC_CTYPE) for PostgreSQL database
     * @param value Value to set for the lc-ctype property.
     */
    public void setLcCtype(@jakarta.annotation.Nullable final String value) {
        this.lcCtype = value;
    }
}
