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
 * GetDbaasSettingsKafkaResponseBody - 200
 */

public class GetDbaasSettingsKafkaResponseBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("settings")
    private Optional<? extends GetDbaasSettingsKafkaSettings> settings;

    public GetDbaasSettingsKafkaResponseBody(
            @JsonProperty("settings") Optional<? extends GetDbaasSettingsKafkaSettings> settings) {
        Utils.checkNotNull(settings, "settings");
        this.settings = settings;
    }

    public Optional<? extends GetDbaasSettingsKafkaSettings> settings() {
        return settings;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetDbaasSettingsKafkaResponseBody withSettings(GetDbaasSettingsKafkaSettings settings) {
        Utils.checkNotNull(settings, "settings");
        this.settings = Optional.ofNullable(settings);
        return this;
    }

    public GetDbaasSettingsKafkaResponseBody withSettings(Optional<? extends GetDbaasSettingsKafkaSettings> settings) {
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
        GetDbaasSettingsKafkaResponseBody other = (GetDbaasSettingsKafkaResponseBody) o;
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
        return Utils.toString(GetDbaasSettingsKafkaResponseBody.class,
                "settings", settings);
    }
    
    public final static class Builder {
 
        private Optional<? extends GetDbaasSettingsKafkaSettings> settings = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder settings(GetDbaasSettingsKafkaSettings settings) {
            Utils.checkNotNull(settings, "settings");
            this.settings = Optional.ofNullable(settings);
            return this;
        }

        public Builder settings(Optional<? extends GetDbaasSettingsKafkaSettings> settings) {
            Utils.checkNotNull(settings, "settings");
            this.settings = settings;
            return this;
        }
        
        public GetDbaasSettingsKafkaResponseBody build() {
            return new GetDbaasSettingsKafkaResponseBody(
                settings);
        }
    }
}

