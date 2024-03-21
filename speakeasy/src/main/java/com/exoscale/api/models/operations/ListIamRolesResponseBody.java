/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.exoscale.api.models.operations;

import com.exoscale.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

/**
 * ListIamRolesResponseBody - 200
 */

public class ListIamRolesResponseBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("iam-roles")
    private Optional<? extends java.util.List<com.exoscale.api.models.components.IamRole>> iamRoles;

    public ListIamRolesResponseBody(
            @JsonProperty("iam-roles") Optional<? extends java.util.List<com.exoscale.api.models.components.IamRole>> iamRoles) {
        Utils.checkNotNull(iamRoles, "iamRoles");
        this.iamRoles = iamRoles;
    }

    public Optional<? extends java.util.List<com.exoscale.api.models.components.IamRole>> iamRoles() {
        return iamRoles;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ListIamRolesResponseBody withIamRoles(java.util.List<com.exoscale.api.models.components.IamRole> iamRoles) {
        Utils.checkNotNull(iamRoles, "iamRoles");
        this.iamRoles = Optional.ofNullable(iamRoles);
        return this;
    }

    public ListIamRolesResponseBody withIamRoles(Optional<? extends java.util.List<com.exoscale.api.models.components.IamRole>> iamRoles) {
        Utils.checkNotNull(iamRoles, "iamRoles");
        this.iamRoles = iamRoles;
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
        ListIamRolesResponseBody other = (ListIamRolesResponseBody) o;
        return 
            java.util.Objects.deepEquals(this.iamRoles, other.iamRoles);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            iamRoles);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListIamRolesResponseBody.class,
                "iamRoles", iamRoles);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<com.exoscale.api.models.components.IamRole>> iamRoles = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder iamRoles(java.util.List<com.exoscale.api.models.components.IamRole> iamRoles) {
            Utils.checkNotNull(iamRoles, "iamRoles");
            this.iamRoles = Optional.ofNullable(iamRoles);
            return this;
        }

        public Builder iamRoles(Optional<? extends java.util.List<com.exoscale.api.models.components.IamRole>> iamRoles) {
            Utils.checkNotNull(iamRoles, "iamRoles");
            this.iamRoles = iamRoles;
            return this;
        }
        
        public ListIamRolesResponseBody build() {
            return new ListIamRolesResponseBody(
                iamRoles);
        }
    }
}

