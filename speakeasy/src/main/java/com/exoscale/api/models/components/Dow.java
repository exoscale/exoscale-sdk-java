/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.exoscale.api.models.components;

import com.exoscale.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Dow - Day of week for installing updates
 */
public enum Dow {
    SATURDAY("saturday"),
    TUESDAY("tuesday"),
    NEVER("never"),
    WEDNESDAY("wednesday"),
    SUNDAY("sunday"),
    FRIDAY("friday"),
    MONDAY("monday"),
    THURSDAY("thursday");

    @JsonValue
    private final String value;

    private Dow(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
