/*
 * ExoscalePublicAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.exoscale.apichgva2.controllers;

import com.exoscale.apichgva2.ApiHelper;
import com.exoscale.apichgva2.Server;
import com.exoscale.apichgva2.exceptions.ApiException;
import com.exoscale.apichgva2.http.request.HttpMethod;
import com.exoscale.apichgva2.models.Field1Enum;
import com.exoscale.apichgva2.models.FieldEnum;
import com.exoscale.apichgva2.models.LoadBalancer;
import com.exoscale.apichgva2.models.LoadBalancerRequest;
import com.exoscale.apichgva2.models.LoadBalancerRequest1;
import com.exoscale.apichgva2.models.LoadBalancerResponse;
import com.exoscale.apichgva2.models.LoadBalancerService;
import com.exoscale.apichgva2.models.LoadBalancerServiceRequest;
import com.exoscale.apichgva2.models.LoadBalancerServiceRequest1;
import com.exoscale.apichgva2.models.Operation;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.apimatic.core.ApiCall;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class NetworkLoadBalancerController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public NetworkLoadBalancerController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * @param  id  Required parameter: Example:
     * @param  serviceId  Required parameter: Example:
     * @return    Returns the Operation response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Operation deleteLoadBalancerService(
            final UUID id,
            final UUID serviceId) throws ApiException, IOException {
        return prepareDeleteLoadBalancerServiceRequest(id, serviceId).execute();
    }

    /**
     * @param  id  Required parameter: Example:
     * @param  serviceId  Required parameter: Example:
     * @return    Returns the Operation response from the API call
     */
    public CompletableFuture<Operation> deleteLoadBalancerServiceAsync(
            final UUID id,
            final UUID serviceId) {
        try { 
            return prepareDeleteLoadBalancerServiceRequest(id, serviceId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for deleteLoadBalancerService.
     */
    private ApiCall<Operation, ApiException> prepareDeleteLoadBalancerServiceRequest(
            final UUID id,
            final UUID serviceId) throws IOException {
        return new ApiCall.Builder<Operation, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/load-balancer/{id}/service/{service-id}")
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("service-id").value(serviceId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Operation.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  id  Required parameter: Example:
     * @param  serviceId  Required parameter: Example:
     * @param  body  Required parameter: Example:
     * @return    Returns the Operation response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Operation updateLoadBalancerService(
            final UUID id,
            final UUID serviceId,
            final LoadBalancerServiceRequest body) throws ApiException, IOException {
        return prepareUpdateLoadBalancerServiceRequest(id, serviceId, body).execute();
    }

    /**
     * @param  id  Required parameter: Example:
     * @param  serviceId  Required parameter: Example:
     * @param  body  Required parameter: Example:
     * @return    Returns the Operation response from the API call
     */
    public CompletableFuture<Operation> updateLoadBalancerServiceAsync(
            final UUID id,
            final UUID serviceId,
            final LoadBalancerServiceRequest body) {
        try { 
            return prepareUpdateLoadBalancerServiceRequest(id, serviceId, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for updateLoadBalancerService.
     */
    private ApiCall<Operation, ApiException> prepareUpdateLoadBalancerServiceRequest(
            final UUID id,
            final UUID serviceId,
            final LoadBalancerServiceRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Operation, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/load-balancer/{id}/service/{service-id}")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("service-id").value(serviceId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Operation.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  id  Required parameter: Example:
     * @param  serviceId  Required parameter: Example:
     * @return    Returns the LoadBalancerService response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public LoadBalancerService getLoadBalancerService(
            final UUID id,
            final UUID serviceId) throws ApiException, IOException {
        return prepareGetLoadBalancerServiceRequest(id, serviceId).execute();
    }

    /**
     * @param  id  Required parameter: Example:
     * @param  serviceId  Required parameter: Example:
     * @return    Returns the LoadBalancerService response from the API call
     */
    public CompletableFuture<LoadBalancerService> getLoadBalancerServiceAsync(
            final UUID id,
            final UUID serviceId) {
        try { 
            return prepareGetLoadBalancerServiceRequest(id, serviceId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getLoadBalancerService.
     */
    private ApiCall<LoadBalancerService, ApiException> prepareGetLoadBalancerServiceRequest(
            final UUID id,
            final UUID serviceId) throws IOException {
        return new ApiCall.Builder<LoadBalancerService, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/load-balancer/{id}/service/{service-id}")
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("service-id").value(serviceId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, LoadBalancerService.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the Operation response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Operation createLoadBalancer(
            final LoadBalancerRequest body) throws ApiException, IOException {
        return prepareCreateLoadBalancerRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the Operation response from the API call
     */
    public CompletableFuture<Operation> createLoadBalancerAsync(
            final LoadBalancerRequest body) {
        try { 
            return prepareCreateLoadBalancerRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for createLoadBalancer.
     */
    private ApiCall<Operation, ApiException> prepareCreateLoadBalancerRequest(
            final LoadBalancerRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Operation, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/load-balancer")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Operation.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @return    Returns the LoadBalancerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public LoadBalancerResponse listLoadBalancers() throws ApiException, IOException {
        return prepareListLoadBalancersRequest().execute();
    }

    /**
     * @return    Returns the LoadBalancerResponse response from the API call
     */
    public CompletableFuture<LoadBalancerResponse> listLoadBalancersAsync() {
        try { 
            return prepareListLoadBalancersRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for listLoadBalancers.
     */
    private ApiCall<LoadBalancerResponse, ApiException> prepareListLoadBalancersRequest() throws IOException {
        return new ApiCall.Builder<LoadBalancerResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/load-balancer")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, LoadBalancerResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  id  Required parameter: Example:
     * @param  field  Required parameter: Example:
     * @return    Returns the Operation response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Operation resetLoadBalancerField(
            final UUID id,
            final Field1Enum field) throws ApiException, IOException {
        return prepareResetLoadBalancerFieldRequest(id, field).execute();
    }

    /**
     * @param  id  Required parameter: Example:
     * @param  field  Required parameter: Example:
     * @return    Returns the Operation response from the API call
     */
    public CompletableFuture<Operation> resetLoadBalancerFieldAsync(
            final UUID id,
            final Field1Enum field) {
        try { 
            return prepareResetLoadBalancerFieldRequest(id, field).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for resetLoadBalancerField.
     */
    private ApiCall<Operation, ApiException> prepareResetLoadBalancerFieldRequest(
            final UUID id,
            final Field1Enum field) throws IOException {
        return new ApiCall.Builder<Operation, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/load-balancer/{id}/{field}")
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("field").value((field != null) ? field.value() : null)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Operation.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  id  Required parameter: Example:
     * @param  serviceId  Required parameter: Example:
     * @param  field  Required parameter: Example:
     * @return    Returns the Operation response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Operation resetLoadBalancerServiceField(
            final UUID id,
            final UUID serviceId,
            final FieldEnum field) throws ApiException, IOException {
        return prepareResetLoadBalancerServiceFieldRequest(id, serviceId, field).execute();
    }

    /**
     * @param  id  Required parameter: Example:
     * @param  serviceId  Required parameter: Example:
     * @param  field  Required parameter: Example:
     * @return    Returns the Operation response from the API call
     */
    public CompletableFuture<Operation> resetLoadBalancerServiceFieldAsync(
            final UUID id,
            final UUID serviceId,
            final FieldEnum field) {
        try { 
            return prepareResetLoadBalancerServiceFieldRequest(id, serviceId, field).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for resetLoadBalancerServiceField.
     */
    private ApiCall<Operation, ApiException> prepareResetLoadBalancerServiceFieldRequest(
            final UUID id,
            final UUID serviceId,
            final FieldEnum field) throws IOException {
        return new ApiCall.Builder<Operation, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/load-balancer/{id}/service/{service-id}/{field}")
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("service-id").value(serviceId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("field").value((field != null) ? field.value() : null)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Operation.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  id  Required parameter: Example:
     * @param  body  Required parameter: Example:
     * @return    Returns the Operation response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Operation addServiceToLoadBalancer(
            final UUID id,
            final LoadBalancerServiceRequest1 body) throws ApiException, IOException {
        return prepareAddServiceToLoadBalancerRequest(id, body).execute();
    }

    /**
     * @param  id  Required parameter: Example:
     * @param  body  Required parameter: Example:
     * @return    Returns the Operation response from the API call
     */
    public CompletableFuture<Operation> addServiceToLoadBalancerAsync(
            final UUID id,
            final LoadBalancerServiceRequest1 body) {
        try { 
            return prepareAddServiceToLoadBalancerRequest(id, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for addServiceToLoadBalancer.
     */
    private ApiCall<Operation, ApiException> prepareAddServiceToLoadBalancerRequest(
            final UUID id,
            final LoadBalancerServiceRequest1 body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Operation, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/load-balancer/{id}/service")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Operation.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  id  Required parameter: Example:
     * @param  body  Required parameter: Example:
     * @return    Returns the Operation response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Operation updateLoadBalancer(
            final UUID id,
            final LoadBalancerRequest1 body) throws ApiException, IOException {
        return prepareUpdateLoadBalancerRequest(id, body).execute();
    }

    /**
     * @param  id  Required parameter: Example:
     * @param  body  Required parameter: Example:
     * @return    Returns the Operation response from the API call
     */
    public CompletableFuture<Operation> updateLoadBalancerAsync(
            final UUID id,
            final LoadBalancerRequest1 body) {
        try { 
            return prepareUpdateLoadBalancerRequest(id, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for updateLoadBalancer.
     */
    private ApiCall<Operation, ApiException> prepareUpdateLoadBalancerRequest(
            final UUID id,
            final LoadBalancerRequest1 body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Operation, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/load-balancer/{id}")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Operation.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  id  Required parameter: Example:
     * @return    Returns the Operation response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Operation deleteLoadBalancer(
            final UUID id) throws ApiException, IOException {
        return prepareDeleteLoadBalancerRequest(id).execute();
    }

    /**
     * @param  id  Required parameter: Example:
     * @return    Returns the Operation response from the API call
     */
    public CompletableFuture<Operation> deleteLoadBalancerAsync(
            final UUID id) {
        try { 
            return prepareDeleteLoadBalancerRequest(id).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for deleteLoadBalancer.
     */
    private ApiCall<Operation, ApiException> prepareDeleteLoadBalancerRequest(
            final UUID id) throws IOException {
        return new ApiCall.Builder<Operation, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/load-balancer/{id}")
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Operation.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  id  Required parameter: Example:
     * @return    Returns the LoadBalancer response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public LoadBalancer getLoadBalancer(
            final UUID id) throws ApiException, IOException {
        return prepareGetLoadBalancerRequest(id).execute();
    }

    /**
     * @param  id  Required parameter: Example:
     * @return    Returns the LoadBalancer response from the API call
     */
    public CompletableFuture<LoadBalancer> getLoadBalancerAsync(
            final UUID id) {
        try { 
            return prepareGetLoadBalancerRequest(id).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getLoadBalancer.
     */
    private ApiCall<LoadBalancer, ApiException> prepareGetLoadBalancerRequest(
            final UUID id) throws IOException {
        return new ApiCall.Builder<LoadBalancer, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/load-balancer/{id}")
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, LoadBalancer.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}