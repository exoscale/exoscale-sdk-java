package com.exoscale.dbaaspostgres.item.user;

import com.exoscale.dbaaspostgres.item.user.item.WithUsernameItemRequestBuilder;
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
/**
 * Builds and executes requests for operations under /dbaas-postgres/{dbaasPostgres-id}/user
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.dbaasPostgres.item.user.item collection
     * @param username Unique identifier of the item
     * @return a WithUsernameItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithUsernameItemRequestBuilder byUsername(@jakarta.annotation.Nonnull final String username) {
        Objects.requireNonNull(username);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("username", username);
        return new WithUsernameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new UserRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-postgres/{dbaasPostgres%2Did}/user", pathParameters);
    }
    /**
     * Instantiates a new UserRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-postgres/{dbaasPostgres%2Did}/user", rawUrl);
    }
    /**
     * null
     * @param body The request body
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation post(@jakarta.annotation.Nonnull final UserPostRequestBody body) {
        return post(body, null);
    }
    /**
     * null
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation post(@jakarta.annotation.Nonnull final UserPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Operation::createFromDiscriminatorValue);
    }
    /**
     * null
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UserPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * null
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UserPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a UserRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public UserRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UserRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
