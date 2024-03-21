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
 * This is a model class for DbaasOpensearchUserPasswordResetRequest type.
 */
public class DbaasOpensearchUserPasswordResetRequest {
    private String password;

    /**
     * Default constructor.
     */
    public DbaasOpensearchUserPasswordResetRequest() {
    }

    /**
     * Initialization constructor.
     * @param  password  String value for password.
     */
    public DbaasOpensearchUserPasswordResetRequest(
            String password) {
        this.password = password;
    }

    /**
     * Getter for Password.
     * @return Returns the String
     */
    @JsonGetter("password")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPassword() {
        return password;
    }

    /**
     * Setter for Password.
     * @param password Value for String
     */
    @JsonSetter("password")
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Converts this DbaasOpensearchUserPasswordResetRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DbaasOpensearchUserPasswordResetRequest [" + "password=" + password + "]";
    }

    /**
     * Builds a new {@link DbaasOpensearchUserPasswordResetRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DbaasOpensearchUserPasswordResetRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .password(getPassword());
        return builder;
    }

    /**
     * Class to build instances of {@link DbaasOpensearchUserPasswordResetRequest}.
     */
    public static class Builder {
        private String password;



        /**
         * Setter for password.
         * @param  password  String value for password.
         * @return Builder
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * Builds a new {@link DbaasOpensearchUserPasswordResetRequest} object using the set fields.
         * @return {@link DbaasOpensearchUserPasswordResetRequest}
         */
        public DbaasOpensearchUserPasswordResetRequest build() {
            return new DbaasOpensearchUserPasswordResetRequest(password);
        }
    }
}
