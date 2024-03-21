package com.exoscale.dbaaspostgres.item.upgradecheck;

import com.exoscale.models.DbaasTask;
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
 * Builds and executes requests for operations under /dbaas-postgres/{dbaasPostgres-id}/upgrade-check
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpgradeCheckRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new UpgradeCheckRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpgradeCheckRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-postgres/{dbaasPostgres%2Did}/upgrade-check", pathParameters);
    }
    /**
     * Instantiates a new UpgradeCheckRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpgradeCheckRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-postgres/{dbaasPostgres%2Did}/upgrade-check", rawUrl);
    }
    /**
     * Check whether you can upgrade Postgres service to a newer version
     * @param body The request body
     * @return a DbaasTask
     */
    @jakarta.annotation.Nullable
    public DbaasTask post(@jakarta.annotation.Nonnull final UpgradeCheckPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Check whether you can upgrade Postgres service to a newer version
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a DbaasTask
     */
    @jakarta.annotation.Nullable
    public DbaasTask post(@jakarta.annotation.Nonnull final UpgradeCheckPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, DbaasTask::createFromDiscriminatorValue);
    }
    /**
     * Check whether you can upgrade Postgres service to a newer version
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpgradeCheckPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Check whether you can upgrade Postgres service to a newer version
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpgradeCheckPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a UpgradeCheckRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public UpgradeCheckRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UpgradeCheckRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
