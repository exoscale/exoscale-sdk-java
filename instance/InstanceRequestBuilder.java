package com.exoscale.instance;

import com.exoscale.instance.instanceidrevertsnapshot.InstanceIdRevertSnapshotRequestBuilder;
import com.exoscale.instance.item.InstanceItemRequestBuilder;
import com.exoscale.instance.withidaddprotection.WithIdAddProtectionRequestBuilder;
import com.exoscale.instance.withidcreatesnapshot.WithIdCreateSnapshotRequestBuilder;
import com.exoscale.instance.withidpassword.WithIdPasswordRequestBuilder;
import com.exoscale.instance.withidreboot.WithIdRebootRequestBuilder;
import com.exoscale.instance.withidremoveprotection.WithIdRemoveProtectionRequestBuilder;
import com.exoscale.instance.withidreset.WithIdResetRequestBuilder;
import com.exoscale.instance.withidresetpassword.WithIdResetPasswordRequestBuilder;
import com.exoscale.instance.withidresizedisk.WithIdResizeDiskRequestBuilder;
import com.exoscale.instance.withidscale.WithIdScaleRequestBuilder;
import com.exoscale.instance.withidstart.WithIdStartRequestBuilder;
import com.exoscale.instance.withidstop.WithIdStopRequestBuilder;
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
 * Builds and executes requests for operations under /instance
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InstanceRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.instance.item collection
     * @param id Unique identifier of the item
     * @return a InstanceItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public InstanceItemRequestBuilder byId(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new InstanceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new InstanceRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InstanceRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/instance{?ip%2Daddress*,manager%2Did*,manager%2Dtype*}", pathParameters);
    }
    /**
     * Instantiates a new InstanceRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InstanceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/instance{?ip%2Daddress*,manager%2Did*,manager%2Dtype*}", rawUrl);
    }
    /**
     * List Compute instances
     * @return a InstanceGetResponse
     */
    @jakarta.annotation.Nullable
    public InstanceGetResponse get() {
        return get(null);
    }
    /**
     * List Compute instances
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a InstanceGetResponse
     */
    @jakarta.annotation.Nullable
    public InstanceGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, InstanceGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Builds and executes requests for operations under /instance/{instance-id}:revert-snapshot
     * @return a InstanceIdRevertSnapshotRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public InstanceIdRevertSnapshotRequestBuilder instanceIdRevertSnapshot(@jakarta.annotation.Nonnull final UUID instanceId) {
        Objects.requireNonNull(instanceId);
        return new InstanceIdRevertSnapshotRequestBuilder(pathParameters, requestAdapter, instanceId);
    }
    /**
     * Create a Compute instance
     * @param body The request body
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation post(@jakarta.annotation.Nonnull final InstancePostRequestBody body) {
        return post(body, null);
    }
    /**
     * Create a Compute instance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation post(@jakarta.annotation.Nonnull final InstancePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final InstancePostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final InstancePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Builds and executes requests for operations under /instance/{id}:add-protection
     * @return a WithIdAddProtectionRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdAddProtectionRequestBuilder withIdAddProtection(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        return new WithIdAddProtectionRequestBuilder(pathParameters, requestAdapter, id);
    }
    /**
     * Builds and executes requests for operations under /instance/{id}:create-snapshot
     * @return a WithIdCreateSnapshotRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdCreateSnapshotRequestBuilder withIdCreateSnapshot(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        return new WithIdCreateSnapshotRequestBuilder(pathParameters, requestAdapter, id);
    }
    /**
     * Builds and executes requests for operations under /instance/{id}:password
     * @return a WithIdPasswordRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdPasswordRequestBuilder withIdPassword(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        return new WithIdPasswordRequestBuilder(pathParameters, requestAdapter, id);
    }
    /**
     * Builds and executes requests for operations under /instance/{id}:reboot
     * @return a WithIdRebootRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdRebootRequestBuilder withIdReboot(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        return new WithIdRebootRequestBuilder(pathParameters, requestAdapter, id);
    }
    /**
     * Builds and executes requests for operations under /instance/{id}:remove-protection
     * @return a WithIdRemoveProtectionRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdRemoveProtectionRequestBuilder withIdRemoveProtection(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        return new WithIdRemoveProtectionRequestBuilder(pathParameters, requestAdapter, id);
    }
    /**
     * Builds and executes requests for operations under /instance/{id}:reset
     * @return a WithIdResetRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdResetRequestBuilder withIdReset(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        return new WithIdResetRequestBuilder(pathParameters, requestAdapter, id);
    }
    /**
     * Builds and executes requests for operations under /instance/{id}:reset-password
     * @return a WithIdResetPasswordRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdResetPasswordRequestBuilder withIdResetPassword(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        return new WithIdResetPasswordRequestBuilder(pathParameters, requestAdapter, id);
    }
    /**
     * Builds and executes requests for operations under /instance/{id}:resize-disk
     * @return a WithIdResizeDiskRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdResizeDiskRequestBuilder withIdResizeDisk(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        return new WithIdResizeDiskRequestBuilder(pathParameters, requestAdapter, id);
    }
    /**
     * Builds and executes requests for operations under /instance/{id}:scale
     * @return a WithIdScaleRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdScaleRequestBuilder withIdScale(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        return new WithIdScaleRequestBuilder(pathParameters, requestAdapter, id);
    }
    /**
     * Builds and executes requests for operations under /instance/{id}:start
     * @return a WithIdStartRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdStartRequestBuilder withIdStart(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        return new WithIdStartRequestBuilder(pathParameters, requestAdapter, id);
    }
    /**
     * Builds and executes requests for operations under /instance/{id}:stop
     * @return a WithIdStopRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdStopRequestBuilder withIdStop(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        return new WithIdStopRequestBuilder(pathParameters, requestAdapter, id);
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a InstanceRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public InstanceRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new InstanceRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * List Compute instances
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public String ipAddress;
        @jakarta.annotation.Nullable
        public UUID managerId;
        @jakarta.annotation.Nullable
        public GetManagerTypeQueryParameterType managerType;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("manager%2Dtype", managerType);
            allQueryParams.put("ip%2Daddress", ipAddress);
            allQueryParams.put("manager%2Did", managerId);
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
