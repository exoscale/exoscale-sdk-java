/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.exoscale.api.models.components;

import com.exoscale.api.utils.LazySingletonValue;
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
import org.openapitools.jackson.nullable.JsonNullable;


public class OpensearchISMHistorySettings {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ism_enabled")
    private JsonNullable<? extends Boolean> ismEnabled;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ism_history_enabled")
    private JsonNullable<? extends Boolean> ismHistoryEnabled;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ism_history_max_age")
    private JsonNullable<? extends Long> ismHistoryMaxAge;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ism_history_max_docs")
    private JsonNullable<? extends Long> ismHistoryMaxDocs;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ism_history_rollover_check_period")
    private JsonNullable<? extends Long> ismHistoryRolloverCheckPeriod;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ism_history_rollover_retention_period")
    private JsonNullable<? extends Long> ismHistoryRolloverRetentionPeriod;

    public OpensearchISMHistorySettings(
            @JsonProperty("ism_enabled") JsonNullable<? extends Boolean> ismEnabled,
            @JsonProperty("ism_history_enabled") JsonNullable<? extends Boolean> ismHistoryEnabled,
            @JsonProperty("ism_history_max_age") JsonNullable<? extends Long> ismHistoryMaxAge,
            @JsonProperty("ism_history_max_docs") JsonNullable<? extends Long> ismHistoryMaxDocs,
            @JsonProperty("ism_history_rollover_check_period") JsonNullable<? extends Long> ismHistoryRolloverCheckPeriod,
            @JsonProperty("ism_history_rollover_retention_period") JsonNullable<? extends Long> ismHistoryRolloverRetentionPeriod) {
        Utils.checkNotNull(ismEnabled, "ismEnabled");
        Utils.checkNotNull(ismHistoryEnabled, "ismHistoryEnabled");
        Utils.checkNotNull(ismHistoryMaxAge, "ismHistoryMaxAge");
        Utils.checkNotNull(ismHistoryMaxDocs, "ismHistoryMaxDocs");
        Utils.checkNotNull(ismHistoryRolloverCheckPeriod, "ismHistoryRolloverCheckPeriod");
        Utils.checkNotNull(ismHistoryRolloverRetentionPeriod, "ismHistoryRolloverRetentionPeriod");
        this.ismEnabled = ismEnabled;
        this.ismHistoryEnabled = ismHistoryEnabled;
        this.ismHistoryMaxAge = ismHistoryMaxAge;
        this.ismHistoryMaxDocs = ismHistoryMaxDocs;
        this.ismHistoryRolloverCheckPeriod = ismHistoryRolloverCheckPeriod;
        this.ismHistoryRolloverRetentionPeriod = ismHistoryRolloverRetentionPeriod;
    }

    public JsonNullable<? extends Boolean> ismEnabled() {
        return ismEnabled;
    }

    public JsonNullable<? extends Boolean> ismHistoryEnabled() {
        return ismHistoryEnabled;
    }

    public JsonNullable<? extends Long> ismHistoryMaxAge() {
        return ismHistoryMaxAge;
    }

    public JsonNullable<? extends Long> ismHistoryMaxDocs() {
        return ismHistoryMaxDocs;
    }

    public JsonNullable<? extends Long> ismHistoryRolloverCheckPeriod() {
        return ismHistoryRolloverCheckPeriod;
    }

