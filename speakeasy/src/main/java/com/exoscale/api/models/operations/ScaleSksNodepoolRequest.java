/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.exoscale.api.models.operations;

import com.exoscale.api.utils.SpeakeasyMetadata;
import com.exoscale.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class ScaleSksNodepoolRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=sks-nodepool-id")
    private String sksNodepoolId;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private ScaleSksNodepoolRequestBody requestBody;

    public ScaleSksNodepoolRequest(
            String id,
            String sksNodepoolId,
            ScaleSksNodepoolRequestBody requestBody) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(sksNodepoolId, "sksNodepoolId");
        Utils.checkNotNull(requestBody, "requestBody");
        this.id = id;
        this.sksNodepoolId = sksNodepoolId;
        this.requestBody = requestBody;
    }

    public String id() {
        return id;
    }

    public String sksNodepoolId() {
        return sksNodepoolId;
    }

    public ScaleSksNodepoolRequestBody requestBody() {
        return requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ScaleSksNodepoolRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public ScaleSksNodepoolRequest withSksNodepoolId(String sksNodepoolId) {
        Utils.checkNotNull(sksNodepoolId, "sksNodepoolId");
        this.sksNodepoolId = sksNodepoolId;
        return this;
    }

    public ScaleSksNodepoolRequest withRequestBody(ScaleSksNodepoolRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
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
        ScaleSksNodepoolRequest other = (ScaleSksNodepoolRequest) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.sksNodepoolId, other.sksNodepoolId) &&
            java.util.Objects.deepEquals(this.requestBody, other.requestBody);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            sksNodepoolId,
            requestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ScaleSksNodepoolRequest.class,
                "id", id,
                "sksNodepoolId", sksNodepoolId,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private String id;
 
        private String sksNodepoolId;
 
        private ScaleSksNodepoolRequestBody requestBody;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder sksNodepoolId(String sksNodepoolId) {
            Utils.checkNotNull(sksNodepoolId, "sksNodepoolId");
            this.sksNodepoolId = sksNodepoolId;
            return this;
        }

        public Builder requestBody(ScaleSksNodepoolRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public ScaleSksNodepoolRequest build() {
            return new ScaleSksNodepoolRequest(
                id,
                sksNodepoolId,
                requestBody);
        }
    }
}

