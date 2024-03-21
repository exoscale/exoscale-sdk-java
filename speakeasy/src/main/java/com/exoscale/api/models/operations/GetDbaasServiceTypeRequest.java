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


public class GetDbaasServiceTypeRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=service-type-name")
    private String serviceTypeName;

    public GetDbaasServiceTypeRequest(
            String serviceTypeName) {
        Utils.checkNotNull(serviceTypeName, "serviceTypeName");
        this.serviceTypeName = serviceTypeName;
    }

    public String serviceTypeName() {
        return serviceTypeName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetDbaasServiceTypeRequest withServiceTypeName(String serviceTypeName) {
        Utils.checkNotNull(serviceTypeName, "serviceTypeName");
        this.serviceTypeName = serviceTypeName;
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
        GetDbaasServiceTypeRequest other = (GetDbaasServiceTypeRequest) o;
        return 
            java.util.Objects.deepEquals(this.serviceTypeName, other.serviceTypeName);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            serviceTypeName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetDbaasServiceTypeRequest.class,
                "serviceTypeName", serviceTypeName);
    }
    
    public final static class Builder {
 
        private String serviceTypeName;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder serviceTypeName(String serviceTypeName) {
            Utils.checkNotNull(serviceTypeName, "serviceTypeName");
            this.serviceTypeName = serviceTypeName;
            return this;
        }
        
        public GetDbaasServiceTypeRequest build() {
            return new GetDbaasServiceTypeRequest(
                serviceTypeName);
        }
    }
}

