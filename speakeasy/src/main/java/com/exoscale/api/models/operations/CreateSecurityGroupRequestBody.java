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


public class CreateSecurityGroupRequestBody {

    /**
     * Security Group name
     */
    @JsonProperty("name")
    private String name;

    /**
     * Security Group description
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<? extends String> description;

    public CreateSecurityGroupRequestBody(
            @JsonProperty("name") String name,
            @JsonProperty("description") Optional<? extends String> description) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(description, "description");
        this.name = name;
        this.description = description;
    }

    /**
     * Security Group name
     */
    public String name() {
        return name;
    }

    /**
     * Security Group description
     */
    public Optional<? extends String> description() {
        return description;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Security Group name
     */
    public CreateSecurityGroupRequestBody withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Security Group description
     */
    public CreateSecurityGroupRequestBody withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * Security Group description
     */
    public CreateSecurityGroupRequestBody withDescription(Optional<? extends String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
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
        CreateSecurityGroupRequestBody other = (CreateSecurityGroupRequestBody) o;
        return 
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.description, other.description);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            name,
            description);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateSecurityGroupRequestBody.class,
                "name", name,
                "description", description);
    }
    
    public final static class Builder {
 
        private String name;
 
        private Optional<? extends String> description = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Security Group name
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Security Group description
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        /**
         * Security Group description
         */
        public Builder description(Optional<? extends String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }
        
        public CreateSecurityGroupRequestBody build() {
            return new CreateSecurityGroupRequestBody(
                name,
                description);
        }
    }
}

