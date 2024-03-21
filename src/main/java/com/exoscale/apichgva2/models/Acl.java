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
 * This is a model class for Acl type.
 */
public class Acl {
    private List<Rule> rules;
    private String username;

    /**
     * Default constructor.
     */
    public Acl() {
    }

    /**
     * Initialization constructor.
     * @param  rules  List of Rule value for rules.
     * @param  username  String value for username.
     */
    public Acl(
            List<Rule> rules,
            String username) {
        this.rules = rules;
        this.username = username;
    }

    /**
     * Getter for Rules.
     * @return Returns the List of Rule
     */
    @JsonGetter("rules")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Rule> getRules() {
        return rules;
    }

    /**
     * Setter for Rules.
     * @param rules Value for List of Rule
     */
    @JsonSetter("rules")
    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

    /**
     * Getter for Username.
     * @return Returns the String
     */
    @JsonGetter("username")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUsername() {
        return username;
    }

    /**
     * Setter for Username.
     * @param username Value for String
     */
    @JsonSetter("username")
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Converts this Acl into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Acl [" + "rules=" + rules + ", username=" + username + "]";
    }

    /**
     * Builds a new {@link Acl.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Acl.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .rules(getRules())
                .username(getUsername());
        return builder;
    }

    /**
     * Class to build instances of {@link Acl}.
     */
    public static class Builder {
        private List<Rule> rules;
        private String username;



        /**
         * Setter for rules.
         * @param  rules  List of Rule value for rules.
         * @return Builder
         */
        public Builder rules(List<Rule> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * Setter for username.
         * @param  username  String value for username.
         * @return Builder
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        /**
         * Builds a new {@link Acl} object using the set fields.
         * @return {@link Acl}
         */
        public Acl build() {
            return new Acl(rules, username);
        }
    }
}
