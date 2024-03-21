package com.exoscale.dbaasmysql.item.database;

import com.exoscale.dbaasmysql.item.database.item.DatabaseNameItemRequestBuilder;
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
 * Builds and executes requests for operations under /dbaas-mysql/{dbaasMysql-id}/database
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DatabaseRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.dbaasMysql.item.database.item collection
     * @param databaseName Unique identifier of the item
     * @return a DatabaseNameItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DatabaseNameItemRequestBuilder byDatabaseName(@jakarta.annotation.Nonnull final String databaseName) {
        Objects.requireNonNull(databaseName);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("database%2Dname", databaseName);
        return new DatabaseNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DatabaseRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DatabaseRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-mysql/{dbaasMysql%2Did}/database", pathParameters);
    }
    /**
     * Instantiates a new DatabaseRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DatabaseRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-mysql/{dbaasMysql%2Did}/database", rawUrl);
    }
    /**
     * null
     * @param body The request body
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation post(@jakarta.annotation.Nonnull final DatabasePostRequestBody body) {
        return post(body, null);
    }
    /**
     * null
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation post(@jakarta.annotation.Nonnull final DatabasePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DatabasePostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * null
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DatabasePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a DatabaseRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DatabaseRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DatabaseRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
