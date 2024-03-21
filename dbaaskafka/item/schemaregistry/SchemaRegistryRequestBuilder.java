package com.exoscale.dbaaskafka.item.schemaregistry;

import com.exoscale.dbaaskafka.item.schemaregistry.aclconfig.AclConfigRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /dbaas-kafka/{dbaasKafka-id}/schema-registry
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SchemaRegistryRequestBuilder extends BaseRequestBuilder {
    /**
     * The aclConfig property
     */
    @jakarta.annotation.Nonnull
    public AclConfigRequestBuilder aclConfig() {
        return new AclConfigRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new SchemaRegistryRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SchemaRegistryRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-kafka/{dbaasKafka%2Did}/schema-registry", pathParameters);
    }
    /**
     * Instantiates a new SchemaRegistryRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SchemaRegistryRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-kafka/{dbaasKafka%2Did}/schema-registry", rawUrl);
    }
}
