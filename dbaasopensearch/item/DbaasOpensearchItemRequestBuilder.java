package com.exoscale.dbaasopensearch.item;

import com.exoscale.dbaasopensearch.item.aclconfig.AclConfigRequestBuilder;
import com.exoscale.dbaasopensearch.item.maintenance.MaintenanceRequestBuilder;
import com.exoscale.dbaasopensearch.item.user.UserRequestBuilder;
import com.exoscale.models.DbaasServiceOpensearch;
import com.exoscale.models.Operation;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /dbaas-opensearch/{dbaasOpensearch-id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DbaasOpensearchItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The aclConfig property
     */
    @jakarta.annotation.Nonnull
    public AclConfigRequestBuilder aclConfig() {
        return new AclConfigRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The maintenance property
     */
    @jakarta.annotation.Nonnull
    public MaintenanceRequestBuilder maintenance() {
        return new MaintenanceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The user property
     */
    @jakarta.annotation.Nonnull
    public UserRequestBuilder user() {
        return new UserRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new DbaasOpensearchItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbaasOpensearchItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-opensearch/{dbaasOpensearch%2Did}", pathParameters);
    }
    /**
     * Instantiates a new DbaasOpensearchItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DbaasOpensearchItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/dbaas-opensearch/{dbaasOpensearch%2Did}", rawUrl);
    }
    /**
     * null
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation delete() {
        return delete(null);
    }
    /**
     * null
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Operation::createFromDiscriminatorValue);
    }
    /**
     * Get a DBaaS OpenSearch service
     * @return a DbaasServiceOpensearch
     */
    @jakarta.annotation.Nullable
    public DbaasServiceOpensearch get() {
        return get(null);
    }
    /**
     * Get a DBaaS OpenSearch service
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a DbaasServiceOpensearch
     */
    @jakarta.annotation.Nullable
    public DbaasServiceOpensearch get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, DbaasServiceOpensearch::createFromDiscriminatorValue);
    }
    /**
     * Create a DBaaS OpenSearch service
     * @param body The request body
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation post(@jakarta.annotation.Nonnull final DbaasOpensearchPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Create a DBaaS OpenSearch service
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation post(@jakarta.annotation.Nonnull final DbaasOpensearchPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Operation::createFromDiscriminatorValue);
    }
    /**
     * Update a DBaaS OpenSearch service
     * @param body The request body
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation put(@jakarta.annotation.Nonnull final DbaasOpensearchPutRequestBody body) {
        return put(body, null);
    }
    /**
     * Update a DBaaS OpenSearch service
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation put(@jakarta.annotation.Nonnull final DbaasOpensearchPutRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Operation::createFromDiscriminatorValue);
    }
    /**
     * null
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * null
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Get a DBaaS OpenSearch service
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a DBaaS OpenSearch service
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Create a DBaaS OpenSearch service
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DbaasOpensearchPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create a DBaaS OpenSearch service
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DbaasOpensearchPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Update a DBaaS OpenSearch service
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final DbaasOpensearchPutRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Update a DBaaS OpenSearch service
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final DbaasOpensearchPutRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a DbaasOpensearchItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DbaasOpensearchItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DbaasOpensearchItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
