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


public class CreateDbaasPgConnectionPoolRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=service-name")
    private String serviceName;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private CreateDbaasPgConnectionPoolRequestBody requestBody;

    public CreateDbaasPgConnectionPoolRequest(
            String serviceName,
            CreateDbaasPgConnectionPoolRequestBody requestBody) {
        Utils.checkNotNull(serviceName, "serviceName");
        Utils.checkNotNull(requestBody, "requestBody");
        this.serviceName = serviceName;
        this.requestBody = requestBody;
    }

    public String serviceName() {
        return serviceName;
    }

    public CreateDbaasPgConnectionPoolRequestBody requestBody() {
        return requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateDbaasPgConnectionPoolRequest withServiceName(String serviceName) {
        Utils.checkNotNull(serviceName, "serviceName");
        this.serviceName = serviceName;
        return this;
    }

    public CreateDbaasPgConnectionPoolRequest withRequestBody(CreateDbaasPgConnectionPoolRequestBody requestBody) {
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
        CreateDbaasPgConnectionPoolRequest other = (CreateDbaasPgConnectionPoolRequest) o;
        return 
            java.util.Objects.deepEquals(this.serviceName, other.serviceName) &&
            java.util.Objects.deepEquals(this.requestBody, other.requestBody);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            serviceName,
            requestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateDbaasPgConnectionPoolRequest.class,
                "serviceName", serviceName,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private String serviceName;
 
        private CreateDbaasPgConnectionPoolRequestBody requestBody;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder serviceName(String serviceName) {
            Utils.checkNotNull(serviceName, "serviceName");
            this.serviceName = serviceName;
            return this;
        }

        public Builder requestBody(CreateDbaasPgConnectionPoolRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public CreateDbaasPgConnectionPoolRequest build() {
            return new CreateDbaasPgConnectionPoolRequest(
                serviceName,
                requestBody);
        }
    }
}

