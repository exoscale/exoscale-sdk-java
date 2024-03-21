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


public class CreateDbaasPgUpgradeCheckRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=service")
    private String service;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private CreateDbaasPgUpgradeCheckRequestBody requestBody;

    public CreateDbaasPgUpgradeCheckRequest(
            String service,
            CreateDbaasPgUpgradeCheckRequestBody requestBody) {
        Utils.checkNotNull(service, "service");
        Utils.checkNotNull(requestBody, "requestBody");
        this.service = service;
        this.requestBody = requestBody;
    }

    public String service() {
        return service;
    }

    public CreateDbaasPgUpgradeCheckRequestBody requestBody() {
        return requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateDbaasPgUpgradeCheckRequest withService(String service) {
        Utils.checkNotNull(service, "service");
        this.service = service;
        return this;
    }

    public CreateDbaasPgUpgradeCheckRequest withRequestBody(CreateDbaasPgUpgradeCheckRequestBody requestBody) {
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
        CreateDbaasPgUpgradeCheckRequest other = (CreateDbaasPgUpgradeCheckRequest) o;
        return 
            java.util.Objects.deepEquals(this.service, other.service) &&
            java.util.Objects.deepEquals(this.requestBody, other.requestBody);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            service,
            requestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateDbaasPgUpgradeCheckRequest.class,
                "service", service,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private String service;
 
        private CreateDbaasPgUpgradeCheckRequestBody requestBody;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder service(String service) {
            Utils.checkNotNull(service, "service");
            this.service = service;
            return this;
        }

        public Builder requestBody(CreateDbaasPgUpgradeCheckRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public CreateDbaasPgUpgradeCheckRequest build() {
            return new CreateDbaasPgUpgradeCheckRequest(
                service,
                requestBody);
        }
    }
}

