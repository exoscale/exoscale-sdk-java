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


public class StartDbaasOpensearchMaintenanceRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=name")
    private String name;

    public StartDbaasOpensearchMaintenanceRequest(
            String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
    }

    public String name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public StartDbaasOpensearchMaintenanceRequest withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        StartDbaasOpensearchMaintenanceRequest other = (StartDbaasOpensearchMaintenanceRequest) o;
        return 
            java.util.Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(StartDbaasOpensearchMaintenanceRequest.class,
                "name", name);
    }
    
    public final static class Builder {
 
        private String name;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public StartDbaasOpensearchMaintenanceRequest build() {
            return new StartDbaasOpensearchMaintenanceRequest(
                name);
        }
    }
}

