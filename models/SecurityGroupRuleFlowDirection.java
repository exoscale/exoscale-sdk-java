package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Network flow direction to match
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SecurityGroupRuleFlowDirection implements ValuedEnum {
    Ingress("ingress"),
    Egress("egress");
    public final String value;
    SecurityGroupRuleFlowDirection(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SecurityGroupRuleFlowDirection forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ingress": return Ingress;
            case "egress": return Egress;
            default: return null;
        }
    }
}
