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
import java.util.Map;

/**
 * This is a model class for IamRoleRequest1 type.
 */
public class IamRoleRequest1 {
    private String name;
    private String description;
    private List<Permission2Enum> permissions;
    private Boolean editable;
    private Map<String, String> labels;
    private IamPolicy policy;

    /**
     * Default constructor.
     */
    public IamRoleRequest1() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  description  String value for description.
     * @param  permissions  List of Permission2Enum value for permissions.
     * @param  editable  Boolean value for editable.
     * @param  labels  Map of String, value for labels.
     * @param  policy  IamPolicy value for policy.
     */
    public IamRoleRequest1(
            String name,
            String description,
            List<Permission2Enum> permissions,
            Boolean editable,
            Map<String, String> labels,
            IamPolicy policy) {
        this.name = name;
        this.description = description;
        this.permissions = permissions;
        this.editable = editable;
        this.labels = labels;
        this.policy = policy;
    }

    /**
     * Getter for Name.
     * IAM Role name
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * IAM Role name
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Description.
     * IAM Role description
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * IAM Role description
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Permissions.
     * IAM Role permissions
     * @return Returns the List of Permission2Enum
     */
    @JsonGetter("permissions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Permission2Enum> getPermissions() {
        return permissions;
    }

    /**
     * Setter for Permissions.
     * IAM Role permissions
     * @param permissions Value for List of Permission2Enum
     */
    @JsonSetter("permissions")
    public void setPermissions(List<Permission2Enum> permissions) {
        this.permissions = permissions;
    }

    /**
     * Getter for Editable.
     * Sets if the IAM Role Policy is editable or not (default: true). This setting cannot be
     * changed after creation
     * @return Returns the Boolean
     */
    @JsonGetter("editable")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEditable() {
        return editable;
    }

    /**
     * Setter for Editable.
     * Sets if the IAM Role Policy is editable or not (default: true). This setting cannot be
     * changed after creation
     * @param editable Value for Boolean
     */
    @JsonSetter("editable")
    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    /**
     * Getter for Labels.
     * @return Returns the Map of String, String
     */
    @JsonGetter("labels")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, String> getLabels() {
        return labels;
    }

    /**
     * Setter for Labels.
     * @param labels Value for Map of String, String
     */
    @JsonSetter("labels")
    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    /**
     * Getter for Policy.
     * Policy
     * @return Returns the IamPolicy
     */
    @JsonGetter("policy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IamPolicy getPolicy() {
        return policy;
    }

    /**
     * Setter for Policy.
     * Policy
     * @param policy Value for IamPolicy
     */
    @JsonSetter("policy")
    public void setPolicy(IamPolicy policy) {
        this.policy = policy;
    }

    /**
     * Converts this IamRoleRequest1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IamRoleRequest1 [" + "name=" + name + ", description=" + description
                + ", permissions=" + permissions + ", editable=" + editable + ", labels=" + labels
                + ", policy=" + policy + "]";
    }

    /**
     * Builds a new {@link IamRoleRequest1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IamRoleRequest1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name)
                .description(getDescription())
                .permissions(getPermissions())
                .editable(getEditable())
                .labels(getLabels())
                .policy(getPolicy());
        return builder;
    }

    /**
     * Class to build instances of {@link IamRoleRequest1}.
     */
    public static class Builder {
        private String name;
        private String description;
        private List<Permission2Enum> permissions;
        private Boolean editable;
        private Map<String, String> labels;
        private IamPolicy policy;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         */
        public Builder(String name) {
            this.name = name;
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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for permissions.
         * @param  permissions  List of Permission2Enum value for permissions.
         * @return Builder
         */
        public Builder permissions(List<Permission2Enum> permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * Setter for editable.
         * @param  editable  Boolean value for editable.
         * @return Builder
         */
        public Builder editable(Boolean editable) {
            this.editable = editable;
            return this;
        }

        /**
         * Setter for labels.
         * @param  labels  Map of String, value for labels.
         * @return Builder
         */
        public Builder labels(Map<String, String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Setter for policy.
         * @param  policy  IamPolicy value for policy.
         * @return Builder
         */
        public Builder policy(IamPolicy policy) {
            this.policy = policy;
            return this;
        }

        /**
         * Builds a new {@link IamRoleRequest1} object using the set fields.
         * @return {@link IamRoleRequest1}
         */
        public IamRoleRequest1 build() {
            return new IamRoleRequest1(name, description, permissions, editable, labels, policy);
        }
    }
}
