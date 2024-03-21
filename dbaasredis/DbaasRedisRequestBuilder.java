package com.exoscale.dbaasredis;

import com.exoscale.dbaasredis.item.WithNameItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /dbaas-redis
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasRedisRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.dbaasRedis.item collection
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
     * Instantiates a new DbaasRedisRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbaasRedisRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-redis", pathParameters);
    }
    /**
     * Instantiates a new DbaasRedisRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbaasRedisRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-redis", rawUrl);
    }
}
