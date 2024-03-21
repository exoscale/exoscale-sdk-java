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
 * This is a model class for ConnectionInfo3 type.
 */
public class ConnectionInfo3 {
    private String uri;
    private String username;
    private String password;

    /**
     * Default constructor.
     */
    public ConnectionInfo3() {
    }

    /**
     * Initialization constructor.
     * @param  uri  String value for uri.
     * @param  username  String value for username.
     * @param  password  String value for password.
     */
    public ConnectionInfo3(
            String uri,
            String username,
            String password) {
        this.uri = uri;
        this.username = username;
        this.password = password;
    }

    /**
     * Getter for Uri.
     * @return Returns the String
     */
    @JsonGetter("uri")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUri() {
        return uri;
    }

    /**
     * Setter for Uri.
     * @param uri Value for String
     */
    @JsonSetter("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * Getter for Username.
     * @return Returns the String
     */
    @JsonGetter("username")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Converts this ConnectionInfo3 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ConnectionInfo3 [" + "uri=" + uri + ", username=" + username + ", password="
                + password + "]";
    }

    /**
     * Builds a new {@link ConnectionInfo3.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ConnectionInfo3.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uri(getUri())
                .username(getUsername())
                .password(getPassword());
        return builder;
    }

    /**
     * Class to build instances of {@link ConnectionInfo3}.
     */
    public static class Builder {
        private String uri;
        private String username;
        private String password;



        /**
         * Setter for uri.
         * @param  uri  String value for uri.
         * @return Builder
         */
        public Builder uri(String uri) {
            this.uri = uri;
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
         * Setter for password.
         * @param  password  String value for password.
         * @return Builder
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * Builds a new {@link ConnectionInfo3} object using the set fields.
         * @return {@link ConnectionInfo3}
         */
        public ConnectionInfo3 build() {
            return new ConnectionInfo3(uri, username, password);
        }
    }
}
