package com.exoscale.skscluster.item.authority;

import com.exoscale.skscluster.item.authority.item.WithAuthorityItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /sks-cluster/{id}/authority
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthorityRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.sksCluster.item.authority.item collection
     * @param authority Unique identifier of the item
     * @return a WithAuthorityItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithAuthorityItemRequestBuilder byAuthority(@jakarta.annotation.Nonnull final String authority) {
        Objects.requireNonNull(authority);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("authority", authority);
        return new WithAuthorityItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new AuthorityRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AuthorityRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sks-cluster/{id}/authority", pathParameters);
    }
    /**
     * Instantiates a new AuthorityRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AuthorityRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sks-cluster/{id}/authority", rawUrl);
    }
}
