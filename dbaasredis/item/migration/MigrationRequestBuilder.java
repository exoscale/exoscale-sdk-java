package com.exoscale.dbaasredis.item.migration;

import com.exoscale.dbaasredis.item.migration.stop.StopRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /dbaas-redis/{name}/migration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MigrationRequestBuilder extends BaseRequestBuilder {
    /**
     * The stop property
     */
    @jakarta.annotation.Nonnull
    public StopRequestBuilder stop() {
        return new StopRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new MigrationRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MigrationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-redis/{name}/migration", pathParameters);
    }
    /**
     * Instantiates a new MigrationRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MigrationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-redis/{name}/migration", rawUrl);
    }
}
