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


public class GetDnsDomainResponse implements com.exoscale.api.utils.Response {

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
    private Optional<? extends com.exoscale.api.models.components.DnsDomain> dnsDomain;

    public GetDnsDomainResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.exoscale.api.models.components.DnsDomain> dnsDomain) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(dnsDomain, "dnsDomain");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.dnsDomain = dnsDomain;
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
    public Optional<? extends com.exoscale.api.models.components.DnsDomain> dnsDomain() {
        return dnsDomain;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetDnsDomainResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetDnsDomainResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetDnsDomainResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * 200
     */
    public GetDnsDomainResponse withDnsDomain(com.exoscale.api.models.components.DnsDomain dnsDomain) {
        Utils.checkNotNull(dnsDomain, "dnsDomain");
        this.dnsDomain = Optional.ofNullable(dnsDomain);
        return this;
    }

    /**
     * 200
     */
    public GetDnsDomainResponse withDnsDomain(Optional<? extends com.exoscale.api.models.components.DnsDomain> dnsDomain) {
        Utils.checkNotNull(dnsDomain, "dnsDomain");
        this.dnsDomain = dnsDomain;
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
        GetDnsDomainResponse other = (GetDnsDomainResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.dnsDomain, other.dnsDomain);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            dnsDomain);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetDnsDomainResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "dnsDomain", dnsDomain);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.exoscale.api.models.components.DnsDomain> dnsDomain = Optional.empty();  
        
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
        public Builder dnsDomain(com.exoscale.api.models.components.DnsDomain dnsDomain) {
            Utils.checkNotNull(dnsDomain, "dnsDomain");
            this.dnsDomain = Optional.ofNullable(dnsDomain);
            return this;
        }

        /**
         * 200
         */
        public Builder dnsDomain(Optional<? extends com.exoscale.api.models.components.DnsDomain> dnsDomain) {
            Utils.checkNotNull(dnsDomain, "dnsDomain");
            this.dnsDomain = dnsDomain;
            return this;
        }
        
        public GetDnsDomainResponse build() {
            return new GetDnsDomainResponse(
                contentType,
                statusCode,
                rawResponse,
                dnsDomain);
        }
    }
}

