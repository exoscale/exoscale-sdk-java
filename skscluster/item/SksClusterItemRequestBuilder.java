package com.exoscale.skscluster.item;

import com.exoscale.models.Operation;
import com.exoscale.models.SksCluster;
import com.exoscale.skscluster.item.authority.AuthorityRequestBuilder;
import com.exoscale.skscluster.item.inspection.InspectionRequestBuilder;
import com.exoscale.skscluster.item.item.WithFieldItemRequestBuilder;
import com.exoscale.skscluster.item.nodepool.NodepoolRequestBuilder;
import com.exoscale.skscluster.item.rotateccmcredentials.RotateCcmCredentialsRequestBuilder;
import com.exoscale.skscluster.item.rotateoperatorsca.RotateOperatorsCaRequestBuilder;
import com.exoscale.skscluster.item.upgrade.UpgradeRequestBuilder;
import com.exoscale.skscluster.item.upgradeservicelevel.UpgradeServiceLevelRequestBuilder;
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
 * Builds and executes requests for operations under /sks-cluster/{id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SksClusterItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The authority property
     */
    @jakarta.annotation.Nonnull
    public AuthorityRequestBuilder authority() {
        return new AuthorityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The inspection property
     */
    @jakarta.annotation.Nonnull
    public InspectionRequestBuilder inspection() {
        return new InspectionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The nodepool property
     */
    @jakarta.annotation.Nonnull
    public NodepoolRequestBuilder nodepool() {
        return new NodepoolRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The rotateCcmCredentials property
     */
    @jakarta.annotation.Nonnull
    public RotateCcmCredentialsRequestBuilder rotateCcmCredentials() {
        return new RotateCcmCredentialsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The rotateOperatorsCa property
     */
    @jakarta.annotation.Nonnull
    public RotateOperatorsCaRequestBuilder rotateOperatorsCa() {
        return new RotateOperatorsCaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The upgrade property
     */
    @jakarta.annotation.Nonnull
    public UpgradeRequestBuilder upgrade() {
        return new UpgradeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The upgradeServiceLevel property
     */
    @jakarta.annotation.Nonnull
    public UpgradeServiceLevelRequestBuilder upgradeServiceLevel() {
        return new UpgradeServiceLevelRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.exoscale.sksCluster.item.item collection
     * @param field Unique identifier of the item
     * @return a WithFieldItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithFieldItemRequestBuilder byField(@jakarta.annotation.Nonnull final String field) {
        Objects.requireNonNull(field);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("field", field);
        return new WithFieldItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new SksClusterItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SksClusterItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sks-cluster/{id}", pathParameters);
    }
    /**
     * Instantiates a new SksClusterItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SksClusterItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sks-cluster/{id}", rawUrl);
    }
    /**
     * Delete an SKS cluster
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation delete() {
        return delete(null);
    }
    /**
     * Delete an SKS cluster
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Operation::createFromDiscriminatorValue);
    }
    /**
     * Retrieve SKS cluster details
     * @return a SksCluster
     */
    @jakarta.annotation.Nullable
    public SksCluster get() {
        return get(null);
    }
    /**
     * Retrieve SKS cluster details
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SksCluster
     */
    @jakarta.annotation.Nullable
    public SksCluster get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, SksCluster::createFromDiscriminatorValue);
    }
    /**
     * Update an SKS cluster
     * @param body The request body
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation put(@jakarta.annotation.Nonnull final SksClusterPutRequestBody body) {
        return put(body, null);
    }
    /**
     * Update an SKS cluster
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Operation
     */
    @jakarta.annotation.Nullable
    public Operation put(@jakarta.annotation.Nonnull final SksClusterPutRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Operation::createFromDiscriminatorValue);
    }
    /**
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
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
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
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
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final SksClusterPutRequestBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final SksClusterPutRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
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
     * @return a SksClusterItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SksClusterItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SksClusterItemRequestBuilder(rawUrl, requestAdapter);
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
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