    public JsonNullable<? extends Long> ismHistoryRolloverRetentionPeriod() {
        return ismHistoryRolloverRetentionPeriod;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OpensearchISMHistorySettings withIsmEnabled(boolean ismEnabled) {
        Utils.checkNotNull(ismEnabled, "ismEnabled");
        this.ismEnabled = JsonNullable.of(ismEnabled);
        return this;
    }

    public OpensearchISMHistorySettings withIsmEnabled(JsonNullable<? extends Boolean> ismEnabled) {
        Utils.checkNotNull(ismEnabled, "ismEnabled");
        this.ismEnabled = ismEnabled;
        return this;
    }

    public OpensearchISMHistorySettings withIsmHistoryEnabled(boolean ismHistoryEnabled) {
        Utils.checkNotNull(ismHistoryEnabled, "ismHistoryEnabled");
        this.ismHistoryEnabled = JsonNullable.of(ismHistoryEnabled);
        return this;
    }

    public OpensearchISMHistorySettings withIsmHistoryEnabled(JsonNullable<? extends Boolean> ismHistoryEnabled) {
        Utils.checkNotNull(ismHistoryEnabled, "ismHistoryEnabled");
        this.ismHistoryEnabled = ismHistoryEnabled;
        return this;
    }

    public OpensearchISMHistorySettings withIsmHistoryMaxAge(long ismHistoryMaxAge) {
        Utils.checkNotNull(ismHistoryMaxAge, "ismHistoryMaxAge");
        this.ismHistoryMaxAge = JsonNullable.of(ismHistoryMaxAge);
        return this;
    }

    public OpensearchISMHistorySettings withIsmHistoryMaxAge(JsonNullable<? extends Long> ismHistoryMaxAge) {
        Utils.checkNotNull(ismHistoryMaxAge, "ismHistoryMaxAge");
        this.ismHistoryMaxAge = ismHistoryMaxAge;
        return this;
    }

    public OpensearchISMHistorySettings withIsmHistoryMaxDocs(long ismHistoryMaxDocs) {
        Utils.checkNotNull(ismHistoryMaxDocs, "ismHistoryMaxDocs");
        this.ismHistoryMaxDocs = JsonNullable.of(ismHistoryMaxDocs);
        return this;
    }

    public OpensearchISMHistorySettings withIsmHistoryMaxDocs(JsonNullable<? extends Long> ismHistoryMaxDocs) {
        Utils.checkNotNull(ismHistoryMaxDocs, "ismHistoryMaxDocs");
        this.ismHistoryMaxDocs = ismHistoryMaxDocs;
        return this;
    }

    public OpensearchISMHistorySettings withIsmHistoryRolloverCheckPeriod(long ismHistoryRolloverCheckPeriod) {
        Utils.checkNotNull(ismHistoryRolloverCheckPeriod, "ismHistoryRolloverCheckPeriod");
        this.ismHistoryRolloverCheckPeriod = JsonNullable.of(ismHistoryRolloverCheckPeriod);
        return this;
    }

    public OpensearchISMHistorySettings withIsmHistoryRolloverCheckPeriod(JsonNullable<? extends Long> ismHistoryRolloverCheckPeriod) {
        Utils.checkNotNull(ismHistoryRolloverCheckPeriod, "ismHistoryRolloverCheckPeriod");
        this.ismHistoryRolloverCheckPeriod = ismHistoryRolloverCheckPeriod;
        return this;
    }

    public OpensearchISMHistorySettings withIsmHistoryRolloverRetentionPeriod(long ismHistoryRolloverRetentionPeriod) {
        Utils.checkNotNull(ismHistoryRolloverRetentionPeriod, "ismHistoryRolloverRetentionPeriod");
        this.ismHistoryRolloverRetentionPeriod = JsonNullable.of(ismHistoryRolloverRetentionPeriod);
        return this;
    }

    public OpensearchISMHistorySettings withIsmHistoryRolloverRetentionPeriod(JsonNullable<? extends Long> ismHistoryRolloverRetentionPeriod) {
        Utils.checkNotNull(ismHistoryRolloverRetentionPeriod, "ismHistoryRolloverRetentionPeriod");
        this.ismHistoryRolloverRetentionPeriod = ismHistoryRolloverRetentionPeriod;
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
        OpensearchISMHistorySettings other = (OpensearchISMHistorySettings) o;
        return 
            java.util.Objects.deepEquals(this.ismEnabled, other.ismEnabled) &&
            java.util.Objects.deepEquals(this.ismHistoryEnabled, other.ismHistoryEnabled) &&
            java.util.Objects.deepEquals(this.ismHistoryMaxAge, other.ismHistoryMaxAge) &&
            java.util.Objects.deepEquals(this.ismHistoryMaxDocs, other.ismHistoryMaxDocs) &&
            java.util.Objects.deepEquals(this.ismHistoryRolloverCheckPeriod, other.ismHistoryRolloverCheckPeriod) &&
            java.util.Objects.deepEquals(this.ismHistoryRolloverRetentionPeriod, other.ismHistoryRolloverRetentionPeriod);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            ismEnabled,
            ismHistoryEnabled,
            ismHistoryMaxAge,
            ismHistoryMaxDocs,
            ismHistoryRolloverCheckPeriod,
            ismHistoryRolloverRetentionPeriod);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OpensearchISMHistorySettings.class,
                "ismEnabled", ismEnabled,
                "ismHistoryEnabled", ismHistoryEnabled,
                "ismHistoryMaxAge", ismHistoryMaxAge,
                "ismHistoryMaxDocs", ismHistoryMaxDocs,
                "ismHistoryRolloverCheckPeriod", ismHistoryRolloverCheckPeriod,
                "ismHistoryRolloverRetentionPeriod", ismHistoryRolloverRetentionPeriod);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends Boolean> ismEnabled;
 
