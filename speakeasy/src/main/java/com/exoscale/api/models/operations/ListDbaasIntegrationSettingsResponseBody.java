/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.exoscale.api.models.operations;

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
 * ListDbaasIntegrationSettingsResponseBody - 200
 */

public class ListDbaasIntegrationSettingsResponseBody {

    /**
     * The JSON schema representing the settings for the given integration type, source, and destination service types.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("settings")
    private Optional<? extends ListDbaasIntegrationSettingsSettings> settings;

    public ListDbaasIntegrationSettingsResponseBody(
            @JsonProperty("settings") Optional<? extends ListDbaasIntegrationSettingsSettings> settings) {
        Utils.checkNotNull(settings, "settings");
        this.settings = settings;
    }

    /**
     * The JSON schema representing the settings for the given integration type, source, and destination service types.
     */
    public Optional<? extends ListDbaasIntegrationSettingsSettings> settings() {
        return settings;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The JSON schema representing the settings for the given integration type, source, and destination service types.
     */
    public ListDbaasIntegrationSettingsResponseBody withSettings(ListDbaasIntegrationSettingsSettings settings) {
        Utils.checkNotNull(settings, "settings");
        this.settings = Optional.ofNullable(settings);
        return this;
    }

    /**
     * The JSON schema representing the settings for the given integration type, source, and destination service types.
     */
    public ListDbaasIntegrationSettingsResponseBody withSettings(Optional<? extends ListDbaasIntegrationSettingsSettings> settings) {
        Utils.checkNotNull(settings, "settings");
        this.settings = settings;
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
        ListDbaasIntegrationSettingsResponseBody other = (ListDbaasIntegrationSettingsResponseBody) o;
        return 
            java.util.Objects.deepEquals(this.settings, other.settings);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            settings);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListDbaasIntegrationSettingsResponseBody.class,
                "settings", settings);
    }
    
    public final static class Builder {
 
        private Optional<? extends ListDbaasIntegrationSettingsSettings> settings = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The JSON schema representing the settings for the given integration type, source, and destination service types.
         */
        public Builder settings(ListDbaasIntegrationSettingsSettings settings) {
            Utils.checkNotNull(settings, "settings");
            this.settings = Optional.ofNullable(settings);
            return this;
        }

        /**
         * The JSON schema representing the settings for the given integration type, source, and destination service types.
         */
        public Builder settings(Optional<? extends ListDbaasIntegrationSettingsSettings> settings) {
            Utils.checkNotNull(settings, "settings");
            this.settings = settings;
            return this;
        }
        
        public ListDbaasIntegrationSettingsResponseBody build() {
            return new ListDbaasIntegrationSettingsResponseBody(
                settings);
        }
    }
}

