package com.exoscale.dbaaskafka.item.topic;

import com.exoscale.dbaaskafka.item.topic.aclconfig.AclConfigRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /dbaas-kafka/{dbaasKafka-id}/topic
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TopicRequestBuilder extends BaseRequestBuilder {
    /**
     * The aclConfig property
     */
    @jakarta.annotation.Nonnull
    public AclConfigRequestBuilder aclConfig() {
        return new AclConfigRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new TopicRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TopicRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-kafka/{dbaasKafka%2Did}/topic", pathParameters);
    }
    /**
     * Instantiates a new TopicRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TopicRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-kafka/{dbaasKafka%2Did}/topic", rawUrl);
    }
}
