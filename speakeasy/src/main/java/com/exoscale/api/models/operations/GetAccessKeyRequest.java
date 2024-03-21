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


public class GetAccessKeyRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=key")
    private String key;

    public GetAccessKeyRequest(
            String key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
    }

    public String key() {
        return key;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetAccessKeyRequest withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
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
        GetAccessKeyRequest other = (GetAccessKeyRequest) o;
        return 
            java.util.Objects.deepEquals(this.key, other.key);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            key);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAccessKeyRequest.class,
                "key", key);
    }
    
    public final static class Builder {
 
        private String key;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }
        
        public GetAccessKeyRequest build() {
            return new GetAccessKeyRequest(
                key);
        }
    }
}

