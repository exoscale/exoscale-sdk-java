package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EnumPgPoolMode implements ValuedEnum {
    Transaction("transaction"),
    Statement("statement"),
    Session("session");
    public final String value;
    EnumPgPoolMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EnumPgPoolMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "transaction": return Transaction;
            case "statement": return Statement;
            case "session": return Session;
            default: return null;
        }
    }
}
