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


public class CreateElasticIpRequestBuilder {

    private CreateElasticIpRequestBody request;
    private final SDKMethodInterfaces.MethodCallCreateElasticIp sdk;

    public CreateElasticIpRequestBuilder(SDKMethodInterfaces.MethodCallCreateElasticIp sdk) {
        this.sdk = sdk;
    }

    public CreateElasticIpRequestBuilder request(CreateElasticIpRequestBody request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateElasticIpResponse call() throws Exception {

        return sdk.createElasticIp(
            request);
    }
}
