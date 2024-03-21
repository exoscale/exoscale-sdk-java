/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.exoscale.api.models.components;

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
 * DeployTarget - Deploy target
 */

public class DeployTarget {

    /**
     * Deploy Target ID
     */
    @JsonProperty("id")
    private String id;

    /**
     * Deploy Target name
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    /**
     * Deploy Target type
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends DeployTargetType> type;

    /**
     * Deploy Target description
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<? extends String> description;

    public DeployTarget(
            @JsonProperty("id") String id,
            @JsonProperty("name") Optional<? extends String> name,
            @JsonProperty("type") Optional<? extends DeployTargetType> type,
            @JsonProperty("description") Optional<? extends String> description) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(description, "description");
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
    }

    /**
     * Deploy Target ID
     */
    public String id() {
        return id;
    }

    /**
     * Deploy Target name
     */
    public Optional<? extends String> name() {
        return name;
    }

    /**
     * Deploy Target type
     */
    public Optional<? extends DeployTargetType> type() {
        return type;
    }

    /**
     * Deploy Target description
     */
    public Optional<? extends String> description() {
        return description;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Deploy Target ID
     */
    public DeployTarget withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Deploy Target name
     */
    public DeployTarget withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Deploy Target name
     */
    public DeployTarget withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Deploy Target type
     */
    public DeployTarget withType(DeployTargetType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * Deploy Target type
     */
    public DeployTarget withType(Optional<? extends DeployTargetType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Deploy Target description
     */
    public DeployTarget withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * Deploy Target description
     */
    public DeployTarget withDescription(Optional<? extends String> description) {
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
        DeployTarget other = (DeployTarget) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.type, other.type) &&
            java.util.Objects.deepEquals(this.description, other.description);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            name,
            type,
            description);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeployTarget.class,
                "id", id,
                "name", name,
                "type", type,
                "description", description);
    }
    
    public final static class Builder {
 
        private String id;
 
        private Optional<? extends String> name = Optional.empty();
 
        private Optional<? extends DeployTargetType> type = Optional.empty();
 
        private Optional<? extends String> description = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Deploy Target ID
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Deploy Target name
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * Deploy Target name
         */
        public Builder name(Optional<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Deploy Target type
         */
        public Builder type(DeployTargetType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        /**
         * Deploy Target type
         */
        public Builder type(Optional<? extends DeployTargetType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * Deploy Target description
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        /**
         * Deploy Target description
         */
        public Builder description(Optional<? extends String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }
        
        public DeployTarget build() {
            return new DeployTarget(
                id,
                name,
                type,
                description);
        }
    }
}

