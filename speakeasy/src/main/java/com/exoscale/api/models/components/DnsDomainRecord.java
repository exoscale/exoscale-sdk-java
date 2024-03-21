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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;

/**
 * DnsDomainRecord - DNS domain record
 */

public class DnsDomainRecord {

    /**
     * DNS domain record ID
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    /**
     * DNS domain record priority
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("priority")
    private Optional<? extends Long> priority;

    /**
     * DNS domain record content
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("content")
    private Optional<? extends String> content;

    /**
     * DNS domain record type
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends DnsDomainRecordType> type;

    /**
     * DNS domain record TTL
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ttl")
    private Optional<? extends Long> ttl;

    /**
     * DNS domain record name
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    /**
     * DNS domain record creation date
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("created-at")
    private Optional<? extends OffsetDateTime> createdAt;

    /**
     * DNS domain record update date
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated-at")
    private Optional<? extends OffsetDateTime> updatedAt;

    public DnsDomainRecord(
            @JsonProperty("id") Optional<? extends String> id,
            @JsonProperty("priority") Optional<? extends Long> priority,
            @JsonProperty("content") Optional<? extends String> content,
            @JsonProperty("type") Optional<? extends DnsDomainRecordType> type,
            @JsonProperty("ttl") Optional<? extends Long> ttl,
            @JsonProperty("name") Optional<? extends String> name,
            @JsonProperty("created-at") Optional<? extends OffsetDateTime> createdAt,
            @JsonProperty("updated-at") Optional<? extends OffsetDateTime> updatedAt) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(priority, "priority");
        Utils.checkNotNull(content, "content");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(ttl, "ttl");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.id = id;
        this.priority = priority;
        this.content = content;
        this.type = type;
        this.ttl = ttl;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * DNS domain record ID
     */
    public Optional<? extends String> id() {
        return id;
    }

    /**
     * DNS domain record priority
     */
    public Optional<? extends Long> priority() {
        return priority;
    }

    /**
     * DNS domain record content
     */
    public Optional<? extends String> content() {
        return content;
    }

    /**
     * DNS domain record type
     */
    public Optional<? extends DnsDomainRecordType> type() {
        return type;
    }

    /**
     * DNS domain record TTL
     */
    public Optional<? extends Long> ttl() {
        return ttl;
    }

    /**
     * DNS domain record name
     */
    public Optional<? extends String> name() {
        return name;
    }

    /**
     * DNS domain record creation date
     */
    public Optional<? extends OffsetDateTime> createdAt() {
        return createdAt;
    }

    /**
     * DNS domain record update date
     */
    public Optional<? extends OffsetDateTime> updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * DNS domain record ID
     */
    public DnsDomainRecord withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * DNS domain record ID
     */
    public DnsDomainRecord withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * DNS domain record priority
     */
    public DnsDomainRecord withPriority(long priority) {
        Utils.checkNotNull(priority, "priority");
        this.priority = Optional.ofNullable(priority);
        return this;
    }

    /**
     * DNS domain record priority
     */
    public DnsDomainRecord withPriority(Optional<? extends Long> priority) {
        Utils.checkNotNull(priority, "priority");
        this.priority = priority;
        return this;
    }

    /**
     * DNS domain record content
     */
    public DnsDomainRecord withContent(String content) {
        Utils.checkNotNull(content, "content");
        this.content = Optional.ofNullable(content);
        return this;
    }

    /**
     * DNS domain record content
     */
    public DnsDomainRecord withContent(Optional<? extends String> content) {
        Utils.checkNotNull(content, "content");
        this.content = content;
        return this;
    }

