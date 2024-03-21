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
 * Addon1Enum to be used.
 */
public enum Addon1Enum {
    EXOSCALECLOUDCONTROLLER,

    EXOSCALECONTAINERSTORAGEINTERFACE,

    METRICSSERVER;


    private static TreeMap<String, Addon1Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        EXOSCALECLOUDCONTROLLER.value = "exoscale-cloud-controller";
        EXOSCALECONTAINERSTORAGEINTERFACE.value = "exoscale-container-storage-interface";
        METRICSSERVER.value = "metrics-server";

        valueMap.put("exoscale-cloud-controller", EXOSCALECLOUDCONTROLLER);
        valueMap.put("exoscale-container-storage-interface", EXOSCALECONTAINERSTORAGEINTERFACE);
        valueMap.put("metrics-server", METRICSSERVER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static Addon1Enum constructFromString(String toConvert) throws IOException {
        Addon1Enum enumValue = fromString(toConvert);
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
    public static Addon1Enum fromString(String toConvert) {
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
     * Convert list of Addon1Enum values to list of string values.
     * @param toConvert The list of Addon1Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Addon1Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Addon1Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 