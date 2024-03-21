package com.exoscale.dbaassettingsopensearch;

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
 * Builds and executes requests for operations under /dbaas-settings-opensearch
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasSettingsOpensearchRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new DbaasSettingsOpensearchRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbaasSettingsOpensearchRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-settings-opensearch", pathParameters);
    }
    /**
     * Instantiates a new DbaasSettingsOpensearchRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbaasSettingsOpensearchRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-settings-opensearch", rawUrl);
    }
    /**
     * Get DBaaS OpenSearch settings
     * @return a DbaasSettingsOpensearchGetResponse
     */
    @jakarta.annotation.Nullable
    public DbaasSettingsOpensearchGetResponse get() {
        return get(null);
    }
    /**
     * Get DBaaS OpenSearch settings
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a DbaasSettingsOpensearchGetResponse
     */
    @jakarta.annotation.Nullable
    public DbaasSettingsOpensearchGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, DbaasSettingsOpensearchGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Get DBaaS OpenSearch settings
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get DBaaS OpenSearch settings
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a DbaasSettingsOpensearchRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DbaasSettingsOpensearchRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DbaasSettingsOpensearchRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
