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
 * FamilyEnum to be used.
 */
public enum FamilyEnum {
    GPU3,

    GPU2,

    GPU,

    MEMORY,

    STORAGE,

    STANDARD,

    COLOSSUS,

    CPU;


    private static TreeMap<String, FamilyEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        GPU3.value = "gpu3";
        GPU2.value = "gpu2";
        GPU.value = "gpu";
        MEMORY.value = "memory";
        STORAGE.value = "storage";
        STANDARD.value = "standard";
        COLOSSUS.value = "colossus";
        CPU.value = "cpu";

        valueMap.put("gpu3", GPU3);
        valueMap.put("gpu2", GPU2);
        valueMap.put("gpu", GPU);
        valueMap.put("memory", MEMORY);
        valueMap.put("storage", STORAGE);
        valueMap.put("standard", STANDARD);
        valueMap.put("colossus", COLOSSUS);
        valueMap.put("cpu", CPU);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static FamilyEnum constructFromString(String toConvert) throws IOException {
        FamilyEnum enumValue = fromString(toConvert);
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
    public static FamilyEnum fromString(String toConvert) {
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
     * Convert list of FamilyEnum values to list of string values.
     * @param toConvert The list of FamilyEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<FamilyEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (FamilyEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 