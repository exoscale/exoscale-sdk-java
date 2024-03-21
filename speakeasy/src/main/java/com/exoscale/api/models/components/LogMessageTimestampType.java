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
 * LogMessageTimestampType - Define whether the timestamp in the message is message create time or log append time.
 */
public enum LogMessageTimestampType {
    CREATE_TIME("CreateTime"),
    LOG_APPEND_TIME("LogAppendTime");

    @JsonValue
    private final String value;

    private LogMessageTimestampType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
