package com.exoscale.dnsdomain;

import com.exoscale.dnsdomain.item.DnsDomainItemRequestBuilder;
import com.exoscale.models.DnsDomain;
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
 * Builds and executes requests for operations under /dns-domain
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DnsDomainRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.dnsDomain.item collection
     * @param dnsDomainId Unique identifier of the item
     * @return a DnsDomainItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DnsDomainItemRequestBuilder byDnsDomainId(@jakarta.annotation.Nonnull final UUID dnsDomainId) {
        Objects.requireNonNull(dnsDomainId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("dnsDomain%2Did", dnsDomainId);
        return new DnsDomainItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DnsDomainRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DnsDomainRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dns-domain", pathParameters);
    }
    /**
     * Instantiates a new DnsDomainRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DnsDomainRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dns-domain", rawUrl);
    }
    /**
     * List DNS domains
     * @return a DnsDomainGetResponse
     */
    @jakarta.annotation.Nullable
    public DnsDomainGetResponse get() {
        return get(null);
    }
    /**
     * List DNS domains
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a DnsDomainGetResponse
     */
    @jakarta.annotation.Nullable
    public DnsDomainGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, DnsDomainGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Create DNS domain
     * @param body DNS Domain
     * @return a DnsDomain
     */
    @jakarta.annotation.Nullable
    public DnsDomain post(@jakarta.annotation.Nonnull final DnsDomainPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Create DNS domain
     * @param body DNS Domain
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a DnsDomain
     */
    @jakarta.annotation.Nullable
    public DnsDomain post(@jakarta.annotation.Nonnull final DnsDomainPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, DnsDomain::createFromDiscriminatorValue);
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
     * @param body DNS Domain
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DnsDomainPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * @param body DNS Domain
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DnsDomainPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a DnsDomainRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DnsDomainRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DnsDomainRequestBuilder(rawUrl, requestAdapter);
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
