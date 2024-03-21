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


public class JsonSchemaPgbouncer {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("min_pool_size")
    private Optional<? extends Long> minPoolSize;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ignore_startup_parameters")
    private Optional<? extends java.util.List<EnumOfParametersToIgnoreWhenGivenInStartupPacket>> ignoreStartupParameters;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("server_lifetime")
    private Optional<? extends Long> serverLifetime;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("autodb_pool_mode")
    private Optional<? extends PGBouncerPoolMode> autodbPoolMode;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("server_idle_timeout")
    private Optional<? extends Long> serverIdleTimeout;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("autodb_max_db_connections")
    private Optional<? extends Long> autodbMaxDbConnections;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("server_reset_query_always")
    private Optional<? extends Boolean> serverResetQueryAlways;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("autodb_pool_size")
    private Optional<? extends Long> autodbPoolSize;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("autodb_idle_timeout")
    private Optional<? extends Long> autodbIdleTimeout;

    public JsonSchemaPgbouncer(
            @JsonProperty("min_pool_size") Optional<? extends Long> minPoolSize,
            @JsonProperty("ignore_startup_parameters") Optional<? extends java.util.List<EnumOfParametersToIgnoreWhenGivenInStartupPacket>> ignoreStartupParameters,
            @JsonProperty("server_lifetime") Optional<? extends Long> serverLifetime,
            @JsonProperty("autodb_pool_mode") Optional<? extends PGBouncerPoolMode> autodbPoolMode,
            @JsonProperty("server_idle_timeout") Optional<? extends Long> serverIdleTimeout,
            @JsonProperty("autodb_max_db_connections") Optional<? extends Long> autodbMaxDbConnections,
            @JsonProperty("server_reset_query_always") Optional<? extends Boolean> serverResetQueryAlways,
            @JsonProperty("autodb_pool_size") Optional<? extends Long> autodbPoolSize,
            @JsonProperty("autodb_idle_timeout") Optional<? extends Long> autodbIdleTimeout) {
        Utils.checkNotNull(minPoolSize, "minPoolSize");
        Utils.checkNotNull(ignoreStartupParameters, "ignoreStartupParameters");
        Utils.checkNotNull(serverLifetime, "serverLifetime");
        Utils.checkNotNull(autodbPoolMode, "autodbPoolMode");
        Utils.checkNotNull(serverIdleTimeout, "serverIdleTimeout");
        Utils.checkNotNull(autodbMaxDbConnections, "autodbMaxDbConnections");
        Utils.checkNotNull(serverResetQueryAlways, "serverResetQueryAlways");
        Utils.checkNotNull(autodbPoolSize, "autodbPoolSize");
        Utils.checkNotNull(autodbIdleTimeout, "autodbIdleTimeout");
        this.minPoolSize = minPoolSize;
        this.ignoreStartupParameters = ignoreStartupParameters;
        this.serverLifetime = serverLifetime;
        this.autodbPoolMode = autodbPoolMode;
        this.serverIdleTimeout = serverIdleTimeout;
        this.autodbMaxDbConnections = autodbMaxDbConnections;
        this.serverResetQueryAlways = serverResetQueryAlways;
        this.autodbPoolSize = autodbPoolSize;
        this.autodbIdleTimeout = autodbIdleTimeout;
    }

    public Optional<? extends Long> minPoolSize() {
        return minPoolSize;
    }

    public Optional<? extends java.util.List<EnumOfParametersToIgnoreWhenGivenInStartupPacket>> ignoreStartupParameters() {
        return ignoreStartupParameters;
    }

    public Optional<? extends Long> serverLifetime() {
        return serverLifetime;
    }

    public Optional<? extends PGBouncerPoolMode> autodbPoolMode() {
        return autodbPoolMode;
    }

    public Optional<? extends Long> serverIdleTimeout() {
        return serverIdleTimeout;
    }

    public Optional<? extends Long> autodbMaxDbConnections() {
        return autodbMaxDbConnections;
    }

    public Optional<? extends Boolean> serverResetQueryAlways() {
        return serverResetQueryAlways;
    }

    public Optional<? extends Long> autodbPoolSize() {
        return autodbPoolSize;
    }

