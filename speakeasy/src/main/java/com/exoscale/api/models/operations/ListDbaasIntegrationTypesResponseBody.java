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
 * ListDbaasIntegrationTypesResponseBody - 200
 */

public class ListDbaasIntegrationTypesResponseBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dbaas-integration-types")
    private Optional<? extends java.util.List<com.exoscale.api.models.components.DbaasIntegrationType>> dbaasIntegrationTypes;

    public ListDbaasIntegrationTypesResponseBody(
            @JsonProperty("dbaas-integration-types") Optional<? extends java.util.List<com.exoscale.api.models.components.DbaasIntegrationType>> dbaasIntegrationTypes) {
        Utils.checkNotNull(dbaasIntegrationTypes, "dbaasIntegrationTypes");
        this.dbaasIntegrationTypes = dbaasIntegrationTypes;
    }

    public Optional<? extends java.util.List<com.exoscale.api.models.components.DbaasIntegrationType>> dbaasIntegrationTypes() {
        return dbaasIntegrationTypes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ListDbaasIntegrationTypesResponseBody withDbaasIntegrationTypes(java.util.List<com.exoscale.api.models.components.DbaasIntegrationType> dbaasIntegrationTypes) {
        Utils.checkNotNull(dbaasIntegrationTypes, "dbaasIntegrationTypes");
        this.dbaasIntegrationTypes = Optional.ofNullable(dbaasIntegrationTypes);
        return this;
    }

    public ListDbaasIntegrationTypesResponseBody withDbaasIntegrationTypes(Optional<? extends java.util.List<com.exoscale.api.models.components.DbaasIntegrationType>> dbaasIntegrationTypes) {
        Utils.checkNotNull(dbaasIntegrationTypes, "dbaasIntegrationTypes");
        this.dbaasIntegrationTypes = dbaasIntegrationTypes;
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
        ListDbaasIntegrationTypesResponseBody other = (ListDbaasIntegrationTypesResponseBody) o;
        return 
            java.util.Objects.deepEquals(this.dbaasIntegrationTypes, other.dbaasIntegrationTypes);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            dbaasIntegrationTypes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListDbaasIntegrationTypesResponseBody.class,
                "dbaasIntegrationTypes", dbaasIntegrationTypes);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<com.exoscale.api.models.components.DbaasIntegrationType>> dbaasIntegrationTypes = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder dbaasIntegrationTypes(java.util.List<com.exoscale.api.models.components.DbaasIntegrationType> dbaasIntegrationTypes) {
            Utils.checkNotNull(dbaasIntegrationTypes, "dbaasIntegrationTypes");
            this.dbaasIntegrationTypes = Optional.ofNullable(dbaasIntegrationTypes);
            return this;
        }

        public Builder dbaasIntegrationTypes(Optional<? extends java.util.List<com.exoscale.api.models.components.DbaasIntegrationType>> dbaasIntegrationTypes) {
            Utils.checkNotNull(dbaasIntegrationTypes, "dbaasIntegrationTypes");
            this.dbaasIntegrationTypes = dbaasIntegrationTypes;
            return this;
        }
        
        public ListDbaasIntegrationTypesResponseBody build() {
            return new ListDbaasIntegrationTypesResponseBody(
                dbaasIntegrationTypes);
        }
    }
}

