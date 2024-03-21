/*
 * ExoscalePublicAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.exoscale.apichgva2.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for DbaasKafkaAcls type.
 */
public class DbaasKafkaAcls {
    private List<DbaasKafkaTopicAclEntry> topicAcl;
    private List<DbaasKafkaSchemaRegistryAclEntry> schemaRegistryAcl;

    /**
     * Default constructor.
     */
    public DbaasKafkaAcls() {
    }

    /**
     * Initialization constructor.
     * @param  topicAcl  List of DbaasKafkaTopicAclEntry value for topicAcl.
     * @param  schemaRegistryAcl  List of DbaasKafkaSchemaRegistryAclEntry value for
     *         schemaRegistryAcl.
     */
    public DbaasKafkaAcls(
            List<DbaasKafkaTopicAclEntry> topicAcl,
            List<DbaasKafkaSchemaRegistryAclEntry> schemaRegistryAcl) {
        this.topicAcl = topicAcl;
        this.schemaRegistryAcl = schemaRegistryAcl;
    }

    /**
     * Getter for TopicAcl.
     * @return Returns the List of DbaasKafkaTopicAclEntry
     */
    @JsonGetter("topic-acl")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<DbaasKafkaTopicAclEntry> getTopicAcl() {
        return topicAcl;
    }

    /**
     * Setter for TopicAcl.
     * @param topicAcl Value for List of DbaasKafkaTopicAclEntry
     */
    @JsonSetter("topic-acl")
    public void setTopicAcl(List<DbaasKafkaTopicAclEntry> topicAcl) {
        this.topicAcl = topicAcl;
    }

    /**
     * Getter for SchemaRegistryAcl.
     * @return Returns the List of DbaasKafkaSchemaRegistryAclEntry
     */
    @JsonGetter("schema-registry-acl")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<DbaasKafkaSchemaRegistryAclEntry> getSchemaRegistryAcl() {
        return schemaRegistryAcl;
    }

    /**
     * Setter for SchemaRegistryAcl.
     * @param schemaRegistryAcl Value for List of DbaasKafkaSchemaRegistryAclEntry
     */
    @JsonSetter("schema-registry-acl")
    public void setSchemaRegistryAcl(List<DbaasKafkaSchemaRegistryAclEntry> schemaRegistryAcl) {
        this.schemaRegistryAcl = schemaRegistryAcl;
    }

    /**
     * Converts this DbaasKafkaAcls into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DbaasKafkaAcls [" + "topicAcl=" + topicAcl + ", schemaRegistryAcl="
                + schemaRegistryAcl + "]";
    }

    /**
     * Builds a new {@link DbaasKafkaAcls.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DbaasKafkaAcls.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .topicAcl(getTopicAcl())
                .schemaRegistryAcl(getSchemaRegistryAcl());
        return builder;
    }

    /**
     * Class to build instances of {@link DbaasKafkaAcls}.
     */
    public static class Builder {
        private List<DbaasKafkaTopicAclEntry> topicAcl;
        private List<DbaasKafkaSchemaRegistryAclEntry> schemaRegistryAcl;



        /**
         * Setter for topicAcl.
         * @param  topicAcl  List of DbaasKafkaTopicAclEntry value for topicAcl.
         * @return Builder
         */
        public Builder topicAcl(List<DbaasKafkaTopicAclEntry> topicAcl) {
            this.topicAcl = topicAcl;
            return this;
        }

        /**
         * Setter for schemaRegistryAcl.
         * @param  schemaRegistryAcl  List of DbaasKafkaSchemaRegistryAclEntry value for
         *         schemaRegistryAcl.
         * @return Builder
         */
        public Builder schemaRegistryAcl(
                List<DbaasKafkaSchemaRegistryAclEntry> schemaRegistryAcl) {
            this.schemaRegistryAcl = schemaRegistryAcl;
            return this;
        }

        /**
         * Builds a new {@link DbaasKafkaAcls} object using the set fields.
         * @return {@link DbaasKafkaAcls}
         */
        public DbaasKafkaAcls build() {
            return new DbaasKafkaAcls(topicAcl, schemaRegistryAcl);
        }
    }
}
