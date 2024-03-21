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


public class DbaasPostgresUsers {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("users")
    private Optional<? extends java.util.List<DbaasPostgresUsersUsers>> users;

    public DbaasPostgresUsers(
            @JsonProperty("users") Optional<? extends java.util.List<DbaasPostgresUsersUsers>> users) {
        Utils.checkNotNull(users, "users");
        this.users = users;
    }

    public Optional<? extends java.util.List<DbaasPostgresUsersUsers>> users() {
        return users;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DbaasPostgresUsers withUsers(java.util.List<DbaasPostgresUsersUsers> users) {
        Utils.checkNotNull(users, "users");
        this.users = Optional.ofNullable(users);
        return this;
    }

    public DbaasPostgresUsers withUsers(Optional<? extends java.util.List<DbaasPostgresUsersUsers>> users) {
        Utils.checkNotNull(users, "users");
        this.users = users;
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
        DbaasPostgresUsers other = (DbaasPostgresUsers) o;
        return 
            java.util.Objects.deepEquals(this.users, other.users);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            users);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DbaasPostgresUsers.class,
                "users", users);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<DbaasPostgresUsersUsers>> users = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder users(java.util.List<DbaasPostgresUsersUsers> users) {
            Utils.checkNotNull(users, "users");
            this.users = Optional.ofNullable(users);
            return this;
        }

        public Builder users(Optional<? extends java.util.List<DbaasPostgresUsersUsers>> users) {
            Utils.checkNotNull(users, "users");
            this.users = users;
            return this;
        }
        
        public DbaasPostgresUsers build() {
            return new DbaasPostgresUsers(
                users);
        }
    }
}

