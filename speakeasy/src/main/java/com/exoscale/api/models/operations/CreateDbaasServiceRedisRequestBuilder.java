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


public class CreateDbaasServiceRedisRequestBuilder {

    private String name;
    private CreateDbaasServiceRedisRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallCreateDbaasServiceRedis sdk;

    public CreateDbaasServiceRedisRequestBuilder(SDKMethodInterfaces.MethodCallCreateDbaasServiceRedis sdk) {
        this.sdk = sdk;
    }

    public CreateDbaasServiceRedisRequestBuilder name(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public CreateDbaasServiceRedisRequestBuilder requestBody(CreateDbaasServiceRedisRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public CreateDbaasServiceRedisResponse call() throws Exception {

        return sdk.createDbaasServiceRedis(
            name,
            requestBody);
    }
}
