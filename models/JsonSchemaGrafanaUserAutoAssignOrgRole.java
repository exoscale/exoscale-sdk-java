package com.exoscale.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum JsonSchemaGrafanaUserAutoAssignOrgRole implements ValuedEnum {
    Viewer("Viewer"),
    Admin("Admin"),
    Editor("Editor");
    public final String value;
    JsonSchemaGrafanaUserAutoAssignOrgRole(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static JsonSchemaGrafanaUserAutoAssignOrgRole forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Viewer": return Viewer;
            case "Admin": return Admin;
            case "Editor": return Editor;
            default: return null;
        }
    }
}
