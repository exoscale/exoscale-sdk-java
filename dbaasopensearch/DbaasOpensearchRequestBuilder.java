package com.exoscale.dbaasopensearch;

import com.exoscale.dbaasopensearch.item.DbaasOpensearchItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /dbaas-opensearch
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasOpensearchRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.dbaasOpensearch.item collection
     * @param dbaasOpensearchId Unique identifier of the item
     * @return a DbaasOpensearchItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DbaasOpensearchItemRequestBuilder byDbaasOpensearchId(@jakarta.annotation.Nonnull final String dbaasOpensearchId) {
        Objects.requireNonNull(dbaasOpensearchId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("dbaasOpensearch%2Did", dbaasOpensearchId);
        return new DbaasOpensearchItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DbaasOpensearchRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbaasOpensearchRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-opensearch", pathParameters);
    }
    /**
     * Instantiates a new DbaasOpensearchRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbaasOpensearchRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-opensearch", rawUrl);
    }
}
