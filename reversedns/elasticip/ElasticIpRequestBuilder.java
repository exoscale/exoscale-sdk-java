package com.exoscale.reversedns.elasticip;

import com.exoscale.reversedns.elasticip.item.ElasticIpItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
/**
 * Builds and executes requests for operations under /reverse-dns/elastic-ip
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ElasticIpRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.reverseDns.elasticIp.item collection
     * @param id Unique identifier of the item
     * @return a ElasticIpItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ElasticIpItemRequestBuilder byId(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new ElasticIpItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ElasticIpRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ElasticIpRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reverse-dns/elastic-ip", pathParameters);
    }
    /**
     * Instantiates a new ElasticIpRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ElasticIpRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/reverse-dns/elastic-ip", rawUrl);
    }
}
