package com.exoscale.dbaasgrafana;

import com.exoscale.dbaasgrafana.item.WithNameItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /dbaas-grafana
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasGrafanaRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.dbaasGrafana.item collection
     * @param name Unique identifier of the item
     * @return a WithNameItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithNameItemRequestBuilder byName(@jakarta.annotation.Nonnull final String name) {
        Objects.requireNonNull(name);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("name", name);
        return new WithNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DbaasGrafanaRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbaasGrafanaRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-grafana", pathParameters);
    }
    /**
     * Instantiates a new DbaasGrafanaRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbaasGrafanaRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-grafana", rawUrl);
    }
}
