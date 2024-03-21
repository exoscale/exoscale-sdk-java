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


public class CopyTemplateRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private CopyTemplateRequestBody requestBody;

    public CopyTemplateRequest(
            String id,
            CopyTemplateRequestBody requestBody) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(requestBody, "requestBody");
        this.id = id;
        this.requestBody = requestBody;
    }

    public String id() {
        return id;
    }

    public CopyTemplateRequestBody requestBody() {
        return requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CopyTemplateRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public CopyTemplateRequest withRequestBody(CopyTemplateRequestBody requestBody) {
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
        CopyTemplateRequest other = (CopyTemplateRequest) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.requestBody, other.requestBody);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            requestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CopyTemplateRequest.class,
                "id", id,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private String id;
 
        private CopyTemplateRequestBody requestBody;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder requestBody(CopyTemplateRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public CopyTemplateRequest build() {
            return new CopyTemplateRequest(
                id,
                requestBody);
        }
    }
}

