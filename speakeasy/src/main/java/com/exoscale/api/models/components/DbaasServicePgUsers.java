/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.exoscale.api.models.components;

import com.exoscale.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

/**
 * DbaasServicePgUsers - List of service users
 */

public class DbaasServicePgUsers {

    /**
     * Account type
     */
    @JsonProperty("type")
    private String type;

    /**
     * Account username
     */
    @JsonProperty("username")
    private String username;

    /**
     * Account password. A missing field indicates a user overridden password.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private Optional<? extends String> password;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allow-replication")
    private Optional<? extends Boolean> allowReplication;

    public DbaasServicePgUsers(
            @JsonProperty("type") String type,
            @JsonProperty("username") String username,
            @JsonProperty("password") Optional<? extends String> password,
            @JsonProperty("allow-replication") Optional<? extends Boolean> allowReplication) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(username, "username");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(allowReplication, "allowReplication");
        this.type = type;
        this.username = username;
        this.password = password;
        this.allowReplication = allowReplication;
    }

    /**
     * Account type
     */
    public String type() {
        return type;
    }

    /**
     * Account username
     */
    public String username() {
        return username;
    }

    /**
     * Account password. A missing field indicates a user overridden password.
     */
    public Optional<? extends String> password() {
        return password;
    }

    public Optional<? extends Boolean> allowReplication() {
        return allowReplication;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Account type
     */
    public DbaasServicePgUsers withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Account username
     */
    public DbaasServicePgUsers withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
        return this;
    }

    /**
     * Account password. A missing field indicates a user overridden password.
     */
    public DbaasServicePgUsers withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    /**
     * Account password. A missing field indicates a user overridden password.
     */
    public DbaasServicePgUsers withPassword(Optional<? extends String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    public DbaasServicePgUsers withAllowReplication(boolean allowReplication) {
        Utils.checkNotNull(allowReplication, "allowReplication");
        this.allowReplication = Optional.ofNullable(allowReplication);
        return this;
    }

    public DbaasServicePgUsers withAllowReplication(Optional<? extends Boolean> allowReplication) {
        Utils.checkNotNull(allowReplication, "allowReplication");
        this.allowReplication = allowReplication;
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
        DbaasServicePgUsers other = (DbaasServicePgUsers) o;
        return 
            java.util.Objects.deepEquals(this.type, other.type) &&
            java.util.Objects.deepEquals(this.username, other.username) &&
            java.util.Objects.deepEquals(this.password, other.password) &&
            java.util.Objects.deepEquals(this.allowReplication, other.allowReplication);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            type,
            username,
            password,
            allowReplication);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DbaasServicePgUsers.class,
                "type", type,
                "username", username,
                "password", password,
                "allowReplication", allowReplication);
    }
    
    public final static class Builder {
 
        private String type;
 
        private String username;
 
        private Optional<? extends String> password = Optional.empty();
 
        private Optional<? extends Boolean> allowReplication = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Account type
         */
        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * Account username
         */
        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }

        /**
         * Account password. A missing field indicates a user overridden password.
         */
        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = Optional.ofNullable(password);
            return this;
        }

        /**
         * Account password. A missing field indicates a user overridden password.
         */
        public Builder password(Optional<? extends String> password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        public Builder allowReplication(boolean allowReplication) {
            Utils.checkNotNull(allowReplication, "allowReplication");
            this.allowReplication = Optional.ofNullable(allowReplication);
            return this;
        }

        public Builder allowReplication(Optional<? extends Boolean> allowReplication) {
            Utils.checkNotNull(allowReplication, "allowReplication");
            this.allowReplication = allowReplication;
            return this;
        }
        
        public DbaasServicePgUsers build() {
            return new DbaasServicePgUsers(
                type,
                username,
                password,
                allowReplication);
        }
    }
}

