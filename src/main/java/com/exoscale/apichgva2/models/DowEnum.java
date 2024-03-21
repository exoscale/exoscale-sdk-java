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
 * DowEnum to be used.
 */
public enum DowEnum {
    SATURDAY,

    TUESDAY,

    NEVER,

    WEDNESDAY,

    SUNDAY,

    FRIDAY,

    MONDAY,

    THURSDAY;


    private static TreeMap<String, DowEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        SATURDAY.value = "saturday";
        TUESDAY.value = "tuesday";
        NEVER.value = "never";
        WEDNESDAY.value = "wednesday";
        SUNDAY.value = "sunday";
        FRIDAY.value = "friday";
        MONDAY.value = "monday";
        THURSDAY.value = "thursday";

        valueMap.put("saturday", SATURDAY);
        valueMap.put("tuesday", TUESDAY);
        valueMap.put("never", NEVER);
        valueMap.put("wednesday", WEDNESDAY);
        valueMap.put("sunday", SUNDAY);
        valueMap.put("friday", FRIDAY);
        valueMap.put("monday", MONDAY);
        valueMap.put("thursday", THURSDAY);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static DowEnum constructFromString(String toConvert) throws IOException {
        DowEnum enumValue = fromString(toConvert);
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
    public static DowEnum fromString(String toConvert) {
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
     * Convert list of DowEnum values to list of string values.
     * @param toConvert The list of DowEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<DowEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (DowEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 