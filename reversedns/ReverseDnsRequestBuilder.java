package com.exoscale.reversedns;

import com.exoscale.reversedns.elasticip.ElasticIpRequestBuilder;
import com.exoscale.reversedns.instance.InstanceRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /reverse-dns
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReverseDnsRequestBuilder extends BaseRequestBuilder {
    /**
     * The elasticIp property
     */
    @jakarta.annotation.Nonnull
    public ElasticIpRequestBuilder elasticIp() {
        return new ElasticIpRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The instance property
     */
    @jakarta.annotation.Nonnull
    public InstanceRequestBuilder instance() {
        return new InstanceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ReverseDnsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReverseDnsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reverse-dns", pathParameters);
    }
    /**
     * Instantiates a new ReverseDnsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReverseDnsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reverse-dns", rawUrl);
    }
}
