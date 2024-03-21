package com.exoscale.reversedns.instance;

import com.exoscale.reversedns.instance.item.InstanceItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
/**
 * Builds and executes requests for operations under /reverse-dns/instance
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InstanceRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.reverseDns.instance.item collection
     * @param id Unique identifier of the item
     * @return a InstanceItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public InstanceItemRequestBuilder byId(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new InstanceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new InstanceRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InstanceRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reverse-dns/instance", pathParameters);
    }
    /**
     * Instantiates a new InstanceRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InstanceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reverse-dns/instance", rawUrl);
    }
}
