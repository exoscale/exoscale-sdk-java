package com.exoscale.sksclusterdeprecatedresources;

import com.exoscale.sksclusterdeprecatedresources.item.SksClusterDeprecatedResourcesItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
/**
 * Builds and executes requests for operations under /sks-cluster-deprecated-resources
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SksClusterDeprecatedResourcesRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.sksClusterDeprecatedResources.item collection
     * @param id Unique identifier of the item
     * @return a SksClusterDeprecatedResourcesItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SksClusterDeprecatedResourcesItemRequestBuilder byId(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new SksClusterDeprecatedResourcesItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new SksClusterDeprecatedResourcesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SksClusterDeprecatedResourcesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sks-cluster-deprecated-resources", pathParameters);
    }
    /**
     * Instantiates a new SksClusterDeprecatedResourcesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SksClusterDeprecatedResourcesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sks-cluster-deprecated-resources", rawUrl);
    }
}
