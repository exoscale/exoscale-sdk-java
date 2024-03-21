package com.exoscale.sksclusterkubeconfig;

import com.exoscale.sksclusterkubeconfig.item.SksClusterKubeconfigItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
/**
 * Builds and executes requests for operations under /sks-cluster-kubeconfig
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SksClusterKubeconfigRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.sksClusterKubeconfig.item collection
     * @param id Unique identifier of the item
     * @return a SksClusterKubeconfigItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SksClusterKubeconfigItemRequestBuilder byId(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new SksClusterKubeconfigItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new SksClusterKubeconfigRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SksClusterKubeconfigRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sks-cluster-kubeconfig", pathParameters);
    }
    /**
     * Instantiates a new SksClusterKubeconfigRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SksClusterKubeconfigRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sks-cluster-kubeconfig", rawUrl);
    }
}