    /**
     * DNS domain record type
     */
    public DnsDomainRecord withType(DnsDomainRecordType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * DNS domain record type
     */
    public DnsDomainRecord withType(Optional<? extends DnsDomainRecordType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * DNS domain record TTL
     */
    public DnsDomainRecord withTtl(long ttl) {
        Utils.checkNotNull(ttl, "ttl");
        this.ttl = Optional.ofNullable(ttl);
        return this;
    }

    /**
     * DNS domain record TTL
     */
    public DnsDomainRecord withTtl(Optional<? extends Long> ttl) {
        Utils.checkNotNull(ttl, "ttl");
        this.ttl = ttl;
        return this;
    }

    /**
     * DNS domain record name
     */
    public DnsDomainRecord withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * DNS domain record name
     */
    public DnsDomainRecord withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * DNS domain record creation date
     */
    public DnsDomainRecord withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    /**
     * DNS domain record creation date
     */
    public DnsDomainRecord withCreatedAt(Optional<? extends OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * DNS domain record update date
     */
    public DnsDomainRecord withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    /**
     * DNS domain record update date
     */
    public DnsDomainRecord withUpdatedAt(Optional<? extends OffsetDateTime> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
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
        DnsDomainRecord other = (DnsDomainRecord) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.priority, other.priority) &&
            java.util.Objects.deepEquals(this.content, other.content) &&
            java.util.Objects.deepEquals(this.type, other.type) &&
            java.util.Objects.deepEquals(this.ttl, other.ttl) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            priority,
            content,
            type,
            ttl,
            name,
            createdAt,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DnsDomainRecord.class,
                "id", id,
                "priority", priority,
                "content", content,
                "type", type,
                "ttl", ttl,
                "name", name,
                "createdAt", createdAt,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> id = Optional.empty();
 
        private Optional<? extends Long> priority = Optional.empty();
 
        private Optional<? extends String> content = Optional.empty();
 
        private Optional<? extends DnsDomainRecordType> type = Optional.empty();
 
        private Optional<? extends Long> ttl = Optional.empty();
 
        private Optional<? extends String> name = Optional.empty();
 
        private Optional<? extends OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<? extends OffsetDateTime> updatedAt = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * DNS domain record ID
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * DNS domain record ID
         */
        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * DNS domain record priority
         */
        public Builder priority(long priority) {
            Utils.checkNotNull(priority, "priority");
            this.priority = Optional.ofNullable(priority);
            return this;
        }

        /**
         * DNS domain record priority
         */
        public Builder priority(Optional<? extends Long> priority) {
            Utils.checkNotNull(priority, "priority");
            this.priority = priority;
            return this;
        }

        /**
         * DNS domain record content
         */
        public Builder content(String content) {
            Utils.checkNotNull(content, "content");
            this.content = Optional.ofNullable(content);
            return this;
        }

        /**
         * DNS domain record content
         */
        public Builder content(Optional<? extends String> content) {
            Utils.checkNotNull(content, "content");
            this.content = content;
            return this;
        }

        /**
         * DNS domain record type
         */
        public Builder type(DnsDomainRecordType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        /**
         * DNS domain record type
         */
        public Builder type(Optional<? extends DnsDomainRecordType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * DNS domain record TTL
         */
        public Builder ttl(long ttl) {
            Utils.checkNotNull(ttl, "ttl");
            this.ttl = Optional.ofNullable(ttl);
            return this;
        }

        /**
         * DNS domain record TTL
         */
        public Builder ttl(Optional<? extends Long> ttl) {
            Utils.checkNotNull(ttl, "ttl");
            this.ttl = ttl;
            return this;
        }

        /**
         * DNS domain record name
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * DNS domain record name
         */
        public Builder name(Optional<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * DNS domain record creation date
         */
        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        /**
         * DNS domain record creation date
         */
        public Builder createdAt(Optional<? extends OffsetDateTime> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        /**
         * DNS domain record update date
         */
        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = Optional.ofNullable(updatedAt);
            return this;
        }

        /**
         * DNS domain record update date
         */
        public Builder updatedAt(Optional<? extends OffsetDateTime> updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }
        
        public DnsDomainRecord build() {
            return new DnsDomainRecord(
                id,
                priority,
                content,
                type,
                ttl,
                name,
                createdAt,
                updatedAt);
        }
    }
}

