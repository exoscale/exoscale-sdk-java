package com.exoscale.dbaasmysql.item;

import com.exoscale.models.EnumMigrationMethod;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Migrate data from existing server
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasMysqlPutRequestBodyMigration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Database name for bootstrapping the initial connection
     */
    private String dbname;
    /**
     * Hostname or IP address of the server where to migrate data from
     */
    private String host;
    /**
     * Comma-separated list of databases, which should be ignored during migration (supported by MySQL only at the moment)
     */
    private String ignoreDbs;
    /**
     * The method property
     */
    private EnumMigrationMethod method;
    /**
     * Password for authentication with the server where to migrate data from
     */
    private String password;
    /**
     * Port number of the server where to migrate data from
     */
    private Long port;
    /**
     * The server where to migrate data from is secured with SSL
     */
    private Boolean ssl;
    /**
     * User name for authentication with the server where to migrate data from
     */
    private String username;
    /**
     * Instantiates a new DbaasMysqlPutRequestBodyMigration and sets the default values.
     */
    public DbaasMysqlPutRequestBodyMigration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DbaasMysqlPutRequestBodyMigration
     */
    @jakarta.annotation.Nonnull
    public static DbaasMysqlPutRequestBodyMigration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DbaasMysqlPutRequestBodyMigration();
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
     * Gets the dbname property value. Database name for bootstrapping the initial connection
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDbname() {
        return this.dbname;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("dbname", (n) -> { this.setDbname(n.getStringValue()); });
        deserializerMap.put("host", (n) -> { this.setHost(n.getStringValue()); });
        deserializerMap.put("ignore-dbs", (n) -> { this.setIgnoreDbs(n.getStringValue()); });
        deserializerMap.put("method", (n) -> { this.setMethod(n.getEnumValue(EnumMigrationMethod::forValue)); });
        deserializerMap.put("password", (n) -> { this.setPassword(n.getStringValue()); });
        deserializerMap.put("port", (n) -> { this.setPort(n.getLongValue()); });
        deserializerMap.put("ssl", (n) -> { this.setSsl(n.getBooleanValue()); });
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the host property value. Hostname or IP address of the server where to migrate data from
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHost() {
        return this.host;
    }
    /**
     * Gets the ignore-dbs property value. Comma-separated list of databases, which should be ignored during migration (supported by MySQL only at the moment)
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIgnoreDbs() {
        return this.ignoreDbs;
    }
    /**
     * Gets the method property value. The method property
     * @return a EnumMigrationMethod
     */
    @jakarta.annotation.Nullable
    public EnumMigrationMethod getMethod() {
        return this.method;
    }
    /**
     * Gets the password property value. Password for authentication with the server where to migrate data from
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPassword() {
        return this.password;
    }
    /**
     * Gets the port property value. Port number of the server where to migrate data from
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getPort() {
        return this.port;
    }
    /**
     * Gets the ssl property value. The server where to migrate data from is secured with SSL
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSsl() {
        return this.ssl;
    }
    /**
     * Gets the username property value. User name for authentication with the server where to migrate data from
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUsername() {
        return this.username;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("dbname", this.getDbname());
        writer.writeStringValue("host", this.getHost());
        writer.writeStringValue("ignore-dbs", this.getIgnoreDbs());
        writer.writeEnumValue("method", this.getMethod());
        writer.writeStringValue("password", this.getPassword());
        writer.writeLongValue("port", this.getPort());
        writer.writeBooleanValue("ssl", this.getSsl());
        writer.writeStringValue("username", this.getUsername());
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
     * Sets the dbname property value. Database name for bootstrapping the initial connection
     * @param value Value to set for the dbname property.
     */
    public void setDbname(@jakarta.annotation.Nullable final String value) {
        this.dbname = value;
    }
    /**
     * Sets the host property value. Hostname or IP address of the server where to migrate data from
     * @param value Value to set for the host property.
     */
    public void setHost(@jakarta.annotation.Nullable final String value) {
        this.host = value;
    }
    /**
     * Sets the ignore-dbs property value. Comma-separated list of databases, which should be ignored during migration (supported by MySQL only at the moment)
     * @param value Value to set for the ignore-dbs property.
     */
    public void setIgnoreDbs(@jakarta.annotation.Nullable final String value) {
        this.ignoreDbs = value;
    }
    /**
     * Sets the method property value. The method property
     * @param value Value to set for the method property.
     */
    public void setMethod(@jakarta.annotation.Nullable final EnumMigrationMethod value) {
        this.method = value;
    }
    /**
     * Sets the password property value. Password for authentication with the server where to migrate data from
     * @param value Value to set for the password property.
     */
    public void setPassword(@jakarta.annotation.Nullable final String value) {
        this.password = value;
    }
    /**
     * Sets the port property value. Port number of the server where to migrate data from
     * @param value Value to set for the port property.
     */
    public void setPort(@jakarta.annotation.Nullable final Long value) {
        this.port = value;
    }
    /**
     * Sets the ssl property value. The server where to migrate data from is secured with SSL
     * @param value Value to set for the ssl property.
     */
    public void setSsl(@jakarta.annotation.Nullable final Boolean value) {
        this.ssl = value;
    }
    /**
     * Sets the username property value. User name for authentication with the server where to migrate data from
     * @param value Value to set for the username property.
     */
    public void setUsername(@jakarta.annotation.Nullable final String value) {
        this.username = value;
    }
}
