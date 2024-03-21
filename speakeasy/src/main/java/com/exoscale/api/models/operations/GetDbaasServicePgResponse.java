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


public class GetDbaasServicePgResponse implements com.exoscale.api.utils.Response {

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
    private Optional<? extends com.exoscale.api.models.components.DbaasServicePg> dbaasServicePg;

    public GetDbaasServicePgResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.exoscale.api.models.components.DbaasServicePg> dbaasServicePg) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(dbaasServicePg, "dbaasServicePg");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.dbaasServicePg = dbaasServicePg;
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
    public Optional<? extends com.exoscale.api.models.components.DbaasServicePg> dbaasServicePg() {
        return dbaasServicePg;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetDbaasServicePgResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetDbaasServicePgResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetDbaasServicePgResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * 200
     */
    public GetDbaasServicePgResponse withDbaasServicePg(com.exoscale.api.models.components.DbaasServicePg dbaasServicePg) {
        Utils.checkNotNull(dbaasServicePg, "dbaasServicePg");
        this.dbaasServicePg = Optional.ofNullable(dbaasServicePg);
        return this;
    }

    /**
     * 200
     */
    public GetDbaasServicePgResponse withDbaasServicePg(Optional<? extends com.exoscale.api.models.components.DbaasServicePg> dbaasServicePg) {
        Utils.checkNotNull(dbaasServicePg, "dbaasServicePg");
        this.dbaasServicePg = dbaasServicePg;
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
        GetDbaasServicePgResponse other = (GetDbaasServicePgResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.dbaasServicePg, other.dbaasServicePg);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            dbaasServicePg);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetDbaasServicePgResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "dbaasServicePg", dbaasServicePg);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.exoscale.api.models.components.DbaasServicePg> dbaasServicePg = Optional.empty();  
        
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
        public Builder dbaasServicePg(com.exoscale.api.models.components.DbaasServicePg dbaasServicePg) {
            Utils.checkNotNull(dbaasServicePg, "dbaasServicePg");
            this.dbaasServicePg = Optional.ofNullable(dbaasServicePg);
            return this;
        }

        /**
         * 200
         */
        public Builder dbaasServicePg(Optional<? extends com.exoscale.api.models.components.DbaasServicePg> dbaasServicePg) {
            Utils.checkNotNull(dbaasServicePg, "dbaasServicePg");
            this.dbaasServicePg = dbaasServicePg;
            return this;
        }
        
        public GetDbaasServicePgResponse build() {
            return new GetDbaasServicePgResponse(
                contentType,
                statusCode,
                rawResponse,
                dbaasServicePg);
        }
    }
}

