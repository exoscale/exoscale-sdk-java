package com.exoscale.dbaastaskmigrationcheck;

import com.exoscale.dbaastaskmigrationcheck.item.WithServiceItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /dbaas-task-migration-check
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasTaskMigrationCheckRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.dbaasTaskMigrationCheck.item collection
     * @param service Unique identifier of the item
     * @return a WithServiceItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithServiceItemRequestBuilder byService(@jakarta.annotation.Nonnull final String service) {
        Objects.requireNonNull(service);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("service", service);
        return new WithServiceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DbaasTaskMigrationCheckRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbaasTaskMigrationCheckRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-task-migration-check", pathParameters);
    }
    /**
     * Instantiates a new DbaasTaskMigrationCheckRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbaasTaskMigrationCheckRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-task-migration-check", rawUrl);
    }
}
