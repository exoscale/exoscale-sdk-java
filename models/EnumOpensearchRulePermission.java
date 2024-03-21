package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EnumOpensearchRulePermission implements ValuedEnum {
    Admin("admin"),
    Read("read"),
    Deny("deny"),
    Readwrite("readwrite"),
    Write("write");
    public final String value;
    EnumOpensearchRulePermission(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EnumOpensearchRulePermission forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "admin": return Admin;
            case "read": return Read;
            case "deny": return Deny;
            case "readwrite": return Readwrite;
            case "write": return Write;
            default: return null;
        }
    }
}
