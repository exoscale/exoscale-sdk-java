package com.exoscale.skscluster.item.authority.item;

import com.exoscale.skscluster.item.authority.item.cert.CertRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /sks-cluster/{id}/authority/{authority}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithAuthorityItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The cert property
     */
    @jakarta.annotation.Nonnull
    public CertRequestBuilder cert() {
        return new CertRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithAuthorityItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithAuthorityItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sks-cluster/{id}/authority/{authority}", pathParameters);
    }
    /**
     * Instantiates a new WithAuthorityItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithAuthorityItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sks-cluster/{id}/authority/{authority}", rawUrl);
    }
}