        private JsonNullable<? extends Boolean> ismHistoryEnabled;
 
        private JsonNullable<? extends Long> ismHistoryMaxAge;
 
        private JsonNullable<? extends Long> ismHistoryMaxDocs;
 
        private JsonNullable<? extends Long> ismHistoryRolloverCheckPeriod;
 
        private JsonNullable<? extends Long> ismHistoryRolloverRetentionPeriod;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder ismEnabled(boolean ismEnabled) {
            Utils.checkNotNull(ismEnabled, "ismEnabled");
            this.ismEnabled = JsonNullable.of(ismEnabled);
            return this;
        }

        public Builder ismEnabled(JsonNullable<? extends Boolean> ismEnabled) {
            Utils.checkNotNull(ismEnabled, "ismEnabled");
            this.ismEnabled = ismEnabled;
            return this;
        }

        public Builder ismHistoryEnabled(boolean ismHistoryEnabled) {
            Utils.checkNotNull(ismHistoryEnabled, "ismHistoryEnabled");
            this.ismHistoryEnabled = JsonNullable.of(ismHistoryEnabled);
            return this;
        }

        public Builder ismHistoryEnabled(JsonNullable<? extends Boolean> ismHistoryEnabled) {
            Utils.checkNotNull(ismHistoryEnabled, "ismHistoryEnabled");
            this.ismHistoryEnabled = ismHistoryEnabled;
            return this;
        }

        public Builder ismHistoryMaxAge(long ismHistoryMaxAge) {
            Utils.checkNotNull(ismHistoryMaxAge, "ismHistoryMaxAge");
            this.ismHistoryMaxAge = JsonNullable.of(ismHistoryMaxAge);
            return this;
        }

        public Builder ismHistoryMaxAge(JsonNullable<? extends Long> ismHistoryMaxAge) {
            Utils.checkNotNull(ismHistoryMaxAge, "ismHistoryMaxAge");
            this.ismHistoryMaxAge = ismHistoryMaxAge;
            return this;
        }

        public Builder ismHistoryMaxDocs(long ismHistoryMaxDocs) {
            Utils.checkNotNull(ismHistoryMaxDocs, "ismHistoryMaxDocs");
            this.ismHistoryMaxDocs = JsonNullable.of(ismHistoryMaxDocs);
            return this;
        }

        public Builder ismHistoryMaxDocs(JsonNullable<? extends Long> ismHistoryMaxDocs) {
            Utils.checkNotNull(ismHistoryMaxDocs, "ismHistoryMaxDocs");
            this.ismHistoryMaxDocs = ismHistoryMaxDocs;
            return this;
        }

        public Builder ismHistoryRolloverCheckPeriod(long ismHistoryRolloverCheckPeriod) {
            Utils.checkNotNull(ismHistoryRolloverCheckPeriod, "ismHistoryRolloverCheckPeriod");
            this.ismHistoryRolloverCheckPeriod = JsonNullable.of(ismHistoryRolloverCheckPeriod);
            return this;
        }

        public Builder ismHistoryRolloverCheckPeriod(JsonNullable<? extends Long> ismHistoryRolloverCheckPeriod) {
            Utils.checkNotNull(ismHistoryRolloverCheckPeriod, "ismHistoryRolloverCheckPeriod");
            this.ismHistoryRolloverCheckPeriod = ismHistoryRolloverCheckPeriod;
            return this;
        }

