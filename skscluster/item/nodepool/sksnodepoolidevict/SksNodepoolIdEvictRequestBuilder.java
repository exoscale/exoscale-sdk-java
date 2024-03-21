package com.exoscale.skscluster.item.nodepool.sksnodepoolidevict;

import com.exoscale.models.Operation;
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
 * Builds and executes requests for operations under /sks-cluster/{id}/nodepool/{sks-nodepool-id}:evict
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SksNodepoolIdEvictRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new SksNodepoolIdEvictRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SksNodepoolIdEvictRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final UUID sksNodepoolId) {
        super(requestAdapter, "{+baseurl}/sks-cluster/{id}/nodepool/{sks%2Dnodepool%2Did}:evict", pathParameters);
        this.pathParameters.put("sks%2Dnodepool%2Did", sksNodepoolId);
    }
    /**
     * Instantiates a new SksNodepoolIdEvictRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SksNodepoolIdEvictRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sks-cluster/{id}/nodepool/{sks%2Dnodepool%2Did}:evict", rawUrl);
    }
    /**
     * This operation evicts the specified Compute instances member from the Nodepool, shrinking it to `&lt;current nodepool size&gt; - &lt;# evicted members&gt;`.
     * @param body The request body
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation put(@jakarta.annotation.Nonnull final SksNodepoolIdEvictPutRequestBody body) {
        return put(body, null);
    }
    /**
     * This operation evicts the specified Compute instances member from the Nodepool, shrinking it to `&lt;current nodepool size&gt; - &lt;# evicted members&gt;`.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation put(@jakarta.annotation.Nonnull final SksNodepoolIdEvictPutRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Operation::createFromDiscriminatorValue);
    }
    /**
     * This operation evicts the specified Compute instances member from the Nodepool, shrinking it to `&lt;current nodepool size&gt; - &lt;# evicted members&gt;`.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final SksNodepoolIdEvictPutRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * This operation evicts the specified Compute instances member from the Nodepool, shrinking it to `&lt;current nodepool size&gt; - &lt;# evicted members&gt;`.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final SksNodepoolIdEvictPutRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a SksNodepoolIdEvictRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SksNodepoolIdEvictRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SksNodepoolIdEvictRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
