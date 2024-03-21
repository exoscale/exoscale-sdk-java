/*
 * ExoscalePublicAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.exoscale.apichgva2.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for DnsDomainRecordRequest type.
 */
public class DnsDomainRecordRequest {
    private String name;
    private Type6Enum type;
    private String content;
    private Long ttl;
    private Long priority;

    /**
     * Default constructor.
     */
    public DnsDomainRecordRequest() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  type  Type6Enum value for type.
     * @param  content  String value for content.
     * @param  ttl  Long value for ttl.
     * @param  priority  Long value for priority.
     */
    public DnsDomainRecordRequest(
            String name,
            Type6Enum type,
            String content,
            Long ttl,
            Long priority) {
        this.name = name;
        this.type = type;
        this.content = content;
        this.ttl = ttl;
        this.priority = priority;
    }

    /**
     * Getter for Name.
     * DNS domain record name
     * @return Returns the String
     */
    @JsonGetter("name")
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
     * Getter for Type.
     * DNS domain record type
     * @return Returns the Type6Enum
     */
    @JsonGetter("type")
    public Type6Enum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * DNS domain record type
     * @param type Value for Type6Enum
     */
    @JsonSetter("type")
    public void setType(Type6Enum type) {
        this.type = type;
    }

    /**
     * Getter for Content.
     * DNS domain record content
     * @return Returns the String
     */
    @JsonGetter("content")
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
     * Converts this DnsDomainRecordRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DnsDomainRecordRequest [" + "name=" + name + ", type=" + type + ", content="
                + content + ", ttl=" + ttl + ", priority=" + priority + "]";
    }

    /**
     * Builds a new {@link DnsDomainRecordRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DnsDomainRecordRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, type, content)
                .ttl(getTtl())
                .priority(getPriority());
        return builder;
    }

    /**
     * Class to build instances of {@link DnsDomainRecordRequest}.
     */
    public static class Builder {
        private String name;
        private Type6Enum type;
        private String content;
        private Long ttl;
        private Long priority;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  type  Type6Enum value for type.
         * @param  content  String value for content.
         */
        public Builder(String name, Type6Enum type, String content) {
            this.name = name;
            this.type = type;
            this.content = content;
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
         * Setter for type.
         * @param  type  Type6Enum value for type.
         * @return Builder
         */
        public Builder type(Type6Enum type) {
            this.type = type;
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
         * Setter for ttl.
         * @param  ttl  Long value for ttl.
         * @return Builder
         */
        public Builder ttl(Long ttl) {
            this.ttl = ttl;
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
         * Builds a new {@link DnsDomainRecordRequest} object using the set fields.
         * @return {@link DnsDomainRecordRequest}
         */
        public DnsDomainRecordRequest build() {
            return new DnsDomainRecordRequest(name, type, content, ttl, priority);
        }
    }
}
