package com.exoscale.dbaastask;

import com.exoscale.dbaastask.item.WithServiceItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /dbaas-task
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasTaskRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.dbaasTask.item collection
     * @param service Unique identifier of the item
     * @return a WithServiceItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithServiceItemRequestBuilder byService(@jakarta.annotation.Nonnull final String service) {
        Objects.requireNonNull(service);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("service", service);
        return new WithServiceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DbaasTaskRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbaasTaskRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-task", pathParameters);
    }
    /**
     * Instantiates a new DbaasTaskRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbaasTaskRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-task", rawUrl);
    }
}
