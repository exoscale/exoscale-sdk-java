/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.exoscale.api.models.operations;

import com.exoscale.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * CreateDbaasServiceGrafanaMaintenance - Automatic maintenance settings
 */

public class CreateDbaasServiceGrafanaMaintenance {

    /**
     * Day of week for installing updates
     */
    @JsonProperty("dow")
    private CreateDbaasServiceGrafanaDow dow;

    /**
     * Time for installing updates, UTC
     */
    @JsonProperty("time")
    private String time;

    public CreateDbaasServiceGrafanaMaintenance(
            @JsonProperty("dow") CreateDbaasServiceGrafanaDow dow,
            @JsonProperty("time") String time) {
        Utils.checkNotNull(dow, "dow");
        Utils.checkNotNull(time, "time");
        this.dow = dow;
        this.time = time;
    }

    /**
     * Day of week for installing updates
     */
    public CreateDbaasServiceGrafanaDow dow() {
        return dow;
    }

    /**
     * Time for installing updates, UTC
     */
    public String time() {
        return time;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Day of week for installing updates
     */
    public CreateDbaasServiceGrafanaMaintenance withDow(CreateDbaasServiceGrafanaDow dow) {
        Utils.checkNotNull(dow, "dow");
        this.dow = dow;
        return this;
    }

    /**
     * Time for installing updates, UTC
     */
    public CreateDbaasServiceGrafanaMaintenance withTime(String time) {
        Utils.checkNotNull(time, "time");
        this.time = time;
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
        CreateDbaasServiceGrafanaMaintenance other = (CreateDbaasServiceGrafanaMaintenance) o;
        return 
            java.util.Objects.deepEquals(this.dow, other.dow) &&
            java.util.Objects.deepEquals(this.time, other.time);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            dow,
            time);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateDbaasServiceGrafanaMaintenance.class,
                "dow", dow,
                "time", time);
    }
    
    public final static class Builder {
 
        private CreateDbaasServiceGrafanaDow dow;
 
        private String time;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Day of week for installing updates
         */
        public Builder dow(CreateDbaasServiceGrafanaDow dow) {
            Utils.checkNotNull(dow, "dow");
            this.dow = dow;
            return this;
        }

        /**
         * Time for installing updates, UTC
         */
        public Builder time(String time) {
            Utils.checkNotNull(time, "time");
            this.time = time;
            return this;
        }
        
        public CreateDbaasServiceGrafanaMaintenance build() {
            return new CreateDbaasServiceGrafanaMaintenance(
                dow,
                time);
        }
    }
}

