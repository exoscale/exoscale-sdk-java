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


public class CreateDbaasPostgresUserRequestBody {

    @JsonProperty("username")
    private String username;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allow-replication")
    private Optional<? extends Boolean> allowReplication;

    public CreateDbaasPostgresUserRequestBody(
            @JsonProperty("username") String username,
            @JsonProperty("allow-replication") Optional<? extends Boolean> allowReplication) {
        Utils.checkNotNull(username, "username");
        Utils.checkNotNull(allowReplication, "allowReplication");
        this.username = username;
        this.allowReplication = allowReplication;
    }

    public String username() {
        return username;
    }

    public Optional<? extends Boolean> allowReplication() {
        return allowReplication;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateDbaasPostgresUserRequestBody withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
        return this;
    }

    public CreateDbaasPostgresUserRequestBody withAllowReplication(boolean allowReplication) {
        Utils.checkNotNull(allowReplication, "allowReplication");
        this.allowReplication = Optional.ofNullable(allowReplication);
        return this;
    }

    public CreateDbaasPostgresUserRequestBody withAllowReplication(Optional<? extends Boolean> allowReplication) {
        Utils.checkNotNull(allowReplication, "allowReplication");
        this.allowReplication = allowReplication;
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
        CreateDbaasPostgresUserRequestBody other = (CreateDbaasPostgresUserRequestBody) o;
        return 
            java.util.Objects.deepEquals(this.username, other.username) &&
            java.util.Objects.deepEquals(this.allowReplication, other.allowReplication);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            username,
            allowReplication);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateDbaasPostgresUserRequestBody.class,
                "username", username,
                "allowReplication", allowReplication);
    }
    
    public final static class Builder {
 
        private String username;
 
        private Optional<? extends Boolean> allowReplication = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }

        public Builder allowReplication(boolean allowReplication) {
            Utils.checkNotNull(allowReplication, "allowReplication");
            this.allowReplication = Optional.ofNullable(allowReplication);
            return this;
        }

        public Builder allowReplication(Optional<? extends Boolean> allowReplication) {
            Utils.checkNotNull(allowReplication, "allowReplication");
            this.allowReplication = allowReplication;
            return this;
        }
        
        public CreateDbaasPostgresUserRequestBody build() {
            return new CreateDbaasPostgresUserRequestBody(
                username,
                allowReplication);
        }
    }
}

