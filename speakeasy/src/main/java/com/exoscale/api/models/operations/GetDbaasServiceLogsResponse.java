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


public class GetDbaasServiceLogsResponse implements com.exoscale.api.utils.Response {

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
    private Optional<? extends com.exoscale.api.models.components.DbaasServiceLogs> dbaasServiceLogs;

    public GetDbaasServiceLogsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.exoscale.api.models.components.DbaasServiceLogs> dbaasServiceLogs) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(dbaasServiceLogs, "dbaasServiceLogs");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.dbaasServiceLogs = dbaasServiceLogs;
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
    public Optional<? extends com.exoscale.api.models.components.DbaasServiceLogs> dbaasServiceLogs() {
        return dbaasServiceLogs;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetDbaasServiceLogsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetDbaasServiceLogsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetDbaasServiceLogsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * 200
     */
    public GetDbaasServiceLogsResponse withDbaasServiceLogs(com.exoscale.api.models.components.DbaasServiceLogs dbaasServiceLogs) {
        Utils.checkNotNull(dbaasServiceLogs, "dbaasServiceLogs");
        this.dbaasServiceLogs = Optional.ofNullable(dbaasServiceLogs);
        return this;
    }

    /**
     * 200
     */
    public GetDbaasServiceLogsResponse withDbaasServiceLogs(Optional<? extends com.exoscale.api.models.components.DbaasServiceLogs> dbaasServiceLogs) {
        Utils.checkNotNull(dbaasServiceLogs, "dbaasServiceLogs");
        this.dbaasServiceLogs = dbaasServiceLogs;
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
        GetDbaasServiceLogsResponse other = (GetDbaasServiceLogsResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.dbaasServiceLogs, other.dbaasServiceLogs);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            dbaasServiceLogs);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetDbaasServiceLogsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "dbaasServiceLogs", dbaasServiceLogs);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.exoscale.api.models.components.DbaasServiceLogs> dbaasServiceLogs = Optional.empty();  
        
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
        public Builder dbaasServiceLogs(com.exoscale.api.models.components.DbaasServiceLogs dbaasServiceLogs) {
            Utils.checkNotNull(dbaasServiceLogs, "dbaasServiceLogs");
            this.dbaasServiceLogs = Optional.ofNullable(dbaasServiceLogs);
            return this;
        }

        /**
         * 200
         */
        public Builder dbaasServiceLogs(Optional<? extends com.exoscale.api.models.components.DbaasServiceLogs> dbaasServiceLogs) {
            Utils.checkNotNull(dbaasServiceLogs, "dbaasServiceLogs");
            this.dbaasServiceLogs = dbaasServiceLogs;
            return this;
        }
        
        public GetDbaasServiceLogsResponse build() {
            return new GetDbaasServiceLogsResponse(
                contentType,
                statusCode,
                rawResponse,
                dbaasServiceLogs);
        }
    }
}

