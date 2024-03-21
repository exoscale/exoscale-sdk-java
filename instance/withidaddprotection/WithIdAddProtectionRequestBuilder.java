package com.exoscale.instance.withidaddprotection;

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
 * Builds and executes requests for operations under /instance/{id}:add-protection
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithIdAddProtectionRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new WithIdAddProtectionRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithIdAddProtectionRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter, @jakarta.annotation.Nullable final UUID id) {
        super(requestAdapter, "{+baseurl}/instance/{id}:add-protection", pathParameters);
        this.pathParameters.put("id", id);
    }
    /**
     * Instantiates a new WithIdAddProtectionRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithIdAddProtectionRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/instance/{id}:add-protection", rawUrl);
    }
    /**
     * Set instance destruction protection
     * @return a WithIdAddProtectionPutResponse
     */
    @jakarta.annotation.Nullable
    public WithIdAddProtectionPutResponse put() {
        return put(null);
    }
    /**
     * Set instance destruction protection
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a WithIdAddProtectionPutResponse
     */
    @jakarta.annotation.Nullable
    public WithIdAddProtectionPutResponse put(@jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPutRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, WithIdAddProtectionPutResponse::createFromDiscriminatorValue);
    }
    /**
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation() {
        return toPutRequestInformation(null);
    }
    /**
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a WithIdAddProtectionRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdAddProtectionRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithIdAddProtectionRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
