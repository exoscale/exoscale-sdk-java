package com.exoscale.apikey;

import com.exoscale.apikey.item.ApiKeyItemRequestBuilder;
import com.exoscale.models.IamApiKeyCreated;
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
 * Builds and executes requests for operations under /api-key
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApiKeyRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.apiKey.item collection
     * @param id Unique identifier of the item
     * @return a ApiKeyItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ApiKeyItemRequestBuilder byId(@jakarta.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new ApiKeyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ApiKeyRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ApiKeyRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/api-key", pathParameters);
    }
    /**
     * Instantiates a new ApiKeyRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ApiKeyRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/api-key", rawUrl);
    }
    /**
     * null
     * @return a ApiKeyGetResponse
     */
    @jakarta.annotation.Nullable
    public ApiKeyGetResponse get() {
        return get(null);
    }
    /**
     * null
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ApiKeyGetResponse
     */
    @jakarta.annotation.Nullable
    public ApiKeyGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ApiKeyGetResponse::createFromDiscriminatorValue);
    }
    /**
     * null
     * @param body The request body
     * @return a IamApiKeyCreated
     */
    @jakarta.annotation.Nullable
    public IamApiKeyCreated post(@jakarta.annotation.Nonnull final ApiKeyPostRequestBody body) {
        return post(body, null);
    }
    /**
     * null
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a IamApiKeyCreated
     */
    @jakarta.annotation.Nullable
    public IamApiKeyCreated post(@jakarta.annotation.Nonnull final ApiKeyPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, IamApiKeyCreated::createFromDiscriminatorValue);
    }
    /**
     * null
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * null
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
     * null
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ApiKeyPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * null
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ApiKeyPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a ApiKeyRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ApiKeyRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ApiKeyRequestBuilder(rawUrl, requestAdapter);
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