    public Optional<? extends Long> autodbIdleTimeout() {
        return autodbIdleTimeout;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public JsonSchemaPgbouncer withMinPoolSize(long minPoolSize) {
        Utils.checkNotNull(minPoolSize, "minPoolSize");
        this.minPoolSize = Optional.ofNullable(minPoolSize);
        return this;
    }

    public JsonSchemaPgbouncer withMinPoolSize(Optional<? extends Long> minPoolSize) {
        Utils.checkNotNull(minPoolSize, "minPoolSize");
        this.minPoolSize = minPoolSize;
        return this;
    }

    public JsonSchemaPgbouncer withIgnoreStartupParameters(java.util.List<EnumOfParametersToIgnoreWhenGivenInStartupPacket> ignoreStartupParameters) {
        Utils.checkNotNull(ignoreStartupParameters, "ignoreStartupParameters");
        this.ignoreStartupParameters = Optional.ofNullable(ignoreStartupParameters);
        return this;
    }

    public JsonSchemaPgbouncer withIgnoreStartupParameters(Optional<? extends java.util.List<EnumOfParametersToIgnoreWhenGivenInStartupPacket>> ignoreStartupParameters) {
        Utils.checkNotNull(ignoreStartupParameters, "ignoreStartupParameters");
        this.ignoreStartupParameters = ignoreStartupParameters;
        return this;
    }

    public JsonSchemaPgbouncer withServerLifetime(long serverLifetime) {
        Utils.checkNotNull(serverLifetime, "serverLifetime");
        this.serverLifetime = Optional.ofNullable(serverLifetime);
        return this;
    }

    public JsonSchemaPgbouncer withServerLifetime(Optional<? extends Long> serverLifetime) {
        Utils.checkNotNull(serverLifetime, "serverLifetime");
        this.serverLifetime = serverLifetime;
        return this;
    }

    public JsonSchemaPgbouncer withAutodbPoolMode(PGBouncerPoolMode autodbPoolMode) {
        Utils.checkNotNull(autodbPoolMode, "autodbPoolMode");
        this.autodbPoolMode = Optional.ofNullable(autodbPoolMode);
        return this;
    }

    public JsonSchemaPgbouncer withAutodbPoolMode(Optional<? extends PGBouncerPoolMode> autodbPoolMode) {
        Utils.checkNotNull(autodbPoolMode, "autodbPoolMode");
        this.autodbPoolMode = autodbPoolMode;
        return this;
    }

    public JsonSchemaPgbouncer withServerIdleTimeout(long serverIdleTimeout) {
        Utils.checkNotNull(serverIdleTimeout, "serverIdleTimeout");
        this.serverIdleTimeout = Optional.ofNullable(serverIdleTimeout);
        return this;
    }

    public JsonSchemaPgbouncer withServerIdleTimeout(Optional<? extends Long> serverIdleTimeout) {
        Utils.checkNotNull(serverIdleTimeout, "serverIdleTimeout");
        this.serverIdleTimeout = serverIdleTimeout;
        return this;
    }

    public JsonSchemaPgbouncer withAutodbMaxDbConnections(long autodbMaxDbConnections) {
        Utils.checkNotNull(autodbMaxDbConnections, "autodbMaxDbConnections");
        this.autodbMaxDbConnections = Optional.ofNullable(autodbMaxDbConnections);
        return this;
    }

    public JsonSchemaPgbouncer withAutodbMaxDbConnections(Optional<? extends Long> autodbMaxDbConnections) {
        Utils.checkNotNull(autodbMaxDbConnections, "autodbMaxDbConnections");
        this.autodbMaxDbConnections = autodbMaxDbConnections;
        return this;
    }

    public JsonSchemaPgbouncer withServerResetQueryAlways(boolean serverResetQueryAlways) {
        Utils.checkNotNull(serverResetQueryAlways, "serverResetQueryAlways");
        this.serverResetQueryAlways = Optional.ofNullable(serverResetQueryAlways);
        return this;
    }

    public JsonSchemaPgbouncer withServerResetQueryAlways(Optional<? extends Boolean> serverResetQueryAlways) {
        Utils.checkNotNull(serverResetQueryAlways, "serverResetQueryAlways");
        this.serverResetQueryAlways = serverResetQueryAlways;
        return this;
    }

    public JsonSchemaPgbouncer withAutodbPoolSize(long autodbPoolSize) {
        Utils.checkNotNull(autodbPoolSize, "autodbPoolSize");
        this.autodbPoolSize = Optional.ofNullable(autodbPoolSize);
        return this;
    }

    public JsonSchemaPgbouncer withAutodbPoolSize(Optional<? extends Long> autodbPoolSize) {
        Utils.checkNotNull(autodbPoolSize, "autodbPoolSize");
        this.autodbPoolSize = autodbPoolSize;
        return this;
    }

    public JsonSchemaPgbouncer withAutodbIdleTimeout(long autodbIdleTimeout) {
        Utils.checkNotNull(autodbIdleTimeout, "autodbIdleTimeout");
        this.autodbIdleTimeout = Optional.ofNullable(autodbIdleTimeout);
        return this;
    }

    public JsonSchemaPgbouncer withAutodbIdleTimeout(Optional<? extends Long> autodbIdleTimeout) {
        Utils.checkNotNull(autodbIdleTimeout, "autodbIdleTimeout");
        this.autodbIdleTimeout = autodbIdleTimeout;
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
        JsonSchemaPgbouncer other = (JsonSchemaPgbouncer) o;
        return 
            java.util.Objects.deepEquals(this.minPoolSize, other.minPoolSize) &&
            java.util.Objects.deepEquals(this.ignoreStartupParameters, other.ignoreStartupParameters) &&
            java.util.Objects.deepEquals(this.serverLifetime, other.serverLifetime) &&
            java.util.Objects.deepEquals(this.autodbPoolMode, other.autodbPoolMode) &&
            java.util.Objects.deepEquals(this.serverIdleTimeout, other.serverIdleTimeout) &&
            java.util.Objects.deepEquals(this.autodbMaxDbConnections, other.autodbMaxDbConnections) &&
            java.util.Objects.deepEquals(this.serverResetQueryAlways, other.serverResetQueryAlways) &&
            java.util.Objects.deepEquals(this.autodbPoolSize, other.autodbPoolSize) &&
            java.util.Objects.deepEquals(this.autodbIdleTimeout, other.autodbIdleTimeout);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            minPoolSize,
            ignoreStartupParameters,
            serverLifetime,
            autodbPoolMode,
            serverIdleTimeout,
            autodbMaxDbConnections,
            serverResetQueryAlways,
            autodbPoolSize,
            autodbIdleTimeout);
    }
    
