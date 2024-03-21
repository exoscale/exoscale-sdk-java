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

public enum EnumKafkaAuthMethod {
    CERTIFICATE("certificate"),
    SASL("sasl");

    @JsonValue
    private final String value;

    private EnumKafkaAuthMethod(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
