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


public class DeleteDbaasKafkaSchemaRegistryAclConfigRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=name")
    private String name;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=acl-id")
    private String aclId;

    public DeleteDbaasKafkaSchemaRegistryAclConfigRequest(
            String name,
            String aclId) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(aclId, "aclId");
        this.name = name;
        this.aclId = aclId;
    }

    public String name() {
        return name;
    }

    public String aclId() {
        return aclId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DeleteDbaasKafkaSchemaRegistryAclConfigRequest withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public DeleteDbaasKafkaSchemaRegistryAclConfigRequest withAclId(String aclId) {
        Utils.checkNotNull(aclId, "aclId");
        this.aclId = aclId;
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
        DeleteDbaasKafkaSchemaRegistryAclConfigRequest other = (DeleteDbaasKafkaSchemaRegistryAclConfigRequest) o;
        return 
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.aclId, other.aclId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            name,
            aclId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteDbaasKafkaSchemaRegistryAclConfigRequest.class,
                "name", name,
                "aclId", aclId);
    }
    
    public final static class Builder {
 
        private String name;
 
        private String aclId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder aclId(String aclId) {
            Utils.checkNotNull(aclId, "aclId");
            this.aclId = aclId;
            return this;
        }
        
        public DeleteDbaasKafkaSchemaRegistryAclConfigRequest build() {
            return new DeleteDbaasKafkaSchemaRegistryAclConfigRequest(
                name,
                aclId);
        }
    }
}

