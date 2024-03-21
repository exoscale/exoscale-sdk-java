package com.exoscale.blockstorage.withidresizevolume;

import com.exoscale.models.BlockStorageVolume;
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
 * Builds and executes requests for operations under /block-storage/{id}:resize-volume
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithIdResizeVolumeRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new WithIdResizeVolumeRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithIdResizeVolumeRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final UUID id) {
        super(requestAdapter, "{+baseurl}/block-storage/{id}:resize-volume", pathParameters);
        this.pathParameters.put("id", id);
    }
    /**
     * Instantiates a new WithIdResizeVolumeRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithIdResizeVolumeRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/block-storage/{id}:resize-volume", rawUrl);
    }
    /**
     * This operation resizes a Block storage volume. Note: the volume can only grow, cannot be shrunk.
     * @param body The request body
     * @return a BlockStorageVolume
     */
    @jakarta.annotation.Nullable
    public BlockStorageVolume put(@jakarta.annotation.Nonnull final WithIdResizeVolumePutRequestBody body) {
        return put(body, null);
    }
    /**
     * This operation resizes a Block storage volume. Note: the volume can only grow, cannot be shrunk.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a BlockStorageVolume
     */
    @jakarta.annotation.Nullable
    public BlockStorageVolume put(@jakarta.annotation.Nonnull final WithIdResizeVolumePutRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, BlockStorageVolume::createFromDiscriminatorValue);
    }
    /**
     * This operation resizes a Block storage volume. Note: the volume can only grow, cannot be shrunk.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final WithIdResizeVolumePutRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * This operation resizes a Block storage volume. Note: the volume can only grow, cannot be shrunk.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final WithIdResizeVolumePutRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a WithIdResizeVolumeRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdResizeVolumeRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithIdResizeVolumeRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
