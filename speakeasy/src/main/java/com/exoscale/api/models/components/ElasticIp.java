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
 * ElasticIp - Elastic IP
 */

public class ElasticIp {

    /**
     * Elastic IP ID
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    /**
     * Elastic IP address
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ip")
    private Optional<? extends String> ip;

    /**
     * Elastic IP address family
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("addressfamily")
    private Optional<? extends Addressfamily> addressfamily;

    /**
     * Elastic IP cidr
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cidr")
    private Optional<? extends String> cidr;

    /**
     * Elastic IP description
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<? extends String> description;

    /**
     * Elastic IP address healthcheck
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("healthcheck")
    private Optional<? extends ElasticIpHealthcheck> healthcheck;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("labels")
    private Optional<? extends java.util.Map<String, String>> labels;

    public ElasticIp(
            @JsonProperty("id") Optional<? extends String> id,
            @JsonProperty("ip") Optional<? extends String> ip,
            @JsonProperty("addressfamily") Optional<? extends Addressfamily> addressfamily,
            @JsonProperty("cidr") Optional<? extends String> cidr,
            @JsonProperty("description") Optional<? extends String> description,
            @JsonProperty("healthcheck") Optional<? extends ElasticIpHealthcheck> healthcheck,
            @JsonProperty("labels") Optional<? extends java.util.Map<String, String>> labels) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(ip, "ip");
        Utils.checkNotNull(addressfamily, "addressfamily");
        Utils.checkNotNull(cidr, "cidr");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(healthcheck, "healthcheck");
        Utils.checkNotNull(labels, "labels");
        this.id = id;
        this.ip = ip;
        this.addressfamily = addressfamily;
        this.cidr = cidr;
        this.description = description;
        this.healthcheck = healthcheck;
        this.labels = labels;
    }

    /**
     * Elastic IP ID
     */
    public Optional<? extends String> id() {
        return id;
    }

    /**
     * Elastic IP address
     */
    public Optional<? extends String> ip() {
        return ip;
    }

    /**
     * Elastic IP address family
     */
    public Optional<? extends Addressfamily> addressfamily() {
        return addressfamily;
    }

    /**
     * Elastic IP cidr
     */
    public Optional<? extends String> cidr() {
        return cidr;
    }

    /**
     * Elastic IP description
     */
    public Optional<? extends String> description() {
        return description;
    }

    /**
     * Elastic IP address healthcheck
     */
    public Optional<? extends ElasticIpHealthcheck> healthcheck() {
        return healthcheck;
    }

    public Optional<? extends java.util.Map<String, String>> labels() {
        return labels;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Elastic IP ID
     */
    public ElasticIp withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Elastic IP ID
     */
    public ElasticIp withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Elastic IP address
     */
    public ElasticIp withIp(String ip) {
        Utils.checkNotNull(ip, "ip");
        this.ip = Optional.ofNullable(ip);
        return this;
    }

    /**
     * Elastic IP address
     */
    public ElasticIp withIp(Optional<? extends String> ip) {
        Utils.checkNotNull(ip, "ip");
        this.ip = ip;
        return this;
    }

    /**
     * Elastic IP address family
     */
    public ElasticIp withAddressfamily(Addressfamily addressfamily) {
        Utils.checkNotNull(addressfamily, "addressfamily");
        this.addressfamily = Optional.ofNullable(addressfamily);
        return this;
    }

    /**
     * Elastic IP address family
     */
    public ElasticIp withAddressfamily(Optional<? extends Addressfamily> addressfamily) {
        Utils.checkNotNull(addressfamily, "addressfamily");
        this.addressfamily = addressfamily;
        return this;
    }

    /**
     * Elastic IP cidr
     */
    public ElasticIp withCidr(String cidr) {
        Utils.checkNotNull(cidr, "cidr");
        this.cidr = Optional.ofNullable(cidr);
        return this;
    }

    /**
     * Elastic IP cidr
     */
    public ElasticIp withCidr(Optional<? extends String> cidr) {
        Utils.checkNotNull(cidr, "cidr");
        this.cidr = cidr;
        return this;
    }

    /**
     * Elastic IP description
     */
    public ElasticIp withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * Elastic IP description
     */
    public ElasticIp withDescription(Optional<? extends String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Elastic IP address healthcheck
     */
    public ElasticIp withHealthcheck(ElasticIpHealthcheck healthcheck) {
        Utils.checkNotNull(healthcheck, "healthcheck");
        this.healthcheck = Optional.ofNullable(healthcheck);
        return this;
    }

    /**
     * Elastic IP address healthcheck
     */
    public ElasticIp withHealthcheck(Optional<? extends ElasticIpHealthcheck> healthcheck) {
        Utils.checkNotNull(healthcheck, "healthcheck");
        this.healthcheck = healthcheck;
        return this;
    }

    public ElasticIp withLabels(java.util.Map<String, String> labels) {
        Utils.checkNotNull(labels, "labels");
        this.labels = Optional.ofNullable(labels);
        return this;
    }

    public ElasticIp withLabels(Optional<? extends java.util.Map<String, String>> labels) {
        Utils.checkNotNull(labels, "labels");
        this.labels = labels;
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
        ElasticIp other = (ElasticIp) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.ip, other.ip) &&
            java.util.Objects.deepEquals(this.addressfamily, other.addressfamily) &&
            java.util.Objects.deepEquals(this.cidr, other.cidr) &&
            java.util.Objects.deepEquals(this.description, other.description) &&
            java.util.Objects.deepEquals(this.healthcheck, other.healthcheck) &&
            java.util.Objects.deepEquals(this.labels, other.labels);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            ip,
            addressfamily,
            cidr,
            description,
            healthcheck,
            labels);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ElasticIp.class,
                "id", id,
                "ip", ip,
                "addressfamily", addressfamily,
                "cidr", cidr,
                "description", description,
                "healthcheck", healthcheck,
                "labels", labels);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> id = Optional.empty();
 
