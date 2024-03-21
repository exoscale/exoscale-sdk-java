package com.exoscale.dbaastask.item;

import com.exoscale.dbaastask.item.item.ServiceItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
/**
 * Builds and executes requests for operations under /dbaas-task/{service}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithServiceItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.dbaasTask.item.item collection
     * @param id Unique identifier of the item
     * @return a ServiceItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ServiceItemRequestBuilder byId(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new ServiceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new WithServiceItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithServiceItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-task/{service}", pathParameters);
    }
    /**
     * Instantiates a new WithServiceItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithServiceItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-task/{service}", rawUrl);
    }
}
