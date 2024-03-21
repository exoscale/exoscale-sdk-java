package com.exoscale.securitygroup;

import com.exoscale.models.Operation;
import com.exoscale.securitygroup.item.SecurityGroupItemRequestBuilder;
import com.exoscale.securitygroup.withidaddsource.WithIdAddSourceRequestBuilder;
import com.exoscale.securitygroup.withidattach.WithIdAttachRequestBuilder;
import com.exoscale.securitygroup.withiddetach.WithIdDetachRequestBuilder;
import com.exoscale.securitygroup.withidremovesource.WithIdRemoveSourceRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * Builds and executes requests for operations under /security-group
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SecurityGroupRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.exoscale.securityGroup.item collection
     * @param id Unique identifier of the item
     * @return a SecurityGroupItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SecurityGroupItemRequestBuilder byId(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new SecurityGroupItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new SecurityGroupRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SecurityGroupRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security-group{?visibility*}", pathParameters);
    }
    /**
     * Instantiates a new SecurityGroupRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SecurityGroupRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/security-group{?visibility*}", rawUrl);
    }
    /**
     * Lists security groups. When visibility is set to public, lists public security groups.Public security groups are objects maintained by Exoscale which contain source addresses forrelevant services hosted by Exoscale. They can be used a source in ingress rules and as a destinationin egress rules.
     * @return a SecurityGroupGetResponse
     */
    @jakarta.annotation.Nullable
    public SecurityGroupGetResponse get() {
        return get(null);
    }
    /**
     * Lists security groups. When visibility is set to public, lists public security groups.Public security groups are objects maintained by Exoscale which contain source addresses forrelevant services hosted by Exoscale. They can be used a source in ingress rules and as a destinationin egress rules.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SecurityGroupGetResponse
     */
    @jakarta.annotation.Nullable
    public SecurityGroupGetResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, SecurityGroupGetResponse::createFromDiscriminatorValue);
    }
    /**
     * Create a Security Group
     * @param body The request body
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation post(@jakarta.annotation.Nonnull final SecurityGroupPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Create a Security Group
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation post(@jakarta.annotation.Nonnull final SecurityGroupPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Operation::createFromDiscriminatorValue);
    }
    /**
     * Lists security groups. When visibility is set to public, lists public security groups.Public security groups are objects maintained by Exoscale which contain source addresses forrelevant services hosted by Exoscale. They can be used a source in ingress rules and as a destinationin egress rules.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Lists security groups. When visibility is set to public, lists public security groups.Public security groups are objects maintained by Exoscale which contain source addresses forrelevant services hosted by Exoscale. They can be used a source in ingress rules and as a destinationin egress rules.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SecurityGroupPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SecurityGroupPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Builds and executes requests for operations under /security-group/{id}:add-source
     * @return a WithIdAddSourceRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdAddSourceRequestBuilder withIdAddSource(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        return new WithIdAddSourceRequestBuilder(pathParameters, requestAdapter, id);
    }
    /**
     * Builds and executes requests for operations under /security-group/{id}:attach
     * @return a WithIdAttachRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdAttachRequestBuilder withIdAttach(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        return new WithIdAttachRequestBuilder(pathParameters, requestAdapter, id);
    }
    /**
     * Builds and executes requests for operations under /security-group/{id}:detach
     * @return a WithIdDetachRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdDetachRequestBuilder withIdDetach(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        return new WithIdDetachRequestBuilder(pathParameters, requestAdapter, id);
    }
    /**
     * Builds and executes requests for operations under /security-group/{id}:remove-source
     * @return a WithIdRemoveSourceRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdRemoveSourceRequestBuilder withIdRemoveSource(@jakarta.annotation.Nonnull final UUID id) {
        Objects.requireNonNull(id);
        return new WithIdRemoveSourceRequestBuilder(pathParameters, requestAdapter, id);
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a SecurityGroupRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SecurityGroupRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SecurityGroupRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Lists security groups. When visibility is set to public, lists public security groups.Public security groups are objects maintained by Exoscale which contain source addresses forrelevant services hosted by Exoscale. They can be used a source in ingress rules and as a destinationin egress rules.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public GetVisibilityQueryParameterType visibility;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("visibility", visibility);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
