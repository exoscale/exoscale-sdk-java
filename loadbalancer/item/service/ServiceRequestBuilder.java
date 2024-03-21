package com.exoscale.loadbalancer.item.service;

import com.exoscale.loadbalancer.item.service.item.ServiceItemRequestBuilder;
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
 * Builds and executes requests for operations under /load-balancer/{id}/service
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServiceRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.loadBalancer.item.service.item collection
     * @param serviceId Unique identifier of the item
     * @return a ServiceItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ServiceItemRequestBuilder byServiceId(@jakarta.annotation.Nonnull final UUID serviceId) {
        Objects.requireNonNull(serviceId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("service%2Did", serviceId);
        return new ServiceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ServiceRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ServiceRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/load-balancer/{id}/service", pathParameters);
    }
    /**
     * Instantiates a new ServiceRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ServiceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/load-balancer/{id}/service", rawUrl);
    }
    /**
     * Add a Load Balancer Service
     * @param body The request body
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation post(@jakarta.annotation.Nonnull final ServicePostRequestBody body) {
        return post(body, null);
    }
    /**
     * Add a Load Balancer Service
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation post(@jakarta.annotation.Nonnull final ServicePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Operation::createFromDiscriminatorValue);
    }
    /**
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServicePostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ServicePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a ServiceRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ServiceRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ServiceRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
