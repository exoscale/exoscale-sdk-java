package com.exoscale.dbaasopensearch.item.maintenance;

import com.exoscale.dbaasopensearch.item.maintenance.start.StartRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /dbaas-opensearch/{dbaasOpensearch-id}/maintenance
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MaintenanceRequestBuilder extends BaseRequestBuilder {
    /**
     * The start property
     */
    @jakarta.annotation.Nonnull
    public StartRequestBuilder start() {
        return new StartRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new MaintenanceRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MaintenanceRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-opensearch/{dbaasOpensearch%2Did}/maintenance", pathParameters);
    }
    /**
     * Instantiates a new MaintenanceRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MaintenanceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-opensearch/{dbaasOpensearch%2Did}/maintenance", rawUrl);
    }
}
