package com.exoscale.sos;

import com.exoscale.sos.item.WithBucketItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /sos
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SosRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.sos.item collection
     * @param bucket Unique identifier of the item
     * @return a WithBucketItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithBucketItemRequestBuilder byBucket(@jakarta.annotation.Nonnull final String bucket) {
        Objects.requireNonNull(bucket);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("bucket", bucket);
        return new WithBucketItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new SosRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SosRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sos", pathParameters);
    }
    /**
     * Instantiates a new SosRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SosRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sos", rawUrl);
    }
}
