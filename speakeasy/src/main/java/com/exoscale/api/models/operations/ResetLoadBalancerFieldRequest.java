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


public class ResetLoadBalancerFieldRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=field")
    private PathParamField field;

    public ResetLoadBalancerFieldRequest(
            String id,
            PathParamField field) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(field, "field");
        this.id = id;
        this.field = field;
    }

    public String id() {
        return id;
    }

    public PathParamField field() {
        return field;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ResetLoadBalancerFieldRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public ResetLoadBalancerFieldRequest withField(PathParamField field) {
        Utils.checkNotNull(field, "field");
        this.field = field;
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
        ResetLoadBalancerFieldRequest other = (ResetLoadBalancerFieldRequest) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.field, other.field);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            field);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ResetLoadBalancerFieldRequest.class,
                "id", id,
                "field", field);
    }
    
    public final static class Builder {
 
        private String id;
 
        private PathParamField field;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder field(PathParamField field) {
            Utils.checkNotNull(field, "field");
            this.field = field;
            return this;
        }
        
        public ResetLoadBalancerFieldRequest build() {
            return new ResetLoadBalancerFieldRequest(
                id,
                field);
        }
    }
}

