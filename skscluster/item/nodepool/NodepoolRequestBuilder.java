package com.exoscale.skscluster.item.nodepool;

import com.exoscale.models.Operation;
import com.exoscale.skscluster.item.nodepool.item.SksNodepoolItemRequestBuilder;
import com.exoscale.skscluster.item.nodepool.sksnodepoolidevict.SksNodepoolIdEvictRequestBuilder;
import com.exoscale.skscluster.item.nodepool.sksnodepoolidscale.SksNodepoolIdScaleRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * Builds and executes requests for operations under /sks-cluster/{id}/nodepool
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NodepoolRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.sksCluster.item.nodepool.item collection
     * @param sksNodepoolId Unique identifier of the item
     * @return a SksNodepoolItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SksNodepoolItemRequestBuilder bySksNodepoolId(@jakarta.annotation.Nonnull final UUID sksNodepoolId) {
        Objects.requireNonNull(sksNodepoolId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("sks%2Dnodepool%2Did", sksNodepoolId);
        return new SksNodepoolItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new NodepoolRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NodepoolRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sks-cluster/{id}/nodepool", pathParameters);
    }
    /**
     * Instantiates a new NodepoolRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public NodepoolRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sks-cluster/{id}/nodepool", rawUrl);
    }
    /**
     * Create a new SKS Nodepool
     * @param body The request body
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation post(@jakarta.annotation.Nonnull final NodepoolPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Create a new SKS Nodepool
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation post(@jakarta.annotation.Nonnull final NodepoolPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Operation::createFromDiscriminatorValue);
    }
    /**
     * Builds and executes requests for operations under /sks-cluster/{id}/nodepool/{sks-nodepool-id}:evict
     * @return a SksNodepoolIdEvictRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SksNodepoolIdEvictRequestBuilder sksNodepoolIdEvict(@jakarta.annotation.Nonnull final UUID sksNodepoolId) {
        Objects.requireNonNull(sksNodepoolId);
        return new SksNodepoolIdEvictRequestBuilder(pathParameters, requestAdapter, sksNodepoolId);
    }
    /**
     * Builds and executes requests for operations under /sks-cluster/{id}/nodepool/{sks-nodepool-id}:scale
     * @return a SksNodepoolIdScaleRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SksNodepoolIdScaleRequestBuilder sksNodepoolIdScale(@jakarta.annotation.Nonnull final UUID sksNodepoolId) {
        Objects.requireNonNull(sksNodepoolId);
        return new SksNodepoolIdScaleRequestBuilder(pathParameters, requestAdapter, sksNodepoolId);
    }
    /**
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final NodepoolPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final NodepoolPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a NodepoolRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public NodepoolRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new NodepoolRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
