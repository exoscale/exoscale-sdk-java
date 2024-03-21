package com.exoscale.dbaaskafka;

import com.exoscale.dbaaskafka.item.DbaasKafkaItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /dbaas-kafka
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasKafkaRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.dbaasKafka.item collection
     * @param dbaasKafkaId Unique identifier of the item
     * @return a DbaasKafkaItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DbaasKafkaItemRequestBuilder byDbaasKafkaId(@jakarta.annotation.Nonnull final String dbaasKafkaId) {
        Objects.requireNonNull(dbaasKafkaId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("dbaasKafka%2Did", dbaasKafkaId);
        return new DbaasKafkaItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DbaasKafkaRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbaasKafkaRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-kafka", pathParameters);
    }
    /**
     * Instantiates a new DbaasKafkaRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbaasKafkaRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-kafka", rawUrl);
    }
}
