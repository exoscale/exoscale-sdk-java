package com.exoscale.dbaasintegrationsettings.item;

import com.exoscale.dbaasintegrationsettings.item.item.SourceTypeItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /dbaas-integration-settings/{integration-type}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IntegrationTypeItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.dbaasIntegrationSettings.item.item collection
     * @param sourceType Unique identifier of the item
     * @return a SourceTypeItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SourceTypeItemRequestBuilder bySourceType(@jakarta.annotation.Nonnull final String sourceType) {
        Objects.requireNonNull(sourceType);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("source%2Dtype", sourceType);
        return new SourceTypeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new IntegrationTypeItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IntegrationTypeItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-integration-settings/{integration%2Dtype}", pathParameters);
    }
    /**
     * Instantiates a new IntegrationTypeItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IntegrationTypeItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-integration-settings/{integration%2Dtype}", rawUrl);
    }
}
