/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.exoscale.api.models.operations;

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
 * UpdateDbaasServicePgMigration - Migrate data from existing server
 */

public class UpdateDbaasServicePgMigration {

    /**
     * Hostname or IP address of the server where to migrate data from
     */
    @JsonProperty("host")
    private String host;

    /**
     * Port number of the server where to migrate data from
     */
    @JsonProperty("port")
    private long port;

    /**
     * Password for authentication with the server where to migrate data from
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private Optional<? extends String> password;

    /**
     * The server where to migrate data from is secured with SSL
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssl")
    private Optional<? extends Boolean> ssl;

    /**
     * User name for authentication with the server where to migrate data from
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("username")
    private Optional<? extends String> username;

    /**
     * Database name for bootstrapping the initial connection
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dbname")
    private Optional<? extends String> dbname;

    /**
     * Comma-separated list of databases, which should be ignored during migration (supported by MySQL only at the moment)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ignore-dbs")
    private Optional<? extends String> ignoreDbs;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("method")
    private Optional<? extends com.exoscale.api.models.components.EnumMigrationMethod> method;

    public UpdateDbaasServicePgMigration(
            @JsonProperty("host") String host,
            @JsonProperty("port") long port,
            @JsonProperty("password") Optional<? extends String> password,
            @JsonProperty("ssl") Optional<? extends Boolean> ssl,
            @JsonProperty("username") Optional<? extends String> username,
            @JsonProperty("dbname") Optional<? extends String> dbname,
            @JsonProperty("ignore-dbs") Optional<? extends String> ignoreDbs,
            @JsonProperty("method") Optional<? extends com.exoscale.api.models.components.EnumMigrationMethod> method) {
        Utils.checkNotNull(host, "host");
        Utils.checkNotNull(port, "port");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(ssl, "ssl");
        Utils.checkNotNull(username, "username");
        Utils.checkNotNull(dbname, "dbname");
        Utils.checkNotNull(ignoreDbs, "ignoreDbs");
        Utils.checkNotNull(method, "method");
        this.host = host;
        this.port = port;
        this.password = password;
        this.ssl = ssl;
        this.username = username;
        this.dbname = dbname;
        this.ignoreDbs = ignoreDbs;
        this.method = method;
    }

    /**
     * Hostname or IP address of the server where to migrate data from
     */
    public String host() {
        return host;
    }

    /**
     * Port number of the server where to migrate data from
     */
    public long port() {
        return port;
    }

    /**
     * Password for authentication with the server where to migrate data from
     */
    public Optional<? extends String> password() {
        return password;
    }

    /**
     * The server where to migrate data from is secured with SSL
     */
    public Optional<? extends Boolean> ssl() {
        return ssl;
    }

    /**
     * User name for authentication with the server where to migrate data from
     */
    public Optional<? extends String> username() {
        return username;
    }

    /**
     * Database name for bootstrapping the initial connection
     */
    public Optional<? extends String> dbname() {
        return dbname;
    }

    /**
     * Comma-separated list of databases, which should be ignored during migration (supported by MySQL only at the moment)
     */
    public Optional<? extends String> ignoreDbs() {
        return ignoreDbs;
    }

