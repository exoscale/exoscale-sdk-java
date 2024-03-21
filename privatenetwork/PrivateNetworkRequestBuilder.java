package com.exoscale.privatenetwork;

import com.exoscale.models.Operation;
import com.exoscale.privatenetwork.item.PrivateNetworkItemRequestBuilder;
import com.exoscale.privatenetwork.withidattach.WithIdAttachRequestBuilder;
import com.exoscale.privatenetwork.withiddetach.WithIdDetachRequestBuilder;
import com.exoscale.privatenetwork.withidupdateip.WithIdUpdateIpRequestBuilder;
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
 * Builds and executes requests for operations under /private-network
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PrivateNetworkRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.privateNetwork.item collection
     * @param id Unique identifier of the item
     * @return a PrivateNetworkItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public PrivateNetworkItemRequestBuilder byId(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new PrivateNetworkItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new PrivateNetworkRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PrivateNetworkRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/private-network", pathParameters);
    }
    /**
     * Instantiates a new PrivateNetworkRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PrivateNetworkRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/private-network", rawUrl);
    }
    /**
     * List Private Networks
     * @return a PrivateNetworkGetResponse
     */
    @jakarta.annotation.Nullable
    public PrivateNetworkGetResponse get() {
        return get(null);
    }
    /**
     * List Private Networks
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a PrivateNetworkGetResponse
     */
    @jakarta.annotation.Nullable
    public PrivateNetworkGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, PrivateNetworkGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a Private Network
     * @param body The request body
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation post(@jakarta.annotation.Nonnull final PrivateNetworkPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Create a Private Network
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation post(@jakarta.annotation.Nonnull final PrivateNetworkPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PrivateNetworkPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PrivateNetworkPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Builds and executes requests for operations under /private-network/{id}:attach
     * @return a WithIdAttachRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdAttachRequestBuilder withIdAttach(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        return new WithIdAttachRequestBuilder(pathParameters, requestAdapter, id);
    }
    /**
     * Builds and executes requests for operations under /private-network/{id}:detach
     * @return a WithIdDetachRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdDetachRequestBuilder withIdDetach(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        return new WithIdDetachRequestBuilder(pathParameters, requestAdapter, id);
    }
    /**
     * Builds and executes requests for operations under /private-network/{id}:update-ip
     * @return a WithIdUpdateIpRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdUpdateIpRequestBuilder withIdUpdateIp(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        return new WithIdUpdateIpRequestBuilder(pathParameters, requestAdapter, id);
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a PrivateNetworkRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public PrivateNetworkRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PrivateNetworkRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
