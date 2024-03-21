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


public class GetTemplateRequestBuilder {

    private String id;
    private final SDKMethodInterfaces.MethodCallGetTemplate sdk;

    public GetTemplateRequestBuilder(SDKMethodInterfaces.MethodCallGetTemplate sdk) {
        this.sdk = sdk;
    }

    public GetTemplateRequestBuilder id(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetTemplateResponse call() throws Exception {

        return sdk.getTemplate(
            id);
    }
}
