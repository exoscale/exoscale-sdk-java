/*
 * ExoscalePublicAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.exoscale.apichgva2.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * EnumMigrationStatusEnum to be used.
 */
public enum EnumMigrationStatusEnum {
    RUNNING,

    SYNCING,

    FAILED,

    DONE;


    private static TreeMap<String, EnumMigrationStatusEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        RUNNING.value = "running";
        SYNCING.value = "syncing";
        FAILED.value = "failed";
        DONE.value = "done";

        valueMap.put("running", RUNNING);
        valueMap.put("syncing", SYNCING);
        valueMap.put("failed", FAILED);
        valueMap.put("done", DONE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static EnumMigrationStatusEnum constructFromString(String toConvert) throws IOException {
        EnumMigrationStatusEnum enumValue = fromString(toConvert);
        if (enumValue == null)
        {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static EnumMigrationStatusEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of EnumMigrationStatusEnum values to list of string values.
     * @param toConvert The list of EnumMigrationStatusEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<EnumMigrationStatusEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (EnumMigrationStatusEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 