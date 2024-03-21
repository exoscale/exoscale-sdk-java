package com.exoscale.dbaasintegrationsettings;

import com.exoscale.dbaasintegrationsettings.item.IntegrationTypeItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /dbaas-integration-settings
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasIntegrationSettingsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.dbaasIntegrationSettings.item collection
     * @param integrationType Unique identifier of the item
     * @return a IntegrationTypeItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public IntegrationTypeItemRequestBuilder byIntegrationType(@jakarta.annotation.Nonnull final String integrationType) {
        Objects.requireNonNull(integrationType);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("integration%2Dtype", integrationType);
        return new IntegrationTypeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DbaasIntegrationSettingsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbaasIntegrationSettingsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-integration-settings", pathParameters);
    }
    /**
     * Instantiates a new DbaasIntegrationSettingsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbaasIntegrationSettingsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-integration-settings", rawUrl);
    }
}
