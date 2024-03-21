package com.exoscale.dbaasintegrationsettings.item.item;

import com.exoscale.dbaasintegrationsettings.item.item.item.DestTypeItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /dbaas-integration-settings/{integration-type}/{source-type}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SourceTypeItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.dbaasIntegrationSettings.item.item.item collection
     * @param destType Unique identifier of the item
     * @return a DestTypeItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DestTypeItemRequestBuilder byDestType(@jakarta.annotation.Nonnull final String destType) {
        Objects.requireNonNull(destType);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("dest%2Dtype", destType);
        return new DestTypeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new SourceTypeItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SourceTypeItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-integration-settings/{integration%2Dtype}/{source%2Dtype}", pathParameters);
    }
    /**
     * Instantiates a new SourceTypeItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SourceTypeItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-integration-settings/{integration%2Dtype}/{source%2Dtype}", rawUrl);
    }
}
