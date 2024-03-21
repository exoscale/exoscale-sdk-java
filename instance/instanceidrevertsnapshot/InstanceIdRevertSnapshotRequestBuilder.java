package com.exoscale.instance.instanceidrevertsnapshot;

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
 * Builds and executes requests for operations under /instance/{instance-id}:revert-snapshot
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InstanceIdRevertSnapshotRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new InstanceIdRevertSnapshotRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InstanceIdRevertSnapshotRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final UUID instanceId) {
        super(requestAdapter, "{+baseurl}/instance/{instance%2Did}:revert-snapshot", pathParameters);
        this.pathParameters.put("instance%2Did", instanceId);
    }
    /**
     * Instantiates a new InstanceIdRevertSnapshotRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InstanceIdRevertSnapshotRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/instance/{instance%2Did}:revert-snapshot", rawUrl);
    }
    /**
     * This operation reverts the snapshot to the Compute instance volume, restoring stored data as it was at the time of the snapshot.The Compute instance must be previously stopped.
     * @param body The request body
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation post(@jakarta.annotation.Nonnull final InstanceIdRevertSnapshotPostRequestBody body) {
        return post(body, null);
    }
    /**
     * This operation reverts the snapshot to the Compute instance volume, restoring stored data as it was at the time of the snapshot.The Compute instance must be previously stopped.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation post(@jakarta.annotation.Nonnull final InstanceIdRevertSnapshotPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Operation::createFromDiscriminatorValue);
    }
    /**
     * This operation reverts the snapshot to the Compute instance volume, restoring stored data as it was at the time of the snapshot.The Compute instance must be previously stopped.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final InstanceIdRevertSnapshotPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This operation reverts the snapshot to the Compute instance volume, restoring stored data as it was at the time of the snapshot.The Compute instance must be previously stopped.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final InstanceIdRevertSnapshotPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a InstanceIdRevertSnapshotRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public InstanceIdRevertSnapshotRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new InstanceIdRevertSnapshotRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
