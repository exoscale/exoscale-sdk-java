/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.exoscale.api.models.operations;

import com.exoscale.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Cni - Cluster CNI
 */
public enum Cni {
    CALICO("calico"),
    CILIUM("cilium");

    @JsonValue
    private final String value;

    private Cni(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
