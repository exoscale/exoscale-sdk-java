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
 * ListAntiAffinityGroupsResponseBody - 200
 */

public class ListAntiAffinityGroupsResponseBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("anti-affinity-groups")
    private Optional<? extends java.util.List<com.exoscale.api.models.components.AntiAffinityGroupOutput>> antiAffinityGroups;

    public ListAntiAffinityGroupsResponseBody(
            @JsonProperty("anti-affinity-groups") Optional<? extends java.util.List<com.exoscale.api.models.components.AntiAffinityGroupOutput>> antiAffinityGroups) {
        Utils.checkNotNull(antiAffinityGroups, "antiAffinityGroups");
        this.antiAffinityGroups = antiAffinityGroups;
    }

    public Optional<? extends java.util.List<com.exoscale.api.models.components.AntiAffinityGroupOutput>> antiAffinityGroups() {
        return antiAffinityGroups;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ListAntiAffinityGroupsResponseBody withAntiAffinityGroups(java.util.List<com.exoscale.api.models.components.AntiAffinityGroupOutput> antiAffinityGroups) {
        Utils.checkNotNull(antiAffinityGroups, "antiAffinityGroups");
        this.antiAffinityGroups = Optional.ofNullable(antiAffinityGroups);
        return this;
    }

    public ListAntiAffinityGroupsResponseBody withAntiAffinityGroups(Optional<? extends java.util.List<com.exoscale.api.models.components.AntiAffinityGroupOutput>> antiAffinityGroups) {
        Utils.checkNotNull(antiAffinityGroups, "antiAffinityGroups");
        this.antiAffinityGroups = antiAffinityGroups;
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
        ListAntiAffinityGroupsResponseBody other = (ListAntiAffinityGroupsResponseBody) o;
        return 
            java.util.Objects.deepEquals(this.antiAffinityGroups, other.antiAffinityGroups);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            antiAffinityGroups);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListAntiAffinityGroupsResponseBody.class,
                "antiAffinityGroups", antiAffinityGroups);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<com.exoscale.api.models.components.AntiAffinityGroupOutput>> antiAffinityGroups = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder antiAffinityGroups(java.util.List<com.exoscale.api.models.components.AntiAffinityGroupOutput> antiAffinityGroups) {
            Utils.checkNotNull(antiAffinityGroups, "antiAffinityGroups");
            this.antiAffinityGroups = Optional.ofNullable(antiAffinityGroups);
            return this;
        }

        public Builder antiAffinityGroups(Optional<? extends java.util.List<com.exoscale.api.models.components.AntiAffinityGroupOutput>> antiAffinityGroups) {
            Utils.checkNotNull(antiAffinityGroups, "antiAffinityGroups");
            this.antiAffinityGroups = antiAffinityGroups;
            return this;
        }
        
        public ListAntiAffinityGroupsResponseBody build() {
            return new ListAntiAffinityGroupsResponseBody(
                antiAffinityGroups);
        }
    }
}

