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


public class UpdateSksNodepoolRequestBuilder {

    private String id;
    private String sksNodepoolId;
    private UpdateSksNodepoolRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallUpdateSksNodepool sdk;

    public UpdateSksNodepoolRequestBuilder(SDKMethodInterfaces.MethodCallUpdateSksNodepool sdk) {
        this.sdk = sdk;
    }

    public UpdateSksNodepoolRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public UpdateSksNodepoolRequestBuilder sksNodepoolId(String sksNodepoolId) {
        Utils.checkNotNull(sksNodepoolId, "sksNodepoolId");
        this.sksNodepoolId = sksNodepoolId;
        return this;
    }

    public UpdateSksNodepoolRequestBuilder requestBody(UpdateSksNodepoolRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public UpdateSksNodepoolResponse call() throws Exception {

        return sdk.updateSksNodepool(
            id,
            sksNodepoolId,
            requestBody);
    }
}