        private Optional<? extends String> ip = Optional.empty();
 
        private Optional<? extends Addressfamily> addressfamily = Optional.empty();
 
        private Optional<? extends String> cidr = Optional.empty();
 
        private Optional<? extends String> description = Optional.empty();
 
        private Optional<? extends ElasticIpHealthcheck> healthcheck = Optional.empty();
 
        private Optional<? extends java.util.Map<String, String>> labels = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Elastic IP ID
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Elastic IP ID
         */
        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Elastic IP address
         */
        public Builder ip(String ip) {
            Utils.checkNotNull(ip, "ip");
            this.ip = Optional.ofNullable(ip);
            return this;
        }

        /**
         * Elastic IP address
         */
        public Builder ip(Optional<? extends String> ip) {
            Utils.checkNotNull(ip, "ip");
            this.ip = ip;
            return this;
        }

        /**
         * Elastic IP address family
         */
        public Builder addressfamily(Addressfamily addressfamily) {
            Utils.checkNotNull(addressfamily, "addressfamily");
            this.addressfamily = Optional.ofNullable(addressfamily);
            return this;
        }

        /**
         * Elastic IP address family
         */
        public Builder addressfamily(Optional<? extends Addressfamily> addressfamily) {
            Utils.checkNotNull(addressfamily, "addressfamily");
            this.addressfamily = addressfamily;
            return this;
        }

        /**
         * Elastic IP cidr
         */
        public Builder cidr(String cidr) {
            Utils.checkNotNull(cidr, "cidr");
            this.cidr = Optional.ofNullable(cidr);
            return this;
        }

        /**
         * Elastic IP cidr
         */
        public Builder cidr(Optional<? extends String> cidr) {
            Utils.checkNotNull(cidr, "cidr");
            this.cidr = cidr;
            return this;
        }

        /**
         * Elastic IP description
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        /**
         * Elastic IP description
         */
        public Builder description(Optional<? extends String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * Elastic IP address healthcheck
         */
        public Builder healthcheck(ElasticIpHealthcheck healthcheck) {
            Utils.checkNotNull(healthcheck, "healthcheck");
            this.healthcheck = Optional.ofNullable(healthcheck);
            return this;
        }

        /**
         * Elastic IP address healthcheck
         */
        public Builder healthcheck(Optional<? extends ElasticIpHealthcheck> healthcheck) {
            Utils.checkNotNull(healthcheck, "healthcheck");
            this.healthcheck = healthcheck;
            return this;
        }

        public Builder labels(java.util.Map<String, String> labels) {
            Utils.checkNotNull(labels, "labels");
            this.labels = Optional.ofNullable(labels);
            return this;
        }

        public Builder labels(Optional<? extends java.util.Map<String, String>> labels) {
            Utils.checkNotNull(labels, "labels");
            this.labels = labels;
            return this;
        }
        
        public ElasticIp build() {
            return new ElasticIp(
                id,
                ip,
                addressfamily,
                cidr,
                description,
                healthcheck,
                labels);
        }
    }
}

