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


public class DbaasIntegrationType {

    /**
     * The type of the integration.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends String> type;

    /**
     * The description of the source service types.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source-description")
    private Optional<? extends String> sourceDescription;

    /**
     * A list of the source service types the integration supports.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source-service-types")
    private Optional<? extends java.util.List<String>> sourceServiceTypes;

    /**
     * The description of the destination service types.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dest-description")
    private Optional<? extends String> destDescription;

    /**
     * A list of the destination service types the integration supports.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dest-service-types")
    private Optional<? extends java.util.List<String>> destServiceTypes;

    /**
     * A JSON schema of additional settings of the integration.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("settings")
    private Optional<? extends DbaasIntegrationTypeSettings> settings;

    public DbaasIntegrationType(
            @JsonProperty("type") Optional<? extends String> type,
            @JsonProperty("source-description") Optional<? extends String> sourceDescription,
            @JsonProperty("source-service-types") Optional<? extends java.util.List<String>> sourceServiceTypes,
            @JsonProperty("dest-description") Optional<? extends String> destDescription,
            @JsonProperty("dest-service-types") Optional<? extends java.util.List<String>> destServiceTypes,
            @JsonProperty("settings") Optional<? extends DbaasIntegrationTypeSettings> settings) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(sourceDescription, "sourceDescription");
        Utils.checkNotNull(sourceServiceTypes, "sourceServiceTypes");
        Utils.checkNotNull(destDescription, "destDescription");
        Utils.checkNotNull(destServiceTypes, "destServiceTypes");
        Utils.checkNotNull(settings, "settings");
        this.type = type;
        this.sourceDescription = sourceDescription;
        this.sourceServiceTypes = sourceServiceTypes;
        this.destDescription = destDescription;
        this.destServiceTypes = destServiceTypes;
        this.settings = settings;
    }

    /**
     * The type of the integration.
     */
    public Optional<? extends String> type() {
        return type;
    }

    /**
     * The description of the source service types.
     */
    public Optional<? extends String> sourceDescription() {
        return sourceDescription;
    }

    /**
     * A list of the source service types the integration supports.
     */
    public Optional<? extends java.util.List<String>> sourceServiceTypes() {
        return sourceServiceTypes;
    }

    /**
     * The description of the destination service types.
     */
    public Optional<? extends String> destDescription() {
        return destDescription;
    }

    /**
     * A list of the destination service types the integration supports.
     */
    public Optional<? extends java.util.List<String>> destServiceTypes() {
        return destServiceTypes;
    }

