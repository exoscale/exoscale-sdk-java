package com.exoscale.event;

import com.exoscale.models.Event;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /event
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EventRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new EventRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EventRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/event{?from*,to*}", pathParameters);
    }
    /**
     * Instantiates a new EventRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EventRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/event{?from*,to*}", rawUrl);
    }
    /**
     * Retrieve Mutation Events for a given date range. Defaults to retrieving Events for the past 24 hours.         Both a `from` and `to` arguments can be specified to filter Events over a specific period.         Events will be the the most descriptive possible but not all fields are mandatory
     * @return a java.util.List<Event>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Event> get() {
        return get(null);
    }
    /**
     * Retrieve Mutation Events for a given date range. Defaults to retrieving Events for the past 24 hours.         Both a `from` and `to` arguments can be specified to filter Events over a specific period.         Events will be the the most descriptive possible but not all fields are mandatory
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a java.util.List<Event>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Event> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.sendCollection(requestInfo, null, Event::createFromDiscriminatorValue);
    }
    /**
     * Retrieve Mutation Events for a given date range. Defaults to retrieving Events for the past 24 hours.         Both a `from` and `to` arguments can be specified to filter Events over a specific period.         Events will be the the most descriptive possible but not all fields are mandatory
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve Mutation Events for a given date range. Defaults to retrieving Events for the past 24 hours.         Both a `from` and `to` arguments can be specified to filter Events over a specific period.         Events will be the the most descriptive possible but not all fields are mandatory
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a EventRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public EventRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new EventRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Retrieve Mutation Events for a given date range. Defaults to retrieving Events for the past 24 hours.         Both a `from` and `to` arguments can be specified to filter Events over a specific period.         Events will be the the most descriptive possible but not all fields are mandatory
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        @jakarta.annotation.Nullable
        public OffsetDateTime from;
        @jakarta.annotation.Nullable
        public OffsetDateTime to;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("from", from);
            allQueryParams.put("to", to);
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
}