    @Override
    public String toString() {
        return Utils.toString(JsonSchemaPgbouncer.class,
                "minPoolSize", minPoolSize,
                "ignoreStartupParameters", ignoreStartupParameters,
                "serverLifetime", serverLifetime,
                "autodbPoolMode", autodbPoolMode,
                "serverIdleTimeout", serverIdleTimeout,
                "autodbMaxDbConnections", autodbMaxDbConnections,
                "serverResetQueryAlways", serverResetQueryAlways,
                "autodbPoolSize", autodbPoolSize,
                "autodbIdleTimeout", autodbIdleTimeout);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> minPoolSize = Optional.empty();
 
        private Optional<? extends java.util.List<EnumOfParametersToIgnoreWhenGivenInStartupPacket>> ignoreStartupParameters = Optional.empty();
 
        private Optional<? extends Long> serverLifetime = Optional.empty();
 
        private Optional<? extends PGBouncerPoolMode> autodbPoolMode = Optional.empty();
 
        private Optional<? extends Long> serverIdleTimeout = Optional.empty();
 
        private Optional<? extends Long> autodbMaxDbConnections = Optional.empty();
 
        private Optional<? extends Boolean> serverResetQueryAlways = Optional.empty();
 
        private Optional<? extends Long> autodbPoolSize = Optional.empty();
 
        private Optional<? extends Long> autodbIdleTimeout = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder minPoolSize(long minPoolSize) {
            Utils.checkNotNull(minPoolSize, "minPoolSize");
            this.minPoolSize = Optional.ofNullable(minPoolSize);
            return this;
        }

        public Builder minPoolSize(Optional<? extends Long> minPoolSize) {
            Utils.checkNotNull(minPoolSize, "minPoolSize");
            this.minPoolSize = minPoolSize;
            return this;
        }

        public Builder ignoreStartupParameters(java.util.List<EnumOfParametersToIgnoreWhenGivenInStartupPacket> ignoreStartupParameters) {
            Utils.checkNotNull(ignoreStartupParameters, "ignoreStartupParameters");
            this.ignoreStartupParameters = Optional.ofNullable(ignoreStartupParameters);
            return this;
        }

        public Builder ignoreStartupParameters(Optional<? extends java.util.List<EnumOfParametersToIgnoreWhenGivenInStartupPacket>> ignoreStartupParameters) {
            Utils.checkNotNull(ignoreStartupParameters, "ignoreStartupParameters");
            this.ignoreStartupParameters = ignoreStartupParameters;
            return this;
        }

        public Builder serverLifetime(long serverLifetime) {
            Utils.checkNotNull(serverLifetime, "serverLifetime");
            this.serverLifetime = Optional.ofNullable(serverLifetime);
            return this;
        }

        public Builder serverLifetime(Optional<? extends Long> serverLifetime) {
            Utils.checkNotNull(serverLifetime, "serverLifetime");
            this.serverLifetime = serverLifetime;
            return this;
        }

        public Builder autodbPoolMode(PGBouncerPoolMode autodbPoolMode) {
            Utils.checkNotNull(autodbPoolMode, "autodbPoolMode");
            this.autodbPoolMode = Optional.ofNullable(autodbPoolMode);
            return this;
        }

        public Builder autodbPoolMode(Optional<? extends PGBouncerPoolMode> autodbPoolMode) {
            Utils.checkNotNull(autodbPoolMode, "autodbPoolMode");
            this.autodbPoolMode = autodbPoolMode;
            return this;
        }

        public Builder serverIdleTimeout(long serverIdleTimeout) {
            Utils.checkNotNull(serverIdleTimeout, "serverIdleTimeout");
            this.serverIdleTimeout = Optional.ofNullable(serverIdleTimeout);
            return this;
        }

        public Builder serverIdleTimeout(Optional<? extends Long> serverIdleTimeout) {
            Utils.checkNotNull(serverIdleTimeout, "serverIdleTimeout");
            this.serverIdleTimeout = serverIdleTimeout;
            return this;
        }

        public Builder autodbMaxDbConnections(long autodbMaxDbConnections) {
            Utils.checkNotNull(autodbMaxDbConnections, "autodbMaxDbConnections");
            this.autodbMaxDbConnections = Optional.ofNullable(autodbMaxDbConnections);
            return this;
        }

        public Builder autodbMaxDbConnections(Optional<? extends Long> autodbMaxDbConnections) {
            Utils.checkNotNull(autodbMaxDbConnections, "autodbMaxDbConnections");
            this.autodbMaxDbConnections = autodbMaxDbConnections;
            return this;
        }

        public Builder serverResetQueryAlways(boolean serverResetQueryAlways) {
            Utils.checkNotNull(serverResetQueryAlways, "serverResetQueryAlways");
            this.serverResetQueryAlways = Optional.ofNullable(serverResetQueryAlways);
            return this;
        }

        public Builder serverResetQueryAlways(Optional<? extends Boolean> serverResetQueryAlways) {
            Utils.checkNotNull(serverResetQueryAlways, "serverResetQueryAlways");
            this.serverResetQueryAlways = serverResetQueryAlways;
            return this;
        }

        public Builder autodbPoolSize(long autodbPoolSize) {
            Utils.checkNotNull(autodbPoolSize, "autodbPoolSize");
            this.autodbPoolSize = Optional.ofNullable(autodbPoolSize);
            return this;
        }

        public Builder autodbPoolSize(Optional<? extends Long> autodbPoolSize) {
            Utils.checkNotNull(autodbPoolSize, "autodbPoolSize");
            this.autodbPoolSize = autodbPoolSize;
            return this;
        }

        public Builder autodbIdleTimeout(long autodbIdleTimeout) {
            Utils.checkNotNull(autodbIdleTimeout, "autodbIdleTimeout");
            this.autodbIdleTimeout = Optional.ofNullable(autodbIdleTimeout);
            return this;
        }

        public Builder autodbIdleTimeout(Optional<? extends Long> autodbIdleTimeout) {
            Utils.checkNotNull(autodbIdleTimeout, "autodbIdleTimeout");
            this.autodbIdleTimeout = autodbIdleTimeout;
            return this;
        }
        
        public JsonSchemaPgbouncer build() {
            return new JsonSchemaPgbouncer(
                minPoolSize,
                ignoreStartupParameters,
                serverLifetime,
                autodbPoolMode,
                serverIdleTimeout,
                autodbMaxDbConnections,
                serverResetQueryAlways,
                autodbPoolSize,
                autodbIdleTimeout);
        }
    }
}

