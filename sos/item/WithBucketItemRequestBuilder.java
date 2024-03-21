package com.exoscale.sos.item;

import com.exoscale.sos.item.presignedurl.PresignedUrlRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /sos/{bucket}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithBucketItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The presignedUrl property
     */
    @jakarta.annotation.Nonnull
    public PresignedUrlRequestBuilder presignedUrl() {
        return new PresignedUrlRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithBucketItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithBucketItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sos/{bucket}", pathParameters);
    }
    /**
     * Instantiates a new WithBucketItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithBucketItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sos/{bucket}", rawUrl);
    }
}
