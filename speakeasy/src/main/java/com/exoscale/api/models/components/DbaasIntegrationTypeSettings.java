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
 * DbaasIntegrationTypeSettings - A JSON schema of additional settings of the integration.
 */

public class DbaasIntegrationTypeSettings {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("properties")
    private Optional<? extends Properties> properties;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("additionalProperties")
    private Optional<? extends Boolean> additionalProperties;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends String> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<? extends String> title;

    public DbaasIntegrationTypeSettings(
            @JsonProperty("properties") Optional<? extends Properties> properties,
            @JsonProperty("additionalProperties") Optional<? extends Boolean> additionalProperties,
            @JsonProperty("type") Optional<? extends String> type,
            @JsonProperty("title") Optional<? extends String> title) {
        Utils.checkNotNull(properties, "properties");
        Utils.checkNotNull(additionalProperties, "additionalProperties");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(title, "title");
        this.properties = properties;
        this.additionalProperties = additionalProperties;
        this.type = type;
        this.title = title;
    }

    public Optional<? extends Properties> properties() {
        return properties;
    }

    public Optional<? extends Boolean> additionalProperties() {
        return additionalProperties;
    }

    public Optional<? extends String> type() {
        return type;
    }

    public Optional<? extends String> title() {
        return title;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DbaasIntegrationTypeSettings withProperties(Properties properties) {
        Utils.checkNotNull(properties, "properties");
        this.properties = Optional.ofNullable(properties);
        return this;
    }

    public DbaasIntegrationTypeSettings withProperties(Optional<? extends Properties> properties) {
        Utils.checkNotNull(properties, "properties");
        this.properties = properties;
        return this;
    }

    public DbaasIntegrationTypeSettings withAdditionalProperties(boolean additionalProperties) {
        Utils.checkNotNull(additionalProperties, "additionalProperties");
        this.additionalProperties = Optional.ofNullable(additionalProperties);
        return this;
    }

    public DbaasIntegrationTypeSettings withAdditionalProperties(Optional<? extends Boolean> additionalProperties) {
        Utils.checkNotNull(additionalProperties, "additionalProperties");
        this.additionalProperties = additionalProperties;
        return this;
    }

    public DbaasIntegrationTypeSettings withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public DbaasIntegrationTypeSettings withType(Optional<? extends String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public DbaasIntegrationTypeSettings withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    public DbaasIntegrationTypeSettings withTitle(Optional<? extends String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
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
        DbaasIntegrationTypeSettings other = (DbaasIntegrationTypeSettings) o;
        return 
            java.util.Objects.deepEquals(this.properties, other.properties) &&
            java.util.Objects.deepEquals(this.additionalProperties, other.additionalProperties) &&
            java.util.Objects.deepEquals(this.type, other.type) &&
            java.util.Objects.deepEquals(this.title, other.title);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            properties,
            additionalProperties,
            type,
            title);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DbaasIntegrationTypeSettings.class,
                "properties", properties,
                "additionalProperties", additionalProperties,
                "type", type,
                "title", title);
    }
    
    public final static class Builder {
 
        private Optional<? extends Properties> properties = Optional.empty();
 
        private Optional<? extends Boolean> additionalProperties = Optional.empty();
 
        private Optional<? extends String> type = Optional.empty();
 
        private Optional<? extends String> title = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder properties(Properties properties) {
            Utils.checkNotNull(properties, "properties");
            this.properties = Optional.ofNullable(properties);
            return this;
        }

        public Builder properties(Optional<? extends Properties> properties) {
            Utils.checkNotNull(properties, "properties");
            this.properties = properties;
            return this;
        }

        public Builder additionalProperties(boolean additionalProperties) {
            Utils.checkNotNull(additionalProperties, "additionalProperties");
            this.additionalProperties = Optional.ofNullable(additionalProperties);
            return this;
        }

        public Builder additionalProperties(Optional<? extends Boolean> additionalProperties) {
            Utils.checkNotNull(additionalProperties, "additionalProperties");
            this.additionalProperties = additionalProperties;
            return this;
        }

        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = Optional.ofNullable(title);
            return this;
        }

        public Builder title(Optional<? extends String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }
        
        public DbaasIntegrationTypeSettings build() {
            return new DbaasIntegrationTypeSettings(
                properties,
                additionalProperties,
                type,
                title);
        }
    }
}