    public Optional<? extends com.exoscale.api.models.components.EnumMigrationMethod> method() {
        return method;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Hostname or IP address of the server where to migrate data from
     */
    public UpdateDbaasServicePgMigration withHost(String host) {
        Utils.checkNotNull(host, "host");
        this.host = host;
        return this;
    }

    /**
     * Port number of the server where to migrate data from
     */
    public UpdateDbaasServicePgMigration withPort(long port) {
        Utils.checkNotNull(port, "port");
        this.port = port;
        return this;
    }

    /**
     * Password for authentication with the server where to migrate data from
     */
    public UpdateDbaasServicePgMigration withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    /**
     * Password for authentication with the server where to migrate data from
     */
    public UpdateDbaasServicePgMigration withPassword(Optional<? extends String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * The server where to migrate data from is secured with SSL
     */
    public UpdateDbaasServicePgMigration withSsl(boolean ssl) {
        Utils.checkNotNull(ssl, "ssl");
        this.ssl = Optional.ofNullable(ssl);
        return this;
    }

    /**
     * The server where to migrate data from is secured with SSL
     */
    public UpdateDbaasServicePgMigration withSsl(Optional<? extends Boolean> ssl) {
        Utils.checkNotNull(ssl, "ssl");
        this.ssl = ssl;
        return this;
    }

    /**
     * User name for authentication with the server where to migrate data from
     */
    public UpdateDbaasServicePgMigration withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = Optional.ofNullable(username);
        return this;
    }

    /**
     * User name for authentication with the server where to migrate data from
     */
    public UpdateDbaasServicePgMigration withUsername(Optional<? extends String> username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
        return this;
    }

    /**
     * Database name for bootstrapping the initial connection
     */
    public UpdateDbaasServicePgMigration withDbname(String dbname) {
        Utils.checkNotNull(dbname, "dbname");
        this.dbname = Optional.ofNullable(dbname);
        return this;
    }

    /**
     * Database name for bootstrapping the initial connection
     */
    public UpdateDbaasServicePgMigration withDbname(Optional<? extends String> dbname) {
        Utils.checkNotNull(dbname, "dbname");
        this.dbname = dbname;
        return this;
    }

    /**
     * Comma-separated list of databases, which should be ignored during migration (supported by MySQL only at the moment)
     */
    public UpdateDbaasServicePgMigration withIgnoreDbs(String ignoreDbs) {
        Utils.checkNotNull(ignoreDbs, "ignoreDbs");
        this.ignoreDbs = Optional.ofNullable(ignoreDbs);
        return this;
    }

    /**
     * Comma-separated list of databases, which should be ignored during migration (supported by MySQL only at the moment)
     */
    public UpdateDbaasServicePgMigration withIgnoreDbs(Optional<? extends String> ignoreDbs) {
        Utils.checkNotNull(ignoreDbs, "ignoreDbs");
        this.ignoreDbs = ignoreDbs;
        return this;
    }

    public UpdateDbaasServicePgMigration withMethod(com.exoscale.api.models.components.EnumMigrationMethod method) {
        Utils.checkNotNull(method, "method");
        this.method = Optional.ofNullable(method);
        return this;
    }

    public UpdateDbaasServicePgMigration withMethod(Optional<? extends com.exoscale.api.models.components.EnumMigrationMethod> method) {
        Utils.checkNotNull(method, "method");
        this.method = method;
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
        UpdateDbaasServicePgMigration other = (UpdateDbaasServicePgMigration) o;
        return 
            java.util.Objects.deepEquals(this.host, other.host) &&
            java.util.Objects.deepEquals(this.port, other.port) &&
            java.util.Objects.deepEquals(this.password, other.password) &&
            java.util.Objects.deepEquals(this.ssl, other.ssl) &&
            java.util.Objects.deepEquals(this.username, other.username) &&
            java.util.Objects.deepEquals(this.dbname, other.dbname) &&
            java.util.Objects.deepEquals(this.ignoreDbs, other.ignoreDbs) &&
            java.util.Objects.deepEquals(this.method, other.method);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            host,
            port,
            password,
            ssl,
            username,
            dbname,
            ignoreDbs,
            method);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateDbaasServicePgMigration.class,
                "host", host,
                "port", port,
                "password", password,
                "ssl", ssl,
                "username", username,
                "dbname", dbname,
                "ignoreDbs", ignoreDbs,
                "method", method);
    }
    
    public final static class Builder {
 
        private String host;
 
        private Long port;
 
        private Optional<? extends String> password = Optional.empty();
 
        private Optional<? extends Boolean> ssl = Optional.empty();
 
        private Optional<? extends String> username = Optional.empty();
 
        private Optional<? extends String> dbname = Optional.empty();
 
        private Optional<? extends String> ignoreDbs = Optional.empty();
 
        private Optional<? extends com.exoscale.api.models.components.EnumMigrationMethod> method = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Hostname or IP address of the server where to migrate data from
         */
        public Builder host(String host) {
            Utils.checkNotNull(host, "host");
            this.host = host;
            return this;
        }

        /**
         * Port number of the server where to migrate data from
         */
        public Builder port(long port) {
            Utils.checkNotNull(port, "port");
            this.port = port;
            return this;
        }

        /**
         * Password for authentication with the server where to migrate data from
         */
        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = Optional.ofNullable(password);
            return this;
        }

        /**
         * Password for authentication with the server where to migrate data from
         */
        public Builder password(Optional<? extends String> password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        /**
         * The server where to migrate data from is secured with SSL
         */
        public Builder ssl(boolean ssl) {
            Utils.checkNotNull(ssl, "ssl");
            this.ssl = Optional.ofNullable(ssl);
            return this;
        }

        /**
         * The server where to migrate data from is secured with SSL
         */
        public Builder ssl(Optional<? extends Boolean> ssl) {
            Utils.checkNotNull(ssl, "ssl");
            this.ssl = ssl;
            return this;
        }

        /**
         * User name for authentication with the server where to migrate data from
         */
        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = Optional.ofNullable(username);
            return this;
        }

        /**
         * User name for authentication with the server where to migrate data from
         */
        public Builder username(Optional<? extends String> username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }

        /**
         * Database name for bootstrapping the initial connection
         */
        public Builder dbname(String dbname) {
            Utils.checkNotNull(dbname, "dbname");
            this.dbname = Optional.ofNullable(dbname);
            return this;
        }

        /**
         * Database name for bootstrapping the initial connection
         */
        public Builder dbname(Optional<? extends String> dbname) {
            Utils.checkNotNull(dbname, "dbname");
            this.dbname = dbname;
            return this;
        }

        /**
         * Comma-separated list of databases, which should be ignored during migration (supported by MySQL only at the moment)
         */
        public Builder ignoreDbs(String ignoreDbs) {
            Utils.checkNotNull(ignoreDbs, "ignoreDbs");
            this.ignoreDbs = Optional.ofNullable(ignoreDbs);
            return this;
        }

        /**
         * Comma-separated list of databases, which should be ignored during migration (supported by MySQL only at the moment)
         */
        public Builder ignoreDbs(Optional<? extends String> ignoreDbs) {
            Utils.checkNotNull(ignoreDbs, "ignoreDbs");
            this.ignoreDbs = ignoreDbs;
            return this;
        }

        public Builder method(com.exoscale.api.models.components.EnumMigrationMethod method) {
            Utils.checkNotNull(method, "method");
            this.method = Optional.ofNullable(method);
            return this;
        }

        public Builder method(Optional<? extends com.exoscale.api.models.components.EnumMigrationMethod> method) {
            Utils.checkNotNull(method, "method");
            this.method = method;
            return this;
        }
        
        public UpdateDbaasServicePgMigration build() {
            return new UpdateDbaasServicePgMigration(
                host,
                port,
                password,
                ssl,
                username,
                dbname,
                ignoreDbs,
                method);
        }
    }
}

