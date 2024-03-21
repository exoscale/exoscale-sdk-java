package com.exoscale.blockstoragesnapshot;

import com.exoscale.blockstoragesnapshot.item.BlockStorageSnapshotItemRequestBuilder;
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
 * Builds and executes requests for operations under /block-storage-snapshot
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BlockStorageSnapshotRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.blockStorageSnapshot.item collection
     * @param id Unique identifier of the item
     * @return a BlockStorageSnapshotItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public BlockStorageSnapshotItemRequestBuilder byId(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new BlockStorageSnapshotItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new BlockStorageSnapshotRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BlockStorageSnapshotRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/block-storage-snapshot", pathParameters);
    }
    /**
     * Instantiates a new BlockStorageSnapshotRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BlockStorageSnapshotRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/block-storage-snapshot", rawUrl);
    }
    /**
     * List block storage snapshots
     * @return a BlockStorageSnapshotGetResponse
     */
    @jakarta.annotation.Nullable
    public BlockStorageSnapshotGetResponse get() {
        return get(null);
    }
    /**
     * List block storage snapshots
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a BlockStorageSnapshotGetResponse
     */
    @jakarta.annotation.Nullable
    public BlockStorageSnapshotGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, BlockStorageSnapshotGetResponse::createFromDiscriminatorValue);
    }
    /**
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a BlockStorageSnapshotRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public BlockStorageSnapshotRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BlockStorageSnapshotRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
