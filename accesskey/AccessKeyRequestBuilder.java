package com.exoscale.accesskey;

import com.exoscale.accesskey.item.WithKeyItemRequestBuilder;
import com.exoscale.models.AccessKey;
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
 * Builds and executes requests for operations under /access-key
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessKeyRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.accessKey.item collection
     * @param key Unique identifier of the item
     * @return a WithKeyItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithKeyItemRequestBuilder byKey(@jakarta.annotation.Nonnull final String key) {
        Objects.requireNonNull(key);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("key", key);
        return new WithKeyItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new AccessKeyRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AccessKeyRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/access-key", pathParameters);
    }
    /**
     * Instantiates a new AccessKeyRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AccessKeyRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/access-key", rawUrl);
    }
    /**
     * List IAM Access Keys
     * @return a AccessKeyGetResponse
     */
    @jakarta.annotation.Nullable
    public AccessKeyGetResponse get() {
        return get(null);
    }
    /**
     * List IAM Access Keys
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AccessKeyGetResponse
     */
    @jakarta.annotation.Nullable
    public AccessKeyGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AccessKeyGetResponse::createFromDiscriminatorValue);
    }
    /**
     * This operation creates a legacy IAM Access Key, to create a key for use with IAM roles use the api-key endpoint.The corresponding secret is only available in the response returned by this operation, the caller must take care of storing it safely as there is no other way to retrieve it.
     * @param body IAM Access Key
     * @return a AccessKey
     */
    @jakarta.annotation.Nullable
    public AccessKey post(@jakarta.annotation.Nonnull final AccessKeyPostRequestBody body) {
        return post(body, null);
    }
    /**
     * This operation creates a legacy IAM Access Key, to create a key for use with IAM roles use the api-key endpoint.The corresponding secret is only available in the response returned by this operation, the caller must take care of storing it safely as there is no other way to retrieve it.
     * @param body IAM Access Key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AccessKey
     */
    @jakarta.annotation.Nullable
    public AccessKey post(@jakarta.annotation.Nonnull final AccessKeyPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AccessKey::createFromDiscriminatorValue);
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
     * This operation creates a legacy IAM Access Key, to create a key for use with IAM roles use the api-key endpoint.The corresponding secret is only available in the response returned by this operation, the caller must take care of storing it safely as there is no other way to retrieve it.
     * @param body IAM Access Key
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AccessKeyPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This operation creates a legacy IAM Access Key, to create a key for use with IAM roles use the api-key endpoint.The corresponding secret is only available in the response returned by this operation, the caller must take care of storing it safely as there is no other way to retrieve it.
     * @param body IAM Access Key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AccessKeyPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a AccessKeyRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AccessKeyRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AccessKeyRequestBuilder(rawUrl, requestAdapter);
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
