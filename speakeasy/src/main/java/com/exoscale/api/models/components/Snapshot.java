/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.exoscale.api.models.components;

import com.exoscale.api.Instance;
import com.exoscale.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;

/**
 * Snapshot - Snapshot
 */

public class Snapshot {

    /**
     * Snapshot ID
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    /**
     * Snapshot name
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    /**
     * Snapshot creation date
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created-at")
    private Optional<? extends OffsetDateTime> createdAt;

    /**
     * Snapshot state
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state")
    private Optional<? extends SnapshotState> state;

    /**
     * Snapshot size in GB
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<? extends Long> size;

    /**
     * Exported snapshot information
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("export")
    private Optional<? extends Export> export;

    /**
     * Instance
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("instance")
    private Optional<? extends Instance> instance;

    public Snapshot(
            @JsonProperty("id") Optional<? extends String> id,
            @JsonProperty("name") Optional<? extends String> name,
            @JsonProperty("created-at") Optional<? extends OffsetDateTime> createdAt,
            @JsonProperty("state") Optional<? extends SnapshotState> state,
            @JsonProperty("size") Optional<? extends Long> size,
            @JsonProperty("export") Optional<? extends Export> export,
            @JsonProperty("instance") Optional<? extends Instance> instance) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(state, "state");
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(export, "export");
        Utils.checkNotNull(instance, "instance");
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.state = state;
        this.size = size;
        this.export = export;
        this.instance = instance;
    }

    /**
     * Snapshot ID
     */
    public Optional<? extends String> id() {
        return id;
    }

    /**
     * Snapshot name
     */
    public Optional<? extends String> name() {
        return name;
    }

    /**
     * Snapshot creation date
     */
    public Optional<? extends OffsetDateTime> createdAt() {
        return createdAt;
    }

    /**
     * Snapshot state
     */
    public Optional<? extends SnapshotState> state() {
        return state;
    }

    /**
     * Snapshot size in GB
     */
    public Optional<? extends Long> size() {
        return size;
    }

    /**
     * Exported snapshot information
     */
    public Optional<? extends Export> export() {
        return export;
    }

    /**
     * Instance
     */
    public Optional<? extends Instance> instance() {
        return instance;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Snapshot ID
     */
    public Snapshot withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Snapshot ID
     */
    public Snapshot withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Snapshot name
     */
    public Snapshot withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Snapshot name
     */
    public Snapshot withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Snapshot creation date
     */
    public Snapshot withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    /**
     * Snapshot creation date
     */
    public Snapshot withCreatedAt(Optional<? extends OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Snapshot state
     */
    public Snapshot withState(SnapshotState state) {
        Utils.checkNotNull(state, "state");
        this.state = Optional.ofNullable(state);
        return this;
    }

    /**
     * Snapshot state
     */
    public Snapshot withState(Optional<? extends SnapshotState> state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }

    /**
     * Snapshot size in GB
     */
    public Snapshot withSize(long size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    /**
     * Snapshot size in GB
     */
    public Snapshot withSize(Optional<? extends Long> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    /**
     * Exported snapshot information
     */
    public Snapshot withExport(Export export) {
        Utils.checkNotNull(export, "export");
        this.export = Optional.ofNullable(export);
        return this;
    }

    /**
     * Exported snapshot information
     */
    public Snapshot withExport(Optional<? extends Export> export) {
        Utils.checkNotNull(export, "export");
        this.export = export;
        return this;
    }

    /**
     * Instance
     */
    public Snapshot withInstance(Instance instance) {
        Utils.checkNotNull(instance, "instance");
        this.instance = Optional.ofNullable(instance);
        return this;
    }

    /**
     * Instance
     */
    public Snapshot withInstance(Optional<? extends Instance> instance) {
        Utils.checkNotNull(instance, "instance");
        this.instance = instance;
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
        Snapshot other = (Snapshot) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.state, other.state) &&
            java.util.Objects.deepEquals(this.size, other.size) &&
            java.util.Objects.deepEquals(this.export, other.export) &&
            java.util.Objects.deepEquals(this.instance, other.instance);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            name,
            createdAt,
            state,
            size,
            export,
            instance);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Snapshot.class,
                "id", id,
                "name", name,
                "createdAt", createdAt,
                "state", state,
                "size", size,
                "export", export,
                "instance", instance);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> id = Optional.empty();
 
        private Optional<? extends String> name = Optional.empty();
 
        private Optional<? extends OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<? extends SnapshotState> state = Optional.empty();
 
        private Optional<? extends Long> size = Optional.empty();
 
        private Optional<? extends Export> export = Optional.empty();
 
        private Optional<? extends Instance> instance = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Snapshot ID
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Snapshot ID
         */
        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Snapshot name
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * Snapshot name
         */
        public Builder name(Optional<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Snapshot creation date
         */
        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        /**
         * Snapshot creation date
         */
        public Builder createdAt(Optional<? extends OffsetDateTime> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Snapshot state
         */
        public Builder state(SnapshotState state) {
            Utils.checkNotNull(state, "state");
            this.state = Optional.ofNullable(state);
            return this;
        }

        /**
         * Snapshot state
         */
        public Builder state(Optional<? extends SnapshotState> state) {
            Utils.checkNotNull(state, "state");
            this.state = state;
            return this;
        }

        /**
         * Snapshot size in GB
         */
        public Builder size(long size) {
            Utils.checkNotNull(size, "size");
            this.size = Optional.ofNullable(size);
            return this;
        }

        /**
         * Snapshot size in GB
         */
        public Builder size(Optional<? extends Long> size) {
            Utils.checkNotNull(size, "size");
            this.size = size;
            return this;
        }

        /**
         * Exported snapshot information
         */
        public Builder export(Export export) {
            Utils.checkNotNull(export, "export");
            this.export = Optional.ofNullable(export);
            return this;
        }

        /**
         * Exported snapshot information
         */
        public Builder export(Optional<? extends Export> export) {
            Utils.checkNotNull(export, "export");
            this.export = export;
            return this;
        }

        /**
         * Instance
         */
        public Builder instance(Instance instance) {
            Utils.checkNotNull(instance, "instance");
            this.instance = Optional.ofNullable(instance);
            return this;
        }

        /**
         * Instance
         */
        public Builder instance(Optional<? extends Instance> instance) {
            Utils.checkNotNull(instance, "instance");
            this.instance = instance;
            return this;
        }
        
        public Snapshot build() {
            return new Snapshot(
                id,
                name,
                createdAt,
                state,
                size,
                export,
                instance);
        }
    }
}

