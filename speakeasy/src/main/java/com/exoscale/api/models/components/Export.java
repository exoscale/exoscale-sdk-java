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
 * Export - Exported snapshot information
 */

public class Export {

    /**
     * Exported snapshot disk file pre-signed URL
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("presigned-url")
    private Optional<? extends String> presignedUrl;

    /**
     * Exported snapshot disk file MD5 checksum
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("md5sum")
    private Optional<? extends String> md5sum;

    public Export(
            @JsonProperty("presigned-url") Optional<? extends String> presignedUrl,
            @JsonProperty("md5sum") Optional<? extends String> md5sum) {
        Utils.checkNotNull(presignedUrl, "presignedUrl");
        Utils.checkNotNull(md5sum, "md5sum");
        this.presignedUrl = presignedUrl;
        this.md5sum = md5sum;
    }

    /**
     * Exported snapshot disk file pre-signed URL
     */
    public Optional<? extends String> presignedUrl() {
        return presignedUrl;
    }

    /**
     * Exported snapshot disk file MD5 checksum
     */
    public Optional<? extends String> md5sum() {
        return md5sum;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Exported snapshot disk file pre-signed URL
     */
    public Export withPresignedUrl(String presignedUrl) {
        Utils.checkNotNull(presignedUrl, "presignedUrl");
        this.presignedUrl = Optional.ofNullable(presignedUrl);
        return this;
    }

    /**
     * Exported snapshot disk file pre-signed URL
     */
    public Export withPresignedUrl(Optional<? extends String> presignedUrl) {
        Utils.checkNotNull(presignedUrl, "presignedUrl");
        this.presignedUrl = presignedUrl;
        return this;
    }

    /**
     * Exported snapshot disk file MD5 checksum
     */
    public Export withMd5sum(String md5sum) {
        Utils.checkNotNull(md5sum, "md5sum");
        this.md5sum = Optional.ofNullable(md5sum);
        return this;
    }

    /**
     * Exported snapshot disk file MD5 checksum
     */
    public Export withMd5sum(Optional<? extends String> md5sum) {
        Utils.checkNotNull(md5sum, "md5sum");
        this.md5sum = md5sum;
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
        Export other = (Export) o;
        return 
            java.util.Objects.deepEquals(this.presignedUrl, other.presignedUrl) &&
            java.util.Objects.deepEquals(this.md5sum, other.md5sum);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            presignedUrl,
            md5sum);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Export.class,
                "presignedUrl", presignedUrl,
                "md5sum", md5sum);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> presignedUrl = Optional.empty();
 
        private Optional<? extends String> md5sum = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Exported snapshot disk file pre-signed URL
         */
        public Builder presignedUrl(String presignedUrl) {
            Utils.checkNotNull(presignedUrl, "presignedUrl");
            this.presignedUrl = Optional.ofNullable(presignedUrl);
            return this;
        }

        /**
         * Exported snapshot disk file pre-signed URL
         */
        public Builder presignedUrl(Optional<? extends String> presignedUrl) {
            Utils.checkNotNull(presignedUrl, "presignedUrl");
            this.presignedUrl = presignedUrl;
            return this;
        }

        /**
         * Exported snapshot disk file MD5 checksum
         */
        public Builder md5sum(String md5sum) {
            Utils.checkNotNull(md5sum, "md5sum");
            this.md5sum = Optional.ofNullable(md5sum);
            return this;
        }

        /**
         * Exported snapshot disk file MD5 checksum
         */
        public Builder md5sum(Optional<? extends String> md5sum) {
            Utils.checkNotNull(md5sum, "md5sum");
            this.md5sum = md5sum;
            return this;
        }
        
        public Export build() {
            return new Export(
                presignedUrl,
                md5sum);
        }
    }
}

