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
 * This is a model class for DbaasIntegrationSettingsDestTypeResponse type.
 */
public class DbaasIntegrationSettingsDestTypeResponse {
    private Settings4 settings;

    /**
     * Default constructor.
     */
    public DbaasIntegrationSettingsDestTypeResponse() {
    }

    /**
     * Initialization constructor.
     * @param  settings  Settings4 value for settings.
     */
    public DbaasIntegrationSettingsDestTypeResponse(
            Settings4 settings) {
        this.settings = settings;
    }

    /**
     * Getter for Settings.
     * The JSON schema representing the settings for the given integration type, source, and
     * destination service types.
     * @return Returns the Settings4
     */
    @JsonGetter("settings")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Settings4 getSettings() {
        return settings;
    }

    /**
     * Setter for Settings.
     * The JSON schema representing the settings for the given integration type, source, and
     * destination service types.
     * @param settings Value for Settings4
     */
    @JsonSetter("settings")
    public void setSettings(Settings4 settings) {
        this.settings = settings;
    }

    /**
     * Converts this DbaasIntegrationSettingsDestTypeResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DbaasIntegrationSettingsDestTypeResponse [" + "settings=" + settings + "]";
    }

    /**
     * Builds a new {@link DbaasIntegrationSettingsDestTypeResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DbaasIntegrationSettingsDestTypeResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .settings(getSettings());
        return builder;
    }

    /**
     * Class to build instances of {@link DbaasIntegrationSettingsDestTypeResponse}.
     */
    public static class Builder {
        private Settings4 settings;



        /**
         * Setter for settings.
         * @param  settings  Settings4 value for settings.
         * @return Builder
         */
        public Builder settings(Settings4 settings) {
            this.settings = settings;
            return this;
        }

        /**
         * Builds a new {@link DbaasIntegrationSettingsDestTypeResponse} object using the set
         * fields.
         * @return {@link DbaasIntegrationSettingsDestTypeResponse}
         */
        public DbaasIntegrationSettingsDestTypeResponse build() {
            return new DbaasIntegrationSettingsDestTypeResponse(settings);
        }
    }
}
