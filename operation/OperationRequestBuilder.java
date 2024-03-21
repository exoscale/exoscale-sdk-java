package com.exoscale.operation;

import com.exoscale.operation.item.OperationItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
/**
 * Builds and executes requests for operations under /operation
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OperationRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.operation.item collection
     * @param id Unique identifier of the item
     * @return a OperationItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public OperationItemRequestBuilder byId(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new OperationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new OperationRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OperationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/operation", pathParameters);
    }
    /**
     * Instantiates a new OperationRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public OperationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/operation", rawUrl);
    }
}
