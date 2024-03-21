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


public class GetDbaasSettingsOpensearchSettings {

    /**
     * OpenSearch configuration values
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("opensearch")
    private Optional<? extends Opensearch> opensearch;

    public GetDbaasSettingsOpensearchSettings(
            @JsonProperty("opensearch") Optional<? extends Opensearch> opensearch) {
        Utils.checkNotNull(opensearch, "opensearch");
        this.opensearch = opensearch;
    }

    /**
     * OpenSearch configuration values
     */
    public Optional<? extends Opensearch> opensearch() {
        return opensearch;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * OpenSearch configuration values
     */
    public GetDbaasSettingsOpensearchSettings withOpensearch(Opensearch opensearch) {
        Utils.checkNotNull(opensearch, "opensearch");
        this.opensearch = Optional.ofNullable(opensearch);
        return this;
    }

    /**
     * OpenSearch configuration values
     */
    public GetDbaasSettingsOpensearchSettings withOpensearch(Optional<? extends Opensearch> opensearch) {
        Utils.checkNotNull(opensearch, "opensearch");
        this.opensearch = opensearch;
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
        GetDbaasSettingsOpensearchSettings other = (GetDbaasSettingsOpensearchSettings) o;
        return 
            java.util.Objects.deepEquals(this.opensearch, other.opensearch);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            opensearch);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetDbaasSettingsOpensearchSettings.class,
                "opensearch", opensearch);
    }
    
    public final static class Builder {
 
        private Optional<? extends Opensearch> opensearch = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * OpenSearch configuration values
         */
        public Builder opensearch(Opensearch opensearch) {
            Utils.checkNotNull(opensearch, "opensearch");
            this.opensearch = Optional.ofNullable(opensearch);
            return this;
        }

        /**
         * OpenSearch configuration values
         */
        public Builder opensearch(Optional<? extends Opensearch> opensearch) {
            Utils.checkNotNull(opensearch, "opensearch");
            this.opensearch = opensearch;
            return this;
        }
        
        public GetDbaasSettingsOpensearchSettings build() {
            return new GetDbaasSettingsOpensearchSettings(
                opensearch);
        }
    }
}

