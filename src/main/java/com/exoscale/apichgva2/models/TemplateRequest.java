/*
 * ExoscalePublicAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.exoscale.apichgva2.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for TemplateRequest type.
 */
public class TemplateRequest {
    private Zone targetZone;

    /**
     * Default constructor.
     */
    public TemplateRequest() {
    }

    /**
     * Initialization constructor.
     * @param  targetZone  Zone value for targetZone.
     */
    public TemplateRequest(
            Zone targetZone) {
        this.targetZone = targetZone;
    }

    /**
     * Getter for TargetZone.
     * Zone
     * @return Returns the Zone
     */
    @JsonGetter("target-zone")
    public Zone getTargetZone() {
        return targetZone;
    }

    /**
     * Setter for TargetZone.
     * Zone
     * @param targetZone Value for Zone
     */
    @JsonSetter("target-zone")
    public void setTargetZone(Zone targetZone) {
        this.targetZone = targetZone;
    }

    /**
     * Converts this TemplateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TemplateRequest [" + "targetZone=" + targetZone + "]";
    }

    /**
     * Builds a new {@link TemplateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TemplateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(targetZone);
        return builder;
    }

    /**
     * Class to build instances of {@link TemplateRequest}.
     */
    public static class Builder {
        private Zone targetZone;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  targetZone  Zone value for targetZone.
         */
        public Builder(Zone targetZone) {
            this.targetZone = targetZone;
        }

        /**
         * Setter for targetZone.
         * @param  targetZone  Zone value for targetZone.
         * @return Builder
         */
        public Builder targetZone(Zone targetZone) {
            this.targetZone = targetZone;
            return this;
        }

        /**
         * Builds a new {@link TemplateRequest} object using the set fields.
         * @return {@link TemplateRequest}
         */
        public TemplateRequest build() {
            return new TemplateRequest(targetZone);
        }
    }
}
