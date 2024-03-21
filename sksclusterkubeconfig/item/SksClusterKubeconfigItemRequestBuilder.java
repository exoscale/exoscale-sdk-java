package com.exoscale.sksclusterkubeconfig.item;

import com.exoscale.models.SksKubeconfigRequest;
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
/**
 * Builds and executes requests for operations under /sks-cluster-kubeconfig/{id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SksClusterKubeconfigItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new SksClusterKubeconfigItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SksClusterKubeconfigItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sks-cluster-kubeconfig/{id}", pathParameters);
    }
    /**
     * Instantiates a new SksClusterKubeconfigItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SksClusterKubeconfigItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sks-cluster-kubeconfig/{id}", rawUrl);
    }
    /**
     * This operation returns a Kubeconfig file encoded in base64.
     * @param body Kubeconfig request for a SKS cluster
     * @return a SksClusterKubeconfigPostResponse
     */
    @jakarta.annotation.Nullable
    public SksClusterKubeconfigPostResponse post(@jakarta.annotation.Nonnull final SksKubeconfigRequest body) {
        return post(body, null);
    }
    /**
     * This operation returns a Kubeconfig file encoded in base64.
     * @param body Kubeconfig request for a SKS cluster
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SksClusterKubeconfigPostResponse
     */
    @jakarta.annotation.Nullable
    public SksClusterKubeconfigPostResponse post(@jakarta.annotation.Nonnull final SksKubeconfigRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, SksClusterKubeconfigPostResponse::createFromDiscriminatorValue);
    }
    /**
     * This operation returns a Kubeconfig file encoded in base64.
     * @param body Kubeconfig request for a SKS cluster
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SksKubeconfigRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This operation returns a Kubeconfig file encoded in base64.
     * @param body Kubeconfig request for a SKS cluster
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SksKubeconfigRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a SksClusterKubeconfigItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SksClusterKubeconfigItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SksClusterKubeconfigItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
