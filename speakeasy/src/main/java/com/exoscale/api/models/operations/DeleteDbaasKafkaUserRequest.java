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


public class DeleteDbaasKafkaUserRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=service-name")
    private String serviceName;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=username")
    private String username;

    public DeleteDbaasKafkaUserRequest(
            String serviceName,
            String username) {
        Utils.checkNotNull(serviceName, "serviceName");
        Utils.checkNotNull(username, "username");
        this.serviceName = serviceName;
        this.username = username;
    }

    public String serviceName() {
        return serviceName;
    }

    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DeleteDbaasKafkaUserRequest withServiceName(String serviceName) {
        Utils.checkNotNull(serviceName, "serviceName");
        this.serviceName = serviceName;
        return this;
    }

    public DeleteDbaasKafkaUserRequest withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
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
        DeleteDbaasKafkaUserRequest other = (DeleteDbaasKafkaUserRequest) o;
        return 
            java.util.Objects.deepEquals(this.serviceName, other.serviceName) &&
            java.util.Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            serviceName,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteDbaasKafkaUserRequest.class,
                "serviceName", serviceName,
                "username", username);
    }
    
    public final static class Builder {
 
        private String serviceName;
 
        private String username;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder serviceName(String serviceName) {
            Utils.checkNotNull(serviceName, "serviceName");
            this.serviceName = serviceName;
            return this;
        }

        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public DeleteDbaasKafkaUserRequest build() {
            return new DeleteDbaasKafkaUserRequest(
                serviceName,
                username);
        }
    }
}

