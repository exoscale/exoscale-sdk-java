/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.exoscale.api.models.components;

import com.exoscale.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class ConnectionPools {

    /**
     * Connection URI for the DB pool
     */
    @JsonProperty("connection-uri")
    private String connectionUri;

    @JsonProperty("database")
    private String database;

    @JsonProperty("mode")
    private EnumPgPoolMode mode;

    @JsonProperty("name")
    private String name;

    @JsonProperty("size")
    private long size;

    @JsonProperty("username")
    private String username;

    public ConnectionPools(
            @JsonProperty("connection-uri") String connectionUri,
            @JsonProperty("database") String database,
            @JsonProperty("mode") EnumPgPoolMode mode,
            @JsonProperty("name") String name,
            @JsonProperty("size") long size,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(connectionUri, "connectionUri");
        Utils.checkNotNull(database, "database");
        Utils.checkNotNull(mode, "mode");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(username, "username");
        this.connectionUri = connectionUri;
        this.database = database;
        this.mode = mode;
        this.name = name;
        this.size = size;
        this.username = username;
    }

    /**
     * Connection URI for the DB pool
     */
    public String connectionUri() {
        return connectionUri;
    }

    public String database() {
        return database;
    }

    public EnumPgPoolMode mode() {
        return mode;
    }

    public String name() {
        return name;
    }

    public long size() {
        return size;
    }

    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Connection URI for the DB pool
     */
    public ConnectionPools withConnectionUri(String connectionUri) {
        Utils.checkNotNull(connectionUri, "connectionUri");
        this.connectionUri = connectionUri;
        return this;
    }

    public ConnectionPools withDatabase(String database) {
        Utils.checkNotNull(database, "database");
        this.database = database;
        return this;
    }

    public ConnectionPools withMode(EnumPgPoolMode mode) {
        Utils.checkNotNull(mode, "mode");
        this.mode = mode;
        return this;
    }

    public ConnectionPools withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public ConnectionPools withSize(long size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public ConnectionPools withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConnectionPools other = (ConnectionPools) o;
        return 
            java.util.Objects.deepEquals(this.connectionUri, other.connectionUri) &&
            java.util.Objects.deepEquals(this.database, other.database) &&
            java.util.Objects.deepEquals(this.mode, other.mode) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.size, other.size) &&
            java.util.Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            connectionUri,
            database,
            mode,
            name,
            size,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConnectionPools.class,
                "connectionUri", connectionUri,
                "database", database,
                "mode", mode,
                "name", name,
                "size", size,
                "username", username);
    }
    
    public final static class Builder {
 
        private String connectionUri;
 
        private String database;
 
        private EnumPgPoolMode mode;
 
        private String name;
 
        private Long size;
 
        private String username;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Connection URI for the DB pool
         */
        public Builder connectionUri(String connectionUri) {
            Utils.checkNotNull(connectionUri, "connectionUri");
            this.connectionUri = connectionUri;
            return this;
        }

        public Builder database(String database) {
            Utils.checkNotNull(database, "database");
            this.database = database;
            return this;
        }

        public Builder mode(EnumPgPoolMode mode) {
            Utils.checkNotNull(mode, "mode");
            this.mode = mode;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder size(long size) {
            Utils.checkNotNull(size, "size");
            this.size = size;
            return this;
        }

        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public ConnectionPools build() {
            return new ConnectionPools(
                connectionUri,
                database,
                mode,
                name,
                size,
                username);
        }
    }
}

