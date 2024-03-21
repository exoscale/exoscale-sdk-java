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


public class UpdateReverseDnsInstanceRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private UpdateReverseDnsInstanceRequestBody requestBody;

    public UpdateReverseDnsInstanceRequest(
            String id,
            UpdateReverseDnsInstanceRequestBody requestBody) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(requestBody, "requestBody");
        this.id = id;
        this.requestBody = requestBody;
    }

    public String id() {
        return id;
    }

    public UpdateReverseDnsInstanceRequestBody requestBody() {
        return requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UpdateReverseDnsInstanceRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public UpdateReverseDnsInstanceRequest withRequestBody(UpdateReverseDnsInstanceRequestBody requestBody) {
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
        UpdateReverseDnsInstanceRequest other = (UpdateReverseDnsInstanceRequest) o;
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
        return Utils.toString(UpdateReverseDnsInstanceRequest.class,
                "id", id,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private String id;
 
        private UpdateReverseDnsInstanceRequestBody requestBody;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder requestBody(UpdateReverseDnsInstanceRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public UpdateReverseDnsInstanceRequest build() {
            return new UpdateReverseDnsInstanceRequest(
                id,
                requestBody);
        }
    }
}

