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
 * ProducerCompressionType - Specify the default compression type for producers. This configuration accepts the standard compression codecs ('gzip', 'snappy', 'lz4', 'zstd'). It additionally accepts 'none' which is the default and equivalent to no compression.
 */
public enum ProducerCompressionType {
    GZIP("gzip"),
    SNAPPY("snappy"),
    LZ4("lz4"),
    ZSTD("zstd"),
    NONE("none");

    @JsonValue
    private final String value;

    private ProducerCompressionType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
