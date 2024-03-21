package com.exoscale.blockstorage;

import com.exoscale.blockstorage.item.BlockStorageItemRequestBuilder;
import com.exoscale.blockstorage.withidattach.WithIdAttachRequestBuilder;
import com.exoscale.blockstorage.withidcreatesnapshot.WithIdCreateSnapshotRequestBuilder;
import com.exoscale.blockstorage.withiddetach.WithIdDetachRequestBuilder;
import com.exoscale.blockstorage.withidresizevolume.WithIdResizeVolumeRequestBuilder;
import com.exoscale.models.Operation;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Builds and executes requests for operations under /block-storage
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BlockStorageRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.blockStorage.item collection
     * @param id Unique identifier of the item
     * @return a BlockStorageItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public BlockStorageItemRequestBuilder byId(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new BlockStorageItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new BlockStorageRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BlockStorageRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/block-storage{?instance%2Did*}", pathParameters);
    }
    /**
     * Instantiates a new BlockStorageRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BlockStorageRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/block-storage{?instance%2Did*}", rawUrl);
    }
    /**
     * List block storage volumes
     * @return a BlockStorageGetResponse
     */
    @jakarta.annotation.Nullable
    public BlockStorageGetResponse get() {
        return get(null);
    }
    /**
     * List block storage volumes
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a BlockStorageGetResponse
     */
    @jakarta.annotation.Nullable
    public BlockStorageGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, BlockStorageGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a block storage volume
     * @param body The request body
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation post(@jakarta.annotation.Nonnull final BlockStoragePostRequestBody body) {
        return post(body, null);
    }
    /**
     * Create a block storage volume
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation post(@jakarta.annotation.Nonnull final BlockStoragePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Operation::createFromDiscriminatorValue);
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
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BlockStoragePostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BlockStoragePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Builds and executes requests for operations under /block-storage/{id}:attach
     * @return a WithIdAttachRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdAttachRequestBuilder withIdAttach(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        return new WithIdAttachRequestBuilder(pathParameters, requestAdapter, id);
    }
    /**
     * Builds and executes requests for operations under /block-storage/{id}:create-snapshot
     * @return a WithIdCreateSnapshotRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdCreateSnapshotRequestBuilder withIdCreateSnapshot(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        return new WithIdCreateSnapshotRequestBuilder(pathParameters, requestAdapter, id);
    }
    /**
     * Builds and executes requests for operations under /block-storage/{id}:detach
     * @return a WithIdDetachRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdDetachRequestBuilder withIdDetach(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        return new WithIdDetachRequestBuilder(pathParameters, requestAdapter, id);
    }
    /**
     * Builds and executes requests for operations under /block-storage/{id}:resize-volume
     * @return a WithIdResizeVolumeRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdResizeVolumeRequestBuilder withIdResizeVolume(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        return new WithIdResizeVolumeRequestBuilder(pathParameters, requestAdapter, id);
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a BlockStorageRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public BlockStorageRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BlockStorageRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * List block storage volumes
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public UUID instanceId;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("instance%2Did", instanceId);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
