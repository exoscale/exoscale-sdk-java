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


public class UpdateLoadBalancerRequestBuilder {

    private String id;
    private UpdateLoadBalancerRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallUpdateLoadBalancer sdk;

    public UpdateLoadBalancerRequestBuilder(SDKMethodInterfaces.MethodCallUpdateLoadBalancer sdk) {
        this.sdk = sdk;
    }

    public UpdateLoadBalancerRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public UpdateLoadBalancerRequestBuilder requestBody(UpdateLoadBalancerRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public UpdateLoadBalancerResponse call() throws Exception {

        return sdk.updateLoadBalancer(
            id,
            requestBody);
    }
}
