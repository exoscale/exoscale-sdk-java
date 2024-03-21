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
 * This is a model class for KubeletImageGc type.
 */
public class KubeletImageGc {
    private Long highThreshold;
    private Long lowThreshold;
    private String minAge;

    /**
     * Default constructor.
     */
    public KubeletImageGc() {
    }

    /**
     * Initialization constructor.
     * @param  highThreshold  Long value for highThreshold.
     * @param  lowThreshold  Long value for lowThreshold.
     * @param  minAge  String value for minAge.
     */
    public KubeletImageGc(
            Long highThreshold,
            Long lowThreshold,
            String minAge) {
        this.highThreshold = highThreshold;
        this.lowThreshold = lowThreshold;
        this.minAge = minAge;
    }

    /**
     * Getter for HighThreshold.
     * @return Returns the Long
     */
    @JsonGetter("high-threshold")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getHighThreshold() {
        return highThreshold;
    }

    /**
     * Setter for HighThreshold.
     * @param highThreshold Value for Long
     */
    @JsonSetter("high-threshold")
    public void setHighThreshold(Long highThreshold) {
        this.highThreshold = highThreshold;
    }

    /**
     * Getter for LowThreshold.
     * @return Returns the Long
     */
    @JsonGetter("low-threshold")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getLowThreshold() {
        return lowThreshold;
    }

    /**
     * Setter for LowThreshold.
     * @param lowThreshold Value for Long
     */
    @JsonSetter("low-threshold")
    public void setLowThreshold(Long lowThreshold) {
        this.lowThreshold = lowThreshold;
    }

    /**
     * Getter for MinAge.
     * @return Returns the String
     */
    @JsonGetter("min-age")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMinAge() {
        return minAge;
    }

    /**
     * Setter for MinAge.
     * @param minAge Value for String
     */
    @JsonSetter("min-age")
    public void setMinAge(String minAge) {
        this.minAge = minAge;
    }

    /**
     * Converts this KubeletImageGc into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "KubeletImageGc [" + "highThreshold=" + highThreshold + ", lowThreshold="
                + lowThreshold + ", minAge=" + minAge + "]";
    }

    /**
     * Builds a new {@link KubeletImageGc.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link KubeletImageGc.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .highThreshold(getHighThreshold())
                .lowThreshold(getLowThreshold())
                .minAge(getMinAge());
        return builder;
    }

    /**
     * Class to build instances of {@link KubeletImageGc}.
     */
    public static class Builder {
        private Long highThreshold;
        private Long lowThreshold;
        private String minAge;



        /**
         * Setter for highThreshold.
         * @param  highThreshold  Long value for highThreshold.
         * @return Builder
         */
        public Builder highThreshold(Long highThreshold) {
            this.highThreshold = highThreshold;
            return this;
        }

        /**
         * Setter for lowThreshold.
         * @param  lowThreshold  Long value for lowThreshold.
         * @return Builder
         */
        public Builder lowThreshold(Long lowThreshold) {
            this.lowThreshold = lowThreshold;
            return this;
        }

        /**
         * Setter for minAge.
         * @param  minAge  String value for minAge.
         * @return Builder
         */
        public Builder minAge(String minAge) {
            this.minAge = minAge;
            return this;
        }

        /**
         * Builds a new {@link KubeletImageGc} object using the set fields.
         * @return {@link KubeletImageGc}
         */
        public KubeletImageGc build() {
            return new KubeletImageGc(highThreshold, lowThreshold, minAge);
        }
    }
}
