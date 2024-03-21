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


public class UpdatePrivateNetworkInstanceIpInstance {

    /**
     * Instance ID
     */
    @JsonProperty("id")
    private String id;

    public UpdatePrivateNetworkInstanceIpInstance(
            @JsonProperty("id") String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
    }

    /**
     * Instance ID
     */
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Instance ID
     */
    public UpdatePrivateNetworkInstanceIpInstance withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
        UpdatePrivateNetworkInstanceIpInstance other = (UpdatePrivateNetworkInstanceIpInstance) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdatePrivateNetworkInstanceIpInstance.class,
                "id", id);
    }
    
    public final static class Builder {
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Instance ID
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public UpdatePrivateNetworkInstanceIpInstance build() {
            return new UpdatePrivateNetworkInstanceIpInstance(
                id);
        }
    }
}

