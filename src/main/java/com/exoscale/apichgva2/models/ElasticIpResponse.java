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
 * This is a model class for ElasticIpResponse type.
 */
public class ElasticIpResponse {
    private List<ElasticIp> elasticIps;

    /**
     * Default constructor.
     */
    public ElasticIpResponse() {
    }

    /**
     * Initialization constructor.
     * @param  elasticIps  List of ElasticIp value for elasticIps.
     */
    public ElasticIpResponse(
            List<ElasticIp> elasticIps) {
        this.elasticIps = elasticIps;
    }

    /**
     * Getter for ElasticIps.
     * @return Returns the List of ElasticIp
     */
    @JsonGetter("elastic-ips")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ElasticIp> getElasticIps() {
        return elasticIps;
    }

    /**
     * Setter for ElasticIps.
     * @param elasticIps Value for List of ElasticIp
     */
    @JsonSetter("elastic-ips")
    public void setElasticIps(List<ElasticIp> elasticIps) {
        this.elasticIps = elasticIps;
    }

    /**
     * Converts this ElasticIpResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ElasticIpResponse [" + "elasticIps=" + elasticIps + "]";
    }

    /**
     * Builds a new {@link ElasticIpResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ElasticIpResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .elasticIps(getElasticIps());
        return builder;
    }

    /**
     * Class to build instances of {@link ElasticIpResponse}.
     */
    public static class Builder {
        private List<ElasticIp> elasticIps;



        /**
         * Setter for elasticIps.
         * @param  elasticIps  List of ElasticIp value for elasticIps.
         * @return Builder
         */
        public Builder elasticIps(List<ElasticIp> elasticIps) {
            this.elasticIps = elasticIps;
            return this;
        }

        /**
         * Builds a new {@link ElasticIpResponse} object using the set fields.
         * @return {@link ElasticIpResponse}
         */
        public ElasticIpResponse build() {
            return new ElasticIpResponse(elasticIps);
        }
    }
}
