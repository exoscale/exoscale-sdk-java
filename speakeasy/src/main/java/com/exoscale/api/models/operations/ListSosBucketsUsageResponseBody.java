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
 * ListSosBucketsUsageResponseBody - 200
 */

public class ListSosBucketsUsageResponseBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sos-buckets-usage")
    private Optional<? extends java.util.List<com.exoscale.api.models.components.SosBucketUsage>> sosBucketsUsage;

    public ListSosBucketsUsageResponseBody(
            @JsonProperty("sos-buckets-usage") Optional<? extends java.util.List<com.exoscale.api.models.components.SosBucketUsage>> sosBucketsUsage) {
        Utils.checkNotNull(sosBucketsUsage, "sosBucketsUsage");
        this.sosBucketsUsage = sosBucketsUsage;
    }

    public Optional<? extends java.util.List<com.exoscale.api.models.components.SosBucketUsage>> sosBucketsUsage() {
        return sosBucketsUsage;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ListSosBucketsUsageResponseBody withSosBucketsUsage(java.util.List<com.exoscale.api.models.components.SosBucketUsage> sosBucketsUsage) {
        Utils.checkNotNull(sosBucketsUsage, "sosBucketsUsage");
        this.sosBucketsUsage = Optional.ofNullable(sosBucketsUsage);
        return this;
    }

    public ListSosBucketsUsageResponseBody withSosBucketsUsage(Optional<? extends java.util.List<com.exoscale.api.models.components.SosBucketUsage>> sosBucketsUsage) {
        Utils.checkNotNull(sosBucketsUsage, "sosBucketsUsage");
        this.sosBucketsUsage = sosBucketsUsage;
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
        ListSosBucketsUsageResponseBody other = (ListSosBucketsUsageResponseBody) o;
        return 
            java.util.Objects.deepEquals(this.sosBucketsUsage, other.sosBucketsUsage);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            sosBucketsUsage);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListSosBucketsUsageResponseBody.class,
                "sosBucketsUsage", sosBucketsUsage);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<com.exoscale.api.models.components.SosBucketUsage>> sosBucketsUsage = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder sosBucketsUsage(java.util.List<com.exoscale.api.models.components.SosBucketUsage> sosBucketsUsage) {
            Utils.checkNotNull(sosBucketsUsage, "sosBucketsUsage");
            this.sosBucketsUsage = Optional.ofNullable(sosBucketsUsage);
            return this;
        }

        public Builder sosBucketsUsage(Optional<? extends java.util.List<com.exoscale.api.models.components.SosBucketUsage>> sosBucketsUsage) {
            Utils.checkNotNull(sosBucketsUsage, "sosBucketsUsage");
            this.sosBucketsUsage = sosBucketsUsage;
            return this;
        }
        
        public ListSosBucketsUsageResponseBody build() {
            return new ListSosBucketsUsageResponseBody(
                sosBucketsUsage);
        }
    }
}

