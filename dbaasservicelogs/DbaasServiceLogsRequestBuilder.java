package com.exoscale.dbaasservicelogs;

import com.exoscale.dbaasservicelogs.item.ServiceNameItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /dbaas-service-logs
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasServiceLogsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.dbaasServiceLogs.item collection
     * @param serviceName Unique identifier of the item
     * @return a ServiceNameItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ServiceNameItemRequestBuilder byServiceName(@jakarta.annotation.Nonnull final String serviceName) {
        Objects.requireNonNull(serviceName);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("service%2Dname", serviceName);
        return new ServiceNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DbaasServiceLogsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbaasServiceLogsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-service-logs", pathParameters);
    }
    /**
     * Instantiates a new DbaasServiceLogsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbaasServiceLogsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-service-logs", rawUrl);
    }
}
