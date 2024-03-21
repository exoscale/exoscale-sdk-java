package com.exoscale.iamrole.item;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IamRolePutRequestBodyPermissions implements ValuedEnum {
    BypassGovernanceRetention("bypass-governance-retention");
    public final String value;
    IamRolePutRequestBodyPermissions(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IamRolePutRequestBodyPermissions forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "bypass-governance-retention": return BypassGovernanceRetention;
            default: return null;
        }
    }
}
