/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.exoscale.api.models.operations;

import com.exoscale.api.models.errors.SDKError;
import com.exoscale.api.utils.LazySingletonValue;
import com.exoscale.api.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class GetDbaasServiceMetricsRequestBuilder {

    private String serviceName;
    private GetDbaasServiceMetricsRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallGetDbaasServiceMetrics sdk;

    public GetDbaasServiceMetricsRequestBuilder(SDKMethodInterfaces.MethodCallGetDbaasServiceMetrics sdk) {
        this.sdk = sdk;
    }

    public GetDbaasServiceMetricsRequestBuilder serviceName(String serviceName) {
        Utils.checkNotNull(serviceName, "serviceName");
        this.serviceName = serviceName;
        return this;
    }

    public GetDbaasServiceMetricsRequestBuilder requestBody(GetDbaasServiceMetricsRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public GetDbaasServiceMetricsResponse call() throws Exception {

        return sdk.getDbaasServiceMetrics(
            serviceName,
            requestBody);
    }
}
