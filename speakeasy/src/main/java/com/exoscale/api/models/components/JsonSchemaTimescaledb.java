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


public class JsonSchemaTimescaledb {

    /**
     * The number of background workers for timescaledb operations. You should configure this setting to the sum of your number of databases and the total number of concurrent background workers you want running at any given point in time.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_background_workers")
    private Optional<? extends Long> maxBackgroundWorkers;

    public JsonSchemaTimescaledb(
            @JsonProperty("max_background_workers") Optional<? extends Long> maxBackgroundWorkers) {
        Utils.checkNotNull(maxBackgroundWorkers, "maxBackgroundWorkers");
        this.maxBackgroundWorkers = maxBackgroundWorkers;
    }

    /**
     * The number of background workers for timescaledb operations. You should configure this setting to the sum of your number of databases and the total number of concurrent background workers you want running at any given point in time.
     */
    public Optional<? extends Long> maxBackgroundWorkers() {
        return maxBackgroundWorkers;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The number of background workers for timescaledb operations. You should configure this setting to the sum of your number of databases and the total number of concurrent background workers you want running at any given point in time.
     */
    public JsonSchemaTimescaledb withMaxBackgroundWorkers(long maxBackgroundWorkers) {
        Utils.checkNotNull(maxBackgroundWorkers, "maxBackgroundWorkers");
        this.maxBackgroundWorkers = Optional.ofNullable(maxBackgroundWorkers);
        return this;
    }

    /**
     * The number of background workers for timescaledb operations. You should configure this setting to the sum of your number of databases and the total number of concurrent background workers you want running at any given point in time.
     */
    public JsonSchemaTimescaledb withMaxBackgroundWorkers(Optional<? extends Long> maxBackgroundWorkers) {
        Utils.checkNotNull(maxBackgroundWorkers, "maxBackgroundWorkers");
        this.maxBackgroundWorkers = maxBackgroundWorkers;
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
        JsonSchemaTimescaledb other = (JsonSchemaTimescaledb) o;
        return 
            java.util.Objects.deepEquals(this.maxBackgroundWorkers, other.maxBackgroundWorkers);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            maxBackgroundWorkers);
    }
    
    @Override
    public String toString() {
        return Utils.toString(JsonSchemaTimescaledb.class,
                "maxBackgroundWorkers", maxBackgroundWorkers);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> maxBackgroundWorkers = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The number of background workers for timescaledb operations. You should configure this setting to the sum of your number of databases and the total number of concurrent background workers you want running at any given point in time.
         */
        public Builder maxBackgroundWorkers(long maxBackgroundWorkers) {
            Utils.checkNotNull(maxBackgroundWorkers, "maxBackgroundWorkers");
            this.maxBackgroundWorkers = Optional.ofNullable(maxBackgroundWorkers);
            return this;
        }

        /**
         * The number of background workers for timescaledb operations. You should configure this setting to the sum of your number of databases and the total number of concurrent background workers you want running at any given point in time.
         */
        public Builder maxBackgroundWorkers(Optional<? extends Long> maxBackgroundWorkers) {
            Utils.checkNotNull(maxBackgroundWorkers, "maxBackgroundWorkers");
            this.maxBackgroundWorkers = maxBackgroundWorkers;
            return this;
        }
        
        public JsonSchemaTimescaledb build() {
            return new JsonSchemaTimescaledb(
                maxBackgroundWorkers);
        }
    }
}

