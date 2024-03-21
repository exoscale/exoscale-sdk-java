package com.exoscale.skscluster.item.inspection;

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
 * Builds and executes requests for operations under /sks-cluster/{id}/inspection
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InspectionRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new InspectionRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InspectionRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sks-cluster/{id}/inspection", pathParameters);
    }
    /**
     * Instantiates a new InspectionRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InspectionRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sks-cluster/{id}/inspection", rawUrl);
    }
    /**
     * Helps troubleshoot common problems when deploying a kubernetes cluster. Inspections run every couple of minutes.
     * @return a InspectionGetResponse
     */
    @jakarta.annotation.Nullable
    public InspectionGetResponse get() {
        return get(null);
    }
    /**
     * Helps troubleshoot common problems when deploying a kubernetes cluster. Inspections run every couple of minutes.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a InspectionGetResponse
     */
    @jakarta.annotation.Nullable
    public InspectionGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, InspectionGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Helps troubleshoot common problems when deploying a kubernetes cluster. Inspections run every couple of minutes.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Helps troubleshoot common problems when deploying a kubernetes cluster. Inspections run every couple of minutes.
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
     * @return a InspectionRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public InspectionRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new InspectionRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
