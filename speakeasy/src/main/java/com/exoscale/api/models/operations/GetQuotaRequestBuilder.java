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


public class GetQuotaRequestBuilder {

    private String entity;
    private final SDKMethodInterfaces.MethodCallGetQuota sdk;

    public GetQuotaRequestBuilder(SDKMethodInterfaces.MethodCallGetQuota sdk) {
        this.sdk = sdk;
    }

    public GetQuotaRequestBuilder entity(String entity) {
        Utils.checkNotNull(entity, "entity");
        this.entity = entity;
        return this;
    }

    public GetQuotaResponse call() throws Exception {

        return sdk.getQuota(
            entity);
    }
}
