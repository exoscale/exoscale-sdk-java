package com.exoscale.dbaasmysql;

import com.exoscale.dbaasmysql.item.DbaasMysqlItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /dbaas-mysql
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasMysqlRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.dbaasMysql.item collection
     * @param dbaasMysqlId Unique identifier of the item
     * @return a DbaasMysqlItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DbaasMysqlItemRequestBuilder byDbaasMysqlId(@jakarta.annotation.Nonnull final String dbaasMysqlId) {
        Objects.requireNonNull(dbaasMysqlId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("dbaasMysql%2Did", dbaasMysqlId);
        return new DbaasMysqlItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DbaasMysqlRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbaasMysqlRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-mysql", pathParameters);
    }
    /**
     * Instantiates a new DbaasMysqlRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbaasMysqlRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-mysql", rawUrl);
    }
}
