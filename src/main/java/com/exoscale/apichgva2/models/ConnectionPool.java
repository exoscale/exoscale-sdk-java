/*
 * ExoscalePublicAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.exoscale.apichgva2.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ConnectionPool type.
 */
public class ConnectionPool {
    private String connectionUri;
    private String database;
    private EnumPgPoolModeEnum mode;
    private String name;
    private long size;
    private String username;

    /**
     * Default constructor.
     */
    public ConnectionPool() {
    }

    /**
     * Initialization constructor.
     * @param  connectionUri  String value for connectionUri.
     * @param  database  String value for database.
     * @param  mode  EnumPgPoolModeEnum value for mode.
     * @param  name  String value for name.
     * @param  size  long value for size.
     * @param  username  String value for username.
     */
    public ConnectionPool(
            String connectionUri,
            String database,
            EnumPgPoolModeEnum mode,
            String name,
            long size,
            String username) {
        this.connectionUri = connectionUri;
        this.database = database;
        this.mode = mode;
        this.name = name;
        this.size = size;
        this.username = username;
    }

    /**
     * Getter for ConnectionUri.
     * Connection URI for the DB pool
     * @return Returns the String
     */
    @JsonGetter("connection-uri")
    public String getConnectionUri() {
        return connectionUri;
    }

    /**
     * Setter for ConnectionUri.
     * Connection URI for the DB pool
     * @param connectionUri Value for String
     */
    @JsonSetter("connection-uri")
    public void setConnectionUri(String connectionUri) {
        this.connectionUri = connectionUri;
    }

    /**
     * Getter for Database.
     * @return Returns the String
     */
    @JsonGetter("database")
    public String getDatabase() {
        return database;
    }

    /**
     * Setter for Database.
     * @param database Value for String
     */
    @JsonSetter("database")
    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * Getter for Mode.
     * @return Returns the EnumPgPoolModeEnum
     */
    @JsonGetter("mode")
    public EnumPgPoolModeEnum getMode() {
        return mode;
    }

    /**
     * Setter for Mode.
     * @param mode Value for EnumPgPoolModeEnum
     */
    @JsonSetter("mode")
    public void setMode(EnumPgPoolModeEnum mode) {
        this.mode = mode;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Size.
     * @return Returns the long
     */
    @JsonGetter("size")
    public long getSize() {
        return size;
    }

    /**
     * Setter for Size.
     * @param size Value for long
     */
    @JsonSetter("size")
    public void setSize(long size) {
        this.size = size;
    }

    /**
     * Getter for Username.
     * @return Returns the String
     */
    @JsonGetter("username")
    public String getUsername() {
        return username;
    }

    /**
     * Setter for Username.
     * @param username Value for String
     */
    @JsonSetter("username")
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Converts this ConnectionPool into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ConnectionPool [" + "connectionUri=" + connectionUri + ", database=" + database
                + ", mode=" + mode + ", name=" + name + ", size=" + size + ", username=" + username
                + "]";
    }

    /**
     * Builds a new {@link ConnectionPool.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ConnectionPool.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(connectionUri, database, mode, name, size, username);
        return builder;
    }

    /**
     * Class to build instances of {@link ConnectionPool}.
     */
    public static class Builder {
        private String connectionUri;
        private String database;
        private EnumPgPoolModeEnum mode;
        private String name;
        private long size;
        private String username;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  connectionUri  String value for connectionUri.
         * @param  database  String value for database.
         * @param  mode  EnumPgPoolModeEnum value for mode.
         * @param  name  String value for name.
         * @param  size  long value for size.
         * @param  username  String value for username.
         */
        public Builder(String connectionUri, String database, EnumPgPoolModeEnum mode, String name,
                long size, String username) {
            this.connectionUri = connectionUri;
            this.database = database;
            this.mode = mode;
            this.name = name;
            this.size = size;
            this.username = username;
        }

        /**
         * Setter for connectionUri.
         * @param  connectionUri  String value for connectionUri.
         * @return Builder
         */
        public Builder connectionUri(String connectionUri) {
            this.connectionUri = connectionUri;
            return this;
        }

        /**
         * Setter for database.
         * @param  database  String value for database.
         * @return Builder
         */
        public Builder database(String database) {
            this.database = database;
            return this;
        }

        /**
         * Setter for mode.
         * @param  mode  EnumPgPoolModeEnum value for mode.
         * @return Builder
         */
        public Builder mode(EnumPgPoolModeEnum mode) {
            this.mode = mode;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for size.
         * @param  size  long value for size.
         * @return Builder
         */
        public Builder size(long size) {
            this.size = size;
            return this;
        }

        /**
         * Setter for username.
         * @param  username  String value for username.
         * @return Builder
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        /**
         * Builds a new {@link ConnectionPool} object using the set fields.
         * @return {@link ConnectionPool}
         */
        public ConnectionPool build() {
            return new ConnectionPool(connectionUri, database, mode, name, size, username);
        }
    }
}