    /**
     * A JSON schema of additional settings of the integration.
     */
    public Optional<? extends DbaasIntegrationTypeSettings> settings() {
        return settings;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The type of the integration.
     */
    public DbaasIntegrationType withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * The type of the integration.
     */
    public DbaasIntegrationType withType(Optional<? extends String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * The description of the source service types.
     */
    public DbaasIntegrationType withSourceDescription(String sourceDescription) {
        Utils.checkNotNull(sourceDescription, "sourceDescription");
        this.sourceDescription = Optional.ofNullable(sourceDescription);
        return this;
    }

    /**
     * The description of the source service types.
     */
    public DbaasIntegrationType withSourceDescription(Optional<? extends String> sourceDescription) {
        Utils.checkNotNull(sourceDescription, "sourceDescription");
        this.sourceDescription = sourceDescription;
        return this;
    }

    /**
     * A list of the source service types the integration supports.
     */
    public DbaasIntegrationType withSourceServiceTypes(java.util.List<String> sourceServiceTypes) {
        Utils.checkNotNull(sourceServiceTypes, "sourceServiceTypes");
        this.sourceServiceTypes = Optional.ofNullable(sourceServiceTypes);
        return this;
    }

    /**
     * A list of the source service types the integration supports.
     */
    public DbaasIntegrationType withSourceServiceTypes(Optional<? extends java.util.List<String>> sourceServiceTypes) {
        Utils.checkNotNull(sourceServiceTypes, "sourceServiceTypes");
        this.sourceServiceTypes = sourceServiceTypes;
        return this;
    }

    /**
     * The description of the destination service types.
     */
    public DbaasIntegrationType withDestDescription(String destDescription) {
        Utils.checkNotNull(destDescription, "destDescription");
        this.destDescription = Optional.ofNullable(destDescription);
        return this;
    }

    /**
     * The description of the destination service types.
     */
    public DbaasIntegrationType withDestDescription(Optional<? extends String> destDescription) {
        Utils.checkNotNull(destDescription, "destDescription");
        this.destDescription = destDescription;
        return this;
    }

    /**
     * A list of the destination service types the integration supports.
     */
    public DbaasIntegrationType withDestServiceTypes(java.util.List<String> destServiceTypes) {
        Utils.checkNotNull(destServiceTypes, "destServiceTypes");
        this.destServiceTypes = Optional.ofNullable(destServiceTypes);
        return this;
    }

    /**
     * A list of the destination service types the integration supports.
     */
    public DbaasIntegrationType withDestServiceTypes(Optional<? extends java.util.List<String>> destServiceTypes) {
        Utils.checkNotNull(destServiceTypes, "destServiceTypes");
        this.destServiceTypes = destServiceTypes;
        return this;
    }

    /**
     * A JSON schema of additional settings of the integration.
     */
    public DbaasIntegrationType withSettings(DbaasIntegrationTypeSettings settings) {
        Utils.checkNotNull(settings, "settings");
        this.settings = Optional.ofNullable(settings);
        return this;
    }

    /**
     * A JSON schema of additional settings of the integration.
     */
    public DbaasIntegrationType withSettings(Optional<? extends DbaasIntegrationTypeSettings> settings) {
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
        DbaasIntegrationType other = (DbaasIntegrationType) o;
        return 
            java.util.Objects.deepEquals(this.type, other.type) &&
            java.util.Objects.deepEquals(this.sourceDescription, other.sourceDescription) &&
            java.util.Objects.deepEquals(this.sourceServiceTypes, other.sourceServiceTypes) &&
            java.util.Objects.deepEquals(this.destDescription, other.destDescription) &&
            java.util.Objects.deepEquals(this.destServiceTypes, other.destServiceTypes) &&
            java.util.Objects.deepEquals(this.settings, other.settings);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            type,
            sourceDescription,
            sourceServiceTypes,
            destDescription,
            destServiceTypes,
            settings);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DbaasIntegrationType.class,
                "type", type,
                "sourceDescription", sourceDescription,
                "sourceServiceTypes", sourceServiceTypes,
                "destDescription", destDescription,
                "destServiceTypes", destServiceTypes,
                "settings", settings);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> type = Optional.empty();
 
        private Optional<? extends String> sourceDescription = Optional.empty();
 
        private Optional<? extends java.util.List<String>> sourceServiceTypes = Optional.empty();
 
        private Optional<? extends String> destDescription = Optional.empty();
 
        private Optional<? extends java.util.List<String>> destServiceTypes = Optional.empty();
 
        private Optional<? extends DbaasIntegrationTypeSettings> settings = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The type of the integration.
         */
        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        /**
         * The type of the integration.
         */
        public Builder type(Optional<? extends String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * The description of the source service types.
         */
        public Builder sourceDescription(String sourceDescription) {
            Utils.checkNotNull(sourceDescription, "sourceDescription");
            this.sourceDescription = Optional.ofNullable(sourceDescription);
            return this;
        }

        /**
         * The description of the source service types.
         */
        public Builder sourceDescription(Optional<? extends String> sourceDescription) {
            Utils.checkNotNull(sourceDescription, "sourceDescription");
            this.sourceDescription = sourceDescription;
            return this;
        }

        /**
         * A list of the source service types the integration supports.
         */
        public Builder sourceServiceTypes(java.util.List<String> sourceServiceTypes) {
            Utils.checkNotNull(sourceServiceTypes, "sourceServiceTypes");
            this.sourceServiceTypes = Optional.ofNullable(sourceServiceTypes);
            return this;
        }

        /**
         * A list of the source service types the integration supports.
         */
        public Builder sourceServiceTypes(Optional<? extends java.util.List<String>> sourceServiceTypes) {
            Utils.checkNotNull(sourceServiceTypes, "sourceServiceTypes");
            this.sourceServiceTypes = sourceServiceTypes;
            return this;
        }

        /**
         * The description of the destination service types.
         */
        public Builder destDescription(String destDescription) {
            Utils.checkNotNull(destDescription, "destDescription");
            this.destDescription = Optional.ofNullable(destDescription);
            return this;
        }

        /**
         * The description of the destination service types.
         */
        public Builder destDescription(Optional<? extends String> destDescription) {
            Utils.checkNotNull(destDescription, "destDescription");
            this.destDescription = destDescription;
            return this;
        }

        /**
         * A list of the destination service types the integration supports.
         */
        public Builder destServiceTypes(java.util.List<String> destServiceTypes) {
            Utils.checkNotNull(destServiceTypes, "destServiceTypes");
            this.destServiceTypes = Optional.ofNullable(destServiceTypes);
            return this;
        }

        /**
         * A list of the destination service types the integration supports.
         */
        public Builder destServiceTypes(Optional<? extends java.util.List<String>> destServiceTypes) {
            Utils.checkNotNull(destServiceTypes, "destServiceTypes");
            this.destServiceTypes = destServiceTypes;
            return this;
        }

        /**
         * A JSON schema of additional settings of the integration.
         */
        public Builder settings(DbaasIntegrationTypeSettings settings) {
            Utils.checkNotNull(settings, "settings");
            this.settings = Optional.ofNullable(settings);
            return this;
        }

        /**
         * A JSON schema of additional settings of the integration.
         */
        public Builder settings(Optional<? extends DbaasIntegrationTypeSettings> settings) {
            Utils.checkNotNull(settings, "settings");
            this.settings = settings;
            return this;
        }
        
        public DbaasIntegrationType build() {
            return new DbaasIntegrationType(
                type,
                sourceDescription,
                sourceServiceTypes,
                destDescription,
                destServiceTypes,
                settings);
        }
    }
}

