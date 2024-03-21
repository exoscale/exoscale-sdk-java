/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.exoscale.api.models.operations;

import com.exoscale.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class ScaleInstanceRequestBody {

    /**
     * Compute instance type
     */
    @JsonProperty("instance-type")
    private com.exoscale.api.models.components.InstanceTypeInput instanceType;

    public ScaleInstanceRequestBody(
            @JsonProperty("instance-type") com.exoscale.api.models.components.InstanceTypeInput instanceType) {
        Utils.checkNotNull(instanceType, "instanceType");
        this.instanceType = instanceType;
    }

    /**
     * Compute instance type
     */
    public com.exoscale.api.models.components.InstanceTypeInput instanceType() {
        return instanceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Compute instance type
     */
    public ScaleInstanceRequestBody withInstanceType(com.exoscale.api.models.components.InstanceTypeInput instanceType) {
        Utils.checkNotNull(instanceType, "instanceType");
        this.instanceType = instanceType;
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
        ScaleInstanceRequestBody other = (ScaleInstanceRequestBody) o;
        return 
            java.util.Objects.deepEquals(this.instanceType, other.instanceType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            instanceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ScaleInstanceRequestBody.class,
                "instanceType", instanceType);
    }
    
    public final static class Builder {
 
        private com.exoscale.api.models.components.InstanceTypeInput instanceType;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Compute instance type
         */
        public Builder instanceType(com.exoscale.api.models.components.InstanceTypeInput instanceType) {
            Utils.checkNotNull(instanceType, "instanceType");
            this.instanceType = instanceType;
            return this;
        }
        
        public ScaleInstanceRequestBody build() {
            return new ScaleInstanceRequestBody(
                instanceType);
        }
    }
}

