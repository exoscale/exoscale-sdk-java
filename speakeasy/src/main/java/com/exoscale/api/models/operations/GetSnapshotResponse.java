/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.exoscale.api.models.operations;

import com.exoscale.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;


public class GetSnapshotResponse implements com.exoscale.api.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * 200
     */
    private Optional<? extends com.exoscale.api.models.components.SnapshotOutput> snapshot;

    public GetSnapshotResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.exoscale.api.models.components.SnapshotOutput> snapshot) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(snapshot, "snapshot");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.snapshot = snapshot;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * 200
     */
    public Optional<? extends com.exoscale.api.models.components.SnapshotOutput> snapshot() {
        return snapshot;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetSnapshotResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetSnapshotResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetSnapshotResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * 200
     */
    public GetSnapshotResponse withSnapshot(com.exoscale.api.models.components.SnapshotOutput snapshot) {
        Utils.checkNotNull(snapshot, "snapshot");
        this.snapshot = Optional.ofNullable(snapshot);
        return this;
    }

    /**
     * 200
     */
    public GetSnapshotResponse withSnapshot(Optional<? extends com.exoscale.api.models.components.SnapshotOutput> snapshot) {
        Utils.checkNotNull(snapshot, "snapshot");
        this.snapshot = snapshot;
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
        GetSnapshotResponse other = (GetSnapshotResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.snapshot, other.snapshot);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            snapshot);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetSnapshotResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "snapshot", snapshot);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.exoscale.api.models.components.SnapshotOutput> snapshot = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        /**
         * 200
         */
        public Builder snapshot(com.exoscale.api.models.components.SnapshotOutput snapshot) {
            Utils.checkNotNull(snapshot, "snapshot");
            this.snapshot = Optional.ofNullable(snapshot);
            return this;
        }

        /**
         * 200
         */
        public Builder snapshot(Optional<? extends com.exoscale.api.models.components.SnapshotOutput> snapshot) {
            Utils.checkNotNull(snapshot, "snapshot");
            this.snapshot = snapshot;
            return this;
        }
        
        public GetSnapshotResponse build() {
            return new GetSnapshotResponse(
                contentType,
                statusCode,
                rawResponse,
                snapshot);
        }
    }
}

