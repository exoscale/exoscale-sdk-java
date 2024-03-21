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


public class AddServiceToLoadBalancerRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private AddServiceToLoadBalancerRequestBody requestBody;

    public AddServiceToLoadBalancerRequest(
            String id,
            AddServiceToLoadBalancerRequestBody requestBody) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(requestBody, "requestBody");
        this.id = id;
        this.requestBody = requestBody;
    }

    public String id() {
        return id;
    }

    public AddServiceToLoadBalancerRequestBody requestBody() {
        return requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AddServiceToLoadBalancerRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public AddServiceToLoadBalancerRequest withRequestBody(AddServiceToLoadBalancerRequestBody requestBody) {
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
        AddServiceToLoadBalancerRequest other = (AddServiceToLoadBalancerRequest) o;
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
        return Utils.toString(AddServiceToLoadBalancerRequest.class,
                "id", id,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private String id;
 
        private AddServiceToLoadBalancerRequestBody requestBody;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder requestBody(AddServiceToLoadBalancerRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public AddServiceToLoadBalancerRequest build() {
            return new AddServiceToLoadBalancerRequest(
                id,
                requestBody);
        }
    }
}

