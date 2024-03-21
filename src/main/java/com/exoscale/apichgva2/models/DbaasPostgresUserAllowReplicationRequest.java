/*
 * ExoscalePublicAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.exoscale.apichgva2.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for DbaasPostgresUserAllowReplicationRequest type.
 */
public class DbaasPostgresUserAllowReplicationRequest {
    private Boolean allowReplication;

    /**
     * Default constructor.
     */
    public DbaasPostgresUserAllowReplicationRequest() {
    }

    /**
     * Initialization constructor.
     * @param  allowReplication  Boolean value for allowReplication.
     */
    public DbaasPostgresUserAllowReplicationRequest(
            Boolean allowReplication) {
        this.allowReplication = allowReplication;
    }

    /**
     * Getter for AllowReplication.
     * @return Returns the Boolean
     */
    @JsonGetter("allow-replication")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAllowReplication() {
        return allowReplication;
    }

    /**
     * Setter for AllowReplication.
     * @param allowReplication Value for Boolean
     */
    @JsonSetter("allow-replication")
    public void setAllowReplication(Boolean allowReplication) {
        this.allowReplication = allowReplication;
    }

    /**
     * Converts this DbaasPostgresUserAllowReplicationRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DbaasPostgresUserAllowReplicationRequest [" + "allowReplication=" + allowReplication
                + "]";
    }

    /**
     * Builds a new {@link DbaasPostgresUserAllowReplicationRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DbaasPostgresUserAllowReplicationRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .allowReplication(getAllowReplication());
        return builder;
    }

    /**
     * Class to build instances of {@link DbaasPostgresUserAllowReplicationRequest}.
     */
    public static class Builder {
        private Boolean allowReplication;



        /**
         * Setter for allowReplication.
         * @param  allowReplication  Boolean value for allowReplication.
         * @return Builder
         */
        public Builder allowReplication(Boolean allowReplication) {
            this.allowReplication = allowReplication;
            return this;
        }

        /**
         * Builds a new {@link DbaasPostgresUserAllowReplicationRequest} object using the set
         * fields.
         * @return {@link DbaasPostgresUserAllowReplicationRequest}
         */
        public DbaasPostgresUserAllowReplicationRequest build() {
            return new DbaasPostgresUserAllowReplicationRequest(allowReplication);
        }
    }
}
