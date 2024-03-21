/*
 * ExoscalePublicAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.exoscale.apichgva2.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for DbaasMysqlDatabaseRequest type.
 */
public class DbaasMysqlDatabaseRequest {
    private String databaseName;

    /**
     * Default constructor.
     */
    public DbaasMysqlDatabaseRequest() {
    }

    /**
     * Initialization constructor.
     * @param  databaseName  String value for databaseName.
     */
    public DbaasMysqlDatabaseRequest(
            String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * Getter for DatabaseName.
     * @return Returns the String
     */
    @JsonGetter("database-name")
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * Setter for DatabaseName.
     * @param databaseName Value for String
     */
    @JsonSetter("database-name")
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * Converts this DbaasMysqlDatabaseRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DbaasMysqlDatabaseRequest [" + "databaseName=" + databaseName + "]";
    }

    /**
     * Builds a new {@link DbaasMysqlDatabaseRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DbaasMysqlDatabaseRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(databaseName);
        return builder;
    }

    /**
     * Class to build instances of {@link DbaasMysqlDatabaseRequest}.
     */
    public static class Builder {
        private String databaseName;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  databaseName  String value for databaseName.
         */
        public Builder(String databaseName) {
            this.databaseName = databaseName;
        }

        /**
         * Setter for databaseName.
         * @param  databaseName  String value for databaseName.
         * @return Builder
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * Builds a new {@link DbaasMysqlDatabaseRequest} object using the set fields.
         * @return {@link DbaasMysqlDatabaseRequest}
         */
        public DbaasMysqlDatabaseRequest build() {
            return new DbaasMysqlDatabaseRequest(databaseName);
        }
    }
}
