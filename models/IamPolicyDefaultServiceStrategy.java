package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * IAM default service strategy
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IamPolicyDefaultServiceStrategy implements ValuedEnum {
    Allow("allow"),
    Deny("deny");
    public final String value;
    IamPolicyDefaultServiceStrategy(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IamPolicyDefaultServiceStrategy forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allow": return Allow;
            case "deny": return Deny;
            default: return null;
        }
    }
}
