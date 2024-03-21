package com.exoscale.dbaaspostgres;

import com.exoscale.dbaaspostgres.item.DbaasPostgresItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /dbaas-postgres
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasPostgresRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.dbaasPostgres.item collection
     * @param dbaasPostgresId Unique identifier of the item
     * @return a DbaasPostgresItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DbaasPostgresItemRequestBuilder byDbaasPostgresId(@jakarta.annotation.Nonnull final String dbaasPostgresId) {
        Objects.requireNonNull(dbaasPostgresId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("dbaasPostgres%2Did", dbaasPostgresId);
        return new DbaasPostgresItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DbaasPostgresRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbaasPostgresRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-postgres", pathParameters);
    }
    /**
     * Instantiates a new DbaasPostgresRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbaasPostgresRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-postgres", rawUrl);
    }
}