        public Builder ismHistoryRolloverRetentionPeriod(long ismHistoryRolloverRetentionPeriod) {
            Utils.checkNotNull(ismHistoryRolloverRetentionPeriod, "ismHistoryRolloverRetentionPeriod");
            this.ismHistoryRolloverRetentionPeriod = JsonNullable.of(ismHistoryRolloverRetentionPeriod);
            return this;
        }

        public Builder ismHistoryRolloverRetentionPeriod(JsonNullable<? extends Long> ismHistoryRolloverRetentionPeriod) {
            Utils.checkNotNull(ismHistoryRolloverRetentionPeriod, "ismHistoryRolloverRetentionPeriod");
            this.ismHistoryRolloverRetentionPeriod = ismHistoryRolloverRetentionPeriod;
            return this;
        }
        
        public OpensearchISMHistorySettings build() {
            if (ismEnabled == null) {
                ismEnabled = _SINGLETON_VALUE_IsmEnabled.value();
            }
            if (ismHistoryEnabled == null) {
                ismHistoryEnabled = _SINGLETON_VALUE_IsmHistoryEnabled.value();
            }
            if (ismHistoryMaxAge == null) {
                ismHistoryMaxAge = _SINGLETON_VALUE_IsmHistoryMaxAge.value();
            }
            if (ismHistoryMaxDocs == null) {
                ismHistoryMaxDocs = _SINGLETON_VALUE_IsmHistoryMaxDocs.value();
            }
            if (ismHistoryRolloverCheckPeriod == null) {
                ismHistoryRolloverCheckPeriod = _SINGLETON_VALUE_IsmHistoryRolloverCheckPeriod.value();
            }
            if (ismHistoryRolloverRetentionPeriod == null) {
                ismHistoryRolloverRetentionPeriod = _SINGLETON_VALUE_IsmHistoryRolloverRetentionPeriod.value();
            }
            return new OpensearchISMHistorySettings(
                ismEnabled,
                ismHistoryEnabled,
                ismHistoryMaxAge,
                ismHistoryMaxDocs,
                ismHistoryRolloverCheckPeriod,
                ismHistoryRolloverRetentionPeriod);
        }

        private static final LazySingletonValue<JsonNullable<? extends Boolean>> _SINGLETON_VALUE_IsmEnabled =
                new LazySingletonValue<>(
                        "ism_enabled",
                        "true",
                        new TypeReference<JsonNullable<? extends Boolean>>() {});

        private static final LazySingletonValue<JsonNullable<? extends Boolean>> _SINGLETON_VALUE_IsmHistoryEnabled =
                new LazySingletonValue<>(
                        "ism_history_enabled",
                        "true",
                        new TypeReference<JsonNullable<? extends Boolean>>() {});

        private static final LazySingletonValue<JsonNullable<? extends Long>> _SINGLETON_VALUE_IsmHistoryMaxAge =
                new LazySingletonValue<>(
                        "ism_history_max_age",
                        "24",
                        new TypeReference<JsonNullable<? extends Long>>() {});

        private static final LazySingletonValue<JsonNullable<? extends Long>> _SINGLETON_VALUE_IsmHistoryMaxDocs =
                new LazySingletonValue<>(
                        "ism_history_max_docs",
                        "2500000",
                        new TypeReference<JsonNullable<? extends Long>>() {});

        private static final LazySingletonValue<JsonNullable<? extends Long>> _SINGLETON_VALUE_IsmHistoryRolloverCheckPeriod =
                new LazySingletonValue<>(
                        "ism_history_rollover_check_period",
                        "8",
                        new TypeReference<JsonNullable<? extends Long>>() {});

        private static final LazySingletonValue<JsonNullable<? extends Long>> _SINGLETON_VALUE_IsmHistoryRolloverRetentionPeriod =
                new LazySingletonValue<>(
                        "ism_history_rollover_retention_period",
                        "30",
                        new TypeReference<JsonNullable<? extends Long>>() {});
    }
}

