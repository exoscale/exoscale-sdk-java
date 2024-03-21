/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.exoscale.api.models.components;

import com.exoscale.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class OpensearchEmailSenderSettings {

    /**
     * This should be identical to the Sender name defined in Opensearch dashboards
     */
    @JsonProperty("email_sender_name")
    private String emailSenderName;

    /**
     * Sender password for Opensearch alerts to authenticate with SMTP server
     */
    @JsonProperty("email_sender_password")
    private String emailSenderPassword;

    @JsonProperty("email_sender_username")
    private String emailSenderUsername;

    public OpensearchEmailSenderSettings(
            @JsonProperty("email_sender_name") String emailSenderName,
            @JsonProperty("email_sender_password") String emailSenderPassword,
            @JsonProperty("email_sender_username") String emailSenderUsername) {
        Utils.checkNotNull(emailSenderName, "emailSenderName");
        Utils.checkNotNull(emailSenderPassword, "emailSenderPassword");
        Utils.checkNotNull(emailSenderUsername, "emailSenderUsername");
        this.emailSenderName = emailSenderName;
        this.emailSenderPassword = emailSenderPassword;
        this.emailSenderUsername = emailSenderUsername;
    }

    /**
     * This should be identical to the Sender name defined in Opensearch dashboards
     */
    public String emailSenderName() {
        return emailSenderName;
    }

    /**
     * Sender password for Opensearch alerts to authenticate with SMTP server
     */
    public String emailSenderPassword() {
        return emailSenderPassword;
    }

    public String emailSenderUsername() {
        return emailSenderUsername;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * This should be identical to the Sender name defined in Opensearch dashboards
     */
    public OpensearchEmailSenderSettings withEmailSenderName(String emailSenderName) {
        Utils.checkNotNull(emailSenderName, "emailSenderName");
        this.emailSenderName = emailSenderName;
        return this;
    }

    /**
     * Sender password for Opensearch alerts to authenticate with SMTP server
     */
    public OpensearchEmailSenderSettings withEmailSenderPassword(String emailSenderPassword) {
        Utils.checkNotNull(emailSenderPassword, "emailSenderPassword");
        this.emailSenderPassword = emailSenderPassword;
        return this;
    }

    public OpensearchEmailSenderSettings withEmailSenderUsername(String emailSenderUsername) {
        Utils.checkNotNull(emailSenderUsername, "emailSenderUsername");
        this.emailSenderUsername = emailSenderUsername;
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
        OpensearchEmailSenderSettings other = (OpensearchEmailSenderSettings) o;
        return 
            java.util.Objects.deepEquals(this.emailSenderName, other.emailSenderName) &&
            java.util.Objects.deepEquals(this.emailSenderPassword, other.emailSenderPassword) &&
            java.util.Objects.deepEquals(this.emailSenderUsername, other.emailSenderUsername);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            emailSenderName,
            emailSenderPassword,
            emailSenderUsername);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OpensearchEmailSenderSettings.class,
                "emailSenderName", emailSenderName,
                "emailSenderPassword", emailSenderPassword,
                "emailSenderUsername", emailSenderUsername);
    }
    
    public final static class Builder {
 
        private String emailSenderName;
 
        private String emailSenderPassword;
 
        private String emailSenderUsername;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * This should be identical to the Sender name defined in Opensearch dashboards
         */
        public Builder emailSenderName(String emailSenderName) {
            Utils.checkNotNull(emailSenderName, "emailSenderName");
            this.emailSenderName = emailSenderName;
            return this;
        }

        /**
         * Sender password for Opensearch alerts to authenticate with SMTP server
         */
        public Builder emailSenderPassword(String emailSenderPassword) {
            Utils.checkNotNull(emailSenderPassword, "emailSenderPassword");
            this.emailSenderPassword = emailSenderPassword;
            return this;
        }

        public Builder emailSenderUsername(String emailSenderUsername) {
            Utils.checkNotNull(emailSenderUsername, "emailSenderUsername");
            this.emailSenderUsername = emailSenderUsername;
            return this;
        }
        
        public OpensearchEmailSenderSettings build() {
            return new OpensearchEmailSenderSettings(
                emailSenderName,
                emailSenderPassword,
                emailSenderUsername);
        }
    }
}

