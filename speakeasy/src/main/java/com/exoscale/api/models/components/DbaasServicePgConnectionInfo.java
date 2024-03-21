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
 * DbaasServicePgConnectionInfo - PG connection information properties
 */

public class DbaasServicePgConnectionInfo {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uri")
    private Optional<? extends java.util.List<String>> uri;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("params")
    private Optional<? extends java.util.List<java.util.Map<String, String>>> params;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("standby")
    private Optional<? extends java.util.List<String>> standby;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("syncing")
    private Optional<? extends java.util.List<String>> syncing;

    public DbaasServicePgConnectionInfo(
            @JsonProperty("uri") Optional<? extends java.util.List<String>> uri,
            @JsonProperty("params") Optional<? extends java.util.List<java.util.Map<String, String>>> params,
            @JsonProperty("standby") Optional<? extends java.util.List<String>> standby,
            @JsonProperty("syncing") Optional<? extends java.util.List<String>> syncing) {
        Utils.checkNotNull(uri, "uri");
        Utils.checkNotNull(params, "params");
        Utils.checkNotNull(standby, "standby");
        Utils.checkNotNull(syncing, "syncing");
        this.uri = uri;
        this.params = params;
        this.standby = standby;
        this.syncing = syncing;
    }

    public Optional<? extends java.util.List<String>> uri() {
        return uri;
    }

    public Optional<? extends java.util.List<java.util.Map<String, String>>> params() {
        return params;
    }

    public Optional<? extends java.util.List<String>> standby() {
        return standby;
    }

    public Optional<? extends java.util.List<String>> syncing() {
        return syncing;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DbaasServicePgConnectionInfo withUri(java.util.List<String> uri) {
        Utils.checkNotNull(uri, "uri");
        this.uri = Optional.ofNullable(uri);
        return this;
    }

    public DbaasServicePgConnectionInfo withUri(Optional<? extends java.util.List<String>> uri) {
        Utils.checkNotNull(uri, "uri");
        this.uri = uri;
        return this;
    }

    public DbaasServicePgConnectionInfo withParams(java.util.List<java.util.Map<String, String>> params) {
        Utils.checkNotNull(params, "params");
        this.params = Optional.ofNullable(params);
        return this;
    }

    public DbaasServicePgConnectionInfo withParams(Optional<? extends java.util.List<java.util.Map<String, String>>> params) {
        Utils.checkNotNull(params, "params");
        this.params = params;
        return this;
    }

    public DbaasServicePgConnectionInfo withStandby(java.util.List<String> standby) {
        Utils.checkNotNull(standby, "standby");
        this.standby = Optional.ofNullable(standby);
        return this;
    }

    public DbaasServicePgConnectionInfo withStandby(Optional<? extends java.util.List<String>> standby) {
        Utils.checkNotNull(standby, "standby");
        this.standby = standby;
        return this;
    }

    public DbaasServicePgConnectionInfo withSyncing(java.util.List<String> syncing) {
        Utils.checkNotNull(syncing, "syncing");
        this.syncing = Optional.ofNullable(syncing);
        return this;
    }

    public DbaasServicePgConnectionInfo withSyncing(Optional<? extends java.util.List<String>> syncing) {
        Utils.checkNotNull(syncing, "syncing");
        this.syncing = syncing;
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
        DbaasServicePgConnectionInfo other = (DbaasServicePgConnectionInfo) o;
        return 
            java.util.Objects.deepEquals(this.uri, other.uri) &&
            java.util.Objects.deepEquals(this.params, other.params) &&
            java.util.Objects.deepEquals(this.standby, other.standby) &&
            java.util.Objects.deepEquals(this.syncing, other.syncing);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            uri,
            params,
            standby,
            syncing);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DbaasServicePgConnectionInfo.class,
                "uri", uri,
                "params", params,
                "standby", standby,
                "syncing", syncing);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<String>> uri = Optional.empty();
 
        private Optional<? extends java.util.List<java.util.Map<String, String>>> params = Optional.empty();
 
        private Optional<? extends java.util.List<String>> standby = Optional.empty();
 
        private Optional<? extends java.util.List<String>> syncing = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder uri(java.util.List<String> uri) {
            Utils.checkNotNull(uri, "uri");
            this.uri = Optional.ofNullable(uri);
            return this;
        }

        public Builder uri(Optional<? extends java.util.List<String>> uri) {
            Utils.checkNotNull(uri, "uri");
            this.uri = uri;
            return this;
        }

        public Builder params(java.util.List<java.util.Map<String, String>> params) {
            Utils.checkNotNull(params, "params");
            this.params = Optional.ofNullable(params);
            return this;
        }

        public Builder params(Optional<? extends java.util.List<java.util.Map<String, String>>> params) {
            Utils.checkNotNull(params, "params");
            this.params = params;
            return this;
        }

        public Builder standby(java.util.List<String> standby) {
            Utils.checkNotNull(standby, "standby");
            this.standby = Optional.ofNullable(standby);
            return this;
        }

        public Builder standby(Optional<? extends java.util.List<String>> standby) {
            Utils.checkNotNull(standby, "standby");
            this.standby = standby;
            return this;
        }

        public Builder syncing(java.util.List<String> syncing) {
            Utils.checkNotNull(syncing, "syncing");
            this.syncing = Optional.ofNullable(syncing);
            return this;
        }

        public Builder syncing(Optional<? extends java.util.List<String>> syncing) {
            Utils.checkNotNull(syncing, "syncing");
            this.syncing = syncing;
            return this;
        }
        
        public DbaasServicePgConnectionInfo build() {
            return new DbaasServicePgConnectionInfo(
                uri,
                params,
                standby,
                syncing);
        }
    }
}

