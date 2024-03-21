/*
 * ExoscalePublicAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.exoscale.apichgva2.models;

import com.exoscale.apichgva2.DateTimeHelper;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * This is a model class for DnsDomainRecord type.
 */
public class DnsDomainRecord {
    private UUID id;
    private Long priority;
    private String content;
    private Type5Enum type;
    private Long ttl;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    /**
     * Default constructor.
     */
    public DnsDomainRecord() {
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  priority  Long value for priority.
     * @param  content  String value for content.
     * @param  type  Type5Enum value for type.
     * @param  ttl  Long value for ttl.
     * @param  name  String value for name.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     */
    public DnsDomainRecord(
            UUID id,
            Long priority,
            String content,
            Type5Enum type,
            Long ttl,
            String name,
            LocalDateTime createdAt,
            LocalDateTime updatedAt) {
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
     * Getter for Id.
     * DNS domain record ID
     * @return Returns the UUID
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getId() {
        return id;
    }

    /**
     * Setter for Id.
     * DNS domain record ID
     * @param id Value for UUID
     */
    @JsonSetter("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Getter for Priority.
     * DNS domain record priority
     * @return Returns the Long
     */
    @JsonGetter("priority")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getPriority() {
        return priority;
    }

    /**
     * Setter for Priority.
     * DNS domain record priority
     * @param priority Value for Long
     */
    @JsonSetter("priority")
    public void setPriority(Long priority) {
        this.priority = priority;
    }

    /**
     * Getter for Content.
     * DNS domain record content
     * @return Returns the String
     */
    @JsonGetter("content")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getContent() {
        return content;
    }

    /**
     * Setter for Content.
     * DNS domain record content
     * @param content Value for String
     */
    @JsonSetter("content")
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Getter for Type.
     * DNS domain record type
     * @return Returns the Type5Enum
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Type5Enum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * DNS domain record type
     * @param type Value for Type5Enum
     */
    @JsonSetter("type")
    public void setType(Type5Enum type) {
        this.type = type;
    }

    /**
     * Getter for Ttl.
     * DNS domain record TTL
     * @return Returns the Long
     */
    @JsonGetter("ttl")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getTtl() {
        return ttl;
    }

    /**
     * Setter for Ttl.
     * DNS domain record TTL
     * @param ttl Value for Long
     */
    @JsonSetter("ttl")
    public void setTtl(Long ttl) {
        this.ttl = ttl;
    }

    /**
     * Getter for Name.
     * DNS domain record name
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * DNS domain record name
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for CreatedAt.
     * DNS domain record creation date
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created-at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * DNS domain record creation date
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created-at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * DNS domain record update date
     * @return Returns the LocalDateTime
     */
    @JsonGetter("updated-at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * DNS domain record update date
     * @param updatedAt Value for LocalDateTime
     */
    @JsonSetter("updated-at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Converts this DnsDomainRecord into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DnsDomainRecord [" + "id=" + id + ", priority=" + priority + ", content=" + content
                + ", type=" + type + ", ttl=" + ttl + ", name=" + name + ", createdAt=" + createdAt
                + ", updatedAt=" + updatedAt + "]";
    }

    /**
     * Builds a new {@link DnsDomainRecord.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DnsDomainRecord.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .priority(getPriority())
                .content(getContent())
                .type(getType())
                .ttl(getTtl())
                .name(getName())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt());
        return builder;
    }

    /**
     * Class to build instances of {@link DnsDomainRecord}.
     */
    public static class Builder {
        private UUID id;
        private Long priority;
        private String content;
        private Type5Enum type;
        private Long ttl;
        private String name;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;



        /**
         * Setter for id.
         * @param  id  UUID value for id.
         * @return Builder
         */
        public Builder id(UUID id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for priority.
         * @param  priority  Long value for priority.
         * @return Builder
         */
        public Builder priority(Long priority) {
            this.priority = priority;
            return this;
        }

        /**
         * Setter for content.
         * @param  content  String value for content.
         * @return Builder
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  Type5Enum value for type.
         * @return Builder
         */
        public Builder type(Type5Enum type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for ttl.
         * @param  ttl  Long value for ttl.
         * @return Builder
         */
        public Builder ttl(Long ttl) {
            this.ttl = ttl;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Builds a new {@link DnsDomainRecord} object using the set fields.
         * @return {@link DnsDomainRecord}
         */
        public DnsDomainRecord build() {
            return new DnsDomainRecord(id, priority, content, type, ttl, name, createdAt,
                    updatedAt);
        }
    }
}
