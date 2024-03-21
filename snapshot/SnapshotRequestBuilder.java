package com.exoscale.snapshot;

import com.exoscale.snapshot.item.SnapshotItemRequestBuilder;
import com.exoscale.snapshot.withidexport.WithIdExportRequestBuilder;
import com.exoscale.snapshot.withidpromote.WithIdPromoteRequestBuilder;
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
 * Builds and executes requests for operations under /snapshot
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SnapshotRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.snapshot.item collection
     * @param id Unique identifier of the item
     * @return a SnapshotItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SnapshotItemRequestBuilder byId(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new SnapshotItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new SnapshotRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SnapshotRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/snapshot", pathParameters);
    }
    /**
     * Instantiates a new SnapshotRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SnapshotRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/snapshot", rawUrl);
    }
    /**
     * List Snapshots
     * @return a SnapshotGetResponse
     */
    @jakarta.annotation.Nullable
    public SnapshotGetResponse get() {
        return get(null);
    }
    /**
     * List Snapshots
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SnapshotGetResponse
     */
    @jakarta.annotation.Nullable
    public SnapshotGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, SnapshotGetResponse::createFromDiscriminatorValue);
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
     * Builds and executes requests for operations under /snapshot/{id}:export
     * @return a WithIdExportRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdExportRequestBuilder withIdExport(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        return new WithIdExportRequestBuilder(pathParameters, requestAdapter, id);
    }
    /**
     * Builds and executes requests for operations under /snapshot/{id}:promote
     * @return a WithIdPromoteRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdPromoteRequestBuilder withIdPromote(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        return new WithIdPromoteRequestBuilder(pathParameters, requestAdapter, id);
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a SnapshotRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SnapshotRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SnapshotRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
