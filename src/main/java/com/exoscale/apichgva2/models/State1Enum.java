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
 * State1Enum to be used.
 */
public enum State1Enum {
    CREATING,

    MIGRATED,

    DELETING,

    RUNNING,

    MIGRATING,

    ERROR;


    private static TreeMap<String, State1Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        CREATING.value = "creating";
        MIGRATED.value = "migrated";
        DELETING.value = "deleting";
        RUNNING.value = "running";
        MIGRATING.value = "migrating";
        ERROR.value = "error";

        valueMap.put("creating", CREATING);
        valueMap.put("migrated", MIGRATED);
        valueMap.put("deleting", DELETING);
        valueMap.put("running", RUNNING);
        valueMap.put("migrating", MIGRATING);
        valueMap.put("error", ERROR);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static State1Enum constructFromString(String toConvert) throws IOException {
        State1Enum enumValue = fromString(toConvert);
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
    public static State1Enum fromString(String toConvert) {
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
     * Convert list of State1Enum values to list of string values.
     * @param toConvert The list of State1Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<State1Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (State1Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 