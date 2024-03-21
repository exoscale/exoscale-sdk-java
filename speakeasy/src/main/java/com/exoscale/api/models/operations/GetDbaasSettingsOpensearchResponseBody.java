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
 * GetDbaasSettingsOpensearchResponseBody - 200
 */

public class GetDbaasSettingsOpensearchResponseBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("settings")
    private Optional<? extends GetDbaasSettingsOpensearchSettings> settings;

    public GetDbaasSettingsOpensearchResponseBody(
            @JsonProperty("settings") Optional<? extends GetDbaasSettingsOpensearchSettings> settings) {
        Utils.checkNotNull(settings, "settings");
        this.settings = settings;
    }

    public Optional<? extends GetDbaasSettingsOpensearchSettings> settings() {
        return settings;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetDbaasSettingsOpensearchResponseBody withSettings(GetDbaasSettingsOpensearchSettings settings) {
        Utils.checkNotNull(settings, "settings");
        this.settings = Optional.ofNullable(settings);
        return this;
    }

    public GetDbaasSettingsOpensearchResponseBody withSettings(Optional<? extends GetDbaasSettingsOpensearchSettings> settings) {
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
        GetDbaasSettingsOpensearchResponseBody other = (GetDbaasSettingsOpensearchResponseBody) o;
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
        return Utils.toString(GetDbaasSettingsOpensearchResponseBody.class,
                "settings", settings);
    }
    
    public final static class Builder {
 
        private Optional<? extends GetDbaasSettingsOpensearchSettings> settings = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder settings(GetDbaasSettingsOpensearchSettings settings) {
            Utils.checkNotNull(settings, "settings");
            this.settings = Optional.ofNullable(settings);
            return this;
        }

        public Builder settings(Optional<? extends GetDbaasSettingsOpensearchSettings> settings) {
            Utils.checkNotNull(settings, "settings");
            this.settings = settings;
            return this;
        }
        
        public GetDbaasSettingsOpensearchResponseBody build() {
            return new GetDbaasSettingsOpensearchResponseBody(
                settings);
        }
    }
}

